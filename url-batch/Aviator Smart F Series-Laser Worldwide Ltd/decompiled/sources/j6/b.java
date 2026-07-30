package j6;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class b extends kotlin.collections.o {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public b(char c8, char c9, int i8) {
        this.step = i8;
        this.finalElement = c9;
        boolean z7 = true;
        if (i8 <= 0 ? kotlin.jvm.internal.s.compare((int) c8, (int) c9) < 0 : kotlin.jvm.internal.s.compare((int) c8, (int) c9) > 0) {
            z7 = false;
        }
        this.hasNext = z7;
        this.next = z7 ? c8 : c9;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.o
    public char nextChar() {
        int i8 = this.next;
        if (i8 != this.finalElement) {
            this.next = this.step + i8;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return (char) i8;
    }
}
