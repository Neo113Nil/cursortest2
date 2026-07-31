package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Cl implements ListConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Dl f802a = new Dl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0038a6[] fromModel(List<El> list) {
        C0038a6[] c0038a6Arr = new C0038a6[list.size()];
        Iterator<El> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c0038a6Arr[i] = this.f802a.fromModel(it.next());
            i++;
        }
        return c0038a6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final List<El> a(C0038a6[] c0038a6Arr) {
        throw new UnsupportedOperationException();
    }
}
