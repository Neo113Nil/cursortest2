package O1;

import O1.AbstractC1129x4;
import O1.Yb;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1039s4 implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: L, reason: collision with root package name */
    public static final b f7808L = new b(null);

    /* renamed from: M, reason: collision with root package name */
    private static final Expression f7809M;

    /* renamed from: N, reason: collision with root package name */
    private static final Yb.e f7810N;

    /* renamed from: O, reason: collision with root package name */
    private static final Expression f7811O;

    /* renamed from: P, reason: collision with root package name */
    private static final Yb.d f7812P;

    /* renamed from: Q, reason: collision with root package name */
    private static final Function2 f7813Q;

    /* renamed from: A, reason: collision with root package name */
    private final O2 f7814A;

    /* renamed from: B, reason: collision with root package name */
    private final O2 f7815B;

    /* renamed from: C, reason: collision with root package name */
    private final List f7816C;

    /* renamed from: D, reason: collision with root package name */
    private final List f7817D;

    /* renamed from: E, reason: collision with root package name */
    private final List f7818E;

    /* renamed from: F, reason: collision with root package name */
    private final Expression f7819F;

    /* renamed from: G, reason: collision with root package name */
    private final Wf f7820G;

    /* renamed from: H, reason: collision with root package name */
    private final List f7821H;

    /* renamed from: I, reason: collision with root package name */
    private final Yb f7822I;

    /* renamed from: J, reason: collision with root package name */
    private Integer f7823J;

    /* renamed from: K, reason: collision with root package name */
    private Integer f7824K;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f7825a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f7826b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f7827c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f7828d;

    /* renamed from: e, reason: collision with root package name */
    private final List f7829e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7830f;

    /* renamed from: g, reason: collision with root package name */
    private final C0860i3 f7831g;

    /* renamed from: h, reason: collision with root package name */
    private final Expression f7832h;

    /* renamed from: i, reason: collision with root package name */
    public final JSONObject f7833i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7834j;

    /* renamed from: k, reason: collision with root package name */
    private final List f7835k;

    /* renamed from: l, reason: collision with root package name */
    private final List f7836l;

    /* renamed from: m, reason: collision with root package name */
    private final W5 f7837m;

    /* renamed from: n, reason: collision with root package name */
    private final List f7838n;

    /* renamed from: o, reason: collision with root package name */
    private final Yb f7839o;

    /* renamed from: p, reason: collision with root package name */
    private final String f7840p;

    /* renamed from: q, reason: collision with root package name */
    public final List f7841q;

    /* renamed from: r, reason: collision with root package name */
    private final C1079u8 f7842r;

    /* renamed from: s, reason: collision with root package name */
    private final C0754c5 f7843s;

    /* renamed from: t, reason: collision with root package name */
    private final C0754c5 f7844t;

    /* renamed from: u, reason: collision with root package name */
    private final Expression f7845u;

    /* renamed from: v, reason: collision with root package name */
    private final Expression f7846v;

    /* renamed from: w, reason: collision with root package name */
    private final List f7847w;

    /* renamed from: x, reason: collision with root package name */
    private final List f7848x;

    /* renamed from: y, reason: collision with root package name */
    private final C0925lf f7849y;

    /* renamed from: z, reason: collision with root package name */
    private final AbstractC1092v3 f7850z;

    /* renamed from: O1.s4$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7851i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1039s4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1039s4.f7808L.a(env, it);
        }
    }

    /* renamed from: O1.s4$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1039s4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1129x4.e) BuiltInParserKt.getBuiltInParserComponent().y2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f7809M = companion.constant(Double.valueOf(1.0d));
        f7810N = new Yb.e(new C0765cg(null, null, null, 7, null));
        f7811O = companion.constant(Vf.VISIBLE);
        f7812P = new Yb.d(new I8(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        f7813Q = a.f7851i;
    }

    public C1039s4(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, JSONObject jSONObject, String customType, List list3, List list4, W5 w5, List list5, Yb height, String str, List list6, C1079u8 c1079u8, C0754c5 c0754c5, C0754c5 c0754c52, Expression expression4, Expression expression5, List list7, List list8, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list9, List list10, List list11, Expression visibility, Wf wf, List list12, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(customType, "customType");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f7825a = c0839h0;
        this.f7826b = expression;
        this.f7827c = expression2;
        this.f7828d = alpha;
        this.f7829e = list;
        this.f7830f = list2;
        this.f7831g = c0860i3;
        this.f7832h = expression3;
        this.f7833i = jSONObject;
        this.f7834j = customType;
        this.f7835k = list3;
        this.f7836l = list4;
        this.f7837m = w5;
        this.f7838n = list5;
        this.f7839o = height;
        this.f7840p = str;
        this.f7841q = list6;
        this.f7842r = c1079u8;
        this.f7843s = c0754c5;
        this.f7844t = c0754c52;
        this.f7845u = expression4;
        this.f7846v = expression5;
        this.f7847w = list7;
        this.f7848x = list8;
        this.f7849y = c0925lf;
        this.f7850z = abstractC1092v3;
        this.f7814A = o22;
        this.f7815B = o23;
        this.f7816C = list9;
        this.f7817D = list10;
        this.f7818E = list11;
        this.f7819F = visibility;
        this.f7820G = wf;
        this.f7821H = list12;
        this.f7822I = width;
    }

    public final C1039s4 A(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, JSONObject jSONObject, String customType, List list3, List list4, W5 w5, List list5, Yb height, String str, List list6, C1079u8 c1079u8, C0754c5 c0754c5, C0754c5 c0754c52, Expression expression4, Expression expression5, List list7, List list8, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list9, List list10, List list11, Expression visibility, Wf wf, List list12, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(customType, "customType");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new C1039s4(c0839h0, expression, expression2, alpha, list, list2, c0860i3, expression3, jSONObject, customType, list3, list4, w5, list5, height, str, list6, c1079u8, c0754c5, c0754c52, expression4, expression5, list7, list8, c0925lf, abstractC1092v3, o22, o23, list9, list10, list11, visibility, wf, list12, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:349:0x05b9, code lost:
    
        if (r9.c() == null) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0541, code lost:
    
        if (r9.f() == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x04f5, code lost:
    
        if (r9.o() == null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x04a9, code lost:
    
        if (r9.j() == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x03f4, code lost:
    
        if (r9.p() == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x03a8, code lost:
    
        if (r9.k() == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x02cc, code lost:
    
        if (r9.f7841q == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x026a, code lost:
    
        if (r9.r() == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0204, code lost:
    
        if (r9.getExtensions() == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01b8, code lost:
    
        if (r9.a() == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x011c, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x00d0, code lost:
    
        if (r9.u() == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(C1039s4 c1039s4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
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
        if (c1039s4 == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(c1039s4.d(), resolver, otherResolver) : c1039s4.d() == null) {
            Expression l4 = l();
            EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
            Expression l5 = c1039s4.l();
            if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                Expression s4 = s();
                EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                Expression s5 = c1039s4.s();
                if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                    if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) c1039s4.v().evaluate(otherResolver)).doubleValue()) {
                        List u4 = u();
                        if (u4 != null) {
                            List u5 = c1039s4.u();
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
                                List background2 = c1039s4.getBackground();
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
                                if (w4 != null ? w4.a(c1039s4.w(), resolver, otherResolver) : c1039s4.w() == null) {
                                    Expression e4 = e();
                                    Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                    Expression e5 = c1039s4.e();
                                    if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null) && Intrinsics.areEqual(this.f7833i, c1039s4.f7833i) && Intrinsics.areEqual(this.f7834j, c1039s4.f7834j)) {
                                        List a4 = a();
                                        if (a4 != null) {
                                            List a5 = c1039s4.a();
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
                                                List extensions2 = c1039s4.getExtensions();
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
                                                if (x4 != null ? x4.a(c1039s4.x(), resolver, otherResolver) : c1039s4.x() == null) {
                                                    List r4 = r();
                                                    if (r4 != null) {
                                                        List r5 = c1039s4.r();
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
                                                    if (z8 && getHeight().a(c1039s4.getHeight(), resolver, otherResolver) && Intrinsics.areEqual(getId(), c1039s4.getId())) {
                                                        List list = this.f7841q;
                                                        if (list != null) {
                                                            List list2 = c1039s4.f7841q;
                                                            if (list2 != null) {
                                                                if (list.size() == list2.size()) {
                                                                    int i14 = 0;
                                                                    for (Object obj6 : list) {
                                                                        int i15 = i14 + 1;
                                                                        if (i14 < 0) {
                                                                            CollectionsKt.throwIndexOverflow();
                                                                        }
                                                                        if (((Z) obj6).a((Z) list2.get(i14), resolver, otherResolver)) {
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
                                                            C1079u8 m4 = m();
                                                            if (m4 != null ? m4.a(c1039s4.m(), resolver, otherResolver) : c1039s4.m() == null) {
                                                                C0754c5 g4 = g();
                                                                if (g4 != null ? g4.a(c1039s4.g(), resolver, otherResolver) : c1039s4.g() == null) {
                                                                    C0754c5 i16 = i();
                                                                    if (i16 != null ? i16.a(c1039s4.i(), resolver, otherResolver) : c1039s4.i() == null) {
                                                                        Expression n4 = n();
                                                                        String str = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                        Expression n5 = c1039s4.n();
                                                                        if (Intrinsics.areEqual(str, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                            Expression h4 = h();
                                                                            Long l7 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                            Expression h5 = c1039s4.h();
                                                                            if (Intrinsics.areEqual(l7, h5 != null ? (Long) h5.evaluate(otherResolver) : null)) {
                                                                                List k4 = k();
                                                                                if (k4 != null) {
                                                                                    List k5 = c1039s4.k();
                                                                                    if (k5 != null) {
                                                                                        if (k4.size() == k5.size()) {
                                                                                            int i17 = 0;
                                                                                            for (Object obj7 : k4) {
                                                                                                int i18 = i17 + 1;
                                                                                                if (i17 < 0) {
                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                }
                                                                                                if (((C0892k0) obj7).a((C0892k0) k5.get(i17), resolver, otherResolver)) {
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
                                                                                    List p4 = p();
                                                                                    if (p4 != null) {
                                                                                        List p5 = c1039s4.p();
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
                                                                                        if (b4 != null ? b4.a(c1039s4.b(), resolver, otherResolver) : c1039s4.b() == null) {
                                                                                            AbstractC1092v3 z16 = z();
                                                                                            if (z16 != null ? z16.a(c1039s4.z(), resolver, otherResolver) : c1039s4.z() == null) {
                                                                                                O2 t4 = t();
                                                                                                if (t4 != null ? t4.a(c1039s4.t(), resolver, otherResolver) : c1039s4.t() == null) {
                                                                                                    O2 y4 = y();
                                                                                                    if (y4 != null ? y4.a(c1039s4.y(), resolver, otherResolver) : c1039s4.y() == null) {
                                                                                                        List j4 = j();
                                                                                                        if (j4 != null) {
                                                                                                            List j5 = c1039s4.j();
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
                                                                                                                List o5 = c1039s4.o();
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
                                                                                                                    List f5 = c1039s4.f();
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
                                                                                                                if (z14 && getVisibility().evaluate(resolver) == c1039s4.getVisibility().evaluate(otherResolver)) {
                                                                                                                    Wf q4 = q();
                                                                                                                    if (q4 != null ? q4.h(c1039s4.q(), resolver, otherResolver) : c1039s4.q() == null) {
                                                                                                                        List c4 = c();
                                                                                                                        if (c4 != null) {
                                                                                                                            List c5 = c1039s4.c();
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
                                                                                                                        if (z15 && getWidth().a(c1039s4.getWidth(), resolver, otherResolver)) {
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
        return this.f7835k;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f7849y;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f7821H;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f7825a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f7832h;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f7818E;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f7843s;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f7830f;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f7836l;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f7839o;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f7840p;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f7819F;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f7822I;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f7846v;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7824K;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        List list = this.f7841q;
        int i4 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i4 += ((Z) it.next()).hash();
            }
        }
        int i5 = propertiesHash + i4;
        this.f7824K = Integer.valueOf(i5);
        return i5;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f7844t;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f7816C;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f7847w;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f7826b;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f7842r;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f7845u;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f7817D;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f7848x;
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
        Integer num = this.f7823J;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1039s4.class).hashCode();
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
        JSONObject jSONObject = this.f7833i;
        int hashCode5 = hashCode4 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.f7834j.hashCode();
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
        int hashCode6 = hash4 + (id != null ? id.hashCode() : 0);
        C1079u8 m4 = m();
        int hash5 = hashCode6 + (m4 != null ? m4.hash() : 0);
        C0754c5 g4 = g();
        int hash6 = hash5 + (g4 != null ? g4.hash() : 0);
        C0754c5 i18 = i();
        int hash7 = hash6 + (i18 != null ? i18.hash() : 0);
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
        this.f7823J = Integer.valueOf(hash13);
        return hash13;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f7820G;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f7838n;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f7827c;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f7814A;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f7829e;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f7828d;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f7831g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1129x4.e) BuiltInParserKt.getBuiltInParserComponent().y2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f7837m;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f7815B;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f7850z;
    }
}
