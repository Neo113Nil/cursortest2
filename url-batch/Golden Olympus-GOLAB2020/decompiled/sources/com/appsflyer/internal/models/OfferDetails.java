package com.appsflyer.internal.models;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class OfferDetails {
    public static final Companion Companion = new Companion(null);
    private final String basePlanId;
    private final String offerId;
    private final List<String> offerTags;

    @Metadata
    public static final class Companion implements Deserialize<OfferDetails> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char InAppPurchaseEvent = 35330;
        private static int equals = 1;
        private static char getOneTimePurchaseOfferDetails = 2122;
        private static char getPackageName = 50124;
        private static int getQuantity = 0;
        private static char toJsonMap = 5133;

        private Companion() {
        }

        private static void a(String str, int i4, Object[] objArr) {
            char[] cArr;
            if (str != null) {
                int i5 = $10 + 89;
                $11 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i5 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1f aFPurchaseConnectorA1f = new AFPurchaseConnectorA1f();
            char[] cArr3 = new char[cArr2.length];
            aFPurchaseConnectorA1f.getQuantity = 0;
            char[] cArr4 = new char[2];
            $11 = ($10 + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
            while (true) {
                int i6 = aFPurchaseConnectorA1f.getQuantity;
                if (i6 >= cArr2.length) {
                    objArr[0] = new String(cArr3, 0, i4);
                    return;
                }
                int i7 = $11 + 123;
                $10 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i7 % 2 != 0) {
                    cArr4[1] = cArr2[i6];
                    cArr4[1] = cArr2[i6 << 1];
                } else {
                    cArr4[0] = cArr2[i6];
                    cArr4[1] = cArr2[i6 + 1];
                }
                int i8 = 58224;
                for (int i9 = 0; i9 < 16; i9++) {
                    $11 = ($10 + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    char c4 = cArr4[1];
                    char c5 = cArr4[0];
                    char c6 = (char) (c4 - (((c5 + i8) ^ ((c5 << 4) + ((char) (getOneTimePurchaseOfferDetails ^ (-177179452616573881L))))) ^ ((c5 >>> 5) + ((char) (getPackageName ^ (-177179452616573881L))))));
                    cArr4[1] = c6;
                    cArr4[0] = (char) (c5 - (((c6 >>> 5) + ((char) (toJsonMap ^ (-177179452616573881L)))) ^ ((c6 + i8) ^ ((c6 << 4) + ((char) (InAppPurchaseEvent ^ (-177179452616573881L)))))));
                    i8 -= 40503;
                }
                int i10 = aFPurchaseConnectorA1f.getQuantity;
                cArr3[i10] = cArr4[0];
                cArr3[i10 + 1] = cArr4[1];
                aFPurchaseConnectorA1f.getQuantity = i10 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ OfferDetails fromJson(JSONObject jSONObject) {
            equals = (getQuantity + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
            OfferDetails fromJson = fromJson(jSONObject);
            int i4 = equals + 35;
            getQuantity = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                int i5 = 43 / 0;
            }
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final OfferDetails fromJson(JSONObject jSONObject) {
            List list;
            Object nullable;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("㯾쇟抩曭蔀ﾶ䒽襁䗝儙", 9 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            JSONArray optJSONArray = jSONObject.optJSONArray(((String) objArr[0]).intern());
            if (optJSONArray != null) {
                Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                list = SubscriptionPurchaseKt.toList(optJSONArray);
            } else {
                list = null;
            }
            Object[] objArr2 = new Object[1];
            a("ﻷ蛅ⷔ憈ꇛ仁㳠ø惹\ud837", 10 - TextUtils.indexOf("", "", 0), objArr2);
            String optString = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr3 = new Object[1];
            a("㯾쇟抩曭\u193f\u20f3Ḝ⤩", 7 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
            nullable = SubscriptionPurchaseKt.getNullable(jSONObject, ((String) objArr3[0]).intern());
            return new OfferDetails(list, optString, (String) nullable);
        }
    }

    public OfferDetails(List<String> list, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.offerTags = list;
        this.basePlanId = str;
        this.offerId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferDetails copy$default(OfferDetails offerDetails, List list, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = offerDetails.offerTags;
        }
        if ((i4 & 2) != 0) {
            str = offerDetails.basePlanId;
        }
        if ((i4 & 4) != 0) {
            str2 = offerDetails.offerId;
        }
        return offerDetails.copy(list, str, str2);
    }

    public final List<String> component1() {
        return this.offerTags;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final String component3() {
        return this.offerId;
    }

    public final OfferDetails copy(List<String> list, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OfferDetails(list, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetails)) {
            return false;
        }
        OfferDetails offerDetails = (OfferDetails) obj;
        return Intrinsics.areEqual(this.offerTags, offerDetails.offerTags) && Intrinsics.areEqual(this.basePlanId, offerDetails.basePlanId) && Intrinsics.areEqual(this.offerId, offerDetails.offerId);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final List<String> getOfferTags() {
        return this.offerTags;
    }

    public final int hashCode() {
        List<String> list = this.offerTags;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OfferDetails(offerTags=" + this.offerTags + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ")";
    }
}
