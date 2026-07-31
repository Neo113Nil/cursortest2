package com.appsflyer.internal.models;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2w;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class SubscriptionPurchaseLineItem {
    public static final Companion Companion = new Companion(null);
    private final AutoRenewingPlan autoRenewingPlan;
    private final DeferredItemReplacement deferredItemReplacement;
    private final String expiryTime;
    private final OfferDetails offerDetails;
    private final PrepaidPlan prepaidPlan;
    private final String productId;

    @Metadata
    public static final class Companion implements Deserialize<SubscriptionPurchaseLineItem> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int getPackageName = -861462659;
        private static int getQuantity;

        private Companion() {
        }

        private static void a(boolean z4, int i4, int i5, int i6, String str, Object[] objArr) {
            $11 = ($10 + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA2w aFPurchaseConnectorA2w = new AFPurchaseConnectorA2w();
            char[] cArr3 = new char[i6];
            aFPurchaseConnectorA2w.toJsonMap = 0;
            while (true) {
                int i7 = aFPurchaseConnectorA2w.toJsonMap;
                if (i7 >= i6) {
                    break;
                }
                char c4 = cArr2[i7];
                aFPurchaseConnectorA2w.getOneTimePurchaseOfferDetails = c4;
                char c5 = (char) (c4 + i4);
                cArr3[i7] = c5;
                cArr3[i7] = (char) (c5 - ((int) (getPackageName ^ (-2543415058719367236L))));
                aFPurchaseConnectorA2w.toJsonMap = i7 + 1;
            }
            if (i5 > 0) {
                aFPurchaseConnectorA2w.InAppPurchaseEvent = i5;
                char[] cArr4 = new char[i6];
                System.arraycopy(cArr3, 0, cArr4, 0, i6);
                int i8 = aFPurchaseConnectorA2w.InAppPurchaseEvent;
                System.arraycopy(cArr4, 0, cArr3, i6 - i8, i8);
                int i9 = aFPurchaseConnectorA2w.InAppPurchaseEvent;
                System.arraycopy(cArr4, i9, cArr3, 0, i6 - i9);
            }
            if (z4) {
                char[] cArr5 = new char[i6];
                aFPurchaseConnectorA2w.toJsonMap = 0;
                $11 = ($10 + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
                while (true) {
                    int i10 = aFPurchaseConnectorA2w.toJsonMap;
                    if (i10 >= i6) {
                        break;
                    }
                    cArr5[i10] = cArr3[(i6 - i10) - 1];
                    aFPurchaseConnectorA2w.toJsonMap = i10 + 1;
                }
                cArr3 = cArr5;
            }
            objArr[0] = new String(cArr3);
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionPurchaseLineItem fromJson(JSONObject jSONObject) {
            int i4 = getQuantity + 73;
            getOneTimePurchaseOfferDetails = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i5 = i4 % 2;
            SubscriptionPurchaseLineItem fromJson = fromJson(jSONObject);
            if (i5 == 0) {
                int i6 = 84 / 0;
            }
            int i7 = getQuantity + 55;
            getOneTimePurchaseOfferDetails = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i7 % 2 == 0) {
                int i8 = 32 / 0;
            }
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final SubscriptionPurchaseLineItem fromJson(JSONObject jSONObject) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 297, 12 - KeyEvent.keyCodeFromString(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, "￪�\u0006�\u000f\u0001\u0006\uffff￨\u0004\ufff9\u0006\ufff9\r\f\u0007", objArr);
            object = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr[0]).intern(), AutoRenewingPlan.Companion);
            Object[] objArr2 = new Object[1];
            a(false, 295 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7, View.resolveSize(0, 0) + 23, "\ufffb�\uffff\u0007\uffff\b\u000e\ufffe\uffff\u0000\uffff\f\f\uffff\ufffe￣\u000e\uffff\u0007￬\uffff\n\u0006", objArr2);
            object2 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr2[0]).intern(), DeferredItemReplacement.Companion);
            Object[] objArr3 = new Object[1];
            a(false, 300 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0005\ufffe\u0007\u000e￩\ufffe\u0002\ufffa\ufffa\r", objArr3);
            String optString = jSONObject.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr4 = new Object[1];
            a(false, (ViewConfiguration.getTouchSlop() >> 8) + 296, 2 - ExpandableListView.getPackedPositionType(0L), 12 - Color.red(0), "\u0005\f\b\uffff\uffff\ufffe\u000b\uffdd\ufffe\r\ufffa\u0002", objArr4);
            object3 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr4[0]).intern(), OfferDetails.Companion);
            Object[] objArr5 = new Object[1];
            a(true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 296, AndroidCharacter.getMirror('0') - '(', (Process.myTid() >> 22) + 11, "￩�\u0002\ufffa\t\ufffe\u000b\t\u0007\ufffa\u0005", objArr5);
            object4 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr5[0]).intern(), PrepaidPlan.Companion);
            Object[] objArr6 = new Object[1];
            a(true, (ViewConfiguration.getScrollBarSize() >> 8) + 297, TextUtils.lastIndexOf("", '0') + 3, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, "\n\b￼￡\f\ufffb\r￼\u0007", objArr6);
            String optString2 = jSONObject.optString(((String) objArr6[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = new SubscriptionPurchaseLineItem((AutoRenewingPlan) object, (DeferredItemReplacement) object2, optString, (OfferDetails) object3, (PrepaidPlan) object4, optString2);
            int i4 = getOneTimePurchaseOfferDetails + 91;
            getQuantity = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return subscriptionPurchaseLineItem;
        }
    }

    public SubscriptionPurchaseLineItem(AutoRenewingPlan autoRenewingPlan, DeferredItemReplacement deferredItemReplacement, String str, OfferDetails offerDetails, PrepaidPlan prepaidPlan, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.autoRenewingPlan = autoRenewingPlan;
        this.deferredItemReplacement = deferredItemReplacement;
        this.expiryTime = str;
        this.offerDetails = offerDetails;
        this.prepaidPlan = prepaidPlan;
        this.productId = str2;
    }

    public static /* synthetic */ SubscriptionPurchaseLineItem copy$default(SubscriptionPurchaseLineItem subscriptionPurchaseLineItem, AutoRenewingPlan autoRenewingPlan, DeferredItemReplacement deferredItemReplacement, String str, OfferDetails offerDetails, PrepaidPlan prepaidPlan, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            autoRenewingPlan = subscriptionPurchaseLineItem.autoRenewingPlan;
        }
        if ((i4 & 2) != 0) {
            deferredItemReplacement = subscriptionPurchaseLineItem.deferredItemReplacement;
        }
        if ((i4 & 4) != 0) {
            str = subscriptionPurchaseLineItem.expiryTime;
        }
        if ((i4 & 8) != 0) {
            offerDetails = subscriptionPurchaseLineItem.offerDetails;
        }
        if ((i4 & 16) != 0) {
            prepaidPlan = subscriptionPurchaseLineItem.prepaidPlan;
        }
        if ((i4 & 32) != 0) {
            str2 = subscriptionPurchaseLineItem.productId;
        }
        PrepaidPlan prepaidPlan2 = prepaidPlan;
        String str3 = str2;
        return subscriptionPurchaseLineItem.copy(autoRenewingPlan, deferredItemReplacement, str, offerDetails, prepaidPlan2, str3);
    }

    public final AutoRenewingPlan component1() {
        return this.autoRenewingPlan;
    }

    public final DeferredItemReplacement component2() {
        return this.deferredItemReplacement;
    }

    public final String component3() {
        return this.expiryTime;
    }

    public final OfferDetails component4() {
        return this.offerDetails;
    }

    public final PrepaidPlan component5() {
        return this.prepaidPlan;
    }

    public final String component6() {
        return this.productId;
    }

    public final SubscriptionPurchaseLineItem copy(AutoRenewingPlan autoRenewingPlan, DeferredItemReplacement deferredItemReplacement, String str, OfferDetails offerDetails, PrepaidPlan prepaidPlan, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SubscriptionPurchaseLineItem(autoRenewingPlan, deferredItemReplacement, str, offerDetails, prepaidPlan, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionPurchaseLineItem)) {
            return false;
        }
        SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = (SubscriptionPurchaseLineItem) obj;
        return Intrinsics.areEqual(this.autoRenewingPlan, subscriptionPurchaseLineItem.autoRenewingPlan) && Intrinsics.areEqual(this.deferredItemReplacement, subscriptionPurchaseLineItem.deferredItemReplacement) && Intrinsics.areEqual(this.expiryTime, subscriptionPurchaseLineItem.expiryTime) && Intrinsics.areEqual(this.offerDetails, subscriptionPurchaseLineItem.offerDetails) && Intrinsics.areEqual(this.prepaidPlan, subscriptionPurchaseLineItem.prepaidPlan) && Intrinsics.areEqual(this.productId, subscriptionPurchaseLineItem.productId);
    }

    public final AutoRenewingPlan getAutoRenewingPlan() {
        return this.autoRenewingPlan;
    }

    public final DeferredItemReplacement getDeferredItemReplacement() {
        return this.deferredItemReplacement;
    }

    public final String getExpiryTime() {
        return this.expiryTime;
    }

    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final PrepaidPlan getPrepaidPlan() {
        return this.prepaidPlan;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int hashCode() {
        AutoRenewingPlan autoRenewingPlan = this.autoRenewingPlan;
        int hashCode = (autoRenewingPlan == null ? 0 : autoRenewingPlan.hashCode()) * 31;
        DeferredItemReplacement deferredItemReplacement = this.deferredItemReplacement;
        int hashCode2 = (((hashCode + (deferredItemReplacement == null ? 0 : deferredItemReplacement.hashCode())) * 31) + this.expiryTime.hashCode()) * 31;
        OfferDetails offerDetails = this.offerDetails;
        int hashCode3 = (hashCode2 + (offerDetails == null ? 0 : offerDetails.hashCode())) * 31;
        PrepaidPlan prepaidPlan = this.prepaidPlan;
        return ((hashCode3 + (prepaidPlan != null ? prepaidPlan.hashCode() : 0)) * 31) + this.productId.hashCode();
    }

    public final String toString() {
        return "SubscriptionPurchaseLineItem(autoRenewingPlan=" + this.autoRenewingPlan + ", deferredItemReplacement=" + this.deferredItemReplacement + ", expiryTime=" + this.expiryTime + ", offerDetails=" + this.offerDetails + ", prepaidPlan=" + this.prepaidPlan + ", productId=" + this.productId + ")";
    }
}
