package com.yandex.mobile.ads.impl;

import android.os.Looper;
import android.util.SparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC1852cd;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.ir0;
import com.yandex.mobile.ads.impl.tj0;
import com.yandex.mobile.ads.impl.x42;
import com.yandex.mobile.ads.impl.zh1;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class ty implements InterfaceC2296vc {

    /* renamed from: a, reason: collision with root package name */
    private final wo f32729a;

    /* renamed from: b, reason: collision with root package name */
    private final x42.b f32730b;

    /* renamed from: c, reason: collision with root package name */
    private final x42.d f32731c;

    /* renamed from: d, reason: collision with root package name */
    private final a f32732d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<InterfaceC1852cd.a> f32733e;

    /* renamed from: f, reason: collision with root package name */
    private ir0<InterfaceC1852cd> f32734f;

    /* renamed from: g, reason: collision with root package name */
    private zh1 f32735g;

    /* renamed from: h, reason: collision with root package name */
    private we0 f32736h;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final x42.b f32737a;

        /* renamed from: b, reason: collision with root package name */
        private sj0<dw0.b> f32738b = sj0.h();

        /* renamed from: c, reason: collision with root package name */
        private tj0<dw0.b, x42> f32739c = tj0.g();

        /* renamed from: d, reason: collision with root package name */
        private dw0.b f32740d;

        /* renamed from: e, reason: collision with root package name */
        private dw0.b f32741e;

        /* renamed from: f, reason: collision with root package name */
        private dw0.b f32742f;

        public a(x42.b bVar) {
            this.f32737a = bVar;
        }

        private void a(tj0.a<dw0.b, x42> aVar, dw0.b bVar, x42 x42Var) {
            if (bVar == null) {
                return;
            }
            if (x42Var.a(bVar.f35792a) != -1) {
                aVar.a((tj0.a<dw0.b, x42>) bVar, (dw0.b) x42Var);
                return;
            }
            x42 x42Var2 = this.f32739c.get(bVar);
            if (x42Var2 != null) {
                aVar.a((tj0.a<dw0.b, x42>) bVar, (dw0.b) x42Var2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static dw0.b a(zh1 zh1Var, sj0<dw0.b> sj0Var, dw0.b bVar, x42.b bVar2) {
            x42 currentTimeline = zh1Var.getCurrentTimeline();
            int currentPeriodIndex = zh1Var.getCurrentPeriodIndex();
            Object a4 = currentTimeline.c() ? null : currentTimeline.a(currentPeriodIndex);
            int a5 = (zh1Var.isPlayingAd() || currentTimeline.c()) ? -1 : currentTimeline.a(currentPeriodIndex, bVar2).a(u82.a(zh1Var.getCurrentPosition()) - bVar2.c());
            for (int i4 = 0; i4 < sj0Var.size(); i4++) {
                dw0.b bVar3 = sj0Var.get(i4);
                if (a(bVar3, a4, zh1Var.isPlayingAd(), zh1Var.getCurrentAdGroupIndex(), zh1Var.getCurrentAdIndexInAdGroup(), a5)) {
                    return bVar3;
                }
            }
            if (sj0Var.isEmpty() && bVar != null && a(bVar, a4, zh1Var.isPlayingAd(), zh1Var.getCurrentAdGroupIndex(), zh1Var.getCurrentAdIndexInAdGroup(), a5)) {
                return bVar;
            }
            return null;
        }

        private static boolean a(dw0.b bVar, Object obj, boolean z4, int i4, int i5, int i6) {
            if (!bVar.f35792a.equals(obj)) {
                return false;
            }
            if (z4 && bVar.f35793b == i4 && bVar.f35794c == i5) {
                return true;
            }
            return !z4 && bVar.f35793b == -1 && bVar.f35796e == i6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(x42 x42Var) {
            tj0.a<dw0.b, x42> a4 = tj0.a();
            if (this.f32738b.isEmpty()) {
                a(a4, this.f32741e, x42Var);
                if (!nd1.a(this.f32742f, this.f32741e)) {
                    a(a4, this.f32742f, x42Var);
                }
                if (!nd1.a(this.f32740d, this.f32741e) && !nd1.a(this.f32740d, this.f32742f)) {
                    a(a4, this.f32740d, x42Var);
                }
            } else {
                for (int i4 = 0; i4 < this.f32738b.size(); i4++) {
                    a(a4, this.f32738b.get(i4), x42Var);
                }
                if (!this.f32738b.contains(this.f32740d)) {
                    a(a4, this.f32740d, x42Var);
                }
            }
            this.f32739c = a4.a();
        }
    }

    public ty(wo woVar) {
        this.f32729a = (wo) C2253tf.a(woVar);
        this.f32734f = new ir0<>(u82.c(), woVar, new ir0.b() { // from class: com.yandex.mobile.ads.impl.Lg
            @Override // com.yandex.mobile.ads.impl.ir0.b
            public final void a(Object obj, qb0 qb0Var) {
                ty.a((InterfaceC1852cd) obj, qb0Var);
            }
        });
        x42.b bVar = new x42.b();
        this.f32730b = bVar;
        this.f32731c = new x42.d();
        this.f32732d = new a(bVar);
        this.f32733e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(InterfaceC1852cd interfaceC1852cd, qb0 qb0Var) {
    }

    private InterfaceC1852cd.a b() {
        return a(this.f32732d.f32742f);
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onCues(final List<uu> list) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 27, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ng
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                List list2 = list;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onIsLoadingChanged(final boolean z4) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 3, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Mf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                boolean z5 = z4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onIsPlayingChanged(final boolean z4) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 7, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Kg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                boolean z5 = z4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onPlayWhenReadyChanged(final boolean z4, final int i4) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 5, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Bg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                boolean z5 = z4;
                int i5 = i4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onPlaybackStateChanged(final int i4) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 4, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Gf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                int i5 = i4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onPlaybackSuppressionReasonChanged(final int i4) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 6, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Sg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                int i5 = i4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onPlayerStateChanged(final boolean z4, final int i4) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, -1, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Pf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                boolean z5 = z4;
                int i5 = i4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onRenderedFirstFrame() {
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onSkipSilenceEnabledChanged(final boolean z4) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 23, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Mg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                boolean z5 = z4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onSurfaceSizeChanged(final int i4, final int i5) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 24, new ir0.a() { // from class: com.yandex.mobile.ads.impl.We
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                int i6 = i4;
                int i7 = i5;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onVolumeChanged(final float f4) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 22, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Xe
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                float f5 = f4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void release() {
        we0 we0Var = this.f32736h;
        if (we0Var == null) {
            throw new IllegalStateException();
        }
        we0Var.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.If
            @Override // java.lang.Runnable
            public final void run() {
                ty.this.c();
            }
        });
    }

    private InterfaceC1852cd.a e(int i4, dw0.b bVar) {
        this.f32735g.getClass();
        if (bVar != null) {
            return ((x42) this.f32732d.f32739c.get(bVar)) != null ? a(bVar) : a(x42.f34401b, i4, bVar);
        }
        x42 currentTimeline = this.f32735g.getCurrentTimeline();
        if (i4 >= currentTimeline.b()) {
            currentTimeline = x42.f34401b;
        }
        return a(currentTimeline, i4, (dw0.b) null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(vv0 vv0Var) {
        this.f32734f.a((ir0<InterfaceC1852cd>) vv0Var);
    }

    protected final InterfaceC1852cd.a a() {
        return a(this.f32732d.f32740d);
    }

    private InterfaceC1852cd.a a(dw0.b bVar) {
        this.f32735g.getClass();
        x42 x42Var = bVar == null ? null : (x42) this.f32732d.f32739c.get(bVar);
        if (bVar != null && x42Var != null) {
            return a(x42Var, x42Var.a(bVar.f35792a, this.f32730b).f34405d, bVar);
        }
        int currentMediaItemIndex = this.f32735g.getCurrentMediaItemIndex();
        x42 currentTimeline = this.f32735g.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.b()) {
            currentTimeline = x42.f34401b;
        }
        return a(currentTimeline, currentMediaItemIndex, (dw0.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(InterfaceC1852cd.a aVar, int i4, long j4, long j5, InterfaceC1852cd interfaceC1852cd) {
        ((vv0) interfaceC1852cd).a(aVar, i4, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(InterfaceC1852cd.a aVar, ey eyVar, InterfaceC1852cd interfaceC1852cd) {
        ((vv0) interfaceC1852cd).a(eyVar);
    }

    @Override // com.yandex.mobile.ads.impl.w30
    public final void d(int i4, dw0.b bVar) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Gg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.w30
    public final void c(int i4, dw0.b bVar) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, 1023, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Wf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void d(final ey eyVar) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 1015, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Af
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                ey eyVar2 = eyVar;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ew0
    public final void c(int i4, dw0.b bVar, final mr0 mr0Var, final tv0 tv0Var) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, 1000, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Cf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                mr0 mr0Var2 = mr0Var;
                tv0 tv0Var2 = tv0Var;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void c(final Exception exc) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Zf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                Exception exc2 = exc;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void c(final ey eyVar) {
        final InterfaceC1852cd.a a4 = a(this.f32732d.f32741e);
        a(a4, 1020, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Tf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                ty.c(InterfaceC1852cd.a.this, eyVar, (InterfaceC1852cd) obj);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void b(final Exception exc) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Qg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                Exception exc2 = exc;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        final InterfaceC1852cd.a a4 = a();
        a(a4, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Jf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
        this.f32734f.b();
    }

    protected final InterfaceC1852cd.a a(x42 x42Var, int i4, dw0.b bVar) {
        dw0.b bVar2 = x42Var.c() ? null : bVar;
        long b4 = this.f32729a.b();
        boolean z4 = x42Var.equals(this.f32735g.getCurrentTimeline()) && i4 == this.f32735g.getCurrentMediaItemIndex();
        long j4 = 0;
        if (bVar2 == null || !bVar2.a()) {
            if (z4) {
                j4 = this.f32735g.getContentPosition();
            } else if (!x42Var.c()) {
                j4 = u82.b(x42Var.a(i4, this.f32731c, 0L).f34430n);
            }
        } else if (z4 && this.f32735g.getCurrentAdGroupIndex() == bVar2.f35793b && this.f32735g.getCurrentAdIndexInAdGroup() == bVar2.f35794c) {
            j4 = this.f32735g.getCurrentPosition();
        }
        return new InterfaceC1852cd.a(b4, x42Var, i4, bVar2, j4, this.f32735g.getCurrentTimeline(), this.f32735g.getCurrentMediaItemIndex(), this.f32732d.f32740d, this.f32735g.getCurrentPosition(), this.f32735g.getTotalBufferedDuration());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void b(final String str, final long j4, final long j5) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 1008, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Pe
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                String str2 = str;
                long j6 = j5;
                long j7 = j4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void b(final String str) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 1012, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Se
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                String str2 = str;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void b(final ey eyVar) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 1007, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Of
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                ey eyVar2 = eyVar;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1881di.a
    public final void b(final int i4, final long j4, final long j5) {
        Object next;
        Object obj;
        dw0.b bVar;
        a aVar = this.f32732d;
        if (aVar.f32738b.isEmpty()) {
            bVar = null;
        } else {
            sj0 sj0Var = aVar.f32738b;
            if (sj0Var != null) {
                if (!sj0Var.isEmpty()) {
                    obj = sj0Var.get(sj0Var.size() - 1);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                Iterator<E> it = sj0Var.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            bVar = (dw0.b) obj;
        }
        final InterfaceC1852cd.a a4 = a(bVar);
        a(a4, 1006, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ve
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj2) {
                ty.b(InterfaceC1852cd.a.this, i4, j4, j5, (InterfaceC1852cd) obj2);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.w30
    public final void b(int i4, dw0.b bVar) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ig
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void b(final int i4, final long j4) {
        final InterfaceC1852cd.a a4 = a(this.f32732d.f32741e);
        a(a4, 1018, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Xf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                int i5 = i4;
                long j5 = j4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ew0
    public final void b(int i4, dw0.b bVar, final mr0 mr0Var, final tv0 tv0Var) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, 1001, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ff
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                mr0 mr0Var2 = mr0Var;
                tv0 tv0Var2 = tv0Var;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void b(final c60 c60Var) {
        final InterfaceC1852cd.a a4;
        zv0 zv0Var;
        if (c60Var != null && (zv0Var = c60Var.f24069i) != null) {
            a4 = a(new dw0.b(zv0Var));
        } else {
            a4 = a();
        }
        a(a4, 10, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Eg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                ty.a(InterfaceC1852cd.a.this, c60Var, (InterfaceC1852cd) obj);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void b(final yb0 yb0Var, final iy iyVar) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 1017, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Tg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                yb0 yb0Var2 = yb0Var;
                iy iyVar2 = iyVar;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(InterfaceC1852cd.a aVar, tv0 tv0Var, InterfaceC1852cd interfaceC1852cd) {
        ((vv0) interfaceC1852cd).a(aVar, tv0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(InterfaceC1852cd.a aVar, mr0 mr0Var, tv0 tv0Var, IOException iOException, boolean z4, InterfaceC1852cd interfaceC1852cd) {
        ((vv0) interfaceC1852cd).a(tv0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(InterfaceC1852cd.a aVar, qh1 qh1Var, InterfaceC1852cd interfaceC1852cd) {
        ((vv0) interfaceC1852cd).a(qh1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(InterfaceC1852cd.a aVar, int i4, zh1.c cVar, zh1.c cVar2, InterfaceC1852cd interfaceC1852cd) {
        interfaceC1852cd.getClass();
        ((vv0) interfaceC1852cd).a(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(InterfaceC1852cd.a aVar, rf2 rf2Var, InterfaceC1852cd interfaceC1852cd) {
        ((vv0) interfaceC1852cd).a(rf2Var);
        int i4 = rf2Var.f31177b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(zh1 zh1Var, InterfaceC1852cd interfaceC1852cd, qb0 qb0Var) {
        ((vv0) interfaceC1852cd).a(zh1Var, new InterfaceC1852cd.b(qb0Var, this.f32733e));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final ey eyVar) {
        final InterfaceC1852cd.a a4 = a(this.f32732d.f32741e);
        a(a4, com.ironsource.d9.f15848i, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Jg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                ey eyVar2 = eyVar;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final yb0 yb0Var, final iy iyVar) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 1009, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Rg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                yb0 yb0Var2 = yb0Var;
                iy iyVar2 = iyVar;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final long j4) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 1010, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ug
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                long j5 = j4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final Exception exc) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, com.ironsource.d9.f15849j, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Fg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                Exception exc2 = exc;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final int i4, final long j4, final long j5) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 1011, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Qe
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                int i5 = i4;
                long j6 = j4;
                long j7 = j5;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final zh1.a aVar) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 13, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Hf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar2 = InterfaceC1852cd.a.this;
                zh1.a aVar3 = aVar;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final wu wuVar) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 27, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Pg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                wu wuVar2 = wuVar;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final x00 x00Var) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 29, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Qf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                x00 x00Var2 = x00Var;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final boolean z4, final int i4) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 30, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Kf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                int i5 = i4;
                boolean z5 = z4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ew0
    public final void a(int i4, dw0.b bVar, final tv0 tv0Var) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, 1004, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Yf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                ty.a(InterfaceC1852cd.a.this, tv0Var, (InterfaceC1852cd) obj);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.w30
    public final void a(int i4, dw0.b bVar) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ye
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.w30
    public final void a(int i4, dw0.b bVar, final int i5) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, 1022, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ef
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                int i6 = i5;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.w30
    public final void a(int i4, dw0.b bVar, final Exception exc) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, 1024, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Vf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                Exception exc2 = exc;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ew0
    public final void a(int i4, dw0.b bVar, final mr0 mr0Var, final tv0 tv0Var) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, 1002, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Te
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                mr0 mr0Var2 = mr0Var;
                tv0 tv0Var2 = tv0Var;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ew0
    public final void a(int i4, dw0.b bVar, final mr0 mr0Var, final tv0 tv0Var, final IOException iOException, final boolean z4) {
        final InterfaceC1852cd.a e4 = e(i4, bVar);
        a(e4, 1003, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ze
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                ty.a(InterfaceC1852cd.a.this, mr0Var, tv0Var, iOException, z4, (InterfaceC1852cd) obj);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final rv0 rv0Var, final int i4) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 1, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Nf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                rv0 rv0Var2 = rv0Var;
                int i5 = i4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final uv0 uv0Var) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 14, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Og
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                uv0 uv0Var2 = uv0Var;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final wz0 wz0Var) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 28, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Rf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                wz0 wz0Var2 = wz0Var;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final th1 th1Var) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 12, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Lf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                th1 th1Var2 = th1Var;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final c60 c60Var) {
        final InterfaceC1852cd.a a4;
        zv0 zv0Var;
        if (c60Var != null && (zv0Var = c60Var.f24069i) != null) {
            a4 = a(new dw0.b(zv0Var));
        } else {
            a4 = a();
        }
        a(a4, 10, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ue
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                qh1 qh1Var = c60Var;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final zh1.c cVar, final zh1.c cVar2, final int i4) {
        a aVar = this.f32732d;
        zh1 zh1Var = this.f32735g;
        zh1Var.getClass();
        aVar.f32740d = a.a(zh1Var, aVar.f32738b, aVar.f32741e, aVar.f32737a);
        final InterfaceC1852cd.a a4 = a();
        a(a4, 11, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Dg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                ty.a(InterfaceC1852cd.a.this, i4, cVar, cVar2, (InterfaceC1852cd) obj);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final Object obj, final long j4) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 26, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Uf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj2) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                Object obj3 = obj;
                long j5 = j4;
                ((InterfaceC1852cd) obj2).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final int i4) {
        a aVar = this.f32732d;
        zh1 zh1Var = this.f32735g;
        zh1Var.getClass();
        aVar.f32740d = a.a(zh1Var, aVar.f32738b, aVar.f32741e, aVar.f32737a);
        aVar.a(zh1Var.getCurrentTimeline());
        final InterfaceC1852cd.a a4 = a();
        a(a4, 0, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Hg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar2 = InterfaceC1852cd.a.this;
                int i5 = i4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final q62 q62Var) {
        final InterfaceC1852cd.a a4 = a();
        a(a4, 2, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Re
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                q62 q62Var2 = q62Var;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final String str, final long j4, final long j5) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, com.ironsource.d9.f15851l, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Ag
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                String str2 = str;
                long j6 = j5;
                long j7 = j4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final String str) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 1019, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Bf
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                String str2 = str;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final int i4, final long j4) {
        final InterfaceC1852cd.a a4 = a(this.f32732d.f32741e);
        a(a4, 1021, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Cg
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                InterfaceC1852cd.a aVar = InterfaceC1852cd.a.this;
                long j5 = j4;
                int i5 = i4;
                ((InterfaceC1852cd) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(final rf2 rf2Var) {
        final InterfaceC1852cd.a b4 = b();
        a(b4, 25, new ir0.a() { // from class: com.yandex.mobile.ads.impl.Df
            @Override // com.yandex.mobile.ads.impl.ir0.a
            public final void invoke(Object obj) {
                ty.a(InterfaceC1852cd.a.this, rf2Var, (InterfaceC1852cd) obj);
            }
        });
    }

    protected final void a(InterfaceC1852cd.a aVar, int i4, ir0.a<InterfaceC1852cd> aVar2) {
        this.f32733e.put(i4, aVar);
        ir0<InterfaceC1852cd> ir0Var = this.f32734f;
        ir0Var.a(i4, aVar2);
        ir0Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(final zh1 zh1Var, Looper looper) {
        if (this.f32735g != null && !this.f32732d.f32738b.isEmpty()) {
            throw new IllegalStateException();
        }
        this.f32735g = zh1Var;
        this.f32736h = this.f32729a.a(looper, null);
        this.f32734f = this.f32734f.a(looper, new ir0.b() { // from class: com.yandex.mobile.ads.impl.Sf
            @Override // com.yandex.mobile.ads.impl.ir0.b
            public final void a(Object obj, qb0 qb0Var) {
                ty.this.a(zh1Var, (InterfaceC1852cd) obj, qb0Var);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2296vc
    public final void a(List<dw0.b> list, dw0.b bVar) {
        a aVar = this.f32732d;
        zh1 zh1Var = this.f32735g;
        zh1Var.getClass();
        aVar.getClass();
        aVar.f32738b = sj0.a((Collection) list);
        if (!list.isEmpty()) {
            aVar.f32741e = list.get(0);
            bVar.getClass();
            aVar.f32742f = bVar;
        }
        if (aVar.f32740d == null) {
            aVar.f32740d = a.a(zh1Var, aVar.f32738b, aVar.f32741e, aVar.f32737a);
        }
        aVar.a(zh1Var.getCurrentTimeline());
    }
}
