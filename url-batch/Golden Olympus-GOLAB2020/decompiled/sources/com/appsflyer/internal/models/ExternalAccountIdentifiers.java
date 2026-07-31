package com.appsflyer.internal.models;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class ExternalAccountIdentifiers {
    public static final Companion Companion = new Companion(null);
    private final String externalAccountId;
    private final String obfuscatedExternalAccountId;
    private final String obfuscatedExternalProfileId;

    @Metadata
    public static final class Companion implements Deserialize<ExternalAccountIdentifiers> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 0;
        private static int getPackageName = 1;
        private static char[] getOneTimePurchaseOfferDetails = {8980, 17673, 61189, 4372, 47875, 56607, 18192, 59677, 4912, 46354, 57106, 16670, 60164, 3359, 46853, 55608, 17173, 8990, 17683, 61207, 4356, 47874, 56594, 18192, 59653, 4884, 46357, 57140, 16649, 60165, 3348, 46851, 55583, 17168, 58653, 3888, 45330, 56082, 32030, 59140, 2335, 45829, 54584, 32533, 17338, 9655, 36787, 29088, 56230, 48566, 10164, 35233, 29616, 54705, 49040, 8621, 35745, 28080, 55207, 47547, 9140, 34233, 28549, 53671, 48058, 7603, 34748, 27065, 54192, 46492, 8113};
        private static long getQuantity = -3076080037190023823L;

        private Companion() {
        }

        private static void a(int i4, char c4, int i5, Object[] objArr) {
            AFPurchaseConnectorA1d aFPurchaseConnectorA1d = new AFPurchaseConnectorA1d();
            long[] jArr = new long[i4];
            aFPurchaseConnectorA1d.getQuantity = 0;
            while (true) {
                int i6 = aFPurchaseConnectorA1d.getQuantity;
                if (i6 >= i4) {
                    break;
                }
                $11 = ($10 + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                jArr[i6] = (((char) (getOneTimePurchaseOfferDetails[i5 + i6] ^ 5120776544585851761L)) ^ (i6 * (5120776544585851761L ^ getQuantity))) ^ c4;
                aFPurchaseConnectorA1d.getQuantity = i6 + 1;
            }
            char[] cArr = new char[i4];
            aFPurchaseConnectorA1d.getQuantity = 0;
            while (true) {
                int i7 = aFPurchaseConnectorA1d.getQuantity;
                if (i7 >= i4) {
                    break;
                }
                cArr[i7] = (char) jArr[i7];
                aFPurchaseConnectorA1d.getQuantity = i7 + 1;
            }
            String str = new String(cArr);
            int i8 = $10 + 61;
            $11 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i8 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ ExternalAccountIdentifiers fromJson(JSONObject jSONObject) {
            InAppPurchaseEvent = (getPackageName + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            ExternalAccountIdentifiers fromJson = fromJson(jSONObject);
            InAppPurchaseEvent = (getPackageName + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final ExternalAccountIdentifiers fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(TextUtils.getOffsetAfter("", 0) + 17, (char) ExpandableListView.getPackedPositionGroup(0L), KeyEvent.getMaxKeyCode() >> 16, objArr);
            String optString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            a(View.MeasureSpec.getMode(0) + 27, (char) TextUtils.getTrimmedLength(""), 16 - Process.getGidForName(""), objArr2);
            String optString2 = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Object[] objArr3 = new Object[1];
            a(ExpandableListView.getPackedPositionType(0L) + 27, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 24740), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
            String optString3 = jSONObject.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            ExternalAccountIdentifiers externalAccountIdentifiers = new ExternalAccountIdentifiers(optString, optString2, optString3);
            InAppPurchaseEvent = (getPackageName + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return externalAccountIdentifiers;
        }
    }

    public ExternalAccountIdentifiers(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.externalAccountId = str;
        this.obfuscatedExternalAccountId = str2;
        this.obfuscatedExternalProfileId = str3;
    }

    public static /* synthetic */ ExternalAccountIdentifiers copy$default(ExternalAccountIdentifiers externalAccountIdentifiers, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = externalAccountIdentifiers.externalAccountId;
        }
        if ((i4 & 2) != 0) {
            str2 = externalAccountIdentifiers.obfuscatedExternalAccountId;
        }
        if ((i4 & 4) != 0) {
            str3 = externalAccountIdentifiers.obfuscatedExternalProfileId;
        }
        return externalAccountIdentifiers.copy(str, str2, str3);
    }

    public final String component1() {
        return this.externalAccountId;
    }

    public final String component2() {
        return this.obfuscatedExternalAccountId;
    }

    public final String component3() {
        return this.obfuscatedExternalProfileId;
    }

    public final ExternalAccountIdentifiers copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ExternalAccountIdentifiers(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalAccountIdentifiers)) {
            return false;
        }
        ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) obj;
        return Intrinsics.areEqual(this.externalAccountId, externalAccountIdentifiers.externalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalAccountId, externalAccountIdentifiers.obfuscatedExternalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalProfileId, externalAccountIdentifiers.obfuscatedExternalProfileId);
    }

    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    public final int hashCode() {
        return (((this.externalAccountId.hashCode() * 31) + this.obfuscatedExternalAccountId.hashCode()) * 31) + this.obfuscatedExternalProfileId.hashCode();
    }

    public final String toString() {
        return "ExternalAccountIdentifiers(externalAccountId=" + this.externalAccountId + ", obfuscatedExternalAccountId=" + this.obfuscatedExternalAccountId + ", obfuscatedExternalProfileId=" + this.obfuscatedExternalProfileId + ")";
    }
}
