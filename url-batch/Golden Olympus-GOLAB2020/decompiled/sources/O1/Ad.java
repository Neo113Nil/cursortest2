package O1;

import O1.C1013qd;
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

/* loaded from: classes2.dex */
public abstract class Ad {

    /* renamed from: a, reason: collision with root package name */
    private static final d f1403a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f1404b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f1405c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f1406d;

    /* renamed from: e, reason: collision with root package name */
    public static final Yb.e f1407e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f1408f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f1409g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f1410h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0754c5 f1411i;

    /* renamed from: j, reason: collision with root package name */
    public static final Expression f1412j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0754c5 f1413k;

    /* renamed from: l, reason: collision with root package name */
    public static final Expression f1414l;

    /* renamed from: m, reason: collision with root package name */
    public static final Yb.d f1415m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeHelper f1416n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeHelper f1417o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeHelper f1418p;

    /* renamed from: q, reason: collision with root package name */
    public static final ValueValidator f1419q;

    /* renamed from: r, reason: collision with root package name */
    public static final ValueValidator f1420r;

    /* renamed from: s, reason: collision with root package name */
    public static final ListValidator f1421s;

    /* renamed from: t, reason: collision with root package name */
    public static final ValueValidator f1422t;

    /* renamed from: u, reason: collision with root package name */
    public static final ValueValidator f1423u;

