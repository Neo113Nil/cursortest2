package sqip;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.TransactionInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import sqip.internal.GooglePayComponent;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u000bH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lsqip/GooglePay;", "", "()V", "CARD_NETWORKS", "", "", "createIsReadyToPayRequest", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "createPaymentDataRequest", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "squareLocationId", "", "transactionInfo", "Lcom/google/android/gms/wallet/TransactionInfo;", "requestGooglePayNonce", "Lsqip/Call;", "Lsqip/GooglePayNonceResult;", "payData", "Lcom/google/android/gms/wallet/PaymentData;", "googlePayToken", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GooglePay {
    public static final GooglePay INSTANCE = new GooglePay();
    private static final List<Integer> CARD_NETWORKS = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 2, 3, 5, 4, Integer.valueOf(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO)});

    private GooglePay() {
    }

    public static final IsReadyToPayRequest createIsReadyToPayRequest() {
        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
        if (isReadyToPayRequest.zzd == null) {
            isReadyToPayRequest.zzd = new ArrayList();
        }
        isReadyToPayRequest.zzd.add(1);
        List<Integer> list = CARD_NETWORKS;
        zzae.checkArgument("allowedCardNetworks can't be null or empty. If you want the defaults, leave it unset.", (list == null || list.isEmpty()) ? false : true);
        if (isReadyToPayRequest.zza == null) {
            isReadyToPayRequest.zza = new ArrayList();
        }
        isReadyToPayRequest.zza.addAll(list);
        return isReadyToPayRequest;
    }

    public static final PaymentDataRequest createPaymentDataRequest(String squareLocationId, TransactionInfo transactionInfo) {
        squareLocationId.getClass();
        transactionInfo.getClass();
        PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
        paymentDataRequest.zzh = transactionInfo;
        if (paymentDataRequest.zzf == null) {
            paymentDataRequest.zzf = new ArrayList();
        }
        paymentDataRequest.zzf.add(1);
        CardRequirements cardRequirements = new CardRequirements();
        cardRequirements.zzb = true;
        List<Integer> list = CARD_NETWORKS;
        zzae.checkArgument("allowedCardNetworks can't be null or empty! You must provide a valid value from WalletConstants.CardNetwork.", (list == null || list.isEmpty()) ? false : true);
        if (cardRequirements.zza == null) {
            cardRequirements.zza = new ArrayList();
        }
        cardRequirements.zza.addAll(list);
        cardRequirements.zzc = true;
        cardRequirements.zzd = 0;
        zzae.checkNotNull(cardRequirements.zza, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
        paymentDataRequest.zzc = cardRequirements;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = new PaymentMethodTokenizationParameters();
        paymentMethodTokenizationParameters.zza = 1;
        zzae.checkNotEmpty("gateway", "Tokenization parameter name must not be empty");
        zzae.checkNotEmpty("square", "Tokenization parameter value must not be empty");
        Bundle bundle = paymentMethodTokenizationParameters.zzb;
        bundle.putString("gateway", "square");
        zzae.checkNotEmpty("gatewayMerchantId", "Tokenization parameter name must not be empty");
        zzae.checkNotEmpty(squareLocationId, "Tokenization parameter value must not be empty");
        bundle.putString("gatewayMerchantId", squareLocationId);
        paymentDataRequest.zzg = paymentMethodTokenizationParameters;
        if (paymentDataRequest.zzj == null && paymentDataRequest.zzk == null) {
            zzae.checkNotNull(paymentDataRequest.zzf, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
            zzae.checkNotNull(paymentDataRequest.zzc, "Card requirements must be set!");
            if (paymentDataRequest.zzg != null) {
                zzae.checkNotNull(paymentDataRequest.zzh, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
            }
        }
        return paymentDataRequest;
    }

    @Deprecated
    public static final Call<GooglePayNonceResult> requestGooglePayNonce(String googlePayToken) {
        googlePayToken.getClass();
        return GooglePayComponent.INSTANCE.getInstance().createNonceCallFactory().create(googlePayToken);
    }

    public static final Call<GooglePayNonceResult> requestGooglePayNonce(PaymentData payData) {
        payData.getClass();
        return GooglePayComponent.INSTANCE.getInstance().createNonceCallFactory().create(payData);
    }
}
