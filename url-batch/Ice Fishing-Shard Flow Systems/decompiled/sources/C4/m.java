package C4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f315a;

    public m(byte[] bArr) {
        this.f315a = bArr;
    }

    @Override // C4.j
    public final String a() {
        Base64.Encoder encoder;
        String encodeToString;
        encoder = Base64.getEncoder();
        encodeToString = encoder.encodeToString(this.f315a);
        return encodeToString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return Arrays.equals(this.f315a, ((m) obj).f315a);
        }
        return false;
    }

    @Override // C4.j
    public final int getType() {
        return 7;
    }

    @Override // C4.j
    public final Object getValue() {
        return ByteBuffer.wrap(this.f315a).asReadOnlyBuffer();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f315a);
    }

    public final String toString() {
        return "ValueBytes{" + a() + "}";
    }
}
