package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final e7 f2929a;

    /* renamed from: b, reason: collision with root package name */
    public e7 f2930b;

    /* renamed from: c, reason: collision with root package name */
    public final a1.n f2931c;

    /* renamed from: d, reason: collision with root package name */
    public final l5 f2932d;

    public w5() {
        e7 e7Var = new e7();
        this.f2929a = e7Var;
        this.f2930b = ((e7) e7Var.f2259e).d();
        this.f2931c = new a1.n(7);
        this.f2932d = new l5(11);
        a aVar = new a(1, this);
        v5 v5Var = (v5) e7Var.f2262s;
        ((HashMap) v5Var.f2870e).put("internal.registerCallback", aVar);
        ((HashMap) v5Var.f2870e).put("internal.eventLogger", new a(0, this));
    }

    public final boolean a(b bVar) {
        a1.n nVar = this.f2931c;
        try {
            nVar.f41i = bVar;
            nVar.f40e = bVar.clone();
            ((ArrayList) nVar.f42r).clear();
            ((e7) this.f2929a.f2261r).f("runtime.counter", new l3(Double.valueOf(0.0d)));
            this.f2932d.h(this.f2930b.d(), nVar);
            if (((b) nVar.f40e).equals((b) nVar.f41i)) {
                return !((ArrayList) nVar.f42r).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new l6(th);
        }
    }

    public final void b(q9 q9Var) {
        e4 e4Var;
        try {
            e7 e7Var = this.f2929a;
            this.f2930b = ((e7) e7Var.f2259e).d();
            if (e7Var.b(this.f2930b, (r9[]) q9Var.t().toArray(new r9[0])) instanceof t2) {
                throw new IllegalStateException("Program loading failed");
            }
            for (p9 p9Var : q9Var.u().t()) {
                List u2 = p9Var.u();
                String t6 = p9Var.t();
                Iterator it = u2.iterator();
                while (it.hasNext()) {
                    f5 b10 = e7Var.b(this.f2930b, (r9) it.next());
                    if (!(b10 instanceof c5)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    e7 e7Var2 = this.f2930b;
                    if (e7Var2.e(t6)) {
                        f5 h10 = e7Var2.h(t6);
                        if (!(h10 instanceof e4)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(t6)));
                        }
                        e4Var = (e4) h10;
                    } else {
                        e4Var = null;
                    }
                    if (e4Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(t6)));
                    }
                    e4Var.a(this.f2930b, Collections.singletonList(b10));
                }
            }
        } catch (Throwable th) {
            throw new l6(th);
        }
    }
}
