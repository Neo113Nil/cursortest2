package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvy;", "Lem0;", "Lwy;", "foundation-layout"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class vy extends em0 {
    public final fs a;
    public final float b;

    public vy(fs fsVar, float f) {
        this.a = fsVar;
        this.b = f;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        wy wyVar = new wy();
        wyVar.s = this.a;
        wyVar.t = this.b;
        return wyVar;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        wy wyVar = (wy) zl0Var;
        wyVar.s = this.a;
        wyVar.t = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy)) {
            return false;
        }
        vy vyVar = (vy) obj;
        return this.a == vyVar.a && this.b == vyVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
