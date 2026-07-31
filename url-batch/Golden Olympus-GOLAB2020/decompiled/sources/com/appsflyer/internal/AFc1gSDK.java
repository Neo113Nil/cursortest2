package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFc1gSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long AFAdRevenueData = 0;
    private static int areAllFieldsValid = 1;
    private static int[] getCurrencyIso4217Code;
    private static int getMonetizationNetwork;
    private final Map<String, Object> getMediationNetwork;
    private final Context getRevenue;

    public static class AFa1vSDK {
        static byte[] getMediationNetwork(byte[] bArr) {
            for (int i4 = 0; i4 < bArr.length; i4++) {
                bArr[i4] = (byte) (bArr[i4] ^ ((i4 % 2) + 42));
            }
            return bArr;
        }

        static byte[] getMonetizationNetwork(String str) {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    static {
        getMediationNetwork();
        TextUtils.indexOf("", "");
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getScrollDefaultDelay();
        SystemClock.currentThreadTimeMillis();
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getTapTimeout();
        ExpandableListView.getPackedPositionForGroup(0);
        int i4 = getMonetizationNetwork + 5;
        areAllFieldsValid = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public AFc1gSDK(Map<String, Object> map, Context context) {
        this.getMediationNetwork = map;
        this.getRevenue = context;
        put(getMonetizationNetwork(), getCurrencyIso4217Code());
    }

    private static void a(String str, int i4, Object[] objArr) {
        int i5 = $10 + 21;
        $11 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        char[] cArr = str;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        aFk1pSDK.getMediationNetwork = i4;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1pSDK.getRevenue = 0;
        while (true) {
            int i6 = aFk1pSDK.getRevenue;
            if (i6 >= cArr2.length) {
                break;
            }
            jArr[i6] = (cArr2[i6] ^ (i6 * aFk1pSDK.getMediationNetwork)) ^ (AFAdRevenueData ^ 199061409475100049L);
            aFk1pSDK.getRevenue = i6 + 1;
        }
        char[] cArr3 = new char[length];
        aFk1pSDK.getRevenue = 0;
        while (true) {
            int i7 = aFk1pSDK.getRevenue;
            if (i7 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i8 = $11 + 97;
            int i9 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
            $10 = i9;
            if (i8 % 2 != 0) {
                cArr3[i7] = (char) jArr[i7];
            } else {
                cArr3[i7] = (char) jArr[i7];
                i7++;
            }
            aFk1pSDK.getRevenue = i7;
            $11 = (i9 + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    private static void b(int[] iArr, int i4, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getCurrencyIso4217Code;
        if (iArr2 != null) {
            $11 = ($10 + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr3[i5] = (int) (iArr2[i5] ^ 3670241895213185600L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getCurrencyIso4217Code;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                int i7 = $11 + 57;
                $10 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i7 % 2 != 0) {
                    iArr6[i6] = (int) (iArr5[i6] / 3670241895213185600L);
                    i6 >>= 1;
                } else {
                    iArr6[i6] = (int) (iArr5[i6] ^ 3670241895213185600L);
                    i6++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1kSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i8 = aFk1kSDK.getCurrencyIso4217Code;
            if (i8 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i4);
                return;
            }
            int i9 = iArr[i8];
            char c4 = (char) (i9 >> 16);
            cArr[0] = c4;
            char c5 = (char) i9;
            cArr[1] = c5;
            char c6 = (char) (iArr[i8 + 1] >> 16);
            cArr[2] = c6;
            char c7 = (char) iArr[i8 + 1];
            cArr[3] = c7;
            aFk1kSDK.AFAdRevenueData = (c4 << 16) + c5;
            aFk1kSDK.getMonetizationNetwork = (c6 << 16) + c7;
            AFk1kSDK.getMediationNetwork(iArr4);
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = aFk1kSDK.AFAdRevenueData ^ iArr4[i10];
                aFk1kSDK.AFAdRevenueData = i11;
                int AFAdRevenueData2 = AFk1kSDK.AFAdRevenueData(i11) ^ aFk1kSDK.getMonetizationNetwork;
                int i12 = aFk1kSDK.AFAdRevenueData;
                aFk1kSDK.AFAdRevenueData = AFAdRevenueData2;
                aFk1kSDK.getMonetizationNetwork = i12;
            }
            int i13 = aFk1kSDK.AFAdRevenueData;
            int i14 = aFk1kSDK.getMonetizationNetwork;
            aFk1kSDK.AFAdRevenueData = i14;
            aFk1kSDK.getMonetizationNetwork = i13;
            int i15 = i13 ^ iArr4[16];
            aFk1kSDK.getMonetizationNetwork = i15;
            int i16 = i14 ^ iArr4[17];
            aFk1kSDK.AFAdRevenueData = i16;
            cArr[0] = (char) (i16 >>> 16);
            cArr[1] = (char) i16;
            cArr[2] = (char) (i15 >>> 16);
            cArr[3] = (char) i15;
            AFk1kSDK.getMediationNetwork(iArr4);
            int i17 = aFk1kSDK.getCurrencyIso4217Code;
            cArr2[i17 * 2] = cArr[0];
            cArr2[(i17 * 2) + 1] = cArr[1];
            cArr2[(i17 * 2) + 2] = cArr[2];
            cArr2[(i17 * 2) + 3] = cArr[3];
            aFk1kSDK.getCurrencyIso4217Code = i17 + 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0289 A[Catch: Exception -> 0x02a8, TRY_LEAVE, TryCatch #1 {Exception -> 0x02a8, blocks: (B:18:0x01bc, B:20:0x0289, B:24:0x02a3, B:28:0x02aa, B:30:0x02ad, B:26:0x02b0, B:37:0x02b5), top: B:17:0x01bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getCurrencyIso4217Code() {
        String obj;
        int i4;
        String str;
        int i5;
        try {
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("ٓ䛅蝏쟵П䒊蔱얶ˎ䍊菵쁹", TextUtils.getCapsMode("", 0, 0) + 16529, objArr);
            String obj2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            b(new int[]{-2010068804, 540027562, -1611408693, 1290839385, -1409557867, 1221376410, 1124754813, -1552552339}, 15 - Drawable.resolveOpacity(0, 0), objArr2);
            String obj3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            a("\u0604䏅趱힎ᅸ嬿", KeyEvent.keyCodeFromString("") + 17881, objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new int[]{-500104792, -1719657709, -1010008550, 1926287854}, View.MeasureSpec.getMode(0) + 5, objArr4);
            String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb = new StringBuilder();
            sb.append(obj2);
            sb.append(obj3);
            sb.append(replaceAll);
            String monetizationNetwork = AFj1cSDK.getMonetizationNetwork(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(monetizationNetwork.substring(0, 16));
            obj = sb2.toString();
        } catch (Exception e4) {
            Object[] objArr5 = new Object[1];
            b(new int[]{1412659751, -1225518006, 773104622, 1068029282, -141638432, 1353047013, 1075026864, 1832361899, -1682230360, 559510922, -697688254, 1914000959, 812386368, -220880964, 205571840, 667018555, -2049150556, -1682711385, -806296611, -80359859}, (Process.myTid() >> 22) + 38, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e4);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(new int[]{-1080009004, 844403482, -683446169, 2011701581, 1233271862, -317730360, 474044529, -1279916753, -2006198622, 428775418, -984596794, -978390891, 878183437, 2057824704, 1541426602, 1401202182, -1442141497, 1653693558, -345898809, 1573805036, 244475260, 1779591003}, TextUtils.lastIndexOf("", '0') + 45, objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e4);
            AFLogger.afRDLog(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("");
            Object[] objArr7 = new Object[1];
            b(new int[]{1526111022, -471598143, -1921753797, -132556607, -1402220075, -512792088, 445237066, 69508151, 892799620, -65302862}, View.resolveSize(0, 0) + 18, objArr7);
            sb4.append(((String) objArr7[0]).intern());
            obj = sb4.toString();
        }
        String str2 = obj;
        try {
            Context context = this.getRevenue;
            Object[] objArr8 = new Object[1];
            a("ٓ⦩妼覟릉\ue992᧨䦯秳꧁\ud9d4\u09d0㤠椷饺줈更⤃奡襲른\ue905\u197e䥰碞ꢋ\ud895ࢷ㢧梬飇죑\uf8d3⣩壿蠈렂", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12276, objArr8);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            i4 = -2700;
            if (registerReceiver != null) {
                Object[] objArr9 = new Object[1];
                b(new int[]{-928491678, 1479704380, -891867092, 74755836, -1761205169, 1640230696}, TextUtils.indexOf((CharSequence) "", '0') + 12, objArr9);
                i4 = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            str = this.getRevenue.getApplicationInfo().nativeLibraryDir;
        } catch (Exception e5) {
            e = e5;
        }
        try {
            if (str != null) {
                getMonetizationNetwork = (areAllFieldsValid + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
                Object[] objArr10 = new Object[1];
                a("ي氡퉒", Gravity.getAbsoluteGravity(0, 0) + 27179, objArr10);
                if (str.contains(((String) objArr10[0]).intern())) {
                    areAllFieldsValid = (getMonetizationNetwork + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    i5 = 1;
                    Context context2 = this.getRevenue;
                    Object[] objArr11 = new Object[1];
                    b(new int[]{39584719, 152510957, 1115452019, -1177671545}, KeyEvent.keyCodeFromString("") + 6, objArr11);
                    int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
                    StringBuilder sb5 = new StringBuilder();
                    Object[] objArr12 = new Object[1];
                    b(new int[]{-262877734, -1049246313}, -TextUtils.lastIndexOf("", '0', 0), objArr12);
                    sb5.append(((String) objArr12[0]).intern());
                    sb5.append(i4);
                    Object[] objArr13 = new Object[1];
                    a("ؔ\ue32d", 58726 - ImageFormat.getBitsPerPixel(0), objArr13);
                    sb5.append(((String) objArr13[0]).intern());
                    sb5.append(i5);
                    Object[] objArr14 = new Object[1];
                    a("ؔ\uf1be", 63486 - TextUtils.lastIndexOf("", '0', 0), objArr14);
                    sb5.append(((String) objArr14[0]).intern());
                    sb5.append(size);
                    Object[] objArr15 = new Object[1];
                    b(new int[]{-400266022, -1154682097}, 1 - ImageFormat.getBitsPerPixel(0), objArr15);
                    sb5.append(((String) objArr15[0]).intern());
                    sb5.append(this.getMediationNetwork.size());
                    String obj4 = sb5.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str2);
                    byte[] mediationNetwork = AFa1vSDK.getMediationNetwork(AFa1vSDK.getMonetizationNetwork(obj4));
                    StringBuilder sb7 = new StringBuilder();
                    for (byte b4 : mediationNetwork) {
                        String hexString = Integer.toHexString(b4);
                        if (hexString.length() == 1) {
                            int i6 = getMonetizationNetwork + 23;
                            areAllFieldsValid = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i6 % 2 == 0) {
                                "0".concat(hexString);
                                throw null;
                            }
                            hexString = "0".concat(hexString);
                        }
                        sb7.append(hexString);
                    }
                    sb6.append(sb7.toString());
                    return sb6.toString();
                }
            }
            Object[] objArr112 = new Object[1];
            b(new int[]{39584719, 152510957, 1115452019, -1177671545}, KeyEvent.keyCodeFromString("") + 6, objArr112);
            int size2 = ((SensorManager) context2.getSystemService(((String) objArr112[0]).intern())).getSensorList(-1).size();
            StringBuilder sb52 = new StringBuilder();
            Object[] objArr122 = new Object[1];
            b(new int[]{-262877734, -1049246313}, -TextUtils.lastIndexOf("", '0', 0), objArr122);
            sb52.append(((String) objArr122[0]).intern());
            sb52.append(i4);
            Object[] objArr132 = new Object[1];
            a("ؔ\ue32d", 58726 - ImageFormat.getBitsPerPixel(0), objArr132);
            sb52.append(((String) objArr132[0]).intern());
            sb52.append(i5);
            Object[] objArr142 = new Object[1];
            a("ؔ\uf1be", 63486 - TextUtils.lastIndexOf("", '0', 0), objArr142);
            sb52.append(((String) objArr142[0]).intern());
            sb52.append(size2);
            Object[] objArr152 = new Object[1];
            b(new int[]{-400266022, -1154682097}, 1 - ImageFormat.getBitsPerPixel(0), objArr152);
            sb52.append(((String) objArr152[0]).intern());
            sb52.append(this.getMediationNetwork.size());
            String obj42 = sb52.toString();
            StringBuilder sb62 = new StringBuilder();
            sb62.append(str2);
            byte[] mediationNetwork2 = AFa1vSDK.getMediationNetwork(AFa1vSDK.getMonetizationNetwork(obj42));
            StringBuilder sb72 = new StringBuilder();
            while (r10 < r7) {
            }
            sb62.append(sb72.toString());
            return sb62.toString();
        } catch (Exception e6) {
            e = e6;
            Object[] objArr16 = new Object[1];
            b(new int[]{1412659751, -1225518006, 773104622, 1068029282, -1961924635, 1375008509, 776083721, -1573871477}, 16 - Color.red(0), objArr16);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e);
            StringBuilder sb8 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            b(new int[]{-1080009004, 844403482, -683446169, 2011701581, 1233271862, -317730360, 474044529, -1279916753, -2006198622, 428775418, -984596794, -978390891, 878183437, 2057824704, 1541426602, 1401202182, -1442141497, 1653693558, -345898809, 1573805036, 244475260, 1779591003}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, objArr17);
            sb8.append(((String) objArr17[0]).intern());
            sb8.append(e);
            AFLogger.afRDLog(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str2);
            Object[] objArr18 = new Object[1];
            b(new int[]{-683062148, -858043544, -2064842399, 815261139, 1867195511, 963766349, -1317296620, -449999879}, (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr18);
            sb9.append(((String) objArr18[0]).intern());
            return sb9.toString();
        }
        i5 = 0;
        Context context22 = this.getRevenue;
    }

    private static StringBuilder getMediationNetwork(String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i4 = 0; i4 < 3; i4++) {
            arrayList.add(Integer.valueOf(strArr[i4].length()));
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < intValue; i5++) {
            getMonetizationNetwork = (areAllFieldsValid + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
            Integer num = null;
            for (int i6 = 0; i6 < 3; i6++) {
                int charAt = strArr[i6].charAt(i5);
                if (num != null) {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb.append(Integer.toHexString(num.intValue()));
        }
        return sb;
    }

    private String getMonetizationNetwork() {
        getMonetizationNetwork = (areAllFieldsValid + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("ٓ䛅蝏쟵П䒊蔱얶ˎ䍊菵쁹", 16530 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            a("ِ彗둽ങ戊", View.getDefaultSize(0, 0) + 22807, objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                areAllFieldsValid = (getMonetizationNetwork + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
                Object[] objArr3 = new Object[1];
                a("ټ\u0cd4ጿᦋⳄ㌾㦊䳩", 2729 - View.MeasureSpec.getSize(0), objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder mediationNetwork = getMediationNetwork(num, obj2, sb.toString());
            int length = mediationNetwork.length();
            if (length > 4) {
                mediationNetwork.delete(4, length);
            } else {
                while (length < 4) {
                    length++;
                    mediationNetwork.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            b(new int[]{-269708407, 691550562}, Color.green(0) + 3, objArr4);
            mediationNetwork.insert(0, ((String) objArr4[0]).intern());
            return mediationNetwork.toString();
        } catch (Exception e4) {
            Object[] objArr5 = new Object[1];
            b(new int[]{854565745, 306981016, 2092009709, 1211146027, -1997348285, -2069302082, -1014555636, -1115818356, 1491143540, 297822326, -891867092, 74755836, -538226225, -689317204, -1794805564, -1830683349, -1867036264, 1235626699, 1541426602, 1401202182}, 40 - Color.argb(0, 0, 0, 0), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e4);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(new int[]{-1080009004, 844403482, -683446169, 2011701581, 1233271862, -317730360, 474044529, -1279916753, -2006198622, 428775418, 1632684225, -344979390, -1051640727, -1500483547, 1921909678, 1197372451, 1709650531, 1369506269, 1275252993, 1437497808, 761424572, -1240279331}, 42 - (KeyEvent.getMaxKeyCode() >> 16), objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e4);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr7 = new Object[1];
            b(new int[]{-2132896634, 840027810, -513331929, 1353535124}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    static void getMediationNetwork() {
        AFAdRevenueData = -8351283963653293149L;
        getCurrencyIso4217Code = new int[]{442543737, -1490671600, 624544975, 963078580, -38548639, -1507093695, -433807488, 2027768116, 1333435861, -1679971940, -735591064, 871109200, 1542131051, 1882103064, 1923897460, -2041115963, 1803608463, -148454374};
    }
}
