package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.av0;
import com.yandex.mobile.ads.impl.kf2;
import com.yandex.mobile.ads.impl.ou0;
import com.yandex.mobile.ads.impl.sj0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes3.dex */
public final class dv0 extends uu0 {

    /* renamed from: q1, reason: collision with root package name */
    private static final ev0 f24929q1 = hm1.h();

    /* renamed from: r1, reason: collision with root package name */
    private static final int[] f24930r1 = {1920, IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: s1, reason: collision with root package name */
    private static boolean f24931s1;

    /* renamed from: t1, reason: collision with root package name */
    private static boolean f24932t1;

    /* renamed from: H0, reason: collision with root package name */
    private final Context f24933H0;

    /* renamed from: I0, reason: collision with root package name */
    private final ie2 f24934I0;

    /* renamed from: J0, reason: collision with root package name */
    private final kf2.a f24935J0;

    /* renamed from: K0, reason: collision with root package name */
    private final long f24936K0;

    /* renamed from: L0, reason: collision with root package name */
    private final int f24937L0;

    /* renamed from: M0, reason: collision with root package name */
    private final boolean f24938M0;

    /* renamed from: N0, reason: collision with root package name */
    private a f24939N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f24940O0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f24941P0;

    /* renamed from: Q0, reason: collision with root package name */
    private Surface f24942Q0;

    /* renamed from: R0, reason: collision with root package name */
    private gh1 f24943R0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f24944S0;

    /* renamed from: T0, reason: collision with root package name */
    private int f24945T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f24946U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f24947V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f24948W0;

    /* renamed from: X0, reason: collision with root package name */
    private long f24949X0;

    /* renamed from: Y0, reason: collision with root package name */
    private long f24950Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private long f24951Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f24952a1;

    /* renamed from: b1, reason: collision with root package name */
    private int f24953b1;

    /* renamed from: c1, reason: collision with root package name */
    private int f24954c1;

    /* renamed from: d1, reason: collision with root package name */
    private long f24955d1;

    /* renamed from: e1, reason: collision with root package name */
    private long f24956e1;

    /* renamed from: f1, reason: collision with root package name */
    private long f24957f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f24958g1;

    /* renamed from: h1, reason: collision with root package name */
    private int f24959h1;

    /* renamed from: i1, reason: collision with root package name */
    private int f24960i1;

    /* renamed from: j1, reason: collision with root package name */
    private int f24961j1;

    /* renamed from: k1, reason: collision with root package name */
    private float f24962k1;

    /* renamed from: l1, reason: collision with root package name */
    private rf2 f24963l1;

    /* renamed from: m1, reason: collision with root package name */
    private boolean f24964m1;

    /* renamed from: n1, reason: collision with root package name */
    private int f24965n1;

    /* renamed from: o1, reason: collision with root package name */
    b f24966o1;

    /* renamed from: p1, reason: collision with root package name */
    private he2 f24967p1;

    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24968a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24969b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24970c;

        public a(int i4, int i5, int i6) {
            this.f24968a = i4;
            this.f24969b = i5;
            this.f24970c = i6;
        }
    }

    private final class b implements ou0.c, Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f24971b;

        public b(ou0 ou0Var) {
            Handler a4 = u82.a((Handler.Callback) this);
            this.f24971b = a4;
            ou0Var.a(this, a4);
        }

        @Override // com.yandex.mobile.ads.impl.ou0.c
        public final void a(long j4) {
            if (u82.f32873a < 30) {
                this.f24971b.sendMessageAtFrontOfQueue(Message.obtain(this.f24971b, 0, (int) (j4 >> 32), (int) j4));
                return;
            }
            dv0 dv0Var = dv0.this;
            if (this != dv0Var.f24966o1) {
                return;
            }
            if (j4 == Long.MAX_VALUE) {
                dv0Var.Y();
                return;
            }
            try {
                dv0Var.e(j4);
            } catch (c60 e4) {
                dv0.this.a(e4);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i4 = message.arg1;
            int i5 = message.arg2;
            int i6 = u82.f32873a;
            long j4 = ((i4 & 4294967295L) << 32) | (4294967295L & i5);
            dv0 dv0Var = dv0.this;
            if (this != dv0Var.f24966o1) {
                return true;
            }
            if (j4 == Long.MAX_VALUE) {
                dv0Var.Y();
                return true;
            }
            try {
                dv0Var.e(j4);
                return true;
            } catch (c60 e4) {
                dv0.this.a(e4);
                return true;
            }
        }
    }

    public dv0(Context context, uz uzVar, wu0 wu0Var, Handler handler, kf2 kf2Var) {
        super(2, uzVar, wu0Var, 30.0f);
        this.f24936K0 = 5000L;
        this.f24937L0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f24933H0 = applicationContext;
        this.f24934I0 = new ie2(applicationContext);
        this.f24935J0 = new kf2.a(handler, kf2Var);
        this.f24938M0 = V();
        this.f24950Y0 = -9223372036854775807L;
        this.f24959h1 = -1;
        this.f24960i1 = -1;
        this.f24962k1 = -1.0f;
        this.f24945T0 = 1;
        this.f24965n1 = 0;
        U();
    }

