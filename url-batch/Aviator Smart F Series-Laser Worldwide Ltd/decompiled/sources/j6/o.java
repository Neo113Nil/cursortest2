package j6;

import java.util.NoSuchElementException;
import kotlin.collections.g0;

/* loaded from: classes4.dex */
public final class o extends g0 {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    public o(long j8, long j9, long j10) {
        this.step = j10;
        this.finalElement = j9;
        boolean z7 = true;
        if (j10 <= 0 ? j8 < j9 : j8 > j9) {
            z7 = false;
        }
        this.hasNext = z7;
        this.next = z7 ? j8 : j9;
    }

    public final long getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.g0
    public long nextLong() {
        long j8 = this.next;
        if (j8 != this.finalElement) {
            this.next = this.step + j8;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return j8;
    }
}
