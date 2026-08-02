package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebv {
    public final gzp a;
    public final gzp b;
    public final gzp c;
    public final gzp d;
    public final gzp e;
    public final eca f;
    public final gzp g;
    public final gzp h;
    public final hel i;
    public final ebz j;
    public final gzp k;
    public final gzp l;
    public final gzp m;
    public final eck n;
    public final boolean o;
    public final Runnable p;
    public final int q;
    public final dja r;

    public ebv(gzp gzpVar, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4, dja djaVar, gzp gzpVar5, eca ecaVar, gzp gzpVar6, gzp gzpVar7, hel helVar, ebz ebzVar, gzp gzpVar8, gzp gzpVar9, gzp gzpVar10, eck eckVar, boolean z, Runnable runnable) {
        this.a = gzpVar;
        this.b = gzpVar2;
        this.c = gzpVar3;
        this.d = gzpVar4;
        this.r = djaVar;
        this.e = gzpVar5;
        this.f = ecaVar;
        this.g = gzpVar6;
        this.h = gzpVar7;
        this.i = helVar;
        this.j = ebzVar;
        this.k = gzpVar8;
        this.l = gzpVar9;
        this.m = gzpVar10;
        this.q = 1;
        this.n = eckVar;
        this.o = z;
        this.p = runnable;
    }

    public static ebu a() {
        ebu ebuVar = new ebu();
        ebuVar.l = new dja(null);
        int i = hel.d;
        hel helVar = his.a;
        if (helVar == null) {
            throw new NullPointerException("Null commonActions");
        }
        ebuVar.f = helVar;
        ebuVar.j = (byte) (ebuVar.j | 1);
        ebuVar.b(false);
        ebuVar.k = 1;
        ebuVar.g = ebz.a;
        ebuVar.c = new eca(gyf.a);
        ebuVar.i = new cov(4);
        ebuVar.h = new eck();
        return ebuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebv) {
            ebv ebvVar = (ebv) obj;
            if (this.a.equals(ebvVar.a) && this.b.equals(ebvVar.b) && this.c.equals(ebvVar.c) && this.d.equals(ebvVar.d) && this.r.equals(ebvVar.r) && this.e.equals(ebvVar.e) && this.f.equals(ebvVar.f) && this.g.equals(ebvVar.g) && this.h.equals(ebvVar.h) && hnu.H(this.i, ebvVar.i) && this.j.equals(ebvVar.j) && this.k.equals(ebvVar.k) && this.l.equals(ebvVar.l) && this.m.equals(ebvVar.m)) {
                int i = this.q;
                int i2 = ebvVar.q;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.n.equals(ebvVar.n) && this.o == ebvVar.o && this.p.equals(ebvVar.p)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((this.d.hashCode() ^ (-2127709203)) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2041338095) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
        a.D(this.q);
        return this.p.hashCode() ^ (((((((((((((((hashCode * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (true == this.o ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        int i = this.q;
        gzp gzpVar = this.m;
        gzp gzpVar2 = this.l;
        gzp gzpVar3 = this.k;
        ebz ebzVar = this.j;
        hel helVar = this.i;
        gzp gzpVar4 = this.h;
        gzp gzpVar5 = this.g;
        eca ecaVar = this.f;
        gzp gzpVar6 = this.e;
        dja djaVar = this.r;
        gzp gzpVar7 = this.d;
        gzp gzpVar8 = this.c;
        gzp gzpVar9 = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(gzpVar9);
        String valueOf3 = String.valueOf(gzpVar8);
        String valueOf4 = String.valueOf(gzpVar7);
        String valueOf5 = String.valueOf(djaVar);
        String valueOf6 = String.valueOf(gzpVar6);
        String valueOf7 = String.valueOf(ecaVar);
        String valueOf8 = String.valueOf(gzpVar5);
        String valueOf9 = String.valueOf(gzpVar4);
        String valueOf10 = String.valueOf(helVar);
        String valueOf11 = String.valueOf(ebzVar);
        String valueOf12 = String.valueOf(gzpVar3);
        String valueOf13 = String.valueOf(gzpVar2);
        String valueOf14 = String.valueOf(gzpVar);
        String str = i != 1 ? "null" : "ALIGN_CENTER";
        eck eckVar = this.n;
        boolean z = this.o;
        Runnable runnable = this.p;
        return "AccountMenuFeatures{deactivatedAccountsFeature=" + valueOf + ", incognitoFeature=" + valueOf2 + ", customIncognitoActionFeature=" + valueOf3 + ", obakeFeature=" + valueOf4 + ", policyFooterCustomizer=" + valueOf5 + ", useWithoutAnAccountActionFeature=" + valueOf6 + ", flavorsFeature=" + valueOf7 + ", criticalAlertFeature=" + valueOf8 + ", accountMessagesFeature=" + valueOf9 + ", commonActions=" + valueOf10 + ", educationManager=" + valueOf11 + ", countDecorationGenerator=" + valueOf12 + ", disableAccountSwitchingFeature=" + valueOf13 + ", launcherAppSpec=" + valueOf14 + ", isExperimental=false, largeScreenDialogAlignment=" + str + ", materialVersion=" + String.valueOf(eckVar) + ", enableQuickProfileSwitching=" + z + ", onSlowAccountSwitchingRunnable=" + String.valueOf(runnable) + "}";
    }

    public ebv() {
        throw null;
    }
}
