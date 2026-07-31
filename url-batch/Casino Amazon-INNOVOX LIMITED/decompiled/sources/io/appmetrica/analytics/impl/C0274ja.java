package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0274ja implements O9 {

    /* renamed from: a, reason: collision with root package name */
    public final K8 f1320a = new K8();

    public final C0119d9[] a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C0119d9[0];
        }
        Map<String, byte[]> model = this.f1320a.toModel(bArr);
        C0119d9[] c0119d9Arr = new C0119d9[model.size()];
        for (Object obj : model.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C0119d9 c0119d9 = new C0119d9();
            c0119d9.f1212a = ((String) entry.getKey()).getBytes(Charsets.UTF_8);
            c0119d9.b = (byte[]) entry.getValue();
            c0119d9Arr[i] = c0119d9;
            i = i2;
        }
        return c0119d9Arr;
    }
}
