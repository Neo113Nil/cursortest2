package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
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
public abstract class B3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f1441a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final S5 f1442b = new S5(null, Expression.Companion.constant(10L), 1, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1443a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1443a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public A3 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            S5 s5 = (S5) JsonPropertyParser.readOptional(context, data, "radius", this.f1443a.t3());
            if (s5 == null) {
                s5 = B3.f1442b;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonPropertyParser.readO…) ?: RADIUS_DEFAULT_VALUE");
            return new A3(readOptionalExpression, s5, (Qc) JsonPropertyParser.readOptional(context, data, "stroke", this.f1443a.w7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, A3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "background_color", value.f1302a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "radius", value.f1303b, this.f1443a.t3());
            JsonPropertyParser.write(context, jSONObject, "stroke", value.f1304c, this.f1443a.w7());
            JsonPropertyParser.write(context, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1444a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1444a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3 deserialize(ParsingContext context, C3 c32, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, c32 != null ? c32.f1574a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "radius", allowPropertyOverride, c32 != null ? c32.f1575b : null, this.f1444a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…edSizeJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "stroke", allowPropertyOverride, c32 != null ? c32.f1576c : null, this.f1444a.x7());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…StrokeJsonTemplateParser)");
            return new C3(readOptionalFieldWithExpression, readOptionalField, readOptionalField2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "background_color", value.f1574a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "radius", value.f1575b, this.f1444a.u3());
            JsonFieldParser.writeField(context, jSONObject, "stroke", value.f1576c, this.f1444a.x7());
            JsonPropertyParser.write(context, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1445a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1445a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public A3 resolve(ParsingContext context, C3 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f1574a, data, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            S5 s5 = (S5) JsonFieldResolver.resolveOptional(context, template.f1575b, data, "radius", this.f1445a.v3(), this.f1445a.t3());
            if (s5 == null) {
                s5 = B3.f1442b;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonFieldResolver.resolv…) ?: RADIUS_DEFAULT_VALUE");
            return new A3(resolveOptionalExpression, s5, (Qc) JsonFieldResolver.resolveOptional(context, template.f1576c, data, "stroke", this.f1445a.y7(), this.f1445a.w7()));
        }
    }
}
