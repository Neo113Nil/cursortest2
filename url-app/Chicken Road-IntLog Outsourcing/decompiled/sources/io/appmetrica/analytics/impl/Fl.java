package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Fl implements ListConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Gl f6796a = new Gl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0661g6[] fromModel(List<Hl> list) {
        C0661g6[] c0661g6Arr = new C0661g6[list.size()];
        Iterator<Hl> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c0661g6Arr[i2] = this.f6796a.fromModel(it.next());
            i2++;
        }
        return c0661g6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final List<Hl> a(C0661g6[] c0661g6Arr) {
        throw new UnsupportedOperationException();
    }
}
