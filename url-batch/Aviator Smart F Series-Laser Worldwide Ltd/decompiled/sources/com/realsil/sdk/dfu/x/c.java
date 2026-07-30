package com.realsil.sdk.dfu.x;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class c extends com.realsil.sdk.dfu.k.d {

    /* renamed from: a, reason: collision with root package name */
    public int f16427a;

    /* renamed from: b, reason: collision with root package name */
    public int f16428b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f16429a;

        /* renamed from: b, reason: collision with root package name */
        public int f16430b;

        public b a(byte[] bArr, int i8) {
            this.f16429a = bArr;
            this.f16430b = i8;
            return this;
        }

        public c a() {
            return new c(this.f16430b, com.realsil.sdk.dfu.j.c.a(this.f16429a, this.f16430b));
        }
    }

    public c(int i8, int i9) {
        this.f16427a = i8;
        this.f16428b = i9;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public byte[] a() {
        int i8 = this.f16427a;
        int i9 = this.f16428b;
        return new byte[]{(byte) (i8 & 255), (byte) (i8 >> 8), (byte) (i9 & 255), (byte) ((i9 >> 8) & 255)};
    }

    @Override // com.realsil.sdk.dfu.k.d
    public int b() {
        return 1544;
    }

    public String toString() {
        return String.format("BufferCheckReq(0x%04X) {", Integer.valueOf(b())) + String.format(Locale.US, "\n\tbufferSize=%d, crc16=0x%02X", Integer.valueOf(this.f16427a), Integer.valueOf(this.f16428b)) + "\n}";
    }
}
