package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.xv0;

/* loaded from: classes3.dex */
public final class vo implements xv0, xv0.a {

    /* renamed from: b, reason: collision with root package name */
    public final xv0 f33699b;

    /* renamed from: c, reason: collision with root package name */
    private xv0.a f33700c;

    /* renamed from: d, reason: collision with root package name */
    private a[] f33701d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    private long f33702e;

    /* renamed from: f, reason: collision with root package name */
    long f33703f;

    /* renamed from: g, reason: collision with root package name */
    long f33704g;

    private final class a implements ft1 {

        /* renamed from: a, reason: collision with root package name */
        public final ft1 f33705a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33706b;

        public a(ft1 ft1Var) {
            this.f33705a = ft1Var;
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final boolean d() {
            return vo.this.f33702e == -9223372036854775807L && this.f33705a.d();
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final void a() {
            this.f33705a.a();
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final int a(zb0 zb0Var, gy gyVar, int i4) {
            if (vo.this.f33702e != -9223372036854775807L) {
                return -3;
            }
            if (this.f33706b) {
                gyVar.d(4);
                return -4;
            }
            int a4 = this.f33705a.a(zb0Var, gyVar, i4);
            if (a4 == -5) {
                yb0 yb0Var = zb0Var.f35541b;
                yb0Var.getClass();
                int i5 = yb0Var.f34975C;
                if (i5 != 0 || yb0Var.f34976D != 0) {
                    vo voVar = vo.this;
                    if (voVar.f33703f != 0) {
                        i5 = 0;
                    }
                    zb0Var.f35541b = yb0Var.a().d(i5).e(voVar.f33704g == Long.MIN_VALUE ? yb0Var.f34976D : 0).a();
                }
                return -5;
            }
            vo voVar2 = vo.this;
            long j4 = voVar2.f33704g;
            if (j4 == Long.MIN_VALUE || ((a4 != -4 || gyVar.f26358f < j4) && !(a4 == -3 && voVar2.getBufferedPositionUs() == Long.MIN_VALUE && !gyVar.f26357e))) {
                return a4;
            }
            gyVar.b();
            gyVar.d(4);
            this.f33706b = true;
            return -4;
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final int a(long j4) {
            if (vo.this.f33702e != -9223372036854775807L) {
                return -3;
            }
            return this.f33705a.a(j4);
        }
    }

    public vo(xv0 xv0Var, boolean z4, long j4, long j5) {
        this.f33699b = xv0Var;
        this.f33702e = z4 ? j4 : -9223372036854775807L;
        this.f33703f = j4;
        this.f33704g = j5;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean continueLoading(long j4) {
        return this.f33699b.continueLoading(j4);
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final void discardBuffer(long j4, boolean z4) {
        this.f33699b.discardBuffer(j4, z4);
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f33699b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j4 = this.f33704g;
            if (j4 == Long.MIN_VALUE || bufferedPositionUs < j4) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f33699b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j4 = this.f33704g;
            if (j4 == Long.MIN_VALUE || nextLoadPositionUs < j4) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final o52 getTrackGroups() {
        return this.f33699b.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean isLoading() {
        return this.f33699b.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final void maybeThrowPrepareError() {
        this.f33699b.maybeThrowPrepareError();
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final long readDiscontinuity() {
        long j4 = this.f33702e;
        if (j4 != -9223372036854775807L) {
            this.f33702e = -9223372036854775807L;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != -9223372036854775807L ? readDiscontinuity : j4;
        }
        long readDiscontinuity2 = this.f33699b.readDiscontinuity();
        if (readDiscontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (readDiscontinuity2 < this.f33703f) {
            throw new IllegalStateException();
        }
        long j5 = this.f33704g;
        if (j5 == Long.MIN_VALUE || readDiscontinuity2 <= j5) {
            return readDiscontinuity2;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final void reevaluateBuffer(long j4) {
        this.f33699b.reevaluateBuffer(j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // com.yandex.mobile.ads.impl.xv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long seekToUs(long j4) {
        this.f33702e = -9223372036854775807L;
        for (a aVar : this.f33701d) {
            if (aVar != null) {
                aVar.f33706b = false;
            }
        }
        long seekToUs = this.f33699b.seekToUs(j4);
        if (seekToUs != j4) {
            if (seekToUs >= this.f33703f) {
                long j5 = this.f33704g;
                if (j5 != Long.MIN_VALUE) {
                }
            }
            throw new IllegalStateException();
        }
        return seekToUs;
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final long a(long j4, uw1 uw1Var) {
        long j5 = this.f33703f;
        if (j4 == j5) {
            return j5;
        }
        int i4 = u82.f32873a;
        long max = Math.max(0L, Math.min(uw1Var.f33436a, j4 - j5));
        long j6 = uw1Var.f33437b;
        long j7 = this.f33704g;
        long max2 = Math.max(0L, Math.min(j6, j7 == Long.MIN_VALUE ? Long.MAX_VALUE : j7 - j4));
        if (max != uw1Var.f33436a || max2 != uw1Var.f33437b) {
            uw1Var = new uw1(max, max2);
        }
        return this.f33699b.a(j4, uw1Var);
    }

    @Override // com.yandex.mobile.ads.impl.bx1.a
    public final void a(xv0 xv0Var) {
        xv0.a aVar = this.f33700c;
        aVar.getClass();
        aVar.a((xv0.a) this);
    }

    @Override // com.yandex.mobile.ads.impl.xv0.a
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(xv0 xv0Var) {
        xv0.a aVar = this.f33700c;
        aVar.getClass();
        aVar.a((xv0) this);
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final void a(xv0.a aVar, long j4) {
        this.f33700c = aVar;
        this.f33699b.a(this, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        if (r11 > r1) goto L32;
     */
    @Override // com.yandex.mobile.ads.impl.xv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(x60[] x60VarArr, boolean[] zArr, ft1[] ft1VarArr, boolean[] zArr2, long j4) {
        this.f33701d = new a[ft1VarArr.length];
        ft1[] ft1VarArr2 = new ft1[ft1VarArr.length];
        int i4 = 0;
        while (true) {
            ft1 ft1Var = null;
            if (i4 >= ft1VarArr.length) {
                break;
            }
            a[] aVarArr = this.f33701d;
            a aVar = (a) ft1VarArr[i4];
            aVarArr[i4] = aVar;
            if (aVar != null) {
                ft1Var = aVar.f33705a;
            }
            ft1VarArr2[i4] = ft1Var;
            i4++;
        }
        long a4 = this.f33699b.a(x60VarArr, zArr, ft1VarArr2, zArr2, j4);
        long j5 = -9223372036854775807L;
        if (this.f33702e != -9223372036854775807L) {
            long j6 = this.f33703f;
            if (j4 == j6 && j6 != 0) {
                int length = x60VarArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    x60 x60Var = x60VarArr[i5];
                    if (x60Var != null) {
                        yb0 e4 = x60Var.e();
                        if (!i01.a(e4.f34991m, e4.f34988j)) {
                            j5 = a4;
                            break;
                        }
                    }
                    i5++;
                }
            }
        }
        this.f33702e = j5;
        if (a4 != j4) {
            if (a4 >= this.f33703f) {
                long j7 = this.f33704g;
                if (j7 != Long.MIN_VALUE) {
                }
            }
            throw new IllegalStateException();
        }
        for (int i6 = 0; i6 < ft1VarArr.length; i6++) {
            ft1 ft1Var2 = ft1VarArr2[i6];
            if (ft1Var2 == null) {
                this.f33701d[i6] = null;
            } else {
                a[] aVarArr2 = this.f33701d;
                a aVar2 = aVarArr2[i6];
                if (aVar2 == null || aVar2.f33705a != ft1Var2) {
                    aVarArr2[i6] = new a(ft1Var2);
                }
            }
            ft1VarArr[i6] = this.f33701d[i6];
        }
        return a4;
    }

    public final void a(long j4) {
        this.f33703f = 0L;
        this.f33704g = j4;
    }
}
