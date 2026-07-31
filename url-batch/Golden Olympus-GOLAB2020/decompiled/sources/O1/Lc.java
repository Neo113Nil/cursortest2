package O1;

import O1.Hc;
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
public final class Lc implements JSONSerializable, JsonTemplate {

    /* renamed from: M, reason: collision with root package name */
    public static final b f3716M = new b(null);

    /* renamed from: N, reason: collision with root package name */
    private static final Expression f3717N;

    /* renamed from: O, reason: collision with root package name */
    private static final Expression f3718O;

    /* renamed from: P, reason: collision with root package name */
    private static final Yb.e f3719P;

    /* renamed from: Q, reason: collision with root package name */
    private static final Expression f3720Q;

    /* renamed from: R, reason: collision with root package name */
    private static final Expression f3721R;

    /* renamed from: S, reason: collision with root package name */
    private static final Yb.d f3722S;

    /* renamed from: T, reason: collision with root package name */
    private static final Function2 f3723T;

    /* renamed from: A, reason: collision with root package name */
    public final Field f3724A;

    /* renamed from: B, reason: collision with root package name */
    public final Field f3725B;

    /* renamed from: C, reason: collision with root package name */
    public final Field f3726C;

    /* renamed from: D, reason: collision with root package name */
    public final Field f3727D;

    /* renamed from: E, reason: collision with root package name */
    public final Field f3728E;

    /* renamed from: F, reason: collision with root package name */
    public final Field f3729F;

    /* renamed from: G, reason: collision with root package name */
    public final Field f3730G;

    /* renamed from: H, reason: collision with root package name */
    public final Field f3731H;

    /* renamed from: I, reason: collision with root package name */
    public final Field f3732I;

    /* renamed from: J, reason: collision with root package name */
    public final Field f3733J;

    /* renamed from: K, reason: collision with root package name */
    public final Field f3734K;

    /* renamed from: L, reason: collision with root package name */
    public final Field f3735L;

    /* renamed from: a, reason: collision with root package name */
    public final Field f3736a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f3737b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f3738c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f3739d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f3740e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f3741f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f3742g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f3743h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f3744i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f3745j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f3746k;

    /* renamed from: l, reason: collision with root package name */
    public final Field f3747l;

    /* renamed from: m, reason: collision with root package name */
    public final Field f3748m;

    /* renamed from: n, reason: collision with root package name */
    public final Field f3749n;

    /* renamed from: o, reason: collision with root package name */
    public final Field f3750o;

    /* renamed from: p, reason: collision with root package name */
    public final Field f3751p;

    /* renamed from: q, reason: collision with root package name */
    public final Field f3752q;

    /* renamed from: r, reason: collision with root package name */
    public final Field f3753r;

    /* renamed from: s, reason: collision with root package name */
    public final Field f3754s;

    /* renamed from: t, reason: collision with root package name */
    public final Field f3755t;

    /* renamed from: u, reason: collision with root package name */
    public final Field f3756u;

    /* renamed from: v, reason: collision with root package name */
    public final Field f3757v;

    /* renamed from: w, reason: collision with root package name */
    public final Field f3758w;

    /* renamed from: x, reason: collision with root package name */
    public final Field f3759x;

    /* renamed from: y, reason: collision with root package name */
    public final Field f3760y;

