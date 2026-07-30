package com.realsil.sdk.dfu.m;

import com.realsil.sdk.core.utility.DataConverter;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f16099a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16100b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16101a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f16102b;

        public b(int i8) {
            this.f16101a = i8;
        }

        public b a(byte[] bArr) {
            this.f16102b = bArr;
            return this;
        }

        public p a() {
            return new p(this.f16101a, this.f16102b);
        }
    }

    public p(int i8, byte[] bArr) {
        this.f16099a = i8;
        this.f16100b = bArr;
    }

    public byte[] a() {
        int length = this.f16100b.length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = b();
        if (length > 0) {
            System.arraycopy(this.f16100b, 0, bArr, 1, length);
        }
        return bArr;
    }

    public byte b() {
        return (byte) 1;
    }

    public String toString() {
        return String.format("StartDfuCmd(0x%02X) {", Byte.valueOf(b())) + String.format(Locale.US, "\n\tparams=(%d)%s", Integer.valueOf(this.f16100b.length), DataConverter.bytes2Hex(this.f16100b)) + "\n}";
    }
}
