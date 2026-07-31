package O1;

import O1.R3;
import O1.Y3;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class X3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f5205a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f5206b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f5207c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f5208d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5209a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5209a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R3.e deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f5209a.V2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = X3.f5206b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "show_at_end", typeHelper, function1, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            Expression expression2 = X3.f5207c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "show_at_start", typeHelper, function1, expression2);
            if (readOptionalExpression2 == null) {
                readOptionalExpression2 = expression2;
            }
            Expression expression3 = X3.f5208d;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "show_between", typeHelper, function1, expression3);
            Expression expression4 = readOptionalExpression3 == null ? expression3 : readOptionalExpression3;
            Object read = JsonPropertyParser.read(context, data, "style", this.f5209a.S2());
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"sty…DrawableJsonEntityParser)");
            return new R3.e(c0754c5, readOptionalExpression, readOptionalExpression2, expression4, (X4) read);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, R3.e value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "margins", value.f4589a, this.f5209a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "show_at_end", value.f4590b);
            JsonExpressionParser.writeExpression(context, jSONObject, "show_at_start", value.f4591c);
            JsonExpressionParser.writeExpression(context, jSONObject, "show_between", value.f4592d);
            JsonPropertyParser.write(context, jSONObject, "style", value.f4593e, this.f5209a.S2());
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5210a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5210a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Y3.c deserialize(ParsingContext context, Y3.c cVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, cVar != null ? cVar.f5372a : null, this.f5210a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…InsetsJsonTemplateParser)");
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = cVar != null ? cVar.f5373b : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "show_at_end", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…howAtEnd, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "show_at_start", typeHelper, allowPropertyOverride, cVar != null ? cVar.f5374c : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…wAtStart, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "show_between", typeHelper, allowPropertyOverride, cVar != null ? cVar.f5375d : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…wBetween, ANY_TO_BOOLEAN)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "style", allowPropertyOverride, cVar != null ? cVar.f5376e : null, this.f5210a.T2());
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…awableJsonTemplateParser)");
            return new Y3.c(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Y3.c value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f5372a, this.f5210a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "show_at_end", value.f5373b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "show_at_start", value.f5374c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "show_between", value.f5375d);
            JsonFieldParser.writeField(context, jSONObject, "style", value.f5376e, this.f5210a.T2());
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5211a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5211a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R3.e resolve(ParsingContext context, Y3.c template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f5372a, data, "margins", this.f5211a.X2(), this.f5211a.V2());
            Field field = template.f5373b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = X3.f5206b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "show_at_end", typeHelper, function1, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field field2 = template.f5374c;
            Expression expression2 = X3.f5207c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "show_at_start", typeHelper, function1, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field field3 = template.f5375d;
            Expression expression3 = X3.f5208d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "show_between", typeHelper, function1, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            Object resolve = JsonFieldResolver.resolve(context, template.f5376e, data, "style", this.f5211a.U2(), this.f5211a.S2());
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…DrawableJsonEntityParser)");
            return new R3.e(c0754c5, resolveOptionalExpression, resolveOptionalExpression2, expression3, (X4) resolve);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Boolean bool = Boolean.FALSE;
        f5206b = companion.constant(bool);
        f5207c = companion.constant(bool);
        f5208d = companion.constant(Boolean.TRUE);
    }
}
