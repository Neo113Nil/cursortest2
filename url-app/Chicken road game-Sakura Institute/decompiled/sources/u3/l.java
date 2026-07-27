package u3;

import A.AbstractC0017m;
import A0.C0031b;
import A0.H;
import A0.I;
import A0.L;
import A1.AbstractC0085y;
import A1.C0044a;
import A1.C0048c;
import A1.C0056g;
import A1.C0070n;
import A1.C0079s;
import A1.E;
import A1.F;
import A1.J;
import A1.O;
import A1.v0;
import A1.x0;
import A1.z0;
import D.AbstractC0151m0;
import D.I1;
import D.N1;
import D.W0;
import D.x1;
import F0.r;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import G.W;
import M2.InterfaceC0255g;
import Q.v;
import S.o;
import W2.InterfaceC0302y;
import Z.C0323u;
import Z.K;
import Z.P;
import Z.S;
import a.AbstractC0345a;
import a1.AbstractC0407v;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.FillElement;
import com.chicken.road.kedro.laqer.R;
import e1.C0558a;
import f0.AbstractC0576G;
import f0.C0584e;
import f0.C0585f;
import f0.C0595p;
import f1.C0607a;
import f1.C0611e;
import f1.N;
import h1.C0653f;
import i3.Q;
import i3.a0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import l0.AbstractC0819q;
import l0.C0806d;
import m0.C0854b;
import m0.C0855c;
import m3.s;
import n.AbstractC0864b;
import p0.InterfaceC0945F;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1025d;
import q.C1028g;
import q.C1041t;
import q.C1042u;
import q.e0;
import q.f0;
import q.h0;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import z1.AbstractC1365I;
import z1.AbstractC1366J;
import z1.C1372P;
import z1.C1381g;
import z2.C1405I;
import z2.C1436t;
import z2.C1440x;

/* loaded from: classes.dex */
public abstract class l implements C0.e, Decoder, h3.a {

    /* renamed from: d, reason: collision with root package name */
    public static C0585f f10959d;

    /* renamed from: e, reason: collision with root package name */
    public static C0585f f10960e;

    /* renamed from: i, reason: collision with root package name */
    public static C0585f f10961i;

