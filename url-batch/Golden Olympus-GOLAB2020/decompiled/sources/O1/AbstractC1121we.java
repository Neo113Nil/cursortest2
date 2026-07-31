package O1;

import O1.Kd;
import O1.Me;
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
import java.util.List;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.we, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1121we {

    /* renamed from: a, reason: collision with root package name */
    private static final f f8344a = new f(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f8345b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f8346c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f8347d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeHelper f8348e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeHelper f8349f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f8350g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f8351h;

    /* renamed from: i, reason: collision with root package name */
    public static final TypeHelper f8352i;

    /* renamed from: j, reason: collision with root package name */
    public static final ValueValidator f8353j;

    /* renamed from: k, reason: collision with root package name */
    public static final ValueValidator f8354k;

    /* renamed from: l, reason: collision with root package name */
    public static final ValueValidator f8355l;

    /* renamed from: m, reason: collision with root package name */
    public static final ValueValidator f8356m;

    /* renamed from: n, reason: collision with root package name */
    public static final ValueValidator f8357n;

    /* renamed from: o, reason: collision with root package name */
    public static final ValueValidator f8358o;

    /* renamed from: O1.we$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8359i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Ld);
        }
    }

    /* renamed from: O1.we$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8360i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0779dc);
        }
    }

    /* renamed from: O1.we$c */
    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f8361i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0791e6);
        }
    }

    /* renamed from: O1.we$d */
    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f8362i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1169z8);
        }
    }

    /* renamed from: O1.we$e */
    static final class e extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final e f8363i = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1169z8);
        }
    }

    /* renamed from: O1.we$f */
    private static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    /* renamed from: O1.we$g */
    public static final class g implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8364a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8364a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Kd.e deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "actions", this.f8364a.u0());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", AbstractC1121we.f8348e, Ld.f3773e);
            AbstractC0853he abstractC0853he = (AbstractC0853he) JsonPropertyParser.readOptional(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f8364a.m8());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression = AbstractC1121we.f8345b;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "baseline_offset", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression2 == null ? expression : readOptionalExpression2;
            C0942me c0942me = (C0942me) JsonPropertyParser.readOptional(context, data, "border", this.f8364a.p8());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "end", typeHelper2, function12, AbstractC1121we.f8353j);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "font_family", typeHelper3);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "font_feature_settings", typeHelper3);
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "font_size", typeHelper2, function12, AbstractC1121we.f8354k);
            TypeHelper typeHelper4 = AbstractC1121we.f8349f;
            Function1 function13 = EnumC0779dc.f6047e;
            Expression expression3 = AbstractC1121we.f8346c;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "font_size_unit", typeHelper4, function13, expression3);
            Expression expression4 = readOptionalExpression7 == null ? expression3 : readOptionalExpression7;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "font_weight", AbstractC1121we.f8350g, EnumC0791e6.f6079e);
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "font_weight_value", typeHelper2, function12, AbstractC1121we.f8355l);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "letter_spacing", typeHelper, function1);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "line_height", typeHelper2, function12, AbstractC1121we.f8356m);
            AbstractC1139xe abstractC1139xe = (AbstractC1139xe) JsonPropertyParser.readOptional(context, data, "mask", this.f8364a.x8());
            ValueValidator valueValidator = AbstractC1121we.f8357n;
            Expression expression5 = AbstractC1121we.f8347d;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "start", typeHelper2, function12, valueValidator, expression5);
            if (readOptionalExpression13 != null) {
                expression5 = readOptionalExpression13;
            }
            TypeHelper typeHelper5 = AbstractC1121we.f8351h;
            Function1 function14 = EnumC1169z8.f8797e;
            return new Kd.e(readOptionalList, readOptionalExpression, abstractC0853he, expression2, c0942me, readOptionalExpression3, readOptionalExpression4, readOptionalExpression5, readOptionalExpression6, expression4, readOptionalExpression8, readOptionalExpression9, readOptionalExpression10, readOptionalExpression11, readOptionalExpression12, abstractC1139xe, expression5, JsonExpressionParser.readOptionalExpression(context, data, "strike", typeHelper5, function14), JsonExpressionParser.readOptionalExpression(context, data, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (Ib) JsonPropertyParser.readOptional(context, data, "text_shadow", this.f8364a.M6()), JsonExpressionParser.readOptionalExpression(context, data, "top_offset", typeHelper2, function12, AbstractC1121we.f8358o), JsonExpressionParser.readOptionalExpression(context, data, "underline", AbstractC1121we.f8352i, function14));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Kd.e value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, "actions", value.f3582a, this.f8364a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.f3583b, Ld.f3772d);
            JsonPropertyParser.write(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f3584c, this.f8364a.m8());
            JsonExpressionParser.writeExpression(context, jSONObject, "baseline_offset", value.f3585d);
            JsonPropertyParser.write(context, jSONObject, "border", value.f3586e, this.f8364a.p8());
            JsonExpressionParser.writeExpression(context, jSONObject, "end", value.f3587f);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_family", value.f3588g);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_feature_settings", value.f3589h);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size", value.f3590i);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size_unit", value.f3591j, EnumC0779dc.f6046d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_variation_settings", value.f3592k);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_weight", value.f3593l, EnumC0791e6.f6078d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_weight_value", value.f3594m);
            JsonExpressionParser.writeExpression(context, jSONObject, "letter_spacing", value.f3595n);
            JsonExpressionParser.writeExpression(context, jSONObject, "line_height", value.f3596o);
            JsonPropertyParser.write(context, jSONObject, "mask", value.f3597p, this.f8364a.x8());
            JsonExpressionParser.writeExpression(context, jSONObject, "start", value.f3598q);
            Expression expression = value.f3599r;
            Function1 function1 = EnumC1169z8.f8796d;
            JsonExpressionParser.writeExpression(context, jSONObject, "strike", expression, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "text_color", value.f3600s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "text_shadow", value.f3601t, this.f8364a.M6());
            JsonExpressionParser.writeExpression(context, jSONObject, "top_offset", value.f3602u);
            JsonExpressionParser.writeExpression(context, jSONObject, "underline", value.f3603v, function1);
            return jSONObject;
        }
    }

    /* renamed from: O1.we$h */
    public static final class h implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8365a;

        public h(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8365a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Me.e deserialize(ParsingContext context, Me.e eVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "actions", allowPropertyOverride, eVar != null ? eVar.f4032a : null, this.f8365a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", AbstractC1121we.f8348e, allowPropertyOverride, eVar != null ? eVar.f4033b : null, Ld.f3773e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, eVar != null ? eVar.f4034c : null, this.f8365a.n8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…groundJsonTemplateParser)");
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = eVar != null ? eVar.f4035d : null;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "baseline_offset", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…Offset, NUMBER_TO_DOUBLE)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, eVar != null ? eVar.f4036e : null, this.f8365a.q8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = eVar != null ? eVar.f4037f : null;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "end", typeHelper2, allowPropertyOverride, field2, function12, AbstractC1121we.f8353j);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…ER_TO_INT, END_VALIDATOR)");
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_family", typeHelper3, allowPropertyOverride, eVar != null ? eVar.f4038g : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…ride, parent?.fontFamily)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_feature_settings", typeHelper3, allowPropertyOverride, eVar != null ? eVar.f4039h : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…ent?.fontFeatureSettings)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f4040i : null, function12, AbstractC1121we.f8354k);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…INT, FONT_SIZE_VALIDATOR)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size_unit", AbstractC1121we.f8349f, allowPropertyOverride, eVar != null ? eVar.f4041j : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, eVar != null ? eVar.f4042k : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…t?.fontVariationSettings)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_weight", AbstractC1121we.f8350g, allowPropertyOverride, eVar != null ? eVar.f4043l : null, EnumC0791e6.f6079e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…ivFontWeight.FROM_STRING)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_weight_value", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f4044m : null, function12, AbstractC1121we.f8355l);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…T_WEIGHT_VALUE_VALIDATOR)");
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "letter_spacing", typeHelper, allowPropertyOverride, eVar != null ? eVar.f4045n : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…pacing, NUMBER_TO_DOUBLE)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "line_height", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f4046o : null, function12, AbstractC1121we.f8356m);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…T, LINE_HEIGHT_VALIDATOR)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "mask", allowPropertyOverride, eVar != null ? eVar.f4047p : null, this.f8365a.y8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…geMaskJsonTemplateParser)");
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f4048q : null, function12, AbstractC1121we.f8357n);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…_TO_INT, START_VALIDATOR)");
            TypeHelper typeHelper4 = AbstractC1121we.f8351h;
            Field field3 = eVar != null ? eVar.f4049r : null;
            Function1 function13 = EnumC1169z8.f8797e;
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "strike", typeHelper4, allowPropertyOverride, field3, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression14, "readOptionalFieldWithExp…DivLineStyle.FROM_STRING)");
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, eVar != null ? eVar.f4050s : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression15, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "text_shadow", allowPropertyOverride, eVar != null ? eVar.f4051t : null, this.f8365a.N6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…ShadowJsonTemplateParser)");
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "top_offset", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f4052u : null, function12, AbstractC1121we.f8358o);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression16, "readOptionalFieldWithExp…NT, TOP_OFFSET_VALIDATOR)");
            Field readOptionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "underline", AbstractC1121we.f8352i, allowPropertyOverride, eVar != null ? eVar.f4053v : null, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression17, "readOptionalFieldWithExp…DivLineStyle.FROM_STRING)");
            return new Me.e(readOptionalListField, readOptionalFieldWithExpression, readOptionalField, readOptionalFieldWithExpression2, readOptionalField2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalField3, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalFieldWithExpression15, readOptionalField4, readOptionalFieldWithExpression16, readOptionalFieldWithExpression17);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Me.e value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, "actions", value.f4032a, this.f8365a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f4033b, Ld.f3772d);
            JsonFieldParser.writeField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f4034c, this.f8365a.n8());
            JsonFieldParser.writeExpressionField(context, jSONObject, "baseline_offset", value.f4035d);
            JsonFieldParser.writeField(context, jSONObject, "border", value.f4036e, this.f8365a.q8());
            JsonFieldParser.writeExpressionField(context, jSONObject, "end", value.f4037f);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_family", value.f4038g);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_feature_settings", value.f4039h);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size", value.f4040i);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size_unit", value.f4041j, EnumC0779dc.f6046d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_variation_settings", value.f4042k);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_weight", value.f4043l, EnumC0791e6.f6078d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_weight_value", value.f4044m);
            JsonFieldParser.writeExpressionField(context, jSONObject, "letter_spacing", value.f4045n);
            JsonFieldParser.writeExpressionField(context, jSONObject, "line_height", value.f4046o);
            JsonFieldParser.writeField(context, jSONObject, "mask", value.f4047p, this.f8365a.y8());
            JsonFieldParser.writeExpressionField(context, jSONObject, "start", value.f4048q);
            Field field = value.f4049r;
            Function1 function1 = EnumC1169z8.f8796d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "strike", field, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "text_color", value.f4050s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "text_shadow", value.f4051t, this.f8365a.N6());
            JsonFieldParser.writeExpressionField(context, jSONObject, "top_offset", value.f4052u);
            JsonFieldParser.writeExpressionField(context, jSONObject, "underline", value.f4053v, function1);
            return jSONObject;
        }
    }

    /* renamed from: O1.we$i */
    public static final class i implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8366a;

        public i(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8366a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Kd.e resolve(ParsingContext context, Me.e template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f4032a, data, "actions", this.f8366a.w0(), this.f8366a.u0());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f4033b, data, "alignment_vertical", AbstractC1121we.f8348e, Ld.f3773e);
            AbstractC0853he abstractC0853he = (AbstractC0853he) JsonFieldResolver.resolveOptional(context, template.f4034c, data, io.appmetrica.analytics.impl.L2.f37912g, this.f8366a.o8(), this.f8366a.m8());
            Field field = template.f4035d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression = AbstractC1121we.f8345b;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "baseline_offset", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression2 == null ? expression : resolveOptionalExpression2;
            C0942me c0942me = (C0942me) JsonFieldResolver.resolveOptional(context, template.f4036e, data, "border", this.f8366a.r8(), this.f8366a.p8());
            Field field2 = template.f4037f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "end", typeHelper2, function12, AbstractC1121we.f8353j);
            Field field3 = template.f4038g;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "font_family", typeHelper3);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, template.f4039h, data, "font_feature_settings", typeHelper3);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, template.f4040i, data, "font_size", typeHelper2, function12, AbstractC1121we.f8354k);
            Field field4 = template.f4041j;
            TypeHelper typeHelper4 = AbstractC1121we.f8349f;
            Function1 function13 = EnumC0779dc.f6047e;
            Expression expression3 = AbstractC1121we.f8346c;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "font_size_unit", typeHelper4, function13, expression3);
            Expression expression4 = resolveOptionalExpression7 == null ? expression3 : resolveOptionalExpression7;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, template.f4042k, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, template.f4043l, data, "font_weight", AbstractC1121we.f8350g, EnumC0791e6.f6079e);
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, template.f4044m, data, "font_weight_value", typeHelper2, function12, AbstractC1121we.f8355l);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, template.f4045n, data, "letter_spacing", typeHelper, function1);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, template.f4046o, data, "line_height", typeHelper2, function12, AbstractC1121we.f8356m);
            AbstractC1139xe abstractC1139xe = (AbstractC1139xe) JsonFieldResolver.resolveOptional(context, template.f4047p, data, "mask", this.f8366a.z8(), this.f8366a.x8());
            Field field5 = template.f4048q;
            ValueValidator valueValidator = AbstractC1121we.f8357n;
            Expression expression5 = AbstractC1121we.f8347d;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "start", typeHelper2, function12, valueValidator, expression5);
            if (resolveOptionalExpression13 != null) {
                expression5 = resolveOptionalExpression13;
            }
            Field field6 = template.f4049r;
            TypeHelper typeHelper5 = AbstractC1121we.f8351h;
            Function1 function14 = EnumC1169z8.f8797e;
            return new Kd.e(resolveOptionalList, resolveOptionalExpression, abstractC0853he, expression2, c0942me, resolveOptionalExpression3, resolveOptionalExpression4, resolveOptionalExpression5, resolveOptionalExpression6, expression4, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalExpression12, abstractC1139xe, expression5, JsonFieldResolver.resolveOptionalExpression(context, field6, data, "strike", typeHelper5, function14), JsonFieldResolver.resolveOptionalExpression(context, template.f4050s, data, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (Ib) JsonFieldResolver.resolveOptional(context, template.f4051t, data, "text_shadow", this.f8366a.O6(), this.f8366a.M6()), JsonFieldResolver.resolveOptionalExpression(context, template.f4052u, data, "top_offset", typeHelper2, function12, AbstractC1121we.f8358o), JsonFieldResolver.resolveOptionalExpression(context, template.f4053v, data, "underline", AbstractC1121we.f8352i, function14));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8345b = companion.constant(Double.valueOf(0.0d));
        f8346c = companion.constant(EnumC0779dc.SP);
        f8347d = companion.constant(0L);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f8348e = companion2.from(AbstractC3219i.G(Ld.values()), a.f8359i);
        f8349f = companion2.from(AbstractC3219i.G(EnumC0779dc.values()), b.f8360i);
        f8350g = companion2.from(AbstractC3219i.G(EnumC0791e6.values()), c.f8361i);
        f8351h = companion2.from(AbstractC3219i.G(EnumC1169z8.values()), d.f8362i);
        f8352i = companion2.from(AbstractC3219i.G(EnumC1169z8.values()), e.f8363i);
        f8353j = new ValueValidator() { // from class: O1.qe
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = AbstractC1121we.g(((Long) obj).longValue());
                return g4;
            }
        };
        f8354k = new ValueValidator() { // from class: O1.re
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = AbstractC1121we.h(((Long) obj).longValue());
                return h4;
            }
        };
        f8355l = new ValueValidator() { // from class: O1.se
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean i4;
                i4 = AbstractC1121we.i(((Long) obj).longValue());
                return i4;
            }
        };
        f8356m = new ValueValidator() { // from class: O1.te
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean j4;
                j4 = AbstractC1121we.j(((Long) obj).longValue());
                return j4;
            }
        };
        f8357n = new ValueValidator() { // from class: O1.ue
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean k4;
                k4 = AbstractC1121we.k(((Long) obj).longValue());
                return k4;
            }
        };
        f8358o = new ValueValidator() { // from class: O1.ve
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean l4;
                l4 = AbstractC1121we.l(((Long) obj).longValue());
                return l4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j4) {
        return j4 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(long j4) {
        return j4 > 0;
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
        return j4 >= 0;
    }
}
