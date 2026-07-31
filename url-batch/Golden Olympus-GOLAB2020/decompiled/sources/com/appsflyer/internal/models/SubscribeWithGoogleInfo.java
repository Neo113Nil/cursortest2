package com.appsflyer.internal.models;

import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1c;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class SubscribeWithGoogleInfo {
    public static final Companion Companion = new Companion(null);
    private final String emailAddress;
    private final String familyName;
    private final String givenName;
    private final String profileId;
    private final String profileName;

    @Metadata
    public static final class Companion implements Deserialize<SubscribeWithGoogleInfo> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getPackageName = 0;
        private static int toJsonMap = 1;
        private static char[] getOneTimePurchaseOfferDetails = {61850, 61904, 61903, 61896, 61896, 61895, 61937, 61941, 61897, 61894, 61892, 61898, 61840, 61892, 61897, 61899, 61940, 61941, 61897, 61906, 61907};
        private static int[] getQuantity = {418796712, 1948537304, -1650439581, 1033086924, 1645603133, 2007808860, 1857338365, 1823483694, 1952796418, 1977383259, -878785260, -804681131, 1207939658, -1435865874, -736037599, 1663337011, 155467428, 1644775619};

        private Companion() {
        }

        private static void a(boolean z4, String str, int[] iArr, Object[] objArr) {
            char[] cArr;
            char c4;
            String str2 = str;
            byte[] bArr = str2;
            if (str2 != null) {
                int i4 = $11 + 35;
                $10 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    int i5 = 33 / 0;
                    bArr = str2.getBytes("ISO-8859-1");
                } else {
                    bArr = str2.getBytes("ISO-8859-1");
                }
            }
            byte[] bArr2 = bArr;
            AFPurchaseConnectorA1e aFPurchaseConnectorA1e = new AFPurchaseConnectorA1e();
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            char[] cArr2 = getOneTimePurchaseOfferDetails;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                $11 = ($10 + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
                for (int i10 = 0; i10 < length; i10++) {
                    $10 = ($11 + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    cArr3[i10] = (char) (cArr2[i10] ^ (-6597605525082934877L));
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i7];
            System.arraycopy(cArr2, i6, cArr4, 0, i7);
            if (bArr2 != null) {
                int i11 = $11 + 63;
                $10 = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    cArr = new char[i7];
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 1;
                    c4 = 1;
                } else {
                    cArr = new char[i7];
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 0;
                    c4 = 0;
                }
                while (true) {
                    int i12 = aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails;
                    if (i12 >= i7) {
                        break;
                    }
                    int i13 = ($10 + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    $11 = i13;
                    if (bArr2[i12] == 1) {
                        int i14 = i13 + 31;
                        $10 = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i14 % 2 != 0) {
                            cArr[i12] = (char) ((cArr4[i12] >>> 5) >>> c4);
                        } else {
                            cArr[i12] = (char) (((cArr4[i12] * 2) + 1) - c4);
                        }
                    } else {
                        cArr[i12] = (char) ((cArr4[i12] * 2) - c4);
                    }
                    c4 = cArr[i12];
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = i12 + 1;
                }
                cArr4 = cArr;
            }
            if (i9 > 0) {
                char[] cArr5 = new char[i7];
                System.arraycopy(cArr4, 0, cArr5, 0, i7);
                int i15 = i7 - i9;
                System.arraycopy(cArr5, 0, cArr4, i15, i9);
                System.arraycopy(cArr5, i9, cArr4, 0, i15);
            }
            if (z4) {
                $11 = ($10 + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
                char[] cArr6 = new char[i7];
                aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i16 = aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails;
                    if (i16 >= i7) {
                        break;
                    }
                    cArr6[i16] = cArr4[(i7 - i16) - 1];
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = i16 + 1;
                }
                cArr4 = cArr6;
            }
            if (i8 > 0) {
                int i17 = $10 + 49;
                $11 = i17 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i17 % 2 == 0) {
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 1;
                } else {
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 0;
                }
                while (true) {
                    int i18 = aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails;
                    if (i18 >= i7) {
                        break;
                    }
                    cArr4[i18] = (char) (cArr4[i18] - iArr[2]);
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = i18 + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private static void b(int[] iArr, int i4, Object[] objArr) {
            int length;
            int[] iArr2;
            int i5;
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = getQuantity;
            long j4 = -6033101233399176549L;
            if (iArr3 != null) {
                int i6 = ($11 + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
                $10 = i6;
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                $11 = (i6 + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
                for (int i7 = 0; i7 < length2; i7++) {
                    iArr4[i7] = (int) (iArr3[i7] ^ (-6033101233399176549L));
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = getQuantity;
            if (iArr6 != null) {
                int i8 = $11 + 87;
                $10 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i8 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i5 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    $11 = ($10 + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    long j5 = j4;
                    iArr2[i5] = (int) (iArr6[i5] ^ j5);
                    i5++;
                    j4 = j5;
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            aFPurchaseConnectorA1c.InAppPurchaseEvent = 0;
            while (true) {
                int i9 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                if (i9 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i4);
                    return;
                }
                int i10 = iArr[i9];
                char c4 = (char) (i10 >> 16);
                cArr[0] = c4;
                char c5 = (char) i10;
                cArr[1] = c5;
                char c6 = (char) (iArr[i9 + 1] >> 16);
                cArr[2] = c6;
                char c7 = (char) iArr[i9 + 1];
                cArr[3] = c7;
                aFPurchaseConnectorA1c.getQuantity = (c4 << 16) + c5;
                aFPurchaseConnectorA1c.toJsonMap = (c6 << 16) + c7;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr5);
                $10 = ($11 + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                for (int i11 = 0; i11 < 16; i11++) {
                    $11 = ($10 + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    int i12 = aFPurchaseConnectorA1c.getQuantity ^ iArr5[i11];
                    aFPurchaseConnectorA1c.getQuantity = i12;
                    int quantity = AFPurchaseConnectorA1c.getQuantity(i12) ^ aFPurchaseConnectorA1c.toJsonMap;
                    int i13 = aFPurchaseConnectorA1c.getQuantity;
                    aFPurchaseConnectorA1c.getQuantity = quantity;
                    aFPurchaseConnectorA1c.toJsonMap = i13;
                }
                int i14 = aFPurchaseConnectorA1c.getQuantity;
                int i15 = aFPurchaseConnectorA1c.toJsonMap;
                aFPurchaseConnectorA1c.getQuantity = i15;
                aFPurchaseConnectorA1c.toJsonMap = i14;
                int i16 = i14 ^ iArr5[16];
                aFPurchaseConnectorA1c.toJsonMap = i16;
                int i17 = i15 ^ iArr5[17];
                aFPurchaseConnectorA1c.getQuantity = i17;
                cArr[0] = (char) (i17 >>> 16);
                cArr[1] = (char) i17;
                cArr[2] = (char) (i16 >>> 16);
                cArr[3] = (char) i16;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr5);
                int i18 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                cArr2[i18 * 2] = cArr[0];
                cArr2[(i18 * 2) + 1] = cArr[1];
                cArr2[(i18 * 2) + 2] = cArr[2];
                cArr2[(i18 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1c.InAppPurchaseEvent = i18 + 2;
                $10 = ($11 + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscribeWithGoogleInfo fromJson(JSONObject jSONObject) {
            getPackageName = (toJsonMap + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
            SubscribeWithGoogleInfo fromJson = fromJson(jSONObject);
            int i4 = toJsonMap + 31;
            getPackageName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final SubscribeWithGoogleInfo fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(true, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000", new int[]{0, 12, 0, 0}, objArr);
            String optString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            b(new int[]{1362738978, 1051242831, -1218499737, 1371039766, 758915324, 155961919}, 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            String optString2 = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Object[] objArr3 = new Object[1];
            b(new int[]{-4608109, 1363044340, -149718670, 2092778429, 2119728533, -1200540607}, View.MeasureSpec.getSize(0) + 9, objArr3);
            String optString3 = jSONObject.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            Object[] objArr4 = new Object[1];
            a(false, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{12, 9, 0, 6}, objArr4);
            String optString4 = jSONObject.optString(((String) objArr4[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString4, "");
            Object[] objArr5 = new Object[1];
            b(new int[]{2057795536, 2114002524, -557252362, -1811934362, 1380551411, -389149381}, View.MeasureSpec.makeMeasureSpec(0, 0) + 11, objArr5);
            String optString5 = jSONObject.optString(((String) objArr5[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString5, "");
            SubscribeWithGoogleInfo subscribeWithGoogleInfo = new SubscribeWithGoogleInfo(optString, optString2, optString3, optString4, optString5);
            toJsonMap = (getPackageName + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return subscribeWithGoogleInfo;
        }
    }

    public SubscribeWithGoogleInfo(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.emailAddress = str;
        this.familyName = str2;
        this.givenName = str3;
        this.profileId = str4;
        this.profileName = str5;
    }

    public static /* synthetic */ SubscribeWithGoogleInfo copy$default(SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str, String str2, String str3, String str4, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = subscribeWithGoogleInfo.emailAddress;
        }
        if ((i4 & 2) != 0) {
            str2 = subscribeWithGoogleInfo.familyName;
        }
        if ((i4 & 4) != 0) {
            str3 = subscribeWithGoogleInfo.givenName;
        }
        if ((i4 & 8) != 0) {
            str4 = subscribeWithGoogleInfo.profileId;
        }
        if ((i4 & 16) != 0) {
            str5 = subscribeWithGoogleInfo.profileName;
        }
        String str6 = str5;
        String str7 = str3;
        return subscribeWithGoogleInfo.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.emailAddress;
    }

    public final String component2() {
        return this.familyName;
    }

    public final String component3() {
        return this.givenName;
    }

    public final String component4() {
        return this.profileId;
    }

    public final String component5() {
        return this.profileName;
    }

    public final SubscribeWithGoogleInfo copy(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SubscribeWithGoogleInfo(str, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeWithGoogleInfo)) {
            return false;
        }
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) obj;
        return Intrinsics.areEqual(this.emailAddress, subscribeWithGoogleInfo.emailAddress) && Intrinsics.areEqual(this.familyName, subscribeWithGoogleInfo.familyName) && Intrinsics.areEqual(this.givenName, subscribeWithGoogleInfo.givenName) && Intrinsics.areEqual(this.profileId, subscribeWithGoogleInfo.profileId) && Intrinsics.areEqual(this.profileName, subscribeWithGoogleInfo.profileName);
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final String getProfileName() {
        return this.profileName;
    }

    public final int hashCode() {
        return (((((((this.emailAddress.hashCode() * 31) + this.familyName.hashCode()) * 31) + this.givenName.hashCode()) * 31) + this.profileId.hashCode()) * 31) + this.profileName.hashCode();
    }

    public final String toString() {
        return "SubscribeWithGoogleInfo(emailAddress=" + this.emailAddress + ", familyName=" + this.familyName + ", givenName=" + this.givenName + ", profileId=" + this.profileId + ", profileName=" + this.profileName + ")";
    }
}
