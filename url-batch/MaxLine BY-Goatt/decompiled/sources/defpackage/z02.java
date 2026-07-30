package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z02 extends u0 {
    public final /* synthetic */ int m;
    public final Object n;

    public /* synthetic */ z02(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.u0
    public final int a() {
        switch (this.m) {
            case 0:
                return ((u02) this.n).c();
            case 1:
                return ((u02) this.n).c();
            default:
                return ((uh1) this.n).u;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.m) {
            case 2:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.m) {
            case 0:
                ((u02) this.n).clear();
                break;
            case 1:
                ((u02) this.n).clear();
                break;
            default:
                ((uh1) this.n).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.m;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                u02 u02Var = (u02) this.n;
                Object obj3 = u02Var.get(entry.getKey());
                return obj3 != null ? obj3.equals(entry.getValue()) : entry.getValue() == null && u02Var.containsKey(entry.getKey());
            case 1:
                return ((u02) obj2).containsKey(obj);
            default:
                return ((uh1) obj2).containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.m) {
            case 2:
                return ((uh1) this.n).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                return new n0((u02) obj);
            case 1:
                u02 u02Var = (u02) obj;
                vz2[] vz2VarArr = new vz2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    vz2VarArr[i2] = new wz2(1);
                }
                return new a12(u02Var, vz2VarArr);
            default:
                uh1 uh1Var = (uh1) obj;
                uh1Var.getClass();
                return new vh1(uh1Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.m;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((u02) this.n).remove(entry.getKey(), entry.getValue());
            case 1:
                u02 u02Var = (u02) obj2;
                if (!u02Var.containsKey(obj)) {
                    return false;
                }
                u02Var.remove(obj);
                return true;
            default:
                uh1 uh1Var = (uh1) obj2;
                uh1Var.c();
                int g = uh1Var.g(obj);
                if (g < 0) {
                    return false;
                }
                uh1Var.k(g);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.m) {
            case 2:
                collection.getClass();
                ((uh1) this.n).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.m) {
            case 2:
                collection.getClass();
                ((uh1) this.n).c();
                break;
        }
        return super.retainAll(collection);
    }
}
