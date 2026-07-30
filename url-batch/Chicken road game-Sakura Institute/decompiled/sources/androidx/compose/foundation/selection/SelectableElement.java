package androidx.compose.foundation.selection;

import a0.m;
import l.h;
import p.j;
import r1.s0;
import r6.k;
import s0.n;
import y1.f;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class SelectableElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f665a;

    /* renamed from: b, reason: collision with root package name */
    public final j f666b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f667c;

    /* renamed from: d, reason: collision with root package name */
    public final f f668d;

    /* renamed from: e, reason: collision with root package name */
    public final q6.a f669e;

    public SelectableElement(boolean z8, j jVar, boolean z9, f fVar, q6.a aVar) {
        this.f665a = z8;
        this.f666b = jVar;
        this.f667c = z9;
        this.f668d = fVar;
        this.f669e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f665a == selectableElement.f665a && k.a(this.f666b, selectableElement.f666b) && this.f667c == selectableElement.f667c && this.f668d.equals(selectableElement.f668d) && this.f669e == selectableElement.f669e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f665a) * 31;
        j jVar = this.f666b;
        return this.f669e.hashCode() + h.c(this.f668d.f9803a, m.e((hashCode + (jVar != null ? jVar.hashCode() : 0)) * 961, 31, this.f667c), 31);
    }

    @Override // r1.s0
    public final n l() {
        u.b bVar = new u.b(this.f666b, null, this.f667c, null, this.f668d, this.f669e);
        bVar.M = this.f665a;
        return bVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        u.b bVar = (u.b) nVar;
        boolean z8 = bVar.M;
        boolean z9 = this.f665a;
        if (z8 != z9) {
            bVar.M = z9;
            r1.f.o(bVar);
        }
        bVar.G0(this.f666b, null, this.f667c, null, this.f668d, this.f669e);
    }
}
