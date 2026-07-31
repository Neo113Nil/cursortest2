package O1;

import O1.C0886jc;
import O1.C1047sc;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
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

/* renamed from: O1.vc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1101vc {

    /* renamed from: a, reason: collision with root package name */
    private static final c f8278a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f8279b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f8280c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f8281d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f8282e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f8283f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f8284g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f8285h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f8286i;

    /* renamed from: j, reason: collision with root package name */
    public static final ValueValidator f8287j;

    /* renamed from: O1.vc$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8288i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0779dc);
        }
    }

    /* renamed from: O1.vc$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8289i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0791e6);
        }
    }

    /* renamed from: O1.vc$c */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: O1.vc$d */
    public static final class d implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8290a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8290a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0886jc.d deserialize(ParsingContext context, JSONObject data) {
            Expression expression;
            Expression expression2;
            Expression expression3;
            Expression expression4;
            Expression expression5;
            Expression expression6;
            C1081ua c1081ua;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC1101vc.f8286i;
            Expression expression7 = AbstractC1101vc.f8279b;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "font_size", typeHelper, function1, valueValidator, expression7);
            if (readOptionalExpression2 != null) {
                expression7 = readOptionalExpression2;
            }
            TypeHelper typeHelper2 = AbstractC1101vc.f8284g;
            Function1 function12 = EnumC0779dc.f6047e;
            Expression expression8 = AbstractC1101vc.f8280c;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "font_size_unit", typeHelper2, function12, expression8);
            if (readOptionalExpression3 == null) {
                readOptionalExpression3 = expression8;
            }
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            TypeHelper typeHelper3 = AbstractC1101vc.f8285h;
            Function1 function13 = EnumC0791e6.f6079e;
            Expression expression9 = AbstractC1101vc.f8281d;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "font_weight", typeHelper3, function13, expression9);
            Expression expression10 = readOptionalExpression5 == null ? expression9 : readOptionalExpression5;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "font_weight_value", typeHelper, function1, AbstractC1101vc.f8287j);
            TypeHelper<Double> typeHelper4 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function14 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression11 = AbstractC1101vc.f8282e;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "letter_spacing", typeHelper4, function14, expression11);
            if (readOptionalExpression7 == null) {
                readOptionalExpression7 = expression11;
            }
            C1081ua c1081ua2 = (C1081ua) JsonPropertyParser.readOptional(context, data, "offset", this.f8290a.W5());
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function15 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression12 = AbstractC1101vc.f8283f;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "text_color", typeHelper5, function15, expression12);
            if (readOptionalExpression8 == null) {
                expression = expression12;
                expression2 = readOptionalExpression3;
                expression3 = readOptionalExpression6;
                expression6 = expression7;
                expression5 = expression10;
                c1081ua = c1081ua2;
                expression4 = readOptionalExpression7;
            } else {
                expression = readOptionalExpression8;
                expression2 = readOptionalExpression3;
                expression3 = readOptionalExpression6;
                expression4 = readOptionalExpression7;
                expression5 = expression10;
                expression6 = expression7;
                c1081ua = c1081ua2;
            }
            return new C0886jc.d(readOptionalExpression, expression6, expression2, readOptionalExpression4, expression5, expression3, expression4, c1081ua, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0886jc.d value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "font_family", value.f6678a);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size", value.f6679b);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_size_unit", value.f6680c, EnumC0779dc.f6046d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_variation_settings", value.f6681d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_weight", value.f6682e, EnumC0791e6.f6078d);
            JsonExpressionParser.writeExpression(context, jSONObject, "font_weight_value", value.f6683f);
            JsonExpressionParser.writeExpression(context, jSONObject, "letter_spacing", value.f6684g);
            JsonPropertyParser.write(context, jSONObject, "offset", value.f6685h, this.f8290a.W5());
            JsonExpressionParser.writeExpression(context, jSONObject, "text_color", value.f6686i, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }
    }

    /* renamed from: O1.vc$e */
    public static final class e implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8291a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8291a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1047sc.d deserialize(ParsingContext context, C1047sc.d dVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, dVar != null ? dVar.f7932a : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ride, parent?.fontFamily)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = dVar != null ? dVar.f7933b : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size", typeHelper, allowPropertyOverride, field, function1, AbstractC1101vc.f8286i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…INT, FONT_SIZE_VALIDATOR)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_size_unit", AbstractC1101vc.f8284g, allowPropertyOverride, dVar != null ? dVar.f7934c : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, dVar != null ? dVar.f7935d : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…t?.fontVariationSettings)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_weight", AbstractC1101vc.f8285h, allowPropertyOverride, dVar != null ? dVar.f7936e : null, EnumC0791e6.f6079e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…ivFontWeight.FROM_STRING)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "font_weight_value", typeHelper, allowPropertyOverride, dVar != null ? dVar.f7937f : null, function1, AbstractC1101vc.f8287j);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…T_WEIGHT_VALUE_VALIDATOR)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, dVar != null ? dVar.f7938g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…pacing, NUMBER_TO_DOUBLE)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "offset", allowPropertyOverride, dVar != null ? dVar.f7939h : null, this.f8291a.X5());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…vPointJsonTemplateParser)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, dVar != null ? dVar.f7940i : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            return new C1047sc.d(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalField, readOptionalFieldWithExpression8);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1047sc.d value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_family", value.f7932a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size", value.f7933b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_size_unit", value.f7934c, EnumC0779dc.f6046d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_variation_settings", value.f7935d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_weight", value.f7936e, EnumC0791e6.f6078d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "font_weight_value", value.f7937f);
            JsonFieldParser.writeExpressionField(context, jSONObject, "letter_spacing", value.f7938g);
            JsonFieldParser.writeField(context, jSONObject, "offset", value.f7939h, this.f8291a.X5());
            JsonFieldParser.writeExpressionField(context, jSONObject, "text_color", value.f7940i, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }
    }

    /* renamed from: O1.vc$f */
    public static final class f implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8292a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8292a = component;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O1.C0886jc.d resolve(com.yandex.div.serialization.ParsingContext r19, O1.C1047sc.d r20, org.json.JSONObject r21) {
            /*
                Method dump skipped, instructions count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.AbstractC1101vc.f.resolve(com.yandex.div.serialization.ParsingContext, O1.sc$d, org.json.JSONObject):O1.jc$d");
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8279b = companion.constant(12L);
        f8280c = companion.constant(EnumC0779dc.SP);
        f8281d = companion.constant(EnumC0791e6.REGULAR);
        f8282e = companion.constant(Double.valueOf(0.0d));
        f8283f = companion.constant(-16777216);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f8284g = companion2.from(AbstractC3219i.G(EnumC0779dc.values()), a.f8288i);
        f8285h = companion2.from(AbstractC3219i.G(EnumC0791e6.values()), b.f8289i);
        f8286i = new ValueValidator() { // from class: O1.tc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean c4;
                c4 = AbstractC1101vc.c(((Long) obj).longValue());
                return c4;
            }
        };
        f8287j = new ValueValidator() { // from class: O1.uc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = AbstractC1101vc.d(((Long) obj).longValue());
                return d4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j4) {
        return j4 > 0;
    }
}
