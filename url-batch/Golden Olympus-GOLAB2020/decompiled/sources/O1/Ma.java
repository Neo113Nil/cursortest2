package O1;

import O1.Aa;
import O1.Na;
import O1.Xa;
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
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Ma {

    /* renamed from: a, reason: collision with root package name */
    private static final a f3877a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Aa.d f3878b;

    /* renamed from: c, reason: collision with root package name */
    public static final Aa.d f3879c;

    /* renamed from: d, reason: collision with root package name */
    public static final Na.d f3880d;

    /* renamed from: e, reason: collision with root package name */
    public static final ListValidator f3881e;

    /* renamed from: f, reason: collision with root package name */
    public static final ListValidator f3882f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3883a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3883a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1171za deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Aa aa = (Aa) JsonPropertyParser.readOptional(context, data, "center_x", this.f3883a.Z5());
            if (aa == null) {
                aa = Ma.f3878b;
            }
            Aa aa2 = aa;
            Intrinsics.checkNotNullExpressionValue(aa2, "JsonPropertyParser.readO…?: CENTER_X_DEFAULT_VALUE");
            Aa aa3 = (Aa) JsonPropertyParser.readOptional(context, data, "center_y", this.f3883a.Z5());
            if (aa3 == null) {
                aa3 = Ma.f3879c;
            }
            Aa aa4 = aa3;
            Intrinsics.checkNotNullExpressionValue(aa4, "JsonPropertyParser.readO…?: CENTER_Y_DEFAULT_VALUE");
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "color_map", this.f3883a.c6(), Ma.f3882f);
            ExpressionList readOptionalExpressionList = JsonExpressionParser.readOptionalExpressionList(context, data, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, Ma.f3881e);
            Na na = (Na) JsonPropertyParser.readOptional(context, data, "radius", this.f3883a.l6());
            if (na == null) {
                na = Ma.f3880d;
            }
            Na na2 = na;
            Intrinsics.checkNotNullExpressionValue(na2, "JsonPropertyParser.readO…) ?: RADIUS_DEFAULT_VALUE");
            return new C1171za(aa2, aa4, readOptionalList, readOptionalExpressionList, na2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1171za value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "center_x", value.f8809a, this.f3883a.Z5());
            JsonPropertyParser.write(context, jSONObject, "center_y", value.f8810b, this.f3883a.Z5());
            JsonPropertyParser.writeList(context, jSONObject, "color_map", value.f8811c, this.f3883a.c6());
            JsonExpressionParser.writeExpressionList(context, jSONObject, "colors", value.f8812d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "radius", value.f8813e, this.f3883a.l6());
            JsonPropertyParser.write(context, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3884a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3884a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0724ab deserialize(ParsingContext context, C0724ab c0724ab, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "center_x", allowPropertyOverride, c0724ab != null ? c0724ab.f5738a : null, this.f3884a.a6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…CenterJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "center_y", allowPropertyOverride, c0724ab != null ? c0724ab.f5739b : null, this.f3884a.a6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…CenterJsonTemplateParser)");
            Field field = c0724ab != null ? c0724ab.f5740c : null;
            W1.h d6 = this.f3884a.d6();
            ListValidator listValidator = Ma.f3882f;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "color_map", allowPropertyOverride, field, d6, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…LOR_MAP_VALIDATOR.cast())");
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field2 = c0724ab != null ? c0724ab.f5741d : null;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator listValidator2 = Ma.f3881e;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalExpressionListField = JsonFieldParser.readOptionalExpressionListField(restrictPropertyOverride, data, "colors", typeHelper, allowPropertyOverride, field2, function1, listValidator2);
            Intrinsics.checkNotNullExpressionValue(readOptionalExpressionListField, "readOptionalExpressionLi… COLORS_VALIDATOR.cast())");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "radius", allowPropertyOverride, c0724ab != null ? c0724ab.f5742e : null, this.f3884a.m6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…RadiusJsonTemplateParser)");
            return new C0724ab(readOptionalField, readOptionalField2, readOptionalListField, readOptionalExpressionListField, readOptionalField3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0724ab value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "center_x", value.f5738a, this.f3884a.a6());
            JsonFieldParser.writeField(context, jSONObject, "center_y", value.f5739b, this.f3884a.a6());
            JsonFieldParser.writeListField(context, jSONObject, "color_map", value.f5740c, this.f3884a.d6());
            JsonFieldParser.writeExpressionListField(context, jSONObject, "colors", value.f5741d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "radius", value.f5742e, this.f3884a.m6());
            JsonPropertyParser.write(context, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3885a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3885a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1171za resolve(ParsingContext context, C0724ab template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Aa aa = (Aa) JsonFieldResolver.resolveOptional(context, template.f5738a, data, "center_x", this.f3885a.b6(), this.f3885a.Z5());
            if (aa == null) {
                aa = Ma.f3878b;
            }
            Intrinsics.checkNotNullExpressionValue(aa, "JsonFieldResolver.resolv…?: CENTER_X_DEFAULT_VALUE");
            Aa aa2 = (Aa) JsonFieldResolver.resolveOptional(context, template.f5739b, data, "center_y", this.f3885a.b6(), this.f3885a.Z5());
            if (aa2 == null) {
                aa2 = Ma.f3879c;
            }
            Intrinsics.checkNotNullExpressionValue(aa2, "JsonFieldResolver.resolv…?: CENTER_Y_DEFAULT_VALUE");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f5740c, data, "color_map", this.f3885a.e6(), this.f3885a.c6(), Ma.f3882f);
            ExpressionList resolveOptionalExpressionList = JsonFieldResolver.resolveOptionalExpressionList(context, template.f5741d, data, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, Ma.f3881e);
            Na na = (Na) JsonFieldResolver.resolveOptional(context, template.f5742e, data, "radius", this.f3885a.n6(), this.f3885a.l6());
            if (na == null) {
                na = Ma.f3880d;
            }
            Na na2 = na;
            Intrinsics.checkNotNullExpressionValue(na2, "JsonFieldResolver.resolv…) ?: RADIUS_DEFAULT_VALUE");
            return new C1171za(aa, aa2, resolveOptionalList, resolveOptionalExpressionList, na2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(0.5d);
        f3878b = new Aa.d(new Sa(companion.constant(valueOf)));
        f3879c = new Aa.d(new Sa(companion.constant(valueOf)));
        f3880d = new Na.d(new Xa(companion.constant(Xa.c.FARTHEST_CORNER)));
        f3881e = new ListValidator() { // from class: O1.Ka
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean c4;
                c4 = Ma.c(list);
                return c4;
            }
        };
        f3882f = new ListValidator() { // from class: O1.La
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean d4;
                d4 = Ma.d(list);
                return d4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 2;
    }
}
