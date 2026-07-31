package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.pay.model.UserAuthorizationStatus;

/* loaded from: classes3.dex */
public final /* synthetic */ class fn extends kotlin.jvm.internal.p implements Function1<ak, UserAuthorizationStatus> {
    public fn(Object obj) {
        super(1, obj, en.class, "mapToModel", "mapToModel(Lru/rustore/sdk/pay/internal/network/session/Session;)Lru/rustore/sdk/pay/model/UserAuthorizationStatus;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak session = (ak) obj;
        Intrinsics.checkNotNullParameter(session, "p0");
        ((en) this.receiver).getClass();
        Intrinsics.checkNotNullParameter(session, "session");
        if (session instanceof ak.c ? true : session instanceof ak.b) {
            return UserAuthorizationStatus.AUTHORIZED;
        }
        if (session instanceof ak.a) {
            return UserAuthorizationStatus.UNAUTHORIZED;
        }
        throw new W1.m();
    }
}
