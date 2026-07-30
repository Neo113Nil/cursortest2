package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class co2 implements Comparable {
    public static final bo2 Companion = new bo2();
    public final short rtx2ld2ELZv4;

    public /* synthetic */ co2(short s) {
        this.rtx2ld2ELZv4 = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return cs0.gPXPFXrUH4XX(this.rtx2ld2ELZv4 & 65535, ((co2) obj).rtx2ld2ELZv4 & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof co2) {
            return this.rtx2ld2ELZv4 == ((co2) obj).rtx2ld2ELZv4;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.rtx2ld2ELZv4);
    }

    public final String toString() {
        return String.valueOf(this.rtx2ld2ELZv4 & 65535);
    }
}
