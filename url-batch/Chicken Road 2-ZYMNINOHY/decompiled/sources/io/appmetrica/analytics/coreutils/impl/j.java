package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f9715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i4) {
        super(0);
        this.f9714a = context;
        this.f9715b = intent;
        this.f9716c = i4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        return this.f9714a.getPackageManager().resolveService(this.f9715b, this.f9716c);
    }
}
