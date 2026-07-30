package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n81 implements List, fu0 {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ n81(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.rtx2ld2ELZv4;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i3) {
            case 0:
                p81 p81Var = (p81) obj2;
                if (i < 0 || i > (i2 = p81Var.lS5Rgt96tfkO)) {
                    p81Var.gPXPFXrUH4XX(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = p81Var.PxuCJdSBwIXG;
                if (objArr.length < i4) {
                    p81Var.cpQdD2nAriOS(i4, objArr);
                }
                Object[] objArr2 = p81Var.PxuCJdSBwIXG;
                int i5 = p81Var.lS5Rgt96tfkO;
                if (i != i5) {
                    na.VzNxmvWisHL1(objArr2, objArr2, i + 1, i, i5);
                }
                objArr2[i] = obj;
                p81Var.lS5Rgt96tfkO++;
                return;
            default:
                ((f91) obj2).PxuCJdSBwIXG(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                collection.getClass();
                p81 p81Var = (p81) obj;
                if (i < 0 || i > p81Var.lS5Rgt96tfkO) {
                    p81Var.gPXPFXrUH4XX(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + p81Var.lS5Rgt96tfkO;
                Object[] objArr = p81Var.PxuCJdSBwIXG;
                if (objArr.length < size) {
                    p81Var.cpQdD2nAriOS(size, objArr);
                }
                Object[] objArr2 = p81Var.PxuCJdSBwIXG;
                if (i != p81Var.lS5Rgt96tfkO) {
                    na.VzNxmvWisHL1(objArr2, objArr2, collection.size() + i, i, p81Var.lS5Rgt96tfkO);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        fx1.mFd1aGiJX24N();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                p81Var.lS5Rgt96tfkO = collection.size() + p81Var.lS5Rgt96tfkO;
                return true;
            default:
                return ((f91) obj).e9gEMXR7LXtO(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                ((p81) obj).Y1f8riQaR6yg();
                break;
            default:
                ((f91) obj).RAsUl2FVSrh6();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.rtx2ld2ELZv4;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((p81) obj2).RAsUl2FVSrh6(obj) >= 0;
            default:
                return ((f91) obj2).rtx2ld2ELZv4(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                collection.getClass();
                p81 p81Var = (p81) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (p81Var.RAsUl2FVSrh6(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                f91 f91Var = (f91) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!f91Var.rtx2ld2ELZv4(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                pe1.PxuCJdSBwIXG(i, this);
                return ((p81) obj).a92UlCVFR9N8(i);
            default:
                g91.PxuCJdSBwIXG(i, this);
                return ((f91) obj).rtx2ld2ELZv4[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.rtx2ld2ELZv4;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((p81) obj2).RAsUl2FVSrh6(obj);
            default:
                return ((f91) obj2).OPXfSBeufaJ8(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((p81) obj).rtx2ld2ELZv4();
            default:
                return ((f91) obj).wdg6QnbFHrFF == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return new m81(this, 0, 0);
            default:
                return new m81(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.rtx2ld2ELZv4;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                p81 p81Var = (p81) obj2;
                Object[] objArr = p81Var.PxuCJdSBwIXG;
                int i3 = p81Var.lS5Rgt96tfkO;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                f91 f91Var = (f91) obj2;
                Object[] objArr2 = f91Var.rtx2ld2ELZv4;
                for (int i4 = f91Var.wdg6QnbFHrFF - 1; i4 >= 0; i4--) {
                    if (cs0.wdg6QnbFHrFF(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return new m81(this, 0, 0);
            default:
                return new m81(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                pe1.PxuCJdSBwIXG(i, this);
                return ((p81) obj).dgRBjINgWbAK(i);
            default:
                g91.PxuCJdSBwIXG(i, this);
                return ((f91) obj).dgRBjINgWbAK(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                collection.getClass();
                p81 p81Var = (p81) obj;
                int i2 = p81Var.lS5Rgt96tfkO;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    p81Var.wdg6QnbFHrFF(it.next());
                }
                if (i2 == p81Var.lS5Rgt96tfkO) {
                    break;
                }
                break;
            default:
                f91 f91Var = (f91) obj;
                if (!collection.isEmpty()) {
                    int i3 = f91Var.wdg6QnbFHrFF;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        f91Var.wdg6QnbFHrFF(it2.next());
                    }
                    if (i3 != f91Var.wdg6QnbFHrFF) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                collection.getClass();
                p81 p81Var = (p81) obj;
                int i2 = p81Var.lS5Rgt96tfkO;
                Object[] objArr = p81Var.PxuCJdSBwIXG;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        p81Var.dgRBjINgWbAK(i3);
                    }
                }
                if (i2 != p81Var.lS5Rgt96tfkO) {
                    break;
                }
                break;
            default:
                f91 f91Var = (f91) obj;
                int i4 = f91Var.wdg6QnbFHrFF;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(f91Var.rtx2ld2ELZv4[i5])) {
                        f91Var.dgRBjINgWbAK(i5);
                    }
                }
                if (i4 != f91Var.wdg6QnbFHrFF) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.rtx2ld2ELZv4;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                pe1.PxuCJdSBwIXG(i, this);
                return ((p81) obj2).r3s1LDPKFs1S(i, obj);
            default:
                g91.PxuCJdSBwIXG(i, this);
                Object[] objArr = ((f91) obj2).rtx2ld2ELZv4;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((p81) obj).lS5Rgt96tfkO;
            default:
                return ((f91) obj).wdg6QnbFHrFF;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                pe1.lS5Rgt96tfkO(this, i, i2);
                return new o81(this, i, i2, 0);
            default:
                g91.lS5Rgt96tfkO(this, i, i2);
                return new o81(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                objArr.getClass();
                break;
        }
        return mm2.KUoIVIumpKat(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.rtx2ld2ELZv4) {
        }
        return mm2.yQRudnv4La6p(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return new m81(this, i, 0);
            default:
                return new m81(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.rtx2ld2ELZv4;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((p81) obj2).wdg6QnbFHrFF(obj);
            default:
                return ((f91) obj2).wdg6QnbFHrFF(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.rtx2ld2ELZv4;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                ((p81) obj2).PxuCJdSBwIXG(obj);
                break;
            default:
                ((f91) obj2).lS5Rgt96tfkO(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                collection.getClass();
                p81 p81Var = (p81) obj;
                int i2 = p81Var.lS5Rgt96tfkO;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    p81Var.PxuCJdSBwIXG(it.next());
                }
                return i2 != p81Var.lS5Rgt96tfkO;
            default:
                f91 f91Var = (f91) obj;
                return f91Var.e9gEMXR7LXtO(f91Var.wdg6QnbFHrFF, collection);
        }
    }
}
