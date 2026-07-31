package O1;

import O1.Yb;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* renamed from: O1.x4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1129x4 {

    /* renamed from: a, reason: collision with root package name */
    private static final d f8427a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f8428b;

    /* renamed from: c, reason: collision with root package name */
    public static final Yb.e f8429c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f8430d;

    /* renamed from: e, reason: collision with root package name */
    public static final Yb.d f8431e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeHelper f8432f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f8433g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f8434h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f8435i;

    /* renamed from: j, reason: collision with root package name */
    public static final ValueValidator f8436j;

    /* renamed from: k, reason: collision with root package name */
    public static final ValueValidator f8437k;

    /* renamed from: l, reason: collision with root package name */
    public static final ListValidator f8438l;

    /* renamed from: O1.x4$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8439i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    /* renamed from: O1.x4$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8440i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    /* renamed from: O1.x4$c */
    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f8441i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    /* renamed from: O1.x4$d */
    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* renamed from: O1.x4$e */
    public static final class e implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8442a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8442a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1039s4 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f8442a.H());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", AbstractC1129x4.f8432f, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", AbstractC1129x4.f8433g, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC1129x4.f8435i;
            Expression expression = AbstractC1129x4.f8428b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f8442a.q1());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f8442a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f8442a.I1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper2, function12, AbstractC1129x4.f8436j);
            JSONObject jSONObject = (JSONObject) JsonPropertyParser.readOptional(context, data, "custom_props");
            Object read = JsonPropertyParser.read(context, data, "custom_type");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"custom_type\")");
            String str = (String) read;
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f8442a.M2());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f8442a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f8442a.w3());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f8442a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f8442a.V6());
            if (yb == null) {
                yb = AbstractC1129x4.f8429c;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) JsonPropertyParser.readOptional(context, data, "id");
            Yb yb2 = yb;
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, FirebaseAnalytics.Param.ITEMS, this.f8442a.J4());
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f8442a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f8442a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f8442a.V2());
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper2, function12, AbstractC1129x4.f8437k);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f8442a.u0());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f8442a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f8442a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f8442a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f8442a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f8442a.w1());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC1129x4.f8438l);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f8442a.Y8());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f8442a.e9());
            TypeHelper typeHelper3 = AbstractC1129x4.f8434h;
            Function1 function13 = Vf.f5043e;
            Expression expression2 = AbstractC1129x4.f8430d;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper3, function13, expression2);
            if (readOptionalExpression7 != null) {
                expression2 = readOptionalExpression7;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f8442a.q9());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f8442a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f8442a.V6());
            if (yb3 == null) {
                yb3 = AbstractC1129x4.f8431e;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1039s4(c0839h0, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, c0860i3, readOptionalExpression4, jSONObject, str, readOptionalList3, readOptionalList4, w5, readOptionalList5, yb2, str2, readOptionalList6, c1079u8, c0754c5, c0754c52, readOptionalExpression5, readOptionalExpression6, readOptionalList7, readOptionalList8, c0925lf, abstractC1092v3, o22, o23, readOptionalList9, readOptionalList10, readOptionalList11, expression2, wf, readOptionalList12, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1039s4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f8442a.H());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f8442a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f8442a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f8442a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonPropertyParser.write(context, jSONObject, "custom_props", value.f7833i);
            JsonPropertyParser.write(context, jSONObject, "custom_type", value.f7834j);
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f8442a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f8442a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f8442a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f8442a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f8442a.V6());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonPropertyParser.writeList(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f7841q, this.f8442a.J4());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f8442a.M4());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f8442a.V2());
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f8442a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f8442a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f8442a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f8442a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f8442a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f8442a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f8442a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "custom");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f8442a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f8442a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f8442a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f8442a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f8442a.V6());
            return jSONObject;
        }
    }

    /* renamed from: O1.x4$f */
    public static final class f implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8443a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8443a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1147y4 deserialize(ParsingContext context, C1147y4 c1147y4, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, c1147y4 != null ? c1147y4.f8548a : null, this.f8443a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", AbstractC1129x4.f8432f, allowPropertyOverride, c1147y4 != null ? c1147y4.f8549b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", AbstractC1129x4.f8433g, allowPropertyOverride, c1147y4 != null ? c1147y4.f8550c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, c1147y4 != null ? c1147y4.f8551d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, AbstractC1129x4.f8435i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, c1147y4 != null ? c1147y4.f8552e : null, this.f8443a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, c1147y4 != null ? c1147y4.f8553f : null, this.f8443a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, c1147y4 != null ? c1147y4.f8554g : null, this.f8443a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c1147y4 != null ? c1147y4.f8555h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper, allowPropertyOverride, field, function1, AbstractC1129x4.f8436j);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "custom_props", allowPropertyOverride, c1147y4 != null ? c1147y4.f8556i : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…ide, parent?.customProps)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "custom_type", allowPropertyOverride, c1147y4 != null ? c1147y4.f8557j : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…ride, parent?.customType)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, c1147y4 != null ? c1147y4.f8558k : null, this.f8443a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, c1147y4 != null ? c1147y4.f8559l : null, this.f8443a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, c1147y4 != null ? c1147y4.f8560m : null, this.f8443a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, c1147y4 != null ? c1147y4.f8561n : null, this.f8443a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, c1147y4 != null ? c1147y4.f8562o : null, this.f8443a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, c1147y4 != null ? c1147y4.f8563p : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, c1147y4 != null ? c1147y4.f8564q : null, this.f8443a.K4());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…nt.divJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, c1147y4 != null ? c1147y4.f8565r : null, this.f8443a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, c1147y4 != null ? c1147y4.f8566s : null, this.f8443a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, c1147y4 != null ? c1147y4.f8567t : null, this.f8443a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c1147y4 != null ? c1147y4.f8568u : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper, allowPropertyOverride, c1147y4 != null ? c1147y4.f8569v : null, function1, AbstractC1129x4.f8437k);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, c1147y4 != null ? c1147y4.f8570w : null, this.f8443a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, c1147y4 != null ? c1147y4.f8571x : null, this.f8443a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, c1147y4 != null ? c1147y4.f8572y : null, this.f8443a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, c1147y4 != null ? c1147y4.f8573z : null, this.f8443a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, c1147y4 != null ? c1147y4.f8539A : null, this.f8443a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, c1147y4 != null ? c1147y4.f8540B : null, this.f8443a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field2 = c1147y4 != null ? c1147y4.f8541C : null;
            Function1 function12 = EnumC0997pf.f7541e;
            ListValidator listValidator = AbstractC1129x4.f8438l;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field2, function12, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, c1147y4 != null ? c1147y4.f8542D : null, this.f8443a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, c1147y4 != null ? c1147y4.f8543E : null, this.f8443a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", AbstractC1129x4.f8434h, allowPropertyOverride, c1147y4 != null ? c1147y4.f8544F : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, c1147y4 != null ? c1147y4.f8545G : null, this.f8443a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, c1147y4 != null ? c1147y4.f8546H : null, this.f8443a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, c1147y4 != null ? c1147y4.f8547I : null, this.f8443a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new C1147y4(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalField3, readField, readOptionalListField3, readOptionalListField4, readOptionalField4, readOptionalListField5, readOptionalField5, readOptionalField6, readOptionalListField6, readOptionalField7, readOptionalField8, readOptionalField9, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField7, readOptionalListField8, readOptionalField10, readOptionalField11, readOptionalField12, readOptionalField13, readOptionalListField9, readOptionalListField10, readOptionalListField11, readOptionalFieldWithExpression7, readOptionalField14, readOptionalListField12, readOptionalField15);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1147y4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f8548a, this.f8443a.I());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f8549b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f8550c, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f8551d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f8552e, this.f8443a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f8553f, this.f8443a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f8554g, this.f8443a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f8555h);
            JsonFieldParser.writeField(context, jSONObject, "custom_props", value.f8556i);
            JsonFieldParser.writeField(context, jSONObject, "custom_type", value.f8557j);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f8558k, this.f8443a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f8559l, this.f8443a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f8560m, this.f8443a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f8561n, this.f8443a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f8562o, this.f8443a.W6());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f8563p);
            JsonFieldParser.writeListField(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f8564q, this.f8443a.K4());
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f8565r, this.f8443a.N4());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f8566s, this.f8443a.W2());
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f8567t, this.f8443a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f8568u);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f8569v);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f8570w, this.f8443a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f8571x, this.f8443a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f8572y, this.f8443a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f8573z, this.f8443a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f8539A, this.f8443a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f8540B, this.f8443a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f8541C, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "custom");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f8542D, this.f8443a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f8543E, this.f8443a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f8544F, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f8545G, this.f8443a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f8546H, this.f8443a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f8547I, this.f8443a.W6());
            return jSONObject;
        }
    }

    /* renamed from: O1.x4$g */
    public static final class g implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8444a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8444a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1039s4 resolve(ParsingContext context, C1147y4 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f8548a, data, "accessibility", this.f8444a.J(), this.f8444a.H());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f8549b, data, "alignment_horizontal", AbstractC1129x4.f8432f, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f8550c, data, "alignment_vertical", AbstractC1129x4.f8433g, EnumC1109w2.f8300e);
            Field field = template.f8551d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC1129x4.f8435i;
            Expression expression = AbstractC1129x4.f8428b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f8552e, data, "animators", this.f8444a.s1(), this.f8444a.q1());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f8553f, data, io.appmetrica.analytics.impl.L2.f37912g, this.f8444a.E1(), this.f8444a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f8554g, data, "border", this.f8444a.K1(), this.f8444a.I1());
            Field field2 = template.f8555h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "column_span", typeHelper2, function12, AbstractC1129x4.f8436j);
            JSONObject jSONObject = (JSONObject) JsonFieldResolver.resolveOptional(context, template.f8556i, data, "custom_props");
            Object resolve = JsonFieldResolver.resolve(context, template.f8557j, data, "custom_type");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…ype, data, \"custom_type\")");
            String str = (String) resolve;
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f8558k, data, "disappear_actions", this.f8444a.O2(), this.f8444a.M2());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f8559l, data, "extensions", this.f8444a.a3(), this.f8444a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f8560m, data, "focus", this.f8444a.y3(), this.f8444a.w3());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f8561n, data, "functions", this.f8444a.H3(), this.f8444a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f8562o, data, "height", this.f8444a.X6(), this.f8444a.V6());
            if (yb == null) {
                yb = AbstractC1129x4.f8429c;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) JsonFieldResolver.resolveOptional(context, template.f8563p, data, "id");
            Yb yb2 = yb;
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f8564q, data, FirebaseAnalytics.Param.ITEMS, this.f8444a.L4(), this.f8444a.J4());
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f8565r, data, "layout_provider", this.f8444a.O4(), this.f8444a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f8566s, data, "margins", this.f8444a.X2(), this.f8444a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f8567t, data, "paddings", this.f8444a.X2(), this.f8444a.V2());
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, template.f8568u, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, template.f8569v, data, "row_span", typeHelper2, function12, AbstractC1129x4.f8437k);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f8570w, data, "selected_actions", this.f8444a.w0(), this.f8444a.u0());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f8571x, data, "tooltips", this.f8444a.L8(), this.f8444a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f8572y, data, "transform", this.f8444a.X8(), this.f8444a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f8573z, data, "transition_change", this.f8444a.T1(), this.f8444a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f8539A, data, "transition_in", this.f8444a.y1(), this.f8444a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f8540B, data, "transition_out", this.f8444a.y1(), this.f8444a.w1());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f8541C, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC1129x4.f8438l);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f8542D, data, "variable_triggers", this.f8444a.a9(), this.f8444a.Y8());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f8543E, data, "variables", this.f8444a.g9(), this.f8444a.e9());
            Field field3 = template.f8544F;
            TypeHelper typeHelper3 = AbstractC1129x4.f8434h;
            Function1 function13 = Vf.f5043e;
            Expression expression2 = AbstractC1129x4.f8430d;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "visibility", typeHelper3, function13, expression2);
            if (resolveOptionalExpression7 != null) {
                expression2 = resolveOptionalExpression7;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f8545G, data, "visibility_action", this.f8444a.s9(), this.f8444a.q9());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f8546H, data, "visibility_actions", this.f8444a.s9(), this.f8444a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f8547I, data, "width", this.f8444a.X6(), this.f8444a.V6());
            if (yb3 == null) {
                yb3 = AbstractC1129x4.f8431e;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1039s4(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, c0860i3, resolveOptionalExpression4, jSONObject, str, resolveOptionalList3, resolveOptionalList4, w5, resolveOptionalList5, yb2, str2, resolveOptionalList6, c1079u8, c0754c5, c0754c52, resolveOptionalExpression5, resolveOptionalExpression6, resolveOptionalList7, resolveOptionalList8, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression2, wf, resolveOptionalList12, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f8428b = companion.constant(Double.valueOf(1.0d));
        f8429c = new Yb.e(new C0765cg(null, null, null, 7, null));
        f8430d = companion.constant(Vf.VISIBLE);
        f8431e = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f8432f = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f8439i);
        f8433g = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f8440i);
        f8434h = companion2.from(AbstractC3219i.G(Vf.values()), c.f8441i);
        f8435i = new ValueValidator() { // from class: O1.t4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = AbstractC1129x4.e(((Double) obj).doubleValue());
                return e4;
            }
        };
        f8436j = new ValueValidator() { // from class: O1.u4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = AbstractC1129x4.f(((Long) obj).longValue());
                return f4;
            }
        };
        f8437k = new ValueValidator() { // from class: O1.v4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = AbstractC1129x4.g(((Long) obj).longValue());
                return g4;
            }
        };
        f8438l = new ListValidator() { // from class: O1.w4
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean h4;
                h4 = AbstractC1129x4.h(list);
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
