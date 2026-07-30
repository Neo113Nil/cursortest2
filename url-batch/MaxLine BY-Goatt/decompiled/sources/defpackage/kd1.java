package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kd1 extends ad1 {
    public final boolean a;
    public ik0 b = new ik0();
    public zc1 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final vo2 i;

    public kd1(id1 id1Var, boolean z) {
        this.a = z;
        zc1 zc1Var = zc1.n;
        this.c = zc1Var;
        this.h = new ArrayList();
        this.d = new WeakReference(id1Var);
        this.i = zm3.f(zc1Var);
    }

    @Override // defpackage.ad1
    public final void a(hd1 hd1Var) {
        fd1 n80Var;
        Object obj;
        id1 id1Var;
        hd1Var.getClass();
        e("addObserver");
        zc1 zc1Var = this.c;
        zc1 zc1Var2 = zc1.m;
        if (zc1Var != zc1Var2) {
            zc1Var2 = zc1.n;
        }
        jd1 jd1Var = new jd1();
        HashMap hashMap = md1.a;
        boolean z = hd1Var instanceof fd1;
        boolean z2 = hd1Var instanceof l80;
        int i = 3;
        if (z && z2) {
            n80Var = new n80((l80) hd1Var, (fd1) hd1Var);
        } else if (z2) {
            n80Var = new n80((l80) hd1Var, (fd1) null);
        } else if (z) {
            n80Var = (fd1) hd1Var;
        } else {
            Class<?> cls = hd1Var.getClass();
            if (md1.b(cls) == 2) {
                Object obj2 = md1.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    md1.a((Constructor) list.get(0), hd1Var);
                    throw null;
                }
                int size = list.size();
                ru0[] ru0VarArr = new ru0[size];
                if (size > 0) {
                    md1.a((Constructor) list.get(0), hd1Var);
                    throw null;
                }
                n80Var = new v72(i, ru0VarArr);
            } else {
                n80Var = new n80(hd1Var);
            }
        }
        jd1Var.b = n80Var;
        jd1Var.a = zc1Var2;
        ik0 ik0Var = this.b;
        ad2 a = ik0Var.a(hd1Var);
        if (a != null) {
            obj = a.n;
        } else {
            HashMap hashMap2 = ik0Var.q;
            ad2 ad2Var = new ad2(hd1Var, jd1Var);
            ik0Var.p++;
            ad2 ad2Var2 = ik0Var.n;
            if (ad2Var2 == null) {
                ik0Var.m = ad2Var;
                ik0Var.n = ad2Var;
            } else {
                ad2Var2.o = ad2Var;
                ad2Var.p = ad2Var2;
                ik0Var.n = ad2Var;
            }
            hashMap2.put(hd1Var, ad2Var);
            obj = null;
        }
        if (((jd1) obj) == null && (id1Var = (id1) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            zc1 d = d(hd1Var);
            this.e++;
            while (jd1Var.a.compareTo(d) < 0 && this.b.q.containsKey(hd1Var)) {
                zc1 zc1Var3 = jd1Var.a;
                ArrayList arrayList = this.h;
                arrayList.add(zc1Var3);
                wc1 wc1Var = yc1.Companion;
                zc1 zc1Var4 = jd1Var.a;
                wc1Var.getClass();
                zc1Var4.getClass();
                int ordinal = zc1Var4.ordinal();
                yc1 yc1Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : yc1.ON_RESUME : yc1.ON_START : yc1.ON_CREATE;
                if (yc1Var == null) {
                    b71.q(jd1Var.a, "no event up from ");
                    return;
                } else {
                    jd1Var.a(id1Var, yc1Var);
                    arrayList.remove(arrayList.size() - 1);
                    d = d(hd1Var);
                }
            }
            if (!z3) {
                i();
            }
            this.e--;
        }
    }

    @Override // defpackage.ad1
    public final zc1 b() {
        return this.c;
    }

    @Override // defpackage.ad1
    public final void c(hd1 hd1Var) {
        hd1Var.getClass();
        e("removeObserver");
        this.b.b(hd1Var);
    }

    public final zc1 d(hd1 hd1Var) {
        HashMap hashMap = this.b.q;
        ad2 ad2Var = hashMap.containsKey(hd1Var) ? ((ad2) hashMap.get(hd1Var)).p : null;
        zc1 zc1Var = ad2Var != null ? ((jd1) ad2Var.n).a : null;
        ArrayList arrayList = this.h;
        zc1 zc1Var2 = arrayList.isEmpty() ? null : (zc1) arrayList.get(arrayList.size() - 1);
        zc1 zc1Var3 = this.c;
        zc1Var3.getClass();
        if (zc1Var == null || zc1Var.compareTo(zc1Var3) >= 0) {
            zc1Var = zc1Var3;
        }
        return (zc1Var2 == null || zc1Var2.compareTo(zc1Var) >= 0) ? zc1Var : zc1Var2;
    }

    public final void e(String str) {
        if (this.a) {
            uh.t().a.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            b71.h(q40.m("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(yc1 yc1Var) {
        yc1Var.getClass();
        e("handleLifecycleEvent");
        g(yc1Var.a());
    }

    public final void g(zc1 zc1Var) {
        if (this.c == zc1Var) {
            return;
        }
        id1 id1Var = (id1) this.d.get();
        zc1 zc1Var2 = this.c;
        zc1Var2.getClass();
        zc1Var.getClass();
        if (zc1Var2 == zc1.n && zc1Var == zc1.m) {
            throw new IllegalStateException(("State must be at least '" + zc1.o + "' to be moved to '" + zc1Var + "' in component " + id1Var).toString());
        }
        zc1 zc1Var3 = zc1.m;
        if (zc1Var2 == zc1Var3 && zc1Var2 != zc1Var) {
            throw new IllegalStateException(("State is '" + zc1Var3 + "' and cannot be moved to `" + zc1Var + "` in component " + id1Var).toString());
        }
        this.c = zc1Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        i();
        this.f = false;
        if (this.c == zc1Var3) {
            this.b = new ik0();
        }
    }

    public final void h(zc1 zc1Var) {
        zc1Var.getClass();
        e("setCurrentState");
        g(zc1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.g = false;
        r11.i.i(r11.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        id1 id1Var = (id1) this.d.get();
        if (id1Var == null) {
            lh.g("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            ik0 ik0Var = this.b;
            if (ik0Var.p != 0) {
                ad2 ad2Var = ik0Var.m;
                ad2Var.getClass();
                zc1 zc1Var = ((jd1) ad2Var.n).a;
                ad2 ad2Var2 = this.b.n;
                ad2Var2.getClass();
                zc1 zc1Var2 = ((jd1) ad2Var2.n).a;
                if (zc1Var == zc1Var2 && this.c == zc1Var2) {
                    break;
                }
                this.g = false;
                zc1 zc1Var3 = this.c;
                ad2 ad2Var3 = this.b.m;
                ad2Var3.getClass();
                int compareTo = zc1Var3.compareTo(((jd1) ad2Var3.n).a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    ik0 ik0Var2 = this.b;
                    zc2 zc2Var = new zc2(ik0Var2.n, ik0Var2.m, 1);
                    ik0Var2.o.put(zc2Var, Boolean.FALSE);
                    while (zc2Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) zc2Var.next();
                        entry.getClass();
                        hd1 hd1Var = (hd1) entry.getKey();
                        jd1 jd1Var = (jd1) entry.getValue();
                        while (jd1Var.a.compareTo(this.c) > 0 && !this.g && this.b.q.containsKey(hd1Var)) {
                            wc1 wc1Var = yc1.Companion;
                            zc1 zc1Var4 = jd1Var.a;
                            wc1Var.getClass();
                            zc1Var4.getClass();
                            int ordinal = zc1Var4.ordinal();
                            yc1 yc1Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : yc1.ON_PAUSE : yc1.ON_STOP : yc1.ON_DESTROY;
                            if (yc1Var == null) {
                                b71.q(jd1Var.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(yc1Var.a());
                                jd1Var.a(id1Var, yc1Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                ad2 ad2Var4 = this.b.n;
                if (!this.g && ad2Var4 != null && this.c.compareTo(((jd1) ad2Var4.n).a) > 0) {
                    ik0 ik0Var3 = this.b;
                    ik0Var3.getClass();
                    bd2 bd2Var = new bd2(ik0Var3);
                    ik0Var3.o.put(bd2Var, Boolean.FALSE);
                    while (bd2Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) bd2Var.next();
                        hd1 hd1Var2 = (hd1) entry2.getKey();
                        jd1 jd1Var2 = (jd1) entry2.getValue();
                        while (jd1Var2.a.compareTo(this.c) < 0 && !this.g && this.b.q.containsKey(hd1Var2)) {
                            arrayList.add(jd1Var2.a);
                            wc1 wc1Var2 = yc1.Companion;
                            zc1 zc1Var5 = jd1Var2.a;
                            wc1Var2.getClass();
                            zc1Var5.getClass();
                            int ordinal2 = zc1Var5.ordinal();
                            yc1 yc1Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : yc1.ON_RESUME : yc1.ON_START : yc1.ON_CREATE;
                            if (yc1Var2 == null) {
                                b71.q(jd1Var2.a, "no event up from ");
                                return;
                            } else {
                                jd1Var2.a(id1Var, yc1Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
