package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
public abstract class H4 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f2960a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final S5 f2961b = new S5(null, Expression.Companion.constant(15L), 1, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2962a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2962a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G4 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            S5 s5 = (S5) JsonPropertyParser.readOptional(context, data, "space_between_centers", this.f2962a.t3());
            if (s5 == null) {
                s5 = H4.f2961b;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonPropertyParser.readO…EEN_CENTERS_DEFAULT_VALUE");
            return new G4(s5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, G4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "space_between_centers", value.f2823a, this.f2962a.t3());
            JsonPropertyParser.write(context, jSONObject, "type", "default");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2963a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2963a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public I4 deserialize(ParsingContext context, I4 i4, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Field readOptionalField = JsonFieldParser.readOptionalField(ParsingContextKt.restrictPropertyOverride(context), data, "space_between_centers", context.getAllowPropertyOverride(), i4 != null ? i4.f3137a : null, this.f2963a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…edSizeJsonTemplateParser)");
            return new I4(readOptionalField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, I4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "space_between_centers", value.f3137a, this.f2963a.u3());
            JsonPropertyParser.write(context, jSONObject, "type", "default");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2964a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2964a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G4 resolve(ParsingContext context, I4 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            S5 s5 = (S5) JsonFieldResolver.resolveOptional(context, template.f3137a, data, "space_between_centers", this.f2964a.v3(), this.f2964a.t3());
            if (s5 == null) {
                s5 = H4.f2961b;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonFieldResolver.resolv…EEN_CENTERS_DEFAULT_VALUE");
            return new G4(s5);
        }
    }
}
