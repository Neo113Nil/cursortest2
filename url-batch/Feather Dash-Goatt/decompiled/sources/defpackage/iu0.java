package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Liu0;", "Lem0;", "Lju0;", "foundation-layout"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class iu0 extends em0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Function1 e;

    public iu0(float f, float f2, float f3, float f4, Function1 function1) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = function1;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            m80.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.em0
    public final zl0 d() {
        ju0 ju0Var = new ju0();
        ju0Var.s = this.a;
        ju0Var.t = this.b;
        ju0Var.u = this.c;
        ju0Var.v = this.d;
        ju0Var.w = true;
        return ju0Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ju0 ju0Var = (ju0) zl0Var;
        ju0Var.s = this.a;
        ju0Var.t = this.b;
        ju0Var.u = this.c;
        ju0Var.v = this.d;
        ju0Var.w = true;
    }

    public final boolean equals(Object obj) {
        iu0 iu0Var = obj instanceof iu0 ? (iu0) obj : null;
        return iu0Var != null && bt.a(this.a, iu0Var.a) && bt.a(this.b, iu0Var.b) && bt.a(this.c, iu0Var.c) && bt.a(this.d, iu0Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + qy0.b(this.d, qy0.b(this.c, qy0.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
