package z1;

import A.AbstractC0017m;
import A1.C0077q0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import G.W0;
import Z.C0323u;
import a.AbstractC0345a;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.chicken.road.kedro.laqer.R;
import f0.AbstractC0576G;
import f0.C0570A;
import f0.C0584e;
import f0.C0585f;
import f0.C0589j;
import f0.C0590k;
import f0.C0593n;
import f0.C0595p;
import f0.C0598s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p0.C0973i;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s.C1093I;
import s0.C1160o0;
import s1.C1183B;
import s1.C1193i;
import z2.C1405I;
import z2.C1441y;

/* renamed from: z1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1359C {

    /* renamed from: a, reason: collision with root package name */
    public static final List f11785a;

    static {
        C1367K c1367k;
        C0585f c0585f = u3.d.f10939c;
        if (c0585f == null) {
            C0584e c0584e = new C0584e("Outlined.EmojiEvents", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            C1405I c1405i = AbstractC0576G.f6305a;
            Z.S s4 = new Z.S(C0323u.f4542b);
            W0 w02 = new W0(1);
            w02.j(19.0f, 5.0f);
            w02.g(-2.0f);
            w02.n(3.0f);
            w02.f(7.0f);
            w02.o(2.0f);
            w02.f(5.0f);
            w02.d(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
            w02.o(1.0f);
            w02.e(0.0f, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
            w02.e(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
            w02.n(19.0f);
            w02.f(7.0f);
            w02.o(2.0f);
            w02.g(10.0f);
            w02.o(-2.0f);
            w02.g(-4.0f);
            w02.o(-3.1f);
            w02.e(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
            w02.d(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
            w02.n(7.0f);
            w02.d(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
            w02.c();
            w02.j(5.0f, 8.0f);
            w02.n(7.0f);
            w02.g(2.0f);
            w02.o(3.82f);
            w02.d(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
            w02.c();
            w02.j(12.0f, 14.0f);
            w02.e(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
            w02.n(5.0f);
            w02.g(6.0f);
            w02.o(6.0f);
            w02.d(15.0f, 12.65f, 13.65f, 14.0f, 12.0f, 14.0f);
            w02.c();
            w02.j(19.0f, 8.0f);
            w02.e(0.0f, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
            w02.n(7.0f);
            w02.g(2.0f);
            w02.n(8.0f);
            w02.c();
            C0584e.a(c0584e, w02.f2781d, s4);
            c0585f = c0584e.b();
            u3.d.f10939c = c0585f;
        }
        C1367K c1367k2 = new C1367K("events", "Events", c0585f);
        C0585f c0585f2 = j0.c.f7140d;
        if (c0585f2 == null) {
            C0584e c0584e2 = new C0584e("Outlined.Timer", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            C1405I c1405i2 = AbstractC0576G.f6305a;
            Z.S s5 = new Z.S(C0323u.f4542b);
            W0 w03 = new W0(1);
            w03.j(15.0f, 1.0f);
            w03.f(9.0f);
            w03.o(2.0f);
            w03.g(6.0f);
            w03.n(1.0f);
            w03.c();
            w03.j(11.0f, 14.0f);
            w03.g(2.0f);
            w03.n(8.0f);
            w03.g(-2.0f);
            w03.n(14.0f);
            w03.c();
            w03.j(19.03f, 7.39f);
            w03.i(1.42f, -1.42f);
            w03.e(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
            w03.i(-1.42f, 1.42f);
            w03.d(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
            w03.e(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
            w03.l(4.02f, 9.0f, 9.0f, 9.0f);
            w03.l(9.0f, -4.03f, 9.0f, -9.0f);
            w03.d(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
            w03.c();
            w03.j(12.0f, 20.0f);
            w03.e(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
            w03.l(3.13f, -7.0f, 7.0f, -7.0f);
            w03.l(7.0f, 3.13f, 7.0f, 7.0f);
            ArrayList arrayList = w03.f2781d;
            arrayList.add(new C0595p(15.87f, 20.0f, 12.0f, 20.0f));
            w03.c();
            C0584e.a(c0584e2, arrayList, s5);
            c0585f2 = c0584e2.b();
            j0.c.f7140d = c0585f2;
        }
        C1367K c1367k3 = new C1367K("live", "Live", c0585f2);
        C0585f c0585f3 = j0.c.f7138b;
        if (c0585f3 == null) {
            C0584e c0584e3 = new C0584e("Outlined.EditNote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            C1405I c1405i3 = AbstractC0576G.f6305a;
            Z.S s6 = new Z.S(C0323u.f4542b);
            W0 w04 = new W0(1);
            w04.j(3.0f, 10.0f);
            w04.g(11.0f);
            w04.o(2.0f);
            w04.f(3.0f);
            w04.n(10.0f);
            w04.c();
            w04.j(3.0f, 8.0f);
            w04.g(11.0f);
            w04.n(6.0f);
            w04.f(3.0f);
            w04.n(8.0f);
            w04.c();
            w04.j(3.0f, 16.0f);
            w04.g(7.0f);
            w04.o(-2.0f);
            w04.f(3.0f);
            w04.n(16.0f);
            w04.c();
            w04.j(18.01f, 12.87f);
            w04.i(0.71f, -0.71f);
            w04.e(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
            w04.i(0.71f, 0.71f);
            w04.e(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
            w04.i(-0.71f, 0.71f);
            w04.h(18.01f, 12.87f);
            w04.c();
            w04.j(17.3f, 13.58f);
            w04.i(-5.3f, 5.3f);
            w04.n(21.0f);
            w04.g(2.12f);
            w04.i(5.3f, -5.3f);
            w04.h(17.3f, 13.58f);
            w04.c();
            C0584e.a(c0584e3, w04.f2781d, s6);
            c0585f3 = c0584e3.b();
            j0.c.f7138b = c0585f3;
        }
        C1367K c1367k4 = new C1367K("journal", "Journal", c0585f3);
        C1367K c1367k5 = new C1367K("roster", "Roster", u3.l.f0());
        C1367K c1367k6 = new C1367K("records", "Records", j0.c.B());
        C0585f c0585f4 = AbstractC0345a.f4747e;
        if (c0585f4 != null) {
            c1367k = c1367k6;
        } else {
            C0584e c0584e4 = new C0584e("Outlined.MenuBook", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            C1405I c1405i4 = AbstractC0576G.f6305a;
            long j4 = C0323u.f4542b;
            Z.S s7 = new Z.S(j4);
            W0 w05 = new W0(1);
            w05.j(21.0f, 5.0f);
            w05.e(-1.11f, -0.35f, -2.33f, -0.5f, -3.5f, -0.5f);
            w05.e(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
            w05.e(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
            ArrayList arrayList2 = w05.f2781d;
            c1367k = c1367k6;
            arrayList2.add(new C0595p(2.45f, 4.9f, 1.0f, 6.0f));
            w05.o(14.65f);
            w05.e(0.0f, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f);
            w05.e(0.1f, 0.0f, 0.15f, -0.05f, 0.25f, -0.05f);
            w05.d(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f);
            w05.e(1.95f, 0.0f, 4.05f, 0.4f, 5.5f, 1.5f);
            w05.e(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
            w05.e(1.65f, 0.0f, 3.35f, 0.3f, 4.75f, 1.05f);
            w05.e(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f);
            w05.e(0.25f, 0.0f, 0.5f, -0.25f, 0.5f, -0.5f);
            w05.n(6.0f);
            w05.d(22.4f, 5.55f, 21.75f, 5.25f, 21.0f, 5.0f);
            w05.c();
            w05.j(21.0f, 18.5f);
            w05.e(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
            w05.e(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
            w05.n(8.0f);
            w05.e(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
            w05.e(1.2f, 0.0f, 2.4f, 0.15f, 3.5f, 0.5f);
            w05.n(18.5f);
            w05.c();
            C0584e.a(c0584e4, arrayList2, s7);
            Z.S s8 = new Z.S(j4);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new C0593n(17.5f, 10.5f));
            arrayList3.add(new C0598s(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f));
            arrayList3.add(new C0570A(9.24f));
            arrayList3.add(new C0590k(19.21f, 9.09f, 18.36f, 9.0f, 17.5f, 9.0f));
            arrayList3.add(new C0598s(-1.7f, 0.0f, -3.24f, 0.29f, -4.5f, 0.83f));
            arrayList3.add(new f0.z(1.66f));
            arrayList3.add(new C0590k(14.13f, 10.85f, 15.7f, 10.5f, 17.5f, 10.5f));
            C0589j c0589j = C0589j.f6414c;
            arrayList3.add(c0589j);
            C0584e.a(c0584e4, arrayList3, s8);
            Z.S s9 = new Z.S(j4);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new C0593n(13.0f, 12.49f));
            arrayList4.add(new f0.z(1.66f));
            arrayList4.add(new C0598s(1.13f, -0.64f, 2.7f, -0.99f, 4.5f, -0.99f));
            arrayList4.add(new C0598s(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f));
            arrayList4.add(new C0570A(11.9f));
            arrayList4.add(new C0598s(-0.79f, -0.15f, -1.64f, -0.24f, -2.5f, -0.24f));
            arrayList4.add(new C0590k(15.8f, 11.66f, 14.26f, 11.96f, 13.0f, 12.49f));
            arrayList4.add(c0589j);
            C0584e.a(c0584e4, arrayList4, s9);
            Z.S s10 = new Z.S(j4);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new C0593n(17.5f, 14.33f));
            arrayList5.add(new C0598s(-1.7f, 0.0f, -3.24f, 0.29f, -4.5f, 0.83f));
            arrayList5.add(new f0.z(1.66f));
            arrayList5.add(new C0598s(1.13f, -0.64f, 2.7f, -0.99f, 4.5f, -0.99f));
            arrayList5.add(new C0598s(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f));
            arrayList5.add(new f0.z(-1.52f));
            arrayList5.add(new C0590k(19.21f, 14.41f, 18.36f, 14.33f, 17.5f, 14.33f));
            arrayList5.add(c0589j);
            C0584e.a(c0584e4, arrayList5, s10);
            c0585f4 = c0584e4.b();
            AbstractC0345a.f4747e = c0585f4;
        }
        f11785a = C1441y.e(c1367k2, c1367k3, c1367k4, c1367k5, c1367k, new C1367K("rules", "Rules", c0585f4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        r15 = 5;
        D.AbstractC0122c1.a(null, null, O.f.b(1834887042, new z1.y(r7, r1, r8), r18), null, null, 0, 0, 0, null, O.f.b(695093452, new A1.B0(r14, r8), r18), r18, 805306752);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i2, C0216p c0216p) {
        int i4;
        s1.v vVar;
        int i5 = 5;
        c0216p.U(-754563971);
        if (i2 == 0 && c0216p.z()) {
            c0216p.N();
            i4 = 5;
        } else {
            boolean z4 = false;
            Context context = (Context) c0216p.k(AndroidCompositionLocals_androidKt.f5213b);
            Object[] copyOf = Arrays.copyOf(new s1.H[0], 0);
            t1.q qVar = t1.q.f10679d;
            C1160o0 c1160o0 = new C1160o0(6, context);
            y.t tVar = P.o.f3675a;
            y.t tVar2 = new y.t(qVar, 13, c1160o0);
            boolean h4 = c0216p.h(context);
            Object I3 = c0216p.I();
            if (h4 || I3 == C0208l.f2826a) {
                I3 = new C1093I(4, context);
                c0216p.c0(I3);
            }
            C1183B c1183b = (C1183B) u3.l.s0(copyOf, tVar2, (Function0) I3, c0216p, 0, 4);
            C1193i c1193i = (C1193i) C0192d.v(c1183b.f10435D, null, null, c0216p, 48, 2).getValue();
            String str = (c1193i == null || (vVar = c1193i.f10510e) == null) ? null : vVar.f10576m;
            List list = f11785a;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C1367K) it.next()).f11827a.equals(str)) {
                        break;
                    }
                }
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0077q0(i2, i4);
        }
    }

    public static final void b(int i2, C0216p c0216p) {
        c0216p.U(1663633833);
        if (i2 == 0 && c0216p.z()) {
            c0216p.N();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
            int i4 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, fillElement);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i4))) {
                AbstractC0017m.r(i4, c0216p, i4, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f5080a;
            AbstractC0345a.b(m3.o.r(R.drawable.splash_background, c0216p), fillElement, null, C0973i.f9042a, 0.0f, null, c0216p, 25008, 104);
            AbstractC0345a.b(m3.o.r(R.drawable.splash_logo, c0216p), androidx.compose.foundation.layout.c.g(aVar.a(S.b.f3956k), 220), null, null, 0.0f, null, c0216p, 48, 120);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0077q0(i2, 4);
        }
    }
}
