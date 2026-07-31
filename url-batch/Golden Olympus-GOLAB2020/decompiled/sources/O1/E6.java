package O1;

import O1.C1127x2;
import O1.Yb;
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
public abstract class E6 {

    /* renamed from: a, reason: collision with root package name */
    private static final g f2511a = new g(null);

    /* renamed from: b, reason: collision with root package name */
    public static final C1127x2 f2512b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f2513c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f2514d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f2515e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f2516f;

    /* renamed from: g, reason: collision with root package name */
    public static final Yb.e f2517g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f2518h;

    /* renamed from: i, reason: collision with root package name */
    public static final Expression f2519i;

    /* renamed from: j, reason: collision with root package name */
    public static final Expression f2520j;

    /* renamed from: k, reason: collision with root package name */
    public static final Expression f2521k;

    /* renamed from: l, reason: collision with root package name */
    public static final Yb.d f2522l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeHelper f2523m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeHelper f2524n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeHelper f2525o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeHelper f2526p;

    /* renamed from: q, reason: collision with root package name */
    public static final TypeHelper f2527q;

    /* renamed from: r, reason: collision with root package name */
    public static final TypeHelper f2528r;

    /* renamed from: s, reason: collision with root package name */
    public static final ValueValidator f2529s;

    /* renamed from: t, reason: collision with root package name */
    public static final ValueValidator f2530t;

    /* renamed from: u, reason: collision with root package name */
    public static final ValueValidator f2531u;

