package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class S extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f38219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ti f38220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t4, Ti ti) {
        super(0);
        this.f38219a = t4;
        this.f38220b = ti;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        T t4 = this.f38219a;
        M m4 = t4.f38279h;
        Context context = t4.f38272a;
        Ti ti = this.f38220b;
        m4.getClass();
        return M.a(new L(m4, context, ti));
    }
}
