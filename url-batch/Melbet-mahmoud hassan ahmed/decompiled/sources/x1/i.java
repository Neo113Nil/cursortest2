package x1;

import android.net.Uri;
import o2.k0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f23136a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23137b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23138c;

    /* renamed from: d, reason: collision with root package name */
    private int f23139d;

    public i(String str, long j7, long j8) {
        this.f23138c = str == null ? "" : str;
        this.f23136a = j7;
        this.f23137b = j8;
    }

    public i a(i iVar, String str) {
        String c7 = c(str);
        if (iVar != null && c7.equals(iVar.c(str))) {
            long j7 = this.f23137b;
            if (j7 != -1) {
                long j8 = this.f23136a;
                if (j8 + j7 == iVar.f23136a) {
                    long j9 = iVar.f23137b;
                    return new i(c7, j8, j9 != -1 ? j7 + j9 : -1L);
                }
            }
            long j10 = iVar.f23137b;
            if (j10 != -1) {
                long j11 = iVar.f23136a;
                if (j11 + j10 == this.f23136a) {
                    return new i(c7, j11, j7 != -1 ? j10 + j7 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return k0.e(str, this.f23138c);
    }

    public String c(String str) {
        return k0.d(str, this.f23138c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f23136a == iVar.f23136a && this.f23137b == iVar.f23137b && this.f23138c.equals(iVar.f23138c);
    }

    public int hashCode() {
        if (this.f23139d == 0) {
            this.f23139d = ((((527 + ((int) this.f23136a)) * 31) + ((int) this.f23137b)) * 31) + this.f23138c.hashCode();
        }
        return this.f23139d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f23138c + ", start=" + this.f23136a + ", length=" + this.f23137b + ")";
    }
}
