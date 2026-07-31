package O1;

import O1.Yb;
import com.ironsource.b9;
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
public abstract class Hc {

    /* renamed from: a, reason: collision with root package name */
    private static final e f3052a = new e(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f3053b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f3054c;

    /* renamed from: d, reason: collision with root package name */
    public static final Yb.e f3055d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f3056e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f3057f;

    /* renamed from: g, reason: collision with root package name */
    public static final Yb.d f3058g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f3059h;

    /* renamed from: i, reason: collision with root package name */
    public static final TypeHelper f3060i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeHelper f3061j;

    /* renamed from: k, reason: collision with root package name */
    public static final TypeHelper f3062k;

    /* renamed from: l, reason: collision with root package name */
    public static final ValueValidator f3063l;

    /* renamed from: m, reason: collision with root package name */
    public static final ValueValidator f3064m;

    /* renamed from: n, reason: collision with root package name */
    public static final ValueValidator f3065n;

    /* renamed from: o, reason: collision with root package name */
    public static final ListValidator f3066o;

    /* renamed from: p, reason: collision with root package name */
    public static final ListValidator f3067p;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3068i = new a();

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
        public static final b f3069i = new b();

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
        public static final c f3070i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0979of);
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f3071i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    private static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    public static final class f implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3072a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3072a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bc deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f3072a.H());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", Hc.f3059h, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", Hc.f3060i, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Hc.f3063l;
            Expression expression = Hc.f3053b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f3072a.q1());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f3072a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f3072a.I1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = Hc.f3054c;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "clip_to_bounds", typeHelper2, function12, expression2);
            Expression expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper3, function13, Hc.f3064m);
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "default_state_id", typeHelper4);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f3072a.M2());
            String str = (String) JsonPropertyParser.readOptional(context, data, "div_id");
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f3072a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f3072a.w3());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f3072a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f3072a.V6());
            if (yb == null) {
                yb = Hc.f3055d;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) JsonPropertyParser.readOptional(context, data, "id");
            Yb yb2 = yb;
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f3072a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f3072a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f3072a.V2());
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", typeHelper4);
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper3, function13, Hc.f3065n);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f3072a.u0());
            String str3 = (String) JsonPropertyParser.readOptional(context, data, "state_id_variable");
            List readList = JsonPropertyParser.readList(context, data, "states", this.f3072a.q7(), Hc.f3066o);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …Parser, STATES_VALIDATOR)");
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f3072a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f3072a.V8());
            TypeHelper typeHelper5 = Hc.f3061j;
            Function1 function14 = EnumC0979of.f7417e;
            Expression expression4 = Hc.f3056e;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "transition_animation_selector", typeHelper5, function14, expression4);
            Expression expression5 = readOptionalExpression9 == null ? expression4 : readOptionalExpression9;
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f3072a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f3072a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f3072a.w1());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, Hc.f3067p);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f3072a.Y8());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f3072a.e9());
            TypeHelper typeHelper6 = Hc.f3062k;
            Function1 function15 = Vf.f5043e;
            Expression expression6 = Hc.f3057f;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper6, function15, expression6);
            if (readOptionalExpression10 != null) {
                expression6 = readOptionalExpression10;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f3072a.q9());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f3072a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f3072a.V6());
            if (yb3 == null) {
                yb3 = Hc.f3058g;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new Bc(c0839h0, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, c0860i3, expression3, readOptionalExpression5, readOptionalExpression6, readOptionalList3, str, readOptionalList4, w5, readOptionalList5, yb2, str2, c1079u8, c0754c5, c0754c52, readOptionalExpression7, readOptionalExpression8, readOptionalList6, str3, readList, readOptionalList7, c0925lf, expression5, abstractC1092v3, o22, o23, readOptionalList8, readOptionalList9, readOptionalList10, expression6, wf, readOptionalList11, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Bc value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f3072a.H());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f3072a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f3072a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f3072a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "clip_to_bounds", value.f1512h);
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonExpressionParser.writeExpression(context, jSONObject, "default_state_id", value.f1514j);
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f3072a.M2());
            JsonPropertyParser.write(context, jSONObject, "div_id", value.f1516l);
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f3072a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f3072a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f3072a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f3072a.V6());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f3072a.M4());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f3072a.V2());
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f3072a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f3072a.u0());
            JsonPropertyParser.write(context, jSONObject, "state_id_variable", value.f1528x);
            JsonPropertyParser.writeList(context, jSONObject, "states", value.f1529y, this.f3072a.q7());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f3072a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f3072a.V8());
            JsonExpressionParser.writeExpression(context, jSONObject, "transition_animation_selector", value.f1492B, EnumC0979of.f7416d);
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f3072a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f3072a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f3072a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", b9.h.f15456P);
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f3072a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f3072a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f3072a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f3072a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f3072a.V6());
            return jSONObject;
        }
    }

    public static final class g implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3073a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3073a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Lc deserialize(ParsingContext context, Lc lc, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, lc != null ? lc.f3736a : null, this.f3073a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", Hc.f3059h, allowPropertyOverride, lc != null ? lc.f3737b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", Hc.f3060i, allowPropertyOverride, lc != null ? lc.f3738c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, lc != null ? lc.f3739d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, Hc.f3063l);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, lc != null ? lc.f3740e : null, this.f3073a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, lc != null ? lc.f3741f : null, this.f3073a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, lc != null ? lc.f3742g : null, this.f3073a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "clip_to_bounds", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, lc != null ? lc.f3743h : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…ToBounds, ANY_TO_BOOLEAN)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = lc != null ? lc.f3744i : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper, allowPropertyOverride, field, function1, Hc.f3064m);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "default_state_id", typeHelper2, allowPropertyOverride, lc != null ? lc.f3745j : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…, parent?.defaultStateId)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, lc != null ? lc.f3746k : null, this.f3073a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "div_id", allowPropertyOverride, lc != null ? lc.f3747l : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…wOverride, parent?.divId)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, lc != null ? lc.f3748m : null, this.f3073a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, lc != null ? lc.f3749n : null, this.f3073a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, lc != null ? lc.f3750o : null, this.f3073a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, lc != null ? lc.f3751p : null, this.f3073a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, lc != null ? lc.f3752q : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, lc != null ? lc.f3753r : null, this.f3073a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, lc != null ? lc.f3754s : null, this.f3073a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, lc != null ? lc.f3755t : null, this.f3073a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", typeHelper2, allowPropertyOverride, lc != null ? lc.f3756u : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper, allowPropertyOverride, lc != null ? lc.f3757v : null, function1, Hc.f3065n);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, lc != null ? lc.f3758w : null, this.f3073a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "state_id_variable", allowPropertyOverride, lc != null ? lc.f3759x : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex… parent?.stateIdVariable)");
            Field field2 = lc != null ? lc.f3760y : null;
            W1.h r7 = this.f3073a.r7();
            ListValidator listValidator = Hc.f3066o;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, "states", allowPropertyOverride, field2, r7, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d… STATES_VALIDATOR.cast())");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, lc != null ? lc.f3761z : null, this.f3073a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, lc != null ? lc.f3724A : null, this.f3073a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "transition_animation_selector", Hc.f3061j, allowPropertyOverride, lc != null ? lc.f3725B : null, EnumC0979of.f7417e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…tionSelector.FROM_STRING)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, lc != null ? lc.f3726C : null, this.f3073a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, lc != null ? lc.f3727D : null, this.f3073a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, lc != null ? lc.f3728E : null, this.f3073a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field3 = lc != null ? lc.f3729F : null;
            Function1 function12 = EnumC0997pf.f7541e;
            ListValidator listValidator2 = Hc.f3067p;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field3, function12, listValidator2);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, lc != null ? lc.f3730G : null, this.f3073a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, lc != null ? lc.f3731H : null, this.f3073a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", Hc.f3062k, allowPropertyOverride, lc != null ? lc.f3732I : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, lc != null ? lc.f3733J : null, this.f3073a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, lc != null ? lc.f3734K : null, this.f3073a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, lc != null ? lc.f3735L : null, this.f3073a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new Lc(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField3, readOptionalField3, readOptionalListField4, readOptionalField4, readOptionalListField5, readOptionalField5, readOptionalField6, readOptionalField7, readOptionalField8, readOptionalField9, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalListField6, readOptionalField10, readListField, readOptionalListField7, readOptionalField11, readOptionalFieldWithExpression9, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalListField8, readOptionalListField9, readOptionalListField10, readOptionalFieldWithExpression10, readOptionalField15, readOptionalListField11, readOptionalField16);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Lc value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f3736a, this.f3073a.I());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f3737b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f3738c, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f3739d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f3740e, this.f3073a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f3741f, this.f3073a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f3742g, this.f3073a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "clip_to_bounds", value.f3743h);
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f3744i);
            JsonFieldParser.writeExpressionField(context, jSONObject, "default_state_id", value.f3745j);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f3746k, this.f3073a.N2());
            JsonFieldParser.writeField(context, jSONObject, "div_id", value.f3747l);
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f3748m, this.f3073a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f3749n, this.f3073a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f3750o, this.f3073a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f3751p, this.f3073a.W6());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f3752q);
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f3753r, this.f3073a.N4());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f3754s, this.f3073a.W2());
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f3755t, this.f3073a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f3756u);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f3757v);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f3758w, this.f3073a.v0());
            JsonFieldParser.writeField(context, jSONObject, "state_id_variable", value.f3759x);
            JsonFieldParser.writeListField(context, jSONObject, "states", value.f3760y, this.f3073a.r7());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f3761z, this.f3073a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f3724A, this.f3073a.W8());
            JsonFieldParser.writeExpressionField(context, jSONObject, "transition_animation_selector", value.f3725B, EnumC0979of.f7416d);
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f3726C, this.f3073a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f3727D, this.f3073a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f3728E, this.f3073a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f3729F, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", b9.h.f15456P);
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f3730G, this.f3073a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f3731H, this.f3073a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f3732I, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f3733J, this.f3073a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f3734K, this.f3073a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f3735L, this.f3073a.W6());
            return jSONObject;
        }
    }

    public static final class h implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3074a;

        public h(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3074a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bc resolve(ParsingContext context, Lc template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f3736a, data, "accessibility", this.f3074a.J(), this.f3074a.H());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f3737b, data, "alignment_horizontal", Hc.f3059h, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f3738c, data, "alignment_vertical", Hc.f3060i, EnumC1109w2.f8300e);
            Field field = template.f3739d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Hc.f3063l;
            Expression expression = Hc.f3053b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f3740e, data, "animators", this.f3074a.s1(), this.f3074a.q1());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f3741f, data, io.appmetrica.analytics.impl.L2.f37912g, this.f3074a.E1(), this.f3074a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f3742g, data, "border", this.f3074a.K1(), this.f3074a.I1());
            Field field2 = template.f3743h;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = Hc.f3054c;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "clip_to_bounds", typeHelper2, function12, expression2);
            Expression expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field field3 = template.f3744i;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "column_span", typeHelper3, function13, Hc.f3064m);
            Field field4 = template.f3745j;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "default_state_id", typeHelper4);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f3746k, data, "disappear_actions", this.f3074a.O2(), this.f3074a.M2());
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f3747l, data, "div_id");
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f3748m, data, "extensions", this.f3074a.a3(), this.f3074a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f3749n, data, "focus", this.f3074a.y3(), this.f3074a.w3());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f3750o, data, "functions", this.f3074a.H3(), this.f3074a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f3751p, data, "height", this.f3074a.X6(), this.f3074a.V6());
            if (yb == null) {
                yb = Hc.f3055d;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) JsonFieldResolver.resolveOptional(context, template.f3752q, data, "id");
            Yb yb2 = yb;
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f3753r, data, "layout_provider", this.f3074a.O4(), this.f3074a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f3754s, data, "margins", this.f3074a.X2(), this.f3074a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f3755t, data, "paddings", this.f3074a.X2(), this.f3074a.V2());
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, template.f3756u, data, "reuse_id", typeHelper4);
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, template.f3757v, data, "row_span", typeHelper3, function13, Hc.f3065n);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f3758w, data, "selected_actions", this.f3074a.w0(), this.f3074a.u0());
            String str3 = (String) JsonFieldResolver.resolveOptional(context, template.f3759x, data, "state_id_variable");
            List resolveList = JsonFieldResolver.resolveList(context, template.f3760y, data, "states", this.f3074a.s7(), this.f3074a.q7(), Hc.f3066o);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…Parser, STATES_VALIDATOR)");
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f3761z, data, "tooltips", this.f3074a.L8(), this.f3074a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f3724A, data, "transform", this.f3074a.X8(), this.f3074a.V8());
            Field field5 = template.f3725B;
            TypeHelper typeHelper5 = Hc.f3061j;
            Function1 function14 = EnumC0979of.f7417e;
            Expression expression4 = Hc.f3056e;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "transition_animation_selector", typeHelper5, function14, expression4);
            Expression expression5 = resolveOptionalExpression9 == null ? expression4 : resolveOptionalExpression9;
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f3726C, data, "transition_change", this.f3074a.T1(), this.f3074a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f3727D, data, "transition_in", this.f3074a.y1(), this.f3074a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f3728E, data, "transition_out", this.f3074a.y1(), this.f3074a.w1());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f3729F, data, "transition_triggers", EnumC0997pf.f7541e, Hc.f3067p);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f3730G, data, "variable_triggers", this.f3074a.a9(), this.f3074a.Y8());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f3731H, data, "variables", this.f3074a.g9(), this.f3074a.e9());
            Field field6 = template.f3732I;
            TypeHelper typeHelper6 = Hc.f3062k;
            Function1 function15 = Vf.f5043e;
            Expression expression6 = Hc.f3057f;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "visibility", typeHelper6, function15, expression6);
            if (resolveOptionalExpression10 != null) {
                expression6 = resolveOptionalExpression10;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f3733J, data, "visibility_action", this.f3074a.s9(), this.f3074a.q9());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f3734K, data, "visibility_actions", this.f3074a.s9(), this.f3074a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f3735L, data, "width", this.f3074a.X6(), this.f3074a.V6());
            if (yb3 == null) {
                yb3 = Hc.f3058g;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new Bc(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, c0860i3, expression3, resolveOptionalExpression5, resolveOptionalExpression6, resolveOptionalList3, str, resolveOptionalList4, w5, resolveOptionalList5, yb2, str2, c1079u8, c0754c5, c0754c52, resolveOptionalExpression7, resolveOptionalExpression8, resolveOptionalList6, str3, resolveList, resolveOptionalList7, c0925lf, expression5, abstractC1092v3, o22, o23, resolveOptionalList8, resolveOptionalList9, resolveOptionalList10, expression6, wf, resolveOptionalList11, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f3053b = companion.constant(Double.valueOf(1.0d));
        f3054c = companion.constant(Boolean.TRUE);
        f3055d = new Yb.e(new C0765cg(null, null, null, 7, null));
        f3056e = companion.constant(EnumC0979of.STATE_CHANGE);
        f3057f = companion.constant(Vf.VISIBLE);
        f3058g = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f3059h = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f3068i);
        f3060i = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f3069i);
        f3061j = companion2.from(AbstractC3219i.G(EnumC0979of.values()), c.f3070i);
        f3062k = companion2.from(AbstractC3219i.G(Vf.values()), d.f3071i);
        f3063l = new ValueValidator() { // from class: O1.Cc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = Hc.f(((Double) obj).doubleValue());
                return f4;
            }
        };
        f3064m = new ValueValidator() { // from class: O1.Dc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = Hc.g(((Long) obj).longValue());
                return g4;
            }
        };
        f3065n = new ValueValidator() { // from class: O1.Ec
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = Hc.h(((Long) obj).longValue());
                return h4;
            }
        };
        f3066o = new ListValidator() { // from class: O1.Fc
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean i4;
                i4 = Hc.i(list);
                return i4;
            }
        };
        f3067p = new ListValidator() { // from class: O1.Gc
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean j4;
                j4 = Hc.j(list);
                return j4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
