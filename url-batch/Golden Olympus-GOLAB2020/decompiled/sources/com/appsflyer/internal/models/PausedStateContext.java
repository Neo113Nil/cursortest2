package com.appsflyer.internal.models;

import android.graphics.Color;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class PausedStateContext {
    public static final Companion Companion = new Companion(null);
    private final String autoResumeTime;

    @Metadata
    public static final class Companion implements Deserialize<PausedStateContext> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1;
        private static int[] getOneTimePurchaseOfferDetails = {-1304909012, 714143344, 719802641, 1576161698, 1933478925, 1141267324, -677188655, 1131992209, 1786428511, 1255381593, -1146773330, -346518410, 790114477, 1685937482, 568483301, -2129505576, 1603859667, 1267649722};
        private static int getPackageName;

        private Companion() {
        }

        private static void a(int[] iArr, int i4, Object[] objArr) {
            long j4;
            int length;
            int[] iArr2;
            int i5;
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char c4 = 2;
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = getOneTimePurchaseOfferDetails;
            long j5 = -6033101233399176549L;
            if (iArr3 != null) {
                int i6 = $11 + 25;
                $10 = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i6 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i5 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    iArr2[i5] = (int) (iArr3[i5] ^ (-6033101233399176549L));
                    i5++;
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = getOneTimePurchaseOfferDetails;
            if (iArr5 != null) {
                $11 = ($10 + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i7 = 0;
                while (i7 < length3) {
                    int i8 = $10 + 53;
                    char c5 = c4;
                    $11 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i8 % 2 == 0) {
                        j4 = j5;
                        iArr6[i7] = (int) (iArr5[i7] ^ j4);
                    } else {
                        j4 = j5;
                        iArr6[i7] = (int) (iArr5[i7] ^ j4);
                        i7++;
                    }
                    c4 = c5;
                    j5 = j4;
                }
                iArr5 = iArr6;
            }
            char c6 = c4;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            aFPurchaseConnectorA1c.InAppPurchaseEvent = 0;
            while (true) {
                int i9 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                if (i9 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i4);
                    return;
                }
                int i10 = iArr[i9];
                char c7 = (char) (i10 >> 16);
                cArr[0] = c7;
                char c8 = (char) i10;
                cArr[1] = c8;
                char c9 = (char) (iArr[i9 + 1] >> 16);
                cArr[c6] = c9;
                char c10 = (char) iArr[i9 + 1];
                cArr[3] = c10;
                aFPurchaseConnectorA1c.getQuantity = (c7 << 16) + c8;
                aFPurchaseConnectorA1c.toJsonMap = (c9 << 16) + c10;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                for (int i11 = 0; i11 < 16; i11++) {
                    int i12 = aFPurchaseConnectorA1c.getQuantity ^ iArr4[i11];
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
                int i16 = i14 ^ iArr4[16];
                aFPurchaseConnectorA1c.toJsonMap = i16;
                int i17 = i15 ^ iArr4[17];
                aFPurchaseConnectorA1c.getQuantity = i17;
                cArr[0] = (char) (i17 >>> 16);
                cArr[1] = (char) i17;
                cArr[c6] = (char) (i16 >>> 16);
                cArr[3] = (char) i16;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                int i18 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                cArr2[i18 * 2] = cArr[0];
                cArr2[(i18 * 2) + 1] = cArr[1];
                cArr2[(i18 * 2) + 2] = cArr[c6];
                cArr2[(i18 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1c.InAppPurchaseEvent = i18 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ PausedStateContext fromJson(JSONObject jSONObject) {
            int i4 = InAppPurchaseEvent + 107;
            getPackageName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
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
        public final PausedStateContext fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(new int[]{-814223544, 922159691, -908370604, -1848497898, -405032872, 572579928, 963491659, 148804044}, 14 - Color.argb(0, 0, 0, 0), objArr);
            String optString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            PausedStateContext pausedStateContext = new PausedStateContext(optString);
            int i4 = InAppPurchaseEvent + 65;
            getPackageName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                return pausedStateContext;
            }
            throw null;
        }
    }

    public PausedStateContext(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.autoResumeTime = str;
    }

    public static /* synthetic */ PausedStateContext copy$default(PausedStateContext pausedStateContext, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = pausedStateContext.autoResumeTime;
        }
        return pausedStateContext.copy(str);
    }

    public final String component1() {
        return this.autoResumeTime;
    }

    public final PausedStateContext copy(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PausedStateContext(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PausedStateContext) && Intrinsics.areEqual(this.autoResumeTime, ((PausedStateContext) obj).autoResumeTime);
    }

    public final String getAutoResumeTime() {
        return this.autoResumeTime;
    }

    public final int hashCode() {
        return this.autoResumeTime.hashCode();
    }

    public final String toString() {
        return "PausedStateContext(autoResumeTime=" + this.autoResumeTime + ")";
    }
}
