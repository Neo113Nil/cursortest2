package C2;

import A2.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class D0 implements A2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f190a;

    /* renamed from: b, reason: collision with root package name */
    private final A2.e f191b;

    public D0(String serialName, A2.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f190a = serialName;
        this.f191b = kind;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // A2.f
    public String a() {
        return this.f190a;
    }

    @Override // A2.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // A2.f
    public int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        b();
        throw new W1.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return Intrinsics.areEqual(a(), d02.a()) && Intrinsics.areEqual(e(), d02.e());
    }

    @Override // A2.f
    public int f() {
        return 0;
    }

    @Override // A2.f
    public String g(int i4) {
        b();
        throw new W1.f();
    }

    @Override // A2.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // A2.f
    public List h(int i4) {
        b();
        throw new W1.f();
    }

    public int hashCode() {
        return a().hashCode() + (e().hashCode() * 31);
    }

    @Override // A2.f
    public A2.f i(int i4) {
        b();
        throw new W1.f();
    }

    @Override // A2.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // A2.f
    public boolean j(int i4) {
        b();
        throw new W1.f();
    }

    @Override // A2.f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public A2.e e() {
        return this.f191b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
