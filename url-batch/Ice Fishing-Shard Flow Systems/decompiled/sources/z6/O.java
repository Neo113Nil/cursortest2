package z6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class O implements x6.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f8751a;

    /* renamed from: b, reason: collision with root package name */
    public final x6.d f8752b;

    public O(String serialName, x6.d kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f8751a = serialName;
        this.f8752b = kind;
    }

    @Override // x6.e
    public final int a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // x6.e
    public final String b() {
        return this.f8751a;
    }

    @Override // x6.e
    public final V6.b c() {
        return this.f8752b;
    }

    @Override // x6.e
    public final int d() {
        return 0;
    }

    @Override // x6.e
    public final String e(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        return Intrinsics.a(this.f8751a, o7.f8751a) && Intrinsics.a(this.f8752b, o7.f8752b);
    }

    @Override // x6.e
    public final boolean f() {
        return false;
    }

    @Override // x6.e
    public final List getAnnotations() {
        return kotlin.collections.A.f6115d;
    }

    @Override // x6.e
    public final List h(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f8752b.hashCode() * 31) + this.f8751a.hashCode();
    }

    @Override // x6.e
    public final x6.e i(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // x6.e
    public final boolean j(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f8751a + ')';
    }

    @Override // x6.e
    public final void g() {
    }
}
