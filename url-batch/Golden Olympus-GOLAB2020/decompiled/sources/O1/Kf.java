package O1;

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
public abstract class Kf {

    /* renamed from: a, reason: collision with root package name */
    private static final e f3623a = new e(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Expression f3624b;

    /* renamed from: c, reason: collision with root package name */
    public static final Expression f3625c;

    /* renamed from: d, reason: collision with root package name */
    public static final Yb.e f3626d;

    /* renamed from: e, reason: collision with root package name */
    public static final Expression f3627e;

    /* renamed from: f, reason: collision with root package name */
    public static final Expression f3628f;

    /* renamed from: g, reason: collision with root package name */
    public static final Expression f3629g;

    /* renamed from: h, reason: collision with root package name */
    public static final Expression f3630h;

    /* renamed from: i, reason: collision with root package name */
    public static final Expression f3631i;

    /* renamed from: j, reason: collision with root package name */
    public static final Yb.d f3632j;

    /* renamed from: k, reason: collision with root package name */
    public static final TypeHelper f3633k;

    /* renamed from: l, reason: collision with root package name */
    public static final TypeHelper f3634l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeHelper f3635m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeHelper f3636n;

    /* renamed from: o, reason: collision with root package name */
    public static final ValueValidator f3637o;

    /* renamed from: p, reason: collision with root package name */
    public static final ValueValidator f3638p;

    /* renamed from: q, reason: collision with root package name */
    public static final ValueValidator f3639q;

    /* renamed from: r, reason: collision with root package name */
    public static final ListValidator f3640r;

    /* renamed from: s, reason: collision with root package name */
    public static final ListValidator f3641s;

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3642i = new a();

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
        public static final b f3643i = new b();

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
        public static final c f3644i = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Lf);
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f3645i = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof Vf);
        }
    }

    private static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    public static final class f implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3646a;

        public f(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3646a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ef deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonPropertyParser.readOptional(context, data, "accessibility", this.f3646a.H());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "alignment_horizontal", Kf.f3633k, EnumC1091v2.f8195e);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(context, data, "alignment_vertical", Kf.f3634l, EnumC1109w2.f8300e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Kf.f3637o;
            Expression expression = Kf.f3624b;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(context, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "animators", this.f3646a.q1());
            T2 t22 = (T2) JsonPropertyParser.readOptional(context, data, "aspect", this.f3646a.z1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = Kf.f3625c;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(context, data, "autostart", typeHelper2, function12, expression2);
            Expression expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f3646a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f3646a.I1());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "buffering_actions", this.f3646a.u0());
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(context, data, "column_span", typeHelper3, function13, Kf.f3638p);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(context, data, "disappear_actions", this.f3646a.M2());
            String str = (String) JsonPropertyParser.readOptional(context, data, "elapsed_time_variable");
            List readOptionalList5 = JsonPropertyParser.readOptionalList(context, data, "end_actions", this.f3646a.u0());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(context, data, "extensions", this.f3646a.Y2());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(context, data, "fatal_actions", this.f3646a.u0());
            W5 w5 = (W5) JsonPropertyParser.readOptional(context, data, "focus", this.f3646a.w3());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(context, data, "functions", this.f3646a.F3());
            Yb yb = (Yb) JsonPropertyParser.readOptional(context, data, "height", this.f3646a.V6());
            if (yb == null) {
                yb = Kf.f3626d;
            }
            Intrinsics.checkNotNullExpressionValue(yb, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) JsonPropertyParser.readOptional(context, data, "id");
            C1079u8 c1079u8 = (C1079u8) JsonPropertyParser.readOptional(context, data, "layout_provider", this.f3646a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f3646a.V2());
            Expression expression4 = Kf.f3627e;
            Yb yb2 = yb;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(context, data, "muted", typeHelper2, function12, expression4);
            Expression expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            C0754c5 c0754c52 = (C0754c5) JsonPropertyParser.readOptional(context, data, "paddings", this.f3646a.V2());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(context, data, "pause_actions", this.f3646a.u0());
            JSONObject jSONObject = (JSONObject) JsonPropertyParser.readOptional(context, data, "player_settings_payload");
            Expression expression6 = Kf.f3628f;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(context, data, "preload_required", typeHelper2, function12, expression6);
            Expression expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(context, data, "preview", typeHelper4);
            Expression expression8 = Kf.f3629g;
            Expression expression9 = expression;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(context, data, "repeatable", typeHelper2, function12, expression8);
            Expression expression10 = readOptionalExpression9 == null ? expression8 : readOptionalExpression9;
            List readOptionalList10 = JsonPropertyParser.readOptionalList(context, data, "resume_actions", this.f3646a.u0());
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(context, data, "reuse_id", typeHelper4);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(context, data, "row_span", typeHelper3, function13, Kf.f3639q);
            TypeHelper typeHelper5 = Kf.f3635m;
            Function1 function14 = Lf.f3789e;
            Expression expression11 = Kf.f3630h;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(context, data, "scale", typeHelper5, function14, expression11);
            Expression expression12 = readOptionalExpression12 == null ? expression11 : readOptionalExpression12;
            List readOptionalList11 = JsonPropertyParser.readOptionalList(context, data, "selected_actions", this.f3646a.u0());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(context, data, "tooltips", this.f3646a.J8());
            C0925lf c0925lf = (C0925lf) JsonPropertyParser.readOptional(context, data, "transform", this.f3646a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonPropertyParser.readOptional(context, data, "transition_change", this.f3646a.R1());
            O2 o22 = (O2) JsonPropertyParser.readOptional(context, data, "transition_in", this.f3646a.w1());
            O2 o23 = (O2) JsonPropertyParser.readOptional(context, data, "transition_out", this.f3646a.w1());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(context, data, "transition_triggers", EnumC0997pf.f7541e, Kf.f3640r);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(context, data, "variable_triggers", this.f3646a.Y8());
            List readOptionalList15 = JsonPropertyParser.readOptionalList(context, data, "variables", this.f3646a.e9());
            List readList = JsonPropertyParser.readList(context, data, "video_sources", this.f3646a.k9(), Kf.f3641s);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, … VIDEO_SOURCES_VALIDATOR)");
            TypeHelper typeHelper6 = Kf.f3636n;
            Function1 function15 = Vf.f5043e;
            Expression expression13 = Kf.f3631i;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(context, data, "visibility", typeHelper6, function15, expression13);
            if (readOptionalExpression13 != null) {
                expression13 = readOptionalExpression13;
            }
            Wf wf = (Wf) JsonPropertyParser.readOptional(context, data, "visibility_action", this.f3646a.q9());
            List readOptionalList16 = JsonPropertyParser.readOptionalList(context, data, "visibility_actions", this.f3646a.q9());
            Yb yb3 = (Yb) JsonPropertyParser.readOptional(context, data, "width", this.f3646a.V6());
            if (yb3 == null) {
                yb3 = Kf.f3632j;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new Ef(c0839h0, readOptionalExpression, readOptionalExpression2, expression9, readOptionalList, t22, expression3, readOptionalList2, c0860i3, readOptionalList3, readOptionalExpression5, readOptionalList4, str, readOptionalList5, readOptionalList6, readOptionalList7, w5, readOptionalList8, yb2, str2, c1079u8, c0754c5, expression5, c0754c52, readOptionalList9, jSONObject, expression7, readOptionalExpression8, expression10, readOptionalList10, readOptionalExpression10, readOptionalExpression11, expression12, readOptionalList11, readOptionalList12, c0925lf, abstractC1092v3, o22, o23, readOptionalList13, readOptionalList14, readOptionalList15, readList, expression13, wf, readOptionalList16, yb3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Ef value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(context, jSONObject, "accessibility", value.d(), this.f3646a.H());
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_horizontal", value.l(), EnumC1091v2.f8194d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alignment_vertical", value.s(), EnumC1109w2.f8299d);
            JsonExpressionParser.writeExpression(context, jSONObject, "alpha", value.v());
            JsonPropertyParser.writeList(context, jSONObject, "animators", value.u(), this.f3646a.q1());
            JsonPropertyParser.write(context, jSONObject, "aspect", value.f2677f, this.f3646a.z1());
            JsonExpressionParser.writeExpression(context, jSONObject, "autostart", value.f2678g);
            JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.getBackground(), this.f3646a.C1());
            JsonPropertyParser.write(context, jSONObject, "border", value.w(), this.f3646a.I1());
            JsonPropertyParser.writeList(context, jSONObject, "buffering_actions", value.f2681j, this.f3646a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "column_span", value.e());
            JsonPropertyParser.writeList(context, jSONObject, "disappear_actions", value.a(), this.f3646a.M2());
            JsonPropertyParser.write(context, jSONObject, "elapsed_time_variable", value.f2684m);
            JsonPropertyParser.writeList(context, jSONObject, "end_actions", value.f2685n, this.f3646a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "extensions", value.getExtensions(), this.f3646a.Y2());
            JsonPropertyParser.writeList(context, jSONObject, "fatal_actions", value.f2687p, this.f3646a.u0());
            JsonPropertyParser.write(context, jSONObject, "focus", value.x(), this.f3646a.w3());
            JsonPropertyParser.writeList(context, jSONObject, "functions", value.r(), this.f3646a.F3());
            JsonPropertyParser.write(context, jSONObject, "height", value.getHeight(), this.f3646a.V6());
            JsonPropertyParser.write(context, jSONObject, "id", value.getId());
            JsonPropertyParser.write(context, jSONObject, "layout_provider", value.m(), this.f3646a.M4());
            JsonPropertyParser.write(context, jSONObject, "margins", value.g(), this.f3646a.V2());
            JsonExpressionParser.writeExpression(context, jSONObject, "muted", value.f2694w);
            JsonPropertyParser.write(context, jSONObject, "paddings", value.i(), this.f3646a.V2());
            JsonPropertyParser.writeList(context, jSONObject, "pause_actions", value.f2696y, this.f3646a.u0());
            JsonPropertyParser.write(context, jSONObject, "player_settings_payload", value.f2697z);
            JsonExpressionParser.writeExpression(context, jSONObject, "preload_required", value.f2650A);
            JsonExpressionParser.writeExpression(context, jSONObject, "preview", value.f2651B);
            JsonExpressionParser.writeExpression(context, jSONObject, "repeatable", value.f2652C);
            JsonPropertyParser.writeList(context, jSONObject, "resume_actions", value.f2653D, this.f3646a.u0());
            JsonExpressionParser.writeExpression(context, jSONObject, "reuse_id", value.n());
            JsonExpressionParser.writeExpression(context, jSONObject, "row_span", value.h());
            JsonExpressionParser.writeExpression(context, jSONObject, "scale", value.f2656G, Lf.f3788d);
            JsonPropertyParser.writeList(context, jSONObject, "selected_actions", value.k(), this.f3646a.u0());
            JsonPropertyParser.writeList(context, jSONObject, "tooltips", value.p(), this.f3646a.J8());
            JsonPropertyParser.write(context, jSONObject, "transform", value.b(), this.f3646a.V8());
            JsonPropertyParser.write(context, jSONObject, "transition_change", value.z(), this.f3646a.R1());
            JsonPropertyParser.write(context, jSONObject, "transition_in", value.t(), this.f3646a.w1());
            JsonPropertyParser.write(context, jSONObject, "transition_out", value.y(), this.f3646a.w1());
            JsonPropertyParser.writeList(context, jSONObject, "transition_triggers", value.j(), EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "video");
            JsonPropertyParser.writeList(context, jSONObject, "variable_triggers", value.o(), this.f3646a.Y8());
            JsonPropertyParser.writeList(context, jSONObject, "variables", value.f(), this.f3646a.e9());
            JsonPropertyParser.writeList(context, jSONObject, "video_sources", value.f2666Q, this.f3646a.k9());
            JsonExpressionParser.writeExpression(context, jSONObject, "visibility", value.getVisibility(), Vf.f5042d);
            JsonPropertyParser.write(context, jSONObject, "visibility_action", value.q(), this.f3646a.q9());
            JsonPropertyParser.writeList(context, jSONObject, "visibility_actions", value.c(), this.f3646a.q9());
            JsonPropertyParser.write(context, jSONObject, "width", value.getWidth(), this.f3646a.V6());
            return jSONObject;
        }
    }

    public static final class g implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3647a;

        public g(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3647a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uf deserialize(ParsingContext context, Uf uf, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "accessibility", allowPropertyOverride, uf != null ? uf.f4978a : null, this.f3647a.I());
            Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…bilityJsonTemplateParser)");
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_horizontal", Kf.f3633k, allowPropertyOverride, uf != null ? uf.f4979b : null, EnumC1091v2.f8195e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…ntHorizontal.FROM_STRING)");
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alignment_vertical", Kf.f3634l, allowPropertyOverride, uf != null ? uf.f4980c : null, EnumC1109w2.f8300e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…mentVertical.FROM_STRING)");
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, uf != null ? uf.f4981d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, Kf.f3637o);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…_DOUBLE, ALPHA_VALIDATOR)");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "animators", allowPropertyOverride, uf != null ? uf.f4982e : null, this.f3647a.r1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…imatorJsonTemplateParser)");
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "aspect", allowPropertyOverride, uf != null ? uf.f4983f : null, this.f3647a.A1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…AspectJsonTemplateParser)");
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = uf != null ? uf.f4984g : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "autostart", typeHelper, allowPropertyOverride, field, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…utostart, ANY_TO_BOOLEAN)");
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, uf != null ? uf.f4985h : null, this.f3647a.D1());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…groundJsonTemplateParser)");
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, uf != null ? uf.f4986i : null, this.f3647a.J1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…BorderJsonTemplateParser)");
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "buffering_actions", allowPropertyOverride, uf != null ? uf.f4987j : null, this.f3647a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = uf != null ? uf.f4988k : null;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "column_span", typeHelper2, allowPropertyOverride, field2, function12, Kf.f3638p);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…T, COLUMN_SPAN_VALIDATOR)");
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "disappear_actions", allowPropertyOverride, uf != null ? uf.f4989l : null, this.f3647a.N2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField4, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "elapsed_time_variable", allowPropertyOverride, uf != null ? uf.f4990m : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField4, "readOptionalField(contex…ent?.elapsedTimeVariable)");
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "end_actions", allowPropertyOverride, uf != null ? uf.f4991n : null, this.f3647a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField5, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "extensions", allowPropertyOverride, uf != null ? uf.f4992o : null, this.f3647a.Z2());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField6, "readOptionalListField(co…ensionJsonTemplateParser)");
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "fatal_actions", allowPropertyOverride, uf != null ? uf.f4993p : null, this.f3647a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField7, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "focus", allowPropertyOverride, uf != null ? uf.f4994q : null, this.f3647a.x3());
            Intrinsics.checkNotNullExpressionValue(readOptionalField5, "readOptionalField(contex…vFocusJsonTemplateParser)");
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "functions", allowPropertyOverride, uf != null ? uf.f4995r : null, this.f3647a.G3());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField8, "readOptionalListField(co…nctionJsonTemplateParser)");
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height", allowPropertyOverride, uf != null ? uf.f4996s : null, this.f3647a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField6, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "id", allowPropertyOverride, uf != null ? uf.f4997t : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField7, "readOptionalField(contex…llowOverride, parent?.id)");
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "layout_provider", allowPropertyOverride, uf != null ? uf.f4998u : null, this.f3647a.N4());
            Intrinsics.checkNotNullExpressionValue(readOptionalField8, "readOptionalField(contex…oviderJsonTemplateParser)");
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, uf != null ? uf.f4999v : null, this.f3647a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField9, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "muted", typeHelper, allowPropertyOverride, uf != null ? uf.f5000w : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression6, "readOptionalFieldWithExp…t?.muted, ANY_TO_BOOLEAN)");
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "paddings", allowPropertyOverride, uf != null ? uf.f5001x : null, this.f3647a.W2());
            Intrinsics.checkNotNullExpressionValue(readOptionalField10, "readOptionalField(contex…InsetsJsonTemplateParser)");
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "pause_actions", allowPropertyOverride, uf != null ? uf.f5002y : null, this.f3647a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField9, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "player_settings_payload", allowPropertyOverride, uf != null ? uf.f5003z : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalField11, "readOptionalField(contex…t?.playerSettingsPayload)");
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "preload_required", typeHelper, allowPropertyOverride, uf != null ? uf.f4957A : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression7, "readOptionalFieldWithExp…Required, ANY_TO_BOOLEAN)");
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "preview", typeHelper3, allowPropertyOverride, uf != null ? uf.f4958B : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression8, "readOptionalFieldWithExp…verride, parent?.preview)");
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "repeatable", typeHelper, allowPropertyOverride, uf != null ? uf.f4959C : null, function1);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression9, "readOptionalFieldWithExp…peatable, ANY_TO_BOOLEAN)");
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "resume_actions", allowPropertyOverride, uf != null ? uf.f4960D : null, this.f3647a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField10, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "reuse_id", typeHelper3, allowPropertyOverride, uf != null ? uf.f4961E : null);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression10, "readOptionalFieldWithExp…verride, parent?.reuseId)");
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "row_span", typeHelper2, allowPropertyOverride, uf != null ? uf.f4962F : null, function12, Kf.f3639q);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression11, "readOptionalFieldWithExp…_INT, ROW_SPAN_VALIDATOR)");
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "scale", Kf.f3635m, allowPropertyOverride, uf != null ? uf.f4963G : null, Lf.f3789e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression12, "readOptionalFieldWithExp…ivVideoScale.FROM_STRING)");
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "selected_actions", allowPropertyOverride, uf != null ? uf.f4964H : null, this.f3647a.v0());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField11, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "tooltips", allowPropertyOverride, uf != null ? uf.f4965I : null, this.f3647a.K8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField12, "readOptionalListField(co…ooltipJsonTemplateParser)");
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transform", allowPropertyOverride, uf != null ? uf.f4966J : null, this.f3647a.W8());
            Intrinsics.checkNotNullExpressionValue(readOptionalField12, "readOptionalField(contex…nsformJsonTemplateParser)");
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_change", allowPropertyOverride, uf != null ? uf.f4967K : null, this.f3647a.S1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField13, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_in", allowPropertyOverride, uf != null ? uf.f4968L : null, this.f3647a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField14, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "transition_out", allowPropertyOverride, uf != null ? uf.f4969M : null, this.f3647a.x1());
            Intrinsics.checkNotNullExpressionValue(readOptionalField15, "readOptionalField(contex…sitionJsonTemplateParser)");
            Field field3 = uf != null ? uf.f4970N : null;
            Function1 function13 = EnumC0997pf.f7541e;
            ListValidator listValidator = Kf.f3640r;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "transition_triggers", allowPropertyOverride, field3, function13, listValidator);
            Intrinsics.checkNotNullExpressionValue(readOptionalListField13, "readOptionalListField(co…RIGGERS_VALIDATOR.cast())");
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variable_triggers", allowPropertyOverride, uf != null ? uf.f4971O : null, this.f3647a.Z8());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField14, "readOptionalListField(co…riggerJsonTemplateParser)");
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "variables", allowPropertyOverride, uf != null ? uf.f4972P : null, this.f3647a.f9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField15, "readOptionalListField(co…riableJsonTemplateParser)");
            Field field4 = uf != null ? uf.f4973Q : null;
            W1.h l9 = this.f3647a.l9();
            ListValidator listValidator2 = Kf.f3641s;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, "video_sources", allowPropertyOverride, field4, l9, listValidator2);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…SOURCES_VALIDATOR.cast())");
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "visibility", Kf.f3636n, allowPropertyOverride, uf != null ? uf.f4974R : null, Vf.f5043e);
            Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression13, "readOptionalFieldWithExp…ivVisibility.FROM_STRING)");
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "visibility_action", allowPropertyOverride, uf != null ? uf.f4975S : null, this.f3647a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalField16, "readOptionalField(contex…ActionJsonTemplateParser)");
            Field readOptionalListField16 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "visibility_actions", allowPropertyOverride, uf != null ? uf.f4976T : null, this.f3647a.r9());
            Intrinsics.checkNotNullExpressionValue(readOptionalListField16, "readOptionalListField(co…ActionJsonTemplateParser)");
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width", allowPropertyOverride, uf != null ? uf.f4977U : null, this.f3647a.W6());
            Intrinsics.checkNotNullExpressionValue(readOptionalField17, "readOptionalField(contex…ivSizeJsonTemplateParser)");
            return new Uf(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField2, readOptionalField3, readOptionalListField3, readOptionalFieldWithExpression5, readOptionalListField4, readOptionalField4, readOptionalListField5, readOptionalListField6, readOptionalListField7, readOptionalField5, readOptionalListField8, readOptionalField6, readOptionalField7, readOptionalField8, readOptionalField9, readOptionalFieldWithExpression6, readOptionalField10, readOptionalListField9, readOptionalField11, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField10, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalListField11, readOptionalListField12, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalListField13, readOptionalListField14, readOptionalListField15, readListField, readOptionalFieldWithExpression13, readOptionalField16, readOptionalListField16, readOptionalField17);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, Uf value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(context, jSONObject, "accessibility", value.f4978a, this.f3647a.I());
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_horizontal", value.f4979b, EnumC1091v2.f8194d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alignment_vertical", value.f4980c, EnumC1109w2.f8299d);
            JsonFieldParser.writeExpressionField(context, jSONObject, "alpha", value.f4981d);
            JsonFieldParser.writeListField(context, jSONObject, "animators", value.f4982e, this.f3647a.r1());
            JsonFieldParser.writeField(context, jSONObject, "aspect", value.f4983f, this.f3647a.A1());
            JsonFieldParser.writeExpressionField(context, jSONObject, "autostart", value.f4984g);
            JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f4985h, this.f3647a.D1());
            JsonFieldParser.writeField(context, jSONObject, "border", value.f4986i, this.f3647a.J1());
            JsonFieldParser.writeListField(context, jSONObject, "buffering_actions", value.f4987j, this.f3647a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "column_span", value.f4988k);
            JsonFieldParser.writeListField(context, jSONObject, "disappear_actions", value.f4989l, this.f3647a.N2());
            JsonFieldParser.writeField(context, jSONObject, "elapsed_time_variable", value.f4990m);
            JsonFieldParser.writeListField(context, jSONObject, "end_actions", value.f4991n, this.f3647a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "extensions", value.f4992o, this.f3647a.Z2());
            JsonFieldParser.writeListField(context, jSONObject, "fatal_actions", value.f4993p, this.f3647a.v0());
            JsonFieldParser.writeField(context, jSONObject, "focus", value.f4994q, this.f3647a.x3());
            JsonFieldParser.writeListField(context, jSONObject, "functions", value.f4995r, this.f3647a.G3());
            JsonFieldParser.writeField(context, jSONObject, "height", value.f4996s, this.f3647a.W6());
            JsonFieldParser.writeField(context, jSONObject, "id", value.f4997t);
            JsonFieldParser.writeField(context, jSONObject, "layout_provider", value.f4998u, this.f3647a.N4());
            JsonFieldParser.writeField(context, jSONObject, "margins", value.f4999v, this.f3647a.W2());
            JsonFieldParser.writeExpressionField(context, jSONObject, "muted", value.f5000w);
            JsonFieldParser.writeField(context, jSONObject, "paddings", value.f5001x, this.f3647a.W2());
            JsonFieldParser.writeListField(context, jSONObject, "pause_actions", value.f5002y, this.f3647a.v0());
            JsonFieldParser.writeField(context, jSONObject, "player_settings_payload", value.f5003z);
            JsonFieldParser.writeExpressionField(context, jSONObject, "preload_required", value.f4957A);
            JsonFieldParser.writeExpressionField(context, jSONObject, "preview", value.f4958B);
            JsonFieldParser.writeExpressionField(context, jSONObject, "repeatable", value.f4959C);
            JsonFieldParser.writeListField(context, jSONObject, "resume_actions", value.f4960D, this.f3647a.v0());
            JsonFieldParser.writeExpressionField(context, jSONObject, "reuse_id", value.f4961E);
            JsonFieldParser.writeExpressionField(context, jSONObject, "row_span", value.f4962F);
            JsonFieldParser.writeExpressionField(context, jSONObject, "scale", value.f4963G, Lf.f3788d);
            JsonFieldParser.writeListField(context, jSONObject, "selected_actions", value.f4964H, this.f3647a.v0());
            JsonFieldParser.writeListField(context, jSONObject, "tooltips", value.f4965I, this.f3647a.K8());
            JsonFieldParser.writeField(context, jSONObject, "transform", value.f4966J, this.f3647a.W8());
            JsonFieldParser.writeField(context, jSONObject, "transition_change", value.f4967K, this.f3647a.S1());
            JsonFieldParser.writeField(context, jSONObject, "transition_in", value.f4968L, this.f3647a.x1());
            JsonFieldParser.writeField(context, jSONObject, "transition_out", value.f4969M, this.f3647a.x1());
            JsonFieldParser.writeListField(context, jSONObject, "transition_triggers", value.f4970N, EnumC0997pf.f7540d);
            JsonPropertyParser.write(context, jSONObject, "type", "video");
            JsonFieldParser.writeListField(context, jSONObject, "variable_triggers", value.f4971O, this.f3647a.Z8());
            JsonFieldParser.writeListField(context, jSONObject, "variables", value.f4972P, this.f3647a.f9());
            JsonFieldParser.writeListField(context, jSONObject, "video_sources", value.f4973Q, this.f3647a.l9());
            JsonFieldParser.writeExpressionField(context, jSONObject, "visibility", value.f4974R, Vf.f5042d);
            JsonFieldParser.writeField(context, jSONObject, "visibility_action", value.f4975S, this.f3647a.r9());
            JsonFieldParser.writeListField(context, jSONObject, "visibility_actions", value.f4976T, this.f3647a.r9());
            JsonFieldParser.writeField(context, jSONObject, "width", value.f4977U, this.f3647a.W6());
            return jSONObject;
        }
    }

    public static final class h implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3648a;

        public h(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3648a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ef resolve(ParsingContext context, Uf template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            C0839h0 c0839h0 = (C0839h0) JsonFieldResolver.resolveOptional(context, template.f4978a, data, "accessibility", this.f3648a.J(), this.f3648a.H());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f4979b, data, "alignment_horizontal", Kf.f3633k, EnumC1091v2.f8195e);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(context, template.f4980c, data, "alignment_vertical", Kf.f3634l, EnumC1109w2.f8300e);
            Field field = template.f4981d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = Kf.f3637o;
            Expression expression = Kf.f3624b;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(context, field, data, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f4982e, data, "animators", this.f3648a.s1(), this.f3648a.q1());
            T2 t22 = (T2) JsonFieldResolver.resolveOptional(context, template.f4983f, data, "aspect", this.f3648a.B1(), this.f3648a.z1());
            Field field2 = template.f4984g;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = Kf.f3625c;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(context, field2, data, "autostart", typeHelper2, function12, expression2);
            Expression expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f4985h, data, io.appmetrica.analytics.impl.L2.f37912g, this.f3648a.E1(), this.f3648a.C1());
            C0860i3 c0860i3 = (C0860i3) JsonFieldResolver.resolveOptional(context, template.f4986i, data, "border", this.f3648a.K1(), this.f3648a.I1());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f4987j, data, "buffering_actions", this.f3648a.w0(), this.f3648a.u0());
            Field field3 = template.f4988k;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(context, field3, data, "column_span", typeHelper3, function13, Kf.f3638p);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(context, template.f4989l, data, "disappear_actions", this.f3648a.O2(), this.f3648a.M2());
            String str = (String) JsonFieldResolver.resolveOptional(context, template.f4990m, data, "elapsed_time_variable");
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(context, template.f4991n, data, "end_actions", this.f3648a.w0(), this.f3648a.u0());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(context, template.f4992o, data, "extensions", this.f3648a.a3(), this.f3648a.Y2());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(context, template.f4993p, data, "fatal_actions", this.f3648a.w0(), this.f3648a.u0());
            W5 w5 = (W5) JsonFieldResolver.resolveOptional(context, template.f4994q, data, "focus", this.f3648a.y3(), this.f3648a.w3());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(context, template.f4995r, data, "functions", this.f3648a.H3(), this.f3648a.F3());
            Yb yb = (Yb) JsonFieldResolver.resolveOptional(context, template.f4996s, data, "height", this.f3648a.X6(), this.f3648a.V6());
            if (yb == null) {
                yb = Kf.f3626d;
            }
            Yb yb2 = yb;
            Intrinsics.checkNotNullExpressionValue(yb2, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) JsonFieldResolver.resolveOptional(context, template.f4997t, data, "id");
            C1079u8 c1079u8 = (C1079u8) JsonFieldResolver.resolveOptional(context, template.f4998u, data, "layout_provider", this.f3648a.O4(), this.f3648a.M4());
            C0754c5 c0754c5 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f4999v, data, "margins", this.f3648a.X2(), this.f3648a.V2());
            Field field4 = template.f5000w;
            Expression expression4 = Kf.f3627e;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(context, field4, data, "muted", typeHelper2, function12, expression4);
            Expression expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            C0754c5 c0754c52 = (C0754c5) JsonFieldResolver.resolveOptional(context, template.f5001x, data, "paddings", this.f3648a.X2(), this.f3648a.V2());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(context, template.f5002y, data, "pause_actions", this.f3648a.w0(), this.f3648a.u0());
            JSONObject jSONObject = (JSONObject) JsonFieldResolver.resolveOptional(context, template.f5003z, data, "player_settings_payload");
            Field field5 = template.f4957A;
            Expression expression6 = Kf.f3628f;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(context, field5, data, "preload_required", typeHelper2, function12, expression6);
            Expression expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            Field field6 = template.f4958B;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(context, field6, data, "preview", typeHelper4);
            Field field7 = template.f4959C;
            Expression expression8 = Kf.f3629g;
            Expression expression9 = expression;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(context, field7, data, "repeatable", typeHelper2, function12, expression8);
            Expression expression10 = resolveOptionalExpression9 == null ? expression8 : resolveOptionalExpression9;
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(context, template.f4960D, data, "resume_actions", this.f3648a.w0(), this.f3648a.u0());
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(context, template.f4961E, data, "reuse_id", typeHelper4);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(context, template.f4962F, data, "row_span", typeHelper3, function13, Kf.f3639q);
            Field field8 = template.f4963G;
            TypeHelper typeHelper5 = Kf.f3635m;
            Function1 function14 = Lf.f3789e;
            Expression expression11 = Kf.f3630h;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(context, field8, data, "scale", typeHelper5, function14, expression11);
            Expression expression12 = resolveOptionalExpression12 == null ? expression11 : resolveOptionalExpression12;
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(context, template.f4964H, data, "selected_actions", this.f3648a.w0(), this.f3648a.u0());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(context, template.f4965I, data, "tooltips", this.f3648a.L8(), this.f3648a.J8());
            C0925lf c0925lf = (C0925lf) JsonFieldResolver.resolveOptional(context, template.f4966J, data, "transform", this.f3648a.X8(), this.f3648a.V8());
            AbstractC1092v3 abstractC1092v3 = (AbstractC1092v3) JsonFieldResolver.resolveOptional(context, template.f4967K, data, "transition_change", this.f3648a.T1(), this.f3648a.R1());
            O2 o22 = (O2) JsonFieldResolver.resolveOptional(context, template.f4968L, data, "transition_in", this.f3648a.y1(), this.f3648a.w1());
            O2 o23 = (O2) JsonFieldResolver.resolveOptional(context, template.f4969M, data, "transition_out", this.f3648a.y1(), this.f3648a.w1());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(context, template.f4970N, data, "transition_triggers", EnumC0997pf.f7541e, Kf.f3640r);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(context, template.f4971O, data, "variable_triggers", this.f3648a.a9(), this.f3648a.Y8());
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(context, template.f4972P, data, "variables", this.f3648a.g9(), this.f3648a.e9());
            List resolveList = JsonFieldResolver.resolveList(context, template.f4973Q, data, "video_sources", this.f3648a.m9(), this.f3648a.k9(), Kf.f3641s);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem… VIDEO_SOURCES_VALIDATOR)");
            Field field9 = template.f4974R;
            TypeHelper typeHelper6 = Kf.f3636n;
            Function1 function15 = Vf.f5043e;
            Expression expression13 = Kf.f3631i;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(context, field9, data, "visibility", typeHelper6, function15, expression13);
            if (resolveOptionalExpression13 != null) {
                expression13 = resolveOptionalExpression13;
            }
            Wf wf = (Wf) JsonFieldResolver.resolveOptional(context, template.f4975S, data, "visibility_action", this.f3648a.s9(), this.f3648a.q9());
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(context, template.f4976T, data, "visibility_actions", this.f3648a.s9(), this.f3648a.q9());
            Yb yb3 = (Yb) JsonFieldResolver.resolveOptional(context, template.f4977U, data, "width", this.f3648a.X6(), this.f3648a.V6());
            if (yb3 == null) {
                yb3 = Kf.f3632j;
            }
            Intrinsics.checkNotNullExpressionValue(yb3, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new Ef(c0839h0, resolveOptionalExpression, resolveOptionalExpression2, expression9, resolveOptionalList, t22, expression3, resolveOptionalList2, c0860i3, resolveOptionalList3, resolveOptionalExpression5, resolveOptionalList4, str, resolveOptionalList5, resolveOptionalList6, resolveOptionalList7, w5, resolveOptionalList8, yb2, str2, c1079u8, c0754c5, expression5, c0754c52, resolveOptionalList9, jSONObject, expression7, resolveOptionalExpression8, expression10, resolveOptionalList10, resolveOptionalExpression10, resolveOptionalExpression11, expression12, resolveOptionalList11, resolveOptionalList12, c0925lf, abstractC1092v3, o22, o23, resolveOptionalList13, resolveOptionalList14, resolveOptionalList15, resolveList, expression13, wf, resolveOptionalList16, yb3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f3624b = companion.constant(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        f3625c = companion.constant(bool);
        f3626d = new Yb.e(new C0765cg(null, null, null, 7, null));
        f3627e = companion.constant(bool);
        f3628f = companion.constant(bool);
        f3629g = companion.constant(bool);
        f3630h = companion.constant(Lf.FIT);
        f3631i = companion.constant(Vf.VISIBLE);
        f3632j = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f3633k = companion2.from(AbstractC3219i.G(EnumC1091v2.values()), a.f3642i);
        f3634l = companion2.from(AbstractC3219i.G(EnumC1109w2.values()), b.f3643i);
        f3635m = companion2.from(AbstractC3219i.G(Lf.values()), c.f3644i);
        f3636n = companion2.from(AbstractC3219i.G(Vf.values()), d.f3645i);
        f3637o = new ValueValidator() { // from class: O1.Ff
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean f4;
                f4 = Kf.f(((Double) obj).doubleValue());
                return f4;
            }
        };
        f3638p = new ValueValidator() { // from class: O1.Gf
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean g4;
                g4 = Kf.g(((Long) obj).longValue());
                return g4;
            }
        };
        f3639q = new ValueValidator() { // from class: O1.Hf
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean h4;
                h4 = Kf.h(((Long) obj).longValue());
                return h4;
            }
        };
        f3640r = new ListValidator() { // from class: O1.If
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean i4;
                i4 = Kf.i(list);
                return i4;
            }
        };
        f3641s = new ListValidator() { // from class: O1.Jf
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean j4;
                j4 = Kf.j(list);
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
    public static final boolean i(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
