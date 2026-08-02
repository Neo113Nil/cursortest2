package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhy {
    public final jie a;
    public final int b;
    public final jhb c;
    public final jiu d;
    public final kri e;
    public final int f;
    public final hrd g;

    public jhy(jie jieVar, int i, jhb jhbVar, jiu jiuVar, kri kriVar, int i2, hrd hrdVar) {
        jhbVar.getClass();
        jiuVar.getClass();
        this.a = jieVar;
        this.b = i;
        this.c = jhbVar;
        this.d = jiuVar;
        this.e = kriVar;
        this.f = i2;
        this.g = hrdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhy)) {
            return false;
        }
        jhy jhyVar = (jhy) obj;
        return ksp.b(this.a, jhyVar.a) && this.b == jhyVar.b && this.c == jhyVar.c && ksp.b(this.d, jhyVar.d) && ksp.b(this.e, jhyVar.e) && this.f == jhyVar.f && ksp.b(this.g, jhyVar.g);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        kri kriVar = this.e;
        int hashCode2 = ((((hashCode * 31) + (kriVar == null ? 0 : kriVar.hashCode())) * 31) + this.f) * 31;
        hrd hrdVar = this.g;
        return hashCode2 + (hrdVar != null ? hrdVar.hashCode() : 0);
    }

    public final String toString() {
        return "Card(cardState=" + this.a + ", stableId=" + this.b + ", backgroundColor=" + this.c + ", tap=" + this.d + ", onImpression=" + this.e + ", veId=" + this.f + ", veImpressionMetadata=" + this.g + ")";
    }

    public /* synthetic */ jhy(jie jieVar, int i, jhb jhbVar, jiu jiuVar, kri kriVar, int i2, int i3) {
        this(jieVar, i, (i3 & 4) != 0 ? jhb.i : jhbVar, jiuVar, (i3 & 16) != 0 ? null : kriVar, i2, (hrd) null);
    }
}
