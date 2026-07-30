package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pn2 implements Comparable {
    public static final on2 Companion = new on2();
    public final int rtx2ld2ELZv4;

    public /* synthetic */ pn2(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return cs0.gPXPFXrUH4XX(this.rtx2ld2ELZv4 ^ Integer.MIN_VALUE, ((pn2) obj).rtx2ld2ELZv4 ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pn2) {
            return this.rtx2ld2ELZv4 == ((pn2) obj).rtx2ld2ELZv4;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.rtx2ld2ELZv4);
    }

    public final String toString() {
        return String.valueOf(this.rtx2ld2ELZv4 & 4294967295L);
    }
}
