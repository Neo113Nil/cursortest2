package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class FloatArrayBuilder extends PrimitiveArrayBuilder {
    public float[] buffer;
    public int position;

    public FloatArrayBuilder(float[] fArr) {
        fArr.getClass();
        this.buffer = fArr;
        this.position = fArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(float f) {
        ensureCapacity$kotlinx_serialization_core(getPosition$kotlinx_serialization_core() + 1);
        float[] fArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        fArr[i] = f;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object build$kotlinx_serialization_core() {
        return Arrays.copyOf(this.buffer, this.position);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int i) {
        float[] fArr = this.buffer;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.buffer = Arrays.copyOf(fArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
