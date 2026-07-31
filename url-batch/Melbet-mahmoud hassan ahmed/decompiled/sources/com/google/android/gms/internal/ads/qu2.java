package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class qu2<R extends ea1<AdT>, AdT extends v61> {

    /* renamed from: a, reason: collision with root package name */
    private final tt2 f10828a;

    /* renamed from: b, reason: collision with root package name */
    private final ou2<R, AdT> f10829b;

    /* renamed from: c, reason: collision with root package name */
    private final pt2 f10830c;

    /* renamed from: e, reason: collision with root package name */
    private wu2<R, AdT> f10832e;

    /* renamed from: f, reason: collision with root package name */
    private int f10833f = 1;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<pu2<R, AdT>> f10831d = new ArrayDeque<>();

    public qu2(tt2 tt2Var, pt2 pt2Var, ou2<R, AdT> ou2Var) {
        this.f10828a = tt2Var;
        this.f10830c = pt2Var;
        this.f10829b = ou2Var;
        pt2Var.b(new lu2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        if (((Boolean) sw.c().b(m10.K4)).booleanValue() && !y2.t.p().h().e().h()) {
            this.f10831d.clear();
            return;
        }
        if (i()) {
            while (!this.f10831d.isEmpty()) {
                pu2<R, AdT> pollFirst = this.f10831d.pollFirst();
                if (pollFirst == null || (pollFirst.zza() != null && this.f10828a.d(pollFirst.zza()))) {
                    wu2<R, AdT> wu2Var = new wu2<>(this.f10828a, this.f10829b, pollFirst);
                    this.f10832e = wu2Var;
                    wu2Var.d(new mu2(this, pollFirst));
                    return;
                }
            }
        }
    }

    private final synchronized boolean i() {
        return this.f10832e == null;
    }

    public final synchronized cc3<nu2<R, AdT>> a(pu2<R, AdT> pu2Var) {
        this.f10833f = 2;
        if (i()) {
            return null;
        }
        return this.f10832e.a(pu2Var);
    }

    public final synchronized void e(pu2<R, AdT> pu2Var) {
        this.f10831d.add(pu2Var);
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            this.f10833f = 1;
            h();
        }
    }
}
