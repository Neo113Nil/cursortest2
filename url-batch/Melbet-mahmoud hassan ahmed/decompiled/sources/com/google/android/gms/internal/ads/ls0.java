package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ls0 implements Iterable<ks0> {

    /* renamed from: f, reason: collision with root package name */
    private final List<ks0> f8063f = new ArrayList();

    final ks0 i(tq0 tq0Var) {
        Iterator<ks0> it = iterator();
        while (it.hasNext()) {
            ks0 next = it.next();
            if (next.f7611c == tq0Var) {
                return next;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<ks0> iterator() {
        return this.f8063f.iterator();
    }

    public final void j(ks0 ks0Var) {
        this.f8063f.add(ks0Var);
    }

    public final void k(ks0 ks0Var) {
        this.f8063f.remove(ks0Var);
    }

    public final boolean l(tq0 tq0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<ks0> it = iterator();
        while (it.hasNext()) {
            ks0 next = it.next();
            if (next.f7611c == tq0Var) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ks0) it2.next()).f7612d.g();
        }
        return true;
    }
}
