package sqip.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes10.dex */
public final class UrlModule_PaymentUrlFactory implements Factory {

    public static final class InstanceHolder {
        static final UrlModule_PaymentUrlFactory INSTANCE = new UrlModule_PaymentUrlFactory();

        private InstanceHolder() {
        }
    }

    public static UrlModule_PaymentUrlFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String paymentUrl() {
        String paymentUrl = UrlModule.INSTANCE.paymentUrl();
        Preconditions.checkNotNullFromProvides(paymentUrl);
        return paymentUrl;
    }

    @Override // javax.inject.Provider
    public String get() {
        return paymentUrl();
    }
}
