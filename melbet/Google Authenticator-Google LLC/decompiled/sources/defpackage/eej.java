package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eej {
    public final gzp a;
    public final gzp b;
    public final gzp c;
    public final gzp d;
    public final gzp e;
    public final gzp f;
    public final boolean g;
    public final dih h;
    public final dih i;

    public eej(gzp gzpVar, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4, gzp gzpVar5, gzp gzpVar6, dih dihVar, boolean z, dih dihVar2) {
        this.a = gzpVar;
        this.b = gzpVar2;
        this.c = gzpVar3;
        this.d = gzpVar4;
        this.e = gzpVar5;
        this.f = gzpVar6;
        this.h = dihVar;
        this.g = z;
        this.i = dihVar2;
    }

    public static eei a() {
        eei eeiVar = new eei();
        eeiVar.b = gzp.h(new eek(new dih()));
        eeiVar.c = true;
        eeiVar.d = (byte) 1;
        eeiVar.f = new dih();
        eeiVar.e = new dih();
        return eeiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eej) {
            eej eejVar = (eej) obj;
            if (this.a.equals(eejVar.a) && this.b.equals(eejVar.b) && this.c.equals(eejVar.c) && this.d.equals(eejVar.d) && this.e.equals(eejVar.e) && this.f.equals(eejVar.f) && this.h.equals(eejVar.h) && this.g == eejVar.g && this.i.equals(eejVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        dih dihVar = this.i;
        dih dihVar2 = this.h;
        gzp gzpVar = this.f;
        gzp gzpVar2 = this.e;
        gzp gzpVar3 = this.d;
        gzp gzpVar4 = this.c;
        gzp gzpVar5 = this.b;
        return "ExpressSignInFeatures{signInWithoutAccountFeature=" + String.valueOf(this.a) + ", disclaimerFeature=" + String.valueOf(gzpVar5) + ", customHeaderContentFeature=" + String.valueOf(gzpVar4) + ", logoViewFeature=" + String.valueOf(gzpVar3) + ", cancelableFeature=" + String.valueOf(gzpVar2) + ", materialVersion=" + String.valueOf(gzpVar) + ", secondaryButtonStyleFeature=" + String.valueOf(dihVar2) + ", supportAccountSwitching=" + this.g + ", customContinueButtonTextsFactory=" + String.valueOf(dihVar) + "}";
    }

    public eej() {
        throw null;
    }
}
