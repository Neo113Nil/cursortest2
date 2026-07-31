package E2;

import A2.j;
import C2.AbstractC0299b;
import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import y2.C3528c;
import y2.InterfaceC3526a;

/* loaded from: classes3.dex */
public class W extends B2.a implements D2.h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0348a f562a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f563b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0370a f564c;

    /* renamed from: d, reason: collision with root package name */
    private final F2.b f565d;

    /* renamed from: e, reason: collision with root package name */
    private int f566e;

    /* renamed from: f, reason: collision with root package name */
    private a f567f;

    /* renamed from: g, reason: collision with root package name */
    private final D2.g f568g;

    /* renamed from: h, reason: collision with root package name */
    private final C f569h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f570a;

        public a(String str) {
            this.f570a = str;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f571a;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f571a = iArr;
        }
    }

    public W(AbstractC0348a json, c0 mode, AbstractC0370a lexer, A2.f descriptor, a aVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f562a = json;
        this.f563b = mode;
        this.f564c = lexer;
        this.f565d = json.a();
        this.f566e = -1;
        this.f567f = aVar;
        D2.g d4 = json.d();
        this.f568g = d4;
        this.f569h = d4.f() ? null : new C(descriptor);
    }

    private final void K() {
        if (this.f564c.F() != 4) {
            return;
        }
        AbstractC0370a.y(this.f564c, "Unexpected leading comma", 0, null, 6, null);
        throw new W1.f();
    }

    private final boolean L(A2.f fVar, int i4) {
        String G3;
        AbstractC0348a abstractC0348a = this.f562a;
        A2.f i5 = fVar.i(i4);
        if (!i5.c() && this.f564c.N(true)) {
            return true;
        }
        if (!Intrinsics.areEqual(i5.e(), j.b.f98a) || ((i5.c() && this.f564c.N(false)) || (G3 = this.f564c.G(this.f568g.m())) == null || G.g(i5, abstractC0348a, G3) != -3)) {
            return false;
        }
        this.f564c.q();
        return true;
    }

    private final int M() {
        boolean M3 = this.f564c.M();
        if (!this.f564c.f()) {
            if (!M3) {
                return -1;
            }
            AbstractC0370a.y(this.f564c, "Unexpected trailing comma", 0, null, 6, null);
            throw new W1.f();
        }
        int i4 = this.f566e;
        if (i4 != -1 && !M3) {
            AbstractC0370a.y(this.f564c, "Expected end of the array or comma", 0, null, 6, null);
            throw new W1.f();
        }
        int i5 = i4 + 1;
        this.f566e = i5;
        return i5;
    }

    private final int N() {
        int i4;
        int i5;
        int i6 = this.f566e;
        boolean z4 = false;
        boolean z5 = i6 % 2 != 0;
        if (!z5) {
            this.f564c.o(':');
        } else if (i6 != -1) {
            z4 = this.f564c.M();
        }
        if (!this.f564c.f()) {
            if (!z4) {
                return -1;
            }
            AbstractC0370a.y(this.f564c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new W1.f();
        }
        if (z5) {
            if (this.f566e == -1) {
                AbstractC0370a abstractC0370a = this.f564c;
                i5 = abstractC0370a.f583a;
                if (z4) {
                    AbstractC0370a.y(abstractC0370a, "Unexpected trailing comma", i5, null, 4, null);
                    throw new W1.f();
                }
            } else {
                AbstractC0370a abstractC0370a2 = this.f564c;
                boolean z6 = z4;
                i4 = abstractC0370a2.f583a;
                if (!z6) {
                    AbstractC0370a.y(abstractC0370a2, "Expected comma after the key-value pair", i4, null, 4, null);
                    throw new W1.f();
                }
            }
        }
        int i7 = this.f566e + 1;
        this.f566e = i7;
        return i7;
    }

    private final int O(A2.f fVar) {
        boolean z4;
        boolean M3 = this.f564c.M();
        while (this.f564c.f()) {
            String P3 = P();
            this.f564c.o(':');
            int g4 = G.g(fVar, this.f562a, P3);
            boolean z5 = false;
            if (g4 == -3) {
                z5 = true;
                z4 = false;
            } else {
                if (!this.f568g.d() || !L(fVar, g4)) {
                    C c4 = this.f569h;
                    if (c4 != null) {
                        c4.c(g4);
                    }
                    return g4;
                }
                z4 = this.f564c.M();
            }
            M3 = z5 ? Q(P3) : z4;
        }
        if (M3) {
            AbstractC0370a.y(this.f564c, "Unexpected trailing comma", 0, null, 6, null);
            throw new W1.f();
        }
        C c5 = this.f569h;
        if (c5 != null) {
            return c5.d();
        }
        return -1;
    }

    private final String P() {
        return this.f568g.m() ? this.f564c.t() : this.f564c.k();
    }

    private final boolean Q(String str) {
        if (this.f568g.g() || S(this.f567f, str)) {
            this.f564c.I(this.f568g.m());
        } else {
            this.f564c.A(str);
        }
        return this.f564c.M();
    }

    private final void R(A2.f fVar) {
        while (t(fVar) != -1) {
        }
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !Intrinsics.areEqual(aVar.f570a, str)) {
            return false;
        }
        aVar.f570a = null;
        return true;
    }

    @Override // B2.a, B2.e
    public byte A() {
        long p4 = this.f564c.p();
        byte b4 = (byte) p4;
        if (p4 == b4) {
            return b4;
        }
        AbstractC0370a.y(this.f564c, "Failed to parse byte for input '" + p4 + '\'', 0, null, 6, null);
        throw new W1.f();
    }

    @Override // B2.a, B2.e
    public short E() {
        long p4 = this.f564c.p();
        short s4 = (short) p4;
        if (p4 == s4) {
            return s4;
        }
        AbstractC0370a.y(this.f564c, "Failed to parse short for input '" + p4 + '\'', 0, null, 6, null);
        throw new W1.f();
    }

    @Override // B2.a, B2.e
    public float F() {
        AbstractC0370a abstractC0370a = this.f564c;
        String s4 = abstractC0370a.s();
        try {
            float parseFloat = Float.parseFloat(s4);
            if (this.f562a.d().a()) {
                return parseFloat;
            }
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            F.i(this.f564c, Float.valueOf(parseFloat));
            throw new W1.f();
        } catch (IllegalArgumentException unused) {
            AbstractC0370a.y(abstractC0370a, "Failed to parse type 'float' for input '" + s4 + '\'', 0, null, 6, null);
            throw new W1.f();
        }
    }

    @Override // B2.a, B2.e
    public double H() {
        AbstractC0370a abstractC0370a = this.f564c;
        String s4 = abstractC0370a.s();
        try {
            double parseDouble = Double.parseDouble(s4);
            if (this.f562a.d().a()) {
                return parseDouble;
            }
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return parseDouble;
            }
            F.i(this.f564c, Double.valueOf(parseDouble));
            throw new W1.f();
        } catch (IllegalArgumentException unused) {
            AbstractC0370a.y(abstractC0370a, "Failed to parse type 'double' for input '" + s4 + '\'', 0, null, 6, null);
            throw new W1.f();
        }
    }

    @Override // B2.c
    public F2.b a() {
        return this.f565d;
    }

    @Override // B2.a, B2.e
    public B2.c b(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        c0 b4 = d0.b(this.f562a, descriptor);
        this.f564c.f584b.c(descriptor);
        this.f564c.o(b4.f597b);
        K();
        int i4 = b.f571a[b4.ordinal()];
        return (i4 == 1 || i4 == 2 || i4 == 3) ? new W(this.f562a, b4, this.f564c, descriptor, this.f567f) : (this.f563b == b4 && this.f562a.d().f()) ? this : new W(this.f562a, b4, this.f564c, descriptor, this.f567f);
    }

    @Override // B2.a, B2.c
    public void c(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f562a.d().g() && descriptor.f() == 0) {
            R(descriptor);
        }
        this.f564c.o(this.f563b.f598c);
        this.f564c.f584b.b();
    }

    @Override // D2.h
    public final AbstractC0348a d() {
        return this.f562a;
    }

    @Override // B2.a, B2.e
    public boolean e() {
        return this.f568g.m() ? this.f564c.i() : this.f564c.g();
    }

    @Override // B2.a, B2.e
    public char f() {
        String s4 = this.f564c.s();
        if (s4.length() == 1) {
            return s4.charAt(0);
        }
        AbstractC0370a.y(this.f564c, "Expected single char, but got '" + s4 + '\'', 0, null, 6, null);
        throw new W1.f();
    }

    @Override // D2.h
    public D2.i i() {
        return new P(this.f562a.d(), this.f564c).e();
    }

    @Override // B2.a, B2.e
    public int j() {
        long p4 = this.f564c.p();
        int i4 = (int) p4;
        if (p4 == i4) {
            return i4;
        }
        AbstractC0370a.y(this.f564c, "Failed to parse int for input '" + p4 + '\'', 0, null, 6, null);
        throw new W1.f();
    }

    @Override // B2.a, B2.e
    public Void m() {
        return null;
    }

    @Override // B2.a, B2.e
    public int n(A2.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return G.i(enumDescriptor, this.f562a, o(), " at path " + this.f564c.f584b.a());
    }

    @Override // B2.a, B2.e
    public String o() {
        return this.f568g.m() ? this.f564c.t() : this.f564c.q();
    }

    @Override // B2.a, B2.e
    public B2.e p(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Y.b(descriptor) ? new A(this.f564c, this.f562a) : super.p(descriptor);
    }

    @Override // B2.a, B2.e
    public long q() {
        return this.f564c.p();
    }

    @Override // B2.a, B2.e
    public boolean r() {
        C c4 = this.f569h;
        return ((c4 != null ? c4.b() : false) || AbstractC0370a.O(this.f564c, false, 1, null)) ? false : true;
    }

    @Override // B2.c
    public int t(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i4 = b.f571a[this.f563b.ordinal()];
        int M3 = i4 != 2 ? i4 != 4 ? M() : O(descriptor) : N();
        if (this.f563b != c0.MAP) {
            this.f564c.f584b.g(M3);
        }
        return M3;
    }

    @Override // B2.a, B2.e
    public Object u(InterfaceC3526a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC0299b) && !this.f562a.d().l()) {
                String c4 = S.c(deserializer.getDescriptor(), this.f562a);
                String l4 = this.f564c.l(c4, this.f568g.m());
                InterfaceC3526a c5 = l4 != null ? ((AbstractC0299b) deserializer).c(this, l4) : null;
                if (c5 == null) {
                    return S.d(this, deserializer);
                }
                this.f567f = new a(c4);
                return c5.deserialize(this);
            }
            return deserializer.deserialize(this);
        } catch (C3528c e4) {
            String message = e4.getMessage();
            Intrinsics.checkNotNull(message);
            if (StringsKt.P(message, "at path", false, 2, null)) {
                throw e4;
            }
            throw new C3528c(e4.c(), e4.getMessage() + " at path: " + this.f564c.f584b.a(), e4);
        }
    }

    @Override // B2.a, B2.c
    public Object y(A2.f descriptor, int i4, InterfaceC3526a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z4 = this.f563b == c0.MAP && (i4 & 1) == 0;
        if (z4) {
            this.f564c.f584b.d();
        }
        Object y4 = super.y(descriptor, i4, deserializer, obj);
        if (z4) {
            this.f564c.f584b.f(y4);
        }
        return y4;
    }
}
