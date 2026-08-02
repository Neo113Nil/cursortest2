package io.appmetrica.analytics.impl;

import java.util.Map;
import w3.AbstractC1504a;

/* renamed from: io.appmetrica.analytics.impl.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688ia implements N9 {

    /* renamed from: a, reason: collision with root package name */
    public final J8 f12037a = new J8();

    public final C0532c9[] a(byte[] bArr) {
        int i4 = 0;
        if (bArr == null) {
            return new C0532c9[0];
        }
        Map<String, byte[]> model = this.f12037a.toModel(bArr);
        C0532c9[] c0532c9Arr = new C0532c9[model.size()];
        for (Object obj : model.entrySet()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                d3.j.X();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0532c9 c0532c9 = new C0532c9();
            c0532c9.f11597a = ((String) entry.getKey()).getBytes(AbstractC1504a.f15936a);
            c0532c9.f11598b = (byte[]) entry.getValue();
            c0532c9Arr[i4] = c0532c9;
            i4 = i5;
        }
        return c0532c9Arr;
    }
}
