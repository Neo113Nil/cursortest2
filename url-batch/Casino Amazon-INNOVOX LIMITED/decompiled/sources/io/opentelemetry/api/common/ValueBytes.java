package io.opentelemetry.api.common;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;

/* loaded from: classes3.dex */
final class ValueBytes implements Value<ByteBuffer> {
    private final byte[] raw;

    private ValueBytes(byte[] bArr) {
        this.raw = bArr;
    }

    static Value<ByteBuffer> create(byte[] bArr) {
        Objects.requireNonNull(bArr, "value must not be null");
        return new ValueBytes(Arrays.copyOf(bArr, bArr.length));
    }

    @Override // io.opentelemetry.api.common.Value
    public ValueType getType() {
        return ValueType.BYTES;
    }

    @Override // io.opentelemetry.api.common.Value
    public ByteBuffer getValue() {
        return ByteBuffer.wrap(this.raw).asReadOnlyBuffer();
    }

    @Override // io.opentelemetry.api.common.Value
    public String asString() {
        return Base64.getEncoder().encodeToString(this.raw);
    }

    public String toString() {
        return "ValueBytes{" + asString() + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValueBytes) && Arrays.equals(this.raw, ((ValueBytes) obj).raw);
    }

    public int hashCode() {
        return Arrays.hashCode(this.raw);
    }
}
