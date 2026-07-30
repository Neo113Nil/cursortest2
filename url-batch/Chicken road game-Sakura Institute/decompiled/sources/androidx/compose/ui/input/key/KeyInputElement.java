package androidx.compose.ui.input.key;

import j1.e;
import q6.c;
import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class KeyInputElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f729a;

    /* renamed from: b, reason: collision with root package name */
    public final c f730b;

    public KeyInputElement(c cVar, c cVar2) {
        this.f729a = cVar;
        this.f730b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return k.a(this.f729a, keyInputElement.f729a) && k.a(this.f730b, keyInputElement.f730b);
    }

    public final int hashCode() {
        c cVar = this.f729a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        c cVar2 = this.f730b;
        return hashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @Override // r1.s0
    public final n l() {
        e eVar = new e();
        eVar.f4990s = this.f729a;
        eVar.f4991t = this.f730b;
        return eVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        e eVar = (e) nVar;
        eVar.f4990s = this.f729a;
        eVar.f4991t = this.f730b;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f729a + ", onPreKeyEvent=" + this.f730b + ')';
    }
}
