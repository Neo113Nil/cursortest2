package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class u22 implements ar1<String> {
    @Override // com.yandex.mobile.ads.impl.ar1
    public final String a(pq1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        byte[] a4 = networkResponse.a().a();
        if (a4 == null) {
            return null;
        }
        try {
            return new String(a4, cf0.a(networkResponse.b()));
        } catch (Exception unused) {
            return new String(a4, Charsets.UTF_8);
        }
    }
}
