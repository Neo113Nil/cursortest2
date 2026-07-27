package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes.dex */
public final class Rn implements InterfaceC1067vo {

    /* renamed from: a, reason: collision with root package name */
    public final M8 f7402a;

    public Rn() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1067vo
    public final byte[] a(S8 s8, C0905ph c0905ph) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(s8.f7435b);
        } catch (Throwable unused) {
        }
        byte[] a6 = ((L8) this.f7402a.f7135a.a(s8.f7448o)).a(bArr);
        return a6 == null ? new byte[0] : a6;
    }

    public Rn(M8 m8) {
        this.f7402a = m8;
    }

    public final M8 a() {
        return this.f7402a;
    }
}
