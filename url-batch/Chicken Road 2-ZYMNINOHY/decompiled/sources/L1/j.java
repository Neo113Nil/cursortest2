package L1;

import E.AbstractC0005f;
import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f1645a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1646b;

    /* renamed from: c, reason: collision with root package name */
    public final I1.c f1647c;

    public j(String str, byte[] bArr, I1.c cVar) {
        this.f1645a = str;
        this.f1646b = bArr;
        this.f1647c = cVar;
    }

    public static B1.j a() {
        B1.j jVar = new B1.j(3, false);
        jVar.f203d = I1.c.f1126a;
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f1645a.equals(jVar.f1645a) && Arrays.equals(this.f1646b, jVar.f1646b) && this.f1647c.equals(jVar.f1647c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1645a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1646b)) * 1000003) ^ this.f1647c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f1646b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f1645a);
        sb.append(", ");
        sb.append(this.f1647c);
        sb.append(", ");
        return AbstractC0005f.q(sb, encodeToString, ")");
    }
}
