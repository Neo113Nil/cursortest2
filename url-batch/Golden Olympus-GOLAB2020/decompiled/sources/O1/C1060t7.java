package O1;

import O1.S7;
import O1.Yb;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* renamed from: O1.t7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1060t7 implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: A0, reason: collision with root package name */
    private static final Function2 f7980A0;

    /* renamed from: i0, reason: collision with root package name */
    public static final c f7981i0 = new c(null);

    /* renamed from: j0, reason: collision with root package name */
    private static final Expression f7982j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final Expression f7983k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final Expression f7984l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final Expression f7985m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final Expression f7986n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final Expression f7987o0;

    /* renamed from: p0, reason: collision with root package name */
    private static final Yb.e f7988p0;

    /* renamed from: q0, reason: collision with root package name */
    private static final Expression f7989q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final Expression f7990r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final Expression f7991s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final Expression f7992t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final Expression f7993u0;

    /* renamed from: v0, reason: collision with root package name */
    private static final Expression f7994v0;

    /* renamed from: w0, reason: collision with root package name */
    private static final Expression f7995w0;

    /* renamed from: x0, reason: collision with root package name */
    private static final Expression f7996x0;

    /* renamed from: y0, reason: collision with root package name */
    private static final Expression f7997y0;

    /* renamed from: z0, reason: collision with root package name */
    private static final Yb.d f7998z0;

    /* renamed from: A, reason: collision with root package name */
    private final String f7999A;

    /* renamed from: B, reason: collision with root package name */
    public final Expression f8000B;

    /* renamed from: C, reason: collision with root package name */
    public final Expression f8001C;

    /* renamed from: D, reason: collision with root package name */
    private final C1079u8 f8002D;

    /* renamed from: E, reason: collision with root package name */
    public final Expression f8003E;

    /* renamed from: F, reason: collision with root package name */
    public final Expression f8004F;

    /* renamed from: G, reason: collision with root package name */
    private final C0754c5 f8005G;

    /* renamed from: H, reason: collision with root package name */
    public final T7 f8006H;

    /* renamed from: I, reason: collision with root package name */
    public final Expression f8007I;

    /* renamed from: J, reason: collision with root package name */
    public final Expression f8008J;

    /* renamed from: K, reason: collision with root package name */
    public final f f8009K;

    /* renamed from: L, reason: collision with root package name */
    private final C0754c5 f8010L;

    /* renamed from: M, reason: collision with root package name */
    private final Expression f8011M;

    /* renamed from: N, reason: collision with root package name */
    private final Expression f8012N;

    /* renamed from: O, reason: collision with root package name */
    public final Expression f8013O;

    /* renamed from: P, reason: collision with root package name */
    private final List f8014P;

    /* renamed from: Q, reason: collision with root package name */
    public final Expression f8015Q;

    /* renamed from: R, reason: collision with root package name */
    public final Expression f8016R;

    /* renamed from: S, reason: collision with root package name */
    public final Expression f8017S;

    /* renamed from: T, reason: collision with root package name */
    public final String f8018T;

    /* renamed from: U, reason: collision with root package name */
    private final List f8019U;

    /* renamed from: V, reason: collision with root package name */
    private final C0925lf f8020V;

    /* renamed from: W, reason: collision with root package name */
    private final AbstractC1092v3 f8021W;

    /* renamed from: X, reason: collision with root package name */
    private final O2 f8022X;

    /* renamed from: Y, reason: collision with root package name */
    private final O2 f8023Y;

    /* renamed from: Z, reason: collision with root package name */
    private final List f8024Z;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f8025a;

    /* renamed from: a0, reason: collision with root package name */
    public final List f8026a0;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f8027b;

    /* renamed from: b0, reason: collision with root package name */
    private final List f8028b0;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f8029c;

    /* renamed from: c0, reason: collision with root package name */
    private final List f8030c0;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f8031d;

    /* renamed from: d0, reason: collision with root package name */
    private final Expression f8032d0;

    /* renamed from: e, reason: collision with root package name */
    private final List f8033e;

    /* renamed from: e0, reason: collision with root package name */
    private final Wf f8034e0;

    /* renamed from: f, reason: collision with root package name */
    public final Expression f8035f;

    /* renamed from: f0, reason: collision with root package name */
    private final List f8036f0;

    /* renamed from: g, reason: collision with root package name */
    private final List f8037g;

    /* renamed from: g0, reason: collision with root package name */
    private final Yb f8038g0;

    /* renamed from: h, reason: collision with root package name */
    private final C0860i3 f8039h;

    /* renamed from: h0, reason: collision with root package name */
    private Integer f8040h0;

    /* renamed from: i, reason: collision with root package name */
    private final Expression f8041i;

    /* renamed from: j, reason: collision with root package name */
    private final List f8042j;

    /* renamed from: k, reason: collision with root package name */
    public final List f8043k;

    /* renamed from: l, reason: collision with root package name */
    public final Expression f8044l;

    /* renamed from: m, reason: collision with root package name */
    private final List f8045m;

    /* renamed from: n, reason: collision with root package name */
    public final List f8046n;

    /* renamed from: o, reason: collision with root package name */
    private final W5 f8047o;

    /* renamed from: p, reason: collision with root package name */
    public final Expression f8048p;

    /* renamed from: q, reason: collision with root package name */
    public final Expression f8049q;

    /* renamed from: r, reason: collision with root package name */
    public final Expression f8050r;

    /* renamed from: s, reason: collision with root package name */
    public final Expression f8051s;

    /* renamed from: t, reason: collision with root package name */
    public final Expression f8052t;

    /* renamed from: u, reason: collision with root package name */
    public final Expression f8053u;

    /* renamed from: v, reason: collision with root package name */
    private final List f8054v;

    /* renamed from: w, reason: collision with root package name */
    private final Yb f8055w;

    /* renamed from: x, reason: collision with root package name */
    public final Expression f8056x;

    /* renamed from: y, reason: collision with root package name */
    public final Expression f8057y;

    /* renamed from: z, reason: collision with root package name */
    public final Expression f8058z;

    /* renamed from: O1.t7$a */
    public enum a {
        AUTO("auto"),
        NONE("none"),
        WORDS("words"),
        SENTENCES("sentences"),
        ALL_CHARACTERS("all_characters");


        /* renamed from: c, reason: collision with root package name */
        public static final c f8059c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f8060d = b.f8070i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f8061e = C0051a.f8069i;

        /* renamed from: b, reason: collision with root package name */
        private final String f8068b;

        /* renamed from: O1.t7$a$a, reason: collision with other inner class name */
        static final class C0051a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0051a f8069i = new C0051a();

            C0051a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return a.f8059c.a(value);
            }
        }

        /* renamed from: O1.t7$a$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f8070i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(a value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return a.f8059c.b(value);
            }
        }

        /* renamed from: O1.t7$a$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                a aVar = a.AUTO;
                if (Intrinsics.areEqual(value, aVar.f8068b)) {
                    return aVar;
                }
                a aVar2 = a.NONE;
                if (Intrinsics.areEqual(value, aVar2.f8068b)) {
                    return aVar2;
                }
                a aVar3 = a.WORDS;
                if (Intrinsics.areEqual(value, aVar3.f8068b)) {
                    return aVar3;
                }
                a aVar4 = a.SENTENCES;
                if (Intrinsics.areEqual(value, aVar4.f8068b)) {
                    return aVar4;
                }
                a aVar5 = a.ALL_CHARACTERS;
                if (Intrinsics.areEqual(value, aVar5.f8068b)) {
                    return aVar5;
                }
                return null;
            }

            public final String b(a obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f8068b;
            }

            private c() {
            }
        }

        a(String str) {
            this.f8068b = str;
        }
    }

    /* renamed from: O1.t7$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8071i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1060t7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1060t7.f7981i0.a(env, it);
        }
    }

    /* renamed from: O1.t7$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1060t7 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((S7.l) BuiltInParserKt.getBuiltInParserComponent().p4().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    /* renamed from: O1.t7$d */
    public enum d {
        DEFAULT("default"),
        GO("go"),
        SEARCH(FirebaseAnalytics.Event.SEARCH),
        SEND("send"),
        DONE("done");


        /* renamed from: c, reason: collision with root package name */
        public static final c f8072c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f8073d = b.f8083i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f8074e = a.f8082i;

        /* renamed from: b, reason: collision with root package name */
        private final String f8081b;

        /* renamed from: O1.t7$d$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f8082i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return d.f8072c.a(value);
            }
        }

        /* renamed from: O1.t7$d$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f8083i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return d.f8072c.b(value);
            }
        }

        /* renamed from: O1.t7$d$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                d dVar = d.DEFAULT;
                if (Intrinsics.areEqual(value, dVar.f8081b)) {
                    return dVar;
                }
                d dVar2 = d.GO;
                if (Intrinsics.areEqual(value, dVar2.f8081b)) {
                    return dVar2;
                }
                d dVar3 = d.SEARCH;
                if (Intrinsics.areEqual(value, dVar3.f8081b)) {
                    return dVar3;
                }
                d dVar4 = d.SEND;
                if (Intrinsics.areEqual(value, dVar4.f8081b)) {
                    return dVar4;
                }
                d dVar5 = d.DONE;
                if (Intrinsics.areEqual(value, dVar5.f8081b)) {
                    return dVar5;
                }
                return null;
            }

            public final String b(d obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f8081b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f8081b = str;
        }
    }

    /* renamed from: O1.t7$e */
    public enum e {
        SINGLE_LINE_TEXT("single_line_text"),
        MULTI_LINE_TEXT("multi_line_text"),
        PHONE("phone"),
        NUMBER("number"),
        EMAIL(Scopes.EMAIL),
        URI("uri"),
        PASSWORD("password");


        /* renamed from: c, reason: collision with root package name */
        public static final c f8084c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f8085d = b.f8097i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f8086e = a.f8096i;

        /* renamed from: b, reason: collision with root package name */
        private final String f8095b;

        /* renamed from: O1.t7$e$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f8096i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return e.f8084c.a(value);
            }
        }

        /* renamed from: O1.t7$e$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f8097i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(e value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return e.f8084c.b(value);
            }
        }

        /* renamed from: O1.t7$e$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                e eVar = e.SINGLE_LINE_TEXT;
                if (Intrinsics.areEqual(value, eVar.f8095b)) {
                    return eVar;
                }
                e eVar2 = e.MULTI_LINE_TEXT;
                if (Intrinsics.areEqual(value, eVar2.f8095b)) {
                    return eVar2;
                }
                e eVar3 = e.PHONE;
                if (Intrinsics.areEqual(value, eVar3.f8095b)) {
                    return eVar3;
                }
                e eVar4 = e.NUMBER;
                if (Intrinsics.areEqual(value, eVar4.f8095b)) {
                    return eVar4;
                }
                e eVar5 = e.EMAIL;
                if (Intrinsics.areEqual(value, eVar5.f8095b)) {
                    return eVar5;
                }
                e eVar6 = e.URI;
                if (Intrinsics.areEqual(value, eVar6.f8095b)) {
                    return eVar6;
                }
                e eVar7 = e.PASSWORD;
                if (Intrinsics.areEqual(value, eVar7.f8095b)) {
                    return eVar7;
                }
                return null;
            }

            public final String b(e obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f8095b;
            }

            private c() {
            }
        }

        e(String str) {
            this.f8095b = str;
        }
    }

    /* renamed from: O1.t7$f */
    public static final class f implements JSONSerializable, Hashable {

        /* renamed from: c, reason: collision with root package name */
        public static final b f8098c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Function2 f8099d = a.f8102i;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f8100a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f8101b;

        /* renamed from: O1.t7$f$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f8102i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return f.f8098c.a(env, it);
            }
        }

        /* renamed from: O1.t7$f$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((Z7) BuiltInParserKt.getBuiltInParserComponent().v4().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public f(Expression color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.f8100a = color;
        }

        public final boolean a(f fVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            return fVar != null && ((Number) this.f8100a.evaluate(resolver)).intValue() == ((Number) fVar.f8100a.evaluate(otherResolver)).intValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f8101b;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(f.class).hashCode() + this.f8100a.hashCode();
            this.f8101b = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Z7) BuiltInParserKt.getBuiltInParserComponent().v4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f7982j0 = companion.constant(Double.valueOf(1.0d));
        f7983k0 = companion.constant(a.AUTO);
        f7984l0 = companion.constant(d.DEFAULT);
        f7985m0 = companion.constant(12L);
        f7986n0 = companion.constant(EnumC0779dc.SP);
        f7987o0 = companion.constant(EnumC0791e6.REGULAR);
        f7988p0 = new Yb.e(new C0765cg(null, null, null, 7, null));
        f7989q0 = companion.constant(1929379840);
        f7990r0 = companion.constant(Boolean.TRUE);
        f7991s0 = companion.constant(e.MULTI_LINE_TEXT);
        f7992t0 = companion.constant(Double.valueOf(0.0d));
        f7993u0 = companion.constant(Boolean.FALSE);
        f7994v0 = companion.constant(EnumC1091v2.START);
        f7995w0 = companion.constant(EnumC1109w2.CENTER);
        f7996x0 = companion.constant(-16777216);
        f7997y0 = companion.constant(Vf.VISIBLE);
        f7998z0 = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        f7980A0 = b.f8071i;
    }

    public C1060t7(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, Expression autocapitalization, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, Expression enterKeyType, List list5, List list6, W5 w5, Expression expression4, Expression fontSize, Expression fontSizeUnit, Expression expression5, Expression fontWeight, Expression expression6, List list7, Yb height, Expression expression7, Expression hintColor, Expression expression8, String str, Expression isEnabled, Expression keyboardType, C1079u8 c1079u8, Expression letterSpacing, Expression expression9, C0754c5 c0754c5, T7 t7, Expression expression10, Expression expression11, f fVar, C0754c5 c0754c52, Expression expression12, Expression expression13, Expression selectAllOnFocus, List list8, Expression textAlignmentHorizontal, Expression textAlignmentVertical, Expression textColor, String textVariable, List list9, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list10, List list11, List list12, List list13, Expression visibility, Wf wf, List list14, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(autocapitalization, "autocapitalization");
        Intrinsics.checkNotNullParameter(enterKeyType, "enterKeyType");
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        Intrinsics.checkNotNullParameter(fontSizeUnit, "fontSizeUnit");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(hintColor, "hintColor");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
        Intrinsics.checkNotNullParameter(letterSpacing, "letterSpacing");
        Intrinsics.checkNotNullParameter(selectAllOnFocus, "selectAllOnFocus");
        Intrinsics.checkNotNullParameter(textAlignmentHorizontal, "textAlignmentHorizontal");
        Intrinsics.checkNotNullParameter(textAlignmentVertical, "textAlignmentVertical");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(textVariable, "textVariable");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f8025a = c0839h0;
        this.f8027b = expression;
        this.f8029c = expression2;
        this.f8031d = alpha;
        this.f8033e = list;
        this.f8035f = autocapitalization;
        this.f8037g = list2;
        this.f8039h = c0860i3;
        this.f8041i = expression3;
        this.f8042j = list3;
        this.f8043k = list4;
        this.f8044l = enterKeyType;
        this.f8045m = list5;
        this.f8046n = list6;
        this.f8047o = w5;
        this.f8048p = expression4;
        this.f8049q = fontSize;
        this.f8050r = fontSizeUnit;
        this.f8051s = expression5;
        this.f8052t = fontWeight;
        this.f8053u = expression6;
        this.f8054v = list7;
        this.f8055w = height;
        this.f8056x = expression7;
        this.f8057y = hintColor;
        this.f8058z = expression8;
        this.f7999A = str;
        this.f8000B = isEnabled;
        this.f8001C = keyboardType;
        this.f8002D = c1079u8;
        this.f8003E = letterSpacing;
        this.f8004F = expression9;
        this.f8005G = c0754c5;
        this.f8006H = t7;
        this.f8007I = expression10;
        this.f8008J = expression11;
        this.f8009K = fVar;
        this.f8010L = c0754c52;
        this.f8011M = expression12;
        this.f8012N = expression13;
        this.f8013O = selectAllOnFocus;
        this.f8014P = list8;
        this.f8015Q = textAlignmentHorizontal;
        this.f8016R = textAlignmentVertical;
        this.f8017S = textColor;
        this.f8018T = textVariable;
        this.f8019U = list9;
        this.f8020V = c0925lf;
        this.f8021W = abstractC1092v3;
        this.f8022X = o22;
        this.f8023Y = o23;
        this.f8024Z = list10;
        this.f8026a0 = list11;
        this.f8028b0 = list12;
        this.f8030c0 = list13;
        this.f8032d0 = visibility;
        this.f8034e0 = wf;
        this.f8036f0 = list14;
        this.f8038g0 = width;
    }

    public static /* synthetic */ C1060t7 B(C1060t7 c1060t7, C0839h0 c0839h0, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, C0860i3 c0860i3, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, W5 w5, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, Yb yb, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, C1079u8 c1079u8, Expression expression18, Expression expression19, C0754c5 c0754c5, T7 t7, Expression expression20, Expression expression21, f fVar, C0754c5 c0754c52, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list10, List list11, List list12, List list13, Expression expression28, Wf wf, List list14, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? c1060t7.d() : c0839h0;
        Expression l4 = (i4 & 2) != 0 ? c1060t7.l() : expression;
        Expression s4 = (i4 & 4) != 0 ? c1060t7.s() : expression2;
        Expression v4 = (i4 & 8) != 0 ? c1060t7.v() : expression3;
        List u4 = (i4 & 16) != 0 ? c1060t7.u() : list;
        Expression expression29 = (i4 & 32) != 0 ? c1060t7.f8035f : expression4;
        List background = (i4 & 64) != 0 ? c1060t7.getBackground() : list2;
        C0860i3 w4 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c1060t7.w() : c0860i3;
        Expression e4 = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c1060t7.e() : expression5;
        List a4 = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c1060t7.a() : list3;
        List list15 = (i4 & 1024) != 0 ? c1060t7.f8043k : list4;
        Expression expression30 = (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c1060t7.f8044l : expression6;
        List extensions = (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? c1060t7.getExtensions() : list5;
        C0839h0 c0839h02 = d4;
        List list16 = (i4 & 8192) != 0 ? c1060t7.f8046n : list6;
        W5 x4 = (i4 & 16384) != 0 ? c1060t7.x() : w5;
        Expression expression31 = (i4 & 32768) != 0 ? c1060t7.f8048p : expression7;
        Expression expression32 = (i4 & 65536) != 0 ? c1060t7.f8049q : expression8;
        Expression expression33 = (i4 & 131072) != 0 ? c1060t7.f8050r : expression9;
        Expression expression34 = (i4 & 262144) != 0 ? c1060t7.f8051s : expression10;
        Expression expression35 = (i4 & 524288) != 0 ? c1060t7.f8052t : expression11;
        Expression expression36 = (i4 & 1048576) != 0 ? c1060t7.f8053u : expression12;
        List r4 = (i4 & 2097152) != 0 ? c1060t7.r() : list7;
        Yb height = (i4 & 4194304) != 0 ? c1060t7.getHeight() : yb;
        Expression expression37 = expression36;
        Expression expression38 = (i4 & 8388608) != 0 ? c1060t7.f8056x : expression13;
        Expression expression39 = (i4 & 16777216) != 0 ? c1060t7.f8057y : expression14;
        Expression expression40 = (i4 & 33554432) != 0 ? c1060t7.f8058z : expression15;
        String id = (i4 & 67108864) != 0 ? c1060t7.getId() : str;
        Expression expression41 = expression40;
        Expression expression42 = (i4 & 134217728) != 0 ? c1060t7.f8000B : expression16;
        Expression expression43 = (i4 & 268435456) != 0 ? c1060t7.f8001C : expression17;
        C1079u8 m4 = (i4 & 536870912) != 0 ? c1060t7.m() : c1079u8;
        Expression expression44 = expression43;
        Expression expression45 = (i4 & 1073741824) != 0 ? c1060t7.f8003E : expression18;
        Expression expression46 = (i4 & Integer.MIN_VALUE) != 0 ? c1060t7.f8004F : expression19;
        C0754c5 g4 = (i5 & 1) != 0 ? c1060t7.g() : c0754c5;
        Expression expression47 = expression46;
        T7 t72 = (i5 & 2) != 0 ? c1060t7.f8006H : t7;
        Expression expression48 = (i5 & 4) != 0 ? c1060t7.f8007I : expression20;
        Expression expression49 = (i5 & 8) != 0 ? c1060t7.f8008J : expression21;
        f fVar2 = (i5 & 16) != 0 ? c1060t7.f8009K : fVar;
        return c1060t7.A(c0839h02, l4, s4, v4, u4, expression29, background, w4, e4, a4, list15, expression30, extensions, list16, x4, expression31, expression32, expression33, expression34, expression35, expression37, r4, height, expression38, expression39, expression41, id, expression42, expression44, m4, expression45, expression47, g4, t72, expression48, expression49, fVar2, (i5 & 32) != 0 ? c1060t7.i() : c0754c52, (i5 & 64) != 0 ? c1060t7.n() : expression22, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c1060t7.h() : expression23, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c1060t7.f8013O : expression24, (i5 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c1060t7.k() : list8, (i5 & 1024) != 0 ? c1060t7.f8015Q : expression25, (i5 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c1060t7.f8016R : expression26, (i5 & Base64Utils.IO_BUFFER_SIZE) != 0 ? c1060t7.f8017S : expression27, (i5 & 8192) != 0 ? c1060t7.f8018T : str2, (i5 & 16384) != 0 ? c1060t7.p() : list9, (i5 & 32768) != 0 ? c1060t7.b() : c0925lf, (i5 & 65536) != 0 ? c1060t7.z() : abstractC1092v3, (i5 & 131072) != 0 ? c1060t7.t() : o22, (i5 & 262144) != 0 ? c1060t7.y() : o23, (i5 & 524288) != 0 ? c1060t7.j() : list10, (i5 & 1048576) != 0 ? c1060t7.f8026a0 : list11, (i5 & 2097152) != 0 ? c1060t7.o() : list12, (i5 & 4194304) != 0 ? c1060t7.f() : list13, (i5 & 8388608) != 0 ? c1060t7.getVisibility() : expression28, (i5 & 16777216) != 0 ? c1060t7.q() : wf, (i5 & 33554432) != 0 ? c1060t7.c() : list14, (i5 & 67108864) != 0 ? c1060t7.getWidth() : yb2);
    }

    public final C1060t7 A(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, Expression autocapitalization, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, Expression enterKeyType, List list5, List list6, W5 w5, Expression expression4, Expression fontSize, Expression fontSizeUnit, Expression expression5, Expression fontWeight, Expression expression6, List list7, Yb height, Expression expression7, Expression hintColor, Expression expression8, String str, Expression isEnabled, Expression keyboardType, C1079u8 c1079u8, Expression letterSpacing, Expression expression9, C0754c5 c0754c5, T7 t7, Expression expression10, Expression expression11, f fVar, C0754c5 c0754c52, Expression expression12, Expression expression13, Expression selectAllOnFocus, List list8, Expression textAlignmentHorizontal, Expression textAlignmentVertical, Expression textColor, String textVariable, List list9, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list10, List list11, List list12, List list13, Expression visibility, Wf wf, List list14, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(autocapitalization, "autocapitalization");
        Intrinsics.checkNotNullParameter(enterKeyType, "enterKeyType");
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        Intrinsics.checkNotNullParameter(fontSizeUnit, "fontSizeUnit");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(hintColor, "hintColor");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
        Intrinsics.checkNotNullParameter(letterSpacing, "letterSpacing");
        Intrinsics.checkNotNullParameter(selectAllOnFocus, "selectAllOnFocus");
        Intrinsics.checkNotNullParameter(textAlignmentHorizontal, "textAlignmentHorizontal");
        Intrinsics.checkNotNullParameter(textAlignmentVertical, "textAlignmentVertical");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(textVariable, "textVariable");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new C1060t7(c0839h0, expression, expression2, alpha, list, autocapitalization, list2, c0860i3, expression3, list3, list4, enterKeyType, list5, list6, w5, expression4, fontSize, fontSizeUnit, expression5, fontWeight, expression6, list7, height, expression7, hintColor, expression8, str, isEnabled, keyboardType, c1079u8, letterSpacing, expression9, c0754c5, t7, expression10, expression11, fVar, c0754c52, expression12, expression13, selectAllOnFocus, list8, textAlignmentHorizontal, textAlignmentVertical, textColor, textVariable, list9, c0925lf, abstractC1092v3, o22, o23, list10, list11, list12, list13, visibility, wf, list14, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:487:0x085a, code lost:
    
        if (r9.c() == null) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x07e2, code lost:
    
        if (r9.f() == null) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0796, code lost:
    
        if (r9.o() == null) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x074a, code lost:
    
        if (r9.f8026a0 == null) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0704, code lost:
    
        if (r9.j() == null) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x064f, code lost:
    
        if (r9.p() == null) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x05c3, code lost:
    
        if (r9.k() == null) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0390, code lost:
    
        if (r9.r() == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0298, code lost:
    
        if (r9.f8046n == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0252, code lost:
    
        if (r9.getExtensions() == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x01f8, code lost:
    
        if (r9.f8043k == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x01b2, code lost:
    
        if (r9.a() == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x012a, code lost:
    
        if (r9.getBackground() == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x00d0, code lost:
    
        if (r9.u() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(C1060t7 c1060t7, ExpressionResolver resolver, ExpressionResolver otherResolver) {
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
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c1060t7 == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(c1060t7.d(), resolver, otherResolver) : c1060t7.d() == null) {
            Expression l4 = l();
            EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
            Expression l5 = c1060t7.l();
            if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                Expression s4 = s();
                EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                Expression s5 = c1060t7.s();
                if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                    if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) c1060t7.v().evaluate(otherResolver)).doubleValue()) {
                        List u4 = u();
                        if (u4 != null) {
                            List u5 = c1060t7.u();
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
                        if (z4 && this.f8035f.evaluate(resolver) == c1060t7.f8035f.evaluate(otherResolver)) {
                            List background = getBackground();
                            if (background != null) {
                                List background2 = c1060t7.getBackground();
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
                                if (w4 != null ? w4.a(c1060t7.w(), resolver, otherResolver) : c1060t7.w() == null) {
                                    Expression e4 = e();
                                    Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                    Expression e5 = c1060t7.e();
                                    if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null)) {
                                        List a4 = a();
                                        if (a4 != null) {
                                            List a5 = c1060t7.a();
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
                                            List list = this.f8043k;
                                            if (list != null) {
                                                List list2 = c1060t7.f8043k;
                                                if (list2 != null) {
                                                    if (list.size() == list2.size()) {
                                                        int i10 = 0;
                                                        for (Object obj4 : list) {
                                                            int i11 = i10 + 1;
                                                            if (i10 < 0) {
                                                                CollectionsKt.throwIndexOverflow();
                                                            }
                                                            if (((C0892k0) obj4).a((C0892k0) list2.get(i10), resolver, otherResolver)) {
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
                                            if (z7 && this.f8044l.evaluate(resolver) == c1060t7.f8044l.evaluate(otherResolver)) {
                                                List extensions = getExtensions();
                                                if (extensions != null) {
                                                    List extensions2 = c1060t7.getExtensions();
                                                    if (extensions2 != null) {
                                                        if (extensions.size() == extensions2.size()) {
                                                            int i12 = 0;
                                                            for (Object obj5 : extensions) {
                                                                int i13 = i12 + 1;
                                                                if (i12 < 0) {
                                                                    CollectionsKt.throwIndexOverflow();
                                                                }
                                                                if (((C0933m5) obj5).a((C0933m5) extensions2.get(i12), resolver, otherResolver)) {
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
                                                    List list3 = this.f8046n;
                                                    if (list3 != null) {
                                                        List list4 = c1060t7.f8046n;
                                                        if (list4 != null) {
                                                            if (list3.size() == list4.size()) {
                                                                int i14 = 0;
                                                                for (Object obj6 : list3) {
                                                                    int i15 = i14 + 1;
                                                                    if (i14 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    if (((AbstractC1078u7) obj6).a((AbstractC1078u7) list4.get(i14), resolver, otherResolver)) {
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
                                                        if (x4 != null ? x4.a(c1060t7.x(), resolver, otherResolver) : c1060t7.x() == null) {
                                                            Expression expression = this.f8048p;
                                                            String str = expression != null ? (String) expression.evaluate(resolver) : null;
                                                            Expression expression2 = c1060t7.f8048p;
                                                            if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null) && ((Number) this.f8049q.evaluate(resolver)).longValue() == ((Number) c1060t7.f8049q.evaluate(otherResolver)).longValue() && this.f8050r.evaluate(resolver) == c1060t7.f8050r.evaluate(otherResolver)) {
                                                                Expression expression3 = this.f8051s;
                                                                JSONObject jSONObject = expression3 != null ? (JSONObject) expression3.evaluate(resolver) : null;
                                                                Expression expression4 = c1060t7.f8051s;
                                                                if (Intrinsics.areEqual(jSONObject, expression4 != null ? (JSONObject) expression4.evaluate(otherResolver) : null) && this.f8052t.evaluate(resolver) == c1060t7.f8052t.evaluate(otherResolver)) {
                                                                    Expression expression5 = this.f8053u;
                                                                    Long l7 = expression5 != null ? (Long) expression5.evaluate(resolver) : null;
                                                                    Expression expression6 = c1060t7.f8053u;
                                                                    if (Intrinsics.areEqual(l7, expression6 != null ? (Long) expression6.evaluate(otherResolver) : null)) {
                                                                        List r4 = r();
                                                                        if (r4 != null) {
                                                                            List r5 = c1060t7.r();
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
                                                                        if (z10 && getHeight().a(c1060t7.getHeight(), resolver, otherResolver)) {
                                                                            Expression expression7 = this.f8056x;
                                                                            Integer num = expression7 != null ? (Integer) expression7.evaluate(resolver) : null;
                                                                            Expression expression8 = c1060t7.f8056x;
                                                                            if (Intrinsics.areEqual(num, expression8 != null ? (Integer) expression8.evaluate(otherResolver) : null) && ((Number) this.f8057y.evaluate(resolver)).intValue() == ((Number) c1060t7.f8057y.evaluate(otherResolver)).intValue()) {
                                                                                Expression expression9 = this.f8058z;
                                                                                String str2 = expression9 != null ? (String) expression9.evaluate(resolver) : null;
                                                                                Expression expression10 = c1060t7.f8058z;
                                                                                if (Intrinsics.areEqual(str2, expression10 != null ? (String) expression10.evaluate(otherResolver) : null) && Intrinsics.areEqual(getId(), c1060t7.getId()) && ((Boolean) this.f8000B.evaluate(resolver)).booleanValue() == ((Boolean) c1060t7.f8000B.evaluate(otherResolver)).booleanValue() && this.f8001C.evaluate(resolver) == c1060t7.f8001C.evaluate(otherResolver)) {
                                                                                    C1079u8 m4 = m();
                                                                                    if (m4 != null ? m4.a(c1060t7.m(), resolver, otherResolver) : c1060t7.m() == null) {
                                                                                        if (((Number) this.f8003E.evaluate(resolver)).doubleValue() == ((Number) c1060t7.f8003E.evaluate(otherResolver)).doubleValue()) {
                                                                                            Expression expression11 = this.f8004F;
                                                                                            Long l8 = expression11 != null ? (Long) expression11.evaluate(resolver) : null;
                                                                                            Expression expression12 = c1060t7.f8004F;
                                                                                            if (Intrinsics.areEqual(l8, expression12 != null ? (Long) expression12.evaluate(otherResolver) : null)) {
                                                                                                C0754c5 g4 = g();
                                                                                                if (g4 != null ? g4.a(c1060t7.g(), resolver, otherResolver) : c1060t7.g() == null) {
                                                                                                    T7 t7 = this.f8006H;
                                                                                                    if (t7 != null ? t7.a(c1060t7.f8006H, resolver, otherResolver) : c1060t7.f8006H == null) {
                                                                                                        Expression expression13 = this.f8007I;
                                                                                                        Long l9 = expression13 != null ? (Long) expression13.evaluate(resolver) : null;
                                                                                                        Expression expression14 = c1060t7.f8007I;
                                                                                                        if (Intrinsics.areEqual(l9, expression14 != null ? (Long) expression14.evaluate(otherResolver) : null)) {
                                                                                                            Expression expression15 = this.f8008J;
                                                                                                            Long l10 = expression15 != null ? (Long) expression15.evaluate(resolver) : null;
                                                                                                            Expression expression16 = c1060t7.f8008J;
                                                                                                            if (Intrinsics.areEqual(l10, expression16 != null ? (Long) expression16.evaluate(otherResolver) : null)) {
                                                                                                                f fVar = this.f8009K;
                                                                                                                if (fVar != null ? fVar.a(c1060t7.f8009K, resolver, otherResolver) : c1060t7.f8009K == null) {
                                                                                                                    C0754c5 i18 = i();
                                                                                                                    if (i18 != null ? i18.a(c1060t7.i(), resolver, otherResolver) : c1060t7.i() == null) {
                                                                                                                        Expression n4 = n();
                                                                                                                        String str3 = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                                                                        Expression n5 = c1060t7.n();
                                                                                                                        if (Intrinsics.areEqual(str3, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                                                                            Expression h4 = h();
                                                                                                                            Long l11 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                                                                            Expression h5 = c1060t7.h();
                                                                                                                            if (Intrinsics.areEqual(l11, h5 != null ? (Long) h5.evaluate(otherResolver) : null) && ((Boolean) this.f8013O.evaluate(resolver)).booleanValue() == ((Boolean) c1060t7.f8013O.evaluate(otherResolver)).booleanValue()) {
                                                                                                                                List k4 = k();
                                                                                                                                if (k4 != null) {
                                                                                                                                    List k5 = c1060t7.k();
                                                                                                                                    if (k5 != null) {
                                                                                                                                        if (k4.size() == k5.size()) {
                                                                                                                                            int i19 = 0;
                                                                                                                                            for (Object obj8 : k4) {
                                                                                                                                                int i20 = i19 + 1;
                                                                                                                                                if (i19 < 0) {
                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                }
                                                                                                                                                if (((C0892k0) obj8).a((C0892k0) k5.get(i19), resolver, otherResolver)) {
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
                                                                                                                                if (z11 && this.f8015Q.evaluate(resolver) == c1060t7.f8015Q.evaluate(otherResolver) && this.f8016R.evaluate(resolver) == c1060t7.f8016R.evaluate(otherResolver) && ((Number) this.f8017S.evaluate(resolver)).intValue() == ((Number) c1060t7.f8017S.evaluate(otherResolver)).intValue() && Intrinsics.areEqual(this.f8018T, c1060t7.f8018T)) {
                                                                                                                                    List p4 = p();
                                                                                                                                    if (p4 != null) {
                                                                                                                                        List p5 = c1060t7.p();
                                                                                                                                        if (p5 != null) {
                                                                                                                                            if (p4.size() == p5.size()) {
                                                                                                                                                int i21 = 0;
                                                                                                                                                for (Object obj9 : p4) {
                                                                                                                                                    int i22 = i21 + 1;
                                                                                                                                                    if (i21 < 0) {
                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                    }
                                                                                                                                                    if (((Se) obj9).a((Se) p5.get(i21), resolver, otherResolver)) {
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
                                                                                                                                        C0925lf b4 = b();
                                                                                                                                        if (b4 != null ? b4.a(c1060t7.b(), resolver, otherResolver) : c1060t7.b() == null) {
                                                                                                                                            AbstractC1092v3 z18 = z();
                                                                                                                                            if (z18 != null ? z18.a(c1060t7.z(), resolver, otherResolver) : c1060t7.z() == null) {
                                                                                                                                                O2 t4 = t();
                                                                                                                                                if (t4 != null ? t4.a(c1060t7.t(), resolver, otherResolver) : c1060t7.t() == null) {
                                                                                                                                                    O2 y4 = y();
                                                                                                                                                    if (y4 != null ? y4.a(c1060t7.y(), resolver, otherResolver) : c1060t7.y() == null) {
                                                                                                                                                        List j4 = j();
                                                                                                                                                        if (j4 != null) {
                                                                                                                                                            List j5 = c1060t7.j();
                                                                                                                                                            if (j5 != null) {
                                                                                                                                                                if (j4.size() == j5.size()) {
                                                                                                                                                                    int i23 = 0;
                                                                                                                                                                    for (Object obj10 : j4) {
                                                                                                                                                                        int i24 = i23 + 1;
                                                                                                                                                                        if (i23 < 0) {
                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                        }
                                                                                                                                                                        if (((EnumC0997pf) obj10) == ((EnumC0997pf) j5.get(i23))) {
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
                                                                                                                                                            List list5 = this.f8026a0;
                                                                                                                                                            if (list5 != null) {
                                                                                                                                                                List list6 = c1060t7.f8026a0;
                                                                                                                                                                if (list6 != null) {
                                                                                                                                                                    if (list5.size() == list6.size()) {
                                                                                                                                                                        int i25 = 0;
                                                                                                                                                                        for (Object obj11 : list5) {
                                                                                                                                                                            int i26 = i25 + 1;
                                                                                                                                                                            if (i25 < 0) {
                                                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                                                            }
                                                                                                                                                                            if (((AbstractC0775d8) obj11).a((AbstractC0775d8) list6.get(i25), resolver, otherResolver)) {
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
                                                                                                                                                                List o4 = o();
                                                                                                                                                                if (o4 != null) {
                                                                                                                                                                    List o5 = c1060t7.o();
                                                                                                                                                                    if (o5 != null) {
                                                                                                                                                                        if (o4.size() == o5.size()) {
                                                                                                                                                                            int i27 = 0;
                                                                                                                                                                            for (Object obj12 : o4) {
                                                                                                                                                                                int i28 = i27 + 1;
                                                                                                                                                                                if (i27 < 0) {
                                                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                }
                                                                                                                                                                                if (((C1015qf) obj12).a((C1015qf) o5.get(i27), resolver, otherResolver)) {
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
                                                                                                                                                                    List f4 = f();
                                                                                                                                                                    if (f4 != null) {
                                                                                                                                                                        List f5 = c1060t7.f();
                                                                                                                                                                        if (f5 != null) {
                                                                                                                                                                            if (f4.size() == f5.size()) {
                                                                                                                                                                                int i29 = 0;
                                                                                                                                                                                for (Object obj13 : f4) {
                                                                                                                                                                                    int i30 = i29 + 1;
                                                                                                                                                                                    if (i29 < 0) {
                                                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                    }
                                                                                                                                                                                    if (((AbstractC1176zf) obj13).a((AbstractC1176zf) f5.get(i29), resolver, otherResolver)) {
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
                                                                                                                                                                    if (z16 && getVisibility().evaluate(resolver) == c1060t7.getVisibility().evaluate(otherResolver)) {
                                                                                                                                                                        Wf q4 = q();
                                                                                                                                                                        if (q4 != null ? q4.h(c1060t7.q(), resolver, otherResolver) : c1060t7.q() == null) {
                                                                                                                                                                            List c4 = c();
                                                                                                                                                                            if (c4 != null) {
                                                                                                                                                                                List c5 = c1060t7.c();
                                                                                                                                                                                if (c5 != null) {
                                                                                                                                                                                    if (c4.size() == c5.size()) {
                                                                                                                                                                                        int i31 = 0;
                                                                                                                                                                                        for (Object obj14 : c4) {
                                                                                                                                                                                            int i32 = i31 + 1;
                                                                                                                                                                                            if (i31 < 0) {
                                                                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                            }
                                                                                                                                                                                            if (((Wf) obj14).h((Wf) c5.get(i31), resolver, otherResolver)) {
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
                                                                                                                                                                            if (z17 && getWidth().a(c1060t7.getWidth(), resolver, otherResolver)) {
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
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // O1.InterfaceC0752c3
    public List a() {
        return this.f8042j;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f8020V;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f8036f0;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f8025a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f8041i;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f8030c0;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f8005G;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f8037g;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f8045m;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f8055w;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f7999A;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f8032d0;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f8038g0;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f8012N;
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
        Integer num = this.f8040h0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1060t7.class).hashCode();
        C0839h0 d4 = d();
        int i16 = 0;
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
        int hashCode4 = hashCode3 + i4 + this.f8035f.hashCode();
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
        int i17 = hashCode4 + i5;
        C0860i3 w4 = w();
        int hash2 = i17 + (w4 != null ? w4.hash() : 0);
        Expression e4 = e();
        int hashCode5 = hash2 + (e4 != null ? e4.hashCode() : 0);
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
        int i18 = hashCode5 + i6;
        List list = this.f8043k;
        if (list != null) {
            Iterator it4 = list.iterator();
            i7 = 0;
            while (it4.hasNext()) {
                i7 += ((C0892k0) it4.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int hashCode6 = i18 + i7 + this.f8044l.hashCode();
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it5 = extensions.iterator();
            i8 = 0;
            while (it5.hasNext()) {
                i8 += ((C0933m5) it5.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i19 = hashCode6 + i8;
        List list2 = this.f8046n;
        if (list2 != null) {
            Iterator it6 = list2.iterator();
            i9 = 0;
            while (it6.hasNext()) {
                i9 += ((AbstractC1078u7) it6.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i20 = i19 + i9;
        W5 x4 = x();
        int hash3 = i20 + (x4 != null ? x4.hash() : 0);
        Expression expression = this.f8048p;
        int hashCode7 = hash3 + (expression != null ? expression.hashCode() : 0) + this.f8049q.hashCode() + this.f8050r.hashCode();
        Expression expression2 = this.f8051s;
        int hashCode8 = hashCode7 + (expression2 != null ? expression2.hashCode() : 0) + this.f8052t.hashCode();
        Expression expression3 = this.f8053u;
        int hashCode9 = hashCode8 + (expression3 != null ? expression3.hashCode() : 0);
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
        int hash4 = hashCode9 + i10 + getHeight().hash();
        Expression expression4 = this.f8056x;
        int hashCode10 = hash4 + (expression4 != null ? expression4.hashCode() : 0) + this.f8057y.hashCode();
        Expression expression5 = this.f8058z;
        int hashCode11 = hashCode10 + (expression5 != null ? expression5.hashCode() : 0);
        String id = getId();
        int hashCode12 = hashCode11 + (id != null ? id.hashCode() : 0) + this.f8000B.hashCode() + this.f8001C.hashCode();
        C1079u8 m4 = m();
        int hash5 = hashCode12 + (m4 != null ? m4.hash() : 0) + this.f8003E.hashCode();
        Expression expression6 = this.f8004F;
        int hashCode13 = hash5 + (expression6 != null ? expression6.hashCode() : 0);
        C0754c5 g4 = g();
        int hash6 = hashCode13 + (g4 != null ? g4.hash() : 0);
        T7 t7 = this.f8006H;
        int hash7 = hash6 + (t7 != null ? t7.hash() : 0);
        Expression expression7 = this.f8007I;
        int hashCode14 = hash7 + (expression7 != null ? expression7.hashCode() : 0);
        Expression expression8 = this.f8008J;
        int hashCode15 = hashCode14 + (expression8 != null ? expression8.hashCode() : 0);
        f fVar = this.f8009K;
        int hash8 = hashCode15 + (fVar != null ? fVar.hash() : 0);
        C0754c5 i21 = i();
        int hash9 = hash8 + (i21 != null ? i21.hash() : 0);
        Expression n4 = n();
        int hashCode16 = hash9 + (n4 != null ? n4.hashCode() : 0);
        Expression h4 = h();
        int hashCode17 = hashCode16 + (h4 != null ? h4.hashCode() : 0) + this.f8013O.hashCode();
        List k4 = k();
        if (k4 != null) {
            Iterator it8 = k4.iterator();
            i11 = 0;
            while (it8.hasNext()) {
                i11 += ((C0892k0) it8.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int hashCode18 = hashCode17 + i11 + this.f8015Q.hashCode() + this.f8016R.hashCode() + this.f8017S.hashCode() + this.f8018T.hashCode();
        List p4 = p();
        if (p4 != null) {
            Iterator it9 = p4.iterator();
            i12 = 0;
            while (it9.hasNext()) {
                i12 += ((Se) it9.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i22 = hashCode18 + i12;
        C0925lf b4 = b();
        int hash10 = i22 + (b4 != null ? b4.hash() : 0);
        AbstractC1092v3 z4 = z();
        int hash11 = hash10 + (z4 != null ? z4.hash() : 0);
        O2 t4 = t();
        int hash12 = hash11 + (t4 != null ? t4.hash() : 0);
        O2 y4 = y();
        int hash13 = hash12 + (y4 != null ? y4.hash() : 0);
        List j4 = j();
        int hashCode19 = hash13 + (j4 != null ? j4.hashCode() : 0);
        List list3 = this.f8026a0;
        if (list3 != null) {
            Iterator it10 = list3.iterator();
            i13 = 0;
            while (it10.hasNext()) {
                i13 += ((AbstractC0775d8) it10.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i23 = hashCode19 + i13;
        List o4 = o();
        if (o4 != null) {
            Iterator it11 = o4.iterator();
            i14 = 0;
            while (it11.hasNext()) {
                i14 += ((C1015qf) it11.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i24 = i23 + i14;
        List f4 = f();
        if (f4 != null) {
            Iterator it12 = f4.iterator();
            i15 = 0;
            while (it12.hasNext()) {
                i15 += ((AbstractC1176zf) it12.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int hashCode20 = i24 + i15 + getVisibility().hashCode();
        Wf q4 = q();
        int hash14 = hashCode20 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it13 = c4.iterator();
            while (it13.hasNext()) {
                i16 += ((Wf) it13.next()).hash();
            }
        }
        int hash15 = hash14 + i16 + getWidth().hash();
        this.f8040h0 = Integer.valueOf(hash15);
        return hash15;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f8010L;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f8024Z;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f8014P;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f8027b;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f8002D;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f8011M;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f8028b0;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f8019U;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f8034e0;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f8054v;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f8029c;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f8022X;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f8033e;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f8031d;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f8039h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((S7.l) BuiltInParserKt.getBuiltInParserComponent().p4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f8047o;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f8023Y;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f8021W;
    }
}
