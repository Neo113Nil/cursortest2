package K3;

import B2.N;
import N3.r;
import O7.S;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class h implements N3.e {

    /* renamed from: u, reason: collision with root package name */
    public static final h f1631u = new h(0);

    /* renamed from: v, reason: collision with root package name */
    public static final h f1632v = new h(1);

    /* renamed from: w, reason: collision with root package name */
    public static final h f1633w = new h(2);

    /* renamed from: x, reason: collision with root package name */
    public static final h f1634x = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1635n;

    public /* synthetic */ h(int i) {
        this.f1635n = i;
    }

    @Override // N3.e
    public final Object b(N n9) {
        switch (this.f1635n) {
            case 0:
                Object e6 = n9.e(new r(M3.a.class, Executor.class));
                kotlin.jvm.internal.h.d(e6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e6);
            case 1:
                Object e9 = n9.e(new r(M3.c.class, Executor.class));
                kotlin.jvm.internal.h.d(e9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e9);
            case 2:
                Object e10 = n9.e(new r(M3.b.class, Executor.class));
                kotlin.jvm.internal.h.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e10);
            default:
                Object e11 = n9.e(new r(M3.d.class, Executor.class));
                kotlin.jvm.internal.h.d(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e11);
        }
    }
}
