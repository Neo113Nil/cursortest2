package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
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
public abstract class R6 {

    /* renamed from: a, reason: collision with root package name */
    private static final d f4629a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f4630b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f4631c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f4632d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f4633e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f4634f;

    /* renamed from: g, reason: collision with root package name */
    public static final TypeHelper f4635g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f4636h;

    /* renamed from: i, reason: collision with root package name */
    public static final TypeHelper f4637i;

    /* renamed from: j, reason: collision with root package name */
    public static final ValueValidator f4638j;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4639i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f4640i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f4641i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Y6);
        }
    }

    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public static final class e implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4642a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4642a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public P6 deserialize(ParsingContext context, JSONObject data) {
            Expression expression;
            Expression expression2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = R6.f4638j;
            Expression expression3 = R6.f4630b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression3);
            if (readOptionalExpression != null) {
                expression3 = readOptionalExpression;
            }
            TypeHelper typeHelper2 = R6.f4635g;
            Function1 function12 = EnumC1091v2.f8195e;
            Expression expression4 = R6.f4631c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "content_alignment_horizontal", typeHelper2, function12, expression4);
            if (readOptionalExpression2 == null) {
                readOptionalExpression2 = expression4;
            }
            TypeHelper typeHelper3 = R6.f4636h;
            Function1 function13 = EnumC1109w2.f8300e;
            Expression expression5 = R6.f4632d;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "content_alignment_vertical", typeHelper3, function13, expression5);
            if (readOptionalExpression3 == null) {
                readOptionalExpression3 = expression5;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "filters", this.f4642a.e3());
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …E_HELPER_URI, ANY_TO_URI)");
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression6 = R6.f4633e;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "preload_required", typeHelper4, function14, expression6);
            Expression expression7 = readOptionalExpression4 == null ? expression6 : readOptionalExpression4;
            TypeHelper typeHelper5 = R6.f4637i;
            Function1 function15 = Y6.f5382e;
            Expression expression8 = R6.f4634f;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "scale", typeHelper5, function15, expression8);
            if (readOptionalExpression5 == null) {
                expression2 = expression3;
                expression = expression8;
            } else {
                Expression expression9 = expression3;
                expression = readOptionalExpression5;
                expression2 = expression9;
            }
            return new P6(expression2, readOptionalExpression2, readOptionalExpression3, readOptionalList, readExpression, expression7, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, P6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.f4321a);
            JsonExpressionParser.writeExpression(context, jSONObject, "content_alignment_horizontal", value.f4322b, EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "content_alignment_vertical", value.f4323c, EnumC1109w2.f8299d);
            JsonPropertyParser.writeList(context, jSONObject, "filters", value.f4324d, this.f4642a.e3());
            JsonExpressionParser.writeExpression(context, jSONObject, "image_url", value.f4325e, ParsingConvertersKt.URI_TO_STRING);
            JsonExpressionParser.writeExpression(context, jSONObject, "preload_required", value.f4326f);
            JsonExpressionParser.writeExpression(context, jSONObject, "scale", value.f4327g, Y6.f5381d);
            JsonPropertyParser.write(context, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4643a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4643a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S6 deserialize(ParsingContext context, S6 s6, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, s6 != null ? s6.f4725a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, R6.f4638j);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "content_alignment_horizontal", R6.f4635g, allowPropertyOverride, s6 != null ? s6.f4726b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "content_alignment_vertical", R6.f4636h, allowPropertyOverride, s6 != null ? s6.f4727c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "filters", allowPropertyOverride, s6 != null ? s6.f4728d : null, this.f4643a.f3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…FilterJsonTemplateParser)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, s6 != null ? s6.f4729e : null, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…nt?.imageUrl, ANY_TO_URI)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, s6 != null ? s6.f4730f : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…Required, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "scale", R6.f4637i, allowPropertyOverride, s6 != null ? s6.f4731g : null, Y6.f5382e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…ivImageScale.FROM_STRING)");
            return new S6(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readFieldWithExpression, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, S6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f4725a);
            JsonFieldParser.writeExpressionField(context, jSONObject, "content_alignment_horizontal", value.f4726b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "content_alignment_vertical", value.f4727c, EnumC1109w2.f8299d);
            JsonFieldParser.writeListField(context, jSONObject, "filters", value.f4728d, this.f4643a.f3());
            JsonFieldParser.writeExpressionField(context, jSONObject, "image_url", value.f4729e, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeExpressionField(context, jSONObject, "preload_required", value.f4730f);
            JsonFieldParser.writeExpressionField(context, jSONObject, "scale", value.f4731g, Y6.f5381d);
            JsonPropertyParser.write(context, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    public static final class g implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4644a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4644a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public P6 resolve(ParsingContext context, S6 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Field field = template.f4725a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = R6.f4638j;
            Expression expression = R6.f4630b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = template.f4726b;
            TypeHelper typeHelper2 = R6.f4635g;
            Function1 function12 = EnumC1091v2.f8195e;
            Expression expression2 = R6.f4631c;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "content_alignment_horizontal", typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field field3 = template.f4727c;
            TypeHelper typeHelper3 = R6.f4636h;
            Function1 function13 = EnumC1109w2.f8300e;
            Expression expression3 = R6.f4632d;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "content_alignment_vertical", typeHelper3, function13, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f4728d, data, "filters", this.f4644a.g3(), this.f4644a.e3());
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4729e, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            Field field4 = template.f4730f;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression4 = R6.f4633e;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "preload_required", typeHelper4, function14, expression4);
            Expression expression5 = resolveOptionalExpression4 == null ? expression4 : resolveOptionalExpression4;
            Field field5 = template.f4731g;
            TypeHelper typeHelper5 = R6.f4637i;
            Function1 function15 = Y6.f5382e;
            Expression expression6 = R6.f4634f;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "scale", typeHelper5, function15, expression6);
            if (resolveOptionalExpression5 != null) {
                expression6 = resolveOptionalExpression5;
            }
            return new P6(expression, resolveOptionalExpression2, resolveOptionalExpression3, resolveOptionalList, resolveExpression, expression5, expression6);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4630b = companion.constant(Double.valueOf(1.0d));
        f4631c = companion.constant(EnumC1091v2.CENTER);
        f4632d = companion.constant(EnumC1109w2.CENTER);
        f4633e = companion.constant(Boolean.FALSE);
        f4634f = companion.constant(Y6.FILL);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f4635g = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f4639i);
        f4636h = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f4640i);
        f4637i = companion2.from(AbstractC3219i.G(Y6.values()), c.f4641i);
        f4638j = new ValueValidator() { // from class: O1.Q6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean b4;
                b4 = R6.b(((Double) obj).doubleValue());
                return b4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }
}
