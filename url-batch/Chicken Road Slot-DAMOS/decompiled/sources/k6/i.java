package k6;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f5464a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5465b;

    /* renamed from: c, reason: collision with root package name */
    public final h6.d f5466c;

    public i(String str, byte[] bArr, h6.d dVar) {
        this.f5464a = str;
        this.f5465b = bArr;
        this.f5466c = dVar;
    }

    public static a1.n a() {
        a1.n nVar = new a1.n(20, false);
        nVar.f42r = h6.d.f4479d;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f5464a.equals(iVar.f5464a) && Arrays.equals(this.f5465b, iVar.f5465b) && this.f5466c.equals(iVar.f5466c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5464a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5465b)) * 1000003) ^ this.f5466c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f5465b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f5464a);
        sb2.append(", ");
        sb2.append(this.f5466c);
        sb2.append(", ");
        return v4.a.o(sb2, encodeToString, ")");
    }
}
