package s1;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;

/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1186b extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1186b f10489e = new C1186b(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1186b f10490i = new C1186b(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1186b f10491j = new C1186b(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C1186b f10492k = new C1186b(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final C1186b f10493l = new C1186b(1, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final C1186b f10494m = new C1186b(1, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final C1186b f10495n = new C1186b(1, 6);

    /* renamed from: o, reason: collision with root package name */
    public static final C1186b f10496o = new C1186b(1, 7);

    /* renamed from: p, reason: collision with root package name */
    public static final C1186b f10497p = new C1186b(1, 8);

    /* renamed from: q, reason: collision with root package name */
    public static final C1186b f10498q = new C1186b(1, 9);

    /* renamed from: r, reason: collision with root package name */
    public static final C1186b f10499r = new C1186b(1, 10);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1186b(int i2, int i4) {
        super(i2);
        this.f10500d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10500d) {
            case 0:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 1:
                Context it2 = (Context) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 2:
                F navOptions = (F) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.f10480c = true;
                return Unit.f7487a;
            case 3:
                v destination = (v) obj;
                Intrinsics.checkNotNullParameter(destination, "destination");
                y yVar = destination.f10571e;
                if (yVar == null || yVar.f10587p != destination.f10575l) {
                    return null;
                }
                return yVar;
            case 4:
                v destination2 = (v) obj;
                Intrinsics.checkNotNullParameter(destination2, "destination");
                y yVar2 = destination2.f10571e;
                if (yVar2 == null || yVar2.f10587p != destination2.f10575l) {
                    return null;
                }
                return yVar2;
            case 5:
                C1188d anim = (C1188d) obj;
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.f10502a = 0;
                anim.f10503b = 0;
                return Unit.f7487a;
            case 6:
                J popUpTo = (J) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f10488a = true;
                return Unit.f7487a;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                v it3 = (v) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Integer.valueOf(it3.f10575l);
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                v it4 = (v) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return it4.f10571e;
            case AbstractC1024c.f9242c /* 9 */:
                v it5 = (v) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof y)) {
                    return null;
                }
                y yVar3 = (y) it5;
                return yVar3.C(yVar3.f10587p, yVar3, false);
            default:
                F navOptions2 = (F) obj;
                Intrinsics.checkNotNullParameter(navOptions2, "$this$navOptions");
                navOptions2.f10479b = true;
                return Unit.f7487a;
        }
    }
}
