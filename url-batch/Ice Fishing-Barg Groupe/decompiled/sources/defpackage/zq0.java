package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zq0 extends rq0 {
    public final int OPXfSBeufaJ8;
    public int dgRBjINgWbAK;
    public final int rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public zq0(int i, int i2, int i3) {
        this.rtx2ld2ELZv4 = i3;
        this.OPXfSBeufaJ8 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.wdg6QnbFHrFF = z;
        this.dgRBjINgWbAK = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.wdg6QnbFHrFF;
    }

    @Override // defpackage.rq0
    public final int nextInt() {
        int i = this.dgRBjINgWbAK;
        if (i != this.OPXfSBeufaJ8) {
            this.dgRBjINgWbAK = this.rtx2ld2ELZv4 + i;
            return i;
        }
        if (this.wdg6QnbFHrFF) {
            this.wdg6QnbFHrFF = false;
            return i;
        }
        u9.RfyTYNmI9Srp();
        return 0;
    }
}
