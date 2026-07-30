package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ey implements Iterator, fu0 {
    public int OPXfSBeufaJ8;
    public final Object cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public Object x50lh2ztY7Y5;

    public ey(fy fyVar) {
        this.rtx2ld2ELZv4 = 0;
        this.cpQdD2nAriOS = fyVar;
        this.OPXfSBeufaJ8 = -1;
        int wdg6QnbFHrFF = ng0.wdg6QnbFHrFF(0, 0, ((CharSequence) fyVar.lS5Rgt96tfkO).length());
        this.wdg6QnbFHrFF = wdg6QnbFHrFF;
        this.dgRBjINgWbAK = wdg6QnbFHrFF;
    }

    public void PxuCJdSBwIXG() {
        fy fyVar = (fy) this.cpQdD2nAriOS;
        CharSequence charSequence = (CharSequence) fyVar.lS5Rgt96tfkO;
        int i = this.dgRBjINgWbAK;
        if (i < 0) {
            this.OPXfSBeufaJ8 = 0;
            this.x50lh2ztY7Y5 = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.wdg6QnbFHrFF;
            charSequence.getClass();
            this.x50lh2ztY7Y5 = new br0(i2, charSequence.length() - 1, 1);
            this.dgRBjINgWbAK = -1;
        } else {
            vi1 vi1Var = (vi1) ((pe0) fyVar.TSizfFm2Yiuu).rtx2ld2ELZv4(charSequence, Integer.valueOf(this.dgRBjINgWbAK));
            if (vi1Var == null) {
                int i3 = this.wdg6QnbFHrFF;
                charSequence.getClass();
                this.x50lh2ztY7Y5 = new br0(i3, charSequence.length() - 1, 1);
                this.dgRBjINgWbAK = -1;
            } else {
                int intValue = ((Number) vi1Var.rtx2ld2ELZv4).intValue();
                int intValue2 = ((Number) vi1Var.OPXfSBeufaJ8).intValue();
                this.x50lh2ztY7Y5 = ng0.nLZGh9p8gVSu(this.wdg6QnbFHrFF, intValue);
                int i4 = intValue + intValue2;
                this.wdg6QnbFHrFF = i4;
                this.dgRBjINgWbAK = i4 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.OPXfSBeufaJ8 = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (this.OPXfSBeufaJ8 == -1) {
                    PxuCJdSBwIXG();
                }
                return this.OPXfSBeufaJ8 == 1;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (this.OPXfSBeufaJ8 == -1) {
                    PxuCJdSBwIXG();
                }
                if (this.OPXfSBeufaJ8 == 0) {
                    u9.RfyTYNmI9Srp();
                    return null;
                }
                br0 br0Var = (br0) this.x50lh2ztY7Y5;
                br0Var.getClass();
                this.x50lh2ztY7Y5 = null;
                this.OPXfSBeufaJ8 = -1;
                return br0Var;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ey(a72 a72Var, int i, vf0 vf0Var, th0 th0Var) {
        this.rtx2ld2ELZv4 = 1;
        this.x50lh2ztY7Y5 = a72Var;
        this.OPXfSBeufaJ8 = i;
        this.cpQdD2nAriOS = th0Var;
        this.wdg6QnbFHrFF = a72Var.QrzZRwfaDlRX;
    }
}
