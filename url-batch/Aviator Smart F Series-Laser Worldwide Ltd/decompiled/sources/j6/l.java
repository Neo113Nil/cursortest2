package j6;

import java.util.NoSuchElementException;
import kotlin.collections.f0;

/* loaded from: classes4.dex */
public final class l extends f0 {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public l(int i8, int i9, int i10) {
        this.step = i10;
        this.finalElement = i9;
        boolean z7 = true;
        if (i10 <= 0 ? i8 < i9 : i8 > i9) {
            z7 = false;
        }
        this.hasNext = z7;
        this.next = z7 ? i8 : i9;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.f0
    public int nextInt() {
        int i8 = this.next;
        if (i8 != this.finalElement) {
            this.next = this.step + i8;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return i8;
    }
}
