package androidx.compose.foundation.text.modifiers;

import A2.g;
import B0.C;
import F0.e;
import H2.AbstractC0080b;
import I2.l;
import U.k;
import Z1.i;
import a.AbstractC0157a;
import t0.AbstractC0898f;
import t0.T;
import z.C1069e;
import z.C1075k;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final String f3687a;

    /* renamed from: b, reason: collision with root package name */
    public final C f3688b;

    /* renamed from: c, reason: collision with root package name */
    public final e f3689c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3690d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3691e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3692f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3693g;

    /* renamed from: h, reason: collision with root package name */
    public final g f3694h;

    public TextStringSimpleElement(String str, C c3, e eVar, int i3, boolean z3, int i4, int i5, g gVar) {
        this.f3687a = str;
        this.f3688b = c3;
        this.f3689c = eVar;
        this.f3690d = i3;
        this.f3691e = z3;
        this.f3692f = i4;
        this.f3693g = i5;
        this.f3694h = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return i.a(this.f3694h, textStringSimpleElement.f3694h) && i.a(this.f3687a, textStringSimpleElement.f3687a) && i.a(this.f3688b, textStringSimpleElement.f3688b) && i.a(this.f3689c, textStringSimpleElement.f3689c) && AbstractC0157a.y(this.f3690d, textStringSimpleElement.f3690d) && this.f3691e == textStringSimpleElement.f3691e && this.f3692f == textStringSimpleElement.f3692f && this.f3693g == textStringSimpleElement.f3693g;
    }

    @Override // t0.T
    public final k h() {
        C1075k c1075k = new C1075k();
        c1075k.f8932q = this.f3687a;
        c1075k.f8933r = this.f3688b;
        c1075k.f8934s = this.f3689c;
        c1075k.f8935t = this.f3690d;
        c1075k.f8936u = this.f3691e;
        c1075k.f8937v = this.f3692f;
        c1075k.f8938w = this.f3693g;
        c1075k.f8939x = this.f3694h;
        return c1075k;
    }

    public final int hashCode() {
        int f3 = (((AbstractC0080b.f(AbstractC0080b.b(this.f3690d, (this.f3689c.hashCode() + ((this.f3688b.hashCode() + (this.f3687a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f3691e) + this.f3692f) * 31) + this.f3693g) * 31;
        g gVar = this.f3694h;
        return f3 + (gVar != null ? gVar.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3.f235a.b(r0.f235a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0034  */
    @Override // t0.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(k kVar) {
        boolean z3;
        String str;
        String str2;
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
        C1075k c1075k = (C1075k) kVar;
        g gVar = c1075k.f8939x;
        g gVar2 = this.f3694h;
        boolean a3 = i.a(gVar2, gVar);
        c1075k.f8939x = gVar2;
        boolean z8 = true;
        C c4 = this.f3688b;
        if (a3) {
            C c5 = c1075k.f8933r;
            if (c4 == c5) {
                c4.getClass();
            }
            z3 = false;
            str = c1075k.f8932q;
            str2 = this.f3687a;
            if (i.a(str, str2)) {
                c1075k.f8932q = str2;
                c1075k.B = null;
                z4 = true;
            } else {
                z4 = false;
            }
            c3 = c1075k.f8933r;
            c3.getClass();
            if (c3 != c4) {
                if (!i.a(c3.f236b, c4.f236b) || !c3.f235a.a(c4.f235a)) {
                    z5 = false;
                    boolean z9 = !z5;
                    c1075k.f8933r = c4;
                    i3 = c1075k.f8938w;
                    i4 = this.f3693g;
                    if (i3 != i4) {
                        c1075k.f8938w = i4;
                        z9 = true;
                    }
                    i5 = c1075k.f8937v;
                    i6 = this.f3692f;
                    if (i5 != i6) {
                        c1075k.f8937v = i6;
                        z9 = true;
                    }
                    z6 = c1075k.f8936u;
                    z7 = this.f3691e;
                    if (z6 != z7) {
                        c1075k.f8936u = z7;
                        z9 = true;
                    }
                    eVar = c1075k.f8934s;
                    eVar2 = this.f3689c;
                    if (!i.a(eVar, eVar2)) {
                        c1075k.f8934s = eVar2;
                        z9 = true;
                    }
                    i7 = c1075k.f8935t;
                    i8 = this.f3690d;
                    if (AbstractC0157a.y(i7, i8)) {
                        z8 = z9;
                    } else {
                        c1075k.f8935t = i8;
                    }
                    if (!z4 || z8) {
                        C1069e v0 = c1075k.v0();
                        String str3 = c1075k.f8932q;
                        C c6 = c1075k.f8933r;
                        e eVar3 = c1075k.f8934s;
                        int i9 = c1075k.f8935t;
                        boolean z10 = c1075k.f8936u;
                        int i10 = c1075k.f8937v;
                        int i11 = c1075k.f8938w;
                        v0.f8891a = str3;
                        v0.f8892b = c6;
                        v0.f8893c = eVar3;
                        v0.f8894d = i9;
                        v0.f8895e = z10;
                        v0.f8896f = i10;
                        v0.f8897g = i11;
                        v0.f8900j = null;
                        v0.f8904n = null;
                        v0.f8905o = null;
                        v0.p = l.s(0, 0, 0, 0);
                        v0.f8902l = l.e(0, 0);
                        v0.f8901k = false;
                    }
                    if (c1075k.p) {
                        if (z4 || (z3 && c1075k.f8931A != null)) {
                            AbstractC0898f.o(c1075k);
                        }
                        if (z4 || z8) {
                            AbstractC0898f.n(c1075k);
                            AbstractC0898f.m(c1075k);
                        }
                        if (z3) {
                            AbstractC0898f.m(c1075k);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z5 = true;
            boolean z92 = !z5;
            c1075k.f8933r = c4;
            i3 = c1075k.f8938w;
            i4 = this.f3693g;
            if (i3 != i4) {
            }
            i5 = c1075k.f8937v;
            i6 = this.f3692f;
            if (i5 != i6) {
            }
            z6 = c1075k.f8936u;
            z7 = this.f3691e;
            if (z6 != z7) {
            }
            eVar = c1075k.f8934s;
            eVar2 = this.f3689c;
            if (!i.a(eVar, eVar2)) {
            }
            i7 = c1075k.f8935t;
            i8 = this.f3690d;
            if (AbstractC0157a.y(i7, i8)) {
            }
            if (!z4) {
            }
            C1069e v02 = c1075k.v0();
            String str32 = c1075k.f8932q;
            C c62 = c1075k.f8933r;
            e eVar32 = c1075k.f8934s;
            int i92 = c1075k.f8935t;
            boolean z102 = c1075k.f8936u;
            int i102 = c1075k.f8937v;
            int i112 = c1075k.f8938w;
            v02.f8891a = str32;
            v02.f8892b = c62;
            v02.f8893c = eVar32;
            v02.f8894d = i92;
            v02.f8895e = z102;
            v02.f8896f = i102;
            v02.f8897g = i112;
            v02.f8900j = null;
            v02.f8904n = null;
            v02.f8905o = null;
            v02.p = l.s(0, 0, 0, 0);
            v02.f8902l = l.e(0, 0);
            v02.f8901k = false;
            if (c1075k.p) {
            }
        }
        z3 = true;
        str = c1075k.f8932q;
        str2 = this.f3687a;
        if (i.a(str, str2)) {
        }
        c3 = c1075k.f8933r;
        c3.getClass();
        if (c3 != c4) {
        }
        z5 = true;
        boolean z922 = !z5;
        c1075k.f8933r = c4;
        i3 = c1075k.f8938w;
        i4 = this.f3693g;
        if (i3 != i4) {
        }
        i5 = c1075k.f8937v;
        i6 = this.f3692f;
        if (i5 != i6) {
        }
        z6 = c1075k.f8936u;
        z7 = this.f3691e;
        if (z6 != z7) {
        }
        eVar = c1075k.f8934s;
        eVar2 = this.f3689c;
        if (!i.a(eVar, eVar2)) {
        }
        i7 = c1075k.f8935t;
        i8 = this.f3690d;
        if (AbstractC0157a.y(i7, i8)) {
        }
        if (!z4) {
        }
        C1069e v022 = c1075k.v0();
        String str322 = c1075k.f8932q;
        C c622 = c1075k.f8933r;
        e eVar322 = c1075k.f8934s;
        int i922 = c1075k.f8935t;
        boolean z1022 = c1075k.f8936u;
        int i1022 = c1075k.f8937v;
        int i1122 = c1075k.f8938w;
        v022.f8891a = str322;
        v022.f8892b = c622;
        v022.f8893c = eVar322;
        v022.f8894d = i922;
        v022.f8895e = z1022;
        v022.f8896f = i1022;
        v022.f8897g = i1122;
        v022.f8900j = null;
        v022.f8904n = null;
        v022.f8905o = null;
        v022.p = l.s(0, 0, 0, 0);
        v022.f8902l = l.e(0, 0);
        v022.f8901k = false;
        if (c1075k.p) {
        }
    }
}
