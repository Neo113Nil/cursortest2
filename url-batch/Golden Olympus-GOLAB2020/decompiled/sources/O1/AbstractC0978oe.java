package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.oe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0978oe {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7410a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ValueValidator f7411b = new ValueValidator() { // from class: O1.ne
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean b4;
            b4 = AbstractC0978oe.b(((Long) obj).longValue());
            return b4;
        }
    };

    /* renamed from: O1.oe$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.oe$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7412a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7412a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0942me deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            return new C0942me(JsonExpressionParser.readOptionalExpression(context, data, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0978oe.f7411b), (Qc) JsonPropertyParser.readOptional(context, data, "stroke", this.f7412a.w7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0942me value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "corner_radius", value.f7096a);
            JsonPropertyParser.write(context, jSONObject, "stroke", value.f7097b, this.f7412a.w7());
            return jSONObject;
        }
    }

    /* renamed from: O1.oe$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7413a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7413a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0996pe deserialize(ParsingContext context, C0996pe c0996pe, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, c0996pe != null ? c0996pe.f7536a : null, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0978oe.f7411b);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp… CORNER_RADIUS_VALIDATOR)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "stroke", allowPropertyOverride, c0996pe != null ? c0996pe.f7537b : null, this.f7413a.x7());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…StrokeJsonTemplateParser)");
            return new C0996pe(readOptionalFieldWithExpression, readOptionalField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0996pe value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "corner_radius", value.f7536a);
            JsonFieldParser.writeField(context, jSONObject, "stroke", value.f7537b, this.f7413a.x7());
            return jSONObject;
        }
    }

    /* renamed from: O1.oe$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7414a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7414a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0942me resolve(ParsingContext context, C0996pe template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            return new C0942me(JsonFieldResolver.resolveOptionalExpression(context, template.f7536a, data, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, AbstractC0978oe.f7411b), (Qc) JsonFieldResolver.resolveOptional(context, template.f7537b, data, "stroke", this.f7414a.y7(), this.f7414a.w7()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j4) {
        return j4 >= 0;
    }
}
