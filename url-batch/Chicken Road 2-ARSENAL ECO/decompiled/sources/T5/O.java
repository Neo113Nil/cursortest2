package T5;

import java.util.List;
import l5.C0512p;

/* loaded from: classes.dex */
public final class O implements R5.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2399a;

    /* renamed from: b, reason: collision with root package name */
    public final R5.d f2400b;

    public O(String str, R5.d kind) {
        kotlin.jvm.internal.i.e(kind, "kind");
        this.f2399a = str;
        this.f2400b = kind;
    }

    @Override // R5.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // R5.e
    public final String b() {
        return this.f2399a;
    }

    @Override // R5.e
    public final A3.c c() {
        return this.f2400b;
    }

    @Override // R5.e
    public final int d() {
        return 0;
    }

    @Override // R5.e
    public final String e(int i7) {
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
        return kotlin.jvm.internal.i.a(this.f2399a, o7.f2399a) && kotlin.jvm.internal.i.a(this.f2400b, o7.f2400b);
    }

    @Override // R5.e
    public final List g(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // R5.e
    public final List getAnnotations() {
        return C0512p.f5303f;
    }

    @Override // R5.e
    public final R5.e h(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f2400b.hashCode() * 31) + this.f2399a.hashCode();
    }

    @Override // R5.e
    public final boolean i(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // R5.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f2399a + ')';
    }

    @Override // R5.e
    public final void f() {
    }
}
