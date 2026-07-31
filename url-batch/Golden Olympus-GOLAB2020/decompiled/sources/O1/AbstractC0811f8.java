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

/* renamed from: O1.f8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0811f8 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f6186a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6187b = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: O1.f8$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.f8$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6188a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6188a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0793e8 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC0811f8.f6187b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "allow_empty", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new C0793e8(expression, JsonExpressionParser.readOptionalExpression(context, data, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.readOptional(context, data, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0793e8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "allow_empty", value.f6092a);
            JsonExpressionParser.writeExpression(context, jSONObject, "label_id", value.f6093b);
            JsonPropertyParser.write(context, jSONObject, "variable", value.f6094c);
            return jSONObject;
        }
    }

    /* renamed from: O1.f8$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6189a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6189a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0829g8 deserialize(ParsingContext context, C0829g8 c0829g8, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c0829g8 != null ? c0829g8.f6235a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…lowEmpty, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c0829g8 != null ? c0829g8.f6236b : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…verride, parent?.labelId)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "variable", allowPropertyOverride, c0829g8 != null ? c0829g8.f6237c : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…erride, parent?.variable)");
            return new C0829g8(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0829g8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "allow_empty", value.f6235a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "label_id", value.f6236b);
            JsonFieldParser.writeField(context, jSONObject, "variable", value.f6237c);
            return jSONObject;
        }
    }

    /* renamed from: O1.f8$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6190a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6190a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0793e8 resolve(ParsingContext context, C0829g8 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f6235a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC0811f8.f6187b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "allow_empty", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new C0793e8(expression, JsonFieldResolver.resolveOptionalExpression(context, template.f6236b, data, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolveOptional(context, template.f6237c, data, "variable"));
        }
    }
}
