package O1;

import O1.AbstractC0977od;
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

/* renamed from: O1.pd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0995pd implements JSONSerializable, JsonTemplate {

    /* renamed from: J, reason: collision with root package name */
    public static final b f7491J = new b(null);

    /* renamed from: K, reason: collision with root package name */
    private static final Expression f7492K;

    /* renamed from: L, reason: collision with root package name */
    private static final Yb.e f7493L;

    /* renamed from: M, reason: collision with root package name */
    private static final Expression f7494M;

    /* renamed from: N, reason: collision with root package name */
    private static final Expression f7495N;

    /* renamed from: O, reason: collision with root package name */
    private static final Yb.d f7496O;

    /* renamed from: P, reason: collision with root package name */
    private static final Function2 f7497P;

    /* renamed from: A, reason: collision with root package name */
    public final Field f7498A;

    /* renamed from: B, reason: collision with root package name */
    public final Field f7499B;

    /* renamed from: C, reason: collision with root package name */
    public final Field f7500C;

    /* renamed from: D, reason: collision with root package name */
    public final Field f7501D;

    /* renamed from: E, reason: collision with root package name */
    public final Field f7502E;

    /* renamed from: F, reason: collision with root package name */
    public final Field f7503F;

    /* renamed from: G, reason: collision with root package name */
    public final Field f7504G;

    /* renamed from: H, reason: collision with root package name */
    public final Field f7505H;

    /* renamed from: I, reason: collision with root package name */
    public final Field f7506I;

    /* renamed from: a, reason: collision with root package name */
    public final Field f7507a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f7508b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f7509c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f7510d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f7511e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f7512f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f7513g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f7514h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f7515i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f7516j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f7517k;

    /* renamed from: l, reason: collision with root package name */
    public final Field f7518l;

    /* renamed from: m, reason: collision with root package name */
    public final Field f7519m;

    /* renamed from: n, reason: collision with root package name */
    public final Field f7520n;

    /* renamed from: o, reason: collision with root package name */
    public final Field f7521o;

    /* renamed from: p, reason: collision with root package name */
    public final Field f7522p;

    /* renamed from: q, reason: collision with root package name */
    public final Field f7523q;

    /* renamed from: r, reason: collision with root package name */
    public final Field f7524r;

    /* renamed from: s, reason: collision with root package name */
    public final Field f7525s;

    /* renamed from: t, reason: collision with root package name */
    public final Field f7526t;

    /* renamed from: u, reason: collision with root package name */
    public final Field f7527u;

    /* renamed from: v, reason: collision with root package name */
    public final Field f7528v;

    /* renamed from: w, reason: collision with root package name */
    public final Field f7529w;

    /* renamed from: x, reason: collision with root package name */
    public final Field f7530x;

    /* renamed from: y, reason: collision with root package name */
    public final Field f7531y;

    /* renamed from: z, reason: collision with root package name */
    public final Field f7532z;

    /* renamed from: O1.pd$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7533i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0995pd invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0995pd(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.pd$b */
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
        f7492K = companion.constant(Double.valueOf(1.0d));
        f7493L = new Yb.e(new C0765cg(null, null, null, 7, null));
        f7494M = companion.constant(Boolean.TRUE);
        f7495N = companion.constant(Vf.VISIBLE);
        f7496O = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        f7497P = a.f7533i;
    }

    public C0995pd(Field accessibility, Field alignmentHorizontal, Field alignmentVertical, Field alpha, Field animators, Field background, Field border, Field columnSpan, Field disappearActions, Field extensions, Field focus, Field functions, Field height, Field id, Field isEnabled, Field isOnVariable, Field layoutProvider, Field margins, Field onColor, Field paddings, Field reuseId, Field rowSpan, Field selectedActions, Field tooltips, Field transform, Field transitionChange, Field transitionIn, Field transitionOut, Field transitionTriggers, Field variableTriggers, Field variables, Field visibility, Field visibilityAction, Field visibilityActions, Field width) {
        Intrinsics.checkNotNullParameter(accessibility, "accessibility");
        Intrinsics.checkNotNullParameter(alignmentHorizontal, "alignmentHorizontal");
        Intrinsics.checkNotNullParameter(alignmentVertical, "alignmentVertical");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(animators, "animators");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(columnSpan, "columnSpan");
        Intrinsics.checkNotNullParameter(disappearActions, "disappearActions");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(functions, "functions");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(isOnVariable, "isOnVariable");
        Intrinsics.checkNotNullParameter(layoutProvider, "layoutProvider");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(onColor, "onColor");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
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
        this.f7507a = accessibility;
        this.f7508b = alignmentHorizontal;
        this.f7509c = alignmentVertical;
        this.f7510d = alpha;
        this.f7511e = animators;
        this.f7512f = background;
        this.f7513g = border;
        this.f7514h = columnSpan;
        this.f7515i = disappearActions;
        this.f7516j = extensions;
        this.f7517k = focus;
        this.f7518l = functions;
        this.f7519m = height;
        this.f7520n = id;
        this.f7521o = isEnabled;
        this.f7522p = isOnVariable;
        this.f7523q = layoutProvider;
        this.f7524r = margins;
        this.f7525s = onColor;
        this.f7526t = paddings;
        this.f7527u = reuseId;
        this.f7528v = rowSpan;
        this.f7529w = selectedActions;
        this.f7530x = tooltips;
        this.f7531y = transform;
        this.f7532z = transitionChange;
        this.f7498A = transitionIn;
        this.f7499B = transitionOut;
        this.f7500C = transitionTriggers;
        this.f7501D = variableTriggers;
        this.f7502E = variables;
        this.f7503F = visibility;
        this.f7504G = visibilityAction;
        this.f7505H = visibilityActions;
        this.f7506I = width;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0977od.f) BuiltInParserKt.getBuiltInParserComponent().J7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0995pd(ParsingEnvironment parsingEnvironment, C0995pd c0995pd, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0995pd, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0995pd(ParsingEnvironment env, C0995pd c0995pd, boolean z4, JSONObject json) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
