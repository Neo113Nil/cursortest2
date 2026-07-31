package O1;

import O1.C0715a2;
import O1.C0859i2;
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
import java.util.List;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0841h2 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f6354a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f6355b = Expression.Companion.constant(C0715a2.c.d.POST);

    /* renamed from: c, reason: collision with root package name */
    public static final TypeHelper f6356c = TypeHelper.Companion.from(AbstractC3219i.G(C0715a2.c.d.values()), a.f6357i);

    /* renamed from: O1.h2$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6357i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0715a2.c.d);
        }
    }

    /* renamed from: O1.h2$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.h2$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6358a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6358a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0715a2.c deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "headers", this.f6358a.Y0());
            TypeHelper typeHelper = AbstractC0841h2.f6356c;
            Function1 function1 = C0715a2.c.d.f5611e;
            Expression expression = AbstractC0841h2.f6355b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "method", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …E_HELPER_URI, ANY_TO_URI)");
            return new C0715a2.c(readOptionalList, expression, readExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0715a2.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, "headers", value.f5598a, this.f6358a.Y0());
            JsonExpressionParser.writeExpression(context, jSONObject, "method", value.f5599b, C0715a2.c.d.f5610d);
            JsonExpressionParser.writeExpression(context, jSONObject, "url", value.f5600c, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }
    }

    /* renamed from: O1.h2$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6359a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6359a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0859i2.c deserialize(ParsingContext context, C0859i2.c cVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "headers", allowPropertyOverride, cVar != null ? cVar.f6447a : null, this.f6359a.Z0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…HeaderJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "method", AbstractC0841h2.f6356c, allowPropertyOverride, cVar != null ? cVar.f6448b : null, C0715a2.c.d.f5611e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…quest.Method.FROM_STRING)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, cVar != null ? cVar.f6449c : null, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(… parent?.url, ANY_TO_URI)");
            return new C0859i2.c(readOptionalListField, readOptionalFieldWithExpression, readFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0859i2.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, "headers", value.f6447a, this.f6359a.Z0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "method", value.f6448b, C0715a2.c.d.f5610d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "url", value.f6449c, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }
    }

    /* renamed from: O1.h2$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6360a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6360a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0715a2.c resolve(ParsingContext context, C0859i2.c template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f6447a, data, "headers", this.f6360a.a1(), this.f6360a.Y0());
            Field field = template.f6448b;
            TypeHelper typeHelper = AbstractC0841h2.f6356c;
            Function1 function1 = C0715a2.c.d.f5611e;
            Expression expression = AbstractC0841h2.f6355b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "method", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6449c, data, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            return new C0715a2.c(resolveOptionalList, expression, resolveExpression);
        }
    }
}
