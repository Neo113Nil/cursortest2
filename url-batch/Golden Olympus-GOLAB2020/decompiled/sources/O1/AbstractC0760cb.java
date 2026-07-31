package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.cb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0760cb {

    /* renamed from: a, reason: collision with root package name */
    private static final a f5950a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final S5 f5951b;

    /* renamed from: c, reason: collision with root package name */
    public static final S5 f5952c;

    /* renamed from: d, reason: collision with root package name */
    public static final S5 f5953d;

    /* renamed from: O1.cb$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.cb$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5954a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5954a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0742bb deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            S5 s5 = (S5) JsonPropertyParser.readOptional(context, data, "corner_radius", this.f5954a.t3());
            if (s5 == null) {
                s5 = AbstractC0760cb.f5951b;
            }
            S5 s52 = s5;
            Intrinsics.checkNotNullExpressionValue(s52, "JsonPropertyParser.readO…RNER_RADIUS_DEFAULT_VALUE");
            S5 s53 = (S5) JsonPropertyParser.readOptional(context, data, "item_height", this.f5954a.t3());
            if (s53 == null) {
                s53 = AbstractC0760cb.f5952c;
            }
            S5 s54 = s53;
            Intrinsics.checkNotNullExpressionValue(s54, "JsonPropertyParser.readO…ITEM_HEIGHT_DEFAULT_VALUE");
            S5 s55 = (S5) JsonPropertyParser.readOptional(context, data, "item_width", this.f5954a.t3());
            if (s55 == null) {
                s55 = AbstractC0760cb.f5953d;
            }
            S5 s56 = s55;
            Intrinsics.checkNotNullExpressionValue(s56, "JsonPropertyParser.readO… ITEM_WIDTH_DEFAULT_VALUE");
            return new C0742bb(readOptionalExpression, s52, s54, s56, (Qc) JsonPropertyParser.readOptional(context, data, "stroke", this.f5954a.w7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0742bb value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "background_color", value.f5808a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "corner_radius", value.f5809b, this.f5954a.t3());
            JsonPropertyParser.write(context, jSONObject, "item_height", value.f5810c, this.f5954a.t3());
            JsonPropertyParser.write(context, jSONObject, "item_width", value.f5811d, this.f5954a.t3());
            JsonPropertyParser.write(context, jSONObject, "stroke", value.f5812e, this.f5954a.w7());
            JsonPropertyParser.write(context, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* renamed from: O1.cb$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5955a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5955a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0778db deserialize(ParsingContext context, C0778db c0778db, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, c0778db != null ? c0778db.f6039a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "corner_radius", allowPropertyOverride, c0778db != null ? c0778db.f6040b : null, this.f5955a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…edSizeJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "item_height", allowPropertyOverride, c0778db != null ? c0778db.f6041c : null, this.f5955a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…edSizeJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "item_width", allowPropertyOverride, c0778db != null ? c0778db.f6042d : null, this.f5955a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…edSizeJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "stroke", allowPropertyOverride, c0778db != null ? c0778db.f6043e : null, this.f5955a.x7());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…StrokeJsonTemplateParser)");
            return new C0778db(readOptionalFieldWithExpression, readOptionalField, readOptionalField2, readOptionalField3, readOptionalField4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0778db value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "background_color", value.f6039a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "corner_radius", value.f6040b, this.f5955a.u3());
            JsonFieldParser.writeField(context, jSONObject, "item_height", value.f6041c, this.f5955a.u3());
            JsonFieldParser.writeField(context, jSONObject, "item_width", value.f6042d, this.f5955a.u3());
            JsonFieldParser.writeField(context, jSONObject, "stroke", value.f6043e, this.f5955a.x7());
            JsonPropertyParser.write(context, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* renamed from: O1.cb$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5956a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5956a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0742bb resolve(ParsingContext context, C0778db template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f6039a, data, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            S5 s5 = (S5) JsonFieldResolver.resolveOptional(context, template.f6040b, data, "corner_radius", this.f5956a.v3(), this.f5956a.t3());
            if (s5 == null) {
                s5 = AbstractC0760cb.f5951b;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonFieldResolver.resolv…RNER_RADIUS_DEFAULT_VALUE");
            S5 s52 = (S5) JsonFieldResolver.resolveOptional(context, template.f6041c, data, "item_height", this.f5956a.v3(), this.f5956a.t3());
            if (s52 == null) {
                s52 = AbstractC0760cb.f5952c;
            }
            Intrinsics.checkNotNullExpressionValue(s52, "JsonFieldResolver.resolv…ITEM_HEIGHT_DEFAULT_VALUE");
            S5 s53 = (S5) JsonFieldResolver.resolveOptional(context, template.f6042d, data, "item_width", this.f5956a.v3(), this.f5956a.t3());
            if (s53 == null) {
                s53 = AbstractC0760cb.f5953d;
            }
            S5 s54 = s53;
            Intrinsics.checkNotNullExpressionValue(s54, "JsonFieldResolver.resolv… ITEM_WIDTH_DEFAULT_VALUE");
            return new C0742bb(resolveOptionalExpression, s5, s52, s54, (Qc) JsonFieldResolver.resolveOptional(context, template.f6043e, data, "stroke", this.f5956a.y7(), this.f5956a.w7()));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f5951b = new S5(null, companion.constant(5L), 1, null);
        f5952c = new S5(null, companion.constant(10L), 1, null);
        f5953d = new S5(null, companion.constant(10L), 1, null);
    }
}
