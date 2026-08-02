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
    private final LinkedBlockingQueue f8899a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8900b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8901c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f8902d;

    /* renamed from: e, reason: collision with root package name */
    private final g f8903e;
    private final IExecutionPolicy f;

    public NetworkCore(IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f8901c) {
                }
                this.f8902d = (d) this.f8899a.take();
                networkTask = this.f8902d.f8871a;
                Executor executor = networkTask.getExecutor();
                this.f8903e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f8901c) {
                    this.f8902d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f8901c) {
                        this.f8902d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f8901c) {
                        this.f8902d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f.canBeExecuted()) {
            synchronized (this.f8900b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f8899a.contains(dVar) && !dVar.equals(this.f8902d) && networkTask.onTaskAdded()) {
                        this.f8899a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f8901c) {
            try {
                ArrayList arrayList = new ArrayList(this.f8899a.size());
                this.f8899a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f8871a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f8899a = new LinkedBlockingQueue();
        this.f8900b = new Object();
        this.f8901c = new Object();
        this.f = iExecutionPolicy;
        this.f8903e = gVar;
    }
}
