package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.ge;
import com.ironsource.jn;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
public final class AFd1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String AFAdRevenueData = null;
    private static int areAllFieldsValid = 0;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copy = 0;
    private static byte[] copydefault = null;
    private static String getRevenue = null;
    private static int hashCode = 1;
    private static short[] toString;
    private final AFj1fSDK component2;
    private final AFe1zSDK component4;
    private final AFc1pSDK getCurrencyIso4217Code;
    private final AppsFlyerProperties getMediationNetwork;
    private final AFd1lSDK getMonetizationNetwork;

    static {
        getMonetizationNetwork();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
        int i4 = hashCode + 37;
        copy = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public AFd1oSDK(AFd1lSDK aFd1lSDK, AFc1pSDK aFc1pSDK, AppsFlyerProperties appsFlyerProperties, AFe1zSDK aFe1zSDK, AFj1fSDK aFj1fSDK) {
        this.getMonetizationNetwork = aFd1lSDK;
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.getMediationNetwork = appsFlyerProperties;
        this.component4 = aFe1zSDK;
        this.component2 = aFj1fSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
    
        if (r2 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b4, short s4, int i4, int i5, int i6, Object[] objArr) {
        int i7;
        int i8;
        int i9;
        int length;
        byte[] bArr;
        int i10;
        AFk1lSDK aFk1lSDK = new AFk1lSDK();
        StringBuilder sb = new StringBuilder();
        int i11 = i4 + ((int) (areAllFieldsValid ^ (-612162971269904352L)));
        boolean z4 = i11 == -1;
        if (z4) {
            int i12 = ($11 + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
            $10 = i12;
            byte[] bArr2 = copydefault;
            if (bArr2 != null) {
                int i13 = i12 + 95;
                $11 = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i13 % 2 == 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i10 = 1;
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i10 = 0;
                }
                while (i10 < length) {
                    bArr[i10] = (byte) (bArr2[i10] ^ (-612162971269904352L));
                    i10++;
                }
                bArr2 = bArr;
            }
            i11 = bArr2 != null ? (byte) (((byte) (copydefault[((int) (component1 ^ (-612162971269904352L))) + i5] ^ (-612162971269904352L))) + ((int) (areAllFieldsValid ^ (-612162971269904352L)))) : (short) (((short) (toString[((int) (component1 ^ (-612162971269904352L))) + i5] ^ (-612162971269904352L))) + ((int) (areAllFieldsValid ^ (-612162971269904352L))));
        }
        if (i11 > 0) {
            int i14 = $11 + 55;
            $10 = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i14 % 2 != 0) {
                i7 = ((i5 - i11) >> 5) << ((int) (component1 & (-612162971269904352L)));
            } else {
                i7 = ((i5 + i11) - 2) + ((int) (component1 ^ (-612162971269904352L)));
            }
            aFk1lSDK.getCurrencyIso4217Code = i7 + i8;
            char c4 = (char) (i6 + ((int) (component3 ^ (-612162971269904352L))));
            aFk1lSDK.getMediationNetwork = c4;
            sb.append(c4);
            aFk1lSDK.AFAdRevenueData = aFk1lSDK.getMediationNetwork;
            byte[] bArr3 = copydefault;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i15 = 0; i15 < length2; i15++) {
                    bArr4[i15] = (byte) (bArr3[i15] ^ (-612162971269904352L));
                }
                bArr3 = bArr4;
            }
            boolean z5 = bArr3 != null;
            aFk1lSDK.getRevenue = 1;
            while (aFk1lSDK.getRevenue < i11) {
                if (z5) {
                    int i16 = $11 + 125;
                    $10 = i16 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i16 % 2 != 0) {
                        byte[] bArr5 = copydefault;
                        aFk1lSDK.getCurrencyIso4217Code = aFk1lSDK.getCurrencyIso4217Code;
                        i9 = aFk1lSDK.AFAdRevenueData % (((byte) (((byte) (bArr5[r8] - (-612162971269904352L))) % s4)) ^ b4);
                    } else {
                        byte[] bArr6 = copydefault;
                        aFk1lSDK.getCurrencyIso4217Code = aFk1lSDK.getCurrencyIso4217Code - 1;
                        i9 = aFk1lSDK.AFAdRevenueData + (((byte) (((byte) (bArr6[r8] ^ (-612162971269904352L))) + s4)) ^ b4);
                    }
                    aFk1lSDK.getMediationNetwork = (char) i9;
                } else {
                    short[] sArr = toString;
                    aFk1lSDK.getCurrencyIso4217Code = aFk1lSDK.getCurrencyIso4217Code - 1;
                    aFk1lSDK.getMediationNetwork = (char) (aFk1lSDK.AFAdRevenueData + (((short) (((short) (sArr[r8] ^ (-612162971269904352L))) + s4)) ^ b4));
                }
                sb.append(aFk1lSDK.getMediationNetwork);
                aFk1lSDK.AFAdRevenueData = aFk1lSDK.getMediationNetwork;
                aFk1lSDK.getRevenue++;
            }
        }
        objArr[0] = sb.toString();
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i4, int i5, int i6) {
        String str;
        String str2;
        String str3;
        int i7 = ~i4;
        int i8 = (i4 * (-520)) + (i5 * 522) + ((~(i7 | i5 | i6)) * 521);
        int i9 = ~(i4 | (~i5));
        int i10 = i8 + (i9 * (-1042)) + ((i9 | (~(i5 | (~i6) | i7))) * 521);
        if (i10 == 1) {
            AFd1oSDK aFd1oSDK = (AFd1oSDK) objArr[0];
            AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
            AFd1nSDK revenue = aFd1oSDK.getRevenue(new AFd1cSDK(aFh1mSDK.component1, aFh1mSDK.AFAdRevenueData(), jn.f16865b, Collections.EMPTY_MAP, true), new AFd1eSDK());
            hashCode = (copy + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return revenue;
        }
        if (i10 != 2) {
            AFd1oSDK aFd1oSDK2 = (AFd1oSDK) objArr[0];
            HashMap hashMap = new HashMap();
            hashMap.put("build_number", "6.17.0");
            hashMap.put("counter", Integer.valueOf(aFd1oSDK2.getCurrencyIso4217Code.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0)));
            hashMap.put("model", Build.MODEL);
            Object[] objArr2 = new Object[1];
            a((byte) (83 - MotionEvent.axisFromString("")), (short) (Gravity.getAbsoluteGravity(0, 0) + 43), (-88) - ((Process.getThreadPriority(0) + 20) >> 6), MotionEvent.axisFromString("") + 2017627781, KeyEvent.keyCodeFromString("") + 1432018452, objArr2);
            hashMap.put(((String) objArr2[0]).intern(), Build.BRAND);
            hashMap.put(ge.f16386A1, Integer.toString(Build.VERSION.SDK_INT));
            Context context = aFd1oSDK2.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork;
            hashMap.put(CommonUrlParts.APP_VERSION, AFj1iSDK.getMediationNetwork(context, context.getPackageName()));
            hashMap.put("app_id", aFd1oSDK2.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork.getPackageName());
            hashMap.put("platformextension", new AFa1vSDK().getMonetizationNetwork());
            hashCode = (copy + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return hashMap;
        }
        AFd1oSDK aFd1oSDK3 = (AFd1oSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
        String str4 = (String) objArr[3];
        ((Number) objArr[4]).intValue();
        AFe1zSDK aFe1zSDK = aFd1oSDK3.component4;
        Intrinsics.checkNotNullParameter(str4, "");
        if (booleanValue) {
            str = AFe1zSDK.getRevenue;
        } else {
            str = AFe1zSDK.getMediationNetwork;
            copy = (hashCode + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (booleanValue2) {
            hashCode = (copy + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
            str2 = "stg";
        } else {
            str2 = "";
        }
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        if (AFe1zSDK.AFAdRevenueData()) {
            str3 = (String) aFe1zSDK.AFAdRevenueData.getValue();
        } else {
            copy = (hashCode + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
            str3 = "";
        }
        String format = String.format(str, Arrays.copyOf(new Object[]{str3, str2, aFe1zSDK.getMediationNetwork(), str4}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFd1cSDK aFd1cSDK = new AFd1cSDK(format, jn.f16864a);
        aFd1cSDK.component4 = 1500;
        return aFd1oSDK3.getRevenue(aFd1cSDK, new AFd1bSDK());
    }

    private Map<String, Object> getMediationNetwork() {
        return (Map) getCurrencyIso4217Code(new Object[]{this}, -1717475171, 1717475171, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        if (r14.length() == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        com.appsflyer.internal.AFd1oSDK.hashCode = (com.appsflyer.internal.AFd1oSDK.copy + 75) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        if (new kotlin.text.Regex("4.?(\\d+)?.?(\\d+)").d(r14) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        if (new kotlin.text.Regex("3.?(\\d+)?.?(\\d+)").d(r14) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a2, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r14.length() == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1nSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2) {
        String revenue;
        try {
            boolean z4 = true;
            Object[] objArr = {map, str};
            Map map2 = AFa1kSDK.f13355i;
            Object obj = map2.get(317123644);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getCurrencyIso4217Code((ViewConfiguration.getLongPressTimeout() >> 16) + 196, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("getMediationNetwork", Map.class, String.class);
                map2.put(317123644, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            int i4 = hashCode;
            copy = (i4 + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFj1fSDK aFj1fSDK = this.component2;
            if (str2 != null) {
                int i5 = i4 + 119;
                copy = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i5 % 2 != 0) {
                    int i6 = 83 / 0;
                }
            }
            revenue = aFj1fSDK.getRevenue(aFj1fSDK.getCurrencyIso4217Code(!z4 ? aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=") : aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription?app_id=")), false);
            AFd1nSDK<String> revenue2 = getRevenue(new AFd1cSDK(revenue, bArr, jn.f16865b, Collections.EMPTY_MAP, true), new AFd1eSDK());
            int i7 = hashCode + 33;
            copy = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i7 % 2 == 0) {
                return revenue2;
            }
            throw null;
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

    public final AFd1nSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        hashCode = (copy + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1kSDK.f13355i;
            Object obj = map2.get(317123644);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getCurrencyIso4217Code(Gravity.getAbsoluteGravity(0, 0) + 196, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 37 - TextUtils.getOffsetAfter("", 0))).getMethod("getMediationNetwork", Map.class, String.class);
                map2.put(317123644, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            hashCode = (copy + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFj1fSDK aFj1fSDK = this.component2;
            return getRevenue(new AFd1cSDK(aFj1fSDK.getCurrencyIso4217Code(aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr, jn.f16865b, Collections.EMPTY_MAP, true), new AFd1eSDK());
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

    public final AFd1nSDK<Map<String, Object>> getRevenue(String str, String str2) {
        AFd1nSDK<Map<String, Object>> revenue = getRevenue(AFd1fSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork.getPackageName(), AFb1iSDK.getRevenue(this.getCurrencyIso4217Code.getMonetizationNetwork), str, str2), new AFd1iSDK());
        copy = (hashCode + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return revenue;
    }

    public final AFd1nSDK<String> getMediationNetwork(AFh1mSDK aFh1mSDK) {
        return (AFd1nSDK) getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, -44698683, 44698684, System.identityHashCode(this));
    }

    public final AFd1nSDK<Map<String, String>> getRevenue(String str, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String obj2 = sb.toString();
        Map map = (Map) getCurrencyIso4217Code(new Object[]{this}, -1717475171, 1717475171, System.identityHashCode(this));
        String valueOf = String.valueOf(map.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(map.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(map.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(map.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(map.get(ge.f16386A1)));
        Object[] objArr = new Object[1];
        a((byte) (88 - Color.green(0)), (short) (22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-88) - Gravity.getAbsoluteGravity(0, 0), Drawable.resolveOpacity(0, 0) + 2017627768, 1432018418 - ImageFormat.getBitsPerPixel(0), objArr);
        hashMap.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, obj, jn.f16864a, obj, str, str2, valueOf));
        AFd1nSDK<Map<String, String>> revenue = getRevenue(new AFd1cSDK(obj2, null, jn.f16864a, hashMap, false), new AFd1dSDK());
        hashCode = (copy + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return revenue;
    }

    public final AFd1nSDK<String> getMonetizationNetwork(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put(CommonUrlParts.UUID, obj);
        hashMap.put("data", map);
        hashMap.put("meta", (Map) getCurrencyIso4217Code(new Object[]{this}, -1717475171, 1717475171, System.identityHashCode(this)));
        if (str2 != null) {
            int i4 = hashCode + 81;
            copy = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                hashMap.put("brand_domain", str2);
                int i5 = 19 / 0;
            } else {
                hashMap.put("brand_domain", str2);
            }
            hashCode = (copy + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        String jSONObject = AFg1lSDK.getCurrencyIso4217Code(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a((byte) (88 - TextUtils.indexOf("", "", 0)), (short) (((Process.getThreadPriority(0) + 20) >> 6) + 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 88, Color.rgb(0, 0, 0) + 2034404984, 1432018419 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        hashMap2.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, obj, jn.f16865b, jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getCurrencyIso4217Code().getHostName()));
        sb.append("/");
        sb.append(str);
        AFd1nSDK<String> revenue = getRevenue(new AFd1cSDK(sb.toString(), jSONObject.getBytes(Charset.defaultCharset()), jn.f16865b, hashMap2, false), new AFd1eSDK(), true);
        int i6 = hashCode + 67;
        copy = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            int i7 = 99 / 0;
        }
        return revenue;
    }

    public final AFd1nSDK<AFa1mSDK> AFAdRevenueData(AFa1pSDK aFa1pSDK) {
        AFd1nSDK<AFa1mSDK> revenue = getRevenue(new AFd1cSDK(aFa1pSDK.component1, AFg1lSDK.getCurrencyIso4217Code(aFa1pSDK.AFAdRevenueData).toString().getBytes(Charset.defaultCharset()), jn.f16865b, Collections.EMPTY_MAP, aFa1pSDK.getMonetizationNetwork()), new AFa1rSDK());
        int i4 = hashCode + 91;
        copy = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return revenue;
    }

    public final AFd1nSDK<String> getRevenue(String str) {
        AFd1cSDK aFd1cSDK = new AFd1cSDK(str, null, jn.f16864a, Collections.EMPTY_MAP, false);
        aFd1cSDK.component4 = 10000;
        aFd1cSDK.getCurrencyIso4217Code = false;
        AFd1nSDK<String> revenue = getRevenue(aFd1cSDK, new AFd1eSDK());
        int i4 = hashCode + 19;
        copy = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    public final AFd1mSDK getRevenue(Map<String, Object> map, String str) {
        copy = (hashCode + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1kSDK.f13355i;
                Object obj = map2.get(317123644);
                if (obj == null) {
                    obj = ((Class) AFa1kSDK.getCurrencyIso4217Code(197 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 38)).getMethod("getMediationNetwork", Map.class, String.class);
                    map2.put(317123644, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                    return null;
                }
                copy = (hashCode + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return new AFd1mSDK(this.getCurrencyIso4217Code, bArr);
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

    private static String getMonetizationNetwork(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String revenue = AFj1cSDK.getRevenue(join, sb.toString());
        int i4 = hashCode + 41;
        copy = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private <T> AFd1nSDK<T> getRevenue(AFd1cSDK aFd1cSDK, AFe1ySDK<T> aFe1ySDK) {
        AFd1nSDK<T> revenue;
        int i4 = hashCode + 69;
        copy = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            revenue = getRevenue(aFd1cSDK, aFe1ySDK, getRevenue());
            int i5 = 32 / 0;
        } else {
            revenue = getRevenue(aFd1cSDK, aFe1ySDK, getRevenue());
        }
        int i6 = hashCode + 71;
        copy = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1nSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, String str2) {
        String AFAdRevenueData2;
        String revenue;
        int i4;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1kSDK.f13355i;
            Object obj = map2.get(317123644);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getCurrencyIso4217Code(196 - View.combineMeasuredStates(0, 0), (char) View.resolveSize(0, 0), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod("getMediationNetwork", Map.class, String.class);
                map2.put(317123644, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            int i5 = hashCode;
            copy = (i5 + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFj1fSDK aFj1fSDK = this.component2;
            if (str2 != null) {
                copy = (i5 + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").d(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").d(str2)) {
                    AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                    revenue = aFj1fSDK.getRevenue(aFj1fSDK.getCurrencyIso4217Code(AFAdRevenueData2), false);
                    AFd1nSDK<String> revenue2 = getRevenue(new AFd1cSDK(revenue, bArr, jn.f16865b, Collections.EMPTY_MAP, true), new AFd1eSDK());
                    i4 = hashCode + 67;
                    copy = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i4 % 2 != 0) {
                        int i6 = 46 / 0;
                    }
                    return revenue2;
                }
            }
            copy = (hashCode + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            revenue = aFj1fSDK.getRevenue(aFj1fSDK.getCurrencyIso4217Code(AFAdRevenueData2), false);
            AFd1nSDK<String> revenue22 = getRevenue(new AFd1cSDK(revenue, bArr, jn.f16865b, Collections.EMPTY_MAP, true), new AFd1eSDK());
            i4 = hashCode + 67;
            copy = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
            }
            return revenue22;
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

    static void getMonetizationNetwork() {
        component1 = -411944536;
        areAllFieldsValid = 1624197239;
        component3 = -898995602;
        copydefault = new byte[]{-107, -75, -81, 99, 21, -75, 105, -80, 24, 72, -87, 71, -114, 87, 14, -80, 57};
    }

    private boolean getRevenue() {
        if (this.getMediationNetwork.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        int i4 = copy;
        int i5 = i4 + 107;
        hashCode = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean z4 = !(i5 % 2 == 0);
        hashCode = (i4 + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return z4;
    }

    private <T> AFd1nSDK<T> getRevenue(AFd1cSDK aFd1cSDK, AFe1ySDK<T> aFe1ySDK, boolean z4) {
        aFd1cSDK.getMediationNetwork = z4;
        AFd1lSDK aFd1lSDK = this.getMonetizationNetwork;
        AFd1nSDK<T> aFd1nSDK = new AFd1nSDK<>(aFd1cSDK, aFd1lSDK.getRevenue, aFd1lSDK.getMonetizationNetwork, aFe1ySDK);
        copy = (hashCode + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFd1nSDK;
    }

    public final AFd1nSDK<AFi1wSDK> getRevenue(boolean z4, boolean z5, String str, int i4) {
        return (AFd1nSDK) getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z4), Boolean.valueOf(z5), str, Integer.valueOf(i4)}, 662152322, -662152320, i4);
    }

    public final AFd1nSDK<String> getCurrencyIso4217Code(AFh1rSDK aFh1rSDK, String str, AFc1iSDK aFc1iSDK) {
        String AFAdRevenueData2;
        String AFAdRevenueData3;
        try {
            Object[] objArr = {aFh1rSDK, str, aFc1iSDK};
            Map map = AFa1kSDK.f13355i;
            Object obj = map.get(-1609157430);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getCurrencyIso4217Code(TextUtils.indexOf("", "", 0, 0) + 196, (char) KeyEvent.normalizeMetaState(0), 37 - TextUtils.indexOf("", "", 0, 0))).getMethod("getMonetizationNetwork", AFh1rSDK.class, String.class, AFc1iSDK.class);
                map.put(-1609157430, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            hashCode = (copy + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFj1fSDK aFj1fSDK = this.component2;
            Intrinsics.checkNotNullParameter(aFh1rSDK, "");
            boolean mediationNetwork = aFh1rSDK.getMediationNetwork();
            boolean z4 = aFh1rSDK instanceof AFh1lSDK;
            boolean z5 = aFh1rSDK instanceof AFh1jSDK;
            boolean z6 = aFh1rSDK instanceof AFh1kSDK;
            boolean z7 = aFh1rSDK instanceof AFi1zSDK;
            boolean z8 = aFh1rSDK instanceof AFh1gSDK;
            boolean z9 = aFh1rSDK instanceof AFg1wSDK;
            if (aFh1rSDK instanceof AFh1eSDK) {
                AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
                copy = (hashCode + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                if (!z6) {
                    int i4 = hashCode + 19;
                    int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    copy = i5;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (!z5) {
                        if (z4) {
                            int i6 = i5 + 13;
                            hashCode = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i6 % 2 != 0) {
                                AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.getCurrencyIso4217Code);
                            } else {
                                aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.getCurrencyIso4217Code);
                                throw null;
                            }
                        } else if (z7) {
                            int i7 = i5 + 7;
                            hashCode = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i7 % 2 != 0) {
                                AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.component3);
                            } else {
                                aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.component3);
                                throw null;
                            }
                        } else {
                            if (z8) {
                                AFAdRevenueData3 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%ssdk-services.%s/validate-android-signature");
                                return getRevenue(new AFd1cSDK(AFAdRevenueData3, bArr, jn.f16865b, Collections.EMPTY_MAP, aFh1rSDK.getMonetizationNetwork()), new AFd1eSDK());
                            }
                            if (z9) {
                                AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.areAllFieldsValid);
                            } else if (mediationNetwork) {
                                if (aFh1rSDK.component2 < 2) {
                                    AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.getMediationNetwork);
                                } else {
                                    AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.component1);
                                }
                            } else {
                                AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.component2);
                            }
                        }
                    }
                }
                AFAdRevenueData2 = aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.getRevenue);
            }
            AFAdRevenueData3 = aFj1fSDK.getRevenue(AFj1fSDK.AFAdRevenueData(aFj1fSDK.getCurrencyIso4217Code(AFAdRevenueData2), z4), z9);
            return getRevenue(new AFd1cSDK(AFAdRevenueData3, bArr, jn.f16865b, Collections.EMPTY_MAP, aFh1rSDK.getMonetizationNetwork()), new AFd1eSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }
}
