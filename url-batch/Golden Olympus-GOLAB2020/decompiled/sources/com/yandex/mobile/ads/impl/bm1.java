package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class bm1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f23861a;

    /* renamed from: b, reason: collision with root package name */
    public final a f23862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23863c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23864d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f23865a;

        public a(b... bVarArr) {
            this.f23865a = bVarArr;
        }

        public final b a() {
            return this.f23865a[0];
        }

        public final int b() {
            return this.f23865a.length;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f23866a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23867b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f23868c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f23869d;

        public b(int i4, float[] fArr, float[] fArr2, int i5) {
            this.f23866a = i4;
            C2253tf.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f23868c = fArr;
            this.f23869d = fArr2;
            this.f23867b = i5;
        }

        public final int a() {
            return this.f23868c.length / 3;
        }
    }

    public bm1(a aVar, a aVar2, int i4) {
        this.f23861a = aVar;
        this.f23862b = aVar2;
        this.f23863c = i4;
        this.f23864d = aVar == aVar2;
    }
}
