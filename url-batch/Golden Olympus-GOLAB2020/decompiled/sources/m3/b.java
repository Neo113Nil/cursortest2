package m3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class b implements V1.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f41372a;

    public b(Object obj) {
        this.f41372a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f41372a, ((b) obj).f41372a);
    }

    @Override // V1.a
    public Object get() {
        return this.f41372a;
    }

    public int hashCode() {
        Object obj = this.f41372a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "SimpleProvider(value=" + this.f41372a + ')';
    }
}
