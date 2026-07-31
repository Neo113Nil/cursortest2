package O1;

import O1.Ad;
import O1.Bd;
import O1.Hd;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.qd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1013qd implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: T, reason: collision with root package name */
    public static final b f7581T = new b(null);

    /* renamed from: U, reason: collision with root package name */
    private static final Expression f7582U;

    /* renamed from: V, reason: collision with root package name */
    private static final Expression f7583V;

    /* renamed from: W, reason: collision with root package name */
    private static final Expression f7584W;

    /* renamed from: X, reason: collision with root package name */
    private static final Yb.e f7585X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Expression f7586Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final Expression f7587Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final Expression f7588a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final C0754c5 f7589b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final Expression f7590c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final C0754c5 f7591d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Expression f7592e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final Yb.d f7593f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final Function2 f7594g0;

    /* renamed from: A, reason: collision with root package name */
    public final C0754c5 f7595A;

    /* renamed from: B, reason: collision with root package name */
    public final Expression f7596B;

    /* renamed from: C, reason: collision with root package name */
    public final d f7597C;

    /* renamed from: D, reason: collision with root package name */
    public final e f7598D;

    /* renamed from: E, reason: collision with root package name */
    public final C0754c5 f7599E;

    /* renamed from: F, reason: collision with root package name */
    private final List f7600F;

    /* renamed from: G, reason: collision with root package name */
    private final C0925lf f7601G;

    /* renamed from: H, reason: collision with root package name */
    private final AbstractC1092v3 f7602H;

    /* renamed from: I, reason: collision with root package name */
    private final O2 f7603I;

    /* renamed from: J, reason: collision with root package name */
    private final O2 f7604J;

    /* renamed from: K, reason: collision with root package name */
    private final List f7605K;

    /* renamed from: L, reason: collision with root package name */
    private final List f7606L;

    /* renamed from: M, reason: collision with root package name */
    private final List f7607M;

    /* renamed from: N, reason: collision with root package name */
    private final Expression f7608N;

    /* renamed from: O, reason: collision with root package name */
    private final Wf f7609O;

    /* renamed from: P, reason: collision with root package name */
    private final List f7610P;

    /* renamed from: Q, reason: collision with root package name */
    private final Yb f7611Q;

    /* renamed from: R, reason: collision with root package name */
    private Integer f7612R;

    /* renamed from: S, reason: collision with root package name */
    private Integer f7613S;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f7614a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f7615b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f7616c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f7617d;

    /* renamed from: e, reason: collision with root package name */
    private final List f7618e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7619f;

    /* renamed from: g, reason: collision with root package name */
    private final C0860i3 f7620g;

    /* renamed from: h, reason: collision with root package name */
    private final Expression f7621h;

    /* renamed from: i, reason: collision with root package name */
    private final List f7622i;

    /* renamed from: j, reason: collision with root package name */
    public final Expression f7623j;

    /* renamed from: k, reason: collision with root package name */
    private final List f7624k;

    /* renamed from: l, reason: collision with root package name */
    private final W5 f7625l;

    /* renamed from: m, reason: collision with root package name */
    private final List f7626m;

    /* renamed from: n, reason: collision with root package name */
    public final Expression f7627n;

    /* renamed from: o, reason: collision with root package name */
    private final Yb f7628o;

    /* renamed from: p, reason: collision with root package name */
    private final String f7629p;

    /* renamed from: q, reason: collision with root package name */
    public final List f7630q;

    /* renamed from: r, reason: collision with root package name */
    private final C1079u8 f7631r;

    /* renamed from: s, reason: collision with root package name */
    private final C0754c5 f7632s;

    /* renamed from: t, reason: collision with root package name */
    private final C0754c5 f7633t;

    /* renamed from: u, reason: collision with root package name */
    public final Expression f7634u;

    /* renamed from: v, reason: collision with root package name */
    private final Expression f7635v;

    /* renamed from: w, reason: collision with root package name */
    private final Expression f7636w;

    /* renamed from: x, reason: collision with root package name */
    private final List f7637x;

    /* renamed from: y, reason: collision with root package name */
    public final Expression f7638y;

    /* renamed from: z, reason: collision with root package name */
    public final Expression f7639z;

    /* renamed from: O1.qd$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7640i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1013qd invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1013qd.f7581T.a(env, it);
        }
    }

    /* renamed from: O1.qd$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1013qd a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ad.e) BuiltInParserKt.getBuiltInParserComponent().O7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.qd$c */
    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: e, reason: collision with root package name */
        public static final b f7641e = new b(null);

        /* renamed from: f, reason: collision with root package name */
        private static final Function2 f7642f = a.f7647i;

        /* renamed from: a, reason: collision with root package name */
        public final Z f7643a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f7644b;

        /* renamed from: c, reason: collision with root package name */
        public final C0892k0 f7645c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f7646d;

        /* renamed from: O1.qd$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f7647i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f7641e.a(env, it);
            }
        }

        /* renamed from: O1.qd$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((C1030rd) BuiltInParserKt.getBuiltInParserComponent().L7().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(Z div, Expression title, C0892k0 c0892k0) {
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f7643a = div;
            this.f7644b = title;
            this.f7645c = c0892k0;
        }

        public static /* synthetic */ c b(c cVar, Z z4, Expression expression, C0892k0 c0892k0, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z4 = cVar.f7643a;
            }
            if ((i4 & 2) != 0) {
                expression = cVar.f7644b;
            }
            if ((i4 & 4) != 0) {
                c0892k0 = cVar.f7645c;
            }
            return cVar.a(z4, expression, c0892k0);
        }

        public final c a(Z div, Expression title, C0892k0 c0892k0) {
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(title, "title");
            return new c(div, title, c0892k0);
        }

        public final boolean c(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (cVar != null && this.f7643a.a(cVar.f7643a, resolver, otherResolver) && Intrinsics.areEqual(this.f7644b.evaluate(resolver), cVar.f7644b.evaluate(otherResolver))) {
                C0892k0 c0892k0 = this.f7645c;
                C0892k0 c0892k02 = cVar.f7645c;
                if (c0892k0 != null ? c0892k0.a(c0892k02, resolver, otherResolver) : c0892k02 == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f7646d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode() + this.f7643a.hash() + this.f7644b.hashCode();
            C0892k0 c0892k0 = this.f7645c;
            int hash = hashCode + (c0892k0 != null ? c0892k0.hash() : 0);
            this.f7646d = Integer.valueOf(hash);
            return hash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C1030rd) BuiltInParserKt.getBuiltInParserComponent().L7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* renamed from: O1.qd$d */
    public static final class d implements JSONSerializable, Hashable {

        /* renamed from: e, reason: collision with root package name */
        public static final b f7648e = new b(null);

        /* renamed from: f, reason: collision with root package name */
        private static final S5 f7649f;

        /* renamed from: g, reason: collision with root package name */
        private static final S5 f7650g;

        /* renamed from: h, reason: collision with root package name */
        private static final Function2 f7651h;

        /* renamed from: a, reason: collision with root package name */
        public final S5 f7652a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f7653b;

        /* renamed from: c, reason: collision with root package name */
        public final S5 f7654c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f7655d;

        /* renamed from: O1.qd$d$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f7656i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return d.f7648e.a(env, it);
            }
        }

        /* renamed from: O1.qd$d$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((Bd.b) BuiltInParserKt.getBuiltInParserComponent().R7().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Expression.Companion companion = Expression.Companion;
            int i4 = 1;
            f7649f = new S5(null == true ? 1 : 0, companion.constant(12L), i4, null == true ? 1 : 0);
            f7650g = new S5(null == true ? 1 : 0, companion.constant(12L), i4, null == true ? 1 : 0);
            f7651h = a.f7656i;
        }

        public d(S5 height, Expression imageUrl, S5 width) {
            Intrinsics.checkNotNullParameter(height, "height");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(width, "width");
            this.f7652a = height;
            this.f7653b = imageUrl;
            this.f7654c = width;
        }

        public final boolean a(d dVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            return dVar != null && this.f7652a.a(dVar.f7652a, resolver, otherResolver) && Intrinsics.areEqual(this.f7653b.evaluate(resolver), dVar.f7653b.evaluate(otherResolver)) && this.f7654c.a(dVar.f7654c, resolver, otherResolver);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f7655d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(d.class).hashCode() + this.f7652a.hash() + this.f7653b.hashCode() + this.f7654c.hash();
            this.f7655d = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Bd.b) BuiltInParserKt.getBuiltInParserComponent().R7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f7582U = companion.constant(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        f7583V = companion.constant(bool);
        f7584W = companion.constant(bool);
        f7585X = new Yb.e(new C0765cg(null, null, null, 7, null));
        f7586Y = companion.constant(bool);
        f7587Z = companion.constant(0L);
        f7588a0 = companion.constant(335544320);
        f7589b0 = new C0754c5(companion.constant(0L), null, companion.constant(12L), companion.constant(12L), null == true ? 1 : 0, companion.constant(0L), null, 82, null);
        f7590c0 = companion.constant(Boolean.TRUE);
        f7591d0 = new C0754c5(companion.constant(8L), null, companion.constant(12L), companion.constant(12L), null, companion.constant(0L), null, 82, null);
        f7592e0 = companion.constant(Vf.VISIBLE);
        f7593f0 = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        f7594g0 = a.f7640i;
    }

    public C1013qd(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, Expression dynamicHeight, List list4, W5 w5, List list5, Expression hasSeparator, Yb height, String str, List items, C1079u8 c1079u8, C0754c5 c0754c5, C0754c5 c0754c52, Expression restrictParentScroll, Expression expression4, Expression expression5, List list6, Expression selectedTab, Expression separatorColor, C0754c5 separatorPaddings, Expression switchTabsByContentSwipeEnabled, d dVar, e eVar, C0754c5 titlePaddings, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(dynamicHeight, "dynamicHeight");
        Intrinsics.checkNotNullParameter(hasSeparator, "hasSeparator");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(restrictParentScroll, "restrictParentScroll");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(separatorColor, "separatorColor");
        Intrinsics.checkNotNullParameter(separatorPaddings, "separatorPaddings");
        Intrinsics.checkNotNullParameter(switchTabsByContentSwipeEnabled, "switchTabsByContentSwipeEnabled");
        Intrinsics.checkNotNullParameter(titlePaddings, "titlePaddings");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f7614a = c0839h0;
        this.f7615b = expression;
        this.f7616c = expression2;
        this.f7617d = alpha;
        this.f7618e = list;
        this.f7619f = list2;
        this.f7620g = c0860i3;
        this.f7621h = expression3;
        this.f7622i = list3;
        this.f7623j = dynamicHeight;
        this.f7624k = list4;
        this.f7625l = w5;
        this.f7626m = list5;
        this.f7627n = hasSeparator;
        this.f7628o = height;
        this.f7629p = str;
        this.f7630q = items;
        this.f7631r = c1079u8;
        this.f7632s = c0754c5;
        this.f7633t = c0754c52;
        this.f7634u = restrictParentScroll;
        this.f7635v = expression4;
        this.f7636w = expression5;
        this.f7637x = list6;
        this.f7638y = selectedTab;
        this.f7639z = separatorColor;
        this.f7595A = separatorPaddings;
        this.f7596B = switchTabsByContentSwipeEnabled;
        this.f7597C = dVar;
        this.f7598D = eVar;
        this.f7599E = titlePaddings;
        this.f7600F = list7;
        this.f7601G = c0925lf;
        this.f7602H = abstractC1092v3;
        this.f7603I = o22;
        this.f7604J = o23;
        this.f7605K = list8;
        this.f7606L = list9;
        this.f7607M = list10;
        this.f7608N = visibility;
        this.f7609O = wf;
        this.f7610P = list11;
        this.f7611Q = width;
    }

    public static /* synthetic */ C1013qd B(C1013qd c1013qd, C0839h0 c0839h0, Expression expression, Expression expression2, Expression expression3, List list, List list2, C0860i3 c0860i3, Expression expression4, List list3, Expression expression5, List list4, W5 w5, List list5, Expression expression6, Yb yb, String str, List list6, C1079u8 c1079u8, C0754c5 c0754c5, C0754c5 c0754c52, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, C0754c5 c0754c53, Expression expression12, d dVar, e eVar, C0754c5 c0754c54, List list8, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list9, List list10, List list11, Expression expression13, Wf wf, List list12, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? c1013qd.d() : c0839h0;
        Expression l4 = (i4 & 2) != 0 ? c1013qd.l() : expression;
        Expression s4 = (i4 & 4) != 0 ? c1013qd.s() : expression2;
        Expression v4 = (i4 & 8) != 0 ? c1013qd.v() : expression3;
        List u4 = (i4 & 16) != 0 ? c1013qd.u() : list;
        List background = (i4 & 32) != 0 ? c1013qd.getBackground() : list2;
        C0860i3 w4 = (i4 & 64) != 0 ? c1013qd.w() : c0860i3;
        Expression e4 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c1013qd.e() : expression4;
        List a4 = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c1013qd.a() : list3;
        Expression expression14 = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c1013qd.f7623j : expression5;
        List extensions = (i4 & 1024) != 0 ? c1013qd.getExtensions() : list4;
        W5 x4 = (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c1013qd.x() : w5;
        List r4 = (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? c1013qd.r() : list5;
        C0839h0 c0839h02 = d4;
        Expression expression15 = (i4 & 8192) != 0 ? c1013qd.f7627n : expression6;
        Yb height = (i4 & 16384) != 0 ? c1013qd.getHeight() : yb;
        String id = (i4 & 32768) != 0 ? c1013qd.getId() : str;
        List list13 = (i4 & 65536) != 0 ? c1013qd.f7630q : list6;
        return c1013qd.A(c0839h02, l4, s4, v4, u4, background, w4, e4, a4, expression14, extensions, x4, r4, expression15, height, id, list13, (i4 & 131072) != 0 ? c1013qd.m() : c1079u8, (i4 & 262144) != 0 ? c1013qd.g() : c0754c5, (i4 & 524288) != 0 ? c1013qd.i() : c0754c52, (i4 & 1048576) != 0 ? c1013qd.f7634u : expression7, (i4 & 2097152) != 0 ? c1013qd.n() : expression8, (i4 & 4194304) != 0 ? c1013qd.h() : expression9, (i4 & 8388608) != 0 ? c1013qd.k() : list7, (i4 & 16777216) != 0 ? c1013qd.f7638y : expression10, (i4 & 33554432) != 0 ? c1013qd.f7639z : expression11, (i4 & 67108864) != 0 ? c1013qd.f7595A : c0754c53, (i4 & 134217728) != 0 ? c1013qd.f7596B : expression12, (i4 & 268435456) != 0 ? c1013qd.f7597C : dVar, (i4 & 536870912) != 0 ? c1013qd.f7598D : eVar, (i4 & 1073741824) != 0 ? c1013qd.f7599E : c0754c54, (i4 & Integer.MIN_VALUE) != 0 ? c1013qd.p() : list8, (i5 & 1) != 0 ? c1013qd.b() : c0925lf, (i5 & 2) != 0 ? c1013qd.z() : abstractC1092v3, (i5 & 4) != 0 ? c1013qd.t() : o22, (i5 & 8) != 0 ? c1013qd.y() : o23, (i5 & 16) != 0 ? c1013qd.j() : list9, (i5 & 32) != 0 ? c1013qd.o() : list10, (i5 & 64) != 0 ? c1013qd.f() : list11, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c1013qd.getVisibility() : expression13, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c1013qd.q() : wf, (i5 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c1013qd.c() : list12, (i5 & 1024) != 0 ? c1013qd.getWidth() : yb2);
    }

    public final C1013qd A(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, Expression dynamicHeight, List list4, W5 w5, List list5, Expression hasSeparator, Yb height, String str, List items, C1079u8 c1079u8, C0754c5 c0754c5, C0754c5 c0754c52, Expression restrictParentScroll, Expression expression4, Expression expression5, List list6, Expression selectedTab, Expression separatorColor, C0754c5 separatorPaddings, Expression switchTabsByContentSwipeEnabled, d dVar, e eVar, C0754c5 titlePaddings, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(dynamicHeight, "dynamicHeight");
        Intrinsics.checkNotNullParameter(hasSeparator, "hasSeparator");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(restrictParentScroll, "restrictParentScroll");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(separatorColor, "separatorColor");
        Intrinsics.checkNotNullParameter(separatorPaddings, "separatorPaddings");
        Intrinsics.checkNotNullParameter(switchTabsByContentSwipeEnabled, "switchTabsByContentSwipeEnabled");
        Intrinsics.checkNotNullParameter(titlePaddings, "titlePaddings");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new C1013qd(c0839h0, expression, expression2, alpha, list, list2, c0860i3, expression3, list3, dynamicHeight, list4, w5, list5, hasSeparator, height, str, items, c1079u8, c0754c5, c0754c52, restrictParentScroll, expression4, expression5, list6, selectedTab, separatorColor, separatorPaddings, switchTabsByContentSwipeEnabled, dVar, eVar, titlePaddings, list7, c0925lf, abstractC1092v3, o22, o23, list8, list9, list10, visibility, wf, list11, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x0675, code lost:
    
        if (r9.c() == null) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x05fd, code lost:
    
        if (r9.f() == null) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x05b1, code lost:
    
        if (r9.o() == null) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0565, code lost:
    
        if (r9.j() == null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x04b0, code lost:
    
        if (r9.p() == null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x03d8, code lost:
    
        if (r9.k() == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0270, code lost:
    
        if (r9.r() == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x020a, code lost:
    
        if (r9.getExtensions() == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x01a4, code lost:
    
        if (r9.a() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x011c, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x00d0, code lost:
    
        if (r9.u() == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(C1013qd c1013qd, ExpressionResolver resolver, ExpressionResolver otherResolver) {
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
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c1013qd == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(c1013qd.d(), resolver, otherResolver) : c1013qd.d() == null) {
            Expression l4 = l();
            EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
            Expression l5 = c1013qd.l();
            if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                Expression s4 = s();
                EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                Expression s5 = c1013qd.s();
                if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                    if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) c1013qd.v().evaluate(otherResolver)).doubleValue()) {
                        List u4 = u();
                        if (u4 != null) {
                            List u5 = c1013qd.u();
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
                            List background = getBackground();
                            if (background != null) {
                                List background2 = c1013qd.getBackground();
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
                                if (w4 != null ? w4.a(c1013qd.w(), resolver, otherResolver) : c1013qd.w() == null) {
                                    Expression e4 = e();
                                    Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                    Expression e5 = c1013qd.e();
                                    if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null)) {
                                        List a4 = a();
                                        if (a4 != null) {
                                            List a5 = c1013qd.a();
                                            if (a5 != null) {
                                                if (a4.size() == a5.size()) {
                                                    int i8 = 0;
                                                    for (Object obj3 : a4) {
                                                        int i9 = i8 + 1;
                                                        if (i8 < 0) {
                                                            CollectionsKt.throwIndexOverflow();
                                                        }
                                                        if (((M4) obj3).h((M4) a5.get(i8), resolver, otherResolver)) {
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
                                        if (z6 && ((Boolean) this.f7623j.evaluate(resolver)).booleanValue() == ((Boolean) c1013qd.f7623j.evaluate(otherResolver)).booleanValue()) {
                                            List extensions = getExtensions();
                                            if (extensions != null) {
                                                List extensions2 = c1013qd.getExtensions();
                                                if (extensions2 != null) {
                                                    if (extensions.size() == extensions2.size()) {
                                                        int i10 = 0;
                                                        for (Object obj4 : extensions) {
                                                            int i11 = i10 + 1;
                                                            if (i10 < 0) {
                                                                CollectionsKt.throwIndexOverflow();
                                                            }
                                                            if (((C0933m5) obj4).a((C0933m5) extensions2.get(i10), resolver, otherResolver)) {
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
                                                W5 x4 = x();
                                                if (x4 != null ? x4.a(c1013qd.x(), resolver, otherResolver) : c1013qd.x() == null) {
                                                    List r4 = r();
                                                    if (r4 != null) {
                                                        List r5 = c1013qd.r();
                                                        if (r5 != null) {
                                                            if (r4.size() == r5.size()) {
                                                                int i12 = 0;
                                                                for (Object obj5 : r4) {
                                                                    int i13 = i12 + 1;
                                                                    if (i12 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    if (((C0809f6) obj5).a((C0809f6) r5.get(i12), resolver, otherResolver)) {
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
                                                    if (z8 && ((Boolean) this.f7627n.evaluate(resolver)).booleanValue() == ((Boolean) c1013qd.f7627n.evaluate(otherResolver)).booleanValue() && getHeight().a(c1013qd.getHeight(), resolver, otherResolver) && Intrinsics.areEqual(getId(), c1013qd.getId())) {
                                                        List list = this.f7630q;
                                                        List list2 = c1013qd.f7630q;
                                                        if (list.size() == list2.size()) {
                                                            int i14 = 0;
                                                            for (Object obj6 : list) {
                                                                int i15 = i14 + 1;
                                                                if (i14 < 0) {
                                                                    CollectionsKt.throwIndexOverflow();
                                                                }
                                                                if (((c) obj6).c((c) list2.get(i14), resolver, otherResolver)) {
                                                                    i14 = i15;
                                                                }
                                                            }
                                                            z9 = true;
                                                            if (z9) {
                                                                C1079u8 m4 = m();
                                                                if (m4 != null ? m4.a(c1013qd.m(), resolver, otherResolver) : c1013qd.m() == null) {
                                                                    C0754c5 g4 = g();
                                                                    if (g4 != null ? g4.a(c1013qd.g(), resolver, otherResolver) : c1013qd.g() == null) {
                                                                        C0754c5 i16 = i();
                                                                        if ((i16 != null ? i16.a(c1013qd.i(), resolver, otherResolver) : c1013qd.i() == null) && ((Boolean) this.f7634u.evaluate(resolver)).booleanValue() == ((Boolean) c1013qd.f7634u.evaluate(otherResolver)).booleanValue()) {
                                                                            Expression n4 = n();
                                                                            String str = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                            Expression n5 = c1013qd.n();
                                                                            if (Intrinsics.areEqual(str, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                                Expression h4 = h();
                                                                                Long l7 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                                Expression h5 = c1013qd.h();
                                                                                if (Intrinsics.areEqual(l7, h5 != null ? (Long) h5.evaluate(otherResolver) : null)) {
                                                                                    List k4 = k();
                                                                                    if (k4 != null) {
                                                                                        List k5 = c1013qd.k();
                                                                                        if (k5 != null) {
                                                                                            if (k4.size() == k5.size()) {
                                                                                                int i17 = 0;
                                                                                                for (Object obj7 : k4) {
                                                                                                    int i18 = i17 + 1;
                                                                                                    if (i17 < 0) {
                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                    }
                                                                                                    if (((C0892k0) obj7).a((C0892k0) k5.get(i17), resolver, otherResolver)) {
                                                                                                        i17 = i18;
                                                                                                    }
                                                                                                }
                                                                                                z10 = true;
                                                                                            }
                                                                                            z10 = false;
                                                                                            break;
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    if (z10 && ((Number) this.f7638y.evaluate(resolver)).longValue() == ((Number) c1013qd.f7638y.evaluate(otherResolver)).longValue() && ((Number) this.f7639z.evaluate(resolver)).intValue() == ((Number) c1013qd.f7639z.evaluate(otherResolver)).intValue() && this.f7595A.a(c1013qd.f7595A, resolver, otherResolver) && ((Boolean) this.f7596B.evaluate(resolver)).booleanValue() == ((Boolean) c1013qd.f7596B.evaluate(otherResolver)).booleanValue()) {
                                                                                        d dVar = this.f7597C;
                                                                                        if (dVar != null ? dVar.a(c1013qd.f7597C, resolver, otherResolver) : c1013qd.f7597C == null) {
                                                                                            e eVar = this.f7598D;
                                                                                            if ((eVar != null ? eVar.a(c1013qd.f7598D, resolver, otherResolver) : c1013qd.f7598D == null) && this.f7599E.a(c1013qd.f7599E, resolver, otherResolver)) {
                                                                                                List p4 = p();
                                                                                                if (p4 != null) {
                                                                                                    List p5 = c1013qd.p();
                                                                                                    if (p5 != null) {
                                                                                                        if (p4.size() == p5.size()) {
                                                                                                            int i19 = 0;
                                                                                                            for (Object obj8 : p4) {
                                                                                                                int i20 = i19 + 1;
                                                                                                                if (i19 < 0) {
                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                }
                                                                                                                if (((Se) obj8).a((Se) p5.get(i19), resolver, otherResolver)) {
                                                                                                                    i19 = i20;
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
                                                                                                    C0925lf b4 = b();
                                                                                                    if (b4 != null ? b4.a(c1013qd.b(), resolver, otherResolver) : c1013qd.b() == null) {
                                                                                                        AbstractC1092v3 z16 = z();
                                                                                                        if (z16 != null ? z16.a(c1013qd.z(), resolver, otherResolver) : c1013qd.z() == null) {
                                                                                                            O2 t4 = t();
                                                                                                            if (t4 != null ? t4.a(c1013qd.t(), resolver, otherResolver) : c1013qd.t() == null) {
                                                                                                                O2 y4 = y();
                                                                                                                if (y4 != null ? y4.a(c1013qd.y(), resolver, otherResolver) : c1013qd.y() == null) {
                                                                                                                    List j4 = j();
                                                                                                                    if (j4 != null) {
                                                                                                                        List j5 = c1013qd.j();
                                                                                                                        if (j5 != null) {
                                                                                                                            if (j4.size() == j5.size()) {
                                                                                                                                int i21 = 0;
                                                                                                                                for (Object obj9 : j4) {
                                                                                                                                    int i22 = i21 + 1;
                                                                                                                                    if (i21 < 0) {
                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                    }
                                                                                                                                    if (((EnumC0997pf) obj9) == ((EnumC0997pf) j5.get(i21))) {
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
                                                                                                                    if (z12) {
                                                                                                                        List o4 = o();
                                                                                                                        if (o4 != null) {
                                                                                                                            List o5 = c1013qd.o();
                                                                                                                            if (o5 != null) {
                                                                                                                                if (o4.size() == o5.size()) {
                                                                                                                                    int i23 = 0;
                                                                                                                                    for (Object obj10 : o4) {
                                                                                                                                        int i24 = i23 + 1;
                                                                                                                                        if (i23 < 0) {
                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                        }
                                                                                                                                        if (((C1015qf) obj10).a((C1015qf) o5.get(i23), resolver, otherResolver)) {
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
                                                                                                                            List f4 = f();
                                                                                                                            if (f4 != null) {
                                                                                                                                List f5 = c1013qd.f();
                                                                                                                                if (f5 != null) {
                                                                                                                                    if (f4.size() == f5.size()) {
                                                                                                                                        int i25 = 0;
                                                                                                                                        for (Object obj11 : f4) {
                                                                                                                                            int i26 = i25 + 1;
                                                                                                                                            if (i25 < 0) {
                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                            }
                                                                                                                                            if (((AbstractC1176zf) obj11).a((AbstractC1176zf) f5.get(i25), resolver, otherResolver)) {
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
                                                                                                                            if (z14 && getVisibility().evaluate(resolver) == c1013qd.getVisibility().evaluate(otherResolver)) {
                                                                                                                                Wf q4 = q();
                                                                                                                                if (q4 != null ? q4.h(c1013qd.q(), resolver, otherResolver) : c1013qd.q() == null) {
                                                                                                                                    List c4 = c();
                                                                                                                                    if (c4 != null) {
                                                                                                                                        List c5 = c1013qd.c();
                                                                                                                                        if (c5 != null) {
                                                                                                                                            if (c4.size() == c5.size()) {
                                                                                                                                                int i27 = 0;
                                                                                                                                                for (Object obj12 : c4) {
                                                                                                                                                    int i28 = i27 + 1;
                                                                                                                                                    if (i27 < 0) {
                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                    }
                                                                                                                                                    if (((Wf) obj12).h((Wf) c5.get(i27), resolver, otherResolver)) {
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
                                                                                                                                    if (z15 && getWidth().a(c1013qd.getWidth(), resolver, otherResolver)) {
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
                                                        z9 = false;
                                                        if (z9) {
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
        return this.f7622i;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f7601G;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f7610P;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f7614a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f7621h;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f7607M;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f7632s;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f7619f;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f7624k;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f7628o;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f7629p;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f7608N;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f7611Q;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f7636w;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7613S;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        Iterator it = this.f7630q.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((c) it.next()).hash();
        }
        int i5 = propertiesHash + i4;
        this.f7613S = Integer.valueOf(i5);
        return i5;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f7633t;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f7605K;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f7637x;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f7615b;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f7631r;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f7635v;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f7606L;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f7600F;
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
        Integer num = this.f7612R;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1013qd.class).hashCode();
        C0839h0 d4 = d();
        int i13 = 0;
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
        int i14 = hashCode3 + i4;
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
        int i15 = i14 + i5;
        C0860i3 w4 = w();
        int hash2 = i15 + (w4 != null ? w4.hash() : 0);
        Expression e4 = e();
        int hashCode4 = hash2 + (e4 != null ? e4.hashCode() : 0);
        List a4 = a();
        if (a4 != null) {
            Iterator it3 = a4.iterator();
            i6 = 0;
            while (it3.hasNext()) {
                i6 += ((M4) it3.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int hashCode5 = hashCode4 + i6 + this.f7623j.hashCode();
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it4 = extensions.iterator();
            i7 = 0;
            while (it4.hasNext()) {
                i7 += ((C0933m5) it4.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i16 = hashCode5 + i7;
        W5 x4 = x();
        int hash3 = i16 + (x4 != null ? x4.hash() : 0);
        List r4 = r();
        if (r4 != null) {
            Iterator it5 = r4.iterator();
            i8 = 0;
            while (it5.hasNext()) {
                i8 += ((C0809f6) it5.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int hashCode6 = hash3 + i8 + this.f7627n.hashCode() + getHeight().hash();
        String id = getId();
        int hashCode7 = hashCode6 + (id != null ? id.hashCode() : 0);
        C1079u8 m4 = m();
        int hash4 = hashCode7 + (m4 != null ? m4.hash() : 0);
        C0754c5 g4 = g();
        int hash5 = hash4 + (g4 != null ? g4.hash() : 0);
        C0754c5 i17 = i();
        int hash6 = hash5 + (i17 != null ? i17.hash() : 0) + this.f7634u.hashCode();
        Expression n4 = n();
        int hashCode8 = hash6 + (n4 != null ? n4.hashCode() : 0);
        Expression h4 = h();
        int hashCode9 = hashCode8 + (h4 != null ? h4.hashCode() : 0);
        List k4 = k();
        if (k4 != null) {
            Iterator it6 = k4.iterator();
            i9 = 0;
            while (it6.hasNext()) {
                i9 += ((C0892k0) it6.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int hashCode10 = hashCode9 + i9 + this.f7638y.hashCode() + this.f7639z.hashCode() + this.f7595A.hash() + this.f7596B.hashCode();
        d dVar = this.f7597C;
        int hash7 = hashCode10 + (dVar != null ? dVar.hash() : 0);
        e eVar = this.f7598D;
        int hash8 = hash7 + (eVar != null ? eVar.hash() : 0) + this.f7599E.hash();
        List p4 = p();
        if (p4 != null) {
            Iterator it7 = p4.iterator();
            i10 = 0;
            while (it7.hasNext()) {
                i10 += ((Se) it7.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i18 = hash8 + i10;
        C0925lf b4 = b();
        int hash9 = i18 + (b4 != null ? b4.hash() : 0);
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
            Iterator it8 = o4.iterator();
            i11 = 0;
            while (it8.hasNext()) {
                i11 += ((C1015qf) it8.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i19 = hashCode11 + i11;
        List f4 = f();
        if (f4 != null) {
            Iterator it9 = f4.iterator();
            i12 = 0;
            while (it9.hasNext()) {
                i12 += ((AbstractC1176zf) it9.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int hashCode12 = i19 + i12 + getVisibility().hashCode();
        Wf q4 = q();
        int hash13 = hashCode12 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it10 = c4.iterator();
            while (it10.hasNext()) {
                i13 += ((Wf) it10.next()).hash();
            }
        }
        int hash14 = hash13 + i13 + getWidth().hash();
        this.f7612R = Integer.valueOf(hash14);
        return hash14;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f7609O;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f7626m;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f7616c;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f7603I;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f7618e;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f7617d;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f7620g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ad.e) BuiltInParserKt.getBuiltInParserComponent().O7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f7625l;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f7604J;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f7602H;
    }

    /* renamed from: O1.qd$e */
    public static final class e implements JSONSerializable, Hashable {

        /* renamed from: A, reason: collision with root package name */
        private static final Expression f7657A;

        /* renamed from: B, reason: collision with root package name */
        private static final Expression f7658B;

        /* renamed from: C, reason: collision with root package name */
        private static final Expression f7659C;

        /* renamed from: D, reason: collision with root package name */
        private static final Expression f7660D;

        /* renamed from: E, reason: collision with root package name */
        private static final Expression f7661E;

        /* renamed from: F, reason: collision with root package name */
        private static final Expression f7662F;

        /* renamed from: G, reason: collision with root package name */
        private static final C0754c5 f7663G;

        /* renamed from: H, reason: collision with root package name */
        private static final Function2 f7664H;

        /* renamed from: v, reason: collision with root package name */
        public static final c f7665v = new c(null);

        /* renamed from: w, reason: collision with root package name */
        private static final Expression f7666w;

        /* renamed from: x, reason: collision with root package name */
        private static final Expression f7667x;

        /* renamed from: y, reason: collision with root package name */
        private static final Expression f7668y;

        /* renamed from: z, reason: collision with root package name */
        private static final Expression f7669z;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f7670a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f7671b;

        /* renamed from: c, reason: collision with root package name */
        public final Expression f7672c;

        /* renamed from: d, reason: collision with root package name */
        public final Expression f7673d;

        /* renamed from: e, reason: collision with root package name */
        public final Expression f7674e;

        /* renamed from: f, reason: collision with root package name */
        public final Expression f7675f;

        /* renamed from: g, reason: collision with root package name */
        public final Expression f7676g;

        /* renamed from: h, reason: collision with root package name */
        public final C0735b4 f7677h;

        /* renamed from: i, reason: collision with root package name */
        public final Expression f7678i;

        /* renamed from: j, reason: collision with root package name */
        public final Expression f7679j;

        /* renamed from: k, reason: collision with root package name */
        public final Expression f7680k;

        /* renamed from: l, reason: collision with root package name */
        public final Expression f7681l;

        /* renamed from: m, reason: collision with root package name */
        public final Expression f7682m;

        /* renamed from: n, reason: collision with root package name */
        public final Expression f7683n;

        /* renamed from: o, reason: collision with root package name */
        public final Expression f7684o;

        /* renamed from: p, reason: collision with root package name */
        public final Expression f7685p;

        /* renamed from: q, reason: collision with root package name */
        public final Expression f7686q;

        /* renamed from: r, reason: collision with root package name */
        public final Expression f7687r;

        /* renamed from: s, reason: collision with root package name */
        public final Expression f7688s;

        /* renamed from: t, reason: collision with root package name */
        public final C0754c5 f7689t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f7690u;

        /* renamed from: O1.qd$e$a */
        public enum a {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none");


            /* renamed from: c, reason: collision with root package name */
            public static final c f7691c = new c(null);

            /* renamed from: d, reason: collision with root package name */
            public static final Function1 f7692d = b.f7700i;

            /* renamed from: e, reason: collision with root package name */
            public static final Function1 f7693e = C0048a.f7699i;

            /* renamed from: b, reason: collision with root package name */
            private final String f7698b;

            /* renamed from: O1.qd$e$a$a, reason: collision with other inner class name */
            static final class C0048a extends kotlin.jvm.internal.s implements Function1 {

                /* renamed from: i, reason: collision with root package name */
                public static final C0048a f7699i = new C0048a();

                C0048a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a invoke(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return a.f7691c.a(value);
                }
            }

            /* renamed from: O1.qd$e$a$b */
            static final class b extends kotlin.jvm.internal.s implements Function1 {

                /* renamed from: i, reason: collision with root package name */
                public static final b f7700i = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(a value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return a.f7691c.b(value);
                }
            }

            /* renamed from: O1.qd$e$a$c */
            public static final class c {
                public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final a a(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    a aVar = a.SLIDE;
                    if (Intrinsics.areEqual(value, aVar.f7698b)) {
                        return aVar;
                    }
                    a aVar2 = a.FADE;
                    if (Intrinsics.areEqual(value, aVar2.f7698b)) {
                        return aVar2;
                    }
                    a aVar3 = a.NONE;
                    if (Intrinsics.areEqual(value, aVar3.f7698b)) {
                        return aVar3;
                    }
                    return null;
                }

                public final String b(a obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.f7698b;
                }

                private c() {
                }
            }

            a(String str) {
                this.f7698b = str;
            }
        }

        /* renamed from: O1.qd$e$b */
        static final class b extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f7701i = new b();

            b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return e.f7665v.a(env, it);
            }
        }

        /* renamed from: O1.qd$e$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((Hd.g) BuiltInParserKt.getBuiltInParserComponent().U7().getValue()).deserialize(env, json);
            }

            private c() {
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f7666w = companion.constant(-9120);
            f7667x = companion.constant(-872415232);
            f7668y = companion.constant(300L);
            f7669z = companion.constant(a.SLIDE);
            f7657A = companion.constant(12L);
            f7658B = companion.constant(EnumC0779dc.SP);
            f7659C = companion.constant(EnumC0791e6.REGULAR);
            f7660D = companion.constant(Integer.MIN_VALUE);
            f7661E = companion.constant(0L);
            f7662F = companion.constant(Double.valueOf(0.0d));
            f7663G = new C0754c5(companion.constant(6L), null, companion.constant(8L), companion.constant(8L), null, companion.constant(6L), null, 82, null);
            f7664H = b.f7701i;
        }

        public e(Expression activeBackgroundColor, Expression expression, Expression expression2, Expression activeTextColor, Expression animationDuration, Expression animationType, Expression expression3, C0735b4 c0735b4, Expression expression4, Expression fontSize, Expression fontSizeUnit, Expression fontWeight, Expression expression5, Expression expression6, Expression expression7, Expression inactiveTextColor, Expression itemSpacing, Expression letterSpacing, Expression expression8, C0754c5 paddings) {
            Intrinsics.checkNotNullParameter(activeBackgroundColor, "activeBackgroundColor");
            Intrinsics.checkNotNullParameter(activeTextColor, "activeTextColor");
            Intrinsics.checkNotNullParameter(animationDuration, "animationDuration");
            Intrinsics.checkNotNullParameter(animationType, "animationType");
            Intrinsics.checkNotNullParameter(fontSize, "fontSize");
            Intrinsics.checkNotNullParameter(fontSizeUnit, "fontSizeUnit");
            Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
            Intrinsics.checkNotNullParameter(inactiveTextColor, "inactiveTextColor");
            Intrinsics.checkNotNullParameter(itemSpacing, "itemSpacing");
            Intrinsics.checkNotNullParameter(letterSpacing, "letterSpacing");
            Intrinsics.checkNotNullParameter(paddings, "paddings");
            this.f7670a = activeBackgroundColor;
            this.f7671b = expression;
            this.f7672c = expression2;
            this.f7673d = activeTextColor;
            this.f7674e = animationDuration;
            this.f7675f = animationType;
            this.f7676g = expression3;
            this.f7677h = c0735b4;
            this.f7678i = expression4;
            this.f7679j = fontSize;
            this.f7680k = fontSizeUnit;
            this.f7681l = fontWeight;
            this.f7682m = expression5;
            this.f7683n = expression6;
            this.f7684o = expression7;
            this.f7685p = inactiveTextColor;
            this.f7686q = itemSpacing;
            this.f7687r = letterSpacing;
            this.f7688s = expression8;
            this.f7689t = paddings;
        }

        public final boolean a(e eVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (eVar != null && ((Number) this.f7670a.evaluate(resolver)).intValue() == ((Number) eVar.f7670a.evaluate(otherResolver)).intValue()) {
                Expression expression = this.f7671b;
                JSONObject jSONObject = expression != null ? (JSONObject) expression.evaluate(resolver) : null;
                Expression expression2 = eVar.f7671b;
                if (Intrinsics.areEqual(jSONObject, expression2 != null ? (JSONObject) expression2.evaluate(otherResolver) : null)) {
                    Expression expression3 = this.f7672c;
                    EnumC0791e6 enumC0791e6 = expression3 != null ? (EnumC0791e6) expression3.evaluate(resolver) : null;
                    Expression expression4 = eVar.f7672c;
                    if (enumC0791e6 == (expression4 != null ? (EnumC0791e6) expression4.evaluate(otherResolver) : null) && ((Number) this.f7673d.evaluate(resolver)).intValue() == ((Number) eVar.f7673d.evaluate(otherResolver)).intValue() && ((Number) this.f7674e.evaluate(resolver)).longValue() == ((Number) eVar.f7674e.evaluate(otherResolver)).longValue() && this.f7675f.evaluate(resolver) == eVar.f7675f.evaluate(otherResolver)) {
                        Expression expression5 = this.f7676g;
                        Long l4 = expression5 != null ? (Long) expression5.evaluate(resolver) : null;
                        Expression expression6 = eVar.f7676g;
                        if (Intrinsics.areEqual(l4, expression6 != null ? (Long) expression6.evaluate(otherResolver) : null)) {
                            C0735b4 c0735b4 = this.f7677h;
                            if (c0735b4 != null ? c0735b4.a(eVar.f7677h, resolver, otherResolver) : eVar.f7677h == null) {
                                Expression expression7 = this.f7678i;
                                String str = expression7 != null ? (String) expression7.evaluate(resolver) : null;
                                Expression expression8 = eVar.f7678i;
                                if (Intrinsics.areEqual(str, expression8 != null ? (String) expression8.evaluate(otherResolver) : null) && ((Number) this.f7679j.evaluate(resolver)).longValue() == ((Number) eVar.f7679j.evaluate(otherResolver)).longValue() && this.f7680k.evaluate(resolver) == eVar.f7680k.evaluate(otherResolver) && this.f7681l.evaluate(resolver) == eVar.f7681l.evaluate(otherResolver)) {
                                    Expression expression9 = this.f7682m;
                                    Integer num = expression9 != null ? (Integer) expression9.evaluate(resolver) : null;
                                    Expression expression10 = eVar.f7682m;
                                    if (Intrinsics.areEqual(num, expression10 != null ? (Integer) expression10.evaluate(otherResolver) : null)) {
                                        Expression expression11 = this.f7683n;
                                        JSONObject jSONObject2 = expression11 != null ? (JSONObject) expression11.evaluate(resolver) : null;
                                        Expression expression12 = eVar.f7683n;
                                        if (Intrinsics.areEqual(jSONObject2, expression12 != null ? (JSONObject) expression12.evaluate(otherResolver) : null)) {
                                            Expression expression13 = this.f7684o;
                                            EnumC0791e6 enumC0791e62 = expression13 != null ? (EnumC0791e6) expression13.evaluate(resolver) : null;
                                            Expression expression14 = eVar.f7684o;
                                            if (enumC0791e62 == (expression14 != null ? (EnumC0791e6) expression14.evaluate(otherResolver) : null) && ((Number) this.f7685p.evaluate(resolver)).intValue() == ((Number) eVar.f7685p.evaluate(otherResolver)).intValue() && ((Number) this.f7686q.evaluate(resolver)).longValue() == ((Number) eVar.f7686q.evaluate(otherResolver)).longValue()) {
                                                if (((Number) this.f7687r.evaluate(resolver)).doubleValue() == ((Number) eVar.f7687r.evaluate(otherResolver)).doubleValue()) {
                                                    Expression expression15 = this.f7688s;
                                                    Long l5 = expression15 != null ? (Long) expression15.evaluate(resolver) : null;
                                                    Expression expression16 = eVar.f7688s;
                                                    if (Intrinsics.areEqual(l5, expression16 != null ? (Long) expression16.evaluate(otherResolver) : null) && this.f7689t.a(eVar.f7689t, resolver, otherResolver)) {
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
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f7690u;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(e.class).hashCode() + this.f7670a.hashCode();
            Expression expression = this.f7671b;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            Expression expression2 = this.f7672c;
            int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.f7673d.hashCode() + this.f7674e.hashCode() + this.f7675f.hashCode();
            Expression expression3 = this.f7676g;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            C0735b4 c0735b4 = this.f7677h;
            int hash = hashCode4 + (c0735b4 != null ? c0735b4.hash() : 0);
            Expression expression4 = this.f7678i;
            int hashCode5 = hash + (expression4 != null ? expression4.hashCode() : 0) + this.f7679j.hashCode() + this.f7680k.hashCode() + this.f7681l.hashCode();
            Expression expression5 = this.f7682m;
            int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            Expression expression6 = this.f7683n;
            int hashCode7 = hashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression expression7 = this.f7684o;
            int hashCode8 = hashCode7 + (expression7 != null ? expression7.hashCode() : 0) + this.f7685p.hashCode() + this.f7686q.hashCode() + this.f7687r.hashCode();
            Expression expression8 = this.f7688s;
            int hashCode9 = hashCode8 + (expression8 != null ? expression8.hashCode() : 0) + this.f7689t.hash();
            this.f7690u = Integer.valueOf(hashCode9);
            return hashCode9;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Hd.g) BuiltInParserKt.getBuiltInParserComponent().U7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ e(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, C0735b4 c0735b4, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, Expression expression17, Expression expression18, C0754c5 c0754c5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? f7666w : expression, (i4 & 2) != 0 ? null : expression2, (i4 & 4) != 0 ? null : expression3, (i4 & 8) != 0 ? f7667x : expression4, (i4 & 16) != 0 ? f7668y : expression5, (i4 & 32) != 0 ? f7669z : expression6, (i4 & 64) != 0 ? null : expression7, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : c0735b4, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : expression8, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? f7657A : expression9, (i4 & 1024) != 0 ? f7658B : expression10, (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? f7659C : expression11, (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? null : expression12, (i4 & 8192) != 0 ? null : expression13, (i4 & 16384) != 0 ? null : expression14, (i4 & 32768) != 0 ? f7660D : expression15, (i4 & 65536) != 0 ? f7661E : expression16, (i4 & 131072) != 0 ? f7662F : expression17, (i4 & 262144) != 0 ? null : expression18, (i4 & 524288) != 0 ? f7663G : c0754c5);
        }
    }
}
