package A2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final f f62a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.c f63b;

    /* renamed from: c, reason: collision with root package name */
    private final String f64c;

    public c(f original, m2.c kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f62a = original;
        this.f63b = kClass;
        this.f64c = original.a() + '<' + kClass.e() + '>';
    }

    @Override // A2.f
    public String a() {
        return this.f64c;
    }

    @Override // A2.f
    public boolean c() {
        return this.f62a.c();
    }

    @Override // A2.f
    public int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f62a.d(name);
    }

    @Override // A2.f
    public j e() {
        return this.f62a.e();
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && Intrinsics.areEqual(this.f62a, cVar.f62a) && Intrinsics.areEqual(cVar.f63b, this.f63b);
    }

    @Override // A2.f
    public int f() {
        return this.f62a.f();
    }

    @Override // A2.f
    public String g(int i4) {
        return this.f62a.g(i4);
    }

    @Override // A2.f
    public List getAnnotations() {
        return this.f62a.getAnnotations();
    }

    @Override // A2.f
    public List h(int i4) {
        return this.f62a.h(i4);
    }

    public int hashCode() {
        return (this.f63b.hashCode() * 31) + a().hashCode();
    }

    @Override // A2.f
    public f i(int i4) {
        return this.f62a.i(i4);
    }

    @Override // A2.f
    public boolean isInline() {
        return this.f62a.isInline();
    }

    @Override // A2.f
    public boolean j(int i4) {
        return this.f62a.j(i4);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f63b + ", original: " + this.f62a + ')';
    }
}
