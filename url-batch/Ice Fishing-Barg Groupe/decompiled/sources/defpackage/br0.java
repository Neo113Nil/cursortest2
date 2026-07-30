package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class br0 extends yq0 {
    public static final ar0 Companion = new ar0();
    public static final br0 dgRBjINgWbAK = new br0(1, 0, 1);

    @Override // defpackage.yq0
    public final boolean equals(Object obj) {
        if (!(obj instanceof br0)) {
            return false;
        }
        if (isEmpty() && ((br0) obj).isEmpty()) {
            return true;
        }
        br0 br0Var = (br0) obj;
        return this.rtx2ld2ELZv4 == br0Var.rtx2ld2ELZv4 && this.OPXfSBeufaJ8 == br0Var.OPXfSBeufaJ8;
    }

    @Override // defpackage.yq0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.rtx2ld2ELZv4 * 31) + this.OPXfSBeufaJ8;
    }

    @Override // defpackage.yq0
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4 > this.OPXfSBeufaJ8;
    }

    @Override // defpackage.yq0
    public final String toString() {
        return this.rtx2ld2ELZv4 + ".." + this.OPXfSBeufaJ8;
    }
}
