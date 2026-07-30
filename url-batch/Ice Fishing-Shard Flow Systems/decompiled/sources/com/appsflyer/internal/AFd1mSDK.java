package com.appsflyer.internal;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class AFd1mSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static long component3 = 0;
    private static int copy = 1;
    private static char equals;
    private static String getCurrencyIso4217Code;
    public static String getRevenue;
    private static int toString;
    private final AppsFlyerProperties AFAdRevenueData;
    private final AFf1kSDK areAllFieldsValid;
    private final AFe1vSDK component1;
    private final AFj1kSDK component4;
    private final AFc1kSDK getMediationNetwork;
    private final AFd1oSDK getMonetizationNetwork;

    static {
        getMediationNetwork();
        getRevenue = "https://%sgcdsdk.%s/install_data/v5.0/";
        getCurrencyIso4217Code = "https://%sonelink.%s/shortlink-sdk/v2";
        toString = (copy + 37) % 128;
    }

    public AFd1mSDK(AFd1oSDK aFd1oSDK, AFc1kSDK aFc1kSDK, AppsFlyerProperties appsFlyerProperties, AFe1vSDK aFe1vSDK, AFj1kSDK aFj1kSDK, AFf1kSDK aFf1kSDK) {
        this.getMonetizationNetwork = aFd1oSDK;
        this.getMediationNetwork = aFc1kSDK;
        this.AFAdRevenueData = appsFlyerProperties;
        this.component1 = aFe1vSDK;
        this.component4 = aFj1kSDK;
        this.areAllFieldsValid = aFf1kSDK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i2, String str2, char c7, String str3, Object[] objArr) {
        char[] cArr;
        int i5 = $11 + 17;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        char[] charArray = str3 != 0 ? str3.toCharArray() : str3;
        if (str2 != null) {
            cArr = str2.toCharArray();
            $11 = ($10 + 45) % 128;
        } else {
            cArr = str2;
        }
        char[] cArr2 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        int length = charArray2.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray2, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c7);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = charArray.length;
        char[] cArr5 = new char[length3];
        aFk1hSDK.AFAdRevenueData = 0;
        while (true) {
            int i7 = aFk1hSDK.AFAdRevenueData;
            if (i7 >= length3) {
                objArr[0] = new String(cArr5);
                return;
            }
            $11 = ($10 + 105) % 128;
            int i8 = (i7 + 3) % 4;
            int i9 = cArr3[i7 % 4] * 32718;
            char c8 = cArr4[(i7 + 2) % 4];
            char c9 = (char) ((i9 + c8) % 65535);
            aFk1hSDK.getCurrencyIso4217Code = c9;
            cArr4[i8] = (char) (((cArr3[i8] * 32718) + c8) / 65535);
            cArr3[i8] = c9;
            cArr5[i7] = (char) ((((charArray[i7] ^ c9) ^ (component3 ^ 3492843682015808844L)) ^ ((int) (component2 ^ 3492843682015808844L))) ^ ((char) (equals ^ 3492843682015808844L)));
            aFk1hSDK.AFAdRevenueData = i7 + 1;
        }
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i2, int i5, int i7) {
        int i8 = ((~(i2 | i5 | i7)) * (-301)) + (i5 * 302) + (i2 * (-300));
        int i9 = ~i5;
        int i10 = (((~((~i2) | i7)) | i9) * 301) + (((~(i9 | i7)) | (~((~i7) | i2))) * (-301)) + i8;
        return i10 != 1 ? i10 != 2 ? getMediationNetwork(objArr) : getMonetizationNetwork(objArr) : getCurrencyIso4217Code(objArr);
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        String revenue;
        String revenue2;
        AFd1mSDK aFd1mSDK = (AFd1mSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        try {
            Object[] objArr2 = {map, str};
            Map map2 = AFa1kSDK.f4295i;
            Object obj = map2.get(-1325765758);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getMediationNetwork((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 197 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-1325765758, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr2);
            int i2 = copy + 23;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                AFj1kSDK aFj1kSDK = aFd1mSDK.component4;
                throw null;
            }
            AFj1kSDK aFj1kSDK2 = aFd1mSDK.component4;
            if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").c(str2) || new Regex("3.?(\\d+)?.?(\\d+)").c(str2)) {
                toString = (copy + 1) % 128;
                revenue = aFj1kSDK2.getMonetizationNetwork.getRevenue("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            } else {
                revenue = aFj1kSDK2.getMonetizationNetwork.getRevenue("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
            }
            revenue2 = aFj1kSDK2.getRevenue(aFj1kSDK2.AFAdRevenueData(revenue), false);
            return aFd1mSDK.getRevenue(new AFd1cSDK(revenue2, bArr, "POST", Collections.EMPTY_MAP, true), new AFd1aSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String revenue;
        String revenue2;
        AFd1mSDK aFd1mSDK = (AFd1mSDK) objArr[0];
        AFh1sSDK aFh1sSDK = (AFh1sSDK) objArr[1];
        try {
            try {
                Object[] objArr2 = {aFh1sSDK, (String) objArr[2], (AFc1fSDK) objArr[3]};
                Map map = AFa1kSDK.f4295i;
                Object obj = map.get(-191513370);
                if (obj == null) {
                    obj = ((Class) AFa1kSDK.getMediationNetwork((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 37, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 196)).getMethod("AFAdRevenueData", AFh1sSDK.class, String.class, AFc1fSDK.class);
                    map.put(-191513370, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr2);
                aFd1mSDK.getMonetizationNetwork(aFh1sSDK, bArr);
                AFj1kSDK aFj1kSDK = aFd1mSDK.component4;
                Intrinsics.checkNotNullParameter(aFh1sSDK, "");
                boolean AFAdRevenueData = aFh1sSDK.AFAdRevenueData();
                boolean z7 = aFh1sSDK instanceof AFh1qSDK;
                boolean z8 = aFh1sSDK instanceof AFh1nSDK;
                boolean z9 = aFh1sSDK instanceof AFh1pSDK;
                boolean z10 = aFh1sSDK instanceof AFh1hSDK;
                boolean z11 = aFh1sSDK instanceof AFh1fSDK;
                boolean z12 = aFh1sSDK instanceof AFf1aSDK;
                if (aFh1sSDK instanceof AFh1eSDK) {
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
                } else if (z9 || z8) {
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.getCurrencyIso4217Code);
                } else if (z7) {
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.AFAdRevenueData);
                } else if (z10) {
                    toString = (copy + 9) % 128;
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.component1);
                } else {
                    if (z11) {
                        int i2 = copy + 93;
                        toString = i2 % 128;
                        if (i2 % 2 != 0) {
                            aFj1kSDK.getMonetizationNetwork.getRevenue("https://%ssdk-services.%s/validate-android-signature");
                            throw null;
                        }
                        revenue2 = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%ssdk-services.%s/validate-android-signature");
                        AFd1fSDK revenue3 = aFd1mSDK.getRevenue(new AFd1cSDK(revenue2, bArr, "POST", aFh1sSDK.getRevenue, aFh1sSDK.getMediationNetwork()), new AFd1aSDK());
                        copy = (toString + 123) % 128;
                        return revenue3;
                    }
                    if (z12) {
                        revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.component3);
                    } else if (!AFAdRevenueData) {
                        revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.component4);
                    } else if (aFh1sSDK.component1 < 2) {
                        revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.getRevenue);
                        toString = (copy + 25) % 128;
                    } else {
                        revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.component2);
                    }
                }
                revenue2 = aFj1kSDK.getRevenue(AFj1kSDK.getMediationNetwork(aFj1kSDK.AFAdRevenueData(revenue), z7), z12);
                AFd1fSDK revenue32 = aFd1mSDK.getRevenue(new AFd1cSDK(revenue2, bArr, "POST", aFh1sSDK.getRevenue, aFh1sSDK.getMediationNetwork()), new AFd1aSDK());
                copy = (toString + 123) % 128;
                return revenue32;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    public final AFd1fSDK<AFh1cSDK> AFAdRevenueData(boolean z7, boolean z8, String str, int i2) {
        String str2;
        String str3;
        AFe1vSDK aFe1vSDK = this.component1;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = !z7 ? AFe1vSDK.getMonetizationNetwork : AFe1vSDK.getMediationNetwork;
        if (!z8) {
            str2 = "";
        } else {
            toString = (copy + 47) % 128;
            str2 = "stg";
        }
        if (AFe1vSDK.getMediationNetwork()) {
            copy = (toString + 121) % 128;
            str3 = (String) aFe1vSDK.getRevenue.getValue();
        } else {
            str3 = "";
        }
        String format = String.format(str4, Arrays.copyOf(new Object[]{str3, str2, aFe1vSDK.getCurrencyIso4217Code(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFd1cSDK aFd1cSDK = new AFd1cSDK(format, "GET");
        aFd1cSDK.areAllFieldsValid = 1500;
        return getRevenue(aFd1cSDK, new AFd1eSDK());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1fSDK<String> getRevenue(Map<String, Object> map, String str) {
        byte[] bArr;
        int i2;
        int i5 = toString + 5;
        copy = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1kSDK.f4295i;
                    Object obj = map2.get(-1325765758);
                    if (obj == null) {
                        obj = ((Class) AFa1kSDK.getMediationNetwork((char) Gravity.getAbsoluteGravity(0, 0), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 197 - TextUtils.getOffsetBefore("", 0))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                        map2.put(-1325765758, obj);
                    }
                    bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                    int i7 = 17 / 0;
                    byte[] bArr2 = bArr;
                    AFj1kSDK aFj1kSDK = this.component4;
                    AFd1fSDK<String> revenue = getRevenue(new AFd1cSDK(aFj1kSDK.AFAdRevenueData(aFj1kSDK.getMonetizationNetwork.getRevenue("https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id=")), bArr2, "POST", Collections.EMPTY_MAP, true), new AFd1aSDK());
                    i2 = toString + 99;
                    copy = i2 % 128;
                    if (i2 % 2 == 0) {
                        return revenue;
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1kSDK.f4295i;
                Object obj2 = map3.get(-1325765758);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1kSDK.getMediationNetwork((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 196 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    map3.put(-1325765758, obj2);
                }
                bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                byte[] bArr22 = bArr;
                AFj1kSDK aFj1kSDK2 = this.component4;
                AFd1fSDK<String> revenue2 = getRevenue(new AFd1cSDK(aFj1kSDK2.AFAdRevenueData(aFj1kSDK2.getMonetizationNetwork.getRevenue("https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id=")), bArr22, "POST", Collections.EMPTY_MAP, true), new AFd1aSDK());
                i2 = toString + 99;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
    }

    public final AFd1fSDK<String> getCurrencyIso4217Code(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", (Map) getCurrencyIso4217Code(new Object[]{this}, 27881414, -27881413, System.identityHashCode(this)));
        if (str2 != null) {
            int i2 = toString + 41;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                hashMap.put("brand_domain", str2);
                int i5 = 97 / 0;
            } else {
                hashMap.put("brand_domain", str2);
            }
            copy = (toString + 13) % 128;
        }
        String jSONObject = AFg1lSDK.getMonetizationNetwork(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a("縡⪔뽔ᒪ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "⍱\uf17a美꺶嚡ᗰ\uf25c藛鳡䢿\u2456擥", objArr);
        hashMap2.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, obj, "POST", jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getMediationNetwork().getHostName()));
        sb.append("/");
        sb.append(str);
        return AFAdRevenueData(new AFd1cSDK(sb.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), new AFd1aSDK(), true);
    }

    public final AFd1nSDK AFAdRevenueData(Map<String, Object> map, String str) {
        copy = (toString + 61) % 128;
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1kSDK.f4295i;
                Object obj = map2.get(-1325765758);
                if (obj == null) {
                    obj = ((Class) AFa1kSDK.getMediationNetwork((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 197)).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    map2.put(-1325765758, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr != null) {
                    return new AFd1nSDK(this.getMediationNetwork, bArr);
                }
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                int i2 = copy + 7;
                toString = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    public final AFd1fSDK<Map<String, Object>> getRevenue(String str, String str2) {
        AFd1fSDK<Map<String, Object>> revenue = getRevenue(AFd1iSDK.getMonetizationNetwork(this.getMediationNetwork.getRevenue.getCurrencyIso4217Code.getPackageName(), AFb1iSDK.getCurrencyIso4217Code(this.getMediationNetwork.getCurrencyIso4217Code), str, str2), new AFd1gSDK());
        int i2 = toString + 91;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    public final AFd1fSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2) {
        String revenue;
        String revenue2;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1kSDK.f4295i;
            Object obj = map2.get(-1325765758);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getMediationNetwork((char) (ViewConfiguration.getEdgeSlop() >> 16), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), Gravity.getAbsoluteGravity(0, 0) + 197)).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-1325765758, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            copy = (toString + 51) % 128;
            AFj1kSDK aFj1kSDK = this.component4;
            if (str2 != null && str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").c(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").c(str2)) {
                revenue = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
            } else {
                copy = (toString + 33) % 128;
                revenue = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            }
            revenue2 = aFj1kSDK.getRevenue(aFj1kSDK.AFAdRevenueData(revenue), false);
            return getRevenue(new AFd1cSDK(revenue2, bArr, "POST", Collections.EMPTY_MAP, true), new AFd1aSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    private boolean AFAdRevenueData() {
        int i2 = toString + 49;
        copy = i2 % 128;
        if (i2 % 2 != 0 ? this.AFAdRevenueData.getBoolean(AppsFlyerProperties.HTTP_CACHE, true) : this.AFAdRevenueData.getBoolean(AppsFlyerProperties.HTTP_CACHE, false)) {
            return false;
        }
        toString = (copy + 107) % 128;
        return true;
    }

    private <T> AFd1fSDK<T> AFAdRevenueData(AFd1cSDK aFd1cSDK, AFe1wSDK<T> aFe1wSDK, boolean z7) {
        aFd1cSDK.getCurrencyIso4217Code = z7;
        AFd1oSDK aFd1oSDK = this.getMonetizationNetwork;
        AFd1fSDK<T> aFd1fSDK = new AFd1fSDK<>(aFd1cSDK, aFd1oSDK.getMonetizationNetwork, aFd1oSDK.getRevenue, aFe1wSDK);
        int i2 = toString + 29;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return aFd1fSDK;
        }
        throw null;
    }

    public final AFd1fSDK<String> getCurrencyIso4217Code(String str) {
        AFd1cSDK aFd1cSDK = new AFd1cSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFd1cSDK.areAllFieldsValid = 10000;
        aFd1cSDK.getMonetizationNetwork = false;
        AFd1fSDK<String> revenue = getRevenue(aFd1cSDK, new AFd1aSDK());
        int i2 = copy + 123;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    public final AFd1fSDK<String> getRevenue(AFh1jSDK aFh1jSDK) {
        AFd1fSDK<String> revenue = getRevenue(new AFd1cSDK(aFh1jSDK.component3, aFh1jSDK.getCurrencyIso4217Code(), "POST", aFh1jSDK.getRevenue, true), new AFd1aSDK());
        int i2 = toString + 111;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1mSDK aFd1mSDK = (AFd1mSDK) objArr[0];
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.18.0");
        hashMap.put("counter", Integer.valueOf(aFd1mSDK.getMediationNetwork.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr2 = new Object[1];
        a("糯\uf4ba醲ᕼ", View.resolveSizeAndState(0, 0, 0) - 1292584324, "\u0000\u0000\u0000\u0000", (char) (TextUtils.lastIndexOf("", '0', 0) + 31890), "鷋蝗\uebe1黗⟿", objArr2);
        hashMap.put(((String) objArr2[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        hashMap.put("app_version_name", aFd1mSDK.getMediationNetwork.n_().versionName);
        hashMap.put("app_id", aFd1mSDK.getMediationNetwork.getRevenue.getCurrencyIso4217Code.getPackageName());
        hashMap.put("platformextension", new AFa1vSDK().getRevenue());
        int i2 = copy + 115;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    private <T> AFd1fSDK<T> getRevenue(AFd1cSDK aFd1cSDK, AFe1wSDK<T> aFe1wSDK) {
        int i2 = copy + 25;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            AFd1fSDK<T> AFAdRevenueData = AFAdRevenueData(aFd1cSDK, aFe1wSDK, AFAdRevenueData());
            copy = (toString + 105) % 128;
            return AFAdRevenueData;
        }
        AFAdRevenueData(aFd1cSDK, aFe1wSDK, AFAdRevenueData());
        throw null;
    }

    private Map<String, Object> getRevenue() {
        return (Map) getCurrencyIso4217Code(new Object[]{this}, 27881414, -27881413, System.identityHashCode(this));
    }

    public final AFd1fSDK<String> getMediationNetwork(Map<String, Object> map, String str) {
        int i2 = copy + 63;
        toString = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1kSDK.f4295i;
                    Object obj = map2.get(-1325765758);
                    if (obj == null) {
                        obj = ((Class) AFa1kSDK.getMediationNetwork((char) TextUtils.getOffsetAfter("", 0), 37 - KeyEvent.keyCodeFromString(""), 197 - KeyEvent.normalizeMetaState(0))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                        map2.put(-1325765758, obj);
                    }
                    byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                    AFj1kSDK aFj1kSDK = this.component4;
                    AFd1fSDK<String> revenue = getRevenue(new AFd1cSDK(aFj1kSDK.AFAdRevenueData(aFj1kSDK.getMonetizationNetwork.getRevenue("https://%svalidate-and-log.%s/api/v4.0/android/subscription/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1aSDK());
                    int i5 = copy + 9;
                    toString = i5 % 128;
                    if (i5 % 2 == 0) {
                        return revenue;
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1kSDK.f4295i;
                Object obj2 = map3.get(-1325765758);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1kSDK.getMediationNetwork((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), View.MeasureSpec.getSize(0) + 37, TextUtils.lastIndexOf("", '0') + 198)).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    map3.put(-1325765758, obj2);
                }
                throw null;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
        return null;
    }

    private static String getMonetizationNetwork(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String currencyIso4217Code = AFj1jSDK.getCurrencyIso4217Code(join, sb.toString());
        toString = (copy + 117) % 128;
        return currencyIso4217Code;
    }

    public final AFd1fSDK<AFa1mSDK> getCurrencyIso4217Code(AFa1pSDK aFa1pSDK) {
        AFd1fSDK<AFa1mSDK> revenue = getRevenue(new AFd1cSDK(aFa1pSDK.component3, AFg1lSDK.getMonetizationNetwork(aFa1pSDK.AFAdRevenueData).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1pSDK.getMediationNetwork()), new AFa1rSDK());
        int i2 = toString + 93;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return revenue;
    }

    private void getMonetizationNetwork(AFh1sSDK aFh1sSDK, byte[] bArr) {
        toString = (copy + 59) % 128;
        boolean mediationNetwork = this.getMediationNetwork.getMediationNetwork("com.appsflyer.security.enable");
        if (aFh1sSDK.getMonetizationNetwork() && mediationNetwork && AFf1kSDK.getRevenue(aFh1sSDK, this.getMediationNetwork)) {
            copy = (toString + 5) % 128;
            AFf1kSDK.getMonetizationNetwork(new Object[]{aFh1sSDK, bArr}, -254860318, 254860321, (int) System.currentTimeMillis());
        }
    }

    public final AFd1fSDK<Map<String, String>> getMediationNetwork(String str, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getMediationNetwork().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String obj2 = sb.toString();
        Map map = (Map) getCurrencyIso4217Code(new Object[]{this}, 27881414, -27881413, System.identityHashCode(this));
        String valueOf = String.valueOf(map.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(map.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(map.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(map.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(map.get("sdk")));
        Object[] objArr = new Object[1];
        a("縡⪔뽔ᒪ", ViewConfiguration.getFadingEdgeLength() >> 16, "\u0000\u0000\u0000\u0000", (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "⍱\uf17a美꺶嚡ᗰ\uf25c藛鳡䢿\u2456擥", objArr);
        hashMap.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, obj, "GET", obj, str, str2, valueOf));
        AFd1fSDK<Map<String, String>> revenue = getRevenue(new AFd1cSDK(obj2, null, "GET", hashMap, false), new AFd1bSDK());
        int i2 = toString + 9;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    public final AFd1fSDK<String> getMonetizationNetwork(Map<String, Object> map, String str, String str2) {
        return (AFd1fSDK) getCurrencyIso4217Code(new Object[]{this, map, str, str2}, 158494896, -158494896, System.identityHashCode(this));
    }

    public static void getMediationNetwork() {
        component3 = 3492843682015808844L;
        component2 = -1434120884;
        equals = (char) 13050;
    }

    public final AFd1fSDK<String> getMediationNetwork(AFh1sSDK aFh1sSDK, String str, AFc1fSDK aFc1fSDK) {
        return (AFd1fSDK) getCurrencyIso4217Code(new Object[]{this, aFh1sSDK, str, aFc1fSDK}, -846475552, 846475554, System.identityHashCode(this));
    }
}
