package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i3) {
        super(0);
        this.f5440a = context;
        this.f5441b = str;
        this.f5442c = i3;
    }

    @Override // l2.a
    public final Object invoke() {
        return this.f5440a.getPackageManager().getApplicationInfo(this.f5441b, this.f5442c);
    }
}
