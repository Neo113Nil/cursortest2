package O1;

import O1.Ad;
import O1.Bd;
import O1.C1013qd;
import O1.Hd;
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
public final class Id implements JSONSerializable, JsonTemplate {

    /* renamed from: R, reason: collision with root package name */
    public static final b f3168R = new b(null);

    /* renamed from: S, reason: collision with root package name */
    private static final Expression f3169S;

    /* renamed from: T, reason: collision with root package name */
    private static final Expression f3170T;

    /* renamed from: U, reason: collision with root package name */
    private static final Expression f3171U;

    /* renamed from: V, reason: collision with root package name */
    private static final Yb.e f3172V;

    /* renamed from: W, reason: collision with root package name */
    private static final Expression f3173W;

    /* renamed from: X, reason: collision with root package name */
    private static final Expression f3174X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Expression f3175Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final C0754c5 f3176Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final Expression f3177a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final C0754c5 f3178b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final Expression f3179c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final Yb.d f3180d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Function2 f3181e0;

    /* renamed from: A, reason: collision with root package name */
    public final Field f3182A;

    /* renamed from: B, reason: collision with root package name */
    public final Field f3183B;

    /* renamed from: C, reason: collision with root package name */
    public final Field f3184C;

    /* renamed from: D, reason: collision with root package name */
    public final Field f3185D;

    /* renamed from: E, reason: collision with root package name */
    public final Field f3186E;

    /* renamed from: F, reason: collision with root package name */
    public final Field f3187F;

    /* renamed from: G, reason: collision with root package name */
    public final Field f3188G;

    /* renamed from: H, reason: collision with root package name */
    public final Field f3189H;

    /* renamed from: I, reason: collision with root package name */
    public final Field f3190I;

    /* renamed from: J, reason: collision with root package name */
    public final Field f3191J;

    /* renamed from: K, reason: collision with root package name */
    public final Field f3192K;

    /* renamed from: L, reason: collision with root package name */
    public final Field f3193L;

    /* renamed from: M, reason: collision with root package name */
    public final Field f3194M;

    /* renamed from: N, reason: collision with root package name */
    public final Field f3195N;

    /* renamed from: O, reason: collision with root package name */
    public final Field f3196O;

    /* renamed from: P, reason: collision with root package name */
    public final Field f3197P;

    /* renamed from: Q, reason: collision with root package name */
    public final Field f3198Q;

    /* renamed from: a, reason: collision with root package name */
    public final Field f3199a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f3200b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f3201c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f3202d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f3203e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f3204f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f3205g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f3206h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f3207i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f3208j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f3209k;

    /* renamed from: l, reason: collision with root package name */
    public final Field f3210l;

    /* renamed from: m, reason: collision with root package name */
    public final Field f3211m;

    /* renamed from: n, reason: collision with root package name */
    public final Field f3212n;

    /* renamed from: o, reason: collision with root package name */
    public final Field f3213o;

    /* renamed from: p, reason: collision with root package name */
    public final Field f3214p;

    /* renamed from: q, reason: collision with root package name */
    public final Field f3215q;

    /* renamed from: r, reason: collision with root package name */
    public final Field f3216r;

    /* renamed from: s, reason: collision with root package name */
    public final Field f3217s;

    /* renamed from: t, reason: collision with root package name */
    public final Field f3218t;

    /* renamed from: u, reason: collision with root package name */
    public final Field f3219u;

    /* renamed from: v, reason: collision with root package name */
    public final Field f3220v;

    /* renamed from: w, reason: collision with root package name */
    public final Field f3221w;

    /* renamed from: x, reason: collision with root package name */
    public final Field f3222x;

    /* renamed from: y, reason: collision with root package name */
    public final Field f3223y;

    /* renamed from: z, reason: collision with root package name */
    public final Field f3224z;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3225i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Id invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Id(env, null, false, it, 6, null);
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
        f3169S = companion.constant(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        f3170T = companion.constant(bool);
        f3171U = companion.constant(bool);
        f3172V = new Yb.e(new C0765cg(null, null, null, 7, null));
        f3173W = companion.constant(bool);
        f3174X = companion.constant(0L);
        f3175Y = companion.constant(335544320);
        f3176Z = new C0754c5(companion.constant(0L), null, companion.constant(12L), companion.constant(12L), null == true ? 1 : 0, companion.constant(0L), null, 82, null);
        f3177a0 = companion.constant(Boolean.TRUE);
        f3178b0 = new C0754c5(companion.constant(8L), null, companion.constant(12L), companion.constant(12L), null, companion.constant(0L), null, 82, null);
        f3179c0 = companion.constant(Vf.VISIBLE);
        f3180d0 = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        f3181e0 = a.f3225i;
    }

