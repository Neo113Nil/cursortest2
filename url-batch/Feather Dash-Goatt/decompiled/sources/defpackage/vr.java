package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vr implements Function1 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vr(xr xrVar, z90 z90Var, ln0 ln0Var, int i) {
        this.g = xrVar;
        this.h = z90Var;
        this.i = ln0Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Object obj2 = this.i;
        int i2 = this.e;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z90 z90Var = (z90) obj3;
                ln0 ln0Var = (ln0) obj2;
                if (obj == ((xr) obj4)) {
                    dd0.j("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof ge1) {
                    int i3 = z90Var.a - i2;
                    int d = ln0Var.d(obj);
                    ln0Var.g(Math.min(i3, d >= 0 ? ln0Var.c[d] : Integer.MAX_VALUE), obj);
                }
                return Unit.a;
            default:
                zw0[] zw0VarArr = (zw0[]) obj4;
                r41 r41Var = (r41) obj3;
                int[] iArr = (int[]) obj2;
                yw0 yw0Var = (yw0) obj;
                int length = zw0VarArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    zw0 zw0Var = zw0VarArr[i4];
                    zw0Var.getClass();
                    zw0Var.h();
                    yw0.h(yw0Var, zw0Var, iArr[i5], Math.round((1.0f + r41Var.b.a) * ((i2 - zw0Var.e) / 2.0f)));
                    i4++;
                    i5++;
                }
                return Unit.a;
        }
    }

    public /* synthetic */ vr(zw0[] zw0VarArr, r41 r41Var, int i, int[] iArr) {
        this.g = zw0VarArr;
        this.h = r41Var;
        this.e = i;
        this.i = iArr;
    }
}
