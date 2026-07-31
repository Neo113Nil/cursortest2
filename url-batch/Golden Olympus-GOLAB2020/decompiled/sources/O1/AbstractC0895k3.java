package O1;

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

/* renamed from: O1.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0895k3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f6801a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6802b = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public static final ValueValidator f6803c = new ValueValidator() { // from class: O1.j3
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean b4;
            b4 = AbstractC0895k3.b(((Long) obj).longValue());
            return b4;
        }
    };

    /* renamed from: O1.k3$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.k3$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6804a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6804a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0860i3 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0895k3.f6803c);
            C0735b4 c0735b4 = (C0735b4) JsonPropertyParser.readOptional(context, data, "corners_radius", this.f6804a.p2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC0895k3.f6802b;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "has_shadow", typeHelper, function1, expression);
            return new C0860i3(readOptionalExpression, c0735b4, readOptionalExpression2 == null ? expression : readOptionalExpression2, (Ib) JsonPropertyParser.readOptional(context, data, "shadow", this.f6804a.M6()), (Qc) JsonPropertyParser.readOptional(context, data, "stroke", this.f6804a.w7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0860i3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "corner_radius", value.f6459a);
            JsonPropertyParser.write(context, jSONObject, "corners_radius", value.f6460b, this.f6804a.p2());
            JsonExpressionParser.writeExpression(context, jSONObject, "has_shadow", value.f6461c);
            JsonPropertyParser.write(context, jSONObject, "shadow", value.f6462d, this.f6804a.M6());
            JsonPropertyParser.write(context, jSONObject, "stroke", value.f6463e, this.f6804a.w7());
            return jSONObject;
        }
    }

    /* renamed from: O1.k3$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6805a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6805a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0913l3 deserialize(ParsingContext context, C0913l3 c0913l3, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, c0913l3 != null ? c0913l3.f6899a : null, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0895k3.f6803c);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp… CORNER_RADIUS_VALIDATOR)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "corners_radius", allowPropertyOverride, c0913l3 != null ? c0913l3.f6900b : null, this.f6805a.q2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…RadiusJsonTemplateParser)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "has_shadow", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c0913l3 != null ? c0913l3.f6901c : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…asShadow, ANY_TO_BOOLEAN)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "shadow", allowPropertyOverride, c0913l3 != null ? c0913l3.f6902d : null, this.f6805a.N6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…ShadowJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "stroke", allowPropertyOverride, c0913l3 != null ? c0913l3.f6903e : null, this.f6805a.x7());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…StrokeJsonTemplateParser)");
            return new C0913l3(readOptionalFieldWithExpression, readOptionalField, readOptionalFieldWithExpression2, readOptionalField2, readOptionalField3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0913l3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "corner_radius", value.f6899a);
            JsonFieldParser.writeField(context, jSONObject, "corners_radius", value.f6900b, this.f6805a.q2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "has_shadow", value.f6901c);
            JsonFieldParser.writeField(context, jSONObject, "shadow", value.f6902d, this.f6805a.N6());
            JsonFieldParser.writeField(context, jSONObject, "stroke", value.f6903e, this.f6805a.x7());
            return jSONObject;
        }
    }

    /* renamed from: O1.k3$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6806a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6806a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0860i3 resolve(ParsingContext context, C0913l3 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f6899a, data, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0895k3.f6803c);
            C0735b4 c0735b4 = (C0735b4) JsonFieldResolver.resolveOptional(context, template.f6900b, data, "corners_radius", this.f6806a.r2(), this.f6806a.p2());
            Field field = template.f6901c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC0895k3.f6802b;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "has_shadow", typeHelper, function1, expression);
            if (resolveOptionalExpression2 != null) {
                expression = resolveOptionalExpression2;
            }
            return new C0860i3(resolveOptionalExpression, c0735b4, expression, (Ib) JsonFieldResolver.resolveOptional(context, template.f6902d, data, "shadow", this.f6806a.O6(), this.f6806a.M6()), (Qc) JsonFieldResolver.resolveOptional(context, template.f6903e, data, "stroke", this.f6806a.y7(), this.f6806a.w7()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j4) {
        return j4 >= 0;
    }
}
