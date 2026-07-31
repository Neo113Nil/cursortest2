package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bn3 implements wc3 {

    /* renamed from: a, reason: collision with root package name */
    private final mn3 f3471a;

    /* renamed from: b, reason: collision with root package name */
    private final pd3 f3472b;

    public bn3(mn3 mn3Var, pd3 pd3Var, int i7) {
        this.f3471a = mn3Var;
        this.f3472b = pd3Var;
    }

    @Override // com.google.android.gms.internal.ads.wc3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a7 = this.f3471a.a(bArr);
        return pm3.b(a7, this.f3472b.a(pm3.b(bArr2, a7, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
