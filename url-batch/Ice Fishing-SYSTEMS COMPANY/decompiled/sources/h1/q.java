package h1;

import B2.N;
import android.graphics.Color;
import android.view.animation.Interpolator;
import d1.C4455a;
import d1.C4456b;
import f1.C4493d;
import g1.C4524d;
import i1.C4575b;
import j1.AbstractC4591d;
import java.util.ArrayList;
import java.util.Collections;
import k1.C4628a;
import m5.C4782a;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.s f38190a = S0.s.i("nm", com.anythink.expressad.foundation.g.g.a.b.aW, "refId", "ty", "parent", "sw", com.anythink.expressad.foundation.d.e.f18832u, com.anythink.expressad.f.a.b.bI, "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", com.anythink.expressad.foundation.g.g.a.b.bb, com.anythink.core.common.w.f17070a, "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    public static final S0.s f38191b = S0.s.i("d", "a");

    /* renamed from: c, reason: collision with root package name */
    public static final S0.s f38192c = S0.s.i("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v64, types: [int[]] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v66 */
    public static C4493d a(C4575b c4575b, X0.i iVar) {
        boolean z8;
        boolean z9;
        int i;
        int i4;
        boolean z10;
        C4456b c4456b;
        C4456b c4456b2;
        C4456b c4456b3;
        ?? r52;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c4575b.j();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        boolean z11 = false;
        boolean z12 = true;
        long j9 = 0;
        long j10 = -1;
        float f6 = 1.0f;
        String str = "UNSET";
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        boolean z13 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z14 = false;
        int i13 = 1;
        int i14 = 1;
        String str2 = null;
        d1.d dVar = null;
        C4524d c4524d = null;
        N n9 = null;
        C4455a c4455a = null;
        S0.s sVar = null;
        C4456b c4456b4 = null;
        float f13 = 0.0f;
        String str3 = null;
        while (c4575b.D()) {
            switch (c4575b.K(f38190a)) {
                case 0:
                    z9 = z12;
                    str = c4575b.H();
                    z12 = z9;
                    break;
                case 1:
                    z9 = z12;
                    j9 = c4575b.G();
                    z12 = z9;
                    break;
                case 2:
                    z9 = z12;
                    str2 = c4575b.H();
                    z12 = z9;
                    break;
                case 3:
                    z9 = z12;
                    z8 = z11;
                    int G7 = c4575b.G();
                    i10 = 7;
                    if (G7 < 6) {
                        i10 = AbstractC5088e.e(7)[G7];
                    }
                    z11 = z8;
                    z12 = z9;
                    break;
                case 4:
                    z9 = z12;
                    j10 = c4575b.G();
                    z12 = z9;
                    break;
                case 5:
                    z9 = z12;
                    i9 = (int) (j1.j.c() * c4575b.G());
                    z12 = z9;
                    break;
                case 6:
                    z9 = z12;
                    i11 = (int) (j1.j.c() * c4575b.G());
                    z12 = z9;
                    break;
                case 7:
                    z9 = z12;
                    i12 = Color.parseColor(c4575b.H());
                    z12 = z9;
                    break;
                case 8:
                    z9 = z12;
                    dVar = AbstractC4562c.c(c4575b, iVar);
                    z12 = z9;
                    break;
                case 9:
                    z8 = z11;
                    int G8 = c4575b.G();
                    if (G8 < AbstractC5088e.e(6).length) {
                        i13 = AbstractC5088e.e(6)[G8];
                        int d2 = AbstractC5088e.d(i13);
                        if (d2 == 3) {
                            iVar.a("Unsupported matte type: Luma");
                        } else if (d2 == 4) {
                            iVar.a("Unsupported matte type: Luma Inverted");
                        }
                        z9 = true;
                        iVar.f3683p++;
                        z11 = z8;
                        z12 = z9;
                        break;
                    } else {
                        iVar.a("Unsupported matte type: " + G8);
                        z11 = z8;
                        z12 = true;
                        break;
                    }
                case 10:
                    int i15 = 2;
                    c4575b.b();
                    while (c4575b.D()) {
                        c4575b.j();
                        C4455a c4455a2 = null;
                        C4455a c4455a3 = null;
                        boolean z15 = false;
                        int i16 = 0;
                        while (c4575b.D()) {
                            String c02 = c4575b.c0();
                            c02.getClass();
                            switch (c02.hashCode()) {
                                case 111:
                                    if (c02.equals(C4782a.PUSH_MINIFIED_BUTTONS_LIST)) {
                                        i = 0;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3588:
                                    if (c02.equals("pt")) {
                                        i = 1;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 104433:
                                    if (c02.equals("inv")) {
                                        i = i15;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3357091:
                                    if (c02.equals("mode")) {
                                        i = 3;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                default:
                                    i = -1;
                                    break;
                            }
                            switch (i) {
                                case 0:
                                    c4455a3 = Z5.c.j(c4575b, iVar);
                                    break;
                                case 1:
                                    c4455a2 = new C4455a(p.a(c4575b, iVar, j1.j.c(), x.f38202n, false), 5);
                                    break;
                                case 2:
                                    z15 = c4575b.E();
                                    break;
                                case 3:
                                    String H6 = c4575b.H();
                                    H6.getClass();
                                    switch (H6.hashCode()) {
                                        case 97:
                                            if (H6.equals("a")) {
                                                i4 = 0;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case 105:
                                            if (H6.equals("i")) {
                                                i4 = 1;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case 110:
                                            if (H6.equals("n")) {
                                                i4 = i15;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case 115:
                                            if (H6.equals(com.anythink.core.common.s.f16407a)) {
                                                i4 = 3;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        default:
                                            i4 = -1;
                                            break;
                                    }
                                    switch (i4) {
                                        case 0:
                                            i16 = 1;
                                            break;
                                        case 1:
                                            iVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            i16 = 3;
                                            break;
                                        case 2:
                                            i16 = 4;
                                            break;
                                        case 3:
                                            i16 = i15;
                                            break;
                                        default:
                                            AbstractC4591d.b("Unknown mask mode " + c02 + ". Defaulting to Add.");
                                            i16 = 1;
                                            break;
                                    }
                                    break;
                                default:
                                    c4575b.W();
                                    break;
                            }
                            i15 = 2;
                        }
                        c4575b.B();
                        arrayList.add(new e1.f(i16, c4455a2, c4455a3, z15));
                        i15 = 2;
                    }
                    z8 = false;
                    iVar.f3683p += arrayList.size();
                    c4575b.z();
                    z11 = z8;
                    z12 = true;
                    break;
                case 11:
                    c4575b.b();
                    while (c4575b.D()) {
                        e1.b a9 = g.a(c4575b, iVar);
                        if (a9 != null) {
                            arrayList2.add(a9);
                        }
                    }
                    c4575b.z();
                    z8 = false;
                    z11 = z8;
                    z12 = true;
                    break;
                case 12:
                    boolean z16 = z11;
                    c4575b.j();
                    while (c4575b.D()) {
                        int K8 = c4575b.K(f38191b);
                        if (K8 == 0) {
                            c4455a = new C4455a(p.a(c4575b, iVar, j1.j.c(), h.f38167n, z16 ? 1 : 0), 6);
                            z12 = true;
                            z16 = false;
                        } else if (K8 != z12) {
                            c4575b.V();
                            c4575b.W();
                        } else {
                            c4575b.b();
                            if (c4575b.D()) {
                                S0.s sVar2 = AbstractC4561b.f38151a;
                                c4575b.j();
                                N n10 = null;
                                K2.n nVar = null;
                                while (c4575b.D()) {
                                    int K9 = c4575b.K(AbstractC4561b.f38151a);
                                    if (K9 == 0) {
                                        c4575b.j();
                                        C4455a c4455a4 = null;
                                        C4455a c4455a5 = null;
                                        C4455a c4455a6 = null;
                                        int i17 = z16 ? 1 : 0;
                                        while (c4575b.D()) {
                                            int K10 = c4575b.K(AbstractC4561b.f38152b);
                                            if (K10 == 0) {
                                                c4455a4 = Z5.c.j(c4575b, iVar);
                                            } else if (K10 == z12) {
                                                c4455a5 = Z5.c.j(c4575b, iVar);
                                            } else if (K10 == 2) {
                                                c4455a6 = Z5.c.j(c4575b, iVar);
                                            } else if (K10 != 3) {
                                                c4575b.V();
                                                c4575b.W();
                                            } else {
                                                int G9 = c4575b.G();
                                                if (G9 != 1 && G9 != 2) {
                                                    iVar.a("Unsupported text range units: " + G9);
                                                } else if (G9 == 1) {
                                                    i17 = 1;
                                                }
                                                i17 = 2;
                                            }
                                            z12 = true;
                                        }
                                        c4575b.B();
                                        if (c4455a4 == null && c4455a5 != null) {
                                            c4455a4 = new C4455a(Collections.singletonList(new C4628a(Integer.valueOf(z16 ? 1 : 0))), 2);
                                        }
                                        K2.n nVar2 = new K2.n();
                                        nVar2.f1605b = c4455a4;
                                        nVar2.f1606c = c4455a5;
                                        nVar2.f1607d = c4455a6;
                                        nVar2.f1604a = i17;
                                        nVar = nVar2;
                                        z12 = true;
                                    } else if (K9 != z12) {
                                        c4575b.V();
                                        c4575b.W();
                                    } else {
                                        c4575b.j();
                                        C4455a c4455a7 = null;
                                        C4455a c4455a8 = null;
                                        C4456b c4456b5 = null;
                                        C4456b c4456b6 = null;
                                        C4455a c4455a9 = null;
                                        while (c4575b.D()) {
                                            int K11 = c4575b.K(AbstractC4561b.f38153c);
                                            if (K11 == 0) {
                                                c4455a7 = Z5.c.g(c4575b, iVar);
                                            } else if (K11 == z12) {
                                                c4455a8 = Z5.c.g(c4575b, iVar);
                                            } else if (K11 == 2) {
                                                c4456b5 = Z5.c.h(c4575b, iVar, z12);
                                            } else if (K11 == 3) {
                                                c4456b6 = Z5.c.h(c4575b, iVar, z12);
                                            } else if (K11 != 4) {
                                                c4575b.V();
                                                c4575b.W();
                                            } else {
                                                c4455a9 = Z5.c.j(c4575b, iVar);
                                            }
                                        }
                                        c4575b.B();
                                        n10 = new N(c4455a7, c4455a8, c4456b5, c4456b6, c4455a9, 5);
                                    }
                                }
                                c4575b.B();
                                sVar = new S0.s(11, n10, nVar);
                            }
                            while (c4575b.D()) {
                                c4575b.W();
                            }
                            c4575b.z();
                            z12 = true;
                        }
                    }
                    c4575b.B();
                    z11 = false;
                    z12 = true;
                    break;
                case 13:
                    c4575b.b();
                    ArrayList arrayList3 = new ArrayList();
                    while (c4575b.D()) {
                        c4575b.j();
                        while (c4575b.D()) {
                            int K12 = c4575b.K(f38192c);
                            if (K12 == 0) {
                                int G10 = c4575b.G();
                                if (G10 == 29) {
                                    S0.s sVar3 = AbstractC4563d.f38156a;
                                    c4524d = null;
                                    while (c4575b.D()) {
                                        if (c4575b.K(AbstractC4563d.f38156a) != 0) {
                                            c4575b.V();
                                            c4575b.W();
                                        } else {
                                            c4575b.b();
                                            while (c4575b.D()) {
                                                c4575b.j();
                                                boolean z17 = z11;
                                                C4524d c4524d2 = null;
                                                while (c4575b.D()) {
                                                    int K13 = c4575b.K(AbstractC4563d.f38157b);
                                                    if (K13 == 0) {
                                                        z17 = c4575b.G() == 0 ? z12 : z11;
                                                    } else if (K13 != z12) {
                                                        c4575b.V();
                                                        c4575b.W();
                                                    } else if (z17) {
                                                        c4524d2 = new C4524d(17, Z5.c.h(c4575b, iVar, z12));
                                                    } else {
                                                        c4575b.W();
                                                    }
                                                }
                                                c4575b.B();
                                                if (c4524d2 != null) {
                                                    c4524d = c4524d2;
                                                }
                                            }
                                            c4575b.z();
                                        }
                                    }
                                } else if (G10 == 25) {
                                    i iVar2 = new i();
                                    while (c4575b.D()) {
                                        if (c4575b.K(i.f38169f) != 0) {
                                            c4575b.V();
                                            c4575b.W();
                                        } else {
                                            c4575b.b();
                                            while (c4575b.D()) {
                                                c4575b.j();
                                                String str4 = "";
                                                while (c4575b.D()) {
                                                    int K14 = c4575b.K(i.f38170g);
                                                    if (K14 == 0) {
                                                        str4 = c4575b.H();
                                                    } else if (K14 == z12) {
                                                        str4.getClass();
                                                        switch (str4.hashCode()) {
                                                            case 353103893:
                                                                if (str4.equals("Distance")) {
                                                                    r52 = z11;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            case 397447147:
                                                                if (str4.equals("Opacity")) {
                                                                    r52 = z12;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            case 1041377119:
                                                                if (str4.equals("Direction")) {
                                                                    r52 = 2;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            case 1379387491:
                                                                if (str4.equals("Shadow Color")) {
                                                                    r52 = 3;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            case 1383710113:
                                                                if (str4.equals("Softness")) {
                                                                    r52 = 4;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            default:
                                                                r52 = -1;
                                                                break;
                                                        }
                                                        switch (r52) {
                                                            case 0:
                                                                iVar2.f38174d = Z5.c.h(c4575b, iVar, z12);
                                                                break;
                                                            case 1:
                                                                iVar2.f38172b = Z5.c.h(c4575b, iVar, z11);
                                                                break;
                                                            case 2:
                                                                iVar2.f38173c = Z5.c.h(c4575b, iVar, z11);
                                                                break;
                                                            case 3:
                                                                iVar2.f38171a = Z5.c.g(c4575b, iVar);
                                                                break;
                                                            case 4:
                                                                iVar2.f38175e = Z5.c.h(c4575b, iVar, z12);
                                                                break;
                                                            default:
                                                                c4575b.W();
                                                                break;
                                                        }
                                                    } else {
                                                        c4575b.V();
                                                        c4575b.W();
                                                    }
                                                }
                                                c4575b.B();
                                            }
                                            c4575b.z();
                                        }
                                    }
                                    C4455a c4455a10 = iVar2.f38171a;
                                    if (c4455a10 == null || (c4456b = iVar2.f38172b) == null || (c4456b2 = iVar2.f38173c) == null) {
                                        z10 = z11;
                                    } else {
                                        z10 = z11;
                                        C4456b c4456b7 = iVar2.f38174d;
                                        if (c4456b7 != null && (c4456b3 = iVar2.f38175e) != null) {
                                            n9 = new N(c4455a10, c4456b, c4456b2, c4456b7, c4456b3, 9);
                                            z11 = z10;
                                        }
                                    }
                                    n9 = null;
                                    z11 = z10;
                                }
                            } else if (K12 != z12) {
                                c4575b.V();
                                c4575b.W();
                            } else {
                                arrayList3.add(c4575b.H());
                            }
                            z10 = z11;
                            z11 = z10;
                        }
                        c4575b.B();
                    }
                    c4575b.z();
                    iVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    f6 = (float) c4575b.F();
                    break;
                case 15:
                    f13 = (float) c4575b.F();
                    break;
                case 16:
                    f11 = (float) (c4575b.F() * j1.j.c());
                    break;
                case 17:
                    f12 = (float) (c4575b.F() * j1.j.c());
                    break;
                case 18:
                    f9 = (float) c4575b.F();
                    break;
                case 19:
                    f10 = (float) c4575b.F();
                    break;
                case 20:
                    c4456b4 = Z5.c.h(c4575b, iVar, z11);
                    break;
                case 21:
                    str3 = c4575b.H();
                    break;
                case 22:
                    z14 = c4575b.E();
                    break;
                case 23:
                    if (c4575b.G() != z12) {
                        z13 = z11;
                        break;
                    } else {
                        z13 = z12;
                        break;
                    }
                case 24:
                    int G11 = c4575b.G();
                    if (G11 < AbstractC5088e.e(18).length) {
                        i14 = AbstractC5088e.e(18)[G11];
                        break;
                    } else {
                        iVar.a("Unsupported Blend Mode: " + G11);
                        i14 = z12;
                        break;
                    }
                default:
                    c4575b.V();
                    c4575b.W();
                    z8 = z11;
                    z11 = z8;
                    z12 = true;
                    break;
            }
        }
        c4575b.B();
        ArrayList arrayList4 = new ArrayList();
        if (f9 > 0.0f) {
            arrayList4.add(new C4628a(iVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(f9)));
        }
        if (f10 <= 0.0f) {
            f10 = iVar.f3680m;
        }
        arrayList4.add(new C4628a(iVar, valueOf2, valueOf2, (Interpolator) null, f9, Float.valueOf(f10)));
        arrayList4.add(new C4628a(iVar, valueOf, valueOf, (Interpolator) null, f10, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || com.anythink.expressad.f.a.b.da.equals(str3)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        boolean z18 = z13;
        if (z18) {
            if (dVar == null) {
                dVar = new d1.d();
            }
            d1.d dVar2 = dVar;
            dVar2.f37198m = z18;
            dVar = dVar2;
        }
        return new C4493d(arrayList2, iVar, str, j9, i10, j10, str2, arrayList, dVar, i9, i11, i12, f6, f13, f11, f12, c4455a, sVar, arrayList4, i13, c4456b4, z14, c4524d, n9, i14);
    }
}
