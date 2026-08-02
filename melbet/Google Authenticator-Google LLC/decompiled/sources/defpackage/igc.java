package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igc {
    public final jzw a;
    public final jxo b;
    public final jxo c;
    public final jxo d;

    public igc(jzw jzwVar, jxo jxoVar, jxo jxoVar2, jxo jxoVar3) {
        this.a = jzwVar;
        this.b = jxoVar;
        this.c = jxoVar2;
        this.d = jxoVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igc)) {
            return false;
        }
        igc igcVar = (igc) obj;
        return ksp.b(this.a, igcVar.a) && ksp.b(this.b, igcVar.b) && ksp.b(this.c, igcVar.c) && ksp.b(this.d, igcVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ParcelableOverMetadataKeys(metadataKey=" + this.a + ", requestKey=" + this.b + ", responseHeaderKey=" + this.c + ", responseTrailerKey=" + this.d + ")";
    }
}
