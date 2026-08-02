package kotlin.collections;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IndexedValue<T> {
    public final int index;
    public final Object value;

    public IndexedValue(int i, Object obj) {
        this.index = i;
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.index == indexedValue.index && Intrinsics.areEqual(this.value, indexedValue.value);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.index) * 31;
        Object obj = this.value;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.index);
        sb.append(", value=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.value, ')');
    }
}
