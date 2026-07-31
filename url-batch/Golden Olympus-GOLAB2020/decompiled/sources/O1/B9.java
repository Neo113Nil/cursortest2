package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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

/* loaded from: classes2.dex */
public abstract class B9 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f1459a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f1460b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f1461c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f1462d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f1463e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f1464f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f1465g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f1466h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f1467i;

    /* renamed from: j, reason: collision with root package name */
    public static final ValueValidator f1468j;

    /* renamed from: k, reason: collision with root package name */
    public static final ValueValidator f1469k;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1470i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1163z2);
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
        private final Cg f1471a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1471a = component;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O1.C1116w9 deserialize(com.yandex.div.serialization.ParsingContext r13, org.json.JSONObject r14) {
            /*
                r12 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                O1.w9 r0 = new O1.w9
                com.yandex.div.internal.parser.TypeHelper r4 = O1.B9.f1465g
                kotlin.jvm.functions.Function1 r5 = O1.EnumC1163z2.f8690e
                com.yandex.div.json.expressions.Expression r6 = O1.B9.f1460b
                java.lang.String r3 = "interpolator"
                r1 = r13
                r2 = r14
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6)
                if (r3 != 0) goto L1e
                r8 = r6
                goto L1f
            L1e:
                r8 = r3
            L1f:
                com.yandex.div.internal.parser.TypeHelper<java.lang.Double> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_DOUBLE
                kotlin.jvm.functions.Function1<java.lang.Number, java.lang.Double> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_DOUBLE
                com.yandex.div.internal.parser.ValueValidator r6 = O1.B9.f1466h
                com.yandex.div.json.expressions.Expression r7 = O1.B9.f1461c
                java.lang.String r3 = "next_page_alpha"
                r1 = r13
                r2 = r14
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L33
                r9 = r7
                goto L34
            L33:
                r9 = r3
            L34:
                com.yandex.div.internal.parser.ValueValidator r6 = O1.B9.f1467i
                com.yandex.div.json.expressions.Expression r7 = O1.B9.f1462d
                java.lang.String r3 = "next_page_scale"
                r1 = r13
                r2 = r14
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L44
                r10 = r7
                goto L45
            L44:
                r10 = r3
            L45:
                com.yandex.div.internal.parser.ValueValidator r6 = O1.B9.f1468j
                com.yandex.div.json.expressions.Expression r7 = O1.B9.f1463e
                java.lang.String r3 = "previous_page_alpha"
                r1 = r13
                r2 = r14
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L55
                r11 = r7
                goto L56
            L55:
                r11 = r3
            L56:
                com.yandex.div.internal.parser.ValueValidator r6 = O1.B9.f1469k
                com.yandex.div.json.expressions.Expression r7 = O1.B9.f1464f
                java.lang.String r3 = "previous_page_scale"
                r1 = r13
                r2 = r14
                com.yandex.div.json.expressions.Expression r1 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto L6b
                r6 = r7
                r1 = r0
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                goto L71
            L6b:
                r6 = r1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r1 = r0
            L71:
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.B9.c.deserialize(com.yandex.div.serialization.ParsingContext, org.json.JSONObject):O1.w9");
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1116w9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.f8330a, EnumC1163z2.f8689d);
            JsonExpressionParser.writeExpression(context, jSONObject, "next_page_alpha", value.f8331b);
            JsonExpressionParser.writeExpression(context, jSONObject, "next_page_scale", value.f8332c);
            JsonExpressionParser.writeExpression(context, jSONObject, "previous_page_alpha", value.f8333d);
            JsonExpressionParser.writeExpression(context, jSONObject, "previous_page_scale", value.f8334e);
            JsonPropertyParser.write(context, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1472a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1472a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9 deserialize(ParsingContext context, C9 c9, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", B9.f1465g, allowPropertyOverride, c9 != null ? c9.f1593a : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = c9 != null ? c9.f1594b : null;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "next_page_alpha", typeHelper, allowPropertyOverride, field, function1, B9.f1466h);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…EXT_PAGE_ALPHA_VALIDATOR)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "next_page_scale", typeHelper, allowPropertyOverride, c9 != null ? c9.f1595c : null, function1, B9.f1467i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…EXT_PAGE_SCALE_VALIDATOR)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "previous_page_alpha", typeHelper, allowPropertyOverride, c9 != null ? c9.f1596d : null, function1, B9.f1468j);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…OUS_PAGE_ALPHA_VALIDATOR)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "previous_page_scale", typeHelper, allowPropertyOverride, c9 != null ? c9.f1597e : null, function1, B9.f1469k);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…OUS_PAGE_SCALE_VALIDATOR)");
            return new C9(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f1593a, EnumC1163z2.f8689d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "next_page_alpha", value.f1594b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "next_page_scale", value.f1595c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "previous_page_alpha", value.f1596d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "previous_page_scale", value.f1597e);
            JsonPropertyParser.write(context, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1473a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1473a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1116w9 resolve(ParsingContext context, C9 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f1593a;
            TypeHelper typeHelper = B9.f1465g;
            Function1 function1 = EnumC1163z2.f8690e;
            Expression expression = B9.f1460b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "interpolator", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f1594b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = B9.f1466h;
            Expression expression3 = B9.f1461c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "next_page_alpha", typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Field field3 = template.f1595c;
            ValueValidator valueValidator2 = B9.f1467i;
            Expression expression5 = B9.f1462d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "next_page_scale", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            Field field4 = template.f1596d;
            ValueValidator valueValidator3 = B9.f1468j;
            Expression expression7 = B9.f1463e;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression7);
            Expression expression8 = resolveOptionalExpression4 == null ? expression7 : resolveOptionalExpression4;
            Field field5 = template.f1597e;
            ValueValidator valueValidator4 = B9.f1469k;
            Expression expression9 = B9.f1464f;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "previous_page_scale", typeHelper2, function12, valueValidator4, expression9);
            return new C1116w9(expression2, expression4, expression6, expression8, resolveOptionalExpression5 == null ? expression9 : resolveOptionalExpression5);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f1460b = companion.constant(EnumC1163z2.EASE_IN_OUT);
        Double valueOf = Double.valueOf(1.0d);
        f1461c = companion.constant(valueOf);
        f1462d = companion.constant(valueOf);
        f1463e = companion.constant(valueOf);
        f1464f = companion.constant(valueOf);
        f1465g = TypeHelper.Companion.from(AbstractC3219i.G(EnumC1163z2.values()), a.f1470i);
        f1466h = new ValueValidator() { // from class: O1.x9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = B9.e(((Double) obj).doubleValue());
                return e4;
            }
        };
        f1467i = new ValueValidator() { // from class: O1.y9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = B9.f(((Double) obj).doubleValue());
                return f4;
            }
        };
        f1468j = new ValueValidator() { // from class: O1.z9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = B9.g(((Double) obj).doubleValue());
                return g4;
            }
        };
        f1469k = new ValueValidator() { // from class: O1.A9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = B9.h(((Double) obj).doubleValue());
                return h4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(double d4) {
        return d4 >= 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(double d4) {
        return d4 >= 0.0d;
    }
}
