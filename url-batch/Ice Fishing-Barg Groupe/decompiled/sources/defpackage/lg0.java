package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lg0 implements Iterator, fu0 {
    public int OPXfSBeufaJ8;
    public final Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public Object wdg6QnbFHrFF;

    public lg0(y81 y81Var) {
        this.rtx2ld2ELZv4 = 2;
        this.dgRBjINgWbAK = y81Var;
        this.OPXfSBeufaJ8 = -1;
        this.wdg6QnbFHrFF = xi0.nLZGh9p8gVSu(new x81(y81Var, this, null));
    }

    public void PxuCJdSBwIXG() {
        Object OPXfSBeufaJ8;
        int i = this.OPXfSBeufaJ8;
        fy fyVar = (fy) this.dgRBjINgWbAK;
        if (i == -2) {
            OPXfSBeufaJ8 = ((ae0) fyVar.lS5Rgt96tfkO).PxuCJdSBwIXG();
        } else {
            le0 le0Var = (le0) fyVar.TSizfFm2Yiuu;
            Object obj = this.wdg6QnbFHrFF;
            obj.getClass();
            OPXfSBeufaJ8 = le0Var.OPXfSBeufaJ8(obj);
        }
        this.wdg6QnbFHrFF = OPXfSBeufaJ8;
        this.OPXfSBeufaJ8 = OPXfSBeufaJ8 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (this.OPXfSBeufaJ8 < 0) {
                    PxuCJdSBwIXG();
                }
                return this.OPXfSBeufaJ8 == 1;
            case 1:
                return ((y32) this.wdg6QnbFHrFF).hasNext();
            case 2:
                return ((y32) this.wdg6QnbFHrFF).hasNext();
            default:
                return this.OPXfSBeufaJ8 < ((Map) this.dgRBjINgWbAK).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (this.OPXfSBeufaJ8 < 0) {
                    PxuCJdSBwIXG();
                }
                if (this.OPXfSBeufaJ8 == 0) {
                    u9.RfyTYNmI9Srp();
                    return null;
                }
                Object obj2 = this.wdg6QnbFHrFF;
                obj2.getClass();
                this.OPXfSBeufaJ8 = -1;
                return obj2;
            case 1:
                return ((y32) this.wdg6QnbFHrFF).next();
            case 2:
                return ((y32) this.wdg6QnbFHrFF).next();
            default:
                if (hasNext()) {
                    obj = this.wdg6QnbFHrFF;
                    this.OPXfSBeufaJ8++;
                    Object obj3 = ((Map) this.dgRBjINgWbAK).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.wdg6QnbFHrFF = ((w11) obj3).lS5Rgt96tfkO;
                } else {
                    u9.RfyTYNmI9Srp();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.dgRBjINgWbAK;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.OPXfSBeufaJ8;
                if (i2 != -1) {
                    ((s81) obj).OPXfSBeufaJ8.rtx2ld2ELZv4(i2);
                    this.OPXfSBeufaJ8 = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.OPXfSBeufaJ8;
                if (i3 != -1) {
                    ((y81) obj).OPXfSBeufaJ8.cpQdD2nAriOS(i3);
                    this.OPXfSBeufaJ8 = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public lg0(fy fyVar) {
        this.rtx2ld2ELZv4 = 0;
        this.dgRBjINgWbAK = fyVar;
        this.OPXfSBeufaJ8 = -2;
    }

    public lg0(Object obj, Map map) {
        this.rtx2ld2ELZv4 = 3;
        this.wdg6QnbFHrFF = obj;
        this.dgRBjINgWbAK = map;
    }

    public lg0(s81 s81Var) {
        this.rtx2ld2ELZv4 = 1;
        this.dgRBjINgWbAK = s81Var;
        this.OPXfSBeufaJ8 = -1;
        this.wdg6QnbFHrFF = xi0.nLZGh9p8gVSu(new r81(s81Var, this, null));
    }
}
