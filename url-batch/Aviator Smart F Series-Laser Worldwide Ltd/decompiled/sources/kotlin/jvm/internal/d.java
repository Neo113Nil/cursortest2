package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class d extends kotlin.collections.y {
    private final double[] array;
    private int index;

    public d(double[] array) {
        s.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.y
    public double nextDouble() {
        try {
            double[] dArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return dArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
