package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import c3.C0297i;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529c6 extends Pg {

    /* renamed from: f, reason: collision with root package name */
    public final Context f11587f;

    /* renamed from: g, reason: collision with root package name */
    public final C1031vh f11588g;

    /* renamed from: h, reason: collision with root package name */
    public final C0916r6 f11589h;

    /* renamed from: i, reason: collision with root package name */
    public final K1 f11590i;

    /* renamed from: j, reason: collision with root package name */
    public final C0813n6 f11591j;

    public C0529c6(Context context, C0859p0 c0859p0, Zk zk, C1031vh c1031vh) {
        super(c0859p0, zk, c1031vh);
        this.f11587f = context;
        this.f11588g = c1031vh;
        this.f11589h = C0501b4.l().i();
        this.f11590i = C0501b4.l().f();
        this.f11591j = new C0813n6(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1083xh
    public final synchronized void a() {
        try {
            if (this.f13034c) {
                return;
            }
            this.f13034c = true;
            String a3 = this.f11589h.f12649a.a();
            K1 k12 = this.f11590i;
            Context context = this.f11587f;
            k12.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (kotlin.jvm.internal.i.a(a3, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f11591j.a(this.f11588g);
            } else {
                this.f13032a.c();
                this.f13034c = false;
                super.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1083xh
    public final boolean c() {
        this.f11591j.a(this.f11588g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1083xh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return C0297i.f5732a;
    }
}
