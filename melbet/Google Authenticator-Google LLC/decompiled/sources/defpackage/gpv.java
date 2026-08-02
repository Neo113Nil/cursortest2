package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpv {
    public static final gpv a = new gpv(false, null, null);
    public final boolean b;
    public final koe c;
    private final gpp d;

    public gpv(boolean z, gpp gppVar, koe koeVar) {
        this.b = z;
        this.d = gppVar;
        this.c = koeVar;
    }

    public final gpp a() {
        hoq.I(this.b, "Synclet binding must be enabled to have a SyncConfig");
        gpp gppVar = this.d;
        gppVar.getClass();
        return gppVar;
    }

    public final boolean equals(Object obj) {
        gpp gppVar;
        koe koeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpv) {
            gpv gpvVar = (gpv) obj;
            if (this.b == gpvVar.b && ((gppVar = this.d) != null ? gppVar.equals(gpvVar.d) : gpvVar.d == null) && ((koeVar = this.c) != null ? koeVar.equals(gpvVar.c) : gpvVar.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        gpp gppVar = this.d;
        int hashCode = (gppVar == null ? 0 : gppVar.hashCode()) ^ (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003);
        koe koeVar = this.c;
        return (hashCode * 1000003) ^ (koeVar != null ? koeVar.hashCode() : 0);
    }

    public final String toString() {
        koe koeVar = this.c;
        return "SyncletBinding{enabled=" + this.b + ", syncConfig=" + String.valueOf(this.d) + ", syncletProvider=" + String.valueOf(koeVar) + "}";
    }

    public gpv() {
        throw null;
    }
}
