package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.UByteArray;

/* loaded from: classes9.dex */
public final class UByteArrayBuilder extends PrimitiveArrayBuilder {
    public byte[] buffer;
    public int position;

    public UByteArrayBuilder(byte[] bArr) {
        this.buffer = bArr;
        this.position = bArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    /* renamed from: append-7apg3OU$kotlinx_serialization_core, reason: not valid java name */
    public final void m4206append7apg3OU$kotlinx_serialization_core(byte b) {
        ensureCapacity$kotlinx_serialization_core(getPosition$kotlinx_serialization_core() + 1);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object build$kotlinx_serialization_core() {
        return new UByteArray(Arrays.copyOf(this.buffer, this.position));
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int i) {
        byte[] bArr = this.buffer;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.buffer = Arrays.copyOf(bArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final int getPosition$kotlinx_serialization_core() {
        return this.position;
    }
}
