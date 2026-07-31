package com.appsflyer.internal;

import android.media.AudioTrack;
import android.view.View;
import com.appsflyer.AFLogger;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFf1wSDK extends AFf1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static int registerClient;
    private final AFc1pSDK equals;
    private final AFi1fSDK hashCode;
    private static char[] AFInAppEventParameterName = {10791, 10809, 10763, 10805, 10784, 10788, 10801, 10813, 10802};
    private static char AFLogger = 8141;

    public /* synthetic */ AFf1wSDK(AFi1fSDK aFi1fSDK, AFc1pSDK aFc1pSDK, AFc1dSDK aFc1dSDK, AFh1eSDK aFh1eSDK, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1fSDK, aFc1pSDK, aFc1dSDK, (i4 & 8) != 0 ? new AFh1eSDK() : aFh1eSDK);
    }

    private static void a(byte b4, String str, int i4, Object[] objArr) {
        int i5;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr = AFInAppEventParameterName;
        if (cArr != null) {
            $11 = ($10 + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = (char) (cArr[i6] ^ (-374623853307093042L));
            }
            cArr = cArr2;
        }
        char c4 = (char) ((-374623853307093042L) ^ AFLogger);
        char[] cArr3 = new char[i4];
        if (i4 % 2 != 0) {
            $10 = ($11 + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i5 = i4 - 1;
            cArr3[i5] = (char) (charArray[i5] - b4);
        } else {
            i5 = i4;
        }
        if (i5 > 1) {
            int i7 = $11 + 67;
            $10 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i8 = i7 % 2;
            aFk1mSDK.AFAdRevenueData = 0;
            while (true) {
                int i9 = aFk1mSDK.AFAdRevenueData;
                if (i9 >= i5) {
                    break;
                }
                int i10 = $11;
                int i11 = (i10 + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
                $10 = i11;
                char c5 = charArray[i9];
                aFk1mSDK.getMonetizationNetwork = c5;
                char c6 = charArray[i9 + 1];
                aFk1mSDK.getCurrencyIso4217Code = c6;
                if (c5 == c6) {
                    int i12 = i10 + 81;
                    $10 = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i12 % 2 != 0) {
                        cArr3[i9] = (char) (c5 >>> b4);
                        cArr3[i9 >> 1] = (char) (c6 << b4);
                    } else {
                        cArr3[i9] = (char) (c5 - b4);
                        cArr3[i9 + 1] = (char) (c6 - b4);
                    }
                } else {
                    int i13 = c5 / c4;
                    aFk1mSDK.getMediationNetwork = i13;
                    int i14 = c5 % c4;
                    aFk1mSDK.component1 = i14;
                    int i15 = c6 / c4;
                    aFk1mSDK.getRevenue = i15;
                    int i16 = c6 % c4;
                    aFk1mSDK.component2 = i16;
                    if (i14 == i16) {
                        int i17 = (i11 + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        $11 = i17;
                        int i18 = ((i13 + c4) - 1) % c4;
                        aFk1mSDK.getMediationNetwork = i18;
                        int i19 = ((i15 + c4) - 1) % c4;
                        aFk1mSDK.getRevenue = i19;
                        cArr3[i9] = cArr[(i18 * c4) + i14];
                        cArr3[i9 + 1] = cArr[(i19 * c4) + i16];
                        $10 = (i17 + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    } else if (i13 == i15) {
                        int i20 = ((i14 + c4) - 1) % c4;
                        aFk1mSDK.component1 = i20;
                        int i21 = ((i16 + c4) - 1) % c4;
                        aFk1mSDK.component2 = i21;
                        cArr3[i9] = cArr[(i13 * c4) + i20];
                        cArr3[i9 + 1] = cArr[(i15 * c4) + i21];
                    } else {
                        cArr3[i9] = cArr[(i13 * c4) + i16];
                        cArr3[i9 + 1] = cArr[(i15 * c4) + i14];
                    }
                }
                aFk1mSDK.AFAdRevenueData = i9 + 2;
            }
        }
        for (int i22 = 0; i22 < i4; i22++) {
            cArr3[i22] = (char) (cArr3[i22] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    private final void areAllFieldsValid(AFh1rSDK aFh1rSDK) {
        try {
            Map<String, ?> map = (Map) getRevenue(new Object[]{this}, -846475554, 846475554, System.identityHashCode(this));
            if (map != null) {
                int i4 = AFKeystoreWrapper + 97;
                registerClient = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    aFh1rSDK.getMediationNetwork(map);
                    throw null;
                }
                aFh1rSDK.getMediationNetwork(map);
            }
            if (this.hashCode.AFAdRevenueData()) {
                return;
            }
            registerClient = (AFKeystoreWrapper + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Map<String, Object> component1 = AFf1rSDK.component1(aFh1rSDK);
            Intrinsics.checkNotNullExpressionValue(component1, "");
            component1.put("pia_disabled", Boolean.TRUE);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
    }

    private final Map<String, Object> copy() {
        return (Map) getRevenue(new Object[]{this}, -846475554, 846475554, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFf1wSDK aFf1wSDK = (AFf1wSDK) objArr[0];
        registerClient = (AFKeystoreWrapper + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFi1hSDK currencyIso4217Code = aFf1wSDK.hashCode.getCurrencyIso4217Code();
        if (currencyIso4217Code == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(currencyIso4217Code.AFAdRevenueData));
        linkedHashMap2.put("ttr_millis", Long.valueOf(currencyIso4217Code.getRevenue));
        String str = currencyIso4217Code.getCurrencyIso4217Code;
        if (str != null) {
            int i4 = AFKeystoreWrapper + 117;
            registerClient = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                linkedHashMap2.put("pia_token", str);
                throw null;
            }
            linkedHashMap2.put("pia_token", str);
        }
        String str2 = currencyIso4217Code.getMonetizationNetwork;
        if (str2 != null) {
            registerClient = (AFKeystoreWrapper + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
            linkedHashMap2.put("error_code", str2);
            registerClient = (AFKeystoreWrapper + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        linkedHashMap.put("pia", linkedHashMap2);
        return linkedHashMap;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i4, int i5, int i6) {
        return getCurrencyIso4217Code(objArr);
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    protected final void AFAdRevenueData(int i4) {
        int i5 = registerClient + 69;
        AFKeystoreWrapper = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        int i4 = (registerClient + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFKeystoreWrapper = i4;
        registerClient = (i4 + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return false;
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        registerClient = (AFKeystoreWrapper + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        AFKeystoreWrapper = (registerClient + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
        long millis = TimeUnit.MINUTES.toMillis(1L);
        AFKeystoreWrapper = (registerClient + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return millis;
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFf1rSDK
    protected final void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        Object[] objArr = new Object[1];
        a((byte) (View.resolveSize(0, 0) + 107), "\u0005\u0006\u0001\u0005\u0001\u0004\u0000\u0003\u0005\u0004\u0002\u0004", 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), String.valueOf(new Date().getTime()));
        super.AFAdRevenueData(aFh1rSDK);
        areAllFieldsValid(aFh1rSDK);
        AFg1qSDK aFg1qSDK = this.toString;
        Map<String, Object> map2 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        aFg1qSDK.getRevenue(map2, this.equals.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0), this.equals.getMonetizationNetwork.AFAdRevenueData("appsFlyerInAppEventCount", 0));
        int i4 = registerClient + InterfaceC1490j3.d.b.f16817i;
        AFKeystoreWrapper = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1wSDK(AFi1fSDK aFi1fSDK, AFc1pSDK aFc1pSDK, AFc1dSDK aFc1dSDK, AFh1eSDK aFh1eSDK) {
        super(aFh1eSDK, aFc1dSDK);
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(aFh1eSDK, "");
        this.hashCode = aFi1fSDK;
        this.equals = aFc1pSDK;
        this.getCurrencyIso4217Code.add(AFe1mSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1wSDK(AFi1fSDK aFi1fSDK, AFc1pSDK aFc1pSDK, AFc1dSDK aFc1dSDK) {
        this(aFi1fSDK, aFc1pSDK, aFc1dSDK, null, 8, null);
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
    }
}
