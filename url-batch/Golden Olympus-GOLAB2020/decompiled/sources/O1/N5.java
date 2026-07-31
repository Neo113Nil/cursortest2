package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class N5 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4084a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f4085b = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public static final ListValidator f4086c = new ListValidator() { // from class: O1.M5
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean b4;
            b4 = N5.b(list);
            return b4;
        }
    };

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4087a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4087a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L5 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = N5.f4085b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "always_visible", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "pattern", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ern\", TYPE_HELPER_STRING)");
            List readList = JsonPropertyParser.readList(context, data, "pattern_elements", this.f4087a.q3(), N5.f4086c);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …TTERN_ELEMENTS_VALIDATOR)");
            Object read = JsonPropertyParser.read(context, data, "raw_text_variable");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"raw_text_variable\")");
            return new L5(expression, readExpression, readList, (String) read);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, L5 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "always_visible", value.f3682a);
            JsonExpressionParser.writeExpression(context, jSONObject, "pattern", value.f3683b);
            JsonPropertyParser.writeList(context, jSONObject, "pattern_elements", value.f3684c, this.f4087a.q3());
            JsonPropertyParser.write(context, jSONObject, "raw_text_variable", value.a());
            JsonPropertyParser.write(context, jSONObject, "type", "fixed_length");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4088a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4088a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R5 deserialize(ParsingContext context, R5 r5, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "always_visible", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, r5 != null ? r5.f4617a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…sVisible, ANY_TO_BOOLEAN)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "pattern", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, r5 != null ? r5.f4618b : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…verride, parent?.pattern)");
            Field field = r5 != null ? r5.f4619c : null;
            W1.h r32 = this.f4088a.r3();
            ListValidator listValidator = N5.f4086c;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, "pattern_elements", allowPropertyOverride, field, r32, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…LEMENTS_VALIDATOR.cast())");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "raw_text_variable", allowPropertyOverride, r5 != null ? r5.f4620d : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,… parent?.rawTextVariable)");
            return new R5(readOptionalFieldWithExpression, readFieldWithExpression, readListField, readField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, R5 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "always_visible", value.f4617a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "pattern", value.f4618b);
            JsonFieldParser.writeListField(context, jSONObject, "pattern_elements", value.f4619c, this.f4088a.r3());
            JsonFieldParser.writeField(context, jSONObject, "raw_text_variable", value.f4620d);
            JsonPropertyParser.write(context, jSONObject, "type", "fixed_length");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4089a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4089a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L5 resolve(ParsingContext context, R5 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f4617a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = N5.f4085b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "always_visible", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4618b, data, "pattern", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ern\", TYPE_HELPER_STRING)");
            List resolveList = JsonFieldResolver.resolveList(context, template.f4619c, data, "pattern_elements", this.f4089a.s3(), this.f4089a.q3(), N5.f4086c);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…TTERN_ELEMENTS_VALIDATOR)");
            Object resolve = JsonFieldResolver.resolve(context, template.f4620d, data, "raw_text_variable");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…ata, \"raw_text_variable\")");
            return new L5(expression2, resolveExpression, resolveList, (String) resolve);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
