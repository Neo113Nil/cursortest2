package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Ai extends C0734on {

    /* renamed from: d, reason: collision with root package name */
    public final RunnableC1012zi f5758d;

    /* renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f5759e;

    public Ai(C0457e5 c0457e5, Ol ol, ICommonExecutor iCommonExecutor) {
        super(c0457e5, ol);
        this.f5758d = new RunnableC1012zi(this);
        this.f5759e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C0734on
    public final void a() {
        this.f5759e.remove(this.f5758d);
    }

    @Override // io.appmetrica.analytics.impl.C0734on
    public final void f() {
        this.f8035b.a();
        C0754ph c0754ph = (C0754ph) ((C0457e5) this.f8034a).f7234k.a();
        if (c0754ph.f8088k.a(c0754ph.f8087j)) {
            String str = c0754ph.f8090m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(C0415ce.a((C0457e5) this.f8034a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C0734on
    public final void g() {
        this.f5759e.executeDelayed(this.f5758d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f8036c.get()) {
            return;
        }
        this.f5759e.remove(this.f5758d);
        if (((C0754ph) ((C0457e5) this.f8034a).f7234k.a()).f8084g > 0) {
            this.f5759e.executeDelayed(this.f5758d, TimeUnit.SECONDS.toMillis(((C0754ph) ((C0457e5) this.f8034a).f7234k.a()).f8084g));
        }
    }
}
