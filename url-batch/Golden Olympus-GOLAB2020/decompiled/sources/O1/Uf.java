package O1;

import O1.Kf;
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
public final class Uf implements JSONSerializable, JsonTemplate {

    /* renamed from: V, reason: collision with root package name */
    public static final b f4946V = new b(null);

    /* renamed from: W, reason: collision with root package name */
    private static final Expression f4947W;

    /* renamed from: X, reason: collision with root package name */
    private static final Expression f4948X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Yb.e f4949Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final Expression f4950Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final Expression f4951a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final Expression f4952b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final Expression f4953c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final Expression f4954d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Yb.d f4955e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final Function2 f4956f0;

    /* renamed from: A, reason: collision with root package name */
    public final Field f4957A;

    /* renamed from: B, reason: collision with root package name */
    public final Field f4958B;

    /* renamed from: C, reason: collision with root package name */
    public final Field f4959C;

    /* renamed from: D, reason: collision with root package name */
    public final Field f4960D;

    /* renamed from: E, reason: collision with root package name */
    public final Field f4961E;

    /* renamed from: F, reason: collision with root package name */
    public final Field f4962F;

    /* renamed from: G, reason: collision with root package name */
    public final Field f4963G;

    /* renamed from: H, reason: collision with root package name */
    public final Field f4964H;

    /* renamed from: I, reason: collision with root package name */
    public final Field f4965I;

    /* renamed from: J, reason: collision with root package name */
    public final Field f4966J;

    /* renamed from: K, reason: collision with root package name */
    public final Field f4967K;

    /* renamed from: L, reason: collision with root package name */
    public final Field f4968L;

    /* renamed from: M, reason: collision with root package name */
    public final Field f4969M;

    /* renamed from: N, reason: collision with root package name */
    public final Field f4970N;

    /* renamed from: O, reason: collision with root package name */
    public final Field f4971O;

    /* renamed from: P, reason: collision with root package name */
    public final Field f4972P;

    /* renamed from: Q, reason: collision with root package name */
    public final Field f4973Q;

    /* renamed from: R, reason: collision with root package name */
    public final Field f4974R;

    /* renamed from: S, reason: collision with root package name */
    public final Field f4975S;

    /* renamed from: T, reason: collision with root package name */
    public final Field f4976T;

    /* renamed from: U, reason: collision with root package name */
    public final Field f4977U;

    /* renamed from: a, reason: collision with root package name */
    public final Field f4978a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f4979b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f4980c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f4981d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f4982e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f4983f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f4984g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f4985h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f4986i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f4987j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f4988k;

    /* renamed from: l, reason: collision with root package name */
    public final Field f4989l;

    /* renamed from: m, reason: collision with root package name */
    public final Field f4990m;

    /* renamed from: n, reason: collision with root package name */
    public final Field f4991n;

    /* renamed from: o, reason: collision with root package name */
    public final Field f4992o;

    /* renamed from: p, reason: collision with root package name */
    public final Field f4993p;

    /* renamed from: q, reason: collision with root package name */
    public final Field f4994q;

    /* renamed from: r, reason: collision with root package name */
    public final Field f4995r;

    /* renamed from: s, reason: collision with root package name */
    public final Field f4996s;

    /* renamed from: t, reason: collision with root package name */
    public final Field f4997t;

    /* renamed from: u, reason: collision with root package name */
    public final Field f4998u;

    /* renamed from: v, reason: collision with root package name */
    public final Field f4999v;

    /* renamed from: w, reason: collision with root package name */
    public final Field f5000w;

    /* renamed from: x, reason: collision with root package name */
    public final Field f5001x;

    /* renamed from: y, reason: collision with root package name */
    public final Field f5002y;

    /* renamed from: z, reason: collision with root package name */
    public final Field f5003z;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5004i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Uf(env, null, false, it, 6, null);
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
        f4947W = companion.constant(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        f4948X = companion.constant(bool);
        f4949Y = new Yb.e(new C0765cg(null, null, null, 7, null));
        f4950Z = companion.constant(bool);
        f4951a0 = companion.constant(bool);
        f4952b0 = companion.constant(bool);
        f4953c0 = companion.constant(Lf.FIT);
        f4954d0 = companion.constant(Vf.VISIBLE);
        f4955e0 = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        f4956f0 = a.f5004i;
    }

