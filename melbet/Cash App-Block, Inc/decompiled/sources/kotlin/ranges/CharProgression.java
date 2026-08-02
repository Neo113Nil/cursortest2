package kotlin.ranges;

import java.util.Iterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public abstract class CharProgression implements Iterable, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    public final char first;
    public final char last;
    public final int step = 1;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CharProgression(char c, char c2) {
        this.first = c;
        this.last = (char) ProgressionUtilKt.getProgressionLastElement((int) c, (int) c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new CharProgressionIterator(this.first, this.last, this.step);
    }
}
