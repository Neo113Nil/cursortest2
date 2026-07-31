package ru.rustore.sdk.pay;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.yj;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

@Metadata
/* loaded from: classes3.dex */
public final class RuStorePayClient {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final IntentInteractor intentInteractor;

    @NotNull
    private final ProductInteractor productInteractor;

    @NotNull
    private final PurchaseInteractor purchaseInteractor;

    @NotNull
    private final UserInteractor userInteractor;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RuStorePayClient getInstance() {
            yj yjVar = yj.I3;
            if (yjVar != null) {
                return (RuStorePayClient) yjVar.f45287B3.getValue();
            }
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }

        private Companion() {
        }
    }

    public RuStorePayClient(@NotNull PurchaseInteractor purchaseInteractor, @NotNull ProductInteractor productInteractor, @NotNull IntentInteractor intentInteractor, @NotNull UserInteractor userInteractor) {
        Intrinsics.checkNotNullParameter(purchaseInteractor, "purchaseInteractor");
        Intrinsics.checkNotNullParameter(productInteractor, "productInteractor");
        Intrinsics.checkNotNullParameter(intentInteractor, "intentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.purchaseInteractor = purchaseInteractor;
        this.productInteractor = productInteractor;
        this.intentInteractor = intentInteractor;
        this.userInteractor = userInteractor;
    }

    @NotNull
    public final IntentInteractor getIntentInteractor() {
        return this.intentInteractor;
    }

    @NotNull
    public final ProductInteractor getProductInteractor() {
        return this.productInteractor;
    }

    @NotNull
    public final PurchaseInteractor getPurchaseInteractor() {
        return this.purchaseInteractor;
    }

    @NotNull
    public final UserInteractor getUserInteractor() {
        return this.userInteractor;
    }
}
