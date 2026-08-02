package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cex {
    public final Iterable a;
    public final byte[] b;

    public cex(Iterable iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cex) {
            cex cexVar = (cex) obj;
            if (this.a.equals(cexVar.a)) {
                boolean z = cexVar instanceof cex;
                if (Arrays.equals(this.b, cexVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return Arrays.hashCode(this.b) ^ (hashCode * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        return "BackendRequest{events=" + String.valueOf(this.a) + ", extras=" + Arrays.toString(bArr) + "}";
    }

    public cex() {
        throw null;
    }
}
