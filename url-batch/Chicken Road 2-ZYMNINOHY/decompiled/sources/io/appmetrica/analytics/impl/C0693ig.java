package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693ig implements Oa {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f12043a;

    /* renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f12044b;

    public C0693ig(Context context, ICommonExecutor iCommonExecutor) {
        this.f12043a = iCommonExecutor;
        this.f12044b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC0952sg interfaceC0952sg, Throwable th) {
        interfaceC0952sg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(InterfaceC0952sg interfaceC0952sg) throws Throwable {
        this.f12044b.startConnection(new C0668hg(this, interfaceC0952sg));
    }

    public final void a(InterfaceC0952sg interfaceC0952sg, Throwable th) {
        this.f12043a.execute(new g0.p(interfaceC0952sg, 6, th));
    }
}
