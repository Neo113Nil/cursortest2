package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFc1iSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long AFAdRevenueData = 0;
    private static int areAllFieldsValid = 0;
    private static int component1 = 1;
    private static long getCurrencyIso4217Code;
    private static char[] getMediationNetwork;
    private final Map<String, Object> getMonetizationNetwork;
    private final Context getRevenue;

    public AFc1iSDK(Map<String, Object> map, Context context) {
        this.getMonetizationNetwork = map;
        this.getRevenue = context;
        put(AFAdRevenueData(), getMediationNetwork());
    }

    private static void b(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = $10 + 57;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        aFk1nSDK.AFAdRevenueData = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1nSDK.getRevenue = 0;
        int i5 = $10 + 29;
        while (true) {
            $11 = i5 % 128;
            int i6 = i5 % 2;
            if (aFk1nSDK.getRevenue >= cArr2.length) {
                break;
            }
            int i7 = $11 + 85;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            jArr[aFk1nSDK.getRevenue] = (cArr2[aFk1nSDK.getRevenue] ^ (aFk1nSDK.getRevenue * aFk1nSDK.AFAdRevenueData)) ^ (AFAdRevenueData ^ (-4672045500807300752L));
            aFk1nSDK.getRevenue++;
            i5 = $10 + TypedValues.TYPE_TARGET;
        }
        char[] cArr3 = new char[length];
        aFk1nSDK.getRevenue = 0;
        while (aFk1nSDK.getRevenue < cArr2.length) {
            cArr3[aFk1nSDK.getRevenue] = (char) jArr[aFk1nSDK.getRevenue];
            aFk1nSDK.getRevenue++;
        }
        objArr[0] = new String(cArr3);
    }

    private static StringBuilder getCurrencyIso4217Code(String... strArr) throws Exception {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < 3) {
            arrayList.add(Integer.valueOf(strArr[i2].length()));
            i2++;
            int i3 = areAllFieldsValid + 87;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        while (i5 < intValue) {
            int length2 = strArr.length;
            Integer num = null;
            for (int i6 = 0; i6 < 3; i6++) {
                int charAt = strArr[i6].charAt(i5);
                if (num != null) {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb.append(Integer.toHexString(num.intValue()));
            i5++;
            int i7 = areAllFieldsValid + 85;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        return sb;
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3;
        int i4 = 2 % 2;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        long[] jArr = new long[i];
        aFk1mSDK.getMediationNetwork = 0;
        int i5 = $11 + 111;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 5;
        }
        while (aFk1mSDK.getMediationNetwork < i) {
            jArr[aFk1mSDK.getMediationNetwork] = (((char) (getMediationNetwork[aFk1mSDK.getMediationNetwork + i2] ^ (-2577524606577954075L))) ^ (aFk1mSDK.getMediationNetwork * ((-2577524606577954075L) ^ getCurrencyIso4217Code))) ^ c;
            aFk1mSDK.getMediationNetwork++;
        }
        char[] cArr = new char[i];
        aFk1mSDK.getMediationNetwork = 0;
        int i7 = $11 + 111;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (aFk1mSDK.getMediationNetwork < i) {
            int i9 = $11 + 75;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[aFk1mSDK.getMediationNetwork] = (char) jArr[aFk1mSDK.getMediationNetwork];
                i3 = aFk1mSDK.getMediationNetwork / 0;
            } else {
                cArr[aFk1mSDK.getMediationNetwork] = (char) jArr[aFk1mSDK.getMediationNetwork];
                i3 = aFk1mSDK.getMediationNetwork + 1;
            }
            aFk1mSDK.getMediationNetwork = i3;
        }
        objArr[0] = new String(cArr);
    }

    private String AFAdRevenueData() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 87;
        areAllFieldsValid = i2 % 128;
        int i3 = i2 % 2;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMonetizationNetwork;
            Object[] objArr = new Object[1];
            a(13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Process.myPid() >> 22, (char) (View.MeasureSpec.getSize(0) + 12973), objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMonetizationNetwork;
            Object[] objArr2 = new Object[1];
            b("\uf4f5噬뇤።绗", TextUtils.indexOf("", "") + 41609, objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                int i4 = component1 + TypedValues.TYPE_TARGET;
                areAllFieldsValid = i4 % 128;
                if (i4 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    a(26 % (ViewConfiguration.getTapTimeout() >>> 67), 107 >>> Drawable.resolveOpacity(1, 0), (char) TextUtils.indexOf("", "", 0), objArr3);
                    str = (String) objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    a(8 - (ViewConfiguration.getTapTimeout() >> 16), 12 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf("", "", 0), objArr4);
                    str = (String) objArr4[0];
                }
                obj2 = str.intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder currencyIso4217Code = getCurrencyIso4217Code(num, obj2, sb.toString());
            int length = currencyIso4217Code.length();
            if (length > 4) {
                currencyIso4217Code.delete(4, length);
            } else {
                while (length < 4) {
                    length++;
                    currencyIso4217Code.append('1');
                    int i5 = component1 + 11;
                    areAllFieldsValid = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            Object[] objArr5 = new Object[1];
            b("\uf4fc댯筋", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18396, objArr5);
            currencyIso4217Code.insert(0, ((String) objArr5[0]).intern());
            return currencyIso4217Code.toString();
        } catch (Exception e) {
            Object[] objArr6 = new Object[1];
            b("\uf4b7ᒵ㑸听痕闼땂픑\uf6c6ᛚ㙃嘁矂靺뜴탸\uf0e7ၥ〨処熖酌넘틐\uf286ቄ㏲台獰錣볧\udcecﱜᰗ㷄巘絔鴇뻝\ude7c", 57412 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr7 = new Object[1];
            a(Color.green(0) + 42, 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7);
            AFLogger.afRDLog(sb2.append(((String) objArr7[0]).intern()).append(e).toString());
            Object[] objArr8 = new Object[1];
            b("\uf4fc\uda8dꠏ翓䵒᳕\ue254", (ViewConfiguration.getTouchSlop() >> 8) + 11903, objArr8);
            return ((String) objArr8[0]).intern();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getMediationNetwork() {
        String obj;
        int i;
        int length;
        int i2;
        String hexString;
        int i3 = 2 % 2;
        try {
            Map<String, Object> map = this.getMonetizationNetwork;
            Object[] objArr = new Object[1];
            a(12 - (KeyEvent.getMaxKeyCode() >> 16), ViewConfiguration.getFadingEdgeLength() >> 16, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12972), objArr);
            String obj2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMonetizationNetwork;
            Object[] objArr2 = new Object[1];
            b("\uf4f1㞛爯뻋亮␢您ꌡ\uefd1⩹唍醄\udc4aᣂ孴", Color.blue(0) + 50021, objArr2);
            String obj3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 6, 62 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 8465), objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a('5' - AndroidCharacter.getMirror('0'), Color.rgb(0, 0, 0) + 16777284, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
            obj = new StringBuilder("").append(AFj1dSDK.getCurrencyIso4217Code(new StringBuilder().append(obj2).append(obj3).append(intern.replaceAll(((String) objArr4[0]).intern(), "")).toString()).substring(0, 16)).toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            b("\uf4f0ꞯ剙໖맑吐Ø데渊᪷딕怎Ც콇篭ᚁ섣続⡺\udb15瞽≓\udd1b覭\u245b탫莋㸿\uea9b蕵〔\uecb2鼗䨜\ue6ac酌䷶\uf883", 21341 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(44 - View.MeasureSpec.getSize(0), 73 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) Color.red(0), objArr6);
            AFLogger.afRDLog(sb.append(((String) objArr6[0]).intern()).append(e).toString());
            StringBuilder sb2 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            b("\uf4f5ꑁ喛ۗ똪条ჭ솣焛⋈폕荳㰲\uedba麧丞ￖꢈ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20662, objArr7);
            obj = sb2.append(((String) objArr7[0]).intern()).toString();
        }
        String str = obj;
        try {
            Context context = this.getRevenue;
            Object[] objArr8 = new Object[1];
            a(37 - (ViewConfiguration.getScrollBarSize() >> 8), 117 - (Process.myPid() >> 22), (char) TextUtils.getOffsetBefore("", 0), objArr8);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int i4 = -2700;
            if (registerReceiver != null) {
                Object[] objArr9 = new Object[1];
                a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, View.combineMeasuredStates(0, 0) + 154, (char) Color.argb(0, 0, 0, 0), objArr9);
                i4 = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            String str2 = this.getRevenue.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                Object[] objArr10 = new Object[1];
                b("\uf4ef\udfc6ꉳ", 11112 - TextUtils.lastIndexOf("", '0'), objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    i = 1;
                    Context context2 = this.getRevenue;
                    Object[] objArr11 = new Object[1];
                    b("\uf4e4霛㌫\udf5f筜ݨ", TextUtils.lastIndexOf("", '0') + 25578, objArr11);
                    int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
                    StringBuilder sb3 = new StringBuilder();
                    Object[] objArr12 = new Object[1];
                    a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, 165 - View.MeasureSpec.getMode(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr12);
                    StringBuilder append = sb3.append(((String) objArr12[0]).intern()).append(i4);
                    Object[] objArr13 = new Object[1];
                    b("\uf4b1앾", Color.red(0) + 12689, objArr13);
                    StringBuilder append2 = append.append(((String) objArr13[0]).intern()).append(i);
                    Object[] objArr14 = new Object[1];
                    a(View.combineMeasuredStates(0, 0) + 2, (-16777050) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51722), objArr14);
                    StringBuilder append3 = append2.append(((String) objArr14[0]).intern()).append(size);
                    Object[] objArr15 = new Object[1];
                    b("\uf4b1诖", 32561 - View.resolveSizeAndState(0, 0, 0), objArr15);
                    String obj4 = append3.append(((String) objArr15[0]).intern()).append(this.getMonetizationNetwork.size()).toString();
                    StringBuilder append4 = new StringBuilder().append(str);
                    byte[] mediationNetwork = AFa1ySDK.getMediationNetwork(AFa1ySDK.AFAdRevenueData(obj4));
                    StringBuilder sb4 = new StringBuilder();
                    length = mediationNetwork.length;
                    for (i2 = 0; i2 < length; i2++) {
                        int i5 = component1 + 37;
                        areAllFieldsValid = i5 % 128;
                        if (i5 % 2 != 0) {
                            hexString = Integer.toHexString(mediationNetwork[i2]);
                            if (hexString.length() == 1) {
                                hexString = "0".concat(String.valueOf(hexString));
                                int i6 = component1 + 69;
                                areAllFieldsValid = i6 % 128;
                                int i7 = i6 % 2;
                                sb4.append(hexString);
                            } else {
                                sb4.append(hexString);
                            }
                        } else {
                            hexString = Integer.toHexString(mediationNetwork[i2]);
                            if (hexString.length() != 1) {
                                sb4.append(hexString);
                            }
                            hexString = "0".concat(String.valueOf(hexString));
                            int i62 = component1 + 69;
                            areAllFieldsValid = i62 % 128;
                            int i72 = i62 % 2;
                            sb4.append(hexString);
                        }
                    }
                    return append4.append(sb4.toString()).toString();
                }
            }
            i = 0;
            Context context22 = this.getRevenue;
            Object[] objArr112 = new Object[1];
            b("\uf4e4霛㌫\udf5f筜ݨ", TextUtils.lastIndexOf("", '0') + 25578, objArr112);
            int size2 = ((SensorManager) context22.getSystemService(((String) objArr112[0]).intern())).getSensorList(-1).size();
            StringBuilder sb32 = new StringBuilder();
            Object[] objArr122 = new Object[1];
            a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, 165 - View.MeasureSpec.getMode(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr122);
            StringBuilder append5 = sb32.append(((String) objArr122[0]).intern()).append(i4);
            Object[] objArr132 = new Object[1];
            b("\uf4b1앾", Color.red(0) + 12689, objArr132);
            StringBuilder append22 = append5.append(((String) objArr132[0]).intern()).append(i);
            Object[] objArr142 = new Object[1];
            a(View.combineMeasuredStates(0, 0) + 2, (-16777050) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51722), objArr142);
            StringBuilder append32 = append22.append(((String) objArr142[0]).intern()).append(size2);
            Object[] objArr152 = new Object[1];
            b("\uf4b1诖", 32561 - View.resolveSizeAndState(0, 0, 0), objArr152);
            String obj42 = append32.append(((String) objArr152[0]).intern()).append(this.getMonetizationNetwork.size()).toString();
            StringBuilder append42 = new StringBuilder().append(str);
            byte[] mediationNetwork2 = AFa1ySDK.getMediationNetwork(AFa1ySDK.AFAdRevenueData(obj42));
            StringBuilder sb42 = new StringBuilder();
            length = mediationNetwork2.length;
            while (i2 < length) {
            }
            return append42.append(sb42.toString()).toString();
        } catch (Exception e2) {
            Object[] objArr16 = new Object[1];
            a(16 - View.MeasureSpec.getSize(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 168, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr16);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e2);
            StringBuilder sb5 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            a(KeyEvent.getDeadChar(0, 0) + 44, TextUtils.lastIndexOf("", '0') + 74, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr17);
            AFLogger.afRDLog(sb5.append(((String) objArr17[0]).intern()).append(e2).toString());
            StringBuilder append6 = new StringBuilder().append(str);
            Object[] objArr18 = new Object[1];
            b("\uf4f1仦聤\uda64ᷢ埣ꥡ\ue361⛯磬눯\uf43f俳膮\udb78ᴵ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 47681, objArr18);
            return append6.append(((String) objArr18[0]).intern()).toString();
        }
    }

    public static class AFa1ySDK {
        static byte[] AFAdRevenueData(String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        static byte[] getMediationNetwork(byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }
    }

    static void getCurrencyIso4217Code() {
        getMediationNetwork = new char[]{32809, 60417, 22601, 50353, 12445, 40142, 2359, 30066, 57668, 19854, 47603, 9789, 45739, 56965, 27364, 63018, 523, 44623, 15281, 18408, 45699, 57003, 27346, 62980, 572, 44650, 15327, 18379, 54264, 32556, 35670, 5266, 41136, 52466, 22558, 58442, 28786, 40410, 10688, 46589, 49455, 27934, 65156, 2745, 38644, 8786, 20052, 55929, 26549, 62430, 8007, 43825, 14205, 16521, 60606, 30968, 33805, 4167, 48240, 51618, 21895, 57666, 37826, 65525, 19355, 55118, 9062, 36649, 45768, 57016, 27352, 63046, 627, 45699, 57003, 27346, 62980, 572, 44650, 15327, 18379, 54264, 32556, 35670, 5266, 41136, 52466, 22558, 58442, 28786, 40410, 10688, 46589, 49455, 27934, 65177, 2749, 38625, 8711, 20038, 55856, 26550, 62431, 7955, 43836, 14117, 16527, 60579, 30955, 33820, 4190, 48235, 51621, 21970, 57612, 3433, 39200, 45700, 56996, 27359, 63002, 566, 44647, 15259, 18306, 54260, 32556, 35655, 5253, 41151, 52466, 22617, 58437, 28790, 40334, 10690, 46583, 49447, 27920, 65197, 2717, 38617, 8742, 20070, 55874, 26520, 62441, 7972, 43804, 14148, 16548, 60572, 30925, 33853, 45713, 57007, 27350, 63000, 572, 44668, 15262, 18392, 54248, 32560, 35670, 45703, 30921, 5299, 45698, 57007, 27343, 63038, 619, 44632, 15262, 18368, 54248, 32551, 35603, 5253, 41123, 52468, 22552, 58454};
        getCurrencyIso4217Code = 4920180562940649162L;
        AFAdRevenueData = 2584127450055626215L;
    }

    static {
        getCurrencyIso4217Code();
        TypedValue.complexToFloat(0);
        Color.red(0);
        PointF.length(0.0f, 0.0f);
        SystemClock.elapsedRealtime();
        Process.getGidForName("");
        Color.alpha(0);
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getFadingEdgeLength();
        AudioTrack.getMaxVolume();
        int i = component1 + TypedValues.TYPE_TARGET;
        areAllFieldsValid = i % 128;
        int i2 = i % 2;
    }
}
