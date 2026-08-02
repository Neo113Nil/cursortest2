package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes.dex */
public final class Pn implements InterfaceC0986to {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f10831a;

    public Pn() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0986to
    public final byte[] a(N8 n8, C0746kh c0746kh) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(n8.f10694b);
        } catch (Throwable unused) {
        }
        byte[] a3 = ((G8) this.f10831a.f10361a.a(n8.o)).a(bArr);
        return a3 == null ? new byte[0] : a3;
    }

    public Pn(H8 h8) {
        this.f10831a = h8;
    }

    public final H8 a() {
        return this.f10831a;
    }
}
