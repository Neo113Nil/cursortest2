package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes.dex */
public final class Rn implements InterfaceC0916vo {

    /* renamed from: a, reason: collision with root package name */
    public final M8 f6581a;

    public Rn() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0916vo
    public final byte[] a(S8 s8, C0754ph c0754ph) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(s8.f6612b);
        } catch (Throwable unused) {
        }
        byte[] a3 = ((L8) this.f6581a.f6326a.a(s8.o)).a(bArr);
        return a3 == null ? new byte[0] : a3;
    }

    public Rn(M8 m8) {
        this.f6581a = m8;
    }

    public final M8 a() {
        return this.f6581a;
    }
}
