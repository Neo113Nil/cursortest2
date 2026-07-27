package androidx.compose.foundation.layout;

import S.e;
import S.n;
import kotlin.Metadata;
import q.C1011O;
import r0.T;

@Metadata
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final e f5060a;

    public HorizontalAlignElement(e eVar) {
        this.f5060a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f5060a.equals(horizontalAlignElement.f5060a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5060a.f3968a);
    }

    @Override // r0.T
    public final n l() {
        C1011O c1011o = new C1011O();
        c1011o.f9201t = this.f5060a;
        return c1011o;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C1011O) nVar).f9201t = this.f5060a;
    }
}
