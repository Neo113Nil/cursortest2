package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610k3 implements InterfaceC0916vo {

    /* renamed from: a, reason: collision with root package name */
    public final M8 f7700a;

    public C0610k3() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0916vo
    public final byte[] a(S8 s8, C0754ph c0754ph) {
        byte[] bArr = new byte[0];
        String str = s8.f6612b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        M8 m8 = this.f7700a;
        return ((L8) m8.f6326a.a(s8.o)).a(bArr);
    }

    public C0610k3(M8 m8) {
        this.f7700a = m8;
    }
}
