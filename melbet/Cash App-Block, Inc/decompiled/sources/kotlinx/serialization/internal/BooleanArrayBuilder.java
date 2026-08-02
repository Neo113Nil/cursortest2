package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class BooleanArrayBuilder extends PrimitiveArrayBuilder {
    public boolean[] buffer;
    public int position;

    public BooleanArrayBuilder(boolean[] zArr) {
        zArr.getClass();
        this.buffer = zArr;
        this.position = zArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(boolean z) {
        ensureCapacity$kotlinx_serialization_core(getPosition$kotlinx_serialization_core() + 1);
        boolean[] zArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        zArr[i] = z;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object build$kotlinx_serialization_core() {
        return Arrays.copyOf(this.buffer, this.position);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int i) {
        boolean[] zArr = this.buffer;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.buffer = Arrays.copyOf(zArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
