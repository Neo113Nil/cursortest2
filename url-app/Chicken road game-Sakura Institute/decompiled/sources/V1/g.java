package V1;

import W2.W;
import Z1.t;
import Z1.v;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements Z1.e {

    /* renamed from: b, reason: collision with root package name */
    public static final g f4173b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f4174c = new g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final g f4175d = new g(2);

    /* renamed from: e, reason: collision with root package name */
    public static final g f4176e = new g(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4177a;

    public /* synthetic */ g(int i2) {
        this.f4177a = i2;
    }

    @Override // Z1.e
    public final Object d(v vVar) {
        switch (this.f4177a) {
            case 0:
                Object f4 = vVar.f(new t(W1.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(f4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new W((Executor) f4);
            case 1:
                Object f5 = vVar.f(new t(W1.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(f5, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new W((Executor) f5);
            case 2:
                Object f6 = vVar.f(new t(W1.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(f6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new W((Executor) f6);
            default:
                Object f7 = vVar.f(new t(W1.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(f7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new W((Executor) f7);
        }
    }
}
