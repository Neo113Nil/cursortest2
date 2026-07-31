package O1;

import O1.Ab;
import O1.Bb;
import O1.C1127x2;
import O1.Gb;
import O1.Yb;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Hb implements JSONSerializable, JsonTemplate {

    /* renamed from: R, reason: collision with root package name */
    public static final b f2993R = new b(null);

    /* renamed from: S, reason: collision with root package name */
    private static final C1127x2 f2994S;

    /* renamed from: T, reason: collision with root package name */
    private static final Expression f2995T;

    /* renamed from: U, reason: collision with root package name */
    private static final Expression f2996U;

    /* renamed from: V, reason: collision with root package name */
    private static final Yb.e f2997V;

    /* renamed from: W, reason: collision with root package name */
    private static final Expression f2998W;

    /* renamed from: X, reason: collision with root package name */
    private static final Yb.d f2999X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Function2 f3000Y;

    /* renamed from: A, reason: collision with root package name */
    public final Field f3001A;

    /* renamed from: B, reason: collision with root package name */
    public final Field f3002B;

    /* renamed from: C, reason: collision with root package name */
    public final Field f3003C;

    /* renamed from: D, reason: collision with root package name */
    public final Field f3004D;

    /* renamed from: E, reason: collision with root package name */
    public final Field f3005E;

    /* renamed from: F, reason: collision with root package name */
    public final Field f3006F;

    /* renamed from: G, reason: collision with root package name */
    public final Field f3007G;

    /* renamed from: H, reason: collision with root package name */
    public final Field f3008H;

    /* renamed from: I, reason: collision with root package name */
    public final Field f3009I;

    /* renamed from: J, reason: collision with root package name */
    public final Field f3010J;

    /* renamed from: K, reason: collision with root package name */
    public final Field f3011K;

    /* renamed from: L, reason: collision with root package name */
    public final Field f3012L;

    /* renamed from: M, reason: collision with root package name */
    public final Field f3013M;

    /* renamed from: N, reason: collision with root package name */
    public final Field f3014N;

    /* renamed from: O, reason: collision with root package name */
    public final Field f3015O;

    /* renamed from: P, reason: collision with root package name */
    public final Field f3016P;

    /* renamed from: Q, reason: collision with root package name */
    public final Field f3017Q;

    /* renamed from: a, reason: collision with root package name */
    public final Field f3018a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f3019b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f3020c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f3021d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f3022e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f3023f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f3024g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f3025h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f3026i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f3027j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f3028k;

    /* renamed from: l, reason: collision with root package name */
    public final Field f3029l;

    /* renamed from: m, reason: collision with root package name */
    public final Field f3030m;

    /* renamed from: n, reason: collision with root package name */
    public final Field f3031n;

    /* renamed from: o, reason: collision with root package name */
    public final Field f3032o;

    /* renamed from: p, reason: collision with root package name */
    public final Field f3033p;

    /* renamed from: q, reason: collision with root package name */
    public final Field f3034q;

    /* renamed from: r, reason: collision with root package name */
    public final Field f3035r;

    /* renamed from: s, reason: collision with root package name */
    public final Field f3036s;

    /* renamed from: t, reason: collision with root package name */
    public final Field f3037t;

    /* renamed from: u, reason: collision with root package name */
    public final Field f3038u;

    /* renamed from: v, reason: collision with root package name */
    public final Field f3039v;

    /* renamed from: w, reason: collision with root package name */
    public final Field f3040w;

    /* renamed from: x, reason: collision with root package name */
    public final Field f3041x;

    /* renamed from: y, reason: collision with root package name */
    public final Field f3042y;

    /* renamed from: z, reason: collision with root package name */
    public final Field f3043z;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3044i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Hb invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Hb(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant = companion.constant(100L);
        Expression constant2 = companion.constant(Double.valueOf(0.6d));
        Expression constant3 = companion.constant(C1127x2.c.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f2994S = new C1127x2(constant, constant2, null, null, constant3, null, null, companion.constant(valueOf), 108, null);
        f2995T = companion.constant(valueOf);
        f2996U = companion.constant(Boolean.TRUE);
        f2997V = new Yb.e(new C0765cg(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        f2998W = companion.constant(Vf.VISIBLE);
        f2999X = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        f3000Y = a.f3044i;
    }

    public Hb(Field accessibility, Field action, Field actionAnimation, Field actions, Field alignmentHorizontal, Field alignmentVertical, Field alpha, Field animators, Field background, Field border, Field captureFocusOnAction, Field columnSpan, Field delimiterStyle, Field disappearActions, Field doubletapActions, Field extensions, Field focus, Field functions, Field height, Field hoverEndActions, Field hoverStartActions, Field id, Field layoutProvider, Field longtapActions, Field margins, Field paddings, Field pressEndActions, Field pressStartActions, Field reuseId, Field rowSpan, Field selectedActions, Field tooltips, Field transform, Field transitionChange, Field transitionIn, Field transitionOut, Field transitionTriggers, Field variableTriggers, Field variables, Field visibility, Field visibilityAction, Field visibilityActions, Field width) {
        Intrinsics.checkNotNullParameter(accessibility, "accessibility");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(actionAnimation, "actionAnimation");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(alignmentHorizontal, "alignmentHorizontal");
        Intrinsics.checkNotNullParameter(alignmentVertical, "alignmentVertical");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(animators, "animators");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "captureFocusOnAction");
        Intrinsics.checkNotNullParameter(columnSpan, "columnSpan");
        Intrinsics.checkNotNullParameter(delimiterStyle, "delimiterStyle");
        Intrinsics.checkNotNullParameter(disappearActions, "disappearActions");
        Intrinsics.checkNotNullParameter(doubletapActions, "doubletapActions");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(functions, "functions");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(hoverEndActions, "hoverEndActions");
        Intrinsics.checkNotNullParameter(hoverStartActions, "hoverStartActions");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutProvider, "layoutProvider");
        Intrinsics.checkNotNullParameter(longtapActions, "longtapActions");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(pressEndActions, "pressEndActions");
        Intrinsics.checkNotNullParameter(pressStartActions, "pressStartActions");
        Intrinsics.checkNotNullParameter(reuseId, "reuseId");
        Intrinsics.checkNotNullParameter(rowSpan, "rowSpan");
        Intrinsics.checkNotNullParameter(selectedActions, "selectedActions");
        Intrinsics.checkNotNullParameter(tooltips, "tooltips");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(transitionChange, "transitionChange");
        Intrinsics.checkNotNullParameter(transitionIn, "transitionIn");
        Intrinsics.checkNotNullParameter(transitionOut, "transitionOut");
        Intrinsics.checkNotNullParameter(transitionTriggers, "transitionTriggers");
        Intrinsics.checkNotNullParameter(variableTriggers, "variableTriggers");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(visibilityAction, "visibilityAction");
        Intrinsics.checkNotNullParameter(visibilityActions, "visibilityActions");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f3018a = accessibility;
        this.f3019b = action;
        this.f3020c = actionAnimation;
        this.f3021d = actions;
        this.f3022e = alignmentHorizontal;
        this.f3023f = alignmentVertical;
        this.f3024g = alpha;
        this.f3025h = animators;
        this.f3026i = background;
        this.f3027j = border;
        this.f3028k = captureFocusOnAction;
        this.f3029l = columnSpan;
        this.f3030m = delimiterStyle;
        this.f3031n = disappearActions;
        this.f3032o = doubletapActions;
        this.f3033p = extensions;
        this.f3034q = focus;
        this.f3035r = functions;
        this.f3036s = height;
        this.f3037t = hoverEndActions;
        this.f3038u = hoverStartActions;
        this.f3039v = id;
        this.f3040w = layoutProvider;
        this.f3041x = longtapActions;
        this.f3042y = margins;
        this.f3043z = paddings;
        this.f3001A = pressEndActions;
        this.f3002B = pressStartActions;
        this.f3003C = reuseId;
        this.f3004D = rowSpan;
        this.f3005E = selectedActions;
        this.f3006F = tooltips;
        this.f3007G = transform;
        this.f3008H = transitionChange;
        this.f3009I = transitionIn;
        this.f3010J = transitionOut;
        this.f3011K = transitionTriggers;
        this.f3012L = variableTriggers;
        this.f3013M = variables;
        this.f3014N = visibility;
        this.f3015O = visibilityAction;
        this.f3016P = visibilityActions;
        this.f3017Q = width;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Gb.f) BuiltInParserKt.getBuiltInParserComponent().K6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: c, reason: collision with root package name */
        public static final b f3045c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Expression f3046d;

        /* renamed from: e, reason: collision with root package name */
        private static final Expression f3047e;

        /* renamed from: f, reason: collision with root package name */
        private static final Function2 f3048f;

        /* renamed from: a, reason: collision with root package name */
        public final Field f3049a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f3050b;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f3051i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return new c(env, null, false, it, 6, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f3046d = companion.constant(335544320);
            f3047e = companion.constant(Ab.c.EnumC0024c.HORIZONTAL);
            f3048f = a.f3051i;
        }

        public c(Field color, Field orientation) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.f3049a = color;
            this.f3050b = orientation;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Bb.d) BuiltInParserKt.getBuiltInParserComponent().H6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : cVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ParsingEnvironment env, c cVar, boolean z4, JSONObject json) {
            this(r1.nullField(false), r1.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ Hb(ParsingEnvironment parsingEnvironment, Hb hb, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : hb, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Hb(ParsingEnvironment env, Hb hb, boolean z4, JSONObject json) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
