package O1;

import O1.AbstractC0977od;
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

/* renamed from: O1.jd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0887jd implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: K, reason: collision with root package name */
    public static final b f6689K = new b(null);

    /* renamed from: L, reason: collision with root package name */
    private static final Expression f6690L;

    /* renamed from: M, reason: collision with root package name */
    private static final Yb.e f6691M;

    /* renamed from: N, reason: collision with root package name */
    private static final Expression f6692N;

    /* renamed from: O, reason: collision with root package name */
    private static final Expression f6693O;

    /* renamed from: P, reason: collision with root package name */
    private static final Yb.d f6694P;

    /* renamed from: Q, reason: collision with root package name */
    private static final Function2 f6695Q;

    /* renamed from: A, reason: collision with root package name */
    private final O2 f6696A;

    /* renamed from: B, reason: collision with root package name */
    private final O2 f6697B;

    /* renamed from: C, reason: collision with root package name */
    private final List f6698C;

    /* renamed from: D, reason: collision with root package name */
    private final List f6699D;

    /* renamed from: E, reason: collision with root package name */
    private final List f6700E;

    /* renamed from: F, reason: collision with root package name */
    private final Expression f6701F;

    /* renamed from: G, reason: collision with root package name */
    private final Wf f6702G;

    /* renamed from: H, reason: collision with root package name */
    private final List f6703H;

    /* renamed from: I, reason: collision with root package name */
    private final Yb f6704I;

    /* renamed from: J, reason: collision with root package name */
    private Integer f6705J;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f6706a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f6707b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f6708c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f6709d;

    /* renamed from: e, reason: collision with root package name */
    private final List f6710e;

    /* renamed from: f, reason: collision with root package name */
    private final List f6711f;

    /* renamed from: g, reason: collision with root package name */
    private final C0860i3 f6712g;

    /* renamed from: h, reason: collision with root package name */
    private final Expression f6713h;

    /* renamed from: i, reason: collision with root package name */
    private final List f6714i;

    /* renamed from: j, reason: collision with root package name */
    private final List f6715j;

    /* renamed from: k, reason: collision with root package name */
    private final W5 f6716k;

    /* renamed from: l, reason: collision with root package name */
    private final List f6717l;

    /* renamed from: m, reason: collision with root package name */
    private final Yb f6718m;

    /* renamed from: n, reason: collision with root package name */
    private final String f6719n;

    /* renamed from: o, reason: collision with root package name */
    public final Expression f6720o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6721p;

    /* renamed from: q, reason: collision with root package name */
    private final C1079u8 f6722q;

    /* renamed from: r, reason: collision with root package name */
    private final C0754c5 f6723r;

    /* renamed from: s, reason: collision with root package name */
    public final Expression f6724s;

    /* renamed from: t, reason: collision with root package name */
    private final C0754c5 f6725t;

    /* renamed from: u, reason: collision with root package name */
    private final Expression f6726u;

    /* renamed from: v, reason: collision with root package name */
    private final Expression f6727v;

    /* renamed from: w, reason: collision with root package name */
    private final List f6728w;

    /* renamed from: x, reason: collision with root package name */
    private final List f6729x;

    /* renamed from: y, reason: collision with root package name */
    private final C0925lf f6730y;

    /* renamed from: z, reason: collision with root package name */
    private final AbstractC1092v3 f6731z;

    /* renamed from: O1.jd$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6732i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0887jd invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0887jd.f6689K.a(env, it);
        }
    }

    /* renamed from: O1.jd$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0887jd a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0977od.e) BuiltInParserKt.getBuiltInParserComponent().I7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f6690L = companion.constant(Double.valueOf(1.0d));
        f6691M = new Yb.e(new C0765cg(null, null, null, 7, null));
        f6692N = companion.constant(Boolean.TRUE);
        f6693O = companion.constant(Vf.VISIBLE);
        f6694P = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        f6695Q = a.f6732i;
    }

    public C0887jd(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, W5 w5, List list5, Yb height, String str, Expression isEnabled, String isOnVariable, C1079u8 c1079u8, C0754c5 c0754c5, Expression expression4, C0754c5 c0754c52, Expression expression5, Expression expression6, List list6, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(isOnVariable, "isOnVariable");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f6706a = c0839h0;
        this.f6707b = expression;
        this.f6708c = expression2;
        this.f6709d = alpha;
        this.f6710e = list;
        this.f6711f = list2;
        this.f6712g = c0860i3;
        this.f6713h = expression3;
        this.f6714i = list3;
        this.f6715j = list4;
        this.f6716k = w5;
        this.f6717l = list5;
        this.f6718m = height;
        this.f6719n = str;
        this.f6720o = isEnabled;
        this.f6721p = isOnVariable;
        this.f6722q = c1079u8;
        this.f6723r = c0754c5;
        this.f6724s = expression4;
        this.f6725t = c0754c52;
        this.f6726u = expression5;
        this.f6727v = expression6;
        this.f6728w = list6;
        this.f6729x = list7;
        this.f6730y = c0925lf;
        this.f6731z = abstractC1092v3;
        this.f6696A = o22;
        this.f6697B = o23;
        this.f6698C = list8;
        this.f6699D = list9;
        this.f6700E = list10;
        this.f6701F = visibility;
        this.f6702G = wf;
        this.f6703H = list11;
        this.f6704I = width;
    }

    public static /* synthetic */ C0887jd B(C0887jd c0887jd, C0839h0 c0839h0, Expression expression, Expression expression2, Expression expression3, List list, List list2, C0860i3 c0860i3, Expression expression4, List list3, List list4, W5 w5, List list5, Yb yb, String str, Expression expression5, String str2, C1079u8 c1079u8, C0754c5 c0754c5, Expression expression6, C0754c5 c0754c52, Expression expression7, Expression expression8, List list6, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression expression9, Wf wf, List list11, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? c0887jd.d() : c0839h0;
        return c0887jd.A(d4, (i4 & 2) != 0 ? c0887jd.l() : expression, (i4 & 4) != 0 ? c0887jd.s() : expression2, (i4 & 8) != 0 ? c0887jd.v() : expression3, (i4 & 16) != 0 ? c0887jd.u() : list, (i4 & 32) != 0 ? c0887jd.getBackground() : list2, (i4 & 64) != 0 ? c0887jd.w() : c0860i3, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c0887jd.e() : expression4, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c0887jd.a() : list3, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c0887jd.getExtensions() : list4, (i4 & 1024) != 0 ? c0887jd.x() : w5, (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c0887jd.r() : list5, (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? c0887jd.getHeight() : yb, (i4 & 8192) != 0 ? c0887jd.getId() : str, (i4 & 16384) != 0 ? c0887jd.f6720o : expression5, (i4 & 32768) != 0 ? c0887jd.f6721p : str2, (i4 & 65536) != 0 ? c0887jd.m() : c1079u8, (i4 & 131072) != 0 ? c0887jd.g() : c0754c5, (i4 & 262144) != 0 ? c0887jd.f6724s : expression6, (i4 & 524288) != 0 ? c0887jd.i() : c0754c52, (i4 & 1048576) != 0 ? c0887jd.n() : expression7, (i4 & 2097152) != 0 ? c0887jd.h() : expression8, (i4 & 4194304) != 0 ? c0887jd.k() : list6, (i4 & 8388608) != 0 ? c0887jd.p() : list7, (i4 & 16777216) != 0 ? c0887jd.b() : c0925lf, (i4 & 33554432) != 0 ? c0887jd.z() : abstractC1092v3, (i4 & 67108864) != 0 ? c0887jd.t() : o22, (i4 & 134217728) != 0 ? c0887jd.y() : o23, (i4 & 268435456) != 0 ? c0887jd.j() : list8, (i4 & 536870912) != 0 ? c0887jd.o() : list9, (i4 & 1073741824) != 0 ? c0887jd.f() : list10, (i4 & Integer.MIN_VALUE) != 0 ? c0887jd.getVisibility() : expression9, (i5 & 1) != 0 ? c0887jd.q() : wf, (i5 & 2) != 0 ? c0887jd.c() : list11, (i5 & 4) != 0 ? c0887jd.getWidth() : yb2);
    }

    public final C0887jd A(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, W5 w5, List list5, Yb height, String str, Expression isEnabled, String isOnVariable, C1079u8 c1079u8, C0754c5 c0754c5, Expression expression4, C0754c5 c0754c52, Expression expression5, Expression expression6, List list6, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(isOnVariable, "isOnVariable");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new C0887jd(c0839h0, expression, expression2, alpha, list, list2, c0860i3, expression3, list3, list4, w5, list5, height, str, isEnabled, isOnVariable, c1079u8, c0754c5, expression4, c0754c52, expression5, expression6, list6, list7, c0925lf, abstractC1092v3, o22, o23, list8, list9, list10, visibility, wf, list11, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:337:0x05a1, code lost:
    
        if (r9.c() == null) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0529, code lost:
    
        if (r9.f() == null) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x04dd, code lost:
    
        if (r9.o() == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0491, code lost:
    
        if (r9.j() == null) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x03dc, code lost:
    
        if (r9.p() == null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0390, code lost:
    
        if (r9.k() == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0256, code lost:
    
        if (r9.r() == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x01f0, code lost:
    
        if (r9.getExtensions() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x01a4, code lost:
    
        if (r9.a() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x011c, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x00d0, code lost:
    
        if (r9.u() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(C0887jd c0887jd, ExpressionResolver resolver, ExpressionResolver otherResolver) {
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
        if (c0887jd == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(c0887jd.d(), resolver, otherResolver) : c0887jd.d() == null) {
            Expression l4 = l();
            EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
            Expression l5 = c0887jd.l();
            if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                Expression s4 = s();
                EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                Expression s5 = c0887jd.s();
                if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                    if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) c0887jd.v().evaluate(otherResolver)).doubleValue()) {
                        List u4 = u();
                        if (u4 != null) {
                            List u5 = c0887jd.u();
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
                                List background2 = c0887jd.getBackground();
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
                                if (w4 != null ? w4.a(c0887jd.w(), resolver, otherResolver) : c0887jd.w() == null) {
                                    Expression e4 = e();
                                    Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                    Expression e5 = c0887jd.e();
                                    if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null)) {
                                        List a4 = a();
                                        if (a4 != null) {
                                            List a5 = c0887jd.a();
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
                                                List extensions2 = c0887jd.getExtensions();
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
                                                if (x4 != null ? x4.a(c0887jd.x(), resolver, otherResolver) : c0887jd.x() == null) {
                                                    List r4 = r();
                                                    if (r4 != null) {
                                                        List r5 = c0887jd.r();
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
                                                    if (z8 && getHeight().a(c0887jd.getHeight(), resolver, otherResolver) && Intrinsics.areEqual(getId(), c0887jd.getId()) && ((Boolean) this.f6720o.evaluate(resolver)).booleanValue() == ((Boolean) c0887jd.f6720o.evaluate(otherResolver)).booleanValue() && Intrinsics.areEqual(this.f6721p, c0887jd.f6721p)) {
                                                        C1079u8 m4 = m();
                                                        if (m4 != null ? m4.a(c0887jd.m(), resolver, otherResolver) : c0887jd.m() == null) {
                                                            C0754c5 g4 = g();
                                                            if (g4 != null ? g4.a(c0887jd.g(), resolver, otherResolver) : c0887jd.g() == null) {
                                                                Expression expression = this.f6724s;
                                                                Integer num = expression != null ? (Integer) expression.evaluate(resolver) : null;
                                                                Expression expression2 = c0887jd.f6724s;
                                                                if (Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(otherResolver) : null)) {
                                                                    C0754c5 i14 = i();
                                                                    if (i14 != null ? i14.a(c0887jd.i(), resolver, otherResolver) : c0887jd.i() == null) {
                                                                        Expression n4 = n();
                                                                        String str = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                        Expression n5 = c0887jd.n();
                                                                        if (Intrinsics.areEqual(str, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                            Expression h4 = h();
                                                                            Long l7 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                            Expression h5 = c0887jd.h();
                                                                            if (Intrinsics.areEqual(l7, h5 != null ? (Long) h5.evaluate(otherResolver) : null)) {
                                                                                List k4 = k();
                                                                                if (k4 != null) {
                                                                                    List k5 = c0887jd.k();
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
                                                                                if (z9) {
                                                                                    List p4 = p();
                                                                                    if (p4 != null) {
                                                                                        List p5 = c0887jd.p();
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
                                                                                        if (b4 != null ? b4.a(c0887jd.b(), resolver, otherResolver) : c0887jd.b() == null) {
                                                                                            AbstractC1092v3 z15 = z();
                                                                                            if (z15 != null ? z15.a(c0887jd.z(), resolver, otherResolver) : c0887jd.z() == null) {
                                                                                                O2 t4 = t();
                                                                                                if (t4 != null ? t4.a(c0887jd.t(), resolver, otherResolver) : c0887jd.t() == null) {
                                                                                                    O2 y4 = y();
                                                                                                    if (y4 != null ? y4.a(c0887jd.y(), resolver, otherResolver) : c0887jd.y() == null) {
                                                                                                        List j4 = j();
                                                                                                        if (j4 != null) {
                                                                                                            List j5 = c0887jd.j();
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
                                                                                                                List o5 = c0887jd.o();
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
                                                                                                                    List f5 = c0887jd.f();
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
                                                                                                                if (z13 && getVisibility().evaluate(resolver) == c0887jd.getVisibility().evaluate(otherResolver)) {
                                                                                                                    Wf q4 = q();
                                                                                                                    if (q4 != null ? q4.h(c0887jd.q(), resolver, otherResolver) : c0887jd.q() == null) {
                                                                                                                        List c4 = c();
                                                                                                                        if (c4 != null) {
                                                                                                                            List c5 = c0887jd.c();
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
                                                                                                                        if (z14 && getWidth().a(c0887jd.getWidth(), resolver, otherResolver)) {
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
        return false;
    }

    @Override // O1.InterfaceC0752c3
    public List a() {
        return this.f6714i;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f6730y;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f6703H;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f6706a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f6713h;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f6700E;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f6723r;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f6711f;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f6715j;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f6718m;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f6719n;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f6701F;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f6704I;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f6727v;
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
        Integer num = this.f6705J;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0887jd.class).hashCode();
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
        int hash2 = i15 + (w4 != null ? w4.hash() : 0);
        Expression e4 = e();
        int hashCode4 = hash2 + (e4 != null ? e4.hashCode() : 0);
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
        int hashCode5 = hash4 + (id != null ? id.hashCode() : 0) + this.f6720o.hashCode() + this.f6721p.hashCode();
        C1079u8 m4 = m();
        int hash5 = hashCode5 + (m4 != null ? m4.hash() : 0);
        C0754c5 g4 = g();
        int hash6 = hash5 + (g4 != null ? g4.hash() : 0);
        Expression expression = this.f6724s;
        int hashCode6 = hash6 + (expression != null ? expression.hashCode() : 0);
        C0754c5 i18 = i();
        int hash7 = hashCode6 + (i18 != null ? i18.hash() : 0);
        Expression n4 = n();
        int hashCode7 = hash7 + (n4 != null ? n4.hashCode() : 0);
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
        int i19 = hashCode8 + i9;
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
        int i20 = i19 + i10;
        C0925lf b4 = b();
        int hash8 = i20 + (b4 != null ? b4.hash() : 0);
        AbstractC1092v3 z4 = z();
        int hash9 = hash8 + (z4 != null ? z4.hash() : 0);
        O2 t4 = t();
        int hash10 = hash9 + (t4 != null ? t4.hash() : 0);
        O2 y4 = y();
        int hash11 = hash10 + (y4 != null ? y4.hash() : 0);
        List j4 = j();
        int hashCode9 = hash11 + (j4 != null ? j4.hashCode() : 0);
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
        int i21 = hashCode9 + i11;
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
        int hashCode10 = i21 + i12 + getVisibility().hashCode();
        Wf q4 = q();
        int hash12 = hashCode10 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it10 = c4.iterator();
            while (it10.hasNext()) {
                i13 += ((Wf) it10.next()).hash();
            }
        }
        int hash13 = hash12 + i13 + getWidth().hash();
        this.f6705J = Integer.valueOf(hash13);
        return hash13;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f6725t;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f6698C;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f6728w;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f6707b;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f6722q;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f6726u;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f6699D;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f6729x;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f6702G;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f6717l;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f6708c;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f6696A;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f6710e;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f6709d;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f6712g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0977od.e) BuiltInParserKt.getBuiltInParserComponent().I7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f6716k;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f6697B;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f6731z;
    }
}
