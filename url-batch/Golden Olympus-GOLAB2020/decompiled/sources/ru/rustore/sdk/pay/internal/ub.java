package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.single.Single;

/* loaded from: classes3.dex */
public final /* synthetic */ class ub extends kotlin.jvm.internal.p implements Function1<ki, Single<u7>> {
    public ub(Object obj) {
        super(1, obj, r0.class, "createRequest", "createRequest(Lru/rustore/sdk/pay/internal/network/connection/RequestType;)Lru/rustore/sdk/reactive/single/Single;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ki p02 = (ki) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((r0) this.receiver).a(p02);
    }
}
