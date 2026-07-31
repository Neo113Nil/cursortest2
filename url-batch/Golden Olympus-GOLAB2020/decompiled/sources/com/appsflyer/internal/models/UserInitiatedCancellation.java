package com.appsflyer.internal.models;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1i;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class UserInitiatedCancellation {
    public static final Companion Companion = new Companion(null);
    private final CancelSurveyResult cancelSurveyResult;
    private final String cancelTime;

    @Metadata
    public static final class Companion implements Deserialize<UserInitiatedCancellation> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1;
        private static long getOneTimePurchaseOfferDetails = 409721173320367058L;
        private static int getPackageName = 0;
        private static int getQuantity = -2135458862;
        private static char toJsonMap = 40031;

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void a(String str, String str2, int i4, char c4, String str3, Object[] objArr) {
            $10 = ($11 + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
            char[] charArray = str3 != 0 ? str3.toCharArray() : str3;
            char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
            char[] cArr = str;
            if (str != null) {
                char[] charArray3 = str.toCharArray();
                $11 = ($10 + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
                cArr = charArray3;
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1i aFPurchaseConnectorA1i = new AFPurchaseConnectorA1i();
            int length = charArray2.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            System.arraycopy(charArray2, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c4);
            cArr4[2] = (char) (cArr4[2] + ((char) i4));
            int length3 = charArray.length;
            char[] cArr5 = new char[length3];
            aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = 0;
            while (true) {
                int i5 = aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails;
                if (i5 >= length3) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                $10 = ($11 + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int i6 = (i5 + 3) % 4;
                int i7 = cArr3[i5 % 4] * 32718;
                char c5 = cArr4[(i5 + 2) % 4];
                char c6 = (char) ((i7 + c5) % 65535);
                aFPurchaseConnectorA1i.InAppPurchaseEvent = c6;
                cArr4[i6] = (char) (((cArr3[i6] * 32718) + c5) / 65535);
                cArr3[i6] = c6;
                cArr5[i5] = (char) ((((charArray[i5] ^ c6) ^ (getOneTimePurchaseOfferDetails ^ 409721173320367058L)) ^ ((int) (getQuantity ^ 409721173320367058L))) ^ ((char) (toJsonMap ^ 409721173320367058L)));
                aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = i5 + 1;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ UserInitiatedCancellation fromJson(JSONObject jSONObject) {
            int i4 = getPackageName + 99;
            InAppPurchaseEvent = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                return fromJson(jSONObject);
            }
            fromJson(jSONObject);
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final UserInitiatedCancellation fromJson(JSONObject jSONObject) {
            Object object;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("\u0000\u0000\u0000\u0000", "㐞ᩔ叨즪", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43603), "Гꪇ\uf27f遣噋ꏅ漕홚\ue953芯滀觲未昔ன㋸\uf37b\uea98", objArr);
            object = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr[0]).intern(), CancelSurveyResult.Companion);
            Object[] objArr2 = new Object[1];
            a("\u0000\u0000\u0000\u0000", "瀋뚃텣ꢺ", ViewConfiguration.getPressedStateDuration() >> 16, (char) Color.blue(0), "㈧渨\udcc0捹⋠鲊욢\ue3b0̈軧", objArr2);
            String optString = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            UserInitiatedCancellation userInitiatedCancellation = new UserInitiatedCancellation((CancelSurveyResult) object, optString);
            getPackageName = (InAppPurchaseEvent + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return userInitiatedCancellation;
        }
    }

    public UserInitiatedCancellation(CancelSurveyResult cancelSurveyResult, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelSurveyResult = cancelSurveyResult;
        this.cancelTime = str;
    }

    public static /* synthetic */ UserInitiatedCancellation copy$default(UserInitiatedCancellation userInitiatedCancellation, CancelSurveyResult cancelSurveyResult, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancelSurveyResult = userInitiatedCancellation.cancelSurveyResult;
        }
        if ((i4 & 2) != 0) {
            str = userInitiatedCancellation.cancelTime;
        }
        return userInitiatedCancellation.copy(cancelSurveyResult, str);
    }

    public final CancelSurveyResult component1() {
        return this.cancelSurveyResult;
    }

    public final String component2() {
        return this.cancelTime;
    }

    public final UserInitiatedCancellation copy(CancelSurveyResult cancelSurveyResult, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UserInitiatedCancellation(cancelSurveyResult, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInitiatedCancellation)) {
            return false;
        }
        UserInitiatedCancellation userInitiatedCancellation = (UserInitiatedCancellation) obj;
        return Intrinsics.areEqual(this.cancelSurveyResult, userInitiatedCancellation.cancelSurveyResult) && Intrinsics.areEqual(this.cancelTime, userInitiatedCancellation.cancelTime);
    }

    public final CancelSurveyResult getCancelSurveyResult() {
        return this.cancelSurveyResult;
    }

    public final String getCancelTime() {
        return this.cancelTime;
    }

    public final int hashCode() {
        CancelSurveyResult cancelSurveyResult = this.cancelSurveyResult;
        return ((cancelSurveyResult == null ? 0 : cancelSurveyResult.hashCode()) * 31) + this.cancelTime.hashCode();
    }

    public final String toString() {
        return "UserInitiatedCancellation(cancelSurveyResult=" + this.cancelSurveyResult + ", cancelTime=" + this.cancelTime + ")";
    }
}
