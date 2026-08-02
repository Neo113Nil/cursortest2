package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsf {
    public final Context a;
    public final dsg b;
    public final dov c;
    public final drz d;
    public final ebv e;
    public final efc f;
    public final ebr g;
    public final gzp h;
    public final dpd i;
    public final ExecutorService j;
    public final efu k;
    public final gzp l;
    public final gzp m;
    public final fwm n;
    private final dpd o;
    private final dme p;

    public dsf(Context context, dsg dsgVar, dov dovVar, drz drzVar, ebv ebvVar, efc efcVar, ebr ebrVar, gzp gzpVar, dpd dpdVar, dpd dpdVar2, ExecutorService executorService, dme dmeVar, efu efuVar, fwm fwmVar, gzp gzpVar2, gzp gzpVar3) {
        this.a = context;
        this.b = dsgVar;
        this.c = dovVar;
        this.d = drzVar;
        this.e = ebvVar;
        this.f = efcVar;
        this.g = ebrVar;
        this.h = gzpVar;
        this.o = dpdVar;
        this.i = dpdVar2;
        this.j = executorService;
        this.p = dmeVar;
        this.k = efuVar;
        this.n = fwmVar;
        this.l = gzpVar2;
        this.m = gzpVar3;
    }

    public final boolean equals(Object obj) {
        dpd dpdVar;
        fwm fwmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsf) {
            dsf dsfVar = (dsf) obj;
            if (this.a.equals(dsfVar.a) && this.b.equals(dsfVar.b) && this.c.equals(dsfVar.c) && this.d.equals(dsfVar.d) && this.e.equals(dsfVar.e) && this.f.equals(dsfVar.f) && this.g.equals(dsfVar.g) && this.h.equals(dsfVar.h) && ((dpdVar = this.o) != null ? dpdVar.equals(dsfVar.o) : dsfVar.o == null) && this.i.equals(dsfVar.i) && this.j.equals(dsfVar.j) && this.p.equals(dsfVar.p) && this.k.equals(dsfVar.k) && ((fwmVar = this.n) != null ? fwmVar.equals(dsfVar.n) : dsfVar.n == null) && this.l.equals(dsfVar.l) && this.m.equals(dsfVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * (-721379959)) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
        dpd dpdVar = this.o;
        int hashCode2 = ((((((((((((hashCode * 1000003) ^ 2040732332) * 1000003) ^ (dpdVar == null ? 0 : dpdVar.hashCode())) * 1000003) ^ this.i.hashCode()) * (-721379959)) ^ this.j.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        fwm fwmVar = this.n;
        return ((((hashCode2 ^ (fwmVar != null ? fwmVar.hashCode() : 0)) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        gzp gzpVar = this.m;
        gzp gzpVar2 = this.l;
        fwm fwmVar = this.n;
        efu efuVar = this.k;
        dme dmeVar = this.p;
        ExecutorService executorService = this.j;
        dpd dpdVar = this.i;
        dpd dpdVar2 = this.o;
        gzp gzpVar3 = this.h;
        ebr ebrVar = this.g;
        efc efcVar = this.f;
        ebv ebvVar = this.e;
        drz drzVar = this.d;
        dov dovVar = this.c;
        dsg dsgVar = this.b;
        return "AccountMenuManager{applicationContext=" + String.valueOf(this.a) + ", accountsModel=" + String.valueOf(dsgVar) + ", accountConverter=" + String.valueOf(dovVar) + ", clickListeners=" + String.valueOf(drzVar) + ", features=" + String.valueOf(ebvVar) + ", avatarRetriever=null, oneGoogleEventLogger=" + String.valueOf(efcVar) + ", configuration=" + String.valueOf(ebrVar) + ", incognitoModel=" + String.valueOf(gzpVar3) + ", customAvatarImageLoader=" + String.valueOf(dpdVar2) + ", avatarImageLoader=" + String.valueOf(dpdVar) + ", accountClass=null, backgroundExecutor=" + String.valueOf(executorService) + ", vePrimitives=" + String.valueOf(dmeVar) + ", visualElements=" + String.valueOf(efuVar) + ", oneGoogleStreamz=" + String.valueOf(fwmVar) + ", appIdentifier=" + String.valueOf(gzpVar2) + ", veAuthSideChannelGetter=" + String.valueOf(gzpVar) + "}";
    }

    public dsf() {
        throw null;
    }
}
