package v2;

import W1.b;
import W1.c;
import W1.d;
import W2.W;
import Z1.e;
import Z1.t;
import Z1.v;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251a implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final C1251a f10988b = new C1251a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1251a f10989c = new C1251a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1251a f10990d = new C1251a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C1251a f10991e = new C1251a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10992a;

    public /* synthetic */ C1251a(int i2) {
        this.f10992a = i2;
    }

    @Override // Z1.e
    public final Object d(v vVar) {
        switch (this.f10992a) {
            case 0:
                Object f4 = vVar.f(new t(W1.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(f4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new W((Executor) f4);
            case 1:
                Object f5 = vVar.f(new t(c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(f5, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new W((Executor) f5);
            case 2:
                Object f6 = vVar.f(new t(b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(f6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new W((Executor) f6);
            default:
                Object f7 = vVar.f(new t(d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(f7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new W((Executor) f7);
        }
    }
}
