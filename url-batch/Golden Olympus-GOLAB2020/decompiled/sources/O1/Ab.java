package O1;

import O1.Bb;
import O1.C1127x2;
import O1.Gb;
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

/* loaded from: classes2.dex */
public final class Ab implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: S, reason: collision with root package name */
    public static final b f1329S = new b(null);

    /* renamed from: T, reason: collision with root package name */
    private static final C1127x2 f1330T;

    /* renamed from: U, reason: collision with root package name */
    private static final Expression f1331U;

    /* renamed from: V, reason: collision with root package name */
    private static final Expression f1332V;

    /* renamed from: W, reason: collision with root package name */
    private static final Yb.e f1333W;

    /* renamed from: X, reason: collision with root package name */
    private static final Expression f1334X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Yb.d f1335Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final Function2 f1336Z;

    /* renamed from: A, reason: collision with root package name */
    public final List f1337A;

    /* renamed from: B, reason: collision with root package name */
    public final List f1338B;

    /* renamed from: C, reason: collision with root package name */
    private final Expression f1339C;

    /* renamed from: D, reason: collision with root package name */
    private final Expression f1340D;

    /* renamed from: E, reason: collision with root package name */
    private final List f1341E;

    /* renamed from: F, reason: collision with root package name */
    private final List f1342F;

    /* renamed from: G, reason: collision with root package name */
    private final C0925lf f1343G;

    /* renamed from: H, reason: collision with root package name */
    private final AbstractC1092v3 f1344H;

    /* renamed from: I, reason: collision with root package name */
    private final O2 f1345I;

    /* renamed from: J, reason: collision with root package name */
    private final O2 f1346J;

    /* renamed from: K, reason: collision with root package name */
    private final List f1347K;

    /* renamed from: L, reason: collision with root package name */
    private final List f1348L;

    /* renamed from: M, reason: collision with root package name */
    private final List f1349M;

    /* renamed from: N, reason: collision with root package name */
    private final Expression f1350N;

    /* renamed from: O, reason: collision with root package name */
    private final Wf f1351O;

    /* renamed from: P, reason: collision with root package name */
    private final List f1352P;

    /* renamed from: Q, reason: collision with root package name */
    private final Yb f1353Q;

    /* renamed from: R, reason: collision with root package name */
    private Integer f1354R;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f1355a;

    /* renamed from: b, reason: collision with root package name */
    public final C0892k0 f1356b;

    /* renamed from: c, reason: collision with root package name */
    public final C1127x2 f1357c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1358d;

    /* renamed from: e, reason: collision with root package name */
    private final Expression f1359e;

    /* renamed from: f, reason: collision with root package name */
    private final Expression f1360f;

    /* renamed from: g, reason: collision with root package name */
    private final Expression f1361g;

    /* renamed from: h, reason: collision with root package name */
    private final List f1362h;

    /* renamed from: i, reason: collision with root package name */
    private final List f1363i;

    /* renamed from: j, reason: collision with root package name */
    private final C0860i3 f1364j;

    /* renamed from: k, reason: collision with root package name */
    public final Expression f1365k;

    /* renamed from: l, reason: collision with root package name */
    private final Expression f1366l;

    /* renamed from: m, reason: collision with root package name */
    public final c f1367m;

    /* renamed from: n, reason: collision with root package name */
    private final List f1368n;

    /* renamed from: o, reason: collision with root package name */
    public final List f1369o;

    /* renamed from: p, reason: collision with root package name */
    private final List f1370p;

    /* renamed from: q, reason: collision with root package name */
    private final W5 f1371q;

    /* renamed from: r, reason: collision with root package name */
    private final List f1372r;

    /* renamed from: s, reason: collision with root package name */
    private final Yb f1373s;

    /* renamed from: t, reason: collision with root package name */
    public final List f1374t;

    /* renamed from: u, reason: collision with root package name */
    public final List f1375u;

    /* renamed from: v, reason: collision with root package name */
    private final String f1376v;

    /* renamed from: w, reason: collision with root package name */
    private final C1079u8 f1377w;

    /* renamed from: x, reason: collision with root package name */
    public final List f1378x;

    /* renamed from: y, reason: collision with root package name */
    private final C0754c5 f1379y;

    /* renamed from: z, reason: collision with root package name */
    private final C0754c5 f1380z;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1381i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ab invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ab.f1329S.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ab a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Gb.e) BuiltInParserKt.getBuiltInParserComponent().J6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: d, reason: collision with root package name */
        public static final b f1382d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Expression f1383e;

        /* renamed from: f, reason: collision with root package name */
        private static final Expression f1384f;

        /* renamed from: g, reason: collision with root package name */
        private static final Function2 f1385g;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f1386a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f1387b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f1388c;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f1389i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f1382d.a(env, it);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((Bb.c) BuiltInParserKt.getBuiltInParserComponent().G6().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        /* renamed from: O1.Ab$c$c, reason: collision with other inner class name */
        public enum EnumC0024c {
            VERTICAL("vertical"),
            HORIZONTAL("horizontal");


            /* renamed from: c, reason: collision with root package name */
            public static final C0025c f1390c = new C0025c(null);

            /* renamed from: d, reason: collision with root package name */
            public static final Function1 f1391d = b.f1398i;

            /* renamed from: e, reason: collision with root package name */
            public static final Function1 f1392e = a.f1397i;

            /* renamed from: b, reason: collision with root package name */
            private final String f1396b;

            /* renamed from: O1.Ab$c$c$a */
            static final class a extends kotlin.jvm.internal.s implements Function1 {

                /* renamed from: i, reason: collision with root package name */
                public static final a f1397i = new a();

                a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final EnumC0024c invoke(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return EnumC0024c.f1390c.a(value);
                }
            }

            /* renamed from: O1.Ab$c$c$b */
            static final class b extends kotlin.jvm.internal.s implements Function1 {

                /* renamed from: i, reason: collision with root package name */
                public static final b f1398i = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(EnumC0024c value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return EnumC0024c.f1390c.b(value);
                }
            }

            /* renamed from: O1.Ab$c$c$c, reason: collision with other inner class name */
            public static final class C0025c {
                public /* synthetic */ C0025c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final EnumC0024c a(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    EnumC0024c enumC0024c = EnumC0024c.VERTICAL;
                    if (Intrinsics.areEqual(value, enumC0024c.f1396b)) {
                        return enumC0024c;
                    }
                    EnumC0024c enumC0024c2 = EnumC0024c.HORIZONTAL;
                    if (Intrinsics.areEqual(value, enumC0024c2.f1396b)) {
                        return enumC0024c2;
                    }
                    return null;
                }

                public final String b(EnumC0024c obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.f1396b;
                }

                private C0025c() {
                }
            }

            EnumC0024c(String str) {
                this.f1396b = str;
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f1383e = companion.constant(335544320);
            f1384f = companion.constant(EnumC0024c.HORIZONTAL);
            f1385g = a.f1389i;
        }

        public c(Expression color, Expression orientation) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.f1386a = color;
            this.f1387b = orientation;
        }

        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            return cVar != null && ((Number) this.f1386a.evaluate(resolver)).intValue() == ((Number) cVar.f1386a.evaluate(otherResolver)).intValue() && this.f1387b.evaluate(resolver) == cVar.f1387b.evaluate(otherResolver);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f1388c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode() + this.f1386a.hashCode() + this.f1387b.hashCode();
            this.f1388c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Bb.c) BuiltInParserKt.getBuiltInParserComponent().G6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant = companion.constant(100L);
        Expression constant2 = companion.constant(Double.valueOf(0.6d));
        Expression constant3 = companion.constant(C1127x2.c.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f1330T = new C1127x2(constant, constant2, null, null, constant3, null, null, companion.constant(valueOf), 108, null);
        f1331U = companion.constant(valueOf);
        f1332V = companion.constant(Boolean.TRUE);
        f1333W = new Yb.e(new C0765cg(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        f1334X = companion.constant(Vf.VISIBLE);
        f1335Y = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        f1336Z = a.f1381i;
    }

    public Ab(C0839h0 c0839h0, C0892k0 c0892k0, C1127x2 actionAnimation, List list, Expression expression, Expression expression2, Expression alpha, List list2, List list3, C0860i3 c0860i3, Expression captureFocusOnAction, Expression expression3, c cVar, List list4, List list5, List list6, W5 w5, List list7, Yb height, List list8, List list9, String str, C1079u8 c1079u8, List list10, C0754c5 c0754c5, C0754c5 c0754c52, List list11, List list12, Expression expression4, Expression expression5, List list13, List list14, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list15, List list16, List list17, Expression visibility, Wf wf, List list18, Yb width) {
        Intrinsics.checkNotNullParameter(actionAnimation, "actionAnimation");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "captureFocusOnAction");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f1355a = c0839h0;
        this.f1356b = c0892k0;
        this.f1357c = actionAnimation;
        this.f1358d = list;
        this.f1359e = expression;
        this.f1360f = expression2;
        this.f1361g = alpha;
        this.f1362h = list2;
        this.f1363i = list3;
        this.f1364j = c0860i3;
        this.f1365k = captureFocusOnAction;
        this.f1366l = expression3;
        this.f1367m = cVar;
        this.f1368n = list4;
        this.f1369o = list5;
        this.f1370p = list6;
        this.f1371q = w5;
        this.f1372r = list7;
        this.f1373s = height;
        this.f1374t = list8;
        this.f1375u = list9;
        this.f1376v = str;
        this.f1377w = c1079u8;
        this.f1378x = list10;
        this.f1379y = c0754c5;
        this.f1380z = c0754c52;
        this.f1337A = list11;
        this.f1338B = list12;
        this.f1339C = expression4;
        this.f1340D = expression5;
        this.f1341E = list13;
        this.f1342F = list14;
        this.f1343G = c0925lf;
        this.f1344H = abstractC1092v3;
        this.f1345I = o22;
        this.f1346J = o23;
        this.f1347K = list15;
        this.f1348L = list16;
        this.f1349M = list17;
        this.f1350N = visibility;
        this.f1351O = wf;
        this.f1352P = list18;
        this.f1353Q = width;
    }

    public static /* synthetic */ Ab B(Ab ab, C0839h0 c0839h0, C0892k0 c0892k0, C1127x2 c1127x2, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, C0860i3 c0860i3, Expression expression4, Expression expression5, c cVar, List list4, List list5, List list6, W5 w5, List list7, Yb yb, List list8, List list9, String str, C1079u8 c1079u8, List list10, C0754c5 c0754c5, C0754c5 c0754c52, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list15, List list16, List list17, Expression expression8, Wf wf, List list18, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? ab.d() : c0839h0;
        C0892k0 c0892k02 = (i4 & 2) != 0 ? ab.f1356b : c0892k0;
        C1127x2 c1127x22 = (i4 & 4) != 0 ? ab.f1357c : c1127x2;
        List list19 = (i4 & 8) != 0 ? ab.f1358d : list;
        Expression l4 = (i4 & 16) != 0 ? ab.l() : expression;
        Expression s4 = (i4 & 32) != 0 ? ab.s() : expression2;
        Expression v4 = (i4 & 64) != 0 ? ab.v() : expression3;
        List u4 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ab.u() : list2;
        List background = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ab.getBackground() : list3;
        C0860i3 w4 = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ab.w() : c0860i3;
        Expression expression9 = (i4 & 1024) != 0 ? ab.f1365k : expression4;
        Expression e4 = (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? ab.e() : expression5;
        c cVar2 = (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? ab.f1367m : cVar;
        C0839h0 c0839h02 = d4;
        List a4 = (i4 & 8192) != 0 ? ab.a() : list4;
        List list20 = (i4 & 16384) != 0 ? ab.f1369o : list5;
        List extensions = (i4 & 32768) != 0 ? ab.getExtensions() : list6;
        W5 x4 = (i4 & 65536) != 0 ? ab.x() : w5;
        List r4 = (i4 & 131072) != 0 ? ab.r() : list7;
        Yb height = (i4 & 262144) != 0 ? ab.getHeight() : yb;
        List list21 = (i4 & 524288) != 0 ? ab.f1374t : list8;
        List list22 = (i4 & 1048576) != 0 ? ab.f1375u : list9;
        return ab.A(c0839h02, c0892k02, c1127x22, list19, l4, s4, v4, u4, background, w4, expression9, e4, cVar2, a4, list20, extensions, x4, r4, height, list21, list22, (i4 & 2097152) != 0 ? ab.getId() : str, (i4 & 4194304) != 0 ? ab.m() : c1079u8, (i4 & 8388608) != 0 ? ab.f1378x : list10, (i4 & 16777216) != 0 ? ab.g() : c0754c5, (i4 & 33554432) != 0 ? ab.i() : c0754c52, (i4 & 67108864) != 0 ? ab.f1337A : list11, (i4 & 134217728) != 0 ? ab.f1338B : list12, (i4 & 268435456) != 0 ? ab.n() : expression6, (i4 & 536870912) != 0 ? ab.h() : expression7, (i4 & 1073741824) != 0 ? ab.k() : list13, (i4 & Integer.MIN_VALUE) != 0 ? ab.p() : list14, (i5 & 1) != 0 ? ab.b() : c0925lf, (i5 & 2) != 0 ? ab.z() : abstractC1092v3, (i5 & 4) != 0 ? ab.t() : o22, (i5 & 8) != 0 ? ab.y() : o23, (i5 & 16) != 0 ? ab.j() : list15, (i5 & 32) != 0 ? ab.o() : list16, (i5 & 64) != 0 ? ab.f() : list17, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ab.getVisibility() : expression8, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ab.q() : wf, (i5 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ab.c() : list18, (i5 & 1024) != 0 ? ab.getWidth() : yb2);
    }

    public final Ab A(C0839h0 c0839h0, C0892k0 c0892k0, C1127x2 actionAnimation, List list, Expression expression, Expression expression2, Expression alpha, List list2, List list3, C0860i3 c0860i3, Expression captureFocusOnAction, Expression expression3, c cVar, List list4, List list5, List list6, W5 w5, List list7, Yb height, List list8, List list9, String str, C1079u8 c1079u8, List list10, C0754c5 c0754c5, C0754c5 c0754c52, List list11, List list12, Expression expression4, Expression expression5, List list13, List list14, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list15, List list16, List list17, Expression visibility, Wf wf, List list18, Yb width) {
        Intrinsics.checkNotNullParameter(actionAnimation, "actionAnimation");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "captureFocusOnAction");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new Ab(c0839h0, c0892k0, actionAnimation, list, expression, expression2, alpha, list2, list3, c0860i3, captureFocusOnAction, expression3, cVar, list4, list5, list6, w5, list7, height, list8, list9, str, c1079u8, list10, c0754c5, c0754c52, list11, list12, expression4, expression5, list13, list14, c0925lf, abstractC1092v3, o22, o23, list15, list16, list17, visibility, wf, list18, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:477:0x0795, code lost:
    
        if (r9.c() == null) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x071d, code lost:
    
        if (r9.f() == null) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x06d1, code lost:
    
        if (r9.o() == null) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0685, code lost:
    
        if (r9.j() == null) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x05d0, code lost:
    
        if (r9.p() == null) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0584, code lost:
    
        if (r9.k() == null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x04f6, code lost:
    
        if (r9.f1338B == null) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x04b0, code lost:
    
        if (r9.f1337A == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0436, code lost:
    
        if (r9.f1378x == null) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x03c8, code lost:
    
        if (r9.f1375u == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0382, code lost:
    
        if (r9.f1374t == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x032e, code lost:
    
        if (r9.r() == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x02c8, code lost:
    
        if (r9.getExtensions() == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x027c, code lost:
    
        if (r9.f1369o == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0236, code lost:
    
        if (r9.a() == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0180, code lost:
    
        if (r9.getBackground() == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0134, code lost:
    
        if (r9.u() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0086, code lost:
    
        if (r9.f1358d == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(Ab ab, ExpressionResolver resolver, ExpressionResolver otherResolver) {
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
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (ab == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(ab.d(), resolver, otherResolver) : ab.d() == null) {
            C0892k0 c0892k0 = this.f1356b;
            if ((c0892k0 != null ? c0892k0.a(ab.f1356b, resolver, otherResolver) : ab.f1356b == null) && this.f1357c.a(ab.f1357c, resolver, otherResolver)) {
                List list = this.f1358d;
                if (list != null) {
                    List list2 = ab.f1358d;
                    if (list2 != null) {
                        if (list.size() == list2.size()) {
                            int i4 = 0;
                            for (Object obj : list) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((C0892k0) obj).a((C0892k0) list2.get(i4), resolver, otherResolver)) {
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
                    Expression l4 = l();
                    EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
                    Expression l5 = ab.l();
                    if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                        Expression s4 = s();
                        EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                        Expression s5 = ab.s();
                        if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                            if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) ab.v().evaluate(otherResolver)).doubleValue()) {
                                List u4 = u();
                                if (u4 != null) {
                                    List u5 = ab.u();
                                    if (u5 != null) {
                                        if (u4.size() == u5.size()) {
                                            int i6 = 0;
                                            for (Object obj2 : u4) {
                                                int i7 = i6 + 1;
                                                if (i6 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                if (((E2) obj2).a((E2) u5.get(i6), resolver, otherResolver)) {
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
                                    List background = getBackground();
                                    if (background != null) {
                                        List background2 = ab.getBackground();
                                        if (background2 != null) {
                                            if (background.size() == background2.size()) {
                                                int i8 = 0;
                                                for (Object obj3 : background) {
                                                    int i9 = i8 + 1;
                                                    if (i8 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    if (((X2) obj3).a((X2) background2.get(i8), resolver, otherResolver)) {
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
                                        C0860i3 w4 = w();
                                        if ((w4 != null ? w4.a(ab.w(), resolver, otherResolver) : ab.w() == null) && ((Boolean) this.f1365k.evaluate(resolver)).booleanValue() == ((Boolean) ab.f1365k.evaluate(otherResolver)).booleanValue()) {
                                            Expression e4 = e();
                                            Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                            Expression e5 = ab.e();
                                            if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null)) {
                                                c cVar = this.f1367m;
                                                if (cVar != null ? cVar.a(ab.f1367m, resolver, otherResolver) : ab.f1367m == null) {
                                                    List a4 = a();
                                                    if (a4 != null) {
                                                        List a5 = ab.a();
                                                        if (a5 != null) {
                                                            if (a4.size() == a5.size()) {
                                                                int i10 = 0;
                                                                for (Object obj4 : a4) {
                                                                    int i11 = i10 + 1;
                                                                    if (i10 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    if (((M4) obj4).h((M4) a5.get(i10), resolver, otherResolver)) {
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
                                                        List list3 = this.f1369o;
                                                        if (list3 != null) {
                                                            List list4 = ab.f1369o;
                                                            if (list4 != null) {
                                                                if (list3.size() == list4.size()) {
                                                                    int i12 = 0;
                                                                    for (Object obj5 : list3) {
                                                                        int i13 = i12 + 1;
                                                                        if (i12 < 0) {
                                                                            CollectionsKt.throwIndexOverflow();
                                                                        }
                                                                        if (((C0892k0) obj5).a((C0892k0) list4.get(i12), resolver, otherResolver)) {
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
                                                        if (z8) {
                                                            List extensions = getExtensions();
                                                            if (extensions != null) {
                                                                List extensions2 = ab.getExtensions();
                                                                if (extensions2 != null) {
                                                                    if (extensions.size() == extensions2.size()) {
                                                                        int i14 = 0;
                                                                        for (Object obj6 : extensions) {
                                                                            int i15 = i14 + 1;
                                                                            if (i14 < 0) {
                                                                                CollectionsKt.throwIndexOverflow();
                                                                            }
                                                                            if (((C0933m5) obj6).a((C0933m5) extensions2.get(i14), resolver, otherResolver)) {
                                                                                i14 = i15;
                                                                            }
                                                                        }
                                                                        z9 = true;
                                                                    }
                                                                    z9 = false;
                                                                    break;
                                                                }
                                                                return false;
                                                            }
                                                            if (z9) {
                                                                W5 x4 = x();
                                                                if (x4 != null ? x4.a(ab.x(), resolver, otherResolver) : ab.x() == null) {
                                                                    List r4 = r();
                                                                    if (r4 != null) {
                                                                        List r5 = ab.r();
                                                                        if (r5 != null) {
                                                                            if (r4.size() == r5.size()) {
                                                                                int i16 = 0;
                                                                                for (Object obj7 : r4) {
                                                                                    int i17 = i16 + 1;
                                                                                    if (i16 < 0) {
                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                    }
                                                                                    if (((C0809f6) obj7).a((C0809f6) r5.get(i16), resolver, otherResolver)) {
                                                                                        i16 = i17;
                                                                                    }
                                                                                }
                                                                                z10 = true;
                                                                            }
                                                                            z10 = false;
                                                                            break;
                                                                        }
                                                                        return false;
                                                                    }
                                                                    if (z10 && getHeight().a(ab.getHeight(), resolver, otherResolver)) {
                                                                        List list5 = this.f1374t;
                                                                        if (list5 != null) {
                                                                            List list6 = ab.f1374t;
                                                                            if (list6 != null) {
                                                                                if (list5.size() == list6.size()) {
                                                                                    int i18 = 0;
                                                                                    for (Object obj8 : list5) {
                                                                                        int i19 = i18 + 1;
                                                                                        if (i18 < 0) {
                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                        }
                                                                                        if (((C0892k0) obj8).a((C0892k0) list6.get(i18), resolver, otherResolver)) {
                                                                                            i18 = i19;
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
                                                                            List list7 = this.f1375u;
                                                                            if (list7 != null) {
                                                                                List list8 = ab.f1375u;
                                                                                if (list8 != null) {
                                                                                    if (list7.size() == list8.size()) {
                                                                                        int i20 = 0;
                                                                                        for (Object obj9 : list7) {
                                                                                            int i21 = i20 + 1;
                                                                                            if (i20 < 0) {
                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                            }
                                                                                            if (((C0892k0) obj9).a((C0892k0) list8.get(i20), resolver, otherResolver)) {
                                                                                                i20 = i21;
                                                                                            }
                                                                                        }
                                                                                        z12 = true;
                                                                                    }
                                                                                    z12 = false;
                                                                                    break;
                                                                                }
                                                                                return false;
                                                                            }
                                                                            if (z12 && Intrinsics.areEqual(getId(), ab.getId())) {
                                                                                C1079u8 m4 = m();
                                                                                if (m4 != null ? m4.a(ab.m(), resolver, otherResolver) : ab.m() == null) {
                                                                                    List list9 = this.f1378x;
                                                                                    if (list9 != null) {
                                                                                        List list10 = ab.f1378x;
                                                                                        if (list10 != null) {
                                                                                            if (list9.size() == list10.size()) {
                                                                                                int i22 = 0;
                                                                                                for (Object obj10 : list9) {
                                                                                                    int i23 = i22 + 1;
                                                                                                    if (i22 < 0) {
                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                    }
                                                                                                    if (((C0892k0) obj10).a((C0892k0) list10.get(i22), resolver, otherResolver)) {
                                                                                                        i22 = i23;
                                                                                                    }
                                                                                                }
                                                                                                z13 = true;
                                                                                            }
                                                                                            z13 = false;
                                                                                            break;
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    if (z13) {
                                                                                        C0754c5 g4 = g();
                                                                                        if (g4 != null ? g4.a(ab.g(), resolver, otherResolver) : ab.g() == null) {
                                                                                            C0754c5 i24 = i();
                                                                                            if (i24 != null ? i24.a(ab.i(), resolver, otherResolver) : ab.i() == null) {
                                                                                                List list11 = this.f1337A;
                                                                                                if (list11 != null) {
                                                                                                    List list12 = ab.f1337A;
                                                                                                    if (list12 != null) {
                                                                                                        if (list11.size() == list12.size()) {
                                                                                                            int i25 = 0;
                                                                                                            for (Object obj11 : list11) {
                                                                                                                int i26 = i25 + 1;
                                                                                                                if (i25 < 0) {
                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                }
                                                                                                                if (((C0892k0) obj11).a((C0892k0) list12.get(i25), resolver, otherResolver)) {
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
                                                                                                if (z14) {
                                                                                                    List list13 = this.f1338B;
                                                                                                    if (list13 != null) {
                                                                                                        List list14 = ab.f1338B;
                                                                                                        if (list14 != null) {
                                                                                                            if (list13.size() == list14.size()) {
                                                                                                                int i27 = 0;
                                                                                                                for (Object obj12 : list13) {
                                                                                                                    int i28 = i27 + 1;
                                                                                                                    if (i27 < 0) {
                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                    }
                                                                                                                    if (((C0892k0) obj12).a((C0892k0) list14.get(i27), resolver, otherResolver)) {
                                                                                                                        i27 = i28;
                                                                                                                    }
                                                                                                                }
                                                                                                                z15 = true;
                                                                                                            }
                                                                                                            z15 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        return false;
                                                                                                    }
                                                                                                    if (z15) {
                                                                                                        Expression n4 = n();
                                                                                                        String str = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                                                        Expression n5 = ab.n();
                                                                                                        if (Intrinsics.areEqual(str, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                                                            Expression h4 = h();
                                                                                                            Long l7 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                                                            Expression h5 = ab.h();
                                                                                                            if (Intrinsics.areEqual(l7, h5 != null ? (Long) h5.evaluate(otherResolver) : null)) {
                                                                                                                List k4 = k();
                                                                                                                if (k4 != null) {
                                                                                                                    List k5 = ab.k();
                                                                                                                    if (k5 != null) {
                                                                                                                        if (k4.size() == k5.size()) {
                                                                                                                            int i29 = 0;
                                                                                                                            for (Object obj13 : k4) {
                                                                                                                                int i30 = i29 + 1;
                                                                                                                                if (i29 < 0) {
                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                }
                                                                                                                                if (((C0892k0) obj13).a((C0892k0) k5.get(i29), resolver, otherResolver)) {
                                                                                                                                    i29 = i30;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            z16 = true;
                                                                                                                        }
                                                                                                                        z16 = false;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    return false;
                                                                                                                }
                                                                                                                if (z16) {
                                                                                                                    List p4 = p();
                                                                                                                    if (p4 != null) {
                                                                                                                        List p5 = ab.p();
                                                                                                                        if (p5 != null) {
                                                                                                                            if (p4.size() == p5.size()) {
                                                                                                                                int i31 = 0;
                                                                                                                                for (Object obj14 : p4) {
                                                                                                                                    int i32 = i31 + 1;
                                                                                                                                    if (i31 < 0) {
                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                    }
                                                                                                                                    if (((Se) obj14).a((Se) p5.get(i31), resolver, otherResolver)) {
                                                                                                                                        i31 = i32;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                z17 = true;
                                                                                                                            }
                                                                                                                            z17 = false;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                    if (z17) {
                                                                                                                        C0925lf b4 = b();
                                                                                                                        if (b4 != null ? b4.a(ab.b(), resolver, otherResolver) : ab.b() == null) {
                                                                                                                            AbstractC1092v3 z22 = z();
                                                                                                                            if (z22 != null ? z22.a(ab.z(), resolver, otherResolver) : ab.z() == null) {
                                                                                                                                O2 t4 = t();
                                                                                                                                if (t4 != null ? t4.a(ab.t(), resolver, otherResolver) : ab.t() == null) {
                                                                                                                                    O2 y4 = y();
                                                                                                                                    if (y4 != null ? y4.a(ab.y(), resolver, otherResolver) : ab.y() == null) {
                                                                                                                                        List j4 = j();
                                                                                                                                        if (j4 != null) {
                                                                                                                                            List j5 = ab.j();
                                                                                                                                            if (j5 != null) {
                                                                                                                                                if (j4.size() == j5.size()) {
                                                                                                                                                    int i33 = 0;
                                                                                                                                                    for (Object obj15 : j4) {
                                                                                                                                                        int i34 = i33 + 1;
                                                                                                                                                        if (i33 < 0) {
                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                        }
                                                                                                                                                        if (((EnumC0997pf) obj15) == ((EnumC0997pf) j5.get(i33))) {
                                                                                                                                                            i33 = i34;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    z18 = true;
                                                                                                                                                }
                                                                                                                                                z18 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                        if (z18) {
                                                                                                                                            List o4 = o();
                                                                                                                                            if (o4 != null) {
                                                                                                                                                List o5 = ab.o();
                                                                                                                                                if (o5 != null) {
                                                                                                                                                    if (o4.size() == o5.size()) {
                                                                                                                                                        int i35 = 0;
                                                                                                                                                        for (Object obj16 : o4) {
                                                                                                                                                            int i36 = i35 + 1;
                                                                                                                                                            if (i35 < 0) {
                                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                                            }
                                                                                                                                                            if (((C1015qf) obj16).a((C1015qf) o5.get(i35), resolver, otherResolver)) {
                                                                                                                                                                i35 = i36;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        z19 = true;
                                                                                                                                                    }
                                                                                                                                                    z19 = false;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                return false;
                                                                                                                                            }
                                                                                                                                            if (z19) {
                                                                                                                                                List f4 = f();
                                                                                                                                                if (f4 != null) {
                                                                                                                                                    List f5 = ab.f();
                                                                                                                                                    if (f5 != null) {
                                                                                                                                                        if (f4.size() == f5.size()) {
                                                                                                                                                            int i37 = 0;
                                                                                                                                                            for (Object obj17 : f4) {
                                                                                                                                                                int i38 = i37 + 1;
                                                                                                                                                                if (i37 < 0) {
                                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                                }
                                                                                                                                                                if (((AbstractC1176zf) obj17).a((AbstractC1176zf) f5.get(i37), resolver, otherResolver)) {
                                                                                                                                                                    i37 = i38;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            z20 = true;
                                                                                                                                                        }
                                                                                                                                                        z20 = false;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    return false;
                                                                                                                                                }
                                                                                                                                                if (z20 && getVisibility().evaluate(resolver) == ab.getVisibility().evaluate(otherResolver)) {
                                                                                                                                                    Wf q4 = q();
                                                                                                                                                    if (q4 != null ? q4.h(ab.q(), resolver, otherResolver) : ab.q() == null) {
                                                                                                                                                        List c4 = c();
                                                                                                                                                        if (c4 != null) {
                                                                                                                                                            List c5 = ab.c();
                                                                                                                                                            if (c5 != null) {
                                                                                                                                                                if (c4.size() == c5.size()) {
                                                                                                                                                                    int i39 = 0;
                                                                                                                                                                    for (Object obj18 : c4) {
                                                                                                                                                                        int i40 = i39 + 1;
                                                                                                                                                                        if (i39 < 0) {
                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                        }
                                                                                                                                                                        if (((Wf) obj18).h((Wf) c5.get(i39), resolver, otherResolver)) {
                                                                                                                                                                            i39 = i40;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    z21 = true;
                                                                                                                                                                }
                                                                                                                                                                z21 = false;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            return false;
                                                                                                                                                        }
                                                                                                                                                        if (z21 && getWidth().a(ab.getWidth(), resolver, otherResolver)) {
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
                }
            }
        }
        return false;
    }

    @Override // O1.InterfaceC0752c3
    public List a() {
        return this.f1368n;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f1343G;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f1352P;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f1355a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f1366l;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f1349M;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f1379y;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f1363i;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f1370p;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f1373s;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f1376v;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f1350N;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f1353Q;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f1340D;
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
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Integer num = this.f1354R;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ab.class).hashCode();
        C0839h0 d4 = d();
        int i20 = 0;
        int hash = hashCode + (d4 != null ? d4.hash() : 0);
        C0892k0 c0892k0 = this.f1356b;
        int hash2 = hash + (c0892k0 != null ? c0892k0.hash() : 0) + this.f1357c.hash();
        List list = this.f1358d;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((C0892k0) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i21 = hash2 + i4;
        Expression l4 = l();
        int hashCode2 = i21 + (l4 != null ? l4.hashCode() : 0);
        Expression s4 = s();
        int hashCode3 = hashCode2 + (s4 != null ? s4.hashCode() : 0) + v().hashCode();
        List u4 = u();
        if (u4 != null) {
            Iterator it2 = u4.iterator();
            i5 = 0;
            while (it2.hasNext()) {
                i5 += ((E2) it2.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i22 = hashCode3 + i5;
        List background = getBackground();
        if (background != null) {
            Iterator it3 = background.iterator();
            i6 = 0;
            while (it3.hasNext()) {
                i6 += ((X2) it3.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i23 = i22 + i6;
        C0860i3 w4 = w();
        int hash3 = i23 + (w4 != null ? w4.hash() : 0) + this.f1365k.hashCode();
        Expression e4 = e();
        int hashCode4 = hash3 + (e4 != null ? e4.hashCode() : 0);
        c cVar = this.f1367m;
        int hash4 = hashCode4 + (cVar != null ? cVar.hash() : 0);
        List a4 = a();
        if (a4 != null) {
            Iterator it4 = a4.iterator();
            i7 = 0;
            while (it4.hasNext()) {
                i7 += ((M4) it4.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i24 = hash4 + i7;
        List list2 = this.f1369o;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            i8 = 0;
            while (it5.hasNext()) {
                i8 += ((C0892k0) it5.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i25 = i24 + i8;
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it6 = extensions.iterator();
            i9 = 0;
            while (it6.hasNext()) {
                i9 += ((C0933m5) it6.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i26 = i25 + i9;
        W5 x4 = x();
        int hash5 = i26 + (x4 != null ? x4.hash() : 0);
        List r4 = r();
        if (r4 != null) {
            Iterator it7 = r4.iterator();
            i10 = 0;
            while (it7.hasNext()) {
                i10 += ((C0809f6) it7.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int hash6 = hash5 + i10 + getHeight().hash();
        List list3 = this.f1374t;
        if (list3 != null) {
            Iterator it8 = list3.iterator();
            i11 = 0;
            while (it8.hasNext()) {
                i11 += ((C0892k0) it8.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i27 = hash6 + i11;
        List list4 = this.f1375u;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            i12 = 0;
            while (it9.hasNext()) {
                i12 += ((C0892k0) it9.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i28 = i27 + i12;
        String id = getId();
        int hashCode5 = i28 + (id != null ? id.hashCode() : 0);
        C1079u8 m4 = m();
        int hash7 = hashCode5 + (m4 != null ? m4.hash() : 0);
        List list5 = this.f1378x;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            i13 = 0;
            while (it10.hasNext()) {
                i13 += ((C0892k0) it10.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i29 = hash7 + i13;
        C0754c5 g4 = g();
        int hash8 = i29 + (g4 != null ? g4.hash() : 0);
        C0754c5 i30 = i();
        int hash9 = hash8 + (i30 != null ? i30.hash() : 0);
        List list6 = this.f1337A;
        if (list6 != null) {
            Iterator it11 = list6.iterator();
            i14 = 0;
            while (it11.hasNext()) {
                i14 += ((C0892k0) it11.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i31 = hash9 + i14;
        List list7 = this.f1338B;
        if (list7 != null) {
            Iterator it12 = list7.iterator();
            i15 = 0;
            while (it12.hasNext()) {
                i15 += ((C0892k0) it12.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i32 = i31 + i15;
        Expression n4 = n();
        int hashCode6 = i32 + (n4 != null ? n4.hashCode() : 0);
        Expression h4 = h();
        int hashCode7 = hashCode6 + (h4 != null ? h4.hashCode() : 0);
        List k4 = k();
        if (k4 != null) {
            Iterator it13 = k4.iterator();
            i16 = 0;
            while (it13.hasNext()) {
                i16 += ((C0892k0) it13.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int i33 = hashCode7 + i16;
        List p4 = p();
        if (p4 != null) {
            Iterator it14 = p4.iterator();
            i17 = 0;
            while (it14.hasNext()) {
                i17 += ((Se) it14.next()).hash();
            }
        } else {
            i17 = 0;
        }
        int i34 = i33 + i17;
        C0925lf b4 = b();
        int hash10 = i34 + (b4 != null ? b4.hash() : 0);
        AbstractC1092v3 z4 = z();
        int hash11 = hash10 + (z4 != null ? z4.hash() : 0);
        O2 t4 = t();
        int hash12 = hash11 + (t4 != null ? t4.hash() : 0);
        O2 y4 = y();
        int hash13 = hash12 + (y4 != null ? y4.hash() : 0);
        List j4 = j();
        int hashCode8 = hash13 + (j4 != null ? j4.hashCode() : 0);
        List o4 = o();
        if (o4 != null) {
            Iterator it15 = o4.iterator();
            i18 = 0;
            while (it15.hasNext()) {
                i18 += ((C1015qf) it15.next()).hash();
            }
        } else {
            i18 = 0;
        }
        int i35 = hashCode8 + i18;
        List f4 = f();
        if (f4 != null) {
            Iterator it16 = f4.iterator();
            i19 = 0;
            while (it16.hasNext()) {
                i19 += ((AbstractC1176zf) it16.next()).hash();
            }
        } else {
            i19 = 0;
        }
        int hashCode9 = i35 + i19 + getVisibility().hashCode();
        Wf q4 = q();
        int hash14 = hashCode9 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it17 = c4.iterator();
            while (it17.hasNext()) {
                i20 += ((Wf) it17.next()).hash();
            }
        }
        int hash15 = hash14 + i20 + getWidth().hash();
        this.f1354R = Integer.valueOf(hash15);
        return hash15;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f1380z;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f1347K;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f1341E;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f1359e;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f1377w;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f1339C;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f1348L;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f1342F;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f1351O;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f1372r;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f1360f;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f1345I;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f1362h;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f1361g;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f1364j;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Gb.e) BuiltInParserKt.getBuiltInParserComponent().J6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f1371q;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f1346J;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f1344H;
    }
}
