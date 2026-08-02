package io.appmetrica.analytics.impl;

import android.content.Context;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f10966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gi f10967b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u4, Gi gi) {
        super(0);
        this.f10966a = u4;
        this.f10967b = gi;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        U u4 = this.f10966a;
        N n = u4.f11024h;
        Context context = u4.f11017a;
        Gi gi = this.f10967b;
        n.getClass();
        return N.a(new M(n, context, gi));
    }
}