    /* renamed from: v, reason: collision with root package name */
    public static final ListValidator f2532v;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2533i = new a();

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
        public static final b f2534i = new b();

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
        public static final c f2535i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1091v2);
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f2536i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC1109w2);
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final e f2537i = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Y6);
        }
    }

    static final class f extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final f f2538i = new f();

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
        private final Cg f2539a;

        public h(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2539a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1167z6 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f2539a.H());
            C0892k0 c0892k0 = (C0892k0) JsonPropertyParser.readOptional(context, data, "action", this.f2539a.u0());
            C1127x2 c1127x2 = (C1127x2) JsonPropertyParser.readOptional(context, data, "action_animation", this.f2539a.n1());
            if (c1127x2 == null) {
                c1127x2 = E6.f2512b;
            }
            C1127x2 c1127x22 = c1127x2;
            Intrinsics.checkNotNullExpressionValue(c1127x22, "JsonPropertyParser.readO…N_ANIMATION_DEFAULT_VALUE");
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "actions", this.f2539a.u0());
            TypeHelper typeHelper = E6.f2523m;
            Function1 function1 = EnumC1091v2.f8195e;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = E6.f2524n;
            Function1 function12 = EnumC1109w2.f8300e;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = E6.f2529s;
            Expression expression = E6.f2513c;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper3, function13, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, "animators", this.f2539a.q1());
            T2 t22 = (T2) JsonPropertyParser.readOptional(context, data, "aspect", this.f2539a.z1());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f2539a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f2539a.I1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = E6.f2514d;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper5, function15, E6.f2530t);
            TypeHelper typeHelper6 = E6.f2525o;
            Expression expression4 = E6.f2515e;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            TypeHelper typeHelper7 = E6.f2526p;
            Expression expression6 = E6.f2516f;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f2539a.M2());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "doubletap_actions", this.f2539a.u0());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f2539a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f2539a.w3());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f2539a.F3());
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "gif_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …E_HELPER_URI, ANY_TO_URI)");
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f2539a.V6());
            if (yb == null) {
                yb = E6.f2517g;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "hover_end_actions", this.f2539a.u0());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "hover_start_actions", this.f2539a.u0());
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f2539a.M4());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "longtap_actions", this.f2539a.u0());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f2539a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f2539a.V2());
            Yb yb2 = yb;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression8 = E6.f2518h;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "placeholder_color", typeHelper8, function16, expression8);
            Expression expression9 = readOptionalExpression8 == null ? expression8 : readOptionalExpression8;
            Expression expression10 = E6.f2519i;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "preload_required", typeHelper4, function14, expression10);
            Expression expression11 = readOptionalExpression9 == null ? expression10 : readOptionalExpression9;
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "press_end_actions", this.f2539a.u0());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "press_start_actions", this.f2539a.u0());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "preview", typeHelper9);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", typeHelper9);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper5, function15, E6.f2531u);
            TypeHelper typeHelper10 = E6.f2527q;
            Function1 function17 = Y6.f5382e;
            Expression expression12 = E6.f2520j;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "scale", typeHelper10, function17, expression12);
            Expression expression13 = readOptionalExpression13 == null ? expression12 : readOptionalExpression13;
            List readOptionalList13 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f2539a.u0());
            List readOptionalList14 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f2539a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f2539a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f2539a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f2539a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f2539a.w1());
            List readOptionalList15 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, E6.f2532v);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f2539a.Y8());
            List readOptionalList17 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f2539a.e9());
            TypeHelper typeHelper11 = E6.f2528r;
            Function1 function18 = Vf.f5043e;
            Expression expression14 = E6.f2521k;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper11, function18, expression14);
            if (readOptionalExpression14 != null) {
                expression14 = readOptionalExpression14;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f2539a.q9());
            List readOptionalList18 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f2539a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f2539a.V6());
            if (yb3 == null) {
                yb3 = E6.f2522l;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1167z6(c0839h0, c0892k0, c1127x22, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, t22, readOptionalList3, c0860i3, expression3, readOptionalExpression5, expression5, expression7, readOptionalList4, readOptionalList5, readOptionalList6, w5, readOptionalList7, readExpression, yb2, readOptionalList8, readOptionalList9, str, c1079u8, readOptionalList10, c0754c5, c0754c52, expression9, expression11, readOptionalList11, readOptionalList12, readOptionalExpression10, readOptionalExpression11, readOptionalExpression12, expression13, readOptionalList13, readOptionalList14, c0925lf, abstractC1092v3, o22, o23, readOptionalList15, readOptionalList16, readOptionalList17, expression14, wf, readOptionalList18, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1167z6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f2539a.H());
            JsonPropertyParser.write(context, jSONObject, "action", value.f8765b, this.f2539a.u0());
            JsonPropertyParser.write(context, jSONObject, "action_animation", value.f8766c, this.f2539a.n1());
            JsonPropertyParser.writeList(context, jSONObject, "actions", value.f8767d, this.f2539a.u0());
            Expression l4 = value.l();
            Function1 function1 = EnumC1091v2.f8194d;
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", l4, function1);
            Expression s4 = value.s();
            Function1 function12 = EnumC1109w2.f8299d;
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", s4, function12);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f2539a.q1());
            JsonPropertyParser.write(context, jSONObject, "aspect", value.f8772i, this.f2539a.z1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f2539a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f2539a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "capture_focus_on_action", value.f8775l);
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonExpressionParser.writeExpression(context, jSONObject, "content_alignment_horizontal", value.f8777n, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "content_alignment_vertical", value.f8778o, function12);
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f2539a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "doubletap_actions", value.f8780q, this.f2539a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f2539a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f2539a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f2539a.F3());
            JsonExpressionParser.writeExpression(context, jSONObject, "gif_url", value.f8784u, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f2539a.V6());
            JsonPropertyParser.writeList(context, jSONObject, "hover_end_actions", value.f8786w, this.f2539a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "hover_start_actions", value.f8787x, this.f2539a.u0());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f2539a.M4());
            JsonPropertyParser.writeList(context, jSONObject, "longtap_actions", value.f8739A, this.f2539a.u0());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f2539a.V2());
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f2539a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "placeholder_color", value.f8742D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(context, jSONObject, "preload_required", value.f8743E);
            JsonPropertyParser.writeList(context, jSONObject, "press_end_actions", value.f8744F, this.f2539a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "press_start_actions", value.f8745G, this.f2539a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "preview", value.f8746H);
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonExpressionParser.writeExpression(context, jSONObject, "scale", value.f8749K, Y6.f5381d);
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f2539a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f2539a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f2539a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f2539a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f2539a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f2539a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "gif");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f2539a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f2539a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f2539a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f2539a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f2539a.V6());
            return jSONObject;
        }
    }

    public static final class i implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2540a;

        public i(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2540a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public F6 deserialize(ParsingContext context, F6 f6, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, f6 != null ? f6.f2777a : null, this.f2540a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "action", allowPropertyOverride, f6 != null ? f6.f2778b : null, this.f2540a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "action_animation", allowPropertyOverride, f6 != null ? f6.f2779c : null, this.f2540a.o1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…mationJsonTemplateParser)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "actions", allowPropertyOverride, f6 != null ? f6.f2780d : null, this.f2540a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            TypeHelper typeHelper = E6.f2523m;
            Field field = f6 != null ? f6.f2781e : null;
            Function1 function1 = EnumC1091v2.f8195e;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            TypeHelper typeHelper2 = E6.f2524n;
            Field field2 = f6 != null ? f6.f2782f : null;
            Function1 function12 = EnumC1109w2.f8300e;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, f6 != null ? f6.f2783g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, E6.f2529s);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, f6 != null ? f6.f2784h : null, this.f2540a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "aspect", allowPropertyOverride, f6 != null ? f6.f2785i : null, this.f2540a.A1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…AspectJsonTemplateParser)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, f6 != null ? f6.f2786j : null, this.f2540a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, f6 != null ? f6.f2787k : null, this.f2540a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field3 = f6 != null ? f6.f2788l : null;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…OnAction, ANY_TO_BOOLEAN)");
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field4 = f6 != null ? f6.f2789m : null;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper4, allowPropertyOverride, field4, function14, E6.f2530t);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "content_alignment_horizontal", E6.f2525o, allowPropertyOverride, f6 != null ? f6.f2790n : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "content_alignment_vertical", E6.f2526p, allowPropertyOverride, f6 != null ? f6.f2791o : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, f6 != null ? f6.f2792p : null, this.f2540a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "doubletap_actions", allowPropertyOverride, f6 != null ? f6.f2793q : null, this.f2540a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, f6 != null ? f6.f2794r : null, this.f2540a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, f6 != null ? f6.f2795s : null, this.f2540a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, f6 != null ? f6.f2796t : null, this.f2540a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "gif_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, f6 != null ? f6.f2797u : null, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…rent?.gifUrl, ANY_TO_URI)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, f6 != null ? f6.f2798v : null, this.f2540a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "hover_end_actions", allowPropertyOverride, f6 != null ? f6.f2799w : null, this.f2540a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "hover_start_actions", allowPropertyOverride, f6 != null ? f6.f2800x : null, this.f2540a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, f6 != null ? f6.f2801y : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, f6 != null ? f6.f2802z : null, this.f2540a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "longtap_actions", allowPropertyOverride, f6 != null ? f6.f2753A : null, this.f2540a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, f6 != null ? f6.f2754B : null, this.f2540a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, f6 != null ? f6.f2755C : null, this.f2540a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "placeholder_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, f6 != null ? f6.f2756D : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "preload_required", typeHelper3, allowPropertyOverride, f6 != null ? f6.f2757E : null, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…Required, ANY_TO_BOOLEAN)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "press_end_actions", allowPropertyOverride, f6 != null ? f6.f2758F : null, this.f2540a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "press_start_actions", allowPropertyOverride, f6 != null ? f6.f2759G : null, this.f2540a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…ActionJsonTemplateParser)");
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "preview", typeHelper5, allowPropertyOverride, f6 != null ? f6.f2760H : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…verride, parent?.preview)");
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", typeHelper5, allowPropertyOverride, f6 != null ? f6.f2761I : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper4, allowPropertyOverride, f6 != null ? f6.f2762J : null, function14, E6.f2531u);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "scale", E6.f2527q, allowPropertyOverride, f6 != null ? f6.f2763K : null, Y6.f5382e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…ivImageScale.FROM_STRING)");
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, f6 != null ? f6.f2764L : null, this.f2540a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField13, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, f6 != null ? f6.f2765M : null, this.f2540a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField14, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, f6 != null ? f6.f2766N : null, this.f2540a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, f6 != null ? f6.f2767O : null, this.f2540a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, f6 != null ? f6.f2768P : null, this.f2540a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, f6 != null ? f6.f2769Q : null, this.f2540a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field5 = f6 != null ? f6.f2770R : null;
            Function1 function15 = EnumC0997pf.f7541e;
            ListValidator listValidator = E6.f2532v;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field5, function15, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField15, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField16 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, f6 != null ? f6.f2771S : null, this.f2540a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField16, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField17 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, f6 != null ? f6.f2772T : null, this.f2540a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField17, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", E6.f2528r, allowPropertyOverride, f6 != null ? f6.f2773U : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression14, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, f6 != null ? f6.f2774V : null, this.f2540a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField18 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, f6 != null ? f6.f2775W : null, this.f2540a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField18, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, f6 != null ? f6.f2776X : null, this.f2540a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField17, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new F6(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalField4, readOptionalListField3, readOptionalField5, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalField6, readOptionalListField7, readFieldWithExpression, readOptionalField7, readOptionalListField8, readOptionalListField9, readOptionalField8, readOptionalField9, readOptionalListField10, readOptionalField10, readOptionalField11, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField11, readOptionalListField12, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalFieldWithExpression13, readOptionalListField13, readOptionalListField14, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalListField15, readOptionalListField16, readOptionalListField17, readOptionalFieldWithExpression14, readOptionalField16, readOptionalListField18, readOptionalField17);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, F6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f2777a, this.f2540a.I());
            JsonFieldParser.writeField(context, jSONObject, "action", value.f2778b, this.f2540a.v0());
            JsonFieldParser.writeField(context, jSONObject, "action_animation", value.f2779c, this.f2540a.o1());
            JsonFieldParser.writeListField(context, jSONObject, "actions", value.f2780d, this.f2540a.v0());
            Field field = value.f2781e;
            Function1 function1 = EnumC1091v2.f8194d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = value.f2782f;
            Function1 function12 = EnumC1109w2.f8299d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f2783g);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f2784h, this.f2540a.r1());
            JsonFieldParser.writeField(context, jSONObject, "aspect", value.f2785i, this.f2540a.A1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f2786j, this.f2540a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f2787k, this.f2540a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "capture_focus_on_action", value.f2788l);
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f2789m);
            JsonFieldParser.writeExpressionField(context, jSONObject, "content_alignment_horizontal", value.f2790n, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "content_alignment_vertical", value.f2791o, function12);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f2792p, this.f2540a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "doubletap_actions", value.f2793q, this.f2540a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f2794r, this.f2540a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f2795s, this.f2540a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f2796t, this.f2540a.G3());
            JsonFieldParser.writeExpressionField(context, jSONObject, "gif_url", value.f2797u, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "height", value.f2798v, this.f2540a.W6());
            JsonFieldParser.writeListField(context, jSONObject, "hover_end_actions", value.f2799w, this.f2540a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "hover_start_actions", value.f2800x, this.f2540a.v0());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f2801y);
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f2802z, this.f2540a.N4());
            JsonFieldParser.writeListField(context, jSONObject, "longtap_actions", value.f2753A, this.f2540a.v0());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f2754B, this.f2540a.W2());
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f2755C, this.f2540a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "placeholder_color", value.f2756D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(context, jSONObject, "preload_required", value.f2757E);
            JsonFieldParser.writeListField(context, jSONObject, "press_end_actions", value.f2758F, this.f2540a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "press_start_actions", value.f2759G, this.f2540a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "preview", value.f2760H);
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f2761I);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f2762J);
            JsonFieldParser.writeExpressionField(context, jSONObject, "scale", value.f2763K, Y6.f5381d);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f2764L, this.f2540a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f2765M, this.f2540a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f2766N, this.f2540a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f2767O, this.f2540a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f2768P, this.f2540a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f2769Q, this.f2540a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f2770R, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "gif");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f2771S, this.f2540a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f2772T, this.f2540a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f2773U, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f2774V, this.f2540a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f2775W, this.f2540a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f2776X, this.f2540a.W6());
            return jSONObject;
        }
    }

    public static final class j implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f2541a;

        public j(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f2541a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1167z6 resolve(ParsingContext context, F6 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f2777a, data, "accessibility", this.f2541a.J(), this.f2541a.H());
            C0892k0 c0892k0 = (C0892k0) JsonFieldResolver.resolveOptional(context, template.f2778b, data, "action", this.f2541a.w0(), this.f2541a.u0());
            C1127x2 c1127x2 = (C1127x2) JsonFieldResolver.resolveOptional(context, template.f2779c, data, "action_animation", this.f2541a.p1(), this.f2541a.n1());
            if (c1127x2 == null) {
                c1127x2 = E6.f2512b;
            }
            C1127x2 c1127x22 = c1127x2;
            Intrinsics.checkNotNullExpressionValue(c1127x22, "JsonFieldResolver.resolv…N_ANIMATION_DEFAULT_VALUE");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f2780d, data, "actions", this.f2541a.w0(), this.f2541a.u0());
            Field field = template.f2781e;
            TypeHelper typeHelper = E6.f2523m;
            Function1 function1 = EnumC1091v2.f8195e;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alignment_horizontal", typeHelper, function1);
            Field field2 = template.f2782f;
            TypeHelper typeHelper2 = E6.f2524n;
            Function1 function12 = EnumC1109w2.f8300e;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "alignment_vertical", typeHelper2, function12);
            Field field3 = template.f2783g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = E6.f2529s;
            Expression expression = E6.f2513c;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "alpha", typeHelper3, function13, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f2784h, data, "animators", this.f2541a.s1(), this.f2541a.q1());
            T2 t22 = (T2) JsonFieldResolver.resolveOptional(context, template.f2785i, data, "aspect", this.f2541a.B1(), this.f2541a.z1());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f2786j, data, io.appmetrica.analytics.impl.L2.f37912g, this.f2541a.E1(), this.f2541a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f2787k, data, "border", this.f2541a.K1(), this.f2541a.I1());
            Field field4 = template.f2788l;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = E6.f2514d;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field field5 = template.f2789m;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "column_span", typeHelper5, function15, E6.f2530t);
            Field field6 = template.f2790n;
            TypeHelper typeHelper6 = E6.f2525o;
            Expression expression4 = E6.f2515e;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            Field field7 = template.f2791o;
            TypeHelper typeHelper7 = E6.f2526p;
            Expression expression6 = E6.f2516f;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f2792p, data, "disappear_actions", this.f2541a.O2(), this.f2541a.M2());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f2793q, data, "doubletap_actions", this.f2541a.w0(), this.f2541a.u0());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f2794r, data, "extensions", this.f2541a.a3(), this.f2541a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f2795s, data, "focus", this.f2541a.y3(), this.f2541a.w3());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f2796t, data, "functions", this.f2541a.H3(), this.f2541a.F3());
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f2797u, data, "gif_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f2798v, data, "height", this.f2541a.X6(), this.f2541a.V6());
            if (yb == null) {
                yb = E6.f2517g;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f2799w, data, "hover_end_actions", this.f2541a.w0(), this.f2541a.u0());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f2800x, data, "hover_start_actions", this.f2541a.w0(), this.f2541a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f2801y, data, "id");
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f2802z, data, "layout_provider", this.f2541a.O4(), this.f2541a.M4());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f2753A, data, "longtap_actions", this.f2541a.w0(), this.f2541a.u0());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f2754B, data, "margins", this.f2541a.X2(), this.f2541a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f2755C, data, "paddings", this.f2541a.X2(), this.f2541a.V2());
            Field field8 = template.f2756D;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression8 = E6.f2518h;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "placeholder_color", typeHelper8, function16, expression8);
            Expression expression9 = resolveOptionalExpression8 == null ? expression8 : resolveOptionalExpression8;
            Field field9 = template.f2757E;
            Expression expression10 = E6.f2519i;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field9, data, "preload_required", typeHelper4, function14, expression10);
            Expression expression11 = resolveOptionalExpression9 == null ? expression10 : resolveOptionalExpression9;
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f2758F, data, "press_end_actions", this.f2541a.w0(), this.f2541a.u0());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f2759G, data, "press_start_actions", this.f2541a.w0(), this.f2541a.u0());
            Field field10 = template.f2760H;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, field10, data, "preview", typeHelper9);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, template.f2761I, data, "reuse_id", typeHelper9);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, template.f2762J, data, "row_span", typeHelper5, function15, E6.f2531u);
            Field field11 = template.f2763K;
            TypeHelper typeHelper10 = E6.f2527q;
            Function1 function17 = Y6.f5382e;
            Expression expression12 = E6.f2520j;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, field11, data, "scale", typeHelper10, function17, expression12);
            Expression expression13 = resolveOptionalExpression13 == null ? expression12 : resolveOptionalExpression13;
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(context, template.f2764L, data, "selected_actions", this.f2541a.w0(), this.f2541a.u0());
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(context, template.f2765M, data, "tooltips", this.f2541a.L8(), this.f2541a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f2766N, data, "transform", this.f2541a.X8(), this.f2541a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f2767O, data, "transition_change", this.f2541a.T1(), this.f2541a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f2768P, data, "transition_in", this.f2541a.y1(), this.f2541a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f2769Q, data, "transition_out", this.f2541a.y1(), this.f2541a.w1());
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(context, template.f2770R, data, "transition_triggers", EnumC0997pf.f7541e, E6.f2532v);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(context, template.f2771S, data, "variable_triggers", this.f2541a.a9(), this.f2541a.Y8());
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(context, template.f2772T, data, "variables", this.f2541a.g9(), this.f2541a.e9());
            Field field12 = template.f2773U;
            TypeHelper typeHelper11 = E6.f2528r;
            Function1 function18 = Vf.f5043e;
            Expression expression14 = E6.f2521k;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(context, field12, data, "visibility", typeHelper11, function18, expression14);
            if (resolveOptionalExpression14 != null) {
                expression14 = resolveOptionalExpression14;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f2774V, data, "visibility_action", this.f2541a.s9(), this.f2541a.q9());
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(context, template.f2775W, data, "visibility_actions", this.f2541a.s9(), this.f2541a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f2776X, data, "width", this.f2541a.X6(), this.f2541a.V6());
            if (yb3 == null) {
                yb3 = E6.f2522l;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1167z6(c0839h0, c0892k0, c1127x22, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, t22, resolveOptionalList3, c0860i3, expression3, resolveOptionalExpression5, expression5, expression7, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, w5, resolveOptionalList7, resolveExpression, yb2, resolveOptionalList8, resolveOptionalList9, str, c1079u8, resolveOptionalList10, c0754c5, c0754c52, expression9, expression11, resolveOptionalList11, resolveOptionalList12, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalExpression12, expression13, resolveOptionalList13, resolveOptionalList14, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList15, resolveOptionalList16, resolveOptionalList17, expression14, wf, resolveOptionalList18, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant = companion.constant(100L);
        Expression constant2 = companion.constant(Double.valueOf(0.6d));
        Expression constant3 = companion.constant(C1127x2.c.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f2512b = new C1127x2(constant, constant2, null, null, constant3, null, null, companion.constant(valueOf), 108, null);
        f2513c = companion.constant(valueOf);
        f2514d = companion.constant(Boolean.TRUE);
        f2515e = companion.constant(EnumC1091v2.CENTER);
        f2516f = companion.constant(EnumC1109w2.CENTER);
        f2517g = new Yb.e(new C0765cg(null, null, null, 7, null));
        f2518h = companion.constant(335544320);
        f2519i = companion.constant(Boolean.FALSE);
        f2520j = companion.constant(Y6.FILL);
        f2521k = companion.constant(Vf.VISIBLE);
        f2522l = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f2523m = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f2533i);
        f2524n = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f2534i);
        f2525o = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), c.f2535i);
        f2526p = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), d.f2536i);
        f2527q = companion2.from(AbstractC3219i.G(Y6.values()), e.f2537i);
        f2528r = companion2.from(AbstractC3219i.G(Vf.values()), f.f2538i);
        f2529s = new ValueValidator() { // from class: O1.A6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = E6.e(((Double) obj).doubleValue());
                return e4;
            }
        };
        f2530t = new ValueValidator() { // from class: O1.B6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = E6.f(((Long) obj).longValue());
                return f4;
            }
        };
        f2531u = new ValueValidator() { // from class: O1.C6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = E6.g(((Long) obj).longValue());
                return g4;
            }
        };
        f2532v = new ListValidator() { // from class: O1.D6
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean h4;
                h4 = E6.h(list);
                return h4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(double d4) {
        return d4 >= 0.0d && d4 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j4) {
        return j4 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
