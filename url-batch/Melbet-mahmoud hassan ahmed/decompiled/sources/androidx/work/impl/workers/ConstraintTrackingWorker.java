package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.d;
import d0.j;
import e0.i;
import h0.c;
import java.util.Collections;
import java.util.List;
import l0.p;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: p, reason: collision with root package name */
    private static final String f1584p = j.f("ConstraintTrkngWrkr");

    /* renamed from: k, reason: collision with root package name */
    private WorkerParameters f1585k;

    /* renamed from: l, reason: collision with root package name */
    final Object f1586l;

    /* renamed from: m, reason: collision with root package name */
    volatile boolean f1587m;

    /* renamed from: n, reason: collision with root package name */
    d<ListenableWorker.a> f1588n;

    /* renamed from: o, reason: collision with root package name */
    private ListenableWorker f1589o;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.f();
        }
    }

    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p4.a f1591f;

        b(p4.a aVar) {
            this.f1591f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f1586l) {
                if (ConstraintTrackingWorker.this.f1587m) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f1588n.s(this.f1591f);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1585k = workerParameters;
        this.f1586l = new Object();
        this.f1587m = false;
        this.f1588n = d.u();
    }

    public WorkDatabase a() {
        return i.k(getApplicationContext()).o();
    }

    void b() {
        this.f1588n.q(ListenableWorker.a.a());
    }

    @Override // h0.c
    public void c(List<String> list) {
        j.c().a(f1584p, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f1586l) {
            this.f1587m = true;
        }
    }

    void d() {
        this.f1588n.q(ListenableWorker.a.b());
    }

    @Override // h0.c
    public void e(List<String> list) {
    }

    void f() {
        String i7 = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i7)) {
            j.c().b(f1584p, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker b7 = getWorkerFactory().b(getApplicationContext(), i7, this.f1585k);
            this.f1589o = b7;
            if (b7 != null) {
                p l7 = a().B().l(getId().toString());
                if (l7 == null) {
                    b();
                    return;
                }
                h0.d dVar = new h0.d(getApplicationContext(), getTaskExecutor(), this);
                dVar.d(Collections.singletonList(l7));
                if (!dVar.c(getId().toString())) {
                    j.c().a(f1584p, String.format("Constraints not met for delegate %s. Requesting retry.", i7), new Throwable[0]);
                    d();
                    return;
                }
                j.c().a(f1584p, String.format("Constraints met for delegate %s", i7), new Throwable[0]);
                try {
                    p4.a<ListenableWorker.a> startWork = this.f1589o.startWork();
                    startWork.d(new b(startWork), getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    j c7 = j.c();
                    String str = f1584p;
                    c7.a(str, String.format("Delegated worker %s threw exception in startWork.", i7), th);
                    synchronized (this.f1586l) {
                        if (this.f1587m) {
                            j.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            d();
                        } else {
                            b();
                        }
                        return;
                    }
                }
            }
            j.c().a(f1584p, "No worker to delegate to.", new Throwable[0]);
        }
        b();
    }

    @Override // androidx.work.ListenableWorker
    public n0.a getTaskExecutor() {
        return i.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f1589o;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f1589o;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f1589o.stop();
    }

    @Override // androidx.work.ListenableWorker
    public p4.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f1588n;
    }
}
