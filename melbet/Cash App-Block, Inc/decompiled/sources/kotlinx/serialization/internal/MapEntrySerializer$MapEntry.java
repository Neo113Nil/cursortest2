package kotlinx.serialization.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public final class MapEntrySerializer$MapEntry implements Map.Entry, KMappedMarker {
    public final Object key;
    public final Object value;

    public MapEntrySerializer$MapEntry(Object obj, Object obj2) {
        this.key = obj;
        this.value = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapEntrySerializer$MapEntry)) {
            return false;
        }
        MapEntrySerializer$MapEntry mapEntrySerializer$MapEntry = (MapEntrySerializer$MapEntry) obj;
        return Intrinsics.areEqual(this.key, mapEntrySerializer$MapEntry.key) && Intrinsics.areEqual(this.value, mapEntrySerializer$MapEntry.value);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.key;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.value;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapEntry(key=");
        sb.append(this.key);
        sb.append(", value=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.value, ')');
    }
}
