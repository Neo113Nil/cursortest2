package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f6674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Li f6675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u3, Li li) {
        super(0);
        this.f6674a = u3;
        this.f6675b = li;
    }

    @Override // l2.a
    public final Object invoke() {
        U u3 = this.f6674a;
        N n3 = u3.f6737h;
        Context context = u3.f6731a;
        Li li = this.f6675b;
        n3.getClass();
        return N.a(new M(n3, context, li));
    }
}
