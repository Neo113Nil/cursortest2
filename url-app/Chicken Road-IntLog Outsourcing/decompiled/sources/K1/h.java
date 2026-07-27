package K1;

import D4.Q;
import N1.q;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h implements N1.d {

    /* renamed from: b, reason: collision with root package name */
    public static final h f1396b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f1397c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f1398d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f1399e = new h(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1400a;

    public /* synthetic */ h(int i2) {
        this.f1400a = i2;
    }

    @Override // N1.d
    public final Object d(B.d dVar) {
        switch (this.f1400a) {
            case 0:
                Object f3 = dVar.f(new q(M1.a.class, Executor.class));
                kotlin.jvm.internal.i.d(f3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Q((Executor) f3);
            case 1:
                Object f6 = dVar.f(new q(M1.c.class, Executor.class));
                kotlin.jvm.internal.i.d(f6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Q((Executor) f6);
            case 2:
                Object f7 = dVar.f(new q(M1.b.class, Executor.class));
                kotlin.jvm.internal.i.d(f7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Q((Executor) f7);
            default:
                Object f8 = dVar.f(new q(M1.d.class, Executor.class));
                kotlin.jvm.internal.i.d(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new Q((Executor) f8);
        }
    }
}
