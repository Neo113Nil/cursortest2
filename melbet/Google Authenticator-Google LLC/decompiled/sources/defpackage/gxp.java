package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxp {
    public final eik a;
    public final lew b;
    public final lfs c;
    public final eoc d;
    private final long e;
    private final long f;
    private final boolean g;
    private final lha h;

    public gxp(eik eikVar, lew lewVar, long j, long j2, boolean z, lfs lfsVar, lha lhaVar, eoc eocVar) {
        this.a = eikVar;
        this.b = lewVar;
        this.e = j;
        this.f = j2;
        this.g = z;
        if (lfsVar == null) {
            throw new NullPointerException("Null trace");
        }
        this.c = lfsVar;
        if (lhaVar == null) {
            throw new NullPointerException("Null traceMetadata");
        }
        this.h = lhaVar;
        this.d = eocVar;
    }

    public final boolean equals(Object obj) {
        lew lewVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxp) {
            gxp gxpVar = (gxp) obj;
            if (this.a.equals(gxpVar.a) && ((lewVar = this.b) != null ? lewVar.equals(gxpVar.b) : gxpVar.b == null) && this.e == gxpVar.e && this.f == gxpVar.f && this.g == gxpVar.g && this.c.equals(gxpVar.c) && this.h.equals(gxpVar.h)) {
                if (this.d != null) {
                    eoc eocVar = gxpVar.d;
                    throw null;
                }
                if (gxpVar.d == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        lew lewVar = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (lewVar == null ? 0 : lewVar.hashCode())) * 1000003;
        long j = this.e;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int hashCode3 = (((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        if (this.d == null) {
            return hashCode3;
        }
        throw null;
    }

    public final String toString() {
        return "TraceData{eventName=" + this.a.a + ", metricExtension=" + String.valueOf(this.b) + ", startTime=" + this.e + ", endTime=" + this.f + ", empty=" + this.g + ", trace=" + this.c.toString() + ", traceMetadata=" + this.h.toString() + ", activeCuiId=" + String.valueOf(this.d) + "}";
    }

    public gxp() {
        throw null;
    }
}
