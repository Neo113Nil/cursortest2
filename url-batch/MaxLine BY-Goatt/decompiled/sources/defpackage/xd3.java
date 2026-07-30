package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xd3 {
    public final js0 a;
    public js0 b;
    public final t13 c;
    public final at3 d;

    public xd3() {
        js0 js0Var = new js0(16);
        this.a = js0Var;
        this.b = ((js0) js0Var.n).L();
        this.c = new t13();
        this.d = new at3();
        final int i = 1;
        Callable callable = new Callable(this) { // from class: gb3
            public final /* synthetic */ xd3 n;

            {
                this.n = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = i;
                xd3 xd3Var = this.n;
                switch (i2) {
                    case 0:
                        return new ol3(xd3Var.c);
                    default:
                        return new ol3(xd3Var.d);
                }
            }
        };
        ot2 ot2Var = (ot2) js0Var.p;
        ((HashMap) ot2Var.n).put("internal.registerCallback", callable);
        final int i2 = 0;
        ((HashMap) ot2Var.n).put("internal.eventLogger", new Callable(this) { // from class: gb3
            public final /* synthetic */ xd3 n;

            {
                this.n = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i22 = i2;
                xd3 xd3Var = this.n;
                switch (i22) {
                    case 0:
                        return new ol3(xd3Var.c);
                    default:
                        return new ol3(xd3Var.d);
                }
            }
        });
    }

    public final boolean a(jb3 jb3Var) {
        t13 t13Var = this.c;
        try {
            t13Var.o = jb3Var;
            t13Var.p = jb3Var.clone();
            ((ArrayList) t13Var.n).clear();
            ((js0) this.a.o).N("runtime.counter", new xb3(Double.valueOf(0.0d)));
            this.d.a(this.b.L(), t13Var);
            if (((jb3) t13Var.p).equals((jb3) t13Var.o)) {
                return !((ArrayList) t13Var.n).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new re3(th);
        }
    }

    public final void b(lk3 lk3Var) {
        zb3 zb3Var;
        try {
            js0 js0Var = this.a;
            this.b = ((js0) js0Var.n).L();
            if (js0Var.H(this.b, (nk3[]) lk3Var.p().toArray(new nk3[0])) instanceof vb3) {
                throw new IllegalStateException("Program loading failed");
            }
            for (ik3 ik3Var : lk3Var.q().p()) {
                List q = ik3Var.q();
                String p = ik3Var.p();
                Iterator it = q.iterator();
                while (it.hasNext()) {
                    kc3 H = js0Var.H(this.b, (nk3) it.next());
                    if (!(H instanceof fc3)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    js0 js0Var2 = this.b;
                    if (js0Var2.M(p)) {
                        kc3 P = js0Var2.P(p);
                        if (!(P instanceof zb3)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(p)));
                        }
                        zb3Var = (zb3) P;
                    } else {
                        zb3Var = null;
                    }
                    if (zb3Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(p)));
                    }
                    zb3Var.h(this.b, Collections.singletonList(H));
                }
            }
        } catch (Throwable th) {
            throw new re3(th);
        }
    }
}
