package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eed {
    public final drb a;
    public final dpd b;
    public final efc c;
    public final efu d;
    public final ede e;
    public final gwh f;
    private final ExecutorService g;
    private final dme h;
    private final gzp i;

    public eed(gwh gwhVar, drb drbVar, ExecutorService executorService, dpd dpdVar, efc efcVar, dme dmeVar, efu efuVar, ede edeVar, gzp gzpVar) {
        this.f = gwhVar;
        this.a = drbVar;
        this.g = executorService;
        this.b = dpdVar;
        this.c = efcVar;
        this.h = dmeVar;
        this.d = efuVar;
        this.e = edeVar;
        this.i = gzpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eed) {
            eed eedVar = (eed) obj;
            if (this.f.equals(eedVar.f) && this.a.equals(eedVar.a) && this.g.equals(eedVar.g) && this.b.equals(eedVar.b) && this.c.equals(eedVar.c) && this.h.equals(eedVar.h) && this.d.equals(eedVar.d) && this.e.equals(eedVar.e) && this.i.equals(eedVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.d.hashCode();
        return ((this.e.hashCode() ^ (hashCode * 1000003)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        gzp gzpVar = this.i;
        ede edeVar = this.e;
        efu efuVar = this.d;
        dme dmeVar = this.h;
        efc efcVar = this.c;
        dpd dpdVar = this.b;
        ExecutorService executorService = this.g;
        drb drbVar = this.a;
        return "ExpressSignInManager{limitedAvailableAccountsModel=" + String.valueOf(this.f) + ", internalAccountsModel=" + String.valueOf(drbVar) + ", backgroundExecutor=" + String.valueOf(executorService) + ", avatarImageLoader=" + String.valueOf(dpdVar) + ", oneGoogleEventLogger=" + String.valueOf(efcVar) + ", vePrimitives=" + String.valueOf(dmeVar) + ", visualElements=" + String.valueOf(efuVar) + ", accountLayer=" + String.valueOf(edeVar) + ", appIdentifier=" + String.valueOf(gzpVar) + "}";
    }

    public eed() {
        throw null;
    }
}
