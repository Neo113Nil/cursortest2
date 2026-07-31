package E2;

import A2.j;
import A2.k;
import C2.AbstractC0320l0;
import D2.AbstractC0348a;
import D2.C0349b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import y2.InterfaceC3526a;

/* renamed from: E2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0372c extends AbstractC0320l0 implements D2.h {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC0348a f589c;

    /* renamed from: d, reason: collision with root package name */
    private final D2.i f590d;

    /* renamed from: e, reason: collision with root package name */
    protected final D2.g f591e;

    public /* synthetic */ AbstractC0372c(AbstractC0348a abstractC0348a, D2.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0348a, iVar);
    }

    private final D2.q d0(D2.z zVar, String str) {
        D2.q qVar = zVar instanceof D2.q ? (D2.q) zVar : null;
        if (qVar != null) {
            return qVar;
        }
        throw F.d(-1, "Unexpected 'null' when " + str + " was expected");
    }

    private final D2.i f0() {
        D2.i e02;
        String str = (String) U();
        return (str == null || (e02 = e0(str)) == null) ? s0() : e02;
    }

    private final Void t0(String str) {
        throw F.e(-1, "Failed to parse '" + str + '\'', f0().toString());
    }

    @Override // C2.AbstractC0320l0
    protected String Z(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // B2.c
    public F2.b a() {
        return d().a();
    }

    @Override // B2.e
    public B2.c b(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        D2.i f02 = f0();
        A2.j e4 = descriptor.e();
        if (Intrinsics.areEqual(e4, k.b.f100a) ? true : e4 instanceof A2.d) {
            AbstractC0348a d4 = d();
            if (f02 instanceof C0349b) {
                return new N(d4, (C0349b) f02);
            }
            throw F.d(-1, "Expected " + kotlin.jvm.internal.H.b(C0349b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.H.b(f02.getClass()));
        }
        if (!Intrinsics.areEqual(e4, k.c.f101a)) {
            AbstractC0348a d5 = d();
            if (f02 instanceof D2.w) {
                return new M(d5, (D2.w) f02, null, null, 12, null);
            }
            throw F.d(-1, "Expected " + kotlin.jvm.internal.H.b(D2.w.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.H.b(f02.getClass()));
        }
        AbstractC0348a d6 = d();
        A2.f a4 = d0.a(descriptor.i(0), d6.a());
        A2.j e5 = a4.e();
        if ((e5 instanceof A2.e) || Intrinsics.areEqual(e5, j.b.f98a)) {
            AbstractC0348a d7 = d();
            if (f02 instanceof D2.w) {
                return new O(d7, (D2.w) f02);
            }
            throw F.d(-1, "Expected " + kotlin.jvm.internal.H.b(D2.w.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.H.b(f02.getClass()));
        }
        if (!d6.d().b()) {
            throw F.c(a4);
        }
        AbstractC0348a d8 = d();
        if (f02 instanceof C0349b) {
            return new N(d8, (C0349b) f02);
        }
        throw F.d(-1, "Expected " + kotlin.jvm.internal.H.b(C0349b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.H.b(f02.getClass()));
    }

    public void c(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // D2.h
    public AbstractC0348a d() {
        return this.f589c;
    }

    protected abstract D2.i e0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean J(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        D2.z r02 = r0(tag);
        if (!d().d().m() && d0(r02, "boolean").g()) {
            throw F.e(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
        }
        try {
            Boolean e4 = D2.k.e(r02);
            if (e4 != null) {
                return e4.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            t0("boolean");
            throw new W1.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte K(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int j4 = D2.k.j(r0(tag));
            Byte valueOf = (-128 > j4 || j4 > 127) ? null : Byte.valueOf((byte) j4);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            t0("byte");
            throw new W1.f();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new W1.f();
        }
    }

    @Override // D2.h
    public D2.i i() {
        return f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char L(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return StringsKt.h1(r0(tag).e());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new W1.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double M(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            double g4 = D2.k.g(r0(tag));
            if (d().d().a()) {
                return g4;
            }
            if (Double.isInfinite(g4) || Double.isNaN(g4)) {
                throw F.a(Double.valueOf(g4), tag, f0().toString());
            }
            return g4;
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new W1.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int N(String tag, A2.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return G.j(enumDescriptor, d(), r0(tag).e(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float O(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            float i4 = D2.k.i(r0(tag));
            if (d().d().a()) {
                return i4;
            }
            if (Float.isInfinite(i4) || Float.isNaN(i4)) {
                throw F.a(Float.valueOf(i4), tag, f0().toString());
            }
            return i4;
        } catch (IllegalArgumentException unused) {
            t0("float");
            throw new W1.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public B2.e P(String tag, A2.f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return Y.b(inlineDescriptor) ? new A(new Z(r0(tag).e()), d()) : super.P(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int Q(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return D2.k.j(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("int");
            throw new W1.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long R(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return D2.k.m(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("long");
            throw new W1.f();
        }
    }

    @Override // C2.N0, B2.e
    public B2.e p(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return U() != null ? super.p(descriptor) : new I(d(), s0()).p(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short S(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int j4 = D2.k.j(r0(tag));
            Short valueOf = (-32768 > j4 || j4 > 32767) ? null : Short.valueOf((short) j4);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            t0("short");
            throw new W1.f();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new W1.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String T(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        D2.z r02 = r0(tag);
        if (d().d().m() || d0(r02, "string").g()) {
            if (r02 instanceof D2.u) {
                throw F.e(-1, "Unexpected 'null' value instead of string literal", f0().toString());
            }
            return r02.e();
        }
        throw F.e(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
    }

    @Override // C2.N0, B2.e
    public boolean r() {
        return !(f0() instanceof D2.u);
    }

    protected final D2.z r0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        D2.i e02 = e0(tag);
        D2.z zVar = e02 instanceof D2.z ? (D2.z) e02 : null;
        if (zVar != null) {
            return zVar;
        }
        throw F.e(-1, "Expected JsonPrimitive at " + tag + ", found " + e02, f0().toString());
    }

    public abstract D2.i s0();

    @Override // C2.N0, B2.e
    public Object u(InterfaceC3526a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return S.d(this, deserializer);
    }

    private AbstractC0372c(AbstractC0348a abstractC0348a, D2.i iVar) {
        this.f589c = abstractC0348a;
        this.f590d = iVar;
        this.f591e = d().d();
    }
}