    private void T() {
        ou0 E4;
        this.f24946U0 = false;
        if (u82.f32873a < 23 || !this.f24964m1 || (E4 = E()) == null) {
            return;
        }
        this.f24966o1 = new b(E4);
    }

    private void U() {
        this.f24963l1 = null;
    }

    private static boolean V() {
        return f24929q1.Z0().equals(u82.f32875c);
    }

    private static boolean W() {
        int i4 = u82.f32873a;
        if (i4 <= 28) {
            ev0 ev0Var = f24929q1;
            String r4 = ev0Var.r();
            String str = u82.f32874b;
            if (r4.equals(str) || ev0Var.I().equals(str) || ev0Var.K().equals(str) || ev0Var.J().equals(str) || ev0Var.Q0().equals(str) || ev0Var.P0().equals(str) || ev0Var.d1().equals(str) || ev0Var.e1().equals(str)) {
                return true;
            }
        }
        if (i4 <= 27 && f24929q1.w0().equals(u82.f32874b)) {
            return true;
        }
        if (i4 > 26) {
            return false;
        }
        ev0 ev0Var2 = f24929q1;
        String a4 = ev0Var2.a();
        String str2 = u82.f32874b;
        if (!a4.equals(str2) && !ev0Var2.b().equals(str2) && !ev0Var2.c().equals(str2) && !ev0Var2.d().equals(str2) && !ev0Var2.e().equals(str2) && !ev0Var2.f().equals(str2) && !ev0Var2.g().equals(str2) && !ev0Var2.h().equals(str2) && !ev0Var2.i().equals(str2) && !ev0Var2.j().equals(str2) && !ev0Var2.k().equals(str2) && !ev0Var2.l().equals(str2) && !ev0Var2.m().equals(str2) && !ev0Var2.s().equals(str2) && !ev0Var2.t().equals(str2) && !ev0Var2.u().equals(str2) && !ev0Var2.v().equals(str2) && !ev0Var2.w().equals(str2) && !ev0Var2.y().equals(str2) && !ev0Var2.z().equals(str2) && !ev0Var2.A().equals(str2) && !ev0Var2.B().equals(str2) && !ev0Var2.C().equals(str2) && !ev0Var2.D().equals(str2) && !ev0Var2.E().equals(str2) && !ev0Var2.F().equals(str2) && !ev0Var2.G().equals(str2) && !ev0Var2.H().equals(str2) && !ev0Var2.L().equals(str2) && !ev0Var2.M().equals(str2) && !ev0Var2.N().equals(str2) && !ev0Var2.O().equals(str2) && !ev0Var2.P().equals(str2) && !ev0Var2.Q().equals(str2) && !ev0Var2.R().equals(str2) && !ev0Var2.S().equals(str2) && !ev0Var2.T().equals(str2) && !ev0Var2.U().equals(str2) && !ev0Var2.V().equals(str2) && !ev0Var2.W().equals(str2) && !ev0Var2.X().equals(str2) && !ev0Var2.Y().equals(str2) && !ev0Var2.Z().equals(str2) && !ev0Var2.a0().equals(str2) && !ev0Var2.b0().equals(str2) && !ev0Var2.c0().equals(str2) && !ev0Var2.d0().equals(str2) && !ev0Var2.e0().equals(str2) && !ev0Var2.f0().equals(str2) && !ev0Var2.g0().equals(str2) && !ev0Var2.h0().equals(str2) && !ev0Var2.i0().equals(str2) && !ev0Var2.j0().equals(str2) && !ev0Var2.k0().equals(str2) && !ev0Var2.l0().equals(str2) && !ev0Var2.m0().equals(str2) && !ev0Var2.n0().equals(str2) && !ev0Var2.o0().equals(str2) && !ev0Var2.p0().equals(str2) && !ev0Var2.q0().equals(str2) && !ev0Var2.r0().equals(str2) && !ev0Var2.s0().equals(str2) && !ev0Var2.t0().equals(str2) && !ev0Var2.u0().equals(str2) && !ev0Var2.v0().equals(str2) && !ev0Var2.x0().equals(str2) && !ev0Var2.y0().equals(str2) && !ev0Var2.z0().equals(str2) && !ev0Var2.A0().equals(str2) && !ev0Var2.B0().equals(str2) && !ev0Var2.C0().equals(str2) && !ev0Var2.D0().equals(str2) && !ev0Var2.E0().equals(str2) && !ev0Var2.F0().equals(str2) && !ev0Var2.H0().equals(str2) && !ev0Var2.I0().equals(str2) && !ev0Var2.K0().equals(str2) && !ev0Var2.L0().equals(str2) && !ev0Var2.M0().equals(str2) && !ev0Var2.N0().equals(str2) && !ev0Var2.O0().equals(str2) && !ev0Var2.R0().equals(str2) && !ev0Var2.S0().equals(str2) && !ev0Var2.T0().equals(str2) && !ev0Var2.U0().equals(str2) && !ev0Var2.V0().equals(str2) && !ev0Var2.W0().equals(str2) && !ev0Var2.X0().equals(str2) && !ev0Var2.Y0().equals(str2) && !ev0Var2.a1().equals(str2) && !ev0Var2.b1().equals(str2) && !ev0Var2.f1().equals(str2) && !ev0Var2.g1().equals(str2) && !ev0Var2.h1().equals(str2) && !ev0Var2.i1().equals(str2) && !ev0Var2.j1().equals(str2) && !ev0Var2.k1().equals(str2) && !ev0Var2.l1().equals(str2) && !ev0Var2.m1().equals(str2) && !ev0Var2.n1().equals(str2) && !ev0Var2.o1().equals(str2) && !ev0Var2.p1().equals(str2) && !ev0Var2.q1().equals(str2) && !ev0Var2.r1().equals(str2) && !ev0Var2.s1().equals(str2) && !ev0Var2.t1().equals(str2) && !ev0Var2.u1().equals(str2) && !ev0Var2.v1().equals(str2) && !ev0Var2.w1().equals(str2) && !ev0Var2.x1().equals(str2) && !ev0Var2.y1().equals(str2) && !ev0Var2.z1().equals(str2) && !ev0Var2.A1().equals(str2) && !ev0Var2.B1().equals(str2) && !ev0Var2.C1().equals(str2) && !ev0Var2.D1().equals(str2) && !ev0Var2.E1().equals(str2) && !ev0Var2.G1().equals(str2) && !ev0Var2.H1().equals(str2) && !ev0Var2.I1().equals(str2) && !ev0Var2.F1().equals(str2) && !ev0Var2.J1().equals(str2) && !ev0Var2.K1().equals(str2) && !ev0Var2.L1().equals(str2) && !ev0Var2.M1().equals(str2) && !ev0Var2.N1().equals(str2) && !ev0Var2.O1().equals(str2) && !ev0Var2.P1().equals(str2) && !ev0Var2.Q1().equals(str2) && !ev0Var2.R1().equals(str2) && !ev0Var2.S1().equals(str2) && !ev0Var2.T1().equals(str2) && !ev0Var2.U1().equals(str2) && !ev0Var2.V1().equals(str2) && !ev0Var2.W1().equals(str2) && !ev0Var2.X1().equals(str2) && !ev0Var2.Y1().equals(str2) && !ev0Var2.Z1().equals(str2) && !ev0Var2.a2().equals(str2) && !ev0Var2.b2().equals(str2)) {
            String n4 = ev0Var2.n();
            String str3 = u82.f32876d;
            if (!n4.equals(str3) && !ev0Var2.o().equals(str3) && !ev0Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    private void X() {
        int i4 = this.f24959h1;
        if (i4 == -1 && this.f24960i1 == -1) {
            return;
        }
        rf2 rf2Var = this.f24963l1;
        if (rf2Var != null && rf2Var.f31177b == i4 && rf2Var.f31178c == this.f24960i1 && rf2Var.f31179d == this.f24961j1 && rf2Var.f31180e == this.f24962k1) {
            return;
        }
        rf2 rf2Var2 = new rf2(this.f24959h1, this.f24960i1, this.f24961j1, this.f24962k1);
        this.f24963l1 = rf2Var2;
        this.f24935J0.b(rf2Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        R();
    }

    protected static boolean b(String str) {
        if (str.startsWith(f24929q1.c1())) {
            return false;
        }
        synchronized (dv0.class) {
            try {
                if (!f24931s1) {
                    f24932t1 = W();
                    f24931s1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24932t1;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final boolean G() {
        return this.f24964m1 && u82.f32873a < 23;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void L() {
        T();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void P() {
        super.P();
        this.f24954c1 = 0;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void c(long j4) {
        super.c(j4);
        if (this.f24964m1) {
            return;
        }
        this.f24954c1--;
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        gh1 gh1Var;
        if (super.d() && (this.f24946U0 || (((gh1Var = this.f24943R0) != null && this.f24942Q0 == gh1Var) || E() == null || this.f24964m1))) {
            this.f24950Y0 = -9223372036854775807L;
            return true;
        }
        if (this.f24950Y0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f24950Y0) {
            return true;
        }
        this.f24950Y0 = -9223372036854775807L;
        return false;
    }

    protected final void e(long j4) {
        d(j4);
        X();
        this.f33287B0.f25494e++;
        this.f24948W0 = true;
        if (!this.f24946U0) {
            this.f24946U0 = true;
            this.f24935J0.a(this.f24942Q0);
            this.f24944S0 = true;
        }
        c(j4);
    }

    protected final void f(long j4) {
        ey eyVar = this.f33287B0;
        eyVar.f25500k += j4;
        eyVar.f25501l++;
        this.f24957f1 += j4;
        this.f24958g1++;
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void u() {
        this.f24963l1 = null;
        T();
        this.f24944S0 = false;
        this.f24966o1 = null;
        try {
            super.u();
        } finally {
            this.f24935J0.a(this.f33287B0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.AbstractC1811ak
    @TargetApi(17)
    protected final void v() {
        try {
            super.v();
            gh1 gh1Var = this.f24943R0;
            if (gh1Var != null) {
                if (this.f24942Q0 == gh1Var) {
                    this.f24942Q0 = null;
                }
                gh1Var.release();
                this.f24943R0 = null;
            }
        } catch (Throwable th) {
            if (this.f24943R0 != null) {
                Surface surface = this.f24942Q0;
                gh1 gh1Var2 = this.f24943R0;
                if (surface == gh1Var2) {
                    this.f24942Q0 = null;
                }
                gh1Var2.release();
                this.f24943R0 = null;
            }
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void w() {
        this.f24952a1 = 0;
        this.f24951Z0 = SystemClock.elapsedRealtime();
        this.f24956e1 = SystemClock.elapsedRealtime() * 1000;
        this.f24957f1 = 0L;
        this.f24958g1 = 0;
        this.f24934I0.b();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void x() {
        this.f24950Y0 = -9223372036854775807L;
        if (this.f24952a1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f24935J0.a(this.f24952a1, elapsedRealtime - this.f24951Z0);
            this.f24952a1 = 0;
            this.f24951Z0 = elapsedRealtime;
        }
        int i4 = this.f24958g1;
        if (i4 != 0) {
            this.f24935J0.c(i4, this.f24957f1);
            this.f24957f1 = 0L;
            this.f24958g1 = 0;
        }
        this.f24934I0.c();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final iy a(su0 su0Var, yb0 yb0Var, yb0 yb0Var2) {
        iy a4 = su0Var.a(yb0Var, yb0Var2);
        int i4 = a4.f27420e;
        int i5 = yb0Var2.f34996r;
        a aVar = this.f24939N0;
        if (i5 > aVar.f24968a || yb0Var2.f34997s > aVar.f24969b) {
            i4 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (b(yb0Var2, su0Var) > this.f24939N0.f24970c) {
            i4 |= 64;
        }
        int i6 = i4;
        return new iy(su0Var.f31947a, yb0Var, yb0Var2, i6 != 0 ? 0 : a4.f27419d, i6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        if (r9.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(yb0 yb0Var, su0 su0Var) {
        int i4;
        int intValue;
        int i5 = 4;
        char c4 = 1;
        int i6 = yb0Var.f34996r;
        int i7 = yb0Var.f34997s;
        if (i6 == -1 || i7 == -1) {
            return -1;
        }
        String str = yb0Var.f34991m;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> b4 = av0.b(yb0Var);
            str = (b4 == null || !((intValue = ((Integer) b4.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
            case 1:
            case 3:
            case 5:
                i4 = i7 * i6;
                i5 = 2;
                break;
            case 2:
            case 6:
                i4 = i7 * i6;
                break;
            case 4:
                ev0 ev0Var = f24929q1;
                String x4 = ev0Var.x();
                String str2 = u82.f32876d;
                if (!x4.equals(str2) && (!ev0Var.q().equals(u82.f32875c) || (!ev0Var.J0().equals(str2) && (!ev0Var.p().equals(str2) || !su0Var.f31952f)))) {
                    i4 = ((i7 + 15) / 16) * ((i6 + 15) / 16) * UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    i5 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    protected static int b(yb0 yb0Var, su0 su0Var) {
        if (yb0Var.f34992n != -1) {
            int size = yb0Var.f34993o.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                i4 += yb0Var.f34993o.get(i5).length;
            }
            return yb0Var.f34992n + i4;
        }
        return a(yb0Var, su0Var);
    }

    protected final boolean b(long j4, boolean z4) {
        int b4 = b(j4);
        if (b4 == 0) {
            return false;
        }
        if (z4) {
            ey eyVar = this.f33287B0;
            eyVar.f25493d += b4;
            eyVar.f25495f += this.f24954c1;
        } else {
            this.f33287B0.f25499j++;
            a(b4, this.f24954c1);
        }
        C();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void b(gy gyVar) {
        boolean z4 = this.f24964m1;
        if (!z4) {
            this.f24954c1++;
        }
        if (u82.f32873a >= 23 || !z4) {
            return;
        }
        e(gyVar.f26358f);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final float a(float f4, yb0[] yb0VarArr) {
        float f5 = -1.0f;
        for (yb0 yb0Var : yb0VarArr) {
            float f6 = yb0Var.f34998t;
            if (f6 != -1.0f) {
                f5 = Math.max(f5, f6);
            }
        }
        if (f5 == -1.0f) {
            return -1.0f;
        }
        return f5 * f4;
    }

    private boolean b(su0 su0Var) {
        if (u82.f32873a < 23 || this.f24964m1 || b(su0Var.f31947a)) {
            return false;
        }
        return !su0Var.f31952f || gh1.a(this.f24933H0);
    }

    private static sj0 a(wu0 wu0Var, yb0 yb0Var, boolean z4, boolean z5) {
        String str = yb0Var.f34991m;
        if (str == null) {
            return sj0.h();
        }
        List<su0> a4 = wu0Var.a(str, z4, z5);
        String a5 = av0.a(yb0Var);
        if (a5 == null) {
            return sj0.a((Collection) a4);
        }
        List<su0> a6 = wu0Var.a(a5, z4, z5);
        int i4 = sj0.f31764d;
        return new sj0.a().b((List) a4).b((List) a6).a();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final ArrayList a(wu0 wu0Var, yb0 yb0Var, boolean z4) {
        return av0.a(a(wu0Var, yb0Var, z4, this.f24964m1), yb0Var);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    @TargetApi(17)
    protected final ou0.a a(su0 su0Var, yb0 yb0Var, MediaCrypto mediaCrypto, float f4) {
        a aVar;
        Point point;
        int i4;
        int[] iArr;
        int i5;
        boolean z4;
        Pair<Integer, Integer> b4;
        int a4;
        gh1 gh1Var = this.f24943R0;
        if (gh1Var != null && gh1Var.f26151b != su0Var.f31952f) {
            if (this.f24942Q0 == gh1Var) {
                this.f24942Q0 = null;
            }
            gh1Var.release();
            this.f24943R0 = null;
        }
        String str = su0Var.f31949c;
        yb0[] s4 = s();
        int i6 = yb0Var.f34996r;
        int i7 = yb0Var.f34997s;
        int b5 = b(yb0Var, su0Var);
        if (s4.length == 1) {
            if (b5 != -1 && (a4 = a(yb0Var, su0Var)) != -1) {
                b5 = Math.min((int) (b5 * 1.5f), a4);
            }
            aVar = new a(i6, i7, b5);
        } else {
            int length = s4.length;
            boolean z5 = false;
            for (int i8 = 0; i8 < length; i8++) {
                yb0 yb0Var2 = s4[i8];
                if (yb0Var.f35003y != null && yb0Var2.f35003y == null) {
                    yb0Var2 = yb0Var2.a().a(yb0Var.f35003y).a();
                }
                if (su0Var.a(yb0Var, yb0Var2).f27419d != 0) {
                    int i9 = yb0Var2.f34996r;
                    z5 |= i9 == -1 || yb0Var2.f34997s == -1;
                    i6 = Math.max(i6, i9);
                    i7 = Math.max(i7, yb0Var2.f34997s);
                    b5 = Math.max(b5, b(yb0Var2, su0Var));
                }
            }
            if (z5) {
                ms0.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i6 + "x" + i7);
                int i10 = yb0Var.f34997s;
                int i11 = yb0Var.f34996r;
                boolean z6 = i10 > i11;
                int i12 = z6 ? i10 : i11;
                if (z6) {
                    i10 = i11;
                }
                float f5 = i10 / i12;
                int[] iArr2 = f24930r1;
                int length2 = iArr2.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13;
                    int i15 = iArr2[i14];
                    boolean z7 = z6;
                    int i16 = (int) (i15 * f5);
                    if (i15 <= i12 || i16 <= i10) {
                        break;
                    }
                    int i17 = i10;
                    if (u82.f32873a >= 21) {
                        point = su0Var.a(z7 ? i16 : i15, z7 ? i15 : i16);
                        i4 = i12;
                        iArr = iArr2;
                        i5 = length2;
                        if (su0Var.a(point.x, point.y, yb0Var.f34998t)) {
                            break;
                        }
                        i13 = i14 + 1;
                        z6 = z7;
                        i10 = i17;
                        i12 = i4;
                        iArr2 = iArr;
                        length2 = i5;
                    } else {
                        i4 = i12;
                        iArr = iArr2;
                        i5 = length2;
                        try {
                            int i18 = ((i15 + 15) / 16) * 16;
                            int i19 = ((i16 + 15) / 16) * 16;
                            if (i18 * i19 <= av0.a()) {
                                int i20 = z7 ? i19 : i18;
                                if (!z7) {
                                    i18 = i19;
                                }
                                point = new Point(i20, i18);
                            } else {
                                i13 = i14 + 1;
                                z6 = z7;
                                i10 = i17;
                                i12 = i4;
                                iArr2 = iArr;
                                length2 = i5;
                            }
                        } catch (av0.b unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    b5 = Math.max(b5, a(yb0Var.a().o(i6).f(i7).a(), su0Var));
                    ms0.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i6 + "x" + i7);
                }
            }
            aVar = new a(i6, i7, b5);
        }
        this.f24939N0 = aVar;
        boolean z8 = this.f24938M0;
        int i21 = this.f24964m1 ? this.f24965n1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", yb0Var.f34996r);
        mediaFormat.setInteger("height", yb0Var.f34997s);
        List<byte[]> list = yb0Var.f34993o;
        for (int i22 = 0; i22 < list.size(); i22++) {
            mediaFormat.setByteBuffer(C1877de.a("csd-", i22), ByteBuffer.wrap(list.get(i22)));
        }
        float f6 = yb0Var.f34998t;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        qv0.a(mediaFormat, "rotation-degrees", yb0Var.f34999u);
        eq eqVar = yb0Var.f35003y;
        if (eqVar != null) {
            qv0.a(mediaFormat, "color-transfer", eqVar.f25388d);
            qv0.a(mediaFormat, "color-standard", eqVar.f25386b);
            qv0.a(mediaFormat, "color-range", eqVar.f25387c);
            byte[] bArr = eqVar.f25389e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(yb0Var.f34991m) && (b4 = av0.b(yb0Var)) != null) {
            qv0.a(mediaFormat, Scopes.PROFILE, ((Integer) b4.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f24968a);
        mediaFormat.setInteger("max-height", aVar.f24969b);
        qv0.a(mediaFormat, "max-input-size", aVar.f24970c);
        if (u82.f32873a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f4 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f4);
            }
        }
        if (z8) {
            z4 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z4 = true;
        }
        if (i21 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z4);
            mediaFormat.setInteger("audio-session-id", i21);
        }
        if (this.f24942Q0 == null) {
            if (b(su0Var)) {
                if (this.f24943R0 == null) {
                    this.f24943R0 = gh1.a(this.f24933H0, su0Var.f31952f);
                }
                this.f24942Q0 = this.f24943R0;
            } else {
                throw new IllegalStateException();
            }
        }
        return ou0.a.a(su0Var, mediaFormat, yb0Var, this.f24942Q0, mediaCrypto);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    @TargetApi(29)
    protected final void a(gy gyVar) {
        if (this.f24941P0) {
            ByteBuffer byteBuffer = gyVar.f26359g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b4 = byteBuffer.get();
                short s4 = byteBuffer.getShort();
                short s5 = byteBuffer.getShort();
                byte b5 = byteBuffer.get();
                byte b6 = byteBuffer.get();
                byteBuffer.position(0);
                if (b4 == -75 && s4 == 60 && s5 == 1 && b5 == 4 && b6 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    ou0 E4 = E();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    E4.a(bundle);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak, com.yandex.mobile.ads.impl.fi1.b
    public final void a(int i4, Object obj) {
        if (i4 == 1) {
            a(obj);
            return;
        }
        if (i4 == 7) {
            this.f24967p1 = (he2) obj;
            return;
        }
        if (i4 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f24965n1 != intValue) {
                this.f24965n1 = intValue;
                if (this.f24964m1) {
                    N();
                    return;
                }
                return;
            }
            return;
        }
        if (i4 != 4) {
            if (i4 != 5) {
                return;
            }
            this.f24934I0.a(((Integer) obj).intValue());
        } else {
            this.f24945T0 = ((Integer) obj).intValue();
            ou0 E4 = E();
            if (E4 != null) {
                E4.a(this.f24945T0);
            }
        }
    }

    private void a(long j4, long j5, yb0 yb0Var) {
        he2 he2Var = this.f24967p1;
        if (he2Var != null) {
            he2Var.a(j4, j5, yb0Var, H());
        }
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void a(Exception exc) {
        ms0.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f24935J0.b(exc);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void a(String str, long j4, long j5) {
        this.f24935J0.a(str, j4, j5);
        this.f24940O0 = b(str);
        su0 F4 = F();
        F4.getClass();
        this.f24941P0 = F4.a();
        if (u82.f32873a < 23 || !this.f24964m1) {
            return;
        }
        ou0 E4 = E();
        E4.getClass();
        this.f24966o1 = new b(E4);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void a(String str) {
        this.f24935J0.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(boolean z4, boolean z5) {
        super.a(z4, z5);
        boolean z6 = p().f33221a;
        if (z6 && this.f24965n1 == 0) {
            throw new IllegalStateException();
        }
        if (this.f24964m1 != z6) {
            this.f24964m1 = z6;
            N();
        }
        this.f24935J0.b(this.f33287B0);
        this.f24947V0 = z5;
        this.f24948W0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final iy a(zb0 zb0Var) {
        iy a4 = super.a(zb0Var);
        this.f24935J0.a(zb0Var.f35541b, a4);
        return a4;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final void a(yb0 yb0Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        ou0 E4 = E();
        if (E4 != null) {
            E4.a(this.f24945T0);
        }
        if (this.f24964m1) {
            this.f24959h1 = yb0Var.f34996r;
            this.f24960i1 = yb0Var.f34997s;
        } else {
            mediaFormat.getClass();
            boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z4) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f24959h1 = integer;
            if (z4) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f24960i1 = integer2;
        }
        float f4 = yb0Var.f35000v;
        this.f24962k1 = f4;
        if (u82.f32873a >= 21) {
            int i4 = yb0Var.f34999u;
            if (i4 == 90 || i4 == 270) {
                int i5 = this.f24959h1;
                this.f24959h1 = this.f24960i1;
                this.f24960i1 = i5;
                this.f24962k1 = 1.0f / f4;
            }
        } else {
            this.f24961j1 = yb0Var.f34999u;
        }
        this.f24934I0.a(yb0Var.f34998t);
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(long j4, boolean z4) {
        super.a(j4, z4);
        T();
        this.f24934I0.a();
        this.f24955d1 = -9223372036854775807L;
        this.f24949X0 = -9223372036854775807L;
        this.f24953b1 = 0;
        if (z4) {
            this.f24950Y0 = this.f24936K0 > 0 ? SystemClock.elapsedRealtime() + this.f24936K0 : -9223372036854775807L;
        } else {
            this.f24950Y0 = -9223372036854775807L;
        }
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final boolean a(long j4, long j5, ou0 ou0Var, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, yb0 yb0Var) {
        boolean z6;
        ou0Var.getClass();
        if (this.f24949X0 == -9223372036854775807L) {
            this.f24949X0 = j4;
        }
        if (j6 != this.f24955d1) {
            this.f24934I0.b(j6);
            this.f24955d1 = j6;
        }
        long I3 = I();
        long j7 = j6 - I3;
        if (z4 && !z5) {
            j52.a("skipVideoBuffer");
            ou0Var.a(false, i4);
            j52.a();
            this.f33287B0.f25495f++;
            return true;
        }
        double J3 = J();
        boolean z7 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j8 = (long) ((j6 - j4) / J3);
        if (z7) {
            j8 -= elapsedRealtime - j5;
        }
        if (this.f24942Q0 == this.f24943R0) {
            if (j8 >= -30000) {
                return false;
            }
            j52.a("skipVideoBuffer");
            ou0Var.a(false, i4);
            j52.a();
            this.f33287B0.f25495f++;
            f(j8);
            return true;
        }
        long j9 = elapsedRealtime - this.f24956e1;
        boolean z8 = this.f24948W0 ? !this.f24946U0 : z7 || this.f24947V0;
        if (this.f24950Y0 == -9223372036854775807L && j4 >= I3 && (z8 || (z7 && j8 < -30000 && j9 > 100000))) {
            long nanoTime = System.nanoTime();
            a(j7, nanoTime, yb0Var);
            if (u82.f32873a >= 21) {
                a(ou0Var, i4, nanoTime);
            } else {
                a(ou0Var, i4);
            }
            f(j8);
            return true;
        }
        if (!z7 || j4 == this.f24949X0) {
            return false;
        }
        long nanoTime2 = System.nanoTime();
        long a4 = this.f24934I0.a((j8 * 1000) + nanoTime2);
        long j10 = (a4 - nanoTime2) / 1000;
        boolean z9 = this.f24950Y0 != -9223372036854775807L;
        if (j10 < -500000 && !z5 && b(j4, z9)) {
            return false;
        }
        if (j10 < -30000 && !z5) {
            if (z9) {
                j52.a("skipVideoBuffer");
                ou0Var.a(false, i4);
                j52.a();
                this.f33287B0.f25495f++;
                z6 = true;
            } else {
                j52.a("dropVideoBuffer");
                ou0Var.a(false, i4);
                j52.a();
                z6 = true;
                a(0, 1);
            }
            f(j10);
            return z6;
        }
        if (u82.f32873a >= 21) {
            if (j10 < 50000) {
                a(j7, a4, yb0Var);
                a(ou0Var, i4, a4);
                f(j10);
                return true;
            }
        } else if (j10 < UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS) {
            if (j10 > 11000) {
                try {
                    Thread.sleep((j10 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            a(j7, a4, yb0Var);
            a(ou0Var, i4);
            f(j10);
            return true;
        }
        return false;
    }

    protected final void a(ou0 ou0Var, int i4) {
        X();
        j52.a("releaseOutputBuffer");
        ou0Var.a(true, i4);
        j52.a();
        this.f24956e1 = SystemClock.elapsedRealtime() * 1000;
        this.f33287B0.f25494e++;
        this.f24953b1 = 0;
        this.f24948W0 = true;
        if (this.f24946U0) {
            return;
        }
        this.f24946U0 = true;
        this.f24935J0.a(this.f24942Q0);
        this.f24944S0 = true;
    }

    protected final void a(ou0 ou0Var, int i4, long j4) {
        X();
        j52.a("releaseOutputBuffer");
        ou0Var.a(i4, j4);
        j52.a();
        this.f24956e1 = SystemClock.elapsedRealtime() * 1000;
        this.f33287B0.f25494e++;
        this.f24953b1 = 0;
        this.f24948W0 = true;
        if (this.f24946U0) {
            return;
        }
        this.f24946U0 = true;
        this.f24935J0.a(this.f24942Q0);
        this.f24944S0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.view.Surface] */
    private void a(Object obj) {
        gh1 gh1Var = obj instanceof Surface ? (Surface) obj : null;
        if (gh1Var == null) {
            gh1 gh1Var2 = this.f24943R0;
            if (gh1Var2 != null) {
                gh1Var = gh1Var2;
            } else {
                su0 F4 = F();
                if (F4 != null && b(F4)) {
                    gh1Var = gh1.a(this.f24933H0, F4.f31952f);
                    this.f24943R0 = gh1Var;
                }
            }
        }
        if (this.f24942Q0 != gh1Var) {
            this.f24942Q0 = gh1Var;
            this.f24934I0.a(gh1Var);
            this.f24944S0 = false;
            int state = getState();
            ou0 E4 = E();
            if (E4 != null) {
                if (u82.f32873a >= 23 && gh1Var != null && !this.f24940O0) {
                    E4.a(gh1Var);
                } else {
                    N();
                    K();
                }
            }
            if (gh1Var != null && gh1Var != this.f24943R0) {
                rf2 rf2Var = this.f24963l1;
                if (rf2Var != null) {
                    this.f24935J0.b(rf2Var);
                }
                T();
                if (state == 2) {
                    this.f24950Y0 = this.f24936K0 > 0 ? SystemClock.elapsedRealtime() + this.f24936K0 : -9223372036854775807L;
                    return;
                }
                return;
            }
            this.f24963l1 = null;
            T();
            return;
        }
        if (gh1Var == null || gh1Var == this.f24943R0) {
            return;
        }
        rf2 rf2Var2 = this.f24963l1;
        if (rf2Var2 != null) {
            this.f24935J0.b(rf2Var2);
        }
        if (this.f24944S0) {
            this.f24935J0.a(this.f24942Q0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.uu0, com.yandex.mobile.ads.impl.so1
    public final void a(float f4, float f5) {
        super.a(f4, f5);
        this.f24934I0.b(f4);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final boolean a(su0 su0Var) {
        return this.f24942Q0 != null || b(su0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.uu0
    protected final int a(wu0 wu0Var, yb0 yb0Var) {
        boolean z4;
        int i4 = 0;
        if (!i01.f(yb0Var.f34991m)) {
            return to1.a(0, 0, 0);
        }
        boolean z5 = yb0Var.f34994p != null;
        sj0 a4 = a(wu0Var, yb0Var, z5, false);
        if (z5 && a4.isEmpty()) {
            a4 = a(wu0Var, yb0Var, false, false);
        }
        if (a4.isEmpty()) {
            return to1.a(1, 0, 0);
        }
        int i5 = yb0Var.f34978F;
        if (i5 != 0 && i5 != 2) {
            return to1.a(2, 0, 0);
        }
        su0 su0Var = (su0) a4.get(0);
        boolean a5 = su0Var.a(yb0Var);
        if (!a5) {
            for (int i6 = 1; i6 < a4.size(); i6++) {
                su0 su0Var2 = (su0) a4.get(i6);
                if (su0Var2.a(yb0Var)) {
                    z4 = false;
                    a5 = true;
                    su0Var = su0Var2;
                    break;
                }
            }
        }
        z4 = true;
        int i7 = a5 ? 4 : 3;
        int i8 = su0Var.b(yb0Var) ? 16 : 8;
        int i9 = su0Var.f31953g ? 64 : 0;
        int i10 = z4 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0;
        if (a5) {
            sj0 a6 = a(wu0Var, yb0Var, z5, true);
            if (!a6.isEmpty()) {
                su0 su0Var3 = (su0) av0.a(a6, yb0Var).get(0);
                if (su0Var3.a(yb0Var) && su0Var3.b(yb0Var)) {
                    i4 = 32;
                }
            }
        }
        return i7 | i8 | i4 | i9 | i10;
    }

    protected final void a(int i4, int i5) {
        int i6;
        ey eyVar = this.f33287B0;
        eyVar.f25497h += i4;
        int i7 = i4 + i5;
        eyVar.f25496g += i7;
        this.f24952a1 += i7;
        int i8 = this.f24953b1 + i7;
        this.f24953b1 = i8;
        eyVar.f25498i = Math.max(i8, eyVar.f25498i);
        int i9 = this.f24937L0;
        if (i9 <= 0 || (i6 = this.f24952a1) < i9 || i6 <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f24935J0.a(this.f24952a1, elapsedRealtime - this.f24951Z0);
        this.f24952a1 = 0;
        this.f24951Z0 = elapsedRealtime;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    protected final ru0 a(IllegalStateException illegalStateException, su0 su0Var) {
        return new cv0(illegalStateException, su0Var, this.f24942Q0);
    }
}