    public Uf(Field accessibility, Field alignmentHorizontal, Field alignmentVertical, Field alpha, Field animators, Field aspect, Field autostart, Field background, Field border, Field bufferingActions, Field columnSpan, Field disappearActions, Field elapsedTimeVariable, Field endActions, Field extensions, Field fatalActions, Field focus, Field functions, Field height, Field id, Field layoutProvider, Field margins, Field muted, Field paddings, Field pauseActions, Field playerSettingsPayload, Field preloadRequired, Field preview, Field repeatable, Field resumeActions, Field reuseId, Field rowSpan, Field scale, Field selectedActions, Field tooltips, Field transform, Field transitionChange, Field transitionIn, Field transitionOut, Field transitionTriggers, Field variableTriggers, Field variables, Field videoSources, Field visibility, Field visibilityAction, Field visibilityActions, Field width) {
        Intrinsics.checkNotNullParameter(accessibility, "accessibility");
        Intrinsics.checkNotNullParameter(alignmentHorizontal, "alignmentHorizontal");
        Intrinsics.checkNotNullParameter(alignmentVertical, "alignmentVertical");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(animators, "animators");
        Intrinsics.checkNotNullParameter(aspect, "aspect");
        Intrinsics.checkNotNullParameter(autostart, "autostart");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(bufferingActions, "bufferingActions");
        Intrinsics.checkNotNullParameter(columnSpan, "columnSpan");
        Intrinsics.checkNotNullParameter(disappearActions, "disappearActions");
        Intrinsics.checkNotNullParameter(elapsedTimeVariable, "elapsedTimeVariable");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(fatalActions, "fatalActions");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(functions, "functions");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutProvider, "layoutProvider");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(muted, "muted");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(pauseActions, "pauseActions");
        Intrinsics.checkNotNullParameter(playerSettingsPayload, "playerSettingsPayload");
        Intrinsics.checkNotNullParameter(preloadRequired, "preloadRequired");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(repeatable, "repeatable");
        Intrinsics.checkNotNullParameter(resumeActions, "resumeActions");
        Intrinsics.checkNotNullParameter(reuseId, "reuseId");
        Intrinsics.checkNotNullParameter(rowSpan, "rowSpan");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(selectedActions, "selectedActions");
        Intrinsics.checkNotNullParameter(tooltips, "tooltips");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(transitionChange, "transitionChange");
        Intrinsics.checkNotNullParameter(transitionIn, "transitionIn");
        Intrinsics.checkNotNullParameter(transitionOut, "transitionOut");
        Intrinsics.checkNotNullParameter(transitionTriggers, "transitionTriggers");
        Intrinsics.checkNotNullParameter(variableTriggers, "variableTriggers");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(videoSources, "videoSources");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(visibilityAction, "visibilityAction");
        Intrinsics.checkNotNullParameter(visibilityActions, "visibilityActions");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f4978a = accessibility;
        this.f4979b = alignmentHorizontal;
        this.f4980c = alignmentVertical;
        this.f4981d = alpha;
        this.f4982e = animators;
        this.f4983f = aspect;
        this.f4984g = autostart;
        this.f4985h = background;
        this.f4986i = border;
        this.f4987j = bufferingActions;
        this.f4988k = columnSpan;
        this.f4989l = disappearActions;
        this.f4990m = elapsedTimeVariable;
        this.f4991n = endActions;
        this.f4992o = extensions;
        this.f4993p = fatalActions;
        this.f4994q = focus;
        this.f4995r = functions;
        this.f4996s = height;
        this.f4997t = id;
        this.f4998u = layoutProvider;
        this.f4999v = margins;
        this.f5000w = muted;
        this.f5001x = paddings;
        this.f5002y = pauseActions;
        this.f5003z = playerSettingsPayload;
        this.f4957A = preloadRequired;
        this.f4958B = preview;
        this.f4959C = repeatable;
        this.f4960D = resumeActions;
        this.f4961E = reuseId;
        this.f4962F = rowSpan;
        this.f4963G = scale;
        this.f4964H = selectedActions;
        this.f4965I = tooltips;
        this.f4966J = transform;
        this.f4967K = transitionChange;
        this.f4968L = transitionIn;
        this.f4969M = transitionOut;
        this.f4970N = transitionTriggers;
        this.f4971O = variableTriggers;
        this.f4972P = variables;
        this.f4973Q = videoSources;
        this.f4974R = visibility;
        this.f4975S = visibilityAction;
        this.f4976T = visibilityActions;
        this.f4977U = width;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Kf.g) BuiltInParserKt.getBuiltInParserComponent().i9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ Uf(ParsingEnvironment parsingEnvironment, Uf uf, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : uf, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Uf(ParsingEnvironment env, Uf uf, boolean z4, JSONObject json) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
