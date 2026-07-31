package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Bl implements ListConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Cl f37258a = new Cl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3032v6[] fromModel(@NonNull List<Dl> list) {
        C3032v6[] c3032v6Arr = new C3032v6[list.size()];
        Iterator<Dl> it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            c3032v6Arr[i4] = this.f37258a.fromModel(it.next());
            i4++;
        }
        return c3032v6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Dl> a(C3032v6[] c3032v6Arr) {
        throw new UnsupportedOperationException();
    }
}
