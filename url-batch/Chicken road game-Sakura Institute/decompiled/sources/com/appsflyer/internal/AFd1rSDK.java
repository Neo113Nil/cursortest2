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
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public final class AFd1rSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = null;
    private static int AFKeystoreWrapper = 0;
    private static int AFLogger = 0;
    private static boolean e = false;
    private static boolean registerClient = false;
    private static int unregisterClient = 1;
    private static long valueOf;
    private final Context AFInAppEventType;
    private final Map<String, Object> values;

    static {
        valueOf();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getEdgeSlop();
        Process.myTid();
        AudioTrack.getMinVolume();
        View.resolveSizeAndState(0, 0, 0);
        View.getDefaultSize(0, 0);
        MotionEvent.axisFromString("");
        int i = AFLogger + 55;
        unregisterClient = i % 128;
        int i2 = i % 2;
    }

    static void valueOf() {
        valueOf = -603186298485624951L;
        registerClient = true;
        e = true;
        AFKeystoreWrapper = 928696761;
        AFInAppEventParameterName = new char[]{51311, 51304, 51288, 51323, 51307, 51322, 51317, 51609, 51280, 51286, 51269, 51303, 51595, 51308, 51266, 51287, 51290, 51282, 51277, 51285, 51279, 51275, 51276, 51264, 51281, 51586, 51591, 51599, 51594, 51589, 51593, 51598, 51284, 51603, 51270, 51271, 51272, 51301, 51318, 51298, 51316, 51313, 51312, 51265, 51585, 51268, 51291, 51607, 51274, 51273, 51278};
    }

    public AFd1rSDK(Map<String, Object> map, Context context) {
        this.values = map;
        this.AFInAppEventType = context;
        put(AFInAppEventParameterName(), AFInAppEventType());
    }

    private static StringBuilder AFKeystoreWrapper(String... strArr) throws Exception {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < 3) {
            arrayList.add(Integer.valueOf(strArr[i2].length()));
            i2++;
            int i3 = unregisterClient + 117;
            AFLogger = i3 % 128;
            int i4 = i3 % 2;
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        while (i5 < intValue) {
            int i6 = unregisterClient + 101;
            AFLogger = i6 % 128;
            int i7 = i6 % 2;
            int length2 = strArr.length;
            Object obj = null;
            Integer num = null;
            for (int i8 = 0; i8 < 3; i8++) {
                int charAt = strArr[i8].charAt(i5);
                if (num == null) {
                    int i9 = unregisterClient + 29;
                    AFLogger = i9 % 128;
                    if (i9 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb.append(Integer.toHexString(num.intValue()));
            i5++;
            int i10 = AFLogger + 25;
            unregisterClient = i10 % 128;
            int i11 = i10 % 2;
        }
        return sb;
    }

    private String AFInAppEventParameterName() {
        String str;
        int i = 2 % 2;
        int i2 = AFLogger + 109;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
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
                int i4 = AFLogger + 117;
                unregisterClient = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    b(81 / (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)), null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                    str = (String) objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                    str = (String) objArr4[0];
                }
                obj2 = str.intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb.toString());
            int length = AFKeystoreWrapper2.length();
            if (length > 4) {
                int i5 = AFLogger + 35;
                unregisterClient = i5 % 128;
                if (i5 % 2 == 0) {
                    AFKeystoreWrapper2.delete(5, length);
                } else {
                    AFKeystoreWrapper2.delete(4, length);
                }
            } else {
                while (length < 4) {
                    int i6 = AFLogger + 25;
                    unregisterClient = i6 % 128;
                    int i7 = i6 % 2;
                    length++;
                    AFKeystoreWrapper2.append('1');
                }
            }
            Object[] objArr5 = new Object[1];
            a("۴ﮫﱛ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64849, objArr5);
            AFKeystoreWrapper2.insert(0, ((String) objArr5[0]).intern());
            return AFKeystoreWrapper2.toString();
        } catch (Exception e2) {
            Object[] objArr6 = new Object[1];
            b(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0099\u008b\u0092\u0098\u0088\u008f\u008a\u0097\u0088\u0090\u008a\u0097\u0088\u0089\u0095\u0092\u008b\u0091\u0096\u008a\u0095\u008a\u0089\u0088\u0094\u008a\u0093\u0092\u0091\u0090\u0088\u008f\u008a\u008e\u008d\u008c\u008b\u008a\u0089\u0088", objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e2);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr7 = new Object[1];
            a("۹鄉⤘섖夦\uf128襵ℹ륂兞\ue95c腰ᥪ녠䥴\ue188禈ᇘꦪ䆯\ud9b5燼ৎꇋ㧎토槾ǻ駯「졍怓\uf807逫⠴쀪塗\uf045衚⁐렽倰", 38903 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
            AFLogger.afRDLog(sb2.append(((String) objArr7[0]).intern()).append(e2).toString());
            Object[] objArr8 = new Object[1];
            b((ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, null, "\u009a\u009a\u009a\u009a\u0090\u008a\u0097", objArr8);
            return ((String) objArr8[0]).intern();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFInAppEventType() {
        String obj;
        String obj2;
        int i;
        int i2;
        int length;
        int i3;
        int intExtra;
        int i4 = 2 % 2;
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
            obj = new StringBuilder("").append(AFb1lSDK.AFKeystoreWrapper(new StringBuilder().append(obj3).append(obj4).append(intern.replaceAll(((String) objArr4[0]).intern(), "")).toString()).substring(0, 16)).toString();
        } catch (Exception e2) {
            Object[] objArr5 = new Object[1];
            b(127 - Color.blue(0), null, null, "\u008a£\u0093\u0091¤\u0088\u0090\u008a\u0097\u0088\u0089\u0095\u0092\u008b\u0091\u0096\u008a\u0095\u008a\u0089\u0088\u0094\u008a\u0093\u0092\u0091\u0090\u0088\u008a£\u0093\u0091\u008c\u008d\u008c\u008b\u008a\u0089", objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e2);
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a("۹斉쀘Ⲗ謦\uf7a8創뺹ᵂ秞\ue45c䃰꽪\u0be0癴픈ㆈ鱘\uf8aa术쎵\u2e7c諓\ue94f嗛끵ᳬ笲\ue7ec䊍ꄙඞ桟풭㌩龹渚曜앁⇗豨\ue8fe圣뉂", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25463, objArr6);
            AFLogger.afRDLog(sb.append(((String) objArr6[0]).intern()).append(e2).toString());
            StringBuilder sb2 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            a("۽\udeef뛟軉暺㺯ᛉ\ueedd옣鸶癑丝♢︤홃깐螾徆", 55313 - TextUtils.indexOf("", "", 0), objArr7);
            obj = sb2.append(((String) objArr7[0]).intern()).toString();
        }
        String str = obj;
        try {
            Context context = this.AFInAppEventType;
            Object[] objArr8 = new Object[1];
            b(126 - ImageFormat.getBitsPerPixel(0), null, null, "\u0087§«\u0081\u0086ª©\u0083¨\u0085§¦¦\u0086\u0084\u009c\u0095¥\u0092\u008b¡\u0091\u009c\u008b\u0095\u008a\u008b\u0095\u0092\u009c\u0094\u0092¥\u0096\u0094\u0095\u0091", objArr8);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            i = -2700;
            if (registerReceiver != null) {
                int i5 = AFLogger + 47;
                unregisterClient = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr9 = new Object[1];
                    a("ܑ۫Ԥ̮Ŗེർஆলឮᗔ", 29819 >>> TextUtils.lastIndexOf("", 'b'), objArr9);
                    intExtra = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), 10274);
                } else {
                    Object[] objArr10 = new Object[1];
                    a("ܑ۫Ԥ̮Ŗེർஆলឮᗔ", 490 - TextUtils.lastIndexOf("", '0'), objArr10);
                    intExtra = registerReceiver.getIntExtra(((String) objArr10[0]).intern(), -2700);
                }
                i = intExtra;
            }
        } catch (Exception e3) {
            Object[] objArr11 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, null, "\u0096¥\u0096\u0096\u008a\u0088\u008a£\u0093\u0091\u008c\u008d\u008c\u008b\u008a\u0089", objArr11);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr11[0]).intern(), e3);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr12 = new Object[1];
            a("۹斉쀘Ⲗ謦\uf7a8創뺹ᵂ秞\ue45c䃰꽪\u0be0癴픈ㆈ鱘\uf8aa术쎵\u2e7c諓\ue94f嗛끵ᳬ笲\ue7ec䊍ꄙඞ桟풭㌩龹渚曜앁⇗豨\ue8fe圣뉂", ExpandableListView.getPackedPositionType(0L) + 25463, objArr12);
            AFLogger.afRDLog(sb3.append(((String) objArr12[0]).intern()).append(e3).toString());
            StringBuilder append = new StringBuilder().append(str);
            Object[] objArr13 = new Object[1];
            b(127 - (ViewConfiguration.getEdgeSlop() >> 16), null, null, "³\u0091\u008b\u0099¡\u008d\u008d²\u009d²\u009d±\u009f±\u009f\u0090", objArr13);
            obj2 = append.append(((String) objArr13[0]).intern()).toString();
        }
        if (this.AFInAppEventType.getApplicationInfo().nativeLibraryDir != null) {
            b(127 - (Process.myTid() >> 22), null, null, "\u009b\u00ad¬", new Object[1]);
            if (!(!r0.contains(((String) r14[0]).intern()))) {
                i2 = 1;
                Context context2 = this.AFInAppEventType;
                Object[] objArr14 = new Object[1];
                b(ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u0096¥®\u0095\u008a®", objArr14);
                int size = ((SensorManager) context2.getSystemService(((String) objArr14[0]).intern())).getSensorList(-1).size();
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr15 = new Object[1];
                b(AndroidCharacter.getMirror('0') + 'O', null, null, "¯", objArr15);
                StringBuilder append2 = sb4.append(((String) objArr15[0]).intern()).append(i);
                Object[] objArr16 = new Object[1];
                b(127 - ((Process.getThreadPriority(0) + 20) >> 6), null, null, "¬°", objArr16);
                StringBuilder append3 = append2.append(((String) objArr16[0]).intern()).append(i2);
                Object[] objArr17 = new Object[1];
                b(MotionEvent.axisFromString("") + 128, null, null, "®°", objArr17);
                StringBuilder append4 = append3.append(((String) objArr17[0]).intern()).append(size);
                Object[] objArr18 = new Object[1];
                a("ڹ鹞", TextUtils.lastIndexOf("", '0', 0, 0) + 39090, objArr18);
                String obj5 = append4.append(((String) objArr18[0]).intern()).append(this.values.size()).toString();
                StringBuilder append5 = new StringBuilder().append(str);
                byte[] AFKeystoreWrapper2 = AFa1tSDK.AFKeystoreWrapper(AFa1tSDK.AFInAppEventType(obj5));
                StringBuilder sb5 = new StringBuilder();
                length = AFKeystoreWrapper2.length;
                i3 = 0;
                while (i3 < length) {
                    int i6 = AFLogger + 17;
                    unregisterClient = i6 % 128;
                    int i7 = i6 % 2;
                    String hexString = Integer.toHexString(AFKeystoreWrapper2[i3]);
                    if (hexString.length() == 1) {
                        int i8 = AFLogger + 119;
                        unregisterClient = i8 % 128;
                        int i9 = i8 % 2;
                        hexString = "0".concat(String.valueOf(hexString));
                    }
                    sb5.append(hexString);
                    i3++;
                    int i10 = AFLogger + 87;
                    unregisterClient = i10 % 128;
                    int i11 = i10 % 2;
                }
                obj2 = append5.append(sb5.toString()).toString();
                int i12 = unregisterClient + 93;
                AFLogger = i12 % 128;
                int i13 = i12 % 2;
                return obj2;
            }
        }
        i2 = 0;
        Context context22 = this.AFInAppEventType;
        Object[] objArr142 = new Object[1];
        b(ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u0096¥®\u0095\u008a®", objArr142);
        int size2 = ((SensorManager) context22.getSystemService(((String) objArr142[0]).intern())).getSensorList(-1).size();
        StringBuilder sb42 = new StringBuilder();
        Object[] objArr152 = new Object[1];
        b(AndroidCharacter.getMirror('0') + 'O', null, null, "¯", objArr152);
        StringBuilder append22 = sb42.append(((String) objArr152[0]).intern()).append(i);
        Object[] objArr162 = new Object[1];
        b(127 - ((Process.getThreadPriority(0) + 20) >> 6), null, null, "¬°", objArr162);
        StringBuilder append32 = append22.append(((String) objArr162[0]).intern()).append(i2);
        Object[] objArr172 = new Object[1];
        b(MotionEvent.axisFromString("") + 128, null, null, "®°", objArr172);
        StringBuilder append42 = append32.append(((String) objArr172[0]).intern()).append(size2);
        Object[] objArr182 = new Object[1];
        a("ڹ鹞", TextUtils.lastIndexOf("", '0', 0, 0) + 39090, objArr182);
        String obj52 = append42.append(((String) objArr182[0]).intern()).append(this.values.size()).toString();
        StringBuilder append52 = new StringBuilder().append(str);
        byte[] AFKeystoreWrapper22 = AFa1tSDK.AFKeystoreWrapper(AFa1tSDK.AFInAppEventType(obj52));
        StringBuilder sb52 = new StringBuilder();
        length = AFKeystoreWrapper22.length;
        i3 = 0;
        while (i3 < length) {
        }
        obj2 = append52.append(sb52.toString()).toString();
        int i122 = unregisterClient + 93;
        AFLogger = i122 % 128;
        int i132 = i122 % 2;
        return obj2;
    }

    public static class AFa1tSDK {
        static byte[] AFInAppEventType(String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        static byte[] AFKeystoreWrapper(byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        char[] cArr = str;
        if (str != null) {
            int i3 = $10 + 63;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFj1bSDK aFj1bSDK = new AFj1bSDK();
        aFj1bSDK.AFInAppEventParameterName = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFj1bSDK.valueOf = 0;
        while (aFj1bSDK.valueOf < cArr2.length) {
            int i4 = $11 + 101;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            jArr[aFj1bSDK.valueOf] = (cArr2[aFj1bSDK.valueOf] ^ (aFj1bSDK.valueOf * aFj1bSDK.AFInAppEventParameterName)) ^ (valueOf ^ 53874021866711318L);
            aFj1bSDK.valueOf++;
        }
        char[] cArr3 = new char[length];
        aFj1bSDK.valueOf = 0;
        while (aFj1bSDK.valueOf < cArr2.length) {
            int i6 = $11 + 59;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[aFj1bSDK.valueOf] = (char) jArr[aFj1bSDK.valueOf];
            aFj1bSDK.valueOf++;
        }
        objArr[0] = new String(cArr3);
    }

    private static void b(int i, int[] iArr, String str, String str2, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = $10 + 87;
        $11 = i4 % 128;
        int i5 = i4 % 2;
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
        if (e) {
            aFk1xSDK.values = bArr2.length;
            char[] cArr6 = new char[aFk1xSDK.values];
            aFk1xSDK.AFInAppEventType = 0;
            while (aFk1xSDK.AFInAppEventType < aFk1xSDK.values) {
                int i8 = $11 + 13;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr6[aFk1xSDK.AFInAppEventType] = (char) (cArr4[bArr2[(aFk1xSDK.values >> 1) + aFk1xSDK.AFInAppEventType] << i] >>> i7);
                    i2 = aFk1xSDK.AFInAppEventType;
                } else {
                    cArr6[aFk1xSDK.AFInAppEventType] = (char) (cArr4[bArr2[(aFk1xSDK.values - 1) - aFk1xSDK.AFInAppEventType] + i] - i7);
                    i2 = aFk1xSDK.AFInAppEventType + 1;
                }
                aFk1xSDK.AFInAppEventType = i2;
                int i9 = $11 + 93;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        if (!registerClient) {
            aFk1xSDK.values = iArr.length;
            char[] cArr7 = new char[aFk1xSDK.values];
            aFk1xSDK.AFInAppEventType = 0;
            int i11 = $11 + 59;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            while (aFk1xSDK.AFInAppEventType < aFk1xSDK.values) {
                cArr7[aFk1xSDK.AFInAppEventType] = (char) (cArr4[iArr[(aFk1xSDK.values - 1) - aFk1xSDK.AFInAppEventType] - i] - i7);
                aFk1xSDK.AFInAppEventType++;
            }
            objArr[0] = new String(cArr7);
            return;
        }
        int i13 = $10 + 53;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            aFk1xSDK.values = cArr3.length;
            cArr = new char[aFk1xSDK.values];
            aFk1xSDK.AFInAppEventType = 1;
        } else {
            aFk1xSDK.values = cArr3.length;
            cArr = new char[aFk1xSDK.values];
            aFk1xSDK.AFInAppEventType = 0;
        }
        while (aFk1xSDK.AFInAppEventType < aFk1xSDK.values) {
            int i14 = $10 + 15;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr[aFk1xSDK.AFInAppEventType] = (char) (cArr4[cArr3[aFk1xSDK.values >> aFk1xSDK.AFInAppEventType] * i] - i7);
            } else {
                cArr[aFk1xSDK.AFInAppEventType] = (char) (cArr4[cArr3[(aFk1xSDK.values - 1) - aFk1xSDK.AFInAppEventType] - i] - i7);
            }
            aFk1xSDK.AFInAppEventType++;
        }
        objArr[0] = new String(cArr);
    }
}
