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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Oc {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4278a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final S5 f4279b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f4280c;

    /* renamed from: d, reason: collision with root package name */
    public static final ValueValidator f4281d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4282a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4282a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mc deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            S5 s5 = (S5) JsonPropertyParser.readOptional(context, data, "item_spacing", this.f4282a.t3());
            if (s5 == null) {
                s5 = Oc.f4279b;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonPropertyParser.readO…TEM_SPACING_DEFAULT_VALUE");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = Oc.f4281d;
            Expression expression = Oc.f4280c;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "max_visible_items", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new Mc(s5, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Mc value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "item_spacing", value.f3900a, this.f4282a.t3());
            JsonExpressionParser.writeExpression(context, jSONObject, "max_visible_items", value.f3901b);
            JsonPropertyParser.write(context, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4283a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4283a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pc deserialize(ParsingContext context, Pc pc, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "item_spacing", allowPropertyOverride, pc != null ? pc.f4343a : null, this.f4283a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…edSizeJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "max_visible_items", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, pc != null ? pc.f4344b : null, ParsingConvertersKt.NUMBER_TO_INT, Oc.f4281d);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_VISIBLE_ITEMS_VALIDATOR)");
            return new Pc(readOptionalField, readOptionalFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Pc value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "item_spacing", value.f4343a, this.f4283a.u3());
            JsonFieldParser.writeExpressionField(context, jSONObject, "max_visible_items", value.f4344b);
            JsonPropertyParser.write(context, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4284a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4284a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mc resolve(ParsingContext context, Pc template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            S5 s5 = (S5) JsonFieldResolver.resolveOptional(context, template.f4343a, data, "item_spacing", this.f4284a.v3(), this.f4284a.t3());
            if (s5 == null) {
                s5 = Oc.f4279b;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonFieldResolver.resolv…TEM_SPACING_DEFAULT_VALUE");
            Field field = template.f4344b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = Oc.f4281d;
            Expression expression = Oc.f4280c;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "max_visible_items", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new Mc(s5, expression);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4279b = new S5(null, companion.constant(5L), 1, null);
        f4280c = companion.constant(10L);
        f4281d = new ValueValidator() { // from class: O1.Nc
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean b4;
                b4 = Oc.b(((Long) obj).longValue());
                return b4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j4) {
        return j4 > 0;
    }
}
