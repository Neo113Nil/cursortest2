package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Ii extends C2738jn {

    /* renamed from: d, reason: collision with root package name */
    public final Hi f37768d;

    /* renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f37769e;

    public Ii(@NonNull C2953s5 c2953s5, @NonNull Kl kl, @NonNull ICommonExecutor iCommonExecutor) {
        super(c2953s5, kl);
        this.f37768d = new Hi(this);
        this.f37769e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C2738jn
    public final void a() {
        this.f37769e.remove(this.f37768d);
    }

    @Override // io.appmetrica.analytics.impl.C2738jn
    public final void f() {
        this.f39321b.a();
        C3095xh c3095xh = (C3095xh) ((C2953s5) this.f39320a).f39775k.a();
        if (c3095xh.f40184k.a(c3095xh.f40183j)) {
            String str = c3095xh.f40186m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(C2755ke.a((C2953s5) this.f39320a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C2738jn
    public final void g() {
        this.f37769e.executeDelayed(this.f37768d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f39322c.get()) {
            return;
        }
        this.f37769e.remove(this.f37768d);
        if (((C3095xh) ((C2953s5) this.f39320a).f39775k.a()).f40180g > 0) {
            this.f37769e.executeDelayed(this.f37768d, TimeUnit.SECONDS.toMillis(((C3095xh) ((C2953s5) this.f39320a).f39775k.a()).f40180g));
        }
    }
}
