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
import androidx.core.internal.view.SupportMenu;
import com.appsflyer.AFLogger;
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
        Process.getGidForName("");
        Process.getGidForName("");
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
        int i = afRDLog + 71;
        afErrorLog = i % 128;
        int i2 = i % 2;
    }

    static void values() {
        AFInAppEventType = 0;
        AFKeystoreWrapper = (char) 19325;
        AFInAppEventParameterName = 0L;
        values = (char) 55185;
        afDebugLog = (char) 62718;
        valueOf = (char) 51046;
        afInfoLog = (char) 53155;
    }

    public static String valueOf(Context context, long j) {
        String intern;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr = new Object[1];
        valueOf((char) View.combineMeasuredStates(0, 0), "\u0000\u0000\u0000\u0000", "\ued0c妅\ue8d6⏡", "愜\u09b3㯓䚦\ud953\u0ec7똋㯲䵱ዀ邵画鏨쇌\ue21b똦軰瞹葈䚈ﰏ色㐃됂徍脎\uda6e覛ꆋꜣ\u0bad✣ﺢ㧗", TextUtils.indexOf("", "", 0, 0), objArr);
        if (AFInAppEventParameterName(((String) objArr[0]).intern())) {
            int i2 = afRDLog + 63;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                valueOf((char) (54127 >>> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", ViewConfiguration.getFadingEdgeLength() - 1420046543, objArr2);
                intern = ((String) objArr2[0]).intern();
            } else {
                Object[] objArr3 = new Object[1];
                valueOf((char) (54127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
                intern = ((String) objArr3[0]).intern();
            }
            int i3 = afErrorLog + 13;
            afRDLog = i3 % 128;
            int i4 = i3 % 2;
        } else {
            Object[] objArr4 = new Object[1];
            valueOf((char) (TextUtils.indexOf((CharSequence) "", '0') + 63595), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (-1250816197) - Color.argb(0, 0, 0, 0), objArr4);
            intern = ((String) objArr4[0]).intern();
        }
        sb2.append(intern);
        sb.append(AFKeystoreWrapper(context, sb2));
        try {
            long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            Object[] objArr5 = new Object[1];
            AFInAppEventParameterName("ꁅ㈄ꁅ㈄\ud989柁ᯏ쟗謘飝퓥\uf3ee倠눞䜮撏콌\uf69f", 18 - View.combineMeasuredStates(0, 0), objArr5);
            sb.append(new SimpleDateFormat(((String) objArr5[0]).intern(), Locale.US).format(new Date(j2)));
            int i5 = afErrorLog + 67;
            afRDLog = i5 % 128;
            int i6 = i5 % 2;
            sb.append(j);
            valueOf(sb3);
            return AFInAppEventParameterName(AFKeystoreWrapper(AFKeystoreWrapper(AFInAppEventType(sb.toString()), sb2.toString(), 17), sb3.toString(), 27), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException e) {
            Object[] objArr6 = new Object[1];
            AFInAppEventParameterName("ꄗ鎜䰵븞ᬲ뱥\uebd7凣ౝ\udfe2핶羚䪤\u05fb⡁響㋶Ⱃ诶ᥛ닷驂⠚뾭矂璲원\ueb26", ImageFormat.getBitsPerPixel(0) + 29, objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e);
            Object[] objArr7 = new Object[1];
            AFInAppEventParameterName("\ude4bี늷뗪ᒓ\udb04휑翭䛢ﶇ\u1ae1솆貇漥룑쏩吐닁\udce1\u3d0e1\ud8b4葬氕߃\uf57e虶\uea14⸰떂ṡ\ue2e1", 32 - TextUtils.indexOf("", "", 0), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    private static String AFInAppEventParameterName(String str, Long l) {
        int i = 2 % 2;
        int i2 = afErrorLog;
        int i3 = i2 + 109;
        afRDLog = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            int i5 = i2 + 11;
            afRDLog = i5 % 128;
            int i6 = i5 % 2;
            if (l != null && str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String obj = l.toString();
                int i7 = 0;
                for (int i8 = 0; i8 < obj.length(); i8++) {
                    i7 += Character.getNumericValue(obj.charAt(i8));
                }
                String hexString = Integer.toHexString(i7);
                sb.replace(7, hexString.length() + 7, hexString);
                long j = 0;
                int i9 = 0;
                while (i9 < sb.length()) {
                    j += Character.getNumericValue(sb.charAt(i9));
                    i9++;
                    int i10 = afErrorLog + 53;
                    afRDLog = i10 % 128;
                    int i11 = i10 % 2;
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
        int i12 = afRDLog + 21;
        afErrorLog = i12 % 128;
        int i13 = i12 % 2;
        return intern;
    }

    private static boolean AFInAppEventParameterName(String str) {
        int i = 2 % 2;
        int i2 = afRDLog + 101;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        try {
            Class.forName(str);
            int i4 = afRDLog + 49;
            afErrorLog = i4 % 128;
            int i5 = i4 % 2;
            return true;
        } catch (ClassNotFoundException e) {
            Object[] objArr = new Object[1];
            valueOf((char) (34493 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0000\u0000\u0000\u0000", "塕\ue7cd봇隆", "\uf845돛⥴౿诣ጪ\ue769ᓃ史섓\ue5f2\ud9a8㪅\uf0f5껣⦴䬨訜ƚ", 132631895 - Process.getGidForName(""), objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e);
            return false;
        }
    }

    private static String AFKeystoreWrapper(String str, String str2, int i) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, values(str2).charAt(0));
        String obj = sb.toString();
        int i3 = afErrorLog + 71;
        afRDLog = i3 % 128;
        if (i3 % 2 != 0) {
            return obj;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    private static String values(String str) {
        int i = 2 % 2;
        int i2 = afErrorLog + 15;
        afRDLog = i2 % 128;
        int i3 = i2 % 2;
        String num = Integer.toString(Integer.parseInt(str, 2), 16);
        int i4 = afRDLog + 57;
        afErrorLog = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        throw null;
    }

    private static void valueOf(StringBuilder sb) {
        String intern;
        Object obj;
        String intern2;
        Object obj2;
        int i = 2 % 2;
        valueOf((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", "\ud919狮鈭㐗", "㽆꯵\ue38b\uf2ec蝇\ueaae떧᫂尥漛䁶줸\ue5be⣤⚆ਃ▌\uecf7倮ፔ混독\u0ac6썴웣", Color.argb(0, 0, 0, 0) + 762506969, new Object[1]);
        if (!(!AFInAppEventParameterName(((String) r10[0]).intern()))) {
            Object[] objArr = new Object[1];
            valueOf((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 54127), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (ViewConfiguration.getTapTimeout() >> 16) - 1420046501, objArr);
            intern = ((String) objArr[0]).intern();
        } else {
            Object[] objArr2 = new Object[1];
            valueOf((char) (63594 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1250816197, objArr2);
            intern = ((String) objArr2[0]).intern();
            int i2 = afRDLog + 97;
            afErrorLog = i2 % 128;
            int i3 = i2 % 2;
        }
        sb.append(intern);
        Object[] objArr3 = new Object[1];
        AFInAppEventParameterName("隢瀨㊈\uda5c谎鑨筆졪˩ཉꍀ즳凎㫫\ud888\uf85f꺻붿뜠ꎁﴗ\ue199ᙀ付", View.MeasureSpec.makeMeasureSpec(0, 0) + 23, objArr3);
        if (AFInAppEventParameterName(((String) objArr3[0]).intern())) {
            int i4 = afErrorLog + 21;
            afRDLog = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr4 = new Object[1];
            valueOf((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54126), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046500) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
            obj = objArr4[0];
        } else {
            Object[] objArr5 = new Object[1];
            valueOf((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63593), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (-1267593413) - Color.rgb(0, 0, 0), objArr5);
            obj = objArr5[0];
        }
        sb.append(((String) obj).intern());
        AFInAppEventParameterName("隢瀨㊈\uda5c谎鑨筆졪ᨓ릞錹\uf249咻彲㪜䙏㟠\uec6c譶ㆻ", (ViewConfiguration.getEdgeSlop() >> 16) + 20, new Object[1]);
        if (!(!AFInAppEventParameterName(((String) r13[0]).intern()))) {
            Object[] objArr6 = new Object[1];
            valueOf((char) (54127 - KeyEvent.normalizeMetaState(0)), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
            intern2 = ((String) objArr6[0]).intern();
            int i6 = afErrorLog + 17;
            afRDLog = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr7 = new Object[1];
            valueOf((char) (63594 - View.MeasureSpec.getMode(0)), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (-1250816197) - ExpandableListView.getPackedPositionGroup(0L), objArr7);
            intern2 = ((String) objArr7[0]).intern();
        }
        sb.append(intern2);
        Object[] objArr8 = new Object[1];
        valueOf((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35003), "\u0000\u0000\u0000\u0000", "\ueed0㗙뭃ֈ", "윶剐㚑䮧뀑䬂꜆縵뜁Ḽ\ue7ce\uf366\uef0a\ude33䜋", 1127602670 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8);
        if (AFInAppEventParameterName(((String) objArr8[0]).intern())) {
            int i8 = afRDLog + 7;
            afErrorLog = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArr9 = new Object[1];
            valueOf((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54126), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", KeyEvent.getDeadChar(0, 0) - 1420046501, objArr9);
            obj2 = objArr9[0];
        } else {
            Object[] objArr10 = new Object[1];
            valueOf((char) (63594 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1250816197, objArr10);
            obj2 = objArr10[0];
        }
        sb.append(((String) obj2).intern());
    }

    private static String AFInAppEventType(String str) {
        int i = 2 % 2;
        int i2 = afErrorLog + 81;
        afRDLog = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
            return AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.AFInAppEventParameterName(str));
        }
        return AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.AFInAppEventParameterName(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c7, code lost:
    
        return r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r1 = com.appsflyer.internal.AFb1eSDK.afRDLog + 19;
        com.appsflyer.internal.AFb1eSDK.afErrorLog = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r10.contains(((java.lang.String) r2[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r10.contains(((java.lang.String) r2[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0055, code lost:
    
        r2 = new java.lang.Object[1];
        AFInAppEventParameterName("㴛膲", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2, r2);
        r10 = r10.split(((java.lang.String) r2[0]).intern());
        r1 = r10.length;
        r2 = new java.lang.StringBuilder();
        r1 = r1 - 1;
        r3 = r2.append(r10[r1]);
        r8 = new java.lang.Object[1];
        AFInAppEventParameterName("\ue4bd疿", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), r8);
        r3.append(((java.lang.String) r8[0]).intern());
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0092, code lost:
    
        if (r3 >= r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0094, code lost:
    
        r7 = r2.append(r10[r3]);
        r9 = new java.lang.Object[1];
        AFInAppEventParameterName("\ue4bd疿", 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), r9);
        r7.append(((java.lang.String) r9[0]).intern());
        r3 = r3 + 1;
        r7 = com.appsflyer.internal.AFb1eSDK.afRDLog + 29;
        com.appsflyer.internal.AFb1eSDK.afErrorLog = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00be, code lost:
    
        r2.append(r10[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(String str) {
        int i = 2 % 2;
        int i2 = afRDLog + 19;
        afErrorLog = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            AFInAppEventParameterName("\ue4bd疿", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        } else {
            Object[] objArr2 = new Object[1];
            AFInAppEventParameterName("\ue4bd疿", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
        }
    }

    private static String valueOf(Context context) {
        int i = 2 % 2;
        int i2 = afRDLog + 107;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        Properties properties = System.getProperties();
        Object[] objArr = new Object[1];
        valueOf((char) (45561 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ꌓ畟\uf85c抱", "鲜둓䡳䘒핕\uf4f3눬㠠‽嘧쟶諕塯㧮", View.combineMeasuredStates(0, 0), objArr);
        if (!properties.containsKey(((String) objArr[0]).intern())) {
            return null;
        }
        try {
            String path = context.getCacheDir().getPath();
            Object[] objArr2 = new Object[1];
            AFInAppEventParameterName("픂뷸랗\udcc1ᬲ뱥", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6, objArr2);
            String replace = path.replace(((String) objArr2[0]).intern(), "");
            Object[] objArr3 = new Object[1];
            AFInAppEventParameterName("\u0992\uf00c뤏㐨混喘逥蘿㉇\u0bad", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, objArr3);
            Matcher matcher = Pattern.compile(((String) objArr3[0]).intern()).matcher(replace);
            if (!matcher.find()) {
                return null;
            }
            int i4 = afErrorLog + 69;
            afRDLog = i4 % 128;
            int i5 = i4 % 2;
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
            afErrorLogForExcManagerOnly.AFInAppEventType(intern, sb.append(((String) objArr6[0]).intern()).append(e).toString());
            return null;
        }
    }

    private static String AFInAppEventType(Context context) {
        int i = 2 % 2;
        int i2 = afRDLog + 31;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i4 = afErrorLog + 53;
            afRDLog = i4 % 128;
            int i5 = i4 % 2;
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
        int i = 2 % 2;
        StringBuilder sb2 = new StringBuilder();
        String packageName = context.getPackageName();
        String valueOf2 = valueOf(packageName);
        Object[] objArr = new Object[1];
        valueOf((char) (TextUtils.lastIndexOf("", '0', 0) + 54128), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - ExpandableListView.getPackedPositionGroup(0L), objArr);
        sb.append(((String) objArr[0]).intern());
        sb2.append(valueOf2);
        if (valueOf(context) == null) {
            int i2 = afErrorLog + 113;
            afRDLog = i2 % 128;
            if (i2 % 2 == 0) {
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
            int i3 = afErrorLog + 31;
            afRDLog = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr5 = new Object[1];
            valueOf((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 63594), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", Drawable.resolveOpacity(0, 0) - 1250816197, objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb2.append(packageName);
        } else {
            Object[] objArr6 = new Object[1];
            valueOf((char) (54127 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - KeyEvent.keyCodeFromString(""), objArr6);
            sb.append(((String) objArr6[0]).intern());
            sb2.append(AFInAppEventType2);
        }
        sb2.append(Boolean.TRUE.toString());
        String obj2 = sb2.toString();
        int i5 = afRDLog + 49;
        afErrorLog = i5 % 128;
        if (i5 % 2 == 0) {
            return obj2;
        }
        Object obj3 = null;
        super.hashCode();
        throw null;
    }

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
            TextUtils.indexOf((CharSequence) "", '0', 0);
            ViewConfiguration.getTouchSlop();
            TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            Color.blue(0);
            KeyEvent.getModifierMetaStateMask();
            ViewConfiguration.getEdgeSlop();
            MotionEvent.axisFromString("");
            ViewConfiguration.getScrollDefaultDelay();
            int i = afRDLog + 83;
            afDebugLog = i % 128;
            int i2 = i % 2;
        }

        static void valueOf() {
            values = new int[]{323477, -837362401, -1518965032, 1761212227, -1478818744, 1855273808, -1845241240, -1586645423, 2081753500, -1156207946, -933194515, 1757930608, -673555019, -1460093762, 1670218587, 382928275, 847721556, -1279575317};
            valueOf = (char) 7;
            AFInAppEventType = new char[]{13772, 13768, 13765, 13781, 13817, 13740, 13751, 13822, 13811, 13800, 13748, 13774, 13776, 13813, 13784, 13795, 13754, 13777, 13803, 13787, 13801, 13816, 13821, 13744, 13739, 13812, 13730, 13756, 13809, 13802, 13814, 13820, 13782, 13728, 13810, 13807, 13790, 13804, 13815, 13819, 13738, 13773, 13805, 13780, 13794, 13775, 13806, 13823, 13736};
        }

        public AFa1xSDK(Map<String, Object> map, Context context) {
            this.AFInAppEventParameterName = map;
            this.AFKeystoreWrapper = context;
            put(AFInAppEventParameterName(), AFInAppEventType());
        }

        private static StringBuilder values(String... strArr) throws Exception {
            int charAt;
            int i = 2 % 2;
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList.add(Integer.valueOf(strArr[i2].length()));
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            while (i3 < intValue) {
                int length2 = strArr.length;
                Integer num = null;
                for (int i4 = 0; i4 < 3; i4++) {
                    int i5 = afRDLog + 79;
                    afDebugLog = i5 % 128;
                    if (i5 % 2 == 0) {
                        charAt = strArr[i4].charAt(i3);
                        int i6 = 89 / 0;
                        if (num == null) {
                            num = Integer.valueOf(charAt);
                        }
                        charAt ^= num.intValue();
                        num = Integer.valueOf(charAt);
                    } else {
                        charAt = strArr[i4].charAt(i3);
                        if (num == null) {
                            num = Integer.valueOf(charAt);
                        }
                        charAt ^= num.intValue();
                        num = Integer.valueOf(charAt);
                    }
                }
                sb.append(Integer.toHexString(num.intValue()));
                i3++;
                int i7 = afDebugLog + 105;
                afRDLog = i7 % 128;
                int i8 = i7 % 2;
            }
            return sb;
        }

        private String AFInAppEventParameterName() {
            int i = 2 % 2;
            int i2 = afRDLog + 95;
            afDebugLog = i2 % 128;
            int i3 = i2 % 2;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                Map<String, Object> map = this.AFInAppEventParameterName;
                Object[] objArr = new Object[1];
                AFInAppEventParameterName(new int[]{1778309776, -811727697, -2144580672, 291596461, -328504224, -511155222}, Drawable.resolveOpacity(0, 0) + 12, objArr);
                String obj = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.AFInAppEventParameterName;
                Object[] objArr2 = new Object[1];
                AFInAppEventType((byte) ((Process.myPid() >> 22) + 95), "\u0017\u0007. 㙝", TextUtils.getCapsMode("", 0, 0) + 5, objArr2);
                String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
                if (obj2 == null) {
                    int i4 = afRDLog + 57;
                    afDebugLog = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr3 = new Object[1];
                    AFInAppEventType((byte) (9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "-\u0001\u0000\u0010\u0005\u000f\u0001+", 8 - Color.argb(0, 0, 0, 0), objArr3);
                    obj2 = ((String) objArr3[0]).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder values2 = values(num, obj2, sb.toString());
                int length = values2.length();
                if (length > 4) {
                    int i6 = afRDLog + 99;
                    afDebugLog = i6 % 128;
                    if (i6 % 2 == 0) {
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
                AFLogger.afRDLog(sb2.append(((String) objArr6[0]).intern()).append(e).toString());
                Object[] objArr7 = new Object[1];
                AFInAppEventParameterName(new int[]{-1705480036, -41642021, -1744439853, -1046563467}, Process.getGidForName("") + 8, objArr7);
                return ((String) objArr7[0]).intern();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x01d2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private String AFInAppEventType() {
            String obj;
            Intent registerReceiver;
            int i;
            String str;
            int i2;
            int i3 = 2 % 2;
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
                AFInAppEventType((byte) ((-16777094) - Color.rgb(0, 0, 0)), "\u0002\r\u0003\u000b㘪", MotionEvent.axisFromString("") + 6, objArr4);
                obj = new StringBuilder("").append(AFb1zSDK.AFInAppEventParameterName(new StringBuilder().append(obj2).append(obj3).append(intern.replaceAll(((String) objArr4[0]).intern(), "")).toString()).substring(0, 16)).toString();
            } catch (Exception e) {
                Object[] objArr5 = new Object[1];
                AFInAppEventParameterName(new int[]{-416946030, 710826945, -721845652, -606805070, -656728386, -824473881, 2061236325, -373006266, -1963241931, 776244818, -1295737303, 1768028883, -1965365971, -1459769893, -1630881150, -1791863435, -1181216282, 1355290083, -1266044688, -1956450597}, 38 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb = new StringBuilder();
                Object[] objArr6 = new Object[1];
                AFInAppEventType((byte) (98 - Color.blue(0)), " &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011&(\u001c%,\u0013+\u00070 \u0013,.\u0002+!+\u000b\u000b\u001b\u001e\u0013", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, objArr6);
                AFLogger.afRDLog(sb.append(((String) objArr6[0]).intern()).append(e).toString());
                StringBuilder sb2 = new StringBuilder("");
                Object[] objArr7 = new Object[1];
                AFInAppEventParameterName(new int[]{-1151461714, 1565074594, -1850512278, 514834606, 1194055798, -1696618900, 1536878782, -1259306217, 1783200123, 1729847339}, 18 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr7);
                obj = sb2.append(((String) objArr7[0]).intern()).toString();
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
                    int i4 = afDebugLog + 37;
                    afRDLog = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object[] objArr9 = new Object[1];
                        AFInAppEventType((byte) (64 % ((byte) KeyEvent.getModifierMetaStateMask())), "/0$\u001f,\f.\u0004%\u0007㙈", 77 >>> Color.green(0), objArr9);
                        i = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), 27046);
                    } else {
                        Object[] objArr10 = new Object[1];
                        AFInAppEventType((byte) (72 - ((byte) KeyEvent.getModifierMetaStateMask())), "/0$\u001f,\f.\u0004%\u0007㙈", Color.green(0) + 11, objArr10);
                        i = registerReceiver.getIntExtra(((String) objArr10[0]).intern(), -2700);
                        str = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
                        if (str != null) {
                            int i5 = afDebugLog + 33;
                            afRDLog = i5 % 128;
                            int i6 = i5 % 2;
                            Object[] objArr11 = new Object[1];
                            AFInAppEventType((byte) (((Process.getThreadPriority(0) + 20) >> 6) + 18), "/\u0017㖾", View.getDefaultSize(0, 0) + 3, objArr11);
                            if (str.contains(((String) objArr11[0]).intern())) {
                                int i7 = afDebugLog;
                                int i8 = i7 + 115;
                                afRDLog = i8 % 128;
                                int i9 = i8 % 2;
                                int i10 = i7 + 45;
                                afRDLog = i10 % 128;
                                int i11 = i10 % 2;
                                i2 = 1;
                                Context context2 = this.AFKeystoreWrapper;
                                Object[] objArr12 = new Object[1];
                                AFInAppEventParameterName(new int[]{1742378786, 1923556584, -1407937301, 133347245}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, objArr12);
                                int size = ((SensorManager) context2.getSystemService(((String) objArr12[0]).intern())).getSensorList(-1).size();
                                StringBuilder sb3 = new StringBuilder();
                                Object[] objArr13 = new Object[1];
                                AFInAppEventParameterName(new int[]{1796820622, 951799376}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr13);
                                StringBuilder append = sb3.append(((String) objArr13[0]).intern()).append(i);
                                Object[] objArr14 = new Object[1];
                                AFInAppEventType((byte) (66 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u00170", 1 - MotionEvent.axisFromString(""), objArr14);
                                StringBuilder append2 = append.append(((String) objArr14[0]).intern()).append(i2);
                                Object[] objArr15 = new Object[1];
                                AFInAppEventType((byte) (AndroidCharacter.getMirror('0') + '\r'), "\"\u001b", Color.rgb(0, 0, 0) + 16777218, objArr15);
                                StringBuilder append3 = append2.append(((String) objArr15[0]).intern()).append(size);
                                Object[] objArr16 = new Object[1];
                                AFInAppEventType((byte) (Color.argb(0, 0, 0, 0) + 125), "\u0016\"", 1 - MotionEvent.axisFromString(""), objArr16);
                                return new StringBuilder().append(str2).append(AFa1ySDK.values(append3.append(((String) objArr16[0]).intern()).append(this.AFInAppEventParameterName.size()).toString())).toString();
                            }
                        }
                        i2 = 0;
                        Context context22 = this.AFKeystoreWrapper;
                        Object[] objArr122 = new Object[1];
                        AFInAppEventParameterName(new int[]{1742378786, 1923556584, -1407937301, 133347245}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, objArr122);
                        int size2 = ((SensorManager) context22.getSystemService(((String) objArr122[0]).intern())).getSensorList(-1).size();
                        StringBuilder sb32 = new StringBuilder();
                        Object[] objArr132 = new Object[1];
                        AFInAppEventParameterName(new int[]{1796820622, 951799376}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr132);
                        StringBuilder append4 = sb32.append(((String) objArr132[0]).intern()).append(i);
                        Object[] objArr142 = new Object[1];
                        AFInAppEventType((byte) (66 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u00170", 1 - MotionEvent.axisFromString(""), objArr142);
                        StringBuilder append22 = append4.append(((String) objArr142[0]).intern()).append(i2);
                        Object[] objArr152 = new Object[1];
                        AFInAppEventType((byte) (AndroidCharacter.getMirror('0') + '\r'), "\"\u001b", Color.rgb(0, 0, 0) + 16777218, objArr152);
                        StringBuilder append32 = append22.append(((String) objArr152[0]).intern()).append(size2);
                        Object[] objArr162 = new Object[1];
                        AFInAppEventType((byte) (Color.argb(0, 0, 0, 0) + 125), "\u0016\"", 1 - MotionEvent.axisFromString(""), objArr162);
                        return new StringBuilder().append(str2).append(AFa1ySDK.values(append32.append(((String) objArr162[0]).intern()).append(this.AFInAppEventParameterName.size()).toString())).toString();
                    }
                }
                Object[] objArr1222 = new Object[1];
                AFInAppEventParameterName(new int[]{1742378786, 1923556584, -1407937301, 133347245}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, objArr1222);
                int size22 = ((SensorManager) context22.getSystemService(((String) objArr1222[0]).intern())).getSensorList(-1).size();
                StringBuilder sb322 = new StringBuilder();
                Object[] objArr1322 = new Object[1];
                AFInAppEventParameterName(new int[]{1796820622, 951799376}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr1322);
                StringBuilder append42 = sb322.append(((String) objArr1322[0]).intern()).append(i);
                Object[] objArr1422 = new Object[1];
                AFInAppEventType((byte) (66 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u00170", 1 - MotionEvent.axisFromString(""), objArr1422);
                StringBuilder append222 = append42.append(((String) objArr1422[0]).intern()).append(i2);
                Object[] objArr1522 = new Object[1];
                AFInAppEventType((byte) (AndroidCharacter.getMirror('0') + '\r'), "\"\u001b", Color.rgb(0, 0, 0) + 16777218, objArr1522);
                StringBuilder append322 = append222.append(((String) objArr1522[0]).intern()).append(size22);
                Object[] objArr1622 = new Object[1];
                AFInAppEventType((byte) (Color.argb(0, 0, 0, 0) + 125), "\u0016\"", 1 - MotionEvent.axisFromString(""), objArr1622);
                return new StringBuilder().append(str2).append(AFa1ySDK.values(append322.append(((String) objArr1622[0]).intern()).append(this.AFInAppEventParameterName.size()).toString())).toString();
            } catch (Exception e3) {
                e = e3;
                Object[] objArr17 = new Object[1];
                AFInAppEventType((byte) (TextUtils.getCapsMode("", 0, 0) + 24), "\u001a+*\u0004*\u0006% (*\u0013,㘀㘀\u0007\n", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr17);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr17[0]).intern(), e);
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr18 = new Object[1];
                AFInAppEventType((byte) (98 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), " &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011&(\u001c%,\u0013+\u00070 \u0013,.\u0002+!+\u000b\u000b\u001b\u001e\u0013", 44 - Color.argb(0, 0, 0, 0), objArr18);
                AFLogger.afRDLog(sb4.append(((String) objArr18[0]).intern()).append(e).toString());
                StringBuilder append5 = new StringBuilder().append(str2);
                Object[] objArr19 = new Object[1];
                AFInAppEventType((byte) (Gravity.getAbsoluteGravity(0, 0) + 15), "!&\u0013'\u0011\u0019\u001f\u0016\"+.\u0006 0('", '@' - AndroidCharacter.getMirror('0'), objArr19);
                return append5.append(((String) objArr19[0]).intern()).toString();
            }
            str = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
            if (str != null) {
            }
            i2 = 0;
            Context context222 = this.AFKeystoreWrapper;
        }

        public static class AFa1ySDK {
            private static int AFInAppEventParameterName = 78;
            private static int AFInAppEventType = 1;
            private static int valueOf;

            public static String values(String str) throws Exception {
                int i = 2 % 2;
                int i2 = valueOf + 67;
                AFInAppEventType = i2 % 128;
                int i3 = i2 % 2;
                byte[] AFInAppEventType2 = AFInAppEventType(str);
                if (i3 != 0) {
                    return AFKeystoreWrapper(AFInAppEventParameterName(AFInAppEventType2));
                }
                int i4 = 28 / 0;
                return AFKeystoreWrapper(AFInAppEventParameterName(AFInAppEventType2));
            }

            private static byte[] AFInAppEventType(String str) throws Exception {
                int i = 2 % 2;
                int i2 = valueOf + 43;
                AFInAppEventType = i2 % 128;
                int i3 = i2 % 2;
                byte[] bytes = str.getBytes(Charset.defaultCharset());
                int i4 = valueOf + 57;
                AFInAppEventType = i4 % 128;
                if (i4 % 2 != 0) {
                    return bytes;
                }
                throw null;
            }

            private static byte[] AFInAppEventParameterName(byte[] bArr) throws Exception {
                int i = 2 % 2;
                int i2 = valueOf + 117;
                AFInAppEventType = i2 % 128;
                int i3 = i2 % 2;
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    int i5 = AFInAppEventType + 59;
                    valueOf = i5 % 128;
                    int i6 = i5 % 2;
                    bArr[i4] = (byte) (bArr[i4] ^ ((i4 % 2) + 42));
                }
                return bArr;
            }

            private static String AFKeystoreWrapper(byte[] bArr) throws Exception {
                int i = 2 % 2;
                StringBuilder sb = new StringBuilder();
                int i2 = valueOf + 125;
                AFInAppEventType = i2 % 128;
                int i3 = i2 % 2;
                for (byte b : bArr) {
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr = new Object[1];
                        AFInAppEventParameterName(false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 125, "\u0000", -TextUtils.lastIndexOf("", '0', 0), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                        hexString = sb2.append(((String) objArr[0]).intern()).append(hexString).toString();
                        int i4 = valueOf + 41;
                        AFInAppEventType = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            }

            private static void AFInAppEventParameterName(boolean z, int i, String str, int i2, int i3, Object[] objArr) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (AFg1lSDK.valueOf) {
                    char[] cArr3 = new char[i2];
                    AFg1lSDK.AFKeystoreWrapper = 0;
                    while (AFg1lSDK.AFKeystoreWrapper < i2) {
                        AFg1lSDK.AFInAppEventParameterName = cArr2[AFg1lSDK.AFKeystoreWrapper];
                        cArr3[AFg1lSDK.AFKeystoreWrapper] = (char) (AFg1lSDK.AFInAppEventParameterName + i);
                        int i4 = AFg1lSDK.AFKeystoreWrapper;
                        cArr3[i4] = (char) (cArr3[i4] - AFInAppEventParameterName);
                        AFg1lSDK.AFKeystoreWrapper++;
                    }
                    if (i3 > 0) {
                        AFg1lSDK.AFInAppEventType = i3;
                        char[] cArr4 = new char[i2];
                        System.arraycopy(cArr3, 0, cArr4, 0, i2);
                        System.arraycopy(cArr4, 0, cArr3, i2 - AFg1lSDK.AFInAppEventType, AFg1lSDK.AFInAppEventType);
                        System.arraycopy(cArr4, AFg1lSDK.AFInAppEventType, cArr3, 0, i2 - AFg1lSDK.AFInAppEventType);
                    }
                    if (z) {
                        char[] cArr5 = new char[i2];
                        AFg1lSDK.AFKeystoreWrapper = 0;
                        while (AFg1lSDK.AFKeystoreWrapper < i2) {
                            cArr5[AFg1lSDK.AFKeystoreWrapper] = cArr3[(i2 - AFg1lSDK.AFKeystoreWrapper) - 1];
                            AFg1lSDK.AFKeystoreWrapper++;
                        }
                        cArr3 = cArr5;
                    }
                    str2 = new String(cArr3);
                }
                objArr[0] = str2;
            }
        }

        private static void AFInAppEventParameterName(int[] iArr, int i, Object[] objArr) {
            String str;
            synchronized (AFg1jSDK.values) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) values.clone();
                AFg1jSDK.AFKeystoreWrapper = 0;
                while (AFg1jSDK.AFKeystoreWrapper < iArr.length) {
                    cArr[0] = (char) (iArr[AFg1jSDK.AFKeystoreWrapper] >> 16);
                    cArr[1] = (char) iArr[AFg1jSDK.AFKeystoreWrapper];
                    cArr[2] = (char) (iArr[AFg1jSDK.AFKeystoreWrapper + 1] >> 16);
                    cArr[3] = (char) iArr[AFg1jSDK.AFKeystoreWrapper + 1];
                    AFg1jSDK.valueOf = (cArr[0] << 16) + cArr[1];
                    AFg1jSDK.AFInAppEventType = (cArr[2] << 16) + cArr[3];
                    AFg1jSDK.AFInAppEventParameterName(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = AFg1jSDK.valueOf ^ iArr2[i2];
                        AFg1jSDK.valueOf = i3;
                        AFg1jSDK.AFInAppEventType = AFg1jSDK.AFInAppEventParameterName(i3) ^ AFg1jSDK.AFInAppEventType;
                        int i4 = AFg1jSDK.valueOf;
                        AFg1jSDK.valueOf = AFg1jSDK.AFInAppEventType;
                        AFg1jSDK.AFInAppEventType = i4;
                    }
                    int i5 = AFg1jSDK.valueOf;
                    AFg1jSDK.valueOf = AFg1jSDK.AFInAppEventType;
                    AFg1jSDK.AFInAppEventType = i5;
                    AFg1jSDK.AFInAppEventType = i5 ^ iArr2[16];
                    AFg1jSDK.valueOf ^= iArr2[17];
                    int i6 = AFg1jSDK.valueOf;
                    int i7 = AFg1jSDK.AFInAppEventType;
                    cArr[0] = (char) (AFg1jSDK.valueOf >>> 16);
                    cArr[1] = (char) AFg1jSDK.valueOf;
                    cArr[2] = (char) (AFg1jSDK.AFInAppEventType >>> 16);
                    cArr[3] = (char) AFg1jSDK.AFInAppEventType;
                    AFg1jSDK.AFInAppEventParameterName(iArr2);
                    cArr2[AFg1jSDK.AFKeystoreWrapper << 1] = cArr[0];
                    cArr2[(AFg1jSDK.AFKeystoreWrapper << 1) + 1] = cArr[1];
                    cArr2[(AFg1jSDK.AFKeystoreWrapper << 1) + 2] = cArr[2];
                    cArr2[(AFg1jSDK.AFKeystoreWrapper << 1) + 3] = cArr[3];
                    AFg1jSDK.AFKeystoreWrapper += 2;
                }
                str = new String(cArr2, 0, i);
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
                    while (AFg1qSDK.AFInAppEventParameterName < i2) {
                        AFg1qSDK.AFInAppEventType = cArr2[AFg1qSDK.AFInAppEventParameterName];
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
                                int i3 = (AFg1qSDK.valueOf * c) + AFg1qSDK.afInfoLog;
                                int i4 = (AFg1qSDK.values * c) + AFg1qSDK.afRDLog;
                                cArr4[AFg1qSDK.AFInAppEventParameterName] = cArr3[i3];
                                cArr4[AFg1qSDK.AFInAppEventParameterName + 1] = cArr3[i4];
                            } else if (AFg1qSDK.valueOf == AFg1qSDK.values) {
                                AFg1qSDK.afInfoLog = ((AFg1qSDK.afInfoLog + c) - 1) % c;
                                AFg1qSDK.afRDLog = ((AFg1qSDK.afRDLog + c) - 1) % c;
                                int i5 = (AFg1qSDK.valueOf * c) + AFg1qSDK.afInfoLog;
                                int i6 = (AFg1qSDK.values * c) + AFg1qSDK.afRDLog;
                                cArr4[AFg1qSDK.AFInAppEventParameterName] = cArr3[i5];
                                cArr4[AFg1qSDK.AFInAppEventParameterName + 1] = cArr3[i6];
                            } else {
                                int i7 = (AFg1qSDK.valueOf * c) + AFg1qSDK.afRDLog;
                                int i8 = (AFg1qSDK.values * c) + AFg1qSDK.afInfoLog;
                                cArr4[AFg1qSDK.AFInAppEventParameterName] = cArr3[i7];
                                cArr4[AFg1qSDK.AFInAppEventParameterName + 1] = cArr3[i8];
                            }
                        }
                        AFg1qSDK.AFInAppEventParameterName += 2;
                    }
                }
                for (int i9 = 0; i9 < i; i9++) {
                    cArr4[i9] = (char) (cArr4[i9] ^ 13722);
                }
                str2 = new String(cArr4);
            }
            objArr[0] = str2;
        }
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
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            AFg1pSDK.AFInAppEventParameterName = 0;
            while (AFg1pSDK.AFInAppEventParameterName < length) {
                int i2 = (AFg1pSDK.AFInAppEventParameterName + 2) % 4;
                int i3 = (AFg1pSDK.AFInAppEventParameterName + 3) % 4;
                AFg1pSDK.AFInAppEventType = (char) (((cArr7[AFg1pSDK.AFInAppEventParameterName % 4] * 32718) + cArr8[i2]) % SupportMenu.USER_MASK);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / SupportMenu.USER_MASK);
                cArr7[i3] = AFg1pSDK.AFInAppEventType;
                cArr9[AFg1pSDK.AFInAppEventParameterName] = (char) ((((cArr7[i3] ^ cArr2[AFg1pSDK.AFInAppEventParameterName]) ^ AFInAppEventParameterName) ^ AFInAppEventType) ^ AFKeystoreWrapper);
                AFg1pSDK.AFInAppEventParameterName++;
            }
            str4 = new String(cArr9);
        }
        objArr[0] = str4;
    }

    private static void AFInAppEventParameterName(String str, int i, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1kSDK.AFKeystoreWrapper) {
            char[] cArr3 = new char[cArr2.length];
            AFg1kSDK.AFInAppEventType = 0;
            char[] cArr4 = new char[2];
            while (AFg1kSDK.AFInAppEventType < cArr2.length) {
                cArr4[0] = cArr2[AFg1kSDK.AFInAppEventType];
                cArr4[1] = cArr2[AFg1kSDK.AFInAppEventType + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + afInfoLog)) ^ ((c2 >>> 5) + afDebugLog)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + valueOf) ^ ((c3 + i2) ^ ((c3 << 4) + values))));
                    i2 -= 40503;
                }
                cArr3[AFg1kSDK.AFInAppEventType] = cArr4[0];
                cArr3[AFg1kSDK.AFInAppEventType + 1] = cArr4[1];
                AFg1kSDK.AFInAppEventType += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        objArr[0] = str2;
    }
}
