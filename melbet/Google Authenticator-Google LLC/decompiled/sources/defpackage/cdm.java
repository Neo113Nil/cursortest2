package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdm extends cdy {
    private final long a;
    private final long b;
    private final cdq c;
    private final Integer d;
    private final String e;
    private final List f;
    private final ced g;

    public cdm(long j, long j2, cdq cdqVar, Integer num, String str, List list, ced cedVar) {
        this.a = j;
        this.b = j2;
        this.c = cdqVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = cedVar;
    }

    @Override // defpackage.cdy
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cdy
    public final long b() {
        return this.b;
    }

    @Override // defpackage.cdy
    public final cdq c() {
        return this.c;
    }

    @Override // defpackage.cdy
    public final ced d() {
        return this.g;
    }

    @Override // defpackage.cdy
    public final Integer e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        ced cedVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdy) {
            cdy cdyVar = (cdy) obj;
            if (this.a == cdyVar.a() && this.b == cdyVar.b() && this.c.equals(cdyVar.c()) && ((num = this.d) != null ? num.equals(cdyVar.e()) : cdyVar.e() == null) && ((str = this.e) != null ? str.equals(cdyVar.f()) : cdyVar.f() == null) && this.f.equals(cdyVar.g()) && ((cedVar = this.g) != null ? cedVar.equals(cdyVar.d()) : cdyVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cdy
    public final String f() {
        return this.e;
    }

    @Override // defpackage.cdy
    public final List g() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        int hashCode = ((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode();
        Integer num = this.d;
        int hashCode2 = ((hashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        ced cedVar = this.g;
        return hashCode3 ^ (cedVar != null ? cedVar.hashCode() : 0);
    }

    public final String toString() {
        ced cedVar = this.g;
        List list = this.f;
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c.toString() + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + list.toString() + ", qosTier=" + String.valueOf(cedVar) + "}";
    }
}
