package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ly implements hy {
    public final float OPXfSBeufaJ8;
    public final float rtx2ld2ELZv4;

    public ly(float f, float f2) {
        this.rtx2ld2ELZv4 = f;
        this.OPXfSBeufaJ8 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly)) {
            return false;
        }
        ly lyVar = (ly) obj;
        return Float.compare(this.rtx2ld2ELZv4, lyVar.rtx2ld2ELZv4) == 0 && Float.compare(this.OPXfSBeufaJ8, lyVar.OPXfSBeufaJ8) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.OPXfSBeufaJ8) + (Float.hashCode(this.rtx2ld2ELZv4) * 31);
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        return this.rtx2ld2ELZv4;
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        return this.OPXfSBeufaJ8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.rtx2ld2ELZv4);
        sb.append(", fontScale=");
        return o0.cpQdD2nAriOS(sb, this.OPXfSBeufaJ8, ')');
    }
}