    /* renamed from: z, reason: collision with root package name */
    public final Field f3761z;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3762i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Lc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Lc(env, null, false, it, 6, null);
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
        f3717N = companion.constant(Double.valueOf(1.0d));
        f3718O = companion.constant(Boolean.TRUE);
        f3719P = new Yb.e(new C0765cg(null, null, null, 7, null));
        f3720Q = companion.constant(EnumC0979of.STATE_CHANGE);
        f3721R = companion.constant(Vf.VISIBLE);
        f3722S = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        f3723T = a.f3762i;
    }

    public Lc(Field accessibility, Field alignmentHorizontal, Field alignmentVertical, Field alpha, Field animators, Field background, Field border, Field clipToBounds, Field columnSpan, Field defaultStateId, Field disappearActions, Field divId, Field extensions, Field focus, Field functions, Field height, Field id, Field layoutProvider, Field margins, Field paddings, Field reuseId, Field rowSpan, Field selectedActions, Field stateIdVariable, Field states, Field tooltips, Field transform, Field transitionAnimationSelector, Field transitionChange, Field transitionIn, Field transitionOut, Field transitionTriggers, Field variableTriggers, Field variables, Field visibility, Field visibilityAction, Field visibilityActions, Field width) {
        Intrinsics.checkNotNullParameter(accessibility, "accessibility");
        Intrinsics.checkNotNullParameter(alignmentHorizontal, "alignmentHorizontal");
        Intrinsics.checkNotNullParameter(alignmentVertical, "alignmentVertical");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(animators, "animators");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(clipToBounds, "clipToBounds");
        Intrinsics.checkNotNullParameter(columnSpan, "columnSpan");
        Intrinsics.checkNotNullParameter(defaultStateId, "defaultStateId");
        Intrinsics.checkNotNullParameter(disappearActions, "disappearActions");
        Intrinsics.checkNotNullParameter(divId, "divId");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(functions, "functions");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutProvider, "layoutProvider");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(reuseId, "reuseId");
        Intrinsics.checkNotNullParameter(rowSpan, "rowSpan");
        Intrinsics.checkNotNullParameter(selectedActions, "selectedActions");
        Intrinsics.checkNotNullParameter(stateIdVariable, "stateIdVariable");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(tooltips, "tooltips");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(transitionAnimationSelector, "transitionAnimationSelector");
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
        this.f3736a = accessibility;
        this.f3737b = alignmentHorizontal;
        this.f3738c = alignmentVertical;
        this.f3739d = alpha;
        this.f3740e = animators;
        this.f3741f = background;
        this.f3742g = border;
        this.f3743h = clipToBounds;
        this.f3744i = columnSpan;
        this.f3745j = defaultStateId;
        this.f3746k = disappearActions;
        this.f3747l = divId;
        this.f3748m = extensions;
        this.f3749n = focus;
        this.f3750o = functions;
        this.f3751p = height;
        this.f3752q = id;
        this.f3753r = layoutProvider;
        this.f3754s = margins;
        this.f3755t = paddings;
        this.f3756u = reuseId;
        this.f3757v = rowSpan;
        this.f3758w = selectedActions;
        this.f3759x = stateIdVariable;
        this.f3760y = states;
        this.f3761z = tooltips;
        this.f3724A = transform;
        this.f3725B = transitionAnimationSelector;
        this.f3726C = transitionChange;
        this.f3727D = transitionIn;
        this.f3728E = transitionOut;
        this.f3729F = transitionTriggers;
        this.f3730G = variableTriggers;
        this.f3731H = variables;
        this.f3732I = visibility;
        this.f3733J = visibilityAction;
        this.f3734K = visibilityActions;
        this.f3735L = width;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Hc.g) BuiltInParserKt.getBuiltInParserComponent().o7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: f, reason: collision with root package name */
        public static final b f3763f = new b(null);

        /* renamed from: g, reason: collision with root package name */
        private static final Function2 f3764g = a.f3770i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f3765a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f3766b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f3767c;

        /* renamed from: d, reason: collision with root package name */
        public final Field f3768d;

        /* renamed from: e, reason: collision with root package name */
        public final Field f3769e;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f3770i = new a();

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

        public c(Field animationIn, Field animationOut, Field div, Field stateId, Field swipeOutActions) {
            Intrinsics.checkNotNullParameter(animationIn, "animationIn");
            Intrinsics.checkNotNullParameter(animationOut, "animationOut");
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(stateId, "stateId");
            Intrinsics.checkNotNullParameter(swipeOutActions, "swipeOutActions");
            this.f3765a = animationIn;
            this.f3766b = animationOut;
            this.f3767c = div;
            this.f3768d = stateId;
            this.f3769e = swipeOutActions;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Jc) BuiltInParserKt.getBuiltInParserComponent().r7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : cVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ParsingEnvironment env, c cVar, boolean z4, JSONObject json) {
            this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ Lc(ParsingEnvironment parsingEnvironment, Lc lc, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : lc, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Lc(ParsingEnvironment env, Lc lc, boolean z4, JSONObject json) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
