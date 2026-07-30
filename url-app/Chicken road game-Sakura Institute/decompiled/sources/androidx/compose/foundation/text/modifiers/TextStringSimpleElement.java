package androidx.compose.foundation.text.modifiers;

import a0.m;
import a2.k0;
import f2.d;
import j1.c;
import l.h;
import r1.f;
import r1.s0;
import r4.a;
import r6.k;
import s0.n;
import z.g;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f687a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f688b;

    /* renamed from: c, reason: collision with root package name */
    public final d f689c;

    /* renamed from: d, reason: collision with root package name */
    public final int f690d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f691e;

    /* renamed from: f, reason: collision with root package name */
    public final int f692f;

    /* renamed from: g, reason: collision with root package name */
    public final int f693g;

    public TextStringSimpleElement(String str, k0 k0Var, d dVar, int i7, boolean z8, int i8, int i9) {
        this.f687a = str;
        this.f688b = k0Var;
        this.f689c = dVar;
        this.f690d = i7;
        this.f691e = z8;
        this.f692f = i8;
        this.f693g = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return k.a(this.f687a, textStringSimpleElement.f687a) && k.a(this.f688b, textStringSimpleElement.f688b) && k.a(this.f689c, textStringSimpleElement.f689c) && this.f690d == textStringSimpleElement.f690d && this.f691e == textStringSimpleElement.f691e && this.f692f == textStringSimpleElement.f692f && this.f693g == textStringSimpleElement.f693g;
    }

    public final int hashCode() {
        return (((m.e(h.c(this.f690d, (this.f689c.hashCode() + ((this.f688b.hashCode() + (this.f687a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f691e) + this.f692f) * 31) + this.f693g) * 31;
    }

    @Override // r1.s0
    public final n l() {
        g gVar = new g();
        gVar.f9974s = this.f687a;
        gVar.f9975t = this.f688b;
        gVar.f9976u = this.f689c;
        gVar.f9977v = this.f690d;
        gVar.f9978w = this.f691e;
        gVar.f9979x = this.f692f;
        gVar.f9980y = this.f693g;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // r1.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(n nVar) {
        boolean z8;
        String str;
        String str2;
        boolean z9;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        d dVar;
        d dVar2;
        int i11;
        int i12;
        g gVar = (g) nVar;
        gVar.getClass();
        k0 k0Var = gVar.f9975t;
        boolean z12 = true;
        k0 k0Var2 = this.f688b;
        if (k0Var2 == k0Var) {
            k0Var2.getClass();
        } else if (!k0Var2.f412a.b(k0Var.f412a)) {
            z8 = true;
            str = gVar.f9974s;
            str2 = this.f687a;
            if (k.a(str, str2)) {
                gVar.f9974s = str2;
                gVar.C = null;
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z13 = !gVar.f9975t.c(k0Var2);
            gVar.f9975t = k0Var2;
            i7 = gVar.f9980y;
            i8 = this.f693g;
            if (i7 != i8) {
                gVar.f9980y = i8;
                z13 = true;
            }
            i9 = gVar.f9979x;
            i10 = this.f692f;
            if (i9 != i10) {
                gVar.f9979x = i10;
                z13 = true;
            }
            z10 = gVar.f9978w;
            z11 = this.f691e;
            if (z10 != z11) {
                gVar.f9978w = z11;
                z13 = true;
            }
            dVar = gVar.f9976u;
            dVar2 = this.f689c;
            if (!k.a(dVar, dVar2)) {
                gVar.f9976u = dVar2;
                z13 = true;
            }
            i11 = gVar.f9977v;
            i12 = this.f690d;
            if (i11 != i12) {
                z12 = z13;
            } else {
                gVar.f9977v = i12;
            }
            if (!z9 || z12) {
                z.d A0 = gVar.A0();
                String str3 = gVar.f9974s;
                k0 k0Var3 = gVar.f9975t;
                d dVar3 = gVar.f9976u;
                int i13 = gVar.f9977v;
                boolean z14 = gVar.f9978w;
                int i14 = gVar.f9979x;
                int i15 = gVar.f9980y;
                A0.f9950a = str3;
                A0.f9951b = k0Var3;
                A0.f9952c = dVar3;
                A0.f9953d = i13;
                A0.f9954e = z14;
                A0.f9955f = i14;
                A0.f9956g = i15;
                A0.f9959j = null;
                A0.f9963n = null;
                A0.f9964o = null;
                A0.f9966q = -1;
                A0.f9967r = -1;
                A0.f9965p = a.z(0, 0, 0, 0);
                A0.f9961l = c.G(0, 0);
                A0.f9960k = false;
            }
            if (gVar.f8116r) {
                return;
            }
            if (z9 || (z8 && gVar.B != null)) {
                f.o(gVar);
            }
            if (z9 || z12) {
                f.n(gVar);
                f.m(gVar);
            }
            if (z8) {
                f.m(gVar);
                return;
            }
            return;
        }
        z8 = false;
        str = gVar.f9974s;
        str2 = this.f687a;
        if (k.a(str, str2)) {
        }
        boolean z132 = !gVar.f9975t.c(k0Var2);
        gVar.f9975t = k0Var2;
        i7 = gVar.f9980y;
        i8 = this.f693g;
        if (i7 != i8) {
        }
        i9 = gVar.f9979x;
        i10 = this.f692f;
        if (i9 != i10) {
        }
        z10 = gVar.f9978w;
        z11 = this.f691e;
        if (z10 != z11) {
        }
        dVar = gVar.f9976u;
        dVar2 = this.f689c;
        if (!k.a(dVar, dVar2)) {
        }
        i11 = gVar.f9977v;
        i12 = this.f690d;
        if (i11 != i12) {
        }
        if (!z9) {
        }
        z.d A02 = gVar.A0();
        String str32 = gVar.f9974s;
        k0 k0Var32 = gVar.f9975t;
        d dVar32 = gVar.f9976u;
        int i132 = gVar.f9977v;
        boolean z142 = gVar.f9978w;
        int i142 = gVar.f9979x;
        int i152 = gVar.f9980y;
        A02.f9950a = str32;
        A02.f9951b = k0Var32;
        A02.f9952c = dVar32;
        A02.f9953d = i132;
        A02.f9954e = z142;
        A02.f9955f = i142;
        A02.f9956g = i152;
        A02.f9959j = null;
        A02.f9963n = null;
        A02.f9964o = null;
        A02.f9966q = -1;
        A02.f9967r = -1;
        A02.f9965p = a.z(0, 0, 0, 0);
        A02.f9961l = c.G(0, 0);
        A02.f9960k = false;
        if (gVar.f8116r) {
        }
    }
}
