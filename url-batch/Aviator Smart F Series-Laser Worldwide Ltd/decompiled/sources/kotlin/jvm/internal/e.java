package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.a0;

/* loaded from: classes4.dex */
final class e extends a0 {
    private final float[] array;
    private int index;

    public e(float[] array) {
        s.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.a0
    public float nextFloat() {
        try {
            float[] fArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return fArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
