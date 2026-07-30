package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsq1;", "Lem0;", "Ltq1;", "ui"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class sq1 extends em0 {
    public final float a;

    public sq1(float f) {
        this.a = f;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        tq1 tq1Var = new tq1();
        tq1Var.s = this.a;
        return tq1Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ((tq1) zl0Var).s = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sq1) && Float.compare(this.a, ((sq1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return qy0.l(new StringBuilder("ZIndexElement(zIndex="), this.a, ')');
    }
}
