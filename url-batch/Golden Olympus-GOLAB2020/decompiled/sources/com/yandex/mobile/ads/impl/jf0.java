package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jf0 implements InterfaceC1995ic {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct1 f27640a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f27641b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final lf0 f27642c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mf0 f27643d;

    public /* synthetic */ jf0(Context context) {
        this(context, new ct1());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1995ic
    @Nullable
    public final C1851cc a() {
        ResolveInfo resolveInfo;
        this.f27643d.getClass();
        Intent intent = mf0.a();
        ct1 ct1Var = this.f27640a;
        Context context = this.f27641b;
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
                com.monetization.ads.core.identifiers.ad.huawei.a aVar = new com.monetization.ads.core.identifiers.ad.huawei.a();
                if (this.f27641b.bindService(intent, aVar, 1)) {
                    C1851cc a4 = this.f27642c.a(aVar);
                    this.f27641b.unbindService(aVar);
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

    public jf0(@NotNull Context context, @NotNull ct1 safePackageManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(safePackageManager, "safePackageManager");
        this.f27640a = safePackageManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f27641b = applicationContext;
        this.f27642c = new lf0();
        this.f27643d = new mf0();
    }
}
