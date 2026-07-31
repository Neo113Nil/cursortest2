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

/* renamed from: O1.od, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0977od {

    /* renamed from: a, reason: collision with root package name */
    private static final d f7391a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f7392b;

    /* renamed from: c, reason: collision with root package name */
    public static final Yb.e f7393c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f7394d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f7395e;

    /* renamed from: f, reason: collision with root package name */
    public static final Yb.d f7396f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f7397g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f7398h;

    /* renamed from: i, reason: collision with root package name */
    public static final TypeHelper f7399i;

    /* renamed from: j, reason: collision with root package name */
    public static final ValueValidator f7400j;

    /* renamed from: k, reason: collision with root package name */
    public static final ValueValidator f7401k;

    /* renamed from: l, reason: collision with root package name */
    public static final ValueValidator f7402l;

    /* renamed from: m, reason: collision with root package name */
    public static final ListValidator f7403m;

    /* renamed from: O1.od$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7404i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    /* renamed from: O1.od$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f7405i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    /* renamed from: O1.od$c */
    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f7406i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    /* renamed from: O1.od$d */
    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* renamed from: O1.od$e */
    public static final class e implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7407a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7407a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0887jd deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f7407a.H());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", AbstractC0977od.f7397g, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", AbstractC0977od.f7398h, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC0977od.f7400j;
            Expression expression = AbstractC0977od.f7392b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f7407a.q1());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f7407a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f7407a.I1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper2, function12, AbstractC0977od.f7401k);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f7407a.M2());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f7407a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f7407a.w3());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f7407a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f7407a.V6());
            if (yb == null) {
                yb = AbstractC0977od.f7393c;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = AbstractC0977od.f7394d;
            Yb yb2 = yb;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "is_enabled", typeHelper3, function13, expression2);
            Expression expression3 = readOptionalExpression5 == null ? expression2 : readOptionalExpression5;
            Object read = JsonPropertyParser.read(context, data, "is_on_variable");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"is_on_variable\")");
            String str2 = (String) read;
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f7407a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f7407a.V2());
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f7407a.V2());
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper2, function12, AbstractC0977od.f7402l);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f7407a.u0());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f7407a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f7407a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f7407a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f7407a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f7407a.w1());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC0977od.f7403m);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f7407a.Y8());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f7407a.e9());
            TypeHelper typeHelper4 = AbstractC0977od.f7399i;
            Function1 function14 = Vf.f5043e;
            Expression expression4 = AbstractC0977od.f7395e;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper4, function14, expression4);
            if (readOptionalExpression9 != null) {
                expression4 = readOptionalExpression9;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f7407a.q9());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f7407a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f7407a.V6());
            if (yb3 == null) {
                yb3 = AbstractC0977od.f7396f;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0887jd(c0839h0, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, c0860i3, readOptionalExpression4, readOptionalList3, readOptionalList4, w5, readOptionalList5, yb2, str, expression3, str2, c1079u8, c0754c5, readOptionalExpression6, c0754c52, readOptionalExpression7, readOptionalExpression8, readOptionalList6, readOptionalList7, c0925lf, abstractC1092v3, o22, o23, readOptionalList8, readOptionalList9, readOptionalList10, expression4, wf, readOptionalList11, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0887jd value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f7407a.H());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f7407a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f7407a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f7407a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f7407a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f7407a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f7407a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f7407a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f7407a.V6());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonExpressionParser.writeExpression(context, jSONObject, "is_enabled", value.f6720o);
            JsonPropertyParser.write(context, jSONObject, "is_on_variable", value.f6721p);
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f7407a.M4());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f7407a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "on_color", value.f6724s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f7407a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f7407a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f7407a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f7407a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f7407a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f7407a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f7407a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "switch");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f7407a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f7407a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f7407a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f7407a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f7407a.V6());
            return jSONObject;
        }
    }

    /* renamed from: O1.od$f */
    public static final class f implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7408a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7408a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0995pd deserialize(ParsingContext context, C0995pd c0995pd, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, c0995pd != null ? c0995pd.f7507a : null, this.f7408a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", AbstractC0977od.f7397g, allowPropertyOverride, c0995pd != null ? c0995pd.f7508b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", AbstractC0977od.f7398h, allowPropertyOverride, c0995pd != null ? c0995pd.f7509c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, c0995pd != null ? c0995pd.f7510d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, AbstractC0977od.f7400j);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, c0995pd != null ? c0995pd.f7511e : null, this.f7408a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, c0995pd != null ? c0995pd.f7512f : null, this.f7408a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, c0995pd != null ? c0995pd.f7513g : null, this.f7408a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c0995pd != null ? c0995pd.f7514h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper, allowPropertyOverride, field, function1, AbstractC0977od.f7401k);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, c0995pd != null ? c0995pd.f7515i : null, this.f7408a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, c0995pd != null ? c0995pd.f7516j : null, this.f7408a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, c0995pd != null ? c0995pd.f7517k : null, this.f7408a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, c0995pd != null ? c0995pd.f7518l : null, this.f7408a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, c0995pd != null ? c0995pd.f7519m : null, this.f7408a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, c0995pd != null ? c0995pd.f7520n : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c0995pd != null ? c0995pd.f7521o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…sEnabled, ANY_TO_BOOLEAN)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "is_on_variable", allowPropertyOverride, c0995pd != null ? c0995pd.f7522p : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…de, parent?.isOnVariable)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, c0995pd != null ? c0995pd.f7523q : null, this.f7408a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, c0995pd != null ? c0995pd.f7524r : null, this.f7408a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, c0995pd != null ? c0995pd.f7525s : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, c0995pd != null ? c0995pd.f7526t : null, this.f7408a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c0995pd != null ? c0995pd.f7527u : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper, allowPropertyOverride, c0995pd != null ? c0995pd.f7528v : null, function1, AbstractC0977od.f7402l);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, c0995pd != null ? c0995pd.f7529w : null, this.f7408a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, c0995pd != null ? c0995pd.f7530x : null, this.f7408a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, c0995pd != null ? c0995pd.f7531y : null, this.f7408a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, c0995pd != null ? c0995pd.f7532z : null, this.f7408a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, c0995pd != null ? c0995pd.f7498A : null, this.f7408a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, c0995pd != null ? c0995pd.f7499B : null, this.f7408a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field2 = c0995pd != null ? c0995pd.f7500C : null;
            Function1 function12 = EnumC0997pf.f7541e;
            ListValidator listValidator = AbstractC0977od.f7403m;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field2, function12, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, c0995pd != null ? c0995pd.f7501D : null, this.f7408a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, c0995pd != null ? c0995pd.f7502E : null, this.f7408a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", AbstractC0977od.f7399i, allowPropertyOverride, c0995pd != null ? c0995pd.f7503F : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, c0995pd != null ? c0995pd.f7504G : null, this.f7408a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, c0995pd != null ? c0995pd.f7505H : null, this.f7408a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, c0995pd != null ? c0995pd.f7506I : null, this.f7408a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new C0995pd(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalField4, readOptionalField5, readOptionalFieldWithExpression5, readField, readOptionalField6, readOptionalField7, readOptionalFieldWithExpression6, readOptionalField8, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalListField6, readOptionalListField7, readOptionalField9, readOptionalField10, readOptionalField11, readOptionalField12, readOptionalListField8, readOptionalListField9, readOptionalListField10, readOptionalFieldWithExpression9, readOptionalField13, readOptionalListField11, readOptionalField14);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0995pd value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f7507a, this.f7408a.I());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f7508b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f7509c, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f7510d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f7511e, this.f7408a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f7512f, this.f7408a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f7513g, this.f7408a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f7514h);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f7515i, this.f7408a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f7516j, this.f7408a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f7517k, this.f7408a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f7518l, this.f7408a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f7519m, this.f7408a.W6());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f7520n);
            JsonFieldParser.writeExpressionField(context, jSONObject, "is_enabled", value.f7521o);
            JsonFieldParser.writeField(context, jSONObject, "is_on_variable", value.f7522p);
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f7523q, this.f7408a.N4());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f7524r, this.f7408a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "on_color", value.f7525s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f7526t, this.f7408a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f7527u);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f7528v);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f7529w, this.f7408a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f7530x, this.f7408a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f7531y, this.f7408a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f7532z, this.f7408a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f7498A, this.f7408a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f7499B, this.f7408a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f7500C, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "switch");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f7501D, this.f7408a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f7502E, this.f7408a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f7503F, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f7504G, this.f7408a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f7505H, this.f7408a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f7506I, this.f7408a.W6());
            return jSONObject;
        }
    }

    /* renamed from: O1.od$g */
    public static final class g implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7409a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7409a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0887jd resolve(ParsingContext context, C0995pd template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f7507a, data, "accessibility", this.f7409a.J(), this.f7409a.H());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f7508b, data, "alignment_horizontal", AbstractC0977od.f7397g, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f7509c, data, "alignment_vertical", AbstractC0977od.f7398h, EnumC1109w2.f8300e);
            Field field = template.f7510d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC0977od.f7400j;
            Expression expression = AbstractC0977od.f7392b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f7511e, data, "animators", this.f7409a.s1(), this.f7409a.q1());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f7512f, data, io.appmetrica.analytics.impl.L2.f37912g, this.f7409a.E1(), this.f7409a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f7513g, data, "border", this.f7409a.K1(), this.f7409a.I1());
            Field field2 = template.f7514h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "column_span", typeHelper2, function12, AbstractC0977od.f7401k);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f7515i, data, "disappear_actions", this.f7409a.O2(), this.f7409a.M2());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f7516j, data, "extensions", this.f7409a.a3(), this.f7409a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f7517k, data, "focus", this.f7409a.y3(), this.f7409a.w3());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f7518l, data, "functions", this.f7409a.H3(), this.f7409a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f7519m, data, "height", this.f7409a.X6(), this.f7409a.V6());
            if (yb == null) {
                yb = AbstractC0977od.f7393c;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f7520n, data, "id");
            Yb yb2 = yb;
            Field field3 = template.f7521o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = AbstractC0977od.f7394d;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "is_enabled", typeHelper3, function13, expression2);
            Expression expression3 = resolveOptionalExpression5 == null ? expression2 : resolveOptionalExpression5;
            Object resolve = JsonFieldResolver.resolve(context, template.f7522p, data, "is_on_variable");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…, data, \"is_on_variable\")");
            String str2 = (String) resolve;
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f7523q, data, "layout_provider", this.f7409a.O4(), this.f7409a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f7524r, data, "margins", this.f7409a.X2(), this.f7409a.V2());
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, template.f7525s, data, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f7526t, data, "paddings", this.f7409a.X2(), this.f7409a.V2());
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, template.f7527u, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, template.f7528v, data, "row_span", typeHelper2, function12, AbstractC0977od.f7402l);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f7529w, data, "selected_actions", this.f7409a.w0(), this.f7409a.u0());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f7530x, data, "tooltips", this.f7409a.L8(), this.f7409a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f7531y, data, "transform", this.f7409a.X8(), this.f7409a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f7532z, data, "transition_change", this.f7409a.T1(), this.f7409a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f7498A, data, "transition_in", this.f7409a.y1(), this.f7409a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f7499B, data, "transition_out", this.f7409a.y1(), this.f7409a.w1());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f7500C, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC0977od.f7403m);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f7501D, data, "variable_triggers", this.f7409a.a9(), this.f7409a.Y8());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f7502E, data, "variables", this.f7409a.g9(), this.f7409a.e9());
            Field field4 = template.f7503F;
            TypeHelper typeHelper4 = AbstractC0977od.f7399i;
            Function1 function14 = Vf.f5043e;
            Expression expression4 = AbstractC0977od.f7395e;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "visibility", typeHelper4, function14, expression4);
            if (resolveOptionalExpression9 != null) {
                expression4 = resolveOptionalExpression9;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f7504G, data, "visibility_action", this.f7409a.s9(), this.f7409a.q9());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f7505H, data, "visibility_actions", this.f7409a.s9(), this.f7409a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f7506I, data, "width", this.f7409a.X6(), this.f7409a.V6());
            if (yb3 == null) {
                yb3 = AbstractC0977od.f7396f;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0887jd(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, c0860i3, resolveOptionalExpression4, resolveOptionalList3, resolveOptionalList4, w5, resolveOptionalList5, yb2, str, expression3, str2, c1079u8, c0754c5, resolveOptionalExpression6, c0754c52, resolveOptionalExpression7, resolveOptionalExpression8, resolveOptionalList6, resolveOptionalList7, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList8, resolveOptionalList9, resolveOptionalList10, expression4, wf, resolveOptionalList11, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f7392b = companion.constant(Double.valueOf(1.0d));
        f7393c = new Yb.e(new C0765cg(null, null, null, 7, null));
        f7394d = companion.constant(Boolean.TRUE);
        f7395e = companion.constant(Vf.VISIBLE);
        f7396f = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f7397g = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f7404i);
        f7398h = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f7405i);
        f7399i = companion2.from(AbstractC3219i.G(Vf.values()), c.f7406i);
        f7400j = new ValueValidator() { // from class: O1.kd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = AbstractC0977od.e(((Double) obj).doubleValue());
                return e4;
            }
        };
        f7401k = new ValueValidator() { // from class: O1.ld
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = AbstractC0977od.f(((Long) obj).longValue());
                return f4;
            }
        };
        f7402l = new ValueValidator() { // from class: O1.md
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = AbstractC0977od.g(((Long) obj).longValue());
                return g4;
            }
        };
        f7403m = new ListValidator() { // from class: O1.nd
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean h4;
                h4 = AbstractC0977od.h(list);
                return h4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
