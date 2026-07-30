package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xl1 extends jyegZNwi31qc {
    public int cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final vl1 wdg6QnbFHrFF;
    public rl2 x50lh2ztY7Y5;

    public xl1(vl1 vl1Var, int i) {
        super(i, vl1Var.QrzZRwfaDlRX);
        this.wdg6QnbFHrFF = vl1Var;
        this.dgRBjINgWbAK = vl1Var.e9gEMXR7LXtO();
        this.cpQdD2nAriOS = -1;
        lS5Rgt96tfkO();
    }

    public final void PxuCJdSBwIXG() {
        if (this.dgRBjINgWbAK != this.wdg6QnbFHrFF.e9gEMXR7LXtO()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.jyegZNwi31qc, java.util.ListIterator
    public final void add(Object obj) {
        PxuCJdSBwIXG();
        int i = this.rtx2ld2ELZv4;
        vl1 vl1Var = this.wdg6QnbFHrFF;
        vl1Var.add(i, obj);
        this.rtx2ld2ELZv4++;
        this.OPXfSBeufaJ8 = vl1Var.PxuCJdSBwIXG();
        this.dgRBjINgWbAK = vl1Var.e9gEMXR7LXtO();
        this.cpQdD2nAriOS = -1;
        lS5Rgt96tfkO();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void lS5Rgt96tfkO() {
        vl1 vl1Var = this.wdg6QnbFHrFF;
        Object[] objArr = vl1Var.cpQdD2nAriOS;
        if (objArr == null) {
            this.x50lh2ztY7Y5 = null;
            return;
        }
        int i = (vl1Var.QrzZRwfaDlRX - 1) & (-32);
        int i2 = this.rtx2ld2ELZv4;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (vl1Var.dgRBjINgWbAK / 5) + 1;
        rl2 rl2Var = this.x50lh2ztY7Y5;
        if (rl2Var == null) {
            this.x50lh2ztY7Y5 = new rl2(objArr, i2, i, i3);
            return;
        }
        rl2Var.rtx2ld2ELZv4 = i2;
        rl2Var.OPXfSBeufaJ8 = i;
        rl2Var.wdg6QnbFHrFF = i3;
        if (rl2Var.dgRBjINgWbAK.length < i3) {
            rl2Var.dgRBjINgWbAK = new Object[i3];
        }
        rl2Var.dgRBjINgWbAK[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        rl2Var.x50lh2ztY7Y5 = r0;
        rl2Var.lS5Rgt96tfkO(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        PxuCJdSBwIXG();
        if (!hasNext()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        int i = this.rtx2ld2ELZv4;
        this.cpQdD2nAriOS = i;
        rl2 rl2Var = this.x50lh2ztY7Y5;
        vl1 vl1Var = this.wdg6QnbFHrFF;
        if (rl2Var == null) {
            Object[] objArr = vl1Var.r3s1LDPKFs1S;
            this.rtx2ld2ELZv4 = i + 1;
            return objArr[i];
        }
        if (rl2Var.hasNext()) {
            this.rtx2ld2ELZv4++;
            return rl2Var.next();
        }
        Object[] objArr2 = vl1Var.r3s1LDPKFs1S;
        int i2 = this.rtx2ld2ELZv4;
        this.rtx2ld2ELZv4 = i2 + 1;
        return objArr2[i2 - rl2Var.OPXfSBeufaJ8];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        PxuCJdSBwIXG();
        if (!hasPrevious()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        int i = this.rtx2ld2ELZv4;
        this.cpQdD2nAriOS = i - 1;
        rl2 rl2Var = this.x50lh2ztY7Y5;
        vl1 vl1Var = this.wdg6QnbFHrFF;
        if (rl2Var == null) {
            Object[] objArr = vl1Var.r3s1LDPKFs1S;
            int i2 = i - 1;
            this.rtx2ld2ELZv4 = i2;
            return objArr[i2];
        }
        int i3 = rl2Var.OPXfSBeufaJ8;
        if (i <= i3) {
            this.rtx2ld2ELZv4 = i - 1;
            return rl2Var.previous();
        }
        Object[] objArr2 = vl1Var.r3s1LDPKFs1S;
        int i4 = i - 1;
        this.rtx2ld2ELZv4 = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.jyegZNwi31qc, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        PxuCJdSBwIXG();
        int i = this.cpQdD2nAriOS;
        if (i == -1) {
            throw new IllegalStateException();
        }
        vl1 vl1Var = this.wdg6QnbFHrFF;
        vl1Var.lS5Rgt96tfkO(i);
        int i2 = this.cpQdD2nAriOS;
        if (i2 < this.rtx2ld2ELZv4) {
            this.rtx2ld2ELZv4 = i2;
        }
        this.OPXfSBeufaJ8 = vl1Var.PxuCJdSBwIXG();
        this.dgRBjINgWbAK = vl1Var.e9gEMXR7LXtO();
        this.cpQdD2nAriOS = -1;
        lS5Rgt96tfkO();
    }

    @Override // defpackage.jyegZNwi31qc, java.util.ListIterator
    public final void set(Object obj) {
        PxuCJdSBwIXG();
        int i = this.cpQdD2nAriOS;
        if (i == -1) {
            throw new IllegalStateException();
        }
        vl1 vl1Var = this.wdg6QnbFHrFF;
        vl1Var.set(i, obj);
        this.dgRBjINgWbAK = vl1Var.e9gEMXR7LXtO();
        lS5Rgt96tfkO();
    }
}
