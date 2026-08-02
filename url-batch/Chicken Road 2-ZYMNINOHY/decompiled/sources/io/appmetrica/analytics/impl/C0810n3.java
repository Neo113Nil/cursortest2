package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810n3 implements InterfaceC0521bo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0521bo, o3.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0913r3> invoke(List<C0913r3> list, C0913r3 c0913r3) {
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                S7 s7 = ((C0913r3) it.next()).f12645b;
                S7 s72 = c0913r3.f12645b;
                if (s7 == s72) {
                    if (s72 != S7.f10933c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C0913r3) obj).f12645b != S7.f10933c) {
                            arrayList.add(obj);
                        }
                    }
                    return d3.i.i0(arrayList, c0913r3);
                }
            }
        }
        return d3.i.i0(list, c0913r3);
    }
}
