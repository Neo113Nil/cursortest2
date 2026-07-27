package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575cn implements InterfaceC1067vo {
    @Override // io.appmetrica.analytics.impl.InterfaceC1067vo
    public final byte[] a(S8 s8, C0905ph c0905ph) {
        return !TextUtils.isEmpty(s8.f7435b) ? StringUtils.getUTF8Bytes(s8.f7435b) : new byte[0];
    }
}
