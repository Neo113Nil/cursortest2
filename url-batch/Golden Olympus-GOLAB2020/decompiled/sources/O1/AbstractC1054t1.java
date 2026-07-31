package O1;

import O1.C0892k0;
import android.net.Uri;
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

/* renamed from: O1.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1054t1 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f7962a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f7963b = Expression.Companion.constant(Boolean.TRUE);

    /* renamed from: c, reason: collision with root package name */
    public static final TypeHelper f7964c = TypeHelper.Companion.from(AbstractC3219i.G(C0892k0.d.values()), a.f7965i);

    /* renamed from: O1.t1$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7965i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0892k0.d);
        }
    }

    /* renamed from: O1.t1$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.t1$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7966a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7966a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0892k0 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            S4 s4 = (S4) JsonPropertyParser.readOptional(context, data, "download_callbacks", this.f7966a.P2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC1054t1.f7963b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "is_enabled", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_id\", TYPE_HELPER_STRING)");
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1<Object, Uri> function12 = ParsingConvertersKt.ANY_TO_URI;
            return new C0892k0(s4, expression, readExpression, JsonExpressionParser.readOptionalExpression(context, data, "log_url", typeHelper2, function12), JsonPropertyParser.readOptionalList(context, data, "menu_items", this.f7966a.x0()), (JSONObject) JsonPropertyParser.readOptional(context, data, "payload"), JsonExpressionParser.readOptionalExpression(context, data, "referer", typeHelper2, function12), (String) JsonPropertyParser.readOptional(context, data, "scope_id"), JsonExpressionParser.readOptionalExpression(context, data, "target", AbstractC1054t1.f7964c, C0892k0.d.f6774e), (AbstractC0948n2) JsonPropertyParser.readOptional(context, data, "typed", this.f7966a.h1()), JsonExpressionParser.readOptionalExpression(context, data, "url", typeHelper2, function12));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0892k0 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "download_callbacks", value.f6752a, this.f7966a.P2());
            JsonExpressionParser.writeExpression(context, jSONObject, "is_enabled", value.f6753b);
            JsonExpressionParser.writeExpression(context, jSONObject, "log_id", value.f6754c);
            Expression expression = value.f6755d;
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(context, jSONObject, "log_url", expression, function1);
            JsonPropertyParser.writeList(context, jSONObject, "menu_items", value.f6756e, this.f7966a.x0());
            JsonPropertyParser.write(context, jSONObject, "payload", value.f6757f);
            JsonExpressionParser.writeExpression(context, jSONObject, "referer", value.f6758g, function1);
            JsonPropertyParser.write(context, jSONObject, "scope_id", value.f6759h);
            JsonExpressionParser.writeExpression(context, jSONObject, "target", value.f6760i, C0892k0.d.f6773d);
            JsonPropertyParser.write(context, jSONObject, "typed", value.f6761j, this.f7966a.h1());
            JsonExpressionParser.writeExpression(context, jSONObject, "url", value.f6762k, function1);
            return jSONObject;
        }
    }

    /* renamed from: O1.t1$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7967a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7967a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0876j2 deserialize(ParsingContext context, C0876j2 c0876j2, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "download_callbacks", allowPropertyOverride, c0876j2 != null ? c0876j2.f6551a : null, this.f7967a.Q2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…lbacksJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c0876j2 != null ? c0876j2.f6552b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…sEnabled, ANY_TO_BOOLEAN)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c0876j2 != null ? c0876j2.f6553c : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…wOverride, parent?.logId)");
            TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
            Field field = c0876j2 != null ? c0876j2.f6554d : null;
            Function1<Object, Uri> function1 = ParsingConvertersKt.ANY_TO_URI;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "log_url", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…rent?.logUrl, ANY_TO_URI)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "menu_items", allowPropertyOverride, c0876j2 != null ? c0876j2.f6555e : null, this.f7967a.y0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…nuItemJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "payload", allowPropertyOverride, c0876j2 != null ? c0876j2.f6556f : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…verride, parent?.payload)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "referer", typeHelper, allowPropertyOverride, c0876j2 != null ? c0876j2.f6557g : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…ent?.referer, ANY_TO_URI)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "scope_id", allowPropertyOverride, c0876j2 != null ? c0876j2.f6558h : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…verride, parent?.scopeId)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "target", AbstractC1054t1.f7964c, allowPropertyOverride, c0876j2 != null ? c0876j2.f6559i : null, C0892k0.d.f6774e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…ction.Target.FROM_STRING)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "typed", allowPropertyOverride, c0876j2 != null ? c0876j2.f6560j : null, this.f7967a.i1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…nTypedJsonTemplateParser)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "url", typeHelper, allowPropertyOverride, c0876j2 != null ? c0876j2.f6561k : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp… parent?.url, ANY_TO_URI)");
            return new C0876j2(readOptionalField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalFieldWithExpression2, readOptionalListField, readOptionalField2, readOptionalFieldWithExpression3, readOptionalField3, readOptionalFieldWithExpression4, readOptionalField4, readOptionalFieldWithExpression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0876j2 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "download_callbacks", value.f6551a, this.f7967a.Q2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "is_enabled", value.f6552b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "log_id", value.f6553c);
            Field field = value.f6554d;
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(context, jSONObject, "log_url", field, function1);
            JsonFieldParser.writeListField(context, jSONObject, "menu_items", value.f6555e, this.f7967a.y0());
            JsonFieldParser.writeField(context, jSONObject, "payload", value.f6556f);
            JsonFieldParser.writeExpressionField(context, jSONObject, "referer", value.f6557g, function1);
            JsonFieldParser.writeField(context, jSONObject, "scope_id", value.f6558h);
            JsonFieldParser.writeExpressionField(context, jSONObject, "target", value.f6559i, C0892k0.d.f6773d);
            JsonFieldParser.writeField(context, jSONObject, "typed", value.f6560j, this.f7967a.i1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "url", value.f6561k, function1);
            return jSONObject;
        }
    }

    /* renamed from: O1.t1$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7968a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7968a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0892k0 resolve(ParsingContext context, C0876j2 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            S4 s4 = (S4) JsonFieldResolver.resolveOptional(context, template.f6551a, data, "download_callbacks", this.f7968a.R2(), this.f7968a.P2());
            Field field = template.f6552b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = AbstractC1054t1.f7963b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "is_enabled", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6553c, data, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
            Field field2 = template.f6554d;
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1<Object, Uri> function12 = ParsingConvertersKt.ANY_TO_URI;
            return new C0892k0(s4, expression, resolveExpression, JsonFieldResolver.resolveOptionalExpression(context, field2, data, "log_url", typeHelper2, function12), JsonFieldResolver.resolveOptionalList(context, template.f6555e, data, "menu_items", this.f7968a.z0(), this.f7968a.x0()), (JSONObject) JsonFieldResolver.resolveOptional(context, template.f6556f, data, "payload"), JsonFieldResolver.resolveOptionalExpression(context, template.f6557g, data, "referer", typeHelper2, function12), (String) JsonFieldResolver.resolveOptional(context, template.f6558h, data, "scope_id"), JsonFieldResolver.resolveOptionalExpression(context, template.f6559i, data, "target", AbstractC1054t1.f7964c, C0892k0.d.f6774e), (AbstractC0948n2) JsonFieldResolver.resolveOptional(context, template.f6560j, data, "typed", this.f7968a.j1(), this.f7968a.h1()), JsonFieldResolver.resolveOptionalExpression(context, template.f6561k, data, "url", typeHelper2, function12));
        }
    }
}
