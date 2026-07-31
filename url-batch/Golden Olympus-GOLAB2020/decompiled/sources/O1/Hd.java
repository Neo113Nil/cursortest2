package O1;

import O1.C1013qd;
import O1.Id;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Hd {

    /* renamed from: a, reason: collision with root package name */
    private static final f f3075a = new f(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f3076b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f3077c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f3078d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f3079e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f3080f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f3081g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f3082h;

    /* renamed from: i, reason: collision with root package name */
    public static final Expression f3083i;

    /* renamed from: j, reason: collision with root package name */
    public static final Expression f3084j;

    /* renamed from: k, reason: collision with root package name */
    public static final Expression f3085k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0754c5 f3086l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeHelper f3087m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeHelper f3088n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeHelper f3089o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeHelper f3090p;

    /* renamed from: q, reason: collision with root package name */
    public static final TypeHelper f3091q;

    /* renamed from: r, reason: collision with root package name */
    public static final ValueValidator f3092r;

    /* renamed from: s, reason: collision with root package name */
    public static final ValueValidator f3093s;

    /* renamed from: t, reason: collision with root package name */
    public static final ValueValidator f3094t;

    /* renamed from: u, reason: collision with root package name */
    public static final ValueValidator f3095u;

    /* renamed from: v, reason: collision with root package name */
    public static final ValueValidator f3096v;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3097i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0791e6);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f3098i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C1013qd.e.a);
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f3099i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0779dc);
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f3100i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0791e6);
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final e f3101i = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0791e6);
        }
    }

    private static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    public static final class g implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3102a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3102a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1013qd.e deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = Hd.f3076b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "active_background_color", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "active_font_variation_settings", typeHelper2);
            TypeHelper typeHelper3 = Hd.f3087m;
            Function1 function12 = EnumC0791e6.f6079e;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "active_font_weight", typeHelper3, function12);
            Expression expression3 = Hd.f3077c;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "active_text_color", typeHelper, function1, expression3);
            Expression expression4 = readOptionalExpression4 == null ? expression3 : readOptionalExpression4;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = Hd.f3092r;
            Expression expression5 = Hd.f3078d;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "animation_duration", typeHelper4, function13, valueValidator, expression5);
            Expression expression6 = readOptionalExpression5 == null ? expression5 : readOptionalExpression5;
            TypeHelper typeHelper5 = Hd.f3088n;
            Function1 function14 = C1013qd.e.a.f7693e;
            Expression expression7 = Hd.f3079e;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "animation_type", typeHelper5, function14, expression7);
            Expression expression8 = readOptionalExpression6 == null ? expression7 : readOptionalExpression6;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "corner_radius", typeHelper4, function13, Hd.f3093s);
            C0735b4 c0735b4 = (C0735b4) JsonPropertyParser.readOptional(context, data, "corners_radius", this.f3102a.p2());
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            ValueValidator valueValidator2 = Hd.f3094t;
            Expression expression9 = Hd.f3080f;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "font_size", typeHelper4, function13, valueValidator2, expression9);
            Expression expression10 = readOptionalExpression9 == null ? expression9 : readOptionalExpression9;
            TypeHelper typeHelper6 = Hd.f3089o;
            Function1 function15 = EnumC0779dc.f6047e;
            Expression expression11 = Hd.f3081g;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "font_size_unit", typeHelper6, function15, expression11);
            Expression expression12 = readOptionalExpression10 == null ? expression11 : readOptionalExpression10;
            TypeHelper typeHelper7 = Hd.f3090p;
            Expression expression13 = Hd.f3082h;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "font_weight", typeHelper7, function12, expression13);
            Expression expression14 = readOptionalExpression11 == null ? expression13 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "inactive_background_color", typeHelper, function1);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "inactive_font_variation_settings", typeHelper2);
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(context, data, "inactive_font_weight", Hd.f3091q, function12);
            Expression expression15 = Hd.f3083i;
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(context, data, "inactive_text_color", typeHelper, function1, expression15);
            Expression expression16 = readOptionalExpression15 == null ? expression15 : readOptionalExpression15;
            ValueValidator valueValidator3 = Hd.f3095u;
            Expression expression17 = Hd.f3084j;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(context, data, "item_spacing", typeHelper4, function13, valueValidator3, expression17);
            if (readOptionalExpression16 != null) {
                expression17 = readOptionalExpression16;
            }
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function16 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression18 = Hd.f3085k;
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(context, data, "letter_spacing", typeHelper8, function16, expression18);
            Expression expression19 = readOptionalExpression17 == null ? expression18 : readOptionalExpression17;
            Expression readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(context, data, "line_height", typeHelper4, function13, Hd.f3096v);
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f3102a.V2());
            if (c0754c5 == null) {
                c0754c5 = Hd.f3086l;
            }
            Intrinsics.checkNotNullExpressionValue(c0754c5, "JsonPropertyParser.readO…?: PADDINGS_DEFAULT_VALUE");
            return new C1013qd.e(expression2, readOptionalExpression2, readOptionalExpression3, expression4, expression6, expression8, readOptionalExpression7, c0735b4, readOptionalExpression8, expression10, expression12, expression14, readOptionalExpression12, readOptionalExpression13, readOptionalExpression14, expression16, expression17, expression19, readOptionalExpression18, c0754c5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1013qd.e value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            Expression expression = value.f7670a;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(context, jSONObject, "active_background_color", expression, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "active_font_variation_settings", value.f7671b);
            Expression expression2 = value.f7672c;
            Function1 function12 = EnumC0791e6.f6078d;
            JsonExpressionParser.writeExpression(context, jSONObject, "active_font_weight", expression2, function12);
            JsonExpressionParser.writeExpression(context, jSONObject, "active_text_color", value.f7673d, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "animation_duration", value.f7674e);
            JsonExpressionParser.writeExpression(context, jSONObject, "animation_type", value.f7675f, C1013qd.e.a.f7692d);
            JsonExpressionParser.writeExpression(context, jSONObject, "corner_radius", value.f7676g);
            JsonPropertyParser.write(context, jSONObject, "corners_radius", value.f7677h, this.f3102a.p2());
            JsonExpressionParser.writeExpression(context, jSONObject, "font_family", value.f7678i);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size", value.f7679j);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size_unit", value.f7680k, EnumC0779dc.f6046d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_weight", value.f7681l, function12);
            JsonExpressionParser.writeExpression(context, jSONObject, "inactive_background_color", value.f7682m, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "inactive_font_variation_settings", value.f7683n);
            JsonExpressionParser.writeExpression(context, jSONObject, "inactive_font_weight", value.f7684o, function12);
            JsonExpressionParser.writeExpression(context, jSONObject, "inactive_text_color", value.f7685p, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "item_spacing", value.f7686q);
            JsonExpressionParser.writeExpression(context, jSONObject, "letter_spacing", value.f7687r);
            JsonExpressionParser.writeExpression(context, jSONObject, "line_height", value.f7688s);
            JsonPropertyParser.write(context, jSONObject, "paddings", value.f7689t, this.f3102a.V2());
            return jSONObject;
        }
    }

    public static final class h implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3103a;

        public h(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3103a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Id.e deserialize(ParsingContext context, Id.e eVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field = eVar != null ? eVar.f3253a : null;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "active_background_color", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "active_font_variation_settings", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f3254b : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…iveFontVariationSettings)");
            TypeHelper typeHelper3 = Hd.f3087m;
            Field field2 = eVar != null ? eVar.f3255c : null;
            Function1 function12 = EnumC0791e6.f6079e;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "active_font_weight", typeHelper3, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…ivFontWeight.FROM_STRING)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "active_text_color", typeHelper, allowPropertyOverride, eVar != null ? eVar.f3256d : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field3 = eVar != null ? eVar.f3257e : null;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "animation_duration", typeHelper4, allowPropertyOverride, field3, function13, Hd.f3092r);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…ATION_DURATION_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "animation_type", Hd.f3088n, allowPropertyOverride, eVar != null ? eVar.f3258f : null, C1013qd.e.a.f7693e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…nimationType.FROM_STRING)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "corner_radius", typeHelper4, allowPropertyOverride, eVar != null ? eVar.f3259g : null, function13, Hd.f3093s);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp… CORNER_RADIUS_VALIDATOR)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "corners_radius", allowPropertyOverride, eVar != null ? eVar.f3260h : null, this.f3103a.q2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…RadiusJsonTemplateParser)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, eVar != null ? eVar.f3261i : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…ride, parent?.fontFamily)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size", typeHelper4, allowPropertyOverride, eVar != null ? eVar.f3262j : null, function13, Hd.f3094t);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…INT, FONT_SIZE_VALIDATOR)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size_unit", Hd.f3089o, allowPropertyOverride, eVar != null ? eVar.f3263k : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_weight", Hd.f3090p, allowPropertyOverride, eVar != null ? eVar.f3264l : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…ivFontWeight.FROM_STRING)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "inactive_background_color", typeHelper, allowPropertyOverride, eVar != null ? eVar.f3265m : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "inactive_font_variation_settings", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f3266n : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…iveFontVariationSettings)");
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "inactive_font_weight", Hd.f3091q, allowPropertyOverride, eVar != null ? eVar.f3267o : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression14, "readOptionalFieldWithExp…ivFontWeight.FROM_STRING)");
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "inactive_text_color", typeHelper, allowPropertyOverride, eVar != null ? eVar.f3268p : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression15, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "item_spacing", typeHelper4, allowPropertyOverride, eVar != null ? eVar.f3269q : null, function13, Hd.f3095u);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression16, "readOptionalFieldWithExp…, ITEM_SPACING_VALIDATOR)");
            Field readOptionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, eVar != null ? eVar.f3270r : null, ParsingConvertersKt.NUMBER_TO_DOUBLE);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression17, "readOptionalFieldWithExp…pacing, NUMBER_TO_DOUBLE)");
            Field readOptionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "line_height", typeHelper4, allowPropertyOverride, eVar != null ? eVar.f3271s : null, function13, Hd.f3096v);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression18, "readOptionalFieldWithExp…T, LINE_HEIGHT_VALIDATOR)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, eVar != null ? eVar.f3272t : null, this.f3103a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…InsetsJsonTemplateParser)");
            return new Id.e(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalField, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalFieldWithExpression15, readOptionalFieldWithExpression16, readOptionalFieldWithExpression17, readOptionalFieldWithExpression18, readOptionalField2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Id.e value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            Field field = value.f3253a;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(context, jSONObject, "active_background_color", field, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "active_font_variation_settings", value.f3254b);
            Field field2 = value.f3255c;
            Function1 function12 = EnumC0791e6.f6078d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "active_font_weight", field2, function12);
            JsonFieldParser.writeExpressionField(context, jSONObject, "active_text_color", value.f3256d, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "animation_duration", value.f3257e);
            JsonFieldParser.writeExpressionField(context, jSONObject, "animation_type", value.f3258f, C1013qd.e.a.f7692d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "corner_radius", value.f3259g);
            JsonFieldParser.writeField(context, jSONObject, "corners_radius", value.f3260h, this.f3103a.q2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_family", value.f3261i);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size", value.f3262j);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size_unit", value.f3263k, EnumC0779dc.f6046d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_weight", value.f3264l, function12);
            JsonFieldParser.writeExpressionField(context, jSONObject, "inactive_background_color", value.f3265m, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "inactive_font_variation_settings", value.f3266n);
            JsonFieldParser.writeExpressionField(context, jSONObject, "inactive_font_weight", value.f3267o, function12);
            JsonFieldParser.writeExpressionField(context, jSONObject, "inactive_text_color", value.f3268p, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "item_spacing", value.f3269q);
            JsonFieldParser.writeExpressionField(context, jSONObject, "letter_spacing", value.f3270r);
            JsonFieldParser.writeExpressionField(context, jSONObject, "line_height", value.f3271s);
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f3272t, this.f3103a.W2());
            return jSONObject;
        }
    }

    public static final class i implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3104a;

        public i(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3104a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1013qd.e resolve(ParsingContext context, Id.e template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f3253a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = Hd.f3076b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "active_background_color", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f3254b;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "active_font_variation_settings", typeHelper2);
            Field field3 = template.f3255c;
            TypeHelper typeHelper3 = Hd.f3087m;
            Function1 function12 = EnumC0791e6.f6079e;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "active_font_weight", typeHelper3, function12);
            Field field4 = template.f3256d;
            Expression expression3 = Hd.f3077c;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "active_text_color", typeHelper, function1, expression3);
            Expression expression4 = resolveOptionalExpression4 == null ? expression3 : resolveOptionalExpression4;
            Field field5 = template.f3257e;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = Hd.f3092r;
            Expression expression5 = Hd.f3078d;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "animation_duration", typeHelper4, function13, valueValidator, expression5);
            Expression expression6 = resolveOptionalExpression5 == null ? expression5 : resolveOptionalExpression5;
            Field field6 = template.f3258f;
            TypeHelper typeHelper5 = Hd.f3088n;
            Function1 function14 = C1013qd.e.a.f7693e;
            Expression expression7 = Hd.f3079e;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "animation_type", typeHelper5, function14, expression7);
            Expression expression8 = resolveOptionalExpression6 == null ? expression7 : resolveOptionalExpression6;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, template.f3259g, data, "corner_radius", typeHelper4, function13, Hd.f3093s);
            C0735b4 c0735b4 = (C0735b4) JsonFieldResolver.resolveOptional(context, template.f3260h, data, "corners_radius", this.f3104a.r2(), this.f3104a.p2());
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, template.f3261i, data, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field7 = template.f3262j;
            ValueValidator valueValidator2 = Hd.f3094t;
            Expression expression9 = Hd.f3080f;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "font_size", typeHelper4, function13, valueValidator2, expression9);
            Expression expression10 = resolveOptionalExpression9 == null ? expression9 : resolveOptionalExpression9;
            Field field8 = template.f3263k;
            TypeHelper typeHelper6 = Hd.f3089o;
            Function1 function15 = EnumC0779dc.f6047e;
            Expression expression11 = Hd.f3081g;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "font_size_unit", typeHelper6, function15, expression11);
            Expression expression12 = resolveOptionalExpression10 == null ? expression11 : resolveOptionalExpression10;
            Field field9 = template.f3264l;
            TypeHelper typeHelper7 = Hd.f3090p;
            Expression expression13 = Hd.f3082h;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, field9, data, "font_weight", typeHelper7, function12, expression13);
            Expression expression14 = resolveOptionalExpression11 == null ? expression13 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, template.f3265m, data, "inactive_background_color", typeHelper, function1);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, template.f3266n, data, "inactive_font_variation_settings", typeHelper2);
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(context, template.f3267o, data, "inactive_font_weight", Hd.f3091q, function12);
            Field field10 = template.f3268p;
            Expression expression15 = Hd.f3083i;
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(context, field10, data, "inactive_text_color", typeHelper, function1, expression15);
            Expression expression16 = resolveOptionalExpression15 == null ? expression15 : resolveOptionalExpression15;
            Field field11 = template.f3269q;
            ValueValidator valueValidator3 = Hd.f3095u;
            Expression expression17 = Hd.f3084j;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(context, field11, data, "item_spacing", typeHelper4, function13, valueValidator3, expression17);
            if (resolveOptionalExpression16 != null) {
                expression17 = resolveOptionalExpression16;
            }
            Field field12 = template.f3270r;
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function16 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression18 = Hd.f3085k;
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(context, field12, data, "letter_spacing", typeHelper8, function16, expression18);
            Expression expression19 = resolveOptionalExpression17 == null ? expression18 : resolveOptionalExpression17;
            Expression resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(context, template.f3271s, data, "line_height", typeHelper4, function13, Hd.f3096v);
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f3272t, data, "paddings", this.f3104a.X2(), this.f3104a.V2());
            if (c0754c5 == null) {
                c0754c5 = Hd.f3086l;
            }
            Intrinsics.checkNotNullExpressionValue(c0754c5, "JsonFieldResolver.resolv…?: PADDINGS_DEFAULT_VALUE");
            return new C1013qd.e(expression2, resolveOptionalExpression2, resolveOptionalExpression3, expression4, expression6, expression8, resolveOptionalExpression7, c0735b4, resolveOptionalExpression8, expression10, expression12, expression14, resolveOptionalExpression12, resolveOptionalExpression13, resolveOptionalExpression14, expression16, expression17, expression19, resolveOptionalExpression18, c0754c5);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f3076b = companion.constant(-9120);
        f3077c = companion.constant(-872415232);
        f3078d = companion.constant(300L);
        f3079e = companion.constant(C1013qd.e.a.SLIDE);
        f3080f = companion.constant(12L);
        f3081g = companion.constant(EnumC0779dc.SP);
        f3082h = companion.constant(EnumC0791e6.REGULAR);
        f3083i = companion.constant(Integer.MIN_VALUE);
        f3084j = companion.constant(0L);
        f3085k = companion.constant(Double.valueOf(0.0d));
        f3086l = new C0754c5(companion.constant(6L), null, companion.constant(8L), companion.constant(8L), null, companion.constant(6L), null, 82, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f3087m = companion2.from(AbstractC3219i.G(EnumC0791e6.values()), a.f3097i);
        f3088n = companion2.from(AbstractC3219i.G(C1013qd.e.a.values()), b.f3098i);
        f3089o = companion2.from(AbstractC3219i.G(EnumC0779dc.values()), c.f3099i);
        f3090p = companion2.from(AbstractC3219i.G(EnumC0791e6.values()), d.f3100i);
        f3091q = companion2.from(AbstractC3219i.G(EnumC0791e6.values()), e.f3101i);
        f3092r = new ValueValidator() { // from class: O1.Cd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = Hd.f(((Long) obj).longValue());
                return f4;
            }
        };
        f3093s = new ValueValidator() { // from class: O1.Dd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = Hd.g(((Long) obj).longValue());
                return g4;
            }
        };
        f3094t = new ValueValidator() { // from class: O1.Ed
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = Hd.h(((Long) obj).longValue());
                return h4;
            }
        };
        f3095u = new ValueValidator() { // from class: O1.Fd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean i4;
                i4 = Hd.i(((Long) obj).longValue());
                return i4;
            }
        };
        f3096v = new ValueValidator() { // from class: O1.Gd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean j4;
                j4 = Hd.j(((Long) obj).longValue());
                return j4;
            }
        };
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
    public static final boolean h(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(long j4) {
        return j4 >= 0;
    }
}
