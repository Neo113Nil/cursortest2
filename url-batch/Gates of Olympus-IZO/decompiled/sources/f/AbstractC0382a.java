package f;

import A2.g;
import D1.C0014b;
import E.w;
import E1.n;
import E2.j;
import F.C0033c0;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.C0130y;
import I.G;
import I.InterfaceC0088c0;
import I.O0;
import I.X0;
import M1.B;
import M1.m;
import M1.u;
import Q.f;
import U.c;
import U.l;
import Y1.e;
import Z1.d;
import Z1.i;
import a0.AbstractC0158a;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0225j;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import b0.InterfaceC0251B;
import f2.InterfaceC0388c;
import g2.h;
import h.AbstractC0416e;
import h2.AbstractC0454p;
import i2.EnumC0474c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.C0527b;
import m.w0;
import n.AbstractC0669y;
import n.C0658m;
import n.c0;
import n.d0;
import n.e0;
import n1.C0674a;
import o.C0737m;
import o.J;
import o.h0;
import p1.C0763b;
import q1.C0772A;
import q1.I;
import q1.K;
import r.InterfaceC0796H;
import r.InterfaceC0808e;
import r.InterfaceC0811h;
import r1.C0857i;
import s.C0860c;
import s.C0861d;
import s.C0862e;
import s.C0867j;
import s.C0869l;
import s.C0880w;
import u.C0925G;
import u.C0938f;
import u.C0940h;
import u.InterfaceC0927I;
import u0.AbstractC0963b0;
import w2.M;
import z0.q;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0382a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4777a = 9;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4778b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4779c = 10;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4780d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4781e = 15;

    /* renamed from: f, reason: collision with root package name */
    public static long f4782f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f4783g;

    public static final V A(d dVar, b0 b0Var, n nVar, w0 w0Var, C0113p c0113p) {
        g gVar;
        c0113p.R(1673618944);
        i.f(w0Var, "extras");
        if (nVar != null) {
            gVar = new g(b0Var.d(), nVar, w0Var);
        } else {
            boolean z3 = b0Var instanceof InterfaceC0225j;
            if (z3) {
                a0 d3 = b0Var.d();
                X f3 = ((InterfaceC0225j) b0Var).f();
                i.f(f3, "factory");
                gVar = new g(d3, f3, w0Var);
            } else {
                X f4 = z3 ? ((InterfaceC0225j) b0Var).f() : C0763b.f6755a;
                w0 a3 = z3 ? ((InterfaceC0225j) b0Var).a() : C0674a.f6271b;
                i.f(f4, "factory");
                i.f(a3, "extras");
                gVar = new g(b0Var.d(), f4, a3);
            }
        }
        V k3 = gVar.k(dVar);
        c0113p.p(false);
        return k3;
    }

    public static final void a(InterfaceC0388c interfaceC0388c, l lVar, C0925G c0925g, e eVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(2002163445);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(interfaceC0388c) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(lVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.f(c0925g) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.h(eVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
        } else {
            AbstractC0416e.e(f.b(-1488997347, new androidx.compose.foundation.lazy.layout.b(c0925g, lVar, eVar, C0089d.M(interfaceC0388c, c0113p)), c0113p), c0113p, 6);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0033c0(interfaceC0388c, lVar, c0925g, eVar, i3, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x034e, code lost:
    
        if (r57.f(r9) == false) goto L225;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(l lVar, C0880w c0880w, InterfaceC0796H interfaceC0796H, boolean z3, boolean z4, C0737m c0737m, boolean z5, int i3, U.b bVar, InterfaceC0811h interfaceC0811h, c cVar, InterfaceC0808e interfaceC0808e, Y1.c cVar2, C0113p c0113p, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        InterfaceC0811h interfaceC0811h2;
        boolean z6;
        Object G3;
        Object obj;
        InterfaceC0811h interfaceC0811h3;
        boolean z7;
        Object G4;
        Object G5;
        int i14;
        InterfaceC0811h interfaceC0811h4;
        boolean z8;
        boolean f3;
        Object G6;
        int i15;
        c cVar3;
        InterfaceC0811h interfaceC0811h5;
        InterfaceC0808e interfaceC0808e2;
        U.b bVar2;
        int i16;
        Object obj2;
        int i17;
        int i18;
        C0113p c0113p2;
        int i19;
        int i20;
        boolean z9;
        Object G7;
        int i21;
        InterfaceC0808e interfaceC0808e3;
        InterfaceC0811h interfaceC0811h6;
        U.b bVar3;
        C0119s0 r3;
        c0113p.S(620764179);
        if ((i4 & 6) == 0) {
            i7 = (c0113p.f(lVar) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= c0113p.f(c0880w) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= c0113p.f(interfaceC0796H) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= c0113p.g(z3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= c0113p.g(z4) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i7 |= c0113p.f(c0737m) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i7 |= c0113p.g(z5) ? 1048576 : 524288;
        }
        int i22 = i7 | 12582912;
        int i23 = i6 & 256;
        if (i23 != 0) {
            i22 = i7 | 113246208;
        } else if ((i4 & 100663296) == 0) {
            i22 |= c0113p.f(bVar) ? 67108864 : 33554432;
            i8 = i6 & 512;
            if (i8 == 0) {
                i22 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i22 |= c0113p.f(interfaceC0811h) ? 536870912 : 268435456;
            }
            i9 = i22;
            i10 = 1024 & i6;
            if (i10 == 0) {
                i11 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                i11 = i5 | (c0113p.f(cVar) ? 4 : 2);
            } else {
                i11 = i5;
            }
            i12 = i6 & 2048;
            if (i12 == 0) {
                i11 |= 48;
            } else if ((i5 & 48) == 0) {
                i11 |= c0113p.f(interfaceC0808e) ? 32 : 16;
            }
            if ((i5 & 384) == 0) {
                i11 |= c0113p.h(cVar2) ? 256 : 128;
            }
            i13 = i11;
            if ((i9 & 306783379) != 306783378 && (i13 & 147) == 146 && c0113p.x()) {
                c0113p.L();
                i21 = i3;
                bVar3 = bVar;
                interfaceC0811h6 = interfaceC0811h;
                cVar3 = cVar;
                interfaceC0808e3 = interfaceC0808e;
            } else {
                U.b bVar4 = i23 == 0 ? null : bVar;
                interfaceC0811h2 = i8 == 0 ? null : interfaceC0811h;
                c cVar4 = i10 == 0 ? null : cVar;
                InterfaceC0808e interfaceC0808e4 = i12 == 0 ? interfaceC0808e : null;
                int i24 = (i9 >> 3) & 14;
                int i25 = i24 | ((i13 >> 3) & 112);
                InterfaceC0088c0 M3 = C0089d.M(cVar2, c0113p);
                boolean z10 = false;
                z6 = (((i25 & 14) ^ 6) <= 4 && c0113p.f(c0880w)) || (i25 & 6) == 4;
                G3 = c0113p.G();
                obj = C0105l.f2272a;
                if (!z6 || G3 == obj) {
                    C0860c c0860c = new C0860c();
                    c0860c.f7356a = C0089d.I(Integer.MAX_VALUE);
                    c0860c.f7357b = C0089d.I(Integer.MAX_VALUE);
                    w wVar = new w(M3, 2);
                    I.X x3 = I.X.f2226g;
                    C0014b c0014b = O0.f2172a;
                    interfaceC0811h3 = interfaceC0811h2;
                    G3 = new p2.i(0, 1, X0.class, new G(new j(new G(wVar, x3), c0880w, c0860c, 3), x3), "value", "getValue()Ljava/lang/Object;");
                    c0113p.a0(G3);
                } else {
                    interfaceC0811h3 = interfaceC0811h2;
                }
                InterfaceC0388c interfaceC0388c = (InterfaceC0388c) G3;
                int i26 = i24 | ((i9 >> 9) & 112);
                z7 = ((((i26 & 112) ^ 48) <= 32 && c0113p.g(z4)) || (i26 & 48) == 32) | ((((i26 & 14) ^ 6) <= 4 && c0113p.f(c0880w)) || (i26 & 6) == 4);
                G4 = c0113p.G();
                if (!z7 || G4 == obj) {
                    G4 = new C0861d(c0880w, z4);
                    c0113p.a0(G4);
                }
                InterfaceC0927I interfaceC0927I = (InterfaceC0927I) G4;
                G5 = c0113p.G();
                if (G5 == obj) {
                    Object c0130y = new C0130y(C0089d.z(c0113p));
                    c0113p.a0(c0130y);
                    G5 = c0130y;
                }
                p2.c cVar5 = ((C0130y) G5).f2402d;
                InterfaceC0251B interfaceC0251B = (InterfaceC0251B) c0113p.k(AbstractC0963b0.f8295e);
                boolean z11 = !((Boolean) c0113p.k(AbstractC0963b0.f8309t)).booleanValue();
                int i27 = i9 & 7168;
                int i28 = i9 >> 6;
                int i29 = i13 << 21;
                i14 = (i9 & 65520) | (i28 & 458752) | (i28 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | (i9 & 1879048192);
                boolean z12 = ((((i14 & 112) ^ 48) <= 32 && c0113p.f(c0880w)) || (i14 & 48) == 32) | ((((i14 & 896) ^ 384) <= 256 && c0113p.f(interfaceC0796H)) || (i14 & 384) == 256) | ((((i14 & 7168) ^ 3072) <= 2048 && c0113p.g(z3)) || (i14 & 3072) == 2048) | ((((57344 & i14) ^ 24576) <= 16384 && c0113p.g(z4)) || (i14 & 24576) == 16384) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && c0113p.f(bVar4)) || (i14 & 1572864) == 1048576) | ((((i14 & 29360128) ^ 12582912) <= 8388608 && c0113p.f(cVar4)) || (i14 & 12582912) == 8388608) | ((((i14 & 234881024) ^ 100663296) <= 67108864 && c0113p.f(interfaceC0808e4)) || (i14 & 100663296) == 67108864);
                if (((i14 & 1879048192) ^ 805306368) <= 536870912) {
                    interfaceC0811h4 = interfaceC0811h3;
                } else {
                    interfaceC0811h4 = interfaceC0811h3;
                }
                if ((i14 & 805306368) != 536870912) {
                    z8 = false;
                    f3 = z12 | z8 | c0113p.f(interfaceC0251B) | c0113p.g(z11);
                    G6 = c0113p.G();
                    if (!f3 || G6 == obj) {
                        i15 = i27;
                        cVar3 = cVar4;
                        interfaceC0811h5 = interfaceC0811h4;
                        interfaceC0808e2 = interfaceC0808e4;
                        bVar2 = bVar4;
                        i16 = 512;
                        obj2 = obj;
                        i17 = 0;
                        i18 = i9;
                        Object c0869l = new C0869l(c0880w, z4, interfaceC0796H, z3, interfaceC0388c, interfaceC0811h5, interfaceC0808e2, z11, 0, cVar5, interfaceC0251B, bVar2, cVar3);
                        c0113p2 = c0113p;
                        c0113p2.a0(c0869l);
                        G6 = c0869l;
                    } else {
                        cVar3 = cVar4;
                        interfaceC0808e2 = interfaceC0808e4;
                        bVar2 = bVar4;
                        interfaceC0811h5 = interfaceC0811h4;
                        obj2 = obj;
                        i17 = 0;
                        c0113p2 = c0113p;
                        i15 = i27;
                        i18 = i9;
                        i16 = 512;
                    }
                    e eVar = (e) G6;
                    J j3 = z4 ? J.f6443d : J.f6444e;
                    l a3 = androidx.compose.foundation.lazy.layout.c.a(lVar.e(c0880w.f7484k).e(c0880w.f7485l), interfaceC0388c, interfaceC0927I, j3, z5, z3);
                    i19 = i24 | ((i18 >> 18) & 112);
                    boolean z13 = (((i19 & 14) ^ 6) <= 4 && c0113p2.f(c0880w)) || (i19 & 6) == 4;
                    i20 = i17;
                    if (((i19 & 112) ^ 48) > 32 && c0113p2.d(i20)) {
                        z10 = true;
                    }
                    z9 = z13 | z10;
                    G7 = c0113p.G();
                    if (!z9 || G7 == obj2) {
                        G7 = new C0862e(c0880w, i20);
                        c0113p2.a0(G7);
                    }
                    a(interfaceC0388c, w(AbstractC0416e.v(a3, (C0862e) G7, c0880w.f7487n, z3, (M0.j) c0113p2.k(AbstractC0963b0.f8302l), j3, z5, c0113p, i16 | i15 | (i18 & 3670016)).e(c0880w.f7486m.f3662i), c0880w, j3, z5, z3, c0737m, c0880w.f7479f, c0113p), c0880w.f7488o, eVar, c0113p, 0);
                    i21 = i20;
                    interfaceC0808e3 = interfaceC0808e2;
                    interfaceC0811h6 = interfaceC0811h5;
                    bVar3 = bVar2;
                }
                z8 = true;
                f3 = z12 | z8 | c0113p.f(interfaceC0251B) | c0113p.g(z11);
                G6 = c0113p.G();
                if (f3) {
                }
                i15 = i27;
                cVar3 = cVar4;
                interfaceC0811h5 = interfaceC0811h4;
                interfaceC0808e2 = interfaceC0808e4;
                bVar2 = bVar4;
                i16 = 512;
                obj2 = obj;
                i17 = 0;
                i18 = i9;
                Object c0869l2 = new C0869l(c0880w, z4, interfaceC0796H, z3, interfaceC0388c, interfaceC0811h5, interfaceC0808e2, z11, 0, cVar5, interfaceC0251B, bVar2, cVar3);
                c0113p2 = c0113p;
                c0113p2.a0(c0869l2);
                G6 = c0869l2;
                e eVar2 = (e) G6;
                J j32 = z4 ? J.f6443d : J.f6444e;
                l a32 = androidx.compose.foundation.lazy.layout.c.a(lVar.e(c0880w.f7484k).e(c0880w.f7485l), interfaceC0388c, interfaceC0927I, j32, z5, z3);
                i19 = i24 | ((i18 >> 18) & 112);
                if (((i19 & 14) ^ 6) <= 4) {
                }
                i20 = i17;
                if (((i19 & 112) ^ 48) > 32) {
                    z10 = true;
                }
                z9 = z13 | z10;
                G7 = c0113p.G();
                if (!z9) {
                }
                G7 = new C0862e(c0880w, i20);
                c0113p2.a0(G7);
                a(interfaceC0388c, w(AbstractC0416e.v(a32, (C0862e) G7, c0880w.f7487n, z3, (M0.j) c0113p2.k(AbstractC0963b0.f8302l), j32, z5, c0113p, i16 | i15 | (i18 & 3670016)).e(c0880w.f7486m.f3662i), c0880w, j32, z5, z3, c0737m, c0880w.f7479f, c0113p), c0880w.f7488o, eVar2, c0113p, 0);
                i21 = i20;
                interfaceC0808e3 = interfaceC0808e2;
                interfaceC0811h6 = interfaceC0811h5;
                bVar3 = bVar2;
            }
            r3 = c0113p.r();
            if (r3 == null) {
                r3.f2347d = new C0867j(lVar, c0880w, interfaceC0796H, z3, z4, c0737m, z5, i21, bVar3, interfaceC0811h6, cVar3, interfaceC0808e3, cVar2, i4, i5, i6);
                return;
            }
            return;
        }
        i8 = i6 & 512;
        if (i8 == 0) {
        }
        i9 = i22;
        i10 = 1024 & i6;
        if (i10 == 0) {
        }
        i12 = i6 & 2048;
        if (i12 == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        i13 = i11;
        if ((i9 & 306783379) != 306783378) {
        }
        if (i23 == 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        int i242 = (i9 >> 3) & 14;
        int i252 = i242 | ((i13 >> 3) & 112);
        InterfaceC0088c0 M32 = C0089d.M(cVar2, c0113p);
        boolean z102 = false;
        if (((i252 & 14) ^ 6) <= 4) {
        }
        G3 = c0113p.G();
        obj = C0105l.f2272a;
        if (z6) {
        }
        C0860c c0860c2 = new C0860c();
        c0860c2.f7356a = C0089d.I(Integer.MAX_VALUE);
        c0860c2.f7357b = C0089d.I(Integer.MAX_VALUE);
        w wVar2 = new w(M32, 2);
        I.X x32 = I.X.f2226g;
        C0014b c0014b2 = O0.f2172a;
        interfaceC0811h3 = interfaceC0811h2;
        G3 = new p2.i(0, 1, X0.class, new G(new j(new G(wVar2, x32), c0880w, c0860c2, 3), x32), "value", "getValue()Ljava/lang/Object;");
        c0113p.a0(G3);
        InterfaceC0388c interfaceC0388c2 = (InterfaceC0388c) G3;
        int i262 = i242 | ((i9 >> 9) & 112);
        if (((i262 & 14) ^ 6) <= 4) {
        }
        z7 = ((((i262 & 112) ^ 48) <= 32 && c0113p.g(z4)) || (i262 & 48) == 32) | ((((i262 & 14) ^ 6) <= 4 && c0113p.f(c0880w)) || (i262 & 6) == 4);
        G4 = c0113p.G();
        if (!z7) {
        }
        G4 = new C0861d(c0880w, z4);
        c0113p.a0(G4);
        InterfaceC0927I interfaceC0927I2 = (InterfaceC0927I) G4;
        G5 = c0113p.G();
        if (G5 == obj) {
        }
        p2.c cVar52 = ((C0130y) G5).f2402d;
        InterfaceC0251B interfaceC0251B2 = (InterfaceC0251B) c0113p.k(AbstractC0963b0.f8295e);
        boolean z112 = !((Boolean) c0113p.k(AbstractC0963b0.f8309t)).booleanValue();
        int i272 = i9 & 7168;
        int i282 = i9 >> 6;
        int i292 = i13 << 21;
        i14 = (i9 & 65520) | (i282 & 458752) | (i282 & 3670016) | (i292 & 29360128) | (i292 & 234881024) | (i9 & 1879048192);
        boolean z122 = ((((i14 & 112) ^ 48) <= 32 && c0113p.f(c0880w)) || (i14 & 48) == 32) | ((((i14 & 896) ^ 384) <= 256 && c0113p.f(interfaceC0796H)) || (i14 & 384) == 256) | ((((i14 & 7168) ^ 3072) <= 2048 && c0113p.g(z3)) || (i14 & 3072) == 2048) | ((((57344 & i14) ^ 24576) <= 16384 && c0113p.g(z4)) || (i14 & 24576) == 16384) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && c0113p.f(bVar4)) || (i14 & 1572864) == 1048576) | ((((i14 & 29360128) ^ 12582912) <= 8388608 && c0113p.f(cVar4)) || (i14 & 12582912) == 8388608) | ((((i14 & 234881024) ^ 100663296) <= 67108864 && c0113p.f(interfaceC0808e4)) || (i14 & 100663296) == 67108864);
        if (((i14 & 1879048192) ^ 805306368) <= 536870912) {
        }
        if ((i14 & 805306368) != 536870912) {
        }
        z8 = true;
        f3 = z122 | z8 | c0113p.f(interfaceC0251B2) | c0113p.g(z112);
        G6 = c0113p.G();
        if (f3) {
        }
        i15 = i272;
        cVar3 = cVar4;
        interfaceC0811h5 = interfaceC0811h4;
        interfaceC0808e2 = interfaceC0808e4;
        bVar2 = bVar4;
        i16 = 512;
        obj2 = obj;
        i17 = 0;
        i18 = i9;
        Object c0869l22 = new C0869l(c0880w, z4, interfaceC0796H, z3, interfaceC0388c2, interfaceC0811h5, interfaceC0808e2, z112, 0, cVar52, interfaceC0251B2, bVar2, cVar3);
        c0113p2 = c0113p;
        c0113p2.a0(c0869l22);
        G6 = c0869l22;
        e eVar22 = (e) G6;
        J j322 = z4 ? J.f6443d : J.f6444e;
        l a322 = androidx.compose.foundation.lazy.layout.c.a(lVar.e(c0880w.f7484k).e(c0880w.f7485l), interfaceC0388c2, interfaceC0927I2, j322, z5, z3);
        i19 = i242 | ((i18 >> 18) & 112);
        if (((i19 & 14) ^ 6) <= 4) {
        }
        i20 = i17;
        if (((i19 & 112) ^ 48) > 32) {
        }
        z9 = z13 | z102;
        G7 = c0113p.G();
        if (!z9) {
        }
        G7 = new C0862e(c0880w, i20);
        c0113p2.a0(G7);
        a(interfaceC0388c2, w(AbstractC0416e.v(a322, (C0862e) G7, c0880w.f7487n, z3, (M0.j) c0113p2.k(AbstractC0963b0.f8302l), j322, z5, c0113p, i16 | i15 | (i18 & 3670016)).e(c0880w.f7486m.f3662i), c0880w, j322, z5, z3, c0737m, c0880w.f7479f, c0113p), c0880w.f7488o, eVar22, c0113p, 0);
        i21 = i20;
        interfaceC0808e3 = interfaceC0808e2;
        interfaceC0811h6 = interfaceC0811h5;
        bVar3 = bVar2;
        r3 = c0113p.r();
        if (r3 == null) {
        }
    }

    public static final boolean c(String str) {
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (i.g(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [M1.u] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean d(ArrayList arrayList) {
        ?? r02;
        long j3;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            r02 = u.f2803d;
        } else {
            r02 = new ArrayList();
            Object obj = arrayList.get(0);
            int b02 = m.b0(arrayList);
            int i3 = 0;
            while (i3 < b02) {
                i3++;
                Object obj2 = arrayList.get(i3);
                z0.n nVar = (z0.n) obj2;
                z0.n nVar2 = (z0.n) obj;
                r02.add(new a0.c(I2.l.f(Math.abs(a0.c.d(nVar2.e().a()) - a0.c.d(nVar.e().a())), Math.abs(a0.c.e(nVar2.e().a()) - a0.c.e(nVar.e().a())))));
                obj = obj2;
            }
        }
        if (r02.size() == 1) {
            j3 = ((a0.c) M1.l.m0(r02)).f3489a;
        } else {
            if (r02.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object m02 = M1.l.m0(r02);
            int b03 = m.b0(r02);
            if (1 <= b03) {
                int i4 = 1;
                while (true) {
                    m02 = new a0.c(a0.c.h(((a0.c) m02).f3489a, ((a0.c) r02.get(i4)).f3489a));
                    if (i4 == b03) {
                        break;
                    }
                    i4++;
                }
            }
            j3 = ((a0.c) m02).f3489a;
        }
        return a0.c.e(j3) < a0.c.d(j3);
    }

    public static final int e(float f3) {
        return Math.round((float) Math.ceil(f3));
    }

    public static void f(C0772A c0772a, String str, Q.a aVar) {
        K k3 = c0772a.f6821f;
        k3.getClass();
        r1.j jVar = new r1.j((C0857i) k3.b(p(C0857i.class)), str, aVar);
        jVar.f7226h = null;
        jVar.f7227i = null;
        jVar.f7228j = null;
        jVar.f7229k = null;
        jVar.f7230l = null;
        c0772a.f6823h.add(jVar.a());
    }

    public static final double g(double d3, EnumC0474c enumC0474c, EnumC0474c enumC0474c2) {
        i.f(enumC0474c2, "targetUnit");
        long convert = enumC0474c2.f5128d.convert(1L, enumC0474c.f5128d);
        return convert > 0 ? d3 * convert : d3 / r8.convert(1L, r9);
    }

    public static final boolean i(int i3, int i4) {
        return i3 == i4;
    }

    public static final void j(t2.b bVar, v2.a aVar, String str) {
        i.f(bVar, "<this>");
        aVar.o().getClass();
        bVar.getClass();
        Z1.w.e(1, null);
        M.e(null, str);
        throw null;
    }

    public static final u1.f k(View view) {
        i.f(view, "<this>");
        return (u1.f) h.b0(h.d0(h.c0(view, u1.g.f8518f), u1.g.f8519g));
    }

    public static final int l(Cursor cursor, String str) {
        String str2;
        i.f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                int i3 = -1;
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    i.e(columnNames, "columnNames");
                    String concat = ".".concat(str);
                    String str3 = "." + str + '`';
                    int length = columnNames.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        String str4 = columnNames[i4];
                        int i6 = i5 + 1;
                        if (str4.length() >= str.length() + 2 && (AbstractC0454p.c0(str4, concat, false) || (str4.charAt(0) == '`' && AbstractC0454p.c0(str4, str3, false)))) {
                            i3 = i5;
                            break;
                        }
                        i4++;
                        i5 = i6;
                    }
                }
                columnIndex = i3;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            i.e(columnNames2, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i7 = 0;
            for (String str5 : columnNames2) {
                i7++;
                if (i7 > 1) {
                    sb.append((CharSequence) ", ");
                }
                g2.i.H(sb, str5, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
            i.e(str2, "toString(...)");
        } catch (Exception e3) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e3);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static String p(Class cls) {
        LinkedHashMap linkedHashMap = K.f6874b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            I i3 = (I) cls.getAnnotation(I.class);
            str = i3 != null ? i3.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        i.c(str);
        return str;
    }

    public static w1.b r(w1.c cVar, SQLiteDatabase sQLiteDatabase) {
        i.f(cVar, "refHolder");
        i.f(sQLiteDatabase, "sqLiteDatabase");
        w1.b bVar = cVar.f8582a;
        if (bVar != null && i.a(bVar.f8581d, sQLiteDatabase)) {
            return bVar;
        }
        w1.b bVar2 = new w1.b(sQLiteDatabase);
        cVar.f8582a = bVar2;
        return bVar2;
    }

    public static boolean s() {
        boolean isEnabled;
        try {
            if (f4783g == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f4783g == null) {
                f4782f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f4783g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f4783g.invoke(null, Long.valueOf(f4782f))).booleanValue();
        } catch (Exception e3) {
            if (!(e3 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e3);
                return false;
            }
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final ArrayList t(Map map, Y1.c cVar) {
        i.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() != null) {
                throw new ClassCastException();
            }
            i.c(null);
            throw null;
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) cVar.j((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static C0527b v(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i3 = duplicate.getShort() & 65535;
        if (i3 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                j3 = -1;
                break;
            }
            int i5 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j3 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i5) {
                break;
            }
            i4++;
        }
        if (j3 != -1) {
            duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j4 = duplicate.getInt() & 4294967295L;
            for (int i6 = 0; i6 < j4; i6++) {
                int i7 = duplicate.getInt();
                long j5 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i7 || 1701669481 == i7) {
                    duplicate.position((int) (j5 + j3));
                    C0527b c0527b = new C0527b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0527b.f2874g = duplicate;
                    c0527b.f2871d = position;
                    int i8 = position - duplicate.getInt(position);
                    c0527b.f2872e = i8;
                    c0527b.f2873f = ((ByteBuffer) c0527b.f2874g).getShort(i8);
                    return c0527b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final l w(l lVar, h0 h0Var, J j3, boolean z3, boolean z4, C0737m c0737m, q.j jVar, C0113p c0113p) {
        e0 e0Var;
        Context context = (Context) c0113p.k(AndroidCompositionLocals_androidKt.f3738b);
        c0 c0Var = (c0) c0113p.k(d0.f6076a);
        if (c0Var != null) {
            c0113p.Q(1586021609);
            boolean f3 = c0113p.f(context) | c0113p.f(c0Var);
            Object G3 = c0113p.G();
            if (f3 || G3 == C0105l.f2272a) {
                G3 = new C0658m(context, c0Var);
                c0113p.a0(G3);
            }
            c0113p.p(false);
            e0Var = (C0658m) G3;
        } else {
            c0113p.Q(1586120933);
            c0113p.p(false);
            e0Var = n.b0.f6060f;
        }
        J j4 = J.f6443d;
        l e3 = lVar.e(j3 == j4 ? AbstractC0669y.f6187c : AbstractC0669y.f6186b).e(e0Var.b());
        boolean z5 = !z4;
        if (((M0.j) c0113p.k(AbstractC0963b0.f8302l)) == M0.j.f2776e && j3 != j4) {
            z5 = z4;
        }
        return androidx.compose.foundation.gestures.a.b(e3, h0Var, j3, e0Var, z3, z5, c0737m, jVar, null);
    }

    public static final void x(b1.h hVar, z0.n nVar) {
        Object obj = nVar.i().f8982d.get(q.f9016g);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        z0.n j3 = nVar.j();
        if (j3 == null) {
            return;
        }
        Object obj2 = j3.i().f8982d.get(q.f9014e);
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null) {
            Object obj3 = j3.i().f8982d.get(q.f9015f);
            z0.b bVar = (z0.b) (obj3 != null ? obj3 : null);
            if (bVar == null || (bVar.f8944a >= 0 && bVar.f8945b >= 0)) {
                if (nVar.i().f8982d.containsKey(q.f9033y)) {
                    ArrayList arrayList = new ArrayList();
                    List h3 = z0.n.h(j3, true, 4);
                    int size = h3.size();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        z0.n nVar2 = (z0.n) h3.get(i4);
                        if (nVar2.i().f8982d.containsKey(q.f9033y)) {
                            arrayList.add(nVar2);
                            if (nVar2.f8990c.r() < nVar.f8990c.r()) {
                                i3++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean d3 = d(arrayList);
                    int i5 = d3 ? 0 : i3;
                    int i6 = d3 ? i3 : 0;
                    Object obj4 = nVar.i().f8982d.get(q.f9033y);
                    if (obj4 == null) {
                        obj4 = Boolean.FALSE;
                    }
                    hVar.f4317a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i5, 1, i6, 1, false, ((Boolean) obj4).booleanValue()));
                }
            }
        }
    }

    public static final long y(long j3, float f3) {
        return B.a(Math.max(0.0f, AbstractC0158a.b(j3) - f3), Math.max(0.0f, AbstractC0158a.c(j3) - f3));
    }

    public static final void z(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public abstract Intent h(Context context, Object obj);

    public Object m(int i3) {
        C0940h e3 = n().e(i3);
        return e3.f8068c.a().j(Integer.valueOf(i3 - e3.f8066a));
    }

    public abstract F2.h n();

    public Object o(int i3) {
        Object j3;
        C0940h e3 = n().e(i3);
        int i4 = i3 - e3.f8066a;
        Y1.c key = e3.f8068c.getKey();
        return (key == null || (j3 = key.j(Integer.valueOf(i4))) == null) ? new C0938f(i3) : j3;
    }

    public F0.a q(Context context, Object obj) {
        i.f(context, "context");
        return null;
    }

    public abstract Object u(Intent intent, int i3);
}
