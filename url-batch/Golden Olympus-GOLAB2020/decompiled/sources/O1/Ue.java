package O1;

import O1.Se;
import O1.Ve;
import com.ironsource.b9;
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

/* loaded from: classes2.dex */
public abstract class Ue {

    /* renamed from: a, reason: collision with root package name */
    private static final b f4936a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f4937b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f4938c;

    /* renamed from: d, reason: collision with root package name */
    public static final Ve.c f4939d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeHelper f4940e;

    /* renamed from: f, reason: collision with root package name */
    public static final ValueValidator f4941f;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4942i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Se.c);
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
        private final Cg f4943a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4943a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Se deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C1127x2 c1127x2 = (C1127x2) JsonPropertyParser.readOptional(context, data, "animation_in", this.f4943a.n1());
            C1127x2 c1127x22 = (C1127x2) JsonPropertyParser.readOptional(context, data, "animation_out", this.f4943a.n1());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = Ue.f4937b;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "close_by_tap_outside", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression2 == null ? expression : readOptionalExpression2;
            Object read = JsonPropertyParser.read(context, data, "div", this.f4943a.J4());
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"div…nent.divJsonEntityParser)");
            Z z4 = (Z) read;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = Ue.f4941f;
            Expression expression3 = Ue.f4938c;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, valueValidator, expression3);
            if (readOptionalExpression3 != null) {
                expression3 = readOptionalExpression3;
            }
            Object read2 = JsonPropertyParser.read(context, data, "id");
            Intrinsics.checkNotNullExpressionValue(read2, "read(context, data, \"id\")");
            String str = (String) read2;
            Ve ve = (Ve) JsonPropertyParser.readOptional(context, data, b9.a.f15306t, this.f4943a.M8());
            if (ve == null) {
                ve = Ue.f4939d;
            }
            Intrinsics.checkNotNullExpressionValue(ve, "JsonPropertyParser.readO…er) ?: MODE_DEFAULT_VALUE");
            C1081ua c1081ua = (C1081ua) JsonPropertyParser.readOptional(context, data, "offset", this.f4943a.W5());
            Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15451L, Ue.f4940e, Se.c.f4827e);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …tip.Position.FROM_STRING)");
            return new Se(c1127x2, c1127x22, readOptionalExpression, expression2, z4, expression3, str, ve, c1081ua, readExpression, JsonPropertyParser.readOptionalList(context, data, "tap_outside_actions", this.f4943a.u0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Se value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "animation_in", value.f4812a, this.f4943a.n1());
            JsonPropertyParser.write(context, jSONObject, "animation_out", value.f4813b, this.f4943a.n1());
            JsonExpressionParser.writeExpression(context, jSONObject, "background_accessibility_description", value.f4814c);
            JsonExpressionParser.writeExpression(context, jSONObject, "close_by_tap_outside", value.f4815d);
            JsonPropertyParser.write(context, jSONObject, "div", value.f4816e, this.f4943a.J4());
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f4817f);
            JsonPropertyParser.write(context, jSONObject, "id", value.f4818g);
            JsonPropertyParser.write(context, jSONObject, b9.a.f15306t, value.f4819h, this.f4943a.M8());
            JsonPropertyParser.write(context, jSONObject, "offset", value.f4820i, this.f4943a.W5());
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15451L, value.f4821j, Se.c.f4826d);
            JsonPropertyParser.writeList(context, jSONObject, "tap_outside_actions", value.f4822k, this.f4943a.u0());
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4944a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4944a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0907kf deserialize(ParsingContext context, C0907kf c0907kf, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "animation_in", allowPropertyOverride, c0907kf != null ? c0907kf.f6862a : null, this.f4944a.o1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…mationJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "animation_out", allowPropertyOverride, c0907kf != null ? c0907kf.f6863b : null, this.f4944a.o1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…mationJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c0907kf != null ? c0907kf.f6864c : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…AccessibilityDescription)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "close_by_tap_outside", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c0907kf != null ? c0907kf.f6865d : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…pOutside, ANY_TO_BOOLEAN)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "div", allowPropertyOverride, c0907kf != null ? c0907kf.f6866e : null, this.f4944a.K4());
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…nt.divJsonTemplateParser)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, c0907kf != null ? c0907kf.f6867f : null, ParsingConvertersKt.NUMBER_TO_INT, Ue.f4941f);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_INT, DURATION_VALIDATOR)");
            Field readField2 = JsonFieldParser.readField(restrictPropertyOverride, data, "id", allowPropertyOverride, c0907kf != null ? c0907kf.f6868g : null);
            Intrinsics.checkNotNullExpressionValue(readField2, "readField(context, data,…llowOverride, parent?.id)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, b9.a.f15306t, allowPropertyOverride, c0907kf != null ? c0907kf.f6869h : null, this.f4944a.N8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…ipModeJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "offset", allowPropertyOverride, c0907kf != null ? c0907kf.f6870i : null, this.f4944a.X5());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…vPointJsonTemplateParser)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15451L, Ue.f4940e, allowPropertyOverride, c0907kf != null ? c0907kf.f6871j : null, Se.c.f4827e);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…tip.Position.FROM_STRING)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tap_outside_actions", allowPropertyOverride, c0907kf != null ? c0907kf.f6872k : null, this.f4944a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            return new C0907kf(readOptionalField, readOptionalField2, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readField, readOptionalFieldWithExpression3, readField2, readOptionalField3, readOptionalField4, readFieldWithExpression, readOptionalListField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0907kf value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "animation_in", value.f6862a, this.f4944a.o1());
            JsonFieldParser.writeField(context, jSONObject, "animation_out", value.f6863b, this.f4944a.o1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "background_accessibility_description", value.f6864c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "close_by_tap_outside", value.f6865d);
            JsonFieldParser.writeField(context, jSONObject, "div", value.f6866e, this.f4944a.K4());
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f6867f);
            JsonFieldParser.writeField(context, jSONObject, "id", value.f6868g);
            JsonFieldParser.writeField(context, jSONObject, b9.a.f15306t, value.f6869h, this.f4944a.N8());
            JsonFieldParser.writeField(context, jSONObject, "offset", value.f6870i, this.f4944a.X5());
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15451L, value.f6871j, Se.c.f4826d);
            JsonFieldParser.writeListField(context, jSONObject, "tap_outside_actions", value.f6872k, this.f4944a.v0());
            return jSONObject;
        }
    }

    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4945a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4945a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Se resolve(ParsingContext context, C0907kf template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C1127x2 c1127x2 = (C1127x2) JsonFieldResolver.resolveOptional(context, template.f6862a, data, "animation_in", this.f4945a.p1(), this.f4945a.n1());
            C1127x2 c1127x22 = (C1127x2) JsonFieldResolver.resolveOptional(context, template.f6863b, data, "animation_out", this.f4945a.p1(), this.f4945a.n1());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f6864c, data, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field = template.f6865d;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = Ue.f4937b;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "close_by_tap_outside", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression2 == null ? expression : resolveOptionalExpression2;
            Object resolve = JsonFieldResolver.resolve(context, template.f6866e, data, "div", this.f4945a.L4(), this.f4945a.J4());
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…nent.divJsonEntityParser)");
            Z z4 = (Z) resolve;
            Field field2 = template.f6867f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = Ue.f4941f;
            Expression expression3 = Ue.f4938c;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, valueValidator, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            Object resolve2 = JsonFieldResolver.resolve(context, template.f6868g, data, "id");
            Intrinsics.checkNotNullExpressionValue(resolve2, "resolve(context, template.id, data, \"id\")");
            String str = (String) resolve2;
            Ve ve = (Ve) JsonFieldResolver.resolveOptional(context, template.f6869h, data, b9.a.f15306t, this.f4945a.O8(), this.f4945a.M8());
            if (ve == null) {
                ve = Ue.f4939d;
            }
            Ve ve2 = ve;
            Intrinsics.checkNotNullExpressionValue(ve2, "JsonFieldResolver.resolv…er) ?: MODE_DEFAULT_VALUE");
            C1081ua c1081ua = (C1081ua) JsonFieldResolver.resolveOptional(context, template.f6870i, data, "offset", this.f4945a.Y5(), this.f4945a.W5());
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6871j, data, b9.h.f15451L, Ue.f4940e, Se.c.f4827e);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…tip.Position.FROM_STRING)");
            return new Se(c1127x2, c1127x22, resolveOptionalExpression, expression2, z4, expression3, str, ve2, c1081ua, resolveExpression, JsonFieldResolver.resolveOptionalList(context, template.f6872k, data, "tap_outside_actions", this.f4945a.w0(), this.f4945a.u0()));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4937b = companion.constant(Boolean.TRUE);
        f4938c = companion.constant(5000L);
        f4939d = new Ve.c(new Ze());
        f4940e = TypeHelper.Companion.from(AbstractC3219i.G(Se.c.values()), a.f4942i);
        f4941f = new ValueValidator() { // from class: O1.Te
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean b4;
                b4 = Ue.b(((Long) obj).longValue());
                return b4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j4) {
        return j4 >= 0;
    }
}
