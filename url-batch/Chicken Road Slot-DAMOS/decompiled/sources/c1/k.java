package c1;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1486a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1487b;

    public k(int i3, Integer num) {
        this.f1486a = i3;
        this.f1487b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1486a == kVar.f1486a && Intrinsics.a(this.f1487b, kVar.f1487b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f1486a) * 31;
        Integer num = this.f1487b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f1486a + ", dataOffset=" + this.f1487b + ')';
    }
}
