package t1;

import G.C0192d;
import G.C0205j0;
import G.W;
import Z2.B;
import Z2.S;
import androidx.lifecycle.EnumC0475o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s1.C1193i;
import s1.E;
import s1.G;
import s1.H;
import z2.C1403G;
import z2.C1416U;

@Metadata
@G("composable")
/* loaded from: classes.dex */
public final class i extends H {

    /* renamed from: c, reason: collision with root package name */
    public final C0205j0 f10655c = C0192d.K(Boolean.FALSE, W.f2779l);

    @Override // s1.H
    public final s1.v a() {
        return new h(this, c.f10646a);
    }

    @Override // s1.H
    public final void d(List list, E e4) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1193i backStackEntry = (C1193i) it.next();
            s1.l b4 = b();
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            S s4 = b4.f10529c;
            Iterable iterable = (Iterable) s4.getValue();
            boolean z4 = iterable instanceof Collection;
            B b5 = b4.f10531e;
            if (!z4 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C1193i) it2.next()) == backStackEntry) {
                        Iterable iterable2 = (Iterable) ((S) b5.f4611d).getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((C1193i) it3.next()) == backStackEntry) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C1193i c1193i = (C1193i) C1403G.y((List) ((S) b5.f4611d).getValue());
            if (c1193i != null) {
                s4.l(null, C1416U.a((Set) s4.getValue(), c1193i));
            }
            s4.l(null, C1416U.a((Set) s4.getValue(), backStackEntry));
            b4.f(backStackEntry);
        }
        this.f10655c.setValue(Boolean.FALSE);
    }

    @Override // s1.H
    public final void e(C1193i c1193i, boolean z4) {
        b().e(c1193i, z4);
        this.f10655c.setValue(Boolean.TRUE);
    }

    public final void g(C1193i entry) {
        s1.l b4 = b();
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(entry, "entry");
        S s4 = b4.f10529c;
        s4.l(null, C1416U.a((Set) s4.getValue(), entry));
        if (!b4.f10534h.f10442g.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.h(EnumC0475o.f5483j);
    }
}
