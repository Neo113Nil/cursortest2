package O1;

import O1.C1060t7;
import O1.Yb;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class S7 {

    /* renamed from: A, reason: collision with root package name */
    public static final TypeHelper f4733A;

    /* renamed from: B, reason: collision with root package name */
    public static final TypeHelper f4734B;

    /* renamed from: C, reason: collision with root package name */
    public static final ValueValidator f4735C;

    /* renamed from: D, reason: collision with root package name */
    public static final ValueValidator f4736D;

    /* renamed from: E, reason: collision with root package name */
    public static final ValueValidator f4737E;

    /* renamed from: F, reason: collision with root package name */
    public static final ValueValidator f4738F;

    /* renamed from: G, reason: collision with root package name */
    public static final ValueValidator f4739G;

    /* renamed from: H, reason: collision with root package name */
    public static final ValueValidator f4740H;

    /* renamed from: I, reason: collision with root package name */
    public static final ValueValidator f4741I;

    /* renamed from: J, reason: collision with root package name */
    public static final ValueValidator f4742J;

    /* renamed from: K, reason: collision with root package name */
    public static final ListValidator f4743K;

    /* renamed from: a, reason: collision with root package name */
    private static final k f4744a = new k(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f4745b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f4746c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f4747d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f4748e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f4749f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f4750g;

    /* renamed from: h, reason: collision with root package name */
    public static final Yb.e f4751h;

    /* renamed from: i, reason: collision with root package name */
    public static final Expression f4752i;

    /* renamed from: j, reason: collision with root package name */
    public static final Expression f4753j;

    /* renamed from: k, reason: collision with root package name */
    public static final Expression f4754k;

    /* renamed from: l, reason: collision with root package name */
    public static final Expression f4755l;

    /* renamed from: m, reason: collision with root package name */
    public static final Expression f4756m;

    /* renamed from: n, reason: collision with root package name */
    public static final Expression f4757n;

    /* renamed from: o, reason: collision with root package name */
    public static final Expression f4758o;

    /* renamed from: p, reason: collision with root package name */
    public static final Expression f4759p;

    /* renamed from: q, reason: collision with root package name */
    public static final Expression f4760q;

    /* renamed from: r, reason: collision with root package name */
    public static final Yb.d f4761r;

    /* renamed from: s, reason: collision with root package name */
    public static final TypeHelper f4762s;

    /* renamed from: t, reason: collision with root package name */
    public static final TypeHelper f4763t;

    /* renamed from: u, reason: collision with root package name */
    public static final TypeHelper f4764u;

    /* renamed from: v, reason: collision with root package name */
    public static final TypeHelper f4765v;

    /* renamed from: w, reason: collision with root package name */
    public static final TypeHelper f4766w;

    /* renamed from: x, reason: collision with root package name */
    public static final TypeHelper f4767x;

    /* renamed from: y, reason: collision with root package name */
    public static final TypeHelper f4768y;

    /* renamed from: z, reason: collision with root package name */
    public static final TypeHelper f4769z;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4770i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f4771i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f4772i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C1060t7.a);
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f4773i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C1060t7.d);
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final e f4774i = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0779dc);
        }
    }

    static final class f extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final f f4775i = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0791e6);
        }
    }

    static final class g extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final g f4776i = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C1060t7.e);
        }
    }

    static final class h extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final h f4777i = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    static final class i extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final i f4778i = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    static final class j extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final j f4779i = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    private static final class k {
        public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private k() {
        }
    }

    public static final class l implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4780a;

        public l(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4780a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1060t7 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f4780a.H());
            TypeHelper typeHelper = S7.f4762s;
            Function1 function1 = EnumC1091v2.f8195e;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = S7.f4763t;
            Function1 function12 = EnumC1109w2.f8300e;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = S7.f4735C;
            Expression expression = S7.f4745b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper3, function13, valueValidator, expression);
            Expression expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f4780a.q1());
            TypeHelper typeHelper4 = S7.f4764u;
            Function1 function14 = C1060t7.a.f8061e;
            Expression expression3 = S7.f4746c;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "autocapitalization", typeHelper4, function14, expression3);
            Expression expression4 = readOptionalExpression4 == null ? expression3 : readOptionalExpression4;
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f4780a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f4780a.I1());
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper5, function15, S7.f4736D);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f4780a.M2());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "enter_key_actions", this.f4780a.u0());
            TypeHelper typeHelper6 = S7.f4765v;
            Function1 function16 = C1060t7.d.f8074e;
            Expression expression5 = S7.f4747d;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "enter_key_type", typeHelper6, function16, expression5);
            Expression expression6 = readOptionalExpression6 == null ? expression5 : readOptionalExpression6;
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f4780a.Y2());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "filters", this.f4780a.j4());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f4780a.w3());
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "font_family", typeHelper7);
            ValueValidator valueValidator2 = S7.f4737E;
            Expression expression7 = S7.f4748e;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "font_size", typeHelper5, function15, valueValidator2, expression7);
            if (readOptionalExpression8 != null) {
                expression7 = readOptionalExpression8;
            }
            TypeHelper typeHelper8 = S7.f4766w;
            Function1 function17 = EnumC0779dc.f6047e;
            Expression expression8 = S7.f4749f;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "font_size_unit", typeHelper8, function17, expression8);
            Expression expression9 = readOptionalExpression9 == null ? expression8 : readOptionalExpression9;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            TypeHelper typeHelper9 = S7.f4767x;
            Function1 function18 = EnumC0791e6.f6079e;
            Expression expression10 = S7.f4750g;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "font_weight", typeHelper9, function18, expression10);
            Expression expression11 = readOptionalExpression11 == null ? expression10 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "font_weight_value", typeHelper5, function15, S7.f4738F);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f4780a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f4780a.V6());
            if (yb == null) {
                yb = S7.f4751h;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            TypeHelper<Integer> typeHelper10 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function19 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "highlight_color", typeHelper10, function19);
            Expression expression12 = S7.f4752i;
            Yb yb2 = yb;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(context, data, "hint_color", typeHelper10, function19, expression12);
            Expression expression13 = readOptionalExpression14 == null ? expression12 : readOptionalExpression14;
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(context, data, "hint_text", typeHelper7);
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            TypeHelper<Boolean> typeHelper11 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function110 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression14 = S7.f4753j;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(context, data, "is_enabled", typeHelper11, function110, expression14);
            Expression expression15 = readOptionalExpression16 == null ? expression14 : readOptionalExpression16;
            TypeHelper typeHelper12 = S7.f4768y;
            Function1 function111 = C1060t7.e.f8086e;
            Expression expression16 = S7.f4754k;
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(context, data, "keyboard_type", typeHelper12, function111, expression16);
            Expression expression17 = readOptionalExpression17 == null ? expression16 : readOptionalExpression17;
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f4780a.M4());
            Expression expression18 = S7.f4755l;
            Expression readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(context, data, "letter_spacing", typeHelper3, function13, expression18);
            Expression expression19 = readOptionalExpression18 == null ? expression18 : readOptionalExpression18;
            Expression readOptionalExpression19 = JsonExpressionParser.readOptionalExpression(context, data, "line_height", typeHelper5, function15, S7.f4739G);
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f4780a.V2());
            T7 t7 = (T7) JsonPropertyParser.readOptional(context, data, "mask", this.f4780a.s4());
            Expression readOptionalExpression20 = JsonExpressionParser.readOptionalExpression(context, data, "max_length", typeHelper5, function15, S7.f4740H);
            Expression readOptionalExpression21 = JsonExpressionParser.readOptionalExpression(context, data, "max_visible_lines", typeHelper5, function15, S7.f4741I);
            C1060t7.f fVar = (C1060t7.f) JsonPropertyParser.readOptional(context, data, "native_interface", this.f4780a.v4());
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f4780a.V2());
            Expression readOptionalExpression22 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", typeHelper7);
            Expression readOptionalExpression23 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper5, function15, S7.f4742J);
            Expression expression20 = S7.f4756m;
            Expression readOptionalExpression24 = JsonExpressionParser.readOptionalExpression(context, data, "select_all_on_focus", typeHelper11, function110, expression20);
            Expression expression21 = readOptionalExpression24 == null ? expression20 : readOptionalExpression24;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f4780a.u0());
            TypeHelper typeHelper13 = S7.f4769z;
            Expression expression22 = S7.f4757n;
            Expression readOptionalExpression25 = JsonExpressionParser.readOptionalExpression(context, data, "text_alignment_horizontal", typeHelper13, function1, expression22);
            Expression expression23 = readOptionalExpression25 == null ? expression22 : readOptionalExpression25;
            TypeHelper typeHelper14 = S7.f4733A;
            Expression expression24 = S7.f4758o;
            Expression readOptionalExpression26 = JsonExpressionParser.readOptionalExpression(context, data, "text_alignment_vertical", typeHelper14, function12, expression24);
            Expression expression25 = readOptionalExpression26 == null ? expression24 : readOptionalExpression26;
            Expression expression26 = S7.f4759p;
            Expression readOptionalExpression27 = JsonExpressionParser.readOptionalExpression(context, data, "text_color", typeHelper10, function19, expression26);
            Expression expression27 = readOptionalExpression27 == null ? expression26 : readOptionalExpression27;
            Object read = JsonPropertyParser.read(context, data, "text_variable");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"text_variable\")");
            String str2 = (String) read;
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f4780a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f4780a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f4780a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f4780a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f4780a.w1());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, S7.f4743K);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "validators", this.f4780a.D4());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f4780a.Y8());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f4780a.e9());
            TypeHelper typeHelper15 = S7.f4734B;
            Function1 function112 = Vf.f5043e;
            Expression expression28 = S7.f4760q;
            Expression readOptionalExpression28 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper15, function112, expression28);
            if (readOptionalExpression28 != null) {
                expression28 = readOptionalExpression28;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f4780a.q9());
            List readOptionalList14 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f4780a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f4780a.V6());
            if (yb3 == null) {
                yb3 = S7.f4761r;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1060t7(c0839h0, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList, expression4, readOptionalList2, c0860i3, readOptionalExpression5, readOptionalList3, readOptionalList4, expression6, readOptionalList5, readOptionalList6, w5, readOptionalExpression7, expression7, expression9, readOptionalExpression10, expression11, readOptionalExpression12, readOptionalList7, yb2, readOptionalExpression13, expression13, readOptionalExpression15, str, expression15, expression17, c1079u8, expression19, readOptionalExpression19, c0754c5, t7, readOptionalExpression20, readOptionalExpression21, fVar, c0754c52, readOptionalExpression22, readOptionalExpression23, expression21, readOptionalList8, expression23, expression25, expression27, str2, readOptionalList9, c0925lf, abstractC1092v3, o22, o23, readOptionalList10, readOptionalList11, readOptionalList12, readOptionalList13, expression28, wf, readOptionalList14, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1060t7 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f4780a.H());
            Expression l4 = value.l();
            Function1 function1 = EnumC1091v2.f8194d;
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", l4, function1);
            Expression s4 = value.s();
            Function1 function12 = EnumC1109w2.f8299d;
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", s4, function12);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f4780a.q1());
            JsonExpressionParser.writeExpression(context, jSONObject, "autocapitalization", value.f8035f, C1060t7.a.f8060d);
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f4780a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f4780a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f4780a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "enter_key_actions", value.f8043k, this.f4780a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "enter_key_type", value.f8044l, C1060t7.d.f8073d);
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f4780a.Y2());
            JsonPropertyParser.writeList(context, jSONObject, "filters", value.f8046n, this.f4780a.j4());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f4780a.w3());
            JsonExpressionParser.writeExpression(context, jSONObject, "font_family", value.f8048p);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size", value.f8049q);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size_unit", value.f8050r, EnumC0779dc.f6046d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_variation_settings", value.f8051s);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_weight", value.f8052t, EnumC0791e6.f6078d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_weight_value", value.f8053u);
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f4780a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f4780a.V6());
            Expression expression = value.f8056x;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(context, jSONObject, "highlight_color", expression, function13);
            JsonExpressionParser.writeExpression(context, jSONObject, "hint_color", value.f8057y, function13);
            JsonExpressionParser.writeExpression(context, jSONObject, "hint_text", value.f8058z);
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonExpressionParser.writeExpression(context, jSONObject, "is_enabled", value.f8000B);
            JsonExpressionParser.writeExpression(context, jSONObject, "keyboard_type", value.f8001C, C1060t7.e.f8085d);
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f4780a.M4());
            JsonExpressionParser.writeExpression(context, jSONObject, "letter_spacing", value.f8003E);
            JsonExpressionParser.writeExpression(context, jSONObject, "line_height", value.f8004F);
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f4780a.V2());
            JsonPropertyParser.write(context, jSONObject, "mask", value.f8006H, this.f4780a.s4());
            JsonExpressionParser.writeExpression(context, jSONObject, "max_length", value.f8007I);
            JsonExpressionParser.writeExpression(context, jSONObject, "max_visible_lines", value.f8008J);
            JsonPropertyParser.write(context, jSONObject, "native_interface", value.f8009K, this.f4780a.v4());
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f4780a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonExpressionParser.writeExpression(context, jSONObject, "select_all_on_focus", value.f8013O);
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f4780a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "text_alignment_horizontal", value.f8015Q, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "text_alignment_vertical", value.f8016R, function12);
            JsonExpressionParser.writeExpression(context, jSONObject, "text_color", value.f8017S, function13);
            JsonPropertyParser.write(context, jSONObject, "text_variable", value.f8018T);
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f4780a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f4780a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f4780a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f4780a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f4780a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "input");
            JsonPropertyParser.writeList(context, jSONObject, "validators", value.f8026a0, this.f4780a.D4());
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f4780a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f4780a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f4780a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f4780a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f4780a.V6());
            return jSONObject;
        }
    }

    public static final class m implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4781a;

        public m(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4781a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0757c8 deserialize(ParsingContext context, C0757c8 c0757c8, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, c0757c8 != null ? c0757c8.f5906a : null, this.f4781a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            TypeHelper typeHelper = S7.f4762s;
            Field field = c0757c8 != null ? c0757c8.f5908b : null;
            Function1 function1 = EnumC1091v2.f8195e;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            TypeHelper typeHelper2 = S7.f4763t;
            Field field2 = c0757c8 != null ? c0757c8.f5910c : null;
            Function1 function12 = EnumC1109w2.f8300e;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field3 = c0757c8 != null ? c0757c8.f5912d : null;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", typeHelper3, allowPropertyOverride, field3, function13, S7.f4735C);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, c0757c8 != null ? c0757c8.f5914e : null, this.f4781a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "autocapitalization", S7.f4764u, allowPropertyOverride, c0757c8 != null ? c0757c8.f5916f : null, C1060t7.a.f8061e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…pitalization.FROM_STRING)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, c0757c8 != null ? c0757c8.f5918g : null, this.f4781a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, c0757c8 != null ? c0757c8.f5920h : null, this.f4781a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field4 = c0757c8 != null ? c0757c8.f5921i : null;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper4, allowPropertyOverride, field4, function14, S7.f4736D);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, c0757c8 != null ? c0757c8.f5922j : null, this.f4781a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "enter_key_actions", allowPropertyOverride, c0757c8 != null ? c0757c8.f5923k : null, this.f4781a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "enter_key_type", S7.f4765v, allowPropertyOverride, c0757c8 != null ? c0757c8.f5924l : null, C1060t7.d.f8074e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…EnterKeyType.FROM_STRING)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, c0757c8 != null ? c0757c8.f5925m : null, this.f4781a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "filters", allowPropertyOverride, c0757c8 != null ? c0757c8.f5926n : null, this.f4781a.k4());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…FilterJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, c0757c8 != null ? c0757c8.f5927o : null, this.f4781a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…vFocusJsonTemplateParser)");
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_family", typeHelper5, allowPropertyOverride, c0757c8 != null ? c0757c8.f5928p : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…ride, parent?.fontFamily)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size", typeHelper4, allowPropertyOverride, c0757c8 != null ? c0757c8.f5929q : null, function14, S7.f4737E);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…INT, FONT_SIZE_VALIDATOR)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size_unit", S7.f4766w, allowPropertyOverride, c0757c8 != null ? c0757c8.f5930r : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, c0757c8 != null ? c0757c8.f5931s : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…t?.fontVariationSettings)");
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_weight", S7.f4767x, allowPropertyOverride, c0757c8 != null ? c0757c8.f5932t : null, EnumC0791e6.f6079e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…ivFontWeight.FROM_STRING)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_weight_value", typeHelper4, allowPropertyOverride, c0757c8 != null ? c0757c8.f5933u : null, function14, S7.f4738F);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…T_WEIGHT_VALUE_VALIDATOR)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, c0757c8 != null ? c0757c8.f5934v : null, this.f4781a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, c0757c8 != null ? c0757c8.f5935w : null, this.f4781a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field5 = c0757c8 != null ? c0757c8.f5936x : null;
            Function1<Object, Integer> function15 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "highlight_color", typeHelper6, allowPropertyOverride, field5, function15);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "hint_color", typeHelper6, allowPropertyOverride, c0757c8 != null ? c0757c8.f5937y : null, function15);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression14, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "hint_text", typeHelper5, allowPropertyOverride, c0757c8 != null ? c0757c8.f5938z : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression15, "readOptionalFieldWithExp…erride, parent?.hintText)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, c0757c8 != null ? c0757c8.f5880A : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…llowOverride, parent?.id)");
            TypeHelper<Boolean> typeHelper7 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field6 = c0757c8 != null ? c0757c8.f5881B : null;
            Function1<Object, Boolean> function16 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "is_enabled", typeHelper7, allowPropertyOverride, field6, function16);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression16, "readOptionalFieldWithExp…sEnabled, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "keyboard_type", S7.f4768y, allowPropertyOverride, c0757c8 != null ? c0757c8.f5882C : null, C1060t7.e.f8086e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression17, "readOptionalFieldWithExp…KeyboardType.FROM_STRING)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, c0757c8 != null ? c0757c8.f5883D : null, this.f4781a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "letter_spacing", typeHelper3, allowPropertyOverride, c0757c8 != null ? c0757c8.f5884E : null, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression18, "readOptionalFieldWithExp…pacing, NUMBER_TO_DOUBLE)");
            Field readOptionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "line_height", typeHelper4, allowPropertyOverride, c0757c8 != null ? c0757c8.f5885F : null, function14, S7.f4739G);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression19, "readOptionalFieldWithExp…T, LINE_HEIGHT_VALIDATOR)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, c0757c8 != null ? c0757c8.f5886G : null, this.f4781a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "mask", allowPropertyOverride, c0757c8 != null ? c0757c8.f5887H : null, this.f4781a.t4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…utMaskJsonTemplateParser)");
            Field readOptionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "max_length", typeHelper4, allowPropertyOverride, c0757c8 != null ? c0757c8.f5888I : null, function14, S7.f4740H);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression20, "readOptionalFieldWithExp…NT, MAX_LENGTH_VALIDATOR)");
            Field readOptionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "max_visible_lines", typeHelper4, allowPropertyOverride, c0757c8 != null ? c0757c8.f5889J : null, function14, S7.f4741I);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression21, "readOptionalFieldWithExp…_VISIBLE_LINES_VALIDATOR)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "native_interface", allowPropertyOverride, c0757c8 != null ? c0757c8.f5890K : null, this.f4781a.w4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…erfaceJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, c0757c8 != null ? c0757c8.f5891L : null, this.f4781a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", typeHelper5, allowPropertyOverride, c0757c8 != null ? c0757c8.f5892M : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression22, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper4, allowPropertyOverride, c0757c8 != null ? c0757c8.f5893N : null, function14, S7.f4742J);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression23, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "select_all_on_focus", typeHelper7, allowPropertyOverride, c0757c8 != null ? c0757c8.f5894O : null, function16);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression24, "readOptionalFieldWithExp…lOnFocus, ANY_TO_BOOLEAN)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, c0757c8 != null ? c0757c8.f5895P : null, this.f4781a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "text_alignment_horizontal", S7.f4769z, allowPropertyOverride, c0757c8 != null ? c0757c8.f5896Q : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression25, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "text_alignment_vertical", S7.f4733A, allowPropertyOverride, c0757c8 != null ? c0757c8.f5897R : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression26, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression27 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "text_color", typeHelper6, allowPropertyOverride, c0757c8 != null ? c0757c8.f5898S : null, function15);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression27, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "text_variable", allowPropertyOverride, c0757c8 != null ? c0757c8.f5899T : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…de, parent?.textVariable)");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, c0757c8 != null ? c0757c8.f5900U : null, this.f4781a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, c0757c8 != null ? c0757c8.f5901V : null, this.f4781a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, c0757c8 != null ? c0757c8.f5902W : null, this.f4781a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, c0757c8 != null ? c0757c8.f5903X : null, this.f4781a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, c0757c8 != null ? c0757c8.f5904Y : null, this.f4781a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field7 = c0757c8 != null ? c0757c8.f5905Z : null;
            Function1 function17 = EnumC0997pf.f7541e;
            ListValidator listValidator = S7.f4743K;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field7, function17, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "validators", allowPropertyOverride, c0757c8 != null ? c0757c8.f5907a0 : null, this.f4781a.E4());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…idatorJsonTemplateParser)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, c0757c8 != null ? c0757c8.f5909b0 : null, this.f4781a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, c0757c8 != null ? c0757c8.f5911c0 : null, this.f4781a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField13, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression28 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", S7.f4734B, allowPropertyOverride, c0757c8 != null ? c0757c8.f5913d0 : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression28, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, c0757c8 != null ? c0757c8.f5915e0 : null, this.f4781a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, c0757c8 != null ? c0757c8.f5917f0 : null, this.f4781a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField14, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, c0757c8 != null ? c0757c8.f5919g0 : null, this.f4781a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new C0757c8(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalFieldWithExpression4, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression5, readOptionalListField3, readOptionalListField4, readOptionalFieldWithExpression6, readOptionalListField5, readOptionalListField6, readOptionalField3, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalListField7, readOptionalField4, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalFieldWithExpression15, readOptionalField5, readOptionalFieldWithExpression16, readOptionalFieldWithExpression17, readOptionalField6, readOptionalFieldWithExpression18, readOptionalFieldWithExpression19, readOptionalField7, readOptionalField8, readOptionalFieldWithExpression20, readOptionalFieldWithExpression21, readOptionalField9, readOptionalField10, readOptionalFieldWithExpression22, readOptionalFieldWithExpression23, readOptionalFieldWithExpression24, readOptionalListField8, readOptionalFieldWithExpression25, readOptionalFieldWithExpression26, readOptionalFieldWithExpression27, readField, readOptionalListField9, readOptionalField11, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalListField10, readOptionalListField11, readOptionalListField12, readOptionalListField13, readOptionalFieldWithExpression28, readOptionalField15, readOptionalListField14, readOptionalField16);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0757c8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f5906a, this.f4781a.I());
            Field field = value.f5908b;
            Function1 function1 = EnumC1091v2.f8194d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = value.f5910c;
            Function1 function12 = EnumC1109w2.f8299d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f5912d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f5914e, this.f4781a.r1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "autocapitalization", value.f5916f, C1060t7.a.f8060d);
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f5918g, this.f4781a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f5920h, this.f4781a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f5921i);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f5922j, this.f4781a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "enter_key_actions", value.f5923k, this.f4781a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "enter_key_type", value.f5924l, C1060t7.d.f8073d);
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f5925m, this.f4781a.Z2());
            JsonFieldParser.writeListField(context, jSONObject, "filters", value.f5926n, this.f4781a.k4());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f5927o, this.f4781a.x3());
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_family", value.f5928p);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size", value.f5929q);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size_unit", value.f5930r, EnumC0779dc.f6046d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_variation_settings", value.f5931s);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_weight", value.f5932t, EnumC0791e6.f6078d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_weight_value", value.f5933u);
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f5934v, this.f4781a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f5935w, this.f4781a.W6());
            Field field3 = value.f5936x;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(context, jSONObject, "highlight_color", field3, function13);
            JsonFieldParser.writeExpressionField(context, jSONObject, "hint_color", value.f5937y, function13);
            JsonFieldParser.writeExpressionField(context, jSONObject, "hint_text", value.f5938z);
            JsonFieldParser.writeField(context, jSONObject, "id", value.f5880A);
            JsonFieldParser.writeExpressionField(context, jSONObject, "is_enabled", value.f5881B);
            JsonFieldParser.writeExpressionField(context, jSONObject, "keyboard_type", value.f5882C, C1060t7.e.f8085d);
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f5883D, this.f4781a.N4());
            JsonFieldParser.writeExpressionField(context, jSONObject, "letter_spacing", value.f5884E);
            JsonFieldParser.writeExpressionField(context, jSONObject, "line_height", value.f5885F);
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f5886G, this.f4781a.W2());
            JsonFieldParser.writeField(context, jSONObject, "mask", value.f5887H, this.f4781a.t4());
            JsonFieldParser.writeExpressionField(context, jSONObject, "max_length", value.f5888I);
            JsonFieldParser.writeExpressionField(context, jSONObject, "max_visible_lines", value.f5889J);
            JsonFieldParser.writeField(context, jSONObject, "native_interface", value.f5890K, this.f4781a.w4());
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f5891L, this.f4781a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f5892M);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f5893N);
            JsonFieldParser.writeExpressionField(context, jSONObject, "select_all_on_focus", value.f5894O);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f5895P, this.f4781a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "text_alignment_horizontal", value.f5896Q, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "text_alignment_vertical", value.f5897R, function12);
            JsonFieldParser.writeExpressionField(context, jSONObject, "text_color", value.f5898S, function13);
            JsonFieldParser.writeField(context, jSONObject, "text_variable", value.f5899T);
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f5900U, this.f4781a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f5901V, this.f4781a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f5902W, this.f4781a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f5903X, this.f4781a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f5904Y, this.f4781a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f5905Z, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "input");
            JsonFieldParser.writeListField(context, jSONObject, "validators", value.f5907a0, this.f4781a.E4());
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f5909b0, this.f4781a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f5911c0, this.f4781a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f5913d0, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f5915e0, this.f4781a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f5917f0, this.f4781a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f5919g0, this.f4781a.W6());
            return jSONObject;
        }
    }

    public static final class n implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4782a;

        public n(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4782a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1060t7 resolve(ParsingContext context, C0757c8 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f5906a, data, "accessibility", this.f4782a.J(), this.f4782a.H());
            Field field = template.f5908b;
            TypeHelper typeHelper = S7.f4762s;
            Function1 function1 = EnumC1091v2.f8195e;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alignment_horizontal", typeHelper, function1);
            Field field2 = template.f5910c;
            TypeHelper typeHelper2 = S7.f4763t;
            Function1 function12 = EnumC1109w2.f8300e;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "alignment_vertical", typeHelper2, function12);
            Field field3 = template.f5912d;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = S7.f4735C;
            Expression expression = S7.f4745b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "alpha", typeHelper3, function13, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f5914e, data, "animators", this.f4782a.s1(), this.f4782a.q1());
            Field field4 = template.f5916f;
            TypeHelper typeHelper4 = S7.f4764u;
            Function1 function14 = C1060t7.a.f8061e;
            Expression expression3 = S7.f4746c;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "autocapitalization", typeHelper4, function14, expression3);
            Expression expression4 = resolveOptionalExpression4 == null ? expression3 : resolveOptionalExpression4;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f5918g, data, io.appmetrica.analytics.impl.L2.f37912g, this.f4782a.E1(), this.f4782a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f5920h, data, "border", this.f4782a.K1(), this.f4782a.I1());
            Field field5 = template.f5921i;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "column_span", typeHelper5, function15, S7.f4736D);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f5922j, data, "disappear_actions", this.f4782a.O2(), this.f4782a.M2());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f5923k, data, "enter_key_actions", this.f4782a.w0(), this.f4782a.u0());
            Field field6 = template.f5924l;
            TypeHelper typeHelper6 = S7.f4765v;
            Function1 function16 = C1060t7.d.f8074e;
            Expression expression5 = S7.f4747d;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "enter_key_type", typeHelper6, function16, expression5);
            Expression expression6 = resolveOptionalExpression6 == null ? expression5 : resolveOptionalExpression6;
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f5925m, data, "extensions", this.f4782a.a3(), this.f4782a.Y2());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f5926n, data, "filters", this.f4782a.l4(), this.f4782a.j4());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f5927o, data, "focus", this.f4782a.y3(), this.f4782a.w3());
            Field field7 = template.f5928p;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "font_family", typeHelper7);
            Field field8 = template.f5929q;
            ValueValidator valueValidator2 = S7.f4737E;
            Expression expression7 = S7.f4748e;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "font_size", typeHelper5, function15, valueValidator2, expression7);
            if (resolveOptionalExpression8 != null) {
                expression7 = resolveOptionalExpression8;
            }
            Field field9 = template.f5930r;
            TypeHelper typeHelper8 = S7.f4766w;
            Function1 function17 = EnumC0779dc.f6047e;
            Expression expression8 = S7.f4749f;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field9, data, "font_size_unit", typeHelper8, function17, expression8);
            Expression expression9 = resolveOptionalExpression9 == null ? expression8 : resolveOptionalExpression9;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, template.f5931s, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Field field10 = template.f5932t;
            TypeHelper typeHelper9 = S7.f4767x;
            Function1 function18 = EnumC0791e6.f6079e;
            Expression expression10 = S7.f4750g;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, field10, data, "font_weight", typeHelper9, function18, expression10);
            Expression expression11 = resolveOptionalExpression11 == null ? expression10 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, template.f5933u, data, "font_weight_value", typeHelper5, function15, S7.f4738F);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f5934v, data, "functions", this.f4782a.H3(), this.f4782a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f5935w, data, "height", this.f4782a.X6(), this.f4782a.V6());
            if (yb == null) {
                yb = S7.f4751h;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            Field field11 = template.f5936x;
            TypeHelper<Integer> typeHelper10 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function19 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, field11, data, "highlight_color", typeHelper10, function19);
            Field field12 = template.f5937y;
            Expression expression12 = S7.f4752i;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(context, field12, data, "hint_color", typeHelper10, function19, expression12);
            Expression expression13 = resolveOptionalExpression14 == null ? expression12 : resolveOptionalExpression14;
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(context, template.f5938z, data, "hint_text", typeHelper7);
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f5880A, data, "id");
            Field field13 = template.f5881B;
            TypeHelper<Boolean> typeHelper11 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function110 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression14 = S7.f4753j;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(context, field13, data, "is_enabled", typeHelper11, function110, expression14);
            Expression expression15 = resolveOptionalExpression16 == null ? expression14 : resolveOptionalExpression16;
            Field field14 = template.f5882C;
            TypeHelper typeHelper12 = S7.f4768y;
            Function1 function111 = C1060t7.e.f8086e;
            Expression expression16 = S7.f4754k;
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(context, field14, data, "keyboard_type", typeHelper12, function111, expression16);
            Expression expression17 = resolveOptionalExpression17 == null ? expression16 : resolveOptionalExpression17;
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f5883D, data, "layout_provider", this.f4782a.O4(), this.f4782a.M4());
            Field field15 = template.f5884E;
            Expression expression18 = S7.f4755l;
            Expression resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(context, field15, data, "letter_spacing", typeHelper3, function13, expression18);
            Expression expression19 = resolveOptionalExpression18 == null ? expression18 : resolveOptionalExpression18;
            Expression resolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(context, template.f5885F, data, "line_height", typeHelper5, function15, S7.f4739G);
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f5886G, data, "margins", this.f4782a.X2(), this.f4782a.V2());
            T7 t7 = (T7) JsonFieldResolver.resolveOptional(context, template.f5887H, data, "mask", this.f4782a.u4(), this.f4782a.s4());
            Expression resolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(context, template.f5888I, data, "max_length", typeHelper5, function15, S7.f4740H);
            Expression resolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(context, template.f5889J, data, "max_visible_lines", typeHelper5, function15, S7.f4741I);
            C1060t7.f fVar = (C1060t7.f) JsonFieldResolver.resolveOptional(context, template.f5890K, data, "native_interface", this.f4782a.x4(), this.f4782a.v4());
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f5891L, data, "paddings", this.f4782a.X2(), this.f4782a.V2());
            Expression resolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(context, template.f5892M, data, "reuse_id", typeHelper7);
            Expression resolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(context, template.f5893N, data, "row_span", typeHelper5, function15, S7.f4742J);
            Field field16 = template.f5894O;
            Expression expression20 = S7.f4756m;
            Expression resolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(context, field16, data, "select_all_on_focus", typeHelper11, function110, expression20);
            Expression expression21 = resolveOptionalExpression24 == null ? expression20 : resolveOptionalExpression24;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f5895P, data, "selected_actions", this.f4782a.w0(), this.f4782a.u0());
            Field field17 = template.f5896Q;
            TypeHelper typeHelper13 = S7.f4769z;
            Expression expression22 = S7.f4757n;
            Expression resolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(context, field17, data, "text_alignment_horizontal", typeHelper13, function1, expression22);
            Expression expression23 = resolveOptionalExpression25 == null ? expression22 : resolveOptionalExpression25;
            Field field18 = template.f5897R;
            TypeHelper typeHelper14 = S7.f4733A;
            Expression expression24 = S7.f4758o;
            Expression resolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(context, field18, data, "text_alignment_vertical", typeHelper14, function12, expression24);
            Expression expression25 = resolveOptionalExpression26 == null ? expression24 : resolveOptionalExpression26;
            Field field19 = template.f5898S;
            Expression expression26 = S7.f4759p;
            Expression resolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(context, field19, data, "text_color", typeHelper10, function19, expression26);
            Expression expression27 = resolveOptionalExpression27 == null ? expression26 : resolveOptionalExpression27;
            Object resolve = JsonFieldResolver.resolve(context, template.f5899T, data, "text_variable");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…e, data, \"text_variable\")");
            String str2 = (String) resolve;
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f5900U, data, "tooltips", this.f4782a.L8(), this.f4782a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f5901V, data, "transform", this.f4782a.X8(), this.f4782a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f5902W, data, "transition_change", this.f4782a.T1(), this.f4782a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f5903X, data, "transition_in", this.f4782a.y1(), this.f4782a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f5904Y, data, "transition_out", this.f4782a.y1(), this.f4782a.w1());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f5905Z, data, "transition_triggers", EnumC0997pf.f7541e, S7.f4743K);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f5907a0, data, "validators", this.f4782a.F4(), this.f4782a.D4());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f5909b0, data, "variable_triggers", this.f4782a.a9(), this.f4782a.Y8());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(context, template.f5911c0, data, "variables", this.f4782a.g9(), this.f4782a.e9());
            Field field20 = template.f5913d0;
            TypeHelper typeHelper15 = S7.f4734B;
            Function1 function112 = Vf.f5043e;
            Expression expression28 = S7.f4760q;
            Expression resolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(context, field20, data, "visibility", typeHelper15, function112, expression28);
            if (resolveOptionalExpression28 != null) {
                expression28 = resolveOptionalExpression28;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f5915e0, data, "visibility_action", this.f4782a.s9(), this.f4782a.q9());
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(context, template.f5917f0, data, "visibility_actions", this.f4782a.s9(), this.f4782a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f5919g0, data, "width", this.f4782a.X6(), this.f4782a.V6());
            if (yb3 == null) {
                yb3 = S7.f4761r;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1060t7(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, expression4, resolveOptionalList2, c0860i3, resolveOptionalExpression5, resolveOptionalList3, resolveOptionalList4, expression6, resolveOptionalList5, resolveOptionalList6, w5, resolveOptionalExpression7, expression7, expression9, resolveOptionalExpression10, expression11, resolveOptionalExpression12, resolveOptionalList7, yb2, resolveOptionalExpression13, expression13, resolveOptionalExpression15, str, expression15, expression17, c1079u8, expression19, resolveOptionalExpression19, c0754c5, t7, resolveOptionalExpression20, resolveOptionalExpression21, fVar, c0754c52, resolveOptionalExpression22, resolveOptionalExpression23, expression21, resolveOptionalList8, expression23, expression25, expression27, str2, resolveOptionalList9, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList10, resolveOptionalList11, resolveOptionalList12, resolveOptionalList13, expression28, wf, resolveOptionalList14, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f4745b = companion.constant(Double.valueOf(1.0d));
        f4746c = companion.constant(C1060t7.a.AUTO);
        f4747d = companion.constant(C1060t7.d.DEFAULT);
        f4748e = companion.constant(12L);
        f4749f = companion.constant(EnumC0779dc.SP);
        f4750g = companion.constant(EnumC0791e6.REGULAR);
        f4751h = new Yb.e(new C0765cg(null, null, null, 7, null));
        f4752i = companion.constant(1929379840);
        f4753j = companion.constant(Boolean.TRUE);
        f4754k = companion.constant(C1060t7.e.MULTI_LINE_TEXT);
        f4755l = companion.constant(Double.valueOf(0.0d));
        f4756m = companion.constant(Boolean.FALSE);
        f4757n = companion.constant(EnumC1091v2.START);
        f4758o = companion.constant(EnumC1109w2.CENTER);
        f4759p = companion.constant(-16777216);
        f4760q = companion.constant(Vf.VISIBLE);
        f4761r = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f4762s = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f4770i);
        f4763t = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f4771i);
        f4764u = companion2.from(AbstractC3219i.G(C1060t7.a.values()), c.f4772i);
        f4765v = companion2.from(AbstractC3219i.G(C1060t7.d.values()), d.f4773i);
        f4766w = companion2.from(AbstractC3219i.G(EnumC0779dc.values()), e.f4774i);
        f4767x = companion2.from(AbstractC3219i.G(EnumC0791e6.values()), f.f4775i);
        f4768y = companion2.from(AbstractC3219i.G(C1060t7.e.values()), g.f4776i);
        f4769z = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), h.f4777i);
        f4733A = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), i.f4778i);
        f4734B = companion2.from(AbstractC3219i.G(Vf.values()), j.f4779i);
        f4735C = new ValueValidator() { // from class: O1.J7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean j4;
                j4 = S7.j(((Double) obj).doubleValue());
                return j4;
            }
        };
        f4736D = new ValueValidator() { // from class: O1.K7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean k4;
                k4 = S7.k(((Long) obj).longValue());
                return k4;
            }
        };
        f4737E = new ValueValidator() { // from class: O1.L7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean l4;
                l4 = S7.l(((Long) obj).longValue());
                return l4;
            }
        };
        f4738F = new ValueValidator() { // from class: O1.M7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean m4;
                m4 = S7.m(((Long) obj).longValue());
                return m4;
            }
        };
        f4739G = new ValueValidator() { // from class: O1.N7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean n4;
                n4 = S7.n(((Long) obj).longValue());
                return n4;
            }
        };
        f4740H = new ValueValidator() { // from class: O1.O7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean o4;
                o4 = S7.o(((Long) obj).longValue());
                return o4;
            }
        };
        f4741I = new ValueValidator() { // from class: O1.P7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean p4;
                p4 = S7.p(((Long) obj).longValue());
                return p4;
            }
        };
        f4742J = new ValueValidator() { // from class: O1.Q7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean q4;
                q4 = S7.q(((Long) obj).longValue());
                return q4;
            }
        };
        f4743K = new ListValidator() { // from class: O1.R7
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean r4;
                r4 = S7.r(list);
                return r4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(long j4) {
        return j4 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(long j4) {
        return j4 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(long j4) {
        return j4 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
