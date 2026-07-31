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

/* renamed from: O1.u9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1080u9 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f8149a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f8150b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f8151c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f8152d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f8153e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f8154f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f8155g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f8156h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f8157i;

    /* renamed from: j, reason: collision with root package name */
    public static final ValueValidator f8158j;

    /* renamed from: k, reason: collision with root package name */
    public static final ValueValidator f8159k;

    /* renamed from: l, reason: collision with root package name */
    public static final ValueValidator f8160l;

    /* renamed from: O1.u9$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8161i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1163z2);
        }
    }

    /* renamed from: O1.u9$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.u9$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8162a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8162a = component;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O1.C0991p9 deserialize(com.yandex.div.serialization.ParsingContext r13, org.json.JSONObject r14) {
            /*
                r12 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                O1.p9 r0 = new O1.p9
                com.yandex.div.internal.parser.TypeHelper r4 = O1.AbstractC1080u9.f8156h
                kotlin.jvm.functions.Function1 r5 = O1.EnumC1163z2.f8690e
                com.yandex.div.json.expressions.Expression r6 = O1.AbstractC1080u9.f8150b
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
                com.yandex.div.internal.parser.ValueValidator r6 = O1.AbstractC1080u9.f8157i
                com.yandex.div.json.expressions.Expression r7 = O1.AbstractC1080u9.f8151c
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
                com.yandex.div.internal.parser.ValueValidator r6 = O1.AbstractC1080u9.f8158j
                com.yandex.div.json.expressions.Expression r7 = O1.AbstractC1080u9.f8152d
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
                com.yandex.div.internal.parser.ValueValidator r6 = O1.AbstractC1080u9.f8159k
                com.yandex.div.json.expressions.Expression r7 = O1.AbstractC1080u9.f8153e
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
                com.yandex.div.internal.parser.ValueValidator r6 = O1.AbstractC1080u9.f8160l
                com.yandex.div.json.expressions.Expression r7 = O1.AbstractC1080u9.f8154f
                java.lang.String r3 = "previous_page_scale"
                r1 = r13
                r2 = r14
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L65
                goto L66
            L65:
                r7 = r3
            L66:
                com.yandex.div.internal.parser.TypeHelper<java.lang.Boolean> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_BOOLEAN
                kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_BOOLEAN
                com.yandex.div.json.expressions.Expression r6 = O1.AbstractC1080u9.f8155g
                java.lang.String r3 = "reversed_stacking_order"
                r1 = r13
                r2 = r14
                com.yandex.div.json.expressions.Expression r1 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6)
                if (r1 != 0) goto L7f
                r1 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                goto L86
            L7f:
                r6 = r7
                r7 = r1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r1 = r0
            L86:
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.AbstractC1080u9.c.deserialize(com.yandex.div.serialization.ParsingContext, org.json.JSONObject):O1.p9");
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0991p9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.f7481a, EnumC1163z2.f8689d);
            JsonExpressionParser.writeExpression(context, jSONObject, "next_page_alpha", value.f7482b);
            JsonExpressionParser.writeExpression(context, jSONObject, "next_page_scale", value.f7483c);
            JsonExpressionParser.writeExpression(context, jSONObject, "previous_page_alpha", value.f7484d);
            JsonExpressionParser.writeExpression(context, jSONObject, "previous_page_scale", value.f7485e);
            JsonExpressionParser.writeExpression(context, jSONObject, "reversed_stacking_order", value.f7486f);
            JsonPropertyParser.write(context, jSONObject, "type", "overlap");
            return jSONObject;
        }
    }

    /* renamed from: O1.u9$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8163a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8163a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1098v9 deserialize(ParsingContext context, C1098v9 c1098v9, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", AbstractC1080u9.f8156h, allowPropertyOverride, c1098v9 != null ? c1098v9.f8238a : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = c1098v9 != null ? c1098v9.f8239b : null;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "next_page_alpha", typeHelper, allowPropertyOverride, field, function1, AbstractC1080u9.f8157i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…EXT_PAGE_ALPHA_VALIDATOR)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "next_page_scale", typeHelper, allowPropertyOverride, c1098v9 != null ? c1098v9.f8240c : null, function1, AbstractC1080u9.f8158j);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…EXT_PAGE_SCALE_VALIDATOR)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "previous_page_alpha", typeHelper, allowPropertyOverride, c1098v9 != null ? c1098v9.f8241d : null, function1, AbstractC1080u9.f8159k);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…OUS_PAGE_ALPHA_VALIDATOR)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "previous_page_scale", typeHelper, allowPropertyOverride, c1098v9 != null ? c1098v9.f8242e : null, function1, AbstractC1080u9.f8160l);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…OUS_PAGE_SCALE_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reversed_stacking_order", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c1098v9 != null ? c1098v9.f8243f : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…ingOrder, ANY_TO_BOOLEAN)");
            return new C1098v9(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1098v9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f8238a, EnumC1163z2.f8689d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "next_page_alpha", value.f8239b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "next_page_scale", value.f8240c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "previous_page_alpha", value.f8241d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "previous_page_scale", value.f8242e);
            JsonFieldParser.writeExpressionField(context, jSONObject, "reversed_stacking_order", value.f8243f);
            JsonPropertyParser.write(context, jSONObject, "type", "overlap");
            return jSONObject;
        }
    }

    /* renamed from: O1.u9$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8164a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8164a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0991p9 resolve(ParsingContext context, C1098v9 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f8238a;
            TypeHelper typeHelper = AbstractC1080u9.f8156h;
            Function1 function1 = EnumC1163z2.f8690e;
            Expression expression = AbstractC1080u9.f8150b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "interpolator", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f8239b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC1080u9.f8157i;
            Expression expression3 = AbstractC1080u9.f8151c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "next_page_alpha", typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Field field3 = template.f8240c;
            ValueValidator valueValidator2 = AbstractC1080u9.f8158j;
            Expression expression5 = AbstractC1080u9.f8152d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "next_page_scale", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            Field field4 = template.f8241d;
            ValueValidator valueValidator3 = AbstractC1080u9.f8159k;
            Expression expression7 = AbstractC1080u9.f8153e;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression7);
            Expression expression8 = resolveOptionalExpression4 == null ? expression7 : resolveOptionalExpression4;
            Field field5 = template.f8242e;
            ValueValidator valueValidator4 = AbstractC1080u9.f8160l;
            Expression expression9 = AbstractC1080u9.f8154f;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "previous_page_scale", typeHelper2, function12, valueValidator4, expression9);
            if (resolveOptionalExpression5 != null) {
                expression9 = resolveOptionalExpression5;
            }
            Field field6 = template.f8243f;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression10 = AbstractC1080u9.f8155g;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "reversed_stacking_order", typeHelper3, function13, expression10);
            if (resolveOptionalExpression6 != null) {
                expression10 = resolveOptionalExpression6;
            }
            return new C0991p9(expression2, expression4, expression6, expression8, expression9, expression10);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8150b = companion.constant(EnumC1163z2.EASE_IN_OUT);
        Double valueOf = Double.valueOf(1.0d);
        f8151c = companion.constant(valueOf);
        f8152d = companion.constant(valueOf);
        f8153e = companion.constant(valueOf);
        f8154f = companion.constant(valueOf);
        f8155g = companion.constant(Boolean.FALSE);
        f8156h = TypeHelper.Companion.from(AbstractC3219i.G(EnumC1163z2.values()), a.f8161i);
        f8157i = new ValueValidator() { // from class: O1.q9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = AbstractC1080u9.e(((Double) obj).doubleValue());
                return e4;
            }
        };
        f8158j = new ValueValidator() { // from class: O1.r9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = AbstractC1080u9.f(((Double) obj).doubleValue());
                return f4;
            }
        };
        f8159k = new ValueValidator() { // from class: O1.s9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = AbstractC1080u9.g(((Double) obj).doubleValue());
                return g4;
            }
        };
        f8160l = new ValueValidator() { // from class: O1.t9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = AbstractC1080u9.h(((Double) obj).doubleValue());
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
