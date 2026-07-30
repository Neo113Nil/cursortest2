package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p41 extends BjEWd04qc7Mw {
    public final o41 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ p41(o41 o41Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = o41Var;
    }

    @Override // defpackage.BjEWd04qc7Mw
    public final int PxuCJdSBwIXG() {
        switch (this.rtx2ld2ELZv4) {
        }
        return this.OPXfSBeufaJ8.gPXPFXrUH4XX;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                this.OPXfSBeufaJ8.clear();
                break;
            default:
                this.OPXfSBeufaJ8.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.rtx2ld2ELZv4;
        o41 o41Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                o41Var.getClass();
                int RAsUl2FVSrh6 = o41Var.RAsUl2FVSrh6(entry.getKey());
                if (RAsUl2FVSrh6 < 0) {
                    return false;
                }
                Object[] objArr = o41Var.OPXfSBeufaJ8;
                objArr.getClass();
                return cs0.wdg6QnbFHrFF(objArr[RAsUl2FVSrh6], entry.getValue());
            default:
                return o41Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                collection.getClass();
                return this.OPXfSBeufaJ8.e9gEMXR7LXtO(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.rtx2ld2ELZv4) {
        }
        return this.OPXfSBeufaJ8.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.rtx2ld2ELZv4;
        o41 o41Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                o41Var.getClass();
                return new l41(o41Var, 0);
            default:
                o41Var.getClass();
                return new l41(o41Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.rtx2ld2ELZv4;
        o41 o41Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    o41Var.getClass();
                    o41Var.TSizfFm2Yiuu();
                    int RAsUl2FVSrh6 = o41Var.RAsUl2FVSrh6(entry.getKey());
                    if (RAsUl2FVSrh6 >= 0) {
                        Object[] objArr = o41Var.OPXfSBeufaJ8;
                        objArr.getClass();
                        if (cs0.wdg6QnbFHrFF(objArr[RAsUl2FVSrh6], entry.getValue())) {
                            o41Var.dgRBjINgWbAK(RAsUl2FVSrh6);
                            break;
                        }
                    }
                }
                break;
            default:
                o41Var.TSizfFm2Yiuu();
                int RAsUl2FVSrh62 = o41Var.RAsUl2FVSrh6(obj);
                if (RAsUl2FVSrh62 >= 0) {
                    o41Var.dgRBjINgWbAK(RAsUl2FVSrh62);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        o41 o41Var = this.OPXfSBeufaJ8;
        collection.getClass();
        switch (i) {
            case 0:
                o41Var.TSizfFm2Yiuu();
                break;
            default:
                o41Var.TSizfFm2Yiuu();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.rtx2ld2ELZv4;
        o41 o41Var = this.OPXfSBeufaJ8;
        collection.getClass();
        switch (i) {
            case 0:
                o41Var.TSizfFm2Yiuu();
                break;
            default:
                o41Var.TSizfFm2Yiuu();
                break;
        }
        return super.retainAll(collection);
    }
}
