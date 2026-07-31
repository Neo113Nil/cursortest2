package O1;

import O1.Kf;
import O1.Yb;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ef implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: W, reason: collision with root package name */
    public static final b f2639W = new b(null);

    /* renamed from: X, reason: collision with root package name */
    private static final Expression f2640X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Expression f2641Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final Yb.e f2642Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final Expression f2643a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final Expression f2644b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final Expression f2645c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final Expression f2646d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Expression f2647e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final Yb.d f2648f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final Function2 f2649g0;

    /* renamed from: A, reason: collision with root package name */
    public final Expression f2650A;

    /* renamed from: B, reason: collision with root package name */
    public final Expression f2651B;

    /* renamed from: C, reason: collision with root package name */
    public final Expression f2652C;

    /* renamed from: D, reason: collision with root package name */
    public final List f2653D;

    /* renamed from: E, reason: collision with root package name */
    private final Expression f2654E;

    /* renamed from: F, reason: collision with root package name */
    private final Expression f2655F;

    /* renamed from: G, reason: collision with root package name */
    public final Expression f2656G;

    /* renamed from: H, reason: collision with root package name */
    private final List f2657H;

    /* renamed from: I, reason: collision with root package name */
    private final List f2658I;

    /* renamed from: J, reason: collision with root package name */
    private final C0925lf f2659J;

    /* renamed from: K, reason: collision with root package name */
    private final AbstractC1092v3 f2660K;

    /* renamed from: L, reason: collision with root package name */
    private final O2 f2661L;

    /* renamed from: M, reason: collision with root package name */
    private final O2 f2662M;

    /* renamed from: N, reason: collision with root package name */
    private final List f2663N;

    /* renamed from: O, reason: collision with root package name */
    private final List f2664O;

    /* renamed from: P, reason: collision with root package name */
    private final List f2665P;

    /* renamed from: Q, reason: collision with root package name */
    public final List f2666Q;

    /* renamed from: R, reason: collision with root package name */
    private final Expression f2667R;

    /* renamed from: S, reason: collision with root package name */
    private final Wf f2668S;

    /* renamed from: T, reason: collision with root package name */
    private final List f2669T;

    /* renamed from: U, reason: collision with root package name */
    private final Yb f2670U;

    /* renamed from: V, reason: collision with root package name */
    private Integer f2671V;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f2672a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f2673b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f2674c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f2675d;

    /* renamed from: e, reason: collision with root package name */
    private final List f2676e;

    /* renamed from: f, reason: collision with root package name */
    public final T2 f2677f;

    /* renamed from: g, reason: collision with root package name */
    public final Expression f2678g;

    /* renamed from: h, reason: collision with root package name */
    private final List f2679h;

    /* renamed from: i, reason: collision with root package name */
    private final C0860i3 f2680i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2681j;

    /* renamed from: k, reason: collision with root package name */
    private final Expression f2682k;

    /* renamed from: l, reason: collision with root package name */
    private final List f2683l;

    /* renamed from: m, reason: collision with root package name */
    public final String f2684m;

    /* renamed from: n, reason: collision with root package name */
    public final List f2685n;

    /* renamed from: o, reason: collision with root package name */
    private final List f2686o;

    /* renamed from: p, reason: collision with root package name */
    public final List f2687p;

    /* renamed from: q, reason: collision with root package name */
    private final W5 f2688q;

    /* renamed from: r, reason: collision with root package name */
    private final List f2689r;

    /* renamed from: s, reason: collision with root package name */
    private final Yb f2690s;

    /* renamed from: t, reason: collision with root package name */
    private final String f2691t;

    /* renamed from: u, reason: collision with root package name */
    private final C1079u8 f2692u;

    /* renamed from: v, reason: collision with root package name */
    private final C0754c5 f2693v;

    /* renamed from: w, reason: collision with root package name */
    public final Expression f2694w;

    /* renamed from: x, reason: collision with root package name */
    private final C0754c5 f2695x;

    /* renamed from: y, reason: collision with root package name */
    public final List f2696y;

    /* renamed from: z, reason: collision with root package name */
    public final JSONObject f2697z;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2698i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ef invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ef.f2639W.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ef a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Kf.f) BuiltInParserKt.getBuiltInParserComponent().h9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f2640X = companion.constant(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        f2641Y = companion.constant(bool);
        f2642Z = new Yb.e(new C0765cg(null, null, null, 7, null));
        f2643a0 = companion.constant(bool);
        f2644b0 = companion.constant(bool);
        f2645c0 = companion.constant(bool);
        f2646d0 = companion.constant(Lf.FIT);
        f2647e0 = companion.constant(Vf.VISIBLE);
        f2648f0 = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        f2649g0 = a.f2698i;
    }

    public Ef(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, T2 t22, Expression autostart, List list2, C0860i3 c0860i3, List list3, Expression expression3, List list4, String str, List list5, List list6, List list7, W5 w5, List list8, Yb height, String str2, C1079u8 c1079u8, C0754c5 c0754c5, Expression muted, C0754c5 c0754c52, List list9, JSONObject jSONObject, Expression preloadRequired, Expression expression4, Expression repeatable, List list10, Expression expression5, Expression expression6, Expression scale, List list11, List list12, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list13, List list14, List list15, List videoSources, Expression visibility, Wf wf, List list16, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(autostart, "autostart");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(muted, "muted");
        Intrinsics.checkNotNullParameter(preloadRequired, "preloadRequired");
        Intrinsics.checkNotNullParameter(repeatable, "repeatable");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(videoSources, "videoSources");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f2672a = c0839h0;
        this.f2673b = expression;
        this.f2674c = expression2;
        this.f2675d = alpha;
        this.f2676e = list;
        this.f2677f = t22;
        this.f2678g = autostart;
        this.f2679h = list2;
        this.f2680i = c0860i3;
        this.f2681j = list3;
        this.f2682k = expression3;
        this.f2683l = list4;
        this.f2684m = str;
        this.f2685n = list5;
        this.f2686o = list6;
        this.f2687p = list7;
        this.f2688q = w5;
        this.f2689r = list8;
        this.f2690s = height;
        this.f2691t = str2;
        this.f2692u = c1079u8;
        this.f2693v = c0754c5;
        this.f2694w = muted;
        this.f2695x = c0754c52;
        this.f2696y = list9;
        this.f2697z = jSONObject;
        this.f2650A = preloadRequired;
        this.f2651B = expression4;
        this.f2652C = repeatable;
        this.f2653D = list10;
        this.f2654E = expression5;
        this.f2655F = expression6;
        this.f2656G = scale;
        this.f2657H = list11;
        this.f2658I = list12;
        this.f2659J = c0925lf;
        this.f2660K = abstractC1092v3;
        this.f2661L = o22;
        this.f2662M = o23;
        this.f2663N = list13;
        this.f2664O = list14;
        this.f2665P = list15;
        this.f2666Q = videoSources;
        this.f2667R = visibility;
        this.f2668S = wf;
        this.f2669T = list16;
        this.f2670U = width;
    }

    public static /* synthetic */ Ef B(Ef ef, C0839h0 c0839h0, Expression expression, Expression expression2, Expression expression3, List list, T2 t22, Expression expression4, List list2, C0860i3 c0860i3, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, W5 w5, List list8, Yb yb, String str2, C1079u8 c1079u8, C0754c5 c0754c5, Expression expression6, C0754c5 c0754c52, List list9, JSONObject jSONObject, Expression expression7, Expression expression8, Expression expression9, List list10, Expression expression10, Expression expression11, Expression expression12, List list11, List list12, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list13, List list14, List list15, List list16, Expression expression13, Wf wf, List list17, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? ef.d() : c0839h0;
        Expression l4 = (i4 & 2) != 0 ? ef.l() : expression;
        Expression s4 = (i4 & 4) != 0 ? ef.s() : expression2;
        Expression v4 = (i4 & 8) != 0 ? ef.v() : expression3;
        List u4 = (i4 & 16) != 0 ? ef.u() : list;
        T2 t23 = (i4 & 32) != 0 ? ef.f2677f : t22;
        Expression expression14 = (i4 & 64) != 0 ? ef.f2678g : expression4;
        List background = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ef.getBackground() : list2;
        C0860i3 w4 = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ef.w() : c0860i3;
        List list18 = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ef.f2681j : list3;
        Expression e4 = (i4 & 1024) != 0 ? ef.e() : expression5;
        List a4 = (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? ef.a() : list4;
        String str3 = (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? ef.f2684m : str;
        C0839h0 c0839h02 = d4;
        List list19 = (i4 & 8192) != 0 ? ef.f2685n : list5;
        List extensions = (i4 & 16384) != 0 ? ef.getExtensions() : list6;
        List list20 = (i4 & 32768) != 0 ? ef.f2687p : list7;
        W5 x4 = (i4 & 65536) != 0 ? ef.x() : w5;
        List r4 = (i4 & 131072) != 0 ? ef.r() : list8;
        Yb height = (i4 & 262144) != 0 ? ef.getHeight() : yb;
        String id = (i4 & 524288) != 0 ? ef.getId() : str2;
        C1079u8 m4 = (i4 & 1048576) != 0 ? ef.m() : c1079u8;
        C0754c5 g4 = (i4 & 2097152) != 0 ? ef.g() : c0754c5;
        List list21 = list20;
        Expression expression15 = (i4 & 4194304) != 0 ? ef.f2694w : expression6;
        C0754c5 i6 = (i4 & 8388608) != 0 ? ef.i() : c0754c52;
        Expression expression16 = expression15;
        List list22 = (i4 & 16777216) != 0 ? ef.f2696y : list9;
        JSONObject jSONObject2 = (i4 & 33554432) != 0 ? ef.f2697z : jSONObject;
        Expression expression17 = (i4 & 67108864) != 0 ? ef.f2650A : expression7;
        Expression expression18 = (i4 & 134217728) != 0 ? ef.f2651B : expression8;
        Expression expression19 = (i4 & 268435456) != 0 ? ef.f2652C : expression9;
        List list23 = (i4 & 536870912) != 0 ? ef.f2653D : list10;
        return ef.A(c0839h02, l4, s4, v4, u4, t23, expression14, background, w4, list18, e4, a4, str3, list19, extensions, list21, x4, r4, height, id, m4, g4, expression16, i6, list22, jSONObject2, expression17, expression18, expression19, list23, (i4 & 1073741824) != 0 ? ef.n() : expression10, (i4 & Integer.MIN_VALUE) != 0 ? ef.h() : expression11, (i5 & 1) != 0 ? ef.f2656G : expression12, (i5 & 2) != 0 ? ef.k() : list11, (i5 & 4) != 0 ? ef.p() : list12, (i5 & 8) != 0 ? ef.b() : c0925lf, (i5 & 16) != 0 ? ef.z() : abstractC1092v3, (i5 & 32) != 0 ? ef.t() : o22, (i5 & 64) != 0 ? ef.y() : o23, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ef.j() : list13, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ef.o() : list14, (i5 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ef.f() : list15, (i5 & 1024) != 0 ? ef.f2666Q : list16, (i5 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? ef.getVisibility() : expression13, (i5 & Base64Utils.IO_BUFFER_SIZE) != 0 ? ef.q() : wf, (i5 & 8192) != 0 ? ef.c() : list17, (i5 & 16384) != 0 ? ef.getWidth() : yb2);
    }

    public final Ef A(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, T2 t22, Expression autostart, List list2, C0860i3 c0860i3, List list3, Expression expression3, List list4, String str, List list5, List list6, List list7, W5 w5, List list8, Yb height, String str2, C1079u8 c1079u8, C0754c5 c0754c5, Expression muted, C0754c5 c0754c52, List list9, JSONObject jSONObject, Expression preloadRequired, Expression expression4, Expression repeatable, List list10, Expression expression5, Expression expression6, Expression scale, List list11, List list12, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list13, List list14, List list15, List videoSources, Expression visibility, Wf wf, List list16, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(autostart, "autostart");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(muted, "muted");
        Intrinsics.checkNotNullParameter(preloadRequired, "preloadRequired");
        Intrinsics.checkNotNullParameter(repeatable, "repeatable");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(videoSources, "videoSources");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new Ef(c0839h0, expression, expression2, alpha, list, t22, autostart, list2, c0860i3, list3, expression3, list4, str, list5, list6, list7, w5, list8, height, str2, c1079u8, c0754c5, muted, c0754c52, list9, jSONObject, preloadRequired, expression4, repeatable, list10, expression5, expression6, scale, list11, list12, c0925lf, abstractC1092v3, o22, o23, list13, list14, list15, videoSources, visibility, wf, list16, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:455:0x07b5, code lost:
    
        if (r9.c() == null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0701, code lost:
    
        if (r9.f() == null) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x06b5, code lost:
    
        if (r9.o() == null) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0669, code lost:
    
        if (r9.j() == null) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x05b4, code lost:
    
        if (r9.p() == null) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0568, code lost:
    
        if (r9.k() == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x04cc, code lost:
    
        if (r9.f2653D == null) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x042a, code lost:
    
        if (r9.f2696y == null) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0360, code lost:
    
        if (r9.r() == null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x02fa, code lost:
    
        if (r9.f2687p == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x02b4, code lost:
    
        if (r9.getExtensions() == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0268, code lost:
    
        if (r9.f2685n == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0218, code lost:
    
        if (r9.a() == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x01aa, code lost:
    
        if (r9.f2681j == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x014a, code lost:
    
        if (r9.getBackground() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x00d0, code lost:
    
        if (r9.u() == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:428:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0765  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(Ef ef, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Wf q4;
        boolean z20;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (ef == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(ef.d(), resolver, otherResolver) : ef.d() == null) {
            Expression l4 = l();
            EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
            Expression l5 = ef.l();
            if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                Expression s4 = s();
                EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                Expression s5 = ef.s();
                if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                    if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) ef.v().evaluate(otherResolver)).doubleValue()) {
                        List u4 = u();
                        if (u4 != null) {
                            List u5 = ef.u();
                            if (u5 != null) {
                                if (u4.size() == u5.size()) {
                                    int i4 = 0;
                                    for (Object obj : u4) {
                                        int i5 = i4 + 1;
                                        if (i4 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        if (((E2) obj).a((E2) u5.get(i4), resolver, otherResolver)) {
                                            i4 = i5;
                                        }
                                    }
                                    z4 = true;
                                }
                                z4 = false;
                                break;
                            }
                            return false;
                        }
                        if (z4) {
                            T2 t22 = this.f2677f;
                            if ((t22 != null ? t22.a(ef.f2677f, resolver, otherResolver) : ef.f2677f == null) && ((Boolean) this.f2678g.evaluate(resolver)).booleanValue() == ((Boolean) ef.f2678g.evaluate(otherResolver)).booleanValue()) {
                                List background = getBackground();
                                if (background != null) {
                                    List background2 = ef.getBackground();
                                    if (background2 != null) {
                                        if (background.size() == background2.size()) {
                                            int i6 = 0;
                                            for (Object obj2 : background) {
                                                int i7 = i6 + 1;
                                                if (i6 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                if (((X2) obj2).a((X2) background2.get(i6), resolver, otherResolver)) {
                                                    i6 = i7;
                                                }
                                            }
                                            z5 = true;
                                        }
                                        z5 = false;
                                        break;
                                    }
                                    return false;
                                }
                                if (z5) {
                                    C0860i3 w4 = w();
                                    if (w4 != null ? w4.a(ef.w(), resolver, otherResolver) : ef.w() == null) {
                                        List list = this.f2681j;
                                        if (list != null) {
                                            List list2 = ef.f2681j;
                                            if (list2 != null) {
                                                if (list.size() == list2.size()) {
                                                    int i8 = 0;
                                                    for (Object obj3 : list) {
                                                        int i9 = i8 + 1;
                                                        if (i8 < 0) {
                                                            CollectionsKt.throwIndexOverflow();
                                                        }
                                                        if (((C0892k0) obj3).a((C0892k0) list2.get(i8), resolver, otherResolver)) {
                                                            i8 = i9;
                                                        }
                                                    }
                                                    z6 = true;
                                                }
                                                z6 = false;
                                                break;
                                            }
                                            return false;
                                        }
                                        if (z6) {
                                            Expression e4 = e();
                                            Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                            Expression e5 = ef.e();
                                            if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null)) {
                                                List a4 = a();
                                                if (a4 != null) {
                                                    List a5 = ef.a();
                                                    if (a5 != null) {
                                                        if (a4.size() == a5.size()) {
                                                            int i10 = 0;
                                                            for (Object obj4 : a4) {
                                                                int i11 = i10 + 1;
                                                                if (i10 < 0) {
                                                                    CollectionsKt.throwIndexOverflow();
                                                                }
                                                                if (((M4) obj4).h((M4) a5.get(i10), resolver, otherResolver)) {
                                                                    i10 = i11;
                                                                }
                                                            }
                                                            z7 = true;
                                                        }
                                                        z7 = false;
                                                        break;
                                                    }
                                                    return false;
                                                }
                                                if (z7 && Intrinsics.areEqual(this.f2684m, ef.f2684m)) {
                                                    List list3 = this.f2685n;
                                                    if (list3 != null) {
                                                        List list4 = ef.f2685n;
                                                        if (list4 != null) {
                                                            if (list3.size() == list4.size()) {
                                                                int i12 = 0;
                                                                for (Object obj5 : list3) {
                                                                    int i13 = i12 + 1;
                                                                    if (i12 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    if (((C0892k0) obj5).a((C0892k0) list4.get(i12), resolver, otherResolver)) {
                                                                        i12 = i13;
                                                                    }
                                                                }
                                                                z8 = true;
                                                            }
                                                            z8 = false;
                                                            break;
                                                        }
                                                        return false;
                                                    }
                                                    if (z8) {
                                                        List extensions = getExtensions();
                                                        if (extensions != null) {
                                                            List extensions2 = ef.getExtensions();
                                                            if (extensions2 != null) {
                                                                if (extensions.size() == extensions2.size()) {
                                                                    int i14 = 0;
                                                                    for (Object obj6 : extensions) {
                                                                        int i15 = i14 + 1;
                                                                        if (i14 < 0) {
                                                                            CollectionsKt.throwIndexOverflow();
                                                                        }
                                                                        if (((C0933m5) obj6).a((C0933m5) extensions2.get(i14), resolver, otherResolver)) {
                                                                            i14 = i15;
                                                                        }
                                                                    }
                                                                    z9 = true;
                                                                }
                                                                z9 = false;
                                                                break;
                                                            }
                                                            return false;
                                                        }
                                                        if (z9) {
                                                            List list5 = this.f2687p;
                                                            if (list5 != null) {
                                                                List list6 = ef.f2687p;
                                                                if (list6 != null) {
                                                                    if (list5.size() == list6.size()) {
                                                                        int i16 = 0;
                                                                        for (Object obj7 : list5) {
                                                                            int i17 = i16 + 1;
                                                                            if (i16 < 0) {
                                                                                CollectionsKt.throwIndexOverflow();
                                                                            }
                                                                            if (((C0892k0) obj7).a((C0892k0) list6.get(i16), resolver, otherResolver)) {
                                                                                i16 = i17;
                                                                            }
                                                                        }
                                                                        z10 = true;
                                                                    }
                                                                    z10 = false;
                                                                    break;
                                                                }
                                                                return false;
                                                            }
                                                            if (z10) {
                                                                W5 x4 = x();
                                                                if (x4 != null ? x4.a(ef.x(), resolver, otherResolver) : ef.x() == null) {
                                                                    List r4 = r();
                                                                    if (r4 != null) {
                                                                        List r5 = ef.r();
                                                                        if (r5 != null) {
                                                                            if (r4.size() == r5.size()) {
                                                                                int i18 = 0;
                                                                                for (Object obj8 : r4) {
                                                                                    int i19 = i18 + 1;
                                                                                    if (i18 < 0) {
                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                    }
                                                                                    if (((C0809f6) obj8).a((C0809f6) r5.get(i18), resolver, otherResolver)) {
                                                                                        i18 = i19;
                                                                                    }
                                                                                }
                                                                                z11 = true;
                                                                            }
                                                                            z11 = false;
                                                                            break;
                                                                        }
                                                                        return false;
                                                                    }
                                                                    if (z11 && getHeight().a(ef.getHeight(), resolver, otherResolver) && Intrinsics.areEqual(getId(), ef.getId())) {
                                                                        C1079u8 m4 = m();
                                                                        if (m4 != null ? m4.a(ef.m(), resolver, otherResolver) : ef.m() == null) {
                                                                            C0754c5 g4 = g();
                                                                            if ((g4 != null ? g4.a(ef.g(), resolver, otherResolver) : ef.g() == null) && ((Boolean) this.f2694w.evaluate(resolver)).booleanValue() == ((Boolean) ef.f2694w.evaluate(otherResolver)).booleanValue()) {
                                                                                C0754c5 i20 = i();
                                                                                if (i20 != null ? i20.a(ef.i(), resolver, otherResolver) : ef.i() == null) {
                                                                                    List list7 = this.f2696y;
                                                                                    if (list7 != null) {
                                                                                        List list8 = ef.f2696y;
                                                                                        if (list8 != null) {
                                                                                            if (list7.size() == list8.size()) {
                                                                                                int i21 = 0;
                                                                                                for (Object obj9 : list7) {
                                                                                                    int i22 = i21 + 1;
                                                                                                    if (i21 < 0) {
                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                    }
                                                                                                    if (((C0892k0) obj9).a((C0892k0) list8.get(i21), resolver, otherResolver)) {
                                                                                                        i21 = i22;
                                                                                                    }
                                                                                                }
                                                                                                z12 = true;
                                                                                            }
                                                                                            z12 = false;
                                                                                            break;
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    if (z12 && Intrinsics.areEqual(this.f2697z, ef.f2697z) && ((Boolean) this.f2650A.evaluate(resolver)).booleanValue() == ((Boolean) ef.f2650A.evaluate(otherResolver)).booleanValue()) {
                                                                                        Expression expression = this.f2651B;
                                                                                        String str = expression != null ? (String) expression.evaluate(resolver) : null;
                                                                                        Expression expression2 = ef.f2651B;
                                                                                        if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null) && ((Boolean) this.f2652C.evaluate(resolver)).booleanValue() == ((Boolean) ef.f2652C.evaluate(otherResolver)).booleanValue()) {
                                                                                            List list9 = this.f2653D;
                                                                                            if (list9 != null) {
                                                                                                List list10 = ef.f2653D;
                                                                                                if (list10 != null) {
                                                                                                    if (list9.size() == list10.size()) {
                                                                                                        int i23 = 0;
                                                                                                        for (Object obj10 : list9) {
                                                                                                            int i24 = i23 + 1;
                                                                                                            if (i23 < 0) {
                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                            }
                                                                                                            if (((C0892k0) obj10).a((C0892k0) list10.get(i23), resolver, otherResolver)) {
                                                                                                                i23 = i24;
                                                                                                            }
                                                                                                        }
                                                                                                        z13 = true;
                                                                                                    }
                                                                                                    z13 = false;
                                                                                                    break;
                                                                                                }
                                                                                                return false;
                                                                                            }
                                                                                            if (z13) {
                                                                                                Expression n4 = n();
                                                                                                String str2 = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                                                Expression n5 = ef.n();
                                                                                                if (Intrinsics.areEqual(str2, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                                                    Expression h4 = h();
                                                                                                    Long l7 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                                                    Expression h5 = ef.h();
                                                                                                    if (Intrinsics.areEqual(l7, h5 != null ? (Long) h5.evaluate(otherResolver) : null) && this.f2656G.evaluate(resolver) == ef.f2656G.evaluate(otherResolver)) {
                                                                                                        List k4 = k();
                                                                                                        if (k4 != null) {
                                                                                                            List k5 = ef.k();
                                                                                                            if (k5 != null) {
                                                                                                                if (k4.size() == k5.size()) {
                                                                                                                    int i25 = 0;
                                                                                                                    for (Object obj11 : k4) {
                                                                                                                        int i26 = i25 + 1;
                                                                                                                        if (i25 < 0) {
                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                        }
                                                                                                                        if (((C0892k0) obj11).a((C0892k0) k5.get(i25), resolver, otherResolver)) {
                                                                                                                            i25 = i26;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    z14 = true;
                                                                                                                }
                                                                                                                z14 = false;
                                                                                                                break;
                                                                                                            }
                                                                                                            return false;
                                                                                                        }
                                                                                                        if (z14) {
                                                                                                            List p4 = p();
                                                                                                            if (p4 != null) {
                                                                                                                List p5 = ef.p();
                                                                                                                if (p5 != null) {
                                                                                                                    if (p4.size() == p5.size()) {
                                                                                                                        int i27 = 0;
                                                                                                                        for (Object obj12 : p4) {
                                                                                                                            int i28 = i27 + 1;
                                                                                                                            if (i27 < 0) {
                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                            }
                                                                                                                            if (((Se) obj12).a((Se) p5.get(i27), resolver, otherResolver)) {
                                                                                                                                i27 = i28;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        z15 = true;
                                                                                                                    }
                                                                                                                    z15 = false;
                                                                                                                    break;
                                                                                                                }
                                                                                                                return false;
                                                                                                            }
                                                                                                            if (z15) {
                                                                                                                C0925lf b4 = b();
                                                                                                                if (b4 != null ? b4.a(ef.b(), resolver, otherResolver) : ef.b() == null) {
                                                                                                                    AbstractC1092v3 z21 = z();
                                                                                                                    if (z21 != null ? z21.a(ef.z(), resolver, otherResolver) : ef.z() == null) {
                                                                                                                        O2 t4 = t();
                                                                                                                        if (t4 != null ? t4.a(ef.t(), resolver, otherResolver) : ef.t() == null) {
                                                                                                                            O2 y4 = y();
                                                                                                                            if (y4 != null ? y4.a(ef.y(), resolver, otherResolver) : ef.y() == null) {
                                                                                                                                List j4 = j();
                                                                                                                                if (j4 != null) {
                                                                                                                                    List j5 = ef.j();
                                                                                                                                    if (j5 != null) {
                                                                                                                                        if (j4.size() == j5.size()) {
                                                                                                                                            int i29 = 0;
                                                                                                                                            for (Object obj13 : j4) {
                                                                                                                                                int i30 = i29 + 1;
                                                                                                                                                if (i29 < 0) {
                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                }
                                                                                                                                                if (((EnumC0997pf) obj13) == ((EnumC0997pf) j5.get(i29))) {
                                                                                                                                                    i29 = i30;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            z16 = true;
                                                                                                                                        }
                                                                                                                                        z16 = false;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    return false;
                                                                                                                                }
                                                                                                                                if (z16) {
                                                                                                                                    List o4 = o();
                                                                                                                                    if (o4 != null) {
                                                                                                                                        List o5 = ef.o();
                                                                                                                                        if (o5 != null) {
                                                                                                                                            if (o4.size() == o5.size()) {
                                                                                                                                                int i31 = 0;
                                                                                                                                                for (Object obj14 : o4) {
                                                                                                                                                    int i32 = i31 + 1;
                                                                                                                                                    if (i31 < 0) {
                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                    }
                                                                                                                                                    if (((C1015qf) obj14).a((C1015qf) o5.get(i31), resolver, otherResolver)) {
                                                                                                                                                        i31 = i32;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                z17 = true;
                                                                                                                                            }
                                                                                                                                            z17 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        return false;
                                                                                                                                    }
                                                                                                                                    if (z17) {
                                                                                                                                        List f4 = f();
                                                                                                                                        if (f4 != null) {
                                                                                                                                            List f5 = ef.f();
                                                                                                                                            if (f5 != null) {
                                                                                                                                                if (f4.size() == f5.size()) {
                                                                                                                                                    int i33 = 0;
                                                                                                                                                    for (Object obj15 : f4) {
                                                                                                                                                        int i34 = i33 + 1;
                                                                                                                                                        if (i33 < 0) {
                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                        }
                                                                                                                                                        if (((AbstractC1176zf) obj15).a((AbstractC1176zf) f5.get(i33), resolver, otherResolver)) {
                                                                                                                                                            i33 = i34;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    z18 = true;
                                                                                                                                                }
                                                                                                                                                z18 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                        if (z18) {
                                                                                                                                            List list11 = this.f2666Q;
                                                                                                                                            List list12 = ef.f2666Q;
                                                                                                                                            if (list11.size() == list12.size()) {
                                                                                                                                                int i35 = 0;
                                                                                                                                                for (Object obj16 : list11) {
                                                                                                                                                    int i36 = i35 + 1;
                                                                                                                                                    if (i35 < 0) {
                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                    }
                                                                                                                                                    if (((Mf) obj16).a((Mf) list12.get(i35), resolver, otherResolver)) {
                                                                                                                                                        i35 = i36;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                z19 = true;
                                                                                                                                                if (z19 && getVisibility().evaluate(resolver) == ef.getVisibility().evaluate(otherResolver)) {
                                                                                                                                                    q4 = q();
                                                                                                                                                    if (q4 == null ? q4.h(ef.q(), resolver, otherResolver) : ef.q() == null) {
                                                                                                                                                        List c4 = c();
                                                                                                                                                        if (c4 != null) {
                                                                                                                                                            List c5 = ef.c();
                                                                                                                                                            if (c5 != null) {
                                                                                                                                                                if (c4.size() == c5.size()) {
                                                                                                                                                                    int i37 = 0;
                                                                                                                                                                    for (Object obj17 : c4) {
                                                                                                                                                                        int i38 = i37 + 1;
                                                                                                                                                                        if (i37 < 0) {
                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                        }
                                                                                                                                                                        if (((Wf) obj17).h((Wf) c5.get(i37), resolver, otherResolver)) {
                                                                                                                                                                            i37 = i38;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    z20 = true;
                                                                                                                                                                }
                                                                                                                                                                z20 = false;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            return false;
                                                                                                                                                        }
                                                                                                                                                        if (z20 && getWidth().a(ef.getWidth(), resolver, otherResolver)) {
                                                                                                                                                            return true;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            z19 = false;
                                                                                                                                            if (z19) {
                                                                                                                                                q4 = q();
                                                                                                                                                if (q4 == null ? q4.h(ef.q(), resolver, otherResolver) : ef.q() == null) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // O1.InterfaceC0752c3
    public List a() {
        return this.f2683l;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f2659J;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f2669T;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f2672a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f2682k;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f2665P;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f2693v;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f2679h;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f2686o;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f2690s;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f2691t;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f2667R;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f2670U;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f2655F;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Integer num = this.f2671V;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ef.class).hashCode();
        C0839h0 d4 = d();
        int i18 = 0;
        int hash = hashCode + (d4 != null ? d4.hash() : 0);
        Expression l4 = l();
        int hashCode2 = hash + (l4 != null ? l4.hashCode() : 0);
        Expression s4 = s();
        int hashCode3 = hashCode2 + (s4 != null ? s4.hashCode() : 0) + v().hashCode();
        List u4 = u();
        if (u4 != null) {
            Iterator it = u4.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((E2) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i19 = hashCode3 + i4;
        T2 t22 = this.f2677f;
        int hash2 = i19 + (t22 != null ? t22.hash() : 0) + this.f2678g.hashCode();
        List background = getBackground();
        if (background != null) {
            Iterator it2 = background.iterator();
            i5 = 0;
            while (it2.hasNext()) {
                i5 += ((X2) it2.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i20 = hash2 + i5;
        C0860i3 w4 = w();
        int hash3 = i20 + (w4 != null ? w4.hash() : 0);
        List list = this.f2681j;
        if (list != null) {
            Iterator it3 = list.iterator();
            i6 = 0;
            while (it3.hasNext()) {
                i6 += ((C0892k0) it3.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i21 = hash3 + i6;
        Expression e4 = e();
        int hashCode4 = i21 + (e4 != null ? e4.hashCode() : 0);
        List a4 = a();
        if (a4 != null) {
            Iterator it4 = a4.iterator();
            i7 = 0;
            while (it4.hasNext()) {
                i7 += ((M4) it4.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i22 = hashCode4 + i7;
        String str = this.f2684m;
        int hashCode5 = i22 + (str != null ? str.hashCode() : 0);
        List list2 = this.f2685n;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            i8 = 0;
            while (it5.hasNext()) {
                i8 += ((C0892k0) it5.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i23 = hashCode5 + i8;
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it6 = extensions.iterator();
            i9 = 0;
            while (it6.hasNext()) {
                i9 += ((C0933m5) it6.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i24 = i23 + i9;
        List list3 = this.f2687p;
        if (list3 != null) {
            Iterator it7 = list3.iterator();
            i10 = 0;
            while (it7.hasNext()) {
                i10 += ((C0892k0) it7.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i25 = i24 + i10;
        W5 x4 = x();
        int hash4 = i25 + (x4 != null ? x4.hash() : 0);
        List r4 = r();
        if (r4 != null) {
            Iterator it8 = r4.iterator();
            i11 = 0;
            while (it8.hasNext()) {
                i11 += ((C0809f6) it8.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int hash5 = hash4 + i11 + getHeight().hash();
        String id = getId();
        int hashCode6 = hash5 + (id != null ? id.hashCode() : 0);
        C1079u8 m4 = m();
        int hash6 = hashCode6 + (m4 != null ? m4.hash() : 0);
        C0754c5 g4 = g();
        int hash7 = hash6 + (g4 != null ? g4.hash() : 0) + this.f2694w.hashCode();
        C0754c5 i26 = i();
        int hash8 = hash7 + (i26 != null ? i26.hash() : 0);
        List list4 = this.f2696y;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            i12 = 0;
            while (it9.hasNext()) {
                i12 += ((C0892k0) it9.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i27 = hash8 + i12;
        JSONObject jSONObject = this.f2697z;
        int hashCode7 = i27 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.f2650A.hashCode();
        Expression expression = this.f2651B;
        int hashCode8 = hashCode7 + (expression != null ? expression.hashCode() : 0) + this.f2652C.hashCode();
        List list5 = this.f2653D;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            i13 = 0;
            while (it10.hasNext()) {
                i13 += ((C0892k0) it10.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i28 = hashCode8 + i13;
        Expression n4 = n();
        int hashCode9 = i28 + (n4 != null ? n4.hashCode() : 0);
        Expression h4 = h();
        int hashCode10 = hashCode9 + (h4 != null ? h4.hashCode() : 0) + this.f2656G.hashCode();
        List k4 = k();
        if (k4 != null) {
            Iterator it11 = k4.iterator();
            i14 = 0;
            while (it11.hasNext()) {
                i14 += ((C0892k0) it11.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i29 = hashCode10 + i14;
        List p4 = p();
        if (p4 != null) {
            Iterator it12 = p4.iterator();
            i15 = 0;
            while (it12.hasNext()) {
                i15 += ((Se) it12.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i30 = i29 + i15;
        C0925lf b4 = b();
        int hash9 = i30 + (b4 != null ? b4.hash() : 0);
        AbstractC1092v3 z4 = z();
        int hash10 = hash9 + (z4 != null ? z4.hash() : 0);
        O2 t4 = t();
        int hash11 = hash10 + (t4 != null ? t4.hash() : 0);
        O2 y4 = y();
        int hash12 = hash11 + (y4 != null ? y4.hash() : 0);
        List j4 = j();
        int hashCode11 = hash12 + (j4 != null ? j4.hashCode() : 0);
        List o4 = o();
        if (o4 != null) {
            Iterator it13 = o4.iterator();
            i16 = 0;
            while (it13.hasNext()) {
                i16 += ((C1015qf) it13.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int i31 = hashCode11 + i16;
        List f4 = f();
        if (f4 != null) {
            Iterator it14 = f4.iterator();
            i17 = 0;
            while (it14.hasNext()) {
                i17 += ((AbstractC1176zf) it14.next()).hash();
            }
        } else {
            i17 = 0;
        }
        int i32 = i31 + i17;
        Iterator it15 = this.f2666Q.iterator();
        int i33 = 0;
        while (it15.hasNext()) {
            i33 += ((Mf) it15.next()).hash();
        }
        int hashCode12 = i32 + i33 + getVisibility().hashCode();
        Wf q4 = q();
        int hash13 = hashCode12 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it16 = c4.iterator();
            while (it16.hasNext()) {
                i18 += ((Wf) it16.next()).hash();
            }
        }
        int hash14 = hash13 + i18 + getWidth().hash();
        this.f2671V = Integer.valueOf(hash14);
        return hash14;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f2695x;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f2663N;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f2657H;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f2673b;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f2692u;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f2654E;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f2664O;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f2658I;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f2668S;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f2689r;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f2674c;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f2661L;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f2676e;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f2675d;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f2680i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Kf.f) BuiltInParserKt.getBuiltInParserComponent().h9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f2688q;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f2662M;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f2660K;
    }
}
