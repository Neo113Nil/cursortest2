package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class G1 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f2808a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f2809b = Expression.Companion.constant(Boolean.TRUE);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2810a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2810a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public F1 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = G1.f2809b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "animated", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            Object read = JsonPropertyParser.read(context, data, FirebaseAnalytics.Param.DESTINATION, this.f2810a.D0());
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"des…tinationJsonEntityParser)");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …\"id\", TYPE_HELPER_STRING)");
            return new F1(expression, (A1) read, readExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, F1 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "animated", value.f2711a);
            JsonPropertyParser.write(context, jSONObject, FirebaseAnalytics.Param.DESTINATION, value.f2712b, this.f2810a.D0());
            JsonExpressionParser.writeExpression(context, jSONObject, "id", value.f2713c);
            JsonPropertyParser.write(context, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2811a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2811a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H1 deserialize(ParsingContext context, H1 h12, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, h12 != null ? h12.f2939a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…animated, ANY_TO_BOOLEAN)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, FirebaseAnalytics.Param.DESTINATION, allowPropertyOverride, h12 != null ? h12.f2940b : null, this.f2811a.E0());
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…nationJsonTemplateParser)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, h12 != null ? h12.f2941c : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…llowOverride, parent?.id)");
            return new H1(readOptionalFieldWithExpression, readField, readFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, H1 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "animated", value.f2939a);
            JsonFieldParser.writeField(context, jSONObject, FirebaseAnalytics.Param.DESTINATION, value.f2940b, this.f2811a.E0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "id", value.f2941c);
            JsonPropertyParser.write(context, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2812a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2812a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public F1 resolve(ParsingContext context, H1 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f2939a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = G1.f2809b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "animated", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Object resolve = JsonFieldResolver.resolve(context, template.f2940b, data, FirebaseAnalytics.Param.DESTINATION, this.f2812a.F0(), this.f2812a.D0());
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…tinationJsonEntityParser)");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f2941c, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…\"id\", TYPE_HELPER_STRING)");
            return new F1(expression, (A1) resolve, resolveExpression);
        }
    }
}
