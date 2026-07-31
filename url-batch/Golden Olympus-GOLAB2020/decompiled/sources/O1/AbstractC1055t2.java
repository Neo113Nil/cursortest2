package O1;

import O1.C1037s2;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1055t2 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f7969a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final TypeHelper f7970b = TypeHelper.Companion.from(AbstractC3219i.G(C1037s2.a.values()), a.f7971i);

    /* renamed from: O1.t2$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7971i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C1037s2.a);
        }
    }

    /* renamed from: O1.t2$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.t2$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7972a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7972a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1037s2 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "action", AbstractC1055t2.f7970b, C1037s2.a.f7800e);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …Video.Action.FROM_STRING)");
            Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …\"id\", TYPE_HELPER_STRING)");
            return new C1037s2(readExpression, readExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1037s2 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "action", value.f7795a, C1037s2.a.f7799d);
            JsonExpressionParser.writeExpression(context, jSONObject, "id", value.f7796b);
            JsonPropertyParser.write(context, jSONObject, "type", "video");
            return jSONObject;
        }
    }

    /* renamed from: O1.t2$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7973a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7973a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1073u2 deserialize(ParsingContext context, C1073u2 c1073u2, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "action", AbstractC1055t2.f7970b, allowPropertyOverride, c1073u2 != null ? c1073u2.f8130a : null, C1037s2.a.f7800e);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…Video.Action.FROM_STRING)");
            Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c1073u2 != null ? c1073u2.f8131b : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…llowOverride, parent?.id)");
            return new C1073u2(readFieldWithExpression, readFieldWithExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1073u2 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "action", value.f8130a, C1037s2.a.f7799d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "id", value.f8131b);
            JsonPropertyParser.write(context, jSONObject, "type", "video");
            return jSONObject;
        }
    }

    /* renamed from: O1.t2$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7974a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7974a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1037s2 resolve(ParsingContext context, C1073u2 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f8130a, data, "action", AbstractC1055t2.f7970b, C1037s2.a.f7800e);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…Video.Action.FROM_STRING)");
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f8131b, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…\"id\", TYPE_HELPER_STRING)");
            return new C1037s2(resolveExpression, resolveExpression2);
        }
    }
}
