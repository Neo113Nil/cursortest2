package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3110y6 extends C2548ch {

    /* renamed from: f, reason: collision with root package name */
    public final Context f40256f;

    /* renamed from: g, reason: collision with root package name */
    public final Ih f40257g;

    /* renamed from: h, reason: collision with root package name */
    public final M6 f40258h;

    /* renamed from: i, reason: collision with root package name */
    public final R1 f40259i;

    /* renamed from: j, reason: collision with root package name */
    public final J6 f40260j;

    public C3110y6(@NotNull Context context, @NotNull C2793m0 c2793m0, @Nullable Zk zk, @NotNull Ih ih) {
        super(c2793m0, zk, ih);
        this.f40256f = context;
        this.f40257g = ih;
        this.f40258h = C3082x4.l().i();
        this.f40259i = C3082x4.l().f();
        this.f40260j = new J6(context);
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final synchronized void a() {
        try {
            if (this.f37897c) {
                return;
            }
            this.f37897c = true;
            String b4 = this.f40258h.b();
            R1 r12 = this.f40259i;
            Context context = this.f40256f;
            r12.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (Intrinsics.areEqual(b4, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f40260j.a(this.f40257g);
            } else {
                this.f37895a.c();
                this.f37897c = false;
                super.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final boolean c() {
        this.f40260j.a(this.f40257g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Kh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.f41027a;
    }
}
