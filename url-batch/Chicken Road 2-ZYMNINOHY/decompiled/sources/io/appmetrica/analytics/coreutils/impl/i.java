package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9713b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(0);
        this.f9712a = context;
        this.f9713b = str;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        PackageManager packageManager = this.f9712a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f9713b) : packageManager.resolveContentProvider(this.f9713b, 128);
    }
}
