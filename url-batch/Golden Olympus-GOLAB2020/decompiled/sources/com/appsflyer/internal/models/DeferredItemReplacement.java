package com.appsflyer.internal.models;

import android.os.Process;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class DeferredItemReplacement {
    public static final Companion Companion = new Companion(null);
    private final String productId;

    @Metadata
    public static final class Companion implements Deserialize<DeferredItemReplacement> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1175623869;
        private static short[] getOneTimePurchaseOfferDetails = null;
        private static int getPackageName = 1598397555;
        private static int getQuantity = -354566758;
        private static int hashCode = 0;
        private static int stopObservingTransactions = 1;
        private static byte[] toJsonMap = {63, 113, 53, 10, 53, 17, 25, 38, -60};

        private Companion() {
        }

        private static void a(int i4, int i5, byte b4, short s4, int i6, Object[] objArr) {
            int i7;
            int length;
            byte[] bArr;
            AFPurchaseConnectorA2x aFPurchaseConnectorA2x = new AFPurchaseConnectorA2x();
            StringBuilder sb = new StringBuilder();
            int i8 = i5 + ((int) (InAppPurchaseEvent ^ (-4208132002516133692L)));
            boolean z4 = i8 == -1;
            if (z4) {
                $10 = ($11 + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
                byte[] bArr2 = toJsonMap;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        bArr3[i9] = (byte) (bArr2[i9] ^ (-4208132002516133692L));
                    }
                    bArr2 = bArr3;
                }
                i8 = bArr2 != null ? (byte) (((byte) (toJsonMap[i6 + ((int) (getQuantity ^ (-4208132002516133692L)))] ^ (-4208132002516133692L))) + ((int) (InAppPurchaseEvent ^ (-4208132002516133692L)))) : (short) (((short) (getOneTimePurchaseOfferDetails[i6 + ((int) (getQuantity ^ (-4208132002516133692L)))] ^ (-4208132002516133692L))) + ((int) (InAppPurchaseEvent ^ (-4208132002516133692L))));
            }
            if (i8 > 0) {
                int i10 = ((i6 + i8) - 2) + ((int) (getQuantity ^ (-4208132002516133692L)));
                if (z4) {
                    i7 = 1;
                } else {
                    $10 = ($11 + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    i7 = 0;
                }
                aFPurchaseConnectorA2x.getPackageName = i10 + i7;
                char c4 = (char) (i4 + ((int) (getPackageName ^ (-4208132002516133692L))));
                aFPurchaseConnectorA2x.InAppPurchaseEvent = c4;
                sb.append(c4);
                aFPurchaseConnectorA2x.getQuantity = aFPurchaseConnectorA2x.InAppPurchaseEvent;
                byte[] bArr4 = toJsonMap;
                if (bArr4 != null) {
                    int i11 = $11 + 35;
                    $10 = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i11 % 2 != 0) {
                        length = bArr4.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr4.length;
                        bArr = new byte[length];
                    }
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $10 + 89;
                        $11 = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i13 % 2 == 0) {
                            bArr[i12] = (byte) (bArr4[i12] | (-4208132002516133692L));
                            i12 %= 1;
                        } else {
                            bArr[i12] = (byte) (bArr4[i12] ^ (-4208132002516133692L));
                            i12++;
                        }
                    }
                    bArr4 = bArr;
                }
                boolean z5 = bArr4 != null;
                aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails = 1;
                while (aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails < i8) {
                    if (z5) {
                        byte[] bArr5 = toJsonMap;
                        aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName - 1;
                        aFPurchaseConnectorA2x.InAppPurchaseEvent = (char) (aFPurchaseConnectorA2x.getQuantity + (((byte) (((byte) (bArr5[r7] ^ (-4208132002516133692L))) + s4)) ^ b4));
                    } else {
                        short[] sArr = getOneTimePurchaseOfferDetails;
                        aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName - 1;
                        aFPurchaseConnectorA2x.InAppPurchaseEvent = (char) (aFPurchaseConnectorA2x.getQuantity + (((short) (((short) (sArr[r7] ^ (-4208132002516133692L))) + s4)) ^ b4));
                        $10 = ($11 + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    sb.append(aFPurchaseConnectorA2x.InAppPurchaseEvent);
                    aFPurchaseConnectorA2x.getQuantity = aFPurchaseConnectorA2x.InAppPurchaseEvent;
                    aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails++;
                }
            }
            objArr[0] = sb.toString();
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ DeferredItemReplacement fromJson(JSONObject jSONObject) {
            int i4 = hashCode + 33;
            stopObservingTransactions = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
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
        public final DeferredItemReplacement fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a((-425133128) - TextUtils.lastIndexOf("", '0', 0), TextUtils.lastIndexOf("", '0', 0, 0) - 111, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (short) (ExpandableListView.getPackedPositionGroup(0L) + 32), 1395710626 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            String optString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            DeferredItemReplacement deferredItemReplacement = new DeferredItemReplacement(optString);
            int i4 = stopObservingTransactions + 83;
            hashCode = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                return deferredItemReplacement;
            }
            throw null;
        }
    }

    public DeferredItemReplacement(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.productId = str;
    }

    public static /* synthetic */ DeferredItemReplacement copy$default(DeferredItemReplacement deferredItemReplacement, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = deferredItemReplacement.productId;
        }
        return deferredItemReplacement.copy(str);
    }

    public final String component1() {
        return this.productId;
    }

    public final DeferredItemReplacement copy(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DeferredItemReplacement(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeferredItemReplacement) && Intrinsics.areEqual(this.productId, ((DeferredItemReplacement) obj).productId);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int hashCode() {
        return this.productId.hashCode();
    }

    public final String toString() {
        return "DeferredItemReplacement(productId=" + this.productId + ")";
    }
}
