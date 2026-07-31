package O1;

import O1.E9;
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

/* loaded from: classes2.dex */
public abstract class K9 {

    /* renamed from: a, reason: collision with root package name */
    private static final g f3397a = new g(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f3398b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f3399c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f3400d;

    /* renamed from: e, reason: collision with root package name */
    public static final Yb.e f3401e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f3402f;

    /* renamed from: g, reason: collision with root package name */
    public static final S5 f3403g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f3404h;

    /* renamed from: i, reason: collision with root package name */
    public static final Expression f3405i;

    /* renamed from: j, reason: collision with root package name */
    public static final Expression f3406j;

    /* renamed from: k, reason: collision with root package name */
    public static final Expression f3407k;

    /* renamed from: l, reason: collision with root package name */
    public static final Yb.d f3408l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeHelper f3409m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeHelper f3410n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeHelper f3411o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeHelper f3412p;

    /* renamed from: q, reason: collision with root package name */
    public static final TypeHelper f3413q;

    /* renamed from: r, reason: collision with root package name */
    public static final TypeHelper f3414r;

    /* renamed from: s, reason: collision with root package name */
    public static final ValueValidator f3415s;

    /* renamed from: t, reason: collision with root package name */
    public static final ValueValidator f3416t;

    /* renamed from: u, reason: collision with root package name */
    public static final ValueValidator f3417u;

    /* renamed from: v, reason: collision with root package name */
    public static final ValueValidator f3418v;

    /* renamed from: w, reason: collision with root package name */
    public static final ListValidator f3419w;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3420i = new a();

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
        public static final b f3421i = new b();

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
        public static final c f3422i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof E9.c);
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f3423i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof E9.d);
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final e f3424i = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof E9.c);
        }
    }

    static final class f extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final f f3425i = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    private static final class g {
        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    public static final class h implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3426a;

        public h(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3426a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public E9 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f3426a.H());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", K9.f3409m, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", K9.f3410n, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = K9.f3415s;
            Expression expression = K9.f3398b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f3426a.q1());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f3426a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f3426a.I1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper2, function12, K9.f3416t);
            TypeHelper typeHelper3 = K9.f3411o;
            Function1 function13 = E9.c.f2604e;
            Expression expression3 = K9.f3399c;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "cross_axis_alignment", typeHelper3, function13, expression3);
            Expression expression4 = readOptionalExpression5 == null ? expression3 : readOptionalExpression5;
            ValueValidator valueValidator2 = K9.f3417u;
            Expression expression5 = K9.f3400d;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "default_item", typeHelper2, function12, valueValidator2, expression5);
            if (readOptionalExpression6 != null) {
                expression5 = readOptionalExpression6;
            }
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f3426a.M2());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f3426a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f3426a.w3());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f3426a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f3426a.V6());
            if (yb == null) {
                yb = K9.f3401e;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression6 = K9.f3402f;
            Yb yb2 = yb;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "infinite_scroll", typeHelper4, function14, expression6);
            Expression expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            H3 h32 = (H3) JsonPropertyParser.readOptional(context, data, "item_builder", this.f3426a.a2());
            S5 s5 = (S5) JsonPropertyParser.readOptional(context, data, "item_spacing", this.f3426a.t3());
            if (s5 == null) {
                s5 = K9.f3403g;
            }
            Intrinsics.checkNotNullExpressionValue(s5, "JsonPropertyParser.readO…TEM_SPACING_DEFAULT_VALUE");
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, FirebaseAnalytics.Param.ITEMS, this.f3426a.J4());
            Object read = JsonPropertyParser.read(context, data, "layout_mode", this.f3426a.z5());
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"lay…youtModeJsonEntityParser)");
            L9 l9 = (L9) read;
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f3426a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f3426a.V2());
            TypeHelper typeHelper5 = K9.f3412p;
            Function1 function15 = E9.d.f2614e;
            Expression expression8 = K9.f3404h;
            S5 s52 = s5;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, b9.h.f15492n, typeHelper5, function15, expression8);
            Expression expression9 = readOptionalExpression8 == null ? expression8 : readOptionalExpression8;
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f3426a.V2());
            AbstractC0919l9 abstractC0919l9 = (AbstractC0919l9) JsonPropertyParser.readOptional(context, data, "page_transformation", this.f3426a.n5());
            Expression expression10 = K9.f3405i;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "restrict_parent_scroll", typeHelper4, function14, expression10);
            Expression expression11 = readOptionalExpression9 == null ? expression10 : readOptionalExpression9;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper2, function12, K9.f3418v);
            TypeHelper typeHelper6 = K9.f3413q;
            Expression expression12 = K9.f3406j;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "scroll_axis_alignment", typeHelper6, function13, expression12);
            Expression expression13 = readOptionalExpression12 == null ? expression12 : readOptionalExpression12;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f3426a.u0());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f3426a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f3426a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f3426a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f3426a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f3426a.w1());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, K9.f3419w);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f3426a.Y8());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f3426a.e9());
            TypeHelper typeHelper7 = K9.f3414r;
            Function1 function16 = Vf.f5043e;
            Expression expression14 = K9.f3407k;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper7, function16, expression14);
            if (readOptionalExpression13 != null) {
                expression14 = readOptionalExpression13;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f3426a.q9());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f3426a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f3426a.V6());
            if (yb3 == null) {
                yb3 = K9.f3408l;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new E9(c0839h0, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList, readOptionalList2, c0860i3, readOptionalExpression4, expression4, expression5, readOptionalList3, readOptionalList4, w5, readOptionalList5, yb2, str, expression7, h32, s52, readOptionalList6, l9, c1079u8, c0754c5, expression9, c0754c52, abstractC0919l9, expression11, readOptionalExpression10, readOptionalExpression11, expression13, readOptionalList7, readOptionalList8, c0925lf, abstractC1092v3, o22, o23, readOptionalList9, readOptionalList10, readOptionalList11, expression14, wf, readOptionalList12, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, E9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f3426a.H());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f3426a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f3426a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f3426a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            Expression expression = value.f2583i;
            Function1 function1 = E9.c.f2603d;
            JsonExpressionParser.writeExpression(context, jSONObject, "cross_axis_alignment", expression, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "default_item", value.f2584j);
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f3426a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f3426a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f3426a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f3426a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f3426a.V6());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonExpressionParser.writeExpression(context, jSONObject, "infinite_scroll", value.f2591q);
            JsonPropertyParser.write(context, jSONObject, "item_builder", value.f2592r, this.f3426a.a2());
            JsonPropertyParser.write(context, jSONObject, "item_spacing", value.f2593s, this.f3426a.t3());
            JsonPropertyParser.writeList(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f2594t, this.f3426a.J4());
            JsonPropertyParser.write(context, jSONObject, "layout_mode", value.f2595u, this.f3426a.z5());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f3426a.M4());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f3426a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15492n, value.f2598x, E9.d.f2613d);
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f3426a.V2());
            JsonPropertyParser.write(context, jSONObject, "page_transformation", value.f2600z, this.f3426a.n5());
            JsonExpressionParser.writeExpression(context, jSONObject, "restrict_parent_scroll", value.f2556A);
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonExpressionParser.writeExpression(context, jSONObject, "scroll_axis_alignment", value.f2559D, function1);
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f3426a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f3426a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f3426a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f3426a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f3426a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f3426a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "pager");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f3426a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f3426a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f3426a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f3426a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f3426a.V6());
            return jSONObject;
        }
    }

    public static final class i implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3427a;

        public i(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3427a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Q9 deserialize(ParsingContext context, Q9 q9, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, q9 != null ? q9.f4442a : null, this.f3427a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", K9.f3409m, allowPropertyOverride, q9 != null ? q9.f4443b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", K9.f3410n, allowPropertyOverride, q9 != null ? q9.f4444c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, q9 != null ? q9.f4445d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, K9.f3415s);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, q9 != null ? q9.f4446e : null, this.f3427a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, q9 != null ? q9.f4447f : null, this.f3427a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, q9 != null ? q9.f4448g : null, this.f3427a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = q9 != null ? q9.f4449h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper, allowPropertyOverride, field, function1, K9.f3416t);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            TypeHelper typeHelper2 = K9.f3411o;
            Field field2 = q9 != null ? q9.f4450i : null;
            Function1 function12 = E9.c.f2604e;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "cross_axis_alignment", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…temAlignment.FROM_STRING)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "default_item", typeHelper, allowPropertyOverride, q9 != null ? q9.f4451j : null, function1, K9.f3417u);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…, DEFAULT_ITEM_VALIDATOR)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, q9 != null ? q9.f4452k : null, this.f3427a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, q9 != null ? q9.f4453l : null, this.f3427a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, q9 != null ? q9.f4454m : null, this.f3427a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, q9 != null ? q9.f4455n : null, this.f3427a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, q9 != null ? q9.f4456o : null, this.f3427a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, q9 != null ? q9.f4457p : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…llowOverride, parent?.id)");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field3 = q9 != null ? q9.f4458q : null;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "infinite_scroll", typeHelper3, allowPropertyOverride, field3, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…teScroll, ANY_TO_BOOLEAN)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "item_builder", allowPropertyOverride, q9 != null ? q9.f4459r : null, this.f3427a.b2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…uilderJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "item_spacing", allowPropertyOverride, q9 != null ? q9.f4460s : null, this.f3427a.u3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…edSizeJsonTemplateParser)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, q9 != null ? q9.f4461t : null, this.f3427a.K4());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…nt.divJsonTemplateParser)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "layout_mode", allowPropertyOverride, q9 != null ? q9.f4462u : null, this.f3427a.A5());
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…utModeJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, q9 != null ? q9.f4463v : null, this.f3427a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, q9 != null ? q9.f4464w : null, this.f3427a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.h.f15492n, K9.f3412p, allowPropertyOverride, q9 != null ? q9.f4465x : null, E9.d.f2614e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp….Orientation.FROM_STRING)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, q9 != null ? q9.f4466y : null, this.f3427a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "page_transformation", allowPropertyOverride, q9 != null ? q9.f4467z : null, this.f3427a.o5());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…mationJsonTemplateParser)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "restrict_parent_scroll", typeHelper3, allowPropertyOverride, q9 != null ? q9.f4425A : null, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…ntScroll, ANY_TO_BOOLEAN)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, q9 != null ? q9.f4426B : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper, allowPropertyOverride, q9 != null ? q9.f4427C : null, function1, K9.f3418v);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "scroll_axis_alignment", K9.f3413q, allowPropertyOverride, q9 != null ? q9.f4428D : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…temAlignment.FROM_STRING)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, q9 != null ? q9.f4429E : null, this.f3427a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, q9 != null ? q9.f4430F : null, this.f3427a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, q9 != null ? q9.f4431G : null, this.f3427a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, q9 != null ? q9.f4432H : null, this.f3427a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, q9 != null ? q9.f4433I : null, this.f3427a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, q9 != null ? q9.f4434J : null, this.f3427a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field4 = q9 != null ? q9.f4435K : null;
            Function1 function14 = EnumC0997pf.f7541e;
            ListValidator listValidator = K9.f3419w;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field4, function14, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, q9 != null ? q9.f4436L : null, this.f3427a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, q9 != null ? q9.f4437M : null, this.f3427a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", K9.f3414r, allowPropertyOverride, q9 != null ? q9.f4438N : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, q9 != null ? q9.f4439O : null, this.f3427a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, q9 != null ? q9.f4440P : null, this.f3427a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, q9 != null ? q9.f4441Q : null, this.f3427a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField17, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new Q9(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalField4, readOptionalField5, readOptionalFieldWithExpression7, readOptionalField6, readOptionalField7, readOptionalListField6, readField, readOptionalField8, readOptionalField9, readOptionalFieldWithExpression8, readOptionalField10, readOptionalField11, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalListField7, readOptionalListField8, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalListField9, readOptionalListField10, readOptionalListField11, readOptionalFieldWithExpression13, readOptionalField16, readOptionalListField12, readOptionalField17);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Q9 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f4442a, this.f3427a.I());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f4443b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f4444c, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f4445d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f4446e, this.f3427a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f4447f, this.f3427a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f4448g, this.f3427a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f4449h);
            Field field = value.f4450i;
            Function1 function1 = E9.c.f2603d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "cross_axis_alignment", field, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "default_item", value.f4451j);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f4452k, this.f3427a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f4453l, this.f3427a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f4454m, this.f3427a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f4455n, this.f3427a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f4456o, this.f3427a.W6());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f4457p);
            JsonFieldParser.writeExpressionField(context, jSONObject, "infinite_scroll", value.f4458q);
            JsonFieldParser.writeField(context, jSONObject, "item_builder", value.f4459r, this.f3427a.b2());
            JsonFieldParser.writeField(context, jSONObject, "item_spacing", value.f4460s, this.f3427a.u3());
            JsonFieldParser.writeListField(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f4461t, this.f3427a.K4());
            JsonFieldParser.writeField(context, jSONObject, "layout_mode", value.f4462u, this.f3427a.A5());
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f4463v, this.f3427a.N4());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f4464w, this.f3427a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15492n, value.f4465x, E9.d.f2613d);
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f4466y, this.f3427a.W2());
            JsonFieldParser.writeField(context, jSONObject, "page_transformation", value.f4467z, this.f3427a.o5());
            JsonFieldParser.writeExpressionField(context, jSONObject, "restrict_parent_scroll", value.f4425A);
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f4426B);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f4427C);
            JsonFieldParser.writeExpressionField(context, jSONObject, "scroll_axis_alignment", value.f4428D, function1);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f4429E, this.f3427a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f4430F, this.f3427a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f4431G, this.f3427a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f4432H, this.f3427a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f4433I, this.f3427a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f4434J, this.f3427a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f4435K, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "pager");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f4436L, this.f3427a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f4437M, this.f3427a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f4438N, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f4439O, this.f3427a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f4440P, this.f3427a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f4441Q, this.f3427a.W6());
            return jSONObject;
        }
    }

    public static final class j implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3428a;

        public j(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3428a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public E9 resolve(ParsingContext context, Q9 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f4442a, data, "accessibility", this.f3428a.J(), this.f3428a.H());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f4443b, data, "alignment_horizontal", K9.f3409m, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f4444c, data, "alignment_vertical", K9.f3410n, EnumC1109w2.f8300e);
            Field field = template.f4445d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = K9.f3415s;
            Expression expression = K9.f3398b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f4446e, data, "animators", this.f3428a.s1(), this.f3428a.q1());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f4447f, data, io.appmetrica.analytics.impl.L2.f37912g, this.f3428a.E1(), this.f3428a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f4448g, data, "border", this.f3428a.K1(), this.f3428a.I1());
            Field field2 = template.f4449h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "column_span", typeHelper2, function12, K9.f3416t);
            Field field3 = template.f4450i;
            TypeHelper typeHelper3 = K9.f3411o;
            Function1 function13 = E9.c.f2604e;
            Expression expression3 = K9.f3399c;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "cross_axis_alignment", typeHelper3, function13, expression3);
            Expression expression4 = resolveOptionalExpression5 == null ? expression3 : resolveOptionalExpression5;
            Field field4 = template.f4451j;
            ValueValidator valueValidator2 = K9.f3417u;
            Expression expression5 = K9.f3400d;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "default_item", typeHelper2, function12, valueValidator2, expression5);
            if (resolveOptionalExpression6 != null) {
                expression5 = resolveOptionalExpression6;
            }
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f4452k, data, "disappear_actions", this.f3428a.O2(), this.f3428a.M2());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f4453l, data, "extensions", this.f3428a.a3(), this.f3428a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f4454m, data, "focus", this.f3428a.y3(), this.f3428a.w3());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f4455n, data, "functions", this.f3428a.H3(), this.f3428a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f4456o, data, "height", this.f3428a.X6(), this.f3428a.V6());
            if (yb == null) {
                yb = K9.f3401e;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f4457p, data, "id");
            Yb yb2 = yb;
            Field field5 = template.f4458q;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression6 = K9.f3402f;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "infinite_scroll", typeHelper4, function14, expression6);
            Expression expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            H3 h32 = (H3) JsonFieldResolver.resolveOptional(context, template.f4459r, data, "item_builder", this.f3428a.c2(), this.f3428a.a2());
            S5 s5 = (S5) JsonFieldResolver.resolveOptional(context, template.f4460s, data, "item_spacing", this.f3428a.v3(), this.f3428a.t3());
            if (s5 == null) {
                s5 = K9.f3403g;
            }
            S5 s52 = s5;
            Intrinsics.checkNotNullExpressionValue(s52, "JsonFieldResolver.resolv…TEM_SPACING_DEFAULT_VALUE");
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f4461t, data, FirebaseAnalytics.Param.ITEMS, this.f3428a.L4(), this.f3428a.J4());
            Object resolve = JsonFieldResolver.resolve(context, template.f4462u, data, "layout_mode", this.f3428a.B5(), this.f3428a.z5());
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…youtModeJsonEntityParser)");
            L9 l9 = (L9) resolve;
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f4463v, data, "layout_provider", this.f3428a.O4(), this.f3428a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f4464w, data, "margins", this.f3428a.X2(), this.f3428a.V2());
            Field field6 = template.f4465x;
            TypeHelper typeHelper5 = K9.f3412p;
            Function1 function15 = E9.d.f2614e;
            Expression expression8 = K9.f3404h;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, b9.h.f15492n, typeHelper5, function15, expression8);
            Expression expression9 = resolveOptionalExpression8 == null ? expression8 : resolveOptionalExpression8;
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f4466y, data, "paddings", this.f3428a.X2(), this.f3428a.V2());
            AbstractC0919l9 abstractC0919l9 = (AbstractC0919l9) JsonFieldResolver.resolveOptional(context, template.f4467z, data, "page_transformation", this.f3428a.p5(), this.f3428a.n5());
            Field field7 = template.f4425A;
            Expression expression10 = K9.f3405i;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "restrict_parent_scroll", typeHelper4, function14, expression10);
            Expression expression11 = resolveOptionalExpression9 == null ? expression10 : resolveOptionalExpression9;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, template.f4426B, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, template.f4427C, data, "row_span", typeHelper2, function12, K9.f3418v);
            Field field8 = template.f4428D;
            TypeHelper typeHelper6 = K9.f3413q;
            Expression expression12 = K9.f3406j;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "scroll_axis_alignment", typeHelper6, function13, expression12);
            Expression expression13 = resolveOptionalExpression12 == null ? expression12 : resolveOptionalExpression12;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f4429E, data, "selected_actions", this.f3428a.w0(), this.f3428a.u0());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f4430F, data, "tooltips", this.f3428a.L8(), this.f3428a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f4431G, data, "transform", this.f3428a.X8(), this.f3428a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f4432H, data, "transition_change", this.f3428a.T1(), this.f3428a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f4433I, data, "transition_in", this.f3428a.y1(), this.f3428a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f4434J, data, "transition_out", this.f3428a.y1(), this.f3428a.w1());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f4435K, data, "transition_triggers", EnumC0997pf.f7541e, K9.f3419w);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f4436L, data, "variable_triggers", this.f3428a.a9(), this.f3428a.Y8());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f4437M, data, "variables", this.f3428a.g9(), this.f3428a.e9());
            Field field9 = template.f4438N;
            TypeHelper typeHelper7 = K9.f3414r;
            Function1 function16 = Vf.f5043e;
            Expression expression14 = K9.f3407k;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, field9, data, "visibility", typeHelper7, function16, expression14);
            if (resolveOptionalExpression13 != null) {
                expression14 = resolveOptionalExpression13;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f4439O, data, "visibility_action", this.f3428a.s9(), this.f3428a.q9());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f4440P, data, "visibility_actions", this.f3428a.s9(), this.f3428a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f4441Q, data, "width", this.f3428a.X6(), this.f3428a.V6());
            if (yb3 == null) {
                yb3 = K9.f3408l;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new E9(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, resolveOptionalList2, c0860i3, resolveOptionalExpression4, expression4, expression5, resolveOptionalList3, resolveOptionalList4, w5, resolveOptionalList5, yb2, str, expression7, h32, s52, resolveOptionalList6, l9, c1079u8, c0754c5, expression9, c0754c52, abstractC0919l9, expression11, resolveOptionalExpression10, resolveOptionalExpression11, expression13, resolveOptionalList7, resolveOptionalList8, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression14, wf, resolveOptionalList12, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f3398b = companion.constant(Double.valueOf(1.0d));
        f3399c = companion.constant(E9.c.START);
        f3400d = companion.constant(0L);
        f3401e = new Yb.e(new C0765cg(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        f3402f = companion.constant(bool);
        int i4 = 1;
        f3403g = new S5(null == true ? 1 : 0, companion.constant(0L), i4, null == true ? 1 : 0);
        f3404h = companion.constant(E9.d.HORIZONTAL);
        f3405i = companion.constant(bool);
        f3406j = companion.constant(E9.c.CENTER);
        f3407k = companion.constant(Vf.VISIBLE);
        f3408l = new Yb.d(new I8(null == true ? 1 : 0, i4, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f3409m = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f3420i);
        f3410n = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f3421i);
        f3411o = companion2.from(AbstractC3219i.G(E9.c.values()), c.f3422i);
        f3412p = companion2.from(AbstractC3219i.G(E9.d.values()), d.f3423i);
        f3413q = companion2.from(AbstractC3219i.G(E9.c.values()), e.f3424i);
        f3414r = companion2.from(AbstractC3219i.G(Vf.values()), f.f3425i);
        f3415s = new ValueValidator() { // from class: O1.F9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = K9.f(((Double) obj).doubleValue());
                return f4;
            }
        };
        f3416t = new ValueValidator() { // from class: O1.G9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = K9.g(((Long) obj).longValue());
                return g4;
            }
        };
        f3417u = new ValueValidator() { // from class: O1.H9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = K9.h(((Long) obj).longValue());
                return h4;
            }
        };
        f3418v = new ValueValidator() { // from class: O1.I9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean i5;
                i5 = K9.i(((Long) obj).longValue());
                return i5;
            }
        };
        f3419w = new ListValidator() { // from class: O1.J9
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean j4;
                j4 = K9.j(list);
                return j4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
