package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.UIntArray;

/* loaded from: classes9.dex */
public final class UIntArrayBuilder extends PrimitiveArrayBuilder {
    public int[] buffer;
    public int position;

    public UIntArrayBuilder(int[] iArr) {
        this.buffer = iArr;
        this.position = iArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    /* renamed from: append-WZ4Q5Ns$kotlinx_serialization_core, reason: not valid java name */
    public final void m4207appendWZ4Q5Ns$kotlinx_serialization_core(int i) {
        ensureCapacity$kotlinx_serialization_core(getPosition$kotlinx_serialization_core() + 1);
        int[] iArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        iArr[i2] = i;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object build$kotlinx_serialization_core() {
        return new UIntArray(Arrays.copyOf(this.buffer, this.position));
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int i) {
        int[] iArr = this.buffer;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.buffer = Arrays.copyOf(iArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