    public Id(Field accessibility, Field alignmentHorizontal, Field alignmentVertical, Field alpha, Field animators, Field background, Field border, Field columnSpan, Field disappearActions, Field dynamicHeight, Field extensions, Field focus, Field functions, Field hasSeparator, Field height, Field id, Field items, Field layoutProvider, Field margins, Field paddings, Field restrictParentScroll, Field reuseId, Field rowSpan, Field selectedActions, Field selectedTab, Field separatorColor, Field separatorPaddings, Field switchTabsByContentSwipeEnabled, Field tabTitleDelimiter, Field tabTitleStyle, Field titlePaddings, Field tooltips, Field transform, Field transitionChange, Field transitionIn, Field transitionOut, Field transitionTriggers, Field variableTriggers, Field variables, Field visibility, Field visibilityAction, Field visibilityActions, Field width) {
        Intrinsics.checkNotNullParameter(accessibility, "accessibility");
        Intrinsics.checkNotNullParameter(alignmentHorizontal, "alignmentHorizontal");
        Intrinsics.checkNotNullParameter(alignmentVertical, "alignmentVertical");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(animators, "animators");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(columnSpan, "columnSpan");
        Intrinsics.checkNotNullParameter(disappearActions, "disappearActions");
        Intrinsics.checkNotNullParameter(dynamicHeight, "dynamicHeight");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(functions, "functions");
        Intrinsics.checkNotNullParameter(hasSeparator, "hasSeparator");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(layoutProvider, "layoutProvider");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(restrictParentScroll, "restrictParentScroll");
        Intrinsics.checkNotNullParameter(reuseId, "reuseId");
        Intrinsics.checkNotNullParameter(rowSpan, "rowSpan");
        Intrinsics.checkNotNullParameter(selectedActions, "selectedActions");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(separatorColor, "separatorColor");
        Intrinsics.checkNotNullParameter(separatorPaddings, "separatorPaddings");
        Intrinsics.checkNotNullParameter(switchTabsByContentSwipeEnabled, "switchTabsByContentSwipeEnabled");
        Intrinsics.checkNotNullParameter(tabTitleDelimiter, "tabTitleDelimiter");
        Intrinsics.checkNotNullParameter(tabTitleStyle, "tabTitleStyle");
        Intrinsics.checkNotNullParameter(titlePaddings, "titlePaddings");
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
        this.f3199a = accessibility;
        this.f3200b = alignmentHorizontal;
        this.f3201c = alignmentVertical;
        this.f3202d = alpha;
        this.f3203e = animators;
        this.f3204f = background;
        this.f3205g = border;
        this.f3206h = columnSpan;
        this.f3207i = disappearActions;
        this.f3208j = dynamicHeight;
        this.f3209k = extensions;
        this.f3210l = focus;
        this.f3211m = functions;
        this.f3212n = hasSeparator;
        this.f3213o = height;
        this.f3214p = id;
        this.f3215q = items;
        this.f3216r = layoutProvider;
        this.f3217s = margins;
        this.f3218t = paddings;
        this.f3219u = restrictParentScroll;
        this.f3220v = reuseId;
        this.f3221w = rowSpan;
        this.f3222x = selectedActions;
        this.f3223y = selectedTab;
        this.f3224z = separatorColor;
        this.f3182A = separatorPaddings;
        this.f3183B = switchTabsByContentSwipeEnabled;
        this.f3184C = tabTitleDelimiter;
        this.f3185D = tabTitleStyle;
        this.f3186E = titlePaddings;
        this.f3187F = tooltips;
        this.f3188G = transform;
        this.f3189H = transitionChange;
        this.f3190I = transitionIn;
        this.f3191J = transitionOut;
        this.f3192K = transitionTriggers;
        this.f3193L = variableTriggers;
        this.f3194M = variables;
        this.f3195N = visibility;
        this.f3196O = visibilityAction;
        this.f3197P = visibilityActions;
        this.f3198Q = width;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ad.f) BuiltInParserKt.getBuiltInParserComponent().P7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: d, reason: collision with root package name */
        public static final b f3226d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Function2 f3227e = a.f3231i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f3228a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f3229b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f3230c;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f3231i = new a();

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

