package O1;

import O1.Kd;
import O1.Me;
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
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Wd {

    /* renamed from: a, reason: collision with root package name */
    private static final d f5153a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f5154b;

    /* renamed from: c, reason: collision with root package name */
    public static final S5 f5155c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f5156d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f5157e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f5158f;

    /* renamed from: g, reason: collision with root package name */
    public static final S5 f5159g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeHelper f5160h;

    /* renamed from: i, reason: collision with root package name */
    public static final TypeHelper f5161i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeHelper f5162j;

    /* renamed from: k, reason: collision with root package name */
    public static final ValueValidator f5163k;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5164i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Ld);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5165i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Kd.d.EnumC0031d);
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f5166i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0770d3);
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
        private final Cg f5167a;

        public e(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5167a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Kd.d deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Kd.d.a aVar = (Kd.d.a) JsonPropertyParser.readOptional(context, data, "accessibility", this.f5167a.d8());
            TypeHelper typeHelper = Wd.f5160h;
            Function1 function1 = Ld.f3773e;
            Expression expression = Wd.f5154b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            S5 s5 = (S5) JsonPropertyParser.readOptional(context, data, "height", this.f5167a.t3());
            if (s5 == null) {
                s5 = Wd.f5155c;
            }
            S5 s52 = s5;
            Intrinsics.checkNotNullExpressionValue(s52, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            TypeHelper typeHelper2 = Wd.f5161i;
            Function1 function12 = Kd.d.EnumC0031d.f3570e;
            Expression expression3 = Wd.f5156d;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "indexing_direction", typeHelper2, function12, expression3);
            Expression expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression5 = Wd.f5157e;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "preload_required", typeHelper3, function13, expression5);
            Expression expression6 = readOptionalExpression3 == null ? expression5 : readOptionalExpression3;
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, Wd.f5163k);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_TO_INT, START_VALIDATOR)");
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper typeHelper4 = Wd.f5162j;
            Function1 function14 = EnumC0770d3.f5998e;
            Expression expression7 = Wd.f5158f;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "tint_mode", typeHelper4, function14, expression7);
            if (readOptionalExpression5 != null) {
                expression7 = readOptionalExpression5;
            }
            Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …E_HELPER_URI, ANY_TO_URI)");
            S5 s53 = (S5) JsonPropertyParser.readOptional(context, data, "width", this.f5167a.t3());
            if (s53 == null) {
                s53 = Wd.f5159g;
            }
            Intrinsics.checkNotNullExpressionValue(s53, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new Kd.d(aVar, expression2, s52, expression4, expression6, readExpression, readOptionalExpression4, expression7, readExpression2, s53);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Kd.d value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.f3537a, this.f5167a.d8());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.f3538b, Ld.f3772d);
            JsonPropertyParser.write(context, jSONObject, "height", value.f3539c, this.f5167a.t3());
            JsonExpressionParser.writeExpression(context, jSONObject, "indexing_direction", value.f3540d, Kd.d.EnumC0031d.f3569d);
            JsonExpressionParser.writeExpression(context, jSONObject, "preload_required", value.f3541e);
            JsonExpressionParser.writeExpression(context, jSONObject, "start", value.f3542f);
            JsonExpressionParser.writeExpression(context, jSONObject, "tint_color", value.f3543g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(context, jSONObject, "tint_mode", value.f3544h, EnumC0770d3.f5997d);
            JsonExpressionParser.writeExpression(context, jSONObject, "url", value.f3545i, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "width", value.f3546j, this.f5167a.t3());
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5168a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5168a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Me.d deserialize(ParsingContext context, Me.d dVar, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, dVar != null ? dVar.f4010a : null, this.f5168a.e8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", Wd.f5160h, allowPropertyOverride, dVar != null ? dVar.f4011b : null, Ld.f3773e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, dVar != null ? dVar.f4012c : null, this.f5168a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…edSizeJsonTemplateParser)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "indexing_direction", Wd.f5161i, allowPropertyOverride, dVar != null ? dVar.f4013d : null, Kd.d.EnumC0031d.f3570e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…ingDirection.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, dVar != null ? dVar.f4014e : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…Required, ANY_TO_BOOLEAN)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "start", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, dVar != null ? dVar.f4015f : null, ParsingConvertersKt.NUMBER_TO_INT, Wd.f5163k);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…_TO_INT, START_VALIDATOR)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, dVar != null ? dVar.f4016g : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "tint_mode", Wd.f5162j, allowPropertyOverride, dVar != null ? dVar.f4017h : null, EnumC0770d3.f5998e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…DivBlendMode.FROM_STRING)");
            Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, dVar != null ? dVar.f4018i : null, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(… parent?.url, ANY_TO_URI)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, dVar != null ? dVar.f4019j : null, this.f5168a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…edSizeJsonTemplateParser)");
            return new Me.d(readOptionalField, readOptionalFieldWithExpression, readOptionalField2, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readFieldWithExpression, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readFieldWithExpression2, readOptionalField3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Me.d value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f4010a, this.f5168a.e8());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f4011b, Ld.f3772d);
            JsonFieldParser.writeField(context, jSONObject, "height", value.f4012c, this.f5168a.u3());
            JsonFieldParser.writeExpressionField(context, jSONObject, "indexing_direction", value.f4013d, Kd.d.EnumC0031d.f3569d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "preload_required", value.f4014e);
            JsonFieldParser.writeExpressionField(context, jSONObject, "start", value.f4015f);
            JsonFieldParser.writeExpressionField(context, jSONObject, "tint_color", value.f4016g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(context, jSONObject, "tint_mode", value.f4017h, EnumC0770d3.f5997d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "url", value.f4018i, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "width", value.f4019j, this.f5168a.u3());
            return jSONObject;
        }
    }

    public static final class g implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5169a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5169a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Kd.d resolve(ParsingContext context, Me.d template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Kd.d.a aVar = (Kd.d.a) JsonFieldResolver.resolveOptional(context, template.f4010a, data, "accessibility", this.f5169a.f8(), this.f5169a.d8());
            Field field = template.f4011b;
            TypeHelper typeHelper = Wd.f5160h;
            Function1 function1 = Ld.f3773e;
            Expression expression = Wd.f5154b;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alignment_vertical", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            S5 s5 = (S5) JsonFieldResolver.resolveOptional(context, template.f4012c, data, "height", this.f5169a.v3(), this.f5169a.t3());
            if (s5 == null) {
                s5 = Wd.f5155c;
            }
            S5 s52 = s5;
            Intrinsics.checkNotNullExpressionValue(s52, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            Field field2 = template.f4013d;
            TypeHelper typeHelper2 = Wd.f5161i;
            Function1 function12 = Kd.d.EnumC0031d.f3570e;
            Expression expression3 = Wd.f5156d;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "indexing_direction", typeHelper2, function12, expression3);
            Expression expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Field field3 = template.f4014e;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression5 = Wd.f5157e;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "preload_required", typeHelper3, function13, expression5);
            Expression expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4015f, data, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, Wd.f5163k);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_TO_INT, START_VALIDATOR)");
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, template.f4016g, data, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field field4 = template.f4017h;
            TypeHelper typeHelper4 = Wd.f5162j;
            Function1 function14 = EnumC0770d3.f5998e;
            Expression expression7 = Wd.f5158f;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "tint_mode", typeHelper4, function14, expression7);
            if (resolveOptionalExpression5 != null) {
                expression7 = resolveOptionalExpression5;
            }
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f4018i, data, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            S5 s53 = (S5) JsonFieldResolver.resolveOptional(context, template.f4019j, data, "width", this.f5169a.v3(), this.f5169a.t3());
            if (s53 == null) {
                s53 = Wd.f5159g;
            }
            Intrinsics.checkNotNullExpressionValue(s53, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new Kd.d(aVar, expression2, s52, expression4, expression6, resolveExpression, resolveOptionalExpression4, expression7, resolveExpression2, s53);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f5154b = companion.constant(Ld.CENTER);
        int i4 = 1;
        f5155c = new S5(null == true ? 1 : 0, companion.constant(20L), i4, null == true ? 1 : 0);
        f5156d = companion.constant(Kd.d.EnumC0031d.NORMAL);
        f5157e = companion.constant(Boolean.FALSE);
        f5158f = companion.constant(EnumC0770d3.SOURCE_IN);
        f5159g = new S5(null == true ? 1 : 0, companion.constant(20L), i4, null == true ? 1 : 0);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f5160h = companion2.from(AbstractC3219i.G(Ld.values()), a.f5164i);
        f5161i = companion2.from(AbstractC3219i.G(Kd.d.EnumC0031d.values()), b.f5165i);
        f5162j = companion2.from(AbstractC3219i.G(EnumC0770d3.values()), c.f5166i);
        f5163k = new ValueValidator() { // from class: O1.Vd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean b4;
                b4 = Wd.b(((Long) obj).longValue());
                return b4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j4) {
        return j4 >= 0;
    }
}
