package O1;

import com.ironsource.b9;
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

/* loaded from: classes2.dex */
public abstract class F3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f2716a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ValueValidator f2717b = new ValueValidator() { // from class: O1.E3
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean b4;
            b4 = F3.b(((Long) obj).longValue());
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
        private final Cg f2718a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2718a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public D3 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …LOR, STRING_TO_COLOR_INT)");
            Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, F3.f2717b);
            Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, … CORNER_RADIUS_VALIDATOR)");
            return new D3(readExpression, readExpression2, (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f2718a.V2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, D3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15459S, value.f2451a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(context, jSONObject, "corner_radius", value.f2452b);
            JsonPropertyParser.write(context, jSONObject, "paddings", value.f2453c, this.f2718a.V2());
            JsonPropertyParser.write(context, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2719a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2719a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G3 deserialize(ParsingContext context, G3 g32, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, g32 != null ? g32.f2816a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…lor, STRING_TO_COLOR_INT)");
            Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, g32 != null ? g32.f2817b : null, ParsingConvertersKt.NUMBER_TO_INT, F3.f2717b);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(… CORNER_RADIUS_VALIDATOR)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, g32 != null ? g32.f2818c : null, this.f2719a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…InsetsJsonTemplateParser)");
            return new G3(readFieldWithExpression, readFieldWithExpression2, readOptionalField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, G3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15459S, value.f2816a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(context, jSONObject, "corner_radius", value.f2817b);
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f2818c, this.f2719a.W2());
            JsonPropertyParser.write(context, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2720a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2720a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public D3 resolve(ParsingContext context, G3 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f2816a, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f2817b, data, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, F3.f2717b);
            Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex… CORNER_RADIUS_VALIDATOR)");
            return new D3(resolveExpression, resolveExpression2, (C0754c5) JsonFieldResolver.resolveOptional(context, template.f2818c, data, "paddings", this.f2720a.X2(), this.f2720a.V2()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j4) {
        return j4 >= 0;
    }
}
