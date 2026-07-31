package O1;

import O1.C0886jc;
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

/* renamed from: O1.oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0976oc {

    /* renamed from: a, reason: collision with root package name */
    private static final d f7370a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f7371b;

    /* renamed from: c, reason: collision with root package name */
    public static final Yb.e f7372c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f7373d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f7374e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f7375f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f7376g;

    /* renamed from: h, reason: collision with root package name */
    public static final Yb.d f7377h;

    /* renamed from: i, reason: collision with root package name */
    public static final TypeHelper f7378i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeHelper f7379j;

    /* renamed from: k, reason: collision with root package name */
    public static final TypeHelper f7380k;

    /* renamed from: l, reason: collision with root package name */
    public static final ValueValidator f7381l;

    /* renamed from: m, reason: collision with root package name */
    public static final ValueValidator f7382m;

    /* renamed from: n, reason: collision with root package name */
    public static final ValueValidator f7383n;

    /* renamed from: o, reason: collision with root package name */
    public static final ListValidator f7384o;

    /* renamed from: O1.oc$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7385i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    /* renamed from: O1.oc$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f7386i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    /* renamed from: O1.oc$c */
    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f7387i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    /* renamed from: O1.oc$d */
    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* renamed from: O1.oc$e */
    public static final class e implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7388a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7388a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0886jc deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f7388a.H());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", AbstractC0976oc.f7378i, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", AbstractC0976oc.f7379j, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC0976oc.f7381l;
            Expression expression = AbstractC0976oc.f7371b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f7388a.q1());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f7388a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f7388a.I1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper2, function12, AbstractC0976oc.f7382m);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f7388a.M2());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f7388a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f7388a.w3());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f7388a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f7388a.V6());
            if (yb == null) {
                yb = AbstractC0976oc.f7372c;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = AbstractC0976oc.f7373d;
            Yb yb2 = yb;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "is_enabled", typeHelper3, function13, expression2);
            Expression expression3 = readOptionalExpression5 == null ? expression2 : readOptionalExpression5;
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f7388a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f7388a.V2());
            Expression expression4 = AbstractC0976oc.f7374e;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "max_value", typeHelper2, function12, expression4);
            Expression expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            Expression expression6 = AbstractC0976oc.f7375f;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "min_value", typeHelper2, function12, expression6);
            Expression expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f7388a.V2());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "ranges", this.f7388a.e7());
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper2, function12, AbstractC0976oc.f7383n);
            C0839h0 c0839h02 = (C0839h0) JsonPropertyParser.readOptional(context, data, "secondary_value_accessibility", this.f7388a.H());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f7388a.u0());
            X4 x4 = (X4) JsonPropertyParser.readOptional(context, data, "thumb_secondary_style", this.f7388a.S2());
            C0886jc.d dVar = (C0886jc.d) JsonPropertyParser.readOptional(context, data, "thumb_secondary_text_style", this.f7388a.h7());
            String str2 = (String) JsonPropertyParser.readOptional(context, data, "thumb_secondary_value_variable");
            Object read = JsonPropertyParser.read(context, data, "thumb_style", this.f7388a.S2());
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"thu…DrawableJsonEntityParser)");
            X4 x42 = (X4) read;
            C0886jc.d dVar2 = (C0886jc.d) JsonPropertyParser.readOptional(context, data, "thumb_text_style", this.f7388a.h7());
            String str3 = (String) JsonPropertyParser.readOptional(context, data, "thumb_value_variable");
            X4 x43 = (X4) JsonPropertyParser.readOptional(context, data, "tick_mark_active_style", this.f7388a.S2());
            X4 x44 = (X4) JsonPropertyParser.readOptional(context, data, "tick_mark_inactive_style", this.f7388a.S2());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f7388a.J8());
            Object read2 = JsonPropertyParser.read(context, data, "track_active_style", this.f7388a.S2());
            Intrinsics.checkNotNullExpressionValue(read2, "read(context, data, \"tra…DrawableJsonEntityParser)");
            X4 x45 = (X4) read2;
            Object read3 = JsonPropertyParser.read(context, data, "track_inactive_style", this.f7388a.S2());
            Intrinsics.checkNotNullExpressionValue(read3, "read(context, data, \"tra…DrawableJsonEntityParser)");
            X4 x46 = (X4) read3;
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f7388a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f7388a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f7388a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f7388a.w1());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC0976oc.f7384o);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f7388a.Y8());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f7388a.e9());
            TypeHelper typeHelper4 = AbstractC0976oc.f7380k;
            Function1 function14 = Vf.f5043e;
            Expression expression8 = AbstractC0976oc.f7376g;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper4, function14, expression8);
            if (readOptionalExpression10 != null) {
                expression8 = readOptionalExpression10;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f7388a.q9());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f7388a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f7388a.V6());
            if (yb3 == null) {
                yb3 = AbstractC0976oc.f7377h;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0886jc(c0839h0, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, c0860i3, readOptionalExpression4, readOptionalList3, readOptionalList4, w5, readOptionalList5, yb2, str, expression3, c1079u8, c0754c5, expression5, expression7, c0754c52, readOptionalList6, readOptionalExpression8, readOptionalExpression9, c0839h02, readOptionalList7, x4, dVar, str2, x42, dVar2, str3, x43, x44, readOptionalList8, x45, x46, c0925lf, abstractC1092v3, o22, o23, readOptionalList9, readOptionalList10, readOptionalList11, expression8, wf, readOptionalList12, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0886jc value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f7388a.H());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f7388a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f7388a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f7388a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f7388a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f7388a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f7388a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f7388a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f7388a.V6());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonExpressionParser.writeExpression(context, jSONObject, "is_enabled", value.f6649o);
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f7388a.M4());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f7388a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "max_value", value.f6652r);
            JsonExpressionParser.writeExpression(context, jSONObject, "min_value", value.f6653s);
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f7388a.V2());
            JsonPropertyParser.writeList(context, jSONObject, "ranges", value.f6655u, this.f7388a.e7());
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonPropertyParser.write(context, jSONObject, "secondary_value_accessibility", value.f6658x, this.f7388a.H());
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f7388a.u0());
            JsonPropertyParser.write(context, jSONObject, "thumb_secondary_style", value.f6660z, this.f7388a.S2());
            JsonPropertyParser.write(context, jSONObject, "thumb_secondary_text_style", value.f6613A, this.f7388a.h7());
            JsonPropertyParser.write(context, jSONObject, "thumb_secondary_value_variable", value.f6614B);
            JsonPropertyParser.write(context, jSONObject, "thumb_style", value.f6615C, this.f7388a.S2());
            JsonPropertyParser.write(context, jSONObject, "thumb_text_style", value.f6616D, this.f7388a.h7());
            JsonPropertyParser.write(context, jSONObject, "thumb_value_variable", value.f6617E);
            JsonPropertyParser.write(context, jSONObject, "tick_mark_active_style", value.f6618F, this.f7388a.S2());
            JsonPropertyParser.write(context, jSONObject, "tick_mark_inactive_style", value.f6619G, this.f7388a.S2());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f7388a.J8());
            JsonPropertyParser.write(context, jSONObject, "track_active_style", value.f6621I, this.f7388a.S2());
            JsonPropertyParser.write(context, jSONObject, "track_inactive_style", value.f6622J, this.f7388a.S2());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f7388a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f7388a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f7388a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f7388a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "slider");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f7388a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f7388a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f7388a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f7388a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f7388a.V6());
            return jSONObject;
        }
    }

    /* renamed from: O1.oc$f */
    public static final class f implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7389a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7389a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1047sc deserialize(ParsingContext context, C1047sc c1047sc, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, c1047sc != null ? c1047sc.f7890a : null, this.f7389a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", AbstractC0976oc.f7378i, allowPropertyOverride, c1047sc != null ? c1047sc.f7891b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", AbstractC0976oc.f7379j, allowPropertyOverride, c1047sc != null ? c1047sc.f7892c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, c1047sc != null ? c1047sc.f7893d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, AbstractC0976oc.f7381l);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, c1047sc != null ? c1047sc.f7894e : null, this.f7389a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, c1047sc != null ? c1047sc.f7895f : null, this.f7389a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, c1047sc != null ? c1047sc.f7896g : null, this.f7389a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c1047sc != null ? c1047sc.f7897h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper, allowPropertyOverride, field, function1, AbstractC0976oc.f7382m);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, c1047sc != null ? c1047sc.f7898i : null, this.f7389a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, c1047sc != null ? c1047sc.f7899j : null, this.f7389a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, c1047sc != null ? c1047sc.f7900k : null, this.f7389a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, c1047sc != null ? c1047sc.f7901l : null, this.f7389a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, c1047sc != null ? c1047sc.f7902m : null, this.f7389a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, c1047sc != null ? c1047sc.f7903n : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c1047sc != null ? c1047sc.f7904o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…sEnabled, ANY_TO_BOOLEAN)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, c1047sc != null ? c1047sc.f7905p : null, this.f7389a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, c1047sc != null ? c1047sc.f7906q : null, this.f7389a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "max_value", typeHelper, allowPropertyOverride, c1047sc != null ? c1047sc.f7907r : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp….maxValue, NUMBER_TO_INT)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "min_value", typeHelper, allowPropertyOverride, c1047sc != null ? c1047sc.f7908s : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp….minValue, NUMBER_TO_INT)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, c1047sc != null ? c1047sc.f7909t : null, this.f7389a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "ranges", allowPropertyOverride, c1047sc != null ? c1047sc.f7910u : null, this.f7389a.f7());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…rRangeJsonTemplateParser)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c1047sc != null ? c1047sc.f7911v : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper, allowPropertyOverride, c1047sc != null ? c1047sc.f7912w : null, function1, AbstractC0976oc.f7383n);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "secondary_value_accessibility", allowPropertyOverride, c1047sc != null ? c1047sc.f7913x : null, this.f7389a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, c1047sc != null ? c1047sc.f7914y : null, this.f7389a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "thumb_secondary_style", allowPropertyOverride, c1047sc != null ? c1047sc.f7915z : null, this.f7389a.T2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…awableJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "thumb_secondary_text_style", allowPropertyOverride, c1047sc != null ? c1047sc.f7869A : null, this.f7389a.i7());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…tStyleJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "thumb_secondary_value_variable", allowPropertyOverride, c1047sc != null ? c1047sc.f7870B : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…mbSecondaryValueVariable)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "thumb_style", allowPropertyOverride, c1047sc != null ? c1047sc.f7871C : null, this.f7389a.T2());
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…awableJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "thumb_text_style", allowPropertyOverride, c1047sc != null ? c1047sc.f7872D : null, this.f7389a.i7());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…tStyleJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "thumb_value_variable", allowPropertyOverride, c1047sc != null ? c1047sc.f7873E : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…rent?.thumbValueVariable)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "tick_mark_active_style", allowPropertyOverride, c1047sc != null ? c1047sc.f7874F : null, this.f7389a.T2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…awableJsonTemplateParser)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "tick_mark_inactive_style", allowPropertyOverride, c1047sc != null ? c1047sc.f7875G : null, this.f7389a.T2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…awableJsonTemplateParser)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, c1047sc != null ? c1047sc.f7876H : null, this.f7389a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readField2 = JsonFieldParser.readField(restrictPropertyOverride, data, "track_active_style", allowPropertyOverride, c1047sc != null ? c1047sc.f7877I : null, this.f7389a.T2());
            Intrinsics.checkNotNullExpressionValue(readField2, "readField(context, data,…awableJsonTemplateParser)");
            Field readField3 = JsonFieldParser.readField(restrictPropertyOverride, data, "track_inactive_style", allowPropertyOverride, c1047sc != null ? c1047sc.f7878J : null, this.f7389a.T2());
            Intrinsics.checkNotNullExpressionValue(readField3, "readField(context, data,…awableJsonTemplateParser)");
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, c1047sc != null ? c1047sc.f7879K : null, this.f7389a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField17, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField18 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, c1047sc != null ? c1047sc.f7880L : null, this.f7389a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField18, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField19 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, c1047sc != null ? c1047sc.f7881M : null, this.f7389a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField19, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField20 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, c1047sc != null ? c1047sc.f7882N : null, this.f7389a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField20, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field2 = c1047sc != null ? c1047sc.f7883O : null;
            Function1 function12 = EnumC0997pf.f7541e;
            ListValidator listValidator = AbstractC0976oc.f7384o;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field2, function12, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, c1047sc != null ? c1047sc.f7884P : null, this.f7389a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, c1047sc != null ? c1047sc.f7885Q : null, this.f7389a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", AbstractC0976oc.f7380k, allowPropertyOverride, c1047sc != null ? c1047sc.f7886R : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField21 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, c1047sc != null ? c1047sc.f7887S : null, this.f7389a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField21, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, c1047sc != null ? c1047sc.f7888T : null, this.f7389a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField22 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, c1047sc != null ? c1047sc.f7889U : null, this.f7389a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField22, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new C1047sc(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalField4, readOptionalField5, readOptionalFieldWithExpression5, readOptionalField6, readOptionalField7, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalField8, readOptionalListField6, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalField9, readOptionalListField7, readOptionalField10, readOptionalField11, readOptionalField12, readField, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalField16, readOptionalListField8, readField2, readField3, readOptionalField17, readOptionalField18, readOptionalField19, readOptionalField20, readOptionalListField9, readOptionalListField10, readOptionalListField11, readOptionalFieldWithExpression10, readOptionalField21, readOptionalListField12, readOptionalField22);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1047sc value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f7890a, this.f7389a.I());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f7891b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f7892c, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f7893d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f7894e, this.f7389a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f7895f, this.f7389a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f7896g, this.f7389a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f7897h);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f7898i, this.f7389a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f7899j, this.f7389a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f7900k, this.f7389a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f7901l, this.f7389a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f7902m, this.f7389a.W6());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f7903n);
            JsonFieldParser.writeExpressionField(context, jSONObject, "is_enabled", value.f7904o);
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f7905p, this.f7389a.N4());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f7906q, this.f7389a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "max_value", value.f7907r);
            JsonFieldParser.writeExpressionField(context, jSONObject, "min_value", value.f7908s);
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f7909t, this.f7389a.W2());
            JsonFieldParser.writeListField(context, jSONObject, "ranges", value.f7910u, this.f7389a.f7());
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f7911v);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f7912w);
            JsonFieldParser.writeField(context, jSONObject, "secondary_value_accessibility", value.f7913x, this.f7389a.I());
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f7914y, this.f7389a.v0());
            JsonFieldParser.writeField(context, jSONObject, "thumb_secondary_style", value.f7915z, this.f7389a.T2());
            JsonFieldParser.writeField(context, jSONObject, "thumb_secondary_text_style", value.f7869A, this.f7389a.i7());
            JsonFieldParser.writeField(context, jSONObject, "thumb_secondary_value_variable", value.f7870B);
            JsonFieldParser.writeField(context, jSONObject, "thumb_style", value.f7871C, this.f7389a.T2());
            JsonFieldParser.writeField(context, jSONObject, "thumb_text_style", value.f7872D, this.f7389a.i7());
            JsonFieldParser.writeField(context, jSONObject, "thumb_value_variable", value.f7873E);
            JsonFieldParser.writeField(context, jSONObject, "tick_mark_active_style", value.f7874F, this.f7389a.T2());
            JsonFieldParser.writeField(context, jSONObject, "tick_mark_inactive_style", value.f7875G, this.f7389a.T2());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f7876H, this.f7389a.K8());
            JsonFieldParser.writeField(context, jSONObject, "track_active_style", value.f7877I, this.f7389a.T2());
            JsonFieldParser.writeField(context, jSONObject, "track_inactive_style", value.f7878J, this.f7389a.T2());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f7879K, this.f7389a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f7880L, this.f7389a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f7881M, this.f7389a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f7882N, this.f7389a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f7883O, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "slider");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f7884P, this.f7389a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f7885Q, this.f7389a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f7886R, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f7887S, this.f7389a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f7888T, this.f7389a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f7889U, this.f7389a.W6());
            return jSONObject;
        }
    }

    /* renamed from: O1.oc$g */
    public static final class g implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7390a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7390a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0886jc resolve(ParsingContext context, C1047sc template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f7890a, data, "accessibility", this.f7390a.J(), this.f7390a.H());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f7891b, data, "alignment_horizontal", AbstractC0976oc.f7378i, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f7892c, data, "alignment_vertical", AbstractC0976oc.f7379j, EnumC1109w2.f8300e);
            Field field = template.f7893d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC0976oc.f7381l;
            Expression expression = AbstractC0976oc.f7371b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f7894e, data, "animators", this.f7390a.s1(), this.f7390a.q1());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f7895f, data, io.appmetrica.analytics.impl.L2.f37912g, this.f7390a.E1(), this.f7390a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f7896g, data, "border", this.f7390a.K1(), this.f7390a.I1());
            Field field2 = template.f7897h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "column_span", typeHelper2, function12, AbstractC0976oc.f7382m);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f7898i, data, "disappear_actions", this.f7390a.O2(), this.f7390a.M2());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f7899j, data, "extensions", this.f7390a.a3(), this.f7390a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f7900k, data, "focus", this.f7390a.y3(), this.f7390a.w3());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f7901l, data, "functions", this.f7390a.H3(), this.f7390a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f7902m, data, "height", this.f7390a.X6(), this.f7390a.V6());
            if (yb == null) {
                yb = AbstractC0976oc.f7372c;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f7903n, data, "id");
            Yb yb2 = yb;
            Field field3 = template.f7904o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = AbstractC0976oc.f7373d;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "is_enabled", typeHelper3, function13, expression2);
            Expression expression3 = resolveOptionalExpression5 == null ? expression2 : resolveOptionalExpression5;
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f7905p, data, "layout_provider", this.f7390a.O4(), this.f7390a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f7906q, data, "margins", this.f7390a.X2(), this.f7390a.V2());
            Field field4 = template.f7907r;
            Expression expression4 = AbstractC0976oc.f7374e;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "max_value", typeHelper2, function12, expression4);
            Expression expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            Field field5 = template.f7908s;
            Expression expression6 = AbstractC0976oc.f7375f;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "min_value", typeHelper2, function12, expression6);
            Expression expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f7909t, data, "paddings", this.f7390a.X2(), this.f7390a.V2());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f7910u, data, "ranges", this.f7390a.g7(), this.f7390a.e7());
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, template.f7911v, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, template.f7912w, data, "row_span", typeHelper2, function12, AbstractC0976oc.f7383n);
            C0839h0 c0839h02 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f7913x, data, "secondary_value_accessibility", this.f7390a.J(), this.f7390a.H());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f7914y, data, "selected_actions", this.f7390a.w0(), this.f7390a.u0());
            X4 x4 = (X4) JsonFieldResolver.resolveOptional(context, template.f7915z, data, "thumb_secondary_style", this.f7390a.U2(), this.f7390a.S2());
            C0886jc.d dVar = (C0886jc.d) JsonFieldResolver.resolveOptional(context, template.f7869A, data, "thumb_secondary_text_style", this.f7390a.j7(), this.f7390a.h7());
            String str2 = (String) JsonFieldResolver.resolveOptional(context, template.f7870B, data, "thumb_secondary_value_variable");
            Object resolve = JsonFieldResolver.resolve(context, template.f7871C, data, "thumb_style", this.f7390a.U2(), this.f7390a.S2());
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…DrawableJsonEntityParser)");
            X4 x42 = (X4) resolve;
            C0886jc.d dVar2 = (C0886jc.d) JsonFieldResolver.resolveOptional(context, template.f7872D, data, "thumb_text_style", this.f7390a.j7(), this.f7390a.h7());
            String str3 = (String) JsonFieldResolver.resolveOptional(context, template.f7873E, data, "thumb_value_variable");
            X4 x43 = (X4) JsonFieldResolver.resolveOptional(context, template.f7874F, data, "tick_mark_active_style", this.f7390a.U2(), this.f7390a.S2());
            X4 x44 = (X4) JsonFieldResolver.resolveOptional(context, template.f7875G, data, "tick_mark_inactive_style", this.f7390a.U2(), this.f7390a.S2());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f7876H, data, "tooltips", this.f7390a.L8(), this.f7390a.J8());
            Object resolve2 = JsonFieldResolver.resolve(context, template.f7877I, data, "track_active_style", this.f7390a.U2(), this.f7390a.S2());
            Intrinsics.checkNotNullExpressionValue(resolve2, "resolve(context, templat…DrawableJsonEntityParser)");
            X4 x45 = (X4) resolve2;
            Object resolve3 = JsonFieldResolver.resolve(context, template.f7878J, data, "track_inactive_style", this.f7390a.U2(), this.f7390a.S2());
            Intrinsics.checkNotNullExpressionValue(resolve3, "resolve(context, templat…DrawableJsonEntityParser)");
            X4 x46 = (X4) resolve3;
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f7879K, data, "transform", this.f7390a.X8(), this.f7390a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f7880L, data, "transition_change", this.f7390a.T1(), this.f7390a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f7881M, data, "transition_in", this.f7390a.y1(), this.f7390a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f7882N, data, "transition_out", this.f7390a.y1(), this.f7390a.w1());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f7883O, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC0976oc.f7384o);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f7884P, data, "variable_triggers", this.f7390a.a9(), this.f7390a.Y8());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f7885Q, data, "variables", this.f7390a.g9(), this.f7390a.e9());
            Field field6 = template.f7886R;
            TypeHelper typeHelper4 = AbstractC0976oc.f7380k;
            Function1 function14 = Vf.f5043e;
            Expression expression8 = AbstractC0976oc.f7376g;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "visibility", typeHelper4, function14, expression8);
            if (resolveOptionalExpression10 != null) {
                expression8 = resolveOptionalExpression10;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f7887S, data, "visibility_action", this.f7390a.s9(), this.f7390a.q9());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f7888T, data, "visibility_actions", this.f7390a.s9(), this.f7390a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f7889U, data, "width", this.f7390a.X6(), this.f7390a.V6());
            if (yb3 == null) {
                yb3 = AbstractC0976oc.f7377h;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0886jc(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, c0860i3, resolveOptionalExpression4, resolveOptionalList3, resolveOptionalList4, w5, resolveOptionalList5, yb2, str, expression3, c1079u8, c0754c5, expression5, expression7, c0754c52, resolveOptionalList6, resolveOptionalExpression8, resolveOptionalExpression9, c0839h02, resolveOptionalList7, x4, dVar, str2, x42, dVar2, str3, x43, x44, resolveOptionalList8, x45, x46, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression8, wf, resolveOptionalList12, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f7371b = companion.constant(Double.valueOf(1.0d));
        f7372c = new Yb.e(new C0765cg(null, null, null, 7, null));
        f7373d = companion.constant(Boolean.TRUE);
        f7374e = companion.constant(100L);
        f7375f = companion.constant(0L);
        f7376g = companion.constant(Vf.VISIBLE);
        f7377h = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f7378i = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f7385i);
        f7379j = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f7386i);
        f7380k = companion2.from(AbstractC3219i.G(Vf.values()), c.f7387i);
        f7381l = new ValueValidator() { // from class: O1.kc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = AbstractC0976oc.e(((Double) obj).doubleValue());
                return e4;
            }
        };
        f7382m = new ValueValidator() { // from class: O1.lc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = AbstractC0976oc.f(((Long) obj).longValue());
                return f4;
            }
        };
        f7383n = new ValueValidator() { // from class: O1.mc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = AbstractC0976oc.g(((Long) obj).longValue());
                return g4;
            }
        };
        f7384o = new ListValidator() { // from class: O1.nc
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean h4;
                h4 = AbstractC0976oc.h(list);
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
