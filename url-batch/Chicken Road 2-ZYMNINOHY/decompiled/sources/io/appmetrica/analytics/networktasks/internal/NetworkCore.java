package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f13316a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13317b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f13318c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f13319d;

    /* renamed from: e, reason: collision with root package name */
    private final g f13320e;

    /* renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f13321f;

    public NetworkCore(IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f13318c) {
                }
                this.f13319d = (d) this.f13316a.take();
                networkTask = this.f13319d.f13287a;
                Executor executor = networkTask.getExecutor();
                this.f13320e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f13318c) {
                    this.f13319d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f13318c) {
                        this.f13319d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f13318c) {
                        this.f13319d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f13321f.canBeExecuted()) {
            synchronized (this.f13317b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f13316a.contains(dVar) && !dVar.equals(this.f13319d) && networkTask.onTaskAdded()) {
                        this.f13316a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f13318c) {
            try {
                ArrayList arrayList = new ArrayList(this.f13316a.size());
                this.f13316a.drainTo(arrayList);
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((d) obj).f13287a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f13316a = new LinkedBlockingQueue();
        this.f13317b = new Object();
        this.f13318c = new Object();
        this.f13321f = iExecutionPolicy;
        this.f13320e = gVar;
    }
}
