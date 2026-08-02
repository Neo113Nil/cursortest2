package io.opentelemetry.context.internal.shaded;

import androidx.camera.core.impl.utils.Exif;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.measurement.internal.zzbe;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes9.dex */
public abstract class WeakConcurrentMap extends ReferenceQueue implements Runnable, Iterable {
    public final ConcurrentHashMap target;

    public final class LookupKey {
        public final boolean equals(Object obj) {
            if (obj instanceof LookupKey) {
                return true;
            }
            throw Boxes$$ExternalSyntheticOutline1.m(obj);
        }

        public final int hashCode() {
            return 0;
        }
    }

    static {
        new Exif.AnonymousClass1(20);
        new AtomicLong();
    }

    public WeakConcurrentMap(ConcurrentHashMap concurrentHashMap) {
        this.target = concurrentHashMap;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzbe(this, this.target.entrySet().iterator());
    }

    public final String toString() {
        return this.target.toString();
    }
}
