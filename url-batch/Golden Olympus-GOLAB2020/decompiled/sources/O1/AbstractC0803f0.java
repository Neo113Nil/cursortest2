package O1;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0803f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f6159a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6160b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f6161c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f6162d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f6163e;

    /* renamed from: f, reason: collision with root package name */
    public static final ValueValidator f6164f;

    /* renamed from: g, reason: collision with root package name */
    public static final ValueValidator f6165g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f6166h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f6167i;

    /* renamed from: O1.f0$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.f0$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6168a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6168a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0713a0 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0803f0.f6164f;
            Expression expression = AbstractC0803f0.f6160b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "bottom", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            ValueValidator valueValidator2 = AbstractC0803f0.f6165g;
            Expression expression2 = AbstractC0803f0.f6161c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "left", typeHelper, function1, valueValidator2, expression2);
            if (readOptionalExpression2 == null) {
                readOptionalExpression2 = expression2;
            }
            ValueValidator valueValidator3 = AbstractC0803f0.f6166h;
            Expression expression3 = AbstractC0803f0.f6162d;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "right", typeHelper, function1, valueValidator3, expression3);
            Expression expression4 = readOptionalExpression3 == null ? expression3 : readOptionalExpression3;
            ValueValidator valueValidator4 = AbstractC0803f0.f6167i;
            Expression expression5 = AbstractC0803f0.f6163e;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "top", typeHelper, function1, valueValidator4, expression5);
            if (readOptionalExpression4 != null) {
                expression5 = readOptionalExpression4;
            }
            return new C0713a0(readOptionalExpression, readOptionalExpression2, expression4, expression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0713a0 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "bottom", value.f5580a);
            JsonExpressionParser.writeExpression(context, jSONObject, "left", value.f5581b);
            JsonExpressionParser.writeExpression(context, jSONObject, "right", value.f5582c);
            JsonExpressionParser.writeExpression(context, jSONObject, "top", value.f5583d);
            return jSONObject;
        }
    }

    /* renamed from: O1.f0$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6169a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6169a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0821g0 deserialize(ParsingContext context, C0821g0 c0821g0, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c0821g0 != null ? c0821g0.f6206a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "bottom", typeHelper, allowPropertyOverride, field, function1, AbstractC0803f0.f6164f);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…TO_INT, BOTTOM_VALIDATOR)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "left", typeHelper, allowPropertyOverride, c0821g0 != null ? c0821g0.f6207b : null, function1, AbstractC0803f0.f6165g);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…R_TO_INT, LEFT_VALIDATOR)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "right", typeHelper, allowPropertyOverride, c0821g0 != null ? c0821g0.f6208c : null, function1, AbstractC0803f0.f6166h);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_TO_INT, RIGHT_VALIDATOR)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "top", typeHelper, allowPropertyOverride, c0821g0 != null ? c0821g0.f6209d : null, function1, AbstractC0803f0.f6167i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…ER_TO_INT, TOP_VALIDATOR)");
            return new C0821g0(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0821g0 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "bottom", value.f6206a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "left", value.f6207b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "right", value.f6208c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "top", value.f6209d);
            return jSONObject;
        }
    }

    /* renamed from: O1.f0$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6170a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6170a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0713a0 resolve(ParsingContext context, C0821g0 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f6206a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0803f0.f6164f;
            Expression expression = AbstractC0803f0.f6160b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "bottom", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field field2 = template.f6207b;
            ValueValidator valueValidator2 = AbstractC0803f0.f6165g;
            Expression expression2 = AbstractC0803f0.f6161c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "left", typeHelper, function1, valueValidator2, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field field3 = template.f6208c;
            ValueValidator valueValidator3 = AbstractC0803f0.f6166h;
            Expression expression3 = AbstractC0803f0.f6162d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "right", typeHelper, function1, valueValidator3, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field field4 = template.f6209d;
            ValueValidator valueValidator4 = AbstractC0803f0.f6167i;
            Expression expression4 = AbstractC0803f0.f6163e;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "top", typeHelper, function1, valueValidator4, expression4);
            if (resolveOptionalExpression4 != null) {
                expression4 = resolveOptionalExpression4;
            }
            return new C0713a0(resolveOptionalExpression, resolveOptionalExpression2, resolveOptionalExpression3, expression4);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6160b = companion.constant(0L);
        f6161c = companion.constant(0L);
        f6162d = companion.constant(0L);
        f6163e = companion.constant(0L);
        f6164f = new ValueValidator() { // from class: O1.b0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = AbstractC0803f0.e(((Long) obj).longValue());
                return e4;
            }
        };
        f6165g = new ValueValidator() { // from class: O1.c0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = AbstractC0803f0.f(((Long) obj).longValue());
                return f4;
            }
        };
        f6166h = new ValueValidator() { // from class: O1.d0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = AbstractC0803f0.g(((Long) obj).longValue());
                return g4;
            }
        };
        f6167i = new ValueValidator() { // from class: O1.e0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = AbstractC0803f0.h(((Long) obj).longValue());
                return h4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j4) {
        return j4 >= 0;
    }
}
