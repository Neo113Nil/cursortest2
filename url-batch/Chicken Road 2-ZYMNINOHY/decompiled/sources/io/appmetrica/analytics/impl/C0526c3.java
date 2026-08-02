package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526c3 implements InterfaceC0986to {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f11569a;

    public C0526c3() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0986to
    public final byte[] a(N8 n8, C0746kh c0746kh) {
        byte[] bArr = new byte[0];
        String str = n8.f10694b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        H8 h8 = this.f11569a;
        return ((G8) h8.f10361a.a(n8.o)).a(bArr);
    }

    public C0526c3(H8 h8) {
        this.f11569a = h8;
    }
}
