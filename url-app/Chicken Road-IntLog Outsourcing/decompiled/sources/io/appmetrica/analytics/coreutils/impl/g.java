package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.f6218a = context;
        this.f6219b = str;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return Boolean.valueOf(this.f6218a.getPackageManager().hasSystemFeature(this.f6219b));
    }
}
