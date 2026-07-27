package androidx.compose.ui.draw;

import A.AbstractC0017m;
import S.c;
import S.n;
import W.h;
import Y.f;
import Z.C0316m;
import e0.AbstractC0557b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p0.C0949J;
import r0.AbstractC1065f;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class PainterElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0557b f5160a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5161b;

    /* renamed from: c, reason: collision with root package name */
    public final c f5162c;

    /* renamed from: d, reason: collision with root package name */
    public final C0949J f5163d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5164e;

    /* renamed from: f, reason: collision with root package name */
    public final C0316m f5165f;

    public PainterElement(AbstractC0557b abstractC0557b, boolean z4, c cVar, C0949J c0949j, float f4, C0316m c0316m) {
        this.f5160a = abstractC0557b;
        this.f5161b = z4;
        this.f5162c = cVar;
        this.f5163d = c0949j;
        this.f5164e = f4;
        this.f5165f = c0316m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.a(this.f5160a, painterElement.f5160a) && this.f5161b == painterElement.f5161b && Intrinsics.a(this.f5162c, painterElement.f5162c) && Intrinsics.a(this.f5163d, painterElement.f5163d) && Float.compare(this.f5164e, painterElement.f5164e) == 0 && Intrinsics.a(this.f5165f, painterElement.f5165f);
    }

    public final int hashCode() {
        int a4 = AbstractC0017m.a(this.f5164e, (this.f5163d.hashCode() + ((this.f5162c.hashCode() + AbstractC0017m.d(this.f5160a.hashCode() * 31, 31, this.f5161b)) * 31)) * 31, 31);
        C0316m c0316m = this.f5165f;
        return a4 + (c0316m == null ? 0 : c0316m.hashCode());
    }

    @Override // r0.T
    public final n l() {
        h hVar = new h();
        hVar.f4199t = this.f5160a;
        hVar.f4200u = this.f5161b;
        hVar.f4201v = this.f5162c;
        hVar.f4202w = this.f5163d;
        hVar.f4203x = this.f5164e;
        hVar.f4204y = this.f5165f;
        return hVar;
    }

    @Override // r0.T
    public final void m(n nVar) {
        h hVar = (h) nVar;
        boolean z4 = hVar.f4200u;
        AbstractC0557b abstractC0557b = this.f5160a;
        boolean z5 = this.f5161b;
        boolean z6 = z4 != z5 || (z5 && !f.a(hVar.f4199t.d(), abstractC0557b.d()));
        hVar.f4199t = abstractC0557b;
        hVar.f4200u = z5;
        hVar.f4201v = this.f5162c;
        hVar.f4202w = this.f5163d;
        hVar.f4203x = this.f5164e;
        hVar.f4204y = this.f5165f;
        if (z6) {
            AbstractC1065f.o(hVar);
        }
        AbstractC1065f.n(hVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f5160a + ", sizeToIntrinsics=" + this.f5161b + ", alignment=" + this.f5162c + ", contentScale=" + this.f5163d + ", alpha=" + this.f5164e + ", colorFilter=" + this.f5165f + ')';
    }
}
