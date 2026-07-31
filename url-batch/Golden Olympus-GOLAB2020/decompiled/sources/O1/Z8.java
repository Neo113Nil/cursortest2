package O1;

import O1.AbstractC0861i4;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
public abstract class Z8 {

    /* renamed from: a, reason: collision with root package name */
    private static final c f5544a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f5545b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f5546c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0861i4.c f5547d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f5548e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeHelper f5549f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f5550g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f5551h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f5552i;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5553i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1145y2);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5554i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1163z2);
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
        private final Cg f5555a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5555a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public W8 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "cancel_actions", this.f5555a.u0());
            TypeHelper typeHelper = Z8.f5549f;
            Function1 function1 = EnumC1145y2.f8523e;
            Expression expression = Z8.f5545b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(context, data, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, Z8.f5551h);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_INT, DURATION_VALIDATOR)");
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, "end_actions", this.f5555a.u0());
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "end_value", typeHelper3, function13);
            Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …DOUBLE, NUMBER_TO_DOUBLE)");
            Object read = JsonPropertyParser.read(context, data, "id");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"id\")");
            String str = (String) read;
            TypeHelper typeHelper4 = Z8.f5550g;
            Function1 function14 = EnumC1163z2.f8690e;
            Expression expression3 = Z8.f5546c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "interpolator", typeHelper4, function14, expression3);
            Expression expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            AbstractC0861i4 abstractC0861i4 = (AbstractC0861i4) JsonPropertyParser.readOptional(context, data, "repeat_count", this.f5555a.s2());
            if (abstractC0861i4 == null) {
                abstractC0861i4 = Z8.f5547d;
            }
            Intrinsics.checkNotNullExpressionValue(abstractC0861i4, "JsonPropertyParser.readO…EPEAT_COUNT_DEFAULT_VALUE");
            ValueValidator valueValidator = Z8.f5552i;
            Expression expression5 = Z8.f5548e;
            AbstractC0861i4 abstractC0861i42 = abstractC0861i4;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "start_delay", typeHelper2, function12, valueValidator, expression5);
            if (readOptionalExpression3 != null) {
                expression5 = readOptionalExpression3;
            }
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "start_value", typeHelper3, function13);
            Object read2 = JsonPropertyParser.read(context, data, "variable_name");
            Intrinsics.checkNotNullExpressionValue(read2, "read(context, data, \"variable_name\")");
            return new W8(readOptionalList, expression2, readExpression, readOptionalList2, readExpression2, str, expression4, abstractC0861i42, expression5, readOptionalExpression4, (String) read2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, W8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, "cancel_actions", value.e(), this.f5555a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, value.c(), EnumC1145y2.f8522d);
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.getDuration());
            JsonPropertyParser.writeList(context, jSONObject, "end_actions", value.a(), this.f5555a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "end_value", value.f5126e);
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.d(), EnumC1163z2.f8689d);
            JsonPropertyParser.write(context, jSONObject, "repeat_count", value.b(), this.f5555a.s2());
            JsonExpressionParser.writeExpression(context, jSONObject, "start_delay", value.f());
            JsonExpressionParser.writeExpression(context, jSONObject, "start_value", value.f5131j);
            JsonPropertyParser.write(context, jSONObject, "type", "number_animator");
            JsonPropertyParser.write(context, jSONObject, "variable_name", value.h());
            return jSONObject;
        }
    }

    public static final class e implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5556a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5556a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0722a9 deserialize(ParsingContext context, C0722a9 c0722a9, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "cancel_actions", allowPropertyOverride, c0722a9 != null ? c0722a9.f5716a : null, this.f5556a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, Z8.f5549f, allowPropertyOverride, c0722a9 != null ? c0722a9.f5717b : null, EnumC1145y2.f8523e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ionDirection.FROM_STRING)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c0722a9 != null ? c0722a9.f5718c : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, Z8.f5551h);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…_INT, DURATION_VALIDATOR)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "end_actions", allowPropertyOverride, c0722a9 != null ? c0722a9.f5719d : null, this.f5556a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…ActionJsonTemplateParser)");
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = c0722a9 != null ? c0722a9.f5720e : null;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "end_value", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…dValue, NUMBER_TO_DOUBLE)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "id", allowPropertyOverride, c0722a9 != null ? c0722a9.f5721f : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…llowOverride, parent?.id)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", Z8.f5550g, allowPropertyOverride, c0722a9 != null ? c0722a9.f5722g : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "repeat_count", allowPropertyOverride, c0722a9 != null ? c0722a9.f5723h : null, this.f5556a.t2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…vCountJsonTemplateParser)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_delay", typeHelper, allowPropertyOverride, c0722a9 != null ? c0722a9.f5724i : null, function1, Z8.f5552i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…T, START_DELAY_VALIDATOR)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_value", typeHelper2, allowPropertyOverride, c0722a9 != null ? c0722a9.f5725j : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…tValue, NUMBER_TO_DOUBLE)");
            Field readField2 = JsonFieldParser.readField(restrictPropertyOverride, data, "variable_name", allowPropertyOverride, c0722a9 != null ? c0722a9.f5726k : null);
            Intrinsics.checkNotNullExpressionValue(readField2, "readField(context, data,…de, parent?.variableName)");
            return new C0722a9(readOptionalListField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalListField2, readFieldWithExpression2, readField, readOptionalFieldWithExpression2, readOptionalField, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readField2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0722a9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, "cancel_actions", value.f5716a, this.f5556a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, value.f5717b, EnumC1145y2.f8522d);
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f5718c);
            JsonFieldParser.writeListField(context, jSONObject, "end_actions", value.f5719d, this.f5556a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "end_value", value.f5720e);
            JsonFieldParser.writeField(context, jSONObject, "id", value.f5721f);
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f5722g, EnumC1163z2.f8689d);
            JsonFieldParser.writeField(context, jSONObject, "repeat_count", value.f5723h, this.f5556a.t2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_delay", value.f5724i);
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_value", value.f5725j);
            JsonPropertyParser.write(context, jSONObject, "type", "number_animator");
            JsonFieldParser.writeField(context, jSONObject, "variable_name", value.f5726k);
            return jSONObject;
        }
    }

    public static final class f implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5557a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5557a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public W8 resolve(ParsingContext context, C0722a9 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f5716a, data, "cancel_actions", this.f5557a.w0(), this.f5557a.u0());
            Field field = template.f5717b;
            TypeHelper typeHelper = Z8.f5549f;
            Function1 function1 = EnumC1145y2.f8523e;
            Expression expression = Z8.f5545b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f5718c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, field2, data, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, Z8.f5551h);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_INT, DURATION_VALIDATOR)");
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f5719d, data, "end_actions", this.f5557a.w0(), this.f5557a.u0());
            Field field3 = template.f5720e;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, field3, data, "end_value", typeHelper3, function13);
            Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…DOUBLE, NUMBER_TO_DOUBLE)");
            Object resolve = JsonFieldResolver.resolve(context, template.f5721f, data, "id");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.id, data, \"id\")");
            String str = (String) resolve;
            Field field4 = template.f5722g;
            TypeHelper typeHelper4 = Z8.f5550g;
            Function1 function14 = EnumC1163z2.f8690e;
            Expression expression3 = Z8.f5546c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "interpolator", typeHelper4, function14, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            AbstractC0861i4 abstractC0861i4 = (AbstractC0861i4) JsonFieldResolver.resolveOptional(context, template.f5723h, data, "repeat_count", this.f5557a.u2(), this.f5557a.s2());
            if (abstractC0861i4 == null) {
                abstractC0861i4 = Z8.f5547d;
            }
            AbstractC0861i4 abstractC0861i42 = abstractC0861i4;
            Intrinsics.checkNotNullExpressionValue(abstractC0861i42, "JsonFieldResolver.resolv…EPEAT_COUNT_DEFAULT_VALUE");
            Field field5 = template.f5724i;
            ValueValidator valueValidator = Z8.f5552i;
            Expression expression5 = Z8.f5548e;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "start_delay", typeHelper2, function12, valueValidator, expression5);
            if (resolveOptionalExpression3 != null) {
                expression5 = resolveOptionalExpression3;
            }
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, template.f5725j, data, "start_value", typeHelper3, function13);
            Object resolve2 = JsonFieldResolver.resolve(context, template.f5726k, data, "variable_name");
            Intrinsics.checkNotNullExpressionValue(resolve2, "resolve(context, templat…e, data, \"variable_name\")");
            return new W8(resolveOptionalList, expression2, resolveExpression, resolveOptionalList2, resolveExpression2, str, expression4, abstractC0861i42, expression5, resolveOptionalExpression4, (String) resolve2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f5545b = companion.constant(EnumC1145y2.NORMAL);
        f5546c = companion.constant(EnumC1163z2.LINEAR);
        f5547d = new AbstractC0861i4.c(new H5(companion.constant(1L)));
        f5548e = companion.constant(0L);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f5549f = companion2.from(AbstractC3219i.G(EnumC1145y2.values()), a.f5553i);
        f5550g = companion2.from(AbstractC3219i.G(EnumC1163z2.values()), b.f5554i);
        f5551h = new ValueValidator() { // from class: O1.X8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean c4;
                c4 = Z8.c(((Long) obj).longValue());
                return c4;
            }
        };
        f5552i = new ValueValidator() { // from class: O1.Y8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = Z8.d(((Long) obj).longValue());
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
