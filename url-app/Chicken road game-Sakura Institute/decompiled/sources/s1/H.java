package s1;

import Z2.S;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import s0.C1160o0;
import z2.C1437u;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public l f10484a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10485b;

    public abstract v a();

    public final l b() {
        l lVar = this.f10484a;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public v c(v destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void d(List entries, E e4) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(entries, "<this>");
        T2.f fVar = new T2.f(T2.r.g(T2.r.i(new C1437u(1, entries), new C1160o0(this, e4))));
        while (fVar.hasNext()) {
            b().f((C1193i) fVar.next());
        }
    }

    public void e(C1193i popUpTo, boolean z4) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List list = (List) ((S) b().f10531e.f4611d).getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C1193i c1193i = null;
        while (f()) {
            c1193i = (C1193i) listIterator.previous();
            if (Intrinsics.a(c1193i, popUpTo)) {
                break;
            }
        }
        if (c1193i != null) {
            b().c(c1193i, z4);
        }
    }

    public boolean f() {
        return true;
    }
}
