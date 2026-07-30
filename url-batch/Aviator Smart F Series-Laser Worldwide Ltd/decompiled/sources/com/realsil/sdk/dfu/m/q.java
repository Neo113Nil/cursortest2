package com.realsil.sdk.dfu.m;

import java.util.Locale;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public int f16103a;

    /* renamed from: b, reason: collision with root package name */
    public int f16104b;

    /* renamed from: c, reason: collision with root package name */
    public int f16105c;

    /* renamed from: d, reason: collision with root package name */
    public byte f16106d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16107a;

        /* renamed from: b, reason: collision with root package name */
        public int f16108b;

        /* renamed from: c, reason: collision with root package name */
        public int f16109c;

        /* renamed from: d, reason: collision with root package name */
        public byte f16110d;

        public b(int i8, int i9) {
            this.f16107a = i8;
            this.f16108b = i9;
        }

        public b a(byte b8) {
            this.f16110d = b8;
            return this;
        }

        public b a(int i8) {
            this.f16109c = i8;
            return this;
        }

        public q a() {
            return new q(this.f16107a, this.f16108b, this.f16109c, this.f16110d);
        }
    }

    public q(int i8, int i9, int i10, byte b8) {
        this.f16103a = i8;
        this.f16104b = i9;
        this.f16105c = i10;
        this.f16106d = b8;
    }

    public byte[] a() {
        int i8 = this.f16103a;
        if (i8 == 20 || i8 == 21) {
            return b();
        }
        if (this.f16104b >= 2) {
            int i9 = this.f16105c;
            return new byte[]{c(), (byte) (i9 & 255), (byte) ((i9 >> 8) & 255), this.f16106d};
        }
        int i10 = this.f16105c;
        return new byte[]{c(), (byte) (i10 & 255), (byte) ((i10 >> 8) & 255)};
    }

    public final byte[] b() {
        byte c8 = c();
        int i8 = this.f16105c;
        return new byte[]{c8, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), this.f16106d};
    }

    public byte c() {
        return (byte) 3;
    }

    public String toString() {
        return String.format("ValidateFwImageCmd(0x%04X-0x%02X:0x%02X) {", Integer.valueOf(this.f16103a), Integer.valueOf(this.f16104b), Byte.valueOf(c())) + String.format(Locale.US, "\n\timageId=0x%04X, flag=0x%02X", Integer.valueOf(this.f16105c), Byte.valueOf(this.f16106d)) + "\n}";
    }
}
