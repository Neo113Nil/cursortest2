package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xj0 implements ListIterator, fu0 {
    public int OPXfSBeufaJ8;
    public int dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public final Object x50lh2ztY7Y5;

    public xj0(d82 d82Var, int i) {
        this.rtx2ld2ELZv4 = 3;
        this.x50lh2ztY7Y5 = d82Var;
        this.OPXfSBeufaJ8 = i - 1;
        this.wdg6QnbFHrFF = -1;
        this.dgRBjINgWbAK = ov2.BjEWd04qc7Mw(d82Var);
    }

    public void PxuCJdSBwIXG() {
        int i;
        i = ((AbstractList) ((x11) this.x50lh2ztY7Y5).x50lh2ztY7Y5).modCount;
        if (i != this.dgRBjINgWbAK) {
            throw new ConcurrentModificationException();
        }
    }

    public void TSizfFm2Yiuu() {
        if (ov2.BjEWd04qc7Mw((d82) this.x50lh2ztY7Y5) != this.dgRBjINgWbAK) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.rtx2ld2ELZv4;
        Object obj2 = this.x50lh2ztY7Y5;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                PxuCJdSBwIXG();
                x11 x11Var = (x11) obj2;
                int i4 = this.OPXfSBeufaJ8;
                this.OPXfSBeufaJ8 = i4 + 1;
                x11Var.add(i4, obj);
                this.wdg6QnbFHrFF = -1;
                i = ((AbstractList) x11Var).modCount;
                this.dgRBjINgWbAK = i;
                return;
            case 2:
                lS5Rgt96tfkO();
                z11 z11Var = (z11) obj2;
                int i5 = this.OPXfSBeufaJ8;
                this.OPXfSBeufaJ8 = i5 + 1;
                z11Var.add(i5, obj);
                this.wdg6QnbFHrFF = -1;
                i2 = ((AbstractList) z11Var).modCount;
                this.dgRBjINgWbAK = i2;
                return;
            default:
                TSizfFm2Yiuu();
                d82 d82Var = (d82) obj2;
                d82Var.add(this.OPXfSBeufaJ8 + 1, obj);
                this.wdg6QnbFHrFF = -1;
                this.OPXfSBeufaJ8++;
                this.dgRBjINgWbAK = ov2.BjEWd04qc7Mw(d82Var);
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.x50lh2ztY7Y5;
        switch (i) {
            case 0:
                if (this.OPXfSBeufaJ8 < this.dgRBjINgWbAK) {
                    break;
                }
                break;
            case 1:
                if (this.OPXfSBeufaJ8 < ((x11) obj).wdg6QnbFHrFF) {
                    break;
                }
                break;
            case 2:
                if (this.OPXfSBeufaJ8 < ((z11) obj).OPXfSBeufaJ8) {
                    break;
                }
                break;
            default:
                if (this.OPXfSBeufaJ8 < ((d82) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (this.OPXfSBeufaJ8 > this.wdg6QnbFHrFF) {
                }
                break;
            case 1:
                if (this.OPXfSBeufaJ8 > 0) {
                }
                break;
            case 2:
                if (this.OPXfSBeufaJ8 > 0) {
                }
                break;
            default:
                if (this.OPXfSBeufaJ8 >= 0) {
                }
                break;
        }
        return false;
    }

    public void lS5Rgt96tfkO() {
        int i;
        i = ((AbstractList) ((z11) this.x50lh2ztY7Y5)).modCount;
        if (i != this.dgRBjINgWbAK) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.x50lh2ztY7Y5;
        switch (i) {
            case 0:
                p81 p81Var = ((zj0) obj).rtx2ld2ELZv4;
                int i2 = this.OPXfSBeufaJ8;
                this.OPXfSBeufaJ8 = i2 + 1;
                Object a92UlCVFR9N8 = p81Var.a92UlCVFR9N8(i2);
                a92UlCVFR9N8.getClass();
                return (m61) a92UlCVFR9N8;
            case 1:
                PxuCJdSBwIXG();
                int i3 = this.OPXfSBeufaJ8;
                x11 x11Var = (x11) obj;
                if (i3 >= x11Var.wdg6QnbFHrFF) {
                    u9.RfyTYNmI9Srp();
                    return null;
                }
                this.OPXfSBeufaJ8 = i3 + 1;
                this.wdg6QnbFHrFF = i3;
                return x11Var.rtx2ld2ELZv4[x11Var.OPXfSBeufaJ8 + i3];
            case 2:
                lS5Rgt96tfkO();
                int i4 = this.OPXfSBeufaJ8;
                z11 z11Var = (z11) obj;
                if (i4 >= z11Var.OPXfSBeufaJ8) {
                    u9.RfyTYNmI9Srp();
                    return null;
                }
                this.OPXfSBeufaJ8 = i4 + 1;
                this.wdg6QnbFHrFF = i4;
                return z11Var.rtx2ld2ELZv4[i4];
            default:
                TSizfFm2Yiuu();
                int i5 = this.OPXfSBeufaJ8 + 1;
                this.wdg6QnbFHrFF = i5;
                d82 d82Var = (d82) obj;
                ov2.r3s1LDPKFs1S(i5, d82Var.size());
                Object obj2 = d82Var.get(i5);
                this.OPXfSBeufaJ8 = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return this.OPXfSBeufaJ8 - this.wdg6QnbFHrFF;
            case 1:
                return this.OPXfSBeufaJ8;
            case 2:
                return this.OPXfSBeufaJ8;
            default:
                return this.OPXfSBeufaJ8 + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.x50lh2ztY7Y5;
        switch (i) {
            case 0:
                p81 p81Var = ((zj0) obj).rtx2ld2ELZv4;
                int i2 = this.OPXfSBeufaJ8 - 1;
                this.OPXfSBeufaJ8 = i2;
                Object a92UlCVFR9N8 = p81Var.a92UlCVFR9N8(i2);
                a92UlCVFR9N8.getClass();
                return (m61) a92UlCVFR9N8;
            case 1:
                PxuCJdSBwIXG();
                int i3 = this.OPXfSBeufaJ8;
                if (i3 <= 0) {
                    u9.RfyTYNmI9Srp();
                    return null;
                }
                int i4 = i3 - 1;
                this.OPXfSBeufaJ8 = i4;
                this.wdg6QnbFHrFF = i4;
                x11 x11Var = (x11) obj;
                return x11Var.rtx2ld2ELZv4[x11Var.OPXfSBeufaJ8 + i4];
            case 2:
                lS5Rgt96tfkO();
                int i5 = this.OPXfSBeufaJ8;
                if (i5 <= 0) {
                    u9.RfyTYNmI9Srp();
                    return null;
                }
                int i6 = i5 - 1;
                this.OPXfSBeufaJ8 = i6;
                this.wdg6QnbFHrFF = i6;
                return ((z11) obj).rtx2ld2ELZv4[i6];
            default:
                TSizfFm2Yiuu();
                d82 d82Var = (d82) obj;
                ov2.r3s1LDPKFs1S(this.OPXfSBeufaJ8, d82Var.size());
                int i7 = this.OPXfSBeufaJ8;
                this.wdg6QnbFHrFF = i7;
                this.OPXfSBeufaJ8--;
                return d82Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return (this.OPXfSBeufaJ8 - this.wdg6QnbFHrFF) - 1;
            case 1:
                i = this.OPXfSBeufaJ8;
                break;
            case 2:
                i = this.OPXfSBeufaJ8;
                break;
            default:
                return this.OPXfSBeufaJ8;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.rtx2ld2ELZv4;
        Object obj = this.x50lh2ztY7Y5;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                x11 x11Var = (x11) obj;
                PxuCJdSBwIXG();
                int i4 = this.wdg6QnbFHrFF;
                if (i4 == -1) {
                    u9.rtx2ld2ELZv4("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                x11Var.lS5Rgt96tfkO(i4);
                this.OPXfSBeufaJ8 = this.wdg6QnbFHrFF;
                this.wdg6QnbFHrFF = -1;
                i = ((AbstractList) x11Var).modCount;
                this.dgRBjINgWbAK = i;
                return;
            case 2:
                z11 z11Var = (z11) obj;
                lS5Rgt96tfkO();
                int i5 = this.wdg6QnbFHrFF;
                if (i5 == -1) {
                    u9.rtx2ld2ELZv4("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                z11Var.lS5Rgt96tfkO(i5);
                this.OPXfSBeufaJ8 = this.wdg6QnbFHrFF;
                this.wdg6QnbFHrFF = -1;
                i2 = ((AbstractList) z11Var).modCount;
                this.dgRBjINgWbAK = i2;
                return;
            default:
                TSizfFm2Yiuu();
                d82 d82Var = (d82) obj;
                d82Var.remove(this.wdg6QnbFHrFF);
                this.OPXfSBeufaJ8--;
                this.wdg6QnbFHrFF = -1;
                this.dgRBjINgWbAK = ov2.BjEWd04qc7Mw(d82Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.rtx2ld2ELZv4;
        Object obj2 = this.x50lh2ztY7Y5;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                PxuCJdSBwIXG();
                int i2 = this.wdg6QnbFHrFF;
                if (i2 != -1) {
                    ((x11) obj2).set(i2, obj);
                    return;
                } else {
                    u9.rtx2ld2ELZv4("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                lS5Rgt96tfkO();
                int i3 = this.wdg6QnbFHrFF;
                if (i3 != -1) {
                    ((z11) obj2).set(i3, obj);
                    return;
                } else {
                    u9.rtx2ld2ELZv4("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                d82 d82Var = (d82) obj2;
                TSizfFm2Yiuu();
                int i4 = this.wdg6QnbFHrFF;
                if (i4 < 0) {
                    u9.rtx2ld2ELZv4("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    d82Var.set(i4, obj);
                    this.dgRBjINgWbAK = ov2.BjEWd04qc7Mw(d82Var);
                    return;
                }
        }
    }

    public xj0(z11 z11Var, int i) {
        int i2;
        this.rtx2ld2ELZv4 = 2;
        this.x50lh2ztY7Y5 = z11Var;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = -1;
        i2 = ((AbstractList) z11Var).modCount;
        this.dgRBjINgWbAK = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xj0(zj0 zj0Var, int i, int i2) {
        this(zj0Var, (i2 & 1) != 0 ? 0 : i, 0, zj0Var.rtx2ld2ELZv4.lS5Rgt96tfkO);
        this.rtx2ld2ELZv4 = 0;
    }

    public xj0(zj0 zj0Var, int i, int i2, int i3) {
        this.rtx2ld2ELZv4 = 0;
        this.x50lh2ztY7Y5 = zj0Var;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = i2;
        this.dgRBjINgWbAK = i3;
    }

    public xj0(x11 x11Var, int i) {
        int i2;
        this.rtx2ld2ELZv4 = 1;
        this.x50lh2ztY7Y5 = x11Var;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = -1;
        i2 = ((AbstractList) x11Var).modCount;
        this.dgRBjINgWbAK = i2;
    }
}
