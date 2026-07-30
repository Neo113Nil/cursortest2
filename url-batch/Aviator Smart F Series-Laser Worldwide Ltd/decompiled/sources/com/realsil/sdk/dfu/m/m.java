package com.realsil.sdk.dfu.m;

import java.util.Locale;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public byte f16077a;

    /* renamed from: b, reason: collision with root package name */
    public int f16078b;

    /* renamed from: c, reason: collision with root package name */
    public int f16079c;

    /* renamed from: d, reason: collision with root package name */
    public int f16080d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16081a;

        /* renamed from: b, reason: collision with root package name */
        public int f16082b;

        /* renamed from: c, reason: collision with root package name */
        public int f16083c;

        /* renamed from: d, reason: collision with root package name */
        public int f16084d;

        /* renamed from: e, reason: collision with root package name */
        public int f16085e;

        public b(int i8, int i9) {
            this.f16081a = i8;
            this.f16082b = i9;
        }

        public b a(int i8) {
            this.f16083c = i8;
            return this;
        }

        public b a(int i8, int i9) {
            this.f16084d = i8;
            this.f16085e = i9;
            return this;
        }

        public m a() {
            int i8 = this.f16081a;
            return new m(i8 == 16 ? (byte) 19 : (i8 == 21 || i8 == 20) ? (byte) 18 : (byte) 0, this.f16083c, this.f16084d, this.f16085e);
        }
    }

    public m(byte b8, int i8, int i9, int i10) {
        this.f16077a = b8;
        this.f16078b = i8;
        this.f16079c = i9;
        this.f16080d = i10;
    }

    public byte[] a() {
        byte b8 = b();
        int i8 = this.f16078b;
        return new byte[]{b8, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) (this.f16079c & 255), (byte) (this.f16080d & 255)};
    }

    public byte b() {
        return this.f16077a;
    }

    public String toString() {
        return String.format("ReportImageNumberCmd(0x%02X) {", Byte.valueOf(b())) + String.format(Locale.US, "\t%d/%d imageId=0x%04X", Integer.valueOf(this.f16079c), Integer.valueOf(this.f16080d), Integer.valueOf(this.f16078b)) + "}";
    }
}
