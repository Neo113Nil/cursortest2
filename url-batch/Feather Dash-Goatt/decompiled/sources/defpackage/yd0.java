package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyd0;", "Lem0;", "Lzd0;", "foundation-layout"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class yd0 extends em0 {
    public final float a;
    public final boolean b;

    public yd0(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        zd0 zd0Var = new zd0();
        zd0Var.s = this.a;
        zd0Var.t = this.b;
        return zd0Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        zd0 zd0Var = (zd0) zl0Var;
        zd0Var.s = this.a;
        zd0Var.t = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        yd0 yd0Var = obj instanceof yd0 ? (yd0) obj : null;
        return yd0Var != null && this.a == yd0Var.a && this.b == yd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
