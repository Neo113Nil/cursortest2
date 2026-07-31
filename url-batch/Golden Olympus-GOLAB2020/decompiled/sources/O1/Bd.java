package O1;

import O1.C1013qd;
import O1.Id;
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
public abstract class Bd {

    /* renamed from: a, reason: collision with root package name */
    private static final a f1541a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final S5 f1542b;

    /* renamed from: c, reason: collision with root package name */
    public static final S5 f1543c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1544a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1544a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1013qd.d deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            S5 s5 = (S5) JsonPropertyParser.readOptional(context, data, "height", this.f1544a.t3());
            if (s5 == null) {
                s5 = Bd.f1542b;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …E_HELPER_URI, ANY_TO_URI)");
            S5 s52 = (S5) JsonPropertyParser.readOptional(context, data, "width", this.f1544a.t3());
            if (s52 == null) {
                s52 = Bd.f1543c;
            }
            Intrinsics.checkNotNullExpressionValue(s52, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1013qd.d(s5, readExpression, s52);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1013qd.d value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "height", value.f7652a, this.f1544a.t3());
            JsonExpressionParser.writeExpression(context, jSONObject, "image_url", value.f7653b, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "width", value.f7654c, this.f1544a.t3());
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1545a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1545a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Id.d deserialize(ParsingContext context, Id.d dVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, dVar != null ? dVar.f3236a : null, this.f1545a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…edSizeJsonTemplateParser)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, dVar != null ? dVar.f3237b : null, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…nt?.imageUrl, ANY_TO_URI)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, dVar != null ? dVar.f3238c : null, this.f1545a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…edSizeJsonTemplateParser)");
            return new Id.d(readOptionalField, readFieldWithExpression, readOptionalField2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Id.d value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "height", value.f3236a, this.f1545a.u3());
            JsonFieldParser.writeExpressionField(context, jSONObject, "image_url", value.f3237b, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "width", value.f3238c, this.f1545a.u3());
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f1546a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f1546a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1013qd.d resolve(ParsingContext context, Id.d template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            S5 s5 = (S5) JsonFieldResolver.resolveOptional(context, template.f3236a, data, "height", this.f1546a.v3(), this.f1546a.t3());
            if (s5 == null) {
                s5 = Bd.f1542b;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f3237b, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            S5 s52 = (S5) JsonFieldResolver.resolveOptional(context, template.f3238c, data, "width", this.f1546a.v3(), this.f1546a.t3());
            if (s52 == null) {
                s52 = Bd.f1543c;
            }
            Intrinsics.checkNotNullExpressionValue(s52, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1013qd.d(s5, resolveExpression, s52);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        int i4 = 1;
        f1542b = new S5(null == true ? 1 : 0, companion.constant(12L), i4, null == true ? 1 : 0);
        f1543c = new S5(null == true ? 1 : 0, companion.constant(12L), i4, null == true ? 1 : 0);
    }
}
