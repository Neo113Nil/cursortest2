package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class si2 implements ij2<ti2> {

    /* renamed from: a, reason: collision with root package name */
    private final pm0 f11842a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f11843b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f11844c;

    public si2(pm0 pm0Var, dc3 dc3Var, Context context) {
        this.f11842a = pm0Var;
        this.f11843b = dc3Var;
        this.f11844c = context;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<ti2> a() {
        return this.f11843b.E(new Callable() { // from class: com.google.android.gms.internal.ads.ri2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return si2.this.b();
            }
        });
    }

    final /* synthetic */ ti2 b() {
        if (!this.f11842a.z(this.f11844c)) {
            return new ti2(null, null, null, null, null);
        }
        String j7 = this.f11842a.j(this.f11844c);
        String str = j7 == null ? "" : j7;
        String h7 = this.f11842a.h(this.f11844c);
        String str2 = h7 == null ? "" : h7;
        String f7 = this.f11842a.f(this.f11844c);
        String str3 = f7 == null ? "" : f7;
        String g7 = this.f11842a.g(this.f11844c);
        return new ti2(str, str2, str3, g7 == null ? "" : g7, "TIME_OUT".equals(str2) ? (Long) sw.c().b(m10.f8153a0) : null);
    }
}
