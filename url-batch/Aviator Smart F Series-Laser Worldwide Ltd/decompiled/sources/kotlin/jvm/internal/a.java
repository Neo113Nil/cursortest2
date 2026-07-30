package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class a extends kotlin.collections.m {
    private final boolean[] array;
    private int index;

    public a(boolean[] array) {
        s.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.m
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return zArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
