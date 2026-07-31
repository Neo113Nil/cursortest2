package O1;

import O1.C0797ec;
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

/* renamed from: O1.hc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0851hc {

    /* renamed from: a, reason: collision with root package name */
    private static final c f6389a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6390b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f6391c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f6392d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f6393e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeHelper f6394f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f6395g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f6396h;

    /* renamed from: i, reason: collision with root package name */
    public static final ValueValidator f6397i;

    /* renamed from: O1.hc$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6398i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0797ec.c);
        }
    }

    /* renamed from: O1.hc$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f6399i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1163z2);
        }
    }

    /* renamed from: O1.hc$c */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: O1.hc$d */
    public static final class d implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6400a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6400a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0797ec deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            J4 j4 = (J4) JsonPropertyParser.readOptional(context, data, "distance", this.f6400a.J2());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0851hc.f6396h;
            Expression expression = AbstractC0851hc.f6390b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            TypeHelper typeHelper2 = AbstractC0851hc.f6394f;
            Function1 function12 = C0797ec.c.f6130e;
            Expression expression2 = AbstractC0851hc.f6391c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "edge", typeHelper2, function12, expression2);
            Expression expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            TypeHelper typeHelper3 = AbstractC0851hc.f6395g;
            Function1 function13 = EnumC1163z2.f8690e;
            Expression expression4 = AbstractC0851hc.f6392d;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "interpolator", typeHelper3, function13, expression4);
            Expression expression5 = readOptionalExpression3 == null ? expression4 : readOptionalExpression3;
            ValueValidator valueValidator2 = AbstractC0851hc.f6397i;
            Expression expression6 = AbstractC0851hc.f6393e;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "start_delay", typeHelper, function1, valueValidator2, expression6);
            return new C0797ec(j4, readOptionalExpression, expression3, expression5, readOptionalExpression4 == null ? expression6 : readOptionalExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0797ec value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "distance", value.f6121a, this.f6400a.J2());
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.b());
            JsonExpressionParser.writeExpression(context, jSONObject, "edge", value.f6123c, C0797ec.c.f6129d);
            JsonExpressionParser.writeExpression(context, jSONObject, "interpolator", value.c(), EnumC1163z2.f8689d);
            JsonExpressionParser.writeExpression(context, jSONObject, "start_delay", value.d());
            JsonPropertyParser.write(context, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* renamed from: O1.hc$e */
    public static final class e implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6401a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6401a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0869ic deserialize(ParsingContext context, C0869ic c0869ic, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "distance", allowPropertyOverride, c0869ic != null ? c0869ic.f6492a : null, this.f6401a.K2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…ensionJsonTemplateParser)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c0869ic != null ? c0869ic.f6493b : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, AbstractC0851hc.f6396h);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_INT, DURATION_VALIDATOR)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "edge", AbstractC0851hc.f6394f, allowPropertyOverride, c0869ic != null ? c0869ic.f6494c : null, C0797ec.c.f6130e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…nsition.Edge.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "interpolator", AbstractC0851hc.f6395g, allowPropertyOverride, c0869ic != null ? c0869ic.f6495d : null, EnumC1163z2.f8690e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…Interpolator.FROM_STRING)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start_delay", typeHelper, allowPropertyOverride, c0869ic != null ? c0869ic.f6496e : null, function1, AbstractC0851hc.f6397i);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, START_DELAY_VALIDATOR)");
            return new C0869ic(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0869ic value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "distance", value.f6492a, this.f6401a.K2());
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f6493b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "edge", value.f6494c, C0797ec.c.f6129d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "interpolator", value.f6495d, EnumC1163z2.f8689d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "start_delay", value.f6496e);
            JsonPropertyParser.write(context, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* renamed from: O1.hc$f */
    public static final class f implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6402a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6402a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0797ec resolve(ParsingContext context, C0869ic template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            J4 j4 = (J4) JsonFieldResolver.resolveOptional(context, template.f6492a, data, "distance", this.f6402a.L2(), this.f6402a.J2());
            Field field = template.f6493b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0851hc.f6396h;
            Expression expression = AbstractC0851hc.f6390b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = template.f6494c;
            TypeHelper typeHelper2 = AbstractC0851hc.f6394f;
            Function1 function12 = C0797ec.c.f6130e;
            Expression expression3 = AbstractC0851hc.f6391c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "edge", typeHelper2, function12, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Field field3 = template.f6495d;
            TypeHelper typeHelper3 = AbstractC0851hc.f6395g;
            Function1 function13 = EnumC1163z2.f8690e;
            Expression expression5 = AbstractC0851hc.f6392d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "interpolator", typeHelper3, function13, expression5);
            Expression expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            Field field4 = template.f6496e;
            ValueValidator valueValidator2 = AbstractC0851hc.f6397i;
            Expression expression7 = AbstractC0851hc.f6393e;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "start_delay", typeHelper, function1, valueValidator2, expression7);
            return new C0797ec(j4, expression2, expression4, expression6, resolveOptionalExpression4 == null ? expression7 : resolveOptionalExpression4);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6390b = companion.constant(200L);
        f6391c = companion.constant(C0797ec.c.BOTTOM);
        f6392d = companion.constant(EnumC1163z2.EASE_IN_OUT);
        f6393e = companion.constant(0L);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f6394f = companion2.from(AbstractC3219i.G(C0797ec.c.values()), a.f6398i);
        f6395g = companion2.from(AbstractC3219i.G(EnumC1163z2.values()), b.f6399i);
        f6396h = new ValueValidator() { // from class: O1.fc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean c4;
                c4 = AbstractC0851hc.c(((Long) obj).longValue());
                return c4;
            }
        };
        f6397i = new ValueValidator() { // from class: O1.gc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = AbstractC0851hc.d(((Long) obj).longValue());
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
