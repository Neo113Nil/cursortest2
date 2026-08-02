package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747pa implements U9 {

    /* renamed from: a, reason: collision with root package name */
    public final O8 f8076a = new O8();

    public final C0590j9[] a(byte[] bArr) {
        int i3 = 0;
        if (bArr == null) {
            return new C0590j9[0];
        }
        Map<String, byte[]> model = this.f8076a.toModel(bArr);
        C0590j9[] c0590j9Arr = new C0590j9[model.size()];
        for (Object obj : model.entrySet()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                c2.f.M();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0590j9 c0590j9 = new C0590j9();
            c0590j9.f7631a = ((String) entry.getKey()).getBytes(s2.a.f10316a);
            c0590j9.f7632b = (byte[]) entry.getValue();
            c0590j9Arr[i3] = c0590j9;
            i3 = i4;
        }
        return c0590j9Arr;
    }
}
