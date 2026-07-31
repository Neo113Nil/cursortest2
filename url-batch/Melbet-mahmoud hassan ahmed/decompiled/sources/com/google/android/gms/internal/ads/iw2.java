package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class iw2 implements h52 {

    /* renamed from: b, reason: collision with root package name */
    private static final List<hv2> f6809b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f6810a;

    public iw2(Handler handler) {
        this.f6810a = handler;
    }

    static /* bridge */ /* synthetic */ void a(hv2 hv2Var) {
        List<hv2> list = f6809b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(hv2Var);
            }
        }
    }

    private static hv2 b() {
        hv2 hv2Var;
        List<hv2> list = f6809b;
        synchronized (list) {
            hv2Var = list.isEmpty() ? new hv2(null) : list.remove(list.size() - 1);
        }
        return hv2Var;
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final void D(int i7) {
        this.f6810a.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final boolean E(int i7) {
        return this.f6810a.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final boolean F(Runnable runnable) {
        return this.f6810a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final g42 G(int i7, Object obj) {
        hv2 b7 = b();
        b7.a(this.f6810a.obtainMessage(i7, obj), this);
        return b7;
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final void H(Object obj) {
        this.f6810a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final g42 I(int i7, int i8, int i9) {
        hv2 b7 = b();
        b7.a(this.f6810a.obtainMessage(1, i8, i9), this);
        return b7;
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final boolean J(g42 g42Var) {
        return ((hv2) g42Var).b(this.f6810a);
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final boolean K(int i7, long j7) {
        return this.f6810a.sendEmptyMessageAtTime(2, j7);
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final boolean O(int i7) {
        return this.f6810a.sendEmptyMessage(i7);
    }

    @Override // com.google.android.gms.internal.ads.h52
    public final g42 d(int i7) {
        hv2 b7 = b();
        b7.a(this.f6810a.obtainMessage(i7), this);
        return b7;
    }
}
