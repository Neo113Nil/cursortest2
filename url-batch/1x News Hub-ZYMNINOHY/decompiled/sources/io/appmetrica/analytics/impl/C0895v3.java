package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895v3 implements Cdo {
    @Override // io.appmetrica.analytics.impl.Cdo, l2.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0997z3> invoke(List<C0997z3> list, C0997z3 c0997z3) {
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Y7 y7 = ((C0997z3) it.next()).f8661b;
                Y7 y72 = c0997z3.f8661b;
                if (y7 == y72) {
                    if (y72 != Y7.f6892c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C0997z3) obj).f8661b != Y7.f6892c) {
                            arrayList.add(obj);
                        }
                    }
                    return c2.e.U(arrayList, c0997z3);
                }
            }
        }
        return c2.e.U(list, c0997z3);
    }
}
