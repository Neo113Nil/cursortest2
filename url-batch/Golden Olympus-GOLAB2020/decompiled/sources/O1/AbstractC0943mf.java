package O1;

import O1.AbstractC0849ha;
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

/* renamed from: O1.mf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0943mf {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7100a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0849ha.d f7101b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0849ha.d f7102c;

    /* renamed from: O1.mf$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.mf$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7103a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7103a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0925lf deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            AbstractC0849ha abstractC0849ha = (AbstractC0849ha) JsonPropertyParser.readOptional(context, data, "pivot_x", this.f7103a.Q5());
            if (abstractC0849ha == null) {
                abstractC0849ha = AbstractC0943mf.f7101b;
            }
            Intrinsics.checkNotNullExpressionValue(abstractC0849ha, "JsonPropertyParser.readO… ?: PIVOT_X_DEFAULT_VALUE");
            AbstractC0849ha abstractC0849ha2 = (AbstractC0849ha) JsonPropertyParser.readOptional(context, data, "pivot_y", this.f7103a.Q5());
            if (abstractC0849ha2 == null) {
                abstractC0849ha2 = AbstractC0943mf.f7102c;
            }
            Intrinsics.checkNotNullExpressionValue(abstractC0849ha2, "JsonPropertyParser.readO… ?: PIVOT_Y_DEFAULT_VALUE");
            return new C0925lf(abstractC0849ha, abstractC0849ha2, JsonExpressionParser.readOptionalExpression(context, data, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0925lf value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "pivot_x", value.f6954a, this.f7103a.Q5());
            JsonPropertyParser.write(context, jSONObject, "pivot_y", value.f6955b, this.f7103a.Q5());
            JsonExpressionParser.writeExpression(context, jSONObject, "rotation", value.f6956c);
            return jSONObject;
        }
    }

    /* renamed from: O1.mf$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7104a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7104a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0961nf deserialize(ParsingContext context, C0961nf c0961nf, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "pivot_x", allowPropertyOverride, c0961nf != null ? c0961nf.f7229a : null, this.f7104a.R5());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…vPivotJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "pivot_y", allowPropertyOverride, c0961nf != null ? c0961nf.f7230b : null, this.f7104a.R5());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…vPivotJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, c0961nf != null ? c0961nf.f7231c : null, ParsingConvertersKt.NUMBER_TO_DOUBLE);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…tation, NUMBER_TO_DOUBLE)");
            return new C0961nf(readOptionalField, readOptionalField2, readOptionalFieldWithExpression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0961nf value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "pivot_x", value.f7229a, this.f7104a.R5());
            JsonFieldParser.writeField(context, jSONObject, "pivot_y", value.f7230b, this.f7104a.R5());
            JsonFieldParser.writeExpressionField(context, jSONObject, "rotation", value.f7231c);
            return jSONObject;
        }
    }

    /* renamed from: O1.mf$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7105a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7105a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0925lf resolve(ParsingContext context, C0961nf template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            AbstractC0849ha abstractC0849ha = (AbstractC0849ha) JsonFieldResolver.resolveOptional(context, template.f7229a, data, "pivot_x", this.f7105a.S5(), this.f7105a.Q5());
            if (abstractC0849ha == null) {
                abstractC0849ha = AbstractC0943mf.f7101b;
            }
            Intrinsics.checkNotNullExpressionValue(abstractC0849ha, "JsonFieldResolver.resolv… ?: PIVOT_X_DEFAULT_VALUE");
            AbstractC0849ha abstractC0849ha2 = (AbstractC0849ha) JsonFieldResolver.resolveOptional(context, template.f7230b, data, "pivot_y", this.f7105a.S5(), this.f7105a.Q5());
            if (abstractC0849ha2 == null) {
                abstractC0849ha2 = AbstractC0943mf.f7102c;
            }
            Intrinsics.checkNotNullExpressionValue(abstractC0849ha2, "JsonFieldResolver.resolv… ?: PIVOT_Y_DEFAULT_VALUE");
            return new C0925lf(abstractC0849ha, abstractC0849ha2, JsonFieldResolver.resolveOptionalExpression(context, template.f7231c, data, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(50.0d);
        f7101b = new AbstractC0849ha.d(new C0974oa(companion.constant(valueOf)));
        f7102c = new AbstractC0849ha.d(new C0974oa(companion.constant(valueOf)));
    }
}
