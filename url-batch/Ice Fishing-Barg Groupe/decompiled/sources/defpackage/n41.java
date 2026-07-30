package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class n41 {
    public int OPXfSBeufaJ8;
    public Object dgRBjINgWbAK;
    public int rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public n41() {
        if (ib0.OPXfSBeufaJ8 == null) {
            ib0.OPXfSBeufaJ8 = new ib0(21);
        }
    }

    public int PxuCJdSBwIXG(int i) {
        if (i < this.wdg6QnbFHrFF) {
            return ((ByteBuffer) this.dgRBjINgWbAK).getShort(this.OPXfSBeufaJ8 + i);
        }
        return 0;
    }

    public void TSizfFm2Yiuu() {
        while (true) {
            int i = this.rtx2ld2ELZv4;
            o41 o41Var = (o41) this.dgRBjINgWbAK;
            if (i >= o41Var.cpQdD2nAriOS || o41Var.wdg6QnbFHrFF[i] >= 0) {
                return;
            } else {
                this.rtx2ld2ELZv4 = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.rtx2ld2ELZv4 < ((o41) this.dgRBjINgWbAK).cpQdD2nAriOS;
    }

    public void lS5Rgt96tfkO() {
        if (((o41) this.dgRBjINgWbAK).QrzZRwfaDlRX != this.wdg6QnbFHrFF) {
            throw new ConcurrentModificationException();
        }
    }

    public void remove() {
        o41 o41Var = (o41) this.dgRBjINgWbAK;
        lS5Rgt96tfkO();
        if (this.OPXfSBeufaJ8 == -1) {
            u9.rtx2ld2ELZv4("Call next() before removing element from the iterator.");
            return;
        }
        o41Var.TSizfFm2Yiuu();
        o41Var.dgRBjINgWbAK(this.OPXfSBeufaJ8);
        this.OPXfSBeufaJ8 = -1;
        this.wdg6QnbFHrFF = o41Var.QrzZRwfaDlRX;
    }
}
