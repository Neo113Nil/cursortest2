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
public abstract class Lb {

    /* renamed from: a, reason: collision with root package name */
    private static final a f3707a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f3708b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f3709c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f3710d;

    /* renamed from: e, reason: collision with root package name */
    public static final ValueValidator f3711e;

    /* renamed from: f, reason: collision with root package name */
    public static final ValueValidator f3712f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3713a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3713a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ib deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Lb.f3711e;
            Expression expression = Lb.f3708b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = Lb.f3712f;
            Expression expression3 = Lb.f3709c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "blur", typeHelper2, function12, valueValidator2, expression3);
            if (readOptionalExpression2 != null) {
                expression3 = readOptionalExpression2;
            }
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression4 = Lb.f3710d;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, b9.h.f15459S, typeHelper3, function13, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            Object read = JsonPropertyParser.read(context, data, "offset", this.f3713a.W5());
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"off…divPointJsonEntityParser)");
            return new Ib(expression2, expression3, expression4, (C1081ua) read);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Ib value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.f3161a);
            JsonExpressionParser.writeExpression(context, jSONObject, "blur", value.f3162b);
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15459S, value.f3163c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "offset", value.f3164d, this.f3713a.W5());
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3714a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3714a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mb deserialize(ParsingContext context, Mb mb, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, mb != null ? mb.f3891a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, Lb.f3711e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "blur", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, mb != null ? mb.f3892b : null, ParsingConvertersKt.NUMBER_TO_INT, Lb.f3712f);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…R_TO_INT, BLUR_VALIDATOR)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, mb != null ? mb.f3893c : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "offset", allowPropertyOverride, mb != null ? mb.f3894d : null, this.f3714a.X5());
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…vPointJsonTemplateParser)");
            return new Mb(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Mb value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f3891a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "blur", value.f3892b);
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15459S, value.f3893c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "offset", value.f3894d, this.f3714a.X5());
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3715a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3715a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ib resolve(ParsingContext context, Mb template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f3891a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Lb.f3711e;
            Expression expression = Lb.f3708b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f3892b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = Lb.f3712f;
            Expression expression3 = Lb.f3709c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "blur", typeHelper2, function12, valueValidator2, expression3);
            if (resolveOptionalExpression2 != null) {
                expression3 = resolveOptionalExpression2;
            }
            Field field3 = template.f3893c;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression4 = Lb.f3710d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, b9.h.f15459S, typeHelper3, function13, expression4);
            if (resolveOptionalExpression3 != null) {
                expression4 = resolveOptionalExpression3;
            }
            Object resolve = JsonFieldResolver.resolve(context, template.f3894d, data, "offset", this.f3715a.Y5(), this.f3715a.W5());
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…divPointJsonEntityParser)");
            return new Ib(expression2, expression3, expression4, (C1081ua) resolve);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f3708b = companion.constant(Double.valueOf(0.19d));
        f3709c = companion.constant(2L);
        f3710d = companion.constant(0);
        f3711e = new ValueValidator() { // from class: O1.Jb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean c4;
                c4 = Lb.c(((Double) obj).doubleValue());
                return c4;
            }
        };
        f3712f = new ValueValidator() { // from class: O1.Kb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = Lb.d(((Long) obj).longValue());
                return d4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j4) {
        return j4 >= 0;
    }
}
