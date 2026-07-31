package O1;

import O1.C0839h0;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
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

/* renamed from: O1.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0857i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f6422a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6423b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f6424c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0839h0.d f6425d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeHelper f6426e;

    /* renamed from: O1.i0$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6427i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0839h0.c);
        }
    }

    /* renamed from: O1.i0$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.i0$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6428a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6428a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0839h0 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "description", typeHelper);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "hint", typeHelper);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "is_checked", typeHelper2, function1);
            TypeHelper typeHelper3 = AbstractC0857i0.f6426e;
            Function1 function12 = C0839h0.c.f6326e;
            Expression expression = AbstractC0857i0.f6423b;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, b9.a.f15306t, typeHelper3, function12, expression);
            Expression expression2 = readOptionalExpression4 == null ? expression : readOptionalExpression4;
            Expression expression3 = AbstractC0857i0.f6424c;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "mute_after_action", typeHelper2, function1, expression3);
            if (readOptionalExpression5 != null) {
                expression3 = readOptionalExpression5;
            }
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "state_description", typeHelper);
            C0839h0.d dVar = (C0839h0.d) JsonPropertyParser.readOptional(context, data, "type", C0839h0.d.f6336e);
            if (dVar == null) {
                dVar = AbstractC0857i0.f6425d;
            }
            Intrinsics.checkNotNullExpressionValue(dVar, "JsonPropertyParser.readO…NG) ?: TYPE_DEFAULT_VALUE");
            return new C0839h0(readOptionalExpression, readOptionalExpression2, readOptionalExpression3, expression2, expression3, readOptionalExpression6, dVar);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0839h0 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "description", value.f6315a);
            JsonExpressionParser.writeExpression(context, jSONObject, "hint", value.f6316b);
            JsonExpressionParser.writeExpression(context, jSONObject, "is_checked", value.f6317c);
            JsonExpressionParser.writeExpression(context, jSONObject, b9.a.f15306t, value.f6318d, C0839h0.c.f6325d);
            JsonExpressionParser.writeExpression(context, jSONObject, "mute_after_action", value.f6319e);
            JsonExpressionParser.writeExpression(context, jSONObject, "state_description", value.f6320f);
            JsonPropertyParser.write(context, jSONObject, "type", value.f6321g, (Function1<C0839h0.d, R>) C0839h0.d.f6335d);
            return jSONObject;
        }
    }

    /* renamed from: O1.i0$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6429a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6429a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0874j0 deserialize(ParsingContext context, C0874j0 c0874j0, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "description", typeHelper, allowPropertyOverride, c0874j0 != null ? c0874j0.f6535a : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ide, parent?.description)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "hint", typeHelper, allowPropertyOverride, c0874j0 != null ? c0874j0.f6536b : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…owOverride, parent?.hint)");
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = c0874j0 != null ? c0874j0.f6537c : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "is_checked", typeHelper2, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…sChecked, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.a.f15306t, AbstractC0857i0.f6426e, allowPropertyOverride, c0874j0 != null ? c0874j0.f6538d : null, C0839h0.c.f6326e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…ibility.Mode.FROM_STRING)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "mute_after_action", typeHelper2, allowPropertyOverride, c0874j0 != null ? c0874j0.f6539e : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…erAction, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "state_description", typeHelper, allowPropertyOverride, c0874j0 != null ? c0874j0.f6540f : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…parent?.stateDescription)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "type", allowPropertyOverride, c0874j0 != null ? c0874j0.f6541g : null, C0839h0.d.f6336e);
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…ibility.Type.FROM_STRING)");
            return new C0874j0(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0874j0 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "description", value.f6535a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "hint", value.f6536b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "is_checked", value.f6537c);
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.a.f15306t, value.f6538d, C0839h0.c.f6325d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "mute_after_action", value.f6539e);
            JsonFieldParser.writeExpressionField(context, jSONObject, "state_description", value.f6540f);
            JsonFieldParser.writeField(context, jSONObject, "type", value.f6541g, C0839h0.d.f6335d);
            return jSONObject;
        }
    }

    /* renamed from: O1.i0$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6430a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6430a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0839h0 resolve(ParsingContext context, C0874j0 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f6535a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "description", typeHelper);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f6536b, data, "hint", typeHelper);
            Field field2 = template.f6537c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "is_checked", typeHelper2, function1);
            Field field3 = template.f6538d;
            TypeHelper typeHelper3 = AbstractC0857i0.f6426e;
            Function1 function12 = C0839h0.c.f6326e;
            Expression expression = AbstractC0857i0.f6423b;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, b9.a.f15306t, typeHelper3, function12, expression);
            Expression expression2 = resolveOptionalExpression4 == null ? expression : resolveOptionalExpression4;
            Field field4 = template.f6539e;
            Expression expression3 = AbstractC0857i0.f6424c;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "mute_after_action", typeHelper2, function1, expression3);
            if (resolveOptionalExpression5 != null) {
                expression3 = resolveOptionalExpression5;
            }
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, template.f6540f, data, "state_description", typeHelper);
            C0839h0.d dVar = (C0839h0.d) JsonFieldResolver.resolveOptional(context, template.f6541g, data, "type", C0839h0.d.f6336e);
            if (dVar == null) {
                dVar = AbstractC0857i0.f6425d;
            }
            C0839h0.d dVar2 = dVar;
            Intrinsics.checkNotNullExpressionValue(dVar2, "JsonFieldResolver.resolv…NG) ?: TYPE_DEFAULT_VALUE");
            return new C0839h0(resolveOptionalExpression, resolveOptionalExpression2, resolveOptionalExpression3, expression2, expression3, resolveOptionalExpression6, dVar2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6423b = companion.constant(C0839h0.c.DEFAULT);
        f6424c = companion.constant(Boolean.FALSE);
        f6425d = C0839h0.d.AUTO;
        f6426e = TypeHelper.Companion.from(AbstractC3219i.G(C0839h0.c.values()), a.f6427i);
    }
}
