package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class my implements hy {
    public final float OPXfSBeufaJ8;
    public final float rtx2ld2ELZv4;
    public final mc0 wdg6QnbFHrFF;

    public my(float f, float f2, mc0 mc0Var) {
        this.rtx2ld2ELZv4 = f;
        this.OPXfSBeufaJ8 = f2;
        this.wdg6QnbFHrFF = mc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my)) {
            return false;
        }
        my myVar = (my) obj;
        return Float.compare(this.rtx2ld2ELZv4, myVar.rtx2ld2ELZv4) == 0 && Float.compare(this.OPXfSBeufaJ8, myVar.OPXfSBeufaJ8) == 0 && this.wdg6QnbFHrFF.equals(myVar.wdg6QnbFHrFF);
    }

    public final int hashCode() {
        return this.wdg6QnbFHrFF.hashCode() + o0.PxuCJdSBwIXG(this.OPXfSBeufaJ8, Float.hashCode(this.rtx2ld2ELZv4) * 31, 31);
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        return this.rtx2ld2ELZv4;
    }

    @Override // defpackage.hy
    public final long pnx5pC0XzaCw(float f) {
        return ki0.wLFCmsViZrNT(4294967296L, this.wdg6QnbFHrFF.PxuCJdSBwIXG(f));
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        return this.OPXfSBeufaJ8;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.rtx2ld2ELZv4 + ", fontScale=" + this.OPXfSBeufaJ8 + ", converter=" + this.wdg6QnbFHrFF + ')';
    }

    @Override // defpackage.hy
    public final float xfACYKDMU6Dj(long j) {
        long lS5Rgt96tfkO = hj2.lS5Rgt96tfkO(j);
        jj2.Companion.getClass();
        if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 4294967296L)) {
            return this.wdg6QnbFHrFF.lS5Rgt96tfkO(hj2.TSizfFm2Yiuu(j));
        }
        u9.rtx2ld2ELZv4("Only Sp can convert to Px");
        return 0.0f;
    }
}
