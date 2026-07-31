package w1;

import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final AppDatabase_Impl f9876a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f9877b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final R1.n f9878c = R1.a.d(new t0.D(10, this));

    public j(AppDatabase_Impl appDatabase_Impl) {
        this.f9876a = appDatabase_Impl;
    }

    public abstract void a(A1.k kVar, Object obj);

    public final A1.k b() {
        String c2 = c();
        AppDatabase_Impl appDatabase_Impl = this.f9876a;
        appDatabase_Impl.a();
        if (appDatabase_Impl.g().t().h() || appDatabase_Impl.f9927i.get() == null) {
            return appDatabase_Impl.g().t().d(c2);
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public abstract String c();

    public void d(Object obj) {
        this.f9876a.a();
        A1.k b3 = this.f9877b.compareAndSet(false, true) ? (A1.k) this.f9878c.getValue() : b();
        try {
            a(b3, obj);
            b3.b();
        } finally {
            e(b3);
        }
    }

    public final void e(A1.k kVar) {
        f2.j.f(kVar, "statement");
        if (kVar == ((A1.k) this.f9878c.getValue())) {
            this.f9877b.set(false);
        }
    }
}
