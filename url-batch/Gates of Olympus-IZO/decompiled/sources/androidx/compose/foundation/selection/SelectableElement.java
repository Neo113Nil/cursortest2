package androidx.compose.foundation.selection;

import H2.AbstractC0080b;
import U.k;
import Z1.i;
import n.W;
import q.j;
import t0.AbstractC0898f;
import t0.T;
import w.C1020b;
import z0.f;

/* loaded from: classes.dex */
final class SelectableElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3667a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3668b;

    /* renamed from: c, reason: collision with root package name */
    public final W f3669c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3670d;

    /* renamed from: e, reason: collision with root package name */
    public final f f3671e;

    /* renamed from: f, reason: collision with root package name */
    public final Y1.a f3672f;

    public SelectableElement(boolean z3, j jVar, W w3, boolean z4, f fVar, Y1.a aVar) {
        this.f3667a = z3;
        this.f3668b = jVar;
        this.f3669c = w3;
        this.f3670d = z4;
        this.f3671e = fVar;
        this.f3672f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f3667a == selectableElement.f3667a && i.a(this.f3668b, selectableElement.f3668b) && i.a(this.f3669c, selectableElement.f3669c) && this.f3670d == selectableElement.f3670d && i.a(this.f3671e, selectableElement.f3671e) && this.f3672f == selectableElement.f3672f;
    }

    @Override // t0.T
    public final k h() {
        C1020b c1020b = new C1020b(this.f3668b, this.f3669c, this.f3670d, null, this.f3671e, this.f3672f);
        c1020b.f8574K = this.f3667a;
        return c1020b;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f3667a) * 31;
        j jVar = this.f3668b;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        W w3 = this.f3669c;
        int f3 = AbstractC0080b.f((hashCode2 + (w3 != null ? w3.hashCode() : 0)) * 31, 31, this.f3670d);
        f fVar = this.f3671e;
        return this.f3672f.hashCode() + ((f3 + (fVar != null ? Integer.hashCode(fVar.f8953a) : 0)) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        C1020b c1020b = (C1020b) kVar;
        boolean z3 = c1020b.f8574K;
        boolean z4 = this.f3667a;
        if (z3 != z4) {
            c1020b.f8574K = z4;
            AbstractC0898f.o(c1020b);
        }
        c1020b.B0(this.f3668b, this.f3669c, this.f3670d, null, this.f3671e, this.f3672f);
    }
}
