package com.stripe.android;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.NetworkTypeDetector;
import javax.inject.Provider;

/* loaded from: classes8.dex */
public final /* synthetic */ class StripePaymentController$$ExternalSyntheticLambda0 implements Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ StripePaymentController$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        NetworkTypeDetector.NetworkType networkType;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return ((PromotionsTitleBarKt$$ExternalSyntheticLambda0) obj).f$0;
            case 1:
                return (String) obj;
            default:
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((NetworkTypeDetector) obj).connectivityManager).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return null;
                }
                int type2 = activeNetworkInfo.getType();
                if (type2 == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            networkType = NetworkTypeDetector.NetworkType.Mobile2G;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            networkType = NetworkTypeDetector.NetworkType.Mobile3G;
                            break;
                        case 13:
                        case 18:
                        case 19:
                            networkType = NetworkTypeDetector.NetworkType.Mobile4G;
                            break;
                        case 20:
                            networkType = NetworkTypeDetector.NetworkType.Mobile5G;
                            break;
                        default:
                            networkType = NetworkTypeDetector.NetworkType.Unknown;
                            break;
                    }
                } else {
                    networkType = type2 != 1 ? NetworkTypeDetector.NetworkType.Unknown : NetworkTypeDetector.NetworkType.WiFi;
                }
                return networkType.value;
        }
    }
}
