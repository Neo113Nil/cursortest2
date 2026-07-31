package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mg3 {

    /* renamed from: a, reason: collision with root package name */
    private final wc3 f8559a;

    /* renamed from: b, reason: collision with root package name */
    private final zc3 f8560b;

    public mg3(wc3 wc3Var) {
        this.f8559a = wc3Var;
        this.f8560b = null;
    }

    public mg3(zc3 zc3Var) {
        this.f8559a = null;
        this.f8560b = zc3Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        wc3 wc3Var = this.f8559a;
        return wc3Var != null ? wc3Var.a(bArr, bArr2) : this.f8560b.a(bArr, bArr2);
    }
}
