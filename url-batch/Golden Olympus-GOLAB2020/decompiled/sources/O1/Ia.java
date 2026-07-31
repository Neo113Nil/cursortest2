package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
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
public abstract class Ia {

    /* renamed from: a, reason: collision with root package name */
    private static final b f3149a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f3150b = Expression.Companion.constant(EnumC0779dc.DP);

    /* renamed from: c, reason: collision with root package name */
    public static final TypeHelper f3151c = TypeHelper.Companion.from(AbstractC3219i.G(EnumC0779dc.values()), a.f3152i);

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3152i = new a();

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
        private final Cg f3153a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3153a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ha deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper typeHelper = Ia.f3151c;
            Function1 function1 = EnumC0779dc.f6047e;
            Expression expression = Ia.f3150b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "unit", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ELPER_INT, NUMBER_TO_INT)");
            return new Ha(expression, readExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Ha value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "type", "fixed");
            JsonExpressionParser.writeExpression(context, jSONObject, "unit", value.f2989a, EnumC0779dc.f6046d);
            JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f2990b);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3154a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3154a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ja deserialize(ParsingContext context, Ja ja, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "unit", Ia.f3151c, allowPropertyOverride, ja != null ? ja.f3329a : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, ja != null ? ja.f3330b : null, ParsingConvertersKt.NUMBER_TO_INT);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…nt?.value, NUMBER_TO_INT)");
            return new Ja(readOptionalFieldWithExpression, readFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Ja value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "type", "fixed");
            JsonFieldParser.writeExpressionField(context, jSONObject, "unit", value.f3329a, EnumC0779dc.f6046d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f3330b);
            return jSONObject;
        }
    }

    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3155a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3155a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ha resolve(ParsingContext context, Ja template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f3329a;
            TypeHelper typeHelper = Ia.f3151c;
            Function1 function1 = EnumC0779dc.f6047e;
            Expression expression = Ia.f3150b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "unit", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f3330b, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ELPER_INT, NUMBER_TO_INT)");
            return new Ha(expression, resolveExpression);
        }
    }
}
