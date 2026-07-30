package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lke0;", "Lem0;", "Lle0;", "foundation"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class ke0 extends em0 {
    public final ne0 a;

    public ke0(ne0 ne0Var) {
        this.a = ne0Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        le0 le0Var = new le0();
        le0Var.s = this.a;
        return le0Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        le0 le0Var = (le0) zl0Var;
        ne0 ne0Var = le0Var.s;
        ne0 ne0Var2 = this.a;
        if (Intrinsics.a(ne0Var, ne0Var2) || !le0Var.d.r) {
            return;
        }
        ne0 ne0Var3 = le0Var.s;
        ne0Var3.d();
        ne0Var3.b = null;
        le0Var.s = ne0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke0) && this.a == ((ke0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
    }
}
