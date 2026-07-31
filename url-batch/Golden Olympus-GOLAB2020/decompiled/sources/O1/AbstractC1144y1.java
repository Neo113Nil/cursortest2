package O1;

import O1.C1126x1;
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

/* renamed from: O1.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1144y1 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f8511a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f8512b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f8513c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f8514d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f8515e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeHelper f8516f;

    /* renamed from: O1.y1$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8517i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C1126x1.c);
        }
    }

    /* renamed from: O1.y1$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.y1$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8518a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8518a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1126x1 deserialize(ParsingContext context, JSONObject data) {
            Expression expression;
            Expression expression2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = AbstractC1144y1.f8512b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "animated", typeHelper, function1, expression3);
            Expression expression4 = readOptionalExpression == null ? expression3 : readOptionalExpression;
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …\"id\", TYPE_HELPER_STRING)");
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression5 = AbstractC1144y1.f8513c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "item_count", typeHelper2, function12, expression5);
            Expression expression6 = readOptionalExpression2 == null ? expression5 : readOptionalExpression2;
            Expression expression7 = AbstractC1144y1.f8514d;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "offset", typeHelper2, function12, expression7);
            Expression expression8 = readOptionalExpression3 == null ? expression7 : readOptionalExpression3;
            TypeHelper typeHelper3 = AbstractC1144y1.f8516f;
            Function1 function13 = C1126x1.c.f8389e;
            Expression expression9 = AbstractC1144y1.f8515e;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "overflow", typeHelper3, function13, expression9);
            if (readOptionalExpression4 == null) {
                expression2 = expression9;
                expression = readExpression;
            } else {
                expression = readExpression;
                expression2 = readOptionalExpression4;
            }
            return new C1126x1(expression4, expression, expression6, expression8, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1126x1 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "animated", value.f8380a);
            JsonExpressionParser.writeExpression(context, jSONObject, "id", value.f8381b);
            JsonExpressionParser.writeExpression(context, jSONObject, "item_count", value.f8382c);
            JsonExpressionParser.writeExpression(context, jSONObject, "offset", value.f8383d);
            JsonExpressionParser.writeExpression(context, jSONObject, "overflow", value.f8384e, C1126x1.c.f8388d);
            JsonPropertyParser.write(context, jSONObject, "type", "scroll_by");
            return jSONObject;
        }
    }

    /* renamed from: O1.y1$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8519a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8519a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1162z1 deserialize(ParsingContext context, C1162z1 c1162z1, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c1162z1 != null ? c1162z1.f8682a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…animated, ANY_TO_BOOLEAN)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c1162z1 != null ? c1162z1.f8683b : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…llowOverride, parent?.id)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c1162z1 != null ? c1162z1.f8684c : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "item_count", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…itemCount, NUMBER_TO_INT)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "offset", typeHelper, allowPropertyOverride, c1162z1 != null ? c1162z1.f8685d : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…t?.offset, NUMBER_TO_INT)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "overflow", AbstractC1144y1.f8516f, allowPropertyOverride, c1162z1 != null ? c1162z1.f8686e : null, C1126x1.c.f8389e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…lBy.Overflow.FROM_STRING)");
            return new C1162z1(readOptionalFieldWithExpression, readFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1162z1 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "animated", value.f8682a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "id", value.f8683b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "item_count", value.f8684c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "offset", value.f8685d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "overflow", value.f8686e, C1126x1.c.f8388d);
            JsonPropertyParser.write(context, jSONObject, "type", "scroll_by");
            return jSONObject;
        }
    }

    /* renamed from: O1.y1$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8520a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8520a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1126x1 resolve(ParsingContext context, C1162z1 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f8682a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC1144y1.f8512b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "animated", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f8683b, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…\"id\", TYPE_HELPER_STRING)");
            Field field2 = template.f8684c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression3 = AbstractC1144y1.f8513c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "item_count", typeHelper2, function12, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Field field3 = template.f8685d;
            Expression expression5 = AbstractC1144y1.f8514d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "offset", typeHelper2, function12, expression5);
            Expression expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            Field field4 = template.f8686e;
            TypeHelper typeHelper3 = AbstractC1144y1.f8516f;
            Function1 function13 = C1126x1.c.f8389e;
            Expression expression7 = AbstractC1144y1.f8515e;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "overflow", typeHelper3, function13, expression7);
            if (resolveOptionalExpression4 != null) {
                expression7 = resolveOptionalExpression4;
            }
            return new C1126x1(expression2, resolveExpression, expression4, expression6, expression7);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8512b = companion.constant(Boolean.TRUE);
        f8513c = companion.constant(0L);
        f8514d = companion.constant(0L);
        f8515e = companion.constant(C1126x1.c.CLAMP);
        f8516f = TypeHelper.Companion.from(AbstractC3219i.G(C1126x1.c.values()), a.f8517i);
    }
}
