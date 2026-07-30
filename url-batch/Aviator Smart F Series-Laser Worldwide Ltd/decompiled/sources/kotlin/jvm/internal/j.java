package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.g0;

/* loaded from: classes4.dex */
final class j extends g0 {
    private final long[] array;
    private int index;

    public j(long[] array) {
        s.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.g0
    public long nextLong() {
        try {
            long[] jArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return jArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
