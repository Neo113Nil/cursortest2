package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701ng implements Va {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f7949a;

    /* renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f7950b;

    public C0701ng(Context context, ICommonExecutor iCommonExecutor) {
        this.f7949a = iCommonExecutor;
        this.f7950b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC0960xg interfaceC0960xg, Throwable th) {
        interfaceC0960xg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(InterfaceC0960xg interfaceC0960xg) throws Throwable {
        this.f7950b.startConnection(new C0675mg(this, interfaceC0960xg));
    }

    public final void a(InterfaceC0960xg interfaceC0960xg, Throwable th) {
        this.f7949a.execute(new A1.a(interfaceC0960xg, 18, th));
    }
}
