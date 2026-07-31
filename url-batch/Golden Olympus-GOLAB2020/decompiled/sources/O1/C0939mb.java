package O1;

import O1.AbstractC1100vb;
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

/* renamed from: O1.mb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0939mb implements JSONSerializable, Hashable, InterfaceC0752c3 {

    /* renamed from: U, reason: collision with root package name */
    public static final b f7029U = new b(null);

    /* renamed from: V, reason: collision with root package name */
    private static final Expression f7030V;

    /* renamed from: W, reason: collision with root package name */
    private static final Expression f7031W;

    /* renamed from: X, reason: collision with root package name */
    private static final Expression f7032X;

    /* renamed from: Y, reason: collision with root package name */
    private static final Expression f7033Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final Yb.e f7034Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final Expression f7035a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final Expression f7036b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final Expression f7037c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final Expression f7038d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Yb.d f7039e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final Function2 f7040f0;

    /* renamed from: A, reason: collision with root package name */
    public final List f7041A;

    /* renamed from: B, reason: collision with root package name */
    private final C0754c5 f7042B;

    /* renamed from: C, reason: collision with root package name */
    private final Expression f7043C;

    /* renamed from: D, reason: collision with root package name */
    private final Expression f7044D;

    /* renamed from: E, reason: collision with root package name */
    private final List f7045E;

    /* renamed from: F, reason: collision with root package name */
    public final Expression f7046F;

    /* renamed from: G, reason: collision with root package name */
    private final List f7047G;

    /* renamed from: H, reason: collision with root package name */
    private final C0925lf f7048H;

    /* renamed from: I, reason: collision with root package name */
    private final AbstractC1092v3 f7049I;

    /* renamed from: J, reason: collision with root package name */
    private final O2 f7050J;

    /* renamed from: K, reason: collision with root package name */
    private final O2 f7051K;

    /* renamed from: L, reason: collision with root package name */
    private final List f7052L;

    /* renamed from: M, reason: collision with root package name */
    public final String f7053M;

    /* renamed from: N, reason: collision with root package name */
    private final List f7054N;

    /* renamed from: O, reason: collision with root package name */
    private final List f7055O;

    /* renamed from: P, reason: collision with root package name */
    private final Expression f7056P;

    /* renamed from: Q, reason: collision with root package name */
    private final Wf f7057Q;

    /* renamed from: R, reason: collision with root package name */
    private final List f7058R;

    /* renamed from: S, reason: collision with root package name */
    private final Yb f7059S;

    /* renamed from: T, reason: collision with root package name */
    private Integer f7060T;

    /* renamed from: a, reason: collision with root package name */
    private final C0839h0 f7061a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f7062b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f7063c;

    /* renamed from: d, reason: collision with root package name */
    private final Expression f7064d;

    /* renamed from: e, reason: collision with root package name */
    private final List f7065e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7066f;

    /* renamed from: g, reason: collision with root package name */
    private final C0860i3 f7067g;

    /* renamed from: h, reason: collision with root package name */
    private final Expression f7068h;

    /* renamed from: i, reason: collision with root package name */
    private final List f7069i;

    /* renamed from: j, reason: collision with root package name */
    private final List f7070j;

    /* renamed from: k, reason: collision with root package name */
    private final W5 f7071k;

    /* renamed from: l, reason: collision with root package name */
    public final Expression f7072l;

    /* renamed from: m, reason: collision with root package name */
    public final Expression f7073m;

    /* renamed from: n, reason: collision with root package name */
    public final Expression f7074n;

    /* renamed from: o, reason: collision with root package name */
    public final Expression f7075o;

    /* renamed from: p, reason: collision with root package name */
    public final Expression f7076p;

    /* renamed from: q, reason: collision with root package name */
    public final Expression f7077q;

    /* renamed from: r, reason: collision with root package name */
    private final List f7078r;

    /* renamed from: s, reason: collision with root package name */
    private final Yb f7079s;

    /* renamed from: t, reason: collision with root package name */
    public final Expression f7080t;

    /* renamed from: u, reason: collision with root package name */
    public final Expression f7081u;

    /* renamed from: v, reason: collision with root package name */
    private final String f7082v;

    /* renamed from: w, reason: collision with root package name */
    private final C1079u8 f7083w;

    /* renamed from: x, reason: collision with root package name */
    public final Expression f7084x;

    /* renamed from: y, reason: collision with root package name */
    public final Expression f7085y;

    /* renamed from: z, reason: collision with root package name */
    private final C0754c5 f7086z;

    /* renamed from: O1.mb$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7087i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0939mb invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0939mb.f7029U.a(env, it);
        }
    }

    /* renamed from: O1.mb$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0939mb a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1100vb.g) BuiltInParserKt.getBuiltInParserComponent().A6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.mb$c */
    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: d, reason: collision with root package name */
        public static final b f7088d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Function2 f7089e = a.f7093i;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f7090a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f7091b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f7092c;

        /* renamed from: O1.mb$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f7093i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f7088d.a(env, it);
            }
        }

        /* renamed from: O1.mb$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((C1118wb) BuiltInParserKt.getBuiltInParserComponent().D6().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(Expression expression, Expression value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7090a = expression;
            this.f7091b = value;
        }

        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            if (cVar == null) {
                return false;
            }
            Expression expression = this.f7090a;
            String str = expression != null ? (String) expression.evaluate(resolver) : null;
            Expression expression2 = cVar.f7090a;
            return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null) && Intrinsics.areEqual(this.f7091b.evaluate(resolver), cVar.f7091b.evaluate(otherResolver));
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f7092c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode();
            Expression expression = this.f7090a;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.f7091b.hashCode();
            this.f7092c = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C1118wb) BuiltInParserKt.getBuiltInParserComponent().D6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f7030V = companion.constant(Double.valueOf(1.0d));
        f7031W = companion.constant(12L);
        f7032X = companion.constant(EnumC0779dc.SP);
        f7033Y = companion.constant(EnumC0791e6.REGULAR);
        f7034Z = new Yb.e(new C0765cg(null, null, null, 7, null));
        f7035a0 = companion.constant(1929379840);
        f7036b0 = companion.constant(Double.valueOf(0.0d));
        f7037c0 = companion.constant(-16777216);
        f7038d0 = companion.constant(Vf.VISIBLE);
        f7039e0 = new Yb.d(new I8(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        f7040f0 = a.f7087i;
    }

    public C0939mb(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, W5 w5, Expression expression4, Expression fontSize, Expression fontSizeUnit, Expression expression5, Expression fontWeight, Expression expression6, List list5, Yb height, Expression hintColor, Expression expression7, String str, C1079u8 c1079u8, Expression letterSpacing, Expression expression8, C0754c5 c0754c5, List options, C0754c5 c0754c52, Expression expression9, Expression expression10, List list6, Expression textColor, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, String valueVariable, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        Intrinsics.checkNotNullParameter(fontSizeUnit, "fontSizeUnit");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(hintColor, "hintColor");
        Intrinsics.checkNotNullParameter(letterSpacing, "letterSpacing");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(valueVariable, "valueVariable");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f7061a = c0839h0;
        this.f7062b = expression;
        this.f7063c = expression2;
        this.f7064d = alpha;
        this.f7065e = list;
        this.f7066f = list2;
        this.f7067g = c0860i3;
        this.f7068h = expression3;
        this.f7069i = list3;
        this.f7070j = list4;
        this.f7071k = w5;
        this.f7072l = expression4;
        this.f7073m = fontSize;
        this.f7074n = fontSizeUnit;
        this.f7075o = expression5;
        this.f7076p = fontWeight;
        this.f7077q = expression6;
        this.f7078r = list5;
        this.f7079s = height;
        this.f7080t = hintColor;
        this.f7081u = expression7;
        this.f7082v = str;
        this.f7083w = c1079u8;
        this.f7084x = letterSpacing;
        this.f7085y = expression8;
        this.f7086z = c0754c5;
        this.f7041A = options;
        this.f7042B = c0754c52;
        this.f7043C = expression9;
        this.f7044D = expression10;
        this.f7045E = list6;
        this.f7046F = textColor;
        this.f7047G = list7;
        this.f7048H = c0925lf;
        this.f7049I = abstractC1092v3;
        this.f7050J = o22;
        this.f7051K = o23;
        this.f7052L = list8;
        this.f7053M = valueVariable;
        this.f7054N = list9;
        this.f7055O = list10;
        this.f7056P = visibility;
        this.f7057Q = wf;
        this.f7058R = list11;
        this.f7059S = width;
    }

    public static /* synthetic */ C0939mb B(C0939mb c0939mb, C0839h0 c0839h0, Expression expression, Expression expression2, Expression expression3, List list, List list2, C0860i3 c0860i3, Expression expression4, List list3, List list4, W5 w5, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, Yb yb, Expression expression11, Expression expression12, String str, C1079u8 c1079u8, Expression expression13, Expression expression14, C0754c5 c0754c5, List list6, C0754c5 c0754c52, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list9, String str2, List list10, List list11, Expression expression18, Wf wf, List list12, Yb yb2, int i4, int i5, Object obj) {
        C0839h0 d4 = (i4 & 1) != 0 ? c0939mb.d() : c0839h0;
        Expression l4 = (i4 & 2) != 0 ? c0939mb.l() : expression;
        Expression s4 = (i4 & 4) != 0 ? c0939mb.s() : expression2;
        Expression v4 = (i4 & 8) != 0 ? c0939mb.v() : expression3;
        List u4 = (i4 & 16) != 0 ? c0939mb.u() : list;
        List background = (i4 & 32) != 0 ? c0939mb.getBackground() : list2;
        C0860i3 w4 = (i4 & 64) != 0 ? c0939mb.w() : c0860i3;
        Expression e4 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c0939mb.e() : expression4;
        List a4 = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c0939mb.a() : list3;
        List extensions = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c0939mb.getExtensions() : list4;
        W5 x4 = (i4 & 1024) != 0 ? c0939mb.x() : w5;
        Expression expression19 = (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c0939mb.f7072l : expression5;
        Expression expression20 = (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? c0939mb.f7073m : expression6;
        C0839h0 c0839h02 = d4;
        Expression expression21 = (i4 & 8192) != 0 ? c0939mb.f7074n : expression7;
        Expression expression22 = (i4 & 16384) != 0 ? c0939mb.f7075o : expression8;
        Expression expression23 = (i4 & 32768) != 0 ? c0939mb.f7076p : expression9;
        Expression expression24 = (i4 & 65536) != 0 ? c0939mb.f7077q : expression10;
        List r4 = (i4 & 131072) != 0 ? c0939mb.r() : list5;
        Yb height = (i4 & 262144) != 0 ? c0939mb.getHeight() : yb;
        Expression expression25 = expression24;
        Expression expression26 = (i4 & 524288) != 0 ? c0939mb.f7080t : expression11;
        Expression expression27 = (i4 & 1048576) != 0 ? c0939mb.f7081u : expression12;
        String id = (i4 & 2097152) != 0 ? c0939mb.getId() : str;
        C1079u8 m4 = (i4 & 4194304) != 0 ? c0939mb.m() : c1079u8;
        Expression expression28 = expression27;
        Expression expression29 = (i4 & 8388608) != 0 ? c0939mb.f7084x : expression13;
        Expression expression30 = (i4 & 16777216) != 0 ? c0939mb.f7085y : expression14;
        C0754c5 g4 = (i4 & 33554432) != 0 ? c0939mb.g() : c0754c5;
        Expression expression31 = expression30;
        List list13 = (i4 & 67108864) != 0 ? c0939mb.f7041A : list6;
        return c0939mb.A(c0839h02, l4, s4, v4, u4, background, w4, e4, a4, extensions, x4, expression19, expression20, expression21, expression22, expression23, expression25, r4, height, expression26, expression28, id, m4, expression29, expression31, g4, list13, (i4 & 134217728) != 0 ? c0939mb.i() : c0754c52, (i4 & 268435456) != 0 ? c0939mb.n() : expression15, (i4 & 536870912) != 0 ? c0939mb.h() : expression16, (i4 & 1073741824) != 0 ? c0939mb.k() : list7, (i4 & Integer.MIN_VALUE) != 0 ? c0939mb.f7046F : expression17, (i5 & 1) != 0 ? c0939mb.p() : list8, (i5 & 2) != 0 ? c0939mb.b() : c0925lf, (i5 & 4) != 0 ? c0939mb.z() : abstractC1092v3, (i5 & 8) != 0 ? c0939mb.t() : o22, (i5 & 16) != 0 ? c0939mb.y() : o23, (i5 & 32) != 0 ? c0939mb.j() : list9, (i5 & 64) != 0 ? c0939mb.f7053M : str2, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? c0939mb.o() : list10, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c0939mb.f() : list11, (i5 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? c0939mb.getVisibility() : expression18, (i5 & 1024) != 0 ? c0939mb.q() : wf, (i5 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? c0939mb.c() : list12, (i5 & Base64Utils.IO_BUFFER_SIZE) != 0 ? c0939mb.getWidth() : yb2);
    }

    public final C0939mb A(C0839h0 c0839h0, Expression expression, Expression expression2, Expression alpha, List list, List list2, C0860i3 c0860i3, Expression expression3, List list3, List list4, W5 w5, Expression expression4, Expression fontSize, Expression fontSizeUnit, Expression expression5, Expression fontWeight, Expression expression6, List list5, Yb height, Expression hintColor, Expression expression7, String str, C1079u8 c1079u8, Expression letterSpacing, Expression expression8, C0754c5 c0754c5, List options, C0754c5 c0754c52, Expression expression9, Expression expression10, List list6, Expression textColor, List list7, C0925lf c0925lf, AbstractC1092v3 abstractC1092v3, O2 o22, O2 o23, List list8, String valueVariable, List list9, List list10, Expression visibility, Wf wf, List list11, Yb width) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        Intrinsics.checkNotNullParameter(fontSizeUnit, "fontSizeUnit");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(hintColor, "hintColor");
        Intrinsics.checkNotNullParameter(letterSpacing, "letterSpacing");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(valueVariable, "valueVariable");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(width, "width");
        return new C0939mb(c0839h0, expression, expression2, alpha, list, list2, c0860i3, expression3, list3, list4, w5, expression4, fontSize, fontSizeUnit, expression5, fontWeight, expression6, list5, height, hintColor, expression7, str, c1079u8, letterSpacing, expression8, c0754c5, options, c0754c52, expression9, expression10, list6, textColor, list7, c0925lf, abstractC1092v3, o22, o23, list8, valueVariable, list9, list10, visibility, wf, list11, width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:385:0x06c8, code lost:
    
        if (r9.c() == null) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0650, code lost:
    
        if (r9.f() == null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0604, code lost:
    
        if (r9.o() == null) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x05ae, code lost:
    
        if (r9.j() == null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x04f9, code lost:
    
        if (r9.p() == null) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0493, code lost:
    
        if (r9.k() == null) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x02e8, code lost:
    
        if (r9.r() == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x01f0, code lost:
    
        if (r9.getExtensions() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x01a4, code lost:
    
        if (r9.a() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x011c, code lost:
    
        if (r9.getBackground() == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x00d0, code lost:
    
        if (r9.u() == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(C0939mb c0939mb, ExpressionResolver resolver, ExpressionResolver otherResolver) {
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
        if (c0939mb == null) {
            return false;
        }
        C0839h0 d4 = d();
        if (d4 != null ? d4.a(c0939mb.d(), resolver, otherResolver) : c0939mb.d() == null) {
            Expression l4 = l();
            EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(resolver) : null;
            Expression l5 = c0939mb.l();
            if (enumC1091v2 == (l5 != null ? (EnumC1091v2) l5.evaluate(otherResolver) : null)) {
                Expression s4 = s();
                EnumC1109w2 enumC1109w2 = s4 != null ? (EnumC1109w2) s4.evaluate(resolver) : null;
                Expression s5 = c0939mb.s();
                if (enumC1109w2 == (s5 != null ? (EnumC1109w2) s5.evaluate(otherResolver) : null)) {
                    if (((Number) v().evaluate(resolver)).doubleValue() == ((Number) c0939mb.v().evaluate(otherResolver)).doubleValue()) {
                        List u4 = u();
                        if (u4 != null) {
                            List u5 = c0939mb.u();
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
                                List background2 = c0939mb.getBackground();
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
                                if (w4 != null ? w4.a(c0939mb.w(), resolver, otherResolver) : c0939mb.w() == null) {
                                    Expression e4 = e();
                                    Long l6 = e4 != null ? (Long) e4.evaluate(resolver) : null;
                                    Expression e5 = c0939mb.e();
                                    if (Intrinsics.areEqual(l6, e5 != null ? (Long) e5.evaluate(otherResolver) : null)) {
                                        List a4 = a();
                                        if (a4 != null) {
                                            List a5 = c0939mb.a();
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
                                                List extensions2 = c0939mb.getExtensions();
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
                                                if (x4 != null ? x4.a(c0939mb.x(), resolver, otherResolver) : c0939mb.x() == null) {
                                                    Expression expression = this.f7072l;
                                                    String str = expression != null ? (String) expression.evaluate(resolver) : null;
                                                    Expression expression2 = c0939mb.f7072l;
                                                    if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null) && ((Number) this.f7073m.evaluate(resolver)).longValue() == ((Number) c0939mb.f7073m.evaluate(otherResolver)).longValue() && this.f7074n.evaluate(resolver) == c0939mb.f7074n.evaluate(otherResolver)) {
                                                        Expression expression3 = this.f7075o;
                                                        JSONObject jSONObject = expression3 != null ? (JSONObject) expression3.evaluate(resolver) : null;
                                                        Expression expression4 = c0939mb.f7075o;
                                                        if (Intrinsics.areEqual(jSONObject, expression4 != null ? (JSONObject) expression4.evaluate(otherResolver) : null) && this.f7076p.evaluate(resolver) == c0939mb.f7076p.evaluate(otherResolver)) {
                                                            Expression expression5 = this.f7077q;
                                                            Long l7 = expression5 != null ? (Long) expression5.evaluate(resolver) : null;
                                                            Expression expression6 = c0939mb.f7077q;
                                                            if (Intrinsics.areEqual(l7, expression6 != null ? (Long) expression6.evaluate(otherResolver) : null)) {
                                                                List r4 = r();
                                                                if (r4 != null) {
                                                                    List r5 = c0939mb.r();
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
                                                                if (z8 && getHeight().a(c0939mb.getHeight(), resolver, otherResolver) && ((Number) this.f7080t.evaluate(resolver)).intValue() == ((Number) c0939mb.f7080t.evaluate(otherResolver)).intValue()) {
                                                                    Expression expression7 = this.f7081u;
                                                                    String str2 = expression7 != null ? (String) expression7.evaluate(resolver) : null;
                                                                    Expression expression8 = c0939mb.f7081u;
                                                                    if (Intrinsics.areEqual(str2, expression8 != null ? (String) expression8.evaluate(otherResolver) : null) && Intrinsics.areEqual(getId(), c0939mb.getId())) {
                                                                        C1079u8 m4 = m();
                                                                        if (m4 != null ? m4.a(c0939mb.m(), resolver, otherResolver) : c0939mb.m() == null) {
                                                                            if (((Number) this.f7084x.evaluate(resolver)).doubleValue() == ((Number) c0939mb.f7084x.evaluate(otherResolver)).doubleValue()) {
                                                                                Expression expression9 = this.f7085y;
                                                                                Long l8 = expression9 != null ? (Long) expression9.evaluate(resolver) : null;
                                                                                Expression expression10 = c0939mb.f7085y;
                                                                                if (Intrinsics.areEqual(l8, expression10 != null ? (Long) expression10.evaluate(otherResolver) : null)) {
                                                                                    C0754c5 g4 = g();
                                                                                    if (g4 != null ? g4.a(c0939mb.g(), resolver, otherResolver) : c0939mb.g() == null) {
                                                                                        List list = this.f7041A;
                                                                                        List list2 = c0939mb.f7041A;
                                                                                        if (list.size() == list2.size()) {
                                                                                            int i14 = 0;
                                                                                            for (Object obj6 : list) {
                                                                                                int i15 = i14 + 1;
                                                                                                if (i14 < 0) {
                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                }
                                                                                                if (((c) obj6).a((c) list2.get(i14), resolver, otherResolver)) {
                                                                                                    i14 = i15;
                                                                                                }
                                                                                            }
                                                                                            z9 = true;
                                                                                            if (z9) {
                                                                                                C0754c5 i16 = i();
                                                                                                if (i16 != null ? i16.a(c0939mb.i(), resolver, otherResolver) : c0939mb.i() == null) {
                                                                                                    Expression n4 = n();
                                                                                                    String str3 = n4 != null ? (String) n4.evaluate(resolver) : null;
                                                                                                    Expression n5 = c0939mb.n();
                                                                                                    if (Intrinsics.areEqual(str3, n5 != null ? (String) n5.evaluate(otherResolver) : null)) {
                                                                                                        Expression h4 = h();
                                                                                                        Long l9 = h4 != null ? (Long) h4.evaluate(resolver) : null;
                                                                                                        Expression h5 = c0939mb.h();
                                                                                                        if (Intrinsics.areEqual(l9, h5 != null ? (Long) h5.evaluate(otherResolver) : null)) {
                                                                                                            List k4 = k();
                                                                                                            if (k4 != null) {
                                                                                                                List k5 = c0939mb.k();
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
                                                                                                            if (z10 && ((Number) this.f7046F.evaluate(resolver)).intValue() == ((Number) c0939mb.f7046F.evaluate(otherResolver)).intValue()) {
                                                                                                                List p4 = p();
                                                                                                                if (p4 != null) {
                                                                                                                    List p5 = c0939mb.p();
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
                                                                                                                    if (b4 != null ? b4.a(c0939mb.b(), resolver, otherResolver) : c0939mb.b() == null) {
                                                                                                                        AbstractC1092v3 z16 = z();
                                                                                                                        if (z16 != null ? z16.a(c0939mb.z(), resolver, otherResolver) : c0939mb.z() == null) {
                                                                                                                            O2 t4 = t();
                                                                                                                            if (t4 != null ? t4.a(c0939mb.t(), resolver, otherResolver) : c0939mb.t() == null) {
                                                                                                                                O2 y4 = y();
                                                                                                                                if (y4 != null ? y4.a(c0939mb.y(), resolver, otherResolver) : c0939mb.y() == null) {
                                                                                                                                    List j4 = j();
                                                                                                                                    if (j4 != null) {
                                                                                                                                        List j5 = c0939mb.j();
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
                                                                                                                                    if (z12 && Intrinsics.areEqual(this.f7053M, c0939mb.f7053M)) {
                                                                                                                                        List o4 = o();
                                                                                                                                        if (o4 != null) {
                                                                                                                                            List o5 = c0939mb.o();
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
                                                                                                                                                List f5 = c0939mb.f();
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
                                                                                                                                            if (z14 && getVisibility().evaluate(resolver) == c0939mb.getVisibility().evaluate(otherResolver)) {
                                                                                                                                                Wf q4 = q();
                                                                                                                                                if (q4 != null ? q4.h(c0939mb.q(), resolver, otherResolver) : c0939mb.q() == null) {
                                                                                                                                                    List c4 = c();
                                                                                                                                                    if (c4 != null) {
                                                                                                                                                        List c5 = c0939mb.c();
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
                                                                                                                                                    if (z15 && getWidth().a(c0939mb.getWidth(), resolver, otherResolver)) {
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
                                                                                        z9 = false;
                                                                                        if (z9) {
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
        return this.f7069i;
    }

    @Override // O1.InterfaceC0752c3
    public C0925lf b() {
        return this.f7048H;
    }

    @Override // O1.InterfaceC0752c3
    public List c() {
        return this.f7058R;
    }

    @Override // O1.InterfaceC0752c3
    public C0839h0 d() {
        return this.f7061a;
    }

    @Override // O1.InterfaceC0752c3
    public Expression e() {
        return this.f7068h;
    }

    @Override // O1.InterfaceC0752c3
    public List f() {
        return this.f7055O;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 g() {
        return this.f7086z;
    }

    @Override // O1.InterfaceC0752c3
    public List getBackground() {
        return this.f7066f;
    }

    @Override // O1.InterfaceC0752c3
    public List getExtensions() {
        return this.f7070j;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getHeight() {
        return this.f7079s;
    }

    @Override // O1.InterfaceC0752c3
    public String getId() {
        return this.f7082v;
    }

    @Override // O1.InterfaceC0752c3
    public Expression getVisibility() {
        return this.f7056P;
    }

    @Override // O1.InterfaceC0752c3
    public Yb getWidth() {
        return this.f7059S;
    }

    @Override // O1.InterfaceC0752c3
    public Expression h() {
        return this.f7044D;
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
        Integer num = this.f7060T;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0939mb.class).hashCode();
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
        Expression expression = this.f7072l;
        int hashCode5 = hash3 + (expression != null ? expression.hashCode() : 0) + this.f7073m.hashCode() + this.f7074n.hashCode();
        Expression expression2 = this.f7075o;
        int hashCode6 = hashCode5 + (expression2 != null ? expression2.hashCode() : 0) + this.f7076p.hashCode();
        Expression expression3 = this.f7077q;
        int hashCode7 = hashCode6 + (expression3 != null ? expression3.hashCode() : 0);
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
        int hash4 = hashCode7 + i8 + getHeight().hash() + this.f7080t.hashCode();
        Expression expression4 = this.f7081u;
        int hashCode8 = hash4 + (expression4 != null ? expression4.hashCode() : 0);
        String id = getId();
        int hashCode9 = hashCode8 + (id != null ? id.hashCode() : 0);
        C1079u8 m4 = m();
        int hash5 = hashCode9 + (m4 != null ? m4.hash() : 0) + this.f7084x.hashCode();
        Expression expression5 = this.f7085y;
        int hashCode10 = hash5 + (expression5 != null ? expression5.hashCode() : 0);
        C0754c5 g4 = g();
        int hash6 = hashCode10 + (g4 != null ? g4.hash() : 0);
        Iterator it6 = this.f7041A.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            i18 += ((c) it6.next()).hash();
        }
        int i19 = hash6 + i18;
        C0754c5 i20 = i();
        int hash7 = i19 + (i20 != null ? i20.hash() : 0);
        Expression n4 = n();
        int hashCode11 = hash7 + (n4 != null ? n4.hashCode() : 0);
        Expression h4 = h();
        int hashCode12 = hashCode11 + (h4 != null ? h4.hashCode() : 0);
        List k4 = k();
        if (k4 != null) {
            Iterator it7 = k4.iterator();
            i9 = 0;
            while (it7.hasNext()) {
                i9 += ((C0892k0) it7.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int hashCode13 = hashCode12 + i9 + this.f7046F.hashCode();
        List p4 = p();
        if (p4 != null) {
            Iterator it8 = p4.iterator();
            i10 = 0;
            while (it8.hasNext()) {
                i10 += ((Se) it8.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i21 = hashCode13 + i10;
        C0925lf b4 = b();
        int hash8 = i21 + (b4 != null ? b4.hash() : 0);
        AbstractC1092v3 z4 = z();
        int hash9 = hash8 + (z4 != null ? z4.hash() : 0);
        O2 t4 = t();
        int hash10 = hash9 + (t4 != null ? t4.hash() : 0);
        O2 y4 = y();
        int hash11 = hash10 + (y4 != null ? y4.hash() : 0);
        List j4 = j();
        int hashCode14 = hash11 + (j4 != null ? j4.hashCode() : 0) + this.f7053M.hashCode();
        List o4 = o();
        if (o4 != null) {
            Iterator it9 = o4.iterator();
            i11 = 0;
            while (it9.hasNext()) {
                i11 += ((C1015qf) it9.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i22 = hashCode14 + i11;
        List f4 = f();
        if (f4 != null) {
            Iterator it10 = f4.iterator();
            i12 = 0;
            while (it10.hasNext()) {
                i12 += ((AbstractC1176zf) it10.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int hashCode15 = i22 + i12 + getVisibility().hashCode();
        Wf q4 = q();
        int hash12 = hashCode15 + (q4 != null ? q4.hash() : 0);
        List c4 = c();
        if (c4 != null) {
            Iterator it11 = c4.iterator();
            while (it11.hasNext()) {
                i13 += ((Wf) it11.next()).hash();
            }
        }
        int hash13 = hash12 + i13 + getWidth().hash();
        this.f7060T = Integer.valueOf(hash13);
        return hash13;
    }

    @Override // O1.InterfaceC0752c3
    public C0754c5 i() {
        return this.f7042B;
    }

    @Override // O1.InterfaceC0752c3
    public List j() {
        return this.f7052L;
    }

    @Override // O1.InterfaceC0752c3
    public List k() {
        return this.f7045E;
    }

    @Override // O1.InterfaceC0752c3
    public Expression l() {
        return this.f7062b;
    }

    @Override // O1.InterfaceC0752c3
    public C1079u8 m() {
        return this.f7083w;
    }

    @Override // O1.InterfaceC0752c3
    public Expression n() {
        return this.f7043C;
    }

    @Override // O1.InterfaceC0752c3
    public List o() {
        return this.f7054N;
    }

    @Override // O1.InterfaceC0752c3
    public List p() {
        return this.f7047G;
    }

    @Override // O1.InterfaceC0752c3
    public Wf q() {
        return this.f7057Q;
    }

    @Override // O1.InterfaceC0752c3
    public List r() {
        return this.f7078r;
    }

    @Override // O1.InterfaceC0752c3
    public Expression s() {
        return this.f7063c;
    }

    @Override // O1.InterfaceC0752c3
    public O2 t() {
        return this.f7050J;
    }

    @Override // O1.InterfaceC0752c3
    public List u() {
        return this.f7065e;
    }

    @Override // O1.InterfaceC0752c3
    public Expression v() {
        return this.f7064d;
    }

    @Override // O1.InterfaceC0752c3
    public C0860i3 w() {
        return this.f7067g;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1100vb.g) BuiltInParserKt.getBuiltInParserComponent().A6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // O1.InterfaceC0752c3
    public W5 x() {
        return this.f7071k;
    }

    @Override // O1.InterfaceC0752c3
    public O2 y() {
        return this.f7051K;
    }

    @Override // O1.InterfaceC0752c3
    public AbstractC1092v3 z() {
        return this.f7049I;
    }
}
