package O1;

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
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0964o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c f7241a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    public static final TypeHelper f7242b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeHelper f7243c;

    /* renamed from: d, reason: collision with root package name */
    public static final ValueValidator f7244d;

    /* renamed from: e, reason: collision with root package name */
    public static final ValueValidator f7245e;

    /* renamed from: O1.o0$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7246i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1145y2);
        }
    }

    /* renamed from: O1.o0$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f7247i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1163z2);
        }
    }

    /* renamed from: O1.o0$c */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: O1.o0$d */
    public static final class d implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7248a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7248a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0910l0 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Object read = JsonPropertyParser.read(context, data, "animator_id");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"animator_id\")");
            String str = (String) read;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, AbstractC0964o0.f7242b, EnumC1145y2.f8523e);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new C0910l0(str, readOptionalExpression, JsonExpressionParser.readOptionalExpression(context, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, AbstractC0964o0.f7244d), (AbstractC1086uf) JsonPropertyParser.readOptional(context, data, "end_value", this.f7248a.b9()), JsonExpressionParser.readOptionalExpression(context, data, "interpolator", AbstractC0964o0.f7243c, EnumC1163z2.f8690e), (AbstractC0861i4) JsonPropertyParser.readOptional(context, data, "repeat_count", this.f7248a.s2()), JsonExpressionParser.readOptionalExpression(context, data, "start_delay", typeHelper, function1, AbstractC0964o0.f7245e), (AbstractC1086uf) JsonPropertyParser.readOptional(context, data, "start_value", this.f7248a.b9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0910l0 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "animator_id", value.f6879a);
            JsonExpressionParser.writeExpression(context, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, value.f6880b, EnumC1145y2.f8522d);
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f6881c);
            JsonPropertyParser.write(context, jSONObject, "end_value", value.f6882d, this.f7248a.b9());
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.f6883e, EnumC1163z2.f8689d);
            JsonPropertyParser.write(context, jSONObject, "repeat_count", value.f6884f, this.f7248a.s2());
            JsonExpressionParser.writeExpression(context, jSONObject, "start_delay", value.f6885g);
            JsonPropertyParser.write(context, jSONObject, "start_value", value.f6886h, this.f7248a.b9());
            JsonPropertyParser.write(context, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* renamed from: O1.o0$e */
    public static final class e implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7249a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7249a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0982p0 deserialize(ParsingContext context, C0982p0 c0982p0, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "animator_id", allowPropertyOverride, c0982p0 != null ? c0982p0.f7440a : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…ride, parent?.animatorId)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, AbstractC0964o0.f7242b, allowPropertyOverride, c0982p0 != null ? c0982p0.f7441b : null, EnumC1145y2.f8523e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ionDirection.FROM_STRING)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c0982p0 != null ? c0982p0.f7442c : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, AbstractC0964o0.f7244d);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…_INT, DURATION_VALIDATOR)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "end_value", allowPropertyOverride, c0982p0 != null ? c0982p0.f7443d : null, this.f7249a.c9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…dValueJsonTemplateParser)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", AbstractC0964o0.f7243c, allowPropertyOverride, c0982p0 != null ? c0982p0.f7444e : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "repeat_count", allowPropertyOverride, c0982p0 != null ? c0982p0.f7445f : null, this.f7249a.t2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…vCountJsonTemplateParser)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_delay", typeHelper, allowPropertyOverride, c0982p0 != null ? c0982p0.f7446g : null, function1, AbstractC0964o0.f7245e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, START_DELAY_VALIDATOR)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "start_value", allowPropertyOverride, c0982p0 != null ? c0982p0.f7447h : null, this.f7249a.c9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…dValueJsonTemplateParser)");
            return new C0982p0(readField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalField, readOptionalFieldWithExpression3, readOptionalField2, readOptionalFieldWithExpression4, readOptionalField3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0982p0 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "animator_id", value.f7440a);
            JsonFieldParser.writeExpressionField(context, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, value.f7441b, EnumC1145y2.f8522d);
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f7442c);
            JsonFieldParser.writeField(context, jSONObject, "end_value", value.f7443d, this.f7249a.c9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f7444e, EnumC1163z2.f8689d);
            JsonFieldParser.writeField(context, jSONObject, "repeat_count", value.f7445f, this.f7249a.t2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_delay", value.f7446g);
            JsonFieldParser.writeField(context, jSONObject, "start_value", value.f7447h, this.f7249a.c9());
            JsonPropertyParser.write(context, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* renamed from: O1.o0$f */
    public static final class f implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7250a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7250a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0910l0 resolve(ParsingContext context, C0982p0 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Object resolve = JsonFieldResolver.resolve(context, template.f7440a, data, "animator_id");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…rId, data, \"animator_id\")");
            String str = (String) resolve;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f7441b, data, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, AbstractC0964o0.f7242b, EnumC1145y2.f8523e);
            Field field = template.f7442c;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new C0910l0(str, resolveOptionalExpression, JsonFieldResolver.resolveOptionalExpression(context, field, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, AbstractC0964o0.f7244d), (AbstractC1086uf) JsonFieldResolver.resolveOptional(context, template.f7443d, data, "end_value", this.f7250a.d9(), this.f7250a.b9()), JsonFieldResolver.resolveOptionalExpression(context, template.f7444e, data, "interpolator", AbstractC0964o0.f7243c, EnumC1163z2.f8690e), (AbstractC0861i4) JsonFieldResolver.resolveOptional(context, template.f7445f, data, "repeat_count", this.f7250a.u2(), this.f7250a.s2()), JsonFieldResolver.resolveOptionalExpression(context, template.f7446g, data, "start_delay", typeHelper, function1, AbstractC0964o0.f7245e), (AbstractC1086uf) JsonFieldResolver.resolveOptional(context, template.f7447h, data, "start_value", this.f7250a.d9(), this.f7250a.b9()));
        }
    }

    static {
        TypeHelper.Companion companion = TypeHelper.Companion;
        f7242b = companion.from(AbstractC3219i.G(EnumC1145y2.values()), a.f7246i);
        f7243c = companion.from(AbstractC3219i.G(EnumC1163z2.values()), b.f7247i);
        f7244d = new ValueValidator() { // from class: O1.m0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean c4;
                c4 = AbstractC0964o0.c(((Long) obj).longValue());
                return c4;
            }
        };
        f7245e = new ValueValidator() { // from class: O1.n0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = AbstractC0964o0.d(((Long) obj).longValue());
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
