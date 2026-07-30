package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c80 implements Iterator, fu0 {
    public final Iterator OPXfSBeufaJ8;
    public Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4 = 0;
    public int wdg6QnbFHrFF = -1;
    public final /* synthetic */ x32 x50lh2ztY7Y5;

    public c80(fy fyVar) {
        this.x50lh2ztY7Y5 = fyVar;
        this.OPXfSBeufaJ8 = new zk2((hd2) fyVar.lS5Rgt96tfkO);
    }

    public void PxuCJdSBwIXG() {
        Object next;
        fy fyVar = (fy) this.x50lh2ztY7Y5;
        do {
            Iterator it = this.OPXfSBeufaJ8;
            if (!it.hasNext()) {
                this.wdg6QnbFHrFF = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((vz1) fyVar.TSizfFm2Yiuu).OPXfSBeufaJ8(next)).booleanValue());
        this.dgRBjINgWbAK = next;
        this.wdg6QnbFHrFF = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (this.wdg6QnbFHrFF == -1) {
                    PxuCJdSBwIXG();
                }
                if (this.wdg6QnbFHrFF == 1) {
                }
                break;
            default:
                if (this.wdg6QnbFHrFF == -1) {
                    lS5Rgt96tfkO();
                }
                if (this.wdg6QnbFHrFF == 1) {
                }
                break;
        }
        return true;
    }

    public void lS5Rgt96tfkO() {
        Iterator it = this.OPXfSBeufaJ8;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((hd2) this.x50lh2ztY7Y5).TSizfFm2Yiuu.OPXfSBeufaJ8(next)).booleanValue()) {
                this.wdg6QnbFHrFF = 1;
                this.dgRBjINgWbAK = next;
                return;
            }
        }
        this.wdg6QnbFHrFF = 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (this.wdg6QnbFHrFF == -1) {
                    PxuCJdSBwIXG();
                }
                if (this.wdg6QnbFHrFF == 0) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    Object obj = this.dgRBjINgWbAK;
                    this.dgRBjINgWbAK = null;
                    this.wdg6QnbFHrFF = -1;
                    break;
                }
            default:
                if (this.wdg6QnbFHrFF == -1) {
                    lS5Rgt96tfkO();
                }
                if (this.wdg6QnbFHrFF == 0) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    Object obj2 = this.dgRBjINgWbAK;
                    this.dgRBjINgWbAK = null;
                    this.wdg6QnbFHrFF = -1;
                    break;
                }
        }
        return null;
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

    public c80(hd2 hd2Var) {
        this.x50lh2ztY7Y5 = hd2Var;
        this.OPXfSBeufaJ8 = hd2Var.lS5Rgt96tfkO.iterator();
    }
}
