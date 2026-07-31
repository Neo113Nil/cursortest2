package com.appsflyer.internal.models;

import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class SubscriptionItemPriceChangeDetails {
    public static final Companion Companion = new Companion(null);
    private final String expectedNewPriceChargeTime;
    private final Money newPrice;
    private final String priceChangeMode;
    private final String priceChangeState;

    @Metadata
    public static final class Companion implements Deserialize<SubscriptionItemPriceChangeDetails> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getQuantity = 0;
        private static int hashCode = 1;
        private static char[] getPackageName = {34824, 35063, 35071, 34826, 35067, 34827, 34849, 35062, 34847, 35069, 34820, 34858, 34823, 34828, 34822, 34843, 34816, 34817, 34848, 35070, 34842};
        private static int toJsonMap = -2120185745;
        private static boolean getOneTimePurchaseOfferDetails = true;
        private static boolean InAppPurchaseEvent = true;

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0078 -> B:23:0x0068). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int[] iArr, String str, int i4, String str2, Object[] objArr) {
            int i5;
            int i6;
            char[] cArr;
            int i7;
            int i8;
            byte[] bArr = str2;
            if (str2 != null) {
                int i9 = $10 + 15;
                $11 = i9 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i9 % 2 == 0) {
                    str2.getBytes("ISO-8859-1");
                    throw null;
                }
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] cArr2 = str;
            if (str != null) {
                cArr2 = str.toCharArray();
            }
            char[] cArr3 = cArr2;
            AFPurchaseConnectorA1b aFPurchaseConnectorA1b = new AFPurchaseConnectorA1b();
            char[] cArr4 = getPackageName;
            if (cArr4 != null) {
                $10 = ($11 + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int length = cArr4.length;
                char[] cArr5 = new char[length];
                for (int i10 = 0; i10 < length; i10++) {
                    cArr5[i10] = (char) (cArr4[i10] ^ (-4643703481320830850L));
                }
                cArr4 = cArr5;
            }
            int i11 = (int) ((-4643703481320830850L) ^ toJsonMap);
            if (InAppPurchaseEvent) {
                int i12 = $11 + InterfaceC1490j3.d.b.f16815g;
                $10 = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i12 % 2 != 0) {
                    int length2 = bArr2.length;
                    aFPurchaseConnectorA1b.getPackageName = length2;
                    cArr = new char[length2];
                    int i13 = 1;
                    aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i13;
                    i7 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    i8 = aFPurchaseConnectorA1b.getPackageName;
                    if (i7 < i8) {
                        cArr[i7] = (char) (cArr4[bArr2[(i8 - 1) - i7] + i4] - i11);
                        i13 = i7 + 1;
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i13;
                        i7 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                        i8 = aFPurchaseConnectorA1b.getPackageName;
                        if (i7 < i8) {
                            String str3 = new String(cArr);
                            int i14 = $11 + 43;
                            $10 = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                            objArr[0] = str3;
                        }
                    }
                } else {
                    int length3 = bArr2.length;
                    aFPurchaseConnectorA1b.getPackageName = length3;
                    cArr = new char[length3];
                    aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                    i7 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    i8 = aFPurchaseConnectorA1b.getPackageName;
                    if (i7 < i8) {
                    }
                }
            } else if (getOneTimePurchaseOfferDetails) {
                int length4 = cArr3.length;
                aFPurchaseConnectorA1b.getPackageName = length4;
                char[] cArr6 = new char[length4];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i15 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i16 = aFPurchaseConnectorA1b.getPackageName;
                    if (i15 >= i16) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        $11 = ($10 + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        cArr6[i15] = (char) (cArr4[cArr3[(i16 - 1) - i15] - i4] - i11);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i15 + 1;
                    }
                }
            } else {
                int length5 = iArr.length;
                aFPurchaseConnectorA1b.getPackageName = length5;
                char[] cArr7 = new char[length5];
                while (true) {
                    aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                    while (true) {
                        i5 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                        i6 = aFPurchaseConnectorA1b.getPackageName;
                        if (i5 >= i6) {
                            objArr[0] = new String(cArr7);
                            return;
                        }
                        int i17 = $11 + 75;
                        $10 = i17 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i17 % 2 != 0) {
                            break;
                        }
                        cArr7[i5] = (char) (cArr4[iArr[(i6 - 1) - i5] - i4] - i11);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i5 + 1;
                    }
                    cArr7[i5] = (char) (cArr4[iArr[(i6 >>> 1) >> i5] - i4] - i11);
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionItemPriceChangeDetails fromJson(JSONObject jSONObject) {
            hashCode = (getQuantity + InterfaceC1490j3.d.b.f16817i) % UserVerificationMethods.USER_VERIFY_PATTERN;
            SubscriptionItemPriceChangeDetails fromJson = fromJson(jSONObject);
            hashCode = (getQuantity + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final SubscriptionItemPriceChangeDetails fromJson(JSONObject jSONObject) {
            Money money;
            getQuantity = (hashCode + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(null, null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0081\u0091\u008b\u0090\u0081\u008f\u008a\u008e\u008d\u008c\u0081\u0084\u008b\u008a\u0089\u0088\u0081\u0087\u0086\u0081\u0085\u0084\u0081\u0083\u0082\u0081", objArr);
            String optString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            a(null, null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "\u0081\u0084\u008b\u008a\u0089\u0088\u0081\u0092", objArr2);
            JSONObject optJSONObject = jSONObject.optJSONObject(((String) objArr2[0]).intern());
            if (optJSONObject != null) {
                hashCode = (getQuantity + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "");
                money = Money.Companion.fromJson(optJSONObject);
            } else {
                getQuantity = (hashCode + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
                money = null;
            }
            Object[] objArr3 = new Object[1];
            a(null, null, 127 - View.MeasureSpec.getMode(0), "\u0081\u0086\u0094\u0093\u0081\u008f\u0092\u008e\u008d\u008c\u0081\u0084\u008b\u008a\u0083", objArr3);
            String optString2 = jSONObject.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Object[] objArr4 = new Object[1];
            a(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0081\u0085\u008e\u0085\u0095\u0081\u008f\u0092\u008e\u008d\u008c\u0081\u0084\u008b\u008a\u0083", objArr4);
            String optString3 = jSONObject.optString(((String) objArr4[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            return new SubscriptionItemPriceChangeDetails(optString, money, optString2, optString3);
        }
    }

    public SubscriptionItemPriceChangeDetails(String str, Money money, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.expectedNewPriceChargeTime = str;
        this.newPrice = money;
        this.priceChangeMode = str2;
        this.priceChangeState = str3;
    }

    public static /* synthetic */ SubscriptionItemPriceChangeDetails copy$default(SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails, String str, Money money, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = subscriptionItemPriceChangeDetails.expectedNewPriceChargeTime;
        }
        if ((i4 & 2) != 0) {
            money = subscriptionItemPriceChangeDetails.newPrice;
        }
        if ((i4 & 4) != 0) {
            str2 = subscriptionItemPriceChangeDetails.priceChangeMode;
        }
        if ((i4 & 8) != 0) {
            str3 = subscriptionItemPriceChangeDetails.priceChangeState;
        }
        return subscriptionItemPriceChangeDetails.copy(str, money, str2, str3);
    }

    public final String component1() {
        return this.expectedNewPriceChargeTime;
    }

    public final Money component2() {
        return this.newPrice;
    }

    public final String component3() {
        return this.priceChangeMode;
    }

    public final String component4() {
        return this.priceChangeState;
    }

    public final SubscriptionItemPriceChangeDetails copy(String str, Money money, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SubscriptionItemPriceChangeDetails(str, money, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionItemPriceChangeDetails)) {
            return false;
        }
        SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails = (SubscriptionItemPriceChangeDetails) obj;
        return Intrinsics.areEqual(this.expectedNewPriceChargeTime, subscriptionItemPriceChangeDetails.expectedNewPriceChargeTime) && Intrinsics.areEqual(this.newPrice, subscriptionItemPriceChangeDetails.newPrice) && Intrinsics.areEqual(this.priceChangeMode, subscriptionItemPriceChangeDetails.priceChangeMode) && Intrinsics.areEqual(this.priceChangeState, subscriptionItemPriceChangeDetails.priceChangeState);
    }

    public final String getExpectedNewPriceChargeTime() {
        return this.expectedNewPriceChargeTime;
    }

    public final Money getNewPrice() {
        return this.newPrice;
    }

    public final String getPriceChangeMode() {
        return this.priceChangeMode;
    }

    public final String getPriceChangeState() {
        return this.priceChangeState;
    }

    public final int hashCode() {
        int hashCode = this.expectedNewPriceChargeTime.hashCode() * 31;
        Money money = this.newPrice;
        return ((((hashCode + (money == null ? 0 : money.hashCode())) * 31) + this.priceChangeMode.hashCode()) * 31) + this.priceChangeState.hashCode();
    }

    public final String toString() {
        return "SubscriptionItemPriceChangeDetails(expectedNewPriceChargeTime=" + this.expectedNewPriceChargeTime + ", newPrice=" + this.newPrice + ", priceChangeMode=" + this.priceChangeMode + ", priceChangeState=" + this.priceChangeState + ")";
    }
}
