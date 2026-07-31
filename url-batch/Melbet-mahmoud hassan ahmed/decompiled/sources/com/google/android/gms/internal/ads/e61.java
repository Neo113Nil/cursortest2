package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e61 extends t41 {

    /* renamed from: i, reason: collision with root package name */
    private final b60 f4500i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f4501j;

    /* renamed from: k, reason: collision with root package name */
    private final Executor f4502k;

    public e61(u61 u61Var, b60 b60Var, Runnable runnable, Executor executor) {
        super(u61Var);
        this.f4500i = b60Var;
        this.f4501j = runnable;
        this.f4502k = executor;
    }

    static /* synthetic */ void o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final void b() {
        final d61 d61Var = new d61(new AtomicReference(this.f4501j));
        this.f4502k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.c61
            @Override // java.lang.Runnable
            public final void run() {
                e61.this.p(d61Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final View i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final cz j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final sr2 k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final sr2 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final void n(ViewGroup viewGroup, pv pvVar) {
    }

    final /* synthetic */ void p(Runnable runnable) {
        try {
            if (this.f4500i.s0(x3.b.B3(runnable))) {
                return;
            }
            o(((d61) runnable).f4091f);
        } catch (RemoteException unused) {
            o(((d61) runnable).f4091f);
        }
    }
}
