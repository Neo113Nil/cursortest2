package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.xv0;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class qt0 implements xv0, xv0.a {

    /* renamed from: b, reason: collision with root package name */
    public final dw0.b f30884b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30885c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2250tc f30886d;

    /* renamed from: e, reason: collision with root package name */
    private dw0 f30887e;

    /* renamed from: f, reason: collision with root package name */
    private xv0 f30888f;

    /* renamed from: g, reason: collision with root package name */
    private xv0.a f30889g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30890h;

    /* renamed from: i, reason: collision with root package name */
    private long f30891i = -9223372036854775807L;

    public interface a {
        void a(dw0.b bVar);

        void a(dw0.b bVar, IOException iOException);
    }

    public qt0(dw0.b bVar, InterfaceC2250tc interfaceC2250tc, long j4) {
        this.f30884b = bVar;
        this.f30886d = interfaceC2250tc;
        this.f30885c = j4;
    }

    public final void a(dw0.b bVar) {
        long j4 = this.f30885c;
        long j5 = this.f30891i;
        if (j5 != -9223372036854775807L) {
            j4 = j5;
        }
        dw0 dw0Var = this.f30887e;
        dw0Var.getClass();
        xv0 a4 = dw0Var.a(bVar, this.f30886d, j4);
        this.f30888f = a4;
        if (this.f30889g != null) {
            a4.a(this, j4);
        }
    }

    public final long b() {
        return this.f30885c;
    }

    public final void c() {
        if (this.f30888f != null) {
            dw0 dw0Var = this.f30887e;
            dw0Var.getClass();
            dw0Var.a(this.f30888f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean continueLoading(long j4) {
        xv0 xv0Var = this.f30888f;
        return xv0Var != null && xv0Var.continueLoading(j4);
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final void discardBuffer(long j4, boolean z4) {
        xv0 xv0Var = this.f30888f;
        int i4 = u82.f32873a;
        xv0Var.discardBuffer(j4, z4);
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getBufferedPositionUs() {
        xv0 xv0Var = this.f30888f;
        int i4 = u82.f32873a;
        return xv0Var.getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getNextLoadPositionUs() {
        xv0 xv0Var = this.f30888f;
        int i4 = u82.f32873a;
        return xv0Var.getNextLoadPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final o52 getTrackGroups() {
        xv0 xv0Var = this.f30888f;
        int i4 = u82.f32873a;
        return xv0Var.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean isLoading() {
        xv0 xv0Var = this.f30888f;
        return xv0Var != null && xv0Var.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final void maybeThrowPrepareError() {
        xv0 xv0Var = this.f30888f;
        if (xv0Var != null) {
            xv0Var.maybeThrowPrepareError();
            return;
        }
        dw0 dw0Var = this.f30887e;
        if (dw0Var != null) {
            dw0Var.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final long readDiscontinuity() {
        xv0 xv0Var = this.f30888f;
        int i4 = u82.f32873a;
        return xv0Var.readDiscontinuity();
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final void reevaluateBuffer(long j4) {
        xv0 xv0Var = this.f30888f;
        int i4 = u82.f32873a;
        xv0Var.reevaluateBuffer(j4);
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final long seekToUs(long j4) {
        xv0 xv0Var = this.f30888f;
        int i4 = u82.f32873a;
        return xv0Var.seekToUs(j4);
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final long a(long j4, uw1 uw1Var) {
        xv0 xv0Var = this.f30888f;
        int i4 = u82.f32873a;
        return xv0Var.a(j4, uw1Var);
    }

    public final long a() {
        return this.f30891i;
    }

    @Override // com.yandex.mobile.ads.impl.bx1.a
    public final void a(xv0 xv0Var) {
        xv0.a aVar = this.f30889g;
        int i4 = u82.f32873a;
        aVar.a((xv0.a) this);
    }

    @Override // com.yandex.mobile.ads.impl.xv0.a
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(xv0 xv0Var) {
        xv0.a aVar = this.f30889g;
        int i4 = u82.f32873a;
        aVar.a((xv0) this);
    }

    public final void a(long j4) {
        this.f30891i = j4;
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final void a(xv0.a aVar, long j4) {
        this.f30889g = aVar;
        xv0 xv0Var = this.f30888f;
        if (xv0Var != null) {
            long j5 = this.f30885c;
            long j6 = this.f30891i;
            if (j6 != -9223372036854775807L) {
                j5 = j6;
            }
            xv0Var.a(this, j5);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final long a(x60[] x60VarArr, boolean[] zArr, ft1[] ft1VarArr, boolean[] zArr2, long j4) {
        long j5;
        long j6 = this.f30891i;
        if (j6 == -9223372036854775807L || j4 != this.f30885c) {
            j5 = j4;
        } else {
            this.f30891i = -9223372036854775807L;
            j5 = j6;
        }
        xv0 xv0Var = this.f30888f;
        int i4 = u82.f32873a;
        return xv0Var.a(x60VarArr, zArr, ft1VarArr, zArr2, j5);
    }

    public final void a(dw0 dw0Var) {
        if (this.f30887e == null) {
            this.f30887e = dw0Var;
            return;
        }
        throw new IllegalStateException();
    }
}
