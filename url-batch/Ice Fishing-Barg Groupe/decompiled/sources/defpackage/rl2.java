package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rl2 extends jyegZNwi31qc {
    public Object[] dgRBjINgWbAK;
    public int wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public rl2(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.wdg6QnbFHrFF = i3;
        Object[] objArr2 = new Object[i3];
        this.dgRBjINgWbAK = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.x50lh2ztY7Y5 = r5;
        objArr2[0] = objArr;
        lS5Rgt96tfkO(i - r5, 1);
    }

    public final Object PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4 & 31;
        Object obj = this.dgRBjINgWbAK[this.wdg6QnbFHrFF - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void TSizfFm2Yiuu(int i) {
        int i2 = 0;
        while (ki0.ryVscX7ZL4Ux(this.rtx2ld2ELZv4, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            lS5Rgt96tfkO(this.rtx2ld2ELZv4, ((this.wdg6QnbFHrFF - 1) - (i2 / 5)) + 1);
        }
    }

    public final void lS5Rgt96tfkO(int i, int i2) {
        int i3 = (this.wdg6QnbFHrFF - i2) * 5;
        while (i2 < this.wdg6QnbFHrFF) {
            Object[] objArr = this.dgRBjINgWbAK;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[ki0.ryVscX7ZL4Ux(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        Object PxuCJdSBwIXG = PxuCJdSBwIXG();
        int i = this.rtx2ld2ELZv4 + 1;
        this.rtx2ld2ELZv4 = i;
        if (i == this.OPXfSBeufaJ8) {
            this.x50lh2ztY7Y5 = true;
            return PxuCJdSBwIXG;
        }
        TSizfFm2Yiuu(0);
        return PxuCJdSBwIXG;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        this.rtx2ld2ELZv4--;
        if (this.x50lh2ztY7Y5) {
            this.x50lh2ztY7Y5 = false;
            return PxuCJdSBwIXG();
        }
        TSizfFm2Yiuu(31);
        return PxuCJdSBwIXG();
    }
}
