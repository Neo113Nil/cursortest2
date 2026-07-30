package com.realsil.sdk.dfu.x;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f16437a = 1541;

    /* renamed from: b, reason: collision with root package name */
    public byte f16438b;

    /* renamed from: c, reason: collision with root package name */
    public int f16439c;

    /* renamed from: d, reason: collision with root package name */
    public int f16440d;

    public g(byte b8, int i8, int i9) {
        this.f16438b = b8;
        this.f16439c = i8;
        this.f16440d = i9;
    }

    public int a() {
        return this.f16439c;
    }

    public byte b() {
        return this.f16438b;
    }

    public String toString() {
        return String.format("EnableBufferCheckRsp(0x%04X) {", Integer.valueOf(this.f16437a)) + String.format(Locale.US, "\n\tstatus=0x%02X,maxBufferSize=0x%04X(%d), bufferCheckMtuSize=0x%04X(%d)", Byte.valueOf(this.f16438b), Integer.valueOf(this.f16439c), Integer.valueOf(this.f16439c), Integer.valueOf(this.f16440d), Integer.valueOf(this.f16440d)) + "\n}";
    }

    public static g a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            return new g((byte) 2, 0, 0);
        }
        int length = bArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new g(bArr[0], length >= 3 ? (((short) (wrap.get(2) & 255)) << 8) | ((short) (wrap.get(1) & 255)) : 0, length >= 4 ? (((short) (wrap.get(4) & 255)) << 8) | ((short) (wrap.get(3) & 255)) : 0);
    }
}
