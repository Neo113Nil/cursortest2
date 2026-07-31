package androidx.compose.foundation.text.modifiers;

import a0.q;
import f0.g;
import g2.i0;
import j2.d;
import q6.i;
import w1.f;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f530a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f531b;

    /* renamed from: c, reason: collision with root package name */
    public final d f532c;

    /* renamed from: d, reason: collision with root package name */
    public final int f533d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f534e;

    /* renamed from: f, reason: collision with root package name */
    public final int f535f;

    /* renamed from: g, reason: collision with root package name */
    public final int f536g;

    public TextStringSimpleElement(String str, i0 i0Var, d dVar, int i, boolean z3, int i8, int i9) {
        this.f530a = str;
        this.f531b = i0Var;
        this.f532c = dVar;
        this.f533d = i;
        this.f534e = z3;
        this.f535f = i8;
        this.f536g = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return i.a(this.f530a, textStringSimpleElement.f530a) && i.a(this.f531b, textStringSimpleElement.f531b) && i.a(this.f532c, textStringSimpleElement.f532c) && this.f533d == textStringSimpleElement.f533d && this.f534e == textStringSimpleElement.f534e && this.f535f == textStringSimpleElement.f535f && this.f536g == textStringSimpleElement.f536g;
    }

    @Override // w1.x0
    public final l f() {
        g gVar = new g();
        gVar.f2613r = this.f530a;
        gVar.f2614s = this.f531b;
        gVar.f2615t = this.f532c;
        gVar.f2616u = this.f533d;
        gVar.f2617v = this.f534e;
        gVar.f2618w = this.f535f;
        gVar.f2619x = this.f536g;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // w1.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(l lVar) {
        boolean z3;
        String str;
        String str2;
        i0 i0Var;
        boolean z7;
        int i;
        int i8;
        int i9;
        int i10;
        boolean z8;
        boolean z9;
        d dVar;
        d dVar2;
        int i11;
        int i12;
        g gVar = (g) lVar;
        gVar.getClass();
        i0 i0Var2 = gVar.f2614s;
        boolean z10 = false;
        boolean z11 = true;
        i0 i0Var3 = this.f531b;
        if (i0Var3 == i0Var2) {
            i0Var3.getClass();
        } else if (!i0Var3.f2964a.b(i0Var2.f2964a)) {
            z3 = true;
            str = gVar.f2613r;
            str2 = this.f530a;
            if (!i.a(str, str2)) {
                gVar.f2613r = str2;
                gVar.B = null;
                z10 = true;
            }
            i0Var = gVar.f2614s;
            if (i0Var != i0Var3) {
                i0Var.getClass();
            } else if (!i.a(i0Var.f2965b, i0Var3.f2965b) || !i0Var.f2964a.a(i0Var3.f2964a)) {
                z7 = false;
                boolean z12 = !z7;
                gVar.f2614s = i0Var3;
                i = gVar.f2619x;
                i8 = this.f536g;
                if (i != i8) {
                    gVar.f2619x = i8;
                    z12 = true;
                }
                i9 = gVar.f2618w;
                i10 = this.f535f;
                if (i9 != i10) {
                    gVar.f2618w = i10;
                    z12 = true;
                }
                z8 = gVar.f2617v;
                z9 = this.f534e;
                if (z8 != z9) {
                    gVar.f2617v = z9;
                    z12 = true;
                }
                dVar = gVar.f2615t;
                dVar2 = this.f532c;
                if (!i.a(dVar, dVar2)) {
                    gVar.f2615t = dVar2;
                    z12 = true;
                }
                i11 = gVar.f2616u;
                i12 = this.f533d;
                if (i11 == i12) {
                    z11 = z12;
                } else {
                    gVar.f2616u = i12;
                }
                if (!z10 || z11) {
                    f0.d r02 = gVar.r0();
                    String str3 = gVar.f2613r;
                    i0 i0Var4 = gVar.f2614s;
                    d dVar3 = gVar.f2615t;
                    int i13 = gVar.f2616u;
                    boolean z13 = gVar.f2617v;
                    int i14 = gVar.f2618w;
                    int i15 = gVar.f2619x;
                    r02.f2591a = str3;
                    r02.f2592b = i0Var4;
                    r02.f2593c = dVar3;
                    r02.f2594d = i13;
                    r02.f2595e = z13;
                    r02.f2596f = i14;
                    r02.f2597g = i15;
                    r02.f2606q = (r02.f2606q << 2) | 2;
                    r02.b();
                }
                if (gVar.f8718q) {
                    if (z10 || (z3 && gVar.A != null)) {
                        f.n(gVar);
                    }
                    if (z10 || z11) {
                        f.m(gVar);
                        f.l(gVar);
                    }
                    if (z3) {
                        f.l(gVar);
                        return;
                    }
                    return;
                }
                return;
            }
            z7 = true;
            boolean z122 = !z7;
            gVar.f2614s = i0Var3;
            i = gVar.f2619x;
            i8 = this.f536g;
            if (i != i8) {
            }
            i9 = gVar.f2618w;
            i10 = this.f535f;
            if (i9 != i10) {
            }
            z8 = gVar.f2617v;
            z9 = this.f534e;
            if (z8 != z9) {
            }
            dVar = gVar.f2615t;
            dVar2 = this.f532c;
            if (!i.a(dVar, dVar2)) {
            }
            i11 = gVar.f2616u;
            i12 = this.f533d;
            if (i11 == i12) {
            }
            if (!z10) {
            }
            f0.d r022 = gVar.r0();
            String str32 = gVar.f2613r;
            i0 i0Var42 = gVar.f2614s;
            d dVar32 = gVar.f2615t;
            int i132 = gVar.f2616u;
            boolean z132 = gVar.f2617v;
            int i142 = gVar.f2618w;
            int i152 = gVar.f2619x;
            r022.f2591a = str32;
            r022.f2592b = i0Var42;
            r022.f2593c = dVar32;
            r022.f2594d = i132;
            r022.f2595e = z132;
            r022.f2596f = i142;
            r022.f2597g = i152;
            r022.f2606q = (r022.f2606q << 2) | 2;
            r022.b();
            if (gVar.f8718q) {
            }
        }
        z3 = false;
        str = gVar.f2613r;
        str2 = this.f530a;
        if (!i.a(str, str2)) {
        }
        i0Var = gVar.f2614s;
        if (i0Var != i0Var3) {
        }
        z7 = true;
        boolean z1222 = !z7;
        gVar.f2614s = i0Var3;
        i = gVar.f2619x;
        i8 = this.f536g;
        if (i != i8) {
        }
        i9 = gVar.f2618w;
        i10 = this.f535f;
        if (i9 != i10) {
        }
        z8 = gVar.f2617v;
        z9 = this.f534e;
        if (z8 != z9) {
        }
        dVar = gVar.f2615t;
        dVar2 = this.f532c;
        if (!i.a(dVar, dVar2)) {
        }
        i11 = gVar.f2616u;
        i12 = this.f533d;
        if (i11 == i12) {
        }
        if (!z10) {
        }
        f0.d r0222 = gVar.r0();
        String str322 = gVar.f2613r;
        i0 i0Var422 = gVar.f2614s;
        d dVar322 = gVar.f2615t;
        int i1322 = gVar.f2616u;
        boolean z1322 = gVar.f2617v;
        int i1422 = gVar.f2618w;
        int i1522 = gVar.f2619x;
        r0222.f2591a = str322;
        r0222.f2592b = i0Var422;
        r0222.f2593c = dVar322;
        r0222.f2594d = i1322;
        r0222.f2595e = z1322;
        r0222.f2596f = i1422;
        r0222.f2597g = i1522;
        r0222.f2606q = (r0222.f2606q << 2) | 2;
        r0222.b();
        if (gVar.f8718q) {
        }
    }

    public final int hashCode() {
        return (((q.d(q.b(this.f533d, (this.f532c.hashCode() + q.e(this.f531b, this.f530a.hashCode() * 31, 31)) * 31, 31), 31, this.f534e) + this.f535f) * 31) + this.f536g) * 31;
    }
}
