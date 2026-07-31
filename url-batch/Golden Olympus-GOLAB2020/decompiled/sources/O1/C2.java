package O1;

import O1.AbstractC0861i4;
import O1.C1127x2;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import java.util.List;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class C2 {

    /* renamed from: a, reason: collision with root package name */
    private static final c f1557a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f1558b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f1559c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0861i4.d f1560d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f1561e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeHelper f1562f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f1563g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f1564h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f1565i;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1566i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1163z2);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f1567i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C1127x2.c);
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1568a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1568a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1127x2 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = C2.f1564h;
            Expression expression = C2.f1558b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "end_value", typeHelper2, function12);
            TypeHelper typeHelper3 = C2.f1562f;
            Function1 function13 = EnumC1163z2.f8690e;
            Expression expression3 = C2.f1559c;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "interpolator", typeHelper3, function13, expression3);
            Expression expression4 = readOptionalExpression3 == null ? expression3 : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, FirebaseAnalytics.Param.ITEMS, this.f1568a.n1());
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "name", C2.f1563g, C1127x2.c.f8415e);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …imation.Name.FROM_STRING)");
            AbstractC0861i4 abstractC0861i4 = (AbstractC0861i4) JsonPropertyParser.readOptional(context, data, "repeat", this.f1568a.s2());
            if (abstractC0861i4 == null) {
                abstractC0861i4 = C2.f1560d;
            }
            Intrinsics.checkNotNullExpressionValue(abstractC0861i4, "JsonPropertyParser.readO…) ?: REPEAT_DEFAULT_VALUE");
            ValueValidator valueValidator2 = C2.f1565i;
            Expression expression5 = C2.f1561e;
            AbstractC0861i4 abstractC0861i42 = abstractC0861i4;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "start_delay", typeHelper, function1, valueValidator2, expression5);
            if (readOptionalExpression4 != null) {
                expression5 = readOptionalExpression4;
            }
            return new C1127x2(expression2, readOptionalExpression2, expression4, readOptionalList, readExpression, abstractC0861i42, expression5, JsonExpressionParser.readOptionalExpression(context, data, "start_value", typeHelper2, function12));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1127x2 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f8402a);
            JsonExpressionParser.writeExpression(context, jSONObject, "end_value", value.f8403b);
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.f8404c, EnumC1163z2.f8689d);
            JsonPropertyParser.writeList(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f8405d, this.f1568a.n1());
            JsonExpressionParser.writeExpression(context, jSONObject, "name", value.f8406e, C1127x2.c.f8414d);
            JsonPropertyParser.write(context, jSONObject, "repeat", value.f8407f, this.f1568a.s2());
            JsonExpressionParser.writeExpression(context, jSONObject, "start_delay", value.f8408g);
            JsonExpressionParser.writeExpression(context, jSONObject, "start_value", value.f8409h);
            return jSONObject;
        }
    }

    public static final class e implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1569a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1569a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public D2 deserialize(ParsingContext context, D2 d22, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = d22 != null ? d22.f2440a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, C2.f1564h);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_INT, DURATION_VALIDATOR)");
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = d22 != null ? d22.f2441b : null;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "end_value", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…dValue, NUMBER_TO_DOUBLE)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", C2.f1562f, allowPropertyOverride, d22 != null ? d22.f2442c : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, d22 != null ? d22.f2443d : null, this.f1569a.o1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…mationJsonTemplateParser)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "name", C2.f1563g, allowPropertyOverride, d22 != null ? d22.f2444e : null, C1127x2.c.f8415e);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…imation.Name.FROM_STRING)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "repeat", allowPropertyOverride, d22 != null ? d22.f2445f : null, this.f1569a.t2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…vCountJsonTemplateParser)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_delay", typeHelper, allowPropertyOverride, d22 != null ? d22.f2446g : null, function1, C2.f1565i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, START_DELAY_VALIDATOR)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_value", typeHelper2, allowPropertyOverride, d22 != null ? d22.f2447h : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…tValue, NUMBER_TO_DOUBLE)");
            return new D2(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readFieldWithExpression, readOptionalField, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, D2 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f2440a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "end_value", value.f2441b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f2442c, EnumC1163z2.f8689d);
            JsonFieldParser.writeListField(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f2443d, this.f1569a.o1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "name", value.f2444e, C1127x2.c.f8414d);
            JsonFieldParser.writeField(context, jSONObject, "repeat", value.f2445f, this.f1569a.t2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_delay", value.f2446g);
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_value", value.f2447h);
            return jSONObject;
        }
    }

    public static final class f implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1570a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1570a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1127x2 resolve(ParsingContext context, D2 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f2440a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = C2.f1564h;
            Expression expression = C2.f1558b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f2441b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "end_value", typeHelper2, function12);
            Field field3 = template.f2442c;
            TypeHelper typeHelper3 = C2.f1562f;
            Function1 function13 = EnumC1163z2.f8690e;
            Expression expression3 = C2.f1559c;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "interpolator", typeHelper3, function13, expression3);
            Expression expression4 = resolveOptionalExpression3 == null ? expression3 : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f2443d, data, FirebaseAnalytics.Param.ITEMS, this.f1570a.p1(), this.f1570a.n1());
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f2444e, data, "name", C2.f1563g, C1127x2.c.f8415e);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…imation.Name.FROM_STRING)");
            AbstractC0861i4 abstractC0861i4 = (AbstractC0861i4) JsonFieldResolver.resolveOptional(context, template.f2445f, data, "repeat", this.f1570a.u2(), this.f1570a.s2());
            if (abstractC0861i4 == null) {
                abstractC0861i4 = C2.f1560d;
            }
            AbstractC0861i4 abstractC0861i42 = abstractC0861i4;
            Intrinsics.checkNotNullExpressionValue(abstractC0861i42, "JsonFieldResolver.resolv…) ?: REPEAT_DEFAULT_VALUE");
            Field field4 = template.f2446g;
            ValueValidator valueValidator2 = C2.f1565i;
            Expression expression5 = C2.f1561e;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "start_delay", typeHelper, function1, valueValidator2, expression5);
            if (resolveOptionalExpression4 != null) {
                expression5 = resolveOptionalExpression4;
            }
            return new C1127x2(expression2, resolveOptionalExpression2, expression4, resolveOptionalList, resolveExpression, abstractC0861i42, expression5, JsonFieldResolver.resolveOptionalExpression(context, template.f2447h, data, "start_value", typeHelper2, function12));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f1558b = companion.constant(300L);
        f1559c = companion.constant(EnumC1163z2.SPRING);
        f1560d = new AbstractC0861i4.d(new C0971o7());
        f1561e = companion.constant(0L);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f1562f = companion2.from(AbstractC3219i.G(EnumC1163z2.values()), a.f1566i);
        f1563g = companion2.from(AbstractC3219i.G(C1127x2.c.values()), b.f1567i);
        f1564h = new ValueValidator() { // from class: O1.A2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean c4;
                c4 = C2.c(((Long) obj).longValue());
                return c4;
            }
        };
        f1565i = new ValueValidator() { // from class: O1.B2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = C2.d(((Long) obj).longValue());
                return d4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j4) {
        return j4 >= 0;
    }
}
