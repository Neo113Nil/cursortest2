package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s21 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w21 f11623a;

    s21(w21 w21Var) {
        this.f11623a = w21Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        Executor executor;
        if (w21.g(this.f11623a, map)) {
            executor = this.f11623a.f13669c;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.r21
                @Override // java.lang.Runnable
                public final void run() {
                    b31 b31Var;
                    b31Var = s21.this.f11623a.f13670d;
                    b31Var.c();
                }
            });
        }
    }
}
