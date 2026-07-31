package O1;

import O1.E9;
import O1.K9;
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
public final class Q9 implements JSONSerializable, JsonTemplate {

    /* renamed from: R, reason: collision with root package name */
    public static final b f4412R = new b(null);

    /* renamed from: S, reason: collision with root package name */
    private static final Expression f4413S;

    /* renamed from: T, reason: collision with root package name */
    private static final Expression f4414T;

    /* renamed from: U, reason: collision with root package name */
    private static final Expression f4415U;

    /* renamed from: V, reason: collision with root package name */
    private static final Yb.e f4416V;

    /* renamed from: W, reason: collision with root package name */
    private static final Expression f4417W;

    /* renamed from: X, reason: collision with root package name */
    private static final S5 f4418X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Expression f4419Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final Expression f4420Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final Expression f4421a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final Expression f4422b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final Yb.d f4423c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final Function2 f4424d0;

    /* renamed from: A, reason: collision with root package name */
    public final Field f4425A;

    /* renamed from: B, reason: collision with root package name */
    public final Field f4426B;

    /* renamed from: C, reason: collision with root package name */
    public final Field f4427C;

    /* renamed from: D, reason: collision with root package name */
    public final Field f4428D;

    /* renamed from: E, reason: collision with root package name */
    public final Field f4429E;

    /* renamed from: F, reason: collision with root package name */
    public final Field f4430F;

    /* renamed from: G, reason: collision with root package name */
    public final Field f4431G;

    /* renamed from: H, reason: collision with root package name */
    public final Field f4432H;

    /* renamed from: I, reason: collision with root package name */
    public final Field f4433I;

    /* renamed from: J, reason: collision with root package name */
    public final Field f4434J;

    /* renamed from: K, reason: collision with root package name */
    public final Field f4435K;

    /* renamed from: L, reason: collision with root package name */
    public final Field f4436L;

    /* renamed from: M, reason: collision with root package name */
    public final Field f4437M;

    /* renamed from: N, reason: collision with root package name */
    public final Field f4438N;

    /* renamed from: O, reason: collision with root package name */
    public final Field f4439O;

    /* renamed from: P, reason: collision with root package name */
    public final Field f4440P;

    /* renamed from: Q, reason: collision with root package name */
    public final Field f4441Q;

    /* renamed from: a, reason: collision with root package name */
    public final Field f4442a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f4443b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f4444c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f4445d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f4446e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f4447f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f4448g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f4449h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f4450i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f4451j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f4452k;

    /* renamed from: l, reason: collision with root package name */
    public final Field f4453l;

    /* renamed from: m, reason: collision with root package name */
    public final Field f4454m;

    /* renamed from: n, reason: collision with root package name */
    public final Field f4455n;

    /* renamed from: o, reason: collision with root package name */
    public final Field f4456o;

    /* renamed from: p, reason: collision with root package name */
    public final Field f4457p;

    /* renamed from: q, reason: collision with root package name */
    public final Field f4458q;

    /* renamed from: r, reason: collision with root package name */
    public final Field f4459r;

    /* renamed from: s, reason: collision with root package name */
    public final Field f4460s;

    /* renamed from: t, reason: collision with root package name */
    public final Field f4461t;

    /* renamed from: u, reason: collision with root package name */
    public final Field f4462u;

    /* renamed from: v, reason: collision with root package name */
    public final Field f4463v;

    /* renamed from: w, reason: collision with root package name */
    public final Field f4464w;

    /* renamed from: x, reason: collision with root package name */
    public final Field f4465x;

    /* renamed from: y, reason: collision with root package name */
    public final Field f4466y;

