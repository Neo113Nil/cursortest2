package androidx.compose.ui.input.key;

import M2.p;
import S.n;
import j0.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class KeyInputElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5201a;

    /* renamed from: b, reason: collision with root package name */
    public final p f5202b;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(Function1 function1, Function1 function12) {
        this.f5201a = function1;
        this.f5202b = (p) function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return Intrinsics.a(this.f5201a, keyInputElement.f5201a) && Intrinsics.a(this.f5202b, keyInputElement.f5202b);
    }

    public final int hashCode() {
        Function1 function1 = this.f5201a;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        p pVar = this.f5202b;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // r0.T
    public final n l() {
        e eVar = new e();
        eVar.f7141t = this.f5201a;
        eVar.f7142u = this.f5202b;
        return eVar;
    }

    @Override // r0.T
    public final void m(n nVar) {
        e eVar = (e) nVar;
        eVar.f7141t = this.f5201a;
        eVar.f7142u = this.f5202b;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f5201a + ", onPreKeyEvent=" + this.f5202b + ')';
    }
}
