package androidx.compose.foundation.layout;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q.C1033l;
import q.InterfaceC1021Z;
import q.b0;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class PaddingValuesElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1021Z f5068a;

    public PaddingValuesElement(InterfaceC1021Z interfaceC1021Z, C1033l c1033l) {
        this.f5068a = interfaceC1021Z;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.a(this.f5068a, paddingValuesElement.f5068a);
    }

    public final int hashCode() {
        return this.f5068a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        b0 b0Var = new b0();
        b0Var.f9239t = this.f5068a;
        return b0Var;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((b0) nVar).f9239t = this.f5068a;
    }
}