    public static final void G(Function0 function0, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(70835888);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(1428872862);
            Object I3 = c0216p.I();
            W w4 = C0208l.f2826a;
            W w5 = W.f2779l;
            if (I3 == w4) {
                I3 = C0192d.K("", w5);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            Object f4 = AbstractC0017m.f(c0216p, false, 1428874462);
            if (f4 == w4) {
                f4 = C0192d.K("", w5);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, 1428875998);
            if (f5 == w4) {
                f5 = C0192d.K("", w5);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) f5;
            Object f6 = AbstractC0017m.f(c0216p, false, 1428877566);
            if (f6 == w4) {
                f6 = C0192d.K("", w5);
                c0216p.c0(f6);
            }
            InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) f6;
            Object f7 = AbstractC0017m.f(c0216p, false, 1428879156);
            if (f7 == w4) {
                f7 = C0192d.K(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date()), w5);
                c0216p.c0(f7);
            }
            InterfaceC0191c0 interfaceC0191c05 = (InterfaceC0191c0) f7;
            Object f8 = AbstractC0017m.f(c0216p, false, 1428882405);
            if (f8 == w4) {
                f8 = C0192d.K("Village", w5);
                c0216p.c0(f8);
            }
            InterfaceC0191c0 interfaceC0191c06 = (InterfaceC0191c0) f8;
            c0216p.q(false);
            W0.a(function0, O.f.b(-1282466568, new x0(function0, interfaceC0191c0, interfaceC0191c02, interfaceC0191c04, interfaceC0191c03, interfaceC0191c05, interfaceC0191c06, 0), c0216p), null, O.f.b(444678394, new C0056g(function0, 6), c0216p), null, AbstractC0085y.f792f, O.f.b(887912189, new O(interfaceC0191c0, interfaceC0191c02, interfaceC0191c03, interfaceC0191c04, interfaceC0191c05, interfaceC0191c06), c0216p), null, AbstractC1365I.f11801b, 0L, 0L, 0L, 0.0f, null, c0216p, (i4 & 14) | 1772592, 0, 16020);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new J(function0, i2, 1);
        }
    }

    public static final void H(o oVar, Function1 function1, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-932836462);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function1) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            AbstractC1024c.a(c0216p, androidx.compose.ui.draw.a.a(oVar, function1));
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(i2, 6, oVar, function1);
        }
    }

    public static final long I(float f4, float f5) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
        int i2 = Y.a.f4367b;
        return floatToRawIntBits;
    }

    public static M0.c J() {
        return new M0.c(1.0f, 1.0f);
    }

    public static C0031b K(String str, L l4, long j4, M0.b bVar, F0.d dVar, C1405I c1405i, int i2, int i4) {
        return new C0031b(new I0.c(str, l4, (i4 & 32) != 0 ? C1405I.f11931d : c1405i, C1405I.f11931d, dVar, bVar), i2, false, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r47.I(), java.lang.Integer.valueOf(r15)) == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void L(String tournamentId, Function0 onBack, C0216p c0216p, int i2) {
        int i4;
        Object obj;
        FillElement fillElement;
        o a4;
        Intrinsics.checkNotNullParameter(tournamentId, "tournamentId");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        c0216p.U(-1649476323);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(tournamentId) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(onBack) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            ListIterator listIterator = AbstractC1366J.f11816b.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = bVar.next();
                    if (Intrinsics.a(((C1372P) obj).f11837a, tournamentId)) {
                        break;
                    }
                }
            }
            C1372P c1372p = (C1372P) obj;
            c0216p.S(-680040641);
            Object obj2 = C0208l.f2826a;
            if (c1372p == null) {
                Unit unit = Unit.f7487a;
                c0216p.S(-680039473);
                boolean z4 = (i4 & 112) == 32;
                Object I3 = c0216p.I();
                if (z4 || I3 == obj2) {
                    I3 = new z0(onBack, null);
                    c0216p.c0(I3);
                }
                c0216p.q(false);
                C0192d.e(c0216p, unit, (Function2) I3);
                c0216p.q(false);
                C0222s0 s4 = c0216p.s();
                if (s4 != null) {
                    s4.f2903d = new C0044a(tournamentId, onBack, i2, 9);
                    return;
                }
                return;
            }
            c0216p.q(false);
            v vVar = AbstractC1366J.f11817c;
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator2 = vVar.listIterator();
            while (true) {
                A2.b bVar2 = (A2.b) listIterator2;
                if (!bVar2.hasNext()) {
                    break;
                }
                Object next = bVar2.next();
                if (Intrinsics.a(((C1381g) next).f11864b, tournamentId)) {
                    arrayList.add(next);
                }
            }
            S.l lVar = S.l.f3977a;
            FillElement fillElement2 = androidx.compose.foundation.layout.c.f5082b;
            o b4 = androidx.compose.foundation.a.b(fillElement2, AbstractC1365I.f11807h, K.f4461a);
            C1025d c1025d = AbstractC1031j.f9267c;
            S.e eVar = S.b.f3963r;
            C1041t a5 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            Function0 function0 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function0);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, a5, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O) {
                fillElement = fillElement2;
            } else {
                fillElement = fillElement2;
            }
            AbstractC0017m.r(i5, c0216p, i5, c1067h3);
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            o i6 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.f5081a, 8, 12);
            f0 b5 = e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 48);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            o d5 = S.a.d(c0216p, i6);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function0);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, b5, c1067h);
            C0192d.R(c0216p, m5, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                AbstractC0017m.r(i7, c0216p, i7, c1067h3);
            }
            C0192d.R(c0216p, d5, c1067h4);
            h0 h0Var = h0.f9258a;
            FillElement fillElement3 = fillElement;
            W0.f(onBack, null, false, null, null, AbstractC0085y.f793g, c0216p, ((i4 >> 3) & 14) | 196608);
            o a6 = h0Var.a(lVar, true);
            C1041t a7 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i8 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            o d6 = S.a.d(c0216p, a6);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function0);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a7, c1067h);
            C0192d.R(c0216p, m6, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i8))) {
                AbstractC0017m.r(i8, c0216p, i8, c1067h3);
            }
            C0192d.R(c0216p, d6, c1067h4);
            N1.b("Podium", null, AbstractC1365I.f11803d, k0(24), null, F0.k.f2617l, r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199686, 0, 130962);
            long j4 = AbstractC1365I.f11800a;
            N1.b(c1372p.f11838b, null, j4, k0(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
            c0216p.q(true);
            c0216p.q(true);
            if (arrayList.isEmpty()) {
                c0216p.S(-2119343288);
                InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3956k, false);
                int i9 = c0216p.f2861P;
                InterfaceC0213n0 m7 = c0216p.m();
                o d7 = S.a.d(c0216p, fillElement3);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(function0);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e4, c1067h);
                C0192d.R(c0216p, m7, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                    AbstractC0017m.r(i9, c0216p, i9, c1067h3);
                }
                C0192d.R(c0216p, d7, c1067h4);
                N1.b("No events yet for this tournament.", null, j4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 6, 0, 131066);
                c0216p.q(true);
                c0216p.q(false);
            } else {
                c0216p.S(-2119069930);
                a4 = C1042u.f9344a.a(true);
                float f4 = 14;
                o h4 = androidx.compose.foundation.layout.b.h(a4, f4);
                C1028g c1028g = new C1028g(f4);
                c0216p.S(-1592372860);
                boolean h5 = c0216p.h(arrayList);
                Object I4 = c0216p.I();
                if (h5 || I4 == obj2) {
                    I4 = new C0070n(1, arrayList);
                    c0216p.c0(I4);
                }
                c0216p.q(false);
                s.a(h4, null, null, false, c1028g, null, null, false, (Function1) I4, c0216p, 24576, 238);
                c0216p.q(false);
            }
            c0216p.q(true);
        }
        C0222s0 s5 = c0216p.s();
        if (s5 != null) {
            s5.f2903d = new C0044a(tournamentId, onBack, i2, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0374  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void M(Function1 onPodium, C0216p c0216p, int i2) {
        int i4;
        o a4;
        C1067h c1067h;
        C1067h c1067h2;
        C1067h c1067h3;
        C1067h c1067h4;
        C1067h c1067h5;
        W w4;
        boolean z4;
        InterfaceC0191c0 interfaceC0191c0;
        InterfaceC0191c0 interfaceC0191c02;
        boolean z5;
        InterfaceC0191c0 interfaceC0191c03;
        boolean z6;
        int i5 = 1;
        Intrinsics.checkNotNullParameter(onPodium, "onPodium");
        c0216p.U(-2052772677);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(onPodium) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
            z6 = true;
        } else {
            c0216p.S(-375478127);
            Object I3 = c0216p.I();
            W w5 = C0208l.f2826a;
            W w6 = W.f2779l;
            if (I3 == w5) {
                I3 = C0192d.K(0, w6);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) I3;
            Object f4 = AbstractC0017m.f(c0216p, false, -375476523);
            if (f4 == w5) {
                f4 = C0192d.K(Boolean.FALSE, w6);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c05 = (InterfaceC0191c0) f4;
            c0216p.q(false);
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            o b4 = androidx.compose.foundation.a.b(fillElement, AbstractC1365I.f11800a, K.f4461a);
            C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h6 = C1069j.f9820f;
            C0192d.R(c0216p, a5, c1067h6);
            C1067h c1067h7 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h7);
            C1067h c1067h8 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h8);
            }
            C1067h c1067h9 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h9);
            AbstractC0864b.j("Records & Podium", "Village best marks and tournament winners", c0216p, 54);
            int intValue = ((Number) interfaceC0191c04.getValue()).intValue();
            long j4 = AbstractC1365I.f11802c;
            long j5 = AbstractC1365I.f11805f;
            I1.a(intValue, null, j4, j5, null, null, O.f.b(1940099821, new C0079s(i5, interfaceC0191c04), c0216p), c0216p, 1572864);
            a4 = C1042u.f9344a.a(true);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            o d5 = S.a.d(c0216p, a4);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, c1067h6);
            C0192d.R(c0216p, m5, c1067h7);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                c1067h = c1067h8;
                AbstractC0017m.r(i7, c0216p, i7, c1067h);
            } else {
                c1067h = c1067h8;
            }
            C0192d.R(c0216p, d5, c1067h9);
            int intValue2 = ((Number) interfaceC0191c04.getValue()).intValue();
            if (intValue2 == 0) {
                c1067h2 = c1067h;
                c1067h3 = c1067h7;
                c1067h4 = c1067h6;
                c1067h5 = c1067h9;
                w4 = w5;
                z4 = false;
                c0216p.S(-382191605);
                if (AbstractC1366J.f11823i.isEmpty()) {
                    c0216p.S(1036940187);
                    c0216p.S(-382184541);
                    Object I4 = c0216p.I();
                    if (I4 == w4) {
                        interfaceC0191c02 = interfaceC0191c05;
                        I4 = new C0048c(14, interfaceC0191c02);
                        c0216p.c0(I4);
                    } else {
                        interfaceC0191c02 = interfaceC0191c05;
                    }
                    c0216p.q(false);
                    AbstractC0864b.e("No records on the board", "Carve in the village best marks — 60m, long jump, shot put…", "Add record", (Function0) I4, c0216p, 3510, 0);
                    c0216p.q(false);
                    interfaceC0191c0 = interfaceC0191c02;
                } else {
                    c0216p.S(1037293680);
                    o h4 = androidx.compose.foundation.layout.b.h(fillElement, 14);
                    C1028g c1028g = new C1028g(8);
                    c0216p.S(-382174976);
                    Object I5 = c0216p.I();
                    if (I5 == w4) {
                        I5 = new v0(null == true ? 1 : 0);
                        c0216p.c0(I5);
                    }
                    c0216p.q(false);
                    interfaceC0191c0 = interfaceC0191c05;
                    s.a(h4, null, null, false, c1028g, null, null, false, (Function1) I5, c0216p, 100687878, 238);
                    c0216p.q(false);
                }
                c0216p.q(false);
                Unit unit = Unit.f7487a;
            } else if (intValue2 != 1) {
                c0216p.S(1039937329);
                c0216p.q(false);
                Unit unit2 = Unit.f7487a;
                c1067h2 = c1067h;
                c1067h3 = c1067h7;
                c1067h4 = c1067h6;
                c1067h5 = c1067h9;
                z5 = true;
                interfaceC0191c0 = interfaceC0191c05;
                w4 = w5;
                z4 = false;
                c0216p.q(z5);
                c0216p.S(1881586636);
                if (((Number) interfaceC0191c04.getValue()).intValue() != 0) {
                    o h5 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5081a, 14);
                    InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3957l, z4);
                    int i8 = c0216p.f2861P;
                    InterfaceC0213n0 m6 = c0216p.m();
                    o d6 = S.a.d(c0216p, h5);
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, e5, c1067h4);
                    C0192d.R(c0216p, m6, c1067h3);
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i8))) {
                        AbstractC0017m.r(i8, c0216p, i8, c1067h2);
                    }
                    C0192d.R(c0216p, d6, c1067h5);
                    c0216p.S(-382089181);
                    Object I6 = c0216p.I();
                    if (I6 == w4) {
                        interfaceC0191c03 = interfaceC0191c0;
                        I6 = new C0048c(15, interfaceC0191c03);
                        c0216p.c0(I6);
                    } else {
                        interfaceC0191c03 = interfaceC0191c0;
                    }
                    c0216p.q(z4);
                    AbstractC0151m0.a((Function0) I6, null, null, j5, AbstractC1365I.f11801b, null, null, AbstractC0085y.f789c, c0216p, 12582918);
                    z6 = true;
                    c0216p.q(true);
                } else {
                    interfaceC0191c03 = interfaceC0191c0;
                    z6 = true;
                }
                c0216p.q(z4);
                c0216p.q(z6);
                if (((Boolean) interfaceC0191c03.getValue()).booleanValue()) {
                    c0216p.S(-375344474);
                    Object I7 = c0216p.I();
                    if (I7 == w4) {
                        I7 = new C0048c(16, interfaceC0191c03);
                        c0216p.c0(I7);
                    }
                    c0216p.q(z4);
                    G((Function0) I7, c0216p, 6);
                }
            } else {
                c0216p.S(-382129497);
                if (AbstractC1366J.f11816b.isEmpty()) {
                    c0216p.S(1038890490);
                    AbstractC0864b.e("No tournaments", "Create a tournament first to display its podium.", null, null, c0216p, 54, 12);
                    c0216p.q(false);
                    c1067h2 = c1067h;
                    c1067h3 = c1067h7;
                    c1067h4 = c1067h6;
                    c1067h5 = c1067h9;
                    w4 = w5;
                    z4 = false;
                } else {
                    c0216p.S(1039039321);
                    o h6 = androidx.compose.foundation.layout.b.h(fillElement, 14);
                    C1028g c1028g2 = new C1028g(8);
                    c0216p.S(-382118665);
                    boolean z7 = (i4 & 14) == 4;
                    Object I8 = c0216p.I();
                    if (z7 || I8 == w5) {
                        I8 = new E(i5, onPodium);
                        c0216p.c0(I8);
                    }
                    c0216p.q(false);
                    w4 = w5;
                    c1067h2 = c1067h;
                    c1067h3 = c1067h7;
                    c1067h4 = c1067h6;
                    c1067h5 = c1067h9;
                    z4 = false;
                    s.a(h6, null, null, false, c1028g2, null, null, false, (Function1) I8, c0216p, 24582, 238);
                    c0216p.q(false);
                }
                c0216p.q(z4);
                Unit unit3 = Unit.f7487a;
                interfaceC0191c0 = interfaceC0191c05;
            }
            z5 = true;
            c0216p.q(z5);
            c0216p.S(1881586636);
            if (((Number) interfaceC0191c04.getValue()).intValue() != 0) {
            }
            c0216p.q(z4);
            c0216p.q(z6);
            if (((Boolean) interfaceC0191c03.getValue()).booleanValue()) {
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new F(i2, z6 ? 1 : 0, onPodium);
        }
    }

    public static final long N(float f4, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public static final void O(int i2, List list) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void P(List list, int i2, int i4) {
        int size = list.size();
        if (i2 > i4) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i4 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0017m.h(i2, "fromIndex (", ") is less than 0."));
        }
        if (i4 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is more than than the list size (" + size + ')');
    }

    public static final void Q(C0855c c0855c, l0.s sVar) {
        boolean a4 = AbstractC0819q.a(sVar);
        C0854b c0854b = c0855c.f8246b;
        C0854b c0854b2 = c0855c.f8245a;
        if (a4) {
            C1436t.k(r2, 0, c0854b2.f8240d.length);
            c0854b2.f8241e = 0;
            C1436t.k(r2, 0, c0854b.f8240d.length);
            c0854b.f8241e = 0;
            c0855c.f8247c = 0L;
        }
        boolean c4 = AbstractC0819q.c(sVar);
        long j4 = sVar.f7924b;
        if (!c4) {
            List list = sVar.f7933k;
            if (list == null) {
                list = C1405I.f11931d;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0806d c0806d = (C0806d) list.get(i2);
                long j5 = c0806d.f7888a;
                long j6 = c0806d.f7890c;
                c0854b2.a(Y.c.d(j6), j5);
                c0854b.a(Y.c.e(j6), j5);
            }
            long j7 = sVar.f7934l;
            c0854b2.a(Y.c.d(j7), j4);
            c0854b.a(Y.c.e(j7), j4);
        }
        if (AbstractC0819q.c(sVar) && j4 - c0855c.f8247c > 40) {
            C1436t.k(r1, 0, c0854b2.f8240d.length);
            c0854b2.f8241e = 0;
            C1436t.k(r1, 0, c0854b.f8240d.length);
            c0854b.f8241e = 0;
            c0855c.f8247c = 0L;
        }
        c0855c.f8247c = j4;
    }

    public static void R(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(n3.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
            }
        }
    }

    public static int S(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : S0.m.a(new S0.n(context).f4022a) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static void T(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(n3.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2));
                sb.append(n3.b.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final o U(o oVar, P p4) {
        return androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, p4, true, 124927);
    }

    public static final o V(o oVar) {
        return androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, null, true, 126975);
    }

    public static C0607a W(List migrations, InterfaceC0302y scope, A.f0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        C0653f storage = new C0653f(z3.m.f12017a, new A3.e(14, produceFile));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        H1.f fVar = new H1.f(10, false);
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new C0607a(new C0607a(new N(storage, C1440x.a(new C0611e(migrations, null)), fVar, scope)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k1.o X(Context context) {
        ProviderInfo providerInfo;
        Y0.b bVar;
        ApplicationInfo applicationInfo;
        E1.i cVar = Build.VERSION.SDK_INT >= 28 ? new k1.c(15) : new E1.i(15);
        PackageManager packageManager = context.getPackageManager();
        M1.a.p(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] k4 = cVar.k(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : k4) {
                    arrayList.add(signature.toByteArray());
                }
                bVar = new Y0.b(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e4);
            }
            if (bVar != null) {
                return null;
            }
            return new k1.o(new k1.n(context, bVar));
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    public static final float Z(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f4 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f4 += fArr[i2] * fArr2[i2];
        }
        return f4;
    }

    public static final boolean a0(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean b0(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean c0(int i2, int i4) {
        return i2 == i4;
    }

    public static final String d0(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final long e0(long j4) {
        if (j4 != 9205357640488583168L) {
            return AbstractC0345a.c(Float.intBitsToFloat((int) (j4 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j4 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final C0585f f0() {
        C0585f c0585f = f10960e;
        if (c0585f != null) {
            return c0585f;
        }
        C0584e c0584e = new C0584e("Outlined.Groups", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        C1405I c1405i = AbstractC0576G.f6305a;
        S s4 = new S(C0323u.f4542b);
        G.W0 w02 = new G.W0(1);
        w02.j(4.0f, 13.0f);
        w02.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        w02.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        w02.l(-2.0f, 0.9f, -2.0f, 2.0f);
        w02.d(2.0f, 12.1f, 2.9f, 13.0f, 4.0f, 13.0f);
        w02.c();
        w02.j(5.13f, 14.1f);
        w02.d(4.76f, 14.04f, 4.39f, 14.0f, 4.0f, 14.0f);
        w02.e(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        w02.d(0.48f, 14.9f, 0.0f, 15.62f, 0.0f, 16.43f);
        w02.n(18.0f);
        w02.i(4.5f, 0.0f);
        w02.o(-1.61f);
        w02.d(4.5f, 15.56f, 4.73f, 14.78f, 5.13f, 14.1f);
        w02.c();
        w02.j(20.0f, 13.0f);
        w02.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        w02.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        w02.l(-2.0f, 0.9f, -2.0f, 2.0f);
        w02.d(18.0f, 12.1f, 18.9f, 13.0f, 20.0f, 13.0f);
        w02.c();
        w02.j(24.0f, 16.43f);
        w02.e(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        w02.d(21.93f, 14.21f, 20.99f, 14.0f, 20.0f, 14.0f);
        w02.e(-0.39f, 0.0f, -0.76f, 0.04f, -1.13f, 0.1f);
        w02.e(0.4f, 0.68f, 0.63f, 1.46f, 0.63f, 2.29f);
        w02.n(18.0f);
        w02.i(4.5f, 0.0f);
        w02.n(16.43f);
        w02.c();
        w02.j(16.24f, 13.65f);
        w02.e(-1.17f, -0.52f, -2.61f, -0.9f, -4.24f, -0.9f);
        w02.e(-1.63f, 0.0f, -3.07f, 0.39f, -4.24f, 0.9f);
        w02.d(6.68f, 14.13f, 6.0f, 15.21f, 6.0f, 16.39f);
        w02.n(18.0f);
        w02.g(12.0f);
        w02.o(-1.61f);
        w02.d(18.0f, 15.21f, 17.32f, 14.13f, 16.24f, 13.65f);
        w02.c();
        w02.j(8.07f, 16.0f);
        w02.e(0.09f, -0.23f, 0.13f, -0.39f, 0.91f, -0.69f);
        w02.e(0.97f, -0.38f, 1.99f, -0.56f, 3.02f, -0.56f);
        w02.l(2.05f, 0.18f, 3.02f, 0.56f);
        w02.e(0.77f, 0.3f, 0.81f, 0.46f, 0.91f, 0.69f);
        w02.f(8.07f);
        w02.c();
        w02.j(12.0f, 8.0f);
        w02.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        w02.l(-0.45f, 1.0f, -1.0f, 1.0f);
        w02.l(-1.0f, -0.45f, -1.0f, -1.0f);
        ArrayList arrayList = w02.f2781d;
        arrayList.add(new C0595p(11.45f, 8.0f, 12.0f, 8.0f));
        w02.j(12.0f, 6.0f);
        w02.e(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        w02.e(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        w02.l(3.0f, -1.34f, 3.0f, -3.0f);
        w02.d(15.0f, 7.34f, 13.66f, 6.0f, 12.0f, 6.0f);
        w02.h(12.0f, 6.0f);
        w02.c();
        C0584e.a(c0584e, arrayList, s4);
        C0585f b4 = c0584e.b();
        f10960e = b4;
        return b4;
    }

    public static final Class g0(S2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Class a4 = ((InterfaceC0255g) bVar).a();
        Intrinsics.d(a4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a4;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class h0(S2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Class a4 = ((InterfaceC0255g) bVar).a();
        if (!a4.isPrimitive()) {
            return a4;
        }
        String name = a4.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a4;
    }

    public static final C0558a i0(View view) {
        C0558a c0558a = (C0558a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c0558a != null) {
            return c0558a;
        }
        C0558a c0558a2 = new C0558a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c0558a2);
        return c0558a2;
    }

    public static final long j0(double d4) {
        return p0((float) d4, 4294967296L);
    }

    public static final long k0(int i2) {
        return p0(i2, 4294967296L);
    }

    public static final L0.h l0(I i2, int i4) {
        H h4 = i2.f289a;
        if (h4.f279a.f328a.length() != 0) {
            int e4 = i2.e(i4);
            if ((i4 != 0 && e4 == i2.e(i4 - 1)) || (i4 != h4.f279a.f328a.length() && e4 == i2.e(i4 + 1))) {
                return i2.a(i4);
            }
        }
        return i2.i(i4);
    }

    public static final boolean m0(long j4) {
        M0.n[] nVarArr = M0.m.f3559b;
        return (j4 & 1095216660480L) == 0;
    }

    public static m3.l o0(String... namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        if (namesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) namesAndValues.clone();
        int length = strArr.length;
        int i2 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr[i4];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i4] = y.M(str).toString();
        }
        int a4 = G2.b.a(0, strArr.length - 1, 2);
        if (a4 >= 0) {
            while (true) {
                String str2 = strArr[i2];
                String str3 = strArr[i2 + 1];
                R(str2);
                T(str3, str2);
                if (i2 == a4) {
                    break;
                }
                i2 += 2;
            }
        }
        return new m3.l(strArr);
    }

    public static final long p0(float f4, long j4) {
        long floatToIntBits = j4 | (Float.floatToIntBits(f4) & 4294967295L);
        M0.n[] nVarArr = M0.m.f3559b;
        return floatToIntBits;
    }

    public static final void q0(float[] fArr, float[] fArr2, int i2, float[] fArr3) {
        if (i2 == 0) {
            AbstractC0864b.C("At least one point must be provided");
            throw null;
        }
        int i4 = 2 >= i2 ? i2 - 1 : 2;
        int i5 = i4 + 1;
        float[][] fArr4 = new float[i5][];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr4[i6] = new float[i2];
        }
        for (int i7 = 0; i7 < i2; i7++) {
            fArr4[0][i7] = 1.0f;
            for (int i8 = 1; i8 < i5; i8++) {
                fArr4[i8][i7] = fArr4[i8 - 1][i7] * fArr[i7];
            }
        }
        float[][] fArr5 = new float[i5][];
        for (int i9 = 0; i9 < i5; i9++) {
            fArr5[i9] = new float[i2];
        }
        float[][] fArr6 = new float[i5][];
        for (int i10 = 0; i10 < i5; i10++) {
            fArr6[i10] = new float[i5];
        }
        int i11 = 0;
        while (i11 < i5) {
            float[] destination = fArr5[i11];
            float[] fArr7 = fArr4[i11];
            Intrinsics.checkNotNullParameter(fArr7, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i2);
            for (int i12 = 0; i12 < i11; i12++) {
                float[] fArr8 = fArr5[i12];
                float Z3 = Z(destination, fArr8);
                for (int i13 = 0; i13 < i2; i13++) {
                    destination[i13] = destination[i13] - (fArr8[i13] * Z3);
                }
            }
            float sqrt = (float) Math.sqrt(Z(destination, destination));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f4 = 1.0f / sqrt;
            for (int i14 = 0; i14 < i2; i14++) {
                destination[i14] = destination[i14] * f4;
            }
            float[] fArr9 = fArr6[i11];
            int i15 = 0;
            while (i15 < i5) {
                fArr9[i15] = i15 < i11 ? 0.0f : Z(destination, fArr4[i15]);
                i15++;
            }
            i11++;
        }
        for (int i16 = i4; -1 < i16; i16--) {
            float Z4 = Z(fArr5[i16], fArr2);
            float[] fArr10 = fArr6[i16];
            int i17 = i16 + 1;
            if (i17 <= i4) {
                int i18 = i4;
                while (true) {
                    Z4 -= fArr10[i18] * fArr3[i18];
                    if (i18 != i17) {
                        i18--;
                    }
                }
            }
            fArr3[i16] = Z4 / fArr10[i16];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0050: INVOKE (r12v0 ?? I:G.p), (r8v0 ?? I:java.lang.Object) VIRTUAL call: G.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final java.lang.Object s0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0050: INVOKE (r12v0 ?? I:G.p), (r8v0 ?? I:java.lang.Object) VIRTUAL call: G.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static void t0(Window window, boolean z4) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0407v.a(window, z4);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z4 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public void A(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // h3.a
    public short B(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return t();
    }

    @Override // C0.e
    public int C(int i2) {
        int n02 = n0(i2);
        if (n02 == -1 || n0(n02) == -1) {
            return -1;
        }
        return n02;
    }

    public double D() {
        Y();
        throw null;
    }

    @Override // C0.e
    public int E(int i2) {
        int r02 = r0(i2);
        if (r02 == -1 || r0(r02) == -1) {
            return -1;
        }
        return r02;
    }

    @Override // h3.a
    public byte F(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return r();
    }

    public void Y() {
        throw new f3.c(M2.F.a(getClass()) + " can't retrieve untyped values");
    }

    public h3.a a(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // h3.a
    public int b(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return l();
    }

    @Override // h3.a
    public float c(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return v();
    }

    public Decoder d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    public abstract long e();

    @Override // h3.a
    public Object f(SerialDescriptor descriptor, int i2, String str) {
        a0 deserializer = a0.f7055a;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        a0.f7056b.getClass();
        if (!m()) {
            return null;
        }
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return h(deserializer);
    }

    @Override // h3.a
    public double g(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return D();
    }

    public Object h(KSerializer deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    public Object j(SerialDescriptor descriptor, int i2, KSerializer deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return h(deserializer);
    }

    public boolean k() {
        Y();
        throw null;
    }

    public abstract int l();

    public boolean m() {
        return true;
    }

    public abstract int n0(int i2);

    @Override // h3.a
    public long o(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return e();
    }

    public char p() {
        Y();
        throw null;
    }

    @Override // h3.a
    public char q(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return p();
    }

    public abstract byte r();

    public abstract int r0(int i2);

    public abstract short t();

    public String u() {
        Y();
        throw null;
    }

    public float v() {
        Y();
        throw null;
    }

    @Override // C0.e
    public int w(int i2) {
        return r0(i2);
    }

    @Override // C0.e
    public int x(int i2) {
        return n0(i2);
    }

    @Override // h3.a
    public Decoder y(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return d(descriptor.h(i2));
    }

    @Override // h3.a
    public boolean z(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return k();
    }
}
