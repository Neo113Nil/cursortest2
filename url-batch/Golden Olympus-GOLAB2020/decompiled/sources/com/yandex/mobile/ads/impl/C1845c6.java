package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1845c6 extends kotlin.jvm.internal.s implements Function1<D2.x, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map.Entry<String, C2012j6> f24063b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1845c6(Map.Entry<String, C2012j6> entry) {
        super(1);
        this.f24063b = entry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        D2.x putJsonObject = (D2.x) obj;
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        D2.j.c(putJsonObject, "usagePercent", Integer.valueOf(this.f24063b.getValue().b()));
        D2.j.b(putJsonObject, "isDisabled", Boolean.valueOf(this.f24063b.getValue().a()));
        return Unit.f41027a;
    }
}
