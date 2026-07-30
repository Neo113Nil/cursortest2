package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class c extends kotlin.collections.o {
    private final char[] array;
    private int index;

    public c(char[] array) {
        s.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.o
    public char nextChar() {
        try {
            char[] cArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return cArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
