package O1;

import O1.C0765cg;
import O1.C0872ig;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* renamed from: O1.eg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0801eg {

    /* renamed from: a, reason: collision with root package name */
    private static final b f6144a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6145b = Expression.Companion.constant(EnumC0779dc.DP);

    /* renamed from: c, reason: collision with root package name */
    public static final TypeHelper f6146c = TypeHelper.Companion.from(AbstractC3219i.G(EnumC0779dc.values()), a.f6148i);

    /* renamed from: d, reason: collision with root package name */
    public static final ValueValidator f6147d = new ValueValidator() { // from class: O1.dg
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean b4;
            b4 = AbstractC0801eg.b(((Long) obj).longValue());
            return b4;
        }
    };

    /* renamed from: O1.eg$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6148i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0779dc);
        }
    }

    /* renamed from: O1.eg$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.eg$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6149a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6149a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0765cg.c deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper typeHelper = AbstractC0801eg.f6146c;
            Function1 function1 = EnumC0779dc.f6047e;
            Expression expression = AbstractC0801eg.f6145b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "unit", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0801eg.f6147d);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_TO_INT, VALUE_VALIDATOR)");
            return new C0765cg.c(expression, readExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0765cg.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "unit", value.f5978a, EnumC0779dc.f6046d);
            JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f5979b);
            return jSONObject;
        }
    }

    /* renamed from: O1.eg$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6150a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6150a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0872ig.c deserialize(ParsingContext context, C0872ig.c cVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "unit", AbstractC0801eg.f6146c, allowPropertyOverride, cVar != null ? cVar.f6521a : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, cVar != null ? cVar.f6522b : null, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0801eg.f6147d);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…_TO_INT, VALUE_VALIDATOR)");
            return new C0872ig.c(readOptionalFieldWithExpression, readFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0872ig.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "unit", value.f6521a, EnumC0779dc.f6046d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f6522b);
            return jSONObject;
        }
    }

    /* renamed from: O1.eg$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6151a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6151a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0765cg.c resolve(ParsingContext context, C0872ig.c template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f6521a;
            TypeHelper typeHelper = AbstractC0801eg.f6146c;
            Function1 function1 = EnumC0779dc.f6047e;
            Expression expression = AbstractC0801eg.f6145b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "unit", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6522b, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0801eg.f6147d);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_TO_INT, VALUE_VALIDATOR)");
            return new C0765cg.c(expression2, resolveExpression);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j4) {
        return j4 >= 0;
    }
}
