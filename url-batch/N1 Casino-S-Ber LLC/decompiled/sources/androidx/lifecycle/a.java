package androidx.lifecycle;

import android.os.Looper;
import defpackage.aj;
import defpackage.aq;
import defpackage.bq;
import defpackage.cq;
import defpackage.e6;
import defpackage.lm;
import defpackage.se;
import defpackage.sp;
import defpackage.t8;
import defpackage.up;
import defpackage.v00;
import defpackage.vp;
import defpackage.w00;
import defpackage.x00;
import defpackage.yp;
import defpackage.zp;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class a {
    public final boolean a;
    public aj b;
    public vp c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;

    public a(aq aqVar) {
        new AtomicReference();
        this.a = true;
        this.b = new aj();
        this.c = vp.g;
        this.h = new ArrayList();
        this.d = new WeakReference(aqVar);
    }

    public final void a(zp zpVar) {
        yp reflectiveGenericLifecycleObserver;
        Object obj;
        aq aqVar;
        c("addObserver");
        vp vpVar = this.c;
        vp vpVar2 = vp.f;
        if (vpVar != vpVar2) {
            vpVar2 = vp.g;
        }
        bq bqVar = new bq();
        HashMap hashMap = cq.a;
        boolean z = zpVar instanceof yp;
        boolean z2 = zpVar instanceof se;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((se) zpVar, (yp) zpVar);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((se) zpVar, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (yp) zpVar;
        } else {
            Class<?> cls = zpVar.getClass();
            if (cq.b(cls) == 2) {
                Object obj2 = cq.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    cq.a((Constructor) list.get(0), zpVar);
                    throw null;
                }
                int size = list.size();
                lm[] lmVarArr = new lm[size];
                if (size > 0) {
                    cq.a((Constructor) list.get(0), zpVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(lmVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(zpVar);
            }
        }
        bqVar.b = reflectiveGenericLifecycleObserver;
        bqVar.a = vpVar2;
        aj ajVar = this.b;
        w00 a = ajVar.a(zpVar);
        if (a != null) {
            obj = a.g;
        } else {
            HashMap hashMap2 = ajVar.j;
            w00 w00Var = new w00(zpVar, bqVar);
            ajVar.i++;
            w00 w00Var2 = ajVar.g;
            if (w00Var2 == null) {
                ajVar.f = w00Var;
                ajVar.g = w00Var;
            } else {
                w00Var2.h = w00Var;
                w00Var.i = w00Var2;
                ajVar.g = w00Var;
            }
            hashMap2.put(zpVar, w00Var);
            obj = null;
        }
        if (((bq) obj) == null && (aqVar = (aq) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            vp b = b(zpVar);
            this.e++;
            while (bqVar.a.compareTo(b) < 0 && this.b.j.containsKey(zpVar)) {
                vp vpVar3 = bqVar.a;
                ArrayList arrayList = this.h;
                arrayList.add(vpVar3);
                sp spVar = up.Companion;
                vp vpVar4 = bqVar.a;
                spVar.getClass();
                vpVar4.getClass();
                int ordinal = vpVar4.ordinal();
                up upVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : up.ON_RESUME : up.ON_START : up.ON_CREATE;
                if (upVar == null) {
                    throw new IllegalStateException("no event up from " + bqVar.a);
                }
                bqVar.a(aqVar, upVar);
                arrayList.remove(arrayList.size() - 1);
                b = b(zpVar);
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    public final vp b(zp zpVar) {
        bq bqVar;
        HashMap hashMap = this.b.j;
        w00 w00Var = hashMap.containsKey(zpVar) ? ((w00) hashMap.get(zpVar)).i : null;
        vp vpVar = (w00Var == null || (bqVar = (bq) w00Var.g) == null) ? null : bqVar.a;
        ArrayList arrayList = this.h;
        vp vpVar2 = arrayList.isEmpty() ? null : (vp) arrayList.get(arrayList.size() - 1);
        vp vpVar3 = this.c;
        vpVar3.getClass();
        if (vpVar == null || vpVar.compareTo(vpVar3) >= 0) {
            vpVar = vpVar3;
        }
        return (vpVar2 == null || vpVar2.compareTo(vpVar) >= 0) ? vpVar : vpVar2;
    }

    public final void c(String str) {
        if (this.a) {
            ((e6) e6.b0().i).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            t8.r(str, " must be called on the main thread", "Method ");
        }
    }

    public final void d(up upVar) {
        upVar.getClass();
        c("handleLifecycleEvent");
        e(upVar.a());
    }

    public final void e(vp vpVar) {
        vp vpVar2 = this.c;
        if (vpVar2 == vpVar) {
            return;
        }
        vp vpVar3 = vp.g;
        vp vpVar4 = vp.f;
        if (vpVar2 == vpVar3 && vpVar == vpVar4) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.c);
            Object obj = this.d.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.c = vpVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == vpVar4) {
            this.b = new aj();
        }
    }

    public final void f(zp zpVar) {
        c("removeObserver");
        this.b.b(zpVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        aq aqVar = (aq) this.d.get();
        if (aqVar == null) {
            t8.t("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            aj ajVar = this.b;
            if (ajVar.i != 0) {
                w00 w00Var = ajVar.f;
                w00Var.getClass();
                vp vpVar = ((bq) w00Var.g).a;
                w00 w00Var2 = this.b.g;
                w00Var2.getClass();
                vp vpVar2 = ((bq) w00Var2.g).a;
                if (vpVar == vpVar2 && this.c == vpVar2) {
                    break;
                }
                this.g = false;
                vp vpVar3 = this.c;
                w00 w00Var3 = this.b.f;
                w00Var3.getClass();
                int compareTo = vpVar3.compareTo(((bq) w00Var3.g).a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    aj ajVar2 = this.b;
                    v00 v00Var = new v00(ajVar2.g, ajVar2.f, 1);
                    ajVar2.h.put(v00Var, Boolean.FALSE);
                    while (v00Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) v00Var.next();
                        entry.getClass();
                        zp zpVar = (zp) entry.getKey();
                        bq bqVar = (bq) entry.getValue();
                        while (bqVar.a.compareTo(this.c) > 0 && !this.g && this.b.j.containsKey(zpVar)) {
                            sp spVar = up.Companion;
                            vp vpVar4 = bqVar.a;
                            spVar.getClass();
                            vpVar4.getClass();
                            int ordinal = vpVar4.ordinal();
                            up upVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : up.ON_PAUSE : up.ON_STOP : up.ON_DESTROY;
                            if (upVar == null) {
                                throw new IllegalStateException("no event down from " + bqVar.a);
                            }
                            arrayList.add(upVar.a());
                            bqVar.a(aqVar, upVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                w00 w00Var4 = this.b.g;
                if (!this.g && w00Var4 != null && this.c.compareTo(((bq) w00Var4.g).a) > 0) {
                    aj ajVar3 = this.b;
                    ajVar3.getClass();
                    x00 x00Var = new x00(ajVar3);
                    ajVar3.h.put(x00Var, Boolean.FALSE);
                    while (x00Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) x00Var.next();
                        zp zpVar2 = (zp) entry2.getKey();
                        bq bqVar2 = (bq) entry2.getValue();
                        while (bqVar2.a.compareTo(this.c) < 0 && !this.g && this.b.j.containsKey(zpVar2)) {
                            arrayList.add(bqVar2.a);
                            sp spVar2 = up.Companion;
                            vp vpVar5 = bqVar2.a;
                            spVar2.getClass();
                            vpVar5.getClass();
                            int ordinal2 = vpVar5.ordinal();
                            up upVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : up.ON_RESUME : up.ON_START : up.ON_CREATE;
                            if (upVar2 == null) {
                                throw new IllegalStateException("no event up from " + bqVar2.a);
                            }
                            bqVar2.a(aqVar, upVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
