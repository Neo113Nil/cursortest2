package w;

import a0.e1;
import a0.g1;
import a0.h1;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import d0.c1;
import d0.x1;
import g0.k1;
import g0.p1;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicReference;
import s1.f1;
import s1.h2;
import s1.i2;
import s1.r2;
import s1.s2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f9238a = new d0(1);

    /* renamed from: b, reason: collision with root package name */
    public static final l1.a f9239b = new l1.a(1008);

    /* renamed from: c, reason: collision with root package name */
    public static final c1 f9240c = new c1(0, 0);

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, s0.o oVar, a2.k0 k0Var, int i7, boolean z8, int i8, int i9, g0.p pVar, int i10, int i11) {
        int i12;
        a2.k0 k0Var2;
        int i13;
        int i14;
        boolean z9;
        int i15;
        int i16;
        boolean z10;
        int i17;
        pVar.S(-1186827822);
        if ((i10 & 6) == 0) {
            i12 = (pVar.f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= pVar.f(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            k0Var2 = k0Var;
            i12 |= pVar.f(k0Var2) ? 256 : 128;
        } else {
            k0Var2 = k0Var;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= pVar.h(null) ? 2048 : 1024;
        }
        int i18 = i11 & 16;
        if (i18 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i13 = i7;
            i12 |= pVar.d(i13) ? 16384 : 8192;
            i14 = i11 & 32;
            if (i14 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
                z9 = z8;
                i12 |= pVar.g(z9) ? 131072 : 65536;
                if ((1572864 & i10) == 0) {
                    i12 |= pVar.d(i8) ? 1048576 : 524288;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i12 |= 12582912;
                } else if ((12582912 & i10) == 0) {
                    i16 = i9;
                    i12 |= pVar.d(i16) ? 8388608 : 4194304;
                    if (((i12 | 100663296) & 38347923) == 38347922 || !pVar.x()) {
                        if (i18 != 0) {
                            i13 = 1;
                        }
                        z10 = i14 == 0 ? true : z9;
                        i17 = i15 == 0 ? 1 : i16;
                        s(i17, i8);
                        if (pVar.k(a0.o0.f116a) == null) {
                            throw new ClassCastException();
                        }
                        pVar.Q(-1588686502);
                        pVar.p(false);
                        pVar.Q(-1587866335);
                        s0.o j8 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, null, false, 131071).j(new TextStringSimpleElement(str, k0Var2, (f2.d) pVar.k(f1.f8220i), i13, z10, i8, i17));
                        pVar.p(false);
                        int i19 = pVar.P;
                        s0.o c4 = s0.a.c(pVar, j8);
                        k1 m8 = pVar.m();
                        r1.j.f7810d.getClass();
                        r1.n nVar = r1.i.f7781b;
                        pVar.U();
                        if (pVar.O) {
                            pVar.l(nVar);
                        } else {
                            pVar.d0();
                        }
                        g0.d.Q(pVar, y.f9460a, r1.i.f7784e);
                        g0.d.Q(pVar, m8, r1.i.f7783d);
                        g0.d.Q(pVar, c4, r1.i.f7782c);
                        r1.h hVar = r1.i.f7785f;
                        if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i19))) {
                            a0.m.q(i19, pVar, i19, hVar);
                        }
                        pVar.p(true);
                    } else {
                        pVar.L();
                        z10 = z9;
                        i17 = i16;
                    }
                    p1 r8 = pVar.r();
                    if (r8 != null) {
                        r8.f3853d = new h(str, oVar, k0Var, i13, z10, i8, i17, i10, i11);
                        return;
                    }
                    return;
                }
                i16 = i9;
                if (((i12 | 100663296) & 38347923) == 38347922) {
                }
                if (i18 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                s(i17, i8);
                if (pVar.k(a0.o0.f116a) == null) {
                }
            }
            z9 = z8;
            if ((1572864 & i10) == 0) {
            }
            i15 = i11 & 128;
            if (i15 != 0) {
            }
            i16 = i9;
            if (((i12 | 100663296) & 38347923) == 38347922) {
            }
            if (i18 != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            s(i17, i8);
            if (pVar.k(a0.o0.f116a) == null) {
            }
        }
        i13 = i7;
        i14 = i11 & 32;
        if (i14 == 0) {
        }
        z9 = z8;
        if ((1572864 & i10) == 0) {
        }
        i15 = i11 & 128;
        if (i15 != 0) {
        }
        i16 = i9;
        if (((i12 | 100663296) & 38347923) == 38347922) {
        }
        if (i18 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        s(i17, i8);
        if (pVar.k(a0.o0.f116a) == null) {
        }
    }

    public static final void b(a0.x0 x0Var, o0.a aVar, g0.p pVar, int i7) {
        int i8;
        o0.a aVar2;
        g0.p pVar2;
        pVar.S(-1985516685);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(x0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && pVar.x()) {
            pVar.L();
            aVar2 = aVar;
            pVar2 = pVar;
        } else {
            Object G = pVar.G();
            g0.t0 t0Var = g0.l.f3784a;
            if (G == t0Var) {
                G = new n.j();
                pVar.a0(G);
            }
            n.j jVar = (n.j) G;
            Object G2 = pVar.G();
            if (G2 == t0Var) {
                G2 = new r1.z0(9, jVar);
                pVar.a0(G2);
            }
            aVar2 = aVar;
            pVar2 = pVar;
            j1.c.E(jVar, (q6.a) G2, new a0.y(x0Var, 1, jVar), null, x0Var.h(), aVar2, pVar2, ((i8 << 12) & 458752) | 54);
        }
        p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new g0.v(i7, 6, x0Var, aVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x056f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x063f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0684 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x071a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0789 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x080d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0845 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x024c  */
    /* JADX WARN: Type inference failed for: r0v98, types: [s0.o] */
    /* JADX WARN: Type inference failed for: r2v128, types: [s0.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(g2.w wVar, q6.c cVar, s0.o oVar, a2.k0 k0Var, a0.s sVar, q6.c cVar2, p.j jVar, z0.r0 r0Var, boolean z8, int i7, int i8, g2.m mVar, h0 h0Var, boolean z9, o0.a aVar, g0.p pVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        o.j0 j0Var;
        boolean f9;
        Object G;
        int i14;
        Object G2;
        x0.n nVar;
        a2.g gVar;
        p1 v5;
        a2.g gVar2;
        g2.q qVar;
        Object obj;
        r2 r2Var;
        a2.k0 k0Var2;
        boolean z10;
        int i15;
        x0.g gVar3;
        a2.j0 j0Var2;
        a2.g gVar4;
        m2.b bVar;
        f2.d dVar;
        m2.b bVar2;
        boolean z11;
        boolean z12;
        g2.w a3;
        Object G3;
        Object obj2;
        a1 a1Var;
        a1 a1Var2;
        a1 a1Var3;
        Object G4;
        Object G5;
        Object G6;
        int i16;
        g2.m mVar2;
        int i17;
        boolean z13;
        boolean h3;
        Object G7;
        x0.g gVar5;
        int i18;
        x0 x0Var;
        y.d dVar2;
        g2.d0 d0Var;
        p.j jVar2;
        Object obj3;
        a0.x0 x0Var2;
        j0 j0Var3;
        x0.n nVar2;
        g2.w wVar2;
        g2.m mVar3;
        t.c cVar3;
        boolean z14;
        g2.x xVar;
        j0 j0Var4;
        boolean z15;
        boolean z16;
        Object dVar3;
        a0.x0 x0Var3;
        g2.q qVar2;
        s0.o oVar2;
        j0 j0Var5;
        g0.z0 z0Var;
        g2.x xVar2;
        boolean h8;
        Object G8;
        s0.l lVar;
        s0.o a9;
        boolean h9;
        Object G9;
        g2.q qVar3;
        s0.o oVar3;
        int i19;
        boolean h10;
        Object G10;
        r2 r2Var2;
        boolean h11;
        Object G11;
        g2.q qVar4;
        s0.l lVar2;
        g2.x xVar3;
        r2 r2Var3;
        boolean h12;
        Object G12;
        int i20;
        s0.l lVar3;
        a0.x0 x0Var4;
        g2.m mVar4;
        boolean z17;
        s0.o oVar4;
        s0.l lVar4;
        boolean h13;
        Object G13;
        boolean h14;
        Object G14;
        g2.m mVar5;
        a0.x0 x0Var5;
        boolean h15;
        Object G15;
        boolean z18;
        int i21;
        g0.p pVar2 = pVar;
        a2.j0 j0Var6 = wVar.f4067c;
        a2.g gVar6 = wVar.f4065a;
        pVar2.S(-958708118);
        if ((i9 & 6) == 0) {
            i11 = i9 | (pVar2.f(wVar) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= pVar2.h(cVar) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= pVar2.f(oVar) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= pVar2.f(k0Var) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i11 |= pVar2.f(sVar) ? 16384 : 8192;
        }
        if ((i9 & 196608) == 0) {
            i11 |= pVar2.h(cVar2) ? 131072 : 65536;
        }
        if ((i9 & 1572864) == 0) {
            i11 |= pVar2.f(jVar) ? 1048576 : 524288;
        }
        if ((i9 & 12582912) == 0) {
            i11 |= pVar2.f(r0Var) ? 8388608 : 4194304;
        }
        if ((i9 & 100663296) == 0) {
            i11 |= pVar2.g(z8) ? 67108864 : 33554432;
        }
        if ((i9 & 805306368) == 0) {
            i11 |= pVar2.d(i7) ? 536870912 : 268435456;
        }
        int i22 = i11;
        if ((i10 & 6) == 0) {
            i12 = i10 | (pVar2.d(i8) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= pVar2.f(mVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= pVar2.f(h0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= pVar2.g(z9) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= pVar2.g(false) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= pVar2.h(aVar) ? 131072 : 65536;
        }
        int i23 = i12;
        if ((i22 & 306783379) == 306783378 && (74899 & i23) == 74898 && pVar2.x()) {
            pVar2.L();
        } else {
            pVar2.N();
            if ((i9 & 1) != 0 && !pVar2.w()) {
                pVar2.L();
            }
            pVar2.q();
            Object G16 = pVar2.G();
            Object obj4 = g0.l.f3784a;
            if (G16 == obj4) {
                G16 = new x0.n();
                pVar2.a0(G16);
            }
            x0.n nVar3 = (x0.n) G16;
            Object G17 = pVar2.G();
            if (G17 == obj4) {
                y.s sVar2 = y.t.f9746a;
                G17 = new y.d();
                pVar2.a0(G17);
            }
            y.d dVar4 = (y.d) G17;
            Object G18 = pVar2.G();
            if (G18 == obj4) {
                G18 = new g2.x(dVar4);
                pVar2.a0(G18);
            }
            g2.x xVar4 = (g2.x) G18;
            m2.b bVar3 = (m2.b) pVar2.k(f1.f8217f);
            f2.d dVar5 = (f2.d) pVar2.k(f1.f8220i);
            long j8 = ((g1) pVar2.k(h1.f83a)).f74b;
            x0.g gVar7 = (x0.g) pVar2.k(f1.f8218g);
            r2 r2Var4 = (r2) pVar2.k(f1.f8229r);
            h2 h2Var = (h2) pVar2.k(f1.f8225n);
            if (i7 != 1 || z8) {
                i13 = 1;
            } else {
                i13 = 1;
                if (mVar.f4042a) {
                    j0Var = o.j0.f6658g;
                    Object[] objArr = {j0Var};
                    androidx.room.c cVar4 = x0.f9454f;
                    f9 = pVar2.f(j0Var);
                    G = pVar2.G();
                    if (!f9 || G == obj4) {
                        G = new r1.z0(11, j0Var);
                        pVar2.a0(G);
                    }
                    x0 x0Var6 = (x0) a.a.E(objArr, cVar4, (q6.a) G, pVar2, 0, 4);
                    int i24 = i22 & 14;
                    i14 = (i24 != 4 ? i13 : 0) | ((i22 & 57344) != 16384 ? i13 : 0);
                    G2 = pVar2.G();
                    if (i14 == 0 || G2 == obj4) {
                        g2.d0 l8 = l(sVar, gVar6);
                        if (j0Var6 == null) {
                            nVar = nVar3;
                            long j9 = j0Var6.f408a;
                            g2.q qVar5 = l8.f4011b;
                            int i25 = a2.j0.f407c;
                            gVar = gVar6;
                            int b9 = qVar5.b((int) (j9 >> 32));
                            int b10 = qVar5.b((int) (j9 & 4294967295L));
                            int min = Math.min(b9, b10);
                            int max = Math.max(b9, b10);
                            a2.d dVar6 = new a2.d(l8.f4010a);
                            dVar6.a(new a2.d0(0L, 0L, (f2.k) null, (f2.i) null, (f2.j) null, (f2.q) null, (String) null, 0L, (l2.a) null, (l2.n) null, (h2.b) null, 0L, l2.j.f5878c, (z0.o0) null, 61439), min, max);
                            G2 = new g2.d0(dVar6.c(), qVar5);
                        } else {
                            nVar = nVar3;
                            gVar = gVar6;
                            G2 = l8;
                        }
                        pVar2.a0(G2);
                    } else {
                        nVar = nVar3;
                        gVar = gVar6;
                    }
                    g2.d0 d0Var2 = (g2.d0) G2;
                    a2.g gVar8 = d0Var2.f4010a;
                    g2.q qVar6 = d0Var2.f4011b;
                    v5 = pVar2.v();
                    if (v5 != null) {
                        throw new IllegalStateException("no recompose scope found");
                    }
                    v5.f3850a |= 1;
                    boolean f10 = pVar2.f(h2Var);
                    Object G19 = pVar2.G();
                    if (f10 || G19 == obj4) {
                        gVar2 = gVar;
                        qVar = qVar6;
                        obj = obj4;
                        r2Var = r2Var4;
                        k0Var2 = k0Var;
                        z10 = z8;
                        i15 = i24;
                        gVar3 = gVar7;
                        m0 m0Var = new m0(gVar8, k0Var2, z10, bVar3, dVar5, 0);
                        j0Var2 = j0Var6;
                        gVar4 = gVar8;
                        bVar = bVar3;
                        dVar = dVar5;
                        G19 = new j0(m0Var, v5, h2Var);
                        pVar2.a0(G19);
                    } else {
                        k0Var2 = k0Var;
                        z10 = z8;
                        gVar2 = gVar;
                        qVar = qVar6;
                        obj = obj4;
                        gVar4 = gVar8;
                        bVar = bVar3;
                        dVar = dVar5;
                        r2Var = r2Var4;
                        j0Var2 = j0Var6;
                        i15 = i24;
                        gVar3 = gVar7;
                    }
                    j0 j0Var7 = (j0) G19;
                    j0Var7.f9273s = cVar;
                    j0Var7.f9277w = j8;
                    b1.b bVar4 = j0Var7.f9272r;
                    bVar4.f1231h = h0Var;
                    bVar4.f1232i = gVar3;
                    j0Var7.f9264j = gVar2;
                    m0 m0Var2 = j0Var7.f9255a;
                    if (r6.k.a(m0Var2.f9329a, gVar4) && r6.k.a(m0Var2.f9330b, k0Var2) && m0Var2.f9333e == z10 && m0Var2.f9334f == (i21 = i13) && m0Var2.f9331c == Integer.MAX_VALUE && m0Var2.f9332d == i21 && r6.k.a(m0Var2.f9335g, bVar) && r6.k.a(m0Var2.f9337i, e6.u.f2826f) && m0Var2.f9336h == dVar) {
                        bVar2 = bVar;
                    } else {
                        bVar2 = bVar;
                        m0Var2 = new m0(gVar4, k0Var2, z10, bVar2, dVar, 0);
                    }
                    if (j0Var7.f9255a != m0Var2) {
                        j0Var7.f9270p = true;
                    }
                    j0Var7.f9255a = m0Var2;
                    androidx.room.c cVar5 = j0Var7.f9258d;
                    g2.c0 c0Var = j0Var7.f9259e;
                    cVar5.getClass();
                    long j10 = wVar.f4066b;
                    a2.j0 j0Var8 = j0Var2;
                    boolean a10 = r6.k.a(j0Var8, ((g2.j) cVar5.f1070h).c());
                    if (!r6.k.a(((g2.w) cVar5.f1069g).f4065a, gVar2)) {
                        cVar5.f1070h = new g2.j(gVar2, j10);
                        z11 = true;
                    } else if (a2.j0.a(((g2.w) cVar5.f1069g).f4066b, j10)) {
                        z11 = false;
                    } else {
                        ((g2.j) cVar5.f1070h).f(a2.j0.e(j10), a2.j0.d(j10));
                        z11 = false;
                        z12 = true;
                        if (j0Var8 != null) {
                            g2.j jVar3 = (g2.j) cVar5.f1070h;
                            jVar3.f4038d = -1;
                            jVar3.f4039e = -1;
                        } else {
                            long j11 = j0Var8.f408a;
                            if (!a2.j0.b(j11)) {
                                ((g2.j) cVar5.f1070h).e(a2.j0.e(j11), a2.j0.d(j11));
                            }
                        }
                        if (z11 && (z12 || a10)) {
                            a3 = wVar;
                        } else {
                            g2.j jVar4 = (g2.j) cVar5.f1070h;
                            jVar4.f4038d = -1;
                            jVar4.f4039e = -1;
                            a3 = g2.w.a(wVar, null, 0L, 3);
                        }
                        g2.w wVar3 = (g2.w) cVar5.f1069g;
                        cVar5.f1069g = a3;
                        if (c0Var != null) {
                            c0Var.a(wVar3, a3);
                        }
                        G3 = pVar2.G();
                        obj2 = obj;
                        if (G3 == obj2) {
                            G3 = new a1();
                            pVar2.a0(G3);
                        }
                        a1Var = (a1) G3;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (a1Var.f9191e) {
                            Long l9 = a1Var.f9190d;
                            a1Var2 = a1Var;
                            if (currentTimeMillis <= (l9 != null ? l9.longValue() : 0L) + 5000) {
                                a1Var3 = a1Var2;
                                G4 = pVar2.G();
                                if (G4 == obj2) {
                                    G4 = new a0.x0(a1Var3);
                                    pVar2.a0(G4);
                                }
                                a0.x0 x0Var7 = (a0.x0) G4;
                                g2.q qVar7 = qVar;
                                x0Var7.f176b = qVar7;
                                x0Var7.f177c = j0Var7.f9274t;
                                x0Var7.f178d = j0Var7;
                                x0Var7.f179e.setValue(wVar);
                                x0Var7.f180f = (s1.b1) pVar2.k(f1.f8215d);
                                x0Var7.f181g = (i2) pVar2.k(f1.f8226o);
                                x0Var7.f182h = (h1.a) pVar2.k(f1.f8221j);
                                x0.n nVar4 = nVar;
                                x0Var7.f183i = nVar4;
                                x0Var7.f184j.setValue(true);
                                x0Var7.f185k.setValue(Boolean.valueOf(z9));
                                G5 = pVar2.G();
                                if (G5 == obj2) {
                                    g0.y yVar = new g0.y(g0.d.y(pVar2));
                                    pVar2.a0(yVar);
                                    G5 = yVar;
                                }
                                h7.c cVar6 = ((g0.y) G5).f3972f;
                                G6 = pVar2.G();
                                if (G6 == obj2) {
                                    G6 = new t.c();
                                    pVar2.a0(G6);
                                }
                                t.c cVar7 = (t.c) G6;
                                int i26 = i23 & 7168;
                                int i27 = i23 & 57344;
                                boolean h16 = (i26 == 2048) | pVar2.h(j0Var7) | (i27 == 16384) | pVar2.h(xVar4);
                                int i28 = i15;
                                boolean z19 = h16 | (i28 == 4);
                                i16 = (i23 & 112) ^ 48;
                                a1 a1Var4 = a1Var3;
                                if (i16 > 32) {
                                    mVar2 = mVar;
                                    if (pVar2.f(mVar2)) {
                                        i17 = i28;
                                        z13 = true;
                                        h3 = z19 | z13 | pVar2.h(qVar7) | pVar2.h(cVar6) | pVar2.h(cVar7) | pVar2.h(x0Var7);
                                        G7 = pVar2.G();
                                        if (!h3 || G7 == obj2) {
                                            gVar5 = gVar3;
                                            g2.m mVar6 = mVar2;
                                            i18 = i23;
                                            x0Var = x0Var6;
                                            dVar2 = dVar4;
                                            d0Var = d0Var2;
                                            jVar2 = jVar;
                                            obj3 = obj2;
                                            x0Var2 = x0Var7;
                                            j0Var3 = j0Var7;
                                            nVar2 = nVar4;
                                            q qVar8 = new q(j0Var3, z9, xVar4, wVar, mVar6, qVar7, x0Var2, cVar6, cVar7);
                                            wVar2 = wVar;
                                            mVar3 = mVar6;
                                            cVar3 = cVar7;
                                            z14 = z9;
                                            xVar = xVar4;
                                            pVar2.a0(qVar8);
                                            G7 = qVar8;
                                        } else {
                                            gVar5 = gVar3;
                                            cVar3 = cVar7;
                                            i18 = i23;
                                            x0Var = x0Var6;
                                            dVar2 = dVar4;
                                            d0Var = d0Var2;
                                            xVar = xVar4;
                                            z14 = z9;
                                            obj3 = obj2;
                                            x0Var2 = x0Var7;
                                            mVar3 = mVar2;
                                            j0Var3 = j0Var7;
                                            jVar2 = jVar;
                                            nVar2 = nVar4;
                                            wVar2 = wVar;
                                        }
                                        s0.o a11 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(nVar2), (q6.c) G7), z14, jVar2);
                                        g0.z0 M = g0.d.M(Boolean.valueOf(z14), pVar2);
                                        boolean f11 = pVar2.f(M) | pVar2.h(j0Var3) | pVar2.h(xVar) | pVar2.h(x0Var2);
                                        if (i16 > 32 || !pVar2.f(mVar3)) {
                                            j0Var4 = j0Var3;
                                            if ((i18 & 48) != 32) {
                                                z15 = false;
                                                z16 = z15 | f11;
                                                Object G20 = pVar2.G();
                                                if (!z16 || G20 == obj3) {
                                                    x0Var3 = x0Var2;
                                                    g2.x xVar5 = xVar;
                                                    qVar2 = qVar7;
                                                    oVar2 = a11;
                                                    j0Var5 = j0Var4;
                                                    dVar3 = new androidx.room.d(j0Var5, M, xVar5, x0Var3, mVar, null, 9);
                                                    z0Var = M;
                                                    xVar2 = xVar5;
                                                    pVar2.a0(dVar3);
                                                } else {
                                                    dVar3 = G20;
                                                    xVar2 = xVar;
                                                    qVar2 = qVar7;
                                                    x0Var3 = x0Var2;
                                                    oVar2 = a11;
                                                    j0Var5 = j0Var4;
                                                    z0Var = M;
                                                }
                                                g0.d.e(pVar2, d6.z.f2639a, (q6.e) dVar3);
                                                h8 = pVar2.h(j0Var5);
                                                G8 = pVar2.G();
                                                if (!h8 || G8 == obj3) {
                                                    G8 = new p(j0Var5, 1);
                                                    pVar2.a0(G8);
                                                }
                                                a0.e0 e0Var = new a0.e0((q6.c) G8, (h6.d) null, 0);
                                                lVar = s0.l.f8103a;
                                                a9 = l1.a0.a(lVar, 8675309, e0Var);
                                                h9 = pVar2.h(j0Var5) | (i27 != 16384) | (i26 != 2048) | pVar2.h(qVar2) | pVar2.h(x0Var3);
                                                G9 = pVar2.G();
                                                if (!h9 || G9 == obj3) {
                                                    qVar3 = qVar2;
                                                    oVar3 = a9;
                                                    t3.l lVar5 = new t3.l(j0Var5, nVar2, z9, x0Var3, qVar3);
                                                    pVar2.a0(lVar5);
                                                    G9 = lVar5;
                                                } else {
                                                    qVar3 = qVar2;
                                                    oVar3 = a9;
                                                }
                                                s0.o a12 = !z9 ? s0.a.a(oVar3, new a0.j0((q6.c) G9, jVar2)) : oVar3;
                                                b6.c cVar8 = x0Var3.f195u;
                                                a0.u0 u0Var = x0Var3.f194t;
                                                s0.o j12 = a12.j(new SuspendPointerInputElement(cVar8, u0Var, new a0.a0(cVar8, u0Var, (h6.d) null, 0), 4)).j(new PointerHoverIconModifierElement());
                                                boolean h17 = pVar2.h(j0Var5);
                                                i19 = i17;
                                                h10 = h17 | (i19 != 4) | pVar2.h(qVar3);
                                                G10 = pVar2.G();
                                                int i29 = 12;
                                                if (!h10 || G10 == obj3) {
                                                    G10 = new c.h(j0Var5, wVar2, qVar3, i29);
                                                    pVar2.a0(G10);
                                                }
                                                s0.o a13 = androidx.compose.ui.draw.a.a(lVar, (q6.c) G10);
                                                r2Var2 = r2Var;
                                                h11 = pVar2.h(j0Var5) | (i26 != 2048) | pVar2.f(r2Var2) | pVar2.h(x0Var3) | (i19 != 4) | pVar2.h(qVar3);
                                                G11 = pVar2.G();
                                                if (!h11 || G11 == obj3) {
                                                    qVar4 = qVar3;
                                                    g2.w wVar4 = wVar2;
                                                    lVar2 = lVar;
                                                    xVar3 = xVar2;
                                                    r rVar = new r(j0Var5, z9, r2Var2, x0Var3, wVar4, qVar4);
                                                    r2Var3 = r2Var2;
                                                    pVar2.a0(rVar);
                                                    G11 = rVar;
                                                } else {
                                                    r2Var3 = r2Var2;
                                                    lVar2 = lVar;
                                                    xVar3 = xVar2;
                                                    qVar4 = qVar3;
                                                }
                                                s0.o d8 = androidx.compose.ui.layout.a.d(lVar2, (q6.c) G11);
                                                g2.d0 d0Var3 = d0Var;
                                                h12 = pVar2.h(d0Var3) | (i19 != 4) | (i26 != 2048) | pVar2.g(false) | (i27 != 16384) | pVar2.h(j0Var5) | pVar2.h(qVar4) | pVar2.h(x0Var3) | ((i16 <= 32 && pVar2.f(mVar)) || (i18 & 48) == 32);
                                                G12 = pVar2.G();
                                                if (!h12 || G12 == obj3) {
                                                    i20 = i19;
                                                    lVar3 = lVar2;
                                                    a0.x0 x0Var8 = x0Var3;
                                                    j0 j0Var9 = j0Var5;
                                                    t tVar = new t(d0Var3, wVar, z9, mVar, j0Var9, qVar4, x0Var8, nVar2);
                                                    j0Var5 = j0Var9;
                                                    x0Var4 = x0Var8;
                                                    mVar4 = mVar;
                                                    pVar2.a0(tVar);
                                                    G12 = tVar;
                                                } else {
                                                    i20 = i19;
                                                    lVar3 = lVar2;
                                                    x0Var4 = x0Var3;
                                                    mVar4 = mVar;
                                                }
                                                s0.o a14 = y1.k.a(lVar3, true, (q6.c) G12);
                                                z17 = !z9 && ((s2) r2Var3).a() && a2.j0.b(((a2.j0) j0Var5.f9278x.getValue()).f408a) && a2.j0.b(((a2.j0) j0Var5.f9279y.getValue()).f408a);
                                                float f12 = o0.f9375a;
                                                if (z17) {
                                                    oVar4 = a14;
                                                    lVar4 = lVar3;
                                                } else {
                                                    g2.q qVar9 = qVar4;
                                                    j0 j0Var10 = j0Var5;
                                                    j0Var5 = j0Var10;
                                                    oVar4 = a14;
                                                    qVar4 = qVar9;
                                                    lVar4 = s0.a.a(lVar3, new k.d(r0Var, j0Var10, wVar, qVar9, 1));
                                                }
                                                h13 = pVar2.h(x0Var4);
                                                G13 = pVar2.G();
                                                if (!h13 || G13 == obj3) {
                                                    G13 = new j(x0Var4, 0);
                                                    pVar2.a0(G13);
                                                }
                                                g0.d.d(x0Var4, (q6.c) G13, pVar2);
                                                h14 = pVar2.h(j0Var5) | pVar2.h(xVar3) | (i20 != 4) | ((i16 <= 32 && pVar2.f(mVar4)) || (i18 & 48) == 32);
                                                G14 = pVar2.G();
                                                if (!h14 || G14 == obj3) {
                                                    g2.m mVar7 = mVar4;
                                                    l.a aVar2 = new l.a(j0Var5, xVar3, wVar, mVar7, 5);
                                                    mVar5 = mVar7;
                                                    pVar2.a0(aVar2);
                                                    G14 = aVar2;
                                                } else {
                                                    mVar5 = mVar4;
                                                }
                                                g0.d.d(mVar5, (q6.c) G14, pVar2);
                                                x0Var5 = x0Var4;
                                                s0.o oVar5 = oVar4;
                                                s0.o a15 = s0.a.a(lVar3, new r0(j0Var5, x0Var5, wVar, true, i7 != 1, qVar4, a1Var4, j0Var5.f9274t, mVar5.f4046e));
                                                boolean booleanValue = ((Boolean) z0Var.getValue()).booleanValue();
                                                y.d dVar7 = dVar2;
                                                h15 = pVar2.h(j0Var5) | ((i16 <= 32 && pVar2.f(mVar5)) || (i18 & 48) == 32) | pVar2.h(dVar7);
                                                G15 = pVar2.G();
                                                if (!h15 || G15 == obj3) {
                                                    l.i0 i0Var = new l.i0(j0Var5, nVar2, mVar5, dVar7, 2);
                                                    pVar2.a0(i0Var);
                                                    G15 = i0Var;
                                                }
                                                g2.q qVar10 = qVar4;
                                                x0 x0Var9 = x0Var;
                                                s0.o d9 = androidx.compose.ui.layout.a.d(s0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, dVar7, j0Var5, x0Var5).j(androidx.compose.foundation.text.handwriting.a.a((q6.a) G15, booleanValue)).j(oVar2), new q.t0(gVar5, 13, j0Var5)), new q.t0(j0Var5, 12, x0Var5)).j(a15), new m.o(x0Var9, z9, jVar)).j(j12).j(oVar5), new p(j0Var5, 0));
                                                z18 = !z9 && j0Var5.b() && ((Boolean) j0Var5.f9271q.getValue()).booleanValue() && ((s2) r2Var3).a();
                                                if (z18 && m.o0.a()) {
                                                    lVar3 = s0.a.a(lVar3, new e1(0, x0Var5));
                                                }
                                                pVar2 = pVar;
                                                d(d9, x0Var5, o0.f.b(-374338080, new n(aVar, j0Var5, k0Var, i8, i7, x0Var9, wVar, sVar, lVar4, a13, d8, lVar3, cVar3, x0Var5, z18, cVar2, qVar10, bVar2), pVar2), pVar2, 384);
                                            }
                                        } else {
                                            j0Var4 = j0Var3;
                                        }
                                        z15 = true;
                                        z16 = z15 | f11;
                                        Object G202 = pVar2.G();
                                        if (z16) {
                                        }
                                        x0Var3 = x0Var2;
                                        g2.x xVar52 = xVar;
                                        qVar2 = qVar7;
                                        oVar2 = a11;
                                        j0Var5 = j0Var4;
                                        dVar3 = new androidx.room.d(j0Var5, M, xVar52, x0Var3, mVar, null, 9);
                                        z0Var = M;
                                        xVar2 = xVar52;
                                        pVar2.a0(dVar3);
                                        g0.d.e(pVar2, d6.z.f2639a, (q6.e) dVar3);
                                        h8 = pVar2.h(j0Var5);
                                        G8 = pVar2.G();
                                        if (!h8) {
                                        }
                                        G8 = new p(j0Var5, 1);
                                        pVar2.a0(G8);
                                        a0.e0 e0Var2 = new a0.e0((q6.c) G8, (h6.d) null, 0);
                                        lVar = s0.l.f8103a;
                                        a9 = l1.a0.a(lVar, 8675309, e0Var2);
                                        h9 = pVar2.h(j0Var5) | (i27 != 16384) | (i26 != 2048) | pVar2.h(qVar2) | pVar2.h(x0Var3);
                                        G9 = pVar2.G();
                                        if (h9) {
                                        }
                                        qVar3 = qVar2;
                                        oVar3 = a9;
                                        t3.l lVar52 = new t3.l(j0Var5, nVar2, z9, x0Var3, qVar3);
                                        pVar2.a0(lVar52);
                                        G9 = lVar52;
                                        if (!z9) {
                                        }
                                        b6.c cVar82 = x0Var3.f195u;
                                        a0.u0 u0Var2 = x0Var3.f194t;
                                        s0.o j122 = a12.j(new SuspendPointerInputElement(cVar82, u0Var2, new a0.a0(cVar82, u0Var2, (h6.d) null, 0), 4)).j(new PointerHoverIconModifierElement());
                                        boolean h172 = pVar2.h(j0Var5);
                                        i19 = i17;
                                        h10 = h172 | (i19 != 4) | pVar2.h(qVar3);
                                        G10 = pVar2.G();
                                        int i292 = 12;
                                        if (!h10) {
                                        }
                                        G10 = new c.h(j0Var5, wVar2, qVar3, i292);
                                        pVar2.a0(G10);
                                        s0.o a132 = androidx.compose.ui.draw.a.a(lVar, (q6.c) G10);
                                        r2Var2 = r2Var;
                                        h11 = pVar2.h(j0Var5) | (i26 != 2048) | pVar2.f(r2Var2) | pVar2.h(x0Var3) | (i19 != 4) | pVar2.h(qVar3);
                                        G11 = pVar2.G();
                                        if (h11) {
                                        }
                                        qVar4 = qVar3;
                                        g2.w wVar42 = wVar2;
                                        lVar2 = lVar;
                                        xVar3 = xVar2;
                                        r rVar2 = new r(j0Var5, z9, r2Var2, x0Var3, wVar42, qVar4);
                                        r2Var3 = r2Var2;
                                        pVar2.a0(rVar2);
                                        G11 = rVar2;
                                        s0.o d82 = androidx.compose.ui.layout.a.d(lVar2, (q6.c) G11);
                                        g2.d0 d0Var32 = d0Var;
                                        h12 = pVar2.h(d0Var32) | (i19 != 4) | (i26 != 2048) | pVar2.g(false) | (i27 != 16384) | pVar2.h(j0Var5) | pVar2.h(qVar4) | pVar2.h(x0Var3) | ((i16 <= 32 && pVar2.f(mVar)) || (i18 & 48) == 32);
                                        G12 = pVar2.G();
                                        if (h12) {
                                        }
                                        i20 = i19;
                                        lVar3 = lVar2;
                                        a0.x0 x0Var82 = x0Var3;
                                        j0 j0Var92 = j0Var5;
                                        t tVar2 = new t(d0Var32, wVar, z9, mVar, j0Var92, qVar4, x0Var82, nVar2);
                                        j0Var5 = j0Var92;
                                        x0Var4 = x0Var82;
                                        mVar4 = mVar;
                                        pVar2.a0(tVar2);
                                        G12 = tVar2;
                                        s0.o a142 = y1.k.a(lVar3, true, (q6.c) G12);
                                        if (z9) {
                                        }
                                        float f122 = o0.f9375a;
                                        if (z17) {
                                        }
                                        h13 = pVar2.h(x0Var4);
                                        G13 = pVar2.G();
                                        if (!h13) {
                                        }
                                        G13 = new j(x0Var4, 0);
                                        pVar2.a0(G13);
                                        g0.d.d(x0Var4, (q6.c) G13, pVar2);
                                        h14 = pVar2.h(j0Var5) | pVar2.h(xVar3) | (i20 != 4) | ((i16 <= 32 && pVar2.f(mVar4)) || (i18 & 48) == 32);
                                        G14 = pVar2.G();
                                        if (h14) {
                                        }
                                        g2.m mVar72 = mVar4;
                                        l.a aVar22 = new l.a(j0Var5, xVar3, wVar, mVar72, 5);
                                        mVar5 = mVar72;
                                        pVar2.a0(aVar22);
                                        G14 = aVar22;
                                        g0.d.d(mVar5, (q6.c) G14, pVar2);
                                        x0Var5 = x0Var4;
                                        s0.o oVar52 = oVar4;
                                        s0.o a152 = s0.a.a(lVar3, new r0(j0Var5, x0Var5, wVar, true, i7 != 1, qVar4, a1Var4, j0Var5.f9274t, mVar5.f4046e));
                                        boolean booleanValue2 = ((Boolean) z0Var.getValue()).booleanValue();
                                        y.d dVar72 = dVar2;
                                        h15 = pVar2.h(j0Var5) | ((i16 <= 32 && pVar2.f(mVar5)) || (i18 & 48) == 32) | pVar2.h(dVar72);
                                        G15 = pVar2.G();
                                        if (!h15) {
                                        }
                                        l.i0 i0Var2 = new l.i0(j0Var5, nVar2, mVar5, dVar72, 2);
                                        pVar2.a0(i0Var2);
                                        G15 = i0Var2;
                                        g2.q qVar102 = qVar4;
                                        x0 x0Var92 = x0Var;
                                        s0.o d92 = androidx.compose.ui.layout.a.d(s0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, dVar72, j0Var5, x0Var5).j(androidx.compose.foundation.text.handwriting.a.a((q6.a) G15, booleanValue2)).j(oVar2), new q.t0(gVar5, 13, j0Var5)), new q.t0(j0Var5, 12, x0Var5)).j(a152), new m.o(x0Var92, z9, jVar)).j(j122).j(oVar52), new p(j0Var5, 0));
                                        if (z9) {
                                        }
                                        if (z18) {
                                            lVar3 = s0.a.a(lVar3, new e1(0, x0Var5));
                                        }
                                        pVar2 = pVar;
                                        d(d92, x0Var5, o0.f.b(-374338080, new n(aVar, j0Var5, k0Var, i8, i7, x0Var92, wVar, sVar, lVar4, a132, d82, lVar3, cVar3, x0Var5, z18, cVar2, qVar102, bVar2), pVar2), pVar2, 384);
                                    }
                                } else {
                                    mVar2 = mVar;
                                }
                                i17 = i28;
                                if ((i23 & 48) != 32) {
                                    z13 = false;
                                    h3 = z19 | z13 | pVar2.h(qVar7) | pVar2.h(cVar6) | pVar2.h(cVar7) | pVar2.h(x0Var7);
                                    G7 = pVar2.G();
                                    if (h3) {
                                    }
                                    gVar5 = gVar3;
                                    g2.m mVar62 = mVar2;
                                    i18 = i23;
                                    x0Var = x0Var6;
                                    dVar2 = dVar4;
                                    d0Var = d0Var2;
                                    jVar2 = jVar;
                                    obj3 = obj2;
                                    x0Var2 = x0Var7;
                                    j0Var3 = j0Var7;
                                    nVar2 = nVar4;
                                    q qVar82 = new q(j0Var3, z9, xVar4, wVar, mVar62, qVar7, x0Var2, cVar6, cVar7);
                                    wVar2 = wVar;
                                    mVar3 = mVar62;
                                    cVar3 = cVar7;
                                    z14 = z9;
                                    xVar = xVar4;
                                    pVar2.a0(qVar82);
                                    G7 = qVar82;
                                    s0.o a112 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(nVar2), (q6.c) G7), z14, jVar2);
                                    g0.z0 M2 = g0.d.M(Boolean.valueOf(z14), pVar2);
                                    boolean f112 = pVar2.f(M2) | pVar2.h(j0Var3) | pVar2.h(xVar) | pVar2.h(x0Var2);
                                    if (i16 > 32) {
                                    }
                                    j0Var4 = j0Var3;
                                    if ((i18 & 48) != 32) {
                                    }
                                    z15 = true;
                                    z16 = z15 | f112;
                                    Object G2022 = pVar2.G();
                                    if (z16) {
                                    }
                                    x0Var3 = x0Var2;
                                    g2.x xVar522 = xVar;
                                    qVar2 = qVar7;
                                    oVar2 = a112;
                                    j0Var5 = j0Var4;
                                    dVar3 = new androidx.room.d(j0Var5, M2, xVar522, x0Var3, mVar, null, 9);
                                    z0Var = M2;
                                    xVar2 = xVar522;
                                    pVar2.a0(dVar3);
                                    g0.d.e(pVar2, d6.z.f2639a, (q6.e) dVar3);
                                    h8 = pVar2.h(j0Var5);
                                    G8 = pVar2.G();
                                    if (!h8) {
                                    }
                                    G8 = new p(j0Var5, 1);
                                    pVar2.a0(G8);
                                    a0.e0 e0Var22 = new a0.e0((q6.c) G8, (h6.d) null, 0);
                                    lVar = s0.l.f8103a;
                                    a9 = l1.a0.a(lVar, 8675309, e0Var22);
                                    h9 = pVar2.h(j0Var5) | (i27 != 16384) | (i26 != 2048) | pVar2.h(qVar2) | pVar2.h(x0Var3);
                                    G9 = pVar2.G();
                                    if (h9) {
                                    }
                                    qVar3 = qVar2;
                                    oVar3 = a9;
                                    t3.l lVar522 = new t3.l(j0Var5, nVar2, z9, x0Var3, qVar3);
                                    pVar2.a0(lVar522);
                                    G9 = lVar522;
                                    if (!z9) {
                                    }
                                    b6.c cVar822 = x0Var3.f195u;
                                    a0.u0 u0Var22 = x0Var3.f194t;
                                    s0.o j1222 = a12.j(new SuspendPointerInputElement(cVar822, u0Var22, new a0.a0(cVar822, u0Var22, (h6.d) null, 0), 4)).j(new PointerHoverIconModifierElement());
                                    boolean h1722 = pVar2.h(j0Var5);
                                    i19 = i17;
                                    h10 = h1722 | (i19 != 4) | pVar2.h(qVar3);
                                    G10 = pVar2.G();
                                    int i2922 = 12;
                                    if (!h10) {
                                    }
                                    G10 = new c.h(j0Var5, wVar2, qVar3, i2922);
                                    pVar2.a0(G10);
                                    s0.o a1322 = androidx.compose.ui.draw.a.a(lVar, (q6.c) G10);
                                    r2Var2 = r2Var;
                                    h11 = pVar2.h(j0Var5) | (i26 != 2048) | pVar2.f(r2Var2) | pVar2.h(x0Var3) | (i19 != 4) | pVar2.h(qVar3);
                                    G11 = pVar2.G();
                                    if (h11) {
                                    }
                                    qVar4 = qVar3;
                                    g2.w wVar422 = wVar2;
                                    lVar2 = lVar;
                                    xVar3 = xVar2;
                                    r rVar22 = new r(j0Var5, z9, r2Var2, x0Var3, wVar422, qVar4);
                                    r2Var3 = r2Var2;
                                    pVar2.a0(rVar22);
                                    G11 = rVar22;
                                    s0.o d822 = androidx.compose.ui.layout.a.d(lVar2, (q6.c) G11);
                                    g2.d0 d0Var322 = d0Var;
                                    h12 = pVar2.h(d0Var322) | (i19 != 4) | (i26 != 2048) | pVar2.g(false) | (i27 != 16384) | pVar2.h(j0Var5) | pVar2.h(qVar4) | pVar2.h(x0Var3) | ((i16 <= 32 && pVar2.f(mVar)) || (i18 & 48) == 32);
                                    G12 = pVar2.G();
                                    if (h12) {
                                    }
                                    i20 = i19;
                                    lVar3 = lVar2;
                                    a0.x0 x0Var822 = x0Var3;
                                    j0 j0Var922 = j0Var5;
                                    t tVar22 = new t(d0Var322, wVar, z9, mVar, j0Var922, qVar4, x0Var822, nVar2);
                                    j0Var5 = j0Var922;
                                    x0Var4 = x0Var822;
                                    mVar4 = mVar;
                                    pVar2.a0(tVar22);
                                    G12 = tVar22;
                                    s0.o a1422 = y1.k.a(lVar3, true, (q6.c) G12);
                                    if (z9) {
                                    }
                                    float f1222 = o0.f9375a;
                                    if (z17) {
                                    }
                                    h13 = pVar2.h(x0Var4);
                                    G13 = pVar2.G();
                                    if (!h13) {
                                    }
                                    G13 = new j(x0Var4, 0);
                                    pVar2.a0(G13);
                                    g0.d.d(x0Var4, (q6.c) G13, pVar2);
                                    h14 = pVar2.h(j0Var5) | pVar2.h(xVar3) | (i20 != 4) | ((i16 <= 32 && pVar2.f(mVar4)) || (i18 & 48) == 32);
                                    G14 = pVar2.G();
                                    if (h14) {
                                    }
                                    g2.m mVar722 = mVar4;
                                    l.a aVar222 = new l.a(j0Var5, xVar3, wVar, mVar722, 5);
                                    mVar5 = mVar722;
                                    pVar2.a0(aVar222);
                                    G14 = aVar222;
                                    g0.d.d(mVar5, (q6.c) G14, pVar2);
                                    x0Var5 = x0Var4;
                                    s0.o oVar522 = oVar4;
                                    s0.o a1522 = s0.a.a(lVar3, new r0(j0Var5, x0Var5, wVar, true, i7 != 1, qVar4, a1Var4, j0Var5.f9274t, mVar5.f4046e));
                                    boolean booleanValue22 = ((Boolean) z0Var.getValue()).booleanValue();
                                    y.d dVar722 = dVar2;
                                    h15 = pVar2.h(j0Var5) | ((i16 <= 32 && pVar2.f(mVar5)) || (i18 & 48) == 32) | pVar2.h(dVar722);
                                    G15 = pVar2.G();
                                    if (!h15) {
                                    }
                                    l.i0 i0Var22 = new l.i0(j0Var5, nVar2, mVar5, dVar722, 2);
                                    pVar2.a0(i0Var22);
                                    G15 = i0Var22;
                                    g2.q qVar1022 = qVar4;
                                    x0 x0Var922 = x0Var;
                                    s0.o d922 = androidx.compose.ui.layout.a.d(s0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, dVar722, j0Var5, x0Var5).j(androidx.compose.foundation.text.handwriting.a.a((q6.a) G15, booleanValue22)).j(oVar2), new q.t0(gVar5, 13, j0Var5)), new q.t0(j0Var5, 12, x0Var5)).j(a1522), new m.o(x0Var922, z9, jVar)).j(j1222).j(oVar522), new p(j0Var5, 0));
                                    if (z9) {
                                    }
                                    if (z18) {
                                    }
                                    pVar2 = pVar;
                                    d(d922, x0Var5, o0.f.b(-374338080, new n(aVar, j0Var5, k0Var, i8, i7, x0Var922, wVar, sVar, lVar4, a1322, d822, lVar3, cVar3, x0Var5, z18, cVar2, qVar1022, bVar2), pVar2), pVar2, 384);
                                }
                                z13 = true;
                                h3 = z19 | z13 | pVar2.h(qVar7) | pVar2.h(cVar6) | pVar2.h(cVar7) | pVar2.h(x0Var7);
                                G7 = pVar2.G();
                                if (h3) {
                                }
                                gVar5 = gVar3;
                                g2.m mVar622 = mVar2;
                                i18 = i23;
                                x0Var = x0Var6;
                                dVar2 = dVar4;
                                d0Var = d0Var2;
                                jVar2 = jVar;
                                obj3 = obj2;
                                x0Var2 = x0Var7;
                                j0Var3 = j0Var7;
                                nVar2 = nVar4;
                                q qVar822 = new q(j0Var3, z9, xVar4, wVar, mVar622, qVar7, x0Var2, cVar6, cVar7);
                                wVar2 = wVar;
                                mVar3 = mVar622;
                                cVar3 = cVar7;
                                z14 = z9;
                                xVar = xVar4;
                                pVar2.a0(qVar822);
                                G7 = qVar822;
                                s0.o a1122 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(nVar2), (q6.c) G7), z14, jVar2);
                                g0.z0 M22 = g0.d.M(Boolean.valueOf(z14), pVar2);
                                boolean f1122 = pVar2.f(M22) | pVar2.h(j0Var3) | pVar2.h(xVar) | pVar2.h(x0Var2);
                                if (i16 > 32) {
                                }
                                j0Var4 = j0Var3;
                                if ((i18 & 48) != 32) {
                                }
                                z15 = true;
                                z16 = z15 | f1122;
                                Object G20222 = pVar2.G();
                                if (z16) {
                                }
                                x0Var3 = x0Var2;
                                g2.x xVar5222 = xVar;
                                qVar2 = qVar7;
                                oVar2 = a1122;
                                j0Var5 = j0Var4;
                                dVar3 = new androidx.room.d(j0Var5, M22, xVar5222, x0Var3, mVar, null, 9);
                                z0Var = M22;
                                xVar2 = xVar5222;
                                pVar2.a0(dVar3);
                                g0.d.e(pVar2, d6.z.f2639a, (q6.e) dVar3);
                                h8 = pVar2.h(j0Var5);
                                G8 = pVar2.G();
                                if (!h8) {
                                }
                                G8 = new p(j0Var5, 1);
                                pVar2.a0(G8);
                                a0.e0 e0Var222 = new a0.e0((q6.c) G8, (h6.d) null, 0);
                                lVar = s0.l.f8103a;
                                a9 = l1.a0.a(lVar, 8675309, e0Var222);
                                h9 = pVar2.h(j0Var5) | (i27 != 16384) | (i26 != 2048) | pVar2.h(qVar2) | pVar2.h(x0Var3);
                                G9 = pVar2.G();
                                if (h9) {
                                }
                                qVar3 = qVar2;
                                oVar3 = a9;
                                t3.l lVar5222 = new t3.l(j0Var5, nVar2, z9, x0Var3, qVar3);
                                pVar2.a0(lVar5222);
                                G9 = lVar5222;
                                if (!z9) {
                                }
                                b6.c cVar8222 = x0Var3.f195u;
                                a0.u0 u0Var222 = x0Var3.f194t;
                                s0.o j12222 = a12.j(new SuspendPointerInputElement(cVar8222, u0Var222, new a0.a0(cVar8222, u0Var222, (h6.d) null, 0), 4)).j(new PointerHoverIconModifierElement());
                                boolean h17222 = pVar2.h(j0Var5);
                                i19 = i17;
                                h10 = h17222 | (i19 != 4) | pVar2.h(qVar3);
                                G10 = pVar2.G();
                                int i29222 = 12;
                                if (!h10) {
                                }
                                G10 = new c.h(j0Var5, wVar2, qVar3, i29222);
                                pVar2.a0(G10);
                                s0.o a13222 = androidx.compose.ui.draw.a.a(lVar, (q6.c) G10);
                                r2Var2 = r2Var;
                                h11 = pVar2.h(j0Var5) | (i26 != 2048) | pVar2.f(r2Var2) | pVar2.h(x0Var3) | (i19 != 4) | pVar2.h(qVar3);
                                G11 = pVar2.G();
                                if (h11) {
                                }
                                qVar4 = qVar3;
                                g2.w wVar4222 = wVar2;
                                lVar2 = lVar;
                                xVar3 = xVar2;
                                r rVar222 = new r(j0Var5, z9, r2Var2, x0Var3, wVar4222, qVar4);
                                r2Var3 = r2Var2;
                                pVar2.a0(rVar222);
                                G11 = rVar222;
                                s0.o d8222 = androidx.compose.ui.layout.a.d(lVar2, (q6.c) G11);
                                g2.d0 d0Var3222 = d0Var;
                                h12 = pVar2.h(d0Var3222) | (i19 != 4) | (i26 != 2048) | pVar2.g(false) | (i27 != 16384) | pVar2.h(j0Var5) | pVar2.h(qVar4) | pVar2.h(x0Var3) | ((i16 <= 32 && pVar2.f(mVar)) || (i18 & 48) == 32);
                                G12 = pVar2.G();
                                if (h12) {
                                }
                                i20 = i19;
                                lVar3 = lVar2;
                                a0.x0 x0Var8222 = x0Var3;
                                j0 j0Var9222 = j0Var5;
                                t tVar222 = new t(d0Var3222, wVar, z9, mVar, j0Var9222, qVar4, x0Var8222, nVar2);
                                j0Var5 = j0Var9222;
                                x0Var4 = x0Var8222;
                                mVar4 = mVar;
                                pVar2.a0(tVar222);
                                G12 = tVar222;
                                s0.o a14222 = y1.k.a(lVar3, true, (q6.c) G12);
                                if (z9) {
                                }
                                float f12222 = o0.f9375a;
                                if (z17) {
                                }
                                h13 = pVar2.h(x0Var4);
                                G13 = pVar2.G();
                                if (!h13) {
                                }
                                G13 = new j(x0Var4, 0);
                                pVar2.a0(G13);
                                g0.d.d(x0Var4, (q6.c) G13, pVar2);
                                h14 = pVar2.h(j0Var5) | pVar2.h(xVar3) | (i20 != 4) | ((i16 <= 32 && pVar2.f(mVar4)) || (i18 & 48) == 32);
                                G14 = pVar2.G();
                                if (h14) {
                                }
                                g2.m mVar7222 = mVar4;
                                l.a aVar2222 = new l.a(j0Var5, xVar3, wVar, mVar7222, 5);
                                mVar5 = mVar7222;
                                pVar2.a0(aVar2222);
                                G14 = aVar2222;
                                g0.d.d(mVar5, (q6.c) G14, pVar2);
                                x0Var5 = x0Var4;
                                s0.o oVar5222 = oVar4;
                                s0.o a15222 = s0.a.a(lVar3, new r0(j0Var5, x0Var5, wVar, true, i7 != 1, qVar4, a1Var4, j0Var5.f9274t, mVar5.f4046e));
                                boolean booleanValue222 = ((Boolean) z0Var.getValue()).booleanValue();
                                y.d dVar7222 = dVar2;
                                h15 = pVar2.h(j0Var5) | ((i16 <= 32 && pVar2.f(mVar5)) || (i18 & 48) == 32) | pVar2.h(dVar7222);
                                G15 = pVar2.G();
                                if (!h15) {
                                }
                                l.i0 i0Var222 = new l.i0(j0Var5, nVar2, mVar5, dVar7222, 2);
                                pVar2.a0(i0Var222);
                                G15 = i0Var222;
                                g2.q qVar10222 = qVar4;
                                x0 x0Var9222 = x0Var;
                                s0.o d9222 = androidx.compose.ui.layout.a.d(s0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, dVar7222, j0Var5, x0Var5).j(androidx.compose.foundation.text.handwriting.a.a((q6.a) G15, booleanValue222)).j(oVar2), new q.t0(gVar5, 13, j0Var5)), new q.t0(j0Var5, 12, x0Var5)).j(a15222), new m.o(x0Var9222, z9, jVar)).j(j12222).j(oVar5222), new p(j0Var5, 0));
                                if (z9) {
                                }
                                if (z18) {
                                }
                                pVar2 = pVar;
                                d(d9222, x0Var5, o0.f.b(-374338080, new n(aVar, j0Var5, k0Var, i8, i7, x0Var9222, wVar, sVar, lVar4, a13222, d8222, lVar3, cVar3, x0Var5, z18, cVar2, qVar10222, bVar2), pVar2), pVar2, 384);
                            }
                        } else {
                            a1Var2 = a1Var;
                        }
                        a1Var3 = a1Var2;
                        a1Var3.f9190d = Long.valueOf(currentTimeMillis);
                        a1Var3.a(wVar);
                        G4 = pVar2.G();
                        if (G4 == obj2) {
                        }
                        a0.x0 x0Var72 = (a0.x0) G4;
                        g2.q qVar72 = qVar;
                        x0Var72.f176b = qVar72;
                        x0Var72.f177c = j0Var7.f9274t;
                        x0Var72.f178d = j0Var7;
                        x0Var72.f179e.setValue(wVar);
                        x0Var72.f180f = (s1.b1) pVar2.k(f1.f8215d);
                        x0Var72.f181g = (i2) pVar2.k(f1.f8226o);
                        x0Var72.f182h = (h1.a) pVar2.k(f1.f8221j);
                        x0.n nVar42 = nVar;
                        x0Var72.f183i = nVar42;
                        x0Var72.f184j.setValue(true);
                        x0Var72.f185k.setValue(Boolean.valueOf(z9));
                        G5 = pVar2.G();
                        if (G5 == obj2) {
                        }
                        h7.c cVar62 = ((g0.y) G5).f3972f;
                        G6 = pVar2.G();
                        if (G6 == obj2) {
                        }
                        t.c cVar72 = (t.c) G6;
                        int i262 = i23 & 7168;
                        int i272 = i23 & 57344;
                        boolean h162 = (i262 == 2048) | pVar2.h(j0Var7) | (i272 == 16384) | pVar2.h(xVar4);
                        int i282 = i15;
                        boolean z192 = h162 | (i282 == 4);
                        i16 = (i23 & 112) ^ 48;
                        a1 a1Var42 = a1Var3;
                        if (i16 > 32) {
                        }
                        i17 = i282;
                        if ((i23 & 48) != 32) {
                        }
                        z13 = true;
                        h3 = z192 | z13 | pVar2.h(qVar72) | pVar2.h(cVar62) | pVar2.h(cVar72) | pVar2.h(x0Var72);
                        G7 = pVar2.G();
                        if (h3) {
                        }
                        gVar5 = gVar3;
                        g2.m mVar6222 = mVar2;
                        i18 = i23;
                        x0Var = x0Var6;
                        dVar2 = dVar4;
                        d0Var = d0Var2;
                        jVar2 = jVar;
                        obj3 = obj2;
                        x0Var2 = x0Var72;
                        j0Var3 = j0Var7;
                        nVar2 = nVar42;
                        q qVar8222 = new q(j0Var3, z9, xVar4, wVar, mVar6222, qVar72, x0Var2, cVar62, cVar72);
                        wVar2 = wVar;
                        mVar3 = mVar6222;
                        cVar3 = cVar72;
                        z14 = z9;
                        xVar = xVar4;
                        pVar2.a0(qVar8222);
                        G7 = qVar8222;
                        s0.o a11222 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(nVar2), (q6.c) G7), z14, jVar2);
                        g0.z0 M222 = g0.d.M(Boolean.valueOf(z14), pVar2);
                        boolean f11222 = pVar2.f(M222) | pVar2.h(j0Var3) | pVar2.h(xVar) | pVar2.h(x0Var2);
                        if (i16 > 32) {
                        }
                        j0Var4 = j0Var3;
                        if ((i18 & 48) != 32) {
                        }
                        z15 = true;
                        z16 = z15 | f11222;
                        Object G202222 = pVar2.G();
                        if (z16) {
                        }
                        x0Var3 = x0Var2;
                        g2.x xVar52222 = xVar;
                        qVar2 = qVar72;
                        oVar2 = a11222;
                        j0Var5 = j0Var4;
                        dVar3 = new androidx.room.d(j0Var5, M222, xVar52222, x0Var3, mVar, null, 9);
                        z0Var = M222;
                        xVar2 = xVar52222;
                        pVar2.a0(dVar3);
                        g0.d.e(pVar2, d6.z.f2639a, (q6.e) dVar3);
                        h8 = pVar2.h(j0Var5);
                        G8 = pVar2.G();
                        if (!h8) {
                        }
                        G8 = new p(j0Var5, 1);
                        pVar2.a0(G8);
                        a0.e0 e0Var2222 = new a0.e0((q6.c) G8, (h6.d) null, 0);
                        lVar = s0.l.f8103a;
                        a9 = l1.a0.a(lVar, 8675309, e0Var2222);
                        h9 = pVar2.h(j0Var5) | (i272 != 16384) | (i262 != 2048) | pVar2.h(qVar2) | pVar2.h(x0Var3);
                        G9 = pVar2.G();
                        if (h9) {
                        }
                        qVar3 = qVar2;
                        oVar3 = a9;
                        t3.l lVar52222 = new t3.l(j0Var5, nVar2, z9, x0Var3, qVar3);
                        pVar2.a0(lVar52222);
                        G9 = lVar52222;
                        if (!z9) {
                        }
                        b6.c cVar82222 = x0Var3.f195u;
                        a0.u0 u0Var2222 = x0Var3.f194t;
                        s0.o j122222 = a12.j(new SuspendPointerInputElement(cVar82222, u0Var2222, new a0.a0(cVar82222, u0Var2222, (h6.d) null, 0), 4)).j(new PointerHoverIconModifierElement());
                        boolean h172222 = pVar2.h(j0Var5);
                        i19 = i17;
                        h10 = h172222 | (i19 != 4) | pVar2.h(qVar3);
                        G10 = pVar2.G();
                        int i292222 = 12;
                        if (!h10) {
                        }
                        G10 = new c.h(j0Var5, wVar2, qVar3, i292222);
                        pVar2.a0(G10);
                        s0.o a132222 = androidx.compose.ui.draw.a.a(lVar, (q6.c) G10);
                        r2Var2 = r2Var;
                        h11 = pVar2.h(j0Var5) | (i262 != 2048) | pVar2.f(r2Var2) | pVar2.h(x0Var3) | (i19 != 4) | pVar2.h(qVar3);
                        G11 = pVar2.G();
                        if (h11) {
                        }
                        qVar4 = qVar3;
                        g2.w wVar42222 = wVar2;
                        lVar2 = lVar;
                        xVar3 = xVar2;
                        r rVar2222 = new r(j0Var5, z9, r2Var2, x0Var3, wVar42222, qVar4);
                        r2Var3 = r2Var2;
                        pVar2.a0(rVar2222);
                        G11 = rVar2222;
                        s0.o d82222 = androidx.compose.ui.layout.a.d(lVar2, (q6.c) G11);
                        g2.d0 d0Var32222 = d0Var;
                        h12 = pVar2.h(d0Var32222) | (i19 != 4) | (i262 != 2048) | pVar2.g(false) | (i272 != 16384) | pVar2.h(j0Var5) | pVar2.h(qVar4) | pVar2.h(x0Var3) | ((i16 <= 32 && pVar2.f(mVar)) || (i18 & 48) == 32);
                        G12 = pVar2.G();
                        if (h12) {
                        }
                        i20 = i19;
                        lVar3 = lVar2;
                        a0.x0 x0Var82222 = x0Var3;
                        j0 j0Var92222 = j0Var5;
                        t tVar2222 = new t(d0Var32222, wVar, z9, mVar, j0Var92222, qVar4, x0Var82222, nVar2);
                        j0Var5 = j0Var92222;
                        x0Var4 = x0Var82222;
                        mVar4 = mVar;
                        pVar2.a0(tVar2222);
                        G12 = tVar2222;
                        s0.o a142222 = y1.k.a(lVar3, true, (q6.c) G12);
                        if (z9) {
                        }
                        float f122222 = o0.f9375a;
                        if (z17) {
                        }
                        h13 = pVar2.h(x0Var4);
                        G13 = pVar2.G();
                        if (!h13) {
                        }
                        G13 = new j(x0Var4, 0);
                        pVar2.a0(G13);
                        g0.d.d(x0Var4, (q6.c) G13, pVar2);
                        h14 = pVar2.h(j0Var5) | pVar2.h(xVar3) | (i20 != 4) | ((i16 <= 32 && pVar2.f(mVar4)) || (i18 & 48) == 32);
                        G14 = pVar2.G();
                        if (h14) {
                        }
                        g2.m mVar72222 = mVar4;
                        l.a aVar22222 = new l.a(j0Var5, xVar3, wVar, mVar72222, 5);
                        mVar5 = mVar72222;
                        pVar2.a0(aVar22222);
                        G14 = aVar22222;
                        g0.d.d(mVar5, (q6.c) G14, pVar2);
                        x0Var5 = x0Var4;
                        s0.o oVar52222 = oVar4;
                        s0.o a152222 = s0.a.a(lVar3, new r0(j0Var5, x0Var5, wVar, true, i7 != 1, qVar4, a1Var42, j0Var5.f9274t, mVar5.f4046e));
                        boolean booleanValue2222 = ((Boolean) z0Var.getValue()).booleanValue();
                        y.d dVar72222 = dVar2;
                        h15 = pVar2.h(j0Var5) | ((i16 <= 32 && pVar2.f(mVar5)) || (i18 & 48) == 32) | pVar2.h(dVar72222);
                        G15 = pVar2.G();
                        if (!h15) {
                        }
                        l.i0 i0Var2222 = new l.i0(j0Var5, nVar2, mVar5, dVar72222, 2);
                        pVar2.a0(i0Var2222);
                        G15 = i0Var2222;
                        g2.q qVar102222 = qVar4;
                        x0 x0Var92222 = x0Var;
                        s0.o d92222 = androidx.compose.ui.layout.a.d(s0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, dVar72222, j0Var5, x0Var5).j(androidx.compose.foundation.text.handwriting.a.a((q6.a) G15, booleanValue2222)).j(oVar2), new q.t0(gVar5, 13, j0Var5)), new q.t0(j0Var5, 12, x0Var5)).j(a152222), new m.o(x0Var92222, z9, jVar)).j(j122222).j(oVar52222), new p(j0Var5, 0));
                        if (z9) {
                        }
                        if (z18) {
                        }
                        pVar2 = pVar;
                        d(d92222, x0Var5, o0.f.b(-374338080, new n(aVar, j0Var5, k0Var, i8, i7, x0Var92222, wVar, sVar, lVar4, a132222, d82222, lVar3, cVar3, x0Var5, z18, cVar2, qVar102222, bVar2), pVar2), pVar2, 384);
                    }
                    z12 = false;
                    if (j0Var8 != null) {
                    }
                    if (z11) {
                    }
                    g2.j jVar42 = (g2.j) cVar5.f1070h;
                    jVar42.f4038d = -1;
                    jVar42.f4039e = -1;
                    a3 = g2.w.a(wVar, null, 0L, 3);
                    g2.w wVar32 = (g2.w) cVar5.f1069g;
                    cVar5.f1069g = a3;
                    if (c0Var != null) {
                    }
                    G3 = pVar2.G();
                    obj2 = obj;
                    if (G3 == obj2) {
                    }
                    a1Var = (a1) G3;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (a1Var.f9191e) {
                    }
                    a1Var3 = a1Var2;
                    a1Var3.f9190d = Long.valueOf(currentTimeMillis2);
                    a1Var3.a(wVar);
                    G4 = pVar2.G();
                    if (G4 == obj2) {
                    }
                    a0.x0 x0Var722 = (a0.x0) G4;
                    g2.q qVar722 = qVar;
                    x0Var722.f176b = qVar722;
                    x0Var722.f177c = j0Var7.f9274t;
                    x0Var722.f178d = j0Var7;
                    x0Var722.f179e.setValue(wVar);
                    x0Var722.f180f = (s1.b1) pVar2.k(f1.f8215d);
                    x0Var722.f181g = (i2) pVar2.k(f1.f8226o);
                    x0Var722.f182h = (h1.a) pVar2.k(f1.f8221j);
                    x0.n nVar422 = nVar;
                    x0Var722.f183i = nVar422;
                    x0Var722.f184j.setValue(true);
                    x0Var722.f185k.setValue(Boolean.valueOf(z9));
                    G5 = pVar2.G();
                    if (G5 == obj2) {
                    }
                    h7.c cVar622 = ((g0.y) G5).f3972f;
                    G6 = pVar2.G();
                    if (G6 == obj2) {
                    }
                    t.c cVar722 = (t.c) G6;
                    int i2622 = i23 & 7168;
                    int i2722 = i23 & 57344;
                    boolean h1622 = (i2622 == 2048) | pVar2.h(j0Var7) | (i2722 == 16384) | pVar2.h(xVar4);
                    int i2822 = i15;
                    boolean z1922 = h1622 | (i2822 == 4);
                    i16 = (i23 & 112) ^ 48;
                    a1 a1Var422 = a1Var3;
                    if (i16 > 32) {
                    }
                    i17 = i2822;
                    if ((i23 & 48) != 32) {
                    }
                    z13 = true;
                    h3 = z1922 | z13 | pVar2.h(qVar722) | pVar2.h(cVar622) | pVar2.h(cVar722) | pVar2.h(x0Var722);
                    G7 = pVar2.G();
                    if (h3) {
                    }
                    gVar5 = gVar3;
                    g2.m mVar62222 = mVar2;
                    i18 = i23;
                    x0Var = x0Var6;
                    dVar2 = dVar4;
                    d0Var = d0Var2;
                    jVar2 = jVar;
                    obj3 = obj2;
                    x0Var2 = x0Var722;
                    j0Var3 = j0Var7;
                    nVar2 = nVar422;
                    q qVar82222 = new q(j0Var3, z9, xVar4, wVar, mVar62222, qVar722, x0Var2, cVar622, cVar722);
                    wVar2 = wVar;
                    mVar3 = mVar62222;
                    cVar3 = cVar722;
                    z14 = z9;
                    xVar = xVar4;
                    pVar2.a0(qVar82222);
                    G7 = qVar82222;
                    s0.o a112222 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(nVar2), (q6.c) G7), z14, jVar2);
                    g0.z0 M2222 = g0.d.M(Boolean.valueOf(z14), pVar2);
                    boolean f112222 = pVar2.f(M2222) | pVar2.h(j0Var3) | pVar2.h(xVar) | pVar2.h(x0Var2);
                    if (i16 > 32) {
                    }
                    j0Var4 = j0Var3;
                    if ((i18 & 48) != 32) {
                    }
                    z15 = true;
                    z16 = z15 | f112222;
                    Object G2022222 = pVar2.G();
                    if (z16) {
                    }
                    x0Var3 = x0Var2;
                    g2.x xVar522222 = xVar;
                    qVar2 = qVar722;
                    oVar2 = a112222;
                    j0Var5 = j0Var4;
                    dVar3 = new androidx.room.d(j0Var5, M2222, xVar522222, x0Var3, mVar, null, 9);
                    z0Var = M2222;
                    xVar2 = xVar522222;
                    pVar2.a0(dVar3);
                    g0.d.e(pVar2, d6.z.f2639a, (q6.e) dVar3);
                    h8 = pVar2.h(j0Var5);
                    G8 = pVar2.G();
                    if (!h8) {
                    }
                    G8 = new p(j0Var5, 1);
                    pVar2.a0(G8);
                    a0.e0 e0Var22222 = new a0.e0((q6.c) G8, (h6.d) null, 0);
                    lVar = s0.l.f8103a;
                    a9 = l1.a0.a(lVar, 8675309, e0Var22222);
                    h9 = pVar2.h(j0Var5) | (i2722 != 16384) | (i2622 != 2048) | pVar2.h(qVar2) | pVar2.h(x0Var3);
                    G9 = pVar2.G();
                    if (h9) {
                    }
                    qVar3 = qVar2;
                    oVar3 = a9;
                    t3.l lVar522222 = new t3.l(j0Var5, nVar2, z9, x0Var3, qVar3);
                    pVar2.a0(lVar522222);
                    G9 = lVar522222;
                    if (!z9) {
                    }
                    b6.c cVar822222 = x0Var3.f195u;
                    a0.u0 u0Var22222 = x0Var3.f194t;
                    s0.o j1222222 = a12.j(new SuspendPointerInputElement(cVar822222, u0Var22222, new a0.a0(cVar822222, u0Var22222, (h6.d) null, 0), 4)).j(new PointerHoverIconModifierElement());
                    boolean h1722222 = pVar2.h(j0Var5);
                    i19 = i17;
                    h10 = h1722222 | (i19 != 4) | pVar2.h(qVar3);
                    G10 = pVar2.G();
                    int i2922222 = 12;
                    if (!h10) {
                    }
                    G10 = new c.h(j0Var5, wVar2, qVar3, i2922222);
                    pVar2.a0(G10);
                    s0.o a1322222 = androidx.compose.ui.draw.a.a(lVar, (q6.c) G10);
                    r2Var2 = r2Var;
                    h11 = pVar2.h(j0Var5) | (i2622 != 2048) | pVar2.f(r2Var2) | pVar2.h(x0Var3) | (i19 != 4) | pVar2.h(qVar3);
                    G11 = pVar2.G();
                    if (h11) {
                    }
                    qVar4 = qVar3;
                    g2.w wVar422222 = wVar2;
                    lVar2 = lVar;
                    xVar3 = xVar2;
                    r rVar22222 = new r(j0Var5, z9, r2Var2, x0Var3, wVar422222, qVar4);
                    r2Var3 = r2Var2;
                    pVar2.a0(rVar22222);
                    G11 = rVar22222;
                    s0.o d822222 = androidx.compose.ui.layout.a.d(lVar2, (q6.c) G11);
                    g2.d0 d0Var322222 = d0Var;
                    h12 = pVar2.h(d0Var322222) | (i19 != 4) | (i2622 != 2048) | pVar2.g(false) | (i2722 != 16384) | pVar2.h(j0Var5) | pVar2.h(qVar4) | pVar2.h(x0Var3) | ((i16 <= 32 && pVar2.f(mVar)) || (i18 & 48) == 32);
                    G12 = pVar2.G();
                    if (h12) {
                    }
                    i20 = i19;
                    lVar3 = lVar2;
                    a0.x0 x0Var822222 = x0Var3;
                    j0 j0Var922222 = j0Var5;
                    t tVar22222 = new t(d0Var322222, wVar, z9, mVar, j0Var922222, qVar4, x0Var822222, nVar2);
                    j0Var5 = j0Var922222;
                    x0Var4 = x0Var822222;
                    mVar4 = mVar;
                    pVar2.a0(tVar22222);
                    G12 = tVar22222;
                    s0.o a1422222 = y1.k.a(lVar3, true, (q6.c) G12);
                    if (z9) {
                    }
                    float f1222222 = o0.f9375a;
                    if (z17) {
                    }
                    h13 = pVar2.h(x0Var4);
                    G13 = pVar2.G();
                    if (!h13) {
                    }
                    G13 = new j(x0Var4, 0);
                    pVar2.a0(G13);
                    g0.d.d(x0Var4, (q6.c) G13, pVar2);
                    h14 = pVar2.h(j0Var5) | pVar2.h(xVar3) | (i20 != 4) | ((i16 <= 32 && pVar2.f(mVar4)) || (i18 & 48) == 32);
                    G14 = pVar2.G();
                    if (h14) {
                    }
                    g2.m mVar722222 = mVar4;
                    l.a aVar222222 = new l.a(j0Var5, xVar3, wVar, mVar722222, 5);
                    mVar5 = mVar722222;
                    pVar2.a0(aVar222222);
                    G14 = aVar222222;
                    g0.d.d(mVar5, (q6.c) G14, pVar2);
                    x0Var5 = x0Var4;
                    s0.o oVar522222 = oVar4;
                    s0.o a1522222 = s0.a.a(lVar3, new r0(j0Var5, x0Var5, wVar, true, i7 != 1, qVar4, a1Var422, j0Var5.f9274t, mVar5.f4046e));
                    boolean booleanValue22222 = ((Boolean) z0Var.getValue()).booleanValue();
                    y.d dVar722222 = dVar2;
                    h15 = pVar2.h(j0Var5) | ((i16 <= 32 && pVar2.f(mVar5)) || (i18 & 48) == 32) | pVar2.h(dVar722222);
                    G15 = pVar2.G();
                    if (!h15) {
                    }
                    l.i0 i0Var22222 = new l.i0(j0Var5, nVar2, mVar5, dVar722222, 2);
                    pVar2.a0(i0Var22222);
                    G15 = i0Var22222;
                    g2.q qVar1022222 = qVar4;
                    x0 x0Var922222 = x0Var;
                    s0.o d922222 = androidx.compose.ui.layout.a.d(s0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, dVar722222, j0Var5, x0Var5).j(androidx.compose.foundation.text.handwriting.a.a((q6.a) G15, booleanValue22222)).j(oVar2), new q.t0(gVar5, 13, j0Var5)), new q.t0(j0Var5, 12, x0Var5)).j(a1522222), new m.o(x0Var922222, z9, jVar)).j(j1222222).j(oVar522222), new p(j0Var5, 0));
                    if (z9) {
                    }
                    if (z18) {
                    }
                    pVar2 = pVar;
                    d(d922222, x0Var5, o0.f.b(-374338080, new n(aVar, j0Var5, k0Var, i8, i7, x0Var922222, wVar, sVar, lVar4, a1322222, d822222, lVar3, cVar3, x0Var5, z18, cVar2, qVar1022222, bVar2), pVar2), pVar2, 384);
                }
            }
            j0Var = o.j0.f6657f;
            Object[] objArr2 = {j0Var};
            androidx.room.c cVar42 = x0.f9454f;
            f9 = pVar2.f(j0Var);
            G = pVar2.G();
            if (!f9) {
            }
            G = new r1.z0(11, j0Var);
            pVar2.a0(G);
            x0 x0Var62 = (x0) a.a.E(objArr2, cVar42, (q6.a) G, pVar2, 0, 4);
            int i242 = i22 & 14;
            i14 = (i242 != 4 ? i13 : 0) | ((i22 & 57344) != 16384 ? i13 : 0);
            G2 = pVar2.G();
            if (i14 == 0) {
            }
            g2.d0 l82 = l(sVar, gVar6);
            if (j0Var6 == null) {
            }
            pVar2.a0(G2);
            g2.d0 d0Var22 = (g2.d0) G2;
            a2.g gVar82 = d0Var22.f4010a;
            g2.q qVar62 = d0Var22.f4011b;
            v5 = pVar2.v();
            if (v5 != null) {
            }
        }
        p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new o(wVar, cVar, oVar, k0Var, sVar, cVar2, jVar, r0Var, z8, i7, i8, mVar, h0Var, z9, aVar, i9, i10);
        }
    }

    public static final void d(s0.o oVar, a0.x0 x0Var, o0.a aVar, g0.p pVar, int i7) {
        pVar.S(-20551815);
        int i8 = (pVar.f(oVar) ? 4 : 2) | i7 | (pVar.h(x0Var) ? 32 : 16);
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            p1.f0 e9 = q.n.e(s0.b.f8078f, true);
            int i9 = pVar.P;
            k1 m8 = pVar.m();
            s0.o c4 = s0.a.c(pVar, oVar);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, e9, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i9))) {
                a0.m.q(i9, pVar, i9, hVar);
            }
            g0.d.Q(pVar, c4, r1.i.f7782c);
            b(x0Var, aVar, pVar, (i8 >> 3) & 126);
            pVar.p(true);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new x1(oVar, x0Var, aVar, i7, 7);
        }
    }

    public static final void e(a0.x0 x0Var, g0.p pVar, int i7) {
        pVar.S(-1436003720);
        if ((((pVar.h(x0Var) ? 4 : 2) | i7) & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            j0 j0Var = x0Var.f178d;
            int i8 = 0;
            if (j0Var != null) {
                int i9 = 1;
                if (((Boolean) j0Var.f9269o.getValue()).booleanValue()) {
                    j0 j0Var2 = x0Var.f178d;
                    a2.g gVar = j0Var2 != null ? j0Var2.f9255a.f9329a : null;
                    if (gVar != null && gVar.f373f.length() > 0) {
                        pVar.Q(-285446808);
                        boolean f9 = pVar.f(x0Var);
                        Object G = pVar.G();
                        Object obj = g0.l.f3784a;
                        if (f9 || G == obj) {
                            G = new a0.u0(x0Var, i8);
                            pVar.a0(G);
                        }
                        n0 n0Var = (n0) G;
                        m2.b bVar = (m2.b) pVar.k(f1.f8217f);
                        g2.q qVar = x0Var.f176b;
                        long j8 = x0Var.j().f4066b;
                        int i10 = a2.j0.f407c;
                        int b9 = qVar.b((int) (j8 >> 32));
                        j0 j0Var3 = x0Var.f178d;
                        z0 d8 = j0Var3 != null ? j0Var3.d() : null;
                        r6.k.c(d8);
                        a2.h0 h0Var = d8.f9471a;
                        y0.d c4 = h0Var.c(v1.g.e(b9, 0, h0Var.f388a.f377a.f373f.length()));
                        long a3 = u3.r.a((bVar.y(o0.f9375a) / 2) + c4.f9780a, c4.f9783d);
                        boolean e9 = pVar.e(a3);
                        Object G2 = pVar.G();
                        if (e9 || G2 == obj) {
                            G2 = new v(a3);
                            pVar.a0(G2);
                        }
                        a0.o oVar = (a0.o) G2;
                        boolean h3 = pVar.h(n0Var) | pVar.h(x0Var);
                        Object G3 = pVar.G();
                        if (h3 || G3 == obj) {
                            G3 = new a0.a0(n0Var, x0Var, (h6.d) null);
                            pVar.a0(G3);
                        }
                        s0.o a9 = l1.a0.a(s0.l.f8103a, n0Var, (q6.e) G3);
                        boolean e10 = pVar.e(a3);
                        Object G4 = pVar.G();
                        if (e10 || G4 == obj) {
                            G4 = new b(a3, i9);
                            pVar.a0(G4);
                        }
                        d.a(oVar, y1.k.a(a9, false, (q6.c) G4), 0L, pVar, 0);
                        pVar.p(false);
                    }
                }
            }
            pVar.Q(-284257090);
            pVar.p(false);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a2.a(i7, 19, x0Var);
        }
    }

    public static final void f(a0.x0 x0Var, boolean z8, g0.p pVar, int i7) {
        int i8;
        z0 d8;
        pVar.S(626339208);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(x0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.g(z8) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && pVar.x()) {
            pVar.L();
        } else if (z8) {
            pVar.Q(-1286242594);
            j0 j0Var = x0Var.f178d;
            a2.h0 h0Var = null;
            if (j0Var != null && (d8 = j0Var.d()) != null) {
                a2.h0 h0Var2 = d8.f9471a;
                j0 j0Var2 = x0Var.f178d;
                if (!(j0Var2 != null ? j0Var2.f9270p : true)) {
                    h0Var = h0Var2;
                }
            }
            if (h0Var == null) {
                pVar.Q(-1285984396);
            } else {
                pVar.Q(-1285984395);
                if (a2.j0.b(x0Var.j().f4066b)) {
                    pVar.Q(-1679637798);
                    pVar.p(false);
                } else {
                    pVar.Q(-1680616096);
                    int b9 = x0Var.f176b.b((int) (x0Var.j().f4066b >> 32));
                    int b10 = x0Var.f176b.b((int) (x0Var.j().f4066b & 4294967295L));
                    l2.h a3 = h0Var.a(b9);
                    l2.h a9 = h0Var.a(Math.max(b10 - 1, 0));
                    j0 j0Var3 = x0Var.f178d;
                    if (j0Var3 == null || !((Boolean) j0Var3.f9267m.getValue()).booleanValue()) {
                        pVar.Q(-1679975078);
                        pVar.p(false);
                    } else {
                        pVar.Q(-1680216289);
                        a8.d.k(true, a3, x0Var, pVar, ((i8 << 6) & 896) | 6);
                        pVar.p(false);
                    }
                    j0 j0Var4 = x0Var.f178d;
                    if (j0Var4 == null || !((Boolean) j0Var4.f9268n.getValue()).booleanValue()) {
                        pVar.Q(-1679655654);
                        pVar.p(false);
                    } else {
                        pVar.Q(-1679895904);
                        a8.d.k(false, a9, x0Var, pVar, ((i8 << 6) & 896) | 6);
                        pVar.p(false);
                    }
                    pVar.p(false);
                }
                j0 j0Var5 = x0Var.f178d;
                if (j0Var5 != null) {
                    g0.g1 g1Var = j0Var5.f9266l;
                    if (!r6.k.a(x0Var.f192r.f4065a.f373f, x0Var.j().f4065a.f373f)) {
                        g1Var.setValue(Boolean.FALSE);
                    }
                    if (j0Var5.b()) {
                        if (((Boolean) g1Var.getValue()).booleanValue()) {
                            x0Var.o();
                        } else {
                            x0Var.k();
                        }
                    }
                }
            }
            pVar.p(false);
            pVar.p(false);
        } else {
            pVar.Q(651305535);
            pVar.p(false);
            x0Var.k();
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new u(x0Var, z8, i7);
        }
    }

    public static final void g(j0 j0Var) {
        g2.c0 c0Var = j0Var.f9259e;
        if (c0Var != null) {
            j0Var.f9274t.f(g2.w.a((g2.w) j0Var.f9258d.f1069g, null, 0L, 3));
            g2.x xVar = c0Var.f4001a;
            AtomicReference atomicReference = xVar.f4069b;
            while (true) {
                if (atomicReference.compareAndSet(c0Var, null)) {
                    xVar.f4068a.h();
                    break;
                } else if (atomicReference.get() != c0Var) {
                    break;
                }
            }
        }
        j0Var.f9259e = null;
    }

    public static final y0.d h(m2.b bVar, int i7, g2.d0 d0Var, a2.h0 h0Var, boolean z8, int i8) {
        y0.d c4 = h0Var != null ? h0Var.c(d0Var.f4011b.b(i7)) : y0.d.f9779e;
        float f9 = c4.f9780a;
        int K = bVar.K(o0.f9375a);
        return new y0.d(z8 ? (i8 - f9) - K : f9, c4.f9781b, z8 ? i8 - f9 : K + f9, c4.f9783d);
    }

    public static final boolean i(KeyEvent keyEvent, int i7) {
        return ((int) (j1.c.Y(keyEvent) >> 32)) == i7;
    }

    public static final void j(g2.x xVar, j0 j0Var, g2.w wVar, g2.m mVar, g2.q qVar) {
        androidx.room.c cVar = j0Var.f9258d;
        p pVar = j0Var.f9274t;
        p pVar2 = j0Var.f9275u;
        r6.v vVar = new r6.v();
        c.h hVar = new c.h(cVar, pVar, vVar, 13);
        g2.r rVar = xVar.f4068a;
        rVar.d(wVar, mVar, hVar, pVar2);
        g2.c0 c0Var = new g2.c0(xVar, rVar);
        xVar.f4069b.set(c0Var);
        vVar.f7968f = c0Var;
        j0Var.f9259e = c0Var;
        q(j0Var, wVar, qVar);
    }

    public static final int k(float f9) {
        return Math.round((float) Math.ceil(f9));
    }

    public static final g2.d0 l(a0.s sVar, a2.g gVar) {
        sVar.getClass();
        int length = gVar.f373f.length();
        int length2 = gVar.f373f.length();
        int min = Math.min(length, 100);
        for (int i7 = 0; i7 < min; i7++) {
            t(i7, length2, i7);
        }
        t(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i8 = 0; i8 < min2; i8++) {
            u(i8, length, i8);
        }
        u(length2, length, length2);
        return new g2.d0(gVar, new c1(gVar.f373f.length(), gVar.f373f.length()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.b() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m(String str, int i7) {
        l3.k kVar;
        String str2;
        int i8;
        Integer num = null;
        if (l3.k.c()) {
            kVar = l3.k.a();
        }
        kVar = null;
        if (kVar != null) {
            b1.b bVar = kVar.f5912e.f5898b;
            bVar.getClass();
            if (i7 < 0 || i7 >= str.length()) {
                str2 = str;
                i8 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    l3.w[] wVarArr = (l3.w[]) spanned.getSpans(i7, i7 + 1, l3.w.class);
                    if (wVarArr.length > 0) {
                        i8 = spanned.getSpanEnd(wVarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i8 = ((l3.r) bVar.x(str2, Math.max(0, i7 - 16), Math.min(str.length(), i7 + 16), Integer.MAX_VALUE, true, new l3.r(i7))).f5924h;
            }
            Integer valueOf = Integer.valueOf(i8);
            if (i8 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i7);
    }

    public static final int n(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        while (i7 < length) {
            if (charSequence.charAt(i7) == '\n') {
                return i7;
            }
            i7++;
        }
        return charSequence.length();
    }

    public static final int o(CharSequence charSequence, int i7) {
        while (i7 > 0) {
            if (charSequence.charAt(i7 - 1) == '\n') {
                return i7;
            }
            i7--;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.b() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int p(String str, int i7) {
        l3.k kVar;
        String str2;
        int i8;
        Integer num = null;
        if (l3.k.c()) {
            kVar = l3.k.a();
        }
        kVar = null;
        if (kVar != null) {
            int max = Math.max(0, i7 - 1);
            b1.b bVar = kVar.f5912e.f5898b;
            bVar.getClass();
            if (max < 0 || max >= str.length()) {
                str2 = str;
                i8 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    l3.w[] wVarArr = (l3.w[]) spanned.getSpans(max, max + 1, l3.w.class);
                    if (wVarArr.length > 0) {
                        i8 = spanned.getSpanStart(wVarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i8 = ((l3.r) bVar.x(str2, Math.max(0, max - 16), Math.min(str.length(), max + 16), Integer.MAX_VALUE, true, new l3.r(max))).f5923g;
            }
            Integer valueOf = Integer.valueOf(i8);
            if (i8 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.preceding(i7);
    }

    public static final void q(j0 j0Var, g2.w wVar, g2.q qVar) {
        q0.g c4 = q0.r.c();
        q6.c f9 = c4 != null ? c4.f() : null;
        q0.g d8 = q0.r.d(c4);
        try {
            z0 d9 = j0Var.d();
            if (d9 == null) {
                return;
            }
            g2.c0 c0Var = j0Var.f9259e;
            if (c0Var == null) {
                return;
            }
            p1.p c6 = j0Var.c();
            if (c6 == null) {
                return;
            }
            r(wVar, j0Var.f9255a, d9.f9471a, c6, c0Var, j0Var.b(), qVar);
        } finally {
            q0.r.f(c4, d8, f9);
        }
    }

    public static void r(g2.w wVar, m0 m0Var, a2.h0 h0Var, p1.p pVar, g2.c0 c0Var, boolean z8, g2.q qVar) {
        long a3;
        y0.d dVar;
        if (z8) {
            int b9 = qVar.b(a2.j0.d(wVar.f4066b));
            if (b9 < h0Var.f388a.f377a.f373f.length()) {
                dVar = h0Var.b(b9);
            } else if (b9 != 0) {
                dVar = h0Var.b(b9 - 1);
            } else {
                a3 = p0.a(m0Var.f9330b, m0Var.f9335g, m0Var.f9336h, p0.f9378a, 1);
                dVar = new y0.d(0.0f, 0.0f, 1.0f, (int) (a3 & 4294967295L));
            }
            long W = pVar.W(u3.r.a(dVar.f9780a, dVar.f9781b));
            y0.d a9 = u3.t.a(u3.r.a(y0.c.d(W), y0.c.e(W)), v0.d.a(dVar.c(), dVar.b()));
            if (r6.k.a((g2.c0) c0Var.f4001a.f4069b.get(), c0Var)) {
                c0Var.f4002b.b(a9);
            }
        }
    }

    public static final void s(int i7, int i8) {
        if (i7 > 0 && i8 > 0) {
            if (i7 > i8) {
                throw new IllegalArgumentException(r6.i.b(i7, i8, "minLines ", " must be less than or equal to maxLines ").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i7 + " and maxLines " + i8 + " must be greater than zero").toString());
    }

    public static final void t(int i7, int i8, int i9) {
        if (i7 < 0 || i7 > i8) {
            StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
            sb.append(i9);
            sb.append(" -> ");
            sb.append(i7);
            sb.append(" is not in range of transformed text [0, ");
            throw new IllegalStateException(a0.m.l(sb, i8, ']').toString());
        }
    }

    public static final void u(int i7, int i8, int i9) {
        if (i7 < 0 || i7 > i8) {
            StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            sb.append(i9);
            sb.append(" -> ");
            sb.append(i7);
            sb.append(" is not in range of original text [0, ");
            throw new IllegalStateException(a0.m.l(sb, i8, ']').toString());
        }
    }
}
