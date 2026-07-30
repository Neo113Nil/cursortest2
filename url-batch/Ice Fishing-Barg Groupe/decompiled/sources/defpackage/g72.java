package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g72 extends tmVwIGCQF4zR {
    public static final f72 Companion = new f72();
    public static final g72 OPXfSBeufaJ8 = new g72(new Object[0]);
    public final Object[] rtx2ld2ELZv4;

    public g72(Object[] objArr) {
        this.rtx2ld2ELZv4 = objArr;
    }

    @Override // defpackage.QrzZRwfaDlRX
    public final int PxuCJdSBwIXG() {
        return this.rtx2ld2ELZv4.length;
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR RAsUl2FVSrh6(int i) {
        Object[] objArr = this.rtx2ld2ELZv4;
        sj0.x50lh2ztY7Y5(i, objArr.length);
        if (objArr.length == 1) {
            return OPXfSBeufaJ8;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        na.VzNxmvWisHL1(objArr, copyOf, i, i + 1, objArr.length);
        return new g72(copyOf);
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR TSizfFm2Yiuu(Object obj) {
        Object[] objArr = this.rtx2ld2ELZv4;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new g72(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new ul1(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR Y1f8riQaR6yg(Collection collection) {
        Object[] objArr = this.rtx2ld2ELZv4;
        if (collection.size() + objArr.length > 32) {
            vl1 e9gEMXR7LXtO = e9gEMXR7LXtO();
            e9gEMXR7LXtO.addAll(collection);
            return e9gEMXR7LXtO.TSizfFm2Yiuu();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new g72(copyOf);
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR a92UlCVFR9N8(ozEBbv0hFTAB ozebbv0hftab) {
        Object[] objArr = this.rtx2ld2ELZv4;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) ozebbv0hftab.OPXfSBeufaJ8(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? OPXfSBeufaJ8 : new g72(na.fRTaYY6FBZcX(objArr2, 0, length));
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final vl1 e9gEMXR7LXtO() {
        return new vl1(this, null, this.rtx2ld2ELZv4, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.rtx2ld2ELZv4;
        sj0.x50lh2ztY7Y5(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final int indexOf(Object obj) {
        return na.hnJvRxDXo0hm(this.rtx2ld2ELZv4, obj);
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR lS5Rgt96tfkO(int i, Object obj) {
        Object[] objArr = this.rtx2ld2ELZv4;
        sj0.cpQdD2nAriOS(i, objArr.length);
        if (i == objArr.length) {
            return TSizfFm2Yiuu(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            na.hVNtCUZb4tYH(objArr, objArr2, 0, i, 6);
            na.VzNxmvWisHL1(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new g72(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        na.VzNxmvWisHL1(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new ul1(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.rtx2ld2ELZv4;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.rtx2ld2ELZv4;
        sj0.cpQdD2nAriOS(i, objArr.length);
        return new zf(objArr, i, objArr.length);
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR rtx2ld2ELZv4(int i, Object obj) {
        Object[] objArr = this.rtx2ld2ELZv4;
        sj0.x50lh2ztY7Y5(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new g72(copyOf);
    }
}
