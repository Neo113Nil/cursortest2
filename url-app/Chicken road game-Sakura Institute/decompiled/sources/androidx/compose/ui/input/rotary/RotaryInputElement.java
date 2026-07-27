package androidx.compose.ui.input.rotary;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.C0865a;
import r0.T;
import s0.C1157n;

@Metadata
/* loaded from: classes.dex */
final class RotaryInputElement extends T {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        Object obj2 = C1157n.f10269j;
        return obj2.equals(obj2) && Intrinsics.a(null, null);
    }

    public final int hashCode() {
        return C1157n.f10269j.hashCode() * 31;
    }

    @Override // r0.T
    public final n l() {
        C0865a c0865a = new C0865a();
        c0865a.f8552t = C1157n.f10269j;
        return c0865a;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C0865a) nVar).f8552t = C1157n.f10269j;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C1157n.f10269j + ", onPreRotaryScrollEvent=null)";
    }
}
