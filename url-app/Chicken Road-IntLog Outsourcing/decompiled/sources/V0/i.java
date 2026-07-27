package V0;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3208a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3209b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.d f3210c;

    public i(String str, byte[] bArr, S0.d dVar) {
        this.f3208a = str;
        this.f3209b = bArr;
        this.f3210c = dVar;
    }

    public static B4.i a() {
        B4.i iVar = new B4.i(10, false);
        iVar.f313d = S0.d.f2741a;
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3208a.equals(iVar.f3208a) && Arrays.equals(this.f3209b, iVar.f3209b) && this.f3210c.equals(iVar.f3210c);
    }

    public final int hashCode() {
        return ((((this.f3208a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3209b)) * 1000003) ^ this.f3210c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f3209b;
        return "TransportContext(" + this.f3208a + ", " + this.f3210c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
