package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class LongArrayBuilder extends PrimitiveArrayBuilder {
    public long[] buffer;
    public int position;

    public LongArrayBuilder(long[] jArr) {
        jArr.getClass();
        this.buffer = jArr;
        this.position = jArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(long j) {
        ensureCapacity$kotlinx_serialization_core(getPosition$kotlinx_serialization_core() + 1);
        long[] jArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        jArr[i] = j;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object build$kotlinx_serialization_core() {
        return Arrays.copyOf(this.buffer, this.position);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int i) {
        long[] jArr = this.buffer;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.buffer = Arrays.copyOf(jArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
