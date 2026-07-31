package D0;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f342a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f343b;

    /* renamed from: c, reason: collision with root package name */
    public final A0.d f344c;

    public j(String str, byte[] bArr, A0.d dVar) {
        this.f342a = str;
        this.f343b = bArr;
        this.f344c = dVar;
    }

    public static B0.c a() {
        B0.c cVar = new B0.c(1, false);
        cVar.f73i = A0.d.f43f;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f342a.equals(jVar.f342a) && Arrays.equals(this.f343b, jVar.f343b) && this.f344c.equals(jVar.f344c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f342a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f343b)) * 1000003) ^ this.f344c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f343b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f342a);
        sb.append(", ");
        sb.append(this.f344c);
        sb.append(", ");
        return N.p.b(sb, encodeToString, ")");
    }
}
