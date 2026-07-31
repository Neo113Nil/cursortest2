package com.yandex.mobile.ads.impl;

import android.os.Looper;
import com.yandex.mobile.ads.impl.am1;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.rv0;
import com.yandex.mobile.ads.impl.xl1;
import com.yandex.mobile.ads.impl.yl1;

/* loaded from: classes3.dex */
public final class am1 extends AbstractC2349xj implements yl1.b {

    /* renamed from: h, reason: collision with root package name */
    private final rv0 f23367h;

    /* renamed from: i, reason: collision with root package name */
    private final rv0.f f23368i;

    /* renamed from: j, reason: collision with root package name */
    private final iv.a f23369j;

    /* renamed from: k, reason: collision with root package name */
    private final xl1.a f23370k;

    /* renamed from: l, reason: collision with root package name */
    private final x30 f23371l;

    /* renamed from: m, reason: collision with root package name */
    private final lr0 f23372m;

    /* renamed from: n, reason: collision with root package name */
    private final int f23373n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23374o;

    /* renamed from: p, reason: collision with root package name */
    private long f23375p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23376q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23377r;

    /* renamed from: s, reason: collision with root package name */
    private s62 f23378s;

    public static final class a implements dw0.a {

        /* renamed from: a, reason: collision with root package name */
        private final iv.a f23379a;

        /* renamed from: b, reason: collision with root package name */
        private xl1.a f23380b;

        /* renamed from: c, reason: collision with root package name */
        private y30 f23381c;

        /* renamed from: d, reason: collision with root package name */
        private lr0 f23382d;

        public a(iv.a aVar, final t70 t70Var) {
            this(aVar, new xl1.a() { // from class: com.yandex.mobile.ads.impl.I
                @Override // com.yandex.mobile.ads.impl.xl1.a
                public final xl1 a(ei1 ei1Var) {
                    xl1 a4;
                    a4 = am1.a.a(t70.this, ei1Var);
                    return a4;
                }
            });
        }

        public final am1 a(rv0 rv0Var) {
            rv0Var.f31379c.getClass();
            Object obj = rv0Var.f31379c.f31433g;
            return new am1(rv0Var, this.f23379a, this.f23380b, this.f23381c.a(rv0Var), this.f23382d, 1048576);
        }

        public a(iv.a aVar, xl1.a aVar2) {
            this(aVar, aVar2, new iz(), new sz());
        }

        public a(iv.a aVar, xl1.a aVar2, iz izVar, sz szVar) {
            this.f23379a = aVar;
            this.f23380b = aVar2;
            this.f23381c = izVar;
            this.f23382d = szVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ xl1 a(t70 t70Var, ei1 ei1Var) {
            return new C2328wl(t70Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final xv0 a(dw0.b bVar, InterfaceC2250tc interfaceC2250tc, long j4) {
        iv a4 = this.f23369j.a();
        s62 s62Var = this.f23378s;
        if (s62Var != null) {
            a4.a(s62Var);
        }
        return new yl1(this.f23368i.f31427a, a4, this.f23370k.a(c()), this.f23371l, a(bVar), this.f23372m, b(bVar), this, interfaceC2250tc, this.f23368i.f31431e, this.f23373n);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2349xj
    protected final void e() {
        this.f23371l.release();
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final rv0 getMediaItem() {
        return this.f23367h;
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void maybeThrowSourceInfoRefreshError() {
    }

    private am1(rv0 rv0Var, iv.a aVar, xl1.a aVar2, x30 x30Var, lr0 lr0Var, int i4) {
        this.f23368i = (rv0.f) C2253tf.a(rv0Var.f31379c);
        this.f23367h = rv0Var;
        this.f23369j = aVar;
        this.f23370k = aVar2;
        this.f23371l = x30Var;
        this.f23372m = lr0Var;
        this.f23373n = i4;
        this.f23374o = true;
        this.f23375p = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.mobile.ads.impl.am1, com.yandex.mobile.ads.impl.xj] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.yandex.mobile.ads.impl.zl1] */
    public final void a(long j4, boolean z4, boolean z5) {
        if (j4 == -9223372036854775807L) {
            j4 = this.f23375p;
        }
        if (!this.f23374o && this.f23375p == j4 && this.f23376q == z4 && this.f23377r == z5) {
            return;
        }
        this.f23375p = j4;
        this.f23376q = z4;
        this.f23377r = z5;
        this.f23374o = false;
        long j5 = this.f23375p;
        ry1 ry1Var = new ry1(j5, j5, this.f23376q, this.f23377r, this.f23367h);
        if (this.f23374o) {
            ry1Var = new zl1(ry1Var);
        }
        a(ry1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.mobile.ads.impl.am1, com.yandex.mobile.ads.impl.xj] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.yandex.mobile.ads.impl.zl1] */
    @Override // com.yandex.mobile.ads.impl.AbstractC2349xj
    protected final void a(s62 s62Var) {
        this.f23378s = s62Var;
        this.f23371l.prepare();
        x30 x30Var = this.f23371l;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        x30Var.a(myLooper, c());
        long j4 = this.f23375p;
        ry1 ry1Var = new ry1(j4, j4, this.f23376q, this.f23377r, this.f23367h);
        if (this.f23374o) {
            ry1Var = new zl1(ry1Var);
        }
        a(ry1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(xv0 xv0Var) {
        ((yl1) xv0Var).i();
    }
}
