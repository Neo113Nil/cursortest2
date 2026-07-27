package androidx.compose.ui.semantics;

import D.C0173u;
import S.n;
import kotlin.Metadata;
import kotlin.Unit;
import r0.T;
import y0.C1319c;
import y0.i;
import y0.j;

@Metadata
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends T implements j {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClearAndSetSemanticsElement)) {
            return false;
        }
        Object obj2 = C0173u.f2035k;
        ((ClearAndSetSemanticsElement) obj).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C0173u.f2035k.hashCode();
    }

    @Override // y0.j
    public final i j() {
        i iVar = new i();
        iVar.f11577e = false;
        iVar.f11578i = true;
        Unit unit = Unit.f7487a;
        return iVar;
    }

    @Override // r0.T
    public final n l() {
        return new C1319c(false, true, C0173u.f2035k);
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C1319c) nVar).f11541v = C0173u.f2035k;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + C0173u.f2035k + ')';
    }
}
