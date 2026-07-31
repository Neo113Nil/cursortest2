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

/* renamed from: O1.ja, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0884ja {

    /* renamed from: a, reason: collision with root package name */
    private static final b f6597a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6598b = Expression.Companion.constant(EnumC0779dc.DP);

    /* renamed from: c, reason: collision with root package name */
    public static final TypeHelper f6599c = TypeHelper.Companion.from(AbstractC3219i.G(EnumC0779dc.values()), a.f6600i);

    /* renamed from: O1.ja$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6600i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0779dc);
        }
    }

    /* renamed from: O1.ja$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.ja$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6601a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6601a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0867ia deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper typeHelper = AbstractC0884ja.f6599c;
            Function1 function1 = EnumC0779dc.f6047e;
            Expression expression = AbstractC0884ja.f6598b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "unit", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new C0867ia(expression, JsonExpressionParser.readOptionalExpression(context, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0867ia value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "type", "pivot-fixed");
            JsonExpressionParser.writeExpression(context, jSONObject, "unit", value.f6482a, EnumC0779dc.f6046d);
            JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f6483b);
            return jSONObject;
        }
    }

    /* renamed from: O1.ja$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6602a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6602a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0902ka deserialize(ParsingContext context, C0902ka c0902ka, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "unit", AbstractC0884ja.f6599c, allowPropertyOverride, c0902ka != null ? c0902ka.f6836a : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, c0902ka != null ? c0902ka.f6837b : null, ParsingConvertersKt.NUMBER_TO_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…nt?.value, NUMBER_TO_INT)");
            return new C0902ka(readOptionalFieldWithExpression, readOptionalFieldWithExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0902ka value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "type", "pivot-fixed");
            JsonFieldParser.writeExpressionField(context, jSONObject, "unit", value.f6836a, EnumC0779dc.f6046d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f6837b);
            return jSONObject;
        }
    }

    /* renamed from: O1.ja$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6603a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6603a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0867ia resolve(ParsingContext context, C0902ka template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f6836a;
            TypeHelper typeHelper = AbstractC0884ja.f6599c;
            Function1 function1 = EnumC0779dc.f6047e;
            Expression expression = AbstractC0884ja.f6598b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "unit", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new C0867ia(expression, JsonFieldResolver.resolveOptionalExpression(context, template.f6837b, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }
    }
}
