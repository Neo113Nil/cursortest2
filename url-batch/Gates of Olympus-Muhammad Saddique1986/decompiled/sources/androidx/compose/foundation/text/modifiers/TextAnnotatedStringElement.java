package androidx.compose.foundation.text.modifiers;

import A.k;
import C0.C0031g;
import C0.K;
import H0.d;
import S1.u;
import U.p;
import a.AbstractC0235a;
import b0.w;
import e2.InterfaceC0424c;
import f2.j;
import java.util.Collection;
import java.util.List;
import m.AbstractC0625j;
import t0.AbstractC0993f;
import t0.U;

/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final C0031g f4864a;

    /* renamed from: b, reason: collision with root package name */
    public final K f4865b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4866c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0424c f4867d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4868e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4869f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4870g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4871h;

    /* renamed from: i, reason: collision with root package name */
    public final w f4872i;

    public TextAnnotatedStringElement(C0031g c0031g, K k3, d dVar, InterfaceC0424c interfaceC0424c, int i3, boolean z3, int i4, int i5, w wVar) {
        this.f4864a = c0031g;
        this.f4865b = k3;
        this.f4866c = dVar;
        this.f4867d = interfaceC0424c;
        this.f4868e = i3;
        this.f4869f = z3;
        this.f4870g = i4;
        this.f4871h = i5;
        this.f4872i = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return j.a(this.f4872i, textAnnotatedStringElement.f4872i) && this.f4864a.equals(textAnnotatedStringElement.f4864a) && j.a(this.f4865b, textAnnotatedStringElement.f4865b) && j.a(null, null) && j.a(this.f4866c, textAnnotatedStringElement.f4866c) && this.f4867d == textAnnotatedStringElement.f4867d && AbstractC0235a.v(this.f4868e, textAnnotatedStringElement.f4868e) && this.f4869f == textAnnotatedStringElement.f4869f && this.f4870g == textAnnotatedStringElement.f4870g && this.f4871h == textAnnotatedStringElement.f4871h && j.a(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.f4866c.hashCode() + ((this.f4865b.hashCode() + (this.f4864a.hashCode() * 31)) * 31)) * 31;
        InterfaceC0424c interfaceC0424c = this.f4867d;
        int e3 = (((k.e(AbstractC0625j.a(this.f4868e, (hashCode + (interfaceC0424c != null ? interfaceC0424c.hashCode() : 0)) * 31, 31), 31, this.f4869f) + this.f4870g) * 31) + this.f4871h) * 923521;
        w wVar = this.f4872i;
        return (e3 + (wVar != null ? wVar.hashCode() : 0)) * 31;
    }

    @Override // t0.U
    public final p l() {
        C0031g c0031g = this.f4864a;
        A.j jVar = new A.j();
        jVar.f60q = c0031g;
        jVar.f61r = this.f4865b;
        jVar.f62s = this.f4866c;
        jVar.f63t = this.f4867d;
        jVar.f64u = this.f4868e;
        jVar.f65v = this.f4869f;
        jVar.f66w = this.f4870g;
        jVar.f67x = this.f4871h;
        jVar.f68y = null;
        jVar.f69z = null;
        jVar.f56A = this.f4872i;
        jVar.f57B = null;
        return jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1.f571a.b(r0.f571a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    @Override // t0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(p pVar) {
        boolean z3;
        boolean a3;
        Collection collection;
        Collection collection2;
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
        InterfaceC0424c interfaceC0424c;
        InterfaceC0424c interfaceC0424c2;
        A.j jVar = (A.j) pVar;
        w wVar = jVar.f56A;
        w wVar2 = this.f4872i;
        boolean a4 = j.a(wVar2, wVar);
        jVar.f56A = wVar2;
        K k3 = this.f4865b;
        boolean z7 = false;
        boolean z8 = true;
        if (a4) {
            K k4 = jVar.f61r;
            if (k3 == k4) {
                k3.getClass();
            }
            z3 = false;
            C0031g c0031g = this.f4864a;
            a3 = j.a(jVar.f60q.f596a, c0031g.f596a);
            boolean equals = jVar.f60q.a().equals(c0031g.a());
            C0031g c0031g2 = jVar.f60q;
            Object obj = u.f4320d;
            collection = c0031g2.f598c;
            if (collection == null) {
                collection = obj;
            }
            collection2 = c0031g.f598c;
            if (collection2 != null) {
                obj = collection2;
            }
            z4 = (!a3 && equals && collection.equals(obj) && j.a(jVar.f60q.f599d, c0031g.f599d)) ? false : true;
            if (z4) {
                jVar.f60q = c0031g;
            }
            if (!a3) {
                jVar.f59F = null;
            }
            boolean z9 = !jVar.f61r.c(k3);
            jVar.f61r = k3;
            if (!j.a(jVar.f68y, null)) {
                jVar.f68y = null;
                z9 = true;
            }
            i3 = jVar.f67x;
            i4 = this.f4871h;
            if (i3 != i4) {
                jVar.f67x = i4;
                z9 = true;
            }
            i5 = jVar.f66w;
            i6 = this.f4870g;
            if (i5 != i6) {
                jVar.f66w = i6;
                z9 = true;
            }
            z5 = jVar.f65v;
            z6 = this.f4869f;
            if (z5 != z6) {
                jVar.f65v = z6;
                z9 = true;
            }
            dVar = jVar.f62s;
            dVar2 = this.f4866c;
            if (!j.a(dVar, dVar2)) {
                jVar.f62s = dVar2;
                z9 = true;
            }
            i7 = jVar.f64u;
            i8 = this.f4868e;
            if (!AbstractC0235a.v(i7, i8)) {
                jVar.f64u = i8;
                z9 = true;
            }
            interfaceC0424c = jVar.f63t;
            interfaceC0424c2 = this.f4867d;
            if (interfaceC0424c != interfaceC0424c2) {
                jVar.f63t = interfaceC0424c2;
                z7 = true;
            }
            if (jVar.f69z != null) {
                jVar.f69z = null;
                z7 = true;
            }
            if (!j.a(null, null)) {
                z7 = true;
            }
            if (jVar.f57B == null) {
                jVar.f57B = null;
            } else {
                z8 = z7;
            }
            if (!z4 || z9 || z8) {
                A.d y02 = jVar.y0();
                C0031g c0031g3 = jVar.f60q;
                K k5 = jVar.f61r;
                d dVar3 = jVar.f62s;
                int i9 = jVar.f64u;
                boolean z10 = jVar.f65v;
                int i10 = jVar.f66w;
                int i11 = jVar.f67x;
                List list = jVar.f68y;
                y02.f12a = c0031g3;
                y02.f13b = k5;
                y02.f14c = dVar3;
                y02.f15d = i9;
                y02.f16e = z10;
                y02.f17f = i10;
                y02.f18g = i11;
                y02.f19h = list;
                y02.f23l = null;
                y02.f25n = null;
                y02.f27p = -1;
                y02.f26o = -1;
            }
            if (jVar.f4501p) {
                return;
            }
            if (z4 || (z3 && jVar.f58E != null)) {
                AbstractC0993f.o(jVar);
            }
            if (z4 || z9 || z8) {
                AbstractC0993f.n(jVar);
                AbstractC0993f.m(jVar);
            }
            if (z3) {
                AbstractC0993f.m(jVar);
                return;
            }
            return;
        }
        z3 = true;
        C0031g c0031g4 = this.f4864a;
        a3 = j.a(jVar.f60q.f596a, c0031g4.f596a);
        boolean equals2 = jVar.f60q.a().equals(c0031g4.a());
        C0031g c0031g22 = jVar.f60q;
        Object obj2 = u.f4320d;
        collection = c0031g22.f598c;
        if (collection == null) {
        }
        collection2 = c0031g4.f598c;
        if (collection2 != null) {
        }
        if (!a3) {
        }
        if (z4) {
        }
        if (!a3) {
        }
        boolean z92 = !jVar.f61r.c(k3);
        jVar.f61r = k3;
        if (!j.a(jVar.f68y, null)) {
        }
        i3 = jVar.f67x;
        i4 = this.f4871h;
        if (i3 != i4) {
        }
        i5 = jVar.f66w;
        i6 = this.f4870g;
        if (i5 != i6) {
        }
        z5 = jVar.f65v;
        z6 = this.f4869f;
        if (z5 != z6) {
        }
        dVar = jVar.f62s;
        dVar2 = this.f4866c;
        if (!j.a(dVar, dVar2)) {
        }
        i7 = jVar.f64u;
        i8 = this.f4868e;
        if (!AbstractC0235a.v(i7, i8)) {
        }
        interfaceC0424c = jVar.f63t;
        interfaceC0424c2 = this.f4867d;
        if (interfaceC0424c != interfaceC0424c2) {
        }
        if (jVar.f69z != null) {
        }
        if (!j.a(null, null)) {
        }
        if (jVar.f57B == null) {
        }
        if (!z4) {
        }
        A.d y022 = jVar.y0();
        C0031g c0031g32 = jVar.f60q;
        K k52 = jVar.f61r;
        d dVar32 = jVar.f62s;
        int i92 = jVar.f64u;
        boolean z102 = jVar.f65v;
        int i102 = jVar.f66w;
        int i112 = jVar.f67x;
        List list2 = jVar.f68y;
        y022.f12a = c0031g32;
        y022.f13b = k52;
        y022.f14c = dVar32;
        y022.f15d = i92;
        y022.f16e = z102;
        y022.f17f = i102;
        y022.f18g = i112;
        y022.f19h = list2;
        y022.f23l = null;
        y022.f25n = null;
        y022.f27p = -1;
        y022.f26o = -1;
        if (jVar.f4501p) {
        }
    }
}
