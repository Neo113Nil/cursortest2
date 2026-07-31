package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class uw2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f13004a;

    /* renamed from: b, reason: collision with root package name */
    private final oo0 f13005b;

    public uw2(Executor executor, oo0 oo0Var) {
        this.f13004a = executor;
        this.f13005b = oo0Var;
    }

    final /* synthetic */ void a(String str) {
        this.f13005b.b(str);
    }

    public final void b(final String str) {
        this.f13004a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tw2
            @Override // java.lang.Runnable
            public final void run() {
                uw2.this.a(str);
            }
        });
    }
}
