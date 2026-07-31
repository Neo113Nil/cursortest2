package com.appsflyer.internal.connector.purcahse;

/* loaded from: classes.dex */
public final class AFPurchaseConnectorA2z {
    public int getOneTimePurchaseOfferDetails;
    public int getPackageName;

    public static char[] getOneTimePurchaseOfferDetails(long j4, char[] cArr, int i4) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i5 = 0;
        int i6 = 4;
        for (int i7 = 0; i7 < cArr.length; i7++) {
            if (((j4 >>> i7) & 1) == i4 && i5 < 4) {
                cArr2[i5] = cArr[i7];
            } else if (i6 < length) {
                cArr2[i6] = cArr[i7];
                i6++;
            } else {
                cArr2[i5] = cArr[i7];
            }
            i5++;
        }
        return cArr2;
    }
}
