package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La9;", "Lem0;", "Lhn;", "ui"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class a9 extends em0 {
    public final boolean a;
    public final Function1 b;

    public a9(Function1 function1, boolean z) {
        this.a = z;
        this.b = function1;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        hn hnVar = new hn();
        hnVar.s = this.a;
        hnVar.t = this.b;
        return hnVar;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        hn hnVar = (hn) zl0Var;
        hnVar.s = this.a;
        hnVar.t = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        return this.a == a9Var.a && this.b == a9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
