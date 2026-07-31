package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0723aa {

    /* renamed from: a, reason: collision with root package name */
    private static final a f5728a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ValueValidator f5729b = new ValueValidator() { // from class: O1.Z9
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean b4;
            b4 = AbstractC0723aa.b(((Double) obj).doubleValue());
            return b4;
        }
    };

    /* renamed from: O1.aa$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.aa$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5730a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5730a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Y9 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, AbstractC0723aa.f5729b);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_DOUBLE, VALUE_VALIDATOR)");
            return new Y9(readExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Y9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "type", "percentage");
            JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f5399a);
            return jSONObject;
        }
    }

    /* renamed from: O1.aa$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5731a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5731a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0741ba deserialize(ParsingContext context, C0741ba c0741ba, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(context), data, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, context.getAllowPropertyOverride(), c0741ba != null ? c0741ba.f5801a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, AbstractC0723aa.f5729b);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…_DOUBLE, VALUE_VALIDATOR)");
            return new C0741ba(readFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0741ba value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "type", "percentage");
            JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f5801a);
            return jSONObject;
        }
    }

    /* renamed from: O1.aa$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5732a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5732a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Y9 resolve(ParsingContext context, C0741ba template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f5801a, data, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, AbstractC0723aa.f5729b);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_DOUBLE, VALUE_VALIDATOR)");
            return new Y9(resolveExpression);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d4) {
        return d4 > 0.0d;
    }
}
