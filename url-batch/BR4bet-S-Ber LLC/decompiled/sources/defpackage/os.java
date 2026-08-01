package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class os {
    public final boolean a;
    public il b;
    public hs c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final y60 i;

    public os(ms msVar) {
        new AtomicReference(null);
        this.a = true;
        this.b = new il();
        hs hsVar = hs.g;
        this.c = hsVar;
        this.h = new ArrayList();
        this.d = new WeakReference(msVar);
        this.i = new y60(hsVar);
    }

    public final void a(ls lsVar) {
        ks ngVar;
        Object obj;
        ms msVar;
        c("addObserver");
        hs hsVar = this.c;
        hs hsVar2 = hs.f;
        if (hsVar != hsVar2) {
            hsVar2 = hs.g;
        }
        ns nsVar = new ns();
        HashMap hashMap = ps.a;
        boolean z = lsVar instanceof ks;
        boolean z2 = lsVar instanceof mj;
        int i = 2;
        Object obj2 = null;
        if (z && z2) {
            ngVar = new ng((mj) lsVar, (ks) lsVar, r6);
        } else if (z2) {
            ngVar = new ng((mj) lsVar, obj2, r6);
        } else if (z) {
            ngVar = (ks) lsVar;
        } else {
            Class<?> cls = lsVar.getClass();
            if (ps.b(cls) == 2) {
                Object obj3 = ps.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() == 1) {
                    ps.a((Constructor) list.get(0), lsVar);
                    throw null;
                }
                int size = list.size();
                uo[] uoVarArr = new uo[size];
                if (size > 0) {
                    ps.a((Constructor) list.get(0), lsVar);
                    throw null;
                }
                ngVar = new p10(i, uoVarArr);
            } else {
                ngVar = new ng(lsVar);
            }
        }
        nsVar.b = ngVar;
        nsVar.a = hsVar2;
        il ilVar = this.b;
        b40 a = ilVar.a(lsVar);
        if (a != null) {
            obj = a.g;
        } else {
            HashMap hashMap2 = ilVar.j;
            b40 b40Var = new b40(lsVar, nsVar);
            ilVar.i++;
            b40 b40Var2 = ilVar.g;
            if (b40Var2 == null) {
                ilVar.f = b40Var;
                ilVar.g = b40Var;
            } else {
                b40Var2.h = b40Var;
                b40Var.i = b40Var2;
                ilVar.g = b40Var;
            }
            hashMap2.put(lsVar, b40Var);
            obj = null;
        }
        if (((ns) obj) == null && (msVar = (ms) this.d.get()) != null) {
            r6 = (this.e != 0 || this.f) ? 1 : 0;
            hs b = b(lsVar);
            this.e++;
            while (nsVar.a.compareTo(b) < 0 && this.b.j.containsKey(lsVar)) {
                hs hsVar3 = nsVar.a;
                ArrayList arrayList = this.h;
                arrayList.add(hsVar3);
                es esVar = gs.Companion;
                hs hsVar4 = nsVar.a;
                esVar.getClass();
                hsVar4.getClass();
                int ordinal = hsVar4.ordinal();
                gs gsVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : gs.ON_RESUME : gs.ON_START : gs.ON_CREATE;
                if (gsVar == null) {
                    throw new IllegalStateException("no event up from " + nsVar.a);
                }
                nsVar.a(msVar, gsVar);
                arrayList.remove(arrayList.size() - 1);
                b = b(lsVar);
            }
            if (r6 == 0) {
                g();
            }
            this.e--;
        }
    }

    public final hs b(ls lsVar) {
        ns nsVar;
        HashMap hashMap = this.b.j;
        b40 b40Var = hashMap.containsKey(lsVar) ? ((b40) hashMap.get(lsVar)).i : null;
        hs hsVar = (b40Var == null || (nsVar = (ns) b40Var.g) == null) ? null : nsVar.a;
        ArrayList arrayList = this.h;
        hs hsVar2 = arrayList.isEmpty() ? null : (hs) arrayList.get(arrayList.size() - 1);
        hs hsVar3 = this.c;
        hsVar3.getClass();
        if (hsVar == null || hsVar.compareTo(hsVar3) >= 0) {
            hsVar = hsVar3;
        }
        return (hsVar2 == null || hsVar2.compareTo(hsVar) >= 0) ? hsVar : hsVar2;
    }

    public final void c(String str) {
        if (this.a) {
            o6.V().j.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(f60.f("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(gs gsVar) {
        gsVar.getClass();
        c("handleLifecycleEvent");
        e(gsVar.a());
    }

    public final void e(hs hsVar) {
        hs hsVar2 = this.c;
        if (hsVar2 == hsVar) {
            return;
        }
        hs hsVar3 = hs.g;
        hs hsVar4 = hs.f;
        if (hsVar2 == hsVar3 && hsVar == hsVar4) {
            StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
            sb.append(hsVar);
            sb.append(", but was ");
            sb.append(this.c);
            Object obj = this.d.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.c = hsVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == hsVar4) {
            this.b = new il();
        }
    }

    public final void f(ls lsVar) {
        lsVar.getClass();
        c("removeObserver");
        this.b.b(lsVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.g = false;
        r11.i.b(r11.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        ms msVar = (ms) this.d.get();
        if (msVar == null) {
            g9.s("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            il ilVar = this.b;
            if (ilVar.i != 0) {
                b40 b40Var = ilVar.f;
                b40Var.getClass();
                hs hsVar = ((ns) b40Var.g).a;
                b40 b40Var2 = this.b.g;
                b40Var2.getClass();
                hs hsVar2 = ((ns) b40Var2.g).a;
                if (hsVar == hsVar2 && this.c == hsVar2) {
                    break;
                }
                this.g = false;
                hs hsVar3 = this.c;
                b40 b40Var3 = this.b.f;
                b40Var3.getClass();
                int compareTo = hsVar3.compareTo(((ns) b40Var3.g).a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    il ilVar2 = this.b;
                    a40 a40Var = new a40(ilVar2.g, ilVar2.f, 1);
                    ilVar2.h.put(a40Var, Boolean.FALSE);
                    while (a40Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) a40Var.next();
                        entry.getClass();
                        ls lsVar = (ls) entry.getKey();
                        ns nsVar = (ns) entry.getValue();
                        while (nsVar.a.compareTo(this.c) > 0 && !this.g && this.b.j.containsKey(lsVar)) {
                            es esVar = gs.Companion;
                            hs hsVar4 = nsVar.a;
                            esVar.getClass();
                            hsVar4.getClass();
                            int ordinal = hsVar4.ordinal();
                            gs gsVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : gs.ON_PAUSE : gs.ON_STOP : gs.ON_DESTROY;
                            if (gsVar == null) {
                                throw new IllegalStateException("no event down from " + nsVar.a);
                            }
                            arrayList.add(gsVar.a());
                            nsVar.a(msVar, gsVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                b40 b40Var4 = this.b.g;
                if (!this.g && b40Var4 != null && this.c.compareTo(((ns) b40Var4.g).a) > 0) {
                    il ilVar3 = this.b;
                    ilVar3.getClass();
                    c40 c40Var = new c40(ilVar3);
                    ilVar3.h.put(c40Var, Boolean.FALSE);
                    while (c40Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) c40Var.next();
                        ls lsVar2 = (ls) entry2.getKey();
                        ns nsVar2 = (ns) entry2.getValue();
                        while (nsVar2.a.compareTo(this.c) < 0 && !this.g && this.b.j.containsKey(lsVar2)) {
                            arrayList.add(nsVar2.a);
                            es esVar2 = gs.Companion;
                            hs hsVar5 = nsVar2.a;
                            esVar2.getClass();
                            hsVar5.getClass();
                            int ordinal2 = hsVar5.ordinal();
                            gs gsVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : gs.ON_RESUME : gs.ON_START : gs.ON_CREATE;
                            if (gsVar2 == null) {
                                throw new IllegalStateException("no event up from " + nsVar2.a);
                            }
                            nsVar2.a(msVar, gsVar2);
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
