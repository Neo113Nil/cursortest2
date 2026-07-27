package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(0);
        this.f6223a = context;
        this.f6224b = str;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        PackageManager packageManager = this.f6223a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f6224b) : packageManager.resolveContentProvider(this.f6224b, 128);
    }
}
