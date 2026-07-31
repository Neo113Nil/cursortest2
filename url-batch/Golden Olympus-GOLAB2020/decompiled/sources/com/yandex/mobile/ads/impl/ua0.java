package com.yandex.mobile.ads.impl;

import C2.C0307f;
import D2.AbstractC0348a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.appsflyer.AdRevenueScheme;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.ironsource.b9;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.fs0;
import com.yandex.mobile.ads.impl.vp;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j2.AbstractC3185a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ua0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2013j7 f32896a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l50 f32897b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Sequence<Map.Entry<String, Object>> f32898c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Sequence<Map.Entry<String, Object>> f32899d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final W1.h f32900e;

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        @Nullable
        private Location f32901A;

        /* renamed from: A0, reason: collision with root package name */
        @Nullable
        private String f32902A0;

        /* renamed from: B, reason: collision with root package name */
        @Nullable
        private Integer f32903B;

        /* renamed from: B0, reason: collision with root package name */
        @Nullable
        private String f32904B0;

        /* renamed from: C, reason: collision with root package name */
        @Nullable
        private Integer f32905C;

        /* renamed from: C0, reason: collision with root package name */
        @Nullable
        private String f32906C0;

        /* renamed from: D, reason: collision with root package name */
        @Nullable
        private Float f32907D;

        /* renamed from: D0, reason: collision with root package name */
        @Nullable
        private String f32908D0;

        /* renamed from: E, reason: collision with root package name */
        @Nullable
        private Integer f32909E;

        /* renamed from: E0, reason: collision with root package name */
        @Nullable
        private String f32910E0;

        /* renamed from: F, reason: collision with root package name */
        @Nullable
        private Integer f32911F;

        /* renamed from: F0, reason: collision with root package name */
        @Nullable
        private String f32912F0;

        /* renamed from: G, reason: collision with root package name */
        @Nullable
        private String f32913G;

        /* renamed from: G0, reason: collision with root package name */
        @Nullable
        private String f32914G0;

        /* renamed from: H, reason: collision with root package name */
        @Nullable
        private String f32915H;

        /* renamed from: H0, reason: collision with root package name */
        @Nullable
        private Boolean f32916H0;

        /* renamed from: I, reason: collision with root package name */
        @Nullable
        private C1918f7 f32917I;

        /* renamed from: I0, reason: collision with root package name */
        @Nullable
        private String f32918I0;

        /* renamed from: J, reason: collision with root package name */
        @Nullable
        private Integer f32919J;

        /* renamed from: J0, reason: collision with root package name */
        @Nullable
        private String f32920J0;

        /* renamed from: K, reason: collision with root package name */
        @Nullable
        private Integer f32921K;

        /* renamed from: K0, reason: collision with root package name */
        @Nullable
        private String f32922K0;

        /* renamed from: L, reason: collision with root package name */
        @Nullable
        private String f32923L;

        /* renamed from: L0, reason: collision with root package name */
        @Nullable
        private String f32924L0;

        /* renamed from: M, reason: collision with root package name */
        @Nullable
        private Boolean f32925M;

        /* renamed from: M0, reason: collision with root package name */
        @Nullable
        private String f32926M0;

        /* renamed from: N, reason: collision with root package name */
        @Nullable
        private Boolean f32927N;

        /* renamed from: N0, reason: collision with root package name */
        @Nullable
        private String f32928N0;

        /* renamed from: O, reason: collision with root package name */
        @Nullable
        private String f32929O;

        /* renamed from: O0, reason: collision with root package name */
        @Nullable
        private Boolean f32930O0;

        /* renamed from: P, reason: collision with root package name */
        @Nullable
        private Boolean f32931P;

        /* renamed from: P0, reason: collision with root package name */
        @Nullable
        private Boolean f32932P0;

        /* renamed from: Q, reason: collision with root package name */
        @Nullable
        private String f32933Q;

        /* renamed from: Q0, reason: collision with root package name */
        @Nullable
        private Boolean f32934Q0;

        /* renamed from: R, reason: collision with root package name */
        @Nullable
        private Integer f32935R;

        /* renamed from: S, reason: collision with root package name */
        @Nullable
        private Boolean f32936S;

        /* renamed from: T, reason: collision with root package name */
        @Nullable
        private String f32937T;

        /* renamed from: U, reason: collision with root package name */
        @Nullable
        private String f32938U;

        /* renamed from: V, reason: collision with root package name */
        @Nullable
        private String f32939V;

        /* renamed from: W, reason: collision with root package name */
        @Nullable
        private String f32940W;

        /* renamed from: X, reason: collision with root package name */
        @Nullable
        private String f32941X;

        /* renamed from: Y, reason: collision with root package name */
        @Nullable
        private Long f32942Y;

        /* renamed from: Z, reason: collision with root package name */
        @Nullable
        private String f32943Z;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f32944a;

        /* renamed from: a0, reason: collision with root package name */
        @Nullable
        private String f32945a0;

        /* renamed from: b0, reason: collision with root package name */
        @Nullable
        private String f32947b0;

        /* renamed from: c0, reason: collision with root package name */
        @Nullable
        private String f32949c0;

        /* renamed from: d0, reason: collision with root package name */
        @Nullable
        private String f32951d0;

        /* renamed from: e0, reason: collision with root package name */
        @Nullable
        private String f32953e0;

        /* renamed from: f, reason: collision with root package name */
        private boolean f32954f;

        /* renamed from: f0, reason: collision with root package name */
        @Nullable
        private String f32955f0;

        /* renamed from: g, reason: collision with root package name */
        private boolean f32956g;

        /* renamed from: g0, reason: collision with root package name */
        @Nullable
        private String f32957g0;

        /* renamed from: h0, reason: collision with root package name */
        @Nullable
        private String f32959h0;

        /* renamed from: i0, reason: collision with root package name */
        @Nullable
        private String f32961i0;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        private Boolean f32962j;

        /* renamed from: j0, reason: collision with root package name */
        @Nullable
        private String f32963j0;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        private Boolean f32964k;

        /* renamed from: k0, reason: collision with root package name */
        @Nullable
        private String f32965k0;

        /* renamed from: l, reason: collision with root package name */
        @Nullable
        private String f32966l;

        /* renamed from: l0, reason: collision with root package name */
        @Nullable
        private String f32967l0;

        /* renamed from: m, reason: collision with root package name */
        @Nullable
        private Integer f32968m;

        /* renamed from: m0, reason: collision with root package name */
        @Nullable
        private String f32969m0;

        /* renamed from: n, reason: collision with root package name */
        private boolean f32970n;

        /* renamed from: n0, reason: collision with root package name */
        @Nullable
        private List<String> f32971n0;

        /* renamed from: o, reason: collision with root package name */
        @Nullable
        private String f32972o;

        /* renamed from: o0, reason: collision with root package name */
        @Nullable
        private String f32973o0;

        /* renamed from: p, reason: collision with root package name */
        @Nullable
        private String f32974p;

        /* renamed from: p0, reason: collision with root package name */
        @Nullable
        private String f32975p0;

        /* renamed from: q, reason: collision with root package name */
        @Nullable
        private String f32976q;

        /* renamed from: q0, reason: collision with root package name */
        @Nullable
        private String f32977q0;

        /* renamed from: r, reason: collision with root package name */
        @Nullable
        private String f32978r;

        /* renamed from: r0, reason: collision with root package name */
        @Nullable
        private String f32979r0;

        /* renamed from: s, reason: collision with root package name */
        @Nullable
        private String f32980s;

        /* renamed from: s0, reason: collision with root package name */
        private int f32981s0;

        /* renamed from: t, reason: collision with root package name */
        @Nullable
        private String f32982t;

        /* renamed from: t0, reason: collision with root package name */
        private float f32983t0;

        /* renamed from: u, reason: collision with root package name */
        @Nullable
        private String f32984u;

        /* renamed from: u0, reason: collision with root package name */
        private float f32985u0;

        /* renamed from: v, reason: collision with root package name */
        @Nullable
        private String f32986v;

        /* renamed from: v0, reason: collision with root package name */
        private float f32987v0;

        /* renamed from: w, reason: collision with root package name */
        @Nullable
        private Integer f32988w;

        /* renamed from: w0, reason: collision with root package name */
        private float f32989w0;

        /* renamed from: x, reason: collision with root package name */
        @Nullable
        private Integer f32990x;

        /* renamed from: x0, reason: collision with root package name */
        private float f32991x0;

        /* renamed from: y, reason: collision with root package name */
        @Nullable
        private String f32992y;

        /* renamed from: y0, reason: collision with root package name */
        private float f32993y0;

        /* renamed from: z, reason: collision with root package name */
        @Nullable
        private String f32994z;

        /* renamed from: z0, reason: collision with root package name */
        @Nullable
        private String f32995z0;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final y00 f32946b = new y00(0);

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C1902ef f32948c = new C1902ef();

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final lw1 f32950d = new lw1();

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final C1827bc f32952e = new C1827bc();

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final HashMap f32958h = new HashMap();

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final HashMap f32960i = new HashMap();

        public a(boolean z4) {
            this.f32944a = z4;
        }

        @Nullable
        public final String A() {
            return this.f32979r0;
        }

        @Nullable
        public final String A0() {
            return this.f32928N0;
        }

        @Nullable
        public final String B() {
            return this.f32912F0;
        }

        @Nullable
        public final String B0() {
            return this.f32920J0;
        }

        @Nullable
        public final String C() {
            return this.f32957g0;
        }

        @Nullable
        public final Boolean C0() {
            return this.f32962j;
        }

        @Nullable
        public final Boolean D() {
            return this.f32927N;
        }

        @Nullable
        public final String D0() {
            return this.f32947b0;
        }

        @Nullable
        public final String E() {
            return this.f32972o;
        }

        @Nullable
        public final String E0() {
            return this.f32982t;
        }

        @Nullable
        public final String F() {
            return this.f32974p;
        }

        @Nullable
        public final String F0() {
            return this.f32978r;
        }

        @Nullable
        public final String G() {
            return this.f32902A0;
        }

        @Nullable
        public final String G0() {
            return this.f32914G0;
        }

        @Nullable
        public final Boolean H() {
            return this.f32930O0;
        }

        @Nullable
        public final Boolean H0() {
            return this.f32934Q0;
        }

        @Nullable
        public final String I() {
            return this.f32929O;
        }

        @Nullable
        public final Boolean I0() {
            return this.f32916H0;
        }

        @Nullable
        public final Boolean J() {
            return this.f32925M;
        }

        @Nullable
        public final Integer J0() {
            return this.f32988w;
        }

        public final boolean K() {
            return this.f32956g;
        }

        @Nullable
        public final String K0() {
            return this.f32923L;
        }

        @Nullable
        public final String L() {
            return this.f32951d0;
        }

        @Nullable
        public final Boolean L0() {
            return this.f32936S;
        }

        @Nullable
        public final Integer M() {
            return this.f32990x;
        }

        @NotNull
        public final a M0() {
            int i4 = ew1.f25476l;
            this.f32964k = ew1.a.a().e();
            return this;
        }

        @Nullable
        public final String N() {
            return this.f32933Q;
        }

        @NotNull
        public final a N0() {
            this.f32908D0 = this.f32948c.a();
            return this;
        }

        @Nullable
        public final Boolean O() {
            return this.f32931P;
        }

        @NotNull
        public final a O0() {
            this.f32943Z = "UTF-8";
            return this;
        }

        @Nullable
        public final String P() {
            return this.f32939V;
        }

        @NotNull
        public final a P0() {
            this.f32954f = true;
            return this;
        }

        @Nullable
        public final String Q() {
            return this.f32926M0;
        }

        @NotNull
        public final a Q0() {
            this.f32945a0 = null;
            return this;
        }

        @Nullable
        public final Integer R() {
            return this.f32921K;
        }

        @NotNull
        public final a R0() {
            br connectedIdsProvider = new br(new io0());
            Intrinsics.checkNotNullParameter(connectedIdsProvider, "connectedIdsProvider");
            ArrayList a4 = connectedIdsProvider.a();
            AbstractC0348a.C0007a c0007a = AbstractC0348a.f371d;
            c0007a.a();
            this.f32955f0 = c0007a.b(new C0307f(C2.M0.f224a), a4);
            return this;
        }

        @Nullable
        public final String S() {
            return this.f32967l0;
        }

        @NotNull
        public final a S0() {
            this.f32904B0 = this.f32950d.a();
            this.f32906C0 = this.f32950d.b();
            return this;
        }

        @Nullable
        public final Location T() {
            return this.f32901A;
        }

        @NotNull
        public final a T0() {
            int i4 = ew1.f25476l;
            this.f32962j = ew1.a.a().i();
            return this;
        }

        @Nullable
        public final String U() {
            return this.f32963j0;
        }

        @NotNull
        public final a U0() {
            this.f32947b0 = null;
            return this;
        }

        @Nullable
        public final String V() {
            return this.f32966l;
        }

        @Nullable
        public final Integer W() {
            return this.f32909E;
        }

        @Nullable
        public final Integer X() {
            return this.f32911F;
        }

        @Nullable
        public final String Y() {
            return this.f32965k0;
        }

        @Nullable
        public final String Z() {
            return this.f32913G;
        }

        @Nullable
        public final C1918f7 a() {
            return this.f32917I;
        }

        @Nullable
        public final String a0() {
            return this.f32949c0;
        }

        @Nullable
        public final String b() {
            return this.f32992y;
        }

        @Nullable
        public final Boolean b0() {
            return this.f32932P0;
        }

        @Nullable
        public final String c() {
            return this.f32986v;
        }

        @Nullable
        public final String c0() {
            return this.f32994z;
        }

        @Nullable
        public final String d() {
            return this.f32984u;
        }

        @Nullable
        public final String d0() {
            return this.f32959h0;
        }

        @Nullable
        public final String e() {
            return this.f32980s;
        }

        @Nullable
        public final String e0() {
            return this.f32961i0;
        }

        @NotNull
        public final HashMap f() {
            return this.f32958h;
        }

        @NotNull
        public final HashMap f0() {
            return this.f32960i;
        }

        @Nullable
        public final Integer g() {
            return this.f32968m;
        }

        @Nullable
        public final List<String> g0() {
            return this.f32971n0;
        }

        @Nullable
        public final String h() {
            return this.f32995z0;
        }

        @Nullable
        public final String h0() {
            return this.f32910E0;
        }

        @Nullable
        public final Boolean i() {
            return this.f32964k;
        }

        @Nullable
        public final String i0() {
            return this.f32953e0;
        }

        @Nullable
        public final String j() {
            return this.f32973o0;
        }

        @Nullable
        public final String j0() {
            return this.f32976q;
        }

        @Nullable
        public final String k() {
            return this.f32969m0;
        }

        @Nullable
        public final String k0() {
            return this.f32940W;
        }

        @Nullable
        public final String l() {
            return this.f32908D0;
        }

        public final float l0() {
            return this.f32989w0;
        }

        @Nullable
        public final String m() {
            return this.f32975p0;
        }

        public final float m0() {
            return this.f32983t0;
        }

        @Nullable
        public final String n() {
            return this.f32977q0;
        }

        public final float n0() {
            return this.f32987v0;
        }

        @Nullable
        public final Integer o() {
            return this.f32935R;
        }

        public final float o0() {
            return this.f32985u0;
        }

        @Nullable
        public final String p() {
            return this.f32915H;
        }

        @Nullable
        public final Float p0() {
            return this.f32907D;
        }

        @Nullable
        public final Integer q() {
            return this.f32919J;
        }

        public final int q0() {
            return this.f32981s0;
        }

        @Nullable
        public final String r() {
            return this.f32943Z;
        }

        @Nullable
        public final Integer r0() {
            return this.f32905C;
        }

        public final boolean s() {
            return this.f32970n;
        }

        @Nullable
        public final Integer s0() {
            return this.f32903B;
        }

        public final boolean t() {
            return this.f32954f;
        }

        @Nullable
        public final String t0() {
            return this.f32904B0;
        }

        @Nullable
        public final String u() {
            return this.f32955f0;
        }

        @Nullable
        public final String u0() {
            return this.f32906C0;
        }

        @Nullable
        public final String v() {
            return this.f32937T;
        }

        @Nullable
        public final String v0() {
            return this.f32924L0;
        }

        @Nullable
        public final String w() {
            return this.f32938U;
        }

        @Nullable
        public final String w0() {
            return this.f32922K0;
        }

        public final float x() {
            return this.f32993y0;
        }

        @Nullable
        public final Long x0() {
            return this.f32942Y;
        }

        public final float y() {
            return this.f32991x0;
        }

        @Nullable
        public final String y0() {
            return this.f32941X;
        }

        @Nullable
        public final String z() {
            return this.f32945a0;
        }

        @Nullable
        public final String z0() {
            return this.f32918I0;
        }

        @NotNull
        public final a a(@Nullable C1918f7 c1918f7) {
            String str;
            if (c1918f7 != null) {
                String str2 = null;
                this.f32917I = this.f32944a ? null : c1918f7;
                String c4 = c1918f7.c();
                if (c4 == null || c4.length() == 0) {
                    str = null;
                } else {
                    String encode = Uri.encode(c4);
                    if (encode != null && encode.length() > 1024) {
                        int i4 = um1.f33179b;
                        um1.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                        String encode2 = Uri.encode(" ");
                        String substring = encode.substring(0, 1024);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        Intrinsics.checkNotNull(encode2);
                        boolean J3 = StringsKt.J(encode, encode2, 1024, false, 4, null);
                        int h02 = StringsKt.h0(substring, encode2, 0, false, 6, null);
                        if (J3 || h02 < 0) {
                            encode = substring;
                        } else {
                            encode = substring.substring(0, h02);
                            Intrinsics.checkNotNullExpressionValue(encode, "substring(...)");
                        }
                    }
                    str = Uri.decode(encode);
                }
                this.f32937T = str;
                List<String> d4 = c1918f7.d();
                String str3 = "";
                if (d4 != null) {
                    StringBuilder sb = new StringBuilder();
                    for (String str4 : d4) {
                        sb.append(str3);
                        sb.append(str4);
                        sb.append("\n");
                        str3 = "3";
                    }
                    str3 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(str3, "toString(...)");
                }
                if (str3.length() != 0) {
                    String encode3 = Uri.encode(str3);
                    if (encode3 != null && encode3.length() > 2048) {
                        int i5 = um1.f33179b;
                        um1.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f17688n), Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f17688n));
                        String encode4 = Uri.encode("\n");
                        String substring2 = encode3.substring(0, com.ironsource.mediationsdk.metadata.a.f17688n);
                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        Intrinsics.checkNotNull(encode4);
                        int h03 = StringsKt.h0(substring2, encode4, 0, false, 6, null);
                        if (StringsKt.v(substring2, encode4, false, 2, null) || h03 < 0) {
                            encode3 = substring2;
                        } else {
                            encode3 = substring2.substring(0, h03);
                            Intrinsics.checkNotNullExpressionValue(encode3, "substring(...)");
                        }
                    }
                    str2 = Uri.decode(encode3);
                }
                this.f32938U = str2;
                this.f32995z0 = C2061l7.a(c1918f7.b());
                this.f32902A0 = C2061l7.a(c1918f7.e());
                this.f32949c0 = c1918f7.g();
                gq1 i6 = c1918f7.i();
                if (i6 != null) {
                    this.f32910E0 = C2061l7.a(i6.a());
                }
                a(C2061l7.a(c1918f7.h()));
            }
            return this;
        }

        @NotNull
        public final a b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            this.f32973o0 = packageName;
            this.f32975p0 = C1997ie.a(context);
            this.f32977q0 = C1997ie.b(context);
            return this;
        }

        @NotNull
        public final a c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            vp.f33717a.getClass();
            this.f32970n = ((xp) vp.a.a(context)).e();
            return this;
        }

        @NotNull
        public final a d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f32912F0 = (new ev(context).a() ? gq1.f26274d : gq1.f26273c).a();
            return this;
        }

        @NotNull
        public final a e(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            vp.f33717a.getClass();
            this.f32972o = ((xp) vp.a.a(context)).a();
            return this;
        }

        @NotNull
        public final a f(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            vp.f33717a.getClass();
            this.f32974p = ((xp) vp.a.a(context)).b();
            return this;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:2|3)|(12:5|6|7|8|(7:10|11|12|13|(4:19|(1:21)|22|(4:24|(3:26|(2:28|29)(2:31|32)|30)|33|34))(1:15)|16|17)|38|11|12|13|(0)(0)|16|17)|41|6|7|8|(0)|38|11|12|13|(0)(0)|16|17) */
        /* JADX WARN: Removed duplicated region for block: B:10:0x004f A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #1 {Exception -> 0x0055, blocks: (B:8:0x0037, B:10:0x004f), top: B:7:0x0037 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[Catch: Exception -> 0x00ca, TryCatch #0 {Exception -> 0x00ca, blocks: (B:13:0x005b, B:19:0x0073, B:21:0x0079, B:22:0x007d, B:24:0x008c, B:26:0x00a1, B:30:0x00c2, B:34:0x00c6), top: B:12:0x005b }] */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a g(@NotNull Context context) {
            Integer num;
            Integer num2;
            WifiManager wifiManager;
            int lac;
            int cid;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            String str = null;
            try {
                Object systemService = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                CellLocation cellLocation = ((TelephonyManager) systemService).getCellLocation();
                Intrinsics.checkNotNull(cellLocation, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
                cid = ((GsmCellLocation) cellLocation).getCid();
            } catch (Exception unused) {
            }
            if (-1 != cid) {
                num = Integer.valueOf(cid & 65535);
                this.f32919J = num;
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService2 = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                CellLocation cellLocation2 = ((TelephonyManager) systemService2).getCellLocation();
                Intrinsics.checkNotNull(cellLocation2, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
                lac = ((GsmCellLocation) cellLocation2).getLac();
                if (-1 != lac) {
                    num2 = Integer.valueOf(lac & 65535);
                    this.f32921K = num2;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Object systemService3 = context.getApplicationContext().getSystemService(com.ironsource.x8.f20294b);
                    Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    wifiManager = (WifiManager) systemService3;
                    if (wifiManager.isWifiEnabled()) {
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        if (scanResults == null) {
                            scanResults = CollectionsKt.emptyList();
                        }
                        List sortedWith = CollectionsKt.sortedWith(scanResults, new zg1());
                        if (!sortedWith.isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            int min = Math.min(3, sortedWith.size());
                            int i4 = 0;
                            while (i4 < min) {
                                sb.append(((ScanResult) sortedWith.get(i4)).BSSID);
                                sb.append(StringUtils.COMMA);
                                sb.append(((ScanResult) sortedWith.get(i4)).level);
                                i4++;
                                sb.append(i4 < min ? ";" : "");
                            }
                            str = sb.toString();
                        }
                    }
                    this.f32923L = str;
                    return this;
                }
                num2 = null;
                this.f32921K = num2;
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService32 = context.getApplicationContext().getSystemService(com.ironsource.x8.f20294b);
                Intrinsics.checkNotNull(systemService32, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                wifiManager = (WifiManager) systemService32;
                if (wifiManager.isWifiEnabled()) {
                }
                this.f32923L = str;
                return this;
            }
            num = null;
            this.f32919J = num;
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService22 = context.getSystemService("phone");
            Intrinsics.checkNotNull(systemService22, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            CellLocation cellLocation22 = ((TelephonyManager) systemService22).getCellLocation();
            Intrinsics.checkNotNull(cellLocation22, "null cannot be cast to non-null type android.telephony.gsm.GsmCellLocation");
            lac = ((GsmCellLocation) cellLocation22).getLac();
            if (-1 != lac) {
            }
            num2 = null;
            this.f32921K = num2;
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService322 = context.getApplicationContext().getSystemService(com.ironsource.x8.f20294b);
            Intrinsics.checkNotNull(systemService322, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            wifiManager = (WifiManager) systemService322;
            if (wifiManager.isWifiEnabled()) {
            }
            this.f32923L = str;
            return this;
        }

        @NotNull
        public final a h(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i4 = fs0.f25910h;
            this.f32901A = this.f32944a ? null : fs0.a.a(context).c();
            return this;
        }

        @NotNull
        public final a i(@NotNull Context context) {
            Integer num;
            Integer num2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            String str = null;
            try {
                Object systemService = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
                Intrinsics.checkNotNullExpressionValue(networkOperator, "getNetworkOperator(...)");
                String substring = networkOperator.substring(0, 3);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                num = StringsKt.toIntOrNull(substring);
            } catch (Exception unused) {
                num = null;
            }
            this.f32909E = num;
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Object systemService2 = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperator2 = ((TelephonyManager) systemService2).getNetworkOperator();
                Intrinsics.checkNotNullExpressionValue(networkOperator2, "getNetworkOperator(...)");
                String substring2 = networkOperator2.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                num2 = StringsKt.toIntOrNull(substring2);
            } catch (Exception unused2) {
                num2 = null;
            }
            this.f32911F = num2;
            this.f32913G = ah1.a(context);
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Object systemService3 = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService3).getNetworkOperatorName();
                if (networkOperatorName.length() != 0) {
                    str = networkOperatorName;
                }
            } catch (Exception unused3) {
            }
            this.f32915H = str;
            return this;
        }

        @NotNull
        public final a j(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            vp.f33717a.getClass();
            this.f32976q = ((xp) vp.a.a(context)).c();
            return this;
        }

        @NotNull
        public final a k(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            i10 a4 = yj2.a(context);
            this.f32983t0 = a4.e();
            this.f32985u0 = a4.g();
            this.f32987v0 = a4.f();
            this.f32989w0 = a4.b();
            this.f32991x0 = a4.d();
            this.f32993y0 = a4.c();
            return this;
        }

        @NotNull
        public final a l(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f32903B = Integer.valueOf(lh2.d(context));
            this.f32905C = Integer.valueOf(lh2.b(context));
            Intrinsics.checkNotNullParameter(context, "context");
            this.f32907D = Float.valueOf(context.getResources().getDisplayMetrics().density);
            this.f32981s0 = lh2.a(context);
            return this;
        }

        @NotNull
        public final a m(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i4 = ew1.f25476l;
            du1 a4 = ew1.a.a().a(context);
            if (a4 != null) {
                this.f32918I0 = a4.R();
            }
            return this;
        }

        @NotNull
        public final a n(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            vp.f33717a.getClass();
            this.f32978r = ((xp) vp.a.a(context)).f();
            return this;
        }

        @NotNull
        public final a o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f32916H0 = Boolean.valueOf(C2362y9.a(context));
            return this;
        }

        @NotNull
        public final a c(@Nullable String str) {
            this.f32926M0 = str;
            return this;
        }

        @NotNull
        public final a e(@Nullable String str) {
            this.f32953e0 = str;
            return this;
        }

        @NotNull
        public final a f(@Nullable String str) {
            this.f32924L0 = str;
            return this;
        }

        @NotNull
        public final a h(@Nullable String str) {
            this.f32920J0 = str;
            return this;
        }

        @NotNull
        public final a d(@Nullable String str) {
            this.f32966l = str;
            return this;
        }

        @NotNull
        public final a b(@Nullable Integer num) {
            this.f32935R = num;
            return this;
        }

        @NotNull
        public final a b(@Nullable String str) {
            this.f32951d0 = str;
            return this;
        }

        @NotNull
        public final a b(boolean z4) {
            this.f32932P0 = z4 ? Boolean.valueOf(z4) : null;
            return this;
        }

        @NotNull
        public final a b(@Nullable Map<String, String> map) {
            if (map != null) {
                this.f32960i.putAll(map);
            }
            return this;
        }

        @NotNull
        public final a i(@Nullable String str) {
            this.f32982t = str;
            return this;
        }

        @NotNull
        public final a g(@Nullable String str) {
            this.f32922K0 = str;
            return this;
        }

        @NotNull
        public final a a(@Nullable gs gsVar) {
            if (gsVar != null) {
                this.f32986v = gsVar.b();
            }
            return this;
        }

        @NotNull
        public final a a(@Nullable String str) {
            this.f32984u = str;
            return this;
        }

        @NotNull
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            vp.f33717a.getClass();
            this.f32980s = ((xp) vp.a.a(context)).d();
            return this;
        }

        @NotNull
        public final a a(@Nullable Map<String, String> map) {
            if (map != null) {
                this.f32958h.putAll(map);
            }
            return this;
        }

        @NotNull
        public final a a(@Nullable Integer num) {
            this.f32968m = num;
            return this;
        }

        @NotNull
        public final a a(@NotNull Context context, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f32957g0 = this.f32946b.b(context);
            this.f32946b.getClass();
            this.f32959h0 = "android";
            this.f32946b.getClass();
            this.f32961i0 = Build.VERSION.RELEASE;
            this.f32946b.getClass();
            this.f32963j0 = y00.a();
            this.f32946b.getClass();
            this.f32965k0 = Build.MODEL;
            this.f32967l0 = this.f32946b.c(context);
            this.f32969m0 = this.f32946b.a(context);
            this.f32971n0 = this.f32946b.d(context);
            if (this.f32944a) {
                str = null;
            }
            this.f32979r0 = str;
            this.f32936S = Boolean.valueOf(this.f32946b.c());
            return this;
        }

        @NotNull
        public final a a(@Nullable C1851cc c1851cc, boolean z4) {
            if (c1851cc != null) {
                this.f32925M = Boolean.valueOf(c1851cc.b());
                this.f32927N = Boolean.valueOf(z4);
                String a4 = c1851cc.a();
                this.f32952e.getClass();
                boolean z5 = (a4 == null || a4.length() == 0 || Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", a4)) ? false : true;
                if (!this.f32944a && Intrinsics.areEqual(this.f32925M, Boolean.FALSE) && z5) {
                    this.f32929O = a4;
                }
            }
            return this;
        }

        @NotNull
        public final a a(@NotNull d50 environmentConfiguration) {
            Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
            this.f32930O0 = Boolean.valueOf(environmentConfiguration.c());
            return this;
        }

        @NotNull
        public final a a(boolean z4) {
            this.f32956g = z4;
            return this;
        }

        @NotNull
        public final a a(@Nullable C1851cc c1851cc) {
            if (c1851cc != null) {
                this.f32931P = Boolean.valueOf(c1851cc.b());
                String a4 = c1851cc.a();
                this.f32952e.getClass();
                boolean z4 = (a4 == null || a4.length() == 0 || Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", a4)) ? false : true;
                if (!this.f32944a && Intrinsics.areEqual(this.f32931P, Boolean.FALSE) && z4) {
                    this.f32933Q = a4;
                }
            }
            return this;
        }

        @NotNull
        public final a a(@Nullable List<String> list) {
            this.f32939V = list != null ? CollectionsKt.joinToString$default(list, StringUtils.COMMA, null, null, 0, null, null, 62, null) : null;
            return this;
        }

        @NotNull
        public final a a(int i4) {
            String str;
            if (1 == i4) {
                str = b9.h.f15435D;
            } else {
                str = b9.h.f15433C;
            }
            this.f32994z = str;
            return this;
        }

        @NotNull
        public final a a(@Nullable p91 p91Var) {
            if (p91Var != null) {
                this.f32940W = p91Var.a();
            }
            return this;
        }

        @NotNull
        public final a a(long j4) {
            this.f32942Y = Long.valueOf(j4);
            return this;
        }

        @NotNull
        public final a a(@NotNull Context context, @Nullable vy1 vy1Var) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (vy1Var != null) {
                this.f32992y = vy1Var.a().a();
                this.f32988w = Integer.valueOf(vy1Var.c(context));
                this.f32990x = Integer.valueOf(vy1Var.a(context));
            }
            return this;
        }

        @NotNull
        public final a a(@Nullable s91 s91Var) {
            if (s91Var != null && s91.f31632d == s91Var) {
                this.f32941X = s91Var.a();
            }
            return this;
        }

        @NotNull
        public final a a(@Nullable bu1 bu1Var) {
            this.f32928N0 = bu1Var != null ? bu1Var.a() : null;
            return this;
        }

        @NotNull
        public final a a(@NotNull Context context, @NotNull C2286v2 adConfiguration) {
            String a4;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
            String c4 = adConfiguration.c();
            int n4 = adConfiguration.n();
            if (c4 != null && (a4 = new fh2(context).a(new hh2(n4, c4))) != null) {
                this.f32914G0 = a4;
            }
            return this;
        }

        @NotNull
        public final a a(@Nullable Boolean bool) {
            this.f32934Q0 = bool;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public static a a(@NotNull Context context, @NotNull zw1 sensitiveModeChecker, @NotNull hq configuration, @NotNull nq1 resourceUtils, @NotNull ye1 optOutRepository) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(resourceUtils, "resourceUtils");
            Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
            d50 b4 = configuration.b();
            C1803ac a4 = configuration.a();
            a a5 = new a(sensitiveModeChecker.b(context)).b(context).N0().a(a4.a(), a4.b()).a(a4.c());
            Intrinsics.checkNotNullParameter(context, "context");
            Integer num = null;
            try {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    int intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
                    int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra > -1 && intExtra2 > 0) {
                        num = Integer.valueOf(AbstractC3185a.c((intExtra / intExtra2) * 100));
                    }
                }
            } catch (Exception unused) {
                ap0.c(new Object[0]);
            }
            a a6 = a5.b(num).O0().g(context).h(context).i(context).l(context).k(context).S0().a(zw1.a(context)).a(C2362y9.a());
            b4.getClass();
            a T02 = a6.Q0().a(context, b4.b()).i(b4.g()).d(b4.e()).a(configuration.c()).d(context).T0();
            resourceUtils.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            return T02.a(context.getResources().getConfiguration().orientation).M0().e(context).f(context).c(context).j(context).n(context).a(context).o(context).m(context).a(b4).b(optOutRepository.a()).a(ah1.c(context)).R0();
        }

        public /* synthetic */ b(int i4) {
            this();
        }

        public static a a(Context context, C2286v2 adConfiguration, zw1 sensitiveModeChecker) {
            nq1 resourceUtils = new nq1();
            ye1 optOutRepository = new ye1(context, zr0.a(context));
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
            Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
            Intrinsics.checkNotNullParameter(resourceUtils, "resourceUtils");
            Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
            return a(context, sensitiveModeChecker, adConfiguration.f(), resourceUtils, optOutRepository).a(adConfiguration.a()).a(adConfiguration.b()).a(adConfiguration.d()).a(adConfiguration.c()).a(adConfiguration.o()).a(context, adConfiguration.q()).a(adConfiguration.r()).U0().b(adConfiguration.k()).e(adConfiguration.m()).a(adConfiguration.n()).a(context, adConfiguration);
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<String> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return kotlin.sequences.k.x(kotlin.sequences.k.B(ua0.this.f32898c, ua0.this.f32899d), "&", null, null, 0, null, va0.f33561b, 30, null);
        }
    }

    private ua0(a aVar) {
        C2013j7 c2013j7 = new C2013j7();
        this.f32896a = c2013j7;
        this.f32897b = new l50();
        Map<String, Object> createMapBuilder = MapsKt.createMapBuilder();
        a(createMapBuilder, "ad_unit_id", aVar.d());
        a(createMapBuilder, "width", aVar.J0());
        a(createMapBuilder, "height", aVar.M());
        a(createMapBuilder, "ad_size_type", aVar.b());
        a(createMapBuilder, b9.h.f15492n, aVar.c0());
        a(createMapBuilder, "ads_count", aVar.g());
        a(createMapBuilder, CommonUrlParts.SCREEN_WIDTH, aVar.s0());
        a(createMapBuilder, CommonUrlParts.SCREEN_HEIGHT, aVar.r0());
        a(createMapBuilder, CommonUrlParts.SCALE_FACTOR, aVar.p0());
        a(createMapBuilder, AdRevenueScheme.AD_TYPE, aVar.c());
        a(createMapBuilder, "network_type", aVar.Z());
        a(createMapBuilder, com.ironsource.ge.f16414N0, aVar.p());
        a(createMapBuilder, "dnt", aVar.J());
        a(createMapBuilder, "gaid_reset", aVar.D());
        a(createMapBuilder, "huawei_dnt", aVar.O());
        a(createMapBuilder, "image_sizes", aVar.P());
        a(createMapBuilder, "response_ad_format", aVar.k0());
        a(createMapBuilder, FirebaseAnalytics.Param.AD_SOURCE, aVar.y0());
        a(createMapBuilder, "debug_uid", aVar.z());
        a(createMapBuilder, "user_id", aVar.D0());
        a(createMapBuilder, "open_bidding_data", aVar.a0());
        a(createMapBuilder, "session_random", aVar.x0());
        a(createMapBuilder, com.ironsource.cc.f15720M, aVar.r());
        a(createMapBuilder, c2013j7.b(), aVar.C());
        a(createMapBuilder, c2013j7.f(), aVar.d0());
        a(createMapBuilder, c2013j7.g(), aVar.e0());
        a(createMapBuilder, c2013j7.d(), aVar.U());
        a(createMapBuilder, c2013j7.e(), aVar.Y());
        a(createMapBuilder, c2013j7.c(), aVar.L0());
        a(createMapBuilder, CommonUrlParts.LOCALE, aVar.S());
        a(createMapBuilder, "content_language", aVar.k());
        List<String> g02 = aVar.g0();
        a(createMapBuilder, "device_languages", g02 != null ? CollectionsKt.joinToString$default(g02, StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, 0, null, null, 62, null) : null);
        a(createMapBuilder, "app_id", aVar.j());
        a(createMapBuilder, "app_version_code", aVar.m());
        a(createMapBuilder, CommonUrlParts.APP_VERSION, aVar.n());
        a(createMapBuilder, "appmetrica_version", aVar.l());
        a(createMapBuilder, CommonUrlParts.SCREEN_DPI, Integer.valueOf(aVar.q0()));
        a(createMapBuilder, "safe_area_inset_left", Float.valueOf(aVar.m0()));
        a(createMapBuilder, "safe_area_inset_top", Float.valueOf(aVar.o0()));
        a(createMapBuilder, "safe_area_inset_right", Float.valueOf(aVar.n0()));
        a(createMapBuilder, "safe_area_inset_bottom", Float.valueOf(aVar.l0()));
        a(createMapBuilder, "cutout_safe_area_inset_top", Float.valueOf(aVar.y()));
        a(createMapBuilder, "cutout_safe_area_inset_bottom", Float.valueOf(aVar.x()));
        a(createMapBuilder, "user_consent", aVar.C0());
        a(createMapBuilder, "gdpr", aVar.E());
        a(createMapBuilder, "gdpr_consent", aVar.F());
        a(createMapBuilder, "cmp_present", Boolean.valueOf(aVar.s()));
        a(createMapBuilder, "parsed_purpose_consents", aVar.j0());
        a(createMapBuilder, "parsed_vendor_consents", aVar.F0());
        a(createMapBuilder, "addtl_consent", aVar.e());
        a(createMapBuilder, "bidding_data", aVar.L());
        a(createMapBuilder, "prefetched_mediation_data", aVar.i0());
        a(createMapBuilder, "connected_network_ids", aVar.u());
        a(createMapBuilder, HianalyticsBaseData.SDK_VERSION, aVar.t0());
        a(createMapBuilder, "sdk_version_name", aVar.u0());
        a(createMapBuilder, "sdk_vendor", "yandex");
        a(createMapBuilder, "preferred_theme", aVar.h0());
        a(createMapBuilder, "device_theme", aVar.B());
        a(createMapBuilder, "age_restricted_user", aVar.i());
        a(createMapBuilder, "view_size_info", aVar.G0());
        a(createMapBuilder, "web_view_available", aVar.I0());
        a(createMapBuilder, "startup_version", aVar.z0());
        a(createMapBuilder, "session-data", aVar.w0());
        a(createMapBuilder, "user-agent", aVar.B0());
        a(createMapBuilder, "stub_reason", aVar.A0());
        a(createMapBuilder, "gms_available", aVar.H());
        a(createMapBuilder, "opt_out", aVar.b0());
        a(createMapBuilder, "vpn_enabled", aVar.H0());
        a(createMapBuilder, aVar.f0());
        a(createMapBuilder, aVar);
        this.f32898c = MapsKt.asSequence(MapsKt.build(createMapBuilder));
        Map<String, Object> createMapBuilder2 = MapsKt.createMapBuilder();
        for (Map.Entry entry : aVar.f().entrySet()) {
            a(createMapBuilder2, (String) entry.getKey(), entry.getValue());
        }
        this.f32899d = MapsKt.asSequence(MapsKt.build(createMapBuilder2));
        this.f32900e = W1.i.b(new c());
    }

    @NotNull
    public final String toString() {
        return (String) this.f32900e.getValue();
    }

    private final void a(Map<String, Object> map, a aVar) {
        if (!aVar.K() || aVar.t()) {
            a(map, CommonUrlParts.UUID, aVar.E0());
        }
        if (aVar.K()) {
            return;
        }
        a(map, IronSourceSegment.AGE, aVar.h());
        a(map, "gender", aVar.G());
        a(map, "context_query", aVar.v());
        a(map, "context_taglist", aVar.w());
        a(map, "google_aid", aVar.I());
        a(map, "huawei_oaid", aVar.N());
        a(map, "mauid", aVar.V());
        a(map, this.f32896a.a(), aVar.A());
        a(map, "mcc", aVar.W());
        a(map, "mnc", aVar.X());
        a(map, "cellid", aVar.q());
        a(map, "lac", aVar.R());
        a(map, com.ironsource.x8.f20294b, aVar.K0());
        a(map, "battery_charge", aVar.o());
        a(map, "server_side_client_ip", aVar.v0());
        a(map, "ipv6", aVar.Q());
        C1918f7 a4 = aVar.a();
        Location f4 = a4 != null ? a4.f() : null;
        if (f4 != null) {
            int i4 = ew1.f25476l;
            if (ew1.a.a().c()) {
                a(map, com.ironsource.ge.f16493s, String.valueOf(f4.getLatitude()));
                a(map, "lon", String.valueOf(f4.getLongitude()));
                a(map, "location_timestamp", String.valueOf(f4.getTime()));
                a(map, "precision", String.valueOf((int) f4.getAccuracy()));
                return;
            }
            return;
        }
        Location T3 = aVar.T();
        if (T3 != null) {
            int i5 = ew1.f25476l;
            if (ew1.a.a().c()) {
                a(map, com.ironsource.ge.f16493s, String.valueOf(T3.getLatitude()));
                a(map, "lon", String.valueOf(T3.getLongitude()));
                a(map, "location_timestamp", String.valueOf(T3.getTime()));
                a(map, "precision", String.valueOf((int) T3.getAccuracy()));
            }
        }
    }

    private final void a(Map map, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            a((Map<String, Object>) map, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    private final void a(Map<String, Object> map, String str, Boolean bool) {
        if (bool != null) {
            a(map, str, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }

    private final void a(Map<String, Object> map, String str, Object obj) {
        String encode;
        if (obj != null) {
            String encode2 = Uri.encode(str);
            if (this.f32897b.a(str)) {
                encode = Uri.encode(obj.toString());
            } else {
                encode = Uri.encode(obj.toString(), StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            Intrinsics.checkNotNull(encode2);
            Intrinsics.checkNotNull(encode);
            map.put(encode2, encode);
        }
    }

    public /* synthetic */ ua0(a aVar, int i4) {
        this(aVar);
    }
}
