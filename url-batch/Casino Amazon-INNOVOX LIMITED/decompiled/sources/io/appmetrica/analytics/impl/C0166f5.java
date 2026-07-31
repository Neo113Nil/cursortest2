package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0166f5 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0166f5 f1250a = new C0166f5();

    public C0166f5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((IExecutionPolicy) obj).description();
    }
}
