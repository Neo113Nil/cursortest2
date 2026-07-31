package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class ab0 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f23201c;

    /* renamed from: e, reason: collision with root package name */
    private int f23203e;

    /* renamed from: a, reason: collision with root package name */
    private a f23199a = new a();

    /* renamed from: b, reason: collision with root package name */
    private a f23200b = new a();

    /* renamed from: d, reason: collision with root package name */
    private long f23202d = -9223372036854775807L;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f23204a;

        /* renamed from: b, reason: collision with root package name */
        private long f23205b;

        /* renamed from: c, reason: collision with root package name */
        private long f23206c;

        /* renamed from: d, reason: collision with root package name */
        private long f23207d;

        /* renamed from: e, reason: collision with root package name */
        private long f23208e;

        /* renamed from: f, reason: collision with root package name */
        private long f23209f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f23210g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f23211h;

        public final boolean a() {
            return this.f23207d > 15 && this.f23211h == 0;
        }

        public final void a(long j4) {
            long j5 = this.f23207d;
            if (j5 == 0) {
                this.f23204a = j4;
            } else if (j5 == 1) {
                long j6 = j4 - this.f23204a;
                this.f23205b = j6;
                this.f23209f = j6;
                this.f23208e = 1L;
            } else {
                long j7 = j4 - this.f23206c;
                int i4 = (int) (j5 % 15);
                if (Math.abs(j7 - this.f23205b) <= 1000000) {
                    this.f23208e++;
                    this.f23209f += j7;
                    boolean[] zArr = this.f23210g;
                    if (zArr[i4]) {
                        zArr[i4] = false;
                        this.f23211h--;
                    }
                } else {
                    boolean[] zArr2 = this.f23210g;
                    if (!zArr2[i4]) {
                        zArr2[i4] = true;
                        this.f23211h++;
                    }
                }
            }
            this.f23207d++;
            this.f23206c = j4;
        }
    }

    public final long a() {
        if (!this.f23199a.a()) {
            return -9223372036854775807L;
        }
        a aVar = this.f23199a;
        long j4 = aVar.f23208e;
        if (j4 == 0) {
            return 0L;
        }
        return aVar.f23209f / j4;
    }

    public final float b() {
        if (!this.f23199a.a()) {
            return -1.0f;
        }
        return (float) (1.0E9d / (this.f23199a.f23208e != 0 ? r0.f23209f / r1 : 0L));
    }

    public final int c() {
        return this.f23203e;
    }

    public final long d() {
        if (this.f23199a.a()) {
            return this.f23199a.f23209f;
        }
        return -9223372036854775807L;
    }

    public final boolean e() {
        return this.f23199a.a();
    }

    public final void f() {
        a aVar = this.f23199a;
        aVar.f23207d = 0L;
        aVar.f23208e = 0L;
        aVar.f23209f = 0L;
        aVar.f23211h = 0;
        Arrays.fill(aVar.f23210g, false);
        a aVar2 = this.f23200b;
        aVar2.f23207d = 0L;
        aVar2.f23208e = 0L;
        aVar2.f23209f = 0L;
        aVar2.f23211h = 0;
        Arrays.fill(aVar2.f23210g, false);
        this.f23201c = false;
        this.f23202d = -9223372036854775807L;
        this.f23203e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r0.f23210g[(int) ((r5 - 1) % 15)] == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j4) {
        this.f23199a.a(j4);
        if (this.f23199a.a()) {
            this.f23201c = false;
        } else if (this.f23202d != -9223372036854775807L) {
            if (this.f23201c) {
                a aVar = this.f23200b;
                long j5 = aVar.f23207d;
                if (j5 != 0) {
                }
                this.f23201c = true;
                this.f23200b.a(j4);
            }
            a aVar2 = this.f23200b;
            aVar2.f23207d = 0L;
            aVar2.f23208e = 0L;
            aVar2.f23209f = 0L;
            aVar2.f23211h = 0;
            Arrays.fill(aVar2.f23210g, false);
            this.f23200b.a(this.f23202d);
            this.f23201c = true;
            this.f23200b.a(j4);
        }
        if (this.f23201c && this.f23200b.a()) {
            a aVar3 = this.f23199a;
            this.f23199a = this.f23200b;
            this.f23200b = aVar3;
            this.f23201c = false;
        }
        this.f23202d = j4;
        this.f23203e = this.f23199a.a() ? 0 : this.f23203e + 1;
    }
}
