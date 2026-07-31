package androidx.compose.foundation.text.modifiers;

import A.e;
import A.k;
import A.n;
import C0.K;
import H0.d;
import U.p;
import a.AbstractC0235a;
import b0.w;
import f2.j;
import m.AbstractC0625j;
import t0.AbstractC0993f;
import t0.U;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final String f4873a;

    /* renamed from: b, reason: collision with root package name */
    public final K f4874b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4876d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4877e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4878f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4879g;

    /* renamed from: h, reason: collision with root package name */
    public final w f4880h;

    public TextStringSimpleElement(String str, K k3, d dVar, int i3, boolean z3, int i4, int i5, w wVar) {
        this.f4873a = str;
        this.f4874b = k3;
        this.f4875c = dVar;
        this.f4876d = i3;
        this.f4877e = z3;
        this.f4878f = i4;
        this.f4879g = i5;
        this.f4880h = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return j.a(this.f4880h, textStringSimpleElement.f4880h) && j.a(this.f4873a, textStringSimpleElement.f4873a) && j.a(this.f4874b, textStringSimpleElement.f4874b) && j.a(this.f4875c, textStringSimpleElement.f4875c) && AbstractC0235a.v(this.f4876d, textStringSimpleElement.f4876d) && this.f4877e == textStringSimpleElement.f4877e && this.f4878f == textStringSimpleElement.f4878f && this.f4879g == textStringSimpleElement.f4879g;
    }

    public final int hashCode() {
        int e3 = (((k.e(AbstractC0625j.a(this.f4876d, (this.f4875c.hashCode() + ((this.f4874b.hashCode() + (this.f4873a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f4877e) + this.f4878f) * 31) + this.f4879g) * 31;
        w wVar = this.f4880h;
        return e3 + (wVar != null ? wVar.hashCode() : 0);
    }

    @Override // t0.U
    public final p l() {
        n nVar = new n();
        nVar.f78q = this.f4873a;
        nVar.f79r = this.f4874b;
        nVar.f80s = this.f4875c;
        nVar.f81t = this.f4876d;
        nVar.f82u = this.f4877e;
        nVar.f83v = this.f4878f;
        nVar.f84w = this.f4879g;
        nVar.f85x = this.f4880h;
        return nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3.f571a.b(r0.f571a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0034  */
    @Override // t0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(p pVar) {
        boolean z3;
        String str;
        String str2;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        d dVar;
        d dVar2;
        int i7;
        int i8;
        n nVar = (n) pVar;
        w wVar = nVar.f85x;
        w wVar2 = this.f4880h;
        boolean a3 = j.a(wVar2, wVar);
        nVar.f85x = wVar2;
        boolean z7 = true;
        K k3 = this.f4874b;
        if (a3) {
            K k4 = nVar.f79r;
            if (k3 == k4) {
                k3.getClass();
            }
            z3 = false;
            str = nVar.f78q;
            str2 = this.f4873a;
            if (j.a(str, str2)) {
                nVar.f78q = str2;
                nVar.f77B = null;
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = !nVar.f79r.c(k3);
            nVar.f79r = k3;
            i3 = nVar.f84w;
            i4 = this.f4879g;
            if (i3 != i4) {
                nVar.f84w = i4;
                z8 = true;
            }
            i5 = nVar.f83v;
            i6 = this.f4878f;
            if (i5 != i6) {
                nVar.f83v = i6;
                z8 = true;
            }
            z5 = nVar.f82u;
            z6 = this.f4877e;
            if (z5 != z6) {
                nVar.f82u = z6;
                z8 = true;
            }
            dVar = nVar.f80s;
            dVar2 = this.f4875c;
            if (!j.a(dVar, dVar2)) {
                nVar.f80s = dVar2;
                z8 = true;
            }
            i7 = nVar.f81t;
            i8 = this.f4876d;
            if (AbstractC0235a.v(i7, i8)) {
                nVar.f81t = i8;
            } else {
                z7 = z8;
            }
            if (!z4 || z7) {
                e y02 = nVar.y0();
                String str3 = nVar.f78q;
                K k5 = nVar.f79r;
                d dVar3 = nVar.f80s;
                int i9 = nVar.f81t;
                boolean z9 = nVar.f82u;
                int i10 = nVar.f83v;
                int i11 = nVar.f84w;
                y02.f28a = str3;
                y02.f29b = k5;
                y02.f30c = dVar3;
                y02.f31d = i9;
                y02.f32e = z9;
                y02.f33f = i10;
                y02.f34g = i11;
                y02.f37j = null;
                y02.f41n = null;
                y02.f42o = null;
                y02.f44q = -1;
                y02.f45r = -1;
                y02.f43p = O2.d.H(0, 0, 0, 0);
                y02.f39l = O2.d.d(0, 0);
                y02.f38k = false;
            }
            if (nVar.f4501p) {
                return;
            }
            if (z4 || (z3 && nVar.f76A != null)) {
                AbstractC0993f.o(nVar);
            }
            if (z4 || z7) {
                AbstractC0993f.n(nVar);
                AbstractC0993f.m(nVar);
            }
            if (z3) {
                AbstractC0993f.m(nVar);
                return;
            }
            return;
        }
        z3 = true;
        str = nVar.f78q;
        str2 = this.f4873a;
        if (j.a(str, str2)) {
        }
        boolean z82 = !nVar.f79r.c(k3);
        nVar.f79r = k3;
        i3 = nVar.f84w;
        i4 = this.f4879g;
        if (i3 != i4) {
        }
        i5 = nVar.f83v;
        i6 = this.f4878f;
        if (i5 != i6) {
        }
        z5 = nVar.f82u;
        z6 = this.f4877e;
        if (z5 != z6) {
        }
        dVar = nVar.f80s;
        dVar2 = this.f4875c;
        if (!j.a(dVar, dVar2)) {
        }
        i7 = nVar.f81t;
        i8 = this.f4876d;
        if (AbstractC0235a.v(i7, i8)) {
        }
        if (!z4) {
        }
        e y022 = nVar.y0();
        String str32 = nVar.f78q;
        K k52 = nVar.f79r;
        d dVar32 = nVar.f80s;
        int i92 = nVar.f81t;
        boolean z92 = nVar.f82u;
        int i102 = nVar.f83v;
        int i112 = nVar.f84w;
        y022.f28a = str32;
        y022.f29b = k52;
        y022.f30c = dVar32;
        y022.f31d = i92;
        y022.f32e = z92;
        y022.f33f = i102;
        y022.f34g = i112;
        y022.f37j = null;
        y022.f41n = null;
        y022.f42o = null;
        y022.f44q = -1;
        y022.f45r = -1;
        y022.f43p = O2.d.H(0, 0, 0, 0);
        y022.f39l = O2.d.d(0, 0);
        y022.f38k = false;
        if (nVar.f4501p) {
        }
    }
}
