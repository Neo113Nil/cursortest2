package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import b2.C0195i;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587j6 extends Ug {
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final Ah f7622g;

    /* renamed from: h, reason: collision with root package name */
    public final C0975y6 f7623h;

    /* renamed from: i, reason: collision with root package name */
    public final U1 f7624i;

    /* renamed from: j, reason: collision with root package name */
    public final C0872u6 f7625j;

    public C0587j6(Context context, C0737p0 c0737p0, InterfaceC0448dl interfaceC0448dl, Ah ah) {
        super(c0737p0, interfaceC0448dl, ah);
        this.f = context;
        this.f7622g = ah;
        this.f7623h = C0585j4.l().i();
        this.f7624i = C0585j4.l().f();
        this.f7625j = new C0872u6(context);
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final synchronized void a() {
        try {
            if (this.f5856c) {
                return;
            }
            this.f5856c = true;
            String a3 = this.f7623h.f8635a.a();
            U1 u12 = this.f7624i;
            Context context = this.f;
            u12.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (kotlin.jvm.internal.j.a(a3, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f7625j.a(this.f7622g);
            } else {
                this.f5854a.c();
                this.f5856c = false;
                super.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final boolean c() {
        this.f7625j.a(this.f7622g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Ch, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return C0195i.f2555a;
    }
}
