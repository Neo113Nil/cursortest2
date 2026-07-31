package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Yf implements InterfaceC2921qo, R8 {
    @Override // io.appmetrica.analytics.impl.R8
    public final int a(@NonNull EnumC2513b9 enumC2513b9) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2921qo
    @NonNull
    public final byte[] a(@NonNull C2647g9 c2647g9, @NonNull C3095xh c3095xh) {
        return TextUtils.isEmpty(c2647g9.f39057b) ? new byte[0] : Base64.decode(c2647g9.f39057b, 0);
    }
}
