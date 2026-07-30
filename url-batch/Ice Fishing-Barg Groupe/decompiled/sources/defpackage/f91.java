package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f91 implements RandomAccess {
    public n81 OPXfSBeufaJ8;
    public Object[] rtx2ld2ELZv4;
    public int wdg6QnbFHrFF = 0;

    public f91(Object[] objArr) {
        this.rtx2ld2ELZv4 = objArr;
    }

    public final int OPXfSBeufaJ8(Object obj) {
        Object[] objArr = this.rtx2ld2ELZv4;
        int i = this.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            if (cs0.wdg6QnbFHrFF(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final void PxuCJdSBwIXG(int i, Object obj) {
        int i2 = this.wdg6QnbFHrFF + 1;
        if (this.rtx2ld2ELZv4.length < i2) {
            cpQdD2nAriOS(i2);
        }
        Object[] objArr = this.rtx2ld2ELZv4;
        int i3 = this.wdg6QnbFHrFF;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.wdg6QnbFHrFF++;
    }

    public final void RAsUl2FVSrh6() {
        Object[] objArr = this.rtx2ld2ELZv4;
        int i = this.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.wdg6QnbFHrFF = 0;
    }

    public final void TSizfFm2Yiuu(int i, f91 f91Var) {
        int i2 = f91Var.wdg6QnbFHrFF;
        if (i2 == 0) {
            return;
        }
        int i3 = this.wdg6QnbFHrFF + i2;
        if (this.rtx2ld2ELZv4.length < i3) {
            cpQdD2nAriOS(i3);
        }
        Object[] objArr = this.rtx2ld2ELZv4;
        int i4 = this.wdg6QnbFHrFF;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(f91Var.rtx2ld2ELZv4, 0, objArr, i, i2);
        this.wdg6QnbFHrFF += i2;
    }

    public final void Y1f8riQaR6yg(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.wdg6QnbFHrFF + size;
        if (this.rtx2ld2ELZv4.length < i2) {
            cpQdD2nAriOS(i2);
        }
        Object[] objArr = this.rtx2ld2ELZv4;
        int i3 = this.wdg6QnbFHrFF;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.wdg6QnbFHrFF += size;
    }

    public final List a92UlCVFR9N8() {
        n81 n81Var = this.OPXfSBeufaJ8;
        if (n81Var != null) {
            return n81Var;
        }
        n81 n81Var2 = new n81(1, this);
        this.OPXfSBeufaJ8 = n81Var2;
        return n81Var2;
    }

    public final void cpQdD2nAriOS(int i) {
        Object[] objArr = this.rtx2ld2ELZv4;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.rtx2ld2ELZv4 = objArr2;
    }

    public final Object dgRBjINgWbAK(int i) {
        Object[] objArr = this.rtx2ld2ELZv4;
        Object obj = objArr[i];
        int i2 = this.wdg6QnbFHrFF;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.wdg6QnbFHrFF - 1;
        this.wdg6QnbFHrFF = i4;
        objArr[i4] = null;
        return obj;
    }

    public final boolean e9gEMXR7LXtO(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.wdg6QnbFHrFF + size;
        if (this.rtx2ld2ELZv4.length < i3) {
            cpQdD2nAriOS(i3);
        }
        Object[] objArr = this.rtx2ld2ELZv4;
        int i4 = this.wdg6QnbFHrFF;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                fx1.mFd1aGiJX24N();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.wdg6QnbFHrFF += size;
        return true;
    }

    public final void lS5Rgt96tfkO(Object obj) {
        int i = this.wdg6QnbFHrFF + 1;
        if (this.rtx2ld2ELZv4.length < i) {
            cpQdD2nAriOS(i);
        }
        Object[] objArr = this.rtx2ld2ELZv4;
        int i2 = this.wdg6QnbFHrFF;
        objArr[i2] = obj;
        this.wdg6QnbFHrFF = i2 + 1;
    }

    public final boolean rtx2ld2ELZv4(Object obj) {
        int i = this.wdg6QnbFHrFF - 1;
        if (i >= 0) {
            for (int i2 = 0; !cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean wdg6QnbFHrFF(Object obj) {
        int OPXfSBeufaJ8 = OPXfSBeufaJ8(obj);
        if (OPXfSBeufaJ8 < 0) {
            return false;
        }
        dgRBjINgWbAK(OPXfSBeufaJ8);
        return true;
    }

    public final void x50lh2ztY7Y5(int i, int i2) {
        if (i2 > i) {
            int i3 = this.wdg6QnbFHrFF;
            if (i2 < i3) {
                Object[] objArr = this.rtx2ld2ELZv4;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.wdg6QnbFHrFF;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.rtx2ld2ELZv4[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.wdg6QnbFHrFF = i5;
        }
    }
}
