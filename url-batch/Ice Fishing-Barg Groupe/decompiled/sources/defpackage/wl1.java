package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wl1 extends jyegZNwi31qc {
    public final rl2 dgRBjINgWbAK;
    public final Object[] wdg6QnbFHrFF;

    public wl1(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.wdg6QnbFHrFF = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.dgRBjINgWbAK = new rl2(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        rl2 rl2Var = this.dgRBjINgWbAK;
        if (rl2Var.hasNext()) {
            this.rtx2ld2ELZv4++;
            return rl2Var.next();
        }
        int i = this.rtx2ld2ELZv4;
        this.rtx2ld2ELZv4 = i + 1;
        return this.wdg6QnbFHrFF[i - rl2Var.OPXfSBeufaJ8];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        int i = this.rtx2ld2ELZv4;
        rl2 rl2Var = this.dgRBjINgWbAK;
        int i2 = rl2Var.OPXfSBeufaJ8;
        if (i <= i2) {
            this.rtx2ld2ELZv4 = i - 1;
            return rl2Var.previous();
        }
        int i3 = i - 1;
        this.rtx2ld2ELZv4 = i3;
        return this.wdg6QnbFHrFF[i3 - i2];
    }
}
