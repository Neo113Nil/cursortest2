package com.realsil.sdk.dfu.x;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f16424a = 1544;

    /* renamed from: b, reason: collision with root package name */
    public byte f16425b;

    /* renamed from: c, reason: collision with root package name */
    public int f16426c;

    public b(byte b8, int i8) {
        this.f16425b = b8;
        this.f16426c = i8;
    }

    public byte a() {
        return this.f16425b;
    }

    public int b() {
        return this.f16426c;
    }

    public String toString() {
        return String.format("BufferCheckEvent(0x%04X) {", Integer.valueOf(this.f16424a)) + String.format(Locale.US, "\n\tstatus=0x%02X, updateOffset=0x%08X(%d)", Byte.valueOf(this.f16425b), Integer.valueOf(this.f16426c), Integer.valueOf(this.f16426c)) + "\n}";
    }

    public static b a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = bArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new b(bArr[0], length >= 5 ? wrap.getInt(1) : 0);
    }
}
