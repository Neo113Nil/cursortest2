package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f651a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.f651a = context;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PackageManager packageManager = this.f651a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.b) : packageManager.getInstallerPackageName(this.b);
    }
}
