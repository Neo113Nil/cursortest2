package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class J3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f3308a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final String f3309b = "it";

    /* renamed from: c, reason: collision with root package name */
    public static final ListValidator f3310c = new ListValidator() { // from class: O1.I3
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean b4;
            b4 = J3.b(list);
            return b4;
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
        private final Cg f3311a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3311a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H3 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …, TYPE_HELPER_JSON_ARRAY)");
            String str = (String) JsonPropertyParser.readOptional(context, data, "data_element_name");
            if (str == null) {
                str = J3.f3309b;
            }
            List readList = JsonPropertyParser.readList(context, data, "prototypes", this.f3311a.d2(), J3.f3310c);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …er, PROTOTYPES_VALIDATOR)");
            return new H3(readExpression, str, readList);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, H3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "data", value.f2947a);
            JsonPropertyParser.write(context, jSONObject, "data_element_name", value.f2948b);
            JsonPropertyParser.writeList(context, jSONObject, "prototypes", value.f2949c, this.f3311a.d2());
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3312a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3312a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L3 deserialize(ParsingContext context, L3 l32, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, allowPropertyOverride, l32 != null ? l32.f3662a : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…owOverride, parent?.data)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "data_element_name", allowPropertyOverride, l32 != null ? l32.f3663b : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex… parent?.dataElementName)");
            Field field = l32 != null ? l32.f3664c : null;
            W1.h e22 = this.f3312a.e2();
            ListValidator listValidator = J3.f3310c;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, "prototypes", allowPropertyOverride, field, e22, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…TOTYPES_VALIDATOR.cast())");
            return new L3(readFieldWithExpression, readOptionalField, readListField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, L3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "data", value.f3662a);
            JsonFieldParser.writeField(context, jSONObject, "data_element_name", value.f3663b);
            JsonFieldParser.writeListField(context, jSONObject, "prototypes", value.f3664c, this.f3312a.e2());
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3313a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3313a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H3 resolve(ParsingContext context, L3 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f3662a, data, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…, TYPE_HELPER_JSON_ARRAY)");
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f3663b, data, "data_element_name");
            if (str == null) {
                str = J3.f3309b;
            }
            Intrinsics.checkNotNullExpressionValue(str, "JsonFieldResolver.resolv…LEMENT_NAME_DEFAULT_VALUE");
            List resolveList = JsonFieldResolver.resolveList(context, template.f3664c, data, "prototypes", this.f3313a.f2(), this.f3313a.d2(), J3.f3310c);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…er, PROTOTYPES_VALIDATOR)");
            return new H3(resolveExpression, str, resolveList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
