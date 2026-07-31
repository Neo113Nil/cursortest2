package com.appsflyer.internal.models;

import android.view.View;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1i;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class PrepaidPlan {
    public static final Companion Companion = new Companion(null);
    private final String allowExtendAfterTime;

    @Metadata
    public static final class Companion implements Deserialize<PrepaidPlan> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long InAppPurchaseEvent = 7859613101306768189L;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int getPackageName = -2135458862;
        private static char getQuantity = 31698;
        private static int toJsonMap;

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void a(String str, String str2, int i4, char c4, String str3, Object[] objArr) {
            char[] cArr;
            char[] charArray = str3 != 0 ? str3.toCharArray() : str3;
            if (str2 != null) {
                $10 = ($11 + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
                cArr = str2.toCharArray();
            } else {
                cArr = str2;
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str;
            if (str != null) {
                $11 = ($10 + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
                cArr3 = str.toCharArray();
            }
            char[] cArr4 = cArr3;
            AFPurchaseConnectorA1i aFPurchaseConnectorA1i = new AFPurchaseConnectorA1i();
            int length = cArr2.length;
            char[] cArr5 = new char[length];
            int length2 = cArr4.length;
            char[] cArr6 = new char[length2];
            System.arraycopy(cArr2, 0, cArr5, 0, length);
            System.arraycopy(cArr4, 0, cArr6, 0, length2);
            cArr5[0] = (char) (cArr5[0] ^ c4);
            cArr6[2] = (char) (cArr6[2] + ((char) i4));
            int length3 = charArray.length;
            char[] cArr7 = new char[length3];
            aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = 0;
            while (true) {
                int i5 = aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails;
                if (i5 >= length3) {
                    break;
                }
                $11 = ($10 + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int i6 = (i5 + 3) % 4;
                int i7 = cArr5[i5 % 4] * 32718;
                char c5 = cArr6[(i5 + 2) % 4];
                char c6 = (char) ((i7 + c5) % 65535);
                aFPurchaseConnectorA1i.InAppPurchaseEvent = c6;
                cArr6[i6] = (char) (((cArr5[i6] * 32718) + c5) / 65535);
                cArr5[i6] = c6;
                cArr7[i5] = (char) ((((charArray[i5] ^ c6) ^ (InAppPurchaseEvent ^ 409721173320367058L)) ^ ((int) (getPackageName ^ 409721173320367058L))) ^ ((char) (getQuantity ^ 409721173320367058L)));
                aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = i5 + 1;
            }
            String str4 = new String(cArr7);
            int i8 = $10 + 27;
            $11 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i8 % 2 == 0) {
                throw null;
            }
            objArr[0] = str4;
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ PrepaidPlan fromJson(JSONObject jSONObject) {
            int i4 = toJsonMap + InterfaceC1490j3.d.b.f16812d;
            getOneTimePurchaseOfferDetails = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                fromJson(jSONObject);
                throw null;
            }
            PrepaidPlan fromJson = fromJson(jSONObject);
            int i5 = toJsonMap + 5;
            getOneTimePurchaseOfferDetails = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                return fromJson;
            }
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final PrepaidPlan fromJson(JSONObject jSONObject) {
            Object nullable;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("ჯ뿒歅梽", "⦢ﺳț죽", View.MeasureSpec.getMode(0), (char) View.MeasureSpec.getMode(0), "令됉㰓ⴗ₦臫隣튣頛\ue62fꨁ鳌뺨⋀䚓℃\u19cf\u218f醏䞁", objArr);
            nullable = SubscriptionPurchaseKt.getNullable(jSONObject, ((String) objArr[0]).intern());
            PrepaidPlan prepaidPlan = new PrepaidPlan((String) nullable);
            toJsonMap = (getOneTimePurchaseOfferDetails + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return prepaidPlan;
        }
    }

    public PrepaidPlan(String str) {
        this.allowExtendAfterTime = str;
    }

    public static /* synthetic */ PrepaidPlan copy$default(PrepaidPlan prepaidPlan, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = prepaidPlan.allowExtendAfterTime;
        }
        return prepaidPlan.copy(str);
    }

    public final String component1() {
        return this.allowExtendAfterTime;
    }

    public final PrepaidPlan copy(String str) {
        return new PrepaidPlan(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepaidPlan) && Intrinsics.areEqual(this.allowExtendAfterTime, ((PrepaidPlan) obj).allowExtendAfterTime);
    }

    public final String getAllowExtendAfterTime() {
        return this.allowExtendAfterTime;
    }

    public final int hashCode() {
        String str = this.allowExtendAfterTime;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "PrepaidPlan(allowExtendAfterTime=" + this.allowExtendAfterTime + ")";
    }
}
