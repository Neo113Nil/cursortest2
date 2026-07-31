package androidx.compose.ui.input.key;

import U.p;
import e2.InterfaceC0424c;
import f2.j;
import f2.k;
import l0.e;
import t0.U;

/* loaded from: classes.dex */
final class KeyInputElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f4926a;

    /* renamed from: b, reason: collision with root package name */
    public final k f4927b;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2) {
        this.f4926a = interfaceC0424c;
        this.f4927b = (k) interfaceC0424c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return j.a(this.f4926a, keyInputElement.f4926a) && j.a(this.f4927b, keyInputElement.f4927b);
    }

    public final int hashCode() {
        InterfaceC0424c interfaceC0424c = this.f4926a;
        int hashCode = (interfaceC0424c == null ? 0 : interfaceC0424c.hashCode()) * 31;
        k kVar = this.f4927b;
        return hashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    @Override // t0.U
    public final p l() {
        e eVar = new e();
        eVar.f6581q = this.f4926a;
        eVar.f6582r = this.f4927b;
        return eVar;
    }

    @Override // t0.U
    public final void m(p pVar) {
        e eVar = (e) pVar;
        eVar.f6581q = this.f4926a;
        eVar.f6582r = this.f4927b;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f4926a + ", onPreKeyEvent=" + this.f4927b + ')';
    }
}
