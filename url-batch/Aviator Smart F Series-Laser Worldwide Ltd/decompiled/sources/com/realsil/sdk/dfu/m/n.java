package com.realsil.sdk.dfu.m;

import java.util.Locale;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f16086a;

    /* renamed from: b, reason: collision with root package name */
    public int f16087b;

    /* renamed from: c, reason: collision with root package name */
    public int f16088c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16089a;

        /* renamed from: b, reason: collision with root package name */
        public int f16090b;

        /* renamed from: c, reason: collision with root package name */
        public int f16091c;

        public b(int i8) {
            this.f16089a = i8;
        }

        public b a(int i8) {
            this.f16090b = i8;
            return this;
        }

        public b b(int i8) {
            this.f16091c = i8;
            return this;
        }

        public n a() {
            return new n(this.f16089a, this.f16090b, this.f16091c);
        }
    }

    public n(int i8, int i9, int i10) {
        this.f16086a = i8;
        this.f16087b = i9;
        this.f16088c = i10;
    }

    public byte[] a() {
        byte b8 = b();
        int i8 = this.f16087b;
        int i9 = this.f16088c;
        return new byte[]{b8, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) (i9 & 255), (byte) ((i9 >> 8) & 255), (byte) ((i9 >> 16) & 255), (byte) ((i9 >> 24) & 255)};
    }

    public byte b() {
        return (byte) 2;
    }

    public String toString() {
        return String.format("SetDfuReceiveFwImageCmd (0x%02X) {", Byte.valueOf(b())) + String.format(Locale.US, "\n\timageId=0x%04X, offset=0x%08X(%d)", Integer.valueOf(this.f16087b), Integer.valueOf(this.f16088c), Integer.valueOf(this.f16088c)) + "\n}";
    }
}
