package androidx.compose.ui.focus;

import S.n;
import X.i;
import X.m;
import X.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class FocusPropertiesElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final m f5172a;

    public FocusPropertiesElement(m mVar) {
        this.f5172a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && Intrinsics.a(this.f5172a, ((FocusPropertiesElement) obj).f5172a);
    }

    public final int hashCode() {
        return i.f4324e.hashCode();
    }

    @Override // r0.T
    public final n l() {
        o oVar = new o();
        oVar.f4343t = this.f5172a;
        return oVar;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((o) nVar).f4343t = this.f5172a;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f5172a + ')';
    }
}
