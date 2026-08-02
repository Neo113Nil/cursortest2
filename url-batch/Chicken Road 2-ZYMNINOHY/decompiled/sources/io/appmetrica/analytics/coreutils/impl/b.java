package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i4) {
        super(0);
        this.f9694a = context;
        this.f9695b = str;
        this.f9696c = i4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        return this.f9694a.getPackageManager().getApplicationInfo(this.f9695b, this.f9696c);
    }
}
