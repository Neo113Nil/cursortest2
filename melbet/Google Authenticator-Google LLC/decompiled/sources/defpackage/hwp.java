package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwp extends hnu {
    private final int a;
    private final int b = 32;
    private final int c = 16;
    private final int d;
    private final hwo e;
    private final hwn f;

    public hwp(int i, int i2, hwo hwoVar, hwn hwnVar) {
        this.a = i;
        this.d = i2;
        this.e = hwoVar;
        this.f = hwnVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hwp)) {
            return false;
        }
        hwp hwpVar = (hwp) obj;
        if (hwpVar.a == this.a) {
            int i = hwpVar.b;
            int i2 = hwpVar.c;
            if (hwpVar.d == this.d && hwpVar.e == this.e && hwpVar.f == this.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(hwp.class, Integer.valueOf(this.a), 32, 16, Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        hwn hwnVar = this.f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.e) + ", hashType: " + String.valueOf(hwnVar) + ", 16-byte IV, and " + this.d + "-byte tags, and " + this.a + "-byte AES key, and 32-byte HMAC key)";
    }
}
