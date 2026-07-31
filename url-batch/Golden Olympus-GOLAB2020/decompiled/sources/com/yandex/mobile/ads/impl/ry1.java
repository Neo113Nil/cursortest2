package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.rv0;
import com.yandex.mobile.ads.impl.x42;

/* loaded from: classes3.dex */
public final class ry1 extends x42 {

    /* renamed from: p, reason: collision with root package name */
    private static final Object f31471p = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final long f31472c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31473d;

    /* renamed from: e, reason: collision with root package name */
    private final long f31474e;

    /* renamed from: f, reason: collision with root package name */
    private final long f31475f;

    /* renamed from: g, reason: collision with root package name */
    private final long f31476g;

    /* renamed from: h, reason: collision with root package name */
    private final long f31477h;

    /* renamed from: i, reason: collision with root package name */
    private final long f31478i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f31479j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f31480k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f31481l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f31482m;

    /* renamed from: n, reason: collision with root package name */
    private final rv0 f31483n;

    /* renamed from: o, reason: collision with root package name */
    private final rv0.e f31484o;

    static {
        new rv0.a().b("SinglePeriodTimeline").a(Uri.EMPTY).a();
    }

    public ry1(long j4, long j5, boolean z4, rv0 rv0Var, rv0.e eVar) {
        this.f31472c = -9223372036854775807L;
        this.f31473d = -9223372036854775807L;
        this.f31474e = -9223372036854775807L;
        this.f31475f = j4;
        this.f31476g = j5;
        this.f31477h = 0L;
        this.f31478i = 0L;
        this.f31479j = z4;
        this.f31480k = false;
        this.f31481l = false;
        this.f31482m = null;
        this.f31483n = (rv0) C2253tf.a(rv0Var);
        this.f31484o = eVar;
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final int b() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final x42.b a(int i4, x42.b bVar, boolean z4) {
        C2253tf.a(i4, 1);
        Object obj = z4 ? f31471p : null;
        long j4 = this.f31475f;
        long j5 = -this.f31477h;
        bVar.getClass();
        return bVar.a(null, obj, 0, j4, j5, C2265u4.f32818h, false);
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final Object a(int i4) {
        C2253tf.a(i4, 1);
        return f31471p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 > r3) goto L13;
     */
    @Override // com.yandex.mobile.ads.impl.x42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x42.d a(int i4, x42.d dVar, long j4) {
        long j5;
        C2253tf.a(i4, 1);
        long j6 = this.f31478i;
        boolean z4 = this.f31480k;
        if (z4 && !this.f31481l && j4 != 0) {
            long j7 = this.f31476g;
            if (j7 != -9223372036854775807L) {
                j6 += j4;
            }
            j5 = -9223372036854775807L;
            return dVar.a(x42.d.f34414s, this.f31483n, this.f31482m, this.f31472c, this.f31473d, this.f31474e, this.f31479j, z4, this.f31484o, j5, this.f31476g, 0, 0, this.f31477h);
        }
        j5 = j6;
        return dVar.a(x42.d.f34414s, this.f31483n, this.f31482m, this.f31472c, this.f31473d, this.f31474e, this.f31479j, z4, this.f31484o, j5, this.f31476g, 0, 0, this.f31477h);
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final int a(Object obj) {
        return f31471p.equals(obj) ? 0 : -1;
    }

    public ry1(long j4, long j5, boolean z4, boolean z5, rv0 rv0Var) {
        this(j4, j5, z4, rv0Var, z5 ? rv0Var.f31380d : null);
    }
}
