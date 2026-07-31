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

/* renamed from: O1.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0985p3 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f7451a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f7452b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f7453c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f7454d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeHelper f7455e;

    /* renamed from: f, reason: collision with root package name */
    public static final ValueValidator f7456f;

    /* renamed from: g, reason: collision with root package name */
    public static final ValueValidator f7457g;

    /* renamed from: O1.p3$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7458i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1163z2);
        }
    }

    /* renamed from: O1.p3$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.p3$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7459a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7459a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0931m3 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0985p3.f7456f;
            Expression expression = AbstractC0985p3.f7452b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            TypeHelper typeHelper2 = AbstractC0985p3.f7455e;
            Function1 function12 = EnumC1163z2.f8690e;
            Expression expression2 = AbstractC0985p3.f7453c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "interpolator", typeHelper2, function12, expression2);
            Expression expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            ValueValidator valueValidator2 = AbstractC0985p3.f7457g;
            Expression expression4 = AbstractC0985p3.f7454d;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "start_delay", typeHelper, function1, valueValidator2, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            return new C0931m3(readOptionalExpression, expression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0931m3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.b());
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.c(), EnumC1163z2.f8689d);
            JsonExpressionParser.writeExpression(context, jSONObject, "start_delay", value.d());
            JsonPropertyParser.write(context, jSONObject, "type", "change_bounds");
            return jSONObject;
        }
    }

    /* renamed from: O1.p3$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7460a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7460a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1003q3 deserialize(ParsingContext context, C1003q3 c1003q3, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c1003q3 != null ? c1003q3.f7563a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, AbstractC0985p3.f7456f);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_INT, DURATION_VALIDATOR)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", AbstractC0985p3.f7455e, allowPropertyOverride, c1003q3 != null ? c1003q3.f7564b : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_delay", typeHelper, allowPropertyOverride, c1003q3 != null ? c1003q3.f7565c : null, function1, AbstractC0985p3.f7457g);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…T, START_DELAY_VALIDATOR)");
            return new C1003q3(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1003q3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f7563a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f7564b, EnumC1163z2.f8689d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_delay", value.f7565c);
            JsonPropertyParser.write(context, jSONObject, "type", "change_bounds");
            return jSONObject;
        }
    }

    /* renamed from: O1.p3$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7461a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7461a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0931m3 resolve(ParsingContext context, C1003q3 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f7563a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0985p3.f7456f;
            Expression expression = AbstractC0985p3.f7452b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field field2 = template.f7564b;
            TypeHelper typeHelper2 = AbstractC0985p3.f7455e;
            Function1 function12 = EnumC1163z2.f8690e;
            Expression expression2 = AbstractC0985p3.f7453c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "interpolator", typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field field3 = template.f7565c;
            ValueValidator valueValidator2 = AbstractC0985p3.f7457g;
            Expression expression3 = AbstractC0985p3.f7454d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "start_delay", typeHelper, function1, valueValidator2, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            return new C0931m3(resolveOptionalExpression, resolveOptionalExpression2, expression3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f7452b = companion.constant(200L);
        f7453c = companion.constant(EnumC1163z2.EASE_IN_OUT);
        f7454d = companion.constant(0L);
        f7455e = TypeHelper.Companion.from(AbstractC3219i.G(EnumC1163z2.values()), a.f7458i);
        f7456f = new ValueValidator() { // from class: O1.n3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean c4;
                c4 = AbstractC0985p3.c(((Long) obj).longValue());
                return c4;
            }
        };
        f7457g = new ValueValidator() { // from class: O1.o3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = AbstractC0985p3.d(((Long) obj).longValue());
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
