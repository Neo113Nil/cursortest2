package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class V implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C3023un f38384a;

    public V(@NonNull C3023un c3023un) {
        this.f38384a = c3023un;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2825n6 fromModel(@NonNull U u4) {
        C2825n6 c2825n6 = new C2825n6();
        C2997tn c2997tn = u4.f38337a;
        if (c2997tn != null) {
            c2825n6.f39490a = this.f38384a.fromModel(c2997tn);
        }
        c2825n6.f39491b = new C3058w6[u4.f38338b.size()];
        Iterator it = u4.f38338b.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            c2825n6.f39491b[i4] = this.f38384a.fromModel((C2997tn) it.next());
            i4++;
        }
        String str = u4.f38339c;
        if (str != null) {
            c2825n6.f39492c = str;
        }
        return c2825n6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final U a(@NonNull C2825n6 c2825n6) {
        throw new UnsupportedOperationException();
    }
}
