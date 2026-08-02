package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.f9707a = context;
        this.f9708b = str;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        return Boolean.valueOf(this.f9707a.getPackageManager().hasSystemFeature(this.f9708b));
    }
}
