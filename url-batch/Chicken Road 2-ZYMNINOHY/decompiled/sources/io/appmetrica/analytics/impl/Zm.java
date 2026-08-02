package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Zm implements InterfaceC0986to {
    @Override // io.appmetrica.analytics.impl.InterfaceC0986to
    public final byte[] a(N8 n8, C0746kh c0746kh) {
        return !TextUtils.isEmpty(n8.f10694b) ? StringUtils.getUTF8Bytes(n8.f10694b) : new byte[0];
    }
}
