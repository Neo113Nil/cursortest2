package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1rSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = null;
    private static int AFKeystoreWrapper = 0;
    private static int AFLogger = 0;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f5875e = false;
    private static boolean registerClient = false;
    private static int unregisterClient = 1;
    private static long valueOf;
    private final Context AFInAppEventType;
    private final Map<String, Object> values;

    public static class AFa1tSDK {
        public static byte[] AFInAppEventType(String str) {
            return str.getBytes(Charset.defaultCharset());
        }

        public static byte[] AFKeystoreWrapper(byte[] bArr) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr[i2] = (byte) (bArr[i2] ^ ((i2 % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        valueOf();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getEdgeSlop();
        Process.myTid();
        AudioTrack.getMinVolume();
        View.resolveSizeAndState(0, 0, 0);
        View.getDefaultSize(0, 0);
        MotionEvent.axisFromString("");
        unregisterClient = (AFLogger + 55) % 128;
    }

    public AFd1rSDK(Map<String, Object> map, Context context) {
        this.values = map;
        this.AFInAppEventType = context;
        put(AFInAppEventParameterName(), AFInAppEventType());
    }

    private String AFInAppEventParameterName() {
        String str;
        unregisterClient = (AFLogger + 109) % 128;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            a("۾掄찺㚜錂ﶃ昔삇ⴃ鞛\uf010媰", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25980, objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.values;
            Object[] objArr2 = new Object[1];
            a("۽좖騈涀㼗", Color.green(0) + 52859, objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                int i2 = AFLogger + 117;
                unregisterClient = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    b(81 / (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)), null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                    str = (String) objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                    str = (String) objArr4[0];
                }
                obj2 = str.intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb.toString());
            int length = AFKeystoreWrapper2.length();
            if (length > 4) {
                int i4 = AFLogger + 35;
                unregisterClient = i4 % 128;
                if (i4 % 2 == 0) {
                    AFKeystoreWrapper2.delete(5, length);
                } else {
                    AFKeystoreWrapper2.delete(4, length);
                }
            } else {
                while (length < 4) {
                    unregisterClient = (AFLogger + 25) % 128;
                    length++;
                    AFKeystoreWrapper2.append('1');
                }
            }
            Object[] objArr5 = new Object[1];
            a("۴ﮫﱛ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64849, objArr5);
            AFKeystoreWrapper2.insert(0, ((String) objArr5[0]).intern());
            return AFKeystoreWrapper2.toString();
        } catch (Exception e4) {
            Object[] objArr6 = new Object[1];
            b(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0099\u008b\u0092\u0098\u0088\u008f\u008a\u0097\u0088\u0090\u008a\u0097\u0088\u0089\u0095\u0092\u008b\u0091\u0096\u008a\u0095\u008a\u0089\u0088\u0094\u008a\u0093\u0092\u0091\u0090\u0088\u008f\u008a\u008e\u008d\u008c\u008b\u008a\u0089\u0088", objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e4);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr7 = new Object[1];
            a("۹鄉⤘섖夦\uf128襵ℹ륂兞\ue95c腰ᥪ녠䥴\ue188禈ᇘꦪ䆯\ud9b5燼ৎꇋ㧎토槾ǻ駯「졍怓\uf807逫⠴쀪塗\uf045衚⁐렽倰", 38903 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
            sb2.append(((String) objArr7[0]).intern());
            sb2.append(e4);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr8 = new Object[1];
            b((ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, null, "\u009a\u009a\u009a\u009a\u0090\u008a\u0097", objArr8);
            return ((String) objArr8[0]).intern();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFInAppEventType() {
        String obj;
        String obj2;
        int i2;
        int i4;
        int length;
        int i5;
        int intExtra;
        try {
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            a("۾掄찺㚜錂ﶃ昔삇ⴃ鞛\uf010媰", 25981 - TextUtils.getCapsMode("", 0, 0), objArr);
            String obj3 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.values;
            Object[] objArr2 = new Object[1];
            a("۹㎓氧ꛃ퍿ప䚠猩귙\ue671ጅ䶌虂냊\ued7c", TextUtils.getCapsMode("", 0, 0) + 13669, objArr2);
            String obj4 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            b(128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, null, "\u009f\u009c\u009e\u009d\u009c\u009b", objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(126 - TextUtils.lastIndexOf("", '0'), null, null, "¢\u009c¡\u0096 ", objArr4);
            String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb = new StringBuilder();
            sb.append(obj3);
            sb.append(obj4);
            sb.append(replaceAll);
            String AFKeystoreWrapper2 = AFb1lSDK.AFKeystoreWrapper(sb.toString());
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(AFKeystoreWrapper2.substring(0, 16));
            obj = sb2.toString();
        } catch (Exception e4) {
            Object[] objArr5 = new Object[1];
            b(127 - Color.blue(0), null, null, "\u008a£\u0093\u0091¤\u0088\u0090\u008a\u0097\u0088\u0089\u0095\u0092\u008b\u0091\u0096\u008a\u0095\u008a\u0089\u0088\u0094\u008a\u0093\u0092\u0091\u0090\u0088\u008a£\u0093\u0091\u008c\u008d\u008c\u008b\u008a\u0089", objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e4);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a("۹斉쀘Ⲗ謦\uf7a8創뺹ᵂ秞\ue45c䃰꽪\u0be0癴픈ㆈ鱘\uf8aa术쎵\u2e7c諓\ue94f嗛끵ᳬ笲\ue7ec䊍ꄙඞ桟풭㌩龹渚曜앁⇗豨\ue8fe圣뉂", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25463, objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e4);
            AFLogger.afRDLog(sb3.toString());
            StringBuilder sb4 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            a("۽\udeef뛟軉暺㺯ᛉ\ueedd옣鸶癑丝♢︤홃깐螾徆", 55313 - TextUtils.indexOf("", "", 0), objArr7);
            sb4.append(((String) objArr7[0]).intern());
            obj = sb4.toString();
        }
        String str = obj;
        try {
            Context context = this.AFInAppEventType;
            Object[] objArr8 = new Object[1];
            b(126 - ImageFormat.getBitsPerPixel(0), null, null, "\u0087§«\u0081\u0086ª©\u0083¨\u0085§¦¦\u0086\u0084\u009c\u0095¥\u0092\u008b¡\u0091\u009c\u008b\u0095\u008a\u008b\u0095\u0092\u009c\u0094\u0092¥\u0096\u0094\u0095\u0091", objArr8);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            i2 = -2700;
            if (registerReceiver != null) {
                int i6 = AFLogger + 47;
                unregisterClient = i6 % 128;
                if (i6 % 2 == 0) {
                    Object[] objArr9 = new Object[1];
                    a("ܑ۫Ԥ̮Ŗེർஆলឮᗔ", 29819 >>> TextUtils.lastIndexOf("", 'b'), objArr9);
                    intExtra = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), 10274);
                } else {
                    Object[] objArr10 = new Object[1];
                    a("ܑ۫Ԥ̮Ŗེർஆলឮᗔ", 490 - TextUtils.lastIndexOf("", '0'), objArr10);
                    intExtra = registerReceiver.getIntExtra(((String) objArr10[0]).intern(), -2700);
                }
                i2 = intExtra;
            }
        } catch (Exception e5) {
            Object[] objArr11 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, null, "\u0096¥\u0096\u0096\u008a\u0088\u008a£\u0093\u0091\u008c\u008d\u008c\u008b\u008a\u0089", objArr11);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr11[0]).intern(), e5);
            StringBuilder sb5 = new StringBuilder();
            Object[] objArr12 = new Object[1];
            a("۹斉쀘Ⲗ謦\uf7a8創뺹ᵂ秞\ue45c䃰꽪\u0be0癴픈ㆈ鱘\uf8aa术쎵\u2e7c諓\ue94f嗛끵ᳬ笲\ue7ec䊍ꄙඞ桟풭㌩龹渚曜앁⇗豨\ue8fe圣뉂", ExpandableListView.getPackedPositionType(0L) + 25463, objArr12);
            sb5.append(((String) objArr12[0]).intern());
            sb5.append(e5);
            AFLogger.afRDLog(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            Object[] objArr13 = new Object[1];
            b(127 - (ViewConfiguration.getEdgeSlop() >> 16), null, null, "³\u0091\u008b\u0099¡\u008d\u008d²\u009d²\u009d±\u009f±\u009f\u0090", objArr13);
            sb6.append(((String) objArr13[0]).intern());
            obj2 = sb6.toString();
        }
        if (this.AFInAppEventType.getApplicationInfo().nativeLibraryDir != null) {
            b(127 - (Process.myTid() >> 22), null, null, "\u009b\u00ad¬", new Object[1]);
            if (!(!r0.contains(((String) r15[0]).intern()))) {
                i4 = 1;
                Context context2 = this.AFInAppEventType;
                Object[] objArr14 = new Object[1];
                b(ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u0096¥®\u0095\u008a®", objArr14);
                int size = ((SensorManager) context2.getSystemService(((String) objArr14[0]).intern())).getSensorList(-1).size();
                StringBuilder sb7 = new StringBuilder();
                Object[] objArr15 = new Object[1];
                b(AndroidCharacter.getMirror('0') + 'O', null, null, "¯", objArr15);
                sb7.append(((String) objArr15[0]).intern());
                sb7.append(i2);
                Object[] objArr16 = new Object[1];
                b(127 - ((Process.getThreadPriority(0) + 20) >> 6), null, null, "¬°", objArr16);
                sb7.append(((String) objArr16[0]).intern());
                sb7.append(i4);
                Object[] objArr17 = new Object[1];
                b(MotionEvent.axisFromString("") + 128, null, null, "®°", objArr17);
                sb7.append(((String) objArr17[0]).intern());
                sb7.append(size);
                Object[] objArr18 = new Object[1];
                a("ڹ鹞", TextUtils.lastIndexOf("", '0', 0, 0) + 39090, objArr18);
                sb7.append(((String) objArr18[0]).intern());
                sb7.append(this.values.size());
                String obj5 = sb7.toString();
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                byte[] AFKeystoreWrapper3 = AFa1tSDK.AFKeystoreWrapper(AFa1tSDK.AFInAppEventType(obj5));
                StringBuilder sb9 = new StringBuilder();
                length = AFKeystoreWrapper3.length;
                i5 = 0;
                while (i5 < length) {
                    unregisterClient = (AFLogger + 17) % 128;
                    String hexString = Integer.toHexString(AFKeystoreWrapper3[i5]);
                    if (hexString.length() == 1) {
                        unregisterClient = (AFLogger + 119) % 128;
                        hexString = "0".concat(hexString);
                    }
                    sb9.append(hexString);
                    i5++;
                    unregisterClient = (AFLogger + 87) % 128;
                }
                sb8.append(sb9.toString());
                obj2 = sb8.toString();
                AFLogger = (unregisterClient + 93) % 128;
                return obj2;
            }
        }
        i4 = 0;
        Context context22 = this.AFInAppEventType;
        Object[] objArr142 = new Object[1];
        b(ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u0096¥®\u0095\u008a®", objArr142);
        int size2 = ((SensorManager) context22.getSystemService(((String) objArr142[0]).intern())).getSensorList(-1).size();
        StringBuilder sb72 = new StringBuilder();
        Object[] objArr152 = new Object[1];
        b(AndroidCharacter.getMirror('0') + 'O', null, null, "¯", objArr152);
        sb72.append(((String) objArr152[0]).intern());
        sb72.append(i2);
        Object[] objArr162 = new Object[1];
        b(127 - ((Process.getThreadPriority(0) + 20) >> 6), null, null, "¬°", objArr162);
        sb72.append(((String) objArr162[0]).intern());
        sb72.append(i4);
        Object[] objArr172 = new Object[1];
        b(MotionEvent.axisFromString("") + 128, null, null, "®°", objArr172);
        sb72.append(((String) objArr172[0]).intern());
        sb72.append(size2);
        Object[] objArr182 = new Object[1];
        a("ڹ鹞", TextUtils.lastIndexOf("", '0', 0, 0) + 39090, objArr182);
        sb72.append(((String) objArr182[0]).intern());
        sb72.append(this.values.size());
        String obj52 = sb72.toString();
        StringBuilder sb82 = new StringBuilder();
        sb82.append(str);
        byte[] AFKeystoreWrapper32 = AFa1tSDK.AFKeystoreWrapper(AFa1tSDK.AFInAppEventType(obj52));
        StringBuilder sb92 = new StringBuilder();
        length = AFKeystoreWrapper32.length;
        i5 = 0;
        while (i5 < length) {
        }
        sb82.append(sb92.toString());
        obj2 = sb82.toString();
        AFLogger = (unregisterClient + 93) % 128;
        return obj2;
    }

    private static StringBuilder AFKeystoreWrapper(String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < 3) {
            arrayList.add(Integer.valueOf(strArr[i2].length()));
            i2++;
            AFLogger = (unregisterClient + 117) % 128;
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < intValue) {
            AFLogger = (unregisterClient + 101) % 128;
            Integer num = null;
            for (int i5 = 0; i5 < 3; i5++) {
                int charAt = strArr[i5].charAt(i4);
                if (num == null) {
                    int i6 = unregisterClient + 29;
                    AFLogger = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                } else {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb.append(Integer.toHexString(num.intValue()));
            i4++;
            unregisterClient = (AFLogger + 25) % 128;
        }
        return sb;
    }

    private static void a(String str, int i2, Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            int i4 = $10 + 63;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFj1bSDK aFj1bSDK = new AFj1bSDK();
        aFj1bSDK.AFInAppEventParameterName = i2;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFj1bSDK.valueOf = 0;
        while (true) {
            int i5 = aFj1bSDK.valueOf;
            if (i5 >= cArr2.length) {
                break;
            }
            $10 = ($11 + 101) % 128;
            jArr[i5] = (cArr2[i5] ^ (i5 * aFj1bSDK.AFInAppEventParameterName)) ^ (valueOf ^ 53874021866711318L);
            aFj1bSDK.valueOf = i5 + 1;
        }
        char[] cArr3 = new char[length];
        aFj1bSDK.valueOf = 0;
        while (true) {
            int i6 = aFj1bSDK.valueOf;
            if (i6 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            } else {
                $10 = ($11 + 59) % 128;
                cArr3[i6] = (char) jArr[i6];
                aFj1bSDK.valueOf = i6 + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i2, int[] iArr, String str, String str2, Object[] objArr) {
        char[] cArr;
        int i4;
        int i5;
        $11 = ($10 + 87) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] cArr2 = str;
        if (str != null) {
            cArr2 = str.toCharArray();
        }
        char[] cArr3 = cArr2;
        AFk1xSDK aFk1xSDK = new AFk1xSDK();
        char[] cArr4 = AFInAppEventParameterName;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr5[i6] = (char) (cArr4[i6] ^ (-8139745211550348932L));
            }
            cArr4 = cArr5;
        }
        int i7 = (int) ((-8139745211550348932L) ^ AFKeystoreWrapper);
        if (f5875e) {
            int length2 = bArr2.length;
            aFk1xSDK.values = length2;
            char[] cArr6 = new char[length2];
            aFk1xSDK.AFInAppEventType = 0;
            while (true) {
                int i8 = aFk1xSDK.AFInAppEventType;
                int i9 = aFk1xSDK.values;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i10 = $11;
                int i11 = i10 + 13;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr6[i8] = (char) (cArr4[bArr2[(i9 >> 1) + i8] << i2] >>> i7);
                } else {
                    cArr6[i8] = (char) (cArr4[bArr2[(i9 - 1) - i8] + i2] - i7);
                    i8++;
                }
                aFk1xSDK.AFInAppEventType = i8;
                $10 = (i10 + 93) % 128;
            }
        } else if (registerClient) {
            int i12 = $10 + 53;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int length3 = cArr3.length;
                aFk1xSDK.values = length3;
                cArr = new char[length3];
                int i13 = 1;
                aFk1xSDK.AFInAppEventType = i13;
                i4 = aFk1xSDK.AFInAppEventType;
                i5 = aFk1xSDK.values;
                if (i4 < i5) {
                    int i14 = $10 + 15;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        cArr[i4] = (char) (cArr4[cArr3[i5 >> i4] * i2] - i7);
                        i13 = i4 + 1;
                    } else {
                        cArr[i4] = (char) (cArr4[cArr3[(i5 - 1) - i4] - i2] - i7);
                        i13 = i4 + 1;
                    }
                    aFk1xSDK.AFInAppEventType = i13;
                    i4 = aFk1xSDK.AFInAppEventType;
                    i5 = aFk1xSDK.values;
                    if (i4 < i5) {
                        objArr[0] = new String(cArr);
                    }
                }
            } else {
                int length4 = cArr3.length;
                aFk1xSDK.values = length4;
                cArr = new char[length4];
                aFk1xSDK.AFInAppEventType = 0;
                i4 = aFk1xSDK.AFInAppEventType;
                i5 = aFk1xSDK.values;
                if (i4 < i5) {
                }
            }
        } else {
            int length5 = iArr.length;
            aFk1xSDK.values = length5;
            char[] cArr7 = new char[length5];
            aFk1xSDK.AFInAppEventType = 0;
            $10 = ($11 + 59) % 128;
            while (true) {
                int i15 = aFk1xSDK.AFInAppEventType;
                int i16 = aFk1xSDK.values;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i15] = (char) (cArr4[iArr[(i16 - 1) - i15] - i2] - i7);
                    aFk1xSDK.AFInAppEventType = i15 + 1;
                }
            }
        }
    }

    public static void valueOf() {
        valueOf = -603186298485624951L;
        registerClient = true;
        f5875e = true;
        AFKeystoreWrapper = 928696761;
        AFInAppEventParameterName = new char[]{51311, 51304, 51288, 51323, 51307, 51322, 51317, 51609, 51280, 51286, 51269, 51303, 51595, 51308, 51266, 51287, 51290, 51282, 51277, 51285, 51279, 51275, 51276, 51264, 51281, 51586, 51591, 51599, 51594, 51589, 51593, 51598, 51284, 51603, 51270, 51271, 51272, 51301, 51318, 51298, 51316, 51313, 51312, 51265, 51585, 51268, 51291, 51607, 51274, 51273, 51278};
    }
}
