package O1;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
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

/* renamed from: O1.v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1094v5 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f8211a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f8212b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f8213c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f8214d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f8215e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeHelper f8216f;

    /* renamed from: g, reason: collision with root package name */
    public static final ValueValidator f8217g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f8218h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f8219i;

    /* renamed from: O1.v5$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8220i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1163z2);
        }
    }

    /* renamed from: O1.v5$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.v5$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8221a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8221a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1022r5 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC1094v5.f8217g;
            Expression expression = AbstractC1094v5.f8212b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = AbstractC1094v5.f8218h;
            Expression expression3 = AbstractC1094v5.f8213c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, valueValidator2, expression3);
            Expression expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            TypeHelper typeHelper3 = AbstractC1094v5.f8216f;
            Function1 function13 = EnumC1163z2.f8690e;
            Expression expression5 = AbstractC1094v5.f8214d;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "interpolator", typeHelper3, function13, expression5);
            Expression expression6 = readOptionalExpression3 == null ? expression5 : readOptionalExpression3;
            ValueValidator valueValidator3 = AbstractC1094v5.f8219i;
            Expression expression7 = AbstractC1094v5.f8215e;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "start_delay", typeHelper2, function12, valueValidator3, expression7);
            if (readOptionalExpression4 != null) {
                expression7 = readOptionalExpression4;
            }
            return new C1022r5(expression2, expression4, expression6, expression7);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1022r5 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.f7772a);
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.b());
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.c(), EnumC1163z2.f8689d);
            JsonExpressionParser.writeExpression(context, jSONObject, "start_delay", value.d());
            JsonPropertyParser.write(context, jSONObject, "type", "fade");
            return jSONObject;
        }
    }

    /* renamed from: O1.v5$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8222a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8222a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1112w5 deserialize(ParsingContext context, C1112w5 c1112w5, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, c1112w5 != null ? c1112w5.f8316a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, AbstractC1094v5.f8217g);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c1112w5 != null ? c1112w5.f8317b : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, AbstractC1094v5.f8218h);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…_INT, DURATION_VALIDATOR)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", AbstractC1094v5.f8216f, allowPropertyOverride, c1112w5 != null ? c1112w5.f8318c : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_delay", typeHelper, allowPropertyOverride, c1112w5 != null ? c1112w5.f8319d : null, function1, AbstractC1094v5.f8219i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, START_DELAY_VALIDATOR)");
            return new C1112w5(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1112w5 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f8316a);
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f8317b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f8318c, EnumC1163z2.f8689d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_delay", value.f8319d);
            JsonPropertyParser.write(context, jSONObject, "type", "fade");
            return jSONObject;
        }
    }

    /* renamed from: O1.v5$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8223a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8223a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1022r5 resolve(ParsingContext context, C1112w5 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f8316a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC1094v5.f8217g;
            Expression expression = AbstractC1094v5.f8212b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f8317b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = AbstractC1094v5.f8218h;
            Expression expression3 = AbstractC1094v5.f8213c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, valueValidator2, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Field field3 = template.f8318c;
            TypeHelper typeHelper3 = AbstractC1094v5.f8216f;
            Function1 function13 = EnumC1163z2.f8690e;
            Expression expression5 = AbstractC1094v5.f8214d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "interpolator", typeHelper3, function13, expression5);
            Expression expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            Field field4 = template.f8319d;
            ValueValidator valueValidator3 = AbstractC1094v5.f8219i;
            Expression expression7 = AbstractC1094v5.f8215e;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "start_delay", typeHelper2, function12, valueValidator3, expression7);
            if (resolveOptionalExpression4 != null) {
                expression7 = resolveOptionalExpression4;
            }
            return new C1022r5(expression2, expression4, expression6, expression7);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8212b = companion.constant(Double.valueOf(0.0d));
        f8213c = companion.constant(200L);
        f8214d = companion.constant(EnumC1163z2.EASE_IN_OUT);
        f8215e = companion.constant(0L);
        f8216f = TypeHelper.Companion.from(AbstractC3219i.G(EnumC1163z2.values()), a.f8220i);
        f8217g = new ValueValidator() { // from class: O1.s5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = AbstractC1094v5.d(((Double) obj).doubleValue());
                return d4;
            }
        };
        f8218h = new ValueValidator() { // from class: O1.t5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = AbstractC1094v5.e(((Long) obj).longValue());
                return e4;
            }
        };
        f8219i = new ValueValidator() { // from class: O1.u5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = AbstractC1094v5.f(((Long) obj).longValue());
                return f4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j4) {
        return j4 >= 0;
    }
}
