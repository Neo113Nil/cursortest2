package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.uB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3997uB {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f34550a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34551b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34552c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34553d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34554e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34555f;

    /* renamed from: g, reason: collision with root package name */
    public final int f34556g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f34557h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f34558j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f34559k;

    /* renamed from: l, reason: collision with root package name */
    public final byte f34560l;

    /* renamed from: m, reason: collision with root package name */
    public final byte f34561m;

    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3997uB(C3244gB c3244gB) {
        byte b9;
        boolean z8 = false;
        PA.n(c3244gB.f30961a == 1);
        ByteBuffer byteBuffer = c3244gB.f30962b;
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        Er er = new Er(bArr, remaining);
        this.f34556g = er.h(3);
        er.e();
        boolean g9 = er.g();
        this.f34550a = g9;
        if (g9) {
            er.h(5);
            this.f34551b = false;
            this.f34557h = false;
        } else {
            if (er.g()) {
                er.f(64);
                if (er.g()) {
                    int i = 0;
                    while (!er.g()) {
                        i++;
                    }
                    if (i < 32) {
                        er.f(i);
                    }
                }
                boolean g10 = er.g();
                this.f34551b = g10;
                if (g10) {
                    er.f(47);
                }
            } else {
                this.f34551b = false;
            }
            this.f34557h = er.g();
            int h9 = er.h(5);
            for (int i4 = 0; i4 <= h9; i4++) {
                er.f(12);
                if (i4 == 0) {
                    if (er.h(5) > 7) {
                        er.g();
                    }
                } else if (er.h(5) > 7) {
                    er.e();
                }
                if (this.f34551b) {
                    er.e();
                }
                if (this.f34557h && er.g()) {
                    if (i4 == 0) {
                        er.h(4);
                    } else {
                        er.f(4);
                    }
                }
            }
        }
        int h10 = er.h(4);
        int h11 = er.h(4);
        er.f(h10 + 1);
        er.f(h11 + 1);
        if (this.f34550a) {
            this.f34552c = false;
        } else {
            boolean g11 = er.g();
            this.f34552c = g11;
            if (g11) {
                er.f(4);
                er.f(3);
            }
        }
        er.f(3);
        if (this.f34550a) {
            this.f34554e = true;
            this.f34553d = true;
            this.f34555f = 0;
        } else {
            er.f(4);
            boolean g12 = er.g();
            if (g12) {
                er.f(2);
            }
            if (er.g()) {
                this.f34553d = true;
            } else {
                boolean g13 = er.g();
                this.f34553d = g13;
                if (!g13) {
                    this.f34554e = true;
                    if (g12) {
                        this.f34555f = 0;
                    } else {
                        this.f34555f = er.h(3) + 1;
                    }
                }
            }
            if (er.g()) {
                this.f34554e = true;
            } else {
                this.f34554e = er.g();
            }
            if (g12) {
            }
        }
        er.f(3);
        boolean g14 = er.g();
        if (this.f34556g == 2 && g14) {
            this.i = er.g();
        } else {
            this.i = false;
        }
        if (this.f34556g != 1) {
            this.f34558j = er.g();
        } else {
            this.f34558j = false;
        }
        if (er.g()) {
            this.f34560l = (byte) er.h(8);
            this.f34561m = (byte) er.h(8);
            b9 = (byte) er.h(8);
        } else {
            this.f34560l = (byte) 0;
            this.f34561m = (byte) 0;
            b9 = 0;
        }
        if (this.f34558j) {
            er.e();
            this.f34559k = false;
        } else if (this.f34560l == 1 && this.f34561m == 13 && b9 == 0) {
            this.f34559k = false;
        } else {
            er.e();
            int i9 = this.f34556g;
            if (i9 == 0) {
                this.f34559k = true;
                z8 = true;
            } else if (i9 == 1) {
                this.f34559k = false;
            } else if (this.i) {
                boolean g15 = er.g();
                this.f34559k = g15;
                if (g15) {
                    z8 = er.g();
                }
            } else {
                this.f34559k = true;
            }
            if (this.f34559k && z8) {
                er.h(2);
            }
        }
        er.e();
    }
}
