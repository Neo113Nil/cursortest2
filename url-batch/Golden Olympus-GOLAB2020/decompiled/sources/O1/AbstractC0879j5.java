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
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0879j5 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f6570a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6571b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f6572c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f6573d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f6574e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f6575f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f6576g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f6577h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f6578i;

    /* renamed from: j, reason: collision with root package name */
    public static final ValueValidator f6579j;

    /* renamed from: k, reason: collision with root package name */
    public static final ValueValidator f6580k;

    /* renamed from: l, reason: collision with root package name */
    public static final ValueValidator f6581l;

    /* renamed from: m, reason: collision with root package name */
    public static final ValueValidator f6582m;

    /* renamed from: O1.j5$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6583i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0779dc);
        }
    }

    /* renamed from: O1.j5$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.j5$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6584a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6584a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0754c5 deserialize(ParsingContext context, JSONObject data) {
            Expression expression;
            Expression expression2;
            Expression expression3;
            Expression expression4;
            Expression expression5;
            Expression expression6;
            Expression expression7;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0879j5.f6577h;
            Expression expression8 = AbstractC0879j5.f6571b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "bottom", typeHelper, function1, valueValidator, expression8);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression8;
            }
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "end", typeHelper, function1, AbstractC0879j5.f6578i);
            ValueValidator valueValidator2 = AbstractC0879j5.f6579j;
            Expression expression9 = AbstractC0879j5.f6572c;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "left", typeHelper, function1, valueValidator2, expression9);
            if (readOptionalExpression3 == null) {
                readOptionalExpression3 = expression9;
            }
            ValueValidator valueValidator3 = AbstractC0879j5.f6580k;
            Expression expression10 = AbstractC0879j5.f6573d;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "right", typeHelper, function1, valueValidator3, expression10);
            Expression expression11 = readOptionalExpression4 == null ? expression10 : readOptionalExpression4;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "start", typeHelper, function1, AbstractC0879j5.f6581l);
            ValueValidator valueValidator4 = AbstractC0879j5.f6582m;
            Expression expression12 = AbstractC0879j5.f6574e;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "top", typeHelper, function1, valueValidator4, expression12);
            if (readOptionalExpression6 != null) {
                expression12 = readOptionalExpression6;
            }
            TypeHelper typeHelper2 = AbstractC0879j5.f6576g;
            Function1 function12 = EnumC0779dc.f6047e;
            Expression expression13 = AbstractC0879j5.f6575f;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "unit", typeHelper2, function12, expression13);
            if (readOptionalExpression7 == null) {
                Expression expression14 = expression12;
                expression2 = expression13;
                expression = expression14;
                expression7 = readOptionalExpression;
                expression3 = readOptionalExpression2;
                expression4 = readOptionalExpression3;
                expression5 = expression11;
                expression6 = readOptionalExpression5;
            } else {
                expression = expression12;
                expression2 = readOptionalExpression7;
                expression3 = readOptionalExpression2;
                expression4 = readOptionalExpression3;
                expression5 = expression11;
                expression6 = readOptionalExpression5;
                expression7 = readOptionalExpression;
            }
            return new C0754c5(expression7, expression3, expression4, expression5, expression6, expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0754c5 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "bottom", value.f5850a);
            JsonExpressionParser.writeExpression(context, jSONObject, "end", value.f5851b);
            JsonExpressionParser.writeExpression(context, jSONObject, "left", value.f5852c);
            JsonExpressionParser.writeExpression(context, jSONObject, "right", value.f5853d);
            JsonExpressionParser.writeExpression(context, jSONObject, "start", value.f5854e);
            JsonExpressionParser.writeExpression(context, jSONObject, "top", value.f5855f);
            JsonExpressionParser.writeExpression(context, jSONObject, "unit", value.f5856g, EnumC0779dc.f6046d);
            return jSONObject;
        }
    }

    /* renamed from: O1.j5$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6585a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6585a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0897k5 deserialize(ParsingContext context, C0897k5 c0897k5, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c0897k5 != null ? c0897k5.f6815a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "bottom", typeHelper, allowPropertyOverride, field, function1, AbstractC0879j5.f6577h);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…TO_INT, BOTTOM_VALIDATOR)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "end", typeHelper, allowPropertyOverride, c0897k5 != null ? c0897k5.f6816b : null, function1, AbstractC0879j5.f6578i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…ER_TO_INT, END_VALIDATOR)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "left", typeHelper, allowPropertyOverride, c0897k5 != null ? c0897k5.f6817c : null, function1, AbstractC0879j5.f6579j);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…R_TO_INT, LEFT_VALIDATOR)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "right", typeHelper, allowPropertyOverride, c0897k5 != null ? c0897k5.f6818d : null, function1, AbstractC0879j5.f6580k);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…_TO_INT, RIGHT_VALIDATOR)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start", typeHelper, allowPropertyOverride, c0897k5 != null ? c0897k5.f6819e : null, function1, AbstractC0879j5.f6581l);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…_TO_INT, START_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "top", typeHelper, allowPropertyOverride, c0897k5 != null ? c0897k5.f6820f : null, function1, AbstractC0879j5.f6582m);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…ER_TO_INT, TOP_VALIDATOR)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "unit", AbstractC0879j5.f6576g, allowPropertyOverride, c0897k5 != null ? c0897k5.f6821g : null, EnumC0779dc.f6047e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp… DivSizeUnit.FROM_STRING)");
            return new C0897k5(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0897k5 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "bottom", value.f6815a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "end", value.f6816b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "left", value.f6817c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "right", value.f6818d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "start", value.f6819e);
            JsonFieldParser.writeExpressionField(context, jSONObject, "top", value.f6820f);
            JsonFieldParser.writeExpressionField(context, jSONObject, "unit", value.f6821g, EnumC0779dc.f6046d);
            return jSONObject;
        }
    }

    /* renamed from: O1.j5$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6586a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6586a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0754c5 resolve(ParsingContext context, C0897k5 template, JSONObject data) {
            Expression expression;
            Expression expression2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f6815a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0879j5.f6577h;
            Expression expression3 = AbstractC0879j5.f6571b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "bottom", typeHelper, function1, valueValidator, expression3);
            Expression expression4 = resolveOptionalExpression == null ? expression3 : resolveOptionalExpression;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f6816b, data, "end", typeHelper, function1, AbstractC0879j5.f6578i);
            Field field2 = template.f6817c;
            ValueValidator valueValidator2 = AbstractC0879j5.f6579j;
            Expression expression5 = AbstractC0879j5.f6572c;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "left", typeHelper, function1, valueValidator2, expression5);
            Expression expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            Field field3 = template.f6818d;
            ValueValidator valueValidator3 = AbstractC0879j5.f6580k;
            Expression expression7 = AbstractC0879j5.f6573d;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "right", typeHelper, function1, valueValidator3, expression7);
            Expression expression8 = resolveOptionalExpression4 == null ? expression7 : resolveOptionalExpression4;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, template.f6819e, data, "start", typeHelper, function1, AbstractC0879j5.f6581l);
            Field field4 = template.f6820f;
            ValueValidator valueValidator4 = AbstractC0879j5.f6582m;
            Expression expression9 = AbstractC0879j5.f6574e;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "top", typeHelper, function1, valueValidator4, expression9);
            if (resolveOptionalExpression6 != null) {
                expression9 = resolveOptionalExpression6;
            }
            Field field5 = template.f6821g;
            TypeHelper typeHelper2 = AbstractC0879j5.f6576g;
            Function1 function12 = EnumC0779dc.f6047e;
            Expression expression10 = AbstractC0879j5.f6575f;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "unit", typeHelper2, function12, expression10);
            if (resolveOptionalExpression7 == null) {
                Expression expression11 = expression9;
                expression2 = expression10;
                expression = expression11;
            } else {
                expression = expression9;
                expression2 = resolveOptionalExpression7;
            }
            return new C0754c5(expression4, resolveOptionalExpression2, expression6, expression8, resolveOptionalExpression5, expression, expression2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6571b = companion.constant(0L);
        f6572c = companion.constant(0L);
        f6573d = companion.constant(0L);
        f6574e = companion.constant(0L);
        f6575f = companion.constant(EnumC0779dc.DP);
        f6576g = TypeHelper.Companion.from(AbstractC3219i.G(EnumC0779dc.values()), a.f6583i);
        f6577h = new ValueValidator() { // from class: O1.d5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = AbstractC0879j5.g(((Long) obj).longValue());
                return g4;
            }
        };
        f6578i = new ValueValidator() { // from class: O1.e5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = AbstractC0879j5.h(((Long) obj).longValue());
                return h4;
            }
        };
        f6579j = new ValueValidator() { // from class: O1.f5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean i4;
                i4 = AbstractC0879j5.i(((Long) obj).longValue());
                return i4;
            }
        };
        f6580k = new ValueValidator() { // from class: O1.g5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean j4;
                j4 = AbstractC0879j5.j(((Long) obj).longValue());
                return j4;
            }
        };
        f6581l = new ValueValidator() { // from class: O1.h5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean k4;
                k4 = AbstractC0879j5.k(((Long) obj).longValue());
                return k4;
            }
        };
        f6582m = new ValueValidator() { // from class: O1.i5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean l4;
                l4 = AbstractC0879j5.l(((Long) obj).longValue());
                return l4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(long j4) {
        return j4 >= 0;
    }
}
