package m3;

import A.C0022s;
import A.g0;
import A0.K;
import G.AbstractC0217p0;
import G.C0192d;
import G.C0199g0;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import Q.AbstractC0274j;
import Q.C0273i;
import android.content.Context;
import android.view.inputmethod.ExtractedText;
import b2.C0518b;
import f1.C0607a;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import k.N;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.C0796w;
import o.C0898m;
import p0.AbstractC0952M;
import q.AbstractC1031j;
import q.InterfaceC1021Z;
import q.InterfaceC1029h;
import q.a0;
import r.C1058b;
import s.C1103g;
import s.C1114r;
import s0.AbstractC1144g0;
import s1.G;
import s1.I;
import w2.C1292a;
import z2.C1404H;
import z2.C1405I;

/* loaded from: classes.dex */
public abstract class s {
    public static final void a(S.o oVar, r.v vVar, InterfaceC1021Z interfaceC1021Z, boolean z4, InterfaceC1029h interfaceC1029h, S.e eVar, C0898m c0898m, boolean z5, Function1 function1, C0216p c0216p, int i2, int i4) {
        S.o oVar2;
        int i5;
        InterfaceC1029h interfaceC1029h2;
        r.v vVar2;
        int i6;
        S.e eVar2;
        InterfaceC1021Z interfaceC1021Z2;
        C0898m c0898m2;
        boolean z6;
        InterfaceC1029h interfaceC1029h3;
        S.o oVar3;
        boolean z7;
        r.v vVar3;
        InterfaceC1021Z interfaceC1021Z3;
        boolean z8;
        InterfaceC1029h interfaceC1029h4;
        S.e eVar3;
        C0898m c0898m3;
        boolean z9;
        c0216p.U(-740714857);
        int i7 = i4 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            oVar2 = oVar;
        } else if ((i2 & 6) == 0) {
            oVar2 = oVar;
            i5 = (c0216p.f(oVar2) ? 4 : 2) | i2;
        } else {
            oVar2 = oVar;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= 16;
        }
        int i8 = i5 | 3456;
        if ((i2 & 24576) == 0) {
            interfaceC1029h2 = interfaceC1029h;
            i8 |= ((i4 & 16) == 0 && c0216p.f(interfaceC1029h2)) ? 16384 : 8192;
        } else {
            interfaceC1029h2 = interfaceC1029h;
        }
        int i9 = 196608 | i8;
        if ((1572864 & i2) == 0) {
            i9 = 720896 | i8;
        }
        int i10 = 12582912 | i9;
        if ((100663296 & i2) == 0) {
            i10 |= c0216p.h(function1) ? 67108864 : 33554432;
        }
        int i11 = i10;
        if ((38347923 & i11) == 38347922 && c0216p.z()) {
            c0216p.N();
            vVar3 = vVar;
            interfaceC1021Z3 = interfaceC1021Z;
            z8 = z4;
            eVar3 = eVar;
            z9 = z5;
            interfaceC1029h4 = interfaceC1029h2;
            c0898m3 = c0898m;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                S.o oVar4 = i7 != 0 ? S.l.f3977a : oVar2;
                Object obj = C0208l.f2826a;
                float f4 = r.y.f9576a;
                Object[] objArr = new Object[0];
                y.t tVar = r.v.f9550w;
                boolean d4 = c0216p.d(0) | c0216p.d(0);
                Object I3 = c0216p.I();
                if (d4 || I3 == obj) {
                    I3 = new r.x(0, 0);
                    c0216p.c0(I3);
                }
                r.v vVar4 = (r.v) u3.l.s0(objArr, tVar, (Function0) I3, c0216p, 0, 4);
                int i12 = i11 & (-113);
                float f5 = 0;
                a0 a0Var = new a0(f5, f5, f5, f5);
                if ((i4 & 16) != 0) {
                    interfaceC1029h2 = AbstractC1031j.f9267c;
                    i12 = i11 & (-57457);
                }
                S.e eVar4 = S.b.f3963r;
                float f6 = N.f7267a;
                M0.b bVar = (M0.b) c0216p.k(AbstractC1144g0.f10218f);
                boolean c4 = c0216p.c(bVar.e());
                Object I4 = c0216p.I();
                if (c4 || I4 == obj) {
                    I4 = new C0796w(new C0607a(bVar));
                    c0216p.c0(I4);
                }
                C0796w c0796w = (C0796w) I4;
                boolean f7 = c0216p.f(c0796w);
                Object I5 = c0216p.I();
                if (f7 || I5 == obj) {
                    I5 = new C0898m(c0796w);
                    c0216p.c0(I5);
                }
                vVar2 = vVar4;
                i6 = i12 & (-3670017);
                eVar2 = eVar4;
                interfaceC1021Z2 = a0Var;
                c0898m2 = (C0898m) I5;
                z6 = false;
                interfaceC1029h3 = interfaceC1029h2;
                oVar3 = oVar4;
                z7 = true;
            } else {
                c0216p.N();
                int i13 = i11 & (-113);
                if ((i4 & 16) != 0) {
                    i13 = i11 & (-57457);
                }
                i6 = i13 & (-3670017);
                vVar2 = vVar;
                interfaceC1021Z2 = interfaceC1021Z;
                z6 = z4;
                eVar2 = eVar;
                c0898m2 = c0898m;
                z7 = z5;
                oVar3 = oVar2;
                interfaceC1029h3 = interfaceC1029h2;
            }
            c0216p.r();
            u.a(oVar3, vVar2, interfaceC1021Z2, z6, c0898m2, z7, 0, eVar2, interfaceC1029h3, null, null, function1, c0216p, (i6 & 14) | 24576 | (i6 & 896) | (i6 & 7168) | ((i6 >> 3) & 3670016) | ((i6 << 9) & 234881024) | ((i6 << 15) & 1879048192), (i6 >> 18) & 896);
            oVar2 = oVar3;
            vVar3 = vVar2;
            interfaceC1021Z3 = interfaceC1021Z2;
            z8 = z6;
            interfaceC1029h4 = interfaceC1029h3;
            eVar3 = eVar2;
            c0898m3 = c0898m2;
            z9 = z7;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C1058b(oVar2, vVar3, interfaceC1021Z3, z8, interfaceC1029h4, eVar3, c0898m3, z9, function1, i2, i4);
        }
    }

    public static final void b(Object obj, int i2, s.w wVar, O.a aVar, C0216p c0216p, int i4) {
        int i5;
        c0216p.U(-2079116560);
        if ((i4 & 6) == 0) {
            i5 = (c0216p.h(obj) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0216p.d(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0216p.h(wVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0216p.h(aVar) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            boolean f4 = c0216p.f(obj) | c0216p.f(wVar);
            Object I3 = c0216p.I();
            Object obj2 = C0208l.f2826a;
            if (f4 || I3 == obj2) {
                I3 = new s.v(obj, wVar);
                c0216p.c0(I3);
            }
            s.v vVar = (s.v) I3;
            C0199g0 c0199g0 = vVar.f9971c;
            C0205j0 c0205j0 = vVar.f9973e;
            C0205j0 c0205j02 = vVar.f9974f;
            c0199g0.f(i2);
            AbstractC0217p0 abstractC0217p0 = AbstractC0952M.f9003a;
            s.v vVar2 = (s.v) c0216p.k(abstractC0217p0);
            AbstractC0274j c4 = Q.w.c();
            Function1 f5 = c4 != null ? c4.f() : null;
            AbstractC0274j d4 = Q.w.d(c4);
            try {
                if (vVar2 != ((s.v) c0205j02.getValue())) {
                    c0205j02.setValue(vVar2);
                    if (vVar.f9972d.d() > 0) {
                        s.v vVar3 = (s.v) c0205j0.getValue();
                        if (vVar3 != null) {
                            vVar3.b();
                        }
                        if (vVar2 != null) {
                            vVar2.a();
                        } else {
                            vVar2 = null;
                        }
                        c0205j0.setValue(vVar2);
                    }
                }
                Unit unit = Unit.f7487a;
                Q.w.f(c4, d4, f5);
                boolean f6 = c0216p.f(vVar);
                Object I4 = c0216p.I();
                if (f6 || I4 == obj2) {
                    I4 = new g0(28, vVar);
                    c0216p.c0(I4);
                }
                C0192d.d(vVar, (Function1) I4, c0216p);
                C0192d.a(abstractC0217p0.a(vVar), aVar, c0216p, ((i5 >> 6) & 112) | 8);
            } catch (Throwable th) {
                Q.w.f(c4, d4, f5);
                throw th;
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C1114r(obj, i2, wVar, aVar, i4);
        }
    }

    public static final int c(int i2, I.d dVar) {
        int i4 = dVar.f3332i - 1;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = ((i4 - i5) / 2) + i5;
            Object[] objArr = dVar.f3330d;
            int i7 = ((C1103g) objArr[i6]).f9930a;
            if (i7 != i2) {
                if (i7 < i2) {
                    i5 = i6 + 1;
                    if (i2 < ((C1103g) objArr[i5]).f9930a) {
                    }
                } else {
                    i4 = i6 - 1;
                }
            }
            return i6;
        }
        return i5;
    }

    public static final ExtractedText d(G0.y yVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = yVar.f3093a.f328a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j4 = yVar.f3094b;
        extractedText.selectionStart = K.e(j4);
        extractedText.selectionEnd = K.d(j4);
        extractedText.flags = !kotlin.text.y.o(yVar.f3093a.f328a, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        r2 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0012, code lost:
    
        if (r5 == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int e(int i2, int i4, int i5, boolean z4) {
        if (i4 >= i5) {
            if (z4) {
                return 0;
            }
        } else if (z4) {
            if (z4) {
                if (!z4) {
                }
            } else if (!z4) {
            }
        } else if (z4 ? i5 - i4 <= i2 : i4 > i2) {
            if (!z4) {
                return 0;
            }
        }
        return i5 - i4;
    }

    public static final boolean f(int i2, int i4, int i5, byte[] a4, byte[] b4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        for (int i6 = 0; i6 < i5; i6++) {
            if (a4[i6 + i2] != b4[i6 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static final void g(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static void i(s1.z zVar, String str, O.a aVar) {
        C1405I c1405i = C1405I.f11931d;
        I i2 = zVar.f10590f;
        i2.getClass();
        Intrinsics.checkNotNullParameter(t1.i.class, "navigatorClass");
        t1.j navDestination = new t1.j((t1.i) i2.b(m(t1.i.class)), str, aVar);
        c1405i.getClass();
        C1404H c1404h = C1404H.f11930d;
        c1404h.getClass();
        c1405i.getClass();
        c1404h.getClass();
        navDestination.f10658h = null;
        navDestination.f10659i = null;
        navDestination.f10660j = null;
        navDestination.f10661k = null;
        navDestination.f10662l = null;
        Intrinsics.checkNotNullParameter(navDestination, "navDestination");
        zVar.f10592h.add(navDestination.a());
    }

    public static Z1.b j(String str, String str2) {
        C1292a c1292a = new C1292a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(Z1.t.a(C1292a.class));
        for (Class cls : new Class[0]) {
            j0.c.s(cls, "Null interface");
            hashSet.add(Z1.t.a(cls));
        }
        return new Z1.b(null, new HashSet(hashSet), new HashSet(hashSet2), 1, new C0273i(1, c1292a), hashSet3);
    }

    public static Z1.b k(String str, C0022s c0022s) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(Z1.t.a(C1292a.class));
        for (Class cls : new Class[0]) {
            j0.c.s(cls, "Null interface");
            hashSet.add(Z1.t.a(cls));
        }
        Z1.k kVar = new Z1.k(1, 0, Context.class);
        if (hashSet.contains(kVar.f4586a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(kVar);
        return new Z1.b(null, new HashSet(hashSet), new HashSet(hashSet2), 1, new Z1.q(str, 2, c0022s), hashSet3);
    }

    public static t l(String protocol) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        if (protocol.equals("http/1.0")) {
            return t.HTTP_1_0;
        }
        if (protocol.equals("http/1.1")) {
            return t.HTTP_1_1;
        }
        if (protocol.equals("h2_prior_knowledge")) {
            return t.H2_PRIOR_KNOWLEDGE;
        }
        if (protocol.equals("h2")) {
            return t.HTTP_2;
        }
        if (protocol.equals("spdy/3.1")) {
            return t.SPDY_3;
        }
        if (protocol.equals("quic")) {
            return t.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(protocol));
    }

    public static String m(Class navigatorClass) {
        Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
        LinkedHashMap linkedHashMap = I.f10486b;
        String str = (String) linkedHashMap.get(navigatorClass);
        if (str == null) {
            G g4 = (G) navigatorClass.getAnnotation(G.class);
            str = g4 != null ? g4.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
            }
            linkedHashMap.put(navigatorClass, str);
        }
        Intrinsics.c(str);
        return str;
    }

    public static boolean n(o2.s sVar) {
        return sVar.k().isEmpty() && (sVar.isEmpty() || (sVar instanceof o2.j) || (sVar instanceof o2.v) || (sVar instanceof o2.i));
    }

    public static o2.s o(Object obj) {
        o2.k kVar = o2.k.f8939k;
        o2.s c4 = o.c(obj, kVar);
        if (c4 instanceof o2.p) {
            c4 = new o2.j(Double.valueOf(((o2.p) c4).f8947i), kVar);
        }
        if (n(c4)) {
            return c4;
        }
        throw new C0518b("Node contains invalid priority: Must be a string, double, ServerValue, or null");
    }

    public abstract List h(List list, String str);
}
