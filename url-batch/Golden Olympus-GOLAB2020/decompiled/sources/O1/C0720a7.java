package O1;

import O1.AbstractC0935m7;
import O1.Nb;
import O1.Yb;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.a7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0720a7 implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: T, reason: collision with root package name */
    public static final c f5640T = new c(null);

    /* renamed from: U, reason: collision with root package name */
    private static final Expression f5641U;

    /* renamed from: V, reason: collision with root package name */
    private static final Expression f5642V;

    /* renamed from: W, reason: collision with root package name */
    private static final Expression f5643W;

    /* renamed from: X, reason: collision with root package name */
    private static final Expression f5644X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Yb.e f5645Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final Expression f5646Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final Expression f5647a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final Nb.d f5648b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final S5 f5649c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final Expression f5650d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Yb.d f5651e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final Function2 f5652f0;

    /* renamed from: A, reason: collision with root package name */
    public final String f5653A;

    /* renamed from: B, reason: collision with root package name */
    private final Expression f5654B;

    /* renamed from: C, reason: collision with root package name */
    private final Expression f5655C;

    /* renamed from: D, reason: collision with root package name */
    private final List f5656D;

    /* renamed from: E, reason: collision with root package name */
    public final Nb f5657E;

    /* renamed from: F, reason: collision with root package name */
    public final S5 f5658F;

    /* renamed from: G, reason: collision with root package name */
    private final List f5659G;

    /* renamed from: H, reason: collision with root package name */
    private final C0925lf f5660H;

    /* renamed from: I, reason: collision with root package name */
    private final AbstractC1092v3 f5661I;

    /* renamed from: J, reason: collision with root package name */
    private final O2 f5662J;

    /* renamed from: K, reason: collision with root package name */
    private final O2 f5663K;

    /* renamed from: L, reason: collision with root package name */
    private final List f5664L;

    /* renamed from: M, reason: collision with root package name */
    private final List f5665M;

    /* renamed from: N, reason: collision with root package name */
    private final List f5666N;

    /* renamed from: O, reason: collision with root package name */
    private final Expression f5667O;

    /* renamed from: P, reason: collision with root package name */
    private final Wf f5668P;

    /* renamed from: Q, reason: collision with root package name */
    private final List f5669Q;

    /* renamed from: R, reason: collision with root package name */
    private final Yb f5670R;

    /* renamed from: S, reason: collision with root package name */
    private Integer f5671S;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f5672a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f5673b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f5674c;

    /* renamed from: d, reason: collision with root package name */
    public final C0742bb f5675d;

    /* renamed from: e, reason: collision with root package name */
    private final Expression f5676e;

    /* renamed from: f, reason: collision with root package name */
    private final Expression f5677f;

    /* renamed from: g, reason: collision with root package name */
    private final Expression f5678g;

    /* renamed from: h, reason: collision with root package name */
    public final Expression f5679h;

    /* renamed from: i, reason: collision with root package name */
    private final List f5680i;

    /* renamed from: j, reason: collision with root package name */
    private final List f5681j;

    /* renamed from: k, reason: collision with root package name */
    private final C0860i3 f5682k;

    /* renamed from: l, reason: collision with root package name */
    private final Expression f5683l;

    /* renamed from: m, reason: collision with root package name */
    private final List f5684m;

    /* renamed from: n, reason: collision with root package name */
    private final List f5685n;

    /* renamed from: o, reason: collision with root package name */
    private final W5 f5686o;

    /* renamed from: p, reason: collision with root package name */
    private final List f5687p;

    /* renamed from: q, reason: collision with root package name */
    private final Yb f5688q;

    /* renamed from: r, reason: collision with root package name */
    private final String f5689r;

    /* renamed from: s, reason: collision with root package name */
    public final Expression f5690s;

    /* renamed from: t, reason: collision with root package name */
    public final C0742bb f5691t;

    /* renamed from: u, reason: collision with root package name */
    public final C0742bb f5692u;

    /* renamed from: v, reason: collision with root package name */
    public final AbstractC0738b7 f5693v;

    /* renamed from: w, reason: collision with root package name */
    private final C1079u8 f5694w;

    /* renamed from: x, reason: collision with root package name */
    private final C0754c5 f5695x;

    /* renamed from: y, reason: collision with root package name */
    public final Expression f5696y;

    /* renamed from: z, reason: collision with root package name */
    private final C0754c5 f5697z;

    /* renamed from: O1.a7$a */
    public enum a {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");


        /* renamed from: c, reason: collision with root package name */
        public static final c f5698c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f5699d = b.f5707i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f5700e = C0041a.f5706i;

        /* renamed from: b, reason: collision with root package name */
        private final String f5705b;

        /* renamed from: O1.a7$a$a, reason: collision with other inner class name */
        static final class C0041a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0041a f5706i = new C0041a();

            C0041a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return a.f5698c.a(value);
            }
        }

        /* renamed from: O1.a7$a$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f5707i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(a value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return a.f5698c.b(value);
            }
        }

        /* renamed from: O1.a7$a$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                a aVar = a.SCALE;
                if (Intrinsics.areEqual(value, aVar.f5705b)) {
                    return aVar;
                }
                a aVar2 = a.WORM;
                if (Intrinsics.areEqual(value, aVar2.f5705b)) {
                    return aVar2;
                }
                a aVar3 = a.SLIDER;
                if (Intrinsics.areEqual(value, aVar3.f5705b)) {
                    return aVar3;
                }
                return null;
            }

            public final String b(a obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f5705b;
            }

            private c() {
            }
        }

        a(String str) {
            this.f5705b = str;
        }
    }

    /* renamed from: O1.a7$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5708i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0720a7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0720a7.f5640T.a(env, it);
        }
    }

    /* renamed from: O1.a7$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0720a7 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0935m7.f) BuiltInParserKt.getBuiltInParserComponent().a4().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f5641U = companion.constant(16768096);
        f5642V = companion.constant(Double.valueOf(1.3d));
        f5643W = companion.constant(Double.valueOf(1.0d));
        f5644X = companion.constant(a.SCALE);
        Expression expression = null;
        f5645Y = new Yb.e(new C0765cg(expression, null, null, 7, null));
        f5646Z = companion.constant(865180853);
        f5647a0 = companion.constant(Double.valueOf(0.5d));
        Object[] objArr = null == true ? 1 : 0;
        f5648b0 = new Nb.d(new C0742bb(expression, null == true ? 1 : 0, null == true ? 1 : 0, null, objArr, 31, null));
        int i4 = 1;
        f5649c0 = new S5(null == true ? 1 : 0, companion.constant(15L), i4, null == true ? 1 : 0);
        f5650d0 = companion.constant(Vf.VISIBLE);
        f5651e0 = new Yb.d(new I8(null == true ? 1 : 0, i4, null == true ? 1 : 0));
        f5652f0 = b.f5708i;
    }

    public C0720a7(C0839h0 c0839h0, Expression activeItemColor, Expression activeItemSize, C0742bb c0742bb, Expression expression, Expression expression2, Expression alpha, Expression animation, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, W5 w5, List list5, Yb height, String str, Expression inactiveItemColor, C0742bb c0742bb2, C0742bb c0742bb3, AbstractC0738b7 abstractC0738b7, C1079u8 c1079u8, C0754c5 c0754c5, Expression minimumItemSize, C0754c5 c0754c52, String str2, Expression expression4, Expression expression5, List list6, Nb shape, S5 spaceBetweenCenters, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(activeItemColor, "activeItemColor");
        Intrinsics.checkNotNullParameter(activeItemSize, "activeItemSize");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(inactiveItemColor, "inactiveItemColor");
        Intrinsics.checkNotNullParameter(minimumItemSize, "minimumItemSize");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(spaceBetweenCenters, "spaceBetweenCenters");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f5672a = c0839h0;
        this.f5673b = activeItemColor;
        this.f5674c = activeItemSize;
        this.f5675d = c0742bb;
        this.f5676e = expression;
        this.f5677f = expression2;
        this.f5678g = alpha;
        this.f5679h = animation;
        this.f5680i = list;
        this.f5681j = list2;
        this.f5682k = c0860i3;
        this.f5683l = expression3;
        this.f5684m = list3;
        this.f5685n = list4;
        this.f5686o = w5;
        this.f5687p = list5;
        this.f5688q = height;
        this.f5689r = str;
        this.f5690s = inactiveItemColor;
        this.f5691t = c0742bb2;
        this.f5692u = c0742bb3;
        this.f5693v = abstractC0738b7;
        this.f5694w = c1079u8;
        this.f5695x = c0754c5;
        this.f5696y = minimumItemSize;
        this.f5697z = c0754c52;
        this.f5653A = str2;
        this.f5654B = expression4;
        this.f5655C = expression5;
        this.f5656D = list6;
        this.f5657E = shape;
        this.f5658F = spaceBetweenCenters;
        this.f5659G = list7;
        this.f5660H = c0925lf;
        this.f5661I = abstractC1092v3;
        this.f5662J = o22;
        this.f5663K = o23;
        this.f5664L = list8;
        this.f5665M = list9;
        this.f5666N = list10;
        this.f5667O = visibility;
        this.f5668P = wf;
        this.f5669Q = list11;
        this.f5670R = width;
    }

    public static /* synthetic */ C0720a7 B(C0720a7 c0720a7, C0839h0 c0839h0, Expression expression, Expression expression2, C0742bb c0742bb, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, C0860i3 c0860i3, Expression expression7, List list3, List list4, W5 w5, List list5, Yb yb, String str, Expression expression8, C0742bb c0742bb2, C0742bb c0742bb3, AbstractC0738b7 abstractC0738b7, C1079u8 c1079u8, C0754c5 c0754c5, Expression expression9, C0754c5 c0754c52, String str2, Expression expression10, Expression expression11, List list6, Nb nb, S5 s5, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression expression12, Wf wf, List list11, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? c0720a7.d() : c0839h0;
        Expression expression13 = (i4 & 2) != 0 ? c0720a7.f5673b : expression;
        Expression expression14 = (i4 & 4) != 0 ? c0720a7.f5674c : expression2;
        C0742bb c0742bb4 = (i4 & 8) != 0 ? c0720a7.f5675d : c0742bb;
        Expression l4 = (i4 & 16) != 0 ? c0720a7.l() : expression3;
        Expression s4 = (i4 & 32) != 0 ? c0720a7.s() : expression4;
        Expression v4 = (i4 & 64) != 0 ? c0720a7.v() : expression5;
        Expression expression15 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c0720a7.f5679h : expression6;
        List u4 = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c0720a7.u() : list;
        List background = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c0720a7.getBackground() : list2;
        C0860i3 w4 = (i4 & 1024) != 0 ? c0720a7.w() : c0860i3;
        Expression e4 = (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c0720a7.e() : expression7;
        List a4 = (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? c0720a7.a() : list3;
        C0839h0 c0839h02 = d4;
        List extensions = (i4 & 8192) != 0 ? c0720a7.getExtensions() : list4;
        W5 x4 = (i4 & 16384) != 0 ? c0720a7.x() : w5;
        List r4 = (i4 & 32768) != 0 ? c0720a7.r() : list5;
        Yb height = (i4 & 65536) != 0 ? c0720a7.getHeight() : yb;
        String id = (i4 & 131072) != 0 ? c0720a7.getId() : str;
        Expression expression16 = (i4 & 262144) != 0 ? c0720a7.f5690s : expression8;
        C0742bb c0742bb5 = (i4 & 524288) != 0 ? c0720a7.f5691t : c0742bb2;
        C0742bb c0742bb6 = (i4 & 1048576) != 0 ? c0720a7.f5692u : c0742bb3;
        AbstractC0738b7 abstractC0738b72 = (i4 & 2097152) != 0 ? c0720a7.f5693v : abstractC0738b7;
        C1079u8 m4 = (i4 & 4194304) != 0 ? c0720a7.m() : c1079u8;
        C0754c5 g4 = (i4 & 8388608) != 0 ? c0720a7.g() : c0754c5;
        AbstractC0738b7 abstractC0738b73 = abstractC0738b72;
        Expression expression17 = (i4 & 16777216) != 0 ? c0720a7.f5696y : expression9;
        return c0720a7.A(c0839h02, expression13, expression14, c0742bb4, l4, s4, v4, expression15, u4, background, w4, e4, a4, extensions, x4, r4, height, id, expression16, c0742bb5, c0742bb6, abstractC0738b73, m4, g4, expression17, (i4 & 33554432) != 0 ? c0720a7.i() : c0754c52, (i4 & 67108864) != 0 ? c0720a7.f5653A : str2, (i4 & 134217728) != 0 ? c0720a7.n() : expression10, (i4 & 268435456) != 0 ? c0720a7.h() : expression11, (i4 & 536870912) != 0 ? c0720a7.k() : list6, (i4 & 1073741824) != 0 ? c0720a7.f5657E : nb, (i4 & Integer.MIN_VALUE) != 0 ? c0720a7.f5658F : s5, (i5 & 1) != 0 ? c0720a7.p() : list7, (i5 & 2) != 0 ? c0720a7.b() : c0925lf, (i5 & 4) != 0 ? c0720a7.z() : abstractC1092v3, (i5 & 8) != 0 ? c0720a7.t() : o22, (i5 & 16) != 0 ? c0720a7.y() : o23, (i5 & 32) != 0 ? c0720a7.j() : list8, (i5 & 64) != 0 ? c0720a7.o() : list9, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c0720a7.f() : list10, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c0720a7.getVisibility() : expression12, (i5 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c0720a7.q() : wf, (i5 & 1024) != 0 ? c0720a7.c() : list11, (i5 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c0720a7.getWidth() : yb2);
    }

    public final C0720a7 A(C0839h0 c0839h0, Expression activeItemColor, Expression activeItemSize, C0742bb c0742bb, Expression expression, Expression expression2, Expression alpha, Expression animation, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, W5 w5, List list5, Yb height, String str, Expression inactiveItemColor, C0742bb c0742bb2, C0742bb c0742bb3, AbstractC0738b7 abstractC0738b7, C1079u8 c1079u8, C0754c5 c0754c5, Expression minimumItemSize, C0754c5 c0754c52, String str2, Expression expression4, Expression expression5, List list6, Nb shape, S5 spaceBetweenCenters, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(activeItemColor, "activeItemColor");
        Intrinsics.checkNotNullParameter(activeItemSize, "activeItemSize");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(inactiveItemColor, "inactiveItemColor");
        Intrinsics.checkNotNullParameter(minimumItemSize, "minimumItemSize");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(spaceBetweenCenters, "spaceBetweenCenters");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new C0720a7(c0839h0, activeItemColor, activeItemSize, c0742bb, expression, expression2, alpha, animation, list, list2, c0860i3, expression3, list3, list4, w5, list5, height, str, inactiveItemColor, c0742bb2, c0742bb3, abstractC0738b7, c1079u8, c0754c5, minimumItemSize, c0754c52, str2, expression4, expression5, list6, shape, spaceBetweenCenters, list7, c0925lf, abstractC1092v3, o22, o23, list8, list9, list10, visibility, wf, list11, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x0651, code lost:
    
        if (r9.c() == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x05d9, code lost:
    
        if (r9.f() == null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x058d, code lost:
    
        if (r9.o() == null) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0541, code lost:
    
        if (r9.j() == null) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x048c, code lost:
    
        if (r9.p() == null) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x042c, code lost:
    
        if (r9.k() == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x02b3, code lost:
    
        if (r9.r() == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x024d, code lost:
    
        if (r9.getExtensions() == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0201, code lost:
    
        if (r9.a() == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0179, code lost:
    
        if (r9.getBackground() == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x012d, code lost:
    
        if (r9.u() == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(C0720a7 c0720a7, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0720a7 == null) {
            return false;
        }
        C0839h0 d4 = d();
        if ((d4 != null ? d4.a(c0720a7.d(), resolver, otherResolver) : c0720a7.d() == null) && ((Number) this.f5673b.evaluate(resolver)).intValue() == ((Number) c0720a7.f5673b.evaluate(otherResolver)).intValue()) {
            if (((Number) this.f5674c.evaluate(resolver)).doubleValue() == ((Number) c0720a7.f5674c.evaluate(otherResolver)).doubleValue()) {
                C0742bb c0742bb = this.f5675d;
                if (c0742bb != null ? c0742bb.a(c0720a7.f5675d, resolver, otherResolver) : c0720a7.f5675d == null) {
                    Expression l4 = l();
                    EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
                    Expression l5 = c0720a7.l();
                    if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                        Expression s4 = s();
                        EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                        Expression s5 = c0720a7.s();
                        if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                            if ((((Number) v().evaluate(resolver)).doubleValue() == ((Number) c0720a7.v().evaluate(otherResolver)).doubleValue()) && this.f5679h.evaluate(resolver) == c0720a7.f5679h.evaluate(otherResolver)) {
                                List u4 = u();
                                if (u4 != null) {
                                    List u5 = c0720a7.u();
                                    if (u5 != null) {
                                        if (u4.size() == u5.size()) {
                                            int i4 = 0;
                                            for (Object obj : u4) {
                                                int i5 = i4 + 1;
                                                if (i4 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                if (((E2) obj).a((E2) u5.get(i4), resolver, otherResolver)) {
                                                    i4 = i5;
                                                }
                                            }
                                            z4 = true;
                                        }
                                        z4 = false;
                                        break;
                                    }
                                    return false;
                                }
                                if (z4) {
                                    List background = getBackground();
                                    if (background != null) {
                                        List background2 = c0720a7.getBackground();
                                        if (background2 != null) {
                                            if (background.size() == background2.size()) {
                                                int i6 = 0;
                                                for (Object obj2 : background) {
                                                    int i7 = i6 + 1;
                                                    if (i6 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    if (((X2) obj2).a((X2) background2.get(i6), resolver, otherResolver)) {
                                                        i6 = i7;
                                                    }
                                                }
                                                z5 = true;
                                            }
                                            z5 = false;
                                            break;
                                        }
                                        return false;
                                    }
                                    if (z5) {
                                        C0860i3 w4 = w();
                                        if (w4 != null ? w4.a(c0720a7.w(), resolver, otherResolver) : c0720a7.w() == null) {
                                            Expression e4 = e();
                                            Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                            Expression e5 = c0720a7.e();
                                            if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null)) {
                                                List a4 = a();
                                                if (a4 != null) {
                                                    List a5 = c0720a7.a();
                                                    if (a5 != null) {
                                                        if (a4.size() == a5.size()) {
                                                            int i8 = 0;
                                                            for (Object obj3 : a4) {
                                                                int i9 = i8 + 1;
                                                                if (i8 < 0) {
                                                                    CollectionsKt.throwIndexOverflow();
                                                                }
                                                                if (((M4) obj3).h((M4) a5.get(i8), resolver, otherResolver)) {
                                                                    i8 = i9;
                                                                }
                                                            }
                                                            z6 = true;
                                                        }
                                                        z6 = false;
                                                        break;
                                                    }
                                                    return false;
                                                }
                                                if (z6) {
                                                    List extensions = getExtensions();
                                                    if (extensions != null) {
                                                        List extensions2 = c0720a7.getExtensions();
                                                        if (extensions2 != null) {
                                                            if (extensions.size() == extensions2.size()) {
                                                                int i10 = 0;
                                                                for (Object obj4 : extensions) {
                                                                    int i11 = i10 + 1;
                                                                    if (i10 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    if (((C0933m5) obj4).a((C0933m5) extensions2.get(i10), resolver, otherResolver)) {
                                                                        i10 = i11;
                                                                    }
                                                                }
                                                                z7 = true;
                                                            }
                                                            z7 = false;
                                                            break;
                                                        }
                                                        return false;
                                                    }
                                                    if (z7) {
                                                        W5 x4 = x();
                                                        if (x4 != null ? x4.a(c0720a7.x(), resolver, otherResolver) : c0720a7.x() == null) {
                                                            List r4 = r();
                                                            if (r4 != null) {
                                                                List r5 = c0720a7.r();
                                                                if (r5 != null) {
                                                                    if (r4.size() == r5.size()) {
                                                                        int i12 = 0;
                                                                        for (Object obj5 : r4) {
                                                                            int i13 = i12 + 1;
                                                                            if (i12 < 0) {
                                                                                CollectionsKt.throwIndexOverflow();
                                                                            }
                                                                            if (((C0809f6) obj5).a((C0809f6) r5.get(i12), resolver, otherResolver)) {
                                                                                i12 = i13;
                                                                            }
                                                                        }
                                                                        z8 = true;
                                                                    }
                                                                    z8 = false;
                                                                    break;
                                                                }
                                                                return false;
                                                            }
                                                            if (z8 && getHeight().a(c0720a7.getHeight(), resolver, otherResolver) && Intrinsics.areEqual(getId(), c0720a7.getId()) && ((Number) this.f5690s.evaluate(resolver)).intValue() == ((Number) c0720a7.f5690s.evaluate(otherResolver)).intValue()) {
                                                                C0742bb c0742bb2 = this.f5691t;
                                                                if (c0742bb2 != null ? c0742bb2.a(c0720a7.f5691t, resolver, otherResolver) : c0720a7.f5691t == null) {
                                                                    C0742bb c0742bb3 = this.f5692u;
                                                                    if (c0742bb3 != null ? c0742bb3.a(c0720a7.f5692u, resolver, otherResolver) : c0720a7.f5692u == null) {
                                                                        AbstractC0738b7 abstractC0738b7 = this.f5693v;
                                                                        if (abstractC0738b7 != null ? abstractC0738b7.a(c0720a7.f5693v, resolver, otherResolver) : c0720a7.f5693v == null) {
                                                                            C1079u8 m4 = m();
                                                                            if (m4 != null ? m4.a(c0720a7.m(), resolver, otherResolver) : c0720a7.m() == null) {
                                                                                C0754c5 g4 = g();
                                                                                if (g4 != null ? g4.a(c0720a7.g(), resolver, otherResolver) : c0720a7.g() == null) {
                                                                                    if (((Number) this.f5696y.evaluate(resolver)).doubleValue() == ((Number) c0720a7.f5696y.evaluate(otherResolver)).doubleValue()) {
                                                                                        C0754c5 i14 = i();
                                                                                        if ((i14 != null ? i14.a(c0720a7.i(), resolver, otherResolver) : c0720a7.i() == null) && Intrinsics.areEqual(this.f5653A, c0720a7.f5653A)) {
                                                                                            Expression n4 = n();
                                                                                            String str = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                                            Expression n5 = c0720a7.n();
                                                                                            if (Intrinsics.areEqual(str, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                                                Expression h4 = h();
                                                                                                Long l7 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                                                Expression h5 = c0720a7.h();
                                                                                                if (Intrinsics.areEqual(l7, h5 != null ? (Long) h5.evaluate(otherResolver) : null)) {
                                                                                                    List k4 = k();
                                                                                                    if (k4 != null) {
                                                                                                        List k5 = c0720a7.k();
                                                                                                        if (k5 != null) {
                                                                                                            if (k4.size() == k5.size()) {
                                                                                                                int i15 = 0;
                                                                                                                for (Object obj6 : k4) {
                                                                                                                    int i16 = i15 + 1;
                                                                                                                    if (i15 < 0) {
                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                    }
                                                                                                                    if (((C0892k0) obj6).a((C0892k0) k5.get(i15), resolver, otherResolver)) {
                                                                                                                        i15 = i16;
                                                                                                                    }
                                                                                                                }
                                                                                                                z9 = true;
                                                                                                            }
                                                                                                            z9 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        return false;
                                                                                                    }
                                                                                                    if (z9 && this.f5657E.a(c0720a7.f5657E, resolver, otherResolver) && this.f5658F.a(c0720a7.f5658F, resolver, otherResolver)) {
                                                                                                        List p4 = p();
                                                                                                        if (p4 != null) {
                                                                                                            List p5 = c0720a7.p();
                                                                                                            if (p5 != null) {
                                                                                                                if (p4.size() == p5.size()) {
                                                                                                                    int i17 = 0;
                                                                                                                    for (Object obj7 : p4) {
                                                                                                                        int i18 = i17 + 1;
                                                                                                                        if (i17 < 0) {
                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                        }
                                                                                                                        if (((Se) obj7).a((Se) p5.get(i17), resolver, otherResolver)) {
                                                                                                                            i17 = i18;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    z10 = true;
                                                                                                                }
                                                                                                                z10 = false;
                                                                                                                break;
                                                                                                            }
                                                                                                            return false;
                                                                                                        }
                                                                                                        if (z10) {
                                                                                                            C0925lf b4 = b();
                                                                                                            if (b4 != null ? b4.a(c0720a7.b(), resolver, otherResolver) : c0720a7.b() == null) {
                                                                                                                AbstractC1092v3 z15 = z();
                                                                                                                if (z15 != null ? z15.a(c0720a7.z(), resolver, otherResolver) : c0720a7.z() == null) {
                                                                                                                    O2 t4 = t();
                                                                                                                    if (t4 != null ? t4.a(c0720a7.t(), resolver, otherResolver) : c0720a7.t() == null) {
                                                                                                                        O2 y4 = y();
                                                                                                                        if (y4 != null ? y4.a(c0720a7.y(), resolver, otherResolver) : c0720a7.y() == null) {
                                                                                                                            List j4 = j();
                                                                                                                            if (j4 != null) {
                                                                                                                                List j5 = c0720a7.j();
                                                                                                                                if (j5 != null) {
                                                                                                                                    if (j4.size() == j5.size()) {
                                                                                                                                        int i19 = 0;
                                                                                                                                        for (Object obj8 : j4) {
                                                                                                                                            int i20 = i19 + 1;
                                                                                                                                            if (i19 < 0) {
                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                            }
                                                                                                                                            if (((EnumC0997pf) obj8) == ((EnumC0997pf) j5.get(i19))) {
                                                                                                                                                i19 = i20;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        z11 = true;
                                                                                                                                    }
                                                                                                                                    z11 = false;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            if (z11) {
                                                                                                                                List o4 = o();
                                                                                                                                if (o4 != null) {
                                                                                                                                    List o5 = c0720a7.o();
                                                                                                                                    if (o5 != null) {
                                                                                                                                        if (o4.size() == o5.size()) {
                                                                                                                                            int i21 = 0;
                                                                                                                                            for (Object obj9 : o4) {
                                                                                                                                                int i22 = i21 + 1;
                                                                                                                                                if (i21 < 0) {
                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                }
                                                                                                                                                if (((C1015qf) obj9).a((C1015qf) o5.get(i21), resolver, otherResolver)) {
                                                                                                                                                    i21 = i22;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            z12 = true;
                                                                                                                                        }
                                                                                                                                        z12 = false;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    return false;
                                                                                                                                }
                                                                                                                                if (z12) {
                                                                                                                                    List f4 = f();
                                                                                                                                    if (f4 != null) {
                                                                                                                                        List f5 = c0720a7.f();
                                                                                                                                        if (f5 != null) {
                                                                                                                                            if (f4.size() == f5.size()) {
                                                                                                                                                int i23 = 0;
                                                                                                                                                for (Object obj10 : f4) {
                                                                                                                                                    int i24 = i23 + 1;
                                                                                                                                                    if (i23 < 0) {
                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                    }
                                                                                                                                                    if (((AbstractC1176zf) obj10).a((AbstractC1176zf) f5.get(i23), resolver, otherResolver)) {
                                                                                                                                                        i23 = i24;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                z13 = true;
                                                                                                                                            }
                                                                                                                                            z13 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        return false;
                                                                                                                                    }
                                                                                                                                    if (z13 && getVisibility().evaluate(resolver) == c0720a7.getVisibility().evaluate(otherResolver)) {
                                                                                                                                        Wf q4 = q();
                                                                                                                                        if (q4 != null ? q4.h(c0720a7.q(), resolver, otherResolver) : c0720a7.q() == null) {
                                                                                                                                            List c4 = c();
                                                                                                                                            if (c4 != null) {
                                                                                                                                                List c5 = c0720a7.c();
                                                                                                                                                if (c5 != null) {
                                                                                                                                                    if (c4.size() == c5.size()) {
                                                                                                                                                        int i25 = 0;
                                                                                                                                                        for (Object obj11 : c4) {
                                                                                                                                                            int i26 = i25 + 1;
                                                                                                                                                            if (i25 < 0) {
                                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                                            }
                                                                                                                                                            if (((Wf) obj11).h((Wf) c5.get(i25), resolver, otherResolver)) {
                                                                                                                                                                i25 = i26;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        z14 = true;
                                                                                                                                                    }
                                                                                                                                                    z14 = false;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                return false;
                                                                                                                                            }
                                                                                                                                            if (z14 && getWidth().a(c0720a7.getWidth(), resolver, otherResolver)) {
                                                                                                                                                return true;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // O1.InterfaceC0752c3
    public List a() {
        return this.f5684m;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f5660H;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f5669Q;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f5672a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f5683l;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f5666N;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f5695x;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f5681j;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f5685n;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f5688q;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f5689r;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f5667O;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f5670R;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f5655C;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num = this.f5671S;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0720a7.class).hashCode();
        C0839h0 d4 = d();
        int i13 = 0;
        int hash = hashCode + (d4 != null ? d4.hash() : 0) + this.f5673b.hashCode() + this.f5674c.hashCode();
        C0742bb c0742bb = this.f5675d;
        int hash2 = hash + (c0742bb != null ? c0742bb.hash() : 0);
        Expression l4 = l();
        int hashCode2 = hash2 + (l4 != null ? l4.hashCode() : 0);
        Expression s4 = s();
        int hashCode3 = hashCode2 + (s4 != null ? s4.hashCode() : 0) + v().hashCode() + this.f5679h.hashCode();
        List u4 = u();
        if (u4 != null) {
            Iterator it = u4.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((E2) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i14 = hashCode3 + i4;
        List background = getBackground();
        if (background != null) {
            Iterator it2 = background.iterator();
            i5 = 0;
            while (it2.hasNext()) {
                i5 += ((X2) it2.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i15 = i14 + i5;
        C0860i3 w4 = w();
        int hash3 = i15 + (w4 != null ? w4.hash() : 0);
        Expression e4 = e();
        int hashCode4 = hash3 + (e4 != null ? e4.hashCode() : 0);
        List a4 = a();
        if (a4 != null) {
            Iterator it3 = a4.iterator();
            i6 = 0;
            while (it3.hasNext()) {
                i6 += ((M4) it3.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i16 = hashCode4 + i6;
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it4 = extensions.iterator();
            i7 = 0;
            while (it4.hasNext()) {
                i7 += ((C0933m5) it4.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i17 = i16 + i7;
        W5 x4 = x();
        int hash4 = i17 + (x4 != null ? x4.hash() : 0);
        List r4 = r();
        if (r4 != null) {
            Iterator it5 = r4.iterator();
            i8 = 0;
            while (it5.hasNext()) {
                i8 += ((C0809f6) it5.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int hash5 = hash4 + i8 + getHeight().hash();
        String id = getId();
        int hashCode5 = hash5 + (id != null ? id.hashCode() : 0) + this.f5690s.hashCode();
        C0742bb c0742bb2 = this.f5691t;
        int hash6 = hashCode5 + (c0742bb2 != null ? c0742bb2.hash() : 0);
        C0742bb c0742bb3 = this.f5692u;
        int hash7 = hash6 + (c0742bb3 != null ? c0742bb3.hash() : 0);
        AbstractC0738b7 abstractC0738b7 = this.f5693v;
        int hash8 = hash7 + (abstractC0738b7 != null ? abstractC0738b7.hash() : 0);
        C1079u8 m4 = m();
        int hash9 = hash8 + (m4 != null ? m4.hash() : 0);
        C0754c5 g4 = g();
        int hash10 = hash9 + (g4 != null ? g4.hash() : 0) + this.f5696y.hashCode();
        C0754c5 i18 = i();
        int hash11 = hash10 + (i18 != null ? i18.hash() : 0);
        String str = this.f5653A;
        int hashCode6 = hash11 + (str != null ? str.hashCode() : 0);
        Expression n4 = n();
        int hashCode7 = hashCode6 + (n4 != null ? n4.hashCode() : 0);
        Expression h4 = h();
        int hashCode8 = hashCode7 + (h4 != null ? h4.hashCode() : 0);
        List k4 = k();
        if (k4 != null) {
            Iterator it6 = k4.iterator();
            i9 = 0;
            while (it6.hasNext()) {
                i9 += ((C0892k0) it6.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int hash12 = hashCode8 + i9 + this.f5657E.hash() + this.f5658F.hash();
        List p4 = p();
        if (p4 != null) {
            Iterator it7 = p4.iterator();
            i10 = 0;
            while (it7.hasNext()) {
                i10 += ((Se) it7.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i19 = hash12 + i10;
        C0925lf b4 = b();
        int hash13 = i19 + (b4 != null ? b4.hash() : 0);
        AbstractC1092v3 z4 = z();
        int hash14 = hash13 + (z4 != null ? z4.hash() : 0);
        O2 t4 = t();
        int hash15 = hash14 + (t4 != null ? t4.hash() : 0);
        O2 y4 = y();
        int hash16 = hash15 + (y4 != null ? y4.hash() : 0);
        List j4 = j();
        int hashCode9 = hash16 + (j4 != null ? j4.hashCode() : 0);
        List o4 = o();
        if (o4 != null) {
            Iterator it8 = o4.iterator();
            i11 = 0;
            while (it8.hasNext()) {
                i11 += ((C1015qf) it8.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i20 = hashCode9 + i11;
        List f4 = f();
        if (f4 != null) {
            Iterator it9 = f4.iterator();
            i12 = 0;
            while (it9.hasNext()) {
                i12 += ((AbstractC1176zf) it9.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int hashCode10 = i20 + i12 + getVisibility().hashCode();
        Wf q4 = q();
        int hash17 = hashCode10 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it10 = c4.iterator();
            while (it10.hasNext()) {
                i13 += ((Wf) it10.next()).hash();
            }
        }
        int hash18 = hash17 + i13 + getWidth().hash();
        this.f5671S = Integer.valueOf(hash18);
        return hash18;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f5697z;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f5664L;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f5656D;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f5676e;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f5694w;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f5654B;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f5665M;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f5659G;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f5668P;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f5687p;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f5677f;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f5662J;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f5680i;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f5678g;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f5682k;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0935m7.f) BuiltInParserKt.getBuiltInParserComponent().a4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f5686o;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f5663K;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f5661I;
    }
}
