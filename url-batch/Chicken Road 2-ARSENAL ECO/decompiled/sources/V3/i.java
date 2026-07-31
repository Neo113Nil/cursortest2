package V3;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2721a;

    public i(byte[] bArr) {
        this.f2721a = bArr;
    }

    @Override // V3.g
    public final int a() {
        return 7;
    }

    @Override // V3.g
    public final String b() {
        Base64.Encoder encoder;
        String encodeToString;
        encoder = Base64.getEncoder();
        encodeToString = encoder.encodeToString(this.f2721a);
        return encodeToString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return Arrays.equals(this.f2721a, ((i) obj).f2721a);
        }
        return false;
    }

    @Override // V3.g
    public final Object getValue() {
        return ByteBuffer.wrap(this.f2721a).asReadOnlyBuffer();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2721a);
    }

    public final String toString() {
        return "ValueBytes{" + b() + "}";
    }
}
