package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zh1 extends r0 {
    public final /* synthetic */ int m;
    public final Object n;

    public /* synthetic */ zh1(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.r0
    public final int a() {
        switch (this.m) {
            case 0:
                return ((uh1) this.n).u;
            default:
                return ((u02) this.n).c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.m) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.m) {
            case 0:
                ((uh1) this.n).clear();
                break;
            default:
                ((u02) this.n).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.m) {
            case 0:
                return ((uh1) this.n).containsValue(obj);
            default:
                return ((u02) this.n).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.m) {
            case 0:
                return ((uh1) this.n).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                uh1 uh1Var = (uh1) obj;
                uh1Var.getClass();
                return new vh1(uh1Var, 2);
            default:
                u02 u02Var = (u02) obj;
                vz2[] vz2VarArr = new vz2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    vz2VarArr[i2] = new wz2(2);
                }
                return new a12(u02Var, vz2VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.m) {
            case 0:
                uh1 uh1Var = (uh1) this.n;
                uh1Var.c();
                int h = uh1Var.h(obj);
                if (h < 0) {
                    return false;
                }
                uh1Var.k(h);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.m) {
            case 0:
                collection.getClass();
                ((uh1) this.n).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.m) {
            case 0:
                collection.getClass();
                ((uh1) this.n).c();
                break;
        }
        return super.retainAll(collection);
    }
}
