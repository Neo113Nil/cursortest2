package com.realsil.sdk.dfu.m;

import com.realsil.sdk.core.utility.DataConverter;
import java.util.Locale;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16065a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16066b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f16067c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f16068d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f16069a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f16070b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f16071c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f16072d;

        public b a(byte[] bArr, byte[] bArr2) {
            this.f16069a = bArr;
            this.f16070b = bArr2;
            return this;
        }

        public b b(byte[] bArr, byte[] bArr2) {
            this.f16071c = bArr;
            this.f16072d = bArr2;
            return this;
        }

        public k a() {
            return new k(this.f16069a, this.f16070b, this.f16071c, this.f16072d);
        }
    }

    public k(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f16065a = bArr;
        this.f16066b = bArr2;
        this.f16067c = bArr3;
        this.f16068d = bArr4;
    }

    public byte[] a() {
        byte[] bArr = new byte[17];
        bArr[0] = 14;
        byte[] bArr2 = this.f16066b;
        if (bArr2 != null && bArr2.length >= 16) {
            System.arraycopy(bArr2, 0, bArr, 1, 16);
        }
        return bArr;
    }

    public byte b() {
        return (byte) 14;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("HandshakeCmd(0x%04X) {", Byte.valueOf(b())));
        Locale locale = Locale.US;
        sb.append(String.format(locale, "\n\torigin=%s", DataConverter.bytes2Hex(this.f16066b)));
        sb.append(String.format(locale, "\n\ttarget=%s", DataConverter.bytes2Hex(this.f16068d)));
        sb.append("\n}");
        return sb.toString();
    }
}