        public c(Field div, Field title, Field titleClickAction) {
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleClickAction, "titleClickAction");
            this.f3228a = div;
            this.f3229b = title;
            this.f3230c = titleClickAction;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C1048sd) BuiltInParserKt.getBuiltInParserComponent().M7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : cVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ParsingEnvironment env, c cVar, boolean z4, JSONObject json) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public static final class d implements JSONSerializable, JsonTemplate {

        /* renamed from: d, reason: collision with root package name */
        public static final b f3232d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final S5 f3233e;

        /* renamed from: f, reason: collision with root package name */
        private static final S5 f3234f;

        /* renamed from: g, reason: collision with root package name */
        private static final Function2 f3235g;

        /* renamed from: a, reason: collision with root package name */
        public final Field f3236a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f3237b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f3238c;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f3239i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return new d(env, null, false, it, 6, null);
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
            int i4 = 1;
            f3233e = new S5(null == true ? 1 : 0, companion.constant(12L), i4, null == true ? 1 : 0);
            f3234f = new S5(null == true ? 1 : 0, companion.constant(12L), i4, null == true ? 1 : 0);
            f3235g = a.f3239i;
        }

        public d(Field height, Field imageUrl, Field width) {
            Intrinsics.checkNotNullParameter(height, "height");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(width, "width");
            this.f3236a = height;
            this.f3237b = imageUrl;
            this.f3238c = width;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Bd.c) BuiltInParserKt.getBuiltInParserComponent().S7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ d(ParsingEnvironment parsingEnvironment, d dVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : dVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(ParsingEnvironment env, d dVar, boolean z4, JSONObject json) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public static final class e implements JSONSerializable, JsonTemplate {

        /* renamed from: A, reason: collision with root package name */
        private static final Expression f3240A;

        /* renamed from: B, reason: collision with root package name */
        private static final Expression f3241B;

        /* renamed from: C, reason: collision with root package name */
        private static final Expression f3242C;

        /* renamed from: D, reason: collision with root package name */
        private static final Expression f3243D;

        /* renamed from: E, reason: collision with root package name */
        private static final Expression f3244E;

        /* renamed from: F, reason: collision with root package name */
        private static final C0754c5 f3245F;

        /* renamed from: G, reason: collision with root package name */
        private static final Function2 f3246G;

        /* renamed from: u, reason: collision with root package name */
        public static final b f3247u = new b(null);

        /* renamed from: v, reason: collision with root package name */
        private static final Expression f3248v;

        /* renamed from: w, reason: collision with root package name */
        private static final Expression f3249w;

        /* renamed from: x, reason: collision with root package name */
        private static final Expression f3250x;

        /* renamed from: y, reason: collision with root package name */
        private static final Expression f3251y;

        /* renamed from: z, reason: collision with root package name */
        private static final Expression f3252z;

        /* renamed from: a, reason: collision with root package name */
        public final Field f3253a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f3254b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f3255c;

        /* renamed from: d, reason: collision with root package name */
        public final Field f3256d;

        /* renamed from: e, reason: collision with root package name */
        public final Field f3257e;

        /* renamed from: f, reason: collision with root package name */
        public final Field f3258f;

        /* renamed from: g, reason: collision with root package name */
        public final Field f3259g;

        /* renamed from: h, reason: collision with root package name */
        public final Field f3260h;

        /* renamed from: i, reason: collision with root package name */
        public final Field f3261i;

        /* renamed from: j, reason: collision with root package name */
        public final Field f3262j;

        /* renamed from: k, reason: collision with root package name */
        public final Field f3263k;

        /* renamed from: l, reason: collision with root package name */
        public final Field f3264l;

        /* renamed from: m, reason: collision with root package name */
        public final Field f3265m;

        /* renamed from: n, reason: collision with root package name */
        public final Field f3266n;

        /* renamed from: o, reason: collision with root package name */
        public final Field f3267o;

        /* renamed from: p, reason: collision with root package name */
        public final Field f3268p;

        /* renamed from: q, reason: collision with root package name */
        public final Field f3269q;

        /* renamed from: r, reason: collision with root package name */
        public final Field f3270r;

        /* renamed from: s, reason: collision with root package name */
        public final Field f3271s;

        /* renamed from: t, reason: collision with root package name */
        public final Field f3272t;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f3273i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return new e(env, null, false, it, 6, null);
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
            f3248v = companion.constant(-9120);
            f3249w = companion.constant(-872415232);
            f3250x = companion.constant(300L);
            f3251y = companion.constant(C1013qd.e.a.SLIDE);
            f3252z = companion.constant(12L);
            f3240A = companion.constant(EnumC0779dc.SP);
            f3241B = companion.constant(EnumC0791e6.REGULAR);
            f3242C = companion.constant(Integer.MIN_VALUE);
            f3243D = companion.constant(0L);
            f3244E = companion.constant(Double.valueOf(0.0d));
            f3245F = new C0754c5(companion.constant(6L), null, companion.constant(8L), companion.constant(8L), null, companion.constant(6L), null, 82, null);
            f3246G = a.f3273i;
        }

        public e(Field activeBackgroundColor, Field activeFontVariationSettings, Field activeFontWeight, Field activeTextColor, Field animationDuration, Field animationType, Field cornerRadius, Field cornersRadius, Field fontFamily, Field fontSize, Field fontSizeUnit, Field fontWeight, Field inactiveBackgroundColor, Field inactiveFontVariationSettings, Field inactiveFontWeight, Field inactiveTextColor, Field itemSpacing, Field letterSpacing, Field lineHeight, Field paddings) {
            Intrinsics.checkNotNullParameter(activeBackgroundColor, "activeBackgroundColor");
            Intrinsics.checkNotNullParameter(activeFontVariationSettings, "activeFontVariationSettings");
            Intrinsics.checkNotNullParameter(activeFontWeight, "activeFontWeight");
            Intrinsics.checkNotNullParameter(activeTextColor, "activeTextColor");
            Intrinsics.checkNotNullParameter(animationDuration, "animationDuration");
            Intrinsics.checkNotNullParameter(animationType, "animationType");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(cornersRadius, "cornersRadius");
            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
            Intrinsics.checkNotNullParameter(fontSize, "fontSize");
            Intrinsics.checkNotNullParameter(fontSizeUnit, "fontSizeUnit");
            Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
            Intrinsics.checkNotNullParameter(inactiveBackgroundColor, "inactiveBackgroundColor");
            Intrinsics.checkNotNullParameter(inactiveFontVariationSettings, "inactiveFontVariationSettings");
            Intrinsics.checkNotNullParameter(inactiveFontWeight, "inactiveFontWeight");
            Intrinsics.checkNotNullParameter(inactiveTextColor, "inactiveTextColor");
            Intrinsics.checkNotNullParameter(itemSpacing, "itemSpacing");
            Intrinsics.checkNotNullParameter(letterSpacing, "letterSpacing");
            Intrinsics.checkNotNullParameter(lineHeight, "lineHeight");
            Intrinsics.checkNotNullParameter(paddings, "paddings");
            this.f3253a = activeBackgroundColor;
            this.f3254b = activeFontVariationSettings;
            this.f3255c = activeFontWeight;
            this.f3256d = activeTextColor;
            this.f3257e = animationDuration;
            this.f3258f = animationType;
            this.f3259g = cornerRadius;
            this.f3260h = cornersRadius;
            this.f3261i = fontFamily;
            this.f3262j = fontSize;
            this.f3263k = fontSizeUnit;
            this.f3264l = fontWeight;
            this.f3265m = inactiveBackgroundColor;
            this.f3266n = inactiveFontVariationSettings;
            this.f3267o = inactiveFontWeight;
            this.f3268p = inactiveTextColor;
            this.f3269q = itemSpacing;
            this.f3270r = letterSpacing;
            this.f3271s = lineHeight;
            this.f3272t = paddings;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Hd.h) BuiltInParserKt.getBuiltInParserComponent().V7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ e(ParsingEnvironment parsingEnvironment, e eVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : eVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(ParsingEnvironment env, e eVar, boolean z4, JSONObject json) {
            this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ Id(ParsingEnvironment parsingEnvironment, Id id, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : id, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Id(ParsingEnvironment env, Id id, boolean z4, JSONObject json) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
