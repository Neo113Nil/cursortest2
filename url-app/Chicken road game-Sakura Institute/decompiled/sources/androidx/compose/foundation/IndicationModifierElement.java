package androidx.compose.foundation;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.V;
import m.W;
import p.InterfaceC0934j;
import r0.InterfaceC1072m;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class IndicationModifierElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0934j f5018a;

    /* renamed from: b, reason: collision with root package name */
    public final W f5019b;

    public IndicationModifierElement(InterfaceC0934j interfaceC0934j, W w4) {
        this.f5018a = interfaceC0934j;
        this.f5019b = w4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Intrinsics.a(this.f5018a, indicationModifierElement.f5018a) && Intrinsics.a(this.f5019b, indicationModifierElement.f5019b);
    }

    public final int hashCode() {
        return this.f5019b.hashCode() + (this.f5018a.hashCode() * 31);
    }

    @Override // r0.T
    public final n l() {
        InterfaceC1072m a4 = this.f5019b.a(this.f5018a);
        V v4 = new V();
        v4.f8050v = a4;
        v4.B0(a4);
        return v4;
    }

    @Override // r0.T
    public final void m(n nVar) {
        V v4 = (V) nVar;
        InterfaceC1072m a4 = this.f5019b.a(this.f5018a);
        v4.C0(v4.f8050v);
        v4.f8050v = a4;
        v4.B0(a4);
    }
}
