package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class P extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f38109a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(T t4) {
        super(0);
        this.f38109a = t4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        T t4 = this.f38109a;
        M m4 = t4.f38277f;
        Context context = t4.f38272a;
        m4.getClass();
        return M.a(new K(m4, context));
    }
}
