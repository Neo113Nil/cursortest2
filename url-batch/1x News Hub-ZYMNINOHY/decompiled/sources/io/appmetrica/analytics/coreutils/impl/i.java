package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5459b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(0);
        this.f5458a = context;
        this.f5459b = str;
    }

    @Override // l2.a
    public final Object invoke() {
        PackageManager packageManager = this.f5458a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f5459b) : packageManager.resolveContentProvider(this.f5459b, 128);
    }
}
