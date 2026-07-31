package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class V8 implements InterfaceC2921qo {

    /* renamed from: a, reason: collision with root package name */
    public final C2486a9 f38405a;

    public V8() {
        this(new C2486a9());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2921qo
    @NonNull
    public final byte[] a(@NonNull C2647g9 c2647g9, @NonNull C3095xh c3095xh) {
        String str = c2647g9.f39057b;
        return ((Z8) this.f38405a.f38667a.a(c2647g9.f39070o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public V8(C2486a9 c2486a9) {
        this.f38405a = c2486a9;
    }
}
