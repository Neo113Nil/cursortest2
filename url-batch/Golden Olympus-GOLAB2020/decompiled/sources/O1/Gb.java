package O1;

import O1.Ab;
import O1.C1127x2;
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
public abstract class Gb {

    /* renamed from: a, reason: collision with root package name */
    private static final d f2904a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final C1127x2 f2905b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f2906c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f2907d;

    /* renamed from: e, reason: collision with root package name */
    public static final Yb.e f2908e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f2909f;

    /* renamed from: g, reason: collision with root package name */
    public static final Yb.d f2910g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f2911h;

    /* renamed from: i, reason: collision with root package name */
    public static final TypeHelper f2912i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeHelper f2913j;

    /* renamed from: k, reason: collision with root package name */
    public static final ValueValidator f2914k;

    /* renamed from: l, reason: collision with root package name */
    public static final ValueValidator f2915l;

    /* renamed from: m, reason: collision with root package name */
    public static final ValueValidator f2916m;

    /* renamed from: n, reason: collision with root package name */
    public static final ListValidator f2917n;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2918i = new a();

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
        public static final b f2919i = new b();

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
        public static final c f2920i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public static final class e implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2921a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2921a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ab deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f2921a.H());
            C0892k0 c0892k0 = (C0892k0) JsonPropertyParser.readOptional(context, data, "action", this.f2921a.u0());
            C1127x2 c1127x2 = (C1127x2) JsonPropertyParser.readOptional(context, data, "action_animation", this.f2921a.n1());
            if (c1127x2 == null) {
                c1127x2 = Gb.f2905b;
            }
            C1127x2 c1127x22 = c1127x2;
            Intrinsics.checkNotNullExpressionValue(c1127x22, "JsonPropertyParser.readO…N_ANIMATION_DEFAULT_VALUE");
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "actions", this.f2921a.u0());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", Gb.f2911h, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", Gb.f2912i, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Gb.f2914k;
            Expression expression = Gb.f2906c;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, "animators", this.f2921a.q1());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f2921a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f2921a.I1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = Gb.f2907d;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "capture_focus_on_action", typeHelper2, function12, expression2);
            Expression expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper3, function13, Gb.f2915l);
            Ab.c cVar = (Ab.c) JsonPropertyParser.readOptional(context, data, "delimiter_style", this.f2921a.G6());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f2921a.M2());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "doubletap_actions", this.f2921a.u0());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f2921a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f2921a.w3());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f2921a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f2921a.V6());
            if (yb == null) {
                yb = Gb.f2908e;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            Yb yb2 = yb;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "hover_end_actions", this.f2921a.u0());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "hover_start_actions", this.f2921a.u0());
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f2921a.M4());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "longtap_actions", this.f2921a.u0());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f2921a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f2921a.V2());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "press_end_actions", this.f2921a.u0());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "press_start_actions", this.f2921a.u0());
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper3, function13, Gb.f2916m);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f2921a.u0());
            List readOptionalList14 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f2921a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f2921a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f2921a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f2921a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f2921a.w1());
            List readOptionalList15 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, Gb.f2917n);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f2921a.Y8());
            List readOptionalList17 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f2921a.e9());
            TypeHelper typeHelper4 = Gb.f2913j;
            Function1 function14 = Vf.f5043e;
            Expression expression4 = Gb.f2909f;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper4, function14, expression4);
            if (readOptionalExpression8 != null) {
                expression4 = readOptionalExpression8;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f2921a.q9());
            List readOptionalList18 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f2921a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f2921a.V6());
            if (yb3 == null) {
                yb3 = Gb.f2910g;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new Ab(c0839h0, c0892k0, c1127x22, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, readOptionalList3, c0860i3, expression3, readOptionalExpression5, cVar, readOptionalList4, readOptionalList5, readOptionalList6, w5, readOptionalList7, yb2, readOptionalList8, readOptionalList9, str, c1079u8, readOptionalList10, c0754c5, c0754c52, readOptionalList11, readOptionalList12, readOptionalExpression6, readOptionalExpression7, readOptionalList13, readOptionalList14, c0925lf, abstractC1092v3, o22, o23, readOptionalList15, readOptionalList16, readOptionalList17, expression4, wf, readOptionalList18, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Ab value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f2921a.H());
            JsonPropertyParser.write(context, jSONObject, "action", value.f1356b, this.f2921a.u0());
            JsonPropertyParser.write(context, jSONObject, "action_animation", value.f1357c, this.f2921a.n1());
            JsonPropertyParser.writeList(context, jSONObject, "actions", value.f1358d, this.f2921a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f2921a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f2921a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f2921a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "capture_focus_on_action", value.f1365k);
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonPropertyParser.write(context, jSONObject, "delimiter_style", value.f1367m, this.f2921a.G6());
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f2921a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "doubletap_actions", value.f1369o, this.f2921a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f2921a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f2921a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f2921a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f2921a.V6());
            JsonPropertyParser.writeList(context, jSONObject, "hover_end_actions", value.f1374t, this.f2921a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "hover_start_actions", value.f1375u, this.f2921a.u0());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f2921a.M4());
            JsonPropertyParser.writeList(context, jSONObject, "longtap_actions", value.f1378x, this.f2921a.u0());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f2921a.V2());
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f2921a.V2());
            JsonPropertyParser.writeList(context, jSONObject, "press_end_actions", value.f1337A, this.f2921a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "press_start_actions", value.f1338B, this.f2921a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f2921a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f2921a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f2921a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f2921a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f2921a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f2921a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "separator");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f2921a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f2921a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f2921a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f2921a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f2921a.V6());
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2922a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2922a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Hb deserialize(ParsingContext context, Hb hb, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, hb != null ? hb.f3018a : null, this.f2922a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "action", allowPropertyOverride, hb != null ? hb.f3019b : null, this.f2922a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "action_animation", allowPropertyOverride, hb != null ? hb.f3020c : null, this.f2922a.o1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…mationJsonTemplateParser)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "actions", allowPropertyOverride, hb != null ? hb.f3021d : null, this.f2922a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", Gb.f2911h, allowPropertyOverride, hb != null ? hb.f3022e : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", Gb.f2912i, allowPropertyOverride, hb != null ? hb.f3023f : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, hb != null ? hb.f3024g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, Gb.f2914k);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, hb != null ? hb.f3025h : null, this.f2922a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, hb != null ? hb.f3026i : null, this.f2922a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, hb != null ? hb.f3027j : null, this.f2922a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…BorderJsonTemplateParser)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, hb != null ? hb.f3028k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…OnAction, ANY_TO_BOOLEAN)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = hb != null ? hb.f3029l : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper, allowPropertyOverride, field, function1, Gb.f2915l);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "delimiter_style", allowPropertyOverride, hb != null ? hb.f3030m : null, this.f2922a.H6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…rStyleJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, hb != null ? hb.f3031n : null, this.f2922a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "doubletap_actions", allowPropertyOverride, hb != null ? hb.f3032o : null, this.f2922a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, hb != null ? hb.f3033p : null, this.f2922a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, hb != null ? hb.f3034q : null, this.f2922a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, hb != null ? hb.f3035r : null, this.f2922a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, hb != null ? hb.f3036s : null, this.f2922a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "hover_end_actions", allowPropertyOverride, hb != null ? hb.f3037t : null, this.f2922a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "hover_start_actions", allowPropertyOverride, hb != null ? hb.f3038u : null, this.f2922a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, hb != null ? hb.f3039v : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, hb != null ? hb.f3040w : null, this.f2922a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "longtap_actions", allowPropertyOverride, hb != null ? hb.f3041x : null, this.f2922a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, hb != null ? hb.f3042y : null, this.f2922a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, hb != null ? hb.f3043z : null, this.f2922a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "press_end_actions", allowPropertyOverride, hb != null ? hb.f3001A : null, this.f2922a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "press_start_actions", allowPropertyOverride, hb != null ? hb.f3002B : null, this.f2922a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, hb != null ? hb.f3003C : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper, allowPropertyOverride, hb != null ? hb.f3004D : null, function1, Gb.f2916m);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, hb != null ? hb.f3005E : null, this.f2922a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField13, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, hb != null ? hb.f3006F : null, this.f2922a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField14, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, hb != null ? hb.f3007G : null, this.f2922a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, hb != null ? hb.f3008H : null, this.f2922a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, hb != null ? hb.f3009I : null, this.f2922a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, hb != null ? hb.f3010J : null, this.f2922a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field2 = hb != null ? hb.f3011K : null;
            Function1 function12 = EnumC0997pf.f7541e;
            ListValidator listValidator = Gb.f2917n;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field2, function12, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField15, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField16 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, hb != null ? hb.f3012L : null, this.f2922a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField16, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField17 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, hb != null ? hb.f3013M : null, this.f2922a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField17, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", Gb.f2913j, allowPropertyOverride, hb != null ? hb.f3014N : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, hb != null ? hb.f3015O : null, this.f2922a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField18 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, hb != null ? hb.f3016P : null, this.f2922a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField18, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, hb != null ? hb.f3017Q : null, this.f2922a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField17, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new Hb(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalListField3, readOptionalField4, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalField5, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalField6, readOptionalListField7, readOptionalField7, readOptionalListField8, readOptionalListField9, readOptionalField8, readOptionalField9, readOptionalListField10, readOptionalField10, readOptionalField11, readOptionalListField11, readOptionalListField12, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField13, readOptionalListField14, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalListField15, readOptionalListField16, readOptionalListField17, readOptionalFieldWithExpression8, readOptionalField16, readOptionalListField18, readOptionalField17);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Hb value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f3018a, this.f2922a.I());
            JsonFieldParser.writeField(context, jSONObject, "action", value.f3019b, this.f2922a.v0());
            JsonFieldParser.writeField(context, jSONObject, "action_animation", value.f3020c, this.f2922a.o1());
            JsonFieldParser.writeListField(context, jSONObject, "actions", value.f3021d, this.f2922a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f3022e, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f3023f, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f3024g);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f3025h, this.f2922a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f3026i, this.f2922a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f3027j, this.f2922a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "capture_focus_on_action", value.f3028k);
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f3029l);
            JsonFieldParser.writeField(context, jSONObject, "delimiter_style", value.f3030m, this.f2922a.H6());
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f3031n, this.f2922a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "doubletap_actions", value.f3032o, this.f2922a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f3033p, this.f2922a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f3034q, this.f2922a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f3035r, this.f2922a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f3036s, this.f2922a.W6());
            JsonFieldParser.writeListField(context, jSONObject, "hover_end_actions", value.f3037t, this.f2922a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "hover_start_actions", value.f3038u, this.f2922a.v0());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f3039v);
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f3040w, this.f2922a.N4());
            JsonFieldParser.writeListField(context, jSONObject, "longtap_actions", value.f3041x, this.f2922a.v0());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f3042y, this.f2922a.W2());
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f3043z, this.f2922a.W2());
            JsonFieldParser.writeListField(context, jSONObject, "press_end_actions", value.f3001A, this.f2922a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "press_start_actions", value.f3002B, this.f2922a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f3003C);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f3004D);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f3005E, this.f2922a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f3006F, this.f2922a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f3007G, this.f2922a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f3008H, this.f2922a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f3009I, this.f2922a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f3010J, this.f2922a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f3011K, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "separator");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f3012L, this.f2922a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f3013M, this.f2922a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f3014N, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f3015O, this.f2922a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f3016P, this.f2922a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f3017Q, this.f2922a.W6());
            return jSONObject;
        }
    }

    public static final class g implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2923a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2923a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ab resolve(ParsingContext context, Hb template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f3018a, data, "accessibility", this.f2923a.J(), this.f2923a.H());
            C0892k0 c0892k0 = (C0892k0) JsonFieldResolver.resolveOptional(context, template.f3019b, data, "action", this.f2923a.w0(), this.f2923a.u0());
            C1127x2 c1127x2 = (C1127x2) JsonFieldResolver.resolveOptional(context, template.f3020c, data, "action_animation", this.f2923a.p1(), this.f2923a.n1());
            if (c1127x2 == null) {
                c1127x2 = Gb.f2905b;
            }
            C1127x2 c1127x22 = c1127x2;
            Intrinsics.checkNotNullExpressionValue(c1127x22, "JsonFieldResolver.resolv…N_ANIMATION_DEFAULT_VALUE");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f3021d, data, "actions", this.f2923a.w0(), this.f2923a.u0());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f3022e, data, "alignment_horizontal", Gb.f2911h, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f3023f, data, "alignment_vertical", Gb.f2912i, EnumC1109w2.f8300e);
            Field field = template.f3024g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Gb.f2914k;
            Expression expression = Gb.f2906c;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f3025h, data, "animators", this.f2923a.s1(), this.f2923a.q1());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f3026i, data, io.appmetrica.analytics.impl.L2.f37912g, this.f2923a.E1(), this.f2923a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f3027j, data, "border", this.f2923a.K1(), this.f2923a.I1());
            Field field2 = template.f3028k;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = Gb.f2907d;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "capture_focus_on_action", typeHelper2, function12, expression2);
            Expression expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field field3 = template.f3029l;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "column_span", typeHelper3, function13, Gb.f2915l);
            Ab.c cVar = (Ab.c) JsonFieldResolver.resolveOptional(context, template.f3030m, data, "delimiter_style", this.f2923a.I6(), this.f2923a.G6());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f3031n, data, "disappear_actions", this.f2923a.O2(), this.f2923a.M2());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f3032o, data, "doubletap_actions", this.f2923a.w0(), this.f2923a.u0());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f3033p, data, "extensions", this.f2923a.a3(), this.f2923a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f3034q, data, "focus", this.f2923a.y3(), this.f2923a.w3());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f3035r, data, "functions", this.f2923a.H3(), this.f2923a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f3036s, data, "height", this.f2923a.X6(), this.f2923a.V6());
            if (yb == null) {
                yb = Gb.f2908e;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f3037t, data, "hover_end_actions", this.f2923a.w0(), this.f2923a.u0());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f3038u, data, "hover_start_actions", this.f2923a.w0(), this.f2923a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f3039v, data, "id");
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f3040w, data, "layout_provider", this.f2923a.O4(), this.f2923a.M4());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f3041x, data, "longtap_actions", this.f2923a.w0(), this.f2923a.u0());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f3042y, data, "margins", this.f2923a.X2(), this.f2923a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f3043z, data, "paddings", this.f2923a.X2(), this.f2923a.V2());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f3001A, data, "press_end_actions", this.f2923a.w0(), this.f2923a.u0());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f3002B, data, "press_start_actions", this.f2923a.w0(), this.f2923a.u0());
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, template.f3003C, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, template.f3004D, data, "row_span", typeHelper3, function13, Gb.f2916m);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(context, template.f3005E, data, "selected_actions", this.f2923a.w0(), this.f2923a.u0());
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(context, template.f3006F, data, "tooltips", this.f2923a.L8(), this.f2923a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f3007G, data, "transform", this.f2923a.X8(), this.f2923a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f3008H, data, "transition_change", this.f2923a.T1(), this.f2923a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f3009I, data, "transition_in", this.f2923a.y1(), this.f2923a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f3010J, data, "transition_out", this.f2923a.y1(), this.f2923a.w1());
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(context, template.f3011K, data, "transition_triggers", EnumC0997pf.f7541e, Gb.f2917n);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(context, template.f3012L, data, "variable_triggers", this.f2923a.a9(), this.f2923a.Y8());
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(context, template.f3013M, data, "variables", this.f2923a.g9(), this.f2923a.e9());
            Field field4 = template.f3014N;
            TypeHelper typeHelper4 = Gb.f2913j;
            Function1 function14 = Vf.f5043e;
            Expression expression4 = Gb.f2909f;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "visibility", typeHelper4, function14, expression4);
            if (resolveOptionalExpression8 != null) {
                expression4 = resolveOptionalExpression8;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f3015O, data, "visibility_action", this.f2923a.s9(), this.f2923a.q9());
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(context, template.f3016P, data, "visibility_actions", this.f2923a.s9(), this.f2923a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f3017Q, data, "width", this.f2923a.X6(), this.f2923a.V6());
            if (yb3 == null) {
                yb3 = Gb.f2910g;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new Ab(c0839h0, c0892k0, c1127x22, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, resolveOptionalList3, c0860i3, expression3, resolveOptionalExpression5, cVar, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, w5, resolveOptionalList7, yb2, resolveOptionalList8, resolveOptionalList9, str, c1079u8, resolveOptionalList10, c0754c5, c0754c52, resolveOptionalList11, resolveOptionalList12, resolveOptionalExpression6, resolveOptionalExpression7, resolveOptionalList13, resolveOptionalList14, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList15, resolveOptionalList16, resolveOptionalList17, expression4, wf, resolveOptionalList18, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant = companion.constant(100L);
        Expression constant2 = companion.constant(Double.valueOf(0.6d));
        Expression constant3 = companion.constant(C1127x2.c.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f2905b = new C1127x2(constant, constant2, null, null, constant3, null, null, companion.constant(valueOf), 108, null);
        f2906c = companion.constant(valueOf);
        f2907d = companion.constant(Boolean.TRUE);
        f2908e = new Yb.e(new C0765cg(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        f2909f = companion.constant(Vf.VISIBLE);
        f2910g = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f2911h = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f2918i);
        f2912i = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f2919i);
        f2913j = companion2.from(AbstractC3219i.G(Vf.values()), c.f2920i);
        f2914k = new ValueValidator() { // from class: O1.Cb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = Gb.e(((Double) obj).doubleValue());
                return e4;
            }
        };
        f2915l = new ValueValidator() { // from class: O1.Db
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = Gb.f(((Long) obj).longValue());
                return f4;
            }
        };
        f2916m = new ValueValidator() { // from class: O1.Eb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = Gb.g(((Long) obj).longValue());
                return g4;
            }
        };
        f2917n = new ListValidator() { // from class: O1.Fb
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean h4;
                h4 = Gb.h(list);
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
