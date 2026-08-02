package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032vi extends C0778ln {

    /* renamed from: d, reason: collision with root package name */
    public final RunnableC1006ui f12898d;

    /* renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f12899e;

    public C1032vi(X4 x4, Kl kl, ICommonExecutor iCommonExecutor) {
        super(x4, kl);
        this.f12898d = new RunnableC1006ui(this);
        this.f12899e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C0778ln
    public final void a() {
        this.f12899e.remove(this.f12898d);
    }

    @Override // io.appmetrica.analytics.impl.C0778ln
    public final void f() {
        this.f12311b.a();
        C0746kh c0746kh = (C0746kh) ((X4) this.f12310a).f11232k.a();
        if (c0746kh.f12229k.a(c0746kh.f12228j)) {
            String str = c0746kh.f12231m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(Vd.a((X4) this.f12310a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C0778ln
    public final void g() {
        this.f12899e.executeDelayed(this.f12898d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f12312c.get()) {
            return;
        }
        this.f12899e.remove(this.f12898d);
        if (((C0746kh) ((X4) this.f12310a).f11232k.a()).f12225g > 0) {
            this.f12899e.executeDelayed(this.f12898d, TimeUnit.SECONDS.toMillis(((C0746kh) ((X4) this.f12310a).f11232k.a()).f12225g));
        }
    }
}
