package u3;

import A.AbstractC0017m;
import A.B;
import A.C;
import A.C0016l;
import A.C0022s;
import A.C0023t;
import A.C0026w;
import A.C0027x;
import A.C0028y;
import A0.C0036g;
import A0.K;
import A0.q;
import A0.r;
import A1.AbstractC0071n0;
import A1.AbstractC0084x;
import A1.C0052e;
import A1.C0063j0;
import A1.C0073o0;
import A1.C0075p0;
import A1.C0077q0;
import A1.Q;
import A1.s0;
import A1.t0;
import D.AbstractC0159p;
import D.C0156o;
import D.N1;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.C0233y;
import G.C0235z;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import G.W;
import G.W0;
import G0.y;
import M2.E;
import M2.J;
import Q.v;
import S.o;
import X.p;
import Z.C0323u;
import Z.S;
import a.AbstractC0345a;
import a1.AbstractC0404s;
import a1.C0403r;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0481v;
import b.F;
import c.AbstractC0523c;
import c.C0527g;
import c.C0528h;
import c.C0529i;
import com.chicken.road.kedro.laqer.R;
import f0.AbstractC0576G;
import f0.C0584e;
import f0.C0585f;
import i3.M;
import j0.C0706a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import l0.AbstractC0819q;
import l0.C0800A;
import l0.C0811i;
import l0.EnumC0812j;
import l0.s;
import m.AbstractC0852z;
import m.C0840m;
import m.f0;
import m.g0;
import m.h0;
import m.i0;
import m3.A;
import m3.z;
import n.AbstractC0864b;
import o.AbstractC0870C;
import o.C0898m;
import o.InterfaceC0893j0;
import o.N;
import p.C0935k;
import p0.InterfaceC0945F;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1023b;
import q.C1025d;
import q.C1028g;
import q.C1041t;
import q.a0;
import q.e0;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s0.AbstractC1144g0;
import s0.P0;
import v.AbstractC1234e;
import w.P;
import w.Y;
import w2.C1294c;
import y2.AbstractC1343r;
import z1.AbstractC1365I;
import z2.C1403G;
import z2.C1405I;
import z2.C1441y;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static C0585f f10938b = null;

    /* renamed from: c, reason: collision with root package name */
    public static C0585f f10939c = null;

    /* renamed from: d, reason: collision with root package name */
    public static C0585f f10940d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f10941e = false;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f10942f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Method f10943g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10944a;

    public /* synthetic */ d(int i2) {
        this.f10944a = i2;
    }

    public static final void A(ArrayList arrayList, long j4, Function1 function1) {
        int size = arrayList.size();
        for (int x2 = x(K.e(j4), arrayList); x2 < size; x2++) {
            r rVar = (r) arrayList.get(x2);
            if (rVar.f367b >= K.d(j4)) {
                return;
            }
            if (rVar.f367b != rVar.f368c) {
                function1.invoke(rVar);
            }
        }
    }

    public static final KSerializer B(f3.b bVar, h3.a decoder, String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bVar.getClass();
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        q n2 = decoder.n();
        n2.getClass();
        Intrinsics.checkNotNullParameter(null, "baseClass");
        Map map = (Map) ((Map) n2.f365f).get(null);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer == null) {
            Object obj = ((Map) n2.f361b).get(null);
            Function1 function1 = J.e(1, obj) ? (Function1) obj : null;
            kSerializer = function1 != null ? (KSerializer) function1.invoke(str) : null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        M.e(null, str);
        throw null;
    }

    public static m3.k C(SSLSession sSLSession) {
        Object obj;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        m3.f c4 = m3.f.f8341b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        A k4 = z.k(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            obj = peerCertificates != null ? n3.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : C1405I.f11931d;
        } catch (SSLPeerUnverifiedException unused) {
            obj = C1405I.f11931d;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new m3.k(k4, c4, localCertificates != null ? n3.b.k(Arrays.copyOf(localCertificates, localCertificates.length)) : C1405I.f11931d, new A3.e(20, obj));
    }

    public static final C0585f D() {
        C0585f c0585f = f10938b;
        if (c0585f != null) {
            return c0585f;
        }
        C0584e c0584e = new C0584e("Outlined.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        C1405I c1405i = AbstractC0576G.f6305a;
        S s4 = new S(C0323u.f4542b);
        W0 w02 = new W0(1);
        w02.j(20.0f, 11.0f);
        w02.f(7.83f);
        w02.i(5.59f, -5.59f);
        w02.h(12.0f, 4.0f);
        w02.i(-8.0f, 8.0f);
        w02.i(8.0f, 8.0f);
        w02.i(1.41f, -1.41f);
        w02.h(7.83f, 13.0f);
        w02.f(20.0f);
        w02.o(-2.0f);
        w02.c();
        C0584e.a(c0584e, w02.f2781d, s4);
        C0585f b4 = c0584e.b();
        f10938b = b4;
        return b4;
    }

    public static Intent E(Context context, ComponentName componentName) {
        String F3 = F(context, componentName);
        if (F3 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), F3);
        return F(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String F(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final C0036g G(y yVar) {
        C0036g c0036g = yVar.f3093a;
        c0036g.getClass();
        long j4 = yVar.f3094b;
        return c0036g.subSequence(K.e(j4), K.d(j4));
    }

    public static final C0036g H(y yVar, int i2) {
        C0036g c0036g = yVar.f3093a;
        long j4 = yVar.f3094b;
        return c0036g.subSequence(K.d(j4), Math.min(K.d(j4) + i2, yVar.f3093a.f328a.length()));
    }

    public static final C0036g I(y yVar, int i2) {
        C0036g c0036g = yVar.f3093a;
        long j4 = yVar.f3094b;
        return c0036g.subSequence(Math.max(0, K.e(j4) - i2), K.e(j4));
    }

    public static final int J(int i2, int i4) {
        return (i2 >> i4) & 31;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean K(C0811i c0811i) {
        ?? r5 = c0811i.f7907a;
        int size = r5.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!AbstractC0819q.e(((s) r5.get(i2)).f7931i, 2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean L(Y.e eVar) {
        float b4 = Y.a.b(eVar.f4382e);
        long j4 = eVar.f4382e;
        if (b4 == Y.a.c(j4)) {
            float b5 = Y.a.b(j4);
            long j5 = eVar.f4383f;
            if (b5 == Y.a.b(j5) && Y.a.b(j4) == Y.a.c(j5)) {
                float b6 = Y.a.b(j4);
                long j6 = eVar.f4384g;
                if (b6 == Y.a.b(j6) && Y.a.b(j4) == Y.a.c(j6)) {
                    float b7 = Y.a.b(j4);
                    long j7 = eVar.f4385h;
                    if (b7 == Y.a.b(j7) && Y.a.b(j4) == Y.a.c(j7)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean M() {
        return e.f10945d;
    }

    public static final float N(float f4, float f5, float f6) {
        return (f6 * f5) + ((1 - f6) * f4);
    }

    public static final int O(float f4, int i2, int i4) {
        return i2 + ((int) Math.round((i4 - i2) * f4));
    }

    public static final long P(float f4, long j4) {
        return (Float.isNaN(f4) || f4 >= 1.0f) ? j4 : C0323u.b(C0323u.d(j4) * f4, j4);
    }

    public static final long Q(int i2, int i4, long j4) {
        int k4 = M0.a.k(j4) + i2;
        if (k4 < 0) {
            k4 = 0;
        }
        int i5 = M0.a.i(j4);
        if (i5 != Integer.MAX_VALUE && (i5 = i5 + i2) < 0) {
            i5 = 0;
        }
        int j5 = M0.a.j(j4) + i4;
        if (j5 < 0) {
            j5 = 0;
        }
        int h4 = M0.a.h(j4);
        if (h4 != Integer.MAX_VALUE) {
            int i6 = h4 + i4;
            h4 = i6 >= 0 ? i6 : 0;
        }
        return a(k4, i5, j5, h4);
    }

    public static /* synthetic */ long R(long j4, int i2, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return Q(i2, i4, j4);
    }

    public static final o S(o oVar, InterfaceC0893j0 interfaceC0893j0, N n2, boolean z4, boolean z5, C0898m c0898m, C0935k c0935k, C0216p c0216p) {
        i0 i0Var;
        Context context = (Context) c0216p.k(AndroidCompositionLocals_androidKt.f5213b);
        g0 g0Var = (g0) c0216p.k(h0.f8121a);
        if (g0Var != null) {
            c0216p.S(1586021609);
            boolean f4 = c0216p.f(context) | c0216p.f(g0Var);
            Object I3 = c0216p.I();
            if (f4 || I3 == C0208l.f2826a) {
                I3 = new C0840m(context, g0Var);
                c0216p.c0(I3);
            }
            c0216p.q(false);
            i0Var = (C0840m) I3;
        } else {
            c0216p.S(1586120933);
            c0216p.q(false);
            i0Var = f0.f8115i;
        }
        N n4 = N.f8665d;
        o h4 = oVar.h(n2 == n4 ? AbstractC0852z.f8234c : AbstractC0852z.f8233b).h(i0Var.d());
        boolean z6 = !z5;
        if (((M0.k) c0216p.k(AbstractC1144g0.f10224l)) == M0.k.f3556e && n2 != n4) {
            z6 = z5;
        }
        return androidx.compose.foundation.gestures.a.b(h4, interfaceC0893j0, n2, i0Var, z4, z6, c0898m, c0935k, null);
    }

    public static final long T(float f4, long j4) {
        return l.I(Math.max(0.0f, Y.a.b(j4) - f4), Math.max(0.0f, Y.a.c(j4) - f4));
    }

    public static final long U(long j4) {
        return l.N((int) (j4 >> 32), (int) (j4 & 4294967295L));
    }

    public static final long a(int i2, int i4, int i5, int i6) {
        boolean z4 = false;
        if (!(i4 >= i2)) {
            AbstractC0345a.I("maxWidth(" + i4 + ") must be >= than minWidth(" + i2 + ')');
            throw null;
        }
        if (!(i6 >= i5)) {
            AbstractC0345a.I("maxHeight(" + i6 + ") must be >= than minHeight(" + i5 + ')');
            throw null;
        }
        if (i2 >= 0 && i5 >= 0) {
            z4 = true;
        }
        if (z4) {
            return t(i2, i4, i5, i6);
        }
        AbstractC0345a.I("minWidth(" + i2 + ") and minHeight(" + i5 + ") must be >= 0");
        throw null;
    }

    public static /* synthetic */ long b(int i2, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(0, i2, 0, i4);
    }

    public static final long c(int i2, int i4) {
        return (i4 & 4294967295L) | (i2 << 32);
    }

    public static final long d(int i2) {
        long j4 = (i2 << 32) | (0 & 4294967295L);
        int i4 = C0706a.f7134n;
        return j4;
    }

    public static final void e(final int i2, final Long l4, final boolean z4, final Function0 function0, C0216p c0216p, final int i4) {
        int i5;
        c0216p.U(-57354449);
        if ((i4 & 6) == 0) {
            i5 = (c0216p.d(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0216p.f(l4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0216p.g(z4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0216p.h(function0) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(-1105636547);
            boolean z5 = (i5 & 112) == 32;
            Object I3 = c0216p.I();
            if (z5 || I3 == C0208l.f2826a) {
                c0216p.c0(Unit.f7487a);
            }
            c0216p.q(false);
            Unit unit = Unit.f7487a;
            S.l lVar = S.l.f3977a;
            o U3 = l.U(androidx.compose.foundation.layout.c.f5081a, AbstractC1234e.a(12));
            long j4 = l4 != null ? AbstractC1365I.f11811l : z4 ? AbstractC1365I.f11806g : AbstractC1365I.f11802c;
            E1.i iVar = Z.K.f4461a;
            float f4 = 14;
            o i6 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.e(androidx.compose.foundation.a.b(U3, j4, iVar), z4, null, function0, 6), f4, f4);
            q.f0 b4 = e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 48);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            o d4 = S.a.d(c0216p, i6);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, b4, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                AbstractC0017m.r(i7, c0216p, i7, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            q.h0 h0Var = q.h0.f9258a;
            o b5 = androidx.compose.foundation.a.b(l.U(androidx.compose.foundation.layout.c.g(lVar, 44), AbstractC1234e.a(10)), l4 != null ? AbstractC1365I.f11803d : AbstractC1365I.f11804e, iVar);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3956k, false);
            int i8 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            o d5 = S.a.d(c0216p, b5);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, c1067h);
            C0192d.R(c0216p, m5, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i8))) {
                AbstractC0017m.r(i8, c0216p, i8, c1067h3);
            }
            C0192d.R(c0216p, d5, c1067h4);
            String valueOf = String.valueOf(i2);
            long j5 = AbstractC1365I.f11807h;
            F0.m mVar = F0.r.f2625c;
            F0.k kVar = F0.k.f2617l;
            N1.b(valueOf, null, j5, l.k0(22), null, kVar, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 200064, 0, 130962);
            c0216p.q(true);
            AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.j(lVar, f4));
            o a4 = h0Var.a(lVar, true);
            C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
            int i9 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            o d6 = S.a.d(c0216p, a4);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a5, c1067h);
            C0192d.R(c0216p, m6, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                AbstractC0017m.r(i9, c0216p, i9, c1067h3);
            }
            C0192d.R(c0216p, d6, c1067h4);
            N1.b("Lane " + i2, null, (l4 != null || z4) ? AbstractC1365I.f11801b : j5, l.k0(16), null, kVar, mVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199680, 0, 130962);
            N1.b(l4 != null ? "Finished" : z4 ? "Tap on the line" : "Standby", null, (l4 != null || z4) ? C0323u.b(0.85f, AbstractC1365I.f11800a) : AbstractC1365I.f11806g, l.k0(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
            c0216p.q(true);
            N1.b(l4 != null ? AbstractC0071n0.k(l4.longValue()) : "—", null, l4 != null ? AbstractC1365I.f11801b : z4 ? AbstractC1365I.f11803d : AbstractC1365I.f11806g, l.k0(22), null, kVar, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199680, 0, 130962);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new Function2() { // from class: A1.r0
                @Override // kotlin.jvm.functions.Function2
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    u3.d.e(i2, l4, z4, function0, (C0216p) obj, C0192d.U(i4 | 1));
                    return Unit.f7487a;
                }
            };
        }
    }

    public static final void f(int i2, C0216p c0216p) {
        C1068i c1068i;
        C1067h c1067h;
        C1067h c1067h2;
        C1067h c1067h3;
        C1068i c1068i2;
        S.l lVar;
        int i4;
        float f4;
        q.h0 h0Var;
        int i5;
        v vVar;
        int i6;
        InterfaceC0191c0 interfaceC0191c0;
        InterfaceC0191c0 interfaceC0191c02;
        InterfaceC0191c0 interfaceC0191c03;
        c0216p.U(-1784622488);
        if (i2 == 0 && c0216p.z()) {
            c0216p.N();
            i6 = 0;
        } else {
            c0216p.S(235144209);
            Object I3 = c0216p.I();
            W w4 = C0208l.f2826a;
            W w5 = W.f2779l;
            if (I3 == w4) {
                I3 = C0192d.K(4, w5);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) I3;
            Object f5 = AbstractC0017m.f(c0216p, false, 235145819);
            if (f5 == w4) {
                f5 = C0192d.K(null, w5);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c05 = (InterfaceC0191c0) f5;
            Object f6 = AbstractC0017m.f(c0216p, false, 235147730);
            if (f6 == w4) {
                f6 = C0192d.K(0L, w5);
                c0216p.c0(f6);
            }
            InterfaceC0191c0 interfaceC0191c06 = (InterfaceC0191c0) f6;
            Object f7 = AbstractC0017m.f(c0216p, false, 235149307);
            if (f7 == w4) {
                f7 = new v();
                c0216p.c0(f7);
            }
            v vVar2 = (v) f7;
            Object f8 = AbstractC0017m.f(c0216p, false, 235151227);
            if (f8 == w4) {
                f8 = new v();
                c0216p.c0(f8);
            }
            v vVar3 = (v) f8;
            c0216p.q(false);
            Integer valueOf = Integer.valueOf(g(interfaceC0191c04));
            c0216p.S(235153682);
            Object I4 = c0216p.I();
            if (I4 == w4) {
                I4 = new s0(vVar2, vVar3, interfaceC0191c04, null);
                c0216p.c0(I4);
            }
            c0216p.q(false);
            C0192d.e(c0216p, valueOf, (Function2) I4);
            Long l4 = (Long) interfaceC0191c05.getValue();
            c0216p.S(235160665);
            Object I5 = c0216p.I();
            if (I5 == w4) {
                I5 = new t0(interfaceC0191c05, interfaceC0191c06, null);
                c0216p.c0(I5);
            }
            c0216p.q(false);
            C0192d.e(c0216p, l4, (Function2) I5);
            S.l lVar2 = S.l.f3977a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            long j4 = AbstractC1365I.f11800a;
            E1.i iVar = Z.K.f4461a;
            o b4 = androidx.compose.foundation.a.b(fillElement, j4, iVar);
            C1025d c1025d = AbstractC1031j.f9267c;
            S.e eVar = S.b.f3963r;
            C1041t a4 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i3 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i3);
            } else {
                c0216p.f0();
            }
            C1067h c1067h4 = C1069j.f9820f;
            C0192d.R(c0216p, a4, c1067h4);
            C1067h c1067h5 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h5);
            C1067h c1067h6 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                AbstractC0017m.r(i7, c0216p, i7, c1067h6);
            }
            C1067h c1067h7 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h7);
            AbstractC0864b.j("Live Timing", "Multi-lane stopwatch — tap a lane on finish", c0216p, 54);
            o h4 = androidx.compose.foundation.layout.b.h(lVar2, 14);
            C1041t a5 = AbstractC1039r.a(new C1028g(12), eVar, c0216p, 6);
            int i8 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            o d5 = S.a.d(c0216p, h4);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i3);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a5, c1067h4);
            C0192d.R(c0216p, m5, c1067h5);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i8))) {
                AbstractC0017m.r(i8, c0216p, i8, c1067h6);
            }
            C0192d.R(c0216p, d5, c1067h7);
            o U3 = l.U(androidx.compose.foundation.layout.c.f5081a, AbstractC1234e.a(16));
            long j5 = AbstractC1365I.f11807h;
            o j6 = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.a.b(U3, j5, iVar), 0.0f, 24, 1);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3956k, false);
            int i9 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            o d6 = S.a.d(c0216p, j6);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i3);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, c1067h4);
            C0192d.R(c0216p, m6, c1067h5);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                AbstractC0017m.r(i9, c0216p, i9, c1067h6);
            }
            C0192d.R(c0216p, d6, c1067h7);
            InterfaceC0191c0 interfaceC0191c07 = interfaceC0191c04;
            N1.b(AbstractC0071n0.k(((Number) interfaceC0191c06.getValue()).longValue()), null, ((Long) interfaceC0191c05.getValue()) != null ? AbstractC1365I.f11803d : C0323u.b(0.6f, j4), l.k0(58), null, F0.k.f2617l, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199680, 0, 130962);
            int i10 = 1;
            c0216p.q(true);
            float f9 = 8;
            q.f0 b5 = e0.b(new C1028g(f9), S.b.f3961p, c0216p, 6);
            int i11 = c0216p.f2861P;
            InterfaceC0213n0 m7 = c0216p.m();
            o d7 = S.a.d(c0216p, lVar2);
            c0216p.W();
            if (c0216p.f2860O) {
                c1068i = c1068i3;
                c0216p.l(c1068i);
            } else {
                c1068i = c1068i3;
                c0216p.f0();
            }
            C0192d.R(c0216p, b5, c1067h4);
            C0192d.R(c0216p, m7, c1067h5);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i11))) {
                c1067h = c1067h6;
                AbstractC0017m.r(i11, c0216p, i11, c1067h);
            } else {
                c1067h = c1067h6;
            }
            C0192d.R(c0216p, d7, c1067h7);
            q.h0 h0Var2 = q.h0.f9258a;
            a0 a0Var = AbstractC0159p.f1957a;
            C1067h c1067h8 = c1067h;
            C0156o a6 = AbstractC0159p.a(((Long) interfaceC0191c05.getValue()) == null ? AbstractC1365I.f11811l : AbstractC1365I.f11805f, 0L, c0216p, 14);
            o a7 = h0Var2.a(lVar2, true);
            c0216p.S(-1638247381);
            Object I6 = c0216p.I();
            if (I6 == w4) {
                c1067h2 = c1067h5;
                c1067h3 = c1067h4;
                c1068i2 = c1068i;
                lVar = lVar2;
                i4 = 6;
                f4 = f9;
                h0Var = h0Var2;
                i5 = 8;
                I6 = new C0052e(vVar2, vVar3, interfaceC0191c05, interfaceC0191c07, interfaceC0191c06, 2);
                c0216p.c0(I6);
            } else {
                c1067h2 = c1067h5;
                c1067h3 = c1067h4;
                c1068i2 = c1068i;
                lVar = lVar2;
                i4 = 6;
                f4 = f9;
                h0Var = h0Var2;
                i5 = 8;
            }
            c0216p.q(false);
            C1067h c1067h9 = c1067h2;
            D.W0.b((Function0) I6, a7, false, null, a6, null, null, null, null, O.f.b(-1755103576, new Q(i10, interfaceC0191c05), c0216p), c0216p, 805306374, 492);
            C0156o d8 = AbstractC0159p.d(AbstractC1365I.f11806g, c0216p);
            S.l lVar3 = lVar;
            o a8 = h0Var.a(lVar3, true);
            c0216p.S(-1638213930);
            Object I7 = c0216p.I();
            if (I7 == w4) {
                vVar = vVar3;
                I7 = new C0073o0(vVar2, vVar, interfaceC0191c05, interfaceC0191c06);
                c0216p.c0(I7);
            } else {
                vVar = vVar3;
            }
            c0216p.q(false);
            v vVar4 = vVar;
            W w6 = w4;
            D.W0.g((Function0) I7, a8, false, null, d8, null, null, null, null, AbstractC0084x.f778a, c0216p, 805306374, 492);
            c0216p.q(true);
            float f10 = f4;
            q.f0 b6 = e0.b(new C1028g(f10), S.b.f3962q, c0216p, 54);
            int i12 = c0216p.f2861P;
            InterfaceC0213n0 m8 = c0216p.m();
            o d9 = S.a.d(c0216p, lVar3);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i2);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, b6, c1067h3);
            C0192d.R(c0216p, m8, c1067h9);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i12))) {
                AbstractC0017m.r(i12, c0216p, i12, c1067h8);
            }
            C0192d.R(c0216p, d9, c1067h7);
            InterfaceC0191c0 interfaceC0191c08 = interfaceC0191c05;
            N1.b("Lanes:", null, j5, 0L, null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196998, 0, 131034);
            c0216p.S(-1638192397);
            Iterator it = C1441y.e(2, 4, Integer.valueOf(i4), Integer.valueOf(i5)).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                boolean z4 = ((Number) interfaceC0191c07.getValue()).intValue() == intValue;
                c0216p.S(1017152597);
                boolean d10 = c0216p.d(intValue);
                Object I8 = c0216p.I();
                W w7 = w6;
                if (d10 || I8 == w7) {
                    interfaceC0191c02 = interfaceC0191c07;
                    interfaceC0191c03 = interfaceC0191c08;
                    I8 = new C0075p0(intValue, interfaceC0191c03, interfaceC0191c02);
                    c0216p.c0(I8);
                } else {
                    interfaceC0191c02 = interfaceC0191c07;
                    interfaceC0191c03 = interfaceC0191c08;
                }
                c0216p.q(false);
                D.J.a(z4, (Function0) I8, O.f.b(1495928506, new C0063j0(intValue, 1), c0216p), null, false, null, null, null, null, null, null, null, c0216p, 384, 0, 4088);
                interfaceC0191c07 = interfaceC0191c02;
                interfaceC0191c08 = interfaceC0191c03;
                w6 = w7;
            }
            InterfaceC0191c0 interfaceC0191c09 = interfaceC0191c07;
            W w8 = w6;
            InterfaceC0191c0 interfaceC0191c010 = interfaceC0191c08;
            i6 = 0;
            c0216p.q(false);
            c0216p.q(true);
            C1023b c1023b = AbstractC1031j.f9265a;
            C1041t a9 = AbstractC1039r.a(new C1028g(f10), eVar, c0216p, i4);
            int i13 = c0216p.f2861P;
            InterfaceC0213n0 m9 = c0216p.m();
            o d11 = S.a.d(c0216p, lVar3);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i4 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i4);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a9, C1069j.f9820f);
            C0192d.R(c0216p, m9, C1069j.f9819e);
            C1067h c1067h10 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i13))) {
                AbstractC0017m.r(i13, c0216p, i13, c1067h10);
            }
            C0192d.R(c0216p, d11, C1069j.f9818d);
            c0216p.S(-1638178548);
            int intValue2 = ((Number) interfaceC0191c09.getValue()).intValue();
            int i14 = 0;
            while (i14 < intValue2) {
                int i15 = i14 + 1;
                v vVar5 = vVar4;
                Long l5 = (Long) C1403G.s(i14, vVar5);
                boolean z5 = ((Long) interfaceC0191c010.getValue()) != null && C1403G.s(i14, vVar5) == null;
                c0216p.S(-1638170094);
                boolean d12 = c0216p.d(i14);
                Object I9 = c0216p.I();
                W w9 = w8;
                if (d12 || I9 == w9) {
                    interfaceC0191c0 = interfaceC0191c010;
                    I9 = new C0075p0(i14, interfaceC0191c0, vVar5);
                    c0216p.c0(I9);
                } else {
                    interfaceC0191c0 = interfaceC0191c010;
                }
                c0216p.q(false);
                i14 = i15;
                e(i14, l5, z5, (Function0) I9, c0216p, 0);
                vVar4 = vVar5;
                w8 = w9;
                interfaceC0191c010 = interfaceC0191c0;
            }
            c0216p.q(false);
            c0216p.q(true);
            c0216p.q(true);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0077q0(i2, i6);
        }
    }

    public static final int g(InterfaceC0191c0 interfaceC0191c0) {
        return ((Number) interfaceC0191c0.getValue()).intValue();
    }

    public static final void h(boolean z4, Function2 function2, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-642000585);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.g(z4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(function2) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            InterfaceC0191c0 N3 = C0192d.N(function2, c0216p);
            c0216p.T(-723524056);
            c0216p.T(-3687241);
            Object I3 = c0216p.I();
            Object obj = C0208l.f2826a;
            if (I3 == obj) {
                Object c0233y = new C0233y(C0192d.z(kotlin.coroutines.i.f7498d, c0216p));
                c0216p.c0(c0233y);
                I3 = c0233y;
            }
            c0216p.q(false);
            b3.c cVar = ((C0233y) I3).f2966d;
            c0216p.q(false);
            E e4 = new E();
            c0216p.T(-1071578855);
            Object I4 = c0216p.I();
            if (I4 == obj) {
                I4 = new C0529i(z4, e4, cVar, N3);
                c0216p.c0(I4);
            }
            C0529i c0529i = (C0529i) I4;
            c0216p.q(false);
            Object obj2 = null;
            C0192d.e(c0216p, Boolean.valueOf(z4), new C0527g(c0529i, z4, e4, null));
            C0235z c0235z = AbstractC0523c.f5702a;
            c0216p.T(-2068013981);
            b.E e5 = (b.E) c0216p.k(AbstractC0523c.f5702a);
            c0216p.T(1680121597);
            if (e5 == null) {
                View view = (View) c0216p.k(AndroidCompositionLocals_androidKt.f5217f);
                Intrinsics.checkNotNullParameter(view, "<this>");
                e5 = (b.E) T2.r.h(T2.r.j(T2.n.f(view, F.f5522i), F.f5523j));
            }
            c0216p.q(false);
            if (e5 == null) {
                Object obj3 = (Context) c0216p.k(AndroidCompositionLocals_androidKt.f5213b);
                while (true) {
                    if (!(obj3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (obj3 instanceof b.E) {
                        obj2 = obj3;
                        break;
                    }
                    obj3 = ((ContextWrapper) obj3).getBaseContext();
                }
                e5 = (b.E) obj2;
            }
            c0216p.q(false);
            if (e5 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object b4 = e5.b();
            Object obj4 = (InterfaceC0481v) c0216p.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c0216p.T(-1071576336);
            boolean f4 = c0216p.f(b4) | c0216p.f(obj4) | c0216p.f(c0529i);
            Object I5 = c0216p.I();
            if (f4 || I5 == obj) {
                I5 = new P.h(b4, obj4, c0529i, 3);
                c0216p.c0(I5);
            }
            c0216p.q(false);
            C0192d.c(obj4, b4, (Function1) I5, c0216p);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0528h(z4, function2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(C0800A c0800a, E2.a aVar) {
        C0026w c0026w;
        int i2;
        int size;
        int i4;
        if (aVar instanceof C0026w) {
            c0026w = (C0026w) aVar;
            int i5 = c0026w.f199l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0026w.f199l = i5 - Integer.MIN_VALUE;
                Object obj = c0026w.f198k;
                D2.a aVar2 = D2.a.f2163d;
                i2 = c0026w.f199l;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    EnumC0812j enumC0812j = EnumC0812j.f7911e;
                    c0026w.f197j = c0800a;
                    c0026w.f199l = 1;
                    obj = c0800a.a(enumC0812j, c0026w);
                    if (obj == aVar2) {
                    }
                    C0811i c0811i = (C0811i) obj;
                    ?? r2 = c0811i.f7907a;
                    size = r2.size();
                    i4 = 0;
                    while (i4 < size) {
                    }
                    return c0811i;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0800a = c0026w.f197j;
                AbstractC1343r.b(obj);
                C0811i c0811i2 = (C0811i) obj;
                ?? r22 = c0811i2.f7907a;
                size = r22.size();
                i4 = 0;
                while (i4 < size) {
                    if (AbstractC0819q.a((s) r22.get(i4))) {
                        i4++;
                    } else {
                        EnumC0812j enumC0812j2 = EnumC0812j.f7911e;
                        c0026w.f197j = c0800a;
                        c0026w.f199l = 1;
                        obj = c0800a.a(enumC0812j2, c0026w);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        C0811i c0811i22 = (C0811i) obj;
                        ?? r222 = c0811i22.f7907a;
                        size = r222.size();
                        i4 = 0;
                        while (i4 < size) {
                        }
                    }
                }
                return c0811i22;
            }
        }
        c0026w = new C0026w(aVar);
        Object obj2 = c0026w.f198k;
        D2.a aVar22 = D2.a.f2163d;
        i2 = c0026w.f199l;
        if (i2 != 0) {
        }
    }

    public static final void j(int i2, String str) {
        if (str.charAt(i2) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index 8, but was " + str.charAt(i2)).toString());
    }

    public static final void k(int i2, int i4, long j4, byte[] bArr) {
        int i5 = (i4 * 2) + i2;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = kotlin.text.d.f7526a[(int) (255 & j4)];
            bArr[i5 - 1] = (byte) i7;
            i5 -= 2;
            bArr[i5] = (byte) (i7 >> 8);
            j4 >>= 8;
        }
    }

    public static final int l(int i2) {
        if (i2 < 8191) {
            return 262142;
        }
        if (i2 < 32767) {
            return 65534;
        }
        if (i2 < 65535) {
            return 32766;
        }
        if (i2 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(AbstractC0017m.h(i2, "Can't represent a size of ", " in Constraints"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(C0800A c0800a, C1294c c1294c, C0016l c0016l, C0811i c0811i, E2.a aVar) {
        C0027x c0027x;
        int i2;
        int i4;
        A.a0 a0Var;
        boolean z4;
        int i5;
        P p4;
        C0800A c0800a2 = c0800a;
        C1294c c1294c2 = c1294c;
        if (aVar instanceof C0027x) {
            c0027x = (C0027x) aVar;
            int i6 = c0027x.f203m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0027x.f203m = i6 - Integer.MIN_VALUE;
                C0027x c0027x2 = c0027x;
                Object obj = c0027x2.f202l;
                D2.a aVar2 = D2.a.f2163d;
                i2 = c0027x2.f203m;
                if (i2 == 0) {
                    if (i2 == 1) {
                        C1294c c1294c3 = c0027x2.f201k;
                        C0800A c0800a3 = c0027x2.f200j;
                        AbstractC1343r.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ?? r12 = c0800a3.f7872l.f7882y.f7907a;
                            int size = r12.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                s sVar = (s) r12.get(i7);
                                if (AbstractC0819q.b(sVar)) {
                                    sVar.a();
                                }
                            }
                        }
                        c1294c3.getClass();
                        return Unit.f7487a;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1294c c1294c4 = c0027x2.f201k;
                    C0800A c0800a4 = c0027x2.f200j;
                    AbstractC1343r.b(obj);
                    c1294c2 = c1294c4;
                    c0800a2 = c0800a4;
                    i5 = 0;
                    if (((Boolean) obj).booleanValue()) {
                        ?? r02 = c0800a2.f7872l.f7882y.f7907a;
                        int size2 = r02.size();
                        for (int i8 = i5; i8 < size2; i8++) {
                            s sVar2 = (s) r02.get(i8);
                            if (AbstractC0819q.b(sVar2)) {
                                sVar2.a();
                            }
                        }
                    }
                    c1294c2.getClass();
                    return Unit.f7487a;
                }
                AbstractC1343r.b(obj);
                s sVar3 = (s) c0016l.f165d;
                s sVar4 = (s) c0811i.f7907a.get(0);
                if (sVar3 != null) {
                    long j4 = sVar4.f7924b - sVar3.f7924b;
                    P0 p02 = (P0) c0016l.f164c;
                    if (j4 < p02.e()) {
                        float f4 = AbstractC0870C.f8598a;
                        if (Y.c.c(Y.c.g(sVar3.f7925c, sVar4.f7925c)) >= (AbstractC0819q.e(sVar3.f7931i, 2) ? p02.a() * AbstractC0870C.f8598a : p02.a())) {
                            i4 = 1;
                            c0016l.f163b = i4;
                            c0016l.f165d = sVar4;
                            s sVar5 = (s) c0811i.f7907a.get(0);
                            int i9 = c0016l.f163b;
                            C0022s c0022s = i9 != i4 ? i9 != 2 ? C0023t.f187f : C0023t.f186e : C0023t.f185d;
                            long j5 = sVar5.f7925c;
                            a0Var = (A.a0) c1294c2.f11388d;
                            if (a0Var.h()) {
                            }
                            z4 = false;
                            if (z4) {
                            }
                            return Unit.f7487a;
                        }
                        i4 = 1;
                        c0016l.f163b++;
                        c0016l.f165d = sVar4;
                        s sVar52 = (s) c0811i.f7907a.get(0);
                        int i92 = c0016l.f163b;
                        C0022s c0022s2 = i92 != i4 ? i92 != 2 ? C0023t.f187f : C0023t.f186e : C0023t.f185d;
                        long j52 = sVar52.f7925c;
                        a0Var = (A.a0) c1294c2.f11388d;
                        if (a0Var.h() || a0Var.j().f3093a.f328a.length() == 0 || (p4 = a0Var.f87d) == null || p4.d() == null) {
                            z4 = false;
                        } else {
                            p pVar = a0Var.f92i;
                            if (pVar != null) {
                                pVar.a(X.i.f4327k);
                            }
                            a0Var.f95l = j52;
                            a0Var.f100q = -1;
                            a0Var.f(true);
                            c1294c.s(a0Var.j(), a0Var.f95l, true, c0022s2);
                            z4 = true;
                        }
                        if (z4) {
                            i5 = 0;
                            C0028y c0028y = new C0028y(c1294c2, i5, c0022s2);
                            c0027x2.f200j = c0800a2;
                            c0027x2.f201k = c1294c2;
                            c0027x2.f203m = 2;
                            obj = AbstractC0870C.c(c0800a2, sVar52.f7923a, c0028y, c0027x2);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            c1294c2.getClass();
                        }
                        return Unit.f7487a;
                    }
                }
                i4 = 1;
                c0016l.f163b = i4;
                c0016l.f165d = sVar4;
                s sVar522 = (s) c0811i.f7907a.get(0);
                int i922 = c0016l.f163b;
                C0022s c0022s22 = i922 != i4 ? i922 != 2 ? C0023t.f187f : C0023t.f186e : C0023t.f185d;
                long j522 = sVar522.f7925c;
                a0Var = (A.a0) c1294c2.f11388d;
                if (a0Var.h()) {
                }
                z4 = false;
                if (z4) {
                }
                return Unit.f7487a;
            }
        }
        c0027x = new C0027x(aVar);
        C0027x c0027x22 = c0027x;
        Object obj2 = c0027x22.f202l;
        D2.a aVar22 = D2.a.f2163d;
        i2 = c0027x22.f203m;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00b2, B:15:0x00ba, B:17:0x00c6, B:19:0x00d2, B:21:0x00d5, B:24:0x00d7, B:28:0x00db, B:32:0x0041, B:34:0x0065, B:36:0x0069, B:38:0x0079, B:39:0x0085, B:43:0x0098, B:48:0x0081, B:50:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db A[Catch: CancellationException -> 0x0030, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00b2, B:15:0x00ba, B:17:0x00c6, B:19:0x00d2, B:21:0x00d5, B:24:0x00d7, B:28:0x00db, B:32:0x0041, B:34:0x0065, B:36:0x0069, B:38:0x0079, B:39:0x0085, B:43:0x0098, B:48:0x0081, B:50:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00b2, B:15:0x00ba, B:17:0x00c6, B:19:0x00d2, B:21:0x00d5, B:24:0x00d7, B:28:0x00db, B:32:0x0041, B:34:0x0065, B:36:0x0069, B:38:0x0079, B:39:0x0085, B:43:0x0098, B:48:0x0081, B:50:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(C0800A c0800a, Y y4, C0811i c0811i, E2.a aVar) {
        B b4;
        int i2;
        s sVar;
        s sVar2;
        int i4 = 0;
        try {
            if (aVar instanceof B) {
                b4 = (B) aVar;
                int i5 = b4.f8n;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    b4.f8n = i5 - Integer.MIN_VALUE;
                    Object obj = b4.f7m;
                    D2.a aVar2 = D2.a.f2163d;
                    i2 = b4.f8n;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        sVar = (s) C1403G.q(c0811i.f7907a);
                        long j4 = sVar.f7923a;
                        b4.f4j = c0800a;
                        b4.f5k = y4;
                        b4.f6l = sVar;
                        b4.f8n = 1;
                        obj = AbstractC0870C.b(c0800a, j4, b4);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y4 = b4.f5k;
                            c0800a = b4.f4j;
                            AbstractC1343r.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                y4.onCancel();
                            } else {
                                ?? r11 = c0800a.f7872l.f7882y.f7907a;
                                int size = r11.size();
                                while (i4 < size) {
                                    s sVar3 = (s) r11.get(i4);
                                    if (AbstractC0819q.b(sVar3)) {
                                        sVar3.a();
                                    }
                                    i4++;
                                }
                                y4.a();
                            }
                            return Unit.f7487a;
                        }
                        s sVar4 = b4.f6l;
                        y4 = b4.f5k;
                        C0800A c0800a2 = b4.f4j;
                        AbstractC1343r.b(obj);
                        sVar = sVar4;
                        c0800a = c0800a2;
                    }
                    sVar2 = (s) obj;
                    if (sVar2 != null) {
                        long j5 = sVar2.f7925c;
                        P0 d4 = c0800a.d();
                        int i6 = sVar.f7931i;
                        float f4 = AbstractC0870C.f8598a;
                        if (Y.c.c(Y.c.g(sVar.f7925c, j5)) < (AbstractC0819q.e(i6, 2) ? d4.a() * AbstractC0870C.f8598a : d4.a())) {
                            y4.c(j5);
                            long j6 = sVar2.f7923a;
                            C c4 = new C(y4, i4);
                            b4.f4j = c0800a;
                            b4.f5k = y4;
                            b4.f6l = null;
                            b4.f8n = 2;
                            obj = AbstractC0870C.c(c0800a, j6, c4, b4);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    return Unit.f7487a;
                }
            }
            if (i2 != 0) {
            }
            sVar2 = (s) obj;
            if (sVar2 != null) {
            }
            return Unit.f7487a;
        } catch (CancellationException e4) {
            y4.onCancel();
            throw e4;
        }
        b4 = new B(aVar);
        Object obj2 = b4.f7m;
        D2.a aVar22 = D2.a.f2163d;
        i2 = b4.f8n;
    }

    public static final int o(int i2) {
        if (i2 < 8191) {
            return 13;
        }
        if (i2 < 32767) {
            return 15;
        }
        if (i2 < 65535) {
            return 16;
        }
        return i2 < 262143 ? 18 : 255;
    }

    public static final long p(long j4, long j5) {
        return c(kotlin.ranges.b.e((int) (j5 >> 32), M0.a.k(j4), M0.a.i(j4)), kotlin.ranges.b.e((int) (j5 & 4294967295L), M0.a.j(j4), M0.a.h(j4)));
    }

    public static final long q(long j4, long j5) {
        return a(kotlin.ranges.b.e(M0.a.k(j5), M0.a.k(j4), M0.a.i(j4)), kotlin.ranges.b.e(M0.a.i(j5), M0.a.k(j4), M0.a.i(j4)), kotlin.ranges.b.e(M0.a.j(j5), M0.a.j(j4), M0.a.h(j4)), kotlin.ranges.b.e(M0.a.h(j5), M0.a.j(j4), M0.a.h(j4)));
    }

    public static final int r(long j4, int i2) {
        return kotlin.ranges.b.e(i2, M0.a.j(j4), M0.a.h(j4));
    }

    public static final int s(long j4, int i2) {
        return kotlin.ranges.b.e(i2, M0.a.k(j4), M0.a.i(j4));
    }

    public static final long t(int i2, int i4, int i5, int i6) {
        int i7 = i6 == Integer.MAX_VALUE ? i5 : i6;
        int o4 = o(i7);
        int i8 = i4 == Integer.MAX_VALUE ? i2 : i4;
        int o5 = o(i8);
        if (o4 + o5 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i8 + " and height of " + i7 + " in Constraints");
        }
        int i9 = i4 + 1;
        int i10 = i9 & (~(i9 >> 31));
        int i11 = i6 + 1;
        int i12 = i11 & (~(i11 >> 31));
        int i13 = 0;
        if (o5 != 13) {
            if (o5 == 18) {
                i13 = 3;
            } else if (o5 == 15) {
                i13 = 1;
            } else if (o5 == 16) {
                i13 = 2;
            }
        }
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        return (i10 << 33) | i13 | (i2 << 2) | (i5 << (i14 + 15)) | (i12 << (i14 + 46));
    }

    public static final F0.e u(Context context) {
        E1.i iVar = new E1.i(2);
        context.getApplicationContext();
        return new F0.e(iVar, new F0.a(Build.VERSION.SDK_INT >= 31 ? F0.l.f2619a.a(context) : 0));
    }

    public static boolean v(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i2 = AbstractC0404s.f4892a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0403r.f4888d;
        C0403r c0403r = (C0403r) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0403r == null) {
            c0403r = new C0403r();
            c0403r.f4889a = null;
            c0403r.f4890b = null;
            c0403r.f4891c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0403r);
        }
        WeakReference weakReference2 = c0403r.f4891c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0403r.f4891c = new WeakReference(keyEvent);
        if (c0403r.f4890b == null) {
            c0403r.f4890b = new SparseArray();
        }
        SparseArray sparseArray = c0403r.f4890b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final float w(float f4) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f4) & 8589934591L) / 3)) + 709952852);
        float f5 = intBitsToFloat - ((intBitsToFloat - (f4 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f5 - ((f5 - (f4 / (f5 * f5))) * 0.33333334f);
    }

    public static final int x(int i2, List list) {
        int size = list.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            r rVar = (r) list.get(i5);
            char c4 = rVar.f367b > i2 ? (char) 1 : rVar.f368c <= i2 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i4 = i5 + 1;
            } else {
                if (c4 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int y(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            r rVar = (r) arrayList.get(i5);
            char c4 = rVar.f369d > i2 ? (char) 1 : rVar.f370e <= i2 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i4 = i5 + 1;
            } else {
                if (c4 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int z(ArrayList arrayList, float f4) {
        if (f4 <= 0.0f) {
            return 0;
        }
        if (f4 >= ((r) C1403G.x(arrayList)).f372g) {
            return C1441y.d(arrayList);
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i4 = (i2 + size) >>> 1;
            r rVar = (r) arrayList.get(i4);
            char c4 = rVar.f371f > f4 ? (char) 1 : rVar.f372g <= f4 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i2 = i4 + 1;
            } else {
                if (c4 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public abstract void V(Object obj, Object obj2);

    public int hashCode() {
        switch (this.f10944a) {
            case 24:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f10944a) {
            case 24:
                String b4 = M2.F.a(getClass()).b();
                Intrinsics.c(b4);
                return b4;
            default:
                return super.toString();
        }
    }
}
