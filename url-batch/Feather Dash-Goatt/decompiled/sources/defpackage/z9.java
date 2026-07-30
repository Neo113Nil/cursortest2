package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz9;", "Lem0;", "Lba;", "foundation-layout"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class z9 extends em0 {
    public final float a;

    public z9(float f) {
        this.a = f;
        if (f > 0.0f) {
            return;
        }
        m80.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.em0
    public final zl0 d() {
        ba baVar = new ba();
        baVar.s = this.a;
        return baVar;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ((ba) zl0Var).s = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        z9 z9Var = obj instanceof z9 ? (z9) obj : null;
        if (z9Var == null || this.a != z9Var.a) {
            return false;
        }
        ((z9) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.a) * 31);
    }
}
