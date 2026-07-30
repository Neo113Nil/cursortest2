package o0;

import g0.l;
import g0.p;
import g0.p1;
import g0.u;
import java.util.ArrayList;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f6826a = new e(0, new long[0], new Object[0]);

    public static final int a(int i7, int i8) {
        return i7 << (((i8 % 10) * 3) + 1);
    }

    public static final a b(int i7, d6.e eVar, p pVar) {
        Object G = pVar.G();
        if (G == l.f3784a) {
            G = new a(i7, eVar, true);
            pVar.a0(G);
        }
        a aVar = (a) G;
        if (!k.a(aVar.f6812h, eVar)) {
            boolean z8 = aVar.f6812h == null;
            aVar.f6812h = eVar;
            if (!z8 && aVar.f6811g) {
                p1 p1Var = aVar.f6813i;
                if (p1Var != null) {
                    u uVar = p1Var.f3851b;
                    if (uVar != null) {
                        uVar.p(p1Var, null);
                    }
                    aVar.f6813i = null;
                }
                ArrayList arrayList = aVar.f6814j;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        p1 p1Var2 = (p1) arrayList.get(i8);
                        u uVar2 = p1Var2.f3851b;
                        if (uVar2 != null) {
                            uVar2.p(p1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return aVar;
    }

    public static final boolean c(p1 p1Var, p1 p1Var2) {
        if (p1Var == null) {
            return true;
        }
        if (p1Var instanceof p1) {
            return !p1Var.b() || p1Var.equals(p1Var2) || k.a(p1Var.f3852c, p1Var2.f3852c);
        }
        return false;
    }
}
