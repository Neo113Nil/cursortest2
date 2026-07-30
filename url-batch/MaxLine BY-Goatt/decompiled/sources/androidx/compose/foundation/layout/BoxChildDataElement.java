package androidx.compose.foundation.layout;

import defpackage.ao;
import defpackage.cm1;
import defpackage.ep;
import defpackage.ul1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class BoxChildDataElement extends cm1 {
    public final ao a;

    public BoxChildDataElement(ao aoVar) {
        this.a = aoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.a.equals(boxChildDataElement.a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        ep epVar = new ep();
        epVar.A = this.a;
        return epVar;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((ep) ul1Var).A = this.a;
    }
}
