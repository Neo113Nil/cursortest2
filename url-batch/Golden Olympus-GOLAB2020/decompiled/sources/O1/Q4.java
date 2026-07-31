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

/* loaded from: classes2.dex */
public abstract class Q4 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4390a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f4391b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f4392c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f4393d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f4394e;

    /* renamed from: f, reason: collision with root package name */
    public static final ValueValidator f4395f;

    /* renamed from: g, reason: collision with root package name */
    public static final ValueValidator f4396g;

    /* renamed from: h, reason: collision with root package name */
    public static final ValueValidator f4397h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4398a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4398a = component;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O1.M4 deserialize(com.yandex.div.serialization.ParsingContext r19, org.json.JSONObject r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                java.lang.String r3 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
                java.lang.String r3 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
                O1.M4 r8 = new O1.M4
                com.yandex.div.internal.parser.TypeHelper<java.lang.Long> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_INT
                kotlin.jvm.functions.Function1<java.lang.Number, java.lang.Long> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_INT
                com.yandex.div.internal.parser.ValueValidator r6 = O1.Q4.f4395f
                com.yandex.div.json.expressions.Expression r7 = O1.Q4.f4391b
                java.lang.String r3 = "disappear_duration"
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                r9 = r4
                r10 = r5
                if (r3 != 0) goto L26
                r11 = r7
                goto L27
            L26:
                r11 = r3
            L27:
                O1.Cg r3 = r0.f4398a
                W1.h r3 = r3.P2()
                java.lang.String r4 = "download_callbacks"
                java.lang.Object r3 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r4, r3)
                r12 = r3
                O1.S4 r12 = (O1.S4) r12
                com.yandex.div.internal.parser.TypeHelper<java.lang.Boolean> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_BOOLEAN
                kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_BOOLEAN
                com.yandex.div.json.expressions.Expression r6 = O1.Q4.f4392c
                java.lang.String r3 = "is_enabled"
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6)
                if (r3 != 0) goto L46
                r13 = r6
                goto L47
            L46:
                r13 = r3
            L47:
                java.lang.String r3 = "log_id"
                com.yandex.div.internal.parser.TypeHelper<java.lang.String> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_STRING
                com.yandex.div.json.expressions.Expression r14 = com.yandex.div.internal.parser.JsonExpressionParser.readExpression(r1, r2, r3, r4)
                java.lang.String r3 = "readExpression(context, …_id\", TYPE_HELPER_STRING)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r3)
                com.yandex.div.internal.parser.ValueValidator r6 = O1.Q4.f4396g
                com.yandex.div.json.expressions.Expression r7 = O1.Q4.f4393d
                java.lang.String r3 = "log_limit"
                r4 = r9
                r5 = r10
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L64
                r9 = r7
                goto L65
            L64:
                r9 = r3
            L65:
                java.lang.String r3 = "payload"
                java.lang.Object r3 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r3)
                r10 = r3
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                com.yandex.div.internal.parser.TypeHelper<android.net.Uri> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_URI
                kotlin.jvm.functions.Function1<java.lang.Object, android.net.Uri> r6 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_URI
                java.lang.String r7 = "referer"
                com.yandex.div.json.expressions.Expression r15 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r7, r3, r6)
                java.lang.String r7 = "scope_id"
                java.lang.Object r7 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r7)
                r16 = r7
                java.lang.String r16 = (java.lang.String) r16
                O1.Cg r7 = r0.f4398a
                W1.h r7 = r7.h1()
                java.lang.String r0 = "typed"
                java.lang.Object r0 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r0, r7)
                O1.n2 r0 = (O1.AbstractC0948n2) r0
                java.lang.String r7 = "url"
                com.yandex.div.json.expressions.Expression r17 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r7, r3, r6)
                com.yandex.div.internal.parser.ValueValidator r6 = O1.Q4.f4397h
                com.yandex.div.json.expressions.Expression r7 = O1.Q4.f4394e
                java.lang.String r3 = "visibility_percentage"
                com.yandex.div.json.expressions.Expression r1 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                r5 = r11
                r11 = r15
                if (r1 != 0) goto Laf
                r15 = r7
                r4 = r8
                r6 = r12
                r8 = r14
                r12 = r16
                r14 = r17
                r7 = r13
            Lad:
                r13 = r0
                goto Lb9
            Laf:
                r15 = r1
                r4 = r8
                r6 = r12
                r7 = r13
                r8 = r14
                r12 = r16
                r14 = r17
                goto Lad
            Lb9:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.Q4.b.deserialize(com.yandex.div.serialization.ParsingContext, org.json.JSONObject):O1.M4");
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, M4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(context, jSONObject, "disappear_duration", value.f3831a);
            JsonPropertyParser.write(context, jSONObject, "download_callbacks", value.b(), this.f4398a.P2());
            JsonExpressionParser.writeExpression(context, jSONObject, "is_enabled", value.isEnabled());
            JsonExpressionParser.writeExpression(context, jSONObject, "log_id", value.g());
            JsonExpressionParser.writeExpression(context, jSONObject, "log_limit", value.f());
            JsonPropertyParser.write(context, jSONObject, "payload", value.c());
            Expression e4 = value.e();
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(context, jSONObject, "referer", e4, function1);
            JsonPropertyParser.write(context, jSONObject, "scope_id", value.d());
            JsonPropertyParser.write(context, jSONObject, "typed", value.a(), this.f4398a.h1());
            JsonExpressionParser.writeExpression(context, jSONObject, "url", value.getUrl(), function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility_percentage", value.f3841k);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4399a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4399a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R4 deserialize(ParsingContext context, R4 r4, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = r4 != null ? r4.f4602a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "disappear_duration", typeHelper, allowPropertyOverride, field, function1, Q4.f4395f);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…PPEAR_DURATION_VALIDATOR)");
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "download_callbacks", allowPropertyOverride, r4 != null ? r4.f4603b : null, this.f4399a.Q2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…lbacksJsonTemplateParser)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, r4 != null ? r4.f4604c : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…sEnabled, ANY_TO_BOOLEAN)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, r4 != null ? r4.f4605d : null);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…wOverride, parent?.logId)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "log_limit", typeHelper, allowPropertyOverride, r4 != null ? r4.f4606e : null, function1, Q4.f4396g);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…INT, LOG_LIMIT_VALIDATOR)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "payload", allowPropertyOverride, r4 != null ? r4.f4607f : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…verride, parent?.payload)");
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field field2 = r4 != null ? r4.f4608g : null;
            Function1<Object, Uri> function12 = ParsingConvertersKt.ANY_TO_URI;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "referer", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…ent?.referer, ANY_TO_URI)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "scope_id", allowPropertyOverride, r4 != null ? r4.f4609h : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…verride, parent?.scopeId)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "typed", allowPropertyOverride, r4 != null ? r4.f4610i : null, this.f4399a.i1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…nTypedJsonTemplateParser)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "url", typeHelper2, allowPropertyOverride, r4 != null ? r4.f4611j : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp… parent?.url, ANY_TO_URI)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility_percentage", typeHelper, allowPropertyOverride, r4 != null ? r4.f4612k : null, function1, Q4.f4397h);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…ITY_PERCENTAGE_VALIDATOR)");
            return new R4(readOptionalFieldWithExpression, readOptionalField, readOptionalFieldWithExpression2, readFieldWithExpression, readOptionalFieldWithExpression3, readOptionalField2, readOptionalFieldWithExpression4, readOptionalField3, readOptionalField4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, R4 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(context, jSONObject, "disappear_duration", value.f4602a);
            JsonFieldParser.writeField(context, jSONObject, "download_callbacks", value.f4603b, this.f4399a.Q2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "is_enabled", value.f4604c);
            JsonFieldParser.writeExpressionField(context, jSONObject, "log_id", value.f4605d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "log_limit", value.f4606e);
            JsonFieldParser.writeField(context, jSONObject, "payload", value.f4607f);
            Field field = value.f4608g;
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(context, jSONObject, "referer", field, function1);
            JsonFieldParser.writeField(context, jSONObject, "scope_id", value.f4609h);
            JsonFieldParser.writeField(context, jSONObject, "typed", value.f4610i, this.f4399a.i1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "url", value.f4611j, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility_percentage", value.f4612k);
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f4400a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f4400a = component;
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
        public O1.M4 resolve(com.yandex.div.serialization.ParsingContext r23, O1.R4 r24, org.json.JSONObject r25) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.Q4.d.resolve(com.yandex.div.serialization.ParsingContext, O1.R4, org.json.JSONObject):O1.M4");
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4391b = companion.constant(800L);
        f4392c = companion.constant(Boolean.TRUE);
        f4393d = companion.constant(1L);
        f4394e = companion.constant(0L);
        f4395f = new ValueValidator() { // from class: O1.N4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean d4;
                d4 = Q4.d(((Long) obj).longValue());
                return d4;
            }
        };
        f4396g = new ValueValidator() { // from class: O1.O4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = Q4.e(((Long) obj).longValue());
                return e4;
            }
        };
        f4397h = new ValueValidator() { // from class: O1.P4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = Q4.f(((Long) obj).longValue());
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
        return j4 >= 0 && j4 < 100;
    }
}
