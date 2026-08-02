package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdl extends cdx {
    private final long a;
    private final Integer b;
    private final cds c;
    private final long d;
    private final byte[] e;
    private final String f;
    private final long g;
    private final cec h;
    private final cdt i;

    public cdl(long j, Integer num, cds cdsVar, long j2, byte[] bArr, String str, long j3, cec cecVar, cdt cdtVar) {
        this.a = j;
        this.b = num;
        this.c = cdsVar;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = cecVar;
        this.i = cdtVar;
    }

    @Override // defpackage.cdx
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cdx
    public final long b() {
        return this.d;
    }

    @Override // defpackage.cdx
    public final long c() {
        return this.g;
    }

    @Override // defpackage.cdx
    public final cds d() {
        return this.c;
    }

    @Override // defpackage.cdx
    public final cdt e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        Integer num;
        cds cdsVar;
        String str;
        cec cecVar;
        cdt cdtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdx) {
            cdx cdxVar = (cdx) obj;
            if (this.a == cdxVar.a() && ((num = this.b) != null ? num.equals(cdxVar.g()) : cdxVar.g() == null) && ((cdsVar = this.c) != null ? cdsVar.equals(cdxVar.d()) : cdxVar.d() == null) && this.d == cdxVar.b()) {
                if (Arrays.equals(this.e, cdxVar instanceof cdl ? ((cdl) cdxVar).e : cdxVar.i()) && ((str = this.f) != null ? str.equals(cdxVar.h()) : cdxVar.h() == null) && this.g == cdxVar.c() && ((cecVar = this.h) != null ? cecVar.equals(cdxVar.f()) : cdxVar.f() == null) && ((cdtVar = this.i) != null ? cdtVar.equals(cdxVar.e()) : cdxVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cdx
    public final cec f() {
        return this.h;
    }

    @Override // defpackage.cdx
    public final Integer g() {
        return this.b;
    }

    @Override // defpackage.cdx
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j = this.a;
        cds cdsVar = this.c;
        int hashCode2 = cdsVar == null ? 0 : cdsVar.hashCode();
        long j2 = this.d;
        int hashCode3 = ((((((hashCode ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e);
        String str = this.f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.g;
        int i = ((((hashCode3 * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        cec cecVar = this.h;
        int hashCode5 = (i ^ (cecVar == null ? 0 : cecVar.hashCode())) * 1000003;
        cdt cdtVar = this.i;
        return hashCode5 ^ (cdtVar != null ? cdtVar.hashCode() : 0);
    }

    @Override // defpackage.cdx
    public final byte[] i() {
        return this.e;
    }

    public final String toString() {
        cdt cdtVar = this.i;
        cec cecVar = this.h;
        byte[] bArr = this.e;
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + String.valueOf(this.c) + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(bArr) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + String.valueOf(cecVar) + ", experimentIds=" + String.valueOf(cdtVar) + "}";
    }
}
