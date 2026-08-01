package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class iv {
    public final u40 a;
    public final lv b = new lv();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public iv(u40 u40Var) {
        this.a = u40Var;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    public final void a(kv kvVar) {
        if (this.d.add(kvVar)) {
            this.b.a(this, kvVar, -1);
        }
    }

    public final void b(ew ewVar, int i) {
        if (i != 1 && i != 0) {
            o8.e(o30.e("Unsupported priority value: ", i));
        } else if (this.d.add(ewVar)) {
            this.b.a(this, ewVar, i);
        }
    }

    public final void c(kv kvVar, hv hvVar) {
        lv lvVar = this.b;
        lvVar.getClass();
        if (lvVar.g != 0) {
            return;
        }
        gw c = lvVar.c(-1);
        lvVar.f = c;
        lvVar.g = -1;
        lvVar.h = kvVar;
        if (hvVar != null) {
            if (c != null) {
                c.d.getClass();
            }
            lvVar.a.b(new nv(hvVar));
        }
    }
}
