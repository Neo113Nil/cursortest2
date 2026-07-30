package com.realsil.sdk.dfu.u;

import java.util.Locale;

/* loaded from: classes4.dex */
public class b extends com.realsil.sdk.dfu.k.d {

    /* renamed from: a, reason: collision with root package name */
    public int f16339a;

    /* renamed from: b, reason: collision with root package name */
    public int f16340b;

    /* renamed from: c, reason: collision with root package name */
    public int f16341c;

    /* renamed from: d, reason: collision with root package name */
    public int f16342d;

    /* renamed from: com.realsil.sdk.dfu.u.b$b, reason: collision with other inner class name */
    public static class C0333b {

        /* renamed from: a, reason: collision with root package name */
        public int f16343a;

        /* renamed from: b, reason: collision with root package name */
        public int f16344b;

        /* renamed from: c, reason: collision with root package name */
        public int f16345c;

        /* renamed from: d, reason: collision with root package name */
        public int f16346d;

        /* renamed from: e, reason: collision with root package name */
        public int f16347e;

        public C0333b(int i8, int i9) {
            this.f16343a = i8;
            this.f16344b = i9;
        }

        public C0333b a(int i8) {
            this.f16345c = i8;
            return this;
        }

        public C0333b a(int i8, int i9) {
            this.f16346d = i8;
            this.f16347e = i9;
            return this;
        }

        public b a() {
            return new b(this.f16343a, this.f16345c, this.f16346d, this.f16347e);
        }
    }

    public b(int i8, int i9, int i10, int i11) {
        this.f16339a = i8;
        this.f16340b = i9;
        this.f16341c = i10;
        this.f16342d = i11;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public byte[] a() {
        int i8 = this.f16340b;
        return new byte[]{(byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) (this.f16341c & 255), (byte) (this.f16342d & 255)};
    }

    @Override // com.realsil.sdk.dfu.k.d
    public int b() {
        return this.f16339a;
    }

    public String toString() {
        return String.format("ReportImageNumberCmd(0x%04X) {", Integer.valueOf(b())) + String.format(Locale.US, "\n\t%d/%d imageId=0x%04X", Integer.valueOf(this.f16341c), Integer.valueOf(this.f16342d), Integer.valueOf(this.f16340b)) + "\n}";
    }
}
