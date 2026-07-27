package z1;

import A1.N0;
import A1.R0;
import G.C0216p;
import k.C0742h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s1.C1193i;

/* renamed from: z1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385k implements L2.d {

    /* renamed from: e, reason: collision with root package name */
    public static final C1385k f11885e = new C1385k(0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1385k f11886i = new C1385k(1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1385k f11887j = new C1385k(2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11888d;

    public /* synthetic */ C1385k(int i2) {
        this.f11888d = i2;
    }

    @Override // L2.d
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f11888d) {
            case 0:
                C0742h composable = (C0742h) obj;
                C1193i it = (C1193i) obj2;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                u3.d.f(0, (C0216p) obj3);
                break;
            case 1:
                C0742h composable2 = (C0742h) obj;
                C1193i it2 = (C1193i) obj2;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable2, "$this$composable");
                Intrinsics.checkNotNullParameter(it2, "it");
                R0.e(0, (C0216p) obj3);
                break;
            default:
                C0742h composable3 = (C0742h) obj;
                C1193i it3 = (C1193i) obj2;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(composable3, "$this$composable");
                Intrinsics.checkNotNullParameter(it3, "it");
                N0.a(0, (C0216p) obj3);
                break;
        }
        return Unit.f7487a;
    }
}
