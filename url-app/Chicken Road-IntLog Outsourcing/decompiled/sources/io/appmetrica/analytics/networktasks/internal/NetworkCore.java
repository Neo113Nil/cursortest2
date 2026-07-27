package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f9873a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f9874b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f9875c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f9876d;

    /* renamed from: e, reason: collision with root package name */
    private final g f9877e;

    /* renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f9878f;

    public NetworkCore(IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f9875c) {
                }
                this.f9876d = (d) this.f9873a.take();
                networkTask = this.f9876d.f9844a;
                Executor executor = networkTask.getExecutor();
                this.f9877e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f9875c) {
                    this.f9876d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f9875c) {
                        this.f9876d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f9875c) {
                        this.f9876d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f9878f.canBeExecuted()) {
            synchronized (this.f9874b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f9873a.contains(dVar) && !dVar.equals(this.f9876d) && networkTask.onTaskAdded()) {
                        this.f9873a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f9875c) {
            try {
                ArrayList arrayList = new ArrayList(this.f9873a.size());
                this.f9873a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f9844a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f9873a = new LinkedBlockingQueue();
        this.f9874b = new Object();
        this.f9875c = new Object();
        this.f9878f = iExecutionPolicy;
        this.f9877e = gVar;
    }
}
