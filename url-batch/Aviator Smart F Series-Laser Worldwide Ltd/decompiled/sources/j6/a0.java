package j6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class a0 implements Iterator, g6.a {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    public /* synthetic */ a0(long j8, long j9, long j10, kotlin.jvm.internal.o oVar) {
        this(j8, j9, j10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return y5.r.m1704boximpl(m165nextsVKNKU());
    }

    /* renamed from: next-s-VKNKU, reason: not valid java name */
    public long m165nextsVKNKU() {
        long j8 = this.next;
        if (j8 != this.finalElement) {
            this.next = y5.r.m1710constructorimpl(this.step + j8);
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return j8;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r0 >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private a0(long j8, long j9, long j10) {
        int compare;
        int compare2;
        this.finalElement = j9;
        boolean z7 = true;
        if (j10 > 0) {
            compare2 = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
        } else {
            compare = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
        }
        this.hasNext = z7;
        this.step = y5.r.m1710constructorimpl(j10);
        this.next = this.hasNext ? j8 : j9;
    }
}
