package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ie1 extends AbstractMap implements Serializable {
    public static final zo0 t = new zo0(10);
    public he1 n;
    public ge1 r;
    public ge1 s;
    public int o = 0;
    public int p = 0;
    public final he1 q = new he1();
    public final Comparator m = t;

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final he1 a(Object obj, boolean z) {
        int i;
        he1 he1Var;
        he1 he1Var2 = this.n;
        zo0 zo0Var = t;
        Comparator comparator = this.m;
        if (he1Var2 != null) {
            Comparable comparable = comparator == zo0Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = he1Var2.r;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return he1Var2;
                }
                he1 he1Var3 = i < 0 ? he1Var2.n : he1Var2.o;
                if (he1Var3 == null) {
                    break;
                }
                he1Var2 = he1Var3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        he1 he1Var4 = this.q;
        if (he1Var2 != null) {
            he1Var = new he1(he1Var2, obj, he1Var4, he1Var4.q);
            if (i < 0) {
                he1Var2.n = he1Var;
            } else {
                he1Var2.o = he1Var;
            }
            b(he1Var2, true);
        } else {
            if (comparator == zo0Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            he1Var = new he1(he1Var2, obj, he1Var4, he1Var4.q);
            this.n = he1Var;
        }
        this.o++;
        this.p++;
        return he1Var;
    }

    public final void b(he1 he1Var, boolean z) {
        while (he1Var != null) {
            he1 he1Var2 = he1Var.n;
            he1 he1Var3 = he1Var.o;
            int i = he1Var2 != null ? he1Var2.t : 0;
            int i2 = he1Var3 != null ? he1Var3.t : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                he1 he1Var4 = he1Var3.n;
                he1 he1Var5 = he1Var3.o;
                int i4 = (he1Var4 != null ? he1Var4.t : 0) - (he1Var5 != null ? he1Var5.t : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(he1Var);
                } else {
                    f(he1Var3);
                    e(he1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                he1 he1Var6 = he1Var2.n;
                he1 he1Var7 = he1Var2.o;
                int i5 = (he1Var6 != null ? he1Var6.t : 0) - (he1Var7 != null ? he1Var7.t : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(he1Var);
                } else {
                    e(he1Var2);
                    f(he1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                he1Var.t = i + 1;
                if (z) {
                    return;
                }
            } else {
                he1Var.t = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            he1Var = he1Var.m;
        }
    }

    public final void c(he1 he1Var, boolean z) {
        he1 he1Var2;
        he1 he1Var3;
        int i;
        if (z) {
            he1 he1Var4 = he1Var.q;
            he1Var4.p = he1Var.p;
            he1Var.p.q = he1Var4;
        }
        he1 he1Var5 = he1Var.n;
        he1 he1Var6 = he1Var.o;
        he1 he1Var7 = he1Var.m;
        int i2 = 0;
        if (he1Var5 == null || he1Var6 == null) {
            if (he1Var5 != null) {
                d(he1Var, he1Var5);
                he1Var.n = null;
            } else if (he1Var6 != null) {
                d(he1Var, he1Var6);
                he1Var.o = null;
            } else {
                d(he1Var, null);
            }
            b(he1Var7, false);
            this.o--;
            this.p++;
            return;
        }
        if (he1Var5.t > he1Var6.t) {
            he1 he1Var8 = he1Var5.o;
            while (true) {
                he1 he1Var9 = he1Var8;
                he1Var3 = he1Var5;
                he1Var5 = he1Var9;
                if (he1Var5 == null) {
                    break;
                } else {
                    he1Var8 = he1Var5.o;
                }
            }
        } else {
            he1 he1Var10 = he1Var6.n;
            while (true) {
                he1Var2 = he1Var6;
                he1Var6 = he1Var10;
                if (he1Var6 == null) {
                    break;
                } else {
                    he1Var10 = he1Var6.n;
                }
            }
            he1Var3 = he1Var2;
        }
        c(he1Var3, false);
        he1 he1Var11 = he1Var.n;
        if (he1Var11 != null) {
            i = he1Var11.t;
            he1Var3.n = he1Var11;
            he1Var11.m = he1Var3;
            he1Var.n = null;
        } else {
            i = 0;
        }
        he1 he1Var12 = he1Var.o;
        if (he1Var12 != null) {
            i2 = he1Var12.t;
            he1Var3.o = he1Var12;
            he1Var12.m = he1Var3;
            he1Var.o = null;
        }
        he1Var3.t = Math.max(i, i2) + 1;
        d(he1Var, he1Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.n = null;
        this.o = 0;
        this.p++;
        he1 he1Var = this.q;
        he1Var.q = he1Var;
        he1Var.p = he1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        he1 he1Var = null;
        if (obj != null) {
            try {
                he1Var = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return he1Var != null;
    }

    public final void d(he1 he1Var, he1 he1Var2) {
        he1 he1Var3 = he1Var.m;
        he1Var.m = null;
        if (he1Var2 != null) {
            he1Var2.m = he1Var3;
        }
        if (he1Var3 == null) {
            this.n = he1Var2;
        } else if (he1Var3.n == he1Var) {
            he1Var3.n = he1Var2;
        } else {
            he1Var3.o = he1Var2;
        }
    }

    public final void e(he1 he1Var) {
        he1 he1Var2 = he1Var.n;
        he1 he1Var3 = he1Var.o;
        he1 he1Var4 = he1Var3.n;
        he1 he1Var5 = he1Var3.o;
        he1Var.o = he1Var4;
        if (he1Var4 != null) {
            he1Var4.m = he1Var;
        }
        d(he1Var, he1Var3);
        he1Var3.n = he1Var;
        he1Var.m = he1Var3;
        int max = Math.max(he1Var2 != null ? he1Var2.t : 0, he1Var4 != null ? he1Var4.t : 0) + 1;
        he1Var.t = max;
        he1Var3.t = Math.max(max, he1Var5 != null ? he1Var5.t : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ge1 ge1Var = this.r;
        if (ge1Var != null) {
            return ge1Var;
        }
        ge1 ge1Var2 = new ge1(this, 0);
        this.r = ge1Var2;
        return ge1Var2;
    }

    public final void f(he1 he1Var) {
        he1 he1Var2 = he1Var.n;
        he1 he1Var3 = he1Var.o;
        he1 he1Var4 = he1Var2.n;
        he1 he1Var5 = he1Var2.o;
        he1Var.n = he1Var5;
        if (he1Var5 != null) {
            he1Var5.m = he1Var;
        }
        d(he1Var, he1Var2);
        he1Var2.o = he1Var;
        he1Var.m = he1Var2;
        int max = Math.max(he1Var3 != null ? he1Var3.t : 0, he1Var5 != null ? he1Var5.t : 0) + 1;
        he1Var.t = max;
        he1Var2.t = Math.max(max, he1Var4 != null ? he1Var4.t : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        he1 he1Var;
        if (obj != null) {
            try {
                he1Var = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (he1Var == null) {
                return he1Var.s;
            }
            return null;
        }
        he1Var = null;
        if (he1Var == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ge1 ge1Var = this.s;
        if (ge1Var != null) {
            return ge1Var;
        }
        ge1 ge1Var2 = new ge1(this, 1);
        this.s = ge1Var2;
        return ge1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            ch2.l("key == null");
            return null;
        }
        he1 a = a(obj, true);
        Object obj3 = a.s;
        a.s = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        he1 he1Var;
        if (obj != null) {
            try {
                he1Var = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (he1Var != null) {
                c(he1Var, true);
            }
            if (he1Var == null) {
                return he1Var.s;
            }
            return null;
        }
        he1Var = null;
        if (he1Var != null) {
        }
        if (he1Var == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.o;
    }
}
