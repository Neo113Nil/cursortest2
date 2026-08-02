package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f9710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i4) {
        super(0);
        this.f9709a = context;
        this.f9710b = intent;
        this.f9711c = i4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        return this.f9709a.getPackageManager().resolveActivity(this.f9710b, this.f9711c);
    }
}
