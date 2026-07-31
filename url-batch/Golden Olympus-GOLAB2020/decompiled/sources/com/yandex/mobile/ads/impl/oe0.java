package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oe0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct1 f30003a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f30004b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final pe0 f30005c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qe0 f30006d;

    public /* synthetic */ oe0(Context context) {
        this(context, new ct1());
    }

    @Nullable
    public final C1851cc a() {
        ResolveInfo resolveInfo;
        this.f30006d.getClass();
        Intent intent = qe0.a();
        ct1 ct1Var = this.f30003a;
        Context context = this.f30004b;
        ct1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        C1851cc c1851cc = null;
        try {
            resolveInfo = context.getPackageManager().resolveService(intent, 0);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            resolveInfo = null;
        }
        if (resolveInfo != null) {
            try {
                le0 le0Var = new le0();
                if (this.f30004b.bindService(intent, le0Var, 1)) {
                    C1851cc a4 = this.f30005c.a(le0Var);
                    this.f30004b.unbindService(le0Var);
                    c1851cc = a4;
                } else {
                    ap0.a(new Object[0]);
                }
            } catch (Throwable unused2) {
                ap0.c(new Object[0]);
            }
        }
        return c1851cc;
    }

    public oe0(@NotNull Context context, @NotNull ct1 safePackageManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(safePackageManager, "safePackageManager");
        this.f30003a = safePackageManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f30004b = applicationContext;
        this.f30005c = new pe0();
        this.f30006d = new qe0();
    }
}
