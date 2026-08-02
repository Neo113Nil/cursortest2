package kotlinx.collections.immutable;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;

/* loaded from: classes3.dex */
public interface PersistentMap extends Map, KMappedMarker {

    public interface Builder extends Map, KMutableMap {
    }
}
