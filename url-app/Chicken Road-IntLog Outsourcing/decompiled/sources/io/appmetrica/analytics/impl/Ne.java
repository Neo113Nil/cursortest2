package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ne implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0506a6[] fromModel(Map<String, String> map) {
        int size = map.size();
        C0506a6[] c0506a6Arr = new C0506a6[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            c0506a6Arr[i3] = new C0506a6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C0506a6 c0506a6 = c0506a6Arr[i2];
            String key = entry.getKey();
            Charset charset = B4.a.f287a;
            c0506a6.f7832a = key.getBytes(charset);
            c0506a6Arr[i2].f7833b = entry.getValue().getBytes(charset);
            i2++;
        }
        return c0506a6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(C0506a6[] c0506a6Arr) {
        throw new UnsupportedOperationException();
    }
}
