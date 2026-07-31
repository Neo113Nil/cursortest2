package com.appsflyer.internal.models;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class CancelSurveyResult {
    public static final Companion Companion = new Companion(null);
    private final String reason;
    private final String reasonUserInput;

    @Metadata
    public static final class Companion implements Deserialize<CancelSurveyResult> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getQuantity = 1;
        private static int toJsonMap;
        private static char[] getPackageName = {50311, 50336, 50308, 50310, 50333, 50331, 50364, 50315, 50330, 50309, 50332, 50313, 50329, 50314, 50312, 50316};
        private static char InAppPurchaseEvent = 61815;

        private Companion() {
        }

        private static void a(byte b4, int i4, String str, Object[] objArr) {
            int i5;
            int i6 = $11;
            $10 = (i6 + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
            char[] cArr = str;
            if (str != null) {
                $10 = (i6 + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1k aFPurchaseConnectorA1k = new AFPurchaseConnectorA1k();
            char[] cArr3 = getPackageName;
            if (cArr3 != null) {
                $11 = ($10 + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = $10 + 41;
                    $11 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i8 % 2 == 0) {
                        cArr4[i7] = (char) (cArr3[i7] ^ (-8783246495946182285L));
                    } else {
                        cArr4[i7] = (char) (cArr3[i7] ^ (-8783246495946182285L));
                    }
                }
                cArr3 = cArr4;
            }
            char c4 = (char) ((-8783246495946182285L) ^ InAppPurchaseEvent);
            char[] cArr5 = new char[i4];
            if (i4 % 2 != 0) {
                i5 = i4 - 1;
                cArr5[i5] = (char) (cArr2[i5] - b4);
            } else {
                i5 = i4;
            }
            if (i5 > 1) {
                $10 = ($11 + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
                aFPurchaseConnectorA1k.getQuantity = 0;
                while (true) {
                    int i9 = aFPurchaseConnectorA1k.getQuantity;
                    if (i9 >= i5) {
                        break;
                    }
                    char c5 = cArr2[i9];
                    aFPurchaseConnectorA1k.getPackageName = c5;
                    char c6 = cArr2[i9 + 1];
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = c6;
                    if (c5 == c6) {
                        cArr5[i9] = (char) (c5 - b4);
                        cArr5[i9 + 1] = (char) (c6 - b4);
                    } else {
                        int i10 = c5 / c4;
                        aFPurchaseConnectorA1k.InAppPurchaseEvent = i10;
                        int i11 = c5 % c4;
                        aFPurchaseConnectorA1k.hashCode = i11;
                        int i12 = c6 / c4;
                        aFPurchaseConnectorA1k.toJsonMap = i12;
                        int i13 = c6 % c4;
                        aFPurchaseConnectorA1k.stopObservingTransactions = i13;
                        if (i11 == i13) {
                            int i14 = ((i10 + c4) - 1) % c4;
                            aFPurchaseConnectorA1k.InAppPurchaseEvent = i14;
                            int i15 = ((i12 + c4) - 1) % c4;
                            aFPurchaseConnectorA1k.toJsonMap = i15;
                            cArr5[i9] = cArr3[(i14 * c4) + i11];
                            cArr5[i9 + 1] = cArr3[(i15 * c4) + i13];
                        } else if (i10 == i12) {
                            int i16 = ((i11 + c4) - 1) % c4;
                            aFPurchaseConnectorA1k.hashCode = i16;
                            int i17 = ((i13 + c4) - 1) % c4;
                            aFPurchaseConnectorA1k.stopObservingTransactions = i17;
                            cArr5[i9] = cArr3[(i10 * c4) + i16];
                            cArr5[i9 + 1] = cArr3[(i12 * c4) + i17];
                        } else {
                            cArr5[i9] = cArr3[(i10 * c4) + i13];
                            cArr5[i9 + 1] = cArr3[(i12 * c4) + i11];
                        }
                    }
                    aFPurchaseConnectorA1k.getQuantity = i9 + 2;
                }
            }
            for (int i18 = 0; i18 < i4; i18++) {
                cArr5[i18] = (char) (cArr5[i18] ^ 13722);
            }
            objArr[0] = new String(cArr5);
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ CancelSurveyResult fromJson(JSONObject jSONObject) {
            int i4 = toJsonMap + 123;
            getQuantity = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
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
        public final CancelSurveyResult fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a((byte) (93 - View.resolveSize(0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, "\u0007\r\f\n\u0000\u0001", objArr);
            String optString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            a((byte) (75 - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0') + 16, "\u0007\r\f\n\u0000\u0001\u0004\n\r\u0007\u0002\u0001\u000e\b㘺", objArr2);
            String optString2 = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            CancelSurveyResult cancelSurveyResult = new CancelSurveyResult(optString, optString2);
            int i4 = toJsonMap + 23;
            getQuantity = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                return cancelSurveyResult;
            }
            throw null;
        }
    }

    public CancelSurveyResult(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.reason = str;
        this.reasonUserInput = str2;
    }

    public static /* synthetic */ CancelSurveyResult copy$default(CancelSurveyResult cancelSurveyResult, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cancelSurveyResult.reason;
        }
        if ((i4 & 2) != 0) {
            str2 = cancelSurveyResult.reasonUserInput;
        }
        return cancelSurveyResult.copy(str, str2);
    }

    public final String component1() {
        return this.reason;
    }

    public final String component2() {
        return this.reasonUserInput;
    }

    public final CancelSurveyResult copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CancelSurveyResult(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelSurveyResult)) {
            return false;
        }
        CancelSurveyResult cancelSurveyResult = (CancelSurveyResult) obj;
        return Intrinsics.areEqual(this.reason, cancelSurveyResult.reason) && Intrinsics.areEqual(this.reasonUserInput, cancelSurveyResult.reasonUserInput);
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonUserInput() {
        return this.reasonUserInput;
    }

    public final int hashCode() {
        return (this.reason.hashCode() * 31) + this.reasonUserInput.hashCode();
    }

    public final String toString() {
        return "CancelSurveyResult(reason=" + this.reason + ", reasonUserInput=" + this.reasonUserInput + ")";
    }
}
