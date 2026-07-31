package O1;

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

/* renamed from: O1.vb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1100vb {

    /* renamed from: a, reason: collision with root package name */
    private static final f f8246a = new f(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f8247b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f8248c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f8249d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f8250e;

    /* renamed from: f, reason: collision with root package name */
    public static final Yb.e f8251f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f8252g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f8253h;

    /* renamed from: i, reason: collision with root package name */
    public static final Expression f8254i;

    /* renamed from: j, reason: collision with root package name */
    public static final Expression f8255j;

    /* renamed from: k, reason: collision with root package name */
    public static final Yb.d f8256k;

    /* renamed from: l, reason: collision with root package name */
    public static final TypeHelper f8257l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeHelper f8258m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeHelper f8259n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeHelper f8260o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeHelper f8261p;

    /* renamed from: q, reason: collision with root package name */
    public static final ValueValidator f8262q;

    /* renamed from: r, reason: collision with root package name */
    public static final ValueValidator f8263r;

    /* renamed from: s, reason: collision with root package name */
    public static final ValueValidator f8264s;

    /* renamed from: t, reason: collision with root package name */
    public static final ValueValidator f8265t;

    /* renamed from: u, reason: collision with root package name */
    public static final ValueValidator f8266u;

    /* renamed from: v, reason: collision with root package name */
    public static final ListValidator f8267v;

    /* renamed from: w, reason: collision with root package name */
    public static final ValueValidator f8268w;

    /* renamed from: x, reason: collision with root package name */
    public static final ListValidator f8269x;

    /* renamed from: O1.vb$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8270i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    /* renamed from: O1.vb$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8271i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    /* renamed from: O1.vb$c */
    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f8272i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0779dc);
        }
    }

    /* renamed from: O1.vb$d */
    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f8273i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0791e6);
        }
    }

    /* renamed from: O1.vb$e */
    static final class e extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final e f8274i = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    /* renamed from: O1.vb$f */
    private static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    /* renamed from: O1.vb$g */
    public static final class g implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8275a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8275a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0939mb deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f8275a.H());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", AbstractC1100vb.f8257l, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", AbstractC1100vb.f8258m, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC1100vb.f8262q;
            Expression expression = AbstractC1100vb.f8247b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f8275a.q1());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f8275a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f8275a.I1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper2, function12, AbstractC1100vb.f8263r);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f8275a.M2());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f8275a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f8275a.w3());
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "font_family", typeHelper3);
            ValueValidator valueValidator2 = AbstractC1100vb.f8264s;
            Expression expression3 = AbstractC1100vb.f8248c;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "font_size", typeHelper2, function12, valueValidator2, expression3);
            if (readOptionalExpression6 != null) {
                expression3 = readOptionalExpression6;
            }
            TypeHelper typeHelper4 = AbstractC1100vb.f8259n;
            Function1 function13 = EnumC0779dc.f6047e;
            Expression expression4 = AbstractC1100vb.f8249d;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "font_size_unit", typeHelper4, function13, expression4);
            Expression expression5 = readOptionalExpression7 == null ? expression4 : readOptionalExpression7;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            TypeHelper typeHelper5 = AbstractC1100vb.f8260o;
            Function1 function14 = EnumC0791e6.f6079e;
            Expression expression6 = AbstractC1100vb.f8250e;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "font_weight", typeHelper5, function14, expression6);
            Expression expression7 = readOptionalExpression9 == null ? expression6 : readOptionalExpression9;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "font_weight_value", typeHelper2, function12, AbstractC1100vb.f8265t);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f8275a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f8275a.V6());
            if (yb == null) {
                yb = AbstractC1100vb.f8251f;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function15 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression8 = AbstractC1100vb.f8252g;
            Yb yb2 = yb;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "hint_color", typeHelper6, function15, expression8);
            Expression expression9 = readOptionalExpression11 == null ? expression8 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "hint_text", typeHelper3);
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f8275a.M4());
            Expression expression10 = AbstractC1100vb.f8253h;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "letter_spacing", typeHelper, function1, expression10);
            Expression expression11 = readOptionalExpression13 == null ? expression10 : readOptionalExpression13;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(context, data, "line_height", typeHelper2, function12, AbstractC1100vb.f8266u);
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f8275a.V2());
            List readList = JsonPropertyParser.readList(context, data, "options", this.f8275a.D6(), AbstractC1100vb.f8267v);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …arser, OPTIONS_VALIDATOR)");
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f8275a.V2());
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", typeHelper3);
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper2, function12, AbstractC1100vb.f8268w);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f8275a.u0());
            Expression expression12 = AbstractC1100vb.f8254i;
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(context, data, "text_color", typeHelper6, function15, expression12);
            Expression expression13 = readOptionalExpression17 == null ? expression12 : readOptionalExpression17;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f8275a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f8275a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f8275a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f8275a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f8275a.w1());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC1100vb.f8269x);
            Object read = JsonPropertyParser.read(context, data, "value_variable");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"value_variable\")");
            String str2 = (String) read;
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f8275a.Y8());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f8275a.e9());
            TypeHelper typeHelper7 = AbstractC1100vb.f8261p;
            Function1 function16 = Vf.f5043e;
            Expression expression14 = AbstractC1100vb.f8255j;
            Expression readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper7, function16, expression14);
            if (readOptionalExpression18 != null) {
                expression14 = readOptionalExpression18;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f8275a.q9());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f8275a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f8275a.V6());
            if (yb3 == null) {
                yb3 = AbstractC1100vb.f8256k;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0939mb(c0839h0, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList, readOptionalList2, c0860i3, readOptionalExpression4, readOptionalList3, readOptionalList4, w5, readOptionalExpression5, expression3, expression5, readOptionalExpression8, expression7, readOptionalExpression10, readOptionalList5, yb2, expression9, readOptionalExpression12, str, c1079u8, expression11, readOptionalExpression14, c0754c5, readList, c0754c52, readOptionalExpression15, readOptionalExpression16, readOptionalList6, expression13, readOptionalList7, c0925lf, abstractC1092v3, o22, o23, readOptionalList8, str2, readOptionalList9, readOptionalList10, expression14, wf, readOptionalList11, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0939mb value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f8275a.H());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f8275a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f8275a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f8275a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f8275a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f8275a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f8275a.w3());
            JsonExpressionParser.writeExpression(context, jSONObject, "font_family", value.f7072l);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size", value.f7073m);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size_unit", value.f7074n, EnumC0779dc.f6046d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_variation_settings", value.f7075o);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_weight", value.f7076p, EnumC0791e6.f6078d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_weight_value", value.f7077q);
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f8275a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f8275a.V6());
            Expression expression = value.f7080t;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(context, jSONObject, "hint_color", expression, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "hint_text", value.f7081u);
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f8275a.M4());
            JsonExpressionParser.writeExpression(context, jSONObject, "letter_spacing", value.f7084x);
            JsonExpressionParser.writeExpression(context, jSONObject, "line_height", value.f7085y);
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f8275a.V2());
            JsonPropertyParser.writeList(context, jSONObject, "options", value.f7041A, this.f8275a.D6());
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f8275a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f8275a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "text_color", value.f7046F, function1);
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f8275a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f8275a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f8275a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f8275a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f8275a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "select");
            JsonPropertyParser.write(context, jSONObject, "value_variable", value.f7053M);
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f8275a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f8275a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f8275a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f8275a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f8275a.V6());
            return jSONObject;
        }
    }

    /* renamed from: O1.vb$h */
    public static final class h implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8276a;

        public h(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8276a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1172zb deserialize(ParsingContext context, C1172zb c1172zb, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, c1172zb != null ? c1172zb.f8853a : null, this.f8276a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", AbstractC1100vb.f8257l, allowPropertyOverride, c1172zb != null ? c1172zb.f8854b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", AbstractC1100vb.f8258m, allowPropertyOverride, c1172zb != null ? c1172zb.f8855c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = c1172zb != null ? c1172zb.f8856d : null;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", typeHelper, allowPropertyOverride, field, function1, AbstractC1100vb.f8262q);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, c1172zb != null ? c1172zb.f8857e : null, this.f8276a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, c1172zb != null ? c1172zb.f8858f : null, this.f8276a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, c1172zb != null ? c1172zb.f8859g : null, this.f8276a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = c1172zb != null ? c1172zb.f8860h : null;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper2, allowPropertyOverride, field2, function12, AbstractC1100vb.f8263r);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, c1172zb != null ? c1172zb.f8861i : null, this.f8276a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, c1172zb != null ? c1172zb.f8862j : null, this.f8276a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, c1172zb != null ? c1172zb.f8863k : null, this.f8276a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…vFocusJsonTemplateParser)");
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_family", typeHelper3, allowPropertyOverride, c1172zb != null ? c1172zb.f8864l : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…ride, parent?.fontFamily)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size", typeHelper2, allowPropertyOverride, c1172zb != null ? c1172zb.f8865m : null, function12, AbstractC1100vb.f8264s);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…INT, FONT_SIZE_VALIDATOR)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size_unit", AbstractC1100vb.f8259n, allowPropertyOverride, c1172zb != null ? c1172zb.f8866n : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, c1172zb != null ? c1172zb.f8867o : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…t?.fontVariationSettings)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_weight", AbstractC1100vb.f8260o, allowPropertyOverride, c1172zb != null ? c1172zb.f8868p : null, EnumC0791e6.f6079e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…ivFontWeight.FROM_STRING)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_weight_value", typeHelper2, allowPropertyOverride, c1172zb != null ? c1172zb.f8869q : null, function12, AbstractC1100vb.f8265t);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…T_WEIGHT_VALUE_VALIDATOR)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, c1172zb != null ? c1172zb.f8870r : null, this.f8276a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, c1172zb != null ? c1172zb.f8871s : null, this.f8276a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field3 = c1172zb != null ? c1172zb.f8872t : null;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "hint_color", typeHelper4, allowPropertyOverride, field3, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "hint_text", typeHelper3, allowPropertyOverride, c1172zb != null ? c1172zb.f8873u : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…erride, parent?.hintText)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, c1172zb != null ? c1172zb.f8874v : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, c1172zb != null ? c1172zb.f8875w : null, this.f8276a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "letter_spacing", typeHelper, allowPropertyOverride, c1172zb != null ? c1172zb.f8876x : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…pacing, NUMBER_TO_DOUBLE)");
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "line_height", typeHelper2, allowPropertyOverride, c1172zb != null ? c1172zb.f8877y : null, function12, AbstractC1100vb.f8266u);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression14, "readOptionalFieldWithExp…T, LINE_HEIGHT_VALIDATOR)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, c1172zb != null ? c1172zb.f8878z : null, this.f8276a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field field4 = c1172zb != null ? c1172zb.f8834A : null;
            W1.h E6 = this.f8276a.E6();
            ListValidator listValidator = AbstractC1100vb.f8267v;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, "options", allowPropertyOverride, field4, E6, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…OPTIONS_VALIDATOR.cast())");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, c1172zb != null ? c1172zb.f8835B : null, this.f8276a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", typeHelper3, allowPropertyOverride, c1172zb != null ? c1172zb.f8836C : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression15, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper2, allowPropertyOverride, c1172zb != null ? c1172zb.f8837D : null, function12, AbstractC1100vb.f8268w);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression16, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, c1172zb != null ? c1172zb.f8838E : null, this.f8276a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "text_color", typeHelper4, allowPropertyOverride, c1172zb != null ? c1172zb.f8839F : null, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression17, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, c1172zb != null ? c1172zb.f8840G : null, this.f8276a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, c1172zb != null ? c1172zb.f8841H : null, this.f8276a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, c1172zb != null ? c1172zb.f8842I : null, this.f8276a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, c1172zb != null ? c1172zb.f8843J : null, this.f8276a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, c1172zb != null ? c1172zb.f8844K : null, this.f8276a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field5 = c1172zb != null ? c1172zb.f8845L : null;
            Function1 function14 = EnumC0997pf.f7541e;
            ListValidator listValidator2 = AbstractC1100vb.f8269x;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field5, function14, listValidator2);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "value_variable", allowPropertyOverride, c1172zb != null ? c1172zb.f8846M : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…e, parent?.valueVariable)");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, c1172zb != null ? c1172zb.f8847N : null, this.f8276a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, c1172zb != null ? c1172zb.f8848O : null, this.f8276a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", AbstractC1100vb.f8261p, allowPropertyOverride, c1172zb != null ? c1172zb.f8849P : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression18, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, c1172zb != null ? c1172zb.f8850Q : null, this.f8276a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, c1172zb != null ? c1172zb.f8851R : null, this.f8276a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, c1172zb != null ? c1172zb.f8852S : null, this.f8276a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new C1172zb(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalListField5, readOptionalField4, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalField5, readOptionalField6, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalField7, readListField, readOptionalField8, readOptionalFieldWithExpression15, readOptionalFieldWithExpression16, readOptionalListField6, readOptionalFieldWithExpression17, readOptionalListField7, readOptionalField9, readOptionalField10, readOptionalField11, readOptionalField12, readOptionalListField8, readField, readOptionalListField9, readOptionalListField10, readOptionalFieldWithExpression18, readOptionalField13, readOptionalListField11, readOptionalField14);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1172zb value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f8853a, this.f8276a.I());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f8854b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f8855c, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f8856d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f8857e, this.f8276a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f8858f, this.f8276a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f8859g, this.f8276a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f8860h);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f8861i, this.f8276a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f8862j, this.f8276a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f8863k, this.f8276a.x3());
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_family", value.f8864l);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size", value.f8865m);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size_unit", value.f8866n, EnumC0779dc.f6046d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_variation_settings", value.f8867o);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_weight", value.f8868p, EnumC0791e6.f6078d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_weight_value", value.f8869q);
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f8870r, this.f8276a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f8871s, this.f8276a.W6());
            Field field = value.f8872t;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(context, jSONObject, "hint_color", field, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "hint_text", value.f8873u);
            JsonFieldParser.writeField(context, jSONObject, "id", value.f8874v);
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f8875w, this.f8276a.N4());
            JsonFieldParser.writeExpressionField(context, jSONObject, "letter_spacing", value.f8876x);
            JsonFieldParser.writeExpressionField(context, jSONObject, "line_height", value.f8877y);
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f8878z, this.f8276a.W2());
            JsonFieldParser.writeListField(context, jSONObject, "options", value.f8834A, this.f8276a.E6());
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f8835B, this.f8276a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f8836C);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f8837D);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f8838E, this.f8276a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "text_color", value.f8839F, function1);
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f8840G, this.f8276a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f8841H, this.f8276a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f8842I, this.f8276a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f8843J, this.f8276a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f8844K, this.f8276a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f8845L, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "select");
            JsonFieldParser.writeField(context, jSONObject, "value_variable", value.f8846M);
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f8847N, this.f8276a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f8848O, this.f8276a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f8849P, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f8850Q, this.f8276a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f8851R, this.f8276a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f8852S, this.f8276a.W6());
            return jSONObject;
        }
    }

    /* renamed from: O1.vb$i */
    public static final class i implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8277a;

        public i(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8277a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0939mb resolve(ParsingContext context, C1172zb template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f8853a, data, "accessibility", this.f8277a.J(), this.f8277a.H());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f8854b, data, "alignment_horizontal", AbstractC1100vb.f8257l, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f8855c, data, "alignment_vertical", AbstractC1100vb.f8258m, EnumC1109w2.f8300e);
            Field field = template.f8856d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC1100vb.f8262q;
            Expression expression = AbstractC1100vb.f8247b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f8857e, data, "animators", this.f8277a.s1(), this.f8277a.q1());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f8858f, data, io.appmetrica.analytics.impl.L2.f37912g, this.f8277a.E1(), this.f8277a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f8859g, data, "border", this.f8277a.K1(), this.f8277a.I1());
            Field field2 = template.f8860h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "column_span", typeHelper2, function12, AbstractC1100vb.f8263r);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f8861i, data, "disappear_actions", this.f8277a.O2(), this.f8277a.M2());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f8862j, data, "extensions", this.f8277a.a3(), this.f8277a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f8863k, data, "focus", this.f8277a.y3(), this.f8277a.w3());
            Field field3 = template.f8864l;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "font_family", typeHelper3);
            Field field4 = template.f8865m;
            ValueValidator valueValidator2 = AbstractC1100vb.f8264s;
            Expression expression3 = AbstractC1100vb.f8248c;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "font_size", typeHelper2, function12, valueValidator2, expression3);
            if (resolveOptionalExpression6 != null) {
                expression3 = resolveOptionalExpression6;
            }
            Field field5 = template.f8866n;
            TypeHelper typeHelper4 = AbstractC1100vb.f8259n;
            Function1 function13 = EnumC0779dc.f6047e;
            Expression expression4 = AbstractC1100vb.f8249d;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "font_size_unit", typeHelper4, function13, expression4);
            Expression expression5 = resolveOptionalExpression7 == null ? expression4 : resolveOptionalExpression7;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, template.f8867o, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Field field6 = template.f8868p;
            TypeHelper typeHelper5 = AbstractC1100vb.f8260o;
            Function1 function14 = EnumC0791e6.f6079e;
            Expression expression6 = AbstractC1100vb.f8250e;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "font_weight", typeHelper5, function14, expression6);
            Expression expression7 = resolveOptionalExpression9 == null ? expression6 : resolveOptionalExpression9;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, template.f8869q, data, "font_weight_value", typeHelper2, function12, AbstractC1100vb.f8265t);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f8870r, data, "functions", this.f8277a.H3(), this.f8277a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f8871s, data, "height", this.f8277a.X6(), this.f8277a.V6());
            if (yb == null) {
                yb = AbstractC1100vb.f8251f;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            Field field7 = template.f8872t;
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function15 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression8 = AbstractC1100vb.f8252g;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "hint_color", typeHelper6, function15, expression8);
            Expression expression9 = resolveOptionalExpression11 == null ? expression8 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, template.f8873u, data, "hint_text", typeHelper3);
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f8874v, data, "id");
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f8875w, data, "layout_provider", this.f8277a.O4(), this.f8277a.M4());
            Field field8 = template.f8876x;
            Expression expression10 = AbstractC1100vb.f8253h;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "letter_spacing", typeHelper, function1, expression10);
            Expression expression11 = resolveOptionalExpression13 == null ? expression10 : resolveOptionalExpression13;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(context, template.f8877y, data, "line_height", typeHelper2, function12, AbstractC1100vb.f8266u);
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f8878z, data, "margins", this.f8277a.X2(), this.f8277a.V2());
            List resolveList = JsonFieldResolver.resolveList(context, template.f8834A, data, "options", this.f8277a.F6(), this.f8277a.D6(), AbstractC1100vb.f8267v);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…arser, OPTIONS_VALIDATOR)");
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f8835B, data, "paddings", this.f8277a.X2(), this.f8277a.V2());
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(context, template.f8836C, data, "reuse_id", typeHelper3);
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(context, template.f8837D, data, "row_span", typeHelper2, function12, AbstractC1100vb.f8268w);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f8838E, data, "selected_actions", this.f8277a.w0(), this.f8277a.u0());
            Field field9 = template.f8839F;
            Expression expression12 = AbstractC1100vb.f8254i;
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(context, field9, data, "text_color", typeHelper6, function15, expression12);
            Expression expression13 = resolveOptionalExpression17 == null ? expression12 : resolveOptionalExpression17;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f8840G, data, "tooltips", this.f8277a.L8(), this.f8277a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f8841H, data, "transform", this.f8277a.X8(), this.f8277a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f8842I, data, "transition_change", this.f8277a.T1(), this.f8277a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f8843J, data, "transition_in", this.f8277a.y1(), this.f8277a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f8844K, data, "transition_out", this.f8277a.y1(), this.f8277a.w1());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f8845L, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC1100vb.f8269x);
            Object resolve = JsonFieldResolver.resolve(context, template.f8846M, data, "value_variable");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…, data, \"value_variable\")");
            String str2 = (String) resolve;
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f8847N, data, "variable_triggers", this.f8277a.a9(), this.f8277a.Y8());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f8848O, data, "variables", this.f8277a.g9(), this.f8277a.e9());
            Field field10 = template.f8849P;
            TypeHelper typeHelper7 = AbstractC1100vb.f8261p;
            Function1 function16 = Vf.f5043e;
            Expression expression14 = AbstractC1100vb.f8255j;
            Expression resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(context, field10, data, "visibility", typeHelper7, function16, expression14);
            if (resolveOptionalExpression18 != null) {
                expression14 = resolveOptionalExpression18;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f8850Q, data, "visibility_action", this.f8277a.s9(), this.f8277a.q9());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f8851R, data, "visibility_actions", this.f8277a.s9(), this.f8277a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f8852S, data, "width", this.f8277a.X6(), this.f8277a.V6());
            if (yb3 == null) {
                yb3 = AbstractC1100vb.f8256k;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0939mb(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, resolveOptionalList2, c0860i3, resolveOptionalExpression4, resolveOptionalList3, resolveOptionalList4, w5, resolveOptionalExpression5, expression3, expression5, resolveOptionalExpression8, expression7, resolveOptionalExpression10, resolveOptionalList5, yb2, expression9, resolveOptionalExpression12, str, c1079u8, expression11, resolveOptionalExpression14, c0754c5, resolveList, c0754c52, resolveOptionalExpression15, resolveOptionalExpression16, resolveOptionalList6, expression13, resolveOptionalList7, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList8, str2, resolveOptionalList9, resolveOptionalList10, expression14, wf, resolveOptionalList11, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f8247b = companion.constant(Double.valueOf(1.0d));
        f8248c = companion.constant(12L);
        f8249d = companion.constant(EnumC0779dc.SP);
        f8250e = companion.constant(EnumC0791e6.REGULAR);
        f8251f = new Yb.e(new C0765cg(null, null, null, 7, null));
        f8252g = companion.constant(1929379840);
        f8253h = companion.constant(Double.valueOf(0.0d));
        f8254i = companion.constant(-16777216);
        f8255j = companion.constant(Vf.VISIBLE);
        f8256k = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f8257l = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f8270i);
        f8258m = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f8271i);
        f8259n = companion2.from(AbstractC3219i.G(EnumC0779dc.values()), c.f8272i);
        f8260o = companion2.from(AbstractC3219i.G(EnumC0791e6.values()), d.f8273i);
        f8261p = companion2.from(AbstractC3219i.G(Vf.values()), e.f8274i);
        f8262q = new ValueValidator() { // from class: O1.nb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean i4;
                i4 = AbstractC1100vb.i(((Double) obj).doubleValue());
                return i4;
            }
        };
        f8263r = new ValueValidator() { // from class: O1.ob
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean j4;
                j4 = AbstractC1100vb.j(((Long) obj).longValue());
                return j4;
            }
        };
        f8264s = new ValueValidator() { // from class: O1.pb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean k4;
                k4 = AbstractC1100vb.k(((Long) obj).longValue());
                return k4;
            }
        };
        f8265t = new ValueValidator() { // from class: O1.qb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean l4;
                l4 = AbstractC1100vb.l(((Long) obj).longValue());
                return l4;
            }
        };
        f8266u = new ValueValidator() { // from class: O1.rb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean m4;
                m4 = AbstractC1100vb.m(((Long) obj).longValue());
                return m4;
            }
        };
        f8267v = new ListValidator() { // from class: O1.sb
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean n4;
                n4 = AbstractC1100vb.n(list);
                return n4;
            }
        };
        f8268w = new ValueValidator() { // from class: O1.tb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean o4;
                o4 = AbstractC1100vb.o(((Long) obj).longValue());
                return o4;
            }
        };
        f8269x = new ListValidator() { // from class: O1.ub
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean p4;
                p4 = AbstractC1100vb.p(list);
                return p4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(long j4) {
        return j4 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
