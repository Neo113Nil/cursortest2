package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class hf3 implements wc3 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f6222c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final tk3 f6223a;

    /* renamed from: b, reason: collision with root package name */
    private final wc3 f6224b;

    public hf3(tk3 tk3Var, wc3 wc3Var) {
        this.f6223a = tk3Var;
        this.f6224b = wc3Var;
    }

    @Override // com.google.android.gms.internal.ads.wc3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] d7 = ee3.d(this.f6223a).d();
        byte[] a7 = this.f6224b.a(d7, f6222c);
        byte[] a8 = ((wc3) ee3.h(this.f6223a.J(), d7, wc3.class)).a(bArr, bArr2);
        int length = a7.length;
        return ByteBuffer.allocate(length + 4 + a8.length).putInt(length).put(a7).put(a8).array();
    }
}
