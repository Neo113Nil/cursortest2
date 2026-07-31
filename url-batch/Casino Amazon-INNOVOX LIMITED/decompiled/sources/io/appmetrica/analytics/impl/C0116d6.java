package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0116d6 extends Qg {
    public final Context f;
    public final C0607wh g;
    public final C0496s6 h;
    public final L1 i;
    public final C0397o6 j;

    public C0116d6(Context context, C0416p0 c0416p0, InterfaceC0053al interfaceC0053al, C0607wh c0607wh) {
        super(c0416p0, interfaceC0053al, c0607wh);
        this.f = context;
        this.g = c0607wh;
        this.h = C0088c4.l().i();
        this.i = C0088c4.l().f();
        this.j = new C0397o6(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0657yh
    public final synchronized void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        String a2 = this.h.f1480a.a();
        L1 l1 = this.i;
        Context context = this.f;
        l1.getClass();
        ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
        if (Intrinsics.areEqual(a2, serviceInfo != null ? serviceInfo.processName : null)) {
            this.j.a(this.g);
        } else {
            this.f1587a.c();
            this.c = false;
            super.a();
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0657yh
    public final boolean c() {
        this.j.a(this.g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0657yh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.INSTANCE;
    }
}
