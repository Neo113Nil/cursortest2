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
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Qe {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4483a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f4484b = Expression.Companion.constant(0L);

    /* renamed from: c, reason: collision with root package name */
    public static final ValueValidator f4485c = new ValueValidator() { // from class: O1.Oe
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean c4;
            c4 = Qe.c(((Long) obj).longValue());
            return c4;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final ValueValidator f4486d = new ValueValidator() { // from class: O1.Pe
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean d4;
            d4 = Qe.d(((Long) obj).longValue());
            return d4;
        }
    };

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4487a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4487a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ne deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = Qe.f4485c;
            Expression expression = Qe.f4484b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "end_actions", this.f4487a.u0());
            Object read = JsonPropertyParser.read(context, data, "id");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"id\")");
            return new Ne(expression, readOptionalList, (String) read, JsonPropertyParser.readOptionalList(context, data, "tick_actions", this.f4487a.u0()), JsonExpressionParser.readOptionalExpression(context, data, "tick_interval", typeHelper, function1, Qe.f4486d), (String) JsonPropertyParser.readOptional(context, data, "value_variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Ne value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f4165a);
            JsonPropertyParser.writeList(context, jSONObject, "end_actions", value.f4166b, this.f4487a.u0());
            JsonPropertyParser.write(context, jSONObject, "id", value.f4167c);
            JsonPropertyParser.writeList(context, jSONObject, "tick_actions", value.f4168d, this.f4487a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "tick_interval", value.f4169e);
            JsonPropertyParser.write(context, jSONObject, "value_variable", value.f4170f);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4488a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4488a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Re deserialize(ParsingContext context, Re re, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = re != null ? re.f4686a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, Qe.f4485c);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_INT, DURATION_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "end_actions", allowPropertyOverride, re != null ? re.f4687b : null, this.f4488a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "id", allowPropertyOverride, re != null ? re.f4688c : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…llowOverride, parent?.id)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tick_actions", allowPropertyOverride, re != null ? re.f4689d : null, this.f4488a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "tick_interval", typeHelper, allowPropertyOverride, re != null ? re.f4690e : null, function1, Qe.f4486d);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp… TICK_INTERVAL_VALIDATOR)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "value_variable", allowPropertyOverride, re != null ? re.f4691f : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…e, parent?.valueVariable)");
            return new Re(readOptionalFieldWithExpression, readOptionalListField, readField, readOptionalListField2, readOptionalFieldWithExpression2, readOptionalField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Re value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, IronSourceConstants.EVENTS_DURATION, value.f4686a);
            JsonFieldParser.writeListField(context, jSONObject, "end_actions", value.f4687b, this.f4488a.v0());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f4688c);
            JsonFieldParser.writeListField(context, jSONObject, "tick_actions", value.f4689d, this.f4488a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "tick_interval", value.f4690e);
            JsonFieldParser.writeField(context, jSONObject, "value_variable", value.f4691f);
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4489a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4489a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ne resolve(ParsingContext context, Re template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f4686a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = Qe.f4485c;
            Expression expression = Qe.f4484b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f4687b, data, "end_actions", this.f4489a.w0(), this.f4489a.u0());
            Object resolve = JsonFieldResolver.resolve(context, template.f4688c, data, "id");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.id, data, \"id\")");
            return new Ne(resolveOptionalExpression, resolveOptionalList, (String) resolve, JsonFieldResolver.resolveOptionalList(context, template.f4689d, data, "tick_actions", this.f4489a.w0(), this.f4489a.u0()), JsonFieldResolver.resolveOptionalExpression(context, template.f4690e, data, "tick_interval", typeHelper, function1, Qe.f4486d), (String) JsonFieldResolver.resolveOptional(context, template.f4691f, data, "value_variable"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j4) {
        return j4 > 0;
    }
}
