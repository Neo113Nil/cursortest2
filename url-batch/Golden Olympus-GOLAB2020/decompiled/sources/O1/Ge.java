package O1;

import com.ironsource.b9;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Ge {

    /* renamed from: a, reason: collision with root package name */
    private static final a f2924a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f2925b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f2926c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f2927d;

    /* renamed from: e, reason: collision with root package name */
    public static final S5 f2928e;

    /* renamed from: f, reason: collision with root package name */
    public static final ValueValidator f2929f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2930a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2930a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ee deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …LOR, STRING_TO_COLOR_INT)");
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Ge.f2929f;
            Expression expression = Ge.f2925b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "density", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = Ge.f2926c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "is_animated", typeHelper2, function12, expression2);
            if (readOptionalExpression2 == null) {
                readOptionalExpression2 = expression2;
            }
            Expression expression3 = Ge.f2927d;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "is_enabled", typeHelper2, function12, expression3);
            Expression expression4 = readOptionalExpression3 == null ? expression3 : readOptionalExpression3;
            S5 s5 = (S5) JsonPropertyParser.readOptional(context, data, "particle_size", this.f2930a.t3());
            if (s5 == null) {
                s5 = Ge.f2928e;
            }
            S5 s52 = s5;
            Intrinsics.checkNotNullExpressionValue(s52, "JsonPropertyParser.readO…RTICLE_SIZE_DEFAULT_VALUE");
            return new Ee(readExpression, expression, readOptionalExpression2, expression4, s52);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Ee value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15459S, value.f2632a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(context, jSONObject, "density", value.f2633b);
            JsonExpressionParser.writeExpression(context, jSONObject, "is_animated", value.f2634c);
            JsonExpressionParser.writeExpression(context, jSONObject, "is_enabled", value.f2635d);
            JsonPropertyParser.write(context, jSONObject, "particle_size", value.f2636e, this.f2930a.t3());
            JsonPropertyParser.write(context, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2931a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2931a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public He deserialize(ParsingContext context, He he, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, he != null ? he.f3111a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "density", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, he != null ? he.f3112b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, Ge.f2929f);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…OUBLE, DENSITY_VALIDATOR)");
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = he != null ? he.f3113c : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "is_animated", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…Animated, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "is_enabled", typeHelper, allowPropertyOverride, he != null ? he.f3114d : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…sEnabled, ANY_TO_BOOLEAN)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "particle_size", allowPropertyOverride, he != null ? he.f3115e : null, this.f2931a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…edSizeJsonTemplateParser)");
            return new He(readFieldWithExpression, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, He value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15459S, value.f3111a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(context, jSONObject, "density", value.f3112b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "is_animated", value.f3113c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "is_enabled", value.f3114d);
            JsonFieldParser.writeField(context, jSONObject, "particle_size", value.f3115e, this.f2931a.u3());
            JsonPropertyParser.write(context, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2932a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2932a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ee resolve(ParsingContext context, He template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f3111a, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            Field field = template.f3112b;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Ge.f2929f;
            Expression expression = Ge.f2925b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "density", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = template.f3113c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = Ge.f2926c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "is_animated", typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field field3 = template.f3114d;
            Expression expression3 = Ge.f2927d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "is_enabled", typeHelper2, function12, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            S5 s5 = (S5) JsonFieldResolver.resolveOptional(context, template.f3115e, data, "particle_size", this.f2932a.v3(), this.f2932a.t3());
            if (s5 == null) {
                s5 = Ge.f2928e;
            }
            S5 s52 = s5;
            Intrinsics.checkNotNullExpressionValue(s52, "JsonFieldResolver.resolv…RTICLE_SIZE_DEFAULT_VALUE");
            return new Ee(resolveExpression, expression, resolveOptionalExpression2, expression3, s52);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f2925b = companion.constant(Double.valueOf(0.8d));
        f2926c = companion.constant(Boolean.FALSE);
        f2927d = companion.constant(Boolean.TRUE);
        f2928e = new S5(null, companion.constant(1L), 1, null);
        f2929f = new ValueValidator() { // from class: O1.Fe
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean b4;
                b4 = Ge.b(((Double) obj).doubleValue());
                return b4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d4) {
        return d4 > 0.0d && d4 <= 1.0d;
    }
}
