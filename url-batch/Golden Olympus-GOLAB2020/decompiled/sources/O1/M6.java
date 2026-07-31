package O1;

import O1.C1127x2;
import O1.Yb;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public abstract class M6 {

    /* renamed from: a, reason: collision with root package name */
    private static final f f3844a = new f(null);

    /* renamed from: b, reason: collision with root package name */
    public static final C1127x2 f3845b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f3846c;

    /* renamed from: d, reason: collision with root package name */
    public static final Expression f3847d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f3848e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f3849f;

    /* renamed from: g, reason: collision with root package name */
    public static final Yb.e f3850g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f3851h;

    /* renamed from: i, reason: collision with root package name */
    public static final Yb.d f3852i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeHelper f3853j;

    /* renamed from: k, reason: collision with root package name */
    public static final TypeHelper f3854k;

    /* renamed from: l, reason: collision with root package name */
    public static final TypeHelper f3855l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeHelper f3856m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeHelper f3857n;

    /* renamed from: o, reason: collision with root package name */
    public static final ValueValidator f3858o;

    /* renamed from: p, reason: collision with root package name */
    public static final ValueValidator f3859p;

    /* renamed from: q, reason: collision with root package name */
    public static final ValueValidator f3860q;

    /* renamed from: r, reason: collision with root package name */
    public static final ValueValidator f3861r;

    /* renamed from: s, reason: collision with root package name */
    public static final ListValidator f3862s;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3863i = new a();

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
        public static final b f3864i = new b();

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
        public static final c f3865i = new c();

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
        public static final d f3866i = new d();

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
        public static final e f3867i = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    private static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    public static final class g implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3868a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3868a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G6 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f3868a.H());
            C0892k0 c0892k0 = (C0892k0) JsonPropertyParser.readOptional(context, data, "action", this.f3868a.u0());
            C1127x2 c1127x2 = (C1127x2) JsonPropertyParser.readOptional(context, data, "action_animation", this.f3868a.n1());
            if (c1127x2 == null) {
                c1127x2 = M6.f3845b;
            }
            C1127x2 c1127x22 = c1127x2;
            Intrinsics.checkNotNullExpressionValue(c1127x22, "JsonPropertyParser.readO…N_ANIMATION_DEFAULT_VALUE");
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "actions", this.f3868a.u0());
            TypeHelper typeHelper = M6.f3853j;
            Function1 function1 = EnumC1091v2.f8195e;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = M6.f3854k;
            Function1 function12 = EnumC1109w2.f8300e;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = M6.f3858o;
            Expression expression = M6.f3846c;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper3, function13, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, "animators", this.f3868a.q1());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f3868a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f3868a.I1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = M6.f3847d;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(context, data, "column_count", typeHelper5, function15, M6.f3859p);
            Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …, COLUMN_COUNT_VALIDATOR)");
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper5, function15, M6.f3860q);
            TypeHelper typeHelper6 = M6.f3855l;
            Expression expression4 = M6.f3848e;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            TypeHelper typeHelper7 = M6.f3856m;
            Expression expression6 = M6.f3849f;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f3868a.M2());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "doubletap_actions", this.f3868a.u0());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f3868a.Y2());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f3868a.w3());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f3868a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f3868a.V6());
            if (yb == null) {
                yb = M6.f3850g;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "hover_end_actions", this.f3868a.u0());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "hover_start_actions", this.f3868a.u0());
            String str = (String) JsonPropertyParser.readOptional(context, data, "id");
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, FirebaseAnalytics.Param.ITEMS, this.f3868a.J4());
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f3868a.M4());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "longtap_actions", this.f3868a.u0());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f3868a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f3868a.V2());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "press_end_actions", this.f3868a.u0());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(context, data, "press_start_actions", this.f3868a.u0());
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Yb yb2 = yb;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper5, function15, M6.f3861r);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f3868a.u0());
            List readOptionalList15 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f3868a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f3868a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f3868a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f3868a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f3868a.w1());
            List readOptionalList16 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, M6.f3862s);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f3868a.Y8());
            List readOptionalList18 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f3868a.e9());
            TypeHelper typeHelper8 = M6.f3857n;
            Function1 function16 = Vf.f5043e;
            Expression expression8 = M6.f3851h;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper8, function16, expression8);
            if (readOptionalExpression10 != null) {
                expression8 = readOptionalExpression10;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f3868a.q9());
            List readOptionalList19 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f3868a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f3868a.V6());
            if (yb3 == null) {
                yb3 = M6.f3852i;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new G6(c0839h0, c0892k0, c1127x22, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, readOptionalList3, c0860i3, expression3, readExpression, readOptionalExpression5, expression5, expression7, readOptionalList4, readOptionalList5, readOptionalList6, w5, readOptionalList7, yb2, readOptionalList8, readOptionalList9, str, readOptionalList10, c1079u8, readOptionalList11, c0754c5, c0754c52, readOptionalList12, readOptionalList13, readOptionalExpression8, readOptionalExpression9, readOptionalList14, readOptionalList15, c0925lf, abstractC1092v3, o22, o23, readOptionalList16, readOptionalList17, readOptionalList18, expression8, wf, readOptionalList19, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, G6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f3868a.H());
            JsonPropertyParser.write(context, jSONObject, "action", value.f2864b, this.f3868a.u0());
            JsonPropertyParser.write(context, jSONObject, "action_animation", value.f2865c, this.f3868a.n1());
            JsonPropertyParser.writeList(context, jSONObject, "actions", value.f2866d, this.f3868a.u0());
            Expression l4 = value.l();
            Function1 function1 = EnumC1091v2.f8194d;
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", l4, function1);
            Expression s4 = value.s();
            Function1 function12 = EnumC1109w2.f8299d;
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", s4, function12);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f3868a.q1());
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f3868a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f3868a.I1());
            JsonExpressionParser.writeExpression(context, jSONObject, "capture_focus_on_action", value.f2873k);
            JsonExpressionParser.writeExpression(context, jSONObject, "column_count", value.f2874l);
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonExpressionParser.writeExpression(context, jSONObject, "content_alignment_horizontal", value.f2876n, function1);
            JsonExpressionParser.writeExpression(context, jSONObject, "content_alignment_vertical", value.f2877o, function12);
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f3868a.M2());
            JsonPropertyParser.writeList(context, jSONObject, "doubletap_actions", value.f2879q, this.f3868a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f3868a.Y2());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f3868a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f3868a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f3868a.V6());
            JsonPropertyParser.writeList(context, jSONObject, "hover_end_actions", value.f2884v, this.f3868a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "hover_start_actions", value.f2885w, this.f3868a.u0());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonPropertyParser.writeList(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f2887y, this.f3868a.J4());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f3868a.M4());
            JsonPropertyParser.writeList(context, jSONObject, "longtap_actions", value.f2841A, this.f3868a.u0());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f3868a.V2());
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f3868a.V2());
            JsonPropertyParser.writeList(context, jSONObject, "press_end_actions", value.f2844D, this.f3868a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "press_start_actions", value.f2845E, this.f3868a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f3868a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f3868a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f3868a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f3868a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f3868a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f3868a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "grid");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f3868a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f3868a.e9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f3868a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f3868a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f3868a.V6());
            return jSONObject;
        }
    }

    public static final class h implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3869a;

        public h(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3869a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public N6 deserialize(ParsingContext context, N6 n6, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, n6 != null ? n6.f4120a : null, this.f3869a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "action", allowPropertyOverride, n6 != null ? n6.f4121b : null, this.f3869a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "action_animation", allowPropertyOverride, n6 != null ? n6.f4122c : null, this.f3869a.o1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…mationJsonTemplateParser)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "actions", allowPropertyOverride, n6 != null ? n6.f4123d : null, this.f3869a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
            TypeHelper typeHelper = M6.f3853j;
            Field field = n6 != null ? n6.f4124e : null;
            Function1 function1 = EnumC1091v2.f8195e;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            TypeHelper typeHelper2 = M6.f3854k;
            Field field2 = n6 != null ? n6.f4125f : null;
            Function1 function12 = EnumC1109w2.f8300e;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, n6 != null ? n6.f4126g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, M6.f3858o);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, n6 != null ? n6.f4127h : null, this.f3869a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, n6 != null ? n6.f4128i : null, this.f3869a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, n6 != null ? n6.f4129j : null, this.f3869a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…BorderJsonTemplateParser)");
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, n6 != null ? n6.f4130k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…OnAction, ANY_TO_BOOLEAN)");
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field3 = n6 != null ? n6.f4131l : null;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "column_count", typeHelper3, allowPropertyOverride, field3, function13, M6.f3859p);
            Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…, COLUMN_COUNT_VALIDATOR)");
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper3, allowPropertyOverride, n6 != null ? n6.f4132m : null, function13, M6.f3860q);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "content_alignment_horizontal", M6.f3855l, allowPropertyOverride, n6 != null ? n6.f4133n : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "content_alignment_vertical", M6.f3856m, allowPropertyOverride, n6 != null ? n6.f4134o : null, function12);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, n6 != null ? n6.f4135p : null, this.f3869a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "doubletap_actions", allowPropertyOverride, n6 != null ? n6.f4136q : null, this.f3869a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, n6 != null ? n6.f4137r : null, this.f3869a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, n6 != null ? n6.f4138s : null, this.f3869a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, n6 != null ? n6.f4139t : null, this.f3869a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, n6 != null ? n6.f4140u : null, this.f3869a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "hover_end_actions", allowPropertyOverride, n6 != null ? n6.f4141v : null, this.f3869a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "hover_start_actions", allowPropertyOverride, n6 != null ? n6.f4142w : null, this.f3869a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, n6 != null ? n6.f4143x : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, n6 != null ? n6.f4144y : null, this.f3869a.K4());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…nt.divJsonTemplateParser)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, n6 != null ? n6.f4145z : null, this.f3869a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "longtap_actions", allowPropertyOverride, n6 != null ? n6.f4100A : null, this.f3869a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, n6 != null ? n6.f4101B : null, this.f3869a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, n6 != null ? n6.f4102C : null, this.f3869a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "press_end_actions", allowPropertyOverride, n6 != null ? n6.f4103D : null, this.f3869a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "press_start_actions", allowPropertyOverride, n6 != null ? n6.f4104E : null, this.f3869a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField13, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, n6 != null ? n6.f4105F : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper3, allowPropertyOverride, n6 != null ? n6.f4106G : null, function13, M6.f3861r);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, n6 != null ? n6.f4107H : null, this.f3869a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField14, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, n6 != null ? n6.f4108I : null, this.f3869a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField15, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, n6 != null ? n6.f4109J : null, this.f3869a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, n6 != null ? n6.f4110K : null, this.f3869a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, n6 != null ? n6.f4111L : null, this.f3869a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, n6 != null ? n6.f4112M : null, this.f3869a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field4 = n6 != null ? n6.f4113N : null;
            Function1 function14 = EnumC0997pf.f7541e;
            ListValidator listValidator = M6.f3862s;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField16 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field4, function14, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField16, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField17 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, n6 != null ? n6.f4114O : null, this.f3869a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField17, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField18 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, n6 != null ? n6.f4115P : null, this.f3869a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField18, "readOptionalListField(co…riableJsonTemplateParser)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", M6.f3857n, allowPropertyOverride, n6 != null ? n6.f4116Q : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, n6 != null ? n6.f4117R : null, this.f3869a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField19 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, n6 != null ? n6.f4118S : null, this.f3869a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField19, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, n6 != null ? n6.f4119T : null, this.f3869a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new N6(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalListField3, readOptionalField4, readOptionalFieldWithExpression4, readFieldWithExpression, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalField5, readOptionalListField7, readOptionalField6, readOptionalListField8, readOptionalListField9, readOptionalField7, readOptionalListField10, readOptionalField8, readOptionalListField11, readOptionalField9, readOptionalField10, readOptionalListField12, readOptionalListField13, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField14, readOptionalListField15, readOptionalField11, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalListField16, readOptionalListField17, readOptionalListField18, readOptionalFieldWithExpression10, readOptionalField15, readOptionalListField19, readOptionalField16);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, N6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f4120a, this.f3869a.I());
            JsonFieldParser.writeField(context, jSONObject, "action", value.f4121b, this.f3869a.v0());
            JsonFieldParser.writeField(context, jSONObject, "action_animation", value.f4122c, this.f3869a.o1());
            JsonFieldParser.writeListField(context, jSONObject, "actions", value.f4123d, this.f3869a.v0());
            Field field = value.f4124e;
            Function1 function1 = EnumC1091v2.f8194d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = value.f4125f;
            Function1 function12 = EnumC1109w2.f8299d;
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f4126g);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f4127h, this.f3869a.r1());
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f4128i, this.f3869a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f4129j, this.f3869a.J1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "capture_focus_on_action", value.f4130k);
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_count", value.f4131l);
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f4132m);
            JsonFieldParser.writeExpressionField(context, jSONObject, "content_alignment_horizontal", value.f4133n, function1);
            JsonFieldParser.writeExpressionField(context, jSONObject, "content_alignment_vertical", value.f4134o, function12);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f4135p, this.f3869a.N2());
            JsonFieldParser.writeListField(context, jSONObject, "doubletap_actions", value.f4136q, this.f3869a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f4137r, this.f3869a.Z2());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f4138s, this.f3869a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f4139t, this.f3869a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f4140u, this.f3869a.W6());
            JsonFieldParser.writeListField(context, jSONObject, "hover_end_actions", value.f4141v, this.f3869a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "hover_start_actions", value.f4142w, this.f3869a.v0());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f4143x);
            JsonFieldParser.writeListField(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f4144y, this.f3869a.K4());
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f4145z, this.f3869a.N4());
            JsonFieldParser.writeListField(context, jSONObject, "longtap_actions", value.f4100A, this.f3869a.v0());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f4101B, this.f3869a.W2());
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f4102C, this.f3869a.W2());
            JsonFieldParser.writeListField(context, jSONObject, "press_end_actions", value.f4103D, this.f3869a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "press_start_actions", value.f4104E, this.f3869a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f4105F);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f4106G);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f4107H, this.f3869a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f4108I, this.f3869a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f4109J, this.f3869a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f4110K, this.f3869a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f4111L, this.f3869a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f4112M, this.f3869a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f4113N, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "grid");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f4114O, this.f3869a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f4115P, this.f3869a.f9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f4116Q, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f4117R, this.f3869a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f4118S, this.f3869a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f4119T, this.f3869a.W6());
            return jSONObject;
        }
    }

    public static final class i implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3870a;

        public i(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3870a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G6 resolve(ParsingContext context, N6 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f4120a, data, "accessibility", this.f3870a.J(), this.f3870a.H());
            C0892k0 c0892k0 = (C0892k0) JsonFieldResolver.resolveOptional(context, template.f4121b, data, "action", this.f3870a.w0(), this.f3870a.u0());
            C1127x2 c1127x2 = (C1127x2) JsonFieldResolver.resolveOptional(context, template.f4122c, data, "action_animation", this.f3870a.p1(), this.f3870a.n1());
            if (c1127x2 == null) {
                c1127x2 = M6.f3845b;
            }
            C1127x2 c1127x22 = c1127x2;
            Intrinsics.checkNotNullExpressionValue(c1127x22, "JsonFieldResolver.resolv…N_ANIMATION_DEFAULT_VALUE");
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f4123d, data, "actions", this.f3870a.w0(), this.f3870a.u0());
            Field field = template.f4124e;
            TypeHelper typeHelper = M6.f3853j;
            Function1 function1 = EnumC1091v2.f8195e;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alignment_horizontal", typeHelper, function1);
            Field field2 = template.f4125f;
            TypeHelper typeHelper2 = M6.f3854k;
            Function1 function12 = EnumC1109w2.f8300e;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "alignment_vertical", typeHelper2, function12);
            Field field3 = template.f4126g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = M6.f3858o;
            Expression expression = M6.f3846c;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "alpha", typeHelper3, function13, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f4127h, data, "animators", this.f3870a.s1(), this.f3870a.q1());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f4128i, data, io.appmetrica.analytics.impl.L2.f37912g, this.f3870a.E1(), this.f3870a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f4129j, data, "border", this.f3870a.K1(), this.f3870a.I1());
            Field field4 = template.f4130k;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = M6.f3847d;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field field5 = template.f4131l;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(context, field5, data, "column_count", typeHelper5, function15, M6.f3859p);
            Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…, COLUMN_COUNT_VALIDATOR)");
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, template.f4132m, data, "column_span", typeHelper5, function15, M6.f3860q);
            Field field6 = template.f4133n;
            TypeHelper typeHelper6 = M6.f3855l;
            Expression expression4 = M6.f3848e;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            Field field7 = template.f4134o;
            TypeHelper typeHelper7 = M6.f3856m;
            Expression expression6 = M6.f3849f;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f4135p, data, "disappear_actions", this.f3870a.O2(), this.f3870a.M2());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f4136q, data, "doubletap_actions", this.f3870a.w0(), this.f3870a.u0());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f4137r, data, "extensions", this.f3870a.a3(), this.f3870a.Y2());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f4138s, data, "focus", this.f3870a.y3(), this.f3870a.w3());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f4139t, data, "functions", this.f3870a.H3(), this.f3870a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f4140u, data, "height", this.f3870a.X6(), this.f3870a.V6());
            if (yb == null) {
                yb = M6.f3850g;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f4141v, data, "hover_end_actions", this.f3870a.w0(), this.f3870a.u0());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f4142w, data, "hover_start_actions", this.f3870a.w0(), this.f3870a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f4143x, data, "id");
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f4144y, data, FirebaseAnalytics.Param.ITEMS, this.f3870a.L4(), this.f3870a.J4());
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f4145z, data, "layout_provider", this.f3870a.O4(), this.f3870a.M4());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f4100A, data, "longtap_actions", this.f3870a.w0(), this.f3870a.u0());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f4101B, data, "margins", this.f3870a.X2(), this.f3870a.V2());
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f4102C, data, "paddings", this.f3870a.X2(), this.f3870a.V2());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f4103D, data, "press_end_actions", this.f3870a.w0(), this.f3870a.u0());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(context, template.f4104E, data, "press_start_actions", this.f3870a.w0(), this.f3870a.u0());
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, template.f4105F, data, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, template.f4106G, data, "row_span", typeHelper5, function15, M6.f3861r);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(context, template.f4107H, data, "selected_actions", this.f3870a.w0(), this.f3870a.u0());
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(context, template.f4108I, data, "tooltips", this.f3870a.L8(), this.f3870a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f4109J, data, "transform", this.f3870a.X8(), this.f3870a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f4110K, data, "transition_change", this.f3870a.T1(), this.f3870a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f4111L, data, "transition_in", this.f3870a.y1(), this.f3870a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f4112M, data, "transition_out", this.f3870a.y1(), this.f3870a.w1());
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(context, template.f4113N, data, "transition_triggers", EnumC0997pf.f7541e, M6.f3862s);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(context, template.f4114O, data, "variable_triggers", this.f3870a.a9(), this.f3870a.Y8());
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(context, template.f4115P, data, "variables", this.f3870a.g9(), this.f3870a.e9());
            Field field8 = template.f4116Q;
            TypeHelper typeHelper8 = M6.f3857n;
            Function1 function16 = Vf.f5043e;
            Expression expression8 = M6.f3851h;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "visibility", typeHelper8, function16, expression8);
            if (resolveOptionalExpression10 != null) {
                expression8 = resolveOptionalExpression10;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f4117R, data, "visibility_action", this.f3870a.s9(), this.f3870a.q9());
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(context, template.f4118S, data, "visibility_actions", this.f3870a.s9(), this.f3870a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f4119T, data, "width", this.f3870a.X6(), this.f3870a.V6());
            if (yb3 == null) {
                yb3 = M6.f3852i;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new G6(c0839h0, c0892k0, c1127x22, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, resolveOptionalList3, c0860i3, expression3, resolveExpression, resolveOptionalExpression5, expression5, expression7, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, w5, resolveOptionalList7, yb2, resolveOptionalList8, resolveOptionalList9, str, resolveOptionalList10, c1079u8, resolveOptionalList11, c0754c5, c0754c52, resolveOptionalList12, resolveOptionalList13, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalList14, resolveOptionalList15, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList16, resolveOptionalList17, resolveOptionalList18, expression8, wf, resolveOptionalList19, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant = companion.constant(100L);
        Expression constant2 = companion.constant(Double.valueOf(0.6d));
        Expression constant3 = companion.constant(C1127x2.c.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f3845b = new C1127x2(constant, constant2, null, null, constant3, null, null, companion.constant(valueOf), 108, null);
        f3846c = companion.constant(valueOf);
        f3847d = companion.constant(Boolean.TRUE);
        f3848e = companion.constant(EnumC1091v2.START);
        f3849f = companion.constant(EnumC1109w2.TOP);
        f3850g = new Yb.e(new C0765cg(null, null, null, 7, null));
        f3851h = companion.constant(Vf.VISIBLE);
        f3852i = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f3853j = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f3863i);
        f3854k = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f3864i);
        f3855l = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), c.f3865i);
        f3856m = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), d.f3866i);
        f3857n = companion2.from(AbstractC3219i.G(Vf.values()), e.f3867i);
        f3858o = new ValueValidator() { // from class: O1.H6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = M6.f(((Double) obj).doubleValue());
                return f4;
            }
        };
        f3859p = new ValueValidator() { // from class: O1.I6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = M6.g(((Long) obj).longValue());
                return g4;
            }
        };
        f3860q = new ValueValidator() { // from class: O1.J6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = M6.h(((Long) obj).longValue());
                return h4;
            }
        };
        f3861r = new ValueValidator() { // from class: O1.K6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean i4;
                i4 = M6.i(((Long) obj).longValue());
                return i4;
            }
        };
        f3862s = new ListValidator() { // from class: O1.L6
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean j4;
                j4 = M6.j(list);
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
