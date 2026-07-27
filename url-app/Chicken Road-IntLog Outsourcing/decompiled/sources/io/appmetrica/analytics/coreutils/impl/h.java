package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f6221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i2) {
        super(0);
        this.f6220a = context;
        this.f6221b = intent;
        this.f6222c = i2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return this.f6220a.getPackageManager().resolveActivity(this.f6221b, this.f6222c);
    }
}
