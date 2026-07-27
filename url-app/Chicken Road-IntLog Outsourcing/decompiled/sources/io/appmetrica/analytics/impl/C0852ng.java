package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852ng implements Va {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f8866a;

    /* renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f8867b;

    public C0852ng(Context context, ICommonExecutor iCommonExecutor) {
        this.f8866a = iCommonExecutor;
        this.f8867b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC1111xg interfaceC1111xg, Throwable th) {
        interfaceC1111xg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(InterfaceC1111xg interfaceC1111xg) {
        this.f8867b.startConnection(new C0826mg(this, interfaceC1111xg));
    }

    public final void a(InterfaceC1111xg interfaceC1111xg, Throwable th) {
        this.f8866a.execute(new B3.c(interfaceC1111xg, 19, th));
    }
}
