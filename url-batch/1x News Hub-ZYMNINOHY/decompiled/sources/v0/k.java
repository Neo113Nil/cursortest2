package v0;

import java.util.Arrays;
import s0.C1185b;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final C1185b f10562a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10563b;

    public k(C1185b c1185b, byte[] bArr) {
        if (c1185b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f10562a = c1185b;
        this.f10563b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f10562a.equals(kVar.f10562a)) {
            return Arrays.equals(this.f10563b, kVar.f10563b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10562a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10563b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f10562a + ", bytes=[...]}";
    }
}
