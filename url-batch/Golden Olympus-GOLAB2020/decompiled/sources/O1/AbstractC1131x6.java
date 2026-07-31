package O1;

import O1.C0970o6;
import O1.Yb;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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

/* renamed from: O1.x6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1131x6 {

    /* renamed from: A, reason: collision with root package name */
    public static final ListValidator f8451A;

    /* renamed from: a, reason: collision with root package name */
    private static final h f8452a = new h(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f8453b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f8454c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f8455d;

    /* renamed from: e, reason: collision with root package name */
    public static final Yb.e f8456e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f8457f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f8458g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f8459h;

    /* renamed from: i, reason: collision with root package name */
    public static final Expression f8460i;

    /* renamed from: j, reason: collision with root package name */
    public static final Expression f8461j;

    /* renamed from: k, reason: collision with root package name */
    public static final Expression f8462k;

    /* renamed from: l, reason: collision with root package name */
    public static final Yb.d f8463l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeHelper f8464m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeHelper f8465n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeHelper f8466o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeHelper f8467p;

    /* renamed from: q, reason: collision with root package name */
    public static final TypeHelper f8468q;

    /* renamed from: r, reason: collision with root package name */
    public static final TypeHelper f8469r;

    /* renamed from: s, reason: collision with root package name */
    public static final TypeHelper f8470s;

    /* renamed from: t, reason: collision with root package name */
    public static final ValueValidator f8471t;

    /* renamed from: u, reason: collision with root package name */
    public static final ValueValidator f8472u;

    /* renamed from: v, reason: collision with root package name */
    public static final ValueValidator f8473v;

    /* renamed from: w, reason: collision with root package name */
    public static final ValueValidator f8474w;

    /* renamed from: x, reason: collision with root package name */
    public static final ValueValidator f8475x;

    /* renamed from: y, reason: collision with root package name */
    public static final ValueValidator f8476y;

    /* renamed from: z, reason: collision with root package name */
    public static final ValueValidator f8477z;

    /* renamed from: O1.x6$a */
    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8478i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    /* renamed from: O1.x6$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8479i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    /* renamed from: O1.x6$c */
    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final c f8480i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0970o6.c);
        }
    }

    /* renamed from: O1.x6$d */
    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f8481i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0970o6.d);
        }
    }

    /* renamed from: O1.x6$e */
    static final class e extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final e f8482i = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0970o6.f);
        }
    }

    /* renamed from: O1.x6$f */
    static final class f extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final f f8483i = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C0970o6.e);
        }
    }

    /* renamed from: O1.x6$g */
    static final class g extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final g f8484i = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    /* renamed from: O1.x6$h */
    private static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    /* renamed from: O1.x6$i */
    public static final class i implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8485a;

        public i(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8485a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0970o6 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f8485a.H());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", AbstractC1131x6.f8464m, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", AbstractC1131x6.f8465n, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC1131x6.f8471t;
            Expression expression = AbstractC1131x6.f8453b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f8485a.q1());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f8485a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f8485a.I1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "column_count", typeHelper2, function12, AbstractC1131x6.f8472u);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper2, function12, AbstractC1131x6.f8473v);
            TypeHelper typeHelper3 = AbstractC1131x6.f8466o;
            Function1 function13 = C0970o6.c.f7320e;
            Expression expression3 = AbstractC1131x6.f8454c;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "cross_content_alignment", typeHelper3, function13, expression3);
            Expression expression4 = readOptionalExpression6 == null ? expression3 : readOptionalExpression6;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "cross_spacing", typeHelper2, function12, AbstractC1131x6.f8474w);
            ValueValidator valueValidator2 = AbstractC1131x6.f8475x;
            Expression expression5 = AbstractC1131x6.f8455d;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "default_item", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = readOptionalExpression8 == null ? expression5 : readOptionalExpression8;
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f8485a.M2());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f8485a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f8485a.w3());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f8485a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f8485a.V6());
            if (yb == null) {
                yb = AbstractC1131x6.f8456e;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            H3 h32 = (H3) JsonPropertyParser.readOptional(context, data, "item_builder", this.f8485a.a2());
            ValueValidator valueValidator3 = AbstractC1131x6.f8476y;
            Expression expression7 = AbstractC1131x6.f8457f;
            Yb yb2 = yb;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "item_spacing", typeHelper2, function12, valueValidator3, expression7);
            if (readOptionalExpression9 != null) {
                expression7 = readOptionalExpression9;
            }
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, FirebaseAnalytics.Param.ITEMS, this.f8485a.J4());
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f8485a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f8485a.V2());
            TypeHelper typeHelper4 = AbstractC1131x6.f8467p;
            Function1 function14 = C0970o6.d.f7330e;
            Expression expression8 = AbstractC1131x6.f8458g;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, b9.h.f15492n, typeHelper4, function14, expression8);
            Expression expression9 = readOptionalExpression10 == null ? expression8 : readOptionalExpression10;
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f8485a.V2());
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function15 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression10 = AbstractC1131x6.f8459h;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "restrict_parent_scroll", typeHelper5, function15, expression10);
            Expression expression11 = readOptionalExpression11 == null ? expression10 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper2, function12, AbstractC1131x6.f8477z);
            TypeHelper typeHelper6 = AbstractC1131x6.f8468q;
            Function1 function16 = C0970o6.e.f7339e;
            Expression expression12 = AbstractC1131x6.f8460i;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(context, data, "scroll_mode", typeHelper6, function16, expression12);
            Expression expression13 = readOptionalExpression14 == null ? expression12 : readOptionalExpression14;
            TypeHelper typeHelper7 = AbstractC1131x6.f8469r;
            Function1 function17 = C0970o6.f.f7348e;
            Expression expression14 = AbstractC1131x6.f8461j;
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(context, data, "scrollbar", typeHelper7, function17, expression14);
            Expression expression15 = readOptionalExpression15 == null ? expression14 : readOptionalExpression15;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f8485a.u0());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f8485a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f8485a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f8485a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f8485a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f8485a.w1());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC1131x6.f8451A);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f8485a.Y8());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f8485a.e9());
            TypeHelper typeHelper8 = AbstractC1131x6.f8470s;
            Function1 function18 = Vf.f5043e;
            Expression expression16 = AbstractC1131x6.f8462k;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper8, function18, expression16);
            if (readOptionalExpression16 != null) {
                expression16 = readOptionalExpression16;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f8485a.q9());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f8485a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f8485a.V6());
            if (yb3 == null) {
                yb3 = AbstractC1131x6.f8463l;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0970o6(c0839h0, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList, readOptionalList2, c0860i3, readOptionalExpression4, readOptionalExpression5, expression4, readOptionalExpression7, expression6, readOptionalList3, readOptionalList4, w5, readOptionalList5, yb2, str, h32, expression7, readOptionalList6, c1079u8, c0754c5, expression9, c0754c52, expression11, readOptionalExpression12, readOptionalExpression13, expression13, expression15, readOptionalList7, readOptionalList8, c0925lf, abstractC1092v3, o22, o23, readOptionalList9, readOptionalList10, readOptionalList11, expression16, wf, readOptionalList12, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0970o6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f8485a.H());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f8485a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f8485a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f8485a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_count", value.f7298h);
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonExpressionParser.writeExpression(context, jSONObject, "cross_content_alignment", value.f7300j, C0970o6.c.f7319d);
            JsonExpressionParser.writeExpression(context, jSONObject, "cross_spacing", value.f7301k);
            JsonExpressionParser.writeExpression(context, jSONObject, "default_item", value.f7302l);
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f8485a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f8485a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f8485a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f8485a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f8485a.V6());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonPropertyParser.write(context, jSONObject, "item_builder", value.f7309s, this.f8485a.a2());
            JsonExpressionParser.writeExpression(context, jSONObject, "item_spacing", value.f7310t);
            JsonPropertyParser.writeList(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f7311u, this.f8485a.J4());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f8485a.M4());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f8485a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15492n, value.f7314x, C0970o6.d.f7329d);
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f8485a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "restrict_parent_scroll", value.f7316z);
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonExpressionParser.writeExpression(context, jSONObject, "scroll_mode", value.f7274C, C0970o6.e.f7338d);
            JsonExpressionParser.writeExpression(context, jSONObject, "scrollbar", value.f7275D, C0970o6.f.f7347d);
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f8485a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f8485a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f8485a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f8485a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f8485a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f8485a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "gallery");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f8485a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f8485a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f8485a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f8485a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f8485a.V6());
            return jSONObject;
        }
    }

    /* renamed from: O1.x6$j */
    public static final class j implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8486a;

        public j(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8486a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1149y6 deserialize(ParsingContext context, C1149y6 c1149y6, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, c1149y6 != null ? c1149y6.f8606a : null, this.f8486a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", AbstractC1131x6.f8464m, allowPropertyOverride, c1149y6 != null ? c1149y6.f8607b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", AbstractC1131x6.f8465n, allowPropertyOverride, c1149y6 != null ? c1149y6.f8608c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, c1149y6 != null ? c1149y6.f8609d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, AbstractC1131x6.f8471t);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, c1149y6 != null ? c1149y6.f8610e : null, this.f8486a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, c1149y6 != null ? c1149y6.f8611f : null, this.f8486a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, c1149y6 != null ? c1149y6.f8612g : null, this.f8486a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = c1149y6 != null ? c1149y6.f8613h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_count", typeHelper, allowPropertyOverride, field, function1, AbstractC1131x6.f8472u);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…, COLUMN_COUNT_VALIDATOR)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper, allowPropertyOverride, c1149y6 != null ? c1149y6.f8614i : null, function1, AbstractC1131x6.f8473v);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "cross_content_alignment", AbstractC1131x6.f8466o, allowPropertyOverride, c1149y6 != null ? c1149y6.f8615j : null, C0970o6.c.f7320e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…entAlignment.FROM_STRING)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "cross_spacing", typeHelper, allowPropertyOverride, c1149y6 != null ? c1149y6.f8616k : null, function1, AbstractC1131x6.f8474w);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp… CROSS_SPACING_VALIDATOR)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "default_item", typeHelper, allowPropertyOverride, c1149y6 != null ? c1149y6.f8617l : null, function1, AbstractC1131x6.f8475x);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…, DEFAULT_ITEM_VALIDATOR)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, c1149y6 != null ? c1149y6.f8618m : null, this.f8486a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, c1149y6 != null ? c1149y6.f8619n : null, this.f8486a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, c1149y6 != null ? c1149y6.f8620o : null, this.f8486a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, c1149y6 != null ? c1149y6.f8621p : null, this.f8486a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, c1149y6 != null ? c1149y6.f8622q : null, this.f8486a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, c1149y6 != null ? c1149y6.f8623r : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "item_builder", allowPropertyOverride, c1149y6 != null ? c1149y6.f8624s : null, this.f8486a.b2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…uilderJsonTemplateParser)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "item_spacing", typeHelper, allowPropertyOverride, c1149y6 != null ? c1149y6.f8625t : null, function1, AbstractC1131x6.f8476y);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…, ITEM_SPACING_VALIDATOR)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, c1149y6 != null ? c1149y6.f8626u : null, this.f8486a.K4());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…nt.divJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, c1149y6 != null ? c1149y6.f8627v : null, this.f8486a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, c1149y6 != null ? c1149y6.f8628w : null, this.f8486a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.h.f15492n, AbstractC1131x6.f8467p, allowPropertyOverride, c1149y6 != null ? c1149y6.f8629x : null, C0970o6.d.f7330e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp….Orientation.FROM_STRING)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, c1149y6 != null ? c1149y6.f8630y : null, this.f8486a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "restrict_parent_scroll", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c1149y6 != null ? c1149y6.f8631z : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…ntScroll, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c1149y6 != null ? c1149y6.f8589A : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper, allowPropertyOverride, c1149y6 != null ? c1149y6.f8590B : null, function1, AbstractC1131x6.f8477z);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "scroll_mode", AbstractC1131x6.f8468q, allowPropertyOverride, c1149y6 != null ? c1149y6.f8591C : null, C0970o6.e.f7339e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression14, "readOptionalFieldWithExp…y.ScrollMode.FROM_STRING)");
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "scrollbar", AbstractC1131x6.f8469r, allowPropertyOverride, c1149y6 != null ? c1149y6.f8592D : null, C0970o6.f.f7348e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression15, "readOptionalFieldWithExp…ry.Scrollbar.FROM_STRING)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, c1149y6 != null ? c1149y6.f8593E : null, this.f8486a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, c1149y6 != null ? c1149y6.f8594F : null, this.f8486a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, c1149y6 != null ? c1149y6.f8595G : null, this.f8486a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, c1149y6 != null ? c1149y6.f8596H : null, this.f8486a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, c1149y6 != null ? c1149y6.f8597I : null, this.f8486a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, c1149y6 != null ? c1149y6.f8598J : null, this.f8486a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field2 = c1149y6 != null ? c1149y6.f8599K : null;
            Function1 function12 = EnumC0997pf.f7541e;
            ListValidator listValidator = AbstractC1131x6.f8451A;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field2, function12, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, c1149y6 != null ? c1149y6.f8600L : null, this.f8486a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, c1149y6 != null ? c1149y6.f8601M : null, this.f8486a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", AbstractC1131x6.f8470s, allowPropertyOverride, c1149y6 != null ? c1149y6.f8602N : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression16, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, c1149y6 != null ? c1149y6.f8603O : null, this.f8486a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, c1149y6 != null ? c1149y6.f8604P : null, this.f8486a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, c1149y6 != null ? c1149y6.f8605Q : null, this.f8486a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new C1149y6(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalField4, readOptionalField5, readOptionalField6, readOptionalFieldWithExpression9, readOptionalListField6, readOptionalField7, readOptionalField8, readOptionalFieldWithExpression10, readOptionalField9, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalFieldWithExpression15, readOptionalListField7, readOptionalListField8, readOptionalField10, readOptionalField11, readOptionalField12, readOptionalField13, readOptionalListField9, readOptionalListField10, readOptionalListField11, readOptionalFieldWithExpression16, readOptionalField14, readOptionalListField12, readOptionalField15);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1149y6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f8606a, this.f8486a.I());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f8607b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f8608c, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f8609d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f8610e, this.f8486a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f8611f, this.f8486a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f8612g, this.f8486a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_count", value.f8613h);
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f8614i);
            JsonFieldParser.writeExpressionField(context, jSONObject, "cross_content_alignment", value.f8615j, C0970o6.c.f7319d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "cross_spacing", value.f8616k);
            JsonFieldParser.writeExpressionField(context, jSONObject, "default_item", value.f8617l);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f8618m, this.f8486a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f8619n, this.f8486a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f8620o, this.f8486a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f8621p, this.f8486a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f8622q, this.f8486a.W6());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f8623r);
            JsonFieldParser.writeField(context, jSONObject, "item_builder", value.f8624s, this.f8486a.b2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "item_spacing", value.f8625t);
            JsonFieldParser.writeListField(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f8626u, this.f8486a.K4());
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f8627v, this.f8486a.N4());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f8628w, this.f8486a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15492n, value.f8629x, C0970o6.d.f7329d);
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f8630y, this.f8486a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "restrict_parent_scroll", value.f8631z);
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f8589A);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f8590B);
            JsonFieldParser.writeExpressionField(context, jSONObject, "scroll_mode", value.f8591C, C0970o6.e.f7338d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "scrollbar", value.f8592D, C0970o6.f.f7347d);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f8593E, this.f8486a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f8594F, this.f8486a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f8595G, this.f8486a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f8596H, this.f8486a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f8597I, this.f8486a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f8598J, this.f8486a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f8599K, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "gallery");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f8600L, this.f8486a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f8601M, this.f8486a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f8602N, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f8603O, this.f8486a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f8604P, this.f8486a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f8605Q, this.f8486a.W6());
            return jSONObject;
        }
    }

    /* renamed from: O1.x6$k */
    public static final class k implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f8487a;

        public k(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f8487a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0970o6 resolve(ParsingContext context, C1149y6 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f8606a, data, "accessibility", this.f8487a.J(), this.f8487a.H());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f8607b, data, "alignment_horizontal", AbstractC1131x6.f8464m, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f8608c, data, "alignment_vertical", AbstractC1131x6.f8465n, EnumC1109w2.f8300e);
            Field field = template.f8609d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = AbstractC1131x6.f8471t;
            Expression expression = AbstractC1131x6.f8453b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f8610e, data, "animators", this.f8487a.s1(), this.f8487a.q1());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f8611f, data, io.appmetrica.analytics.impl.L2.f37912g, this.f8487a.E1(), this.f8487a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f8612g, data, "border", this.f8487a.K1(), this.f8487a.I1());
            Field field2 = template.f8613h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "column_count", typeHelper2, function12, AbstractC1131x6.f8472u);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, template.f8614i, data, "column_span", typeHelper2, function12, AbstractC1131x6.f8473v);
            Field field3 = template.f8615j;
            TypeHelper typeHelper3 = AbstractC1131x6.f8466o;
            Function1 function13 = C0970o6.c.f7320e;
            Expression expression3 = AbstractC1131x6.f8454c;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "cross_content_alignment", typeHelper3, function13, expression3);
            Expression expression4 = resolveOptionalExpression6 == null ? expression3 : resolveOptionalExpression6;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, template.f8616k, data, "cross_spacing", typeHelper2, function12, AbstractC1131x6.f8474w);
            Field field4 = template.f8617l;
            ValueValidator valueValidator2 = AbstractC1131x6.f8475x;
            Expression expression5 = AbstractC1131x6.f8455d;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "default_item", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = resolveOptionalExpression8 == null ? expression5 : resolveOptionalExpression8;
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f8618m, data, "disappear_actions", this.f8487a.O2(), this.f8487a.M2());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f8619n, data, "extensions", this.f8487a.a3(), this.f8487a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f8620o, data, "focus", this.f8487a.y3(), this.f8487a.w3());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f8621p, data, "functions", this.f8487a.H3(), this.f8487a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f8622q, data, "height", this.f8487a.X6(), this.f8487a.V6());
            if (yb == null) {
                yb = AbstractC1131x6.f8456e;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f8623r, data, "id");
            H3 h32 = (H3) JsonFieldResolver.resolveOptional(context, template.f8624s, data, "item_builder", this.f8487a.c2(), this.f8487a.a2());
            Field field5 = template.f8625t;
            ValueValidator valueValidator3 = AbstractC1131x6.f8476y;
            Expression expression7 = AbstractC1131x6.f8457f;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "item_spacing", typeHelper2, function12, valueValidator3, expression7);
            if (resolveOptionalExpression9 != null) {
                expression7 = resolveOptionalExpression9;
            }
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f8626u, data, FirebaseAnalytics.Param.ITEMS, this.f8487a.L4(), this.f8487a.J4());
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f8627v, data, "layout_provider", this.f8487a.O4(), this.f8487a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f8628w, data, "margins", this.f8487a.X2(), this.f8487a.V2());
            Field field6 = template.f8629x;
            TypeHelper typeHelper4 = AbstractC1131x6.f8467p;
            Function1 function14 = C0970o6.d.f7330e;
            Expression expression8 = AbstractC1131x6.f8458g;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, b9.h.f15492n, typeHelper4, function14, expression8);
            Expression expression9 = resolveOptionalExpression10 == null ? expression8 : resolveOptionalExpression10;
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f8630y, data, "paddings", this.f8487a.X2(), this.f8487a.V2());
            Field field7 = template.f8631z;
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function15 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression10 = AbstractC1131x6.f8459h;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "restrict_parent_scroll", typeHelper5, function15, expression10);
            Expression expression11 = resolveOptionalExpression11 == null ? expression10 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, template.f8589A, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, template.f8590B, data, "row_span", typeHelper2, function12, AbstractC1131x6.f8477z);
            Field field8 = template.f8591C;
            TypeHelper typeHelper6 = AbstractC1131x6.f8468q;
            Function1 function16 = C0970o6.e.f7339e;
            Expression expression12 = AbstractC1131x6.f8460i;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "scroll_mode", typeHelper6, function16, expression12);
            Expression expression13 = resolveOptionalExpression14 == null ? expression12 : resolveOptionalExpression14;
            Field field9 = template.f8592D;
            TypeHelper typeHelper7 = AbstractC1131x6.f8469r;
            Function1 function17 = C0970o6.f.f7348e;
            Expression expression14 = AbstractC1131x6.f8461j;
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(context, field9, data, "scrollbar", typeHelper7, function17, expression14);
            Expression expression15 = resolveOptionalExpression15 == null ? expression14 : resolveOptionalExpression15;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f8593E, data, "selected_actions", this.f8487a.w0(), this.f8487a.u0());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f8594F, data, "tooltips", this.f8487a.L8(), this.f8487a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f8595G, data, "transform", this.f8487a.X8(), this.f8487a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f8596H, data, "transition_change", this.f8487a.T1(), this.f8487a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f8597I, data, "transition_in", this.f8487a.y1(), this.f8487a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f8598J, data, "transition_out", this.f8487a.y1(), this.f8487a.w1());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f8599K, data, "transition_triggers", EnumC0997pf.f7541e, AbstractC1131x6.f8451A);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f8600L, data, "variable_triggers", this.f8487a.a9(), this.f8487a.Y8());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f8601M, data, "variables", this.f8487a.g9(), this.f8487a.e9());
            Field field10 = template.f8602N;
            TypeHelper typeHelper8 = AbstractC1131x6.f8470s;
            Function1 function18 = Vf.f5043e;
            Expression expression16 = AbstractC1131x6.f8462k;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(context, field10, data, "visibility", typeHelper8, function18, expression16);
            if (resolveOptionalExpression16 != null) {
                expression16 = resolveOptionalExpression16;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f8603O, data, "visibility_action", this.f8487a.s9(), this.f8487a.q9());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f8604P, data, "visibility_actions", this.f8487a.s9(), this.f8487a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f8605Q, data, "width", this.f8487a.X6(), this.f8487a.V6());
            if (yb3 == null) {
                yb3 = AbstractC1131x6.f8463l;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C0970o6(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, resolveOptionalList2, c0860i3, resolveOptionalExpression4, resolveOptionalExpression5, expression4, resolveOptionalExpression7, expression6, resolveOptionalList3, resolveOptionalList4, w5, resolveOptionalList5, yb2, str, h32, expression7, resolveOptionalList6, c1079u8, c0754c5, expression9, c0754c52, expression11, resolveOptionalExpression12, resolveOptionalExpression13, expression13, expression15, resolveOptionalList7, resolveOptionalList8, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression16, wf, resolveOptionalList12, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f8453b = companion.constant(Double.valueOf(1.0d));
        f8454c = companion.constant(C0970o6.c.START);
        f8455d = companion.constant(0L);
        f8456e = new Yb.e(new C0765cg(null, null, null, 7, null));
        f8457f = companion.constant(8L);
        f8458g = companion.constant(C0970o6.d.HORIZONTAL);
        f8459h = companion.constant(Boolean.FALSE);
        f8460i = companion.constant(C0970o6.e.DEFAULT);
        f8461j = companion.constant(C0970o6.f.NONE);
        f8462k = companion.constant(Vf.VISIBLE);
        f8463l = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f8464m = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f8478i);
        f8465n = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f8479i);
        f8466o = companion2.from(AbstractC3219i.G(C0970o6.c.values()), c.f8480i);
        f8467p = companion2.from(AbstractC3219i.G(C0970o6.d.values()), d.f8481i);
        f8468q = companion2.from(AbstractC3219i.G(C0970o6.e.values()), f.f8483i);
        f8469r = companion2.from(AbstractC3219i.G(C0970o6.f.values()), e.f8482i);
        f8470s = companion2.from(AbstractC3219i.G(Vf.values()), g.f8484i);
        f8471t = new ValueValidator() { // from class: O1.p6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean i4;
                i4 = AbstractC1131x6.i(((Double) obj).doubleValue());
                return i4;
            }
        };
        f8472u = new ValueValidator() { // from class: O1.q6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean j4;
                j4 = AbstractC1131x6.j(((Long) obj).longValue());
                return j4;
            }
        };
        f8473v = new ValueValidator() { // from class: O1.r6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean k4;
                k4 = AbstractC1131x6.k(((Long) obj).longValue());
                return k4;
            }
        };
        f8474w = new ValueValidator() { // from class: O1.s6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean l4;
                l4 = AbstractC1131x6.l(((Long) obj).longValue());
                return l4;
            }
        };
        f8475x = new ValueValidator() { // from class: O1.t6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean m4;
                m4 = AbstractC1131x6.m(((Long) obj).longValue());
                return m4;
            }
        };
        f8476y = new ValueValidator() { // from class: O1.u6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean n4;
                n4 = AbstractC1131x6.n(((Long) obj).longValue());
                return n4;
            }
        };
        f8477z = new ValueValidator() { // from class: O1.v6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean o4;
                o4 = AbstractC1131x6.o(((Long) obj).longValue());
                return o4;
            }
        };
        f8451A = new ListValidator() { // from class: O1.w6
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean p4;
                p4 = AbstractC1131x6.p(list);
                return p4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(long j4) {
        return j4 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
