package com.realsil.sdk.dfu.m;

import java.util.Locale;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f16046a;

    /* renamed from: b, reason: collision with root package name */
    public int f16047b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16048a;

        /* renamed from: b, reason: collision with root package name */
        public int f16049b;

        public b a(int i8) {
            this.f16049b = i8;
            return this;
        }

        public f a() {
            return new f(this.f16048a, this.f16049b);
        }
    }

    public f(int i8, int i9) {
        this.f16046a = i8;
        this.f16047b = i9;
    }

    public byte[] a() {
        byte b8 = b();
        int i8 = this.f16047b;
        return new byte[]{b8, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)};
    }

    public byte b() {
        return (byte) 12;
    }

    public String toString() {
        return String.format("CopyImageReq(0x%02X) {", Byte.valueOf(b())) + String.format(Locale.US, "\n\timageId=0x%04X", Integer.valueOf(this.f16047b)) + "\n}";
    }
}
