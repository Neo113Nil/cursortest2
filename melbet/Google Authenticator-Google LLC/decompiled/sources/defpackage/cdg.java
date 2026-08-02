package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdg extends cdq {
    private final cdp a;
    private final cct b;

    public cdg(cdp cdpVar, cct cctVar) {
        this.a = cdpVar;
        this.b = cctVar;
    }

    @Override // defpackage.cdq
    public final cct a() {
        return this.b;
    }

    @Override // defpackage.cdq
    public final cdp b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdq) {
            cdq cdqVar = (cdq) obj;
            cdp cdpVar = this.a;
            if (cdpVar != null ? cdpVar.equals(cdqVar.b()) : cdqVar.b() == null) {
                if (this.b.equals(cdqVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cdp cdpVar = this.a;
        return this.b.hashCode() ^ (((cdpVar == null ? 0 : cdpVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        cct cctVar = this.b;
        return "ClientInfo{clientType=" + String.valueOf(this.a) + ", androidClientInfo=" + cctVar.toString() + "}";
    }
}
