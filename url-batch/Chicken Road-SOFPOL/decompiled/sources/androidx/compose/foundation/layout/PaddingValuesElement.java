package androidx.compose.foundation.layout;

import q6.i;
import w1.x0;
import x.f0;
import x.h0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class PaddingValuesElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f494a;

    public PaddingValuesElement(f0 f0Var) {
        this.f494a = f0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return i.a(this.f494a, paddingValuesElement.f494a);
    }

    @Override // w1.x0
    public final l f() {
        h0 h0Var = new h0();
        h0Var.f8220r = this.f494a;
        return h0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((h0) lVar).f8220r = this.f494a;
    }

    public final int hashCode() {
        return this.f494a.hashCode();
    }
}
