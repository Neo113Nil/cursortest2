package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f40605a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f40606b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f40607c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f40608d;

    /* renamed from: e, reason: collision with root package name */
    private final g f40609e;

    /* renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f40610f;

    public NetworkCore(@NonNull IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f40607c) {
                }
                this.f40608d = (d) this.f40605a.take();
                networkTask = this.f40608d.f40576a;
                Executor executor = networkTask.getExecutor();
                this.f40609e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f40607c) {
                    this.f40608d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f40607c) {
                        this.f40608d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f40607c) {
                        this.f40608d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f40610f.canBeExecuted()) {
            synchronized (this.f40606b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f40605a.contains(dVar) && !dVar.equals(this.f40608d) && networkTask.onTaskAdded()) {
                        this.f40605a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f40607c) {
            try {
                ArrayList arrayList = new ArrayList(this.f40605a.size());
                this.f40605a.drainTo(arrayList);
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((d) obj).f40576a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f40605a = new LinkedBlockingQueue();
        this.f40606b = new Object();
        this.f40607c = new Object();
        this.f40610f = iExecutionPolicy;
        this.f40609e = gVar;
    }
}
