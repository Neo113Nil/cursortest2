package O1;

import O1.C0720a7;
import O1.Nb;
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

/* renamed from: O1.m7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0935m7 {

    /* renamed from: a, reason: collision with root package name */
    private static final e f6997a = new e(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6998b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f6999c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f7000d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f7001e;

    /* renamed from: f, reason: collision with root package name */
    public static final Yb.e f7002f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f7003g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f7004h;

    /* renamed from: i, reason: collision with root package name */
    public static final Nb.d f7005i;

    /* renamed from: j, reason: collision with root package name */
    public static final S5 f7006j;

    /* renamed from: k, reason: collision with root package name */
    public static final Expression f7007k;

    /* renamed from: l, reason: collision with root package name */
    public static final Yb.d f7008l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeHelper f7009m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeHelper f7010n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeHelper f7011o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeHelper f7012p;

    /* renamed from: q, reason: collision with root package name */
    public static final ValueValidator f7013q;

    /* renamed from: r, reason: collision with root package name */
    public static final ValueValidator f7014r;

    /* renamed from: s, reason: collision with root package name */
    public static final ValueValidator f7015s;

    /* renamed from: t, reason: collision with root package name */
    public static final ValueValidator f7016t;

    /* renamed from: u, reason: collision with root package name */
    public static final ValueValidator f7017u;

    /* renamed from: v, reason: collision with root package name */
    public static final ListValidator f7018v;

    /* renamed from: O1.m7$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7019i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    /* renamed from: O1.m7$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f7020i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    /* renamed from: O1.m7$c */
    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f7021i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0720a7.a);
        }
    }

    /* renamed from: O1.m7$d */
    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f7022i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    /* renamed from: O1.m7$e */
    private static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    /* renamed from: O1.m7$f */
    public static final class f implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7023a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7023a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0720a7 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f7023a.H());
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = AbstractC0935m7.f6998b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "active_item_color", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC0935m7.f7013q;
            Expression expression3 = AbstractC0935m7.f6999c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "active_item_size", typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            C0742bb c0742bb = (C0742bb) JsonPropertyParser.readOptional(context, data, "active_shape", this.f7023a.u6());
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", AbstractC0935m7.f7009m, EnumC1091v2.f8195e);
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", AbstractC0935m7.f7010n, EnumC1109w2.f8300e);
            ValueValidator valueValidator2 = AbstractC0935m7.f7014r;
            Expression expression5 = AbstractC0935m7.f7000d;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = readOptionalExpression5 == null ? expression5 : readOptionalExpression5;
            TypeHelper typeHelper3 = AbstractC0935m7.f7011o;
            Function1 function13 = C0720a7.a.f5700e;
            Expression expression7 = AbstractC0935m7.f7001e;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "animation", typeHelper3, function13, expression7);
            Expression expression8 = readOptionalExpression6 == null ? expression7 : readOptionalExpression6;
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f7023a.q1());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f7023a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f7023a.I1());
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper4, function14, AbstractC0935m7.f7015s);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f7023a.M2());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f7023a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f7023a.w3());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f7023a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f7023a.V6());
            if (yb == null) {
                yb = AbstractC0935m7.f7002f;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            Expression expression9 = AbstractC0935m7.f7003g;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "inactive_item_color", typeHelper, function1, expression9);
            Expression expression10 = readOptionalExpression8 == null ? expression9 : readOptionalExpression8;
            C0742bb c0742bb2 = (C0742bb) JsonPropertyParser.readOptional(context, data, "inactive_minimum_shape", this.f7023a.u6());
            C0742bb c0742bb3 = (C0742bb) JsonPropertyParser.readOptional(context, data, "inactive_shape", this.f7023a.u6());
            AbstractC0738b7 abstractC0738b7 = (AbstractC0738b7) JsonPropertyParser.readOptional(context, data, "items_placement", this.f7023a.X3());
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f7023a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f7023a.V2());
            ValueValidator valueValidator3 = AbstractC0935m7.f7016t;
            Expression expression11 = AbstractC0935m7.f7004h;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "minimum_item_size", typeHelper2, function12, valueValidator3, expression11);
            if (readOptionalExpression9 != null) {
                expression11 = readOptionalExpression9;
            }
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f7023a.V2());
            String str2 = (String) JsonPropertyParser.readOptional(context, data, "pager_id");
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper4, function14, AbstractC0935m7.f7017u);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f7023a.u0());
            Nb nb = (Nb) JsonPropertyParser.readOptional(context, data, "shape", this.f7023a.S6());
            if (nb == null) {
                nb = AbstractC0935m7.f7005i;
            }
            Intrinsics.checkNotNullExpressionValue(nb, "JsonPropertyParser.readO…r) ?: SHAPE_DEFAULT_VALUE");
            S5 s5 = (S5) JsonPropertyParser.readOptional(context, data, "space_between_centers", this.f7023a.t3());
            if (s5 == null) {
                s5 = AbstractC0935m7.f7006j;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonPropertyParser.readO…EEN_CENTERS_DEFAULT_VALUE");
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f7023a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f7023a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f7023a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f7023a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f7023a.w1());
            Nb nb2 = nb;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC0935m7.f7018v);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f7023a.Y8());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f7023a.e9());
            S5 s52 = s5;
            TypeHelper typeHelper5 = AbstractC0935m7.f7012p;
            Function1 function15 = Vf.f5043e;
            Expression expression12 = AbstractC0935m7.f7007k;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper5, function15, expression12);
            if (readOptionalExpression12 != null) {
                expression12 = readOptionalExpression12;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f7023a.q9());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f7023a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f7023a.V6());
            if (yb3 == null) {
                yb3 = AbstractC0935m7.f7008l;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0720a7(c0839h0, expression2, expression4, c0742bb, readOptionalExpression3, readOptionalExpression4, expression6, expression8, readOptionalList, readOptionalList2, c0860i3, readOptionalExpression7, readOptionalList3, readOptionalList4, w5, readOptionalList5, yb2, str, expression10, c0742bb2, c0742bb3, abstractC0738b7, c1079u8, c0754c5, expression11, c0754c52, str2, readOptionalExpression10, readOptionalExpression11, readOptionalList6, nb2, s52, readOptionalList7, c0925lf, abstractC1092v3, o22, o23, readOptionalList8, readOptionalList9, readOptionalList10, expression12, wf, readOptionalList11, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0720a7 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f7023a.H());
            Expression expression = value.f5673b;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(context, jSONObject, "active_item_color", expression, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "active_item_size", value.f5674c);
            JsonPropertyParser.write(context, jSONObject, "active_shape", value.f5675d, this.f7023a.u6());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonExpressionParser.writeExpression(context, jSONObject, "animation", value.f5679h, C0720a7.a.f5699d);
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f7023a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f7023a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f7023a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f7023a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f7023a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f7023a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f7023a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f7023a.V6());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonExpressionParser.writeExpression(context, jSONObject, "inactive_item_color", value.f5690s, function1);
            JsonPropertyParser.write(context, jSONObject, "inactive_minimum_shape", value.f5691t, this.f7023a.u6());
            JsonPropertyParser.write(context, jSONObject, "inactive_shape", value.f5692u, this.f7023a.u6());
            JsonPropertyParser.write(context, jSONObject, "items_placement", value.f5693v, this.f7023a.X3());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f7023a.M4());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f7023a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "minimum_item_size", value.f5696y);
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f7023a.V2());
            JsonPropertyParser.write(context, jSONObject, "pager_id", value.f5653A);
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f7023a.u0());
            JsonPropertyParser.write(context, jSONObject, "shape", value.f5657E, this.f7023a.S6());
            JsonPropertyParser.write(context, jSONObject, "space_between_centers", value.f5658F, this.f7023a.t3());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f7023a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f7023a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f7023a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f7023a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f7023a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "indicator");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f7023a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f7023a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f7023a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f7023a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f7023a.V6());
            return jSONObject;
        }
    }

    /* renamed from: O1.m7$g */
    public static final class g implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7024a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7024a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0953n7 deserialize(ParsingContext context, C0953n7 c0953n7, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, c0953n7 != null ? c0953n7.f7187a : null, this.f7024a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field = c0953n7 != null ? c0953n7.f7188b : null;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "active_item_color", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = c0953n7 != null ? c0953n7.f7189c : null;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "active_item_size", typeHelper2, allowPropertyOverride, field2, function12, AbstractC0935m7.f7013q);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…TIVE_ITEM_SIZE_VALIDATOR)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "active_shape", allowPropertyOverride, c0953n7 != null ? c0953n7.f7190d : null, this.f7024a.v6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…eShapeJsonTemplateParser)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", AbstractC0935m7.f7009m, allowPropertyOverride, c0953n7 != null ? c0953n7.f7191e : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", AbstractC0935m7.f7010n, allowPropertyOverride, c0953n7 != null ? c0953n7.f7192f : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", typeHelper2, allowPropertyOverride, c0953n7 != null ? c0953n7.f7193g : null, function12, AbstractC0935m7.f7014r);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "animation", AbstractC0935m7.f7011o, allowPropertyOverride, c0953n7 != null ? c0953n7.f7194h : null, C0720a7.a.f5700e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…or.Animation.FROM_STRING)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, c0953n7 != null ? c0953n7.f7195i : null, this.f7024a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, c0953n7 != null ? c0953n7.f7196j : null, this.f7024a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, c0953n7 != null ? c0953n7.f7197k : null, this.f7024a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field3 = c0953n7 != null ? c0953n7.f7198l : null;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper3, allowPropertyOverride, field3, function13, AbstractC0935m7.f7015s);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, c0953n7 != null ? c0953n7.f7199m : null, this.f7024a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, c0953n7 != null ? c0953n7.f7200n : null, this.f7024a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, c0953n7 != null ? c0953n7.f7201o : null, this.f7024a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, c0953n7 != null ? c0953n7.f7202p : null, this.f7024a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, c0953n7 != null ? c0953n7.f7203q : null, this.f7024a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, c0953n7 != null ? c0953n7.f7204r : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "inactive_item_color", typeHelper, allowPropertyOverride, c0953n7 != null ? c0953n7.f7205s : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "inactive_minimum_shape", allowPropertyOverride, c0953n7 != null ? c0953n7.f7206t : null, this.f7024a.v6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…eShapeJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "inactive_shape", allowPropertyOverride, c0953n7 != null ? c0953n7.f7207u : null, this.f7024a.v6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…eShapeJsonTemplateParser)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "items_placement", allowPropertyOverride, c0953n7 != null ? c0953n7.f7208v : null, this.f7024a.Y3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…cementJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, c0953n7 != null ? c0953n7.f7209w : null, this.f7024a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, c0953n7 != null ? c0953n7.f7210x : null, this.f7024a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "minimum_item_size", typeHelper2, allowPropertyOverride, c0953n7 != null ? c0953n7.f7211y : null, function12, AbstractC0935m7.f7016t);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…IMUM_ITEM_SIZE_VALIDATOR)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, c0953n7 != null ? c0953n7.f7212z : null, this.f7024a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "pager_id", allowPropertyOverride, c0953n7 != null ? c0953n7.f7169A : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…verride, parent?.pagerId)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c0953n7 != null ? c0953n7.f7170B : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper3, allowPropertyOverride, c0953n7 != null ? c0953n7.f7171C : null, function13, AbstractC0935m7.f7017u);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, c0953n7 != null ? c0953n7.f7172D : null, this.f7024a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "shape", allowPropertyOverride, c0953n7 != null ? c0953n7.f7173E : null, this.f7024a.T6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…vShapeJsonTemplateParser)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "space_between_centers", allowPropertyOverride, c0953n7 != null ? c0953n7.f7174F : null, this.f7024a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…edSizeJsonTemplateParser)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, c0953n7 != null ? c0953n7.f7175G : null, this.f7024a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, c0953n7 != null ? c0953n7.f7176H : null, this.f7024a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, c0953n7 != null ? c0953n7.f7177I : null, this.f7024a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField17, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField18 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, c0953n7 != null ? c0953n7.f7178J : null, this.f7024a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField18, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField19 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, c0953n7 != null ? c0953n7.f7179K : null, this.f7024a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField19, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field4 = c0953n7 != null ? c0953n7.f7180L : null;
            Function1 function14 = EnumC0997pf.f7541e;
            ListValidator listValidator = AbstractC0935m7.f7018v;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field4, function14, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, c0953n7 != null ? c0953n7.f7181M : null, this.f7024a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, c0953n7 != null ? c0953n7.f7182N : null, this.f7024a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", AbstractC0935m7.f7012p, allowPropertyOverride, c0953n7 != null ? c0953n7.f7183O : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField20 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, c0953n7 != null ? c0953n7.f7184P : null, this.f7024a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField20, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, c0953n7 != null ? c0953n7.f7185Q : null, this.f7024a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField21 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, c0953n7 != null ? c0953n7.f7186R : null, this.f7024a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField21, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new C0953n7(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalField2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField, readOptionalListField2, readOptionalField3, readOptionalFieldWithExpression7, readOptionalListField3, readOptionalListField4, readOptionalField4, readOptionalListField5, readOptionalField5, readOptionalField6, readOptionalFieldWithExpression8, readOptionalField7, readOptionalField8, readOptionalField9, readOptionalField10, readOptionalField11, readOptionalFieldWithExpression9, readOptionalField12, readOptionalField13, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalListField6, readOptionalField14, readOptionalField15, readOptionalListField7, readOptionalField16, readOptionalField17, readOptionalField18, readOptionalField19, readOptionalListField8, readOptionalListField9, readOptionalListField10, readOptionalFieldWithExpression12, readOptionalField20, readOptionalListField11, readOptionalField21);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0953n7 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f7187a, this.f7024a.I());
            Field field = value.f7188b;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(context, jSONObject, "active_item_color", field, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "active_item_size", value.f7189c);
            JsonFieldParser.writeField(context, jSONObject, "active_shape", value.f7190d, this.f7024a.v6());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f7191e, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f7192f, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f7193g);
            JsonFieldParser.writeExpressionField(context, jSONObject, "animation", value.f7194h, C0720a7.a.f5699d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f7195i, this.f7024a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f7196j, this.f7024a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f7197k, this.f7024a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f7198l);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f7199m, this.f7024a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f7200n, this.f7024a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f7201o, this.f7024a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f7202p, this.f7024a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f7203q, this.f7024a.W6());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f7204r);
            JsonFieldParser.writeExpressionField(context, jSONObject, "inactive_item_color", value.f7205s, function1);
            JsonFieldParser.writeField(context, jSONObject, "inactive_minimum_shape", value.f7206t, this.f7024a.v6());
            JsonFieldParser.writeField(context, jSONObject, "inactive_shape", value.f7207u, this.f7024a.v6());
            JsonFieldParser.writeField(context, jSONObject, "items_placement", value.f7208v, this.f7024a.Y3());
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f7209w, this.f7024a.N4());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f7210x, this.f7024a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "minimum_item_size", value.f7211y);
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f7212z, this.f7024a.W2());
            JsonFieldParser.writeField(context, jSONObject, "pager_id", value.f7169A);
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f7170B);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f7171C);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f7172D, this.f7024a.v0());
            JsonFieldParser.writeField(context, jSONObject, "shape", value.f7173E, this.f7024a.T6());
            JsonFieldParser.writeField(context, jSONObject, "space_between_centers", value.f7174F, this.f7024a.u3());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f7175G, this.f7024a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f7176H, this.f7024a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f7177I, this.f7024a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f7178J, this.f7024a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f7179K, this.f7024a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f7180L, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "indicator");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f7181M, this.f7024a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f7182N, this.f7024a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f7183O, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f7184P, this.f7024a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f7185Q, this.f7024a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f7186R, this.f7024a.W6());
            return jSONObject;
        }
    }

    /* renamed from: O1.m7$h */
    public static final class h implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7025a;

        public h(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7025a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0720a7 resolve(ParsingContext context, C0953n7 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f7187a, data, "accessibility", this.f7025a.J(), this.f7025a.H());
            Field field = template.f7188b;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = AbstractC0935m7.f6998b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "active_item_color", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f7189c;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC0935m7.f7013q;
            Expression expression3 = AbstractC0935m7.f6999c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "active_item_size", typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            C0742bb c0742bb = (C0742bb) JsonFieldResolver.resolveOptional(context, template.f7190d, data, "active_shape", this.f7025a.w6(), this.f7025a.u6());
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, template.f7191e, data, "alignment_horizontal", AbstractC0935m7.f7009m, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, template.f7192f, data, "alignment_vertical", AbstractC0935m7.f7010n, EnumC1109w2.f8300e);
            Field field3 = template.f7193g;
            ValueValidator valueValidator2 = AbstractC0935m7.f7014r;
            Expression expression5 = AbstractC0935m7.f7000d;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "alpha", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = resolveOptionalExpression5 == null ? expression5 : resolveOptionalExpression5;
            Field field4 = template.f7194h;
            TypeHelper typeHelper3 = AbstractC0935m7.f7011o;
            Function1 function13 = C0720a7.a.f5700e;
            Expression expression7 = AbstractC0935m7.f7001e;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "animation", typeHelper3, function13, expression7);
            Expression expression8 = resolveOptionalExpression6 == null ? expression7 : resolveOptionalExpression6;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f7195i, data, "animators", this.f7025a.s1(), this.f7025a.q1());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f7196j, data, io.appmetrica.analytics.impl.L2.f37912g, this.f7025a.E1(), this.f7025a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f7197k, data, "border", this.f7025a.K1(), this.f7025a.I1());
            Field field5 = template.f7198l;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "column_span", typeHelper4, function14, AbstractC0935m7.f7015s);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f7199m, data, "disappear_actions", this.f7025a.O2(), this.f7025a.M2());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f7200n, data, "extensions", this.f7025a.a3(), this.f7025a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f7201o, data, "focus", this.f7025a.y3(), this.f7025a.w3());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f7202p, data, "functions", this.f7025a.H3(), this.f7025a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f7203q, data, "height", this.f7025a.X6(), this.f7025a.V6());
            if (yb == null) {
                yb = AbstractC0935m7.f7002f;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f7204r, data, "id");
            Field field6 = template.f7205s;
            Expression expression9 = AbstractC0935m7.f7003g;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "inactive_item_color", typeHelper, function1, expression9);
            Expression expression10 = resolveOptionalExpression8 == null ? expression9 : resolveOptionalExpression8;
            C0742bb c0742bb2 = (C0742bb) JsonFieldResolver.resolveOptional(context, template.f7206t, data, "inactive_minimum_shape", this.f7025a.w6(), this.f7025a.u6());
            C0742bb c0742bb3 = (C0742bb) JsonFieldResolver.resolveOptional(context, template.f7207u, data, "inactive_shape", this.f7025a.w6(), this.f7025a.u6());
            AbstractC0738b7 abstractC0738b7 = (AbstractC0738b7) JsonFieldResolver.resolveOptional(context, template.f7208v, data, "items_placement", this.f7025a.Z3(), this.f7025a.X3());
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f7209w, data, "layout_provider", this.f7025a.O4(), this.f7025a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f7210x, data, "margins", this.f7025a.X2(), this.f7025a.V2());
            Field field7 = template.f7211y;
            ValueValidator valueValidator3 = AbstractC0935m7.f7016t;
            Expression expression11 = AbstractC0935m7.f7004h;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "minimum_item_size", typeHelper2, function12, valueValidator3, expression11);
            if (resolveOptionalExpression9 != null) {
                expression11 = resolveOptionalExpression9;
            }
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f7212z, data, "paddings", this.f7025a.X2(), this.f7025a.V2());
            String str2 = (String) JsonFieldResolver.resolveOptional(context, template.f7169A, data, "pager_id");
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, template.f7170B, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, template.f7171C, data, "row_span", typeHelper4, function14, AbstractC0935m7.f7017u);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f7172D, data, "selected_actions", this.f7025a.w0(), this.f7025a.u0());
            Nb nb = (Nb) JsonFieldResolver.resolveOptional(context, template.f7173E, data, "shape", this.f7025a.U6(), this.f7025a.S6());
            if (nb == null) {
                nb = AbstractC0935m7.f7005i;
            }
            Nb nb2 = nb;
            Intrinsics.checkNotNullExpressionValue(nb2, "JsonFieldResolver.resolv…r) ?: SHAPE_DEFAULT_VALUE");
            S5 s5 = (S5) JsonFieldResolver.resolveOptional(context, template.f7174F, data, "space_between_centers", this.f7025a.v3(), this.f7025a.t3());
            if (s5 == null) {
                s5 = AbstractC0935m7.f7006j;
            }
            S5 s52 = s5;
            Intrinsics.checkNotNullExpressionValue(s52, "JsonFieldResolver.resolv…EEN_CENTERS_DEFAULT_VALUE");
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f7175G, data, "tooltips", this.f7025a.L8(), this.f7025a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f7176H, data, "transform", this.f7025a.X8(), this.f7025a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f7177I, data, "transition_change", this.f7025a.T1(), this.f7025a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f7178J, data, "transition_in", this.f7025a.y1(), this.f7025a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f7179K, data, "transition_out", this.f7025a.y1(), this.f7025a.w1());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f7180L, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC0935m7.f7018v);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f7181M, data, "variable_triggers", this.f7025a.a9(), this.f7025a.Y8());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f7182N, data, "variables", this.f7025a.g9(), this.f7025a.e9());
            Field field8 = template.f7183O;
            TypeHelper typeHelper5 = AbstractC0935m7.f7012p;
            Function1 function15 = Vf.f5043e;
            Expression expression12 = AbstractC0935m7.f7007k;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "visibility", typeHelper5, function15, expression12);
            if (resolveOptionalExpression12 != null) {
                expression12 = resolveOptionalExpression12;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f7184P, data, "visibility_action", this.f7025a.s9(), this.f7025a.q9());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f7185Q, data, "visibility_actions", this.f7025a.s9(), this.f7025a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f7186R, data, "width", this.f7025a.X6(), this.f7025a.V6());
            if (yb3 == null) {
                yb3 = AbstractC0935m7.f7008l;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0720a7(c0839h0, expression2, expression4, c0742bb, resolveOptionalExpression3, resolveOptionalExpression4, expression6, expression8, resolveOptionalList, resolveOptionalList2, c0860i3, resolveOptionalExpression7, resolveOptionalList3, resolveOptionalList4, w5, resolveOptionalList5, yb2, str, expression10, c0742bb2, c0742bb3, abstractC0738b7, c1079u8, c0754c5, expression11, c0754c52, str2, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalList6, nb2, s52, resolveOptionalList7, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList8, resolveOptionalList9, resolveOptionalList10, expression12, wf, resolveOptionalList11, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f6998b = companion.constant(16768096);
        f6999c = companion.constant(Double.valueOf(1.3d));
        f7000d = companion.constant(Double.valueOf(1.0d));
        f7001e = companion.constant(C0720a7.a.SCALE);
        Expression expression = null;
        f7002f = new Yb.e(new C0765cg(expression, null, null, 7, null));
        f7003g = companion.constant(865180853);
        f7004h = companion.constant(Double.valueOf(0.5d));
        Object[] objArr = null == true ? 1 : 0;
        f7005i = new Nb.d(new C0742bb(expression, null == true ? 1 : 0, null == true ? 1 : 0, null, objArr, 31, null));
        int i4 = 1;
        f7006j = new S5(null == true ? 1 : 0, companion.constant(15L), i4, null == true ? 1 : 0);
        f7007k = companion.constant(Vf.VISIBLE);
        f7008l = new Yb.d(new I8(null == true ? 1 : 0, i4, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f7009m = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f7019i);
        f7010n = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f7020i);
        f7011o = companion2.from(AbstractC3219i.G(C0720a7.a.values()), c.f7021i);
        f7012p = companion2.from(AbstractC3219i.G(Vf.values()), d.f7022i);
        f7013q = new ValueValidator() { // from class: O1.g7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = AbstractC0935m7.g(((Double) obj).doubleValue());
                return g4;
            }
        };
        f7014r = new ValueValidator() { // from class: O1.h7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = AbstractC0935m7.h(((Double) obj).doubleValue());
                return h4;
            }
        };
        f7015s = new ValueValidator() { // from class: O1.i7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean i5;
                i5 = AbstractC0935m7.i(((Long) obj).longValue());
                return i5;
            }
        };
        f7016t = new ValueValidator() { // from class: O1.j7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean j4;
                j4 = AbstractC0935m7.j(((Double) obj).doubleValue());
                return j4;
            }
        };
        f7017u = new ValueValidator() { // from class: O1.k7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean k4;
                k4 = AbstractC0935m7.k(((Long) obj).longValue());
                return k4;
            }
        };
        f7018v = new ListValidator() { // from class: O1.l7
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean l4;
                l4 = AbstractC0935m7.l(list);
                return l4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(double d4) {
        return d4 > 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(double d4) {
        return d4 > 0.0d;
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
