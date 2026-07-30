package h1;

import d1.C4456b;
import d1.C4457c;
import i1.C4575b;
import java.util.ArrayList;
import k1.C4628a;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4560a {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.s f38150a = S0.s.i("k", "x", "y");

    public static I1.b a(C4575b c4575b, X0.i iVar) {
        ArrayList arrayList = new ArrayList();
        if (c4575b.I() == 1) {
            c4575b.b();
            while (c4575b.D()) {
                C4575b c4575b2 = c4575b;
                X0.i iVar2 = iVar;
                arrayList.add(new a1.l(iVar2, o.b(c4575b2, iVar2, j1.j.c(), f.f38162x, c4575b.I() == 3, false)));
                c4575b = c4575b2;
                iVar = iVar2;
            }
            c4575b.z();
            p.b(arrayList);
        } else {
            arrayList.add(new C4628a(n.b(c4575b, j1.j.c())));
        }
        return new I1.b(arrayList);
    }

    public static d1.e b(C4575b c4575b, X0.i iVar) {
        c4575b.j();
        I1.b bVar = null;
        C4456b c4456b = null;
        boolean z8 = false;
        C4456b c4456b2 = null;
        while (c4575b.I() != 4) {
            int K8 = c4575b.K(f38150a);
            if (K8 == 0) {
                bVar = a(c4575b, iVar);
            } else if (K8 != 1) {
                if (K8 != 2) {
                    c4575b.V();
                    c4575b.W();
                } else if (c4575b.I() == 6) {
                    c4575b.W();
                    z8 = true;
                } else {
                    c4456b = Z5.c.h(c4575b, iVar, true);
                }
            } else if (c4575b.I() == 6) {
                c4575b.W();
                z8 = true;
            } else {
                c4456b2 = Z5.c.h(c4575b, iVar, true);
            }
        }
        c4575b.B();
        if (z8) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return bVar != null ? bVar : new C4457c(c4456b2, c4456b);
    }
}
