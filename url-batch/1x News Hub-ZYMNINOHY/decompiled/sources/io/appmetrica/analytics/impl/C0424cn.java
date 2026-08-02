package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424cn implements InterfaceC0916vo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0916vo
    public final byte[] a(S8 s8, C0754ph c0754ph) {
        return !TextUtils.isEmpty(s8.f6612b) ? StringUtils.getUTF8Bytes(s8.f6612b) : new byte[0];
    }
}
