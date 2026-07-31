package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class tb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final q0 f45040a;

    public tb(@NotNull q0 authUrlValidator) {
        Intrinsics.checkNotNullParameter(authUrlValidator, "authUrlValidator");
        this.f45040a = authUrlValidator;
    }

    @NotNull
    public final Throwable a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof RuStorePaymentException.RuStorePaymentNetworkException) {
            RuStorePaymentException.RuStorePaymentNetworkException ruStorePaymentNetworkException = (RuStorePaymentException.RuStorePaymentNetworkException) throwable;
            if (Intrinsics.areEqual(ruStorePaymentNetworkException.getCode(), "4030005")) {
                String urlValue = StringsKt.O0(ruStorePaymentNetworkException.getMessage(), "Sign in url: ", null, 2, null);
                this.f45040a.getClass();
                Intrinsics.checkNotNullParameter(urlValue, "urlValue");
                if (!StringsKt.K(urlValue, "https://rustore.ru", false, 2, null)) {
                    urlValue = "";
                }
                return new vm(new Url(urlValue));
            }
        }
        return throwable;
    }
}
