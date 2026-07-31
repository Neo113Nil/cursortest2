package O1;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
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

/* renamed from: O1.kb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0903kb {

    /* renamed from: a, reason: collision with root package name */
    private static final b f6839a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6840b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f6841c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f6842d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f6843e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f6844f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f6845g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f6846h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f6847i;

    /* renamed from: j, reason: collision with root package name */
    public static final ValueValidator f6848j;

    /* renamed from: k, reason: collision with root package name */
    public static final ValueValidator f6849k;

    /* renamed from: l, reason: collision with root package name */
    public static final ValueValidator f6850l;

    /* renamed from: m, reason: collision with root package name */
    public static final ValueValidator f6851m;

    /* renamed from: O1.kb$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6852i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1163z2);
        }
    }

    /* renamed from: O1.kb$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.kb$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6853a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6853a = component;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O1.C0796eb deserialize(com.yandex.div.serialization.ParsingContext r16, org.json.JSONObject r17) {
            /*
                r15 = this;
                java.lang.String r0 = "context"
                r1 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                java.lang.String r0 = "data"
                r2 = r17
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                O1.eb r0 = new O1.eb
                com.yandex.div.internal.parser.TypeHelper<java.lang.Long> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_INT
                kotlin.jvm.functions.Function1<java.lang.Number, java.lang.Long> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_INT
                com.yandex.div.internal.parser.ValueValidator r6 = O1.AbstractC0903kb.f6847i
                com.yandex.div.json.expressions.Expression r7 = O1.AbstractC0903kb.f6840b
                java.lang.String r3 = "duration"
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                r8 = r4
                r9 = r5
                if (r3 != 0) goto L24
                r10 = r7
                goto L25
            L24:
                r10 = r3
            L25:
                com.yandex.div.internal.parser.TypeHelper r4 = O1.AbstractC0903kb.f6846h
                kotlin.jvm.functions.Function1 r5 = O1.EnumC1163z2.f8690e
                com.yandex.div.json.expressions.Expression r6 = O1.AbstractC0903kb.f6841c
                java.lang.String r3 = "interpolator"
                r1 = r16
                r2 = r17
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6)
                if (r3 != 0) goto L39
                r11 = r6
                goto L3a
            L39:
                r11 = r3
            L3a:
                com.yandex.div.internal.parser.TypeHelper<java.lang.Double> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_DOUBLE
                kotlin.jvm.functions.Function1<java.lang.Number, java.lang.Double> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_DOUBLE
                com.yandex.div.internal.parser.ValueValidator r6 = O1.AbstractC0903kb.f6848j
                com.yandex.div.json.expressions.Expression r7 = O1.AbstractC0903kb.f6842d
                java.lang.String r3 = "pivot_x"
                r1 = r16
                r2 = r17
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L50
                r12 = r7
                goto L51
            L50:
                r12 = r3
            L51:
                com.yandex.div.internal.parser.ValueValidator r6 = O1.AbstractC0903kb.f6849k
                com.yandex.div.json.expressions.Expression r7 = O1.AbstractC0903kb.f6843e
                java.lang.String r3 = "pivot_y"
                r1 = r16
                r2 = r17
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L63
                r13 = r7
                goto L64
            L63:
                r13 = r3
            L64:
                com.yandex.div.internal.parser.ValueValidator r6 = O1.AbstractC0903kb.f6850l
                com.yandex.div.json.expressions.Expression r7 = O1.AbstractC0903kb.f6844f
                java.lang.String r3 = "scale"
                r1 = r16
                r2 = r17
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L76
                r14 = r7
                goto L77
            L76:
                r14 = r3
            L77:
                com.yandex.div.internal.parser.ValueValidator r6 = O1.AbstractC0903kb.f6851m
                com.yandex.div.json.expressions.Expression r7 = O1.AbstractC0903kb.f6845g
                java.lang.String r3 = "start_delay"
                r1 = r16
                r2 = r17
                r4 = r8
                r5 = r9
                com.yandex.div.json.expressions.Expression r1 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto L90
                r1 = r0
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                goto L97
            L90:
                r7 = r1
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                r1 = r0
            L97:
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.AbstractC0903kb.c.deserialize(com.yandex.div.serialization.ParsingContext, org.json.JSONObject):O1.eb");
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0796eb value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.b());
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.c(), EnumC1163z2.f8689d);
            JsonExpressionParser.writeExpression(context, jSONObject, "pivot_x", value.f6109c);
            JsonExpressionParser.writeExpression(context, jSONObject, "pivot_y", value.f6110d);
            JsonExpressionParser.writeExpression(context, jSONObject, "scale", value.f6111e);
            JsonExpressionParser.writeExpression(context, jSONObject, "start_delay", value.d());
            JsonPropertyParser.write(context, jSONObject, "type", "scale");
            return jSONObject;
        }
    }

    /* renamed from: O1.kb$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6854a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6854a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0921lb deserialize(ParsingContext context, C0921lb c0921lb, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c0921lb != null ? c0921lb.f6938a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, AbstractC0903kb.f6847i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_INT, DURATION_VALIDATOR)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", AbstractC0903kb.f6846h, allowPropertyOverride, c0921lb != null ? c0921lb.f6939b : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = c0921lb != null ? c0921lb.f6940c : null;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "pivot_x", typeHelper2, allowPropertyOverride, field2, function12, AbstractC0903kb.f6848j);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…OUBLE, PIVOT_X_VALIDATOR)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "pivot_y", typeHelper2, allowPropertyOverride, c0921lb != null ? c0921lb.f6941d : null, function12, AbstractC0903kb.f6849k);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…OUBLE, PIVOT_Y_VALIDATOR)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "scale", typeHelper2, allowPropertyOverride, c0921lb != null ? c0921lb.f6942e : null, function12, AbstractC0903kb.f6850l);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…_DOUBLE, SCALE_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_delay", typeHelper, allowPropertyOverride, c0921lb != null ? c0921lb.f6943f : null, function1, AbstractC0903kb.f6851m);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…T, START_DELAY_VALIDATOR)");
            return new C0921lb(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0921lb value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f6938a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f6939b, EnumC1163z2.f8689d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "pivot_x", value.f6940c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "pivot_y", value.f6941d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "scale", value.f6942e);
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_delay", value.f6943f);
            JsonPropertyParser.write(context, jSONObject, "type", "scale");
            return jSONObject;
        }
    }

    /* renamed from: O1.kb$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6855a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6855a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0796eb resolve(ParsingContext context, C0921lb template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f6938a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0903kb.f6847i;
            Expression expression = AbstractC0903kb.f6840b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f6939b;
            TypeHelper typeHelper2 = AbstractC0903kb.f6846h;
            Function1 function12 = EnumC1163z2.f8690e;
            Expression expression3 = AbstractC0903kb.f6841c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "interpolator", typeHelper2, function12, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Field field3 = template.f6940c;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator2 = AbstractC0903kb.f6848j;
            Expression expression5 = AbstractC0903kb.f6842d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "pivot_x", typeHelper3, function13, valueValidator2, expression5);
            Expression expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            Field field4 = template.f6941d;
            ValueValidator valueValidator3 = AbstractC0903kb.f6849k;
            Expression expression7 = AbstractC0903kb.f6843e;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "pivot_y", typeHelper3, function13, valueValidator3, expression7);
            Expression expression8 = resolveOptionalExpression4 == null ? expression7 : resolveOptionalExpression4;
            Field field5 = template.f6942e;
            ValueValidator valueValidator4 = AbstractC0903kb.f6850l;
            Expression expression9 = AbstractC0903kb.f6844f;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "scale", typeHelper3, function13, valueValidator4, expression9);
            Expression expression10 = resolveOptionalExpression5 == null ? expression9 : resolveOptionalExpression5;
            Field field6 = template.f6943f;
            ValueValidator valueValidator5 = AbstractC0903kb.f6851m;
            Expression expression11 = AbstractC0903kb.f6845g;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "start_delay", typeHelper, function1, valueValidator5, expression11);
            return new C0796eb(expression2, expression4, expression6, expression8, expression10, resolveOptionalExpression6 == null ? expression11 : resolveOptionalExpression6);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6840b = companion.constant(200L);
        f6841c = companion.constant(EnumC1163z2.EASE_IN_OUT);
        Double valueOf = Double.valueOf(0.5d);
        f6842d = companion.constant(valueOf);
        f6843e = companion.constant(valueOf);
        f6844f = companion.constant(Double.valueOf(0.0d));
        f6845g = companion.constant(0L);
        f6846h = TypeHelper.Companion.from(AbstractC3219i.G(EnumC1163z2.values()), a.f6852i);
        f6847i = new ValueValidator() { // from class: O1.fb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = AbstractC0903kb.f(((Long) obj).longValue());
                return f4;
            }
        };
        f6848j = new ValueValidator() { // from class: O1.gb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = AbstractC0903kb.g(((Double) obj).doubleValue());
                return g4;
            }
        };
        f6849k = new ValueValidator() { // from class: O1.hb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = AbstractC0903kb.h(((Double) obj).doubleValue());
                return h4;
            }
        };
        f6850l = new ValueValidator() { // from class: O1.ib
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean i4;
                i4 = AbstractC0903kb.i(((Double) obj).doubleValue());
                return i4;
            }
        };
        f6851m = new ValueValidator() { // from class: O1.jb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean j4;
                j4 = AbstractC0903kb.j(((Long) obj).longValue());
                return j4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(double d4) {
        return d4 >= 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(long j4) {
        return j4 >= 0;
    }
}
