package O1;

import O1.Kd;
import O1.Me;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
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
public abstract class Ud {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4931a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Kd.d.a.c f4932b = Kd.d.a.c.AUTO;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4933a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4933a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Kd.d.a deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "description", TypeHelpersKt.TYPE_HELPER_STRING);
            Kd.d.a.c cVar = (Kd.d.a.c) JsonPropertyParser.readOptional(context, data, "type", Kd.d.a.c.f3557e);
            if (cVar == null) {
                cVar = Ud.f4932b;
            }
            Intrinsics.checkNotNullExpressionValue(cVar, "JsonPropertyParser.readO…NG) ?: TYPE_DEFAULT_VALUE");
            return new Kd.d.a(readOptionalExpression, cVar);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Kd.d.a value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "description", value.f3551a);
            JsonPropertyParser.write(context, jSONObject, "type", value.f3552b, (Function1<Kd.d.a.c, R>) Kd.d.a.c.f3556d);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4934a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4934a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Me.d.a deserialize(ParsingContext context, Me.d.a aVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, aVar != null ? aVar.f4023a : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ide, parent?.description)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "type", allowPropertyOverride, aVar != null ? aVar.f4024b : null, Kd.d.a.c.f3557e);
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…ibility.Type.FROM_STRING)");
            return new Me.d.a(readOptionalFieldWithExpression, readOptionalField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Me.d.a value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "description", value.f4023a);
            JsonFieldParser.writeField(context, jSONObject, "type", value.f4024b, Kd.d.a.c.f3556d);
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4935a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4935a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Kd.d.a resolve(ParsingContext context, Me.d.a template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f4023a, data, "description", TypeHelpersKt.TYPE_HELPER_STRING);
            Kd.d.a.c cVar = (Kd.d.a.c) JsonFieldResolver.resolveOptional(context, template.f4024b, data, "type", Kd.d.a.c.f3557e);
            if (cVar == null) {
                cVar = Ud.f4932b;
            }
            Intrinsics.checkNotNullExpressionValue(cVar, "JsonFieldResolver.resolv…NG) ?: TYPE_DEFAULT_VALUE");
            return new Kd.d.a(resolveOptionalExpression, cVar);
        }
    }
}
