package androidx.compose.foundation.text.modifiers;

import A.AbstractC0017m;
import A0.C0036g;
import A0.L;
import F0.d;
import S.n;
import Z.InterfaceC0324v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import r0.AbstractC1065f;
import r0.T;
import u3.l;
import z.C1349d;
import z.C1353h;
import z2.C1405I;

@Metadata
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final C0036g f5130a;

    /* renamed from: b, reason: collision with root package name */
    public final L f5131b;

    /* renamed from: c, reason: collision with root package name */
    public final d f5132c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f5133d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5134e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5135f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5136g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5137h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0324v f5138i;

    public TextAnnotatedStringElement(C0036g c0036g, L l4, d dVar, Function1 function1, int i2, boolean z4, int i4, int i5, InterfaceC0324v interfaceC0324v) {
        this.f5130a = c0036g;
        this.f5131b = l4;
        this.f5132c = dVar;
        this.f5133d = function1;
        this.f5134e = i2;
        this.f5135f = z4;
        this.f5136g = i4;
        this.f5137h = i5;
        this.f5138i = interfaceC0324v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.a(this.f5138i, textAnnotatedStringElement.f5138i) && this.f5130a.equals(textAnnotatedStringElement.f5130a) && Intrinsics.a(this.f5131b, textAnnotatedStringElement.f5131b) && Intrinsics.a(null, null) && Intrinsics.a(this.f5132c, textAnnotatedStringElement.f5132c) && this.f5133d == textAnnotatedStringElement.f5133d && l.b0(this.f5134e, textAnnotatedStringElement.f5134e) && this.f5135f == textAnnotatedStringElement.f5135f && this.f5136g == textAnnotatedStringElement.f5136g && this.f5137h == textAnnotatedStringElement.f5137h && Intrinsics.a(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.f5132c.hashCode() + ((this.f5131b.hashCode() + (this.f5130a.hashCode() * 31)) * 31)) * 31;
        Function1 function1 = this.f5133d;
        int d4 = (((AbstractC0017m.d(AbstractC0784j.c(this.f5134e, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f5135f) + this.f5136g) * 31) + this.f5137h) * 923521;
        InterfaceC0324v interfaceC0324v = this.f5138i;
        return (d4 + (interfaceC0324v != null ? interfaceC0324v.hashCode() : 0)) * 31;
    }

    @Override // r0.T
    public final n l() {
        C0036g c0036g = this.f5130a;
        C1353h c1353h = new C1353h();
        c1353h.f11754t = c0036g;
        c1353h.f11755u = this.f5131b;
        c1353h.f11756v = this.f5132c;
        c1353h.f11757w = this.f5133d;
        c1353h.f11758x = this.f5134e;
        c1353h.f11759y = this.f5135f;
        c1353h.f11760z = this.f5136g;
        c1353h.f11746A = this.f5137h;
        c1353h.B = null;
        c1353h.f11747C = null;
        c1353h.f11748D = this.f5138i;
        c1353h.f11749E = null;
        return c1353h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1.f303a.b(r0.f303a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    @Override // r0.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(n nVar) {
        boolean z4;
        boolean a4;
        Object obj;
        Object obj2;
        boolean z5;
        int i2;
        int i4;
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        d dVar;
        d dVar2;
        int i7;
        int i8;
        Function1 function1;
        Function1 function12;
        C1353h c1353h = (C1353h) nVar;
        InterfaceC0324v interfaceC0324v = c1353h.f11748D;
        InterfaceC0324v interfaceC0324v2 = this.f5138i;
        boolean a5 = Intrinsics.a(interfaceC0324v2, interfaceC0324v);
        c1353h.f11748D = interfaceC0324v2;
        L l4 = this.f5131b;
        boolean z8 = false;
        boolean z9 = true;
        if (a5) {
            L l5 = c1353h.f11755u;
            if (l4 == l5) {
                l4.getClass();
            }
            z4 = false;
            C0036g c0036g = this.f5130a;
            a4 = Intrinsics.a(c1353h.f11754t.f328a, c0036g.f328a);
            boolean a6 = Intrinsics.a(c1353h.f11754t.a(), c0036g.a());
            obj = c1353h.f11754t.f330c;
            if (obj == null) {
                obj = C1405I.f11931d;
            }
            obj2 = c0036g.f330c;
            if (obj2 == null) {
                obj2 = C1405I.f11931d;
            }
            z5 = (!a4 && a6 && Intrinsics.a(obj, obj2) && Intrinsics.a(c1353h.f11754t.f331d, c0036g.f331d)) ? false : true;
            if (z5) {
                c1353h.f11754t = c0036g;
            }
            if (!a4) {
                c1353h.f11753I = null;
            }
            boolean z10 = !c1353h.f11755u.c(l4);
            c1353h.f11755u = l4;
            if (!Intrinsics.a(c1353h.B, null)) {
                c1353h.B = null;
                z10 = true;
            }
            i2 = c1353h.f11746A;
            i4 = this.f5137h;
            if (i2 != i4) {
                c1353h.f11746A = i4;
                z10 = true;
            }
            i5 = c1353h.f11760z;
            i6 = this.f5136g;
            if (i5 != i6) {
                c1353h.f11760z = i6;
                z10 = true;
            }
            z6 = c1353h.f11759y;
            z7 = this.f5135f;
            if (z6 != z7) {
                c1353h.f11759y = z7;
                z10 = true;
            }
            dVar = c1353h.f11756v;
            dVar2 = this.f5132c;
            if (!Intrinsics.a(dVar, dVar2)) {
                c1353h.f11756v = dVar2;
                z10 = true;
            }
            i7 = c1353h.f11758x;
            i8 = this.f5134e;
            if (!l.b0(i7, i8)) {
                c1353h.f11758x = i8;
                z10 = true;
            }
            function1 = c1353h.f11757w;
            function12 = this.f5133d;
            if (function1 != function12) {
                c1353h.f11757w = function12;
                z8 = true;
            }
            if (c1353h.f11747C != null) {
                c1353h.f11747C = null;
                z8 = true;
            }
            if (!Intrinsics.a(null, null)) {
                z8 = true;
            }
            if (c1353h.f11749E == null) {
                c1353h.f11749E = null;
            } else {
                z9 = z8;
            }
            if (!z5 || z10 || z9) {
                C1349d B02 = c1353h.B0();
                C0036g c0036g2 = c1353h.f11754t;
                L l6 = c1353h.f11755u;
                d dVar3 = c1353h.f11756v;
                int i9 = c1353h.f11758x;
                boolean z11 = c1353h.f11759y;
                int i10 = c1353h.f11760z;
                int i11 = c1353h.f11746A;
                List list = c1353h.B;
                B02.f11706a = c0036g2;
                B02.f11707b = l6;
                B02.f11708c = dVar3;
                B02.f11709d = i9;
                B02.f11710e = z11;
                B02.f11711f = i10;
                B02.f11712g = i11;
                B02.f11713h = list;
                B02.f11717l = null;
                B02.f11719n = null;
                B02.f11721p = -1;
                B02.f11720o = -1;
            }
            if (c1353h.f3990s) {
                return;
            }
            if (z5 || (z4 && c1353h.f11752H != null)) {
                AbstractC1065f.p(c1353h);
            }
            if (z5 || z10 || z9) {
                AbstractC1065f.o(c1353h);
                AbstractC1065f.n(c1353h);
            }
            if (z4) {
                AbstractC1065f.n(c1353h);
                return;
            }
            return;
        }
        z4 = true;
        C0036g c0036g3 = this.f5130a;
        a4 = Intrinsics.a(c1353h.f11754t.f328a, c0036g3.f328a);
        boolean a62 = Intrinsics.a(c1353h.f11754t.a(), c0036g3.a());
        obj = c1353h.f11754t.f330c;
        if (obj == null) {
        }
        obj2 = c0036g3.f330c;
        if (obj2 == null) {
        }
        if (!a4) {
        }
        if (z5) {
        }
        if (!a4) {
        }
        boolean z102 = !c1353h.f11755u.c(l4);
        c1353h.f11755u = l4;
        if (!Intrinsics.a(c1353h.B, null)) {
        }
        i2 = c1353h.f11746A;
        i4 = this.f5137h;
        if (i2 != i4) {
        }
        i5 = c1353h.f11760z;
        i6 = this.f5136g;
        if (i5 != i6) {
        }
        z6 = c1353h.f11759y;
        z7 = this.f5135f;
        if (z6 != z7) {
        }
        dVar = c1353h.f11756v;
        dVar2 = this.f5132c;
        if (!Intrinsics.a(dVar, dVar2)) {
        }
        i7 = c1353h.f11758x;
        i8 = this.f5134e;
        if (!l.b0(i7, i8)) {
        }
        function1 = c1353h.f11757w;
        function12 = this.f5133d;
        if (function1 != function12) {
        }
        if (c1353h.f11747C != null) {
        }
        if (!Intrinsics.a(null, null)) {
        }
        if (c1353h.f11749E == null) {
        }
        if (!z5) {
        }
        C1349d B022 = c1353h.B0();
        C0036g c0036g22 = c1353h.f11754t;
        L l62 = c1353h.f11755u;
        d dVar32 = c1353h.f11756v;
        int i92 = c1353h.f11758x;
        boolean z112 = c1353h.f11759y;
        int i102 = c1353h.f11760z;
        int i112 = c1353h.f11746A;
        List list2 = c1353h.B;
        B022.f11706a = c0036g22;
        B022.f11707b = l62;
        B022.f11708c = dVar32;
        B022.f11709d = i92;
        B022.f11710e = z112;
        B022.f11711f = i102;
        B022.f11712g = i112;
        B022.f11713h = list2;
        B022.f11717l = null;
        B022.f11719n = null;
        B022.f11721p = -1;
        B022.f11720o = -1;
        if (c1353h.f3990s) {
        }
    }
}
