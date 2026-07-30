package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ge1 extends AbstractSet {
    public final /* synthetic */ int m;
    public final /* synthetic */ ie1 n;

    public /* synthetic */ ge1(ie1 ie1Var, int i) {
        this.m = i;
        this.n = ie1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.m;
        ie1 ie1Var = this.n;
        switch (i) {
            case 0:
                ie1Var.clear();
                break;
            default:
                ie1Var.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        he1 a;
        Object obj2;
        Object value;
        int i = this.m;
        ie1 ie1Var = this.n;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                he1 he1Var = null;
                if (key != null) {
                    try {
                        a = ie1Var.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && ((obj2 = a.s) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        he1Var = a;
                    }
                    return he1Var == null;
                }
                a = null;
                if (a != null) {
                    he1Var = a;
                }
                if (he1Var == null) {
                }
            default:
                return ie1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.m;
        ie1 ie1Var = this.n;
        switch (i) {
            case 0:
                return new fe1(ie1Var, 0);
            default:
                return new fe1(ie1Var, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        he1 a;
        Object obj2;
        Object value;
        int i = this.m;
        he1 he1Var = null;
        ie1 ie1Var = this.n;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    if (key != null) {
                        try {
                            a = ie1Var.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (a != null && ((obj2 = a.s) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                            he1Var = a;
                        }
                        if (he1Var == null) {
                            ie1Var.c(he1Var, true);
                            break;
                        }
                    }
                    a = null;
                    if (a != null) {
                        he1Var = a;
                    }
                    if (he1Var == null) {
                    }
                }
                break;
            default:
                if (obj != null) {
                    try {
                        he1Var = ie1Var.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (he1Var != null) {
                    ie1Var.c(he1Var, true);
                }
                if (he1Var != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.m;
        ie1 ie1Var = this.n;
        switch (i) {
        }
        return ie1Var.o;
    }
}
