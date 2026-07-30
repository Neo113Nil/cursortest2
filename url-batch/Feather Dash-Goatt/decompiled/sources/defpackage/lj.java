package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lj {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public final int e;
    public ak f;
    public final HashSet g;

    public lj(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(v01.a(cls));
        for (Class cls2 : clsArr) {
            ca0.f(cls2, "Null interface");
            this.b.add(v01.a(cls2));
        }
    }

    public final void a(qr qrVar) {
        if (this.b.contains(qrVar.a)) {
            dd0.e("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(qrVar);
        }
    }

    public final mj b() {
        if (this.f != null) {
            return new mj(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        dd0.j("Missing required property: factory.");
        return null;
    }

    public lj(v01 v01Var, v01[] v01VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(v01Var);
        for (v01 v01Var2 : v01VarArr) {
            ca0.f(v01Var2, "Null interface");
        }
        Collections.addAll(this.b, v01VarArr);
    }
}
