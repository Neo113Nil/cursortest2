package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class u21 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w21 f12591a;

    u21(w21 w21Var) {
        this.f12591a = w21Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        Executor executor;
        if (w21.g(this.f12591a, map)) {
            executor = this.f12591a.f13669c;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.t21
                @Override // java.lang.Runnable
                public final void run() {
                    b31 b31Var;
                    b31Var = u21.this.f12591a.f13670d;
                    b31Var.g();
                }
            });
        }
    }
}
