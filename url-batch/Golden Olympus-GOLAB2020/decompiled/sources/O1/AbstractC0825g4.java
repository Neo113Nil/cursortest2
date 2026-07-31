package O1;

import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
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

/* renamed from: O1.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0825g4 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f6218a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ValueValidator f6219b = new ValueValidator() { // from class: O1.c4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean e4;
            e4 = AbstractC0825g4.e(((Long) obj).longValue());
            return e4;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final ValueValidator f6220c = new ValueValidator() { // from class: O1.d4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean f4;
            f4 = AbstractC0825g4.f(((Long) obj).longValue());
            return f4;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final ValueValidator f6221d = new ValueValidator() { // from class: O1.e4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean g4;
            g4 = AbstractC0825g4.g(((Long) obj).longValue());
            return g4;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final ValueValidator f6222e = new ValueValidator() { // from class: O1.f4
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean h4;
            h4 = AbstractC0825g4.h(((Long) obj).longValue());
            return h4;
        }
    };

    /* renamed from: O1.g4$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.g4$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6223a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6223a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0735b4 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new C0735b4(JsonExpressionParser.readOptionalExpression(context, data, b9.e.f15363e, typeHelper, function1, AbstractC0825g4.f6219b), JsonExpressionParser.readOptionalExpression(context, data, b9.e.f15362d, typeHelper, function1, AbstractC0825g4.f6220c), JsonExpressionParser.readOptionalExpression(context, data, b9.e.f15361c, typeHelper, function1, AbstractC0825g4.f6221d), JsonExpressionParser.readOptionalExpression(context, data, b9.e.f15360b, typeHelper, function1, AbstractC0825g4.f6222e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0735b4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, b9.e.f15363e, value.f5777a);
            JsonExpressionParser.writeExpression(context, jSONObject, b9.e.f15362d, value.f5778b);
            JsonExpressionParser.writeExpression(context, jSONObject, b9.e.f15361c, value.f5779c);
            JsonExpressionParser.writeExpression(context, jSONObject, b9.e.f15360b, value.f5780d);
            return jSONObject;
        }
    }

    /* renamed from: O1.g4$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6224a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6224a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0843h4 deserialize(ParsingContext context, C0843h4 c0843h4, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c0843h4 != null ? c0843h4.f6367a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.e.f15363e, typeHelper, allowPropertyOverride, field, function1, AbstractC0825g4.f6219b);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…T, BOTTOM_LEFT_VALIDATOR)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.e.f15362d, typeHelper, allowPropertyOverride, c0843h4 != null ? c0843h4.f6368b : null, function1, AbstractC0825g4.f6220c);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…, BOTTOM_RIGHT_VALIDATOR)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.e.f15361c, typeHelper, allowPropertyOverride, c0843h4 != null ? c0843h4.f6369c : null, function1, AbstractC0825g4.f6221d);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_INT, TOP_LEFT_VALIDATOR)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.e.f15360b, typeHelper, allowPropertyOverride, c0843h4 != null ? c0843h4.f6370d : null, function1, AbstractC0825g4.f6222e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…INT, TOP_RIGHT_VALIDATOR)");
            return new C0843h4(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0843h4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.e.f15363e, value.f6367a);
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.e.f15362d, value.f6368b);
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.e.f15361c, value.f6369c);
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.e.f15360b, value.f6370d);
            return jSONObject;
        }
    }

    /* renamed from: O1.g4$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6225a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6225a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0735b4 resolve(ParsingContext context, C0843h4 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f6367a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new C0735b4(JsonFieldResolver.resolveOptionalExpression(context, field, data, b9.e.f15363e, typeHelper, function1, AbstractC0825g4.f6219b), JsonFieldResolver.resolveOptionalExpression(context, template.f6368b, data, b9.e.f15362d, typeHelper, function1, AbstractC0825g4.f6220c), JsonFieldResolver.resolveOptionalExpression(context, template.f6369c, data, b9.e.f15361c, typeHelper, function1, AbstractC0825g4.f6221d), JsonFieldResolver.resolveOptionalExpression(context, template.f6370d, data, b9.e.f15360b, typeHelper, function1, AbstractC0825g4.f6222e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j4) {
        return j4 >= 0;
    }
}
