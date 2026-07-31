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

/* renamed from: O1.i8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0865i8 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f6473a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6474b = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: O1.i8$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.i8$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6475a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6475a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0847h8 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC0865i8.f6474b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "allow_empty", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "condition", typeHelper, function1);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_BOOLEAN, ANY_TO_BOOLEAN)");
            Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "label_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …_id\", TYPE_HELPER_STRING)");
            Object read = JsonPropertyParser.read(context, data, "variable");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"variable\")");
            return new C0847h8(expression, readExpression, readExpression2, (String) read);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0847h8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "allow_empty", value.f6376a);
            JsonExpressionParser.writeExpression(context, jSONObject, "condition", value.f6377b);
            JsonExpressionParser.writeExpression(context, jSONObject, "label_id", value.f6378c);
            JsonPropertyParser.write(context, jSONObject, "type", "expression");
            JsonPropertyParser.write(context, jSONObject, "variable", value.f6379d);
            return jSONObject;
        }
    }

    /* renamed from: O1.i8$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6476a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6476a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0882j8 deserialize(ParsingContext context, C0882j8 c0882j8, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = c0882j8 != null ? c0882j8.f6591a : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "allow_empty", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…lowEmpty, ANY_TO_BOOLEAN)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "condition", typeHelper, allowPropertyOverride, c0882j8 != null ? c0882j8.f6592b : null, function1);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…ondition, ANY_TO_BOOLEAN)");
            Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c0882j8 != null ? c0882j8.f6593c : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…verride, parent?.labelId)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "variable", allowPropertyOverride, c0882j8 != null ? c0882j8.f6594d : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…erride, parent?.variable)");
            return new C0882j8(readOptionalFieldWithExpression, readFieldWithExpression, readFieldWithExpression2, readField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0882j8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "allow_empty", value.f6591a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "condition", value.f6592b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "label_id", value.f6593c);
            JsonPropertyParser.write(context, jSONObject, "type", "expression");
            JsonFieldParser.writeField(context, jSONObject, "variable", value.f6594d);
            return jSONObject;
        }
    }

    /* renamed from: O1.i8$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6477a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6477a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0847h8 resolve(ParsingContext context, C0882j8 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f6591a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC0865i8.f6474b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "allow_empty", typeHelper, function1, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6592b, data, "condition", typeHelper, function1);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_BOOLEAN, ANY_TO_BOOLEAN)");
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f6593c, data, "label_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
            Object resolve = JsonFieldResolver.resolve(context, template.f6594d, data, "variable");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…riable, data, \"variable\")");
            return new C0847h8(resolveOptionalExpression, resolveExpression, resolveExpression2, (String) resolve);
        }
    }
}
