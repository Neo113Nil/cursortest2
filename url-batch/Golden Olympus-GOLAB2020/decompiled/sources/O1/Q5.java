package O1;

import O1.L5;
import O1.R5;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Q5 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4401a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f4402b = Expression.Companion.constant(BundleUtil.UNDERLINE_TAG);

    /* renamed from: c, reason: collision with root package name */
    public static final ValueValidator f4403c = new ValueValidator() { // from class: O1.O5
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean c4;
            c4 = Q5.c((String) obj);
            return c4;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final ValueValidator f4404d = new ValueValidator() { // from class: O1.P5
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean d4;
            d4 = Q5.d((String) obj);
            return d4;
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
        private final Cg f4405a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4405a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L5.c deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15463W, typeHelper, Q5.f4403c);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ER_STRING, KEY_VALIDATOR)");
            ValueValidator valueValidator = Q5.f4404d;
            Expression expression = Q5.f4402b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "placeholder", typeHelper, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new L5.c(readExpression, expression, JsonExpressionParser.readOptionalExpression(context, data, "regex", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, L5.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15463W, value.f3691a);
            JsonExpressionParser.writeExpression(context, jSONObject, "placeholder", value.f3692b);
            JsonExpressionParser.writeExpression(context, jSONObject, "regex", value.f3693c);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4406a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4406a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R5.c deserialize(ParsingContext context, R5.c cVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15463W, typeHelper, allowPropertyOverride, cVar != null ? cVar.f4625a : null, Q5.f4403c);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…rent?.key, KEY_VALIDATOR)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "placeholder", typeHelper, allowPropertyOverride, cVar != null ? cVar.f4626b : null, Q5.f4404d);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…r, PLACEHOLDER_VALIDATOR)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "regex", typeHelper, allowPropertyOverride, cVar != null ? cVar.f4627c : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…wOverride, parent?.regex)");
            return new R5.c(readFieldWithExpression, readOptionalFieldWithExpression, readOptionalFieldWithExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, R5.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15463W, value.f4625a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "placeholder", value.f4626b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "regex", value.f4627c);
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4407a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4407a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L5.c resolve(ParsingContext context, R5.c template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f4625a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, field, data, b9.h.f15463W, typeHelper, Q5.f4403c);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ER_STRING, KEY_VALIDATOR)");
            Field field2 = template.f4626b;
            ValueValidator valueValidator = Q5.f4404d;
            Expression expression = Q5.f4402b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "placeholder", typeHelper, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new L5.c(resolveExpression, expression, JsonFieldResolver.resolveOptionalExpression(context, template.f4627c, data, "regex", typeHelper));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() >= 1;
    }
}
