package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class Ie implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5[] fromModel(Map<String, String> map) {
        int size = map.size();
        T5[] t5Arr = new T5[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            t5Arr[i5] = new T5();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            T5 t5 = t5Arr[i4];
            String key = entry.getKey();
            Charset charset = AbstractC1504a.f15936a;
            t5.f10979a = key.getBytes(charset);
            t5Arr[i4].f10980b = entry.getValue().getBytes(charset);
            i4++;
        }
        return t5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(T5[] t5Arr) {
        throw new UnsupportedOperationException();
    }
}
