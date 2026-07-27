package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6211b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.f6210a = context;
        this.f6211b = str;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        PackageManager packageManager = this.f6210a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f6211b) : packageManager.getInstallerPackageName(this.f6211b);
    }
}
