package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0280jg implements Pa {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f1323a;
    public final InstallReferrerClient b;

    public C0280jg(Context context, ICommonExecutor iCommonExecutor) {
        this.f1323a = iCommonExecutor;
        this.b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC0531tg interfaceC0531tg, Throwable th) {
        interfaceC0531tg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(InterfaceC0531tg interfaceC0531tg) throws Throwable {
        this.b.startConnection(new C0254ig(this, interfaceC0531tg));
    }

    public final void a(final InterfaceC0531tg interfaceC0531tg, final Throwable th) {
        this.f1323a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.jg$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0280jg.b(InterfaceC0531tg.this, th);
            }
        });
    }
}
