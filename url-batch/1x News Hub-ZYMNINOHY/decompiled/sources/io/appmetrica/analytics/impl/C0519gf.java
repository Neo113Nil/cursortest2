package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519gf implements Cdo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7402a;

    public C0519gf(Cif cif) {
        boolean z;
        List<C0545hf> list = cif.f7567b;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0545hf) it.next()).f7445c == Y7.f6892c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.f7402a = z;
    }

    @Override // io.appmetrica.analytics.impl.Cdo, l2.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0545hf> invoke(List<? extends C0545hf> list, C0907vf c0907vf) {
        C0545hf c0545hf = new C0545hf(c0907vf.f8517a, c0907vf.f8518b, c0907vf.f8521e);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0545hf) it.next()).f7445c == c0907vf.f8521e) {
                    if (c0545hf.f7445c == Y7.f6892c && this.f7402a) {
                        return c2.e.U(list, c0545hf);
                    }
                    return null;
                }
            }
        }
        return c2.e.U(list, c0545hf);
    }
}
