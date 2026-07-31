package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class Ym implements InterfaceC2921qo {
    @Override // io.appmetrica.analytics.impl.InterfaceC2921qo
    @NonNull
    public final byte[] a(@NonNull C2647g9 c2647g9, @NonNull C3095xh c3095xh) {
        return !TextUtils.isEmpty(c2647g9.f39057b) ? StringUtils.getUTF8Bytes(c2647g9.f39057b) : new byte[0];
    }
}
