package com.realsil.sdk.dfu.m;

import java.util.Locale;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f16073a;

    /* renamed from: b, reason: collision with root package name */
    public int f16074b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f16075a;

        /* renamed from: b, reason: collision with root package name */
        public int f16076b;

        public b a(byte[] bArr, int i8) {
            this.f16075a = bArr;
            this.f16076b = i8;
            return this;
        }

        public l a() {
            return new l(this.f16076b, l.b(this.f16075a, this.f16076b));
        }
    }

    public l(int i8, int i9) {
        this.f16073a = i8;
        this.f16074b = i9;
    }

    public byte b() {
        return (byte) 10;
    }

    public String toString() {
        return String.format("ReportBufferCheckResultCmd(0x%04X) {", Byte.valueOf(b())) + String.format(Locale.US, "\n\tbufferSize=%d, crc16=0x%02X", Integer.valueOf(this.f16073a), Integer.valueOf(this.f16074b)) + "\n}";
    }

    public static short b(byte[] bArr, int i8) {
        short s7 = 0;
        for (int i9 = 0; i9 < i8 / 2; i9++) {
            int i10 = i9 * 2;
            s7 = (short) (s7 ^ ((short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8))));
        }
        return (short) (((s7 & 255) << 8) | ((65280 & s7) >> 8));
    }

    public byte[] a() {
        byte b8 = b();
        int i8 = this.f16073a;
        int i9 = this.f16074b;
        return new byte[]{b8, (byte) (i8 & 255), (byte) (i8 >> 8), (byte) (i9 & 255), (byte) ((i9 >> 8) & 255)};
    }
}
