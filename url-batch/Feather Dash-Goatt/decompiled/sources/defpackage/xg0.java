package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xg0 {
    public final boolean a;
    public vw b;
    public og0 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final be1 i;

    public xg0(vg0 vg0Var, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new vw();
        og0 og0Var = og0.e;
        this.c = og0Var;
        this.h = new ArrayList();
        this.d = new WeakReference(vg0Var);
        this.i = m90.c(og0Var);
    }

    public final void a(ug0 ug0Var) {
        sg0 kqVar;
        wg0 wg0Var;
        vg0 vg0Var;
        ug0Var.getClass();
        c("addObserver");
        og0 og0Var = this.c;
        og0 og0Var2 = og0.d;
        if (og0Var != og0Var2) {
            og0Var2 = og0.e;
        }
        wg0 wg0Var2 = new wg0();
        HashMap hashMap = bh0.a;
        boolean z = ug0Var instanceof sg0;
        boolean z2 = ug0Var instanceof iq;
        int i = 2;
        if (z && z2) {
            kqVar = new kq((iq) ug0Var, (sg0) ug0Var);
        } else if (z2) {
            kqVar = new kq((iq) ug0Var, (sg0) null);
        } else if (z) {
            kqVar = (sg0) ug0Var;
        } else {
            Class<?> cls = ug0Var.getClass();
            if (bh0.b(cls) == 2) {
                Object obj = bh0.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    bh0.a((Constructor) list.get(0), ug0Var);
                    throw null;
                }
                int size = list.size();
                i40[] i40VarArr = new i40[size];
                if (size > 0) {
                    bh0.a((Constructor) list.get(0), ug0Var);
                    throw null;
                }
                kqVar = new r11(i, i40VarArr);
            } else {
                kqVar = new kq(ug0Var);
            }
        }
        wg0Var2.b = kqVar;
        wg0Var2.a = og0Var2;
        vw vwVar = this.b;
        j51 j51Var = (j51) vwVar.i.get(ug0Var);
        if (j51Var != null) {
            wg0Var = j51Var.e;
        } else {
            HashMap hashMap2 = vwVar.i;
            j51 j51Var2 = new j51(ug0Var, wg0Var2);
            vwVar.h++;
            j51 j51Var3 = vwVar.e;
            if (j51Var3 == null) {
                vwVar.d = j51Var2;
                vwVar.e = j51Var2;
            } else {
                j51Var3.g = j51Var2;
                j51Var2.h = j51Var3;
                vwVar.e = j51Var2;
            }
            hashMap2.put(ug0Var, j51Var2);
            wg0Var = null;
        }
        if (wg0Var == null && (vg0Var = (vg0) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            og0 b = b(ug0Var);
            this.e++;
            while (wg0Var2.a.compareTo(b) < 0 && this.b.i.containsKey(ug0Var)) {
                og0 og0Var3 = wg0Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(og0Var3);
                lg0 lg0Var = ng0.Companion;
                og0 og0Var4 = wg0Var2.a;
                lg0Var.getClass();
                og0Var4.getClass();
                int ordinal = og0Var4.ordinal();
                ng0 ng0Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : ng0.ON_RESUME : ng0.ON_START : ng0.ON_CREATE;
                if (ng0Var == null) {
                    dd0.d(wg0Var2.a, "no event up from ");
                    return;
                } else {
                    wg0Var2.a(vg0Var, ng0Var);
                    arrayList.remove(arrayList.size() - 1);
                    b = b(ug0Var);
                }
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    public final og0 b(ug0 ug0Var) {
        HashMap hashMap = this.b.i;
        j51 j51Var = hashMap.containsKey(ug0Var) ? ((j51) hashMap.get(ug0Var)).h : null;
        og0 og0Var = j51Var != null ? j51Var.e.a : null;
        ArrayList arrayList = this.h;
        og0 og0Var2 = arrayList.isEmpty() ? null : (og0) arrayList.get(arrayList.size() - 1);
        og0 og0Var3 = this.c;
        og0Var3.getClass();
        if (og0Var == null || og0Var.compareTo(og0Var3) >= 0) {
            og0Var = og0Var3;
        }
        return (og0Var2 == null || og0Var2.compareTo(og0Var) >= 0) ? og0Var : og0Var2;
    }

    public final void c(String str) {
        d9 d9Var;
        if (this.a) {
            if (d9.b != null) {
                d9Var = d9.b;
            } else {
                synchronized (d9.class) {
                    try {
                        if (d9.b == null) {
                            d9.b = new d9();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                d9Var = d9.b;
            }
            d9Var.a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(qy0.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(ng0 ng0Var) {
        ng0Var.getClass();
        c("handleLifecycleEvent");
        e(ng0Var.a());
    }

    public final void e(og0 og0Var) {
        if (this.c == og0Var) {
            return;
        }
        vg0 vg0Var = (vg0) this.d.get();
        og0 og0Var2 = this.c;
        og0Var2.getClass();
        if (og0Var2 == og0.e && og0Var == og0.d) {
            throw new IllegalStateException(("State must be at least '" + og0.g + "' to be moved to '" + og0Var + "' in component " + vg0Var).toString());
        }
        og0 og0Var3 = og0.d;
        if (og0Var2 == og0Var3 && og0Var2 != og0Var) {
            throw new IllegalStateException(("State is '" + og0Var3 + "' and cannot be moved to `" + og0Var + "` in component " + vg0Var).toString());
        }
        this.c = og0Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == og0Var3) {
            this.b = new vw();
        }
    }

    public final void f(ug0 ug0Var) {
        ug0Var.getClass();
        c("removeObserver");
        vw vwVar = this.b;
        WeakHashMap weakHashMap = vwVar.g;
        HashMap hashMap = vwVar.i;
        j51 j51Var = (j51) hashMap.get(ug0Var);
        if (j51Var != null) {
            vwVar.h--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((l51) it.next()).a(j51Var);
                }
            }
            j51 j51Var2 = j51Var.h;
            j51 j51Var3 = j51Var.g;
            if (j51Var2 != null) {
                j51Var2.g = j51Var3;
            } else {
                vwVar.d = j51Var3;
            }
            j51 j51Var4 = j51Var.g;
            if (j51Var4 != null) {
                j51Var4.h = j51Var2;
            } else {
                vwVar.e = j51Var2;
            }
            j51Var.g = null;
            j51Var.h = null;
        }
        hashMap.remove(ug0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r11.g = false;
        r0 = r11.c;
        r11 = r11.i;
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r0 = defpackage.op.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r11.j(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        vg0 vg0Var = (vg0) this.d.get();
        if (vg0Var == null) {
            dd0.j("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            vw vwVar = this.b;
            if (vwVar.h != 0) {
                j51 j51Var = vwVar.d;
                j51Var.getClass();
                og0 og0Var = j51Var.e.a;
                j51 j51Var2 = this.b.e;
                j51Var2.getClass();
                og0 og0Var2 = j51Var2.e.a;
                if (og0Var == og0Var2 && this.c == og0Var2) {
                    break;
                }
                this.g = false;
                og0 og0Var3 = this.c;
                j51 j51Var3 = this.b.d;
                j51Var3.getClass();
                int compareTo = og0Var3.compareTo(j51Var3.e.a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    vw vwVar2 = this.b;
                    i51 i51Var = new i51(vwVar2.e, vwVar2.d, 1);
                    vwVar2.g.put(i51Var, Boolean.FALSE);
                    while (i51Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) i51Var.next();
                        entry.getClass();
                        ug0 ug0Var = (ug0) entry.getKey();
                        wg0 wg0Var = (wg0) entry.getValue();
                        while (wg0Var.a.compareTo(this.c) > 0 && !this.g && this.b.i.containsKey(ug0Var)) {
                            lg0 lg0Var = ng0.Companion;
                            og0 og0Var4 = wg0Var.a;
                            lg0Var.getClass();
                            og0Var4.getClass();
                            int ordinal = og0Var4.ordinal();
                            ng0 ng0Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : ng0.ON_PAUSE : ng0.ON_STOP : ng0.ON_DESTROY;
                            if (ng0Var == null) {
                                dd0.d(wg0Var.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(ng0Var.a());
                                wg0Var.a(vg0Var, ng0Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                j51 j51Var4 = this.b.e;
                if (!this.g && j51Var4 != null && this.c.compareTo(j51Var4.e.a) > 0) {
                    vw vwVar3 = this.b;
                    vwVar3.getClass();
                    k51 k51Var = new k51(vwVar3);
                    vwVar3.g.put(k51Var, Boolean.FALSE);
                    while (k51Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) k51Var.next();
                        ug0 ug0Var2 = (ug0) entry2.getKey();
                        wg0 wg0Var2 = (wg0) entry2.getValue();
                        while (wg0Var2.a.compareTo(this.c) < 0 && !this.g && this.b.i.containsKey(ug0Var2)) {
                            arrayList.add(wg0Var2.a);
                            lg0 lg0Var2 = ng0.Companion;
                            og0 og0Var5 = wg0Var2.a;
                            lg0Var2.getClass();
                            og0Var5.getClass();
                            int ordinal2 = og0Var5.ordinal();
                            ng0 ng0Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : ng0.ON_RESUME : ng0.ON_START : ng0.ON_CREATE;
                            if (ng0Var2 == null) {
                                dd0.d(wg0Var2.a, "no event up from ");
                                return;
                            } else {
                                wg0Var2.a(vg0Var, ng0Var2);
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
