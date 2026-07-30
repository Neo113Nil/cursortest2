package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cc {
    public final String a;
    public final byte[] b;
    public final dz0 c;

    public cc(String str, byte[] bArr, dz0 dz0Var) {
        this.a = str;
        this.b = bArr;
        this.c = dz0Var;
    }

    public static i8 a() {
        i8 i8Var = new i8(3, false);
        i8Var.h = dz0.d;
        return i8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cc) {
            cc ccVar = (cc) obj;
            if (this.a.equals(ccVar.a) && Arrays.equals(this.b, ccVar.b) && this.c.equals(ccVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        return "TransportContext(" + this.a + ", " + this.c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
