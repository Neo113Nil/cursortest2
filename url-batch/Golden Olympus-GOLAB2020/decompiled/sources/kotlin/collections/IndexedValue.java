package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class IndexedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f41045a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f41046b;

    public IndexedValue(int i4, Object obj) {
        this.f41045a = i4;
        this.f41046b = obj;
    }

    public final int a() {
        return this.f41045a;
    }

    public final Object b() {
        return this.f41046b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f41045a == indexedValue.f41045a && Intrinsics.areEqual(this.f41046b, indexedValue.f41046b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f41045a) * 31;
        Object obj = this.f41046b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f41045a + ", value=" + this.f41046b + ')';
    }
}