    /* renamed from: v, reason: collision with root package name */
    public static final ListValidator f1424v;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1425i = new a();

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
        public static final b f1426i = new b();

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
        public static final c f1427i = new c();

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
        private final Cg f1428a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1428a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1013qd deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f1428a.H());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", Ad.f1416n, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", Ad.f1417o, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Ad.f1419q;
            Expression expression = Ad.f1404b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f1428a.q1());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f1428a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f1428a.I1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper2, function12, Ad.f1420r);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f1428a.M2());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = Ad.f1405c;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "dynamic_height", typeHelper3, function13, expression3);
            Expression expression4 = readOptionalExpression5 == null ? expression3 : readOptionalExpression5;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f1428a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f1428a.w3());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f1428a.F3());
            Expression expression5 = Ad.f1406d;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "has_separator", typeHelper3, function13, expression5);
            Expression expression6 = readOptionalExpression6 == null ? expression5 : readOptionalExpression6;
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f1428a.V6());
            if (yb == null) {
                yb = Ad.f1407e;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            Yb yb2 = yb;
            List readList = JsonPropertyParser.readList(context, data, FirebaseAnalytics.Param.ITEMS, this.f1428a.L7(), Ad.f1421s);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …yParser, ITEMS_VALIDATOR)");
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f1428a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f1428a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f1428a.V2());
            Expression expression7 = Ad.f1408f;
            Expression expression8 = expression2;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "restrict_parent_scroll", typeHelper3, function13, expression7);
            Expression expression9 = readOptionalExpression7 == null ? expression7 : readOptionalExpression7;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper2, function12, Ad.f1422t);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f1428a.u0());
            ValueValidator valueValidator2 = Ad.f1423u;
            Expression expression10 = Ad.f1409g;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "selected_tab", typeHelper2, function12, valueValidator2, expression10);
            if (readOptionalExpression10 != null) {
                expression10 = readOptionalExpression10;
            }
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression11 = Ad.f1410h;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "separator_color", typeHelper4, function14, expression11);
            Expression expression12 = readOptionalExpression11 == null ? expression11 : readOptionalExpression11;
            C0754c5 c0754c53 = (C0754c5) JsonPropertyParser.readOptional(context, data, "separator_paddings", this.f1428a.V2());
            if (c0754c53 == null) {
                c0754c53 = Ad.f1411i;
            }
            Intrinsics.checkNotNullExpressionValue(c0754c53, "JsonPropertyParser.readO…OR_PADDINGS_DEFAULT_VALUE");
            Expression expression13 = Ad.f1412j;
            C0754c5 c0754c54 = c0754c53;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "switch_tabs_by_content_swipe_enabled", typeHelper3, function13, expression13);
            Expression expression14 = readOptionalExpression12 == null ? expression13 : readOptionalExpression12;
            C1013qd.d dVar = (C1013qd.d) JsonPropertyParser.readOptional(context, data, "tab_title_delimiter", this.f1428a.R7());
            C1013qd.e eVar = (C1013qd.e) JsonPropertyParser.readOptional(context, data, "tab_title_style", this.f1428a.U7());
            C0754c5 c0754c55 = (C0754c5) JsonPropertyParser.readOptional(context, data, "title_paddings", this.f1428a.V2());
            if (c0754c55 == null) {
                c0754c55 = Ad.f1413k;
            }
            Intrinsics.checkNotNullExpressionValue(c0754c55, "JsonPropertyParser.readO…LE_PADDINGS_DEFAULT_VALUE");
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f1428a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f1428a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f1428a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f1428a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f1428a.w1());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, Ad.f1424v);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f1428a.Y8());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f1428a.e9());
            TypeHelper typeHelper5 = Ad.f1418p;
            Function1 function15 = Vf.f5043e;
            Expression expression15 = Ad.f1414l;
            C0754c5 c0754c56 = c0754c55;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper5, function15, expression15);
            if (readOptionalExpression13 != null) {
                expression15 = readOptionalExpression13;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f1428a.q9());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f1428a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f1428a.V6());
            if (yb3 == null) {
                yb3 = Ad.f1415m;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1013qd(c0839h0, readOptionalExpression, readOptionalExpression2, expression8, readOptionalList, readOptionalList2, c0860i3, readOptionalExpression4, readOptionalList3, expression4, readOptionalList4, w5, readOptionalList5, expression6, yb2, str, readList, c1079u8, c0754c5, c0754c52, expression9, readOptionalExpression8, readOptionalExpression9, readOptionalList6, expression10, expression12, c0754c54, expression14, dVar, eVar, c0754c56, readOptionalList7, c0925lf, abstractC1092v3, o22, o23, readOptionalList8, readOptionalList9, readOptionalList10, expression15, wf, readOptionalList11, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1013qd value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f1428a.H());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f1428a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f1428a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f1428a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f1428a.M2());
            JsonExpressionParser.writeExpression(context, jSONObject, "dynamic_height", value.f7623j);
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f1428a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f1428a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f1428a.F3());
            JsonExpressionParser.writeExpression(context, jSONObject, "has_separator", value.f7627n);
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f1428a.V6());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonPropertyParser.writeList(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f7630q, this.f1428a.L7());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f1428a.M4());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f1428a.V2());
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f1428a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "restrict_parent_scroll", value.f7634u);
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f1428a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "selected_tab", value.f7638y);
            JsonExpressionParser.writeExpression(context, jSONObject, "separator_color", value.f7639z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "separator_paddings", value.f7595A, this.f1428a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "switch_tabs_by_content_swipe_enabled", value.f7596B);
            JsonPropertyParser.write(context, jSONObject, "tab_title_delimiter", value.f7597C, this.f1428a.R7());
            JsonPropertyParser.write(context, jSONObject, "tab_title_style", value.f7598D, this.f1428a.U7());
            JsonPropertyParser.write(context, jSONObject, "title_paddings", value.f7599E, this.f1428a.V2());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f1428a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f1428a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f1428a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f1428a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f1428a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "tabs");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f1428a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f1428a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f1428a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f1428a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f1428a.V6());
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1429a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1429a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Id deserialize(ParsingContext context, Id id, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, id != null ? id.f3199a : null, this.f1429a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", Ad.f1416n, allowPropertyOverride, id != null ? id.f3200b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", Ad.f1417o, allowPropertyOverride, id != null ? id.f3201c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, id != null ? id.f3202d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, Ad.f1419q);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, id != null ? id.f3203e : null, this.f1429a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, id != null ? id.f3204f : null, this.f1429a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, id != null ? id.f3205g : null, this.f1429a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = id != null ? id.f3206h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper, allowPropertyOverride, field, function1, Ad.f1420r);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, id != null ? id.f3207i : null, this.f1429a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field2 = id != null ? id.f3208j : null;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "dynamic_height", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…icHeight, ANY_TO_BOOLEAN)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, id != null ? id.f3209k : null, this.f1429a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, id != null ? id.f3210l : null, this.f1429a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, id != null ? id.f3211m : null, this.f1429a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "has_separator", typeHelper2, allowPropertyOverride, id != null ? id.f3212n : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…eparator, ANY_TO_BOOLEAN)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, id != null ? id.f3213o : null, this.f1429a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, id != null ? id.f3214p : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…llowOverride, parent?.id)");
            Field field3 = id != null ? id.f3215q : null;
            W1.h M7 = this.f1429a.M7();
            Field field4 = field3;
            ListValidator listValidator = Ad.f1421s;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, field4, M7, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…, ITEMS_VALIDATOR.cast())");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, id != null ? id.f3216r : null, this.f1429a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, id != null ? id.f3217s : null, this.f1429a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, id != null ? id.f3218t : null, this.f1429a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "restrict_parent_scroll", typeHelper2, allowPropertyOverride, id != null ? id.f3219u : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…ntScroll, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, id != null ? id.f3220v : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper, allowPropertyOverride, id != null ? id.f3221w : null, function1, Ad.f1422t);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, id != null ? id.f3222x : null, this.f1429a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "selected_tab", typeHelper, allowPropertyOverride, id != null ? id.f3223y : null, function1, Ad.f1423u);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…, SELECTED_TAB_VALIDATOR)");
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "separator_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, id != null ? id.f3224z : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "separator_paddings", allowPropertyOverride, id != null ? id.f3182A : null, this.f1429a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "switch_tabs_by_content_swipe_enabled", typeHelper2, allowPropertyOverride, id != null ? id.f3183B : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…eEnabled, ANY_TO_BOOLEAN)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "tab_title_delimiter", allowPropertyOverride, id != null ? id.f3184C : null, this.f1429a.S7());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…imiterJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "tab_title_style", allowPropertyOverride, id != null ? id.f3185D : null, this.f1429a.V7());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…eStyleJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "title_paddings", allowPropertyOverride, id != null ? id.f3186E : null, this.f1429a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, id != null ? id.f3187F : null, this.f1429a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, id != null ? id.f3188G : null, this.f1429a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, id != null ? id.f3189H : null, this.f1429a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, id != null ? id.f3190I : null, this.f1429a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, id != null ? id.f3191J : null, this.f1429a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field5 = id != null ? id.f3192K : null;
            Function1 function13 = EnumC0997pf.f7541e;
            ListValidator listValidator2 = Ad.f1424v;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field5, function13, listValidator2);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, id != null ? id.f3193L : null, this.f1429a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, id != null ? id.f3194M : null, this.f1429a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", Ad.f1418p, allowPropertyOverride, id != null ? id.f3195N : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, id != null ? id.f3196O : null, this.f1429a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField17, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, id != null ? id.f3197P : null, this.f1429a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField18 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, id != null ? id.f3198Q : null, this.f1429a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField18, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new Id(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalFieldWithExpression5, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalFieldWithExpression6, readOptionalField4, readOptionalField5, readListField, readOptionalField6, readOptionalField7, readOptionalField8, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField6, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalField9, readOptionalFieldWithExpression12, readOptionalField10, readOptionalField11, readOptionalField12, readOptionalListField7, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalField16, readOptionalListField8, readOptionalListField9, readOptionalListField10, readOptionalFieldWithExpression13, readOptionalField17, readOptionalListField11, readOptionalField18);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Id value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f3199a, this.f1429a.I());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f3200b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f3201c, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f3202d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f3203e, this.f1429a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f3204f, this.f1429a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f3205g, this.f1429a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f3206h);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f3207i, this.f1429a.N2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "dynamic_height", value.f3208j);
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f3209k, this.f1429a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f3210l, this.f1429a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f3211m, this.f1429a.G3());
            JsonFieldParser.writeExpressionField(context, jSONObject, "has_separator", value.f3212n);
            JsonFieldParser.writeField(context, jSONObject, "height", value.f3213o, this.f1429a.W6());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f3214p);
            JsonFieldParser.writeListField(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f3215q, this.f1429a.M7());
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f3216r, this.f1429a.N4());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f3217s, this.f1429a.W2());
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f3218t, this.f1429a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "restrict_parent_scroll", value.f3219u);
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f3220v);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f3221w);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f3222x, this.f1429a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "selected_tab", value.f3223y);
            JsonFieldParser.writeExpressionField(context, jSONObject, "separator_color", value.f3224z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "separator_paddings", value.f3182A, this.f1429a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "switch_tabs_by_content_swipe_enabled", value.f3183B);
            JsonFieldParser.writeField(context, jSONObject, "tab_title_delimiter", value.f3184C, this.f1429a.S7());
            JsonFieldParser.writeField(context, jSONObject, "tab_title_style", value.f3185D, this.f1429a.V7());
            JsonFieldParser.writeField(context, jSONObject, "title_paddings", value.f3186E, this.f1429a.W2());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f3187F, this.f1429a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f3188G, this.f1429a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f3189H, this.f1429a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f3190I, this.f1429a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f3191J, this.f1429a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f3192K, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "tabs");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f3193L, this.f1429a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f3194M, this.f1429a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f3195N, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f3196O, this.f1429a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f3197P, this.f1429a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f3198Q, this.f1429a.W6());
            return jSONObject;
        }
    }

    public static final class g implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1430a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1430a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1013qd resolve(ParsingContext context, Id template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f3199a, data, "accessibility", this.f1430a.J(), this.f1430a.H());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f3200b, data, "alignment_horizontal", Ad.f1416n, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f3201c, data, "alignment_vertical", Ad.f1417o, EnumC1109w2.f8300e);
            Field field = template.f3202d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Ad.f1419q;
            Expression expression = Ad.f1404b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f3203e, data, "animators", this.f1430a.s1(), this.f1430a.q1());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f3204f, data, io.appmetrica.analytics.impl.L2.f37912g, this.f1430a.E1(), this.f1430a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f3205g, data, "border", this.f1430a.K1(), this.f1430a.I1());
            Field field2 = template.f3206h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "column_span", typeHelper2, function12, Ad.f1420r);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f3207i, data, "disappear_actions", this.f1430a.O2(), this.f1430a.M2());
            Field field3 = template.f3208j;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = Ad.f1405c;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "dynamic_height", typeHelper3, function13, expression3);
            Expression expression4 = resolveOptionalExpression5 == null ? expression3 : resolveOptionalExpression5;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f3209k, data, "extensions", this.f1430a.a3(), this.f1430a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f3210l, data, "focus", this.f1430a.y3(), this.f1430a.w3());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f3211m, data, "functions", this.f1430a.H3(), this.f1430a.F3());
            Field field4 = template.f3212n;
            Expression expression5 = Ad.f1406d;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "has_separator", typeHelper3, function13, expression5);
            Expression expression6 = resolveOptionalExpression6 == null ? expression5 : resolveOptionalExpression6;
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f3213o, data, "height", this.f1430a.X6(), this.f1430a.V6());
            if (yb == null) {
                yb = Ad.f1407e;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f3214p, data, "id");
            Yb yb2 = yb;
            List resolveList = JsonFieldResolver.resolveList(context, template.f3215q, data, FirebaseAnalytics.Param.ITEMS, this.f1430a.N7(), this.f1430a.L7(), Ad.f1421s);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…yParser, ITEMS_VALIDATOR)");
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f3216r, data, "layout_provider", this.f1430a.O4(), this.f1430a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f3217s, data, "margins", this.f1430a.X2(), this.f1430a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f3218t, data, "paddings", this.f1430a.X2(), this.f1430a.V2());
            Field field5 = template.f3219u;
            Expression expression7 = Ad.f1408f;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "restrict_parent_scroll", typeHelper3, function13, expression7);
            Expression expression8 = resolveOptionalExpression7 == null ? expression7 : resolveOptionalExpression7;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, template.f3220v, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, template.f3221w, data, "row_span", typeHelper2, function12, Ad.f1422t);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f3222x, data, "selected_actions", this.f1430a.w0(), this.f1430a.u0());
            Field field6 = template.f3223y;
            ValueValidator valueValidator2 = Ad.f1423u;
            Expression expression9 = Ad.f1409g;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "selected_tab", typeHelper2, function12, valueValidator2, expression9);
            if (resolveOptionalExpression10 != null) {
                expression9 = resolveOptionalExpression10;
            }
            Field field7 = template.f3224z;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression10 = Ad.f1410h;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "separator_color", typeHelper4, function14, expression10);
            Expression expression11 = resolveOptionalExpression11 == null ? expression10 : resolveOptionalExpression11;
            C0754c5 c0754c53 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f3182A, data, "separator_paddings", this.f1430a.X2(), this.f1430a.V2());
            if (c0754c53 == null) {
                c0754c53 = Ad.f1411i;
            }
            C0754c5 c0754c54 = c0754c53;
            Intrinsics.checkNotNullExpressionValue(c0754c54, "JsonFieldResolver.resolv…OR_PADDINGS_DEFAULT_VALUE");
            Field field8 = template.f3183B;
            Expression expression12 = Ad.f1412j;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "switch_tabs_by_content_swipe_enabled", typeHelper3, function13, expression12);
            Expression expression13 = resolveOptionalExpression12 == null ? expression12 : resolveOptionalExpression12;
            C1013qd.d dVar = (C1013qd.d) JsonFieldResolver.resolveOptional(context, template.f3184C, data, "tab_title_delimiter", this.f1430a.T7(), this.f1430a.R7());
            C1013qd.e eVar = (C1013qd.e) JsonFieldResolver.resolveOptional(context, template.f3185D, data, "tab_title_style", this.f1430a.W7(), this.f1430a.U7());
            C0754c5 c0754c55 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f3186E, data, "title_paddings", this.f1430a.X2(), this.f1430a.V2());
            if (c0754c55 == null) {
                c0754c55 = Ad.f1413k;
            }
            C0754c5 c0754c56 = c0754c55;
            Intrinsics.checkNotNullExpressionValue(c0754c56, "JsonFieldResolver.resolv…LE_PADDINGS_DEFAULT_VALUE");
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f3187F, data, "tooltips", this.f1430a.L8(), this.f1430a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f3188G, data, "transform", this.f1430a.X8(), this.f1430a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f3189H, data, "transition_change", this.f1430a.T1(), this.f1430a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f3190I, data, "transition_in", this.f1430a.y1(), this.f1430a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f3191J, data, "transition_out", this.f1430a.y1(), this.f1430a.w1());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f3192K, data, "transition_triggers", EnumC0997pf.f7541e, Ad.f1424v);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f3193L, data, "variable_triggers", this.f1430a.a9(), this.f1430a.Y8());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f3194M, data, "variables", this.f1430a.g9(), this.f1430a.e9());
            Field field9 = template.f3195N;
            TypeHelper typeHelper5 = Ad.f1418p;
            Function1 function15 = Vf.f5043e;
            Expression expression14 = Ad.f1414l;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, field9, data, "visibility", typeHelper5, function15, expression14);
            if (resolveOptionalExpression13 != null) {
                expression14 = resolveOptionalExpression13;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f3196O, data, "visibility_action", this.f1430a.s9(), this.f1430a.q9());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f3197P, data, "visibility_actions", this.f1430a.s9(), this.f1430a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f3198Q, data, "width", this.f1430a.X6(), this.f1430a.V6());
            if (yb3 == null) {
                yb3 = Ad.f1415m;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1013qd(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, resolveOptionalList2, c0860i3, resolveOptionalExpression4, resolveOptionalList3, expression4, resolveOptionalList4, w5, resolveOptionalList5, expression6, yb2, str, resolveList, c1079u8, c0754c5, c0754c52, expression8, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalList6, expression9, expression11, c0754c54, expression13, dVar, eVar, c0754c56, resolveOptionalList7, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList8, resolveOptionalList9, resolveOptionalList10, expression14, wf, resolveOptionalList11, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f1404b = companion.constant(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        f1405c = companion.constant(bool);
        f1406d = companion.constant(bool);
        f1407e = new Yb.e(new C0765cg(null, null, null, 7, null));
        f1408f = companion.constant(bool);
        f1409g = companion.constant(0L);
        f1410h = companion.constant(335544320);
        f1411i = new C0754c5(companion.constant(0L), null, companion.constant(12L), companion.constant(12L), null == true ? 1 : 0, companion.constant(0L), null, 82, null);
        f1412j = companion.constant(Boolean.TRUE);
        f1413k = new C0754c5(companion.constant(8L), null, companion.constant(12L), companion.constant(12L), null, companion.constant(0L), null, 82, null);
        f1414l = companion.constant(Vf.VISIBLE);
        f1415m = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f1416n = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f1425i);
        f1417o = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f1426i);
        f1418p = companion2.from(AbstractC3219i.G(Vf.values()), c.f1427i);
        f1419q = new ValueValidator() { // from class: O1.ud
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = Ad.g(((Double) obj).doubleValue());
                return g4;
            }
        };
        f1420r = new ValueValidator() { // from class: O1.vd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = Ad.h(((Long) obj).longValue());
                return h4;
            }
        };
        f1421s = new ListValidator() { // from class: O1.wd
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean i4;
                i4 = Ad.i(list);
                return i4;
            }
        };
        f1422t = new ValueValidator() { // from class: O1.xd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean j4;
                j4 = Ad.j(((Long) obj).longValue());
                return j4;
            }
        };
        f1423u = new ValueValidator() { // from class: O1.yd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean k4;
                k4 = Ad.k(((Long) obj).longValue());
                return k4;
            }
        };
        f1424v = new ListValidator() { // from class: O1.zd
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean l4;
                l4 = Ad.l(list);
                return l4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
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
    public static final boolean j(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
