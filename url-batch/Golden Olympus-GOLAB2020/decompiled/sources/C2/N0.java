package C2;

import B2.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3526a;

/* loaded from: classes3.dex */
public abstract class N0 implements B2.e, B2.c {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f227a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f228b;

    static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3526a f230j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f231k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3526a interfaceC3526a, Object obj) {
            super(0);
            this.f230j = interfaceC3526a;
            this.f231k = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return N0.this.r() ? N0.this.I(this.f230j, this.f231k) : N0.this.m();
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3526a f233j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f234k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3526a interfaceC3526a, Object obj) {
            super(0);
            this.f233j = interfaceC3526a;
            this.f234k = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return N0.this.I(this.f233j, this.f234k);
        }
    }

    private final Object Y(Object obj, Function0 function0) {
        X(obj);
        Object invoke = function0.invoke();
        if (!this.f228b) {
            W();
        }
        this.f228b = false;
        return invoke;
    }

    @Override // B2.e
    public final byte A() {
        return K(W());
    }

    @Override // B2.c
    public final Object B(A2.f descriptor, int i4, InterfaceC3526a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return Y(V(descriptor, i4), new a(deserializer, obj));
    }

    @Override // B2.c
    public final long C(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return R(V(descriptor, i4));
    }

    @Override // B2.c
    public final double D(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return M(V(descriptor, i4));
    }

    @Override // B2.e
    public final short E() {
        return S(W());
    }

    @Override // B2.e
    public final float F() {
        return O(W());
    }

    @Override // B2.c
    public final char G(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return L(V(descriptor, i4));
    }

    @Override // B2.e
    public final double H() {
        return M(W());
    }

    protected Object I(InterfaceC3526a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return u(deserializer);
    }

    protected abstract boolean J(Object obj);

    protected abstract byte K(Object obj);

    protected abstract char L(Object obj);

    protected abstract double M(Object obj);

    protected abstract int N(Object obj, A2.f fVar);

    protected abstract float O(Object obj);

    protected B2.e P(Object obj, A2.f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        X(obj);
        return this;
    }

    protected abstract int Q(Object obj);

    protected abstract long R(Object obj);

    protected abstract short S(Object obj);

    protected abstract String T(Object obj);

    protected final Object U() {
        return CollectionsKt.lastOrNull((List) this.f227a);
    }

    protected abstract Object V(A2.f fVar, int i4);

    protected final Object W() {
        ArrayList arrayList = this.f227a;
        Object remove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.f228b = true;
        return remove;
    }

    protected final void X(Object obj) {
        this.f227a.add(obj);
    }

    @Override // B2.e
    public final boolean e() {
        return J(W());
    }

    @Override // B2.e
    public final char f() {
        return L(W());
    }

    @Override // B2.c
    public int g(A2.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // B2.c
    public final String h(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return T(V(descriptor, i4));
    }

    @Override // B2.e
    public final int j() {
        return Q(W());
    }

    @Override // B2.c
    public final byte k(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return K(V(descriptor, i4));
    }

    @Override // B2.c
    public final B2.e l(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(V(descriptor, i4), descriptor.i(i4));
    }

    @Override // B2.e
    public final Void m() {
        return null;
    }

    @Override // B2.e
    public final int n(A2.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return N(W(), enumDescriptor);
    }

    @Override // B2.e
    public final String o() {
        return T(W());
    }

    @Override // B2.e
    public B2.e p(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(W(), descriptor);
    }

    @Override // B2.e
    public final long q() {
        return R(W());
    }

    @Override // B2.e
    public abstract boolean r();

    @Override // B2.c
    public final int s(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Q(V(descriptor, i4));
    }

    @Override // B2.e
    public abstract Object u(InterfaceC3526a interfaceC3526a);

    @Override // B2.c
    public boolean v() {
        return c.a.b(this);
    }

    @Override // B2.c
    public final float w(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return O(V(descriptor, i4));
    }

    @Override // B2.c
    public final boolean x(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return J(V(descriptor, i4));
    }

    @Override // B2.c
    public final Object y(A2.f descriptor, int i4, InterfaceC3526a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return Y(V(descriptor, i4), new b(deserializer, obj));
    }

    @Override // B2.c
    public final short z(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return S(V(descriptor, i4));
    }
}
