package O1;

import O1.Mf;
import O1.Tf;
import com.huawei.hms.adapter.internal.CommonCode;
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
public abstract class Sf {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4841a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ValueValidator f4842b = new ValueValidator() { // from class: O1.Qf
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean c4;
            c4 = Sf.c(((Long) obj).longValue());
            return c4;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final ValueValidator f4843c = new ValueValidator() { // from class: O1.Rf
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean d4;
            d4 = Sf.d(((Long) obj).longValue());
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
        private final Cg f4844a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4844a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mf.c deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "height", typeHelper, function1, Sf.f4842b);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …TO_INT, HEIGHT_VALIDATOR)");
            Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "width", typeHelper, function1, Sf.f4843c);
            Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …_TO_INT, WIDTH_VALIDATOR)");
            return new Mf.c(readExpression, readExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Mf.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "height", value.f4065a);
            JsonPropertyParser.write(context, jSONObject, "type", CommonCode.MapKey.HAS_RESOLUTION);
            JsonExpressionParser.writeExpression(context, jSONObject, "width", value.f4066b);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4845a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4845a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Tf.c deserialize(ParsingContext context, Tf.c cVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = cVar != null ? cVar.f4894a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "height", typeHelper, allowPropertyOverride, field, function1, Sf.f4842b);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…TO_INT, HEIGHT_VALIDATOR)");
            Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "width", typeHelper, allowPropertyOverride, cVar != null ? cVar.f4895b : null, function1, Sf.f4843c);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…_TO_INT, WIDTH_VALIDATOR)");
            return new Tf.c(readFieldWithExpression, readFieldWithExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Tf.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "height", value.f4894a);
            JsonPropertyParser.write(context, jSONObject, "type", CommonCode.MapKey.HAS_RESOLUTION);
            JsonFieldParser.writeExpressionField(context, jSONObject, "width", value.f4895b);
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4846a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4846a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mf.c resolve(ParsingContext context, Tf.c template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f4894a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, field, data, "height", typeHelper, function1, Sf.f4842b);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…TO_INT, HEIGHT_VALIDATOR)");
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f4895b, data, "width", typeHelper, function1, Sf.f4843c);
            Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…_TO_INT, WIDTH_VALIDATOR)");
            return new Mf.c(resolveExpression, resolveExpression2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(long j4) {
        return j4 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j4) {
        return j4 > 0;
    }
}
