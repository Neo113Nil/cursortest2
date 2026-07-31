package q1;

import a0.a0;
import o.e0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final o0.e f5984a = new o0.e(new d[16]);

    /* renamed from: b, reason: collision with root package name */
    public final e0 f5985b = new e0(10);

    public boolean a(o.q qVar, u1.p pVar, a0 a0Var, boolean z3) {
        o0.e eVar = this.f5984a;
        Object[] objArr = eVar.f5578d;
        int i = eVar.f5580f;
        boolean z7 = false;
        for (int i8 = 0; i8 < i; i8++) {
            z7 = ((d) objArr[i8]).a(qVar, pVar, a0Var, z3) || z7;
        }
        return z7;
    }

    public void b(a0 a0Var) {
        o0.e eVar = this.f5984a;
        int i = eVar.f5580f;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((d) eVar.f5578d[i]).f5978d.f4189d == 0) {
                eVar.k(i);
            }
        }
    }
}
