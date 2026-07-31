package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.UserAuthorizationStatus;

/* loaded from: classes3.dex */
public final class gn extends kotlin.jvm.internal.s implements Function1<Throwable, UserAuthorizationStatus> {

    /* renamed from: a, reason: collision with root package name */
    public static final gn f44189a = new gn();

    public gn() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        if (!(error instanceof RuStorePaymentException.RuStorePaymentNetworkException)) {
            throw error;
        }
        if (Intrinsics.areEqual(((RuStorePaymentException.RuStorePaymentNetworkException) error).getCode(), "NO_CONNECTION")) {
            return UserAuthorizationStatus.UNAUTHORIZED;
        }
        throw error;
    }
}
