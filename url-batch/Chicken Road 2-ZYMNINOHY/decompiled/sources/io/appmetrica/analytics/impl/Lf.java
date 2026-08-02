package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes.dex */
public final class Lf implements InterfaceC0986to, InterfaceC1100y8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1100y8
    public final int a(I8 i8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0986to
    public final byte[] a(N8 n8, C0746kh c0746kh) {
        return TextUtils.isEmpty(n8.f10694b) ? new byte[0] : Base64.decode(n8.f10694b, 0);
    }
}
