package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ll1 implements Iterator, fu0 {
    public int OPXfSBeufaJ8;
    public final ul2[] rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF = true;

    public ll1(tl2 tl2Var, ul2[] ul2VarArr) {
        this.rtx2ld2ELZv4 = ul2VarArr;
        ul2VarArr[0].PxuCJdSBwIXG(tl2Var.Y1f8riQaR6yg, Integer.bitCount(tl2Var.PxuCJdSBwIXG) * 2, 0);
        this.OPXfSBeufaJ8 = 0;
        PxuCJdSBwIXG();
    }

    public final void PxuCJdSBwIXG() {
        int i = this.OPXfSBeufaJ8;
        ul2[] ul2VarArr = this.rtx2ld2ELZv4;
        ul2 ul2Var = ul2VarArr[i];
        if (ul2Var.wdg6QnbFHrFF < ul2Var.OPXfSBeufaJ8) {
            return;
        }
        while (-1 < i) {
            int lS5Rgt96tfkO = lS5Rgt96tfkO(i);
            if (lS5Rgt96tfkO == -1) {
                ul2 ul2Var2 = ul2VarArr[i];
                int i2 = ul2Var2.wdg6QnbFHrFF;
                Object[] objArr = ul2Var2.rtx2ld2ELZv4;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    ul2Var2.wdg6QnbFHrFF = i2 + 1;
                    lS5Rgt96tfkO = lS5Rgt96tfkO(i);
                }
            }
            if (lS5Rgt96tfkO != -1) {
                this.OPXfSBeufaJ8 = lS5Rgt96tfkO;
                return;
            }
            if (i > 0) {
                ul2 ul2Var3 = ul2VarArr[i - 1];
                int i3 = ul2Var3.wdg6QnbFHrFF;
                int length2 = ul2Var3.rtx2ld2ELZv4.length;
                ul2Var3.wdg6QnbFHrFF = i3 + 1;
            }
            ul2 ul2Var4 = ul2VarArr[i];
            tl2.Companion.getClass();
            ul2Var4.PxuCJdSBwIXG(tl2.e9gEMXR7LXtO.Y1f8riQaR6yg, 0, 0);
            i--;
        }
        this.wdg6QnbFHrFF = false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.wdg6QnbFHrFF;
    }

    public final int lS5Rgt96tfkO(int i) {
        ul2[] ul2VarArr = this.rtx2ld2ELZv4;
        ul2 ul2Var = ul2VarArr[i];
        int i2 = ul2Var.wdg6QnbFHrFF;
        if (i2 < ul2Var.OPXfSBeufaJ8) {
            return i;
        }
        Object[] objArr = ul2Var.rtx2ld2ELZv4;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        tl2 tl2Var = (tl2) obj;
        if (i == 6) {
            ul2 ul2Var2 = ul2VarArr[i + 1];
            Object[] objArr2 = tl2Var.Y1f8riQaR6yg;
            ul2Var2.PxuCJdSBwIXG(objArr2, objArr2.length, 0);
        } else {
            ul2VarArr[i + 1].PxuCJdSBwIXG(tl2Var.Y1f8riQaR6yg, Integer.bitCount(tl2Var.PxuCJdSBwIXG) * 2, 0);
        }
        return lS5Rgt96tfkO(i + 1);
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.wdg6QnbFHrFF) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        Object next = this.rtx2ld2ELZv4[this.OPXfSBeufaJ8].next();
        PxuCJdSBwIXG();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
