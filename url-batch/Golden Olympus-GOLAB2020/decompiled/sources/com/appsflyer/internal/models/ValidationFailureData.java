package com.appsflyer.internal.models;

import android.graphics.PointF;
import android.text.TextUtils;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class ValidationFailureData {
    public static final Companion Companion = new Companion(null);
    private final String description;
    private final int status;

    @Metadata
    public static final class Companion implements Deserialize<ValidationFailureData> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] InAppPurchaseEvent = {987131286, -795503016, 1085795907, -394671689, 407361632, 940651397, -1374684004, -1080083704, -719311440, -958781164, 964790139, -1556834772, -1651995693, 1790979398, -1614282934, -369245761, -1675628797, 573531954};
        private static int getPackageName = 0;
        private static int toJsonMap = 1;

        private Companion() {
        }

        private static void a(int[] iArr, int i4, Object[] objArr) {
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = InAppPurchaseEvent;
            if (iArr2 != null) {
                int i5 = $11;
                $10 = (i5 + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                $10 = (i5 + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
                for (int i6 = 0; i6 < length; i6++) {
                    iArr3[i6] = (int) (iArr2[i6] ^ (-6033101233399176549L));
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = InAppPurchaseEvent;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i7 = 0; i7 < length3; i7++) {
                    iArr6[i7] = (int) (iArr5[i7] ^ (-6033101233399176549L));
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            aFPurchaseConnectorA1c.InAppPurchaseEvent = 0;
            while (true) {
                int i8 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                if (i8 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i4);
                    return;
                }
                int i9 = iArr[i8];
                char c4 = (char) (i9 >> 16);
                cArr[0] = c4;
                char c5 = (char) i9;
                cArr[1] = c5;
                char c6 = (char) (iArr[i8 + 1] >> 16);
                cArr[2] = c6;
                char c7 = (char) iArr[i8 + 1];
                cArr[3] = c7;
                aFPurchaseConnectorA1c.getQuantity = (c4 << 16) + c5;
                aFPurchaseConnectorA1c.toJsonMap = (c6 << 16) + c7;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                $11 = ($10 + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
                for (int i10 = 0; i10 < 16; i10++) {
                    $10 = ($11 + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    int i11 = aFPurchaseConnectorA1c.getQuantity ^ iArr4[i10];
                    aFPurchaseConnectorA1c.getQuantity = i11;
                    int quantity = AFPurchaseConnectorA1c.getQuantity(i11) ^ aFPurchaseConnectorA1c.toJsonMap;
                    int i12 = aFPurchaseConnectorA1c.getQuantity;
                    aFPurchaseConnectorA1c.getQuantity = quantity;
                    aFPurchaseConnectorA1c.toJsonMap = i12;
                }
                int i13 = aFPurchaseConnectorA1c.getQuantity;
                int i14 = aFPurchaseConnectorA1c.toJsonMap;
                aFPurchaseConnectorA1c.getQuantity = i14;
                aFPurchaseConnectorA1c.toJsonMap = i13;
                int i15 = i13 ^ iArr4[16];
                aFPurchaseConnectorA1c.toJsonMap = i15;
                int i16 = i14 ^ iArr4[17];
                aFPurchaseConnectorA1c.getQuantity = i16;
                cArr[0] = (char) (i16 >>> 16);
                cArr[1] = (char) i16;
                cArr[2] = (char) (i15 >>> 16);
                cArr[3] = (char) i15;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                int i17 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                cArr2[i17 * 2] = cArr[0];
                cArr2[(i17 * 2) + 1] = cArr[1];
                cArr2[(i17 * 2) + 2] = cArr[2];
                cArr2[(i17 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1c.InAppPurchaseEvent = i17 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ ValidationFailureData fromJson(JSONObject jSONObject) {
            toJsonMap = (getPackageName + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
            ValidationFailureData fromJson = fromJson(jSONObject);
            toJsonMap = (getPackageName + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final ValidationFailureData fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(new int[]{-340659533, -459495648, -1920624047, -599543187}, 6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            int optInt = jSONObject.optInt(((String) objArr[0]).intern(), -1);
            Object[] objArr2 = new Object[1];
            a(new int[]{949337563, -1749529051, 1869596331, 1756777723, -1296466469, -491897845}, TextUtils.getCapsMode("", 0, 0) + 11, objArr2);
            String optString = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            ValidationFailureData validationFailureData = new ValidationFailureData(optInt, optString);
            int i4 = toJsonMap + 97;
            getPackageName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                return validationFailureData;
            }
            throw null;
        }
    }

    public ValidationFailureData(int i4, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = i4;
        this.description = str;
    }

    public static /* synthetic */ ValidationFailureData copy$default(ValidationFailureData validationFailureData, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = validationFailureData.status;
        }
        if ((i5 & 2) != 0) {
            str = validationFailureData.description;
        }
        return validationFailureData.copy(i4, str);
    }

    public static ValidationFailureData fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final int component1() {
        return this.status;
    }

    public final String component2() {
        return this.description;
    }

    public final ValidationFailureData copy(int i4, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ValidationFailureData(i4, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationFailureData)) {
            return false;
        }
        ValidationFailureData validationFailureData = (ValidationFailureData) obj;
        return this.status == validationFailureData.status && Intrinsics.areEqual(this.description, validationFailureData.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.status) * 31) + this.description.hashCode();
    }

    public final String toString() {
        return "ValidationFailureData(status=" + this.status + ", description=" + this.description + ")";
    }
}
