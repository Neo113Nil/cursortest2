package b0;

import android.view.View;
import c2.b2;
import c2.c2;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 extends d1.k implements c2.v, c2 {
    public c1 C;
    public c1 D;
    public c1 E;
    public a1.f F;
    public e1 G;

    @Override // d1.k
    public final void A() {
        View w6 = c2.k.w(this);
        WeakHashMap weakHashMap = e1.f818v;
        e1 f3 = t.f(w6);
        f3.a(w6);
        this.F.getClass();
        a aVar = f3.f821c;
        if (!Intrinsics.a(aVar, this.E)) {
            this.E = aVar;
            I();
        }
        this.G = f3;
        c2.k.x(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new a1.d(1, this));
        I();
    }

    @Override // d1.k
    public final void B() {
        View w6 = c2.k.w(this);
        e1 e1Var = this.G;
        if (e1Var != null) {
            int i3 = e1Var.f836t - 1;
            e1Var.f836t = i3;
            if (i3 == 0) {
                Field field = o3.c0.f7378a;
                o3.w.c(w6, null);
                o3.c0.f(w6, null);
                w6.removeOnAttachStateChangeListener(e1Var.f837u);
            }
        }
        this.D = this.C;
        J();
    }

    @Override // d1.k
    public final void C() {
        this.C = i.f854a;
    }

    public final void I() {
        this.D = new a1(this.C, this.E);
        J();
        c2.k.m(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void J() {
        b2 b2Var;
        if (!this.f3305d.B) {
            z1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new d1.k[16]);
        d1.k kVar = this.f3305d;
        d1.k kVar2 = kVar.f3310t;
        if (kVar2 == null) {
            c2.k.b(eVar, kVar);
        } else {
            eVar.b(kVar2);
        }
        while (true) {
            int i3 = eVar.f7319i;
            if (i3 == 0) {
                return;
            }
            d1.k kVar3 = (d1.k) eVar.l(i3 - 1);
            if ((kVar3.f3308r & 262144) != 0) {
                for (d1.k kVar4 = kVar3; kVar4 != null && kVar4.B; kVar4 = kVar4.f3310t) {
                    if ((kVar4.f3307i & 262144) != 0) {
                        c2.j jVar = kVar4;
                        ?? r72 = 0;
                        while (jVar != 0) {
                            if (jVar instanceof c2) {
                                c2 c2Var = (c2) jVar;
                                if ("androidx.compose.foundation.layout.ConsumedInsetsProvider".equals(c2Var.d())) {
                                    z0 z0Var = (z0) c2Var;
                                    c1 c1Var = this.D;
                                    if (!Intrinsics.a(z0Var.C, c1Var)) {
                                        z0Var.C = c1Var;
                                        z0Var.I();
                                    }
                                    b2 b2Var2 = b2.f1499d;
                                    b2Var = b2.f1500e;
                                } else {
                                    b2Var = b2.f1499d;
                                }
                                if (b2Var == b2.f1501i) {
                                    return;
                                }
                                if (b2Var == b2.f1500e) {
                                    break;
                                }
                            } else if ((jVar.f3307i & 262144) != 0 && (jVar instanceof c2.j)) {
                                d1.k kVar5 = jVar.D;
                                int i10 = 0;
                                jVar = jVar;
                                r72 = r72;
                                while (kVar5 != null) {
                                    if ((kVar5.f3307i & 262144) != 0) {
                                        i10++;
                                        r72 = r72;
                                        if (i10 == 1) {
                                            jVar = kVar5;
                                        } else {
                                            if (r72 == 0) {
                                                r72 = new o0.e(new d1.k[16]);
                                            }
                                            if (jVar != 0) {
                                                r72.b(jVar);
                                                jVar = 0;
                                            }
                                            r72.b(kVar5);
                                        }
                                    }
                                    kVar5 = kVar5.f3310t;
                                    jVar = jVar;
                                    r72 = r72;
                                }
                                if (i10 == 1) {
                                }
                            }
                            jVar = c2.k.e(r72);
                        }
                    }
                }
            }
            c2.k.b(eVar, kVar3);
        }
    }

    @Override // c2.c2
    public final Object d() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // c2.v
    public final a2.h0 v(c2.o0 o0Var, a2.f0 f0Var, long j) {
        int b10 = this.D.b(o0Var, o0Var.getLayoutDirection()) - this.C.b(o0Var, o0Var.getLayoutDirection());
        int c10 = this.D.c(o0Var) - this.C.c(o0Var);
        int d10 = (this.D.d(o0Var, o0Var.getLayoutDirection()) - this.C.d(o0Var, o0Var.getLayoutDirection())) + b10;
        int a9 = (this.D.a(o0Var) - this.C.a(o0Var)) + c10;
        a2.o0 c11 = f0Var.c(x2.b.h(-d10, -a9, j));
        return a2.i0.V(o0Var, x2.b.f(c11.f131d + d10, j), x2.b.e(c11.f132e + a9, j), new g0(c11, b10, c10));
    }
}
