package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o81 implements List, fu0 {
    public final List OPXfSBeufaJ8;
    public int dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    public /* synthetic */ o81(List list, int i, int i2, int i3) {
        this.rtx2ld2ELZv4 = i3;
        this.OPXfSBeufaJ8 = list;
        this.wdg6QnbFHrFF = i;
        this.dgRBjINgWbAK = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.rtx2ld2ELZv4;
        int i3 = this.wdg6QnbFHrFF;
        List list = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.dgRBjINgWbAK++;
                break;
            default:
                list.add(i + i3, obj);
                this.dgRBjINgWbAK++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.rtx2ld2ELZv4;
        int i3 = this.wdg6QnbFHrFF;
        List list = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.dgRBjINgWbAK = collection.size() + this.dgRBjINgWbAK;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.dgRBjINgWbAK += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        int i2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                int i3 = this.dgRBjINgWbAK - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.dgRBjINgWbAK = i2;
                break;
            default:
                int i4 = this.dgRBjINgWbAK - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.dgRBjINgWbAK = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        int i2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                int i3 = this.dgRBjINgWbAK;
                while (i2 < i3) {
                    if (cs0.wdg6QnbFHrFF(list.get(i2), obj)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
            default:
                int i4 = this.dgRBjINgWbAK;
                while (i2 < i4) {
                    if (cs0.wdg6QnbFHrFF(list.get(i2), obj)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
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
        int i3 = this.wdg6QnbFHrFF;
        List list = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                pe1.PxuCJdSBwIXG(i, this);
                break;
            default:
                g91.PxuCJdSBwIXG(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        int i2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                int i3 = this.dgRBjINgWbAK;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (cs0.wdg6QnbFHrFF(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.dgRBjINgWbAK;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (cs0.wdg6QnbFHrFF(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (this.dgRBjINgWbAK == this.wdg6QnbFHrFF) {
                }
                break;
            default:
                if (this.dgRBjINgWbAK == this.wdg6QnbFHrFF) {
                }
                break;
        }
        return false;
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
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        int i2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                int i3 = this.dgRBjINgWbAK - 1;
                if (i2 <= i3) {
                    while (!cs0.wdg6QnbFHrFF(list.get(i3), obj)) {
                        if (i3 == i2) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                    break;
                }
                break;
            default:
                int i4 = this.dgRBjINgWbAK - 1;
                if (i2 <= i4) {
                    while (!cs0.wdg6QnbFHrFF(list.get(i4), obj)) {
                        if (i4 == i2) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.rtx2ld2ELZv4;
        int i2 = this.wdg6QnbFHrFF;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                int i3 = this.dgRBjINgWbAK;
                while (i2 < i3) {
                    if (cs0.wdg6QnbFHrFF(list.get(i2), obj)) {
                        list.remove(i2);
                        this.dgRBjINgWbAK--;
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
            default:
                int i4 = this.dgRBjINgWbAK;
                while (i2 < i4) {
                    if (cs0.wdg6QnbFHrFF(list.get(i2), obj)) {
                        list.remove(i2);
                        this.dgRBjINgWbAK--;
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                collection.getClass();
                int i = this.dgRBjINgWbAK;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.dgRBjINgWbAK) {
                    break;
                }
                break;
            default:
                int i2 = this.dgRBjINgWbAK;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.dgRBjINgWbAK) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        int i2 = this.wdg6QnbFHrFF;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.dgRBjINgWbAK;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.dgRBjINgWbAK--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.dgRBjINgWbAK) {
                    break;
                }
                break;
            default:
                int i5 = this.dgRBjINgWbAK;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.dgRBjINgWbAK--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.dgRBjINgWbAK) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.rtx2ld2ELZv4;
        int i3 = this.wdg6QnbFHrFF;
        List list = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                pe1.PxuCJdSBwIXG(i, this);
                break;
            default:
                g91.PxuCJdSBwIXG(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                i = this.dgRBjINgWbAK;
                i2 = this.wdg6QnbFHrFF;
                break;
            default:
                i = this.dgRBjINgWbAK;
                i2 = this.wdg6QnbFHrFF;
                break;
        }
        return i - i2;
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
    public final boolean add(Object obj) {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                int i2 = this.dgRBjINgWbAK;
                this.dgRBjINgWbAK = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.dgRBjINgWbAK;
                this.dgRBjINgWbAK = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.dgRBjINgWbAK, collection);
                this.dgRBjINgWbAK = collection.size() + this.dgRBjINgWbAK;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(this.dgRBjINgWbAK, collection);
                int size = collection.size();
                this.dgRBjINgWbAK += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.rtx2ld2ELZv4;
        int i3 = this.wdg6QnbFHrFF;
        List list = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                pe1.PxuCJdSBwIXG(i, this);
                this.dgRBjINgWbAK--;
                return list.remove(i + i3);
            default:
                g91.PxuCJdSBwIXG(i, this);
                this.dgRBjINgWbAK--;
                return list.remove(i + i3);
        }
    }
}
