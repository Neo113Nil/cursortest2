package O1;

import O1.C1127x2;
import O1.M6;
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
public final class G6 implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: W, reason: collision with root package name */
    public static final b f2831W = new b(null);

    /* renamed from: X, reason: collision with root package name */
    private static final C1127x2 f2832X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Expression f2833Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final Expression f2834Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final Expression f2835a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final Expression f2836b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final Yb.e f2837c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final Expression f2838d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Yb.d f2839e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final Function2 f2840f0;

    /* renamed from: A, reason: collision with root package name */
    public final List f2841A;

    /* renamed from: B, reason: collision with root package name */
    private final C0754c5 f2842B;

    /* renamed from: C, reason: collision with root package name */
    private final C0754c5 f2843C;

    /* renamed from: D, reason: collision with root package name */
    public final List f2844D;

    /* renamed from: E, reason: collision with root package name */
    public final List f2845E;

    /* renamed from: F, reason: collision with root package name */
    private final Expression f2846F;

    /* renamed from: G, reason: collision with root package name */
    private final Expression f2847G;

    /* renamed from: H, reason: collision with root package name */
    private final List f2848H;

    /* renamed from: I, reason: collision with root package name */
    private final List f2849I;

    /* renamed from: J, reason: collision with root package name */
    private final C0925lf f2850J;

    /* renamed from: K, reason: collision with root package name */
    private final AbstractC1092v3 f2851K;

    /* renamed from: L, reason: collision with root package name */
    private final O2 f2852L;

    /* renamed from: M, reason: collision with root package name */
    private final O2 f2853M;

    /* renamed from: N, reason: collision with root package name */
    private final List f2854N;

    /* renamed from: O, reason: collision with root package name */
    private final List f2855O;

    /* renamed from: P, reason: collision with root package name */
    private final List f2856P;

    /* renamed from: Q, reason: collision with root package name */
    private final Expression f2857Q;

    /* renamed from: R, reason: collision with root package name */
    private final Wf f2858R;

    /* renamed from: S, reason: collision with root package name */
    private final List f2859S;

    /* renamed from: T, reason: collision with root package name */
    private final Yb f2860T;

    /* renamed from: U, reason: collision with root package name */
    private Integer f2861U;

    /* renamed from: V, reason: collision with root package name */
    private Integer f2862V;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f2863a;

    /* renamed from: b, reason: collision with root package name */
    public final C0892k0 f2864b;

    /* renamed from: c, reason: collision with root package name */
    public final C1127x2 f2865c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2866d;

    /* renamed from: e, reason: collision with root package name */
    private final Expression f2867e;

    /* renamed from: f, reason: collision with root package name */
    private final Expression f2868f;

    /* renamed from: g, reason: collision with root package name */
    private final Expression f2869g;

    /* renamed from: h, reason: collision with root package name */
    private final List f2870h;

    /* renamed from: i, reason: collision with root package name */
    private final List f2871i;

    /* renamed from: j, reason: collision with root package name */
    private final C0860i3 f2872j;

    /* renamed from: k, reason: collision with root package name */
    public final Expression f2873k;

    /* renamed from: l, reason: collision with root package name */
    public final Expression f2874l;

    /* renamed from: m, reason: collision with root package name */
    private final Expression f2875m;

    /* renamed from: n, reason: collision with root package name */
    public final Expression f2876n;

    /* renamed from: o, reason: collision with root package name */
    public final Expression f2877o;

    /* renamed from: p, reason: collision with root package name */
    private final List f2878p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2879q;

    /* renamed from: r, reason: collision with root package name */
    private final List f2880r;

    /* renamed from: s, reason: collision with root package name */
    private final W5 f2881s;

    /* renamed from: t, reason: collision with root package name */
    private final List f2882t;

    /* renamed from: u, reason: collision with root package name */
    private final Yb f2883u;

    /* renamed from: v, reason: collision with root package name */
    public final List f2884v;

    /* renamed from: w, reason: collision with root package name */
    public final List f2885w;

    /* renamed from: x, reason: collision with root package name */
    private final String f2886x;

    /* renamed from: y, reason: collision with root package name */
    public final List f2887y;

    /* renamed from: z, reason: collision with root package name */
    private final C1079u8 f2888z;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2889i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G6 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return G6.f2831W.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G6 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((M6.g) BuiltInParserKt.getBuiltInParserComponent().O3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant = companion.constant(100L);
        Expression constant2 = companion.constant(Double.valueOf(0.6d));
        Expression constant3 = companion.constant(C1127x2.c.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f2832X = new C1127x2(constant, constant2, null, null, constant3, null, null, companion.constant(valueOf), 108, null);
        f2833Y = companion.constant(valueOf);
        f2834Z = companion.constant(Boolean.TRUE);
        f2835a0 = companion.constant(EnumC1091v2.START);
        f2836b0 = companion.constant(EnumC1109w2.TOP);
        f2837c0 = new Yb.e(new C0765cg(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        f2838d0 = companion.constant(Vf.VISIBLE);
        f2839e0 = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        f2840f0 = a.f2889i;
    }

    public G6(C0839h0 c0839h0, C0892k0 c0892k0, C1127x2 actionAnimation, List list, Expression expression, Expression expression2, Expression alpha, List list2, List list3, C0860i3 c0860i3, Expression captureFocusOnAction, Expression columnCount, Expression expression3, Expression contentAlignmentHorizontal, Expression contentAlignmentVertical, List list4, List list5, List list6, W5 w5, List list7, Yb height, List list8, List list9, String str, List list10, C1079u8 c1079u8, List list11, C0754c5 c0754c5, C0754c5 c0754c52, List list12, List list13, Expression expression4, Expression expression5, List list14, List list15, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list16, List list17, List list18, Expression visibility, Wf wf, List list19, Yb width) {
        Intrinsics.checkNotNullParameter(actionAnimation, "actionAnimation");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "captureFocusOnAction");
        Intrinsics.checkNotNullParameter(columnCount, "columnCount");
        Intrinsics.checkNotNullParameter(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        Intrinsics.checkNotNullParameter(contentAlignmentVertical, "contentAlignmentVertical");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f2863a = c0839h0;
        this.f2864b = c0892k0;
        this.f2865c = actionAnimation;
        this.f2866d = list;
        this.f2867e = expression;
        this.f2868f = expression2;
        this.f2869g = alpha;
        this.f2870h = list2;
        this.f2871i = list3;
        this.f2872j = c0860i3;
        this.f2873k = captureFocusOnAction;
        this.f2874l = columnCount;
        this.f2875m = expression3;
        this.f2876n = contentAlignmentHorizontal;
        this.f2877o = contentAlignmentVertical;
        this.f2878p = list4;
        this.f2879q = list5;
        this.f2880r = list6;
        this.f2881s = w5;
        this.f2882t = list7;
        this.f2883u = height;
        this.f2884v = list8;
        this.f2885w = list9;
        this.f2886x = str;
        this.f2887y = list10;
        this.f2888z = c1079u8;
        this.f2841A = list11;
        this.f2842B = c0754c5;
        this.f2843C = c0754c52;
        this.f2844D = list12;
        this.f2845E = list13;
        this.f2846F = expression4;
        this.f2847G = expression5;
        this.f2848H = list14;
        this.f2849I = list15;
        this.f2850J = c0925lf;
        this.f2851K = abstractC1092v3;
        this.f2852L = o22;
        this.f2853M = o23;
        this.f2854N = list16;
        this.f2855O = list17;
        this.f2856P = list18;
        this.f2857Q = visibility;
        this.f2858R = wf;
        this.f2859S = list19;
        this.f2860T = width;
    }

    public static /* synthetic */ G6 B(G6 g6, C0839h0 c0839h0, C0892k0 c0892k0, C1127x2 c1127x2, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, C0860i3 c0860i3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, W5 w5, List list7, Yb yb, List list8, List list9, String str, List list10, C1079u8 c1079u8, List list11, C0754c5 c0754c5, C0754c5 c0754c52, List list12, List list13, Expression expression9, Expression expression10, List list14, List list15, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list16, List list17, List list18, Expression expression11, Wf wf, List list19, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? g6.d() : c0839h0;
        C0892k0 c0892k02 = (i4 & 2) != 0 ? g6.f2864b : c0892k0;
        C1127x2 c1127x22 = (i4 & 4) != 0 ? g6.f2865c : c1127x2;
        List list20 = (i4 & 8) != 0 ? g6.f2866d : list;
        Expression l4 = (i4 & 16) != 0 ? g6.l() : expression;
        Expression s4 = (i4 & 32) != 0 ? g6.s() : expression2;
        Expression v4 = (i4 & 64) != 0 ? g6.v() : expression3;
        List u4 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? g6.u() : list2;
        List background = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? g6.getBackground() : list3;
        C0860i3 w4 = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? g6.w() : c0860i3;
        Expression expression12 = (i4 & 1024) != 0 ? g6.f2873k : expression4;
        Expression expression13 = (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? g6.f2874l : expression5;
        Expression e4 = (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? g6.e() : expression6;
        C0839h0 c0839h02 = d4;
        Expression expression14 = (i4 & 8192) != 0 ? g6.f2876n : expression7;
        Expression expression15 = (i4 & 16384) != 0 ? g6.f2877o : expression8;
        List a4 = (i4 & 32768) != 0 ? g6.a() : list4;
        List list21 = (i4 & 65536) != 0 ? g6.f2879q : list5;
        List extensions = (i4 & 131072) != 0 ? g6.getExtensions() : list6;
        W5 x4 = (i4 & 262144) != 0 ? g6.x() : w5;
        List r4 = (i4 & 524288) != 0 ? g6.r() : list7;
        Yb height = (i4 & 1048576) != 0 ? g6.getHeight() : yb;
        List list22 = list21;
        List list23 = (i4 & 2097152) != 0 ? g6.f2884v : list8;
        List list24 = (i4 & 4194304) != 0 ? g6.f2885w : list9;
        String id = (i4 & 8388608) != 0 ? g6.getId() : str;
        List list25 = list24;
        List list26 = (i4 & 16777216) != 0 ? g6.f2887y : list10;
        return g6.A(c0839h02, c0892k02, c1127x22, list20, l4, s4, v4, u4, background, w4, expression12, expression13, e4, expression14, expression15, a4, list22, extensions, x4, r4, height, list23, list25, id, list26, (i4 & 33554432) != 0 ? g6.m() : c1079u8, (i4 & 67108864) != 0 ? g6.f2841A : list11, (i4 & 134217728) != 0 ? g6.g() : c0754c5, (i4 & 268435456) != 0 ? g6.i() : c0754c52, (i4 & 536870912) != 0 ? g6.f2844D : list12, (i4 & 1073741824) != 0 ? g6.f2845E : list13, (i4 & Integer.MIN_VALUE) != 0 ? g6.n() : expression9, (i5 & 1) != 0 ? g6.h() : expression10, (i5 & 2) != 0 ? g6.k() : list14, (i5 & 4) != 0 ? g6.p() : list15, (i5 & 8) != 0 ? g6.b() : c0925lf, (i5 & 16) != 0 ? g6.z() : abstractC1092v3, (i5 & 32) != 0 ? g6.t() : o22, (i5 & 64) != 0 ? g6.y() : o23, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? g6.j() : list16, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? g6.o() : list17, (i5 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? g6.f() : list18, (i5 & 1024) != 0 ? g6.getVisibility() : expression11, (i5 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? g6.q() : wf, (i5 & Base64Utils.IO_BUFFER_SIZE) != 0 ? g6.c() : list19, (i5 & 8192) != 0 ? g6.getWidth() : yb2);
    }

    public final G6 A(C0839h0 c0839h0, C0892k0 c0892k0, C1127x2 actionAnimation, List list, Expression expression, Expression expression2, Expression alpha, List list2, List list3, C0860i3 c0860i3, Expression captureFocusOnAction, Expression columnCount, Expression expression3, Expression contentAlignmentHorizontal, Expression contentAlignmentVertical, List list4, List list5, List list6, W5 w5, List list7, Yb height, List list8, List list9, String str, List list10, C1079u8 c1079u8, List list11, C0754c5 c0754c5, C0754c5 c0754c52, List list12, List list13, Expression expression4, Expression expression5, List list14, List list15, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list16, List list17, List list18, Expression visibility, Wf wf, List list19, Yb width) {
        Intrinsics.checkNotNullParameter(actionAnimation, "actionAnimation");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "captureFocusOnAction");
        Intrinsics.checkNotNullParameter(columnCount, "columnCount");
        Intrinsics.checkNotNullParameter(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        Intrinsics.checkNotNullParameter(contentAlignmentVertical, "contentAlignmentVertical");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new G6(c0839h0, c0892k0, actionAnimation, list, expression, expression2, alpha, list2, list3, c0860i3, captureFocusOnAction, columnCount, expression3, contentAlignmentHorizontal, contentAlignmentVertical, list4, list5, list6, w5, list7, height, list8, list9, str, list10, c1079u8, list11, c0754c5, c0754c52, list12, list13, expression4, expression5, list14, list15, c0925lf, abstractC1092v3, o22, o23, list16, list17, list18, visibility, wf, list19, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:499:0x07ff, code lost:
    
        if (r9.c() == null) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0787, code lost:
    
        if (r9.f() == null) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x073b, code lost:
    
        if (r9.o() == null) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x06ef, code lost:
    
        if (r9.j() == null) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x063a, code lost:
    
        if (r9.p() == null) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x05ee, code lost:
    
        if (r9.k() == null) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0560, code lost:
    
        if (r9.f2845E == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x051a, code lost:
    
        if (r9.f2844D == null) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x04a0, code lost:
    
        if (r9.f2841A == null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0440, code lost:
    
        if (r9.f2887y == null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x03ec, code lost:
    
        if (r9.f2885w == null) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x03a6, code lost:
    
        if (r9.f2884v == null) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0352, code lost:
    
        if (r9.r() == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x02ec, code lost:
    
        if (r9.getExtensions() == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x02a0, code lost:
    
        if (r9.f2879q == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x025a, code lost:
    
        if (r9.a() == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0180, code lost:
    
        if (r9.getBackground() == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0134, code lost:
    
        if (r9.u() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0086, code lost:
    
        if (r9.f2866d == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(G6 g6, ExpressionResolver resolver, ExpressionResolver otherResolver) {
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
        boolean z20;
        boolean z21;
        boolean z22;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (g6 == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(g6.d(), resolver, otherResolver) : g6.d() == null) {
            C0892k0 c0892k0 = this.f2864b;
            if ((c0892k0 != null ? c0892k0.a(g6.f2864b, resolver, otherResolver) : g6.f2864b == null) && this.f2865c.a(g6.f2865c, resolver, otherResolver)) {
                List list = this.f2866d;
                if (list != null) {
                    List list2 = g6.f2866d;
                    if (list2 != null) {
                        if (list.size() == list2.size()) {
                            int i4 = 0;
                            for (Object obj : list) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((C0892k0) obj).a((C0892k0) list2.get(i4), resolver, otherResolver)) {
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
                    Expression l4 = l();
                    EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
                    Expression l5 = g6.l();
                    if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                        Expression s4 = s();
                        EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                        Expression s5 = g6.s();
                        if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                            if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) g6.v().evaluate(otherResolver)).doubleValue()) {
                                List u4 = u();
                                if (u4 != null) {
                                    List u5 = g6.u();
                                    if (u5 != null) {
                                        if (u4.size() == u5.size()) {
                                            int i6 = 0;
                                            for (Object obj2 : u4) {
                                                int i7 = i6 + 1;
                                                if (i6 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                if (((E2) obj2).a((E2) u5.get(i6), resolver, otherResolver)) {
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
                                    List background = getBackground();
                                    if (background != null) {
                                        List background2 = g6.getBackground();
                                        if (background2 != null) {
                                            if (background.size() == background2.size()) {
                                                int i8 = 0;
                                                for (Object obj3 : background) {
                                                    int i9 = i8 + 1;
                                                    if (i8 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    if (((X2) obj3).a((X2) background2.get(i8), resolver, otherResolver)) {
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
                                        C0860i3 w4 = w();
                                        if ((w4 != null ? w4.a(g6.w(), resolver, otherResolver) : g6.w() == null) && ((Boolean) this.f2873k.evaluate(resolver)).booleanValue() == ((Boolean) g6.f2873k.evaluate(otherResolver)).booleanValue() && ((Number) this.f2874l.evaluate(resolver)).longValue() == ((Number) g6.f2874l.evaluate(otherResolver)).longValue()) {
                                            Expression e4 = e();
                                            Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                            Expression e5 = g6.e();
                                            if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null) && this.f2876n.evaluate(resolver) == g6.f2876n.evaluate(otherResolver) && this.f2877o.evaluate(resolver) == g6.f2877o.evaluate(otherResolver)) {
                                                List a4 = a();
                                                if (a4 != null) {
                                                    List a5 = g6.a();
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
                                                if (z7) {
                                                    List list3 = this.f2879q;
                                                    if (list3 != null) {
                                                        List list4 = g6.f2879q;
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
                                                            List extensions2 = g6.getExtensions();
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
                                                            W5 x4 = x();
                                                            if (x4 != null ? x4.a(g6.x(), resolver, otherResolver) : g6.x() == null) {
                                                                List r4 = r();
                                                                if (r4 != null) {
                                                                    List r5 = g6.r();
                                                                    if (r5 != null) {
                                                                        if (r4.size() == r5.size()) {
                                                                            int i16 = 0;
                                                                            for (Object obj7 : r4) {
                                                                                int i17 = i16 + 1;
                                                                                if (i16 < 0) {
                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                }
                                                                                if (((C0809f6) obj7).a((C0809f6) r5.get(i16), resolver, otherResolver)) {
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
                                                                if (z10 && getHeight().a(g6.getHeight(), resolver, otherResolver)) {
                                                                    List list5 = this.f2884v;
                                                                    if (list5 != null) {
                                                                        List list6 = g6.f2884v;
                                                                        if (list6 != null) {
                                                                            if (list5.size() == list6.size()) {
                                                                                int i18 = 0;
                                                                                for (Object obj8 : list5) {
                                                                                    int i19 = i18 + 1;
                                                                                    if (i18 < 0) {
                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                    }
                                                                                    if (((C0892k0) obj8).a((C0892k0) list6.get(i18), resolver, otherResolver)) {
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
                                                                    if (z11) {
                                                                        List list7 = this.f2885w;
                                                                        if (list7 != null) {
                                                                            List list8 = g6.f2885w;
                                                                            if (list8 != null) {
                                                                                if (list7.size() == list8.size()) {
                                                                                    int i20 = 0;
                                                                                    for (Object obj9 : list7) {
                                                                                        int i21 = i20 + 1;
                                                                                        if (i20 < 0) {
                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                        }
                                                                                        if (((C0892k0) obj9).a((C0892k0) list8.get(i20), resolver, otherResolver)) {
                                                                                            i20 = i21;
                                                                                        }
                                                                                    }
                                                                                    z12 = true;
                                                                                }
                                                                                z12 = false;
                                                                                break;
                                                                            }
                                                                            return false;
                                                                        }
                                                                        if (z12 && Intrinsics.areEqual(getId(), g6.getId())) {
                                                                            List list9 = this.f2887y;
                                                                            if (list9 != null) {
                                                                                List list10 = g6.f2887y;
                                                                                if (list10 != null) {
                                                                                    if (list9.size() == list10.size()) {
                                                                                        int i22 = 0;
                                                                                        for (Object obj10 : list9) {
                                                                                            int i23 = i22 + 1;
                                                                                            if (i22 < 0) {
                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                            }
                                                                                            if (((Z) obj10).a((Z) list10.get(i22), resolver, otherResolver)) {
                                                                                                i22 = i23;
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
                                                                                C1079u8 m4 = m();
                                                                                if (m4 != null ? m4.a(g6.m(), resolver, otherResolver) : g6.m() == null) {
                                                                                    List list11 = this.f2841A;
                                                                                    if (list11 != null) {
                                                                                        List list12 = g6.f2841A;
                                                                                        if (list12 != null) {
                                                                                            if (list11.size() == list12.size()) {
                                                                                                int i24 = 0;
                                                                                                for (Object obj11 : list11) {
                                                                                                    int i25 = i24 + 1;
                                                                                                    if (i24 < 0) {
                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                    }
                                                                                                    if (((C0892k0) obj11).a((C0892k0) list12.get(i24), resolver, otherResolver)) {
                                                                                                        i24 = i25;
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
                                                                                        C0754c5 g4 = g();
                                                                                        if (g4 != null ? g4.a(g6.g(), resolver, otherResolver) : g6.g() == null) {
                                                                                            C0754c5 i26 = i();
                                                                                            if (i26 != null ? i26.a(g6.i(), resolver, otherResolver) : g6.i() == null) {
                                                                                                List list13 = this.f2844D;
                                                                                                if (list13 != null) {
                                                                                                    List list14 = g6.f2844D;
                                                                                                    if (list14 != null) {
                                                                                                        if (list13.size() == list14.size()) {
                                                                                                            int i27 = 0;
                                                                                                            for (Object obj12 : list13) {
                                                                                                                int i28 = i27 + 1;
                                                                                                                if (i27 < 0) {
                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                }
                                                                                                                if (((C0892k0) obj12).a((C0892k0) list14.get(i27), resolver, otherResolver)) {
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
                                                                                                    List list15 = this.f2845E;
                                                                                                    if (list15 != null) {
                                                                                                        List list16 = g6.f2845E;
                                                                                                        if (list16 != null) {
                                                                                                            if (list15.size() == list16.size()) {
                                                                                                                int i29 = 0;
                                                                                                                for (Object obj13 : list15) {
                                                                                                                    int i30 = i29 + 1;
                                                                                                                    if (i29 < 0) {
                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                    }
                                                                                                                    if (((C0892k0) obj13).a((C0892k0) list16.get(i29), resolver, otherResolver)) {
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
                                                                                                        Expression n4 = n();
                                                                                                        String str = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                                                        Expression n5 = g6.n();
                                                                                                        if (Intrinsics.areEqual(str, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                                                            Expression h4 = h();
                                                                                                            Long l7 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                                                            Expression h5 = g6.h();
                                                                                                            if (Intrinsics.areEqual(l7, h5 != null ? (Long) h5.evaluate(otherResolver) : null)) {
                                                                                                                List k4 = k();
                                                                                                                if (k4 != null) {
                                                                                                                    List k5 = g6.k();
                                                                                                                    if (k5 != null) {
                                                                                                                        if (k4.size() == k5.size()) {
                                                                                                                            int i31 = 0;
                                                                                                                            for (Object obj14 : k4) {
                                                                                                                                int i32 = i31 + 1;
                                                                                                                                if (i31 < 0) {
                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                }
                                                                                                                                if (((C0892k0) obj14).a((C0892k0) k5.get(i31), resolver, otherResolver)) {
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
                                                                                                                    List p4 = p();
                                                                                                                    if (p4 != null) {
                                                                                                                        List p5 = g6.p();
                                                                                                                        if (p5 != null) {
                                                                                                                            if (p4.size() == p5.size()) {
                                                                                                                                int i33 = 0;
                                                                                                                                for (Object obj15 : p4) {
                                                                                                                                    int i34 = i33 + 1;
                                                                                                                                    if (i33 < 0) {
                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                    }
                                                                                                                                    if (((Se) obj15).a((Se) p5.get(i33), resolver, otherResolver)) {
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
                                                                                                                        C0925lf b4 = b();
                                                                                                                        if (b4 != null ? b4.a(g6.b(), resolver, otherResolver) : g6.b() == null) {
                                                                                                                            AbstractC1092v3 z23 = z();
                                                                                                                            if (z23 != null ? z23.a(g6.z(), resolver, otherResolver) : g6.z() == null) {
                                                                                                                                O2 t4 = t();
                                                                                                                                if (t4 != null ? t4.a(g6.t(), resolver, otherResolver) : g6.t() == null) {
                                                                                                                                    O2 y4 = y();
                                                                                                                                    if (y4 != null ? y4.a(g6.y(), resolver, otherResolver) : g6.y() == null) {
                                                                                                                                        List j4 = j();
                                                                                                                                        if (j4 != null) {
                                                                                                                                            List j5 = g6.j();
                                                                                                                                            if (j5 != null) {
                                                                                                                                                if (j4.size() == j5.size()) {
                                                                                                                                                    int i35 = 0;
                                                                                                                                                    for (Object obj16 : j4) {
                                                                                                                                                        int i36 = i35 + 1;
                                                                                                                                                        if (i35 < 0) {
                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                        }
                                                                                                                                                        if (((EnumC0997pf) obj16) == ((EnumC0997pf) j5.get(i35))) {
                                                                                                                                                            i35 = i36;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    z19 = true;
                                                                                                                                                }
                                                                                                                                                z19 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                        if (z19) {
                                                                                                                                            List o4 = o();
                                                                                                                                            if (o4 != null) {
                                                                                                                                                List o5 = g6.o();
                                                                                                                                                if (o5 != null) {
                                                                                                                                                    if (o4.size() == o5.size()) {
                                                                                                                                                        int i37 = 0;
                                                                                                                                                        for (Object obj17 : o4) {
                                                                                                                                                            int i38 = i37 + 1;
                                                                                                                                                            if (i37 < 0) {
                                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                                            }
                                                                                                                                                            if (((C1015qf) obj17).a((C1015qf) o5.get(i37), resolver, otherResolver)) {
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
                                                                                                                                            if (z20) {
                                                                                                                                                List f4 = f();
                                                                                                                                                if (f4 != null) {
                                                                                                                                                    List f5 = g6.f();
                                                                                                                                                    if (f5 != null) {
                                                                                                                                                        if (f4.size() == f5.size()) {
                                                                                                                                                            int i39 = 0;
                                                                                                                                                            for (Object obj18 : f4) {
                                                                                                                                                                int i40 = i39 + 1;
                                                                                                                                                                if (i39 < 0) {
                                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                                }
                                                                                                                                                                if (((AbstractC1176zf) obj18).a((AbstractC1176zf) f5.get(i39), resolver, otherResolver)) {
                                                                                                                                                                    i39 = i40;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            z21 = true;
                                                                                                                                                        }
                                                                                                                                                        z21 = false;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    return false;
                                                                                                                                                }
                                                                                                                                                if (z21 && getVisibility().evaluate(resolver) == g6.getVisibility().evaluate(otherResolver)) {
                                                                                                                                                    Wf q4 = q();
                                                                                                                                                    if (q4 != null ? q4.h(g6.q(), resolver, otherResolver) : g6.q() == null) {
                                                                                                                                                        List c4 = c();
                                                                                                                                                        if (c4 != null) {
                                                                                                                                                            List c5 = g6.c();
                                                                                                                                                            if (c5 != null) {
                                                                                                                                                                if (c4.size() == c5.size()) {
                                                                                                                                                                    int i41 = 0;
                                                                                                                                                                    for (Object obj19 : c4) {
                                                                                                                                                                        int i42 = i41 + 1;
                                                                                                                                                                        if (i41 < 0) {
                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                        }
                                                                                                                                                                        if (((Wf) obj19).h((Wf) c5.get(i41), resolver, otherResolver)) {
                                                                                                                                                                            i41 = i42;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    z22 = true;
                                                                                                                                                                }
                                                                                                                                                                z22 = false;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            return false;
                                                                                                                                                        }
                                                                                                                                                        if (z22 && getWidth().a(g6.getWidth(), resolver, otherResolver)) {
                                                                                                                                                            return true;
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
            }
        }
        return false;
    }

    @Override // O1.InterfaceC0752c3
    public List a() {
        return this.f2878p;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f2850J;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f2859S;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f2863a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f2875m;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f2856P;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f2842B;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f2871i;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f2880r;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f2883u;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f2886x;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f2857Q;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f2860T;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f2847G;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f2862V;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        List list = this.f2887y;
        int i4 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i4 += ((Z) it.next()).hash();
            }
        }
        int i5 = propertiesHash + i4;
        this.f2862V = Integer.valueOf(i5);
        return i5;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f2843C;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f2854N;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f2848H;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f2867e;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f2888z;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f2846F;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f2855O;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f2849I;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
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
        int i18;
        int i19;
        Integer num = this.f2861U;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(G6.class).hashCode();
        C0839h0 d4 = d();
        int i20 = 0;
        int hash = hashCode + (d4 != null ? d4.hash() : 0);
        C0892k0 c0892k0 = this.f2864b;
        int hash2 = hash + (c0892k0 != null ? c0892k0.hash() : 0) + this.f2865c.hash();
        List list = this.f2866d;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((C0892k0) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i21 = hash2 + i4;
        Expression l4 = l();
        int hashCode2 = i21 + (l4 != null ? l4.hashCode() : 0);
        Expression s4 = s();
        int hashCode3 = hashCode2 + (s4 != null ? s4.hashCode() : 0) + v().hashCode();
        List u4 = u();
        if (u4 != null) {
            Iterator it2 = u4.iterator();
            i5 = 0;
            while (it2.hasNext()) {
                i5 += ((E2) it2.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i22 = hashCode3 + i5;
        List background = getBackground();
        if (background != null) {
            Iterator it3 = background.iterator();
            i6 = 0;
            while (it3.hasNext()) {
                i6 += ((X2) it3.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i23 = i22 + i6;
        C0860i3 w4 = w();
        int hash3 = i23 + (w4 != null ? w4.hash() : 0) + this.f2873k.hashCode() + this.f2874l.hashCode();
        Expression e4 = e();
        int hashCode4 = hash3 + (e4 != null ? e4.hashCode() : 0) + this.f2876n.hashCode() + this.f2877o.hashCode();
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
        int i24 = hashCode4 + i7;
        List list2 = this.f2879q;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            i8 = 0;
            while (it5.hasNext()) {
                i8 += ((C0892k0) it5.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i25 = i24 + i8;
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
        int i26 = i25 + i9;
        W5 x4 = x();
        int hash4 = i26 + (x4 != null ? x4.hash() : 0);
        List r4 = r();
        if (r4 != null) {
            Iterator it7 = r4.iterator();
            i10 = 0;
            while (it7.hasNext()) {
                i10 += ((C0809f6) it7.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int hash5 = hash4 + i10 + getHeight().hash();
        List list3 = this.f2884v;
        if (list3 != null) {
            Iterator it8 = list3.iterator();
            i11 = 0;
            while (it8.hasNext()) {
                i11 += ((C0892k0) it8.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i27 = hash5 + i11;
        List list4 = this.f2885w;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            i12 = 0;
            while (it9.hasNext()) {
                i12 += ((C0892k0) it9.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i28 = i27 + i12;
        String id = getId();
        int hashCode5 = i28 + (id != null ? id.hashCode() : 0);
        C1079u8 m4 = m();
        int hash6 = hashCode5 + (m4 != null ? m4.hash() : 0);
        List list5 = this.f2841A;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            i13 = 0;
            while (it10.hasNext()) {
                i13 += ((C0892k0) it10.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i29 = hash6 + i13;
        C0754c5 g4 = g();
        int hash7 = i29 + (g4 != null ? g4.hash() : 0);
        C0754c5 i30 = i();
        int hash8 = hash7 + (i30 != null ? i30.hash() : 0);
        List list6 = this.f2844D;
        if (list6 != null) {
            Iterator it11 = list6.iterator();
            i14 = 0;
            while (it11.hasNext()) {
                i14 += ((C0892k0) it11.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i31 = hash8 + i14;
        List list7 = this.f2845E;
        if (list7 != null) {
            Iterator it12 = list7.iterator();
            i15 = 0;
            while (it12.hasNext()) {
                i15 += ((C0892k0) it12.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i32 = i31 + i15;
        Expression n4 = n();
        int hashCode6 = i32 + (n4 != null ? n4.hashCode() : 0);
        Expression h4 = h();
        int hashCode7 = hashCode6 + (h4 != null ? h4.hashCode() : 0);
        List k4 = k();
        if (k4 != null) {
            Iterator it13 = k4.iterator();
            i16 = 0;
            while (it13.hasNext()) {
                i16 += ((C0892k0) it13.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int i33 = hashCode7 + i16;
        List p4 = p();
        if (p4 != null) {
            Iterator it14 = p4.iterator();
            i17 = 0;
            while (it14.hasNext()) {
                i17 += ((Se) it14.next()).hash();
            }
        } else {
            i17 = 0;
        }
        int i34 = i33 + i17;
        C0925lf b4 = b();
        int hash9 = i34 + (b4 != null ? b4.hash() : 0);
        AbstractC1092v3 z4 = z();
        int hash10 = hash9 + (z4 != null ? z4.hash() : 0);
        O2 t4 = t();
        int hash11 = hash10 + (t4 != null ? t4.hash() : 0);
        O2 y4 = y();
        int hash12 = hash11 + (y4 != null ? y4.hash() : 0);
        List j4 = j();
        int hashCode8 = hash12 + (j4 != null ? j4.hashCode() : 0);
        List o4 = o();
        if (o4 != null) {
            Iterator it15 = o4.iterator();
            i18 = 0;
            while (it15.hasNext()) {
                i18 += ((C1015qf) it15.next()).hash();
            }
        } else {
            i18 = 0;
        }
        int i35 = hashCode8 + i18;
        List f4 = f();
        if (f4 != null) {
            Iterator it16 = f4.iterator();
            i19 = 0;
            while (it16.hasNext()) {
                i19 += ((AbstractC1176zf) it16.next()).hash();
            }
        } else {
            i19 = 0;
        }
        int hashCode9 = i35 + i19 + getVisibility().hashCode();
        Wf q4 = q();
        int hash13 = hashCode9 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it17 = c4.iterator();
            while (it17.hasNext()) {
                i20 += ((Wf) it17.next()).hash();
            }
        }
        int hash14 = hash13 + i20 + getWidth().hash();
        this.f2861U = Integer.valueOf(hash14);
        return hash14;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f2858R;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f2882t;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f2868f;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f2852L;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f2870h;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f2869g;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f2872j;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((M6.g) BuiltInParserKt.getBuiltInParserComponent().O3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f2881s;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f2853M;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f2851K;
    }
}
