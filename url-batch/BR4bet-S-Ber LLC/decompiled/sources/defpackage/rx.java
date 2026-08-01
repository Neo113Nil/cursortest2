package defpackage;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class rx {
    public static final Object k = new Object();
    public final Object a;
    public final e40 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final j7 j;

    public rx(int i) {
        this.a = new Object();
        this.b = new e40();
        this.c = 0;
        this.f = k;
        this.j = new j7(7, this);
        this.e = null;
        this.g = 0;
    }

    public static void a(String str) {
        o6.V().j.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        g9.s(f60.f("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(ut utVar) {
        if (utVar.g) {
            if (!utVar.d()) {
                utVar.a(false);
                return;
            }
            int i = utVar.h;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            utVar.h = i2;
            utVar.f.a(this.e);
        }
    }

    public final void c(ut utVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (utVar != null) {
                b(utVar);
                utVar = null;
            } else {
                e40 e40Var = this.b;
                e40Var.getClass();
                c40 c40Var = new c40(e40Var);
                e40Var.h.put(c40Var, Boolean.FALSE);
                while (c40Var.hasNext()) {
                    b((ut) ((Map.Entry) c40Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public rx() {
        this.a = new Object();
        this.b = new e40();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new j7(7, this);
        this.e = obj;
        this.g = -1;
    }
}
