package O1;

import O1.C1015qf;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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

/* renamed from: O1.sf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1050sf {

    /* renamed from: a, reason: collision with root package name */
    private static final b f7943a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f7944b = Expression.Companion.constant(C1015qf.c.ON_CONDITION);

    /* renamed from: c, reason: collision with root package name */
    public static final TypeHelper f7945c = TypeHelper.Companion.from(AbstractC3219i.G(C1015qf.c.values()), a.f7947i);

    /* renamed from: d, reason: collision with root package name */
    public static final ListValidator f7946d = new ListValidator() { // from class: O1.rf
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean b4;
            b4 = AbstractC1050sf.b(list);
            return b4;
        }
    };

    /* renamed from: O1.sf$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7947i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C1015qf.c);
        }
    }

    /* renamed from: O1.sf$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: O1.sf$c */
    public static final class c implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7948a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7948a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1015qf deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            List readList = JsonPropertyParser.readList(context, data, "actions", this.f7948a.u0(), AbstractC1050sf.f7946d);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …arser, ACTIONS_VALIDATOR)");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_BOOLEAN, ANY_TO_BOOLEAN)");
            TypeHelper typeHelper = AbstractC1050sf.f7945c;
            Function1 function1 = C1015qf.c.f7712e;
            Expression expression = AbstractC1050sf.f7944b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, b9.a.f15306t, typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new C1015qf(readList, readExpression, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1015qf value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, "actions", value.f7705a, this.f7948a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "condition", value.f7706b);
            JsonExpressionParser.writeExpression(context, jSONObject, b9.a.f15306t, value.f7707c, C1015qf.c.f7711d);
            return jSONObject;
        }
    }

    /* renamed from: O1.sf$d */
    public static final class d implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7949a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7949a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1068tf deserialize(ParsingContext context, C1068tf c1068tf, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field field = c1068tf != null ? c1068tf.f8113a : null;
            W1.h v02 = this.f7949a.v0();
            ListValidator listValidator = AbstractC1050sf.f7946d;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, "actions", allowPropertyOverride, field, v02, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…ACTIONS_VALIDATOR.cast())");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c1068tf != null ? c1068tf.f8114b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…ondition, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.a.f15306t, AbstractC1050sf.f7945c, allowPropertyOverride, c1068tf != null ? c1068tf.f8115c : null, C1015qf.c.f7712e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…Trigger.Mode.FROM_STRING)");
            return new C1068tf(readListField, readFieldWithExpression, readOptionalFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1068tf value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, "actions", value.f8113a, this.f7949a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "condition", value.f8114b);
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.a.f15306t, value.f8115c, C1015qf.c.f7711d);
            return jSONObject;
        }
    }

    /* renamed from: O1.sf$e */
    public static final class e implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7950a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7950a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1015qf resolve(ParsingContext context, C1068tf template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveList = JsonFieldResolver.resolveList(context, template.f8113a, data, "actions", this.f7950a.w0(), this.f7950a.u0(), AbstractC1050sf.f7946d);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…arser, ACTIONS_VALIDATOR)");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f8114b, data, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_BOOLEAN, ANY_TO_BOOLEAN)");
            Field field = template.f8115c;
            TypeHelper typeHelper = AbstractC1050sf.f7945c;
            Function1 function1 = C1015qf.c.f7712e;
            Expression expression = AbstractC1050sf.f7944b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, b9.a.f15306t, typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new C1015qf(resolveList, resolveExpression, expression);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
