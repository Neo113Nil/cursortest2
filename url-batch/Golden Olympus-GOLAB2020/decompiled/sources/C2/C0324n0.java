package C2;

import A2.f;
import A2.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C2.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0324n0 implements A2.f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0324n0 f309a = new C0324n0();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.j f310b = k.d.f102a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f311c = "kotlin.Nothing";

    private C0324n0() {
    }

    private final Void b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // A2.f
    public String a() {
        return f311c;
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

    @Override // A2.f
    public A2.j e() {
        return f310b;
    }

    public boolean equals(Object obj) {
        return this == obj;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
