package androidx.compose.foundation.text.modifiers;

import A2.g;
import B0.C;
import B0.C0007d;
import F0.e;
import H2.AbstractC0080b;
import M1.u;
import U.k;
import Y1.c;
import Z1.i;
import a.AbstractC0157a;
import java.util.Collection;
import java.util.List;
import t0.AbstractC0898f;
import t0.T;
import z.C1068d;
import z.C1072h;

/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final C0007d f3678a;

    /* renamed from: b, reason: collision with root package name */
    public final C f3679b;

    /* renamed from: c, reason: collision with root package name */
    public final e f3680c;

    /* renamed from: d, reason: collision with root package name */
    public final c f3681d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3682e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3683f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3684g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3685h;

    /* renamed from: i, reason: collision with root package name */
    public final g f3686i;

    public TextAnnotatedStringElement(C0007d c0007d, C c3, e eVar, c cVar, int i3, boolean z3, int i4, int i5, g gVar) {
        this.f3678a = c0007d;
        this.f3679b = c3;
        this.f3680c = eVar;
        this.f3681d = cVar;
        this.f3682e = i3;
        this.f3683f = z3;
        this.f3684g = i4;
        this.f3685h = i5;
        this.f3686i = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return i.a(this.f3686i, textAnnotatedStringElement.f3686i) && this.f3678a.equals(textAnnotatedStringElement.f3678a) && i.a(this.f3679b, textAnnotatedStringElement.f3679b) && i.a(null, null) && i.a(this.f3680c, textAnnotatedStringElement.f3680c) && this.f3681d == textAnnotatedStringElement.f3681d && AbstractC0157a.y(this.f3682e, textAnnotatedStringElement.f3682e) && this.f3683f == textAnnotatedStringElement.f3683f && this.f3684g == textAnnotatedStringElement.f3684g && this.f3685h == textAnnotatedStringElement.f3685h && i.a(null, null);
    }

    @Override // t0.T
    public final k h() {
        C0007d c0007d = this.f3678a;
        C1072h c1072h = new C1072h();
        c1072h.f8915q = c0007d;
        c1072h.f8916r = this.f3679b;
        c1072h.f8917s = this.f3680c;
        c1072h.f8918t = this.f3681d;
        c1072h.f8919u = this.f3682e;
        c1072h.f8920v = this.f3683f;
        c1072h.f8921w = this.f3684g;
        c1072h.f8922x = this.f3685h;
        c1072h.f8923y = null;
        c1072h.f8924z = null;
        c1072h.f8912A = this.f3686i;
        c1072h.B = null;
        return c1072h;
    }

    public final int hashCode() {
        int hashCode = (this.f3680c.hashCode() + ((this.f3679b.hashCode() + (this.f3678a.hashCode() * 31)) * 31)) * 31;
        c cVar = this.f3681d;
        int f3 = (((AbstractC0080b.f(AbstractC0080b.b(this.f3682e, (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31, this.f3683f) + this.f3684g) * 31) + this.f3685h) * 923521;
        g gVar = this.f3686i;
        return (f3 + (gVar != null ? gVar.hashCode() : 0)) * 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1.f235a.b(r0.f235a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    @Override // t0.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(k kVar) {
        boolean z3;
        boolean a3;
        Collection collection;
        Collection collection2;
        Collection collection3;
        Collection collection4;
        boolean z4;
        C c3;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        e eVar;
        e eVar2;
        int i7;
        int i8;
        c cVar;
        c cVar2;
        C1072h c1072h = (C1072h) kVar;
        g gVar = c1072h.f8912A;
        g gVar2 = this.f3686i;
        boolean a4 = i.a(gVar2, gVar);
        c1072h.f8912A = gVar2;
        C c4 = this.f3679b;
        boolean z8 = true;
        boolean z9 = false;
        if (a4) {
            C c5 = c1072h.f8916r;
            if (c4 == c5) {
                c4.getClass();
            }
            z3 = false;
            C0007d c0007d = this.f3678a;
            a3 = i.a(c1072h.f8915q.f251a, c0007d.f251a);
            C0007d c0007d2 = c1072h.f8915q;
            Collection collection5 = u.f2803d;
            collection = c0007d2.f252b;
            if (collection == null) {
                collection = collection5;
            }
            collection2 = c0007d.f252b;
            if (collection2 == null) {
                collection2 = collection5;
            }
            boolean equals = collection.equals(collection2);
            collection3 = c1072h.f8915q.f253c;
            if (collection3 == null) {
                collection3 = collection5;
            }
            collection4 = c0007d.f253c;
            if (collection4 != null) {
                collection5 = collection4;
            }
            z4 = (!a3 && equals && collection3.equals(collection5) && i.a(c1072h.f8915q.f254d, c0007d.f254d)) ? false : true;
            if (z4) {
                c1072h.f8915q = c0007d;
            }
            if (!a3) {
                c1072h.f8914F = null;
            }
            c3 = c1072h.f8916r;
            c3.getClass();
            if (c3 != c4) {
                if (!i.a(c3.f236b, c4.f236b) || !c3.f235a.a(c4.f235a)) {
                    z5 = false;
                    boolean z10 = !z5;
                    c1072h.f8916r = c4;
                    if (!i.a(c1072h.f8923y, null)) {
                        c1072h.f8923y = null;
                        z10 = true;
                    }
                    i3 = c1072h.f8922x;
                    i4 = this.f3685h;
                    if (i3 != i4) {
                        c1072h.f8922x = i4;
                        z10 = true;
                    }
                    i5 = c1072h.f8921w;
                    i6 = this.f3684g;
                    if (i5 != i6) {
                        c1072h.f8921w = i6;
                        z10 = true;
                    }
                    z6 = c1072h.f8920v;
                    z7 = this.f3683f;
                    if (z6 != z7) {
                        c1072h.f8920v = z7;
                        z10 = true;
                    }
                    eVar = c1072h.f8917s;
                    eVar2 = this.f3680c;
                    if (!i.a(eVar, eVar2)) {
                        c1072h.f8917s = eVar2;
                        z10 = true;
                    }
                    i7 = c1072h.f8919u;
                    i8 = this.f3682e;
                    if (!AbstractC0157a.y(i7, i8)) {
                        c1072h.f8919u = i8;
                        z10 = true;
                    }
                    cVar = c1072h.f8918t;
                    cVar2 = this.f3681d;
                    if (cVar != cVar2) {
                        c1072h.f8918t = cVar2;
                        z9 = true;
                    }
                    if (c1072h.f8924z != null) {
                        c1072h.f8924z = null;
                        z9 = true;
                    }
                    if (!i.a(null, null)) {
                        z9 = true;
                    }
                    if (c1072h.B != null) {
                        c1072h.B = null;
                    } else {
                        z8 = z9;
                    }
                    if (!z4 || z10 || z8) {
                        C1068d v0 = c1072h.v0();
                        C0007d c0007d3 = c1072h.f8915q;
                        C c6 = c1072h.f8916r;
                        e eVar3 = c1072h.f8917s;
                        int i9 = c1072h.f8919u;
                        boolean z11 = c1072h.f8920v;
                        int i10 = c1072h.f8921w;
                        int i11 = c1072h.f8922x;
                        List list = c1072h.f8923y;
                        v0.f8877a = c0007d3;
                        v0.f8878b = c6;
                        v0.f8879c = eVar3;
                        v0.f8880d = i9;
                        v0.f8881e = z11;
                        v0.f8882f = i10;
                        v0.f8883g = i11;
                        v0.f8884h = list;
                        v0.f8888l = null;
                        v0.f8890n = null;
                    }
                    if (c1072h.p) {
                        if (z4 || (z3 && c1072h.f8913E != null)) {
                            AbstractC0898f.o(c1072h);
                        }
                        if (z4 || z10 || z8) {
                            AbstractC0898f.n(c1072h);
                            AbstractC0898f.m(c1072h);
                        }
                        if (z3) {
                            AbstractC0898f.m(c1072h);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z5 = true;
            boolean z102 = !z5;
            c1072h.f8916r = c4;
            if (!i.a(c1072h.f8923y, null)) {
            }
            i3 = c1072h.f8922x;
            i4 = this.f3685h;
            if (i3 != i4) {
            }
            i5 = c1072h.f8921w;
            i6 = this.f3684g;
            if (i5 != i6) {
            }
            z6 = c1072h.f8920v;
            z7 = this.f3683f;
            if (z6 != z7) {
            }
            eVar = c1072h.f8917s;
            eVar2 = this.f3680c;
            if (!i.a(eVar, eVar2)) {
            }
            i7 = c1072h.f8919u;
            i8 = this.f3682e;
            if (!AbstractC0157a.y(i7, i8)) {
            }
            cVar = c1072h.f8918t;
            cVar2 = this.f3681d;
            if (cVar != cVar2) {
            }
            if (c1072h.f8924z != null) {
            }
            if (!i.a(null, null)) {
            }
            if (c1072h.B != null) {
            }
            if (!z4) {
            }
            C1068d v02 = c1072h.v0();
            C0007d c0007d32 = c1072h.f8915q;
            C c62 = c1072h.f8916r;
            e eVar32 = c1072h.f8917s;
            int i92 = c1072h.f8919u;
            boolean z112 = c1072h.f8920v;
            int i102 = c1072h.f8921w;
            int i112 = c1072h.f8922x;
            List list2 = c1072h.f8923y;
            v02.f8877a = c0007d32;
            v02.f8878b = c62;
            v02.f8879c = eVar32;
            v02.f8880d = i92;
            v02.f8881e = z112;
            v02.f8882f = i102;
            v02.f8883g = i112;
            v02.f8884h = list2;
            v02.f8888l = null;
            v02.f8890n = null;
            if (c1072h.p) {
            }
        }
        z3 = true;
        C0007d c0007d4 = this.f3678a;
        a3 = i.a(c1072h.f8915q.f251a, c0007d4.f251a);
        C0007d c0007d22 = c1072h.f8915q;
        Collection collection52 = u.f2803d;
        collection = c0007d22.f252b;
        if (collection == null) {
        }
        collection2 = c0007d4.f252b;
        if (collection2 == null) {
        }
        boolean equals2 = collection.equals(collection2);
        collection3 = c1072h.f8915q.f253c;
        if (collection3 == null) {
        }
        collection4 = c0007d4.f253c;
        if (collection4 != null) {
        }
        if (!a3) {
        }
        if (z4) {
        }
        if (!a3) {
        }
        c3 = c1072h.f8916r;
        c3.getClass();
        if (c3 != c4) {
        }
        z5 = true;
        boolean z1022 = !z5;
        c1072h.f8916r = c4;
        if (!i.a(c1072h.f8923y, null)) {
        }
        i3 = c1072h.f8922x;
        i4 = this.f3685h;
        if (i3 != i4) {
        }
        i5 = c1072h.f8921w;
        i6 = this.f3684g;
        if (i5 != i6) {
        }
        z6 = c1072h.f8920v;
        z7 = this.f3683f;
        if (z6 != z7) {
        }
        eVar = c1072h.f8917s;
        eVar2 = this.f3680c;
        if (!i.a(eVar, eVar2)) {
        }
        i7 = c1072h.f8919u;
        i8 = this.f3682e;
        if (!AbstractC0157a.y(i7, i8)) {
        }
        cVar = c1072h.f8918t;
        cVar2 = this.f3681d;
        if (cVar != cVar2) {
        }
        if (c1072h.f8924z != null) {
        }
        if (!i.a(null, null)) {
        }
        if (c1072h.B != null) {
        }
        if (!z4) {
        }
        C1068d v022 = c1072h.v0();
        C0007d c0007d322 = c1072h.f8915q;
        C c622 = c1072h.f8916r;
        e eVar322 = c1072h.f8917s;
        int i922 = c1072h.f8919u;
        boolean z1122 = c1072h.f8920v;
        int i1022 = c1072h.f8921w;
        int i1122 = c1072h.f8922x;
        List list22 = c1072h.f8923y;
        v022.f8877a = c0007d322;
        v022.f8878b = c622;
        v022.f8879c = eVar322;
        v022.f8880d = i922;
        v022.f8881e = z1122;
        v022.f8882f = i1022;
        v022.f8883g = i1122;
        v022.f8884h = list22;
        v022.f8888l = null;
        v022.f8890n = null;
        if (c1072h.p) {
        }
    }
}
