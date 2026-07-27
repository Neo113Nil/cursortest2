package Q2;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2490a;

    public i(byte[] bArr) {
        this.f2490a = bArr;
    }

    @Override // Q2.g
    public final String a() {
        Base64.Encoder encoder;
        String encodeToString;
        encoder = Base64.getEncoder();
        encodeToString = encoder.encodeToString(this.f2490a);
        return encodeToString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            if (Arrays.equals(this.f2490a, ((i) obj).f2490a)) {
                return true;
            }
        }
        return false;
    }

    @Override // Q2.g
    public final int getType() {
        return 7;
    }

    @Override // Q2.g
    public final Object getValue() {
        return ByteBuffer.wrap(this.f2490a).asReadOnlyBuffer();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2490a);
    }

    public final String toString() {
        return "ValueBytes{" + a() + "}";
    }
}
