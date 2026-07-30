package com.realsil.sdk.dfu.m;

import com.realsil.sdk.core.utility.DataConverter;
import java.util.Locale;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f16032a;

    /* renamed from: b, reason: collision with root package name */
    public byte f16033b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f16034c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16035a;

        /* renamed from: b, reason: collision with root package name */
        public byte f16036b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f16037c;

        public b a(byte b8) {
            this.f16036b = b8;
            return this;
        }

        public b a(byte[] bArr) {
            this.f16037c = bArr;
            return this;
        }

        public c a() {
            return new c(this.f16035a, this.f16036b, this.f16037c);
        }
    }

    public c(int i8, byte b8, byte[] bArr) {
        this.f16032a = i8;
        this.f16033b = b8;
        this.f16034c = bArr;
    }

    public byte[] a() {
        byte[] bArr = this.f16034c;
        int length = bArr != null ? bArr.length : 0;
        byte[] bArr2 = new byte[length + 1];
        bArr2[0] = b();
        if (length > 0) {
            System.arraycopy(this.f16034c, 0, bArr2, 1, length);
        }
        return bArr2;
    }

    public byte b() {
        return this.f16033b;
    }

    public String toString() {
        return String.format("BleDfuCmd(0x%02X) {", Byte.valueOf(b())) + String.format(Locale.US, "\n\tparams=%s", DataConverter.bytes2Hex(this.f16034c)) + "\n}";
    }
}
