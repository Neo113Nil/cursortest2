package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class tm3 implements wc3 {

    /* renamed from: a, reason: collision with root package name */
    private final rm3 f12269a;

    /* renamed from: b, reason: collision with root package name */
    private final rm3 f12270b;

    public tm3(byte[] bArr) {
        if (!qf3.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f12269a = b(bArr, 1);
        this.f12270b = b(bArr, 0);
    }

    @Override // com.google.android.gms.internal.ads.wc3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > (Integer.MAX_VALUE - this.f12269a.b()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(this.f12269a.b() + length + 16);
        if (allocate.remaining() < length + this.f12269a.b() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.f12269a.e(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[this.f12269a.b()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        byte[] bArr4 = new byte[32];
        this.f12270b.d(bArr3, 0).get(bArr4);
        int remaining = allocate.remaining();
        int i7 = remaining % 16;
        int i8 = i7 == 0 ? remaining : (remaining + 16) - i7;
        ByteBuffer order = ByteBuffer.allocate(i8 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr2);
        order.position(0);
        order.put(allocate);
        order.position(i8);
        order.putLong(0L);
        order.putLong(remaining);
        byte[] a7 = on3.a(bArr4, order.array());
        allocate.limit(allocate.limit() + 16);
        allocate.put(a7);
        return allocate.array();
    }

    abstract rm3 b(byte[] bArr, int i7);
}
