package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.google.firebase.encoders.json.BuildConfig;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1eSDK {
    private static long AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 0;
    private static char AFKeystoreWrapper = 0;
    private static char afDebugLog = 0;
    private static int afErrorLog = 0;
    private static char afInfoLog = 0;
    private static int afRDLog = 1;
    private static char valueOf;
    private static char values;

    static {
        values();
        ExpandableListView.getPackedPositionForChild(0, 0);
        Process.getGidForName(BuildConfig.FLAVOR);
        Process.getGidForName(BuildConfig.FLAVOR);
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getGlobalActionKeyTimeout();
        Color.green(0);
        Color.alpha(0);
        KeyEvent.getDeadChar(0, 0);
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getPressedStateDuration();
        Color.argb(0, 0, 0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        AndroidCharacter.getMirror('0');
        afErrorLog = (afRDLog + 71) % 128;
    }

    private static String AFInAppEventParameterName(String str, Long l) {
        int i = afErrorLog;
        afRDLog = (i + 109) % 128;
        if (str != null) {
            afRDLog = (i + 11) % 128;
            if (l != null && str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String obj = l.toString();
                int i2 = 0;
                for (int i3 = 0; i3 < obj.length(); i3++) {
                    i2 += Character.getNumericValue(obj.charAt(i3));
                }
                String hexString = Integer.toHexString(i2);
                sb.replace(7, hexString.length() + 7, hexString);
                long j = 0;
                int i4 = 0;
                while (i4 < sb.length()) {
                    j += Character.getNumericValue(sb.charAt(i4));
                    i4++;
                    afRDLog = (afErrorLog + 53) % 128;
                }
                while (j > 100) {
                    j %= 100;
                }
                sb.insert(23, (int) j);
                if (j < 10) {
                    Object[] objArr = new Object[1];
                    valueOf((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 63594), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1250816196, objArr);
                    sb.insert(23, ((String) objArr[0]).intern());
                }
                return sb.toString();
            }
        }
        Object[] objArr2 = new Object[1];
        AFInAppEventParameterName("\ude4bี늷뗪ᒓ\udb04휑翭䛢ﶇ\u1ae1솆貇漥룑쏩吐닁\udce1\u3d0e1\ud8b4葬氕߃\uf57e虶\uea14⸰떂ṡ\ue2e1", 32 - View.MeasureSpec.getMode(0), objArr2);
        String intern = ((String) objArr2[0]).intern();
        afErrorLog = (afRDLog + 21) % 128;
        return intern;
    }

    private static String AFInAppEventType(Context context) {
        afErrorLog = (afRDLog + 31) % 128;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            afRDLog = (afErrorLog + 53) % 128;
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            Object[] objArr = new Object[1];
            valueOf((char) (12412 - View.resolveSize(0, 0)), "\u0000\u0000\u0000\u0000", "\ue309泰籚㔰", "욶䄍ᔌῙ胕崿嗷ొ⤤ꆒ\uf1b6\udf3d肠勖ὦ댶蕕媕쓰赁\udf79嬬\uf130\ude19痼購恑\uf852\ueac0", 1517088995 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e);
            return null;
        }
    }

    private static String AFKeystoreWrapper(Context context, StringBuilder sb) {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        String packageName = context.getPackageName();
        String valueOf2 = valueOf(packageName);
        Object[] objArr = new Object[1];
        valueOf((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 54128), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - ExpandableListView.getPackedPositionGroup(0L), objArr);
        sb.append(((String) objArr[0]).intern());
        sb2.append(valueOf2);
        if (valueOf(context) == null) {
            int i = afErrorLog + 113;
            afRDLog = i % 128;
            if (i % 2 == 0) {
                Object[] objArr2 = new Object[1];
                valueOf((char) (63594 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", 3947 - AndroidCharacter.getMirror((char) 29), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                valueOf((char) (63594 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", 3947 - AndroidCharacter.getMirror('0'), objArr3);
                obj = objArr3[0];
            }
            sb.append(((String) obj).intern());
            sb2.append(packageName);
        } else {
            Object[] objArr4 = new Object[1];
            valueOf((char) (54127 - View.MeasureSpec.getMode(0)), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - Color.argb(0, 0, 0, 0), objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb2.append(packageName);
        }
        String AFInAppEventType2 = AFInAppEventType(context);
        if (AFInAppEventType2 == null) {
            afRDLog = (afErrorLog + 31) % 128;
            Object[] objArr5 = new Object[1];
            valueOf((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 63594), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", Drawable.resolveOpacity(0, 0) - 1250816197, objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb2.append(packageName);
        } else {
            Object[] objArr6 = new Object[1];
            valueOf((char) (54127 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr6);
            sb.append(((String) objArr6[0]).intern());
            sb2.append(AFInAppEventType2);
        }
        sb2.append(Boolean.TRUE.toString());
        String obj2 = sb2.toString();
        int i2 = afRDLog + 49;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            return obj2;
        }
        throw null;
    }

    private static void valueOf(StringBuilder sb) {
        String intern;
        Object obj;
        String intern2;
        Object obj2;
        Object[] objArr = new Object[1];
        valueOf((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), "\u0000\u0000\u0000\u0000", "\ud919狮鈭㐗", "㽆꯵\ue38b\uf2ec蝇\ueaae떧᫂尥漛䁶줸\ue5be⣤⚆ਃ▌\uecf7倮ፔ混독\u0ac6썴웣", Color.argb(0, 0, 0, 0) + 762506969, objArr);
        if (AFInAppEventParameterName(((String) objArr[0]).intern())) {
            Object[] objArr2 = new Object[1];
            valueOf((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 54127), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (ViewConfiguration.getTapTimeout() >> 16) - 1420046501, objArr2);
            intern = ((String) objArr2[0]).intern();
        } else {
            Object[] objArr3 = new Object[1];
            valueOf((char) (63594 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1250816197, objArr3);
            intern = ((String) objArr3[0]).intern();
            afErrorLog = (afRDLog + 97) % 128;
        }
        sb.append(intern);
        Object[] objArr4 = new Object[1];
        AFInAppEventParameterName("隢瀨㊈\uda5c谎鑨筆졪˩ཉꍀ즳凎㫫\ud888\uf85f꺻붿뜠ꎁﴗ\ue199ᙀ付", View.MeasureSpec.makeMeasureSpec(0, 0) + 23, objArr4);
        if (AFInAppEventParameterName(((String) objArr4[0]).intern())) {
            afRDLog = (afErrorLog + 21) % 128;
            Object[] objArr5 = new Object[1];
            valueOf((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54126), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046500) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
            obj = objArr5[0];
        } else {
            Object[] objArr6 = new Object[1];
            valueOf((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63593), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (-1267593413) - Color.rgb(0, 0, 0), objArr6);
            obj = objArr6[0];
        }
        sb.append(((String) obj).intern());
        Object[] objArr7 = new Object[1];
        AFInAppEventParameterName("隢瀨㊈\uda5c谎鑨筆졪ᨓ릞錹\uf249咻彲㪜䙏㟠\uec6c譶ㆻ", (ViewConfiguration.getEdgeSlop() >> 16) + 20, objArr7);
        if (AFInAppEventParameterName(((String) objArr7[0]).intern())) {
            Object[] objArr8 = new Object[1];
            valueOf((char) (54127 - KeyEvent.normalizeMetaState(0)), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8);
            intern2 = ((String) objArr8[0]).intern();
            afRDLog = (afErrorLog + 17) % 128;
        } else {
            Object[] objArr9 = new Object[1];
            valueOf((char) (63594 - View.MeasureSpec.getMode(0)), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (-1250816197) - ExpandableListView.getPackedPositionGroup(0L), objArr9);
            intern2 = ((String) objArr9[0]).intern();
        }
        sb.append(intern2);
        Object[] objArr10 = new Object[1];
        valueOf((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35003), "\u0000\u0000\u0000\u0000", "\ueed0㗙뭃ֈ", "윶剐㚑䮧뀑䬂꜆縵뜁Ḽ\ue7ce\uf366\uef0a\ude33䜋", 1127602670 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr10);
        if (AFInAppEventParameterName(((String) objArr10[0]).intern())) {
            afErrorLog = (afRDLog + 7) % 128;
            Object[] objArr11 = new Object[1];
            valueOf((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54126), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", KeyEvent.getDeadChar(0, 0) - 1420046501, objArr11);
            obj2 = objArr11[0];
        } else {
            Object[] objArr12 = new Object[1];
            valueOf((char) (63594 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1250816197, objArr12);
            obj2 = objArr12[0];
        }
        sb.append(((String) obj2).intern());
    }

    private static String values(String str) {
        afRDLog = (afErrorLog + 15) % 128;
        String num = Integer.toString(Integer.parseInt(str, 2), 16);
        int i = afRDLog + 57;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            return num;
        }
        throw null;
    }

    public static void values() {
        AFInAppEventType = 0;
        AFKeystoreWrapper = (char) 19325;
        AFInAppEventParameterName = 0L;
        values = (char) 55185;
        afDebugLog = (char) 62718;
        valueOf = (char) 51046;
        afInfoLog = (char) 53155;
    }

    private static String AFInAppEventType(String str) {
        int i = afErrorLog + 81;
        afRDLog = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
            return AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.AFInAppEventParameterName(str));
        }
        return AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.AFInAppEventParameterName(str));
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class AFa1xSDK extends HashMap<String, Object> {
        private static char[] AFInAppEventType = null;
        private static int afDebugLog = 1;
        private static int afRDLog;
        private static char valueOf;
        private static int[] values;
        private final Map<String, Object> AFInAppEventParameterName;
        private final Context AFKeystoreWrapper;

        static {
            valueOf();
            Process.getThreadPriority(0);
            Color.red(0);
            View.resolveSizeAndState(0, 0, 0);
            TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
            ViewConfiguration.getTouchSlop();
            TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
            Color.blue(0);
            KeyEvent.getModifierMetaStateMask();
            ViewConfiguration.getEdgeSlop();
            MotionEvent.axisFromString(BuildConfig.FLAVOR);
            ViewConfiguration.getScrollDefaultDelay();
            afDebugLog = (afRDLog + 83) % 128;
        }

        public AFa1xSDK(Map<String, Object> map, Context context) {
            this.AFInAppEventParameterName = map;
            this.AFKeystoreWrapper = context;
            put(AFInAppEventParameterName(), AFInAppEventType());
        }

        private String AFInAppEventParameterName() {
            afDebugLog = (afRDLog + 95) % 128;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                Map<String, Object> map = this.AFInAppEventParameterName;
                Object[] objArr = new Object[1];
                AFInAppEventParameterName(new int[]{1778309776, -811727697, -2144580672, 291596461, -328504224, -511155222}, Drawable.resolveOpacity(0, 0) + 12, objArr);
                String obj = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.AFInAppEventParameterName;
                Object[] objArr2 = new Object[1];
                AFInAppEventType((byte) ((Process.myPid() >> 22) + 95), "\u0017\u0007. 㙝", TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 5, objArr2);
                String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
                if (obj2 == null) {
                    afDebugLog = (afRDLog + 57) % 128;
                    Object[] objArr3 = new Object[1];
                    AFInAppEventType((byte) (9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "-\u0001\u0000\u0010\u0005\u000f\u0001+", 8 - Color.argb(0, 0, 0, 0), objArr3);
                    obj2 = ((String) objArr3[0]).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder values2 = values(num, obj2, sb.toString());
                int length = values2.length();
                if (length > 4) {
                    int i = afRDLog + 99;
                    afDebugLog = i % 128;
                    if (i % 2 == 0) {
                        values2.delete(3, length);
                    } else {
                        values2.delete(4, length);
                    }
                } else {
                    while (length < 4) {
                        length++;
                        values2.append('1');
                    }
                }
                Object[] objArr4 = new Object[1];
                AFInAppEventParameterName(new int[]{2088029896, 1668591072}, 3 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                values2.insert(0, ((String) objArr4[0]).intern());
                return values2.toString();
            } catch (Exception e) {
                Object[] objArr5 = new Object[1];
                AFInAppEventType((byte) (75 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u000f\u00170/\u0006*\u0013-\u0010\u0011 &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011!*\u0010\u0011+\u00070 ", 40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                AFInAppEventType((byte) (38 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), " &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011!*\u0010\u0011+\u00070 \u0013,.\u0002+!+\u000b\u000b\u001b\u001e\u0013", 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
                sb2.append(((String) objArr6[0]).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                Object[] objArr7 = new Object[1];
                AFInAppEventParameterName(new int[]{-1705480036, -41642021, -1744439853, -1046563467}, Process.getGidForName(BuildConfig.FLAVOR) + 8, objArr7);
                return ((String) objArr7[0]).intern();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x01bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private String AFInAppEventType() {
            String obj;
            Intent registerReceiver;
            int i;
            String str;
            int i2;
            try {
                Map<String, Object> map = this.AFInAppEventParameterName;
                Object[] objArr = new Object[1];
                AFInAppEventParameterName(new int[]{1778309776, -811727697, -2144580672, 291596461, -328504224, -511155222}, Color.alpha(0) + 12, objArr);
                String obj2 = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.AFInAppEventParameterName;
                Object[] objArr2 = new Object[1];
                AFInAppEventType((byte) (2 - (KeyEvent.getMaxKeyCode() >> 16)), "\u001d\n\r\u0010\u0004'($ \u000b\u001d).\u0004㘁", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr2);
                String obj3 = map2.get(((String) objArr2[0]).intern()).toString();
                Object[] objArr3 = new Object[1];
                AFInAppEventParameterName(new int[]{-957037223, -48509119, -781409150, -1864855913}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6, objArr3);
                String intern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                AFInAppEventType((byte) ((-16777094) - Color.rgb(0, 0, 0)), "\u0002\r\u0003\u000b㘪", MotionEvent.axisFromString(BuildConfig.FLAVOR) + 6, objArr4);
                String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), BuildConfig.FLAVOR);
                StringBuilder sb = new StringBuilder();
                sb.append(obj2);
                sb.append(obj3);
                sb.append(replaceAll);
                obj = AFb1zSDK.AFInAppEventParameterName(sb.toString()).substring(0, 16);
            } catch (Exception e) {
                Object[] objArr5 = new Object[1];
                AFInAppEventParameterName(new int[]{-416946030, 710826945, -721845652, -606805070, -656728386, -824473881, 2061236325, -373006266, -1963241931, 776244818, -1295737303, 1768028883, -1965365971, -1459769893, -1630881150, -1791863435, -1181216282, 1355290083, -1266044688, -1956450597}, 38 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                AFInAppEventType((byte) (98 - Color.blue(0)), " &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011&(\u001c%,\u0013+\u00070 \u0013,.\u0002+!+\u000b\u000b\u001b\u001e\u0013", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, objArr6);
                sb2.append(((String) objArr6[0]).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                StringBuilder sb3 = new StringBuilder(BuildConfig.FLAVOR);
                Object[] objArr7 = new Object[1];
                AFInAppEventParameterName(new int[]{-1151461714, 1565074594, -1850512278, 514834606, 1194055798, -1696618900, 1536878782, -1259306217, 1783200123, 1729847339}, 18 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr7);
                sb3.append(((String) objArr7[0]).intern());
                obj = sb3.toString();
            }
            String str2 = obj;
            try {
                Context context = this.AFKeystoreWrapper;
                Object[] objArr8 = new Object[1];
                AFInAppEventParameterName(new int[]{2044496534, 528388750, -1686629640, 1835117483, 1770770382, -1235532254, -714927166, 1500939199, -464379084, 560559935, 1727326430, -1030033190, -1619800523, 296789805, 1253235640, -1524000400, 193545974, -652606870, 828608735, -1376456997}, Color.alpha(0) + 37, objArr8);
                registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
                i = -2700;
            } catch (Exception e2) {
                e = e2;
            }
            try {
                if (registerReceiver != null) {
                    int i3 = afDebugLog + 37;
                    afRDLog = i3 % 128;
                    if (i3 % 2 == 0) {
                        Object[] objArr9 = new Object[1];
                        AFInAppEventType((byte) (72 - ((byte) KeyEvent.getModifierMetaStateMask())), "/0$\u001f,\f.\u0004%\u0007㙈", Color.green(0) + 11, objArr9);
                        i = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
                        str = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
                        if (str != null) {
                            afRDLog = (afDebugLog + 33) % 128;
                            Object[] objArr10 = new Object[1];
                            AFInAppEventType((byte) (((Process.getThreadPriority(0) + 20) >> 6) + 18), "/\u0017㖾", View.getDefaultSize(0, 0) + 3, objArr10);
                            if (str.contains(((String) objArr10[0]).intern())) {
                                afRDLog = (afDebugLog + 45) % 128;
                                i2 = 1;
                                Context context2 = this.AFKeystoreWrapper;
                                Object[] objArr11 = new Object[1];
                                AFInAppEventParameterName(new int[]{1742378786, 1923556584, -1407937301, 133347245}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, objArr11);
                                int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
                                StringBuilder sb4 = new StringBuilder();
                                Object[] objArr12 = new Object[1];
                                AFInAppEventParameterName(new int[]{1796820622, 951799376}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr12);
                                sb4.append(((String) objArr12[0]).intern());
                                sb4.append(i);
                                Object[] objArr13 = new Object[1];
                                AFInAppEventType((byte) (66 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u00170", 1 - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr13);
                                sb4.append(((String) objArr13[0]).intern());
                                sb4.append(i2);
                                Object[] objArr14 = new Object[1];
                                AFInAppEventType((byte) (AndroidCharacter.getMirror('0') + '\r'), "\"\u001b", Color.rgb(0, 0, 0) + 16777218, objArr14);
                                sb4.append(((String) objArr14[0]).intern());
                                sb4.append(size);
                                Object[] objArr15 = new Object[1];
                                AFInAppEventType((byte) (Color.argb(0, 0, 0, 0) + 125), "\u0016\"", 1 - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr15);
                                sb4.append(((String) objArr15[0]).intern());
                                sb4.append(this.AFInAppEventParameterName.size());
                                String obj4 = sb4.toString();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(str2);
                                sb5.append(AFa1ySDK.values(obj4));
                                return sb5.toString();
                            }
                        }
                        i2 = 0;
                        Context context22 = this.AFKeystoreWrapper;
                        Object[] objArr112 = new Object[1];
                        AFInAppEventParameterName(new int[]{1742378786, 1923556584, -1407937301, 133347245}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, objArr112);
                        int size2 = ((SensorManager) context22.getSystemService(((String) objArr112[0]).intern())).getSensorList(-1).size();
                        StringBuilder sb42 = new StringBuilder();
                        Object[] objArr122 = new Object[1];
                        AFInAppEventParameterName(new int[]{1796820622, 951799376}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr122);
                        sb42.append(((String) objArr122[0]).intern());
                        sb42.append(i);
                        Object[] objArr132 = new Object[1];
                        AFInAppEventType((byte) (66 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u00170", 1 - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr132);
                        sb42.append(((String) objArr132[0]).intern());
                        sb42.append(i2);
                        Object[] objArr142 = new Object[1];
                        AFInAppEventType((byte) (AndroidCharacter.getMirror('0') + '\r'), "\"\u001b", Color.rgb(0, 0, 0) + 16777218, objArr142);
                        sb42.append(((String) objArr142[0]).intern());
                        sb42.append(size2);
                        Object[] objArr152 = new Object[1];
                        AFInAppEventType((byte) (Color.argb(0, 0, 0, 0) + 125), "\u0016\"", 1 - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr152);
                        sb42.append(((String) objArr152[0]).intern());
                        sb42.append(this.AFInAppEventParameterName.size());
                        String obj42 = sb42.toString();
                        StringBuilder sb52 = new StringBuilder();
                        sb52.append(str2);
                        sb52.append(AFa1ySDK.values(obj42));
                        return sb52.toString();
                    }
                    Object[] objArr16 = new Object[1];
                    AFInAppEventType((byte) (64 % ((byte) KeyEvent.getModifierMetaStateMask())), "/0$\u001f,\f.\u0004%\u0007㙈", 77 >>> Color.green(0), objArr16);
                    i = registerReceiver.getIntExtra(((String) objArr16[0]).intern(), 27046);
                }
                Object[] objArr1122 = new Object[1];
                AFInAppEventParameterName(new int[]{1742378786, 1923556584, -1407937301, 133347245}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, objArr1122);
                int size22 = ((SensorManager) context22.getSystemService(((String) objArr1122[0]).intern())).getSensorList(-1).size();
                StringBuilder sb422 = new StringBuilder();
                Object[] objArr1222 = new Object[1];
                AFInAppEventParameterName(new int[]{1796820622, 951799376}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr1222);
                sb422.append(((String) objArr1222[0]).intern());
                sb422.append(i);
                Object[] objArr1322 = new Object[1];
                AFInAppEventType((byte) (66 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u00170", 1 - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr1322);
                sb422.append(((String) objArr1322[0]).intern());
                sb422.append(i2);
                Object[] objArr1422 = new Object[1];
                AFInAppEventType((byte) (AndroidCharacter.getMirror('0') + '\r'), "\"\u001b", Color.rgb(0, 0, 0) + 16777218, objArr1422);
                sb422.append(((String) objArr1422[0]).intern());
                sb422.append(size22);
                Object[] objArr1522 = new Object[1];
                AFInAppEventType((byte) (Color.argb(0, 0, 0, 0) + 125), "\u0016\"", 1 - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr1522);
                sb422.append(((String) objArr1522[0]).intern());
                sb422.append(this.AFInAppEventParameterName.size());
                String obj422 = sb422.toString();
                StringBuilder sb522 = new StringBuilder();
                sb522.append(str2);
                sb522.append(AFa1ySDK.values(obj422));
                return sb522.toString();
            } catch (Exception e3) {
                e = e3;
                Object[] objArr17 = new Object[1];
                AFInAppEventType((byte) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 24), "\u001a+*\u0004*\u0006% (*\u0013,㘀㘀\u0007\n", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr17);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr17[0]).intern(), e);
                StringBuilder sb6 = new StringBuilder();
                Object[] objArr18 = new Object[1];
                AFInAppEventType((byte) (98 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), " &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011&(\u001c%,\u0013+\u00070 \u0013,.\u0002+!+\u000b\u000b\u001b\u001e\u0013", 44 - Color.argb(0, 0, 0, 0), objArr18);
                sb6.append(((String) objArr18[0]).intern());
                sb6.append(e);
                AFLogger.afRDLog(sb6.toString());
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str2);
                Object[] objArr19 = new Object[1];
                AFInAppEventType((byte) (Gravity.getAbsoluteGravity(0, 0) + 15), "!&\u0013'\u0011\u0019\u001f\u0016\"+.\u0006 0('", '@' - AndroidCharacter.getMirror('0'), objArr19);
                sb7.append(((String) objArr19[0]).intern());
                return sb7.toString();
            }
            str = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
            if (str != null) {
            }
            i2 = 0;
            Context context222 = this.AFKeystoreWrapper;
        }

        public static void valueOf() {
            values = new int[]{323477, -837362401, -1518965032, 1761212227, -1478818744, 1855273808, -1845241240, -1586645423, 2081753500, -1156207946, -933194515, 1757930608, -673555019, -1460093762, 1670218587, 382928275, 847721556, -1279575317};
            valueOf = (char) 7;
            AFInAppEventType = new char[]{13772, 13768, 13765, 13781, 13817, 13740, 13751, 13822, 13811, 13800, 13748, 13774, 13776, 13813, 13784, 13795, 13754, 13777, 13803, 13787, 13801, 13816, 13821, 13744, 13739, 13812, 13730, 13756, 13809, 13802, 13814, 13820, 13782, 13728, 13810, 13807, 13790, 13804, 13815, 13819, 13738, 13773, 13805, 13780, 13794, 13775, 13806, 13823, 13736};
        }

        private static StringBuilder values(String... strArr) {
            int charAt;
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                arrayList.add(Integer.valueOf(strArr[i].length()));
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < intValue) {
                Integer num = null;
                for (int i3 = 0; i3 < 3; i3++) {
                    int i4 = afRDLog + 79;
                    afDebugLog = i4 % 128;
                    if (i4 % 2 == 0) {
                        charAt = strArr[i3].charAt(i2);
                        int i5 = 89 / 0;
                        if (num == null) {
                            num = Integer.valueOf(charAt);
                        }
                        charAt ^= num.intValue();
                        num = Integer.valueOf(charAt);
                    } else {
                        charAt = strArr[i3].charAt(i2);
                        if (num == null) {
                            num = Integer.valueOf(charAt);
                        }
                        charAt ^= num.intValue();
                        num = Integer.valueOf(charAt);
                    }
                }
                sb.append(Integer.toHexString(num.intValue()));
                i2++;
                afRDLog = (afDebugLog + 105) % 128;
            }
            return sb;
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static class AFa1ySDK {
            private static int AFInAppEventParameterName = 78;
            private static int AFInAppEventType = 1;
            private static int valueOf;

            private static void AFInAppEventParameterName(boolean z, int i, String str, int i2, int i3, Object[] objArr) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (AFg1lSDK.valueOf) {
                    try {
                        char[] cArr3 = new char[i2];
                        AFg1lSDK.AFKeystoreWrapper = 0;
                        while (true) {
                            int i4 = AFg1lSDK.AFKeystoreWrapper;
                            if (i4 >= i2) {
                                break;
                            }
                            AFg1lSDK.AFInAppEventParameterName = cArr2[i4];
                            cArr3[AFg1lSDK.AFKeystoreWrapper] = (char) (AFg1lSDK.AFInAppEventParameterName + i);
                            int i5 = AFg1lSDK.AFKeystoreWrapper;
                            cArr3[i5] = (char) (cArr3[i5] - AFInAppEventParameterName);
                            AFg1lSDK.AFKeystoreWrapper = i5 + 1;
                        }
                        if (i3 > 0) {
                            AFg1lSDK.AFInAppEventType = i3;
                            char[] cArr4 = new char[i2];
                            System.arraycopy(cArr3, 0, cArr4, 0, i2);
                            int i6 = AFg1lSDK.AFInAppEventType;
                            System.arraycopy(cArr4, 0, cArr3, i2 - i6, i6);
                            int i7 = AFg1lSDK.AFInAppEventType;
                            System.arraycopy(cArr4, i7, cArr3, 0, i2 - i7);
                        }
                        if (z) {
                            char[] cArr5 = new char[i2];
                            AFg1lSDK.AFKeystoreWrapper = 0;
                            while (true) {
                                int i8 = AFg1lSDK.AFKeystoreWrapper;
                                if (i8 >= i2) {
                                    break;
                                }
                                cArr5[i8] = cArr3[(i2 - i8) - 1];
                                AFg1lSDK.AFKeystoreWrapper = i8 + 1;
                            }
                            cArr3 = cArr5;
                        }
                        str2 = new String(cArr3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                objArr[0] = str2;
            }

            private static byte[] AFInAppEventType(String str) {
                AFInAppEventType = (valueOf + 43) % 128;
                byte[] bytes = str.getBytes(Charset.defaultCharset());
                int i = valueOf + 57;
                AFInAppEventType = i % 128;
                if (i % 2 != 0) {
                    return bytes;
                }
                throw null;
            }

            private static String AFKeystoreWrapper(byte[] bArr) {
                StringBuilder sb = new StringBuilder();
                AFInAppEventType = (valueOf + 125) % 128;
                for (byte b : bArr) {
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr = new Object[1];
                        AFInAppEventParameterName(false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 125, "\u0000", -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                        sb2.append(((String) objArr[0]).intern());
                        sb2.append(hexString);
                        hexString = sb2.toString();
                        AFInAppEventType = (valueOf + 41) % 128;
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            }

            public static String values(String str) {
                int i = valueOf + 67;
                AFInAppEventType = i % 128;
                int i2 = i % 2;
                byte[] AFInAppEventType2 = AFInAppEventType(str);
                if (i2 != 0) {
                    return AFKeystoreWrapper(AFInAppEventParameterName(AFInAppEventType2));
                }
                int i3 = 28 / 0;
                return AFKeystoreWrapper(AFInAppEventParameterName(AFInAppEventType2));
            }

            private static byte[] AFInAppEventParameterName(byte[] bArr) {
                AFInAppEventType = (valueOf + 117) % 128;
                for (int i = 0; i < bArr.length; i++) {
                    valueOf = (AFInAppEventType + 59) % 128;
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }
        }

        private static void AFInAppEventParameterName(int[] iArr, int i, Object[] objArr) {
            String str;
            synchronized (AFg1jSDK.values) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) values.clone();
                    AFg1jSDK.AFKeystoreWrapper = 0;
                    while (true) {
                        int i2 = AFg1jSDK.AFKeystoreWrapper;
                        if (i2 < iArr.length) {
                            int i3 = iArr[i2];
                            char c = (char) (i3 >> 16);
                            cArr[0] = c;
                            char c2 = (char) i3;
                            cArr[1] = c2;
                            char c3 = (char) (iArr[i2 + 1] >> 16);
                            cArr[2] = c3;
                            char c4 = (char) iArr[i2 + 1];
                            cArr[3] = c4;
                            AFg1jSDK.valueOf = (c << 16) + c2;
                            AFg1jSDK.AFInAppEventType = (c3 << 16) + c4;
                            AFg1jSDK.AFInAppEventParameterName(iArr2);
                            for (int i4 = 0; i4 < 16; i4++) {
                                int i5 = AFg1jSDK.valueOf ^ iArr2[i4];
                                AFg1jSDK.valueOf = i5;
                                int AFInAppEventParameterName = AFg1jSDK.AFInAppEventParameterName(i5) ^ AFg1jSDK.AFInAppEventType;
                                int i6 = AFg1jSDK.valueOf;
                                AFg1jSDK.valueOf = AFInAppEventParameterName;
                                AFg1jSDK.AFInAppEventType = i6;
                            }
                            int i7 = AFg1jSDK.valueOf;
                            int i8 = AFg1jSDK.AFInAppEventType;
                            AFg1jSDK.valueOf = i8;
                            AFg1jSDK.AFInAppEventType = i7;
                            int i9 = i7 ^ iArr2[16];
                            AFg1jSDK.AFInAppEventType = i9;
                            int i10 = i8 ^ iArr2[17];
                            AFg1jSDK.valueOf = i10;
                            cArr[0] = (char) (i10 >>> 16);
                            cArr[1] = (char) i10;
                            cArr[2] = (char) (i9 >>> 16);
                            cArr[3] = (char) i9;
                            AFg1jSDK.AFInAppEventParameterName(iArr2);
                            int i11 = AFg1jSDK.AFKeystoreWrapper;
                            cArr2[i11 << 1] = cArr[0];
                            cArr2[(i11 << 1) + 1] = cArr[1];
                            cArr2[(i11 << 1) + 2] = cArr[2];
                            cArr2[(i11 << 1) + 3] = cArr[3];
                            AFg1jSDK.AFKeystoreWrapper = i11 + 2;
                        } else {
                            str = new String(cArr2, 0, i);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            objArr[0] = str;
        }

        private static void AFInAppEventType(byte b, String str, int i, Object[] objArr) {
            int i2;
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (AFg1qSDK.afErrorLog) {
                try {
                    char[] cArr3 = AFInAppEventType;
                    char c = valueOf;
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr2[i2] - b);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        AFg1qSDK.AFInAppEventParameterName = 0;
                        while (true) {
                            int i3 = AFg1qSDK.AFInAppEventParameterName;
                            if (i3 >= i2) {
                                break;
                            }
                            AFg1qSDK.AFInAppEventType = cArr2[i3];
                            AFg1qSDK.AFKeystoreWrapper = cArr2[AFg1qSDK.AFInAppEventParameterName + 1];
                            if (AFg1qSDK.AFInAppEventType == AFg1qSDK.AFKeystoreWrapper) {
                                cArr4[AFg1qSDK.AFInAppEventParameterName] = (char) (AFg1qSDK.AFInAppEventType - b);
                                cArr4[AFg1qSDK.AFInAppEventParameterName + 1] = (char) (AFg1qSDK.AFKeystoreWrapper - b);
                            } else {
                                AFg1qSDK.valueOf = AFg1qSDK.AFInAppEventType / c;
                                AFg1qSDK.afInfoLog = AFg1qSDK.AFInAppEventType % c;
                                AFg1qSDK.values = AFg1qSDK.AFKeystoreWrapper / c;
                                AFg1qSDK.afRDLog = AFg1qSDK.AFKeystoreWrapper % c;
                                if (AFg1qSDK.afInfoLog == AFg1qSDK.afRDLog) {
                                    AFg1qSDK.valueOf = ((AFg1qSDK.valueOf + c) - 1) % c;
                                    AFg1qSDK.values = ((AFg1qSDK.values + c) - 1) % c;
                                    int i4 = (AFg1qSDK.valueOf * c) + AFg1qSDK.afInfoLog;
                                    int i5 = (AFg1qSDK.values * c) + AFg1qSDK.afRDLog;
                                    int i6 = AFg1qSDK.AFInAppEventParameterName;
                                    cArr4[i6] = cArr3[i4];
                                    cArr4[i6 + 1] = cArr3[i5];
                                } else if (AFg1qSDK.valueOf == AFg1qSDK.values) {
                                    AFg1qSDK.afInfoLog = ((AFg1qSDK.afInfoLog + c) - 1) % c;
                                    AFg1qSDK.afRDLog = ((AFg1qSDK.afRDLog + c) - 1) % c;
                                    int i7 = (AFg1qSDK.valueOf * c) + AFg1qSDK.afInfoLog;
                                    int i8 = (AFg1qSDK.values * c) + AFg1qSDK.afRDLog;
                                    int i9 = AFg1qSDK.AFInAppEventParameterName;
                                    cArr4[i9] = cArr3[i7];
                                    cArr4[i9 + 1] = cArr3[i8];
                                } else {
                                    int i10 = (AFg1qSDK.valueOf * c) + AFg1qSDK.afRDLog;
                                    int i11 = (AFg1qSDK.values * c) + AFg1qSDK.afInfoLog;
                                    int i12 = AFg1qSDK.AFInAppEventParameterName;
                                    cArr4[i12] = cArr3[i10];
                                    cArr4[i12 + 1] = cArr3[i11];
                                }
                            }
                            AFg1qSDK.AFInAppEventParameterName += 2;
                        }
                    }
                    for (int i13 = 0; i13 < i; i13++) {
                        cArr4[i13] = (char) (cArr4[i13] ^ 13722);
                    }
                    str2 = new String(cArr4);
                } catch (Throwable th) {
                    throw th;
                }
            }
            objArr[0] = str2;
        }
    }

    private static boolean AFInAppEventParameterName(String str) {
        afErrorLog = (afRDLog + 101) % 128;
        try {
            Class.forName(str);
            afErrorLog = (afRDLog + 49) % 128;
            return true;
        } catch (ClassNotFoundException e) {
            Object[] objArr = new Object[1];
            valueOf((char) (34493 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0000\u0000\u0000\u0000", "塕\ue7cd봇隆", "\uf845돛⥴౿诣ጪ\ue769ᓃ史섓\ue5f2\ud9a8㪅\uf0f5껣⦴䬨訜ƚ", 132631895 - Process.getGidForName(BuildConfig.FLAVOR), objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e);
            return false;
        }
    }

    private static void AFInAppEventParameterName(String str, int i, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1kSDK.AFKeystoreWrapper) {
            try {
                char[] cArr3 = new char[cArr2.length];
                AFg1kSDK.AFInAppEventType = 0;
                char[] cArr4 = new char[2];
                while (true) {
                    int i2 = AFg1kSDK.AFInAppEventType;
                    if (i2 < cArr2.length) {
                        cArr4[0] = cArr2[i2];
                        cArr4[1] = cArr2[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr4[1];
                            char c2 = cArr4[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + afInfoLog)) ^ ((c2 >>> 5) + afDebugLog)));
                            cArr4[1] = c3;
                            cArr4[0] = (char) (c2 - (((c3 >>> 5) + valueOf) ^ ((c3 + i3) ^ ((c3 << 4) + values))));
                            i3 -= 40503;
                        }
                        int i5 = AFg1kSDK.AFInAppEventType;
                        cArr3[i5] = cArr4[0];
                        cArr3[i5 + 1] = cArr4[1];
                        AFg1kSDK.AFInAppEventType = i5 + 2;
                    } else {
                        str2 = new String(cArr3, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }

    private static String AFKeystoreWrapper(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, values(str2).charAt(0));
        String obj = sb.toString();
        int i2 = afErrorLog + 71;
        afRDLog = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public static String valueOf(Context context, long j) {
        String intern;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr = new Object[1];
        valueOf((char) View.combineMeasuredStates(0, 0), "\u0000\u0000\u0000\u0000", "\ued0c妅\ue8d6⏡", "愜\u09b3㯓䚦\ud953\u0ec7똋㯲䵱ዀ邵画鏨쇌\ue21b똦軰瞹葈䚈ﰏ色㐃됂徍脎\uda6e覛ꆋꜣ\u0bad✣ﺢ㧗", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr);
        if (AFInAppEventParameterName(((String) objArr[0]).intern())) {
            int i = afRDLog + 63;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                Object[] objArr2 = new Object[1];
                valueOf((char) (54127 >>> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", ViewConfiguration.getFadingEdgeLength() - 1420046543, objArr2);
                intern = ((String) objArr2[0]).intern();
            } else {
                Object[] objArr3 = new Object[1];
                valueOf((char) (54127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
                intern = ((String) objArr3[0]).intern();
            }
            afRDLog = (afErrorLog + 13) % 128;
        } else {
            Object[] objArr4 = new Object[1];
            valueOf((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 63595), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (-1250816197) - Color.argb(0, 0, 0, 0), objArr4);
            intern = ((String) objArr4[0]).intern();
        }
        sb2.append(intern);
        sb.append(AFKeystoreWrapper(context, sb2));
        try {
            long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            Object[] objArr5 = new Object[1];
            AFInAppEventParameterName("ꁅ㈄ꁅ㈄\ud989柁ᯏ쟗謘飝퓥\uf3ee倠눞䜮撏콌\uf69f", 18 - View.combineMeasuredStates(0, 0), objArr5);
            sb.append(new SimpleDateFormat(((String) objArr5[0]).intern(), Locale.US).format(new Date(j2)));
            afRDLog = (afErrorLog + 67) % 128;
            sb.append(j);
            valueOf(sb3);
            return AFInAppEventParameterName(AFKeystoreWrapper(AFKeystoreWrapper(AFInAppEventType(sb.toString()), sb2.toString(), 17), sb3.toString(), 27), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException e) {
            Object[] objArr6 = new Object[1];
            AFInAppEventParameterName("ꄗ鎜䰵븞ᬲ뱥\uebd7凣ౝ\udfe2핶羚䪤\u05fb⡁響㋶Ⱃ诶ᥛ닷驂⠚뾭矂璲원\ueb26", ImageFormat.getBitsPerPixel(0) + 29, objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e);
            Object[] objArr7 = new Object[1];
            AFInAppEventParameterName("\ude4bี늷뗪ᒓ\udb04휑翭䛢ﶇ\u1ae1솆貇漥룑쏩吐닁\udce1\u3d0e1\ud8b4葬氕߃\uf57e虶\uea14⸰떂ṡ\ue2e1", 32 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c4, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r0 = com.appsflyer.internal.AFb1eSDK.afRDLog + 19;
        com.appsflyer.internal.AFb1eSDK.afErrorLog = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if ((r0 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r8.contains(((java.lang.String) r1[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r8.contains(((java.lang.String) r1[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0054, code lost:
    
        r1 = new java.lang.Object[1];
        AFInAppEventParameterName("㴛膲", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2, r1);
        r8 = r8.split(((java.lang.String) r1[0]).intern());
        r0 = r8.length;
        r1 = new java.lang.StringBuilder();
        r0 = r0 - 1;
        r1.append(r8[r0]);
        r6 = new java.lang.Object[1];
        AFInAppEventParameterName("\ue4bd疿", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), r6);
        r1.append(((java.lang.String) r6[0]).intern());
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0091, code lost:
    
        if (r2 >= r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0093, code lost:
    
        r1.append(r8[r2]);
        r7 = new java.lang.Object[1];
        AFInAppEventParameterName("\ue4bd疿", 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), r7);
        r1.append(((java.lang.String) r7[0]).intern());
        r2 = r2 + 1;
        com.appsflyer.internal.AFb1eSDK.afErrorLog = (com.appsflyer.internal.AFb1eSDK.afRDLog + 29) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00bb, code lost:
    
        r1.append(r8[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(String str) {
        int i = afRDLog + 19;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            AFInAppEventParameterName("\ue4bd疿", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        } else {
            Object[] objArr2 = new Object[1];
            AFInAppEventParameterName("\ue4bd疿", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
        }
    }

    private static String valueOf(Context context) {
        afErrorLog = (afRDLog + 107) % 128;
        Properties properties = System.getProperties();
        Object[] objArr = new Object[1];
        valueOf((char) (45561 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ꌓ畟\uf85c抱", "鲜둓䡳䘒핕\uf4f3눬㠠‽嘧쟶諕塯㧮", View.combineMeasuredStates(0, 0), objArr);
        if (properties.containsKey(((String) objArr[0]).intern())) {
            try {
                String path = context.getCacheDir().getPath();
                Object[] objArr2 = new Object[1];
                AFInAppEventParameterName("픂뷸랗\udcc1ᬲ뱥", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6, objArr2);
                String replace = path.replace(((String) objArr2[0]).intern(), BuildConfig.FLAVOR);
                Object[] objArr3 = new Object[1];
                AFInAppEventParameterName("\u0992\uf00c뤏㐨混喘逥蘿㉇\u0bad", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, objArr3);
                Matcher matcher = Pattern.compile(((String) objArr3[0]).intern()).matcher(replace);
                if (!matcher.find()) {
                    return null;
                }
                afRDLog = (afErrorLog + 69) % 128;
                return matcher.group(1);
            } catch (Exception e) {
                Object[] objArr4 = new Object[1];
                AFInAppEventParameterName("ჹⓊ釭쵘퓎ꭗ箯進佉ᨴꄗ鎜\uecb4쵤ಿ\ue2daస䙊屮掾㒪㖍ဴ杔", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, objArr4);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr4[0]).intern(), e);
                AFb1wSDK afErrorLogForExcManagerOnly = AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                Object[] objArr5 = new Object[1];
                valueOf((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 12695), "\u0000\u0000\u0000\u0000", "㾏ᯝ鞉ܱ", "梧歃狶\ue0d2䀖锺錘띸ᖳ甹\uebbc\ue8f3㹐哈ꘕ喲\ue6ed", (-1994662593) - View.MeasureSpec.getMode(0), objArr5);
                String intern = ((String) objArr5[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr6 = new Object[1];
                valueOf((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 45032), "\u0000\u0000\u0000\u0000", "◐\ufb0b\ue88e隯", "ᨍ୵ً艅㓘濾礞㧮ဗ䲔\uea71뒖糷㱼튢㟲붂⫩塄혻ܟ\uf7cc誚ἵ蝪糢儗⣓ᆌ锇蘶䍐硙쮶ᦜ뜣楿\ue96d㛽䫆\ud96b", (-1896150235) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
                sb.append(((String) objArr6[0]).intern());
                sb.append(e);
                afErrorLogForExcManagerOnly.AFInAppEventType(intern, sb.toString());
            }
        }
        return null;
    }

    private static void valueOf(char c, String str, String str2, String str3, int i, Object[] objArr) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (AFg1pSDK.valueOf) {
            try {
                char[] cArr7 = (char[]) cArr4.clone();
                char[] cArr8 = (char[]) cArr6.clone();
                cArr7[0] = (char) (c ^ cArr7[0]);
                cArr8[2] = (char) (cArr8[2] + ((char) i));
                int length = cArr2.length;
                char[] cArr9 = new char[length];
                AFg1pSDK.AFInAppEventParameterName = 0;
                while (true) {
                    int i2 = AFg1pSDK.AFInAppEventParameterName;
                    if (i2 < length) {
                        int i3 = (i2 + 2) % 4;
                        int i4 = (i2 + 3) % 4;
                        int i5 = cArr7[i2 % 4] * 32718;
                        char c2 = cArr8[i3];
                        char c3 = (char) ((i5 + c2) % 65535);
                        AFg1pSDK.AFInAppEventType = c3;
                        cArr8[i4] = (char) (((cArr7[i4] * 32718) + c2) / 65535);
                        cArr7[i4] = c3;
                        int i6 = AFg1pSDK.AFInAppEventParameterName;
                        cArr9[i6] = (char) ((((c3 ^ cArr2[i6]) ^ AFInAppEventParameterName) ^ AFInAppEventType) ^ AFKeystoreWrapper);
                        AFg1pSDK.AFInAppEventParameterName = i6 + 1;
                    } else {
                        str4 = new String(cArr9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str4;
    }
}
