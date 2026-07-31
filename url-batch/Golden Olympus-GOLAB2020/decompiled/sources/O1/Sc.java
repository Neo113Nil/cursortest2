package O1;

import O1.Tc;
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
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Sc {

    /* renamed from: a, reason: collision with root package name */
    private static final b f4796a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Tc.d f4797b = new Tc.d(new C0762cd());

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f4798c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f4799d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeHelper f4800e;

    /* renamed from: f, reason: collision with root package name */
    public static final ValueValidator f4801f;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4802i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0779dc);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4803a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4803a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Qc deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …LOR, STRING_TO_COLOR_INT)");
            Tc tc = (Tc) JsonPropertyParser.readOptional(context, data, "style", this.f4803a.C7());
            if (tc == null) {
                tc = Sc.f4797b;
            }
            Tc tc2 = tc;
            Intrinsics.checkNotNullExpressionValue(tc2, "JsonPropertyParser.readO…r) ?: STYLE_DEFAULT_VALUE");
            TypeHelper typeHelper = Sc.f4800e;
            Function1 function1 = EnumC0779dc.f6047e;
            Expression expression = Sc.f4798c;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "unit", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Sc.f4801f;
            Expression expression3 = Sc.f4799d;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "width", typeHelper2, function12, valueValidator, expression3);
            if (readOptionalExpression2 != null) {
                expression3 = readOptionalExpression2;
            }
            return new Qc(readExpression, tc2, expression2, expression3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Qc value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15459S, value.f4476a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "style", value.f4477b, this.f4803a.C7());
            JsonExpressionParser.writeExpression(context, jSONObject, "unit", value.f4478c, EnumC0779dc.f6046d);
            JsonExpressionParser.writeExpression(context, jSONObject, "width", value.f4479d);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4804a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4804a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0870id deserialize(ParsingContext context, C0870id c0870id, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, c0870id != null ? c0870id.f6503a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…lor, STRING_TO_COLOR_INT)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "style", allowPropertyOverride, c0870id != null ? c0870id.f6504b : null, this.f4804a.D7());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…eStyleJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "unit", Sc.f4800e, allowPropertyOverride, c0870id != null ? c0870id.f6505c : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "width", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, c0870id != null ? c0870id.f6506d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, Sc.f4801f);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…_DOUBLE, WIDTH_VALIDATOR)");
            return new C0870id(readFieldWithExpression, readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0870id value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15459S, value.f6503a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "style", value.f6504b, this.f4804a.D7());
            JsonFieldParser.writeExpressionField(context, jSONObject, "unit", value.f6505c, EnumC0779dc.f6046d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "width", value.f6506d);
            return jSONObject;
        }
    }

    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4805a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4805a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Qc resolve(ParsingContext context, C0870id template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6503a, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            Tc tc = (Tc) JsonFieldResolver.resolveOptional(context, template.f6504b, data, "style", this.f4805a.E7(), this.f4805a.C7());
            if (tc == null) {
                tc = Sc.f4797b;
            }
            Intrinsics.checkNotNullExpressionValue(tc, "JsonFieldResolver.resolv…r) ?: STYLE_DEFAULT_VALUE");
            Field field = template.f6505c;
            TypeHelper typeHelper = Sc.f4800e;
            Function1 function1 = EnumC0779dc.f6047e;
            Expression expression = Sc.f4798c;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "unit", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f6506d;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Sc.f4801f;
            Expression expression3 = Sc.f4799d;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "width", typeHelper2, function12, valueValidator, expression3);
            if (resolveOptionalExpression2 != null) {
                expression3 = resolveOptionalExpression2;
            }
            return new Qc(resolveExpression, tc, expression2, expression3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4798c = companion.constant(EnumC0779dc.DP);
        f4799d = companion.constant(Double.valueOf(1.0d));
        f4800e = TypeHelper.Companion.from(AbstractC3219i.G(EnumC0779dc.values()), a.f4802i);
        f4801f = new ValueValidator() { // from class: O1.Rc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean b4;
                b4 = Sc.b(((Double) obj).doubleValue());
                return b4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d4) {
        return d4 >= 0.0d;
    }
}
