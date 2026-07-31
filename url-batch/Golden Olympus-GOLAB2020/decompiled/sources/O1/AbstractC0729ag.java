package O1;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ag, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0729ag {

    /* renamed from: a, reason: collision with root package name */
    private static final a f5752a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f5753b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f5754c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f5755d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f5756e;

    /* renamed from: f, reason: collision with root package name */
    public static final ValueValidator f5757f;

    /* renamed from: g, reason: collision with root package name */
    public static final ValueValidator f5758g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f5759h;

    /* renamed from: O1.ag$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.ag$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5760a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5760a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Wf deserialize(ParsingContext context, JSONObject data) {
            Expression expression;
            String str;
            Expression expression2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            S4 s4 = (S4) JsonPropertyParser.readOptional(context, data, "download_callbacks", this.f5760a.P2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = AbstractC0729ag.f5753b;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "is_enabled", typeHelper, function1, expression3);
            Expression expression4 = readOptionalExpression == null ? expression3 : readOptionalExpression;
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_id\", TYPE_HELPER_STRING)");
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = AbstractC0729ag.f5757f;
            Expression expression5 = AbstractC0729ag.f5754c;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "log_limit", typeHelper2, function12, valueValidator, expression5);
            Expression expression6 = readOptionalExpression2 == null ? expression5 : readOptionalExpression2;
            JSONObject jSONObject = (JSONObject) JsonPropertyParser.readOptional(context, data, "payload");
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1<Object, Uri> function13 = ParsingConvertersKt.ANY_TO_URI;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "referer", typeHelper3, function13);
            String str2 = (String) JsonPropertyParser.readOptional(context, data, "scope_id");
            AbstractC0948n2 abstractC0948n2 = (AbstractC0948n2) JsonPropertyParser.readOptional(context, data, "typed", this.f5760a.h1());
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "url", typeHelper3, function13);
            ValueValidator valueValidator2 = AbstractC0729ag.f5758g;
            Expression expression7 = AbstractC0729ag.f5755d;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "visibility_duration", typeHelper2, function12, valueValidator2, expression7);
            Expression expression8 = readOptionalExpression5 == null ? expression7 : readOptionalExpression5;
            ValueValidator valueValidator3 = AbstractC0729ag.f5759h;
            Expression expression9 = AbstractC0729ag.f5756e;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "visibility_percentage", typeHelper2, function12, valueValidator3, expression9);
            if (readOptionalExpression6 == null) {
                expression2 = expression9;
                expression = readExpression;
                str = str2;
            } else {
                expression = readExpression;
                str = str2;
                expression2 = readOptionalExpression6;
            }
            return new Wf(s4, expression4, expression, expression6, jSONObject, readOptionalExpression3, str, abstractC0948n2, readOptionalExpression4, expression8, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Wf value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "download_callbacks", value.b(), this.f5760a.P2());
            JsonExpressionParser.writeExpression(context, jSONObject, "is_enabled", value.isEnabled());
            JsonExpressionParser.writeExpression(context, jSONObject, "log_id", value.g());
            JsonExpressionParser.writeExpression(context, jSONObject, "log_limit", value.f());
            JsonPropertyParser.write(context, jSONObject, "payload", value.c());
            Expression e4 = value.e();
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(context, jSONObject, "referer", e4, function1);
            JsonPropertyParser.write(context, jSONObject, "scope_id", value.d());
            JsonPropertyParser.write(context, jSONObject, "typed", value.a(), this.f5760a.h1());
            JsonExpressionParser.writeExpression(context, jSONObject, "url", value.getUrl(), function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility_duration", value.f5186j);
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility_percentage", value.f5187k);
            return jSONObject;
        }
    }

    /* renamed from: O1.ag$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5761a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5761a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0747bg deserialize(ParsingContext context, C0747bg c0747bg, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "download_callbacks", allowPropertyOverride, c0747bg != null ? c0747bg.f5824a : null, this.f5761a.Q2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…lbacksJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c0747bg != null ? c0747bg.f5825b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…sEnabled, ANY_TO_BOOLEAN)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c0747bg != null ? c0747bg.f5826c : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…wOverride, parent?.logId)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c0747bg != null ? c0747bg.f5827d : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "log_limit", typeHelper, allowPropertyOverride, field, function1, AbstractC0729ag.f5757f);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…INT, LOG_LIMIT_VALIDATOR)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "payload", allowPropertyOverride, c0747bg != null ? c0747bg.f5828e : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…verride, parent?.payload)");
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field field2 = c0747bg != null ? c0747bg.f5829f : null;
            Function1<Object, Uri> function12 = ParsingConvertersKt.ANY_TO_URI;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "referer", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…ent?.referer, ANY_TO_URI)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "scope_id", allowPropertyOverride, c0747bg != null ? c0747bg.f5830g : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…verride, parent?.scopeId)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "typed", allowPropertyOverride, c0747bg != null ? c0747bg.f5831h : null, this.f5761a.i1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…nTypedJsonTemplateParser)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "url", typeHelper2, allowPropertyOverride, c0747bg != null ? c0747bg.f5832i : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp… parent?.url, ANY_TO_URI)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility_duration", typeHelper, allowPropertyOverride, c0747bg != null ? c0747bg.f5833j : null, function1, AbstractC0729ag.f5758g);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…ILITY_DURATION_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility_percentage", typeHelper, allowPropertyOverride, c0747bg != null ? c0747bg.f5834k : null, function1, AbstractC0729ag.f5759h);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…ITY_PERCENTAGE_VALIDATOR)");
            return new C0747bg(readOptionalField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalFieldWithExpression2, readOptionalField2, readOptionalFieldWithExpression3, readOptionalField3, readOptionalField4, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0747bg value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "download_callbacks", value.f5824a, this.f5761a.Q2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "is_enabled", value.f5825b);
            JsonFieldParser.writeExpressionField(context, jSONObject, "log_id", value.f5826c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "log_limit", value.f5827d);
            JsonFieldParser.writeField(context, jSONObject, "payload", value.f5828e);
            Field field = value.f5829f;
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(context, jSONObject, "referer", field, function1);
            JsonFieldParser.writeField(context, jSONObject, "scope_id", value.f5830g);
            JsonFieldParser.writeField(context, jSONObject, "typed", value.f5831h, this.f5761a.i1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "url", value.f5832i, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility_duration", value.f5833j);
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility_percentage", value.f5834k);
            return jSONObject;
        }
    }

    /* renamed from: O1.ag$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5762a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5762a = component;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O1.Wf resolve(com.yandex.div.serialization.ParsingContext r22, O1.C0747bg r23, org.json.JSONObject r24) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.AbstractC0729ag.d.resolve(com.yandex.div.serialization.ParsingContext, O1.bg, org.json.JSONObject):O1.Wf");
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f5753b = companion.constant(Boolean.TRUE);
        f5754c = companion.constant(1L);
        f5755d = companion.constant(800L);
        f5756e = companion.constant(50L);
        f5757f = new ValueValidator() { // from class: O1.Xf
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = AbstractC0729ag.d(((Long) obj).longValue());
                return d4;
            }
        };
        f5758g = new ValueValidator() { // from class: O1.Yf
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = AbstractC0729ag.e(((Long) obj).longValue());
                return e4;
            }
        };
        f5759h = new ValueValidator() { // from class: O1.Zf
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = AbstractC0729ag.f(((Long) obj).longValue());
                return f4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j4) {
        return j4 > 0 && j4 <= 100;
    }
}
