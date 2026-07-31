package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class We implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2877p6[] fromModel(@NotNull Map<String, String> map) {
        int size = map.size();
        C2877p6[] c2877p6Arr = new C2877p6[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            c2877p6Arr[i5] = new C2877p6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C2877p6 c2877p6 = c2877p6Arr[i4];
            String key = entry.getKey();
            Charset charset = Charsets.UTF_8;
            c2877p6.f39605a = key.getBytes(charset);
            c2877p6Arr[i4].f39606b = entry.getValue().getBytes(charset);
            i4++;
        }
        return c2877p6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Map<String, String> a(@NotNull C2877p6[] c2877p6Arr) {
        throw new UnsupportedOperationException();
    }
}
