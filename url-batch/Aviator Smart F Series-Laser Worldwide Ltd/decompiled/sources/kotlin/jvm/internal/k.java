package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.z0;

/* loaded from: classes4.dex */
final class k extends z0 {
    private final short[] array;
    private int index;

    public k(short[] array) {
        s.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.z0
    public short nextShort() {
        try {
            short[] sArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return sArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
