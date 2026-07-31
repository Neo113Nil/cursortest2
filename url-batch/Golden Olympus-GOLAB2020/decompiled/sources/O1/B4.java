package O1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
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
public abstract class B4 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f1446a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f1447b = Expression.Companion.constant(EnumC0979of.NONE);

    /* renamed from: c, reason: collision with root package name */
    public static final TypeHelper f1448c = TypeHelper.Companion.from(AbstractC3219i.G(EnumC0979of.values()), a.f1450i);

    /* renamed from: d, reason: collision with root package name */
    public static final ListValidator f1449d = new ListValidator() { // from class: O1.A4
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean b4;
            b4 = B4.b(list);
            return b4;
        }
    };

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1450i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0979of);
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
        private final Cg f1451a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1451a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1165z4 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            ParsingContext collectingErrors = ParsingContextKt.collectingErrors(context);
            List readOptionalList = JsonPropertyParser.readOptionalList(collectingErrors, data, "functions", this.f1451a.F3());
            Object read = JsonPropertyParser.read(collectingErrors, data, "log_id");
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"log_id\")");
            String str = (String) read;
            List readList = JsonPropertyParser.readList(collectingErrors, data, "states", this.f1451a.D2(), B4.f1449d);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …Parser, STATES_VALIDATOR)");
            List readOptionalList2 = JsonPropertyParser.readOptionalList(collectingErrors, data, "timers", this.f1451a.G8());
            TypeHelper typeHelper = B4.f1448c;
            Function1 function1 = EnumC0979of.f7417e;
            Expression expression = B4.f1447b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(collectingErrors, data, "transition_animation_selector", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new C1165z4(readOptionalList, str, readList, readOptionalList2, expression, JsonPropertyParser.readOptionalList(collectingErrors, data, "variable_triggers", this.f1451a.Y8()), JsonPropertyParser.readOptionalList(collectingErrors, data, "variables", this.f1451a.e9()), ParsingContextKt.getCollectedErrors(collectingErrors));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1165z4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.f8709a, this.f1451a.F3());
            JsonPropertyParser.write(context, jSONObject, "log_id", value.f8710b);
            JsonPropertyParser.writeList(context, jSONObject, "states", value.f8711c, this.f1451a.D2());
            JsonPropertyParser.writeList(context, jSONObject, "timers", value.f8712d, this.f1451a.G8());
            JsonExpressionParser.writeExpression(context, jSONObject, "transition_animation_selector", value.f8713e, EnumC0979of.f7416d);
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.f8714f, this.f1451a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f8715g, this.f1451a.e9());
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1452a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1452a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public F4 deserialize(ParsingContext context, F4 f4, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, f4 != null ? f4.f2724a : null, this.f1452a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "log_id", allowPropertyOverride, f4 != null ? f4.f2725b : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…wOverride, parent?.logId)");
            Field field = f4 != null ? f4.f2726c : null;
            W1.h E22 = this.f1452a.E2();
            ListValidator listValidator = B4.f1449d;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, "states", allowPropertyOverride, field, E22, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d… STATES_VALIDATOR.cast())");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "timers", allowPropertyOverride, f4 != null ? f4.f2727d : null, this.f1452a.H8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…vTimerJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "transition_animation_selector", B4.f1448c, allowPropertyOverride, f4 != null ? f4.f2728e : null, EnumC0979of.f7417e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…tionSelector.FROM_STRING)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, f4 != null ? f4.f2729f : null, this.f1452a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, f4 != null ? f4.f2730g : null, this.f1452a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…riableJsonTemplateParser)");
            return new F4(readOptionalListField, readField, readListField, readOptionalListField2, readOptionalFieldWithExpression, readOptionalListField3, readOptionalListField4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, F4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f2724a, this.f1452a.G3());
            JsonFieldParser.writeField(context, jSONObject, "log_id", value.f2725b);
            JsonFieldParser.writeListField(context, jSONObject, "states", value.f2726c, this.f1452a.E2());
            JsonFieldParser.writeListField(context, jSONObject, "timers", value.f2727d, this.f1452a.H8());
            JsonFieldParser.writeExpressionField(context, jSONObject, "transition_animation_selector", value.f2728e, EnumC0979of.f7416d);
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f2729f, this.f1452a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f2730g, this.f1452a.f9());
            return jSONObject;
        }
    }

    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1453a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1453a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1165z4 resolve(ParsingContext context, F4 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f2724a, data, "functions", this.f1453a.H3(), this.f1453a.F3());
            Object resolve = JsonFieldResolver.resolve(context, template.f2725b, data, "log_id");
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.logId, data, \"log_id\")");
            String str = (String) resolve;
            List resolveList = JsonFieldResolver.resolveList(context, template.f2726c, data, "states", this.f1453a.F2(), this.f1453a.D2(), B4.f1449d);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…Parser, STATES_VALIDATOR)");
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f2727d, data, "timers", this.f1453a.I8(), this.f1453a.G8());
            Field field = template.f2728e;
            TypeHelper typeHelper = B4.f1448c;
            Function1 function1 = EnumC0979of.f7417e;
            Expression expression = B4.f1447b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "transition_animation_selector", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new C1165z4(resolveOptionalList, str, resolveList, resolveOptionalList2, expression, JsonFieldResolver.resolveOptionalList(context, template.f2729f, data, "variable_triggers", this.f1453a.a9(), this.f1453a.Y8()), JsonFieldResolver.resolveOptionalList(context, template.f2730g, data, "variables", this.f1453a.g9(), this.f1453a.e9()), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
