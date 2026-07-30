package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class b extends kotlin.collections.n {
    private final byte[] array;
    private int index;

    public b(byte[] array) {
        s.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.n
    public byte nextByte() {
        try {
            byte[] bArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return bArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
