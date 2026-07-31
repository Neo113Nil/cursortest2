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
public abstract class X6 {

    /* renamed from: a, reason: collision with root package name */
    private static final h f5218a = new h(null);

    /* renamed from: b, reason: collision with root package name */
    public static final C1127x2 f5219b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f5220c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f5221d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f5222e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f5223f;

    /* renamed from: g, reason: collision with root package name */
    public static final Yb.e f5224g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f5225h;

    /* renamed from: i, reason: collision with root package name */
    public static final Expression f5226i;

    /* renamed from: j, reason: collision with root package name */
    public static final Expression f5227j;

    /* renamed from: k, reason: collision with root package name */
    public static final Expression f5228k;

    /* renamed from: l, reason: collision with root package name */
    public static final Expression f5229l;

    /* renamed from: m, reason: collision with root package name */
    public static final Expression f5230m;

    /* renamed from: n, reason: collision with root package name */
    public static final Yb.d f5231n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeHelper f5232o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeHelper f5233p;

    /* renamed from: q, reason: collision with root package name */
    public static final TypeHelper f5234q;

    /* renamed from: r, reason: collision with root package name */
    public static final TypeHelper f5235r;

    /* renamed from: s, reason: collision with root package name */
    public static final TypeHelper f5236s;

    /* renamed from: t, reason: collision with root package name */
    public static final TypeHelper f5237t;

    /* renamed from: u, reason: collision with root package name */
    public static final TypeHelper f5238u;

    /* renamed from: v, reason: collision with root package name */
    public static final ValueValidator f5239v;

    /* renamed from: w, reason: collision with root package name */
    public static final ValueValidator f5240w;

    /* renamed from: x, reason: collision with root package name */
    public static final ValueValidator f5241x;

