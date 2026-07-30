package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jn2 implements Comparable {
    public static final in2 Companion = new in2();
    public final byte rtx2ld2ELZv4;

    public /* synthetic */ jn2(byte b) {
        this.rtx2ld2ELZv4 = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return cs0.gPXPFXrUH4XX(this.rtx2ld2ELZv4 & 255, ((jn2) obj).rtx2ld2ELZv4 & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jn2) {
            return this.rtx2ld2ELZv4 == ((jn2) obj).rtx2ld2ELZv4;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.rtx2ld2ELZv4);
    }

    public final String toString() {
        return String.valueOf(this.rtx2ld2ELZv4 & 255);
    }
}
