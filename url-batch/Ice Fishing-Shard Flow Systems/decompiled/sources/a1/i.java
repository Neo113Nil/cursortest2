package a1;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3067a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3068b;

    /* renamed from: c, reason: collision with root package name */
    public final X0.d f3069c;

    public i(String str, byte[] bArr, X0.d dVar) {
        this.f3067a = str;
        this.f3068b = bArr;
        this.f3069c = dVar;
    }

    public static D0.j a() {
        D0.j jVar = new D0.j(8, false);
        jVar.f332l = X0.d.f2851d;
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f3067a.equals(iVar.f3067a) && Arrays.equals(this.f3068b, iVar.f3068b) && this.f3069c.equals(iVar.f3069c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3067a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3068b)) * 1000003) ^ this.f3069c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f3068b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f3067a);
        sb.append(", ");
        sb.append(this.f3069c);
        sb.append(", ");
        return r4.f.f(sb, encodeToString, ")");
    }
}
