package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ib2 implements Collection, fu0 {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 0;

    public ib2() {
        int i = sh1.PxuCJdSBwIXG;
        this.OPXfSBeufaJ8 = new q81(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((q81) this.OPXfSBeufaJ8).PxuCJdSBwIXG(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ((q81) this.OPXfSBeufaJ8).lS5Rgt96tfkO();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((q81) this.OPXfSBeufaJ8).TSizfFm2Yiuu(obj);
            default:
                return ((v81) this.OPXfSBeufaJ8).Y1f8riQaR6yg(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((q81) obj).TSizfFm2Yiuu(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((v81) obj).Y1f8riQaR6yg(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((q81) this.OPXfSBeufaJ8).RAsUl2FVSrh6 == 0;
            default:
                return ((v81) this.OPXfSBeufaJ8).OPXfSBeufaJ8();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                q81 q81Var = (q81) this.OPXfSBeufaJ8;
                q81Var.getClass();
                return new lg0(new s81(q81Var));
            default:
                return xi0.nLZGh9p8gVSu(new g60(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((q81) this.OPXfSBeufaJ8).RAsUl2FVSrh6(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((q81) this.OPXfSBeufaJ8).RAsUl2FVSrh6(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((q81) this.OPXfSBeufaJ8).OPXfSBeufaJ8(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((q81) this.OPXfSBeufaJ8).RAsUl2FVSrh6;
            default:
                return ((v81) this.OPXfSBeufaJ8).e9gEMXR7LXtO;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return mm2.KUoIVIumpKat(this, objArr);
    }

    public ib2(v81 v81Var) {
        v81Var.getClass();
        this.OPXfSBeufaJ8 = v81Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.rtx2ld2ELZv4) {
        }
        return mm2.yQRudnv4La6p(this);
    }
}
