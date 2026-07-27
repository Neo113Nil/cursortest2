package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class IndexedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f7488a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7489b;

    public IndexedValue(int i2, Object obj) {
        this.f7488a = i2;
        this.f7489b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f7488a == indexedValue.f7488a && Intrinsics.a(this.f7489b, indexedValue.f7489b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f7488a) * 31;
        Object obj = this.f7489b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f7488a + ", value=" + this.f7489b + ')';
    }
}
