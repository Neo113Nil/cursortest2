package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes3.dex */
public final class Mn implements InterfaceC2921qo {

    /* renamed from: a, reason: collision with root package name */
    public final C2486a9 f37984a;

    public Mn() {
        this(new C2486a9());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2921qo
    @NonNull
    public final byte[] a(@NonNull C2647g9 c2647g9, @NonNull C3095xh c3095xh) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(c2647g9.f39057b);
        } catch (Throwable unused) {
        }
        byte[] a4 = ((Z8) this.f37984a.f38667a.a(c2647g9.f39070o)).a(bArr);
        return a4 == null ? new byte[0] : a4;
    }

    public Mn(C2486a9 c2486a9) {
        this.f37984a = c2486a9;
    }

    @NonNull
    public final C2486a9 a() {
        return this.f37984a;
    }
}
