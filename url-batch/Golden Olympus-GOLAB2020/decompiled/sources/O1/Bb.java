package O1;

import O1.Ab;
import O1.Hb;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* loaded from: classes2.dex */
public abstract class Bb {

    /* renamed from: a, reason: collision with root package name */
    private static final b f1475a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f1476b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f1477c;

    /* renamed from: d, reason: collision with root package name */
    public static final TypeHelper f1478d;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1479i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Ab.c.EnumC0024c);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1480a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1480a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ab.c deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = Bb.f1476b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, b9.h.f15459S, typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper typeHelper2 = Bb.f1478d;
            Function1 function12 = Ab.c.EnumC0024c.f1392e;
            Expression expression2 = Bb.f1477c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, b9.h.f15492n, typeHelper2, function12, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            return new Ab.c(expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Ab.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15459S, value.f1386a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15492n, value.f1387b, Ab.c.EnumC0024c.f1391d);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1481a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1481a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Hb.c deserialize(ParsingContext context, Hb.c cVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, cVar != null ? cVar.f3049a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.h.f15492n, Bb.f1478d, allowPropertyOverride, cVar != null ? cVar.f3050b : null, Ab.c.EnumC0024c.f1392e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp….Orientation.FROM_STRING)");
            return new Hb.c(readOptionalFieldWithExpression, readOptionalFieldWithExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Hb.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15459S, value.f3049a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15492n, value.f3050b, Ab.c.EnumC0024c.f1391d);
            return jSONObject;
        }
    }

    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1482a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1482a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ab.c resolve(ParsingContext context, Hb.c template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f3049a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = Bb.f1476b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, b9.h.f15459S, typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f3050b;
            TypeHelper typeHelper2 = Bb.f1478d;
            Function1 function12 = Ab.c.EnumC0024c.f1392e;
            Expression expression3 = Bb.f1477c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, b9.h.f15492n, typeHelper2, function12, expression3);
            if (resolveOptionalExpression2 != null) {
                expression3 = resolveOptionalExpression2;
            }
            return new Ab.c(expression2, expression3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f1476b = companion.constant(335544320);
        f1477c = companion.constant(Ab.c.EnumC0024c.HORIZONTAL);
        f1478d = TypeHelper.Companion.from(AbstractC3219i.G(Ab.c.EnumC0024c.values()), a.f1479i);
    }
}
