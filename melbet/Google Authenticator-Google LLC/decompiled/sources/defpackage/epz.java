package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epz implements elj {
    public final int a;
    public final gzp b;
    private final hel c;
    private final int d;

    public epz(int i, int i2, gzp gzpVar, hel helVar) {
        this.d = i;
        this.a = i2;
        this.b = gzpVar;
        this.c = helVar;
    }

    public static final epy d() {
        epy epyVar = new epy();
        epyVar.a = 50;
        epyVar.c = (byte) 3;
        epyVar.b = gyf.a;
        epyVar.d = 1;
        return epyVar;
    }

    @Override // defpackage.elj
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof epz)) {
            return false;
        }
        epz epzVar = (epz) obj;
        int i = this.d;
        int i2 = epzVar.d;
        if (i != 0) {
            return i == i2 && this.a == epzVar.a && this.b.equals(epzVar.b) && hnu.H(this.c, epzVar.c);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        a.D(i);
        int i2 = (((((i ^ 1000003) * 1000003) ^ this.a) * (-721379959)) ^ 1237) * 1000003;
        return this.c.hashCode() ^ ((i2 ^ 2040732332) * 1000003);
    }

    public final String toString() {
        hel helVar = this.c;
        return "NetworkConfigurations{enablement=" + elk.a(this.d) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=false, metricExtensionProvider=" + String.valueOf(this.b) + ", customDomainAllowlist=" + String.valueOf(helVar) + "}";
    }

    public epz() {
        throw null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }
}
