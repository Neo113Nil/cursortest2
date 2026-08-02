package kotlin.ranges;

import java.util.Iterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public abstract class LongProgression implements Iterable, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    public final long first;
    public final long last;
    public final long step = 1;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public LongProgression(long j, long j2) {
        this.first = j;
        this.last = ProgressionUtilKt.getProgressionLastElement(j, j2, 1L);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new LongProgressionIterator(this.first, this.last, this.step);
    }
}
