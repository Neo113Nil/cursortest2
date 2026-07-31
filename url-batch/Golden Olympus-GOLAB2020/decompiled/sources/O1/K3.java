package O1;

import O1.H3;
import O1.L3;
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
public abstract class K3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f3376a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f3377b = Expression.Companion.constant(Boolean.TRUE);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3378a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3378a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H3.c deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Object read = JsonPropertyParser.read(context, data, "div", this.f3378a.J4());
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"div…nent.divJsonEntityParser)");
            Z z4 = (Z) read;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = K3.f3377b;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "selector", typeHelper, function1, expression);
            if (readOptionalExpression2 != null) {
                expression = readOptionalExpression2;
            }
            return new H3.c(z4, readOptionalExpression, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, H3.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "div", value.f2955a, this.f3378a.J4());
            JsonExpressionParser.writeExpression(context, jSONObject, "id", value.f2956b);
            JsonExpressionParser.writeExpression(context, jSONObject, "selector", value.f2957c);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3379a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3379a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L3.c deserialize(ParsingContext context, L3.c cVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "div", allowPropertyOverride, cVar != null ? cVar.f3669a : null, this.f3379a.K4());
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…nt.divJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cVar != null ? cVar.f3670b : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…llowOverride, parent?.id)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "selector", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, cVar != null ? cVar.f3671c : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…selector, ANY_TO_BOOLEAN)");
            return new L3.c(readField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, L3.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "div", value.f3669a, this.f3379a.K4());
            JsonFieldParser.writeExpressionField(context, jSONObject, "id", value.f3670b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "selector", value.f3671c);
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3380a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3380a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H3.c resolve(ParsingContext context, L3.c template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Object resolve = JsonFieldResolver.resolve(context, template.f3669a, data, "div", this.f3380a.L4(), this.f3380a.J4());
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…nent.divJsonEntityParser)");
            Z z4 = (Z) resolve;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f3670b, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field = template.f3671c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = K3.f3377b;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "selector", typeHelper, function1, expression);
            if (resolveOptionalExpression2 != null) {
                expression = resolveOptionalExpression2;
            }
            return new H3.c(z4, resolveOptionalExpression, expression);
        }
    }
}
