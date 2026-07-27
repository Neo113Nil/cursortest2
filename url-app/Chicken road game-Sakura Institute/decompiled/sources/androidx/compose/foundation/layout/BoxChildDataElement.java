package androidx.compose.foundation.layout;

import S.g;
import S.n;
import kotlin.Metadata;
import q.C1032k;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class BoxChildDataElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final g f5057a;

    public BoxChildDataElement(g gVar) {
        this.f5057a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return this.f5057a.equals(boxChildDataElement.f5057a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f5057a.hashCode() * 31);
    }

    @Override // r0.T
    public final n l() {
        C1032k c1032k = new C1032k();
        c1032k.f9271t = this.f5057a;
        return c1032k;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C1032k) nVar).f9271t = this.f5057a;
    }
}
