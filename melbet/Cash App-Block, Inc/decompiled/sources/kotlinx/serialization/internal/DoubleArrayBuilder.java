package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class DoubleArrayBuilder extends PrimitiveArrayBuilder {
    public double[] buffer;
    public int position;

    public DoubleArrayBuilder(double[] dArr) {
        dArr.getClass();
        this.buffer = dArr;
        this.position = dArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(double d) {
        ensureCapacity$kotlinx_serialization_core(getPosition$kotlinx_serialization_core() + 1);
        double[] dArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        dArr[i] = d;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object build$kotlinx_serialization_core() {
        return Arrays.copyOf(this.buffer, this.position);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int i) {
        double[] dArr = this.buffer;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.buffer = Arrays.copyOf(dArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
