package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ces {
    public final String a;
    public final byte[] b;
    public final ccn c;

    public ces(String str, byte[] bArr, ccn ccnVar) {
        this.a = str;
        this.b = bArr;
        this.c = ccnVar;
    }

    public static iyh c() {
        iyh iyhVar = new iyh();
        iyhVar.l(ccn.a);
        return iyhVar;
    }

    public final ces a(ccn ccnVar) {
        iyh c = c();
        c.k(this.a);
        c.l(ccnVar);
        c.b = this.b;
        return c.j();
    }

    public final boolean b() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ces) {
            ces cesVar = (ces) obj;
            if (this.a.equals(cesVar.a)) {
                if (Arrays.equals(this.b, cesVar instanceof ces ? cesVar.b : cesVar.b) && this.c.equals(cesVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
        return this.c.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        String str = this.a;
        ccn ccnVar = this.c;
        byte[] bArr = this.b;
        return String.format("TransportContext(%s, %s, %s)", str, ccnVar, bArr == null ? "" : Base64.encodeToString(bArr, 2));
    }

    public ces() {
        throw null;
    }
}
