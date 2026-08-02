package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.f5445a = context;
        this.f5446b = str;
    }

    @Override // l2.a
    public final Object invoke() {
        PackageManager packageManager = this.f5445a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f5446b) : packageManager.getInstallerPackageName(this.f5446b);
    }
}
