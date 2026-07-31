package O1;

import O1.R9;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
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

/* loaded from: classes2.dex */
public abstract class W9 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f5135a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f5136b = Expression.Companion.constant(R9.d.PARTIAL);

    /* renamed from: c, reason: collision with root package name */
    public static final TypeHelper f5137c = TypeHelper.Companion.from(AbstractC3219i.G(R9.d.values()), a.f5139i);

    /* renamed from: d, reason: collision with root package name */
    public static final ListValidator f5138d = new ListValidator() { // from class: O1.V9
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean b4;
            b4 = W9.b(list);
            return b4;
        }
    };

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5139i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof R9.d);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5140a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5140a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R9 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            List readList = JsonPropertyParser.readList(context, data, "changes", this.f5140a.C5(), W9.f5138d);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …arser, CHANGES_VALIDATOR)");
            TypeHelper typeHelper = W9.f5137c;
            Function1 function1 = R9.d.f4669e;
            Expression expression = W9.f5136b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, b9.a.f15306t, typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new R9(readList, expression, JsonPropertyParser.readOptionalList(context, data, "on_applied_actions", this.f5140a.u0()), JsonPropertyParser.readOptionalList(context, data, "on_failed_actions", this.f5140a.u0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, R9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, "changes", value.f4654a, this.f5140a.C5());
            JsonExpressionParser.writeExpression(context, jSONObject, b9.a.f15306t, value.f4655b, R9.d.f4668d);
            JsonPropertyParser.writeList(context, jSONObject, "on_applied_actions", value.f4656c, this.f5140a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "on_failed_actions", value.f4657d, this.f5140a.u0());
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5141a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5141a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public X9 deserialize(ParsingContext context, X9 x9, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field field = x9 != null ? x9.f5257a : null;
            W1.h D5 = this.f5141a.D5();
            ListValidator listValidator = W9.f5138d;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, "changes", allowPropertyOverride, field, D5, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…CHANGES_VALIDATOR.cast())");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.a.f15306t, W9.f5137c, allowPropertyOverride, x9 != null ? x9.f5258b : null, R9.d.f4669e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ivPatch.Mode.FROM_STRING)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_applied_actions", allowPropertyOverride, x9 != null ? x9.f5259c : null, this.f5141a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_failed_actions", allowPropertyOverride, x9 != null ? x9.f5260d : null, this.f5141a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…ActionJsonTemplateParser)");
            return new X9(readListField, readOptionalFieldWithExpression, readOptionalListField, readOptionalListField2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, X9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, "changes", value.f5257a, this.f5141a.D5());
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.a.f15306t, value.f5258b, R9.d.f4668d);
            JsonFieldParser.writeListField(context, jSONObject, "on_applied_actions", value.f5259c, this.f5141a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "on_failed_actions", value.f5260d, this.f5141a.v0());
            return jSONObject;
        }
    }

    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5142a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5142a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R9 resolve(ParsingContext context, X9 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveList = JsonFieldResolver.resolveList(context, template.f5257a, data, "changes", this.f5142a.E5(), this.f5142a.C5(), W9.f5138d);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…arser, CHANGES_VALIDATOR)");
            Field field = template.f5258b;
            TypeHelper typeHelper = W9.f5137c;
            Function1 function1 = R9.d.f4669e;
            Expression expression = W9.f5136b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, b9.a.f15306t, typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new R9(resolveList, expression, JsonFieldResolver.resolveOptionalList(context, template.f5259c, data, "on_applied_actions", this.f5142a.w0(), this.f5142a.u0()), JsonFieldResolver.resolveOptionalList(context, template.f5260d, data, "on_failed_actions", this.f5142a.w0(), this.f5142a.u0()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