    /* renamed from: z, reason: collision with root package name */
    public final Field f4467z;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4468i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Q9(env, null, false, it, 6, null);
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
        f4413S = companion.constant(Double.valueOf(1.0d));
        f4414T = companion.constant(E9.c.START);
        f4415U = companion.constant(0L);
        f4416V = new Yb.e(new C0765cg(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        f4417W = companion.constant(bool);
        int i4 = 1;
        f4418X = new S5(null == true ? 1 : 0, companion.constant(0L), i4, null == true ? 1 : 0);
        f4419Y = companion.constant(E9.d.HORIZONTAL);
        f4420Z = companion.constant(bool);
        f4421a0 = companion.constant(E9.c.CENTER);
        f4422b0 = companion.constant(Vf.VISIBLE);
        f4423c0 = new Yb.d(new I8(null == true ? 1 : 0, i4, null == true ? 1 : 0));
        f4424d0 = a.f4468i;
    }

    public Q9(Field accessibility, Field alignmentHorizontal, Field alignmentVertical, Field alpha, Field animators, Field background, Field border, Field columnSpan, Field crossAxisAlignment, Field defaultItem, Field disappearActions, Field extensions, Field focus, Field functions, Field height, Field id, Field infiniteScroll, Field itemBuilder, Field itemSpacing, Field items, Field layoutMode, Field layoutProvider, Field margins, Field orientation, Field paddings, Field pageTransformation, Field restrictParentScroll, Field reuseId, Field rowSpan, Field scrollAxisAlignment, Field selectedActions, Field tooltips, Field transform, Field transitionChange, Field transitionIn, Field transitionOut, Field transitionTriggers, Field variableTriggers, Field variables, Field visibility, Field visibilityAction, Field visibilityActions, Field width) {
        Intrinsics.checkNotNullParameter(accessibility, "accessibility");
        Intrinsics.checkNotNullParameter(alignmentHorizontal, "alignmentHorizontal");
        Intrinsics.checkNotNullParameter(alignmentVertical, "alignmentVertical");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(animators, "animators");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(columnSpan, "columnSpan");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        Intrinsics.checkNotNullParameter(defaultItem, "defaultItem");
        Intrinsics.checkNotNullParameter(disappearActions, "disappearActions");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(functions, "functions");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(infiniteScroll, "infiniteScroll");
        Intrinsics.checkNotNullParameter(itemBuilder, "itemBuilder");
        Intrinsics.checkNotNullParameter(itemSpacing, "itemSpacing");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(layoutMode, "layoutMode");
        Intrinsics.checkNotNullParameter(layoutProvider, "layoutProvider");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(pageTransformation, "pageTransformation");
        Intrinsics.checkNotNullParameter(restrictParentScroll, "restrictParentScroll");
        Intrinsics.checkNotNullParameter(reuseId, "reuseId");
        Intrinsics.checkNotNullParameter(rowSpan, "rowSpan");
        Intrinsics.checkNotNullParameter(scrollAxisAlignment, "scrollAxisAlignment");
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
        this.f4442a = accessibility;
        this.f4443b = alignmentHorizontal;
        this.f4444c = alignmentVertical;
        this.f4445d = alpha;
        this.f4446e = animators;
        this.f4447f = background;
        this.f4448g = border;
        this.f4449h = columnSpan;
        this.f4450i = crossAxisAlignment;
        this.f4451j = defaultItem;
        this.f4452k = disappearActions;
        this.f4453l = extensions;
        this.f4454m = focus;
        this.f4455n = functions;
        this.f4456o = height;
        this.f4457p = id;
        this.f4458q = infiniteScroll;
        this.f4459r = itemBuilder;
        this.f4460s = itemSpacing;
        this.f4461t = items;
        this.f4462u = layoutMode;
        this.f4463v = layoutProvider;
        this.f4464w = margins;
        this.f4465x = orientation;
        this.f4466y = paddings;
        this.f4467z = pageTransformation;
        this.f4425A = restrictParentScroll;
        this.f4426B = reuseId;
        this.f4427C = rowSpan;
        this.f4428D = scrollAxisAlignment;
        this.f4429E = selectedActions;
        this.f4430F = tooltips;
        this.f4431G = transform;
        this.f4432H = transitionChange;
        this.f4433I = transitionIn;
        this.f4434J = transitionOut;
        this.f4435K = transitionTriggers;
        this.f4436L = variableTriggers;
        this.f4437M = variables;
        this.f4438N = visibility;
        this.f4439O = visibilityAction;
        this.f4440P = visibilityActions;
        this.f4441Q = width;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((K9.i) BuiltInParserKt.getBuiltInParserComponent().x5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ Q9(ParsingEnvironment parsingEnvironment, Q9 q9, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : q9, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q9(ParsingEnvironment env, Q9 q9, boolean z4, JSONObject json) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
