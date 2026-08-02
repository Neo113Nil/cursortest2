package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.UShortArray;

/* loaded from: classes9.dex */
public final class UShortArrayBuilder extends PrimitiveArrayBuilder {
    public short[] buffer;
    public int position;

    public UShortArrayBuilder(short[] sArr) {
        this.buffer = sArr;
        this.position = sArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    /* renamed from: append-xj2QHRw$kotlinx_serialization_core, reason: not valid java name */
    public final void m4209appendxj2QHRw$kotlinx_serialization_core(short s) {
        ensureCapacity$kotlinx_serialization_core(getPosition$kotlinx_serialization_core() + 1);
        short[] sArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        sArr[i] = s;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object build$kotlinx_serialization_core() {
        return new UShortArray(Arrays.copyOf(this.buffer, this.position));
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int i) {
        short[] sArr = this.buffer;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.buffer = Arrays.copyOf(sArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
