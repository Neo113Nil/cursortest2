package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.f9699a = context;
        this.f9700b = str;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        PackageManager packageManager = this.f9699a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f9700b) : packageManager.getInstallerPackageName(this.f9700b);
    }
}
