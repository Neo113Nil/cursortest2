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

/* renamed from: O1.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0824g3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f6213a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ValueValidator f6214b = new ValueValidator() { // from class: O1.f3
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean b4;
            b4 = AbstractC0824g3.b(((Long) obj).longValue());
            return b4;
        }
    };

    /* renamed from: O1.g3$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.g3$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6215a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6215a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0788e3 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0824g3.f6214b);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …TO_INT, RADIUS_VALIDATOR)");
            return new C0788e3(readExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0788e3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "radius", value.f6074a);
            JsonPropertyParser.write(context, jSONObject, "type", "blur");
            return jSONObject;
        }
    }

    /* renamed from: O1.g3$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6216a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6216a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0842h3 deserialize(ParsingContext context, C0842h3 c0842h3, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(context), data, "radius", TypeHelpersKt.TYPE_HELPER_INT, context.getAllowPropertyOverride(), c0842h3 != null ? c0842h3.f6363a : null, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0824g3.f6214b);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…TO_INT, RADIUS_VALIDATOR)");
            return new C0842h3(readFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0842h3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "radius", value.f6363a);
            JsonPropertyParser.write(context, jSONObject, "type", "blur");
            return jSONObject;
        }
    }

    /* renamed from: O1.g3$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6217a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6217a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0788e3 resolve(ParsingContext context, C0842h3 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6363a, data, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0824g3.f6214b);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…TO_INT, RADIUS_VALIDATOR)");
            return new C0788e3(resolveExpression);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j4) {
        return j4 >= 0;
    }
}
