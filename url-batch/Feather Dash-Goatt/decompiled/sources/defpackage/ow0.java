package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ow0 extends h0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ ow0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.h0
    public final int a() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((jw0) this.e).c();
            case 1:
                return ((jw0) this.e).c();
            default:
                return ((xj0) this.e).m;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.d) {
            case 2:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((jw0) this.e).clear();
                break;
            case 1:
                ((jw0) this.e).clear();
                break;
            default:
                ((xj0) this.e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                jw0 jw0Var = (jw0) this.e;
                Object obj3 = jw0Var.get(entry.getKey());
                return obj3 != null ? obj3.equals(entry.getValue()) : entry.getValue() == null && jw0Var.containsKey(entry.getKey());
            case 1:
                return ((jw0) obj2).containsKey(obj);
            default:
                return ((xj0) obj2).containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.d) {
            case 2:
                return ((xj0) this.e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new z((jw0) obj);
            case 1:
                jw0 jw0Var = (jw0) obj;
                pj1[] pj1VarArr = new pj1[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    pj1VarArr[i2] = new qj1(1);
                }
                return new pw0(jw0Var, pj1VarArr);
            default:
                xj0 xj0Var = (xj0) obj;
                xj0Var.getClass();
                return new uj0(xj0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((jw0) this.e).remove(entry.getKey(), entry.getValue());
            case 1:
                jw0 jw0Var = (jw0) obj2;
                if (!jw0Var.containsKey(obj)) {
                    return false;
                }
                jw0Var.remove(obj);
                return true;
            default:
                xj0 xj0Var = (xj0) obj2;
                xj0Var.b();
                int f = xj0Var.f(obj);
                if (f < 0) {
                    return false;
                }
                xj0Var.j(f);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.d) {
            case 2:
                collection.getClass();
                ((xj0) this.e).b();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.d) {
            case 2:
                collection.getClass();
                ((xj0) this.e).b();
                break;
        }
        return super.retainAll(collection);
    }
}
