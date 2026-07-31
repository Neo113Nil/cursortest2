package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import com.ironsource.mediationsdk.demandOnly.e;

/* loaded from: classes3.dex */
public final class rz implements kr0 {

    /* renamed from: a, reason: collision with root package name */
    private final sy f31485a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31486b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31487c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31488d;

    /* renamed from: e, reason: collision with root package name */
    private final long f31489e;

    /* renamed from: f, reason: collision with root package name */
    private final int f31490f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f31491g;

    /* renamed from: h, reason: collision with root package name */
    private final long f31492h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f31493i;

    /* renamed from: j, reason: collision with root package name */
    private int f31494j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f31495k;

    public rz() {
        this(new sy());
    }

    private static void a(int i4, int i5, String str, String str2) {
        C2253tf.a(str + " cannot be less than " + str2, i4 >= i5);
    }

    @Override // com.yandex.mobile.ads.impl.kr0
    public final void b() {
        int i4 = this.f31490f;
        if (i4 == -1) {
            i4 = 13107200;
        }
        this.f31494j = i4;
        this.f31495k = false;
        this.f31485a.d();
    }

    @Override // com.yandex.mobile.ads.impl.kr0
    public final sy c() {
        return this.f31485a;
    }

    @Override // com.yandex.mobile.ads.impl.kr0
    public final void d() {
        int i4 = this.f31490f;
        if (i4 == -1) {
            i4 = 13107200;
        }
        this.f31494j = i4;
        this.f31495k = false;
        this.f31485a.d();
    }

    @Override // com.yandex.mobile.ads.impl.kr0
    public final long e() {
        return this.f31492h;
    }

    @Override // com.yandex.mobile.ads.impl.kr0
    public final void f() {
        int i4 = this.f31490f;
        if (i4 == -1) {
            i4 = 13107200;
        }
        this.f31494j = i4;
        this.f31495k = false;
    }

    protected rz(sy syVar) {
        a(e.b.f17432p, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(b9.b.f15311d, e.b.f17432p, "minBufferMs", "bufferForPlaybackMs");
        a(b9.b.f15311d, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(b9.b.f15311d, b9.b.f15311d, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f31485a = syVar;
        long j4 = b9.b.f15311d;
        this.f31486b = u82.a(j4);
        this.f31487c = u82.a(j4);
        this.f31488d = u82.a(e.b.f17432p);
        this.f31489e = u82.a(5000);
        this.f31490f = -1;
        this.f31494j = 13107200;
        this.f31491g = false;
        this.f31492h = u82.a(0);
        this.f31493i = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.kr0
    public final void a(so1[] so1VarArr, x60[] x60VarArr) {
        int i4 = this.f31490f;
        if (i4 == -1) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = 13107200;
                if (i5 < so1VarArr.length) {
                    if (x60VarArr[i5] != null) {
                        switch (so1VarArr[i5].m()) {
                            case -2:
                                i7 = 0;
                                i6 += i7;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i7 = 144310272;
                                i6 += i7;
                                break;
                            case 1:
                                i6 += i7;
                                break;
                            case 2:
                                i7 = 131072000;
                                i6 += i7;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i7 = 131072;
                                i6 += i7;
                                break;
                        }
                    }
                    i5++;
                } else {
                    i4 = Math.max(13107200, i6);
                }
            }
        }
        this.f31494j = i4;
        this.f31485a.a(i4);
    }

    @Override // com.yandex.mobile.ads.impl.kr0
    public final boolean a() {
        return this.f31493i;
    }

    @Override // com.yandex.mobile.ads.impl.kr0
    public final boolean a(long j4, float f4) {
        boolean z4 = true;
        boolean z5 = this.f31485a.c() >= this.f31494j;
        long j5 = this.f31486b;
        if (f4 > 1.0f) {
            int i4 = u82.f32873a;
            if (f4 != 1.0f) {
                j5 = Math.round(j5 * f4);
            }
            j5 = Math.min(j5, this.f31487c);
        }
        if (j4 < Math.max(j5, 500000L)) {
            if (!this.f31491g && z5) {
                z4 = false;
            }
            this.f31495k = z4;
            if (!z4 && j4 < 500000) {
                ms0.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= this.f31487c || z5) {
            this.f31495k = false;
        }
        return this.f31495k;
    }

    @Override // com.yandex.mobile.ads.impl.kr0
    public final boolean a(long j4, float f4, boolean z4, long j5) {
        int i4 = u82.f32873a;
        if (f4 != 1.0f) {
            j4 = Math.round(j4 / f4);
        }
        long j6 = z4 ? this.f31489e : this.f31488d;
        if (j5 != -9223372036854775807L) {
            j6 = Math.min(j5 / 2, j6);
        }
        if (j6 <= 0 || j4 >= j6) {
            return true;
        }
        return !this.f31491g && this.f31485a.c() >= this.f31494j;
    }
}
