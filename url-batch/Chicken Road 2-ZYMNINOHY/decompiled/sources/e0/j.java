package e0;

import E.AbstractC0005f;
import W.AbstractC0108a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f8387a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8388b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8389c;

    /* renamed from: d, reason: collision with root package name */
    public int f8390d;

    public j(long j4, long j5, String str) {
        this.f8389c = str == null ? "" : str;
        this.f8387a = j4;
        this.f8388b = j5;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j4;
        String p2 = AbstractC0108a.p(str, this.f8389c);
        if (jVar != null) {
            long j5 = jVar.f8388b;
            if (p2.equals(AbstractC0108a.p(str, jVar.f8389c))) {
                long j6 = this.f8388b;
                if (j6 != -1) {
                    j4 = j5;
                    long j7 = this.f8387a;
                    jVar2 = null;
                    if (j7 + j6 == jVar.f8387a) {
                        return new j(j7, j4 != -1 ? j6 + j4 : -1L, p2);
                    }
                } else {
                    jVar2 = null;
                    j4 = j5;
                }
                if (j4 == -1) {
                    return jVar2;
                }
                long j8 = jVar.f8387a;
                if (j8 + j4 == this.f8387a) {
                    return new j(j8, j6 != -1 ? j4 + j6 : -1L, p2);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f8387a == jVar.f8387a && this.f8388b == jVar.f8388b && this.f8389c.equals(jVar.f8389c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8390d == 0) {
            this.f8390d = this.f8389c.hashCode() + ((((527 + ((int) this.f8387a)) * 31) + ((int) this.f8388b)) * 31);
        }
        return this.f8390d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f8389c);
        sb.append(", start=");
        sb.append(this.f8387a);
        sb.append(", length=");
        return AbstractC0005f.p(sb, this.f8388b, ")");
    }
}
