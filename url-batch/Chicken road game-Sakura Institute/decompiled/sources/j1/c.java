package j1;

import a0.e0;
import a0.s;
import a0.x0;
import a0.y;
import a2.k0;
import a8.m;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.c1;
import androidx.lifecycle.w0;
import b.m0;
import c7.q;
import com.android.installreferrer.R;
import com.chicken.road.whale.store.Meal;
import d0.b0;
import d0.d2;
import d0.k3;
import d6.z;
import e6.u;
import e7.h;
import e7.i;
import f1.f;
import g0.h2;
import g0.k1;
import g0.l;
import g0.p;
import g0.p1;
import g0.t0;
import g0.z0;
import g4.d0;
import g4.o0;
import g4.q0;
import g4.x;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import l1.a0;
import l1.c0;
import l1.t;
import l1.v;
import n.j;
import n.k;
import o7.a1;
import o7.r0;
import p1.f0;
import q.n;
import q6.g;
import r6.w;
import s0.o;
import s1.l2;
import w.j0;
import w.n0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c implements Decoder, n7.a {

    /* renamed from: a, reason: collision with root package name */
    public static f f4987a;

    /* renamed from: b, reason: collision with root package name */
    public static String f4988b;

    /* renamed from: c, reason: collision with root package name */
    public static int f4989c;

    public static final void B(o oVar, q6.c cVar, p pVar, int i7) {
        pVar.S(-932836462);
        if ((((pVar.f(oVar) ? 4 : 2) | i7 | (pVar.h(cVar) ? 32 : 16)) & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            q.c.a(pVar, androidx.compose.ui.draw.a.a(oVar, cVar));
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new b0(i7, 5, oVar, cVar);
        }
    }

    public static e7.e C(int i7, int i8, e7.a aVar) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        int i9 = i8 & 2;
        e7.a aVar2 = e7.a.f2833f;
        if (i9 != 0) {
            aVar = aVar2;
        }
        if (i7 == -2) {
            if (aVar != aVar2) {
                return new e7.p(1, aVar);
            }
            i.f2878a.getClass();
            return new e7.e(h.f2877b);
        }
        if (i7 != -1) {
            return i7 != 0 ? i7 != Integer.MAX_VALUE ? aVar == aVar2 ? new e7.e(i7) : new e7.p(i7, aVar) : new e7.e(Integer.MAX_VALUE) : aVar == aVar2 ? new e7.e(0) : new e7.p(1, aVar);
        }
        if (aVar == aVar2) {
            return new e7.p(1, e7.a.f2834g);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final void D(j jVar, q6.a aVar, o oVar, y yVar, p pVar, int i7) {
        int i8;
        pVar.S(645832757);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(jVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        int i9 = i8 | 384;
        if ((i7 & 3072) == 0) {
            i9 |= pVar.h(yVar) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            n.i iVar = (n.i) jVar.f6493a.getValue();
            if (!(iVar instanceof n.h)) {
                p1 r8 = pVar.r();
                if (r8 != null) {
                    r8.f3853d = new a0.a(jVar, aVar, yVar, i7);
                    return;
                }
                return;
            }
            boolean f9 = pVar.f(iVar);
            Object G = pVar.G();
            if (f9 || G == l.f3784a) {
                G = new n.d(m.I(((n.h) iVar).f6492a));
                pVar.a0(G);
            }
            k.c((n.d) G, aVar, yVar, pVar, i9 & 8176);
            oVar = s0.l.f8103a;
        }
        o oVar2 = oVar;
        p1 r9 = pVar.r();
        if (r9 != null) {
            r9.f3853d = new d0.l(jVar, aVar, oVar2, yVar, i7);
        }
    }

    public static final void E(j jVar, q6.a aVar, y yVar, o oVar, boolean z8, o0.a aVar2, p pVar, int i7) {
        int i8;
        y yVar2;
        o oVar2;
        pVar.S(-84584070);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(jVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            yVar2 = yVar;
            i8 |= pVar.h(yVar2) ? 256 : 128;
        } else {
            yVar2 = yVar;
        }
        int i9 = i8 | 3072;
        if ((i7 & 24576) == 0) {
            i9 |= pVar.g(z8) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i9 |= pVar.h(aVar2) ? 131072 : 65536;
        }
        if ((74899 & i9) == 74898 && pVar.x()) {
            pVar.L();
            oVar2 = oVar;
        } else {
            oVar2 = s0.l.f8103a;
            o a3 = z8 ? a0.a(oVar2, n.c.f6475a, new e0(jVar, (h6.d) null, 19)) : oVar2;
            f0 e9 = n.e(s0.b.f8078f, true);
            int i10 = pVar.P;
            k1 m8 = pVar.m();
            o c4 = s0.a.c(pVar, a3);
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
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i10))) {
                a0.m.q(i10, pVar, i10, hVar);
            }
            g0.d.Q(pVar, c4, r1.i.f7782c);
            aVar2.d(pVar, Integer.valueOf((i9 >> 15) & 14));
            D(jVar, aVar, null, yVar2, pVar, (i9 & 126) | ((i9 << 3) & 7168));
            pVar.p(true);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new d2(jVar, aVar, yVar, oVar2, z8, aVar2, i7);
        }
    }

    public static final m2.d F(Context context) {
        float f9 = context.getResources().getConfiguration().fontScale;
        float f10 = context.getResources().getDisplayMetrics().density;
        n2.a a3 = n2.b.a(f9);
        if (a3 == null) {
            a3 = new m2.l(f9);
        }
        return new m2.d(f10, f9, a3);
    }

    public static final long G(int i7, int i8) {
        return (i8 & 4294967295L) | (i7 << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void H(int i7, p pVar) {
        Object obj;
        boolean z8;
        final z0 z0Var;
        final z0 z0Var2;
        Object G;
        t0 t0Var = t0.f3903k;
        pVar.S(-426886047);
        if (i7 == 0 && pVar.x()) {
            pVar.L();
        } else {
            e4.a j8 = a.a.j(pVar);
            pVar.R(1729797275);
            c1 a3 = r3.b.a(pVar);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w0 Q = a.a.Q(w.a(q0.class), a3, j8, a3 instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) a3).d() : q3.a.f7511b, pVar);
            pVar.p(false);
            final q0 q0Var = (q0) Q;
            z0 P = P(q0Var.f4365c, pVar);
            pVar.Q(-761087369);
            Object G2 = pVar.G();
            Object obj2 = l.f3784a;
            if (G2 == obj2) {
                G2 = g0.d.J(null, t0Var);
                pVar.a0(G2);
            }
            z0 z0Var3 = (z0) G2;
            pVar.p(false);
            pVar.Q(-761085455);
            Object G3 = pVar.G();
            if (G3 == obj2) {
                G3 = g0.d.J(Boolean.FALSE, t0Var);
                pVar.a0(G3);
            }
            z0 z0Var4 = (z0) G3;
            pVar.p(false);
            k3.a(null, x.f4436b, null, null, o0.f.b(1576288744, new d0(z0Var4, 3), pVar), 0, 0L, 0L, null, o0.f.b(1022771376, new o0(P, q0Var, z0Var3), pVar), pVar, 805330992, 493);
            pVar.Q(-761014534);
            if (((Boolean) z0Var4.getValue()).booleanValue()) {
                pVar.Q(-761011898);
                boolean h3 = pVar.h(q0Var);
                Object G4 = pVar.G();
                if (h3) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (G4 != obj) {
                        z0Var2 = z0Var4;
                        g gVar = (g) G4;
                        z8 = false;
                        pVar.p(false);
                        pVar.Q(-761009342);
                        G = pVar.G();
                        if (G == obj) {
                            G = new g4.b0(z0Var2, 3);
                            pVar.a0(G);
                        }
                        pVar.p(false);
                        a8.d.e(null, gVar, (q6.a) G, pVar, 390);
                    }
                }
                z0Var2 = z0Var4;
                G4 = new g() { // from class: g4.k0
                    @Override // q6.g
                    public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                        String str = (String) obj3;
                        String str2 = (String) obj4;
                        String str3 = (String) obj5;
                        String str4 = (String) obj6;
                        r6.k.f(str, "n");
                        r6.k.f(str2, "c");
                        r6.k.f(str3, "i");
                        r6.k.f(str4, "no");
                        q0 q0Var2 = q0.this;
                        c7.a0.p(androidx.lifecycle.q0.j(q0Var2), null, null, new androidx.room.d(q0Var2, str, str2, str3, str4, null, 3), 3);
                        z0Var2.setValue(Boolean.FALSE);
                        return d6.z.f2639a;
                    }
                };
                pVar.a0(G4);
                g gVar2 = (g) G4;
                z8 = false;
                pVar.p(false);
                pVar.Q(-761009342);
                G = pVar.G();
                if (G == obj) {
                }
                pVar.p(false);
                a8.d.e(null, gVar2, (q6.a) G, pVar, 390);
            } else {
                obj = obj2;
                z8 = false;
            }
            pVar.p(z8);
            final Meal meal = (Meal) z0Var3.getValue();
            if (meal != null) {
                pVar.Q(-908480746);
                boolean h8 = pVar.h(q0Var) | pVar.f(meal);
                Object G5 = pVar.G();
                if (h8 || G5 == obj) {
                    z0Var = z0Var3;
                    G5 = new g() { // from class: g4.l0
                        @Override // q6.g
                        public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                            String str = (String) obj3;
                            String str2 = (String) obj4;
                            String str3 = (String) obj5;
                            String str4 = (String) obj6;
                            r6.k.f(str, "n");
                            r6.k.f(str2, "c");
                            r6.k.f(str3, "i");
                            r6.k.f(str4, "no");
                            Meal copy$default = Meal.copy$default(meal, 0L, str, str2, str3, str4, 1, null);
                            r6.k.f(copy$default, "meal");
                            q0 q0Var2 = q0.this;
                            c7.a0.p(androidx.lifecycle.q0.j(q0Var2), null, null, new p0(q0Var2, copy$default, null, 1), 3);
                            z0Var.setValue(null);
                            return d6.z.f2639a;
                        }
                    };
                    pVar.a0(G5);
                } else {
                    z0Var = z0Var3;
                }
                g gVar3 = (g) G5;
                pVar.p(z8);
                pVar.Q(-908476673);
                Object G6 = pVar.G();
                if (G6 == obj) {
                    G6 = new g4.b0(z0Var, 4);
                    pVar.a0(G6);
                }
                pVar.p(z8);
                a8.d.e(meal, gVar3, (q6.a) G6, pVar, 384);
            }
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new q(i7, 6);
        }
    }

    public static a2.b I(String str, k0 k0Var, long j8, m2.b bVar, f2.d dVar, int i7, int i8) {
        u uVar = u.f2826f;
        return new a2.b(new i2.d(str, k0Var, uVar, uVar, dVar, bVar), i7, false, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(c0 c0Var, j6.a aVar) {
        a0.w wVar;
        int i7;
        i6.a aVar2;
        int size;
        int i8;
        if (aVar instanceof a0.w) {
            wVar = (a0.w) aVar;
            int i9 = wVar.f168h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                wVar.f168h = i9 - Integer.MIN_VALUE;
                Object obj = wVar.f167g;
                i7 = wVar.f168h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    wVar.f166f = c0Var;
                    wVar.f168h = 1;
                    obj = c0Var.b(l1.k.f5816g, wVar);
                    aVar2 = i6.a.f4956f;
                    if (obj == aVar2) {
                    }
                    l1.j jVar = (l1.j) obj;
                    ?? r12 = jVar.f5812a;
                    size = r12.size();
                    i8 = 0;
                    while (i8 < size) {
                    }
                    return jVar;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = wVar.f166f;
                d6.a.e(obj);
                l1.j jVar2 = (l1.j) obj;
                ?? r122 = jVar2.f5812a;
                size = r122.size();
                i8 = 0;
                while (i8 < size) {
                    if (t.a((v) r122.get(i8))) {
                        i8++;
                    } else {
                        wVar.f166f = c0Var;
                        wVar.f168h = 1;
                        obj = c0Var.b(l1.k.f5816g, wVar);
                        aVar2 = i6.a.f4956f;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        l1.j jVar22 = (l1.j) obj;
                        ?? r1222 = jVar22.f5812a;
                        size = r1222.size();
                        i8 = 0;
                        while (i8 < size) {
                        }
                    }
                }
                return jVar22;
            }
        }
        wVar = new a0.w(aVar);
        Object obj2 = wVar.f167g;
        i7 = wVar.f168h;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(c0 c0Var, b6.c cVar, a0.l lVar, l1.j jVar, j6.a aVar) {
        a0.x xVar;
        int i7;
        x0 x0Var;
        b6.c cVar2;
        b6.c cVar3;
        j0 j0Var;
        if (aVar instanceof a0.x) {
            xVar = (a0.x) aVar;
            int i8 = xVar.f174i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                xVar.f174i = i8 - Integer.MIN_VALUE;
                Object obj = xVar.f173h;
                i7 = xVar.f174i;
                int i9 = 0;
                boolean z8 = true;
                if (i7 == 0) {
                    if (i7 == 1) {
                        b6.c cVar4 = xVar.f172g;
                        c0 c0Var2 = xVar.f171f;
                        d6.a.e(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ?? r12 = c0Var2.f5784j.f5792w.f5812a;
                            int size = r12.size();
                            while (i9 < size) {
                                v vVar = (v) r12.get(i9);
                                if (t.b(vVar)) {
                                    vVar.a();
                                }
                                i9++;
                            }
                        }
                        cVar4.getClass();
                        return z.f2639a;
                    }
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar3 = xVar.f172g;
                    c0Var = xVar.f171f;
                    d6.a.e(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ?? r11 = c0Var.f5784j.f5792w.f5812a;
                        int size2 = r11.size();
                        while (i9 < size2) {
                            v vVar2 = (v) r11.get(i9);
                            if (t.b(vVar2)) {
                                vVar2.a();
                            }
                            i9++;
                        }
                    }
                    cVar3.getClass();
                    return z.f2639a;
                }
                d6.a.e(obj);
                l2 l2Var = (l2) lVar.f101h;
                v vVar3 = (v) lVar.f102i;
                v vVar4 = (v) jVar.f5812a.get(0);
                if (vVar3 != null && vVar4.f5831b - vVar3.f5831b < l2Var.b()) {
                    int i10 = vVar3.f5838i;
                    float f9 = o.y.f6798a;
                    if (y0.c.c(y0.c.g(vVar3.f5832c, vVar4.f5832c)) < (i10 == 2 ? l2Var.d() * o.y.f6798a : l2Var.d())) {
                        lVar.f100g++;
                        lVar.f102i = vVar4;
                        v vVar5 = (v) jVar.f5812a.get(0);
                        int i11 = lVar.f100g;
                        s sVar = i11 == 1 ? i11 != 2 ? a0.t.f143f : a0.t.f142e : a0.t.f141d;
                        long j8 = vVar5.f5832c;
                        x0Var = (x0) cVar.f1394g;
                        if (x0Var.h() || x0Var.j().f4065a.f373f.length() == 0 || (j0Var = x0Var.f178d) == null || j0Var.d() == null) {
                            cVar2 = cVar;
                            z8 = false;
                        } else {
                            x0.n nVar = x0Var.f183i;
                            if (nVar != null) {
                                nVar.a(x0.h.f9609k);
                            }
                            x0Var.f186l = j8;
                            x0Var.f191q = -1;
                            x0Var.f(true);
                            cVar2 = cVar;
                            cVar2.D(x0Var.j(), x0Var.f186l, true, sVar);
                        }
                        if (z8) {
                            long j9 = vVar5.f5830a;
                            y yVar = new y(cVar2, i9, sVar);
                            xVar.f171f = c0Var;
                            xVar.f172g = cVar2;
                            xVar.f174i = 2;
                            obj = o.y.c(c0Var, j9, yVar, xVar);
                            i6.a aVar2 = i6.a.f4956f;
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            cVar3 = cVar2;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            cVar3.getClass();
                        }
                        return z.f2639a;
                    }
                }
                lVar.f100g = 1;
                lVar.f102i = vVar4;
                v vVar52 = (v) jVar.f5812a.get(0);
                int i112 = lVar.f100g;
                s sVar2 = i112 == 1 ? i112 != 2 ? a0.t.f143f : a0.t.f142e : a0.t.f141d;
                long j82 = vVar52.f5832c;
                x0Var = (x0) cVar.f1394g;
                if (x0Var.h()) {
                }
                cVar2 = cVar;
                z8 = false;
                if (z8) {
                }
                return z.f2639a;
            }
        }
        xVar = new a0.x(aVar);
        Object obj2 = xVar.f173h;
        i7 = xVar.f174i;
        int i92 = 0;
        boolean z82 = true;
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        if (r14 == r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00ac, B:15:0x00b4, B:17:0x00c0, B:19:0x00cc, B:21:0x00cf, B:24:0x00d2, B:28:0x00d6, B:32:0x0041, B:34:0x0064, B:36:0x0068, B:38:0x0074, B:39:0x0080, B:43:0x0092, B:47:0x007c, B:49:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(c0 c0Var, n0 n0Var, l1.j jVar, j6.a aVar) {
        a0.b0 b0Var;
        int i7;
        v vVar;
        v vVar2;
        try {
            if (aVar instanceof a0.b0) {
                b0Var = (a0.b0) aVar;
                int i8 = b0Var.f20j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    b0Var.f20j = i8 - Integer.MIN_VALUE;
                    Object obj = b0Var.f19i;
                    i7 = b0Var.f20j;
                    int i9 = 0;
                    boolean z8 = true;
                    i6.a aVar2 = i6.a.f4956f;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        vVar = (v) e6.l.h0(jVar.f5812a);
                        long j8 = vVar.f5830a;
                        b0Var.f16f = c0Var;
                        b0Var.f17g = n0Var;
                        b0Var.f18h = vVar;
                        b0Var.f20j = 1;
                        obj = o.y.b(c0Var, j8, b0Var);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            n0Var = b0Var.f17g;
                            c0Var = b0Var.f16f;
                            d6.a.e(obj);
                            if (((Boolean) obj).booleanValue()) {
                                ?? r11 = c0Var.f5784j.f5792w.f5812a;
                                int size = r11.size();
                                while (i9 < size) {
                                    v vVar3 = (v) r11.get(i9);
                                    if (t.b(vVar3)) {
                                        vVar3.a();
                                    }
                                    i9++;
                                }
                                n0Var.a();
                            } else {
                                n0Var.onCancel();
                            }
                            return z.f2639a;
                        }
                        v vVar4 = b0Var.f18h;
                        n0Var = b0Var.f17g;
                        c0 c0Var2 = b0Var.f16f;
                        d6.a.e(obj);
                        vVar = vVar4;
                        c0Var = c0Var2;
                    }
                    vVar2 = (v) obj;
                    if (vVar2 != null) {
                        long j9 = vVar2.f5832c;
                        l2 e9 = c0Var.e();
                        int i10 = vVar.f5838i;
                        float f9 = o.y.f6798a;
                        if (y0.c.c(y0.c.g(vVar.f5832c, j9)) >= (i10 == 2 ? e9.d() * o.y.f6798a : e9.d())) {
                            z8 = false;
                        }
                        if (z8) {
                            n0Var.c(j9);
                            long j10 = vVar2.f5830a;
                            a0.c0 c0Var3 = new a0.c0(n0Var, i9);
                            b0Var.f16f = c0Var;
                            b0Var.f17g = n0Var;
                            b0Var.f18h = null;
                            b0Var.f20j = 2;
                            obj = o.y.c(c0Var, j10, c0Var3, b0Var);
                        }
                    }
                    return z.f2639a;
                }
            }
            if (i7 != 0) {
            }
            vVar2 = (v) obj;
            if (vVar2 != null) {
            }
            return z.f2639a;
        } catch (CancellationException e10) {
            n0Var.onCancel();
            throw e10;
        }
        b0Var = new a0.b0(aVar);
        Object obj2 = b0Var.f19i;
        i7 = b0Var.f20j;
        int i92 = 0;
        boolean z82 = true;
        i6.a aVar22 = i6.a.f4956f;
    }

    public static void N(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 > i8) {
                throw new IllegalArgumentException(r6.i.b(i7, i8, "startIndex: ", " > endIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i7 + ", endIndex: " + i8 + ", size: " + i9);
    }

    public static void O(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 > i8) {
                throw new IllegalArgumentException(r6.i.b(i7, i8, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
    }

    public static final z0 P(f7.o0 o0Var, p pVar) {
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) pVar.k(p3.b.f7197a);
        Object value = o0Var.getValue();
        Object f9 = vVar.f();
        Object obj = androidx.lifecycle.o.f1010i;
        Object obj2 = h6.j.f4661f;
        Object[] objArr = {o0Var, f9, obj, obj2};
        boolean h3 = pVar.h(f9) | pVar.f(obj) | pVar.h(obj2) | pVar.h(o0Var);
        Object G = pVar.G();
        Object obj3 = l.f3784a;
        if (h3 || G == obj3) {
            Object dVar = new androidx.room.d(f9, obj, obj2, o0Var, null, 7);
            pVar.a0(dVar);
            G = dVar;
        }
        q6.e eVar = (q6.e) G;
        Object G2 = pVar.G();
        if (G2 == obj3) {
            G2 = g0.d.J(value, t0.f3903k);
            pVar.a0(G2);
        }
        z0 z0Var = (z0) G2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h8 = pVar.h(eVar);
        Object G3 = pVar.G();
        if (h8 || G3 == obj3) {
            G3 = new h2(eVar, z0Var, null, 2);
            pVar.a0(G3);
        }
        q6.e eVar2 = (q6.e) G3;
        h6.i h9 = pVar.f3821b.h();
        boolean z8 = false;
        for (Object obj4 : Arrays.copyOf(copyOf, copyOf.length)) {
            z8 |= pVar.f(obj4);
        }
        Object G4 = pVar.G();
        if (!z8 && G4 != obj3) {
            return z0Var;
        }
        pVar.a0(new g0.q0(h9, eVar2));
        return z0Var;
    }

    public static e5.c Q(String str, String str2) {
        b6.a aVar = new b6.a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e5.t.a(b6.a.class));
        for (Class cls : new Class[0]) {
            m.n(cls, "Null interface");
            hashSet.add(e5.t.a(cls));
        }
        return new e5.c(null, new HashSet(hashSet), new HashSet(hashSet2), 1, new e5.a(0, aVar), hashSet3);
    }

    public static long S(t5.o oVar) {
        long j8 = 8;
        if (!(oVar instanceof t5.j) && !(oVar instanceof t5.p)) {
            if (oVar instanceof t5.a) {
                j8 = 4;
            } else {
                if (!(oVar instanceof t5.v)) {
                    throw new IllegalArgumentException("Unknown leaf node type: " + oVar.getClass());
                }
                j8 = ((t5.v) oVar).f8926h.length() + 2;
            }
        }
        if (oVar.f8914f.isEmpty()) {
            return j8;
        }
        return S((t5.o) oVar.f8914f) + j8 + 24;
    }

    public static long T(t5.s sVar) {
        if (sVar.isEmpty()) {
            return 4L;
        }
        if (sVar.i()) {
            return S((t5.o) sVar);
        }
        o5.j.b("Unexpected node type: " + sVar.getClass(), sVar instanceof t5.f);
        Iterator it = sVar.iterator();
        long j8 = 1;
        while (it.hasNext()) {
            j8 = j8 + r5.f8919a.f8889f.length() + 4 + T(((t5.q) it.next()).f8920b);
        }
        if (sVar.c().isEmpty()) {
            return j8;
        }
        return S((t5.o) sVar.c()) + j8 + 12;
    }

    public static final int U(int i7, Object obj, r.h hVar) {
        int b9;
        return (obj == null || hVar.c() == 0 || (i7 < hVar.c() && obj.equals(hVar.d(i7))) || (b9 = hVar.f7607d.b(obj)) == -1) ? i7 : b9;
    }

    public static e5.c V(String str, s sVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e5.t.a(b6.a.class));
        for (Class cls : new Class[0]) {
            m.n(cls, "Null interface");
            hashSet.add(e5.t.a(cls));
        }
        e5.l lVar = new e5.l(1, 0, Context.class);
        if (hashSet.contains(lVar.f2785a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(lVar);
        return new e5.c(null, new HashSet(hashSet), new HashSet(hashSet2), 1, new b6.d(str, 0, sVar), hashSet3);
    }

    public static s7.q W(String str) {
        if (str.equals("http/1.0")) {
            return s7.q.f8662g;
        }
        if (str.equals("http/1.1")) {
            return s7.q.f8663h;
        }
        if (str.equals("h2_prior_knowledge")) {
            return s7.q.f8666k;
        }
        if (str.equals("h2")) {
            return s7.q.f8665j;
        }
        if (str.equals("spdy/3.1")) {
            return s7.q.f8664i;
        }
        if (str.equals("quic")) {
            return s7.q.f8667l;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static Set X() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final long Y(KeyEvent keyEvent) {
        return r4.a.d(keyEvent.getKeyCode());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String Z() {
        BufferedReader bufferedReader;
        String processName;
        if (f4988b == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f4988b = processName;
            } else {
                int i7 = f4989c;
                if (i7 == 0) {
                    i7 = Process.myPid();
                    f4989c = i7;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i7 > 0) {
                    try {
                        String str2 = "/proc/" + i7 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                m4.o.d(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                f4988b = str;
            }
        }
        return f4988b;
    }

    public static final f3.a a0(View view) {
        f3.a aVar = (f3.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        f3.a aVar2 = new f3.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final a2.g b0(g2.w wVar) {
        a2.g gVar = wVar.f4065a;
        long j8 = wVar.f4066b;
        gVar.getClass();
        return gVar.subSequence(a2.j0.e(j8), a2.j0.d(j8));
    }

    public static final a2.g c0(g2.w wVar, int i7) {
        a2.g gVar = wVar.f4065a;
        long j8 = wVar.f4066b;
        return gVar.subSequence(a2.j0.d(j8), Math.min(a2.j0.d(j8) + i7, wVar.f4065a.f373f.length()));
    }

    public static final a2.g d0(g2.w wVar, int i7) {
        a2.g gVar = wVar.f4065a;
        long j8 = wVar.f4066b;
        return gVar.subSequence(Math.max(0, a2.j0.e(j8) - i7), a2.j0.e(j8));
    }

    public static final int e0(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final int f0(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean g0(l1.j jVar) {
        ?? r52 = jVar.f5812a;
        int size = r52.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((v) r52.get(i7)).f5838i != 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean h0(t5.s sVar) {
        if (sVar.c().isEmpty()) {
            return sVar.isEmpty() || (sVar instanceof t5.j) || (sVar instanceof t5.v) || (sVar instanceof t5.i);
        }
        return false;
    }

    public static final ArrayList i0(Map map, q6.c cVar) {
        r6.k.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() != null) {
                throw new ClassCastException();
            }
            r6.k.c(null);
            throw null;
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) cVar.f((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static t5.s j0(Object obj) {
        t5.k kVar = t5.k.f8908j;
        t5.s d8 = m.d(obj, kVar);
        if (d8 instanceof t5.p) {
            d8 = new t5.j(Double.valueOf(((t5.p) d8).f8916h), kVar);
        }
        if (h0(d8)) {
            return d8;
        }
        throw new g5.b("Node contains invalid priority: Must be a string, double, ServerValue, or null");
    }

    public static final void k0(h0.d0 d0Var, int i7, int i8) {
        int i9 = 1 << i7;
        int i10 = d0Var.f4613m;
        if ((i10 & i9) == 0) {
            d0Var.f4613m = i9 | i10;
            d0Var.f4609i[(d0Var.f4610j - d0Var.Y().f4604a) + i7] = i8;
        } else {
            g0.d.S("Already pushed argument " + d0Var.Y().b(i7));
            throw null;
        }
    }

    public static final void l0(h0.d0 d0Var, int i7, Object obj) {
        int i8 = 1 << i7;
        int i9 = d0Var.f4614n;
        if ((i9 & i8) == 0) {
            d0Var.f4614n = i8 | i9;
            d0Var.f4611k[(d0Var.f4612l - d0Var.Y().f4605b) + i7] = obj;
        } else {
            g0.d.S("Already pushed argument " + d0Var.Y().c(i7));
            throw null;
        }
    }

    public static final Object n0(h7.p pVar, h7.p pVar2, q6.e eVar) {
        Object pVar3;
        Object P;
        try {
            r6.y.d(2, eVar);
            pVar3 = eVar.d(pVar2, pVar);
        } catch (Throwable th) {
            pVar3 = new c7.p(th, false);
        }
        i6.a aVar = i6.a.f4956f;
        if (pVar3 == aVar || (P = pVar.P(pVar3)) == c7.a0.f1664e) {
            return aVar;
        }
        if (P instanceof c7.p) {
            throw ((c7.p) P).f1725a;
        }
        return c7.a0.v(P);
    }

    public static final long o0(long j8) {
        return v0.d.a((int) (j8 >> 32), (int) (j8 & 4294967295L));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double A() {
        R();
        throw null;
    }

    public void R() {
        throw new l7.c(w.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public n7.a a(SerialDescriptor serialDescriptor) {
        r6.k.f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // n7.a
    public byte b(r0 r0Var, int i7) {
        r6.k.f(r0Var, "descriptor");
        return v();
    }

    @Override // n7.a
    public boolean c(r0 r0Var, int i7) {
        r6.k.f(r0Var, "descriptor");
        return h();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long d();

    @Override // n7.a
    public float e(r0 r0Var, int i7) {
        r6.k.f(r0Var, "descriptor");
        return z();
    }

    @Override // n7.a
    public short f(r0 r0Var, int i7) {
        r6.k.f(r0Var, "descriptor");
        return x();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object g(KSerializer kSerializer) {
        r6.k.f(kSerializer, "deserializer");
        return kSerializer.deserialize(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean h() {
        R();
        throw null;
    }

    @Override // n7.a
    public long i(r0 r0Var, int i7) {
        r6.k.f(r0Var, "descriptor");
        return d();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean j() {
        return true;
    }

    @Override // n7.a
    public char k(r0 r0Var, int i7) {
        r6.k.f(r0Var, "descriptor");
        return l();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char l() {
        R();
        throw null;
    }

    public abstract void m0(m0 m0Var, m0 m0Var2, Window window, View view, boolean z8, boolean z9);

    @Override // n7.a
    public void n(SerialDescriptor serialDescriptor) {
        r6.k.f(serialDescriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder o(SerialDescriptor serialDescriptor) {
        r6.k.f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // n7.a
    public Object p(SerialDescriptor serialDescriptor, int i7, String str) {
        a1 a1Var = a1.f6856a;
        r6.k.f(serialDescriptor, "descriptor");
        a1.f6857b.getClass();
        if (j()) {
            return g(a1Var);
        }
        return null;
    }

    @Override // n7.a
    public Object q(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        r6.k.f(serialDescriptor, "descriptor");
        r6.k.f(kSerializer, "deserializer");
        return g(kSerializer);
    }

    @Override // n7.a
    public int r(r0 r0Var, int i7) {
        r6.k.f(r0Var, "descriptor");
        return s();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int s();

    @Override // n7.a
    public double u(r0 r0Var, int i7) {
        r6.k.f(r0Var, "descriptor");
        return A();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte v();

    @Override // n7.a
    public Decoder w(r0 r0Var, int i7) {
        r6.k.f(r0Var, "descriptor");
        return o(r0Var.j(i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short x();

    @Override // kotlinx.serialization.encoding.Decoder
    public String y() {
        R();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float z() {
        R();
        throw null;
    }

    public void M(Window window) {
    }
}
