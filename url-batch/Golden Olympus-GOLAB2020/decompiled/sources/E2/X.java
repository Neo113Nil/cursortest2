package E2;

import C2.AbstractC0299b;
import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC3531f;
import y2.InterfaceC3535j;

/* loaded from: classes3.dex */
public final class X extends B2.b implements D2.n {

    /* renamed from: a, reason: collision with root package name */
    private final C0383n f572a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0348a f573b;

    /* renamed from: c, reason: collision with root package name */
    private final c0 f574c;

    /* renamed from: d, reason: collision with root package name */
    private final D2.n[] f575d;

    /* renamed from: e, reason: collision with root package name */
    private final F2.b f576e;

    /* renamed from: f, reason: collision with root package name */
    private final D2.g f577f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f578g;

    /* renamed from: h, reason: collision with root package name */
    private String f579h;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f580a;

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
            f580a = iArr;
        }
    }

    public X(C0383n composer, AbstractC0348a json, c0 mode, D2.n[] nVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f572a = composer;
        this.f573b = json;
        this.f574c = mode;
        this.f575d = nVarArr;
        this.f576e = d().a();
        this.f577f = d().d();
        int ordinal = mode.ordinal();
        if (nVarArr != null) {
            D2.n nVar = nVarArr[ordinal];
            if (nVar == null && nVar == this) {
                return;
            }
            nVarArr[ordinal] = this;
        }
    }

    private final void I(A2.f fVar) {
        this.f572a.c();
        String str = this.f579h;
        Intrinsics.checkNotNull(str);
        E(str);
        this.f572a.e(':');
        this.f572a.o();
        E(fVar.a());
    }

    @Override // B2.b, B2.f
    public void A(long j4) {
        if (this.f578g) {
            E(String.valueOf(j4));
        } else {
            this.f572a.i(j4);
        }
    }

    @Override // B2.b, B2.f
    public void E(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f572a.m(value);
    }

    @Override // B2.b
    public boolean G(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i5 = a.f580a[this.f574c.ordinal()];
        if (i5 != 1) {
            boolean z4 = false;
            if (i5 != 2) {
                if (i5 != 3) {
                    if (!this.f572a.a()) {
                        this.f572a.e(',');
                    }
                    this.f572a.c();
                    E(G.f(descriptor, d(), i4));
                    this.f572a.e(':');
                    this.f572a.o();
                } else {
                    if (i4 == 0) {
                        this.f578g = true;
                    }
                    if (i4 == 1) {
                        this.f572a.e(',');
                        this.f572a.o();
                        this.f578g = false;
                    }
                }
            } else if (this.f572a.a()) {
                this.f578g = true;
                this.f572a.c();
            } else {
                if (i4 % 2 == 0) {
                    this.f572a.e(',');
                    this.f572a.c();
                    z4 = true;
                } else {
                    this.f572a.e(':');
                    this.f572a.o();
                }
                this.f578g = z4;
            }
        } else {
            if (!this.f572a.a()) {
                this.f572a.e(',');
            }
            this.f572a.c();
        }
        return true;
    }

    @Override // B2.f
    public F2.b a() {
        return this.f576e;
    }

    @Override // B2.b, B2.f
    public B2.d b(A2.f descriptor) {
        D2.n nVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        c0 b4 = d0.b(d(), descriptor);
        char c4 = b4.f597b;
        if (c4 != 0) {
            this.f572a.e(c4);
            this.f572a.b();
        }
        if (this.f579h != null) {
            I(descriptor);
            this.f579h = null;
        }
        if (this.f574c == b4) {
            return this;
        }
        D2.n[] nVarArr = this.f575d;
        return (nVarArr == null || (nVar = nVarArr[b4.ordinal()]) == null) ? new X(this.f572a, d(), b4, this.f575d) : nVar;
    }

    @Override // B2.b, B2.d
    public void c(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f574c.f598c != 0) {
            this.f572a.p();
            this.f572a.c();
            this.f572a.e(this.f574c.f598c);
        }
    }

    @Override // D2.n
    public AbstractC0348a d() {
        return this.f573b;
    }

    @Override // B2.f
    public void e() {
        this.f572a.j("null");
    }

    @Override // B2.b, B2.f
    public void g(double d4) {
        if (this.f578g) {
            E(String.valueOf(d4));
        } else {
            this.f572a.f(d4);
        }
        if (this.f577f.a()) {
            return;
        }
        if (Double.isInfinite(d4) || Double.isNaN(d4)) {
            throw F.b(Double.valueOf(d4), this.f572a.f619a.toString());
        }
    }

    @Override // B2.b, B2.f
    public void h(short s4) {
        if (this.f578g) {
            E(String.valueOf((int) s4));
        } else {
            this.f572a.k(s4);
        }
    }

    @Override // B2.b, B2.f
    public void i(byte b4) {
        if (this.f578g) {
            E(String.valueOf((int) b4));
        } else {
            this.f572a.d(b4);
        }
    }

    @Override // B2.b, B2.f
    public void j(boolean z4) {
        if (this.f578g) {
            E(String.valueOf(z4));
        } else {
            this.f572a.l(z4);
        }
    }

    @Override // B2.b, B2.f
    public void l(float f4) {
        if (this.f578g) {
            E(String.valueOf(f4));
        } else {
            this.f572a.g(f4);
        }
        if (this.f577f.a()) {
            return;
        }
        if (Float.isInfinite(f4) || Float.isNaN(f4)) {
            throw F.b(Float.valueOf(f4), this.f572a.f619a.toString());
        }
    }

    @Override // B2.b, B2.f
    public void o(char c4) {
        E(String.valueOf(c4));
    }

    @Override // B2.f
    public void p(A2.f enumDescriptor, int i4) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        E(enumDescriptor.g(i4));
    }

    @Override // B2.b, B2.d
    public boolean r(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f577f.e();
    }

    @Override // B2.b, B2.f
    public void t(InterfaceC3535j serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (!(serializer instanceof AbstractC0299b) || d().d().l()) {
            serializer.serialize(this, obj);
            return;
        }
        AbstractC0299b abstractC0299b = (AbstractC0299b) serializer;
        String c4 = S.c(serializer.getDescriptor(), d());
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
        InterfaceC3535j b4 = AbstractC3531f.b(abstractC0299b, this, obj);
        S.f(abstractC0299b, b4, c4);
        S.b(b4.getDescriptor().e());
        this.f579h = c4;
        b4.serialize(this, obj);
    }

    @Override // B2.b, B2.f
    public B2.f v(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Y.b(descriptor)) {
            C0383n c0383n = this.f572a;
            if (!(c0383n instanceof C0389u)) {
                c0383n = new C0389u(c0383n.f619a, this.f578g);
            }
            return new X(c0383n, d(), this.f574c, (D2.n[]) null);
        }
        if (!Y.a(descriptor)) {
            return super.v(descriptor);
        }
        C0383n c0383n2 = this.f572a;
        if (!(c0383n2 instanceof C0384o)) {
            c0383n2 = new C0384o(c0383n2.f619a, this.f578g);
        }
        return new X(c0383n2, d(), this.f574c, (D2.n[]) null);
    }

    @Override // B2.b, B2.f
    public void w(int i4) {
        if (this.f578g) {
            E(String.valueOf(i4));
        } else {
            this.f572a.h(i4);
        }
    }

    @Override // B2.b, B2.d
    public void x(A2.f descriptor, int i4, InterfaceC3535j serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f577f.f()) {
            super.x(descriptor, i4, serializer, obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X(Q output, AbstractC0348a json, c0 mode, D2.n[] modeReuseCache) {
        this(AbstractC0391w.a(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
