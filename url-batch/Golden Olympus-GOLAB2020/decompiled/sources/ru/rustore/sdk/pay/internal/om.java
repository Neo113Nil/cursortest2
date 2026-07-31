package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class om extends kotlin.jvm.internal.s implements Function1<Throwable, Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pm f44764a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(pm pmVar) {
        super(1);
        this.f44764a = pmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        return this.f44764a.f44801d.a(error);
    }
}
