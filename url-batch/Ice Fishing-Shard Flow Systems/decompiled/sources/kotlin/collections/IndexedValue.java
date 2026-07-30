package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class IndexedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f6123a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6124b;

    public IndexedValue(int i2, Object obj) {
        this.f6123a = i2;
        this.f6124b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f6123a == indexedValue.f6123a && Intrinsics.a(this.f6124b, indexedValue.f6124b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f6123a) * 31;
        Object obj = this.f6124b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f6123a + ", value=" + this.f6124b + ')';
    }
}
