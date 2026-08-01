package h1;

import a2.g;
import c2.x0;
import d1.k;
import k1.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh1/e;", "Lc2/x0;", "Lh1/f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class e extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final p1.b f4430a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.d f4431b;

    /* renamed from: c, reason: collision with root package name */
    public final g f4432c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4433d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4434e;

    public e(p1.b bVar, d1.d dVar, g gVar, float f3, j jVar) {
        this.f4430a = bVar;
        this.f4431b = dVar;
        this.f4432c = gVar;
        this.f4433d = f3;
        this.f4434e = jVar;
    }

    @Override // c2.x0
    public final k d() {
        f fVar = new f();
        fVar.C = this.f4430a;
        fVar.D = true;
        fVar.E = this.f4431b;
        fVar.F = this.f4432c;
        fVar.G = this.f4433d;
        fVar.H = this.f4434e;
        return fVar;
    }

    @Override // c2.x0
    public final void e(k kVar) {
        f fVar = (f) kVar;
        boolean z10 = fVar.D;
        p1.b bVar = this.f4430a;
        boolean z11 = (z10 && j1.e.a(fVar.C.d(), bVar.d())) ? false : true;
        fVar.C = bVar;
        fVar.D = true;
        fVar.E = this.f4431b;
        fVar.F = this.f4432c;
        fVar.G = this.f4433d;
        fVar.H = this.f4434e;
        if (z11) {
            c2.k.m(fVar);
        }
        c2.k.l(fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f4430a, eVar.f4430a) && Intrinsics.a(this.f4431b, eVar.f4431b) && this.f4432c.equals(eVar.f4432c) && Float.compare(this.f4433d, eVar.f4433d) == 0 && Intrinsics.a(this.f4434e, eVar.f4434e);
    }

    public final int hashCode() {
        int b10 = l.b(this.f4433d, (this.f4432c.hashCode() + ((this.f4431b.hashCode() + l.d(this.f4430a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        j jVar = this.f4434e;
        return b10 + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f4430a + ", sizeToIntrinsics=true, alignment=" + this.f4431b + ", contentScale=" + this.f4432c + ", alpha=" + this.f4433d + ", colorFilter=" + this.f4434e + ')';
    }
}
