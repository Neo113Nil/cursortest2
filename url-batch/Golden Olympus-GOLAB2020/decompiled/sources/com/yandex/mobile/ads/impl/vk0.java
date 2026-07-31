package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2372yj;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vk0 implements AbstractC2372yj.a<gx> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1<gx, Unit> f33666a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<hi2, Unit> f33667b;

    /* JADX WARN: Multi-variable type inference failed */
    vk0(Function1<? super gx, Unit> function1, Function1<? super hi2, Unit> function12) {
        this.f33666a = function1;
        this.f33667b = function12;
    }

    @Override // com.yandex.mobile.ads.impl.qq1.a
    public final void a(@NotNull hi2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f33667b.invoke(error);
    }

    @Override // com.yandex.mobile.ads.impl.qq1.b
    public final void a(Object obj) {
        gx response = (gx) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f33666a.invoke(response);
    }
}
