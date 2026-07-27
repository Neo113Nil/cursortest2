package androidx.compose.ui.layout;

import S.n;
import kotlin.Metadata;
import p0.C0981q;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class LayoutIdElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final String f5209a;

    public LayoutIdElement(String str) {
        this.f5209a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f5209a.equals(((LayoutIdElement) obj).f5209a);
    }

    public final int hashCode() {
        return this.f5209a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        C0981q c0981q = new C0981q();
        c0981q.f9055t = this.f5209a;
        return c0981q;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C0981q) nVar).f9055t = this.f5209a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f5209a) + ')';
    }
}
