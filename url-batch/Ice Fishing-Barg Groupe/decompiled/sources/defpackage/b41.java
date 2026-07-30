package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class b41 {
    public final int PxuCJdSBwIXG;
    public final fb0 TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public int a92UlCVFR9N8;
    public int e9gEMXR7LXtO;
    public final zo0 lS5Rgt96tfkO;

    public b41(int i) {
        this.PxuCJdSBwIXG = i;
        if (i <= 0) {
            u9.XL4ISE6Oc65B("maxSize <= 0");
            throw null;
        }
        this.lS5Rgt96tfkO = new zo0(1);
        this.TSizfFm2Yiuu = new fb0(6);
    }

    public Object PxuCJdSBwIXG(Object obj) {
        obj.getClass();
        return null;
    }

    public final Object TSizfFm2Yiuu(Object obj) {
        Object put;
        obj.getClass();
        synchronized (this.TSizfFm2Yiuu) {
            zo0 zo0Var = this.lS5Rgt96tfkO;
            zo0Var.getClass();
            Object obj2 = zo0Var.PxuCJdSBwIXG.get(obj);
            if (obj2 != null) {
                this.e9gEMXR7LXtO++;
                return obj2;
            }
            this.a92UlCVFR9N8++;
            Object PxuCJdSBwIXG = PxuCJdSBwIXG(obj);
            if (PxuCJdSBwIXG == null) {
                return null;
            }
            synchronized (this.TSizfFm2Yiuu) {
                try {
                    zo0 zo0Var2 = this.lS5Rgt96tfkO;
                    zo0Var2.getClass();
                    put = zo0Var2.PxuCJdSBwIXG.put(obj, PxuCJdSBwIXG);
                    if (put != null) {
                        zo0 zo0Var3 = this.lS5Rgt96tfkO;
                        zo0Var3.getClass();
                        zo0Var3.PxuCJdSBwIXG.put(obj, put);
                    } else {
                        this.Y1f8riQaR6yg++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                lS5Rgt96tfkO(obj, PxuCJdSBwIXG, put);
                return put;
            }
            a92UlCVFR9N8(this.PxuCJdSBwIXG);
            return PxuCJdSBwIXG;
        }
    }

    public final Object Y1f8riQaR6yg(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (this.TSizfFm2Yiuu) {
            this.Y1f8riQaR6yg++;
            zo0 zo0Var = this.lS5Rgt96tfkO;
            zo0Var.getClass();
            put = zo0Var.PxuCJdSBwIXG.put(obj, obj2);
            if (put != null) {
                this.Y1f8riQaR6yg--;
            }
        }
        if (put != null) {
            lS5Rgt96tfkO(obj, put, obj2);
        }
        a92UlCVFR9N8(this.PxuCJdSBwIXG);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:16:0x0019, B:18:0x001d, B:20:0x0028, B:22:0x003a, B:25:0x0059, B:27:0x005f, B:33:0x0044, B:34:0x004a, B:37:0x0055, B:12:0x0085, B:13:0x008c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a92UlCVFR9N8(int i) {
        Object next;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.TSizfFm2Yiuu) {
                try {
                    if (this.Y1f8riQaR6yg < 0 || (this.lS5Rgt96tfkO.PxuCJdSBwIXG.isEmpty() && this.Y1f8riQaR6yg != 0)) {
                        break;
                    }
                    if (this.Y1f8riQaR6yg <= i || this.lS5Rgt96tfkO.PxuCJdSBwIXG.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.lS5Rgt96tfkO.PxuCJdSBwIXG.entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                            entry = (Map.Entry) next;
                            if (entry != null) {
                                return;
                            }
                            key = entry.getKey();
                            value = entry.getValue();
                            zo0 zo0Var = this.lS5Rgt96tfkO;
                            zo0Var.getClass();
                            key.getClass();
                            zo0Var.PxuCJdSBwIXG.remove(key);
                            int i2 = this.Y1f8riQaR6yg;
                            value.getClass();
                            this.Y1f8riQaR6yg = i2 - 1;
                        }
                        next = null;
                        entry = (Map.Entry) next;
                        if (entry != null) {
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        } else {
                            next = null;
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            lS5Rgt96tfkO(key, value, null);
        }
    }

    public final Object e9gEMXR7LXtO(Object obj) {
        Object remove;
        synchronized (this.TSizfFm2Yiuu) {
            zo0 zo0Var = this.lS5Rgt96tfkO;
            zo0Var.getClass();
            remove = zo0Var.PxuCJdSBwIXG.remove(obj);
            if (remove != null) {
                this.Y1f8riQaR6yg--;
            }
        }
        if (remove != null) {
            lS5Rgt96tfkO(obj, remove, null);
        }
        return remove;
    }

    public void lS5Rgt96tfkO(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public final String toString() {
        String str;
        synchronized (this.TSizfFm2Yiuu) {
            try {
                int i = this.e9gEMXR7LXtO;
                int i2 = this.a92UlCVFR9N8 + i;
                str = "LruCache[maxSize=" + this.PxuCJdSBwIXG + ",hits=" + this.e9gEMXR7LXtO + ",misses=" + this.a92UlCVFR9N8 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
