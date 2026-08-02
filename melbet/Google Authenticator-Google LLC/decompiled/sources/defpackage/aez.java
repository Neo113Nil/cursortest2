package defpackage;

import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aez {
    public static final Object a = new Object();
    public final Object b;
    int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public final Runnable h;
    private final ov i;
    private boolean j;
    private boolean k;

    public aez() {
        this.b = new Object();
        this.i = new ov();
        this.c = 0;
        Object obj = a;
        this.f = obj;
        this.h = new nc(this, 13, null);
        this.e = obj;
        this.g = -1;
    }

    static void b(String str) {
        if (!op.a().b()) {
            throw new IllegalStateException(a.Z(str, "Cannot invoke ", " on a background thread"));
        }
    }

    private final void k(aey aeyVar) {
        if (aeyVar.d) {
            if (!aeyVar.bj()) {
                aeyVar.d(false);
                return;
            }
            int i = aeyVar.e;
            int i2 = this.g;
            if (i < i2) {
                aeyVar.e = i2;
                aeyVar.c.a(this.e);
            }
        }
    }

    public final Object a() {
        Object obj = this.e;
        if (obj != a) {
            return obj;
        }
        return null;
    }

    final void c(aey aeyVar) {
        if (this.j) {
            this.k = true;
            return;
        }
        this.j = true;
        while (true) {
            this.k = false;
            if (aeyVar != null) {
                k(aeyVar);
            } else {
                ov ovVar = this.i;
                os osVar = new os(ovVar);
                ovVar.c.put(osVar, false);
                while (osVar.hasNext()) {
                    k((aey) ((or) osVar.next()).b);
                    if (this.k) {
                        break;
                    }
                }
            }
            if (!this.k) {
                this.j = false;
                return;
            }
            aeyVar = null;
        }
    }

    public final void d(aer aerVar, afd afdVar) {
        b("observe");
        if (aerVar.L().c == aek.a) {
            return;
        }
        aex aexVar = new aex(this, aerVar, afdVar);
        aey aeyVar = (aey) this.i.b(afdVar, aexVar);
        if (aeyVar != null && !aeyVar.c(aerVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (aeyVar == null) {
            aerVar.L().a(aexVar);
        }
    }

    public final void e(afd afdVar) {
        b("observeForever");
        aew aewVar = new aew(this, afdVar);
        aey aeyVar = (aey) this.i.b(afdVar, aewVar);
        if (aeyVar instanceof aex) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (aeyVar != null) {
            return;
        }
        aewVar.d(true);
    }

    public void h(afd afdVar) {
        b("removeObserver");
        ov ovVar = this.i;
        or a2 = ovVar.a(afdVar);
        Object obj = null;
        if (a2 != null) {
            ovVar.d--;
            WeakHashMap weakHashMap = ovVar.c;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((ou) it.next()).b(a2);
                }
            }
            or orVar = a2.d;
            or orVar2 = a2.c;
            if (orVar != null) {
                orVar.c = orVar2;
            } else {
                ovVar.a = orVar2;
            }
            or orVar3 = a2.c;
            if (orVar3 != null) {
                orVar3.d = orVar;
            } else {
                ovVar.b = orVar;
            }
            a2.c = null;
            a2.d = null;
            obj = a2.b;
        }
        aey aeyVar = (aey) obj;
        if (aeyVar == null) {
            return;
        }
        aeyVar.b();
        aeyVar.d(false);
    }

    public void i(Object obj) {
        throw null;
    }

    public final boolean j() {
        return this.c > 0;
    }

    public aez(Object obj) {
        this.b = new Object();
        this.i = new ov();
        this.c = 0;
        this.f = a;
        this.h = new nc(this, 13, null);
        this.e = obj;
        this.g = 0;
    }

    protected void f() {
    }

    protected void g() {
    }
}
