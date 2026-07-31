package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
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

/* renamed from: O1.qg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1016qg {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7719a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ValueValidator f7720b = new ValueValidator() { // from class: O1.pg
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean b4;
            b4 = AbstractC1016qg.b(((Long) obj).longValue());
            return b4;
        }
    };

    /* renamed from: O1.qg$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.qg$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7721a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7721a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0980og deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC1016qg.f7720b);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_TO_INT, VALUE_VALIDATOR)");
            return new C0980og(readExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0980og value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "type", FirebaseAnalytics.Param.INDEX);
            JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f7428a);
            return jSONObject;
        }
    }

    /* renamed from: O1.qg$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7722a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7722a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1033rg deserialize(ParsingContext context, C1033rg c1033rg, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(context), data, "value", TypeHelpersKt.TYPE_HELPER_INT, context.getAllowPropertyOverride(), c1033rg != null ? c1033rg.f7785a : null, ParsingConvertersKt.NUMBER_TO_INT, AbstractC1016qg.f7720b);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…_TO_INT, VALUE_VALIDATOR)");
            return new C1033rg(readFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1033rg value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "type", FirebaseAnalytics.Param.INDEX);
            JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f7785a);
            return jSONObject;
        }
    }

    /* renamed from: O1.qg$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7723a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7723a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0980og resolve(ParsingContext context, C1033rg template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f7785a, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC1016qg.f7720b);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_TO_INT, VALUE_VALIDATOR)");
            return new C0980og(resolveExpression);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j4) {
        return j4 >= 0;
    }
}
