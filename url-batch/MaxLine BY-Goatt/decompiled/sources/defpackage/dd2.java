package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class dd2 implements Iterable {
    public ad2 m;
    public ad2 n;
    public final WeakHashMap o = new WeakHashMap();
    public int p = 0;

    public ad2 a(Object obj) {
        ad2 ad2Var = this.m;
        while (ad2Var != null && !ad2Var.m.equals(obj)) {
            ad2Var = ad2Var.o;
        }
        return ad2Var;
    }

    public Object b(Object obj) {
        ad2 a = a(obj);
        if (a == null) {
            return null;
        }
        this.p--;
        WeakHashMap weakHashMap = this.o;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((cd2) it.next()).a(a);
            }
        }
        ad2 ad2Var = a.p;
        ad2 ad2Var2 = a.o;
        if (ad2Var != null) {
            ad2Var.o = ad2Var2;
        } else {
            this.m = ad2Var2;
        }
        ad2 ad2Var3 = a.o;
        if (ad2Var3 != null) {
            ad2Var3.p = ad2Var;
        } else {
            this.n = ad2Var;
        }
        a.o = null;
        a.p = null;
        return a.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.zc2) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dd2)) {
            return false;
        }
        dd2 dd2Var = (dd2) obj;
        if (this.p != dd2Var.p) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = dd2Var.iterator();
        while (true) {
            zc2 zc2Var = (zc2) it;
            if (!zc2Var.hasNext()) {
                break;
            }
            zc2 zc2Var2 = (zc2) it2;
            if (!zc2Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) zc2Var.next();
            Object next = zc2Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            zc2 zc2Var = (zc2) it;
            if (!zc2Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) zc2Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        zc2 zc2Var = new zc2(this.m, this.n, 0);
        this.o.put(zc2Var, Boolean.FALSE);
        return zc2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            zc2 zc2Var = (zc2) it;
            if (!zc2Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) zc2Var.next()).toString());
            if (zc2Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
