package com.realsil.sdk.dfu.x;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import y5.u;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f16443a = 1543;

    /* renamed from: b, reason: collision with root package name */
    public byte f16444b;

    /* renamed from: c, reason: collision with root package name */
    public int f16445c;

    /* renamed from: d, reason: collision with root package name */
    public int f16446d;

    /* renamed from: e, reason: collision with root package name */
    public int f16447e;

    public l(byte b8, int i8, int i9, int i10) {
        this.f16444b = b8;
        this.f16445c = i8;
        this.f16446d = i9;
        this.f16447e = i10;
    }

    public int a() {
        return this.f16447e;
    }

    public byte b() {
        return this.f16444b;
    }

    public int c() {
        return this.f16446d;
    }

    public String toString() {
        return String.format("GeTargetImageInfoRsp(0x%04X) {", 1543) + String.format(Locale.US, "\n\tstatus=0x%02X,imageVersion=0x%08X, updateOffset=0x%08X(%d),bufferCheckOffset=0x%08X(%d)", Byte.valueOf(this.f16444b), Integer.valueOf(this.f16445c), Integer.valueOf(this.f16446d), Integer.valueOf(this.f16446d), Integer.valueOf(this.f16447e), Integer.valueOf(this.f16447e)) + "\n}";
    }

    public static l a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int length = bArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new l(bArr[0], length >= 5 ? wrap.getInt(1) : 0, length >= 9 ? wrap.getInt(5) : 0, length >= 11 ? wrap.getShort(9) & u.MAX_VALUE : 0);
    }
}
