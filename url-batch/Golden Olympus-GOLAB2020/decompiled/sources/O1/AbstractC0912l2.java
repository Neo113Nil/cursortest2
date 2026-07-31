package O1;

import O1.C0894k2;
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

/* renamed from: O1.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0912l2 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f6890a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final TypeHelper f6891b = TypeHelper.Companion.from(AbstractC3219i.G(C0894k2.a.values()), a.f6892i);

    /* renamed from: O1.l2$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6892i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0894k2.a);
        }
    }

    /* renamed from: O1.l2$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.l2$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6893a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6893a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0894k2 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "action", AbstractC0912l2.f6891b, C0894k2.a.f6789e);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …Timer.Action.FROM_STRING)");
            Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …\"id\", TYPE_HELPER_STRING)");
            return new C0894k2(readExpression, readExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0894k2 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "action", value.f6784a, C0894k2.a.f6788d);
            JsonExpressionParser.writeExpression(context, jSONObject, "id", value.f6785b);
            JsonPropertyParser.write(context, jSONObject, "type", "timer");
            return jSONObject;
        }
    }

    /* renamed from: O1.l2$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6894a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6894a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0930m2 deserialize(ParsingContext context, C0930m2 c0930m2, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "action", AbstractC0912l2.f6891b, allowPropertyOverride, c0930m2 != null ? c0930m2.f6968a : null, C0894k2.a.f6789e);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…Timer.Action.FROM_STRING)");
            Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c0930m2 != null ? c0930m2.f6969b : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…llowOverride, parent?.id)");
            return new C0930m2(readFieldWithExpression, readFieldWithExpression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0930m2 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "action", value.f6968a, C0894k2.a.f6788d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "id", value.f6969b);
            JsonPropertyParser.write(context, jSONObject, "type", "timer");
            return jSONObject;
        }
    }

    /* renamed from: O1.l2$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6895a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6895a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0894k2 resolve(ParsingContext context, C0930m2 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6968a, data, "action", AbstractC0912l2.f6891b, C0894k2.a.f6789e);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…Timer.Action.FROM_STRING)");
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f6969b, data, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…\"id\", TYPE_HELPER_STRING)");
            return new C0894k2(resolveExpression, resolveExpression2);
        }
    }
}
