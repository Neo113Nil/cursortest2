package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class B4 implements InterfaceC0663m4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5802a;

    /* renamed from: b, reason: collision with root package name */
    public final E4 f5803b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f5804c;

    public B4(Context context, E4 e4, C0922w4 c0922w4) {
        this.f5802a = context;
        this.f5803b = e4;
        this.f5804c = c0922w4.f8545c;
        e4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0663m4
    public final void a(W5 w5, C0922w4 c0922w4) {
        this.f5803b.a(c0922w4.f8544b);
        this.f5803b.a(w5, this);
    }

    public final E4 b() {
        return this.f5803b;
    }

    public final Context c() {
        return this.f5802a;
    }

    public final ResultReceiver d() {
        return this.f5804c;
    }

    public final void a(C0353a4 c0353a4) {
        I6.a(this.f5804c, c0353a4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0663m4
    public final void a() {
        this.f5803b.b(this);
    }
}
