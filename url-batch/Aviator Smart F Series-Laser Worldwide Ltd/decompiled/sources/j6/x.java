package j6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class x implements Iterator, g6.a {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public /* synthetic */ x(int i8, int i9, int i10, kotlin.jvm.internal.o oVar) {
        this(i8, i9, i10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return y5.p.m1626boximpl(m206nextpVg5ArA());
    }

    /* renamed from: next-pVg5ArA, reason: not valid java name */
    public int m206nextpVg5ArA() {
        int i8 = this.next;
        if (i8 != this.finalElement) {
            this.next = y5.p.m1632constructorimpl(this.step + i8);
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return i8;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        if (r2 >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r2 <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private x(int i8, int i9, int i10) {
        int compare;
        int compare2;
        this.finalElement = i9;
        boolean z7 = true;
        if (i10 > 0) {
            compare2 = Integer.compare(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
        } else {
            compare = Integer.compare(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
        }
        this.hasNext = z7;
        this.step = y5.p.m1632constructorimpl(i10);
        this.next = this.hasNext ? i8 : i9;
    }
}
