package O1;

import O1.Hc;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Bc implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: O, reason: collision with root package name */
    public static final b f1483O = new b(null);

    /* renamed from: P, reason: collision with root package name */
    private static final Expression f1484P;

    /* renamed from: Q, reason: collision with root package name */
    private static final Expression f1485Q;

    /* renamed from: R, reason: collision with root package name */
    private static final Yb.e f1486R;

    /* renamed from: S, reason: collision with root package name */
    private static final Expression f1487S;

    /* renamed from: T, reason: collision with root package name */
    private static final Expression f1488T;

    /* renamed from: U, reason: collision with root package name */
    private static final Yb.d f1489U;

    /* renamed from: V, reason: collision with root package name */
    private static final Function2 f1490V;

    /* renamed from: A, reason: collision with root package name */
    private final C0925lf f1491A;

    /* renamed from: B, reason: collision with root package name */
    public final Expression f1492B;

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC1092v3 f1493C;

    /* renamed from: D, reason: collision with root package name */
    private final O2 f1494D;

    /* renamed from: E, reason: collision with root package name */
    private final O2 f1495E;

    /* renamed from: F, reason: collision with root package name */
    private final List f1496F;

    /* renamed from: G, reason: collision with root package name */
    private final List f1497G;

    /* renamed from: H, reason: collision with root package name */
    private final List f1498H;

    /* renamed from: I, reason: collision with root package name */
    private final Expression f1499I;

    /* renamed from: J, reason: collision with root package name */
    private final Wf f1500J;

    /* renamed from: K, reason: collision with root package name */
    private final List f1501K;

    /* renamed from: L, reason: collision with root package name */
    private final Yb f1502L;

    /* renamed from: M, reason: collision with root package name */
    private Integer f1503M;

    /* renamed from: N, reason: collision with root package name */
    private Integer f1504N;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f1505a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f1506b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f1507c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f1508d;

    /* renamed from: e, reason: collision with root package name */
    private final List f1509e;

    /* renamed from: f, reason: collision with root package name */
    private final List f1510f;

    /* renamed from: g, reason: collision with root package name */
    private final C0860i3 f1511g;

    /* renamed from: h, reason: collision with root package name */
    public final Expression f1512h;

    /* renamed from: i, reason: collision with root package name */
    private final Expression f1513i;

    /* renamed from: j, reason: collision with root package name */
    public final Expression f1514j;

    /* renamed from: k, reason: collision with root package name */
    private final List f1515k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1516l;

    /* renamed from: m, reason: collision with root package name */
    private final List f1517m;

    /* renamed from: n, reason: collision with root package name */
    private final W5 f1518n;

    /* renamed from: o, reason: collision with root package name */
    private final List f1519o;

    /* renamed from: p, reason: collision with root package name */
    private final Yb f1520p;

    /* renamed from: q, reason: collision with root package name */
    private final String f1521q;

    /* renamed from: r, reason: collision with root package name */
    private final C1079u8 f1522r;

    /* renamed from: s, reason: collision with root package name */
    private final C0754c5 f1523s;

    /* renamed from: t, reason: collision with root package name */
    private final C0754c5 f1524t;

    /* renamed from: u, reason: collision with root package name */
    private final Expression f1525u;

    /* renamed from: v, reason: collision with root package name */
    private final Expression f1526v;

    /* renamed from: w, reason: collision with root package name */
    private final List f1527w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1528x;

    /* renamed from: y, reason: collision with root package name */
    public final List f1529y;

    /* renamed from: z, reason: collision with root package name */
    private final List f1530z;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1531i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Bc.f1483O.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bc a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Hc.f) BuiltInParserKt.getBuiltInParserComponent().n7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: g, reason: collision with root package name */
        public static final b f1532g = new b(null);

        /* renamed from: h, reason: collision with root package name */
        private static final Function2 f1533h = a.f1540i;

        /* renamed from: a, reason: collision with root package name */
        public final C1127x2 f1534a;

        /* renamed from: b, reason: collision with root package name */
        public final C1127x2 f1535b;

        /* renamed from: c, reason: collision with root package name */
        public final Z f1536c;

        /* renamed from: d, reason: collision with root package name */
        public final String f1537d;

        /* renamed from: e, reason: collision with root package name */
        public final List f1538e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f1539f;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f1540i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f1532g.a(env, it);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((Ic) BuiltInParserKt.getBuiltInParserComponent().q7().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(C1127x2 c1127x2, C1127x2 c1127x22, Z z4, String stateId, List list) {
            Intrinsics.checkNotNullParameter(stateId, "stateId");
            this.f1534a = c1127x2;
            this.f1535b = c1127x22;
            this.f1536c = z4;
            this.f1537d = stateId;
            this.f1538e = list;
        }

        public static /* synthetic */ c b(c cVar, C1127x2 c1127x2, C1127x2 c1127x22, Z z4, String str, List list, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                c1127x2 = cVar.f1534a;
            }
            if ((i4 & 2) != 0) {
                c1127x22 = cVar.f1535b;
            }
            if ((i4 & 4) != 0) {
                z4 = cVar.f1536c;
            }
            if ((i4 & 8) != 0) {
                str = cVar.f1537d;
            }
            if ((i4 & 16) != 0) {
                list = cVar.f1538e;
            }
            List list2 = list;
            Z z5 = z4;
            return cVar.a(c1127x2, c1127x22, z5, str, list2);
        }

        public final c a(C1127x2 c1127x2, C1127x2 c1127x22, Z z4, String stateId, List list) {
            Intrinsics.checkNotNullParameter(stateId, "stateId");
            return new c(c1127x2, c1127x22, z4, stateId, list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
        
            if (r7 == null) goto L49;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean c(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            boolean z4;
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (cVar == null) {
                return false;
            }
            C1127x2 c1127x2 = this.f1534a;
            if (c1127x2 != null ? c1127x2.a(cVar.f1534a, resolver, otherResolver) : cVar.f1534a == null) {
                C1127x2 c1127x22 = this.f1535b;
                if (c1127x22 != null ? c1127x22.a(cVar.f1535b, resolver, otherResolver) : cVar.f1535b == null) {
                    Z z5 = this.f1536c;
                    if ((z5 != null ? z5.a(cVar.f1536c, resolver, otherResolver) : cVar.f1536c == null) && Intrinsics.areEqual(this.f1537d, cVar.f1537d)) {
                        List list = this.f1538e;
                        List list2 = cVar.f1538e;
                        if (list != null) {
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
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f1539f;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode();
            C1127x2 c1127x2 = this.f1534a;
            int i4 = 0;
            int hash = hashCode + (c1127x2 != null ? c1127x2.hash() : 0);
            C1127x2 c1127x22 = this.f1535b;
            int hash2 = hash + (c1127x22 != null ? c1127x22.hash() : 0);
            Z z4 = this.f1536c;
            int hash3 = hash2 + (z4 != null ? z4.hash() : 0) + this.f1537d.hashCode();
            List list = this.f1538e;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i4 += ((C0892k0) it.next()).hash();
                }
            }
            int i5 = hash3 + i4;
            this.f1539f = Integer.valueOf(i5);
            return i5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Ic) BuiltInParserKt.getBuiltInParserComponent().q7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f1484P = companion.constant(Double.valueOf(1.0d));
        f1485Q = companion.constant(Boolean.TRUE);
        f1486R = new Yb.e(new C0765cg(null, null, null, 7, null));
        f1487S = companion.constant(EnumC0979of.STATE_CHANGE);
        f1488T = companion.constant(Vf.VISIBLE);
        f1489U = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        f1490V = a.f1531i;
    }

    public Bc(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression clipToBounds, Expression expression3, Expression expression4, List list3, String str, List list4, W5 w5, List list5, Yb height, String str2, C1079u8 c1079u8, C0754c5 c0754c5, C0754c5 c0754c52, Expression expression5, Expression expression6, List list6, String str3, List states, List list7, C0925lf c0925lf, Expression transitionAnimationSelector, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(clipToBounds, "clipToBounds");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(transitionAnimationSelector, "transitionAnimationSelector");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f1505a = c0839h0;
        this.f1506b = expression;
        this.f1507c = expression2;
        this.f1508d = alpha;
        this.f1509e = list;
        this.f1510f = list2;
        this.f1511g = c0860i3;
        this.f1512h = clipToBounds;
        this.f1513i = expression3;
        this.f1514j = expression4;
        this.f1515k = list3;
        this.f1516l = str;
        this.f1517m = list4;
        this.f1518n = w5;
        this.f1519o = list5;
        this.f1520p = height;
        this.f1521q = str2;
        this.f1522r = c1079u8;
        this.f1523s = c0754c5;
        this.f1524t = c0754c52;
        this.f1525u = expression5;
        this.f1526v = expression6;
        this.f1527w = list6;
        this.f1528x = str3;
        this.f1529y = states;
        this.f1530z = list7;
        this.f1491A = c0925lf;
        this.f1492B = transitionAnimationSelector;
        this.f1493C = abstractC1092v3;
        this.f1494D = o22;
        this.f1495E = o23;
        this.f1496F = list8;
        this.f1497G = list9;
        this.f1498H = list10;
        this.f1499I = visibility;
        this.f1500J = wf;
        this.f1501K = list11;
        this.f1502L = width;
    }

    public static /* synthetic */ Bc B(Bc bc, C0839h0 c0839h0, Expression expression, Expression expression2, Expression expression3, List list, List list2, C0860i3 c0860i3, Expression expression4, Expression expression5, Expression expression6, List list3, String str, List list4, W5 w5, List list5, Yb yb, String str2, C1079u8 c1079u8, C0754c5 c0754c5, C0754c5 c0754c52, Expression expression7, Expression expression8, List list6, String str3, List list7, List list8, C0925lf c0925lf, Expression expression9, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list9, List list10, List list11, Expression expression10, Wf wf, List list12, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? bc.d() : c0839h0;
        return bc.A(d4, (i4 & 2) != 0 ? bc.l() : expression, (i4 & 4) != 0 ? bc.s() : expression2, (i4 & 8) != 0 ? bc.v() : expression3, (i4 & 16) != 0 ? bc.u() : list, (i4 & 32) != 0 ? bc.getBackground() : list2, (i4 & 64) != 0 ? bc.w() : c0860i3, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? bc.f1512h : expression4, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? bc.e() : expression5, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? bc.f1514j : expression6, (i4 & 1024) != 0 ? bc.a() : list3, (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? bc.f1516l : str, (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? bc.getExtensions() : list4, (i4 & 8192) != 0 ? bc.x() : w5, (i4 & 16384) != 0 ? bc.r() : list5, (i4 & 32768) != 0 ? bc.getHeight() : yb, (i4 & 65536) != 0 ? bc.getId() : str2, (i4 & 131072) != 0 ? bc.m() : c1079u8, (i4 & 262144) != 0 ? bc.g() : c0754c5, (i4 & 524288) != 0 ? bc.i() : c0754c52, (i4 & 1048576) != 0 ? bc.n() : expression7, (i4 & 2097152) != 0 ? bc.h() : expression8, (i4 & 4194304) != 0 ? bc.k() : list6, (i4 & 8388608) != 0 ? bc.f1528x : str3, (i4 & 16777216) != 0 ? bc.f1529y : list7, (i4 & 33554432) != 0 ? bc.p() : list8, (i4 & 67108864) != 0 ? bc.b() : c0925lf, (i4 & 134217728) != 0 ? bc.f1492B : expression9, (i4 & 268435456) != 0 ? bc.z() : abstractC1092v3, (i4 & 536870912) != 0 ? bc.t() : o22, (i4 & 1073741824) != 0 ? bc.y() : o23, (i4 & Integer.MIN_VALUE) != 0 ? bc.j() : list9, (i5 & 1) != 0 ? bc.o() : list10, (i5 & 2) != 0 ? bc.f() : list11, (i5 & 4) != 0 ? bc.getVisibility() : expression10, (i5 & 8) != 0 ? bc.q() : wf, (i5 & 16) != 0 ? bc.c() : list12, (i5 & 32) != 0 ? bc.getWidth() : yb2);
    }

    public final Bc A(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression clipToBounds, Expression expression3, Expression expression4, List list3, String str, List list4, W5 w5, List list5, Yb height, String str2, C1079u8 c1079u8, C0754c5 c0754c5, C0754c5 c0754c52, Expression expression5, Expression expression6, List list6, String str3, List states, List list7, C0925lf c0925lf, Expression transitionAnimationSelector, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(clipToBounds, "clipToBounds");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(transitionAnimationSelector, "transitionAnimationSelector");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new Bc(c0839h0, expression, expression2, alpha, list, list2, c0860i3, clipToBounds, expression3, expression4, list3, str, list4, w5, list5, height, str2, c1079u8, c0754c5, c0754c52, expression5, expression6, list6, str3, states, list7, c0925lf, transitionAnimationSelector, abstractC1092v3, o22, o23, list8, list9, list10, visibility, wf, list11, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x05f5, code lost:
    
        if (r9.c() == null) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x057d, code lost:
    
        if (r9.f() == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0531, code lost:
    
        if (r9.o() == null) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04e5, code lost:
    
        if (r9.j() == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0422, code lost:
    
        if (r9.p() == null) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0390, code lost:
    
        if (r9.k() == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0298, code lost:
    
        if (r9.r() == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0232, code lost:
    
        if (r9.getExtensions() == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01dc, code lost:
    
        if (r9.a() == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x011c, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x00d0, code lost:
    
        if (r9.u() == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(Bc bc, ExpressionResolver resolver, ExpressionResolver otherResolver) {
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
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (bc == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(bc.d(), resolver, otherResolver) : bc.d() == null) {
            Expression l4 = l();
            EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
            Expression l5 = bc.l();
            if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                Expression s4 = s();
                EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                Expression s5 = bc.s();
                if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                    if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) bc.v().evaluate(otherResolver)).doubleValue()) {
                        List u4 = u();
                        if (u4 != null) {
                            List u5 = bc.u();
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
                                List background2 = bc.getBackground();
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
                                if ((w4 != null ? w4.a(bc.w(), resolver, otherResolver) : bc.w() == null) && ((Boolean) this.f1512h.evaluate(resolver)).booleanValue() == ((Boolean) bc.f1512h.evaluate(otherResolver)).booleanValue()) {
                                    Expression e4 = e();
                                    Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                    Expression e5 = bc.e();
                                    if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null)) {
                                        Expression expression = this.f1514j;
                                        String str = expression != null ? (String) expression.evaluate(resolver) : null;
                                        Expression expression2 = bc.f1514j;
                                        if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null)) {
                                            List a4 = a();
                                            if (a4 != null) {
                                                List a5 = bc.a();
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
                                            if (z6 && Intrinsics.areEqual(this.f1516l, bc.f1516l)) {
                                                List extensions = getExtensions();
                                                if (extensions != null) {
                                                    List extensions2 = bc.getExtensions();
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
                                                    if (x4 != null ? x4.a(bc.x(), resolver, otherResolver) : bc.x() == null) {
                                                        List r4 = r();
                                                        if (r4 != null) {
                                                            List r5 = bc.r();
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
                                                        if (z8 && getHeight().a(bc.getHeight(), resolver, otherResolver) && Intrinsics.areEqual(getId(), bc.getId())) {
                                                            C1079u8 m4 = m();
                                                            if (m4 != null ? m4.a(bc.m(), resolver, otherResolver) : bc.m() == null) {
                                                                C0754c5 g4 = g();
                                                                if (g4 != null ? g4.a(bc.g(), resolver, otherResolver) : bc.g() == null) {
                                                                    C0754c5 i14 = i();
                                                                    if (i14 != null ? i14.a(bc.i(), resolver, otherResolver) : bc.i() == null) {
                                                                        Expression n4 = n();
                                                                        String str2 = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                        Expression n5 = bc.n();
                                                                        if (Intrinsics.areEqual(str2, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                            Expression h4 = h();
                                                                            Long l7 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                            Expression h5 = bc.h();
                                                                            if (Intrinsics.areEqual(l7, h5 != null ? (Long) h5.evaluate(otherResolver) : null)) {
                                                                                List k4 = k();
                                                                                if (k4 != null) {
                                                                                    List k5 = bc.k();
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
                                                                                if (z9 && Intrinsics.areEqual(this.f1528x, bc.f1528x)) {
                                                                                    List list = this.f1529y;
                                                                                    List list2 = bc.f1529y;
                                                                                    if (list.size() == list2.size()) {
                                                                                        int i17 = 0;
                                                                                        for (Object obj7 : list) {
                                                                                            int i18 = i17 + 1;
                                                                                            if (i17 < 0) {
                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                            }
                                                                                            if (((c) obj7).c((c) list2.get(i17), resolver, otherResolver)) {
                                                                                                i17 = i18;
                                                                                            }
                                                                                        }
                                                                                        z10 = true;
                                                                                        if (z10) {
                                                                                            List p4 = p();
                                                                                            if (p4 != null) {
                                                                                                List p5 = bc.p();
                                                                                                if (p5 != null) {
                                                                                                    if (p4.size() == p5.size()) {
                                                                                                        int i19 = 0;
                                                                                                        for (Object obj8 : p4) {
                                                                                                            int i20 = i19 + 1;
                                                                                                            if (i19 < 0) {
                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                            }
                                                                                                            if (((Se) obj8).a((Se) p5.get(i19), resolver, otherResolver)) {
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
                                                                                                C0925lf b4 = b();
                                                                                                if ((b4 != null ? b4.a(bc.b(), resolver, otherResolver) : bc.b() == null) && this.f1492B.evaluate(resolver) == bc.f1492B.evaluate(otherResolver)) {
                                                                                                    AbstractC1092v3 z16 = z();
                                                                                                    if (z16 != null ? z16.a(bc.z(), resolver, otherResolver) : bc.z() == null) {
                                                                                                        O2 t4 = t();
                                                                                                        if (t4 != null ? t4.a(bc.t(), resolver, otherResolver) : bc.t() == null) {
                                                                                                            O2 y4 = y();
                                                                                                            if (y4 != null ? y4.a(bc.y(), resolver, otherResolver) : bc.y() == null) {
                                                                                                                List j4 = j();
                                                                                                                if (j4 != null) {
                                                                                                                    List j5 = bc.j();
                                                                                                                    if (j5 != null) {
                                                                                                                        if (j4.size() == j5.size()) {
                                                                                                                            int i21 = 0;
                                                                                                                            for (Object obj9 : j4) {
                                                                                                                                int i22 = i21 + 1;
                                                                                                                                if (i21 < 0) {
                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                }
                                                                                                                                if (((EnumC0997pf) obj9) == ((EnumC0997pf) j5.get(i21))) {
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
                                                                                                                    List o4 = o();
                                                                                                                    if (o4 != null) {
                                                                                                                        List o5 = bc.o();
                                                                                                                        if (o5 != null) {
                                                                                                                            if (o4.size() == o5.size()) {
                                                                                                                                int i23 = 0;
                                                                                                                                for (Object obj10 : o4) {
                                                                                                                                    int i24 = i23 + 1;
                                                                                                                                    if (i23 < 0) {
                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                    }
                                                                                                                                    if (((C1015qf) obj10).a((C1015qf) o5.get(i23), resolver, otherResolver)) {
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
                                                                                                                    if (z13) {
                                                                                                                        List f4 = f();
                                                                                                                        if (f4 != null) {
                                                                                                                            List f5 = bc.f();
                                                                                                                            if (f5 != null) {
                                                                                                                                if (f4.size() == f5.size()) {
                                                                                                                                    int i25 = 0;
                                                                                                                                    for (Object obj11 : f4) {
                                                                                                                                        int i26 = i25 + 1;
                                                                                                                                        if (i25 < 0) {
                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                        }
                                                                                                                                        if (((AbstractC1176zf) obj11).a((AbstractC1176zf) f5.get(i25), resolver, otherResolver)) {
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
                                                                                                                        if (z14 && getVisibility().evaluate(resolver) == bc.getVisibility().evaluate(otherResolver)) {
                                                                                                                            Wf q4 = q();
                                                                                                                            if (q4 != null ? q4.h(bc.q(), resolver, otherResolver) : bc.q() == null) {
                                                                                                                                List c4 = c();
                                                                                                                                if (c4 != null) {
                                                                                                                                    List c5 = bc.c();
                                                                                                                                    if (c5 != null) {
                                                                                                                                        if (c4.size() == c5.size()) {
                                                                                                                                            int i27 = 0;
                                                                                                                                            for (Object obj12 : c4) {
                                                                                                                                                int i28 = i27 + 1;
                                                                                                                                                if (i27 < 0) {
                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                }
                                                                                                                                                if (((Wf) obj12).h((Wf) c5.get(i27), resolver, otherResolver)) {
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
                                                                                                                                if (z15 && getWidth().a(bc.getWidth(), resolver, otherResolver)) {
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
                                                                                    z10 = false;
                                                                                    if (z10) {
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
        return this.f1515k;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f1491A;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f1501K;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f1505a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f1513i;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f1498H;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f1523s;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f1510f;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f1517m;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f1520p;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f1521q;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f1499I;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f1502L;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f1526v;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f1504N;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        Iterator it = this.f1529y.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((c) it.next()).hash();
        }
        int i5 = propertiesHash + i4;
        this.f1504N = Integer.valueOf(i5);
        return i5;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f1524t;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f1496F;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f1527w;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f1506b;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f1522r;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f1525u;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f1497G;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f1530z;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num = this.f1503M;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Bc.class).hashCode();
        C0839h0 d4 = d();
        int i13 = 0;
        int hash = hashCode + (d4 != null ? d4.hash() : 0);
        Expression l4 = l();
        int hashCode2 = hash + (l4 != null ? l4.hashCode() : 0);
        Expression s4 = s();
        int hashCode3 = hashCode2 + (s4 != null ? s4.hashCode() : 0) + v().hashCode();
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
        int hash2 = i15 + (w4 != null ? w4.hash() : 0) + this.f1512h.hashCode();
        Expression e4 = e();
        int hashCode4 = hash2 + (e4 != null ? e4.hashCode() : 0);
        Expression expression = this.f1514j;
        int hashCode5 = hashCode4 + (expression != null ? expression.hashCode() : 0);
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
        int i16 = hashCode5 + i6;
        String str = this.f1516l;
        int hashCode6 = i16 + (str != null ? str.hashCode() : 0);
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
        int i17 = hashCode6 + i7;
        W5 x4 = x();
        int hash3 = i17 + (x4 != null ? x4.hash() : 0);
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
        int hash4 = hash3 + i8 + getHeight().hash();
        String id = getId();
        int hashCode7 = hash4 + (id != null ? id.hashCode() : 0);
        C1079u8 m4 = m();
        int hash5 = hashCode7 + (m4 != null ? m4.hash() : 0);
        C0754c5 g4 = g();
        int hash6 = hash5 + (g4 != null ? g4.hash() : 0);
        C0754c5 i18 = i();
        int hash7 = hash6 + (i18 != null ? i18.hash() : 0);
        Expression n4 = n();
        int hashCode8 = hash7 + (n4 != null ? n4.hashCode() : 0);
        Expression h4 = h();
        int hashCode9 = hashCode8 + (h4 != null ? h4.hashCode() : 0);
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
        int i19 = hashCode9 + i9;
        String str2 = this.f1528x;
        int hashCode10 = i19 + (str2 != null ? str2.hashCode() : 0);
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
        int i20 = hashCode10 + i10;
        C0925lf b4 = b();
        int hash8 = i20 + (b4 != null ? b4.hash() : 0) + this.f1492B.hashCode();
        AbstractC1092v3 z4 = z();
        int hash9 = hash8 + (z4 != null ? z4.hash() : 0);
        O2 t4 = t();
        int hash10 = hash9 + (t4 != null ? t4.hash() : 0);
        O2 y4 = y();
        int hash11 = hash10 + (y4 != null ? y4.hash() : 0);
        List j4 = j();
        int hashCode11 = hash11 + (j4 != null ? j4.hashCode() : 0);
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
        int i21 = hashCode11 + i11;
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
        int hashCode12 = i21 + i12 + getVisibility().hashCode();
        Wf q4 = q();
        int hash12 = hashCode12 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it10 = c4.iterator();
            while (it10.hasNext()) {
                i13 += ((Wf) it10.next()).hash();
            }
        }
        int hash13 = hash12 + i13 + getWidth().hash();
        this.f1503M = Integer.valueOf(hash13);
        return hash13;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f1500J;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f1519o;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f1507c;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f1494D;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f1509e;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f1508d;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f1511g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Hc.f) BuiltInParserKt.getBuiltInParserComponent().n7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f1518n;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f1495E;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f1493C;
    }
}
