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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.o8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0972o8 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7359a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f7360b = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: O1.o8$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.o8$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7361a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7361a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0954n8 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC0972o8.f7360b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "allow_empty", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "label_id", typeHelper2);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_id\", TYPE_HELPER_STRING)");
            Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "pattern", typeHelper2);
            Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …ern\", TYPE_HELPER_STRING)");
            Object read = JsonPropertyParser.read(context, data, "variable");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"variable\")");
            return new C0954n8(expression, readExpression, readExpression2, (String) read);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0954n8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "allow_empty", value.f7217a);
            JsonExpressionParser.writeExpression(context, jSONObject, "label_id", value.f7218b);
            JsonExpressionParser.writeExpression(context, jSONObject, "pattern", value.f7219c);
            JsonPropertyParser.write(context, jSONObject, "type", "regex");
            JsonPropertyParser.write(context, jSONObject, "variable", value.f7220d);
            return jSONObject;
        }
    }

    /* renamed from: O1.o8$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7362a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7362a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0990p8 deserialize(ParsingContext context, C0990p8 c0990p8, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c0990p8 != null ? c0990p8.f7468a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…lowEmpty, ANY_TO_BOOLEAN)");
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "label_id", typeHelper, allowPropertyOverride, c0990p8 != null ? c0990p8.f7469b : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…verride, parent?.labelId)");
            Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "pattern", typeHelper, allowPropertyOverride, c0990p8 != null ? c0990p8.f7470c : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…verride, parent?.pattern)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "variable", allowPropertyOverride, c0990p8 != null ? c0990p8.f7471d : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…erride, parent?.variable)");
            return new C0990p8(readOptionalFieldWithExpression, readFieldWithExpression, readFieldWithExpression2, readField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0990p8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "allow_empty", value.f7468a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "label_id", value.f7469b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "pattern", value.f7470c);
            JsonPropertyParser.write(context, jSONObject, "type", "regex");
            JsonFieldParser.writeField(context, jSONObject, "variable", value.f7471d);
            return jSONObject;
        }
    }

    /* renamed from: O1.o8$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7363a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7363a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0954n8 resolve(ParsingContext context, C0990p8 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f7468a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC0972o8.f7360b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "allow_empty", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = template.f7469b;
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, field2, data, "label_id", typeHelper2);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f7470c, data, "pattern", typeHelper2);
            Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…ern\", TYPE_HELPER_STRING)");
            Object resolve = JsonFieldResolver.resolve(context, template.f7471d, data, "variable");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…riable, data, \"variable\")");
            return new C0954n8(expression, resolveExpression, resolveExpression2, (String) resolve);
        }
    }
}
