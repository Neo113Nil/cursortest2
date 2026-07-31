package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Da implements InterfaceC2700ia {

    /* renamed from: a, reason: collision with root package name */
    public final C2540c9 f37357a = new C2540c9();

    @NotNull
    public final C3087x9[] a(@Nullable byte[] bArr) {
        int i4 = 0;
        if (bArr == null) {
            return new C3087x9[0];
        }
        Map<String, byte[]> model = this.f37357a.toModel(bArr);
        C3087x9[] c3087x9Arr = new C3087x9[model.size()];
        for (Object obj : model.entrySet()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C3087x9 c3087x9 = new C3087x9();
            c3087x9.f40160a = ((String) entry.getKey()).getBytes(Charsets.UTF_8);
            c3087x9.f40161b = (byte[]) entry.getValue();
            c3087x9Arr[i4] = c3087x9;
            i4 = i5;
        }
        return c3087x9Arr;
    }
}
