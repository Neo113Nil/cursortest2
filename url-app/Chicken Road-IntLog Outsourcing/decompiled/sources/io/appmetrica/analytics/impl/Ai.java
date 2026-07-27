package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Ai extends C0885on {

    /* renamed from: d, reason: collision with root package name */
    public final RunnableC1163zi f6535d;

    /* renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f6536e;

    public Ai(C0608e5 c0608e5, Ol ol, ICommonExecutor iCommonExecutor) {
        super(c0608e5, ol);
        this.f6535d = new RunnableC1163zi(this);
        this.f6536e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C0885on
    public final void a() {
        this.f6536e.remove(this.f6535d);
    }

    @Override // io.appmetrica.analytics.impl.C0885on
    public final void f() {
        this.f8958b.a();
        C0905ph c0905ph = (C0905ph) ((C0608e5) this.f8957a).f8095k.a();
        if (c0905ph.f9014k.a(c0905ph.f9013j)) {
            String str = c0905ph.f9016m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(C0566ce.a((C0608e5) this.f8957a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C0885on
    public final void g() {
        this.f6536e.executeDelayed(this.f6535d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f8959c.get()) {
            return;
        }
        this.f6536e.remove(this.f6535d);
        if (((C0905ph) ((C0608e5) this.f8957a).f8095k.a()).f9010g > 0) {
            this.f6536e.executeDelayed(this.f6535d, TimeUnit.SECONDS.toMillis(((C0905ph) ((C0608e5) this.f8957a).f8095k.a()).f9010g));
        }
    }
}
