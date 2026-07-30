package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3663o0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3341i0 f33073a;

    /* renamed from: b, reason: collision with root package name */
    public final C3287h0 f33074b = new C3287h0();

    /* renamed from: c, reason: collision with root package name */
    public final F3.q f33075c = new F3.q();

    /* renamed from: d, reason: collision with root package name */
    public final F3.q f33076d = new F3.q();

    /* renamed from: e, reason: collision with root package name */
    public final B0 f33077e;

    /* renamed from: f, reason: collision with root package name */
    public final C3393j0 f33078f;

    /* renamed from: g, reason: collision with root package name */
    public long f33079g;

    /* renamed from: h, reason: collision with root package name */
    public long f33080h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public C3100dd f33081j;

    /* renamed from: k, reason: collision with root package name */
    public long f33082k;

    /* renamed from: l, reason: collision with root package name */
    public final C2881Yl f33083l;

    public C3663o0(C2881Yl c2881Yl, C3341i0 c3341i0, C3393j0 c3393j0) {
        this.f33083l = c2881Yl;
        this.f33073a = c3341i0;
        this.f33078f = c3393j0;
        B0 b02 = new B0();
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i = highestOneBit + highestOneBit;
        }
        b02.f23938u = 0;
        b02.f23939v = -1;
        b02.f23940w = 0;
        b02.f23942y = new long[i];
        b02.f23941x = i - 1;
        this.f33077e = b02;
        this.f33079g = com.anythink.basead.exoplayer.b.f6539b;
        this.f33081j = C3100dd.f30070d;
        this.f33080h = com.anythink.basead.exoplayer.b.f6539b;
        this.i = com.anythink.basead.exoplayer.b.f6539b;
    }

    public final void a(long j9, long j10) {
        while (true) {
            B0 b02 = this.f33077e;
            int i = b02.f23940w;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j11 = ((long[]) b02.f23942y)[b02.f23938u];
            Long l9 = (Long) this.f33076d.f(j11);
            if (l9 != null && l9.longValue() != this.f33082k) {
                this.f33082k = l9.longValue();
                this.f33073a.a(2);
            }
            long j12 = this.f33082k;
            C3287h0 c3287h0 = this.f33074b;
            C3341i0 c3341i0 = this.f33073a;
            int f6 = c3341i0.f(j11, j9, j10, j12, false, false, c3287h0);
            if (f6 != 5 && f6 != 4) {
                this.f33078f.a(j11, c3287h0.f31130a);
            }
            C2881Yl c2881Yl = this.f33083l;
            P p6 = (P) c2881Yl.f28863v;
            if (f6 == 0 || f6 == 1) {
                this.f33080h = j11;
                long g9 = b02.g();
                C3100dd c3100dd = (C3100dd) this.f33075c.f(g9);
                if (c3100dd != null && !c3100dd.equals(C3100dd.f30070d) && !c3100dd.equals(this.f33081j)) {
                    this.f33081j = c3100dd;
                    C4065vP c4065vP = new C4065vP();
                    c4065vP.f34792u = c3100dd.f30071a;
                    c4065vP.f34793v = c3100dd.f30072b;
                    c4065vP.e("video/raw");
                    c2881Yl.f28862u = new TP(c4065vP);
                    p6.i.execute(new O(c2881Yl, c3100dd));
                }
                long nanoTime = f6 == 0 ? System.nanoTime() : c3287h0.f31131b;
                int i4 = c3341i0.f31297d;
                c3341i0.f31297d = 3;
                c3341i0.f31303k.getClass();
                c3341i0.f31299f = AbstractC3548lu.u(SystemClock.elapsedRealtime());
                if ((i4 != 3) && p6.f26794e != null) {
                    p6.i.execute(new O(c2881Yl, 0));
                }
                TP tp = (TP) c2881Yl.f28862u;
                long j13 = nanoTime;
                p6.f26798j.a(g9, j13, tp == null ? new TP(new C4065vP()) : tp, null);
                V v6 = (V) p6.f26793d.remove();
                v6.f28196c.x0(v6.f28194a, v6.f28195b, j13);
            } else if (f6 == 2 || f6 == 3) {
                this.f33080h = j11;
                b02.g();
                p6.i.execute(new O(c2881Yl, 1));
                ((V) p6.f26793d.remove()).a();
            } else if (f6 != 4) {
                return;
            } else {
                this.f33080h = j11;
            }
        }
    }
}
