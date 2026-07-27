package androidx.compose.ui.layout;

import L2.c;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p0.C0983s;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class LayoutElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final c f5208a;

    public LayoutElement(c cVar) {
        this.f5208a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && Intrinsics.a(this.f5208a, ((LayoutElement) obj).f5208a);
    }

    public final int hashCode() {
        return this.f5208a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        C0983s c0983s = new C0983s();
        c0983s.f9056t = this.f5208a;
        return c0983s;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C0983s) nVar).f9056t = this.f5208a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f5208a + ')';
    }
}
