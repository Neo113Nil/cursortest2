package com.appsflyer.internal.models;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1b;
import com.appsflyer.internal.models.ProductPurchase;
import com.appsflyer.internal.models.ValidationFailureData;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class InAppPurchaseValidationResult {
    public static final Companion Companion = new Companion(null);
    private final ValidationFailureData failureData;
    private final ProductPurchase productPurchase;
    private final boolean success;

    @Metadata
    public static final class Companion implements Deserialize<InAppPurchaseValidationResult> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getPackageName = 0;
        private static int hashCode = 1;
        private static char[] InAppPurchaseEvent = {35046, 35061, 35047, 35045, 35052, 35044, 35048, 35051, 35060, 35063, 35067, 35056, 35065, 35058, 35057};
        private static int toJsonMap = -2120185768;
        private static boolean getQuantity = true;
        private static boolean getOneTimePurchaseOfferDetails = true;

        private Companion() {
        }

        private static void a(int[] iArr, String str, int i4, String str2, Object[] objArr) {
            int i5 = $10 + 47;
            $11 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            byte[] bArr = str2;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (str2 != null) {
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1b aFPurchaseConnectorA1b = new AFPurchaseConnectorA1b();
            char[] cArr3 = InAppPurchaseEvent;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                $10 = ($11 + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
                for (int i6 = 0; i6 < length; i6++) {
                    cArr4[i6] = (char) (cArr3[i6] ^ (-4643703481320830850L));
                }
                cArr3 = cArr4;
            }
            int i7 = (int) ((-4643703481320830850L) ^ toJsonMap);
            if (getOneTimePurchaseOfferDetails) {
                $11 = ($10 + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int length2 = bArr2.length;
                aFPurchaseConnectorA1b.getPackageName = length2;
                char[] cArr5 = new char[length2];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i8 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i9 = aFPurchaseConnectorA1b.getPackageName;
                    if (i8 >= i9) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        cArr5[i8] = (char) (cArr3[bArr2[(i9 - 1) - i8] + i4] - i7);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i8 + 1;
                    }
                }
            } else if (getQuantity) {
                int length3 = cArr2.length;
                aFPurchaseConnectorA1b.getPackageName = length3;
                char[] cArr6 = new char[length3];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i10 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i11 = aFPurchaseConnectorA1b.getPackageName;
                    if (i10 >= i11) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[i10] = (char) (cArr3[cArr2[(i11 - 1) - i10] - i4] - i7);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i10 + 1;
                    }
                }
            } else {
                int length4 = iArr.length;
                aFPurchaseConnectorA1b.getPackageName = length4;
                char[] cArr7 = new char[length4];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                $10 = ($11 + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
                while (true) {
                    int i12 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i13 = aFPurchaseConnectorA1b.getPackageName;
                    if (i12 >= i13) {
                        objArr[0] = new String(cArr7);
                        return;
                    } else {
                        cArr7[i12] = (char) (cArr3[iArr[(i13 - 1) - i12] - i4] - i7);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i12 + 1;
                    }
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ InAppPurchaseValidationResult fromJson(JSONObject jSONObject) {
            hashCode = (getPackageName + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
            InAppPurchaseValidationResult fromJson = fromJson(jSONObject);
            getPackageName = (hashCode + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final InAppPurchaseValidationResult fromJson(JSONObject jSONObject) {
            ProductPurchase productPurchase;
            ValidationFailureData.Companion companion;
            Object obj;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            ValidationFailureData validationFailureData = null;
            a(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            boolean optBoolean = jSONObject.optBoolean(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(null, null, AndroidCharacter.getMirror('0') + 'O', "\u0082\u0083\u008d\u008c\u008a\u0081\u0084\u0087\u008b\u0086\u008a\u0084\u0089\u0088\u0081\u0087", objArr2);
            if (jSONObject.has(((String) objArr2[0]).intern())) {
                ProductPurchase.Companion companion2 = ProductPurchase.Companion;
                Object[] objArr3 = new Object[1];
                a(null, null, TextUtils.indexOf((CharSequence) "", '0', 0) + UserVerificationMethods.USER_VERIFY_PATTERN, "\u0082\u0083\u008d\u008c\u008a\u0081\u0084\u0087\u008b\u0086\u008a\u0084\u0089\u0088\u0081\u0087", objArr3);
                JSONObject jSONObject2 = jSONObject.getJSONObject(((String) objArr3[0]).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                productPurchase = companion2.fromJson(jSONObject2);
            } else {
                getPackageName = (hashCode + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
                productPurchase = null;
            }
            Object[] objArr4 = new Object[1];
            a(null, null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u008d\u0086\u008d\u0089\u008b\u0082\u0081\u0084\u0085\u008f\u008d\u008e", objArr4);
            if (jSONObject.has(((String) objArr4[0]).intern())) {
                int i4 = getPackageName + 123;
                hashCode = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 == 0) {
                    companion = ValidationFailureData.Companion;
                    Object[] objArr5 = new Object[1];
                    a(null, null, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29193, "\u008d\u0086\u008d\u0089\u008b\u0082\u0081\u0084\u0085\u008f\u008d\u008e", objArr5);
                    obj = objArr5[0];
                } else {
                    companion = ValidationFailureData.Companion;
                    Object[] objArr6 = new Object[1];
                    a(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u008d\u0086\u008d\u0089\u008b\u0082\u0081\u0084\u0085\u008f\u008d\u008e", objArr6);
                    obj = objArr6[0];
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject(((String) obj).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
                validationFailureData = companion.fromJson(jSONObject3);
            }
            return new InAppPurchaseValidationResult(optBoolean, productPurchase, validationFailureData);
        }
    }

    public InAppPurchaseValidationResult(boolean z4, ProductPurchase productPurchase, ValidationFailureData validationFailureData) {
        this.success = z4;
        this.productPurchase = productPurchase;
        this.failureData = validationFailureData;
    }

    public static /* synthetic */ InAppPurchaseValidationResult copy$default(InAppPurchaseValidationResult inAppPurchaseValidationResult, boolean z4, ProductPurchase productPurchase, ValidationFailureData validationFailureData, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = inAppPurchaseValidationResult.success;
        }
        if ((i4 & 2) != 0) {
            productPurchase = inAppPurchaseValidationResult.productPurchase;
        }
        if ((i4 & 4) != 0) {
            validationFailureData = inAppPurchaseValidationResult.failureData;
        }
        return inAppPurchaseValidationResult.copy(z4, productPurchase, validationFailureData);
    }

    public static InAppPurchaseValidationResult fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final boolean component1() {
        return this.success;
    }

    public final ProductPurchase component2() {
        return this.productPurchase;
    }

    public final ValidationFailureData component3() {
        return this.failureData;
    }

    public final InAppPurchaseValidationResult copy(boolean z4, ProductPurchase productPurchase, ValidationFailureData validationFailureData) {
        return new InAppPurchaseValidationResult(z4, productPurchase, validationFailureData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppPurchaseValidationResult)) {
            return false;
        }
        InAppPurchaseValidationResult inAppPurchaseValidationResult = (InAppPurchaseValidationResult) obj;
        return this.success == inAppPurchaseValidationResult.success && Intrinsics.areEqual(this.productPurchase, inAppPurchaseValidationResult.productPurchase) && Intrinsics.areEqual(this.failureData, inAppPurchaseValidationResult.failureData);
    }

    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    public final ProductPurchase getProductPurchase() {
        return this.productPurchase;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z4 = this.success;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        ProductPurchase productPurchase = this.productPurchase;
        int hashCode = (i4 + (productPurchase == null ? 0 : productPurchase.hashCode())) * 31;
        ValidationFailureData validationFailureData = this.failureData;
        return hashCode + (validationFailureData != null ? validationFailureData.hashCode() : 0);
    }

    public final String toString() {
        return "InAppPurchaseValidationResult(success=" + this.success + ", productPurchase=" + this.productPurchase + ", failureData=" + this.failureData + ")";
    }
}
