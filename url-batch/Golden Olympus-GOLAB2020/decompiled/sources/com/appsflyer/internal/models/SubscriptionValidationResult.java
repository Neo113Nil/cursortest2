package com.appsflyer.internal.models;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g;
import com.appsflyer.internal.models.SubscriptionPurchase;
import com.appsflyer.internal.models.ValidationFailureData;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class SubscriptionValidationResult {
    public static final Companion Companion = new Companion(null);
    private final ValidationFailureData failureData;
    private final SubscriptionPurchase subscriptionPurchase;
    private final boolean success;

    @Metadata
    public static final class Companion implements Deserialize<SubscriptionValidationResult> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1;
        private static long getPackageName = -9203480607422290978L;
        private static int getQuantity;

        private Companion() {
        }

        private static void a(String str, int i4, Object[] objArr) {
            char[] cArr = str;
            if (str != null) {
                $11 = ($10 + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1g aFPurchaseConnectorA1g = new AFPurchaseConnectorA1g();
            aFPurchaseConnectorA1g.getPackageName = i4;
            int length = cArr2.length;
            long[] jArr = new long[length];
            aFPurchaseConnectorA1g.InAppPurchaseEvent = 0;
            while (true) {
                int i5 = aFPurchaseConnectorA1g.InAppPurchaseEvent;
                if (i5 >= cArr2.length) {
                    break;
                }
                int i6 = $10 + 65;
                $11 = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i6 % 2 == 0) {
                    jArr[i5] = (getPackageName & 5319290379872349608L) ^ (cArr2[i5] + (i5 * aFPurchaseConnectorA1g.getPackageName));
                } else {
                    jArr[i5] = (getPackageName ^ 5319290379872349608L) ^ (cArr2[i5] ^ (i5 * aFPurchaseConnectorA1g.getPackageName));
                    i5++;
                }
                aFPurchaseConnectorA1g.InAppPurchaseEvent = i5;
            }
            char[] cArr3 = new char[length];
            aFPurchaseConnectorA1g.InAppPurchaseEvent = 0;
            while (true) {
                int i7 = aFPurchaseConnectorA1g.InAppPurchaseEvent;
                if (i7 >= cArr2.length) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                int i8 = $10;
                $11 = (i8 + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
                cArr3[i7] = (char) jArr[i7];
                aFPurchaseConnectorA1g.InAppPurchaseEvent = i7 + 1;
                $11 = (i8 + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ SubscriptionValidationResult fromJson(JSONObject jSONObject) {
            getQuantity = (InAppPurchaseEvent + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
            SubscriptionValidationResult fromJson = fromJson(jSONObject);
            int i4 = getQuantity + 119;
            InAppPurchaseEvent = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                return fromJson;
            }
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final SubscriptionValidationResult fromJson(JSONObject jSONObject) {
            SubscriptionPurchase subscriptionPurchase;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("丄\ued12ࠇ꜀숞愇", TextUtils.indexOf((CharSequence) "", '0') + 41730, objArr);
            boolean optBoolean = jSONObject.optBoolean(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a("丅촘䠢읔䉹솃岽\udbbb囚헬儗\uec31歭\ue659敹\ue091羥𥉉秱\uf504瀏", 33563 - Drawable.resolveOpacity(0, 0), objArr2);
            boolean has = jSONObject.has(((String) objArr2[0]).intern());
            ValidationFailureData validationFailureData = null;
            if (has) {
                SubscriptionPurchase.Companion companion = SubscriptionPurchase.Companion;
                Object[] objArr3 = new Object[1];
                a("丅촘䠢읔䉹솃岽\udbbb囚헬儗\uec31歭\ue659敹\ue091羥𥉉秱\uf504瀏", 33563 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                JSONObject jSONObject2 = jSONObject.getJSONObject(((String) objArr3[0]).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                subscriptionPurchase = companion.fromJson(jSONObject2);
            } else {
                subscriptionPurchase = null;
            }
            Object[] objArr4 = new Object[1];
            a("丐톴煙郳わ倫\uf3c1\u135c댊튬牜鈖", TextUtils.lastIndexOf("", '0', 0, 0) + 40868, objArr4);
            if (jSONObject.has(((String) objArr4[0]).intern())) {
                ValidationFailureData.Companion companion2 = ValidationFailureData.Companion;
                Object[] objArr5 = new Object[1];
                a("丐톴煙郳わ倫\uf3c1\u135c댊튬牜鈖", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40867, objArr5);
                JSONObject jSONObject3 = jSONObject.getJSONObject(((String) objArr5[0]).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
                validationFailureData = companion2.fromJson(jSONObject3);
            } else {
                getQuantity = (InAppPurchaseEvent + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            SubscriptionValidationResult subscriptionValidationResult = new SubscriptionValidationResult(optBoolean, subscriptionPurchase, validationFailureData);
            int i4 = InAppPurchaseEvent + 69;
            getQuantity = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
            }
            return subscriptionValidationResult;
        }
    }

    public SubscriptionValidationResult(boolean z4, SubscriptionPurchase subscriptionPurchase, ValidationFailureData validationFailureData) {
        this.success = z4;
        this.subscriptionPurchase = subscriptionPurchase;
        this.failureData = validationFailureData;
    }

    public static /* synthetic */ SubscriptionValidationResult copy$default(SubscriptionValidationResult subscriptionValidationResult, boolean z4, SubscriptionPurchase subscriptionPurchase, ValidationFailureData validationFailureData, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = subscriptionValidationResult.success;
        }
        if ((i4 & 2) != 0) {
            subscriptionPurchase = subscriptionValidationResult.subscriptionPurchase;
        }
        if ((i4 & 4) != 0) {
            validationFailureData = subscriptionValidationResult.failureData;
        }
        return subscriptionValidationResult.copy(z4, subscriptionPurchase, validationFailureData);
    }

    public static SubscriptionValidationResult fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final boolean component1() {
        return this.success;
    }

    public final SubscriptionPurchase component2() {
        return this.subscriptionPurchase;
    }

    public final ValidationFailureData component3() {
        return this.failureData;
    }

    public final SubscriptionValidationResult copy(boolean z4, SubscriptionPurchase subscriptionPurchase, ValidationFailureData validationFailureData) {
        return new SubscriptionValidationResult(z4, subscriptionPurchase, validationFailureData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionValidationResult)) {
            return false;
        }
        SubscriptionValidationResult subscriptionValidationResult = (SubscriptionValidationResult) obj;
        return this.success == subscriptionValidationResult.success && Intrinsics.areEqual(this.subscriptionPurchase, subscriptionValidationResult.subscriptionPurchase) && Intrinsics.areEqual(this.failureData, subscriptionValidationResult.failureData);
    }

    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    public final SubscriptionPurchase getSubscriptionPurchase() {
        return this.subscriptionPurchase;
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
        SubscriptionPurchase subscriptionPurchase = this.subscriptionPurchase;
        int hashCode = (i4 + (subscriptionPurchase == null ? 0 : subscriptionPurchase.hashCode())) * 31;
        ValidationFailureData validationFailureData = this.failureData;
        return hashCode + (validationFailureData != null ? validationFailureData.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionValidationResult(success=" + this.success + ", subscriptionPurchase=" + this.subscriptionPurchase + ", failureData=" + this.failureData + ")";
    }
}
