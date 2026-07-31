package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3107y3 implements InterfaceC2921qo {

    /* renamed from: a, reason: collision with root package name */
    public final C2486a9 f40251a;

    public C3107y3() {
        this(new C2486a9());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2921qo
    @NonNull
    public final byte[] a(@NonNull C2647g9 c2647g9, @NonNull C3095xh c3095xh) {
        byte[] bArr = new byte[0];
        String str = c2647g9.f39057b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        C2486a9 c2486a9 = this.f40251a;
        return ((Z8) c2486a9.f38667a.a(c2647g9.f39070o)).a(bArr);
    }

    public C3107y3(C2486a9 c2486a9) {
        this.f40251a = c2486a9;
    }
}
