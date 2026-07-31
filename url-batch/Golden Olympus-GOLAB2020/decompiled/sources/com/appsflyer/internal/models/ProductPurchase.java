package com.appsflyer.internal.models;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1c;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class ProductPurchase {
    public static final Companion Companion = new Companion(null);
    private final int acknowledgementState;
    private final int consumptionState;
    private final String developerPayload;
    private final String kind;
    private final String obfuscatedExternalAccountId;
    private final String obfuscatedExternalProfileId;
    private final String orderId;
    private final String productId;
    private final int purchaseState;
    private final String purchaseTimeMillis;
    private final String purchaseToken;
    private final int purchaseType;
    private final int quantity;
    private final String regionCode;

    @Metadata
    public static final class Companion implements Deserialize<ProductPurchase> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int PurchaseClient = 0;
        private static int equals = 1;
        private static int getOneTimePurchaseOfferDetails = 1688888230;
        private static int getPackageName = 1175623904;
        private static int getQuantity = -2078375;
        private static short[] toJsonMap;
        private static byte[] InAppPurchaseEvent = {64, 87, 72, -42, -16, -54, -122, -53, -41, -9, -34, -30, -42, -38, -30, 57, -37, 61, -23, 53, -49, -42, -59, -44, -53, -64, -54, -43, -49, -36, -21, 47, -27, -47, -62, -45, -59, -57, -11, 63, 58, -38, -63, -43, 57, -51, -43, 125, 31, 113, 45, 99, 10, 21, 4, 20, 2, 15, 3, 5, 121, 20, 13, 15, 20, 14, -90, -40, -100, -15, -100, -8, Byte.MIN_VALUE, -115, -60, -60, -60, -60, -60, -60, -60};
        private static int[] stopObservingTransactions = {-989833201, 1143223520, -1012064137, -1343262758, 1670981312, -859429332, 1785487465, -2009815516, -771224981, 1290596811, 552937098, -65778887, 1218886644, 1666756460, -1614711560, -1162689365, -1805054757, 1026752911};

        private Companion() {
        }

        private static void a(int i4, int i5, byte b4, short s4, int i6, Object[] objArr) {
            int i7;
            char c4;
            int length;
            byte[] bArr;
            AFPurchaseConnectorA2x aFPurchaseConnectorA2x = new AFPurchaseConnectorA2x();
            StringBuilder sb = new StringBuilder();
            int i8 = i5 + ((int) (getPackageName ^ (-4208132002516133692L)));
            if (i8 == -1) {
                i7 = 1;
            } else {
                $11 = ($10 + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
                i7 = 0;
            }
            if ((i7 ^ 1) != 1) {
                byte[] bArr2 = InAppPurchaseEvent;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $10 + 67;
                        $11 = i10 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i10 % 2 == 0) {
                            bArr3[i9] = (byte) (bArr2[i9] | (-4208132002516133692L));
                        } else {
                            bArr3[i9] = (byte) (bArr2[i9] ^ (-4208132002516133692L));
                            i9++;
                        }
                    }
                    bArr2 = bArr3;
                }
                i8 = bArr2 != null ? (byte) (((byte) (InAppPurchaseEvent[i6 + ((int) (getQuantity ^ (-4208132002516133692L)))] ^ (-4208132002516133692L))) + ((int) (getPackageName ^ (-4208132002516133692L)))) : (short) (((short) (toJsonMap[i6 + ((int) (getQuantity ^ (-4208132002516133692L)))] ^ (-4208132002516133692L))) + ((int) (getPackageName ^ (-4208132002516133692L))));
            }
            if (i8 > 0) {
                aFPurchaseConnectorA2x.getPackageName = ((i6 + i8) - 2) + ((int) (getQuantity ^ (-4208132002516133692L))) + i7;
                char c5 = (char) (i4 + ((int) (getOneTimePurchaseOfferDetails ^ (-4208132002516133692L))));
                aFPurchaseConnectorA2x.InAppPurchaseEvent = c5;
                sb.append(c5);
                aFPurchaseConnectorA2x.getQuantity = aFPurchaseConnectorA2x.InAppPurchaseEvent;
                byte[] bArr4 = InAppPurchaseEvent;
                if (bArr4 != null) {
                    int i11 = $11 + 67;
                    $10 = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i11 % 2 != 0) {
                        length = bArr4.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr4.length;
                        bArr = new byte[length];
                    }
                    for (int i12 = 0; i12 < length; i12++) {
                        $11 = ($10 + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        bArr[i12] = (byte) (bArr4[i12] ^ (-4208132002516133692L));
                    }
                    bArr4 = bArr;
                }
                boolean z4 = bArr4 != null;
                aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails = 1;
                while (aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails < i8) {
                    if (z4) {
                        int i13 = $10 + 13;
                        $11 = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i13 % 2 == 0) {
                            byte[] bArr5 = InAppPurchaseEvent;
                            aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName << 1;
                            c4 = (char) (aFPurchaseConnectorA2x.getQuantity >> (((byte) (((byte) (bArr5[r7] % (-4208132002516133692L))) >>> s4)) ^ b4));
                        } else {
                            byte[] bArr6 = InAppPurchaseEvent;
                            aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName - 1;
                            c4 = (char) (aFPurchaseConnectorA2x.getQuantity + (((byte) (((byte) (bArr6[r7] ^ (-4208132002516133692L))) + s4)) ^ b4));
                        }
                        aFPurchaseConnectorA2x.InAppPurchaseEvent = c4;
                    } else {
                        short[] sArr = toJsonMap;
                        aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName - 1;
                        aFPurchaseConnectorA2x.InAppPurchaseEvent = (char) (aFPurchaseConnectorA2x.getQuantity + (((short) (((short) (sArr[r7] ^ (-4208132002516133692L))) + s4)) ^ b4));
                    }
                    sb.append(aFPurchaseConnectorA2x.InAppPurchaseEvent);
                    aFPurchaseConnectorA2x.getQuantity = aFPurchaseConnectorA2x.InAppPurchaseEvent;
                    aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails++;
                }
            }
            objArr[0] = sb.toString();
        }

        private static void b(int[] iArr, int i4, Object[] objArr) {
            int length;
            int[] iArr2;
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = stopObservingTransactions;
            if (iArr3 != null) {
                int i5 = $10 + 43;
                $11 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i5 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                for (int i6 = 0; i6 < length; i6++) {
                    $11 = ($10 + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    iArr2[i6] = (int) (iArr3[i6] ^ (-6033101233399176549L));
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = stopObservingTransactions;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i7 = 0; i7 < length3; i7++) {
                    $10 = ($11 + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
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
                $10 = ($11 + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
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
                for (int i10 = 0; i10 < 16; i10++) {
                    $10 = ($11 + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
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
        public final /* synthetic */ ProductPurchase fromJson(JSONObject jSONObject) {
            int i4 = equals + 59;
            PurchaseClient = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
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
        public final ProductPurchase fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a((-582548215) - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 32, (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + IronSourceConstants.FIRST_INSTANCE_RESULT), 1175268964 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            String optString = jSONObject.optString(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            b(new int[]{2005301407, -60183927, -1207719689, 400653573, 1362738546, 420062478, 1113928308, 728412629, 380141090, 726507346}, View.resolveSizeAndState(0, 0, 0) + 18, objArr2);
            String optString2 = jSONObject.optString(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a((-582548210) - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 23, (byte) TextUtils.indexOf("", ""), (short) ((-34) - ExpandableListView.getPackedPositionChild(0L)), 1175268967 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            int optInt = jSONObject.optInt(((String) objArr3[0]).intern(), -1);
            Object[] objArr4 = new Object[1];
            a((-582548223) - View.combineMeasuredStates(0, 0), (-20) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) View.combineMeasuredStates(0, 0), (short) ((-12) - View.resolveSize(0, 0)), 1175268978 - Color.red(0), objArr4);
            int optInt2 = jSONObject.optInt(((String) objArr4[0]).intern(), -1);
            Object[] objArr5 = new Object[1];
            b(new int[]{-1326057577, 791766696, -1433654798, -1635830386, 2135481497, -322530907, 1308775003, -422984170}, Gravity.getAbsoluteGravity(0, 0) + 16, objArr5);
            String optString3 = jSONObject.optString(((String) objArr5[0]).intern());
            Object[] objArr6 = new Object[1];
            a((-582548211) - Gravity.getAbsoluteGravity(0, 0), (-30) - ImageFormat.getBitsPerPixel(0), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 20), 1175268992 - TextUtils.lastIndexOf("", '0', 0, 0), objArr6);
            String optString4 = jSONObject.optString(((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            a((KeyEvent.getMaxKeyCode() >> 16) - 582548210, TextUtils.indexOf("", "", 0) - 24, (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 12), 1175268999 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
            int optInt3 = jSONObject.optInt(((String) objArr7[0]).intern(), -1);
            Object[] objArr8 = new Object[1];
            a((-582548224) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-15) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 57), 1175269011 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr8);
            int optInt4 = jSONObject.optInt(((String) objArr8[0]).intern(), -1);
            Object[] objArr9 = new Object[1];
            b(new int[]{2005301407, -60183927, -1207719689, 400653573, -1054609149, 632850071, -2107846801, -699867247}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, objArr9);
            String optString5 = jSONObject.optString(((String) objArr9[0]).intern());
            Object[] objArr10 = new Object[1];
            a((-582548210) - (ViewConfiguration.getPressedStateDuration() >> 16), (-27) - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) (View.combineMeasuredStates(0, 0) - 71), 1175269029 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
            String optString6 = jSONObject.optString(((String) objArr10[0]).intern());
            Object[] objArr11 = new Object[1];
            b(new int[]{-545346571, -391332314, 443699041, -746527974}, 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr11);
            int optInt5 = jSONObject.optInt(((String) objArr11[0]).intern(), -1);
            Object[] objArr12 = new Object[1];
            b(new int[]{-1626725951, 1230683472, 1378003559, -1364087339, 1691992993, 1113039018, 222303335, 2009666220, -608474663, -2045665009, -666539501, 1939553639, 315608314, -2019676651}, ExpandableListView.getPackedPositionChild(0L) + 28, objArr12);
            String optString7 = jSONObject.optString(((String) objArr12[0]).intern());
            Object[] objArr13 = new Object[1];
            b(new int[]{-1626725951, 1230683472, 1378003559, -1364087339, 1691992993, 1113039018, 222303335, 2009666220, 585103710, 1153811338, -732915703, 2036937792, 1227427407, 1561955090}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26, objArr13);
            String optString8 = jSONObject.optString(((String) objArr13[0]).intern());
            Object[] objArr14 = new Object[1];
            b(new int[]{-74593020, -1978383024, -1878750948, -1905049167, 1905259955, 1187120085}, 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr14);
            String optString9 = jSONObject.optString(((String) objArr14[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            Intrinsics.checkNotNullExpressionValue(optString4, "");
            Intrinsics.checkNotNullExpressionValue(optString5, "");
            Intrinsics.checkNotNullExpressionValue(optString6, "");
            Intrinsics.checkNotNullExpressionValue(optString7, "");
            Intrinsics.checkNotNullExpressionValue(optString8, "");
            Intrinsics.checkNotNullExpressionValue(optString9, "");
            ProductPurchase productPurchase = new ProductPurchase(optString, optString2, optInt, optInt2, optString3, optString4, optInt3, optInt4, optString5, optString6, optInt5, optString7, optString8, optString9);
            PurchaseClient = (equals + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return productPurchase;
        }
    }

    public ProductPurchase(String str, String str2, int i4, int i5, String str3, String str4, int i6, int i7, String str5, String str6, int i8, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.kind = str;
        this.purchaseTimeMillis = str2;
        this.purchaseState = i4;
        this.consumptionState = i5;
        this.developerPayload = str3;
        this.orderId = str4;
        this.purchaseType = i6;
        this.acknowledgementState = i7;
        this.purchaseToken = str5;
        this.productId = str6;
        this.quantity = i8;
        this.obfuscatedExternalAccountId = str7;
        this.obfuscatedExternalProfileId = str8;
        this.regionCode = str9;
    }

    public static ProductPurchase fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component10() {
        return this.productId;
    }

    public final int component11() {
        return this.quantity;
    }

    public final String component12() {
        return this.obfuscatedExternalAccountId;
    }

    public final String component13() {
        return this.obfuscatedExternalProfileId;
    }

    public final String component14() {
        return this.regionCode;
    }

    public final String component2() {
        return this.purchaseTimeMillis;
    }

    public final int component3() {
        return this.purchaseState;
    }

    public final int component4() {
        return this.consumptionState;
    }

    public final String component5() {
        return this.developerPayload;
    }

    public final String component6() {
        return this.orderId;
    }

    public final int component7() {
        return this.purchaseType;
    }

    public final int component8() {
        return this.acknowledgementState;
    }

    public final String component9() {
        return this.purchaseToken;
    }

    public final ProductPurchase copy(String str, String str2, int i4, int i5, String str3, String str4, int i6, int i7, String str5, String str6, int i8, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new ProductPurchase(str, str2, i4, i5, str3, str4, i6, i7, str5, str6, i8, str7, str8, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchase)) {
            return false;
        }
        ProductPurchase productPurchase = (ProductPurchase) obj;
        return Intrinsics.areEqual(this.kind, productPurchase.kind) && Intrinsics.areEqual(this.purchaseTimeMillis, productPurchase.purchaseTimeMillis) && this.purchaseState == productPurchase.purchaseState && this.consumptionState == productPurchase.consumptionState && Intrinsics.areEqual(this.developerPayload, productPurchase.developerPayload) && Intrinsics.areEqual(this.orderId, productPurchase.orderId) && this.purchaseType == productPurchase.purchaseType && this.acknowledgementState == productPurchase.acknowledgementState && Intrinsics.areEqual(this.purchaseToken, productPurchase.purchaseToken) && Intrinsics.areEqual(this.productId, productPurchase.productId) && this.quantity == productPurchase.quantity && Intrinsics.areEqual(this.obfuscatedExternalAccountId, productPurchase.obfuscatedExternalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalProfileId, productPurchase.obfuscatedExternalProfileId) && Intrinsics.areEqual(this.regionCode, productPurchase.regionCode);
    }

    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    public final int getConsumptionState() {
        return this.consumptionState;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    public final String getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final int getPurchaseType() {
        return this.purchaseType;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.kind.hashCode() * 31) + this.purchaseTimeMillis.hashCode()) * 31) + Integer.hashCode(this.purchaseState)) * 31) + Integer.hashCode(this.consumptionState)) * 31) + this.developerPayload.hashCode()) * 31) + this.orderId.hashCode()) * 31) + Integer.hashCode(this.purchaseType)) * 31) + Integer.hashCode(this.acknowledgementState)) * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + this.obfuscatedExternalAccountId.hashCode()) * 31) + this.obfuscatedExternalProfileId.hashCode()) * 31) + this.regionCode.hashCode();
    }

    public final String toString() {
        return "ProductPurchase(kind=" + this.kind + ", purchaseTimeMillis=" + this.purchaseTimeMillis + ", purchaseState=" + this.purchaseState + ", consumptionState=" + this.consumptionState + ", developerPayload=" + this.developerPayload + ", orderId=" + this.orderId + ", purchaseType=" + this.purchaseType + ", acknowledgementState=" + this.acknowledgementState + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ", quantity=" + this.quantity + ", obfuscatedExternalAccountId=" + this.obfuscatedExternalAccountId + ", obfuscatedExternalProfileId=" + this.obfuscatedExternalProfileId + ", regionCode=" + this.regionCode + ")";
    }
}
