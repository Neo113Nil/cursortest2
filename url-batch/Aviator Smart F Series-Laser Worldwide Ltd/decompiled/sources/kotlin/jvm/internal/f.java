package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.f0;

/* loaded from: classes4.dex */
final class f extends f0 {
    private final int[] array;
    private int index;

    public f(int[] array) {
        s.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.f0
    public int nextInt() {
        try {
            int[] iArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return iArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
