package u0;

import java.util.ArrayList;
import m0.n;
import m0.s;
import m0.t1;
import m0.y;
import q6.v;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f7152a = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public static final j f7153b = new j(0, new long[0], new Object[0]);

    public static final int a(int i, int i8) {
        return i << (((i8 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(s sVar, p6.e eVar) {
        q6.i.c(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        v.c(2, eVar);
        eVar.g(sVar, 1);
    }

    public static final c d(int i, c6.c cVar, s sVar) {
        Object K = sVar.K();
        if (K == n.f5019a) {
            K = new c(i, true, cVar);
            sVar.f0(K);
        }
        c cVar2 = (c) K;
        if (!q6.i.a(cVar2.f7140f, cVar)) {
            boolean z3 = cVar2.f7140f == null;
            cVar2.f7140f = cVar;
            if (!z3 && cVar2.f7139e) {
                t1 t1Var = cVar2.f7141g;
                if (t1Var != null) {
                    y yVar = t1Var.f5118a;
                    if (yVar != null) {
                        yVar.s(t1Var, null);
                    }
                    cVar2.f7141g = null;
                }
                ArrayList arrayList = cVar2.f7142h;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        t1 t1Var2 = (t1) arrayList.get(i8);
                        y yVar2 = t1Var2.f5118a;
                        if (yVar2 != null) {
                            yVar2.s(t1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return cVar2;
    }

    public static final boolean e(t1 t1Var, t1 t1Var2) {
        if (t1Var == null) {
            return true;
        }
        if (t1Var instanceof t1) {
            return !t1Var.b() || t1Var.equals(t1Var2) || q6.i.a(t1Var.f5120c, t1Var2.f5120c);
        }
        return false;
    }
}
