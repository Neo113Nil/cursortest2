package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
public abstract class G8 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f2891a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f2892b = Expression.Companion.constant(0L);

    /* renamed from: c, reason: collision with root package name */
    public static final ValueValidator f2893c = new ValueValidator() { // from class: O1.D8
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean d4;
            d4 = G8.d(((Long) obj).longValue());
            return d4;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final ListValidator f2894d = new ListValidator() { // from class: O1.E8
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean e4;
            e4 = G8.e(list);
            return e4;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final ListValidator f2895e = new ListValidator() { // from class: O1.F8
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean f4;
            f4 = G8.f(list);
            return f4;
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
        private final Cg f2896a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2896a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public A8 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = G8.f2893c;
            Expression expression = G8.f2892b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "angle", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new A8(expression, JsonPropertyParser.readOptionalList(context, data, "color_map", this.f2896a.P4(), G8.f2895e), JsonExpressionParser.readOptionalExpressionList(context, data, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, G8.f2894d));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, A8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "angle", value.f1312a);
            JsonPropertyParser.writeList(context, jSONObject, "color_map", value.f1313b, this.f2896a.P4());
            JsonExpressionParser.writeExpressionList(context, jSONObject, "colors", value.f1314c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2897a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2897a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H8 deserialize(ParsingContext context, H8 h8, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "angle", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, h8 != null ? h8.f2977a : null, ParsingConvertersKt.NUMBER_TO_INT, G8.f2893c);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_TO_INT, ANGLE_VALIDATOR)");
            Field field = h8 != null ? h8.f2978b : null;
            W1.h Q4 = this.f2897a.Q4();
            ListValidator listValidator = G8.f2895e;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "color_map", allowPropertyOverride, field, Q4, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…LOR_MAP_VALIDATOR.cast())");
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field2 = h8 != null ? h8.f2979c : null;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator listValidator2 = G8.f2894d;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalExpressionListField = JsonFieldParser.readOptionalExpressionListField(restrictPropertyOverride, data, "colors", typeHelper, allowPropertyOverride, field2, function1, listValidator2);
            Intrinsics.checkNotNullExpressionValue(readOptionalExpressionListField, "readOptionalExpressionLi… COLORS_VALIDATOR.cast())");
            return new H8(readOptionalFieldWithExpression, readOptionalListField, readOptionalExpressionListField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, H8 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "angle", value.f2977a);
            JsonFieldParser.writeListField(context, jSONObject, "color_map", value.f2978b, this.f2897a.Q4());
            JsonFieldParser.writeExpressionListField(context, jSONObject, "colors", value.f2979c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2898a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2898a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public A8 resolve(ParsingContext context, H8 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f2977a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = G8.f2893c;
            Expression expression = G8.f2892b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "angle", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new A8(expression, JsonFieldResolver.resolveOptionalList(context, template.f2978b, data, "color_map", this.f2898a.R4(), this.f2898a.P4(), G8.f2895e), JsonFieldResolver.resolveOptionalExpressionList(context, template.f2979c, data, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, G8.f2894d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j4) {
        return j4 >= 0 && j4 <= 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 2;
    }
}
