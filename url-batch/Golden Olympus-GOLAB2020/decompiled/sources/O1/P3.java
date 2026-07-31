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
public abstract class P3 {

    /* renamed from: a, reason: collision with root package name */
    private static final c f4300a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f4301b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f4302c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0861i4.c f4303d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f4304e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeHelper f4305f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f4306g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f4307h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f4308i;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4309i = new a();

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
        public static final b f4310i = new b();

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
        private final Cg f4311a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4311a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public M3 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "cancel_actions", this.f4311a.u0());
            TypeHelper typeHelper = P3.f4305f;
            Function1 function1 = EnumC1145y2.f8523e;
            Expression expression = P3.f4301b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(context, data, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, P3.f4307h);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_INT, DURATION_VALIDATOR)");
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, "end_actions", this.f4311a.u0());
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "end_value", typeHelper3, function13);
            Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …LOR, STRING_TO_COLOR_INT)");
            Object read = JsonPropertyParser.read(context, data, "id");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"id\")");
            String str = (String) read;
            TypeHelper typeHelper4 = P3.f4306g;
            Function1 function14 = EnumC1163z2.f8690e;
            Expression expression3 = P3.f4302c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "interpolator", typeHelper4, function14, expression3);
            Expression expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            AbstractC0861i4 abstractC0861i4 = (AbstractC0861i4) JsonPropertyParser.readOptional(context, data, "repeat_count", this.f4311a.s2());
            if (abstractC0861i4 == null) {
                abstractC0861i4 = P3.f4303d;
            }
            Intrinsics.checkNotNullExpressionValue(abstractC0861i4, "JsonPropertyParser.readO…EPEAT_COUNT_DEFAULT_VALUE");
            ValueValidator valueValidator = P3.f4308i;
            Expression expression5 = P3.f4304e;
            AbstractC0861i4 abstractC0861i42 = abstractC0861i4;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "start_delay", typeHelper2, function12, valueValidator, expression5);
            if (readOptionalExpression3 != null) {
                expression5 = readOptionalExpression3;
            }
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "start_value", typeHelper3, function13);
            Object read2 = JsonPropertyParser.read(context, data, "variable_name");
            Intrinsics.checkNotNullExpressionValue(read2, "read(context, data, \"variable_name\")");
            return new M3(readOptionalList, expression2, readExpression, readOptionalList2, readExpression2, str, expression4, abstractC0861i42, expression5, readOptionalExpression4, (String) read2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, M3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, "cancel_actions", value.e(), this.f4311a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, value.c(), EnumC1145y2.f8522d);
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.getDuration());
            JsonPropertyParser.writeList(context, jSONObject, "end_actions", value.a(), this.f4311a.u0());
            Expression expression = value.f3816e;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(context, jSONObject, "end_value", expression, function1);
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.d(), EnumC1163z2.f8689d);
            JsonPropertyParser.write(context, jSONObject, "repeat_count", value.b(), this.f4311a.s2());
            JsonExpressionParser.writeExpression(context, jSONObject, "start_delay", value.f());
            JsonExpressionParser.writeExpression(context, jSONObject, "start_value", value.f3821j, function1);
            JsonPropertyParser.write(context, jSONObject, "type", "color_animator");
            JsonPropertyParser.write(context, jSONObject, "variable_name", value.h());
            return jSONObject;
        }
    }

    public static final class e implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4312a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4312a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Q3 deserialize(ParsingContext context, Q3 q32, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "cancel_actions", allowPropertyOverride, q32 != null ? q32.f4378a : null, this.f4312a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, P3.f4305f, allowPropertyOverride, q32 != null ? q32.f4379b : null, EnumC1145y2.f8523e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ionDirection.FROM_STRING)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = q32 != null ? q32.f4380c : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, P3.f4307h);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…_INT, DURATION_VALIDATOR)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "end_actions", allowPropertyOverride, q32 != null ? q32.f4381d : null, this.f4312a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…ActionJsonTemplateParser)");
            TypeHelper<Integer> typeHelper2 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field2 = q32 != null ? q32.f4382e : null;
            Function1<Object, Integer> function12 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "end_value", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…lue, STRING_TO_COLOR_INT)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "id", allowPropertyOverride, q32 != null ? q32.f4383f : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…llowOverride, parent?.id)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", P3.f4306g, allowPropertyOverride, q32 != null ? q32.f4384g : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "repeat_count", allowPropertyOverride, q32 != null ? q32.f4385h : null, this.f4312a.t2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…vCountJsonTemplateParser)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_delay", typeHelper, allowPropertyOverride, q32 != null ? q32.f4386i : null, function1, P3.f4308i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…T, START_DELAY_VALIDATOR)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_value", typeHelper2, allowPropertyOverride, q32 != null ? q32.f4387j : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…lue, STRING_TO_COLOR_INT)");
            Field readField2 = JsonFieldParser.readField(restrictPropertyOverride, data, "variable_name", allowPropertyOverride, q32 != null ? q32.f4388k : null);
            Intrinsics.checkNotNullExpressionValue(readField2, "readField(context, data,…de, parent?.variableName)");
            return new Q3(readOptionalListField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalListField2, readFieldWithExpression2, readField, readOptionalFieldWithExpression2, readOptionalField, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readField2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Q3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, "cancel_actions", value.f4378a, this.f4312a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, value.f4379b, EnumC1145y2.f8522d);
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f4380c);
            JsonFieldParser.writeListField(context, jSONObject, "end_actions", value.f4381d, this.f4312a.v0());
            Field field = value.f4382e;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(context, jSONObject, "end_value", field, function1);
            JsonFieldParser.writeField(context, jSONObject, "id", value.f4383f);
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f4384g, EnumC1163z2.f8689d);
            JsonFieldParser.writeField(context, jSONObject, "repeat_count", value.f4385h, this.f4312a.t2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_delay", value.f4386i);
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_value", value.f4387j, function1);
            JsonPropertyParser.write(context, jSONObject, "type", "color_animator");
            JsonFieldParser.writeField(context, jSONObject, "variable_name", value.f4388k);
            return jSONObject;
        }
    }

    public static final class f implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4313a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4313a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public M3 resolve(ParsingContext context, Q3 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f4378a, data, "cancel_actions", this.f4313a.w0(), this.f4313a.u0());
            Field field = template.f4379b;
            TypeHelper typeHelper = P3.f4305f;
            Function1 function1 = EnumC1145y2.f8523e;
            Expression expression = P3.f4301b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f4380c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, field2, data, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, P3.f4307h);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_INT, DURATION_VALIDATOR)");
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f4381d, data, "end_actions", this.f4313a.w0(), this.f4313a.u0());
            Field field3 = template.f4382e;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, field3, data, "end_value", typeHelper3, function13);
            Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            Object resolve = JsonFieldResolver.resolve(context, template.f4383f, data, "id");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.id, data, \"id\")");
            String str = (String) resolve;
            Field field4 = template.f4384g;
            TypeHelper typeHelper4 = P3.f4306g;
            Function1 function14 = EnumC1163z2.f8690e;
            Expression expression3 = P3.f4302c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "interpolator", typeHelper4, function14, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            AbstractC0861i4 abstractC0861i4 = (AbstractC0861i4) JsonFieldResolver.resolveOptional(context, template.f4385h, data, "repeat_count", this.f4313a.u2(), this.f4313a.s2());
            if (abstractC0861i4 == null) {
                abstractC0861i4 = P3.f4303d;
            }
            AbstractC0861i4 abstractC0861i42 = abstractC0861i4;
            Intrinsics.checkNotNullExpressionValue(abstractC0861i42, "JsonFieldResolver.resolv…EPEAT_COUNT_DEFAULT_VALUE");
            Field field5 = template.f4386i;
            ValueValidator valueValidator = P3.f4308i;
            Expression expression5 = P3.f4304e;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "start_delay", typeHelper2, function12, valueValidator, expression5);
            if (resolveOptionalExpression3 != null) {
                expression5 = resolveOptionalExpression3;
            }
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, template.f4387j, data, "start_value", typeHelper3, function13);
            Object resolve2 = JsonFieldResolver.resolve(context, template.f4388k, data, "variable_name");
            Intrinsics.checkNotNullExpressionValue(resolve2, "resolve(context, templat…e, data, \"variable_name\")");
            return new M3(resolveOptionalList, expression2, resolveExpression, resolveOptionalList2, resolveExpression2, str, expression4, abstractC0861i42, expression5, resolveOptionalExpression4, (String) resolve2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4301b = companion.constant(EnumC1145y2.NORMAL);
        f4302c = companion.constant(EnumC1163z2.LINEAR);
        f4303d = new AbstractC0861i4.c(new H5(companion.constant(1L)));
        f4304e = companion.constant(0L);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f4305f = companion2.from(AbstractC3219i.G(EnumC1145y2.values()), a.f4309i);
        f4306g = companion2.from(AbstractC3219i.G(EnumC1163z2.values()), b.f4310i);
        f4307h = new ValueValidator() { // from class: O1.N3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean c4;
                c4 = P3.c(((Long) obj).longValue());
                return c4;
            }
        };
        f4308i = new ValueValidator() { // from class: O1.O3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = P3.d(((Long) obj).longValue());
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
