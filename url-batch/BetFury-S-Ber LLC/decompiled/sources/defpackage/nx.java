package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class nx {
    public final boolean a;
    public io b;
    public gx c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final ef0 i;

    public nx(lx lxVar) {
        new AtomicReference(null);
        this.a = true;
        this.b = new io();
        gx gxVar = gx.INITIALIZED;
        this.c = gxVar;
        this.h = new ArrayList();
        this.d = new WeakReference(lxVar);
        this.i = new ef0(gxVar == null ? n9.n : gxVar);
    }

    public final void a(kx kxVar) {
        jx riVar;
        lx lxVar;
        c("addObserver");
        gx gxVar = this.c;
        gx gxVar2 = gx.DESTROYED;
        if (gxVar != gxVar2) {
            gxVar2 = gx.INITIALIZED;
        }
        gxVar2.getClass();
        mx mxVar = new mx();
        HashMap hashMap = ox.a;
        boolean z = kxVar instanceof jx;
        boolean z2 = kxVar instanceof am;
        Object obj = null;
        if (z && z2) {
            riVar = new ri((am) kxVar, (jx) kxVar, r5);
        } else if (z2) {
            riVar = new ri((am) kxVar, obj, r5);
        } else if (z) {
            riVar = (jx) kxVar;
        } else {
            Class<?> cls = kxVar.getClass();
            int i = 2;
            if (ox.b(cls) == 2) {
                Object obj2 = ox.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    ox.a((Constructor) list.get(0), kxVar);
                    throw null;
                }
                int size = list.size();
                is[] isVarArr = new is[size];
                if (size > 0) {
                    ox.a((Constructor) list.get(0), kxVar);
                    throw null;
                }
                riVar = new u70(i, isVarArr);
            } else {
                riVar = new ri(kxVar);
            }
        }
        mxVar.b = riVar;
        mxVar.a = gxVar2;
        io ioVar = this.b;
        gb0 a = ioVar.a(kxVar);
        if (a != null) {
            obj = a.g;
        } else {
            HashMap hashMap2 = ioVar.j;
            gb0 gb0Var = new gb0(kxVar, mxVar);
            ioVar.i++;
            gb0 gb0Var2 = ioVar.g;
            if (gb0Var2 == null) {
                ioVar.f = gb0Var;
                ioVar.g = gb0Var;
            } else {
                gb0Var2.h = gb0Var;
                gb0Var.i = gb0Var2;
                ioVar.g = gb0Var;
            }
            hashMap2.put(kxVar, gb0Var);
        }
        if (((mx) obj) == null && (lxVar = (lx) this.d.get()) != null) {
            r5 = (this.e != 0 || this.f) ? 1 : 0;
            gx b = b(kxVar);
            this.e++;
            while (mxVar.a.compareTo(b) < 0 && this.b.j.containsKey(kxVar)) {
                gx gxVar3 = mxVar.a;
                ArrayList arrayList = this.h;
                arrayList.add(gxVar3);
                dx dxVar = fx.Companion;
                gx gxVar4 = mxVar.a;
                dxVar.getClass();
                fx b2 = dx.b(gxVar4);
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + mxVar.a);
                }
                mxVar.a(lxVar, b2);
                arrayList.remove(arrayList.size() - 1);
                b = b(kxVar);
            }
            if (r5 == 0) {
                g();
            }
            this.e--;
        }
    }

    public final gx b(kx kxVar) {
        HashMap hashMap = this.b.j;
        gb0 gb0Var = hashMap.containsKey(kxVar) ? ((gb0) hashMap.get(kxVar)).i : null;
        gx gxVar = gb0Var != null ? ((mx) gb0Var.g).a : null;
        ArrayList arrayList = this.h;
        gx gxVar2 = arrayList.isEmpty() ? null : (gx) arrayList.get(arrayList.size() - 1);
        gx gxVar3 = this.c;
        gxVar3.getClass();
        if (gxVar == null || gxVar.compareTo(gxVar3) >= 0) {
            gxVar = gxVar3;
        }
        return (gxVar2 == null || gxVar2.compareTo(gxVar) >= 0) ? gxVar : gxVar2;
    }

    public final void c(String str) {
        if (this.a) {
            x6.F().a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(r7.c("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(fx fxVar) {
        fxVar.getClass();
        c("handleLifecycleEvent");
        e(fxVar.getTargetState());
    }

    public final void e(gx gxVar) {
        if (this.c == gxVar) {
            return;
        }
        lx lxVar = (lx) this.d.get();
        gx gxVar2 = this.c;
        gxVar2.getClass();
        gxVar.getClass();
        if (gxVar2 == gx.INITIALIZED && gxVar == gx.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + gx.CREATED + "' to be moved to '" + gxVar + "' in component " + lxVar).toString());
        }
        gx gxVar3 = gx.DESTROYED;
        if (gxVar2 == gxVar3 && gxVar2 != gxVar) {
            throw new IllegalStateException(("State is '" + gxVar3 + "' and cannot be moved to `" + gxVar + "` in component " + lxVar).toString());
        }
        this.c = gxVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == gxVar3) {
            this.b = new io();
        }
    }

    public final void f(kx kxVar) {
        kxVar.getClass();
        c("removeObserver");
        this.b.b(kxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r8.g = false;
        r0 = r8.c;
        r8 = r8.i;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = defpackage.n9.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r8.i0(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        lx lxVar = (lx) this.d.get();
        if (lxVar == null) {
            s9.u("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            io ioVar = this.b;
            if (ioVar.i != 0) {
                gb0 gb0Var = ioVar.f;
                gb0Var.getClass();
                gx gxVar = ((mx) gb0Var.g).a;
                gb0 gb0Var2 = this.b.g;
                gb0Var2.getClass();
                gx gxVar2 = ((mx) gb0Var2.g).a;
                if (gxVar == gxVar2 && this.c == gxVar2) {
                    break;
                }
                this.g = false;
                gx gxVar3 = this.c;
                gb0 gb0Var3 = this.b.f;
                gb0Var3.getClass();
                int compareTo = gxVar3.compareTo(((mx) gb0Var3.g).a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    io ioVar2 = this.b;
                    fb0 fb0Var = new fb0(ioVar2.g, ioVar2.f, 1);
                    ioVar2.h.put(fb0Var, Boolean.FALSE);
                    while (fb0Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) fb0Var.next();
                        entry.getClass();
                        kx kxVar = (kx) entry.getKey();
                        mx mxVar = (mx) entry.getValue();
                        while (mxVar.a.compareTo(this.c) > 0 && !this.g && this.b.j.containsKey(kxVar)) {
                            dx dxVar = fx.Companion;
                            gx gxVar4 = mxVar.a;
                            dxVar.getClass();
                            fx a = dx.a(gxVar4);
                            if (a == null) {
                                throw new IllegalStateException("no event down from " + mxVar.a);
                            }
                            arrayList.add(a.getTargetState());
                            mxVar.a(lxVar, a);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                gb0 gb0Var4 = this.b.g;
                if (!this.g && gb0Var4 != null && this.c.compareTo(((mx) gb0Var4.g).a) > 0) {
                    io ioVar3 = this.b;
                    ioVar3.getClass();
                    hb0 hb0Var = new hb0(ioVar3);
                    ioVar3.h.put(hb0Var, Boolean.FALSE);
                    while (hb0Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) hb0Var.next();
                        kx kxVar2 = (kx) entry2.getKey();
                        mx mxVar2 = (mx) entry2.getValue();
                        while (mxVar2.a.compareTo(this.c) < 0 && !this.g && this.b.j.containsKey(kxVar2)) {
                            arrayList.add(mxVar2.a);
                            dx dxVar2 = fx.Companion;
                            gx gxVar5 = mxVar2.a;
                            dxVar2.getClass();
                            fx b = dx.b(gxVar5);
                            if (b == null) {
                                throw new IllegalStateException("no event up from " + mxVar2.a);
                            }
                            mxVar2.a(lxVar, b);
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
