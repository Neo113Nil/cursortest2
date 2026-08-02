package kotlin.reflect.jvm.internal.impl.platform;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public class TargetPlatform implements Iterable<Object>, KMappedMarker {
    public boolean equals(Object obj) {
        return this == obj || (obj instanceof TargetPlatform);
    }

    public final Set<Object> getComponentPlatforms() {
        return null;
    }

    public int hashCode() {
        throw null;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        throw null;
    }

    public String toString() {
        return PlatformUtilKt.getPresentableDescription(this);
    }
}
