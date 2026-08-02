package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f5461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i3) {
        super(0);
        this.f5460a = context;
        this.f5461b = intent;
        this.f5462c = i3;
    }

    @Override // l2.a
    public final Object invoke() {
        return this.f5460a.getPackageManager().resolveService(this.f5461b, this.f5462c);
    }
}