    /* renamed from: y, reason: collision with root package name */
    public static final ListValidator f5242y;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5243i = new a();

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
        public static final b f5244i = new b();

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
        public static final c f5245i = new c();

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
        public static final d f5246i = new d();

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
        public static final e f5247i = new e();

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
        public static final f f5248i = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof EnumC0770d3);
        }
    }

    static final class g extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final g f5249i = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    private static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    public static final class i implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5250a;

        public i(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5250a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O6 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f5250a.H());
            C0892k0 c0892k0 = (C0892k0) JsonPropertyParser.readOptional(context, data, "action", this.f5250a.u0());
            C1127x2 c1127x2 = (C1127x2) JsonPropertyParser.readOptional(context, data, "action_animation", this.f5250a.n1());
            if (c1127x2 == null) {
                c1127x2 = X6.f5219b;
            }
            C1127x2 c1127x22 = c1127x2;
            Intrinsics.checkNotNullExpressionValue(c1127x22, "JsonPropertyParser.readO…N_ANIMATION_DEFAULT_VALUE");
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "actions", this.f5250a.u0());
            TypeHelper typeHelper = X6.f5232o;
            Function1 function1 = EnumC1091v2.f8195e;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = X6.f5233p;
            Function1 function12 = EnumC1109w2.f8300e;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = X6.f5239v;
            Expression expression = X6.f5220c;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper3, function13, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, "animators", this.f5250a.q1());
            C1022r5 c1022r5 = (C1022r5) JsonPropertyParser.readOptional(context, data, "appearance_animation", this.f5250a.b3());
            T2 t22 = (T2) JsonPropertyParser.readOptional(context, data, "aspect", this.f5250a.z1());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f5250a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f5250a.I1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = X6.f5221d;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper5, function15, X6.f5240w);
            TypeHelper typeHelper6 = X6.f5234q;
            Expression expression4 = X6.f5222e;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            TypeHelper typeHelper7 = X6.f5235r;
            Expression expression6 = X6.f5223f;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f5250a.M2());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "doubletap_actions", this.f5250a.u0());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f5250a.Y2());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "filters", this.f5250a.e3());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f5250a.w3());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f5250a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f5250a.V6());
            if (yb == null) {
                yb = X6.f5224g;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            Expression expression8 = X6.f5225h;
            Yb yb2 = yb;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "high_priority_preview_show", typeHelper4, function14, expression8);
            Expression expression9 = readOptionalExpression8 == null ? expression8 : readOptionalExpression8;
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "hover_end_actions", this.f5250a.u0());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "hover_start_actions", this.f5250a.u0());
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …E_HELPER_URI, ANY_TO_URI)");
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f5250a.M4());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "longtap_actions", this.f5250a.u0());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f5250a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f5250a.V2());
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression10 = X6.f5226i;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "placeholder_color", typeHelper8, function16, expression10);
            Expression expression11 = readOptionalExpression9 == null ? expression10 : readOptionalExpression9;
            Expression expression12 = X6.f5227j;
            Expression expression13 = expression;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "preload_required", typeHelper4, function14, expression12);
            Expression expression14 = readOptionalExpression10 == null ? expression12 : readOptionalExpression10;
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "press_end_actions", this.f5250a.u0());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(context, data, "press_start_actions", this.f5250a.u0());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "preview", typeHelper9);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", typeHelper9);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper5, function15, X6.f5241x);
            TypeHelper typeHelper10 = X6.f5236s;
            Function1 function17 = Y6.f5382e;
            Expression expression15 = X6.f5228k;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(context, data, "scale", typeHelper10, function17, expression15);
            Expression expression16 = readOptionalExpression14 == null ? expression15 : readOptionalExpression14;
            List readOptionalList14 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f5250a.u0());
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(context, data, "tint_color", typeHelper8, function16);
            TypeHelper typeHelper11 = X6.f5237t;
            Function1 function18 = EnumC0770d3.f5998e;
            Expression expression17 = X6.f5229l;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(context, data, "tint_mode", typeHelper11, function18, expression17);
            Expression expression18 = readOptionalExpression16 == null ? expression17 : readOptionalExpression16;
            List readOptionalList15 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f5250a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f5250a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f5250a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f5250a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f5250a.w1());
            List readOptionalList16 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, X6.f5242y);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f5250a.Y8());
            List readOptionalList18 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f5250a.e9());
            TypeHelper typeHelper12 = X6.f5238u;
            Function1 function19 = Vf.f5043e;
            Expression expression19 = X6.f5230m;
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper12, function19, expression19);
            if (readOptionalExpression17 != null) {
                expression19 = readOptionalExpression17;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f5250a.q9());
            List readOptionalList19 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f5250a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f5250a.V6());
            if (yb3 == null) {
                yb3 = X6.f5231n;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new O6(c0839h0, c0892k0, c1127x22, readOptionalList, readOptionalExpression, readOptionalExpression2, expression13, readOptionalList2, c1022r5, t22, readOptionalList3, c0860i3, expression3, readOptionalExpression5, expression5, expression7, readOptionalList4, readOptionalList5, readOptionalList6, readOptionalList7, w5, readOptionalList8, yb2, expression9, readOptionalList9, readOptionalList10, str, readExpression, c1079u8, readOptionalList11, c0754c5, c0754c52, expression11, expression14, readOptionalList12, readOptionalList13, readOptionalExpression11, readOptionalExpression12, readOptionalExpression13, expression16, readOptionalList14, readOptionalExpression15, expression18, readOptionalList15, c0925lf, abstractC1092v3, o22, o23, readOptionalList16, readOptionalList17, readOptionalList18, expression19, wf, readOptionalList19, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, O6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f5250a.H());
            JsonPropertyParser.write(context, jSONObject, "action", value.f4239b, this.f5250a.u0());
            JsonPropertyParser.write(context, jSONObject, "action_animation", value.f4241c, this.f5250a.n1());
            JsonPropertyParser.writeList(context, jSONObject, "actions", value.f4243d, this.f5250a.u0());
            Expression l4 = value.l();
            Function1 function1 = EnumC1091v2.f8194d;
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", l4, function1);
            Expression s4 = value.s();
            Function1 function12 = EnumC1109w2.f8299d;
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", s4, function12);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f5250a.q1());
            JsonPropertyParser.write(context, jSONObject, "appearance_animation", value.f4249i, this.f5250a.b3());
            JsonPropertyParser.write(context, jSONObject, "aspect", value.f4250j, this.f5250a.z1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f5250a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f5250a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "capture_focus_on_action", value.f4253m);
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonExpressionParser.writeExpression(context, jSONObject, "content_alignment_horizontal", value.f4255o, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "content_alignment_vertical", value.f4256p, function12);
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f5250a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "doubletap_actions", value.f4258r, this.f5250a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f5250a.Y2());
            JsonPropertyParser.writeList(context, jSONObject, "filters", value.f4260t, this.f5250a.e3());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f5250a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f5250a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f5250a.V6());
            JsonExpressionParser.writeExpression(context, jSONObject, "high_priority_preview_show", value.f4264x);
            JsonPropertyParser.writeList(context, jSONObject, "hover_end_actions", value.f4265y, this.f5250a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "hover_start_actions", value.f4266z, this.f5250a.u0());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonExpressionParser.writeExpression(context, jSONObject, "image_url", value.f4212B, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f5250a.M4());
            JsonPropertyParser.writeList(context, jSONObject, "longtap_actions", value.f4214D, this.f5250a.u0());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f5250a.V2());
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f5250a.V2());
            Expression expression = value.f4217G;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(context, jSONObject, "placeholder_color", expression, function13);
            JsonExpressionParser.writeExpression(context, jSONObject, "preload_required", value.f4218H);
            JsonPropertyParser.writeList(context, jSONObject, "press_end_actions", value.f4219I, this.f5250a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "press_start_actions", value.f4220J, this.f5250a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "preview", value.f4221K);
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonExpressionParser.writeExpression(context, jSONObject, "scale", value.f4224N, Y6.f5381d);
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f5250a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "tint_color", value.f4226P, function13);
            JsonExpressionParser.writeExpression(context, jSONObject, "tint_mode", value.f4227Q, EnumC0770d3.f5997d);
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f5250a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f5250a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f5250a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f5250a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f5250a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "image");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f5250a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f5250a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f5250a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f5250a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f5250a.V6());
            return jSONObject;
        }
    }

    public static final class j implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5251a;

        public j(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5251a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Z6 deserialize(ParsingContext context, Z6 z6, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, z6 != null ? z6.f5513a : null, this.f5251a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "action", allowPropertyOverride, z6 != null ? z6.f5515b : null, this.f5251a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "action_animation", allowPropertyOverride, z6 != null ? z6.f5517c : null, this.f5251a.o1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…mationJsonTemplateParser)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "actions", allowPropertyOverride, z6 != null ? z6.f5519d : null, this.f5251a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            TypeHelper typeHelper = X6.f5232o;
            Field field = z6 != null ? z6.f5520e : null;
            Function1 function1 = EnumC1091v2.f8195e;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            TypeHelper typeHelper2 = X6.f5233p;
            Field field2 = z6 != null ? z6.f5521f : null;
            Function1 function12 = EnumC1109w2.f8300e;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, z6 != null ? z6.f5522g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, X6.f5239v);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, z6 != null ? z6.f5523h : null, this.f5251a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "appearance_animation", allowPropertyOverride, z6 != null ? z6.f5524i : null, this.f5251a.c3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "aspect", allowPropertyOverride, z6 != null ? z6.f5525j : null, this.f5251a.A1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…AspectJsonTemplateParser)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, z6 != null ? z6.f5526k : null, this.f5251a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, z6 != null ? z6.f5527l : null, this.f5251a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…BorderJsonTemplateParser)");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field3 = z6 != null ? z6.f5528m : null;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…OnAction, ANY_TO_BOOLEAN)");
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field4 = z6 != null ? z6.f5529n : null;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper4, allowPropertyOverride, field4, function14, X6.f5240w);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "content_alignment_horizontal", X6.f5234q, allowPropertyOverride, z6 != null ? z6.f5530o : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "content_alignment_vertical", X6.f5235r, allowPropertyOverride, z6 != null ? z6.f5531p : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, z6 != null ? z6.f5532q : null, this.f5251a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "doubletap_actions", allowPropertyOverride, z6 != null ? z6.f5533r : null, this.f5251a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, z6 != null ? z6.f5534s : null, this.f5251a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "filters", allowPropertyOverride, z6 != null ? z6.f5535t : null, this.f5251a.f3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…FilterJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, z6 != null ? z6.f5536u : null, this.f5251a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, z6 != null ? z6.f5537v : null, this.f5251a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, z6 != null ? z6.f5538w : null, this.f5251a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "high_priority_preview_show", typeHelper3, allowPropertyOverride, z6 != null ? z6.f5539x : null, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…viewShow, ANY_TO_BOOLEAN)");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "hover_end_actions", allowPropertyOverride, z6 != null ? z6.f5540y : null, this.f5251a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "hover_start_actions", allowPropertyOverride, z6 != null ? z6.f5541z : null, this.f5251a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, z6 != null ? z6.f5487A : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, z6 != null ? z6.f5488B : null, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…nt?.imageUrl, ANY_TO_URI)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, z6 != null ? z6.f5489C : null, this.f5251a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "longtap_actions", allowPropertyOverride, z6 != null ? z6.f5490D : null, this.f5251a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, z6 != null ? z6.f5491E : null, this.f5251a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, z6 != null ? z6.f5492F : null, this.f5251a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…InsetsJsonTemplateParser)");
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field5 = z6 != null ? z6.f5493G : null;
            Function1<Object, Integer> function15 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "placeholder_color", typeHelper5, allowPropertyOverride, field5, function15);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "preload_required", typeHelper3, allowPropertyOverride, z6 != null ? z6.f5494H : null, function13);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…Required, ANY_TO_BOOLEAN)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "press_end_actions", allowPropertyOverride, z6 != null ? z6.f5495I : null, this.f5251a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "press_start_actions", allowPropertyOverride, z6 != null ? z6.f5496J : null, this.f5251a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField13, "readOptionalListField(co…ActionJsonTemplateParser)");
            TypeHelper<String> typeHelper6 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "preview", typeHelper6, allowPropertyOverride, z6 != null ? z6.f5497K : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…verride, parent?.preview)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", typeHelper6, allowPropertyOverride, z6 != null ? z6.f5498L : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper4, allowPropertyOverride, z6 != null ? z6.f5499M : null, function14, X6.f5241x);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "scale", X6.f5236s, allowPropertyOverride, z6 != null ? z6.f5500N : null, Y6.f5382e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression14, "readOptionalFieldWithExp…ivImageScale.FROM_STRING)");
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, z6 != null ? z6.f5501O : null, this.f5251a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField14, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "tint_color", typeHelper5, allowPropertyOverride, z6 != null ? z6.f5502P : null, function15);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression15, "readOptionalFieldWithExp…lor, STRING_TO_COLOR_INT)");
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "tint_mode", X6.f5237t, allowPropertyOverride, z6 != null ? z6.f5503Q : null, EnumC0770d3.f5998e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression16, "readOptionalFieldWithExp…DivBlendMode.FROM_STRING)");
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, z6 != null ? z6.f5504R : null, this.f5251a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField15, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, z6 != null ? z6.f5505S : null, this.f5251a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, z6 != null ? z6.f5506T : null, this.f5251a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, z6 != null ? z6.f5507U : null, this.f5251a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, z6 != null ? z6.f5508V : null, this.f5251a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field6 = z6 != null ? z6.f5509W : null;
            Function1 function16 = EnumC0997pf.f7541e;
            ListValidator listValidator = X6.f5242y;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField16 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field6, function16, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField16, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField17 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, z6 != null ? z6.f5510X : null, this.f5251a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField17, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField18 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, z6 != null ? z6.f5511Y : null, this.f5251a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField18, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", X6.f5238u, allowPropertyOverride, z6 != null ? z6.f5512Z : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression17, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, z6 != null ? z6.f5514a0 : null, this.f5251a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField17, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField19 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, z6 != null ? z6.f5516b0 : null, this.f5251a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField19, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField18 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, z6 != null ? z6.f5518c0 : null, this.f5251a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField18, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new Z6(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalField4, readOptionalField5, readOptionalListField3, readOptionalField6, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalListField7, readOptionalField7, readOptionalListField8, readOptionalField8, readOptionalFieldWithExpression8, readOptionalListField9, readOptionalListField10, readOptionalField9, readFieldWithExpression, readOptionalField10, readOptionalListField11, readOptionalField11, readOptionalField12, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalListField12, readOptionalListField13, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalListField14, readOptionalFieldWithExpression15, readOptionalFieldWithExpression16, readOptionalListField15, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalField16, readOptionalListField16, readOptionalListField17, readOptionalListField18, readOptionalFieldWithExpression17, readOptionalField17, readOptionalListField19, readOptionalField18);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Z6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f5513a, this.f5251a.I());
            JsonFieldParser.writeField(context, jSONObject, "action", value.f5515b, this.f5251a.v0());
            JsonFieldParser.writeField(context, jSONObject, "action_animation", value.f5517c, this.f5251a.o1());
            JsonFieldParser.writeListField(context, jSONObject, "actions", value.f5519d, this.f5251a.v0());
            Field field = value.f5520e;
            Function1 function1 = EnumC1091v2.f8194d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = value.f5521f;
            Function1 function12 = EnumC1109w2.f8299d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f5522g);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f5523h, this.f5251a.r1());
            JsonFieldParser.writeField(context, jSONObject, "appearance_animation", value.f5524i, this.f5251a.c3());
            JsonFieldParser.writeField(context, jSONObject, "aspect", value.f5525j, this.f5251a.A1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f5526k, this.f5251a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f5527l, this.f5251a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "capture_focus_on_action", value.f5528m);
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f5529n);
            JsonFieldParser.writeExpressionField(context, jSONObject, "content_alignment_horizontal", value.f5530o, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "content_alignment_vertical", value.f5531p, function12);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f5532q, this.f5251a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "doubletap_actions", value.f5533r, this.f5251a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f5534s, this.f5251a.Z2());
            JsonFieldParser.writeListField(context, jSONObject, "filters", value.f5535t, this.f5251a.f3());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f5536u, this.f5251a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f5537v, this.f5251a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f5538w, this.f5251a.W6());
            JsonFieldParser.writeExpressionField(context, jSONObject, "high_priority_preview_show", value.f5539x);
            JsonFieldParser.writeListField(context, jSONObject, "hover_end_actions", value.f5540y, this.f5251a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "hover_start_actions", value.f5541z, this.f5251a.v0());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f5487A);
            JsonFieldParser.writeExpressionField(context, jSONObject, "image_url", value.f5488B, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f5489C, this.f5251a.N4());
            JsonFieldParser.writeListField(context, jSONObject, "longtap_actions", value.f5490D, this.f5251a.v0());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f5491E, this.f5251a.W2());
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f5492F, this.f5251a.W2());
            Field field3 = value.f5493G;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(context, jSONObject, "placeholder_color", field3, function13);
            JsonFieldParser.writeExpressionField(context, jSONObject, "preload_required", value.f5494H);
            JsonFieldParser.writeListField(context, jSONObject, "press_end_actions", value.f5495I, this.f5251a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "press_start_actions", value.f5496J, this.f5251a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "preview", value.f5497K);
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f5498L);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f5499M);
            JsonFieldParser.writeExpressionField(context, jSONObject, "scale", value.f5500N, Y6.f5381d);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f5501O, this.f5251a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "tint_color", value.f5502P, function13);
            JsonFieldParser.writeExpressionField(context, jSONObject, "tint_mode", value.f5503Q, EnumC0770d3.f5997d);
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f5504R, this.f5251a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f5505S, this.f5251a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f5506T, this.f5251a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f5507U, this.f5251a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f5508V, this.f5251a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f5509W, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "image");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f5510X, this.f5251a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f5511Y, this.f5251a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f5512Z, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f5514a0, this.f5251a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f5516b0, this.f5251a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f5518c0, this.f5251a.W6());
            return jSONObject;
        }
    }

    public static final class k implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f5252a;

        public k(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f5252a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O6 resolve(ParsingContext context, Z6 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f5513a, data, "accessibility", this.f5252a.J(), this.f5252a.H());
            C0892k0 c0892k0 = (C0892k0) JsonFieldResolver.resolveOptional(context, template.f5515b, data, "action", this.f5252a.w0(), this.f5252a.u0());
            C1127x2 c1127x2 = (C1127x2) JsonFieldResolver.resolveOptional(context, template.f5517c, data, "action_animation", this.f5252a.p1(), this.f5252a.n1());
            if (c1127x2 == null) {
                c1127x2 = X6.f5219b;
            }
            C1127x2 c1127x22 = c1127x2;
            Intrinsics.checkNotNullExpressionValue(c1127x22, "JsonFieldResolver.resolv…N_ANIMATION_DEFAULT_VALUE");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f5519d, data, "actions", this.f5252a.w0(), this.f5252a.u0());
            Field field = template.f5520e;
            TypeHelper typeHelper = X6.f5232o;
            Function1 function1 = EnumC1091v2.f8195e;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alignment_horizontal", typeHelper, function1);
            Field field2 = template.f5521f;
            TypeHelper typeHelper2 = X6.f5233p;
            Function1 function12 = EnumC1109w2.f8300e;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "alignment_vertical", typeHelper2, function12);
            Field field3 = template.f5522g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = X6.f5239v;
            Expression expression = X6.f5220c;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "alpha", typeHelper3, function13, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f5523h, data, "animators", this.f5252a.s1(), this.f5252a.q1());
            C1022r5 c1022r5 = (C1022r5) JsonFieldResolver.resolveOptional(context, template.f5524i, data, "appearance_animation", this.f5252a.d3(), this.f5252a.b3());
            T2 t22 = (T2) JsonFieldResolver.resolveOptional(context, template.f5525j, data, "aspect", this.f5252a.B1(), this.f5252a.z1());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f5526k, data, io.appmetrica.analytics.impl.L2.f37912g, this.f5252a.E1(), this.f5252a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f5527l, data, "border", this.f5252a.K1(), this.f5252a.I1());
            Field field4 = template.f5528m;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = X6.f5221d;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field field5 = template.f5529n;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "column_span", typeHelper5, function15, X6.f5240w);
            Field field6 = template.f5530o;
            TypeHelper typeHelper6 = X6.f5234q;
            Expression expression4 = X6.f5222e;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            Field field7 = template.f5531p;
            TypeHelper typeHelper7 = X6.f5235r;
            Expression expression6 = X6.f5223f;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f5532q, data, "disappear_actions", this.f5252a.O2(), this.f5252a.M2());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f5533r, data, "doubletap_actions", this.f5252a.w0(), this.f5252a.u0());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f5534s, data, "extensions", this.f5252a.a3(), this.f5252a.Y2());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f5535t, data, "filters", this.f5252a.g3(), this.f5252a.e3());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f5536u, data, "focus", this.f5252a.y3(), this.f5252a.w3());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f5537v, data, "functions", this.f5252a.H3(), this.f5252a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f5538w, data, "height", this.f5252a.X6(), this.f5252a.V6());
            if (yb == null) {
                yb = X6.f5224g;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            Field field8 = template.f5539x;
            Expression expression8 = X6.f5225h;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "high_priority_preview_show", typeHelper4, function14, expression8);
            Expression expression9 = resolveOptionalExpression8 == null ? expression8 : resolveOptionalExpression8;
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f5540y, data, "hover_end_actions", this.f5252a.w0(), this.f5252a.u0());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f5541z, data, "hover_start_actions", this.f5252a.w0(), this.f5252a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f5487A, data, "id");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f5488B, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f5489C, data, "layout_provider", this.f5252a.O4(), this.f5252a.M4());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f5490D, data, "longtap_actions", this.f5252a.w0(), this.f5252a.u0());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f5491E, data, "margins", this.f5252a.X2(), this.f5252a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f5492F, data, "paddings", this.f5252a.X2(), this.f5252a.V2());
            Field field9 = template.f5493G;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression10 = X6.f5226i;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field9, data, "placeholder_color", typeHelper8, function16, expression10);
            Expression expression11 = resolveOptionalExpression9 == null ? expression10 : resolveOptionalExpression9;
            Field field10 = template.f5494H;
            Expression expression12 = X6.f5227j;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, field10, data, "preload_required", typeHelper4, function14, expression12);
            Expression expression13 = resolveOptionalExpression10 == null ? expression12 : resolveOptionalExpression10;
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f5495I, data, "press_end_actions", this.f5252a.w0(), this.f5252a.u0());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(context, template.f5496J, data, "press_start_actions", this.f5252a.w0(), this.f5252a.u0());
            Field field11 = template.f5497K;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, field11, data, "preview", typeHelper9);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, template.f5498L, data, "reuse_id", typeHelper9);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, template.f5499M, data, "row_span", typeHelper5, function15, X6.f5241x);
            Field field12 = template.f5500N;
            TypeHelper typeHelper10 = X6.f5236s;
            Function1 function17 = Y6.f5382e;
            Expression expression14 = X6.f5228k;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(context, field12, data, "scale", typeHelper10, function17, expression14);
            Expression expression15 = resolveOptionalExpression14 == null ? expression14 : resolveOptionalExpression14;
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(context, template.f5501O, data, "selected_actions", this.f5252a.w0(), this.f5252a.u0());
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(context, template.f5502P, data, "tint_color", typeHelper8, function16);
            Field field13 = template.f5503Q;
            TypeHelper typeHelper11 = X6.f5237t;
            Function1 function18 = EnumC0770d3.f5998e;
            Expression expression16 = X6.f5229l;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(context, field13, data, "tint_mode", typeHelper11, function18, expression16);
            Expression expression17 = resolveOptionalExpression16 == null ? expression16 : resolveOptionalExpression16;
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(context, template.f5504R, data, "tooltips", this.f5252a.L8(), this.f5252a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f5505S, data, "transform", this.f5252a.X8(), this.f5252a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f5506T, data, "transition_change", this.f5252a.T1(), this.f5252a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f5507U, data, "transition_in", this.f5252a.y1(), this.f5252a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f5508V, data, "transition_out", this.f5252a.y1(), this.f5252a.w1());
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(context, template.f5509W, data, "transition_triggers", EnumC0997pf.f7541e, X6.f5242y);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(context, template.f5510X, data, "variable_triggers", this.f5252a.a9(), this.f5252a.Y8());
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(context, template.f5511Y, data, "variables", this.f5252a.g9(), this.f5252a.e9());
            Field field14 = template.f5512Z;
            TypeHelper typeHelper12 = X6.f5238u;
            Function1 function19 = Vf.f5043e;
            Expression expression18 = X6.f5230m;
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(context, field14, data, "visibility", typeHelper12, function19, expression18);
            if (resolveOptionalExpression17 != null) {
                expression18 = resolveOptionalExpression17;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f5514a0, data, "visibility_action", this.f5252a.s9(), this.f5252a.q9());
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(context, template.f5516b0, data, "visibility_actions", this.f5252a.s9(), this.f5252a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f5518c0, data, "width", this.f5252a.X6(), this.f5252a.V6());
            if (yb3 == null) {
                yb3 = X6.f5231n;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            Expression expression19 = expression7;
            return new O6(c0839h0, c0892k0, c1127x22, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, c1022r5, t22, resolveOptionalList3, c0860i3, expression3, resolveOptionalExpression5, expression5, expression19, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, resolveOptionalList7, w5, resolveOptionalList8, yb2, expression9, resolveOptionalList9, resolveOptionalList10, str, resolveExpression, c1079u8, resolveOptionalList11, c0754c5, c0754c52, expression11, expression13, resolveOptionalList12, resolveOptionalList13, resolveOptionalExpression11, resolveOptionalExpression12, resolveOptionalExpression13, expression15, resolveOptionalList14, resolveOptionalExpression15, expression17, resolveOptionalList15, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList16, resolveOptionalList17, resolveOptionalList18, expression18, wf, resolveOptionalList19, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant = companion.constant(100L);
        Expression constant2 = companion.constant(Double.valueOf(0.6d));
        Expression constant3 = companion.constant(C1127x2.c.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f5219b = new C1127x2(constant, constant2, null, null, constant3, null, null, companion.constant(valueOf), 108, null);
        f5220c = companion.constant(valueOf);
        f5221d = companion.constant(Boolean.TRUE);
        f5222e = companion.constant(EnumC1091v2.CENTER);
        f5223f = companion.constant(EnumC1109w2.CENTER);
        f5224g = new Yb.e(new C0765cg(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        f5225h = companion.constant(bool);
        f5226i = companion.constant(335544320);
        f5227j = companion.constant(bool);
        f5228k = companion.constant(Y6.FILL);
        f5229l = companion.constant(EnumC0770d3.SOURCE_IN);
        f5230m = companion.constant(Vf.VISIBLE);
        f5231n = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f5232o = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f5243i);
        f5233p = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f5244i);
        f5234q = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), c.f5245i);
        f5235r = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), d.f5246i);
        f5236s = companion2.from(AbstractC3219i.G(Y6.values()), e.f5247i);
        f5237t = companion2.from(AbstractC3219i.G(EnumC0770d3.values()), f.f5248i);
        f5238u = companion2.from(AbstractC3219i.G(Vf.values()), g.f5249i);
        f5239v = new ValueValidator() { // from class: O1.T6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean e4;
                e4 = X6.e(((Double) obj).doubleValue());
                return e4;
            }
        };
        f5240w = new ValueValidator() { // from class: O1.U6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = X6.f(((Long) obj).longValue());
                return f4;
            }
        };
        f5241x = new ValueValidator() { // from class: O1.V6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = X6.g(((Long) obj).longValue());
                return g4;
            }
        };
        f5242y = new ListValidator() { // from class: O1.W6
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean h4;
                h4 = X6.h(list);
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
