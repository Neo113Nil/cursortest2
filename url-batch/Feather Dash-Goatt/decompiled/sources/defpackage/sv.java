package defpackage;

import com.appsflyer.internal.l;
import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sv {
    public final vv a;
    public final byte[] b;

    public sv(vv vvVar, byte[] bArr) {
        if (vvVar == null) {
            l.b("encoding is null");
            throw null;
        }
        if (bArr == null) {
            l.b("bytes is null");
            throw null;
        }
        this.a = vvVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv)) {
            return false;
        }
        sv svVar = (sv) obj;
        if (this.a.equals(svVar.a)) {
            return Arrays.equals(this.b, svVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
