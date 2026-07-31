package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.ComposerImplKt;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFd1rSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = null;
    private static int AFInAppEventType = 0;
    private static char[] AFLogger = null;
    private static int d = 1;
    private static int e;
    private static long registerClient;
    private static boolean unregisterClient;
    private static boolean values;
    private final Map<String, Object> AFKeystoreWrapper;
    private final Context valueOf;

    static {
        AFKeystoreWrapper();
        AudioTrack.getMinVolume();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.getCapsMode("", 0, 0);
        Process.getGidForName("");
        ExpandableListView.getPackedPositionForGroup(0);
        KeyEvent.getDeadChar(0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        ExpandableListView.getPackedPositionChild(0L);
        TypedValue.complexToFloat(0);
        Gravity.getAbsoluteGravity(0, 0);
        ImageFormat.getBitsPerPixel(0);
        Color.argb(0, 0, 0, 0);
        ViewConfiguration.getPressedStateDuration();
        int i = e + 97;
        d = i % 128;
        int i2 = i % 2;
    }

    static void AFKeystoreWrapper() {
        values = true;
        unregisterClient = true;
        AFInAppEventType = -1725747629;
        AFInAppEventParameterName = new char[]{12210, 12201, 12208, 12255, 12202, 12198, 12206, 12252, 12195, 12205, 12253, 12193, 12207, 12196, 11891, 12200, 12217, 12189, 12164, 12250, 12199, 12248, 12203, 11878, 12204, 11873, 11877, 11875, 12190, 12191, 12186, 11874, 12187, 12192, 12173, 12178, 12223, 12174, 12221, 12218, 12172, 12171, 12161, 12168, 12175, 12254, 12251, 12185, 11881};
        AFLogger = new char[]{289, 59843, 53494, 48004, 41649, 36161, 29811, 24350, 30632, 40780, 42593, 52491, 54311, 64453, 700, 10652, 12467, 22619, 28533, 30333, 40203, 42045, 52173, 53997, 63897, 253, 10323, 16242, 17940, 28017, 29735, 39886, 41727, 51653, 53431, 63574, 3950, 5649, 15732, 17622, 27606, 29422, 39309, 41143, 51286, 57192, 58899, 3381, 5260, 15285, 17303, 43898, 37468, 63852, 57417, 53162, 13975, 51950, 8706, 6972, 28754, 26992, 18091, 49083, 38088, 36350, 58640, 53822, 51981, 8269, 6523, 30343, 14480, 53355, 59729, 33341, 39684, 46335, 52269, 9420, 7672, 30389, 28660, 16499, 47481, 37395, 35623, 58324, 54452, 52717, 9871, 8100, 28748, 26978, 16926, 47993, 37851, 34038, 64920, 54960, 53178, 8270, 6518, 29192, 27434, 17372, 46270, 44438, 34485, 65361, 53258, 51583, 8717, 6959, 29651, 25824, 51950, 8714, 6951, 28749, 26977, 18051, 49146, 38106, 36341, 58653, 53811, 52027, 8269, 6523, 30347, 28587, 17631, 48571, 38165, 33332, 64338, 53303, 51580, 9868, 8108, 29910, 28131, 17753, 45611, 43862, 32870, 63901, 54984, 53166, 9430, 7650, 29953, 25143, 23374, 45172, 43423, 34493, 65420, 54409, 62653, 51950, 8795, 6975, 28689, 26997, 18134, 49066, 38028, 36320, 58689, 53860, 52010, 8260, 6523, 30339, 28584};
        registerClient = -765665765713567125L;
    }

    public AFd1rSDK(Map<String, Object> map, Context context) {
        this.AFKeystoreWrapper = map;
        this.valueOf = context;
        put(valueOf(), AFInAppEventType());
    }

    private static StringBuilder AFInAppEventParameterName(String... strArr) throws Exception {
        int i;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i3 = 0; i3 < 3; i3++) {
            arrayList.add(Integer.valueOf(strArr[i3].length()));
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < intValue) {
            int i5 = e + 51;
            d = i5 % 128;
            Integer num = null;
            if (i5 % 2 == 0) {
                int length2 = strArr.length;
                i = 1;
            } else {
                int length3 = strArr.length;
                i = 0;
            }
            while (i < 3) {
                int charAt = strArr[i].charAt(i4);
                if (num == null) {
                    int i6 = d + 15;
                    e = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
                i++;
            }
            sb.append(Integer.toHexString(num.intValue()));
            i4++;
            int i8 = d + 45;
            e = i8 % 128;
            int i9 = i8 % 2;
        }
        return sb;
    }

    private String valueOf() {
        int i = 2 % 2;
        int i2 = e + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFKeystoreWrapper;
            Object[] objArr = new Object[1];
            a(null, null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFKeystoreWrapper;
            Object[] objArr2 = new Object[1];
            a(null, null, "\u008d\u008c\u0081\u008b\u008a", 127 - Color.green(0), objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                Object[] objArr3 = new Object[1];
                b(Color.rgb(0, 0, 0) + 16777216, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 52199), 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder AFInAppEventParameterName2 = AFInAppEventParameterName(num, obj2, sb.toString());
            int length = AFInAppEventParameterName2.length();
            if (length > 4) {
                AFInAppEventParameterName2.delete(4, length);
                int i4 = e + 19;
                d = i4 % 128;
                int i5 = i4 % 2;
            } else {
                while (length < 4) {
                    int i6 = d + 75;
                    e = i6 % 128;
                    if (i6 % 2 != 0) {
                        length += 103;
                        AFInAppEventParameterName2.append('M');
                    } else {
                        length++;
                        AFInAppEventParameterName2.append('1');
                    }
                }
            }
            Object[] objArr4 = new Object[1];
            a(null, null, "\u0082\u0087\u008e", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr4);
            AFInAppEventParameterName2.insert(0, ((String) objArr4[0]).intern());
            String obj3 = AFInAppEventParameterName2.toString();
            int i7 = e + 87;
            d = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 81 / 0;
            }
            return obj3;
        } catch (Exception e2) {
            Object[] objArr5 = new Object[1];
            a(null, null, "\u0097\u0084\u0085\u0096\u008f\u0094\u0087\u008e\u008f\u0082\u0087\u008e\u008f\u0090\u008c\u0085\u0084\u0081\u008b\u0087\u008c\u0087\u0090\u008f\u008d\u0087\u0095\u0085\u0081\u0082\u008f\u0094\u0087\u0093\u0092\u0091\u0084\u0087\u0090\u008f", 127 - (Process.myPid() >> 22), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e2);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(View.MeasureSpec.makeMeasureSpec(0, 0) + 8, (char) (48454 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
            AFLogger.afRDLog(sb2.append(((String) objArr6[0]).intern()).append(e2).toString());
            Object[] objArr7 = new Object[1];
            b(51 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 35189), 7 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:2|3)|4|(5:5|6|7|(3:9|(1:11)(1:13)|12)|14)|(3:16|17|(10:19|20|21|22|23|(3:25|(2:27|28)(1:30)|29)|31|32|33|(1:35)(2:37|38)))|43|20|21|22|23|(0)|31|32|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02df, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02e4, code lost:
    
        r3 = new java.lang.Object[1];
        a(null, null, "\u008b¢\u008b\u008b\u0087\u008f\u0087®\u0095\u0081\u0091\u0092\u0091\u0084\u0087\u0090", 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), r3);
        com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(((java.lang.String) r3[0]).intern(), r0);
        r1 = new java.lang.StringBuilder();
        r12 = new java.lang.Object[1];
        b(116 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.View.getDefaultSize(0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 44, r12);
        com.appsflyer.AFLogger.afRDLog(r1.append(((java.lang.String) r12[0]).intern()).append(r0).toString());
        r0 = new java.lang.StringBuilder().append(r9);
        r3 = new java.lang.Object[1];
        b(160 - android.os.Process.getGidForName(""), (char) ((-1) - android.os.Process.getGidForName("")), 16 - android.view.KeyEvent.getDeadChar(0, 0), r3);
        r0 = r0.append(((java.lang.String) r3[0]).intern()).toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02b5 A[Catch: Exception -> 0x02df, TryCatch #0 {Exception -> 0x02df, blocks: (B:23:0x0222, B:25:0x02b5, B:27:0x02c1, B:29:0x02cb, B:32:0x02d1), top: B:22:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x036b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFInAppEventType() {
        String obj;
        int i;
        int i2;
        String str;
        int i3;
        int intExtra;
        int i4 = 2 % 2;
        Object obj2 = null;
        try {
            Map<String, Object> map = this.AFKeystoreWrapper;
            Object[] objArr = new Object[1];
            a(null, null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            String obj3 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFKeystoreWrapper;
            Object[] objArr2 = new Object[1];
            b(57 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.indexOf("", "", 0, 0), 15 - Color.alpha(0), objArr2);
            String obj4 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            b(TextUtils.getOffsetAfter("", 0) + 72, (char) (TextUtils.indexOf("", "", 0) + 61998), View.getDefaultSize(0, 0) + 6, objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(null, null, "\u009b\u009a\u0099\u008b\u0098", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, objArr4);
            obj = new StringBuilder("").append(AFb1lSDK.values(new StringBuilder().append(obj3).append(obj4).append(intern.replaceAll(((String) objArr4[0]).intern(), "")).toString()).substring(0, 16)).toString();
        } catch (Exception e2) {
            Object[] objArr5 = new Object[1];
            b(78 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1729), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 38, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e2);
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 116, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 44 - TextUtils.indexOf("", ""), objArr6);
            AFLogger.afRDLog(sb.append(((String) objArr6[0]).intern()).append(e2).toString());
            StringBuilder sb2 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            a(null, null, "¡ \u009c\u0092\u0082 \u009f\u008d\u009c\u009e\u009d\u009c\u0087\u0081\u0087\u008a\u0081\u008a", 127 - ExpandableListView.getPackedPositionType(0L), objArr7);
            obj = sb2.append(((String) objArr7[0]).intern()).toString();
        }
        String str2 = obj;
        try {
            Context context = this.valueOf;
            Object[] objArr8 = new Object[1];
            a(null, null, "\u00ad¦¬«¤ª©\u0083¨§¦¥¥¤£\u009a\u008c¢\u0085\u0084\u0099\u0081\u009a\u0084\u008c\u0087\u0084\u008c\u0085\u009a\u008d\u0085¢\u008b\u008d\u008c\u0081", 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr8);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            i2 = -2700;
            if (registerReceiver != null) {
                int i5 = e + 67;
                d = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr9 = new Object[1];
                    a(null, null, "\u0087\u008b®\u0084\u0081\u008b\u0087\u0089\u0086\u0087\u0084", 28971 - MotionEvent.axisFromString(""), objArr9);
                    intExtra = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), 25548);
                } else {
                    Object[] objArr10 = new Object[1];
                    a(null, null, "\u0087\u008b®\u0084\u0081\u008b\u0087\u0089\u0086\u0087\u0084", MotionEvent.axisFromString("") + 128, objArr10);
                    intExtra = registerReceiver.getIntExtra(((String) objArr10[0]).intern(), -2700);
                }
                i2 = intExtra;
            }
            str = this.valueOf.getApplicationInfo().nativeLibraryDir;
        } catch (Exception e3) {
            e = e3;
        }
        if (str != null) {
            int i6 = e + 119;
            d = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr11 = new Object[1];
            a(null, null, "°¡¯", 127 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr11);
            if (str.contains(((String) objArr11[0]).intern())) {
                i3 = 1;
                Context context2 = this.valueOf;
                Object[] objArr12 = new Object[1];
                a(null, null, "\u008b¢\u0088\u008c\u0087\u0088", View.MeasureSpec.makeMeasureSpec(0, 0) + 127, objArr12);
                int size = ((SensorManager) context2.getSystemService(((String) objArr12[0]).intern())).getSensorList(-1).size();
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr13 = new Object[1];
                b(160 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ImageFormat.getBitsPerPixel(0) + 15960), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr13);
                StringBuilder append = sb3.append(((String) objArr13[0]).intern()).append(i2);
                Object[] objArr14 = new Object[1];
                a(null, null, "¯±", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr14);
                StringBuilder append2 = append.append(((String) objArr14[0]).intern()).append(i3);
                Object[] objArr15 = new Object[1];
                a(null, null, "\u0088±", 127 - (ViewConfiguration.getTapTimeout() >> 16), objArr15);
                StringBuilder append3 = append2.append(((String) objArr15[0]).intern()).append(size);
                Object[] objArr16 = new Object[1];
                a(null, null, "\u0089±", KeyEvent.getDeadChar(0, 0) + 127, objArr16);
                String obj5 = append3.append(((String) objArr16[0]).intern()).append(this.AFKeystoreWrapper.size()).toString();
                StringBuilder append4 = new StringBuilder().append(str2);
                byte[] AFKeystoreWrapper = AFa1uSDK.AFKeystoreWrapper(AFa1uSDK.AFInAppEventParameterName(obj5));
                StringBuilder sb4 = new StringBuilder();
                for (byte b : AFKeystoreWrapper) {
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        hexString = "0".concat(String.valueOf(hexString));
                    }
                    sb4.append(hexString);
                }
                String obj6 = append4.append(sb4.toString()).toString();
                i = e + 57;
                d = i % 128;
                if (i % 2 != 0) {
                    return obj6;
                }
                obj2.hashCode();
                throw null;
            }
        }
        i3 = 0;
        Context context22 = this.valueOf;
        Object[] objArr122 = new Object[1];
        a(null, null, "\u008b¢\u0088\u008c\u0087\u0088", View.MeasureSpec.makeMeasureSpec(0, 0) + 127, objArr122);
        int size2 = ((SensorManager) context22.getSystemService(((String) objArr122[0]).intern())).getSensorList(-1).size();
        StringBuilder sb32 = new StringBuilder();
        Object[] objArr132 = new Object[1];
        b(160 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ImageFormat.getBitsPerPixel(0) + 15960), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr132);
        StringBuilder append5 = sb32.append(((String) objArr132[0]).intern()).append(i2);
        Object[] objArr142 = new Object[1];
        a(null, null, "¯±", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr142);
        StringBuilder append22 = append5.append(((String) objArr142[0]).intern()).append(i3);
        Object[] objArr152 = new Object[1];
        a(null, null, "\u0088±", 127 - (ViewConfiguration.getTapTimeout() >> 16), objArr152);
        StringBuilder append32 = append22.append(((String) objArr152[0]).intern()).append(size2);
        Object[] objArr162 = new Object[1];
        a(null, null, "\u0089±", KeyEvent.getDeadChar(0, 0) + 127, objArr162);
        String obj52 = append32.append(((String) objArr162[0]).intern()).append(this.AFKeystoreWrapper.size()).toString();
        StringBuilder append42 = new StringBuilder().append(str2);
        byte[] AFKeystoreWrapper2 = AFa1uSDK.AFKeystoreWrapper(AFa1uSDK.AFInAppEventParameterName(obj52));
        StringBuilder sb42 = new StringBuilder();
        while (r11 < r4) {
        }
        String obj62 = append42.append(sb42.toString()).toString();
        i = e + 57;
        d = i % 128;
        if (i % 2 != 0) {
        }
    }

    public static class AFa1uSDK {
        static byte[] AFInAppEventParameterName(String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        static byte[] AFKeystoreWrapper(byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) {
        int i2 = 2 % 2;
        byte[] bArr = str2;
        if (str2 != null) {
            byte[] bytes = str2.getBytes("ISO-8859-1");
            int i3 = $11 + 49;
            $10 = i3 % 128;
            bArr = bytes;
            if (i3 % 2 != 0) {
                int i4 = 5 % 2;
                bArr = bytes;
            }
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            int i5 = $11 + ComposerImplKt.nodeKey;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFj1tSDK aFj1tSDK = new AFj1tSDK();
        char[] cArr3 = AFInAppEventParameterName;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                cArr4[i7] = (char) (cArr3[i7] ^ 3877031323849928349L);
            }
            cArr3 = cArr4;
        }
        int i8 = (int) (3877031323849928349L ^ AFInAppEventType);
        if (unregisterClient) {
            aFj1tSDK.AFInAppEventParameterName = bArr2.length;
            char[] cArr5 = new char[aFj1tSDK.AFInAppEventParameterName];
            aFj1tSDK.values = 0;
            while (aFj1tSDK.values < aFj1tSDK.AFInAppEventParameterName) {
                int i9 = $10 + 67;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr5[aFj1tSDK.values] = (char) (cArr3[bArr2[(aFj1tSDK.AFInAppEventParameterName - 1) - aFj1tSDK.values] + i] - i8);
                aFj1tSDK.values++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (values) {
            aFj1tSDK.AFInAppEventParameterName = cArr2.length;
            char[] cArr6 = new char[aFj1tSDK.AFInAppEventParameterName];
            aFj1tSDK.values = 0;
            while (aFj1tSDK.values < aFj1tSDK.AFInAppEventParameterName) {
                cArr6[aFj1tSDK.values] = (char) (cArr3[cArr2[(aFj1tSDK.AFInAppEventParameterName - 1) - aFj1tSDK.values] - i] - i8);
                aFj1tSDK.values++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        aFj1tSDK.AFInAppEventParameterName = iArr.length;
        char[] cArr7 = new char[aFj1tSDK.AFInAppEventParameterName];
        aFj1tSDK.values = 0;
        while (aFj1tSDK.values < aFj1tSDK.AFInAppEventParameterName) {
            cArr7[aFj1tSDK.values] = (char) (cArr3[iArr[(aFj1tSDK.AFInAppEventParameterName - 1) - aFj1tSDK.values] - i] - i8);
            aFj1tSDK.values++;
        }
        objArr[0] = new String(cArr7);
    }

    private static void b(int i, char c, int i2, Object[] objArr) {
        int i3;
        int i4 = 2 % 2;
        AFj1ySDK aFj1ySDK = new AFj1ySDK();
        long[] jArr = new long[i2];
        aFj1ySDK.AFInAppEventType = 0;
        while (aFj1ySDK.AFInAppEventType < i2) {
            int i5 = $11 + 87;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            jArr[aFj1ySDK.AFInAppEventType] = (((char) (AFLogger[aFj1ySDK.AFInAppEventType + i] ^ (-9134379774296601976L))) ^ (aFj1ySDK.AFInAppEventType * ((-9134379774296601976L) ^ registerClient))) ^ c;
            aFj1ySDK.AFInAppEventType++;
        }
        char[] cArr = new char[i2];
        aFj1ySDK.AFInAppEventType = 0;
        while (aFj1ySDK.AFInAppEventType < i2) {
            int i7 = $10 + 29;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[aFj1ySDK.AFInAppEventType] = (char) jArr[aFj1ySDK.AFInAppEventType];
                i3 = aFj1ySDK.AFInAppEventType >> 1;
            } else {
                cArr[aFj1ySDK.AFInAppEventType] = (char) jArr[aFj1ySDK.AFInAppEventType];
                i3 = aFj1ySDK.AFInAppEventType + 1;
            }
            aFj1ySDK.AFInAppEventType = i3;
        }
        objArr[0] = new String(cArr);
    }
}
