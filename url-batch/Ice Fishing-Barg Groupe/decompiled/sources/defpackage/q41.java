package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q41 extends AbstractCollection implements Collection, fu0 {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ q41(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ((o41) this.OPXfSBeufaJ8).clear();
                break;
            default:
                ((gl1) this.OPXfSBeufaJ8).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((o41) this.OPXfSBeufaJ8).containsValue(obj);
            default:
                return ((gl1) this.OPXfSBeufaJ8).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((o41) this.OPXfSBeufaJ8).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                o41 o41Var = (o41) obj;
                o41Var.getClass();
                return new l41(o41Var, 2);
            default:
                gl1 gl1Var = (gl1) obj;
                ul2[] ul2VarArr = new ul2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    ul2VarArr[i2] = new vl2(2);
                }
                return new pl1(gl1Var, ul2VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                o41 o41Var = (o41) this.OPXfSBeufaJ8;
                o41Var.TSizfFm2Yiuu();
                int rtx2ld2ELZv4 = o41Var.rtx2ld2ELZv4(obj);
                if (rtx2ld2ELZv4 < 0) {
                    return false;
                }
                o41Var.dgRBjINgWbAK(rtx2ld2ELZv4);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                collection.getClass();
                ((o41) this.OPXfSBeufaJ8).TSizfFm2Yiuu();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                collection.getClass();
                ((o41) this.OPXfSBeufaJ8).TSizfFm2Yiuu();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return ((o41) this.OPXfSBeufaJ8).gPXPFXrUH4XX;
            default:
                return ((gl1) this.OPXfSBeufaJ8).x50lh2ztY7Y5;
        }
    }
}
