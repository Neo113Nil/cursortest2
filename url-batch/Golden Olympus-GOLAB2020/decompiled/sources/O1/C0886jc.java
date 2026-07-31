package O1;

import O1.AbstractC0976oc;
import O1.AbstractC1101vc;
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

/* renamed from: O1.jc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0886jc implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: W, reason: collision with root package name */
    public static final b f6604W = new b(null);

    /* renamed from: X, reason: collision with root package name */
    private static final Expression f6605X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Yb.e f6606Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final Expression f6607Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final Expression f6608a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final Expression f6609b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final Expression f6610c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final Yb.d f6611d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Function2 f6612e0;

    /* renamed from: A, reason: collision with root package name */
    public final d f6613A;

    /* renamed from: B, reason: collision with root package name */
    public final String f6614B;

    /* renamed from: C, reason: collision with root package name */
    public final X4 f6615C;

    /* renamed from: D, reason: collision with root package name */
    public final d f6616D;

    /* renamed from: E, reason: collision with root package name */
    public final String f6617E;

    /* renamed from: F, reason: collision with root package name */
    public final X4 f6618F;

    /* renamed from: G, reason: collision with root package name */
    public final X4 f6619G;

    /* renamed from: H, reason: collision with root package name */
    private final List f6620H;

    /* renamed from: I, reason: collision with root package name */
    public final X4 f6621I;

    /* renamed from: J, reason: collision with root package name */
    public final X4 f6622J;

    /* renamed from: K, reason: collision with root package name */
    private final C0925lf f6623K;

    /* renamed from: L, reason: collision with root package name */
    private final AbstractC1092v3 f6624L;

    /* renamed from: M, reason: collision with root package name */
    private final O2 f6625M;

    /* renamed from: N, reason: collision with root package name */
    private final O2 f6626N;

    /* renamed from: O, reason: collision with root package name */
    private final List f6627O;

    /* renamed from: P, reason: collision with root package name */
    private final List f6628P;

    /* renamed from: Q, reason: collision with root package name */
    private final List f6629Q;

    /* renamed from: R, reason: collision with root package name */
    private final Expression f6630R;

    /* renamed from: S, reason: collision with root package name */
    private final Wf f6631S;

    /* renamed from: T, reason: collision with root package name */
    private final List f6632T;

    /* renamed from: U, reason: collision with root package name */
    private final Yb f6633U;

    /* renamed from: V, reason: collision with root package name */
    private Integer f6634V;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f6635a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f6636b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f6637c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f6638d;

    /* renamed from: e, reason: collision with root package name */
    private final List f6639e;

    /* renamed from: f, reason: collision with root package name */
    private final List f6640f;

    /* renamed from: g, reason: collision with root package name */
    private final C0860i3 f6641g;

    /* renamed from: h, reason: collision with root package name */
    private final Expression f6642h;

    /* renamed from: i, reason: collision with root package name */
    private final List f6643i;

    /* renamed from: j, reason: collision with root package name */
    private final List f6644j;

    /* renamed from: k, reason: collision with root package name */
    private final W5 f6645k;

    /* renamed from: l, reason: collision with root package name */
    private final List f6646l;

    /* renamed from: m, reason: collision with root package name */
    private final Yb f6647m;

    /* renamed from: n, reason: collision with root package name */
    private final String f6648n;

    /* renamed from: o, reason: collision with root package name */
    public final Expression f6649o;

    /* renamed from: p, reason: collision with root package name */
    private final C1079u8 f6650p;

    /* renamed from: q, reason: collision with root package name */
    private final C0754c5 f6651q;

    /* renamed from: r, reason: collision with root package name */
    public final Expression f6652r;

    /* renamed from: s, reason: collision with root package name */
    public final Expression f6653s;

    /* renamed from: t, reason: collision with root package name */
    private final C0754c5 f6654t;

    /* renamed from: u, reason: collision with root package name */
    public final List f6655u;

    /* renamed from: v, reason: collision with root package name */
    private final Expression f6656v;

    /* renamed from: w, reason: collision with root package name */
    private final Expression f6657w;

    /* renamed from: x, reason: collision with root package name */
    public final C0839h0 f6658x;

    /* renamed from: y, reason: collision with root package name */
    private final List f6659y;

    /* renamed from: z, reason: collision with root package name */
    public final X4 f6660z;

    /* renamed from: O1.jc$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6661i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0886jc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0886jc.f6604W.a(env, it);
        }
    }

    /* renamed from: O1.jc$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0886jc a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0976oc.e) BuiltInParserKt.getBuiltInParserComponent().b7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.jc$c */
    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: g, reason: collision with root package name */
        public static final b f6662g = new b(null);

        /* renamed from: h, reason: collision with root package name */
        private static final Function2 f6663h = a.f6670i;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f6664a;

        /* renamed from: b, reason: collision with root package name */
        public final C0754c5 f6665b;

        /* renamed from: c, reason: collision with root package name */
        public final Expression f6666c;

        /* renamed from: d, reason: collision with root package name */
        public final X4 f6667d;

        /* renamed from: e, reason: collision with root package name */
        public final X4 f6668e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f6669f;

        /* renamed from: O1.jc$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6670i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f6662g.a(env, it);
            }
        }

        /* renamed from: O1.jc$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((C0994pc) BuiltInParserKt.getBuiltInParserComponent().e7().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(Expression expression, C0754c5 c0754c5, Expression expression2, X4 x4, X4 x42) {
            this.f6664a = expression;
            this.f6665b = c0754c5;
            this.f6666c = expression2;
            this.f6667d = x4;
            this.f6668e = x42;
        }

        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (cVar == null) {
                return false;
            }
            Expression expression = this.f6664a;
            Long l4 = expression != null ? (Long) expression.evaluate(resolver) : null;
            Expression expression2 = cVar.f6664a;
            if (Intrinsics.areEqual(l4, expression2 != null ? (Long) expression2.evaluate(otherResolver) : null)) {
                C0754c5 c0754c5 = this.f6665b;
                if (c0754c5 != null ? c0754c5.a(cVar.f6665b, resolver, otherResolver) : cVar.f6665b == null) {
                    Expression expression3 = this.f6666c;
                    Long l5 = expression3 != null ? (Long) expression3.evaluate(resolver) : null;
                    Expression expression4 = cVar.f6666c;
                    if (Intrinsics.areEqual(l5, expression4 != null ? (Long) expression4.evaluate(otherResolver) : null)) {
                        X4 x4 = this.f6667d;
                        if (x4 != null ? x4.a(cVar.f6667d, resolver, otherResolver) : cVar.f6667d == null) {
                            X4 x42 = this.f6668e;
                            X4 x43 = cVar.f6668e;
                            if (x42 != null ? x42.a(x43, resolver, otherResolver) : x43 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f6669f;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode();
            Expression expression = this.f6664a;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            C0754c5 c0754c5 = this.f6665b;
            int hash = hashCode2 + (c0754c5 != null ? c0754c5.hash() : 0);
            Expression expression2 = this.f6666c;
            int hashCode3 = hash + (expression2 != null ? expression2.hashCode() : 0);
            X4 x4 = this.f6667d;
            int hash2 = hashCode3 + (x4 != null ? x4.hash() : 0);
            X4 x42 = this.f6668e;
            int hash3 = hash2 + (x42 != null ? x42.hash() : 0);
            this.f6669f = Integer.valueOf(hash3);
            return hash3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C0994pc) BuiltInParserKt.getBuiltInParserComponent().e7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* renamed from: O1.jc$d */
    public static final class d implements JSONSerializable, Hashable {

        /* renamed from: k, reason: collision with root package name */
        public static final b f6671k = new b(null);

        /* renamed from: l, reason: collision with root package name */
        private static final Expression f6672l;

        /* renamed from: m, reason: collision with root package name */
        private static final Expression f6673m;

        /* renamed from: n, reason: collision with root package name */
        private static final Expression f6674n;

        /* renamed from: o, reason: collision with root package name */
        private static final Expression f6675o;

        /* renamed from: p, reason: collision with root package name */
        private static final Expression f6676p;

        /* renamed from: q, reason: collision with root package name */
        private static final Function2 f6677q;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f6678a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f6679b;

        /* renamed from: c, reason: collision with root package name */
        public final Expression f6680c;

        /* renamed from: d, reason: collision with root package name */
        public final Expression f6681d;

        /* renamed from: e, reason: collision with root package name */
        public final Expression f6682e;

        /* renamed from: f, reason: collision with root package name */
        public final Expression f6683f;

        /* renamed from: g, reason: collision with root package name */
        public final Expression f6684g;

        /* renamed from: h, reason: collision with root package name */
        public final C1081ua f6685h;

        /* renamed from: i, reason: collision with root package name */
        public final Expression f6686i;

        /* renamed from: j, reason: collision with root package name */
        private Integer f6687j;

        /* renamed from: O1.jc$d$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6688i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return d.f6671k.a(env, it);
            }
        }

        /* renamed from: O1.jc$d$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((AbstractC1101vc.d) BuiltInParserKt.getBuiltInParserComponent().h7().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f6672l = companion.constant(12L);
            f6673m = companion.constant(EnumC0779dc.SP);
            f6674n = companion.constant(EnumC0791e6.REGULAR);
            f6675o = companion.constant(Double.valueOf(0.0d));
            f6676p = companion.constant(-16777216);
            f6677q = a.f6688i;
        }

        public d(Expression expression, Expression fontSize, Expression fontSizeUnit, Expression expression2, Expression fontWeight, Expression expression3, Expression letterSpacing, C1081ua c1081ua, Expression textColor) {
            Intrinsics.checkNotNullParameter(fontSize, "fontSize");
            Intrinsics.checkNotNullParameter(fontSizeUnit, "fontSizeUnit");
            Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
            Intrinsics.checkNotNullParameter(letterSpacing, "letterSpacing");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            this.f6678a = expression;
            this.f6679b = fontSize;
            this.f6680c = fontSizeUnit;
            this.f6681d = expression2;
            this.f6682e = fontWeight;
            this.f6683f = expression3;
            this.f6684g = letterSpacing;
            this.f6685h = c1081ua;
            this.f6686i = textColor;
        }

        public final boolean a(d dVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (dVar == null) {
                return false;
            }
            Expression expression = this.f6678a;
            String str = expression != null ? (String) expression.evaluate(resolver) : null;
            Expression expression2 = dVar.f6678a;
            if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null) && ((Number) this.f6679b.evaluate(resolver)).longValue() == ((Number) dVar.f6679b.evaluate(otherResolver)).longValue() && this.f6680c.evaluate(resolver) == dVar.f6680c.evaluate(otherResolver)) {
                Expression expression3 = this.f6681d;
                JSONObject jSONObject = expression3 != null ? (JSONObject) expression3.evaluate(resolver) : null;
                Expression expression4 = dVar.f6681d;
                if (Intrinsics.areEqual(jSONObject, expression4 != null ? (JSONObject) expression4.evaluate(otherResolver) : null) && this.f6682e.evaluate(resolver) == dVar.f6682e.evaluate(otherResolver)) {
                    Expression expression5 = this.f6683f;
                    Long l4 = expression5 != null ? (Long) expression5.evaluate(resolver) : null;
                    Expression expression6 = dVar.f6683f;
                    if (Intrinsics.areEqual(l4, expression6 != null ? (Long) expression6.evaluate(otherResolver) : null) && ((Number) this.f6684g.evaluate(resolver)).doubleValue() == ((Number) dVar.f6684g.evaluate(otherResolver)).doubleValue()) {
                        C1081ua c1081ua = this.f6685h;
                        if ((c1081ua != null ? c1081ua.a(dVar.f6685h, resolver, otherResolver) : dVar.f6685h == null) && ((Number) this.f6686i.evaluate(resolver)).intValue() == ((Number) dVar.f6686i.evaluate(otherResolver)).intValue()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f6687j;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(d.class).hashCode();
            Expression expression = this.f6678a;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.f6679b.hashCode() + this.f6680c.hashCode();
            Expression expression2 = this.f6681d;
            int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.f6682e.hashCode();
            Expression expression3 = this.f6683f;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0) + this.f6684g.hashCode();
            C1081ua c1081ua = this.f6685h;
            int hash = hashCode4 + (c1081ua != null ? c1081ua.hash() : 0) + this.f6686i.hashCode();
            this.f6687j = Integer.valueOf(hash);
            return hash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((AbstractC1101vc.d) BuiltInParserKt.getBuiltInParserComponent().h7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f6605X = companion.constant(Double.valueOf(1.0d));
        f6606Y = new Yb.e(new C0765cg(null, null, null, 7, null));
        f6607Z = companion.constant(Boolean.TRUE);
        f6608a0 = companion.constant(100L);
        f6609b0 = companion.constant(0L);
        f6610c0 = companion.constant(Vf.VISIBLE);
        f6611d0 = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        f6612e0 = a.f6661i;
    }

    public C0886jc(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, W5 w5, List list5, Yb height, String str, Expression isEnabled, C1079u8 c1079u8, C0754c5 c0754c5, Expression maxValue, Expression minValue, C0754c5 c0754c52, List list6, Expression expression4, Expression expression5, C0839h0 c0839h02, List list7, X4 x4, d dVar, String str2, X4 thumbStyle, d dVar2, String str3, X4 x42, X4 x43, List list8, X4 trackActiveStyle, X4 trackInactiveStyle, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list9, List list10, List list11, Expression visibility, Wf wf, List list12, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        Intrinsics.checkNotNullParameter(minValue, "minValue");
        Intrinsics.checkNotNullParameter(thumbStyle, "thumbStyle");
        Intrinsics.checkNotNullParameter(trackActiveStyle, "trackActiveStyle");
        Intrinsics.checkNotNullParameter(trackInactiveStyle, "trackInactiveStyle");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f6635a = c0839h0;
        this.f6636b = expression;
        this.f6637c = expression2;
        this.f6638d = alpha;
        this.f6639e = list;
        this.f6640f = list2;
        this.f6641g = c0860i3;
        this.f6642h = expression3;
        this.f6643i = list3;
        this.f6644j = list4;
        this.f6645k = w5;
        this.f6646l = list5;
        this.f6647m = height;
        this.f6648n = str;
        this.f6649o = isEnabled;
        this.f6650p = c1079u8;
        this.f6651q = c0754c5;
        this.f6652r = maxValue;
        this.f6653s = minValue;
        this.f6654t = c0754c52;
        this.f6655u = list6;
        this.f6656v = expression4;
        this.f6657w = expression5;
        this.f6658x = c0839h02;
        this.f6659y = list7;
        this.f6660z = x4;
        this.f6613A = dVar;
        this.f6614B = str2;
        this.f6615C = thumbStyle;
        this.f6616D = dVar2;
        this.f6617E = str3;
        this.f6618F = x42;
        this.f6619G = x43;
        this.f6620H = list8;
        this.f6621I = trackActiveStyle;
        this.f6622J = trackInactiveStyle;
        this.f6623K = c0925lf;
        this.f6624L = abstractC1092v3;
        this.f6625M = o22;
        this.f6626N = o23;
        this.f6627O = list9;
        this.f6628P = list10;
        this.f6629Q = list11;
        this.f6630R = visibility;
        this.f6631S = wf;
        this.f6632T = list12;
        this.f6633U = width;
    }

    public static /* synthetic */ C0886jc B(C0886jc c0886jc, C0839h0 c0839h0, Expression expression, Expression expression2, Expression expression3, List list, List list2, C0860i3 c0860i3, Expression expression4, List list3, List list4, W5 w5, List list5, Yb yb, String str, Expression expression5, C1079u8 c1079u8, C0754c5 c0754c5, Expression expression6, Expression expression7, C0754c5 c0754c52, List list6, Expression expression8, Expression expression9, C0839h0 c0839h02, List list7, X4 x4, d dVar, String str2, X4 x42, d dVar2, String str3, X4 x43, X4 x44, List list8, X4 x45, X4 x46, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list9, List list10, List list11, Expression expression10, Wf wf, List list12, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? c0886jc.d() : c0839h0;
        Expression l4 = (i4 & 2) != 0 ? c0886jc.l() : expression;
        Expression s4 = (i4 & 4) != 0 ? c0886jc.s() : expression2;
        Expression v4 = (i4 & 8) != 0 ? c0886jc.v() : expression3;
        List u4 = (i4 & 16) != 0 ? c0886jc.u() : list;
        List background = (i4 & 32) != 0 ? c0886jc.getBackground() : list2;
        C0860i3 w4 = (i4 & 64) != 0 ? c0886jc.w() : c0860i3;
        Expression e4 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c0886jc.e() : expression4;
        List a4 = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c0886jc.a() : list3;
        List extensions = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c0886jc.getExtensions() : list4;
        W5 x5 = (i4 & 1024) != 0 ? c0886jc.x() : w5;
        List r4 = (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c0886jc.r() : list5;
        Yb height = (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? c0886jc.getHeight() : yb;
        C0839h0 c0839h03 = d4;
        String id = (i4 & 8192) != 0 ? c0886jc.getId() : str;
        Expression expression11 = (i4 & 16384) != 0 ? c0886jc.f6649o : expression5;
        C1079u8 m4 = (i4 & 32768) != 0 ? c0886jc.m() : c1079u8;
        C0754c5 g4 = (i4 & 65536) != 0 ? c0886jc.g() : c0754c5;
        Expression expression12 = (i4 & 131072) != 0 ? c0886jc.f6652r : expression6;
        Expression expression13 = (i4 & 262144) != 0 ? c0886jc.f6653s : expression7;
        C0754c5 i6 = (i4 & 524288) != 0 ? c0886jc.i() : c0754c52;
        Expression expression14 = expression13;
        List list13 = (i4 & 1048576) != 0 ? c0886jc.f6655u : list6;
        Expression n4 = (i4 & 2097152) != 0 ? c0886jc.n() : expression8;
        Expression h4 = (i4 & 4194304) != 0 ? c0886jc.h() : expression9;
        List list14 = list13;
        C0839h0 c0839h04 = (i4 & 8388608) != 0 ? c0886jc.f6658x : c0839h02;
        return c0886jc.A(c0839h03, l4, s4, v4, u4, background, w4, e4, a4, extensions, x5, r4, height, id, expression11, m4, g4, expression12, expression14, i6, list14, n4, h4, c0839h04, (i4 & 16777216) != 0 ? c0886jc.k() : list7, (i4 & 33554432) != 0 ? c0886jc.f6660z : x4, (i4 & 67108864) != 0 ? c0886jc.f6613A : dVar, (i4 & 134217728) != 0 ? c0886jc.f6614B : str2, (i4 & 268435456) != 0 ? c0886jc.f6615C : x42, (i4 & 536870912) != 0 ? c0886jc.f6616D : dVar2, (i4 & 1073741824) != 0 ? c0886jc.f6617E : str3, (i4 & Integer.MIN_VALUE) != 0 ? c0886jc.f6618F : x43, (i5 & 1) != 0 ? c0886jc.f6619G : x44, (i5 & 2) != 0 ? c0886jc.p() : list8, (i5 & 4) != 0 ? c0886jc.f6621I : x45, (i5 & 8) != 0 ? c0886jc.f6622J : x46, (i5 & 16) != 0 ? c0886jc.b() : c0925lf, (i5 & 32) != 0 ? c0886jc.z() : abstractC1092v3, (i5 & 64) != 0 ? c0886jc.t() : o22, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c0886jc.y() : o23, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c0886jc.j() : list9, (i5 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c0886jc.o() : list10, (i5 & 1024) != 0 ? c0886jc.f() : list11, (i5 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c0886jc.getVisibility() : expression10, (i5 & Base64Utils.IO_BUFFER_SIZE) != 0 ? c0886jc.q() : wf, (i5 & 8192) != 0 ? c0886jc.c() : list12, (i5 & 16384) != 0 ? c0886jc.getWidth() : yb2);
    }

    public final C0886jc A(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, W5 w5, List list5, Yb height, String str, Expression isEnabled, C1079u8 c1079u8, C0754c5 c0754c5, Expression maxValue, Expression minValue, C0754c5 c0754c52, List list6, Expression expression4, Expression expression5, C0839h0 c0839h02, List list7, X4 x4, d dVar, String str2, X4 thumbStyle, d dVar2, String str3, X4 x42, X4 x43, List list8, X4 trackActiveStyle, X4 trackInactiveStyle, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list9, List list10, List list11, Expression visibility, Wf wf, List list12, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        Intrinsics.checkNotNullParameter(minValue, "minValue");
        Intrinsics.checkNotNullParameter(thumbStyle, "thumbStyle");
        Intrinsics.checkNotNullParameter(trackActiveStyle, "trackActiveStyle");
        Intrinsics.checkNotNullParameter(trackInactiveStyle, "trackInactiveStyle");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new C0886jc(c0839h0, expression, expression2, alpha, list, list2, c0860i3, expression3, list3, list4, w5, list5, height, str, isEnabled, c1079u8, c0754c5, maxValue, minValue, c0754c52, list6, expression4, expression5, c0839h02, list7, x4, dVar, str2, thumbStyle, dVar2, str3, x42, x43, list8, trackActiveStyle, trackInactiveStyle, c0925lf, abstractC1092v3, o22, o23, list9, list10, list11, visibility, wf, list12, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:385:0x06a1, code lost:
    
        if (r9.c() == null) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0629, code lost:
    
        if (r9.f() == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x05dd, code lost:
    
        if (r9.o() == null) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0591, code lost:
    
        if (r9.j() == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x04c8, code lost:
    
        if (r9.p() == null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x03fa, code lost:
    
        if (r9.k() == null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0358, code lost:
    
        if (r9.f6655u == null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0256, code lost:
    
        if (r9.r() == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x01f0, code lost:
    
        if (r9.getExtensions() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x01a4, code lost:
    
        if (r9.a() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x011c, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x00d0, code lost:
    
        if (r9.u() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(C0886jc c0886jc, ExpressionResolver resolver, ExpressionResolver otherResolver) {
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
        if (c0886jc == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(c0886jc.d(), resolver, otherResolver) : c0886jc.d() == null) {
            Expression l4 = l();
            EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
            Expression l5 = c0886jc.l();
            if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                Expression s4 = s();
                EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                Expression s5 = c0886jc.s();
                if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                    if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) c0886jc.v().evaluate(otherResolver)).doubleValue()) {
                        List u4 = u();
                        if (u4 != null) {
                            List u5 = c0886jc.u();
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
                                List background2 = c0886jc.getBackground();
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
                                if (w4 != null ? w4.a(c0886jc.w(), resolver, otherResolver) : c0886jc.w() == null) {
                                    Expression e4 = e();
                                    Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                    Expression e5 = c0886jc.e();
                                    if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null)) {
                                        List a4 = a();
                                        if (a4 != null) {
                                            List a5 = c0886jc.a();
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
                                        if (z6) {
                                            List extensions = getExtensions();
                                            if (extensions != null) {
                                                List extensions2 = c0886jc.getExtensions();
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
                                                if (x4 != null ? x4.a(c0886jc.x(), resolver, otherResolver) : c0886jc.x() == null) {
                                                    List r4 = r();
                                                    if (r4 != null) {
                                                        List r5 = c0886jc.r();
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
                                                    if (z8 && getHeight().a(c0886jc.getHeight(), resolver, otherResolver) && Intrinsics.areEqual(getId(), c0886jc.getId()) && ((Boolean) this.f6649o.evaluate(resolver)).booleanValue() == ((Boolean) c0886jc.f6649o.evaluate(otherResolver)).booleanValue()) {
                                                        C1079u8 m4 = m();
                                                        if (m4 != null ? m4.a(c0886jc.m(), resolver, otherResolver) : c0886jc.m() == null) {
                                                            C0754c5 g4 = g();
                                                            if ((g4 != null ? g4.a(c0886jc.g(), resolver, otherResolver) : c0886jc.g() == null) && ((Number) this.f6652r.evaluate(resolver)).longValue() == ((Number) c0886jc.f6652r.evaluate(otherResolver)).longValue() && ((Number) this.f6653s.evaluate(resolver)).longValue() == ((Number) c0886jc.f6653s.evaluate(otherResolver)).longValue()) {
                                                                C0754c5 i14 = i();
                                                                if (i14 != null ? i14.a(c0886jc.i(), resolver, otherResolver) : c0886jc.i() == null) {
                                                                    List list = this.f6655u;
                                                                    if (list != null) {
                                                                        List list2 = c0886jc.f6655u;
                                                                        if (list2 != null) {
                                                                            if (list.size() == list2.size()) {
                                                                                int i15 = 0;
                                                                                for (Object obj6 : list) {
                                                                                    int i16 = i15 + 1;
                                                                                    if (i15 < 0) {
                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                    }
                                                                                    if (((c) obj6).a((c) list2.get(i15), resolver, otherResolver)) {
                                                                                        i15 = i16;
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
                                                                        Expression n4 = n();
                                                                        String str = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                        Expression n5 = c0886jc.n();
                                                                        if (Intrinsics.areEqual(str, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                            Expression h4 = h();
                                                                            Long l7 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                            Expression h5 = c0886jc.h();
                                                                            if (Intrinsics.areEqual(l7, h5 != null ? (Long) h5.evaluate(otherResolver) : null)) {
                                                                                C0839h0 c0839h0 = this.f6658x;
                                                                                if (c0839h0 != null ? c0839h0.a(c0886jc.f6658x, resolver, otherResolver) : c0886jc.f6658x == null) {
                                                                                    List k4 = k();
                                                                                    if (k4 != null) {
                                                                                        List k5 = c0886jc.k();
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
                                                                                    if (z10) {
                                                                                        X4 x42 = this.f6660z;
                                                                                        if (x42 != null ? x42.a(c0886jc.f6660z, resolver, otherResolver) : c0886jc.f6660z == null) {
                                                                                            d dVar = this.f6613A;
                                                                                            if ((dVar != null ? dVar.a(c0886jc.f6613A, resolver, otherResolver) : c0886jc.f6613A == null) && Intrinsics.areEqual(this.f6614B, c0886jc.f6614B) && this.f6615C.a(c0886jc.f6615C, resolver, otherResolver)) {
                                                                                                d dVar2 = this.f6616D;
                                                                                                if ((dVar2 != null ? dVar2.a(c0886jc.f6616D, resolver, otherResolver) : c0886jc.f6616D == null) && Intrinsics.areEqual(this.f6617E, c0886jc.f6617E)) {
                                                                                                    X4 x43 = this.f6618F;
                                                                                                    if (x43 != null ? x43.a(c0886jc.f6618F, resolver, otherResolver) : c0886jc.f6618F == null) {
                                                                                                        X4 x44 = this.f6619G;
                                                                                                        if (x44 != null ? x44.a(c0886jc.f6619G, resolver, otherResolver) : c0886jc.f6619G == null) {
                                                                                                            List p4 = p();
                                                                                                            if (p4 != null) {
                                                                                                                List p5 = c0886jc.p();
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
                                                                                                            if (z11 && this.f6621I.a(c0886jc.f6621I, resolver, otherResolver) && this.f6622J.a(c0886jc.f6622J, resolver, otherResolver)) {
                                                                                                                C0925lf b4 = b();
                                                                                                                if (b4 != null ? b4.a(c0886jc.b(), resolver, otherResolver) : c0886jc.b() == null) {
                                                                                                                    AbstractC1092v3 z16 = z();
                                                                                                                    if (z16 != null ? z16.a(c0886jc.z(), resolver, otherResolver) : c0886jc.z() == null) {
                                                                                                                        O2 t4 = t();
                                                                                                                        if (t4 != null ? t4.a(c0886jc.t(), resolver, otherResolver) : c0886jc.t() == null) {
                                                                                                                            O2 y4 = y();
                                                                                                                            if (y4 != null ? y4.a(c0886jc.y(), resolver, otherResolver) : c0886jc.y() == null) {
                                                                                                                                List j4 = j();
                                                                                                                                if (j4 != null) {
                                                                                                                                    List j5 = c0886jc.j();
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
                                                                                                                                        List o5 = c0886jc.o();
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
                                                                                                                                            List f5 = c0886jc.f();
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
                                                                                                                                        if (z14 && getVisibility().evaluate(resolver) == c0886jc.getVisibility().evaluate(otherResolver)) {
                                                                                                                                            Wf q4 = q();
                                                                                                                                            if (q4 != null ? q4.h(c0886jc.q(), resolver, otherResolver) : c0886jc.q() == null) {
                                                                                                                                                List c4 = c();
                                                                                                                                                if (c4 != null) {
                                                                                                                                                    List c5 = c0886jc.c();
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
                                                                                                                                                if (z15 && getWidth().a(c0886jc.getWidth(), resolver, otherResolver)) {
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
        return false;
    }

    @Override // O1.InterfaceC0752c3
    public List a() {
        return this.f6643i;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f6623K;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f6632T;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f6635a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f6642h;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f6629Q;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f6651q;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f6640f;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f6644j;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f6647m;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f6648n;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f6630R;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f6633U;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f6657w;
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
        Integer num = this.f6634V;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0886jc.class).hashCode();
        C0839h0 d4 = d();
        int i14 = 0;
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
        int i15 = hashCode3 + i4;
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
        int i16 = i15 + i5;
        C0860i3 w4 = w();
        int hash2 = i16 + (w4 != null ? w4.hash() : 0);
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
        int i17 = hashCode4 + i6;
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
        int i18 = i17 + i7;
        W5 x4 = x();
        int hash3 = i18 + (x4 != null ? x4.hash() : 0);
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
        int hash4 = hash3 + i8 + getHeight().hash();
        String id = getId();
        int hashCode5 = hash4 + (id != null ? id.hashCode() : 0) + this.f6649o.hashCode();
        C1079u8 m4 = m();
        int hash5 = hashCode5 + (m4 != null ? m4.hash() : 0);
        C0754c5 g4 = g();
        int hash6 = hash5 + (g4 != null ? g4.hash() : 0) + this.f6652r.hashCode() + this.f6653s.hashCode();
        C0754c5 i19 = i();
        int hash7 = hash6 + (i19 != null ? i19.hash() : 0);
        List list = this.f6655u;
        if (list != null) {
            Iterator it6 = list.iterator();
            i9 = 0;
            while (it6.hasNext()) {
                i9 += ((c) it6.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i20 = hash7 + i9;
        Expression n4 = n();
        int hashCode6 = i20 + (n4 != null ? n4.hashCode() : 0);
        Expression h4 = h();
        int hashCode7 = hashCode6 + (h4 != null ? h4.hashCode() : 0);
        C0839h0 c0839h0 = this.f6658x;
        int hash8 = hashCode7 + (c0839h0 != null ? c0839h0.hash() : 0);
        List k4 = k();
        if (k4 != null) {
            Iterator it7 = k4.iterator();
            i10 = 0;
            while (it7.hasNext()) {
                i10 += ((C0892k0) it7.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i21 = hash8 + i10;
        X4 x42 = this.f6660z;
        int hash9 = i21 + (x42 != null ? x42.hash() : 0);
        d dVar = this.f6613A;
        int hash10 = hash9 + (dVar != null ? dVar.hash() : 0);
        String str = this.f6614B;
        int hashCode8 = hash10 + (str != null ? str.hashCode() : 0) + this.f6615C.hash();
        d dVar2 = this.f6616D;
        int hash11 = hashCode8 + (dVar2 != null ? dVar2.hash() : 0);
        String str2 = this.f6617E;
        int hashCode9 = hash11 + (str2 != null ? str2.hashCode() : 0);
        X4 x43 = this.f6618F;
        int hash12 = hashCode9 + (x43 != null ? x43.hash() : 0);
        X4 x44 = this.f6619G;
        int hash13 = hash12 + (x44 != null ? x44.hash() : 0);
        List p4 = p();
        if (p4 != null) {
            Iterator it8 = p4.iterator();
            i11 = 0;
            while (it8.hasNext()) {
                i11 += ((Se) it8.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int hash14 = hash13 + i11 + this.f6621I.hash() + this.f6622J.hash();
        C0925lf b4 = b();
        int hash15 = hash14 + (b4 != null ? b4.hash() : 0);
        AbstractC1092v3 z4 = z();
        int hash16 = hash15 + (z4 != null ? z4.hash() : 0);
        O2 t4 = t();
        int hash17 = hash16 + (t4 != null ? t4.hash() : 0);
        O2 y4 = y();
        int hash18 = hash17 + (y4 != null ? y4.hash() : 0);
        List j4 = j();
        int hashCode10 = hash18 + (j4 != null ? j4.hashCode() : 0);
        List o4 = o();
        if (o4 != null) {
            Iterator it9 = o4.iterator();
            i12 = 0;
            while (it9.hasNext()) {
                i12 += ((C1015qf) it9.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i22 = hashCode10 + i12;
        List f4 = f();
        if (f4 != null) {
            Iterator it10 = f4.iterator();
            i13 = 0;
            while (it10.hasNext()) {
                i13 += ((AbstractC1176zf) it10.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int hashCode11 = i22 + i13 + getVisibility().hashCode();
        Wf q4 = q();
        int hash19 = hashCode11 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it11 = c4.iterator();
            while (it11.hasNext()) {
                i14 += ((Wf) it11.next()).hash();
            }
        }
        int hash20 = hash19 + i14 + getWidth().hash();
        this.f6634V = Integer.valueOf(hash20);
        return hash20;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f6654t;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f6627O;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f6659y;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f6636b;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f6650p;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f6656v;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f6628P;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f6620H;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f6631S;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f6646l;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f6637c;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f6625M;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f6639e;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f6638d;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f6641g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0976oc.e) BuiltInParserKt.getBuiltInParserComponent().b7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f6645k;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f6626N;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f6624L;
    }
}
