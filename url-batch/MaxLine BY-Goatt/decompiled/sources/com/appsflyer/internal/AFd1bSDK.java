package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1bSDK {
    private static int AFInAppEventParameterName = 0;
    private static long AFInAppEventType = 0;
    private static int valueOf = 1;
    private static char[] values;

    static {
        AFKeystoreWrapper();
        KeyEvent.getDeadChar(0, 0);
        TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
        ViewConfiguration.getJumpTapTimeout();
        int i = valueOf + 55;
        AFInAppEventParameterName = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static AFf1rSDK AFInAppEventType(AFf1vSDK aFf1vSDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFf1rSDK(aFf1vSDK.valueOf == AFf1xSDK.DEFAULT, AFf1sSDK.NA);
        }
        Object[] objArr = new Object[1];
        values(65 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 57189), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFf1vSDK.valueOf == AFf1xSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = BuildConfig.FLAVOR;
            str3 = intern;
        }
        boolean equals = AFKeystoreWrapper(new StringBuilder(str3).reverse().toString(), aFf1vSDK.AFInAppEventParameterName, "android", "v1", str4).equals(str);
        return new AFf1rSDK(equals, equals ? AFf1sSDK.SUCCESS : AFf1sSDK.FAILURE);
    }

    public static void AFKeystoreWrapper() {
        values = new char[]{57174, 64449, 38524, 45715, 19722, 27040, 1240, 57202, 64494, 38419, 45748, 19745, 26691, 1274, 57107, 64398, 38439, 45396, 19919, 26725, 1179, 57151, 64427, 38604, 45433, 19946, 26631, 1228, 57303, 64077, 38626, 45341, 19891, 26660, 862, 57332, 64111, 38647, 45370, 19539, 26827, 783, 57238, 64121, 38566, 45535, 19572, 26856, 770, 57270, 64040, 38215, 45566, 19473, 26765, 805, 56922, 64187, 38241, 45469, 19509, 26797, 965, 56845};
        AFInAppEventType = -6336437974626589545L;
    }

    private static void values(int i, int i2, char c, Object[] objArr) {
        String str;
        synchronized (AFg1iSDK.valueOf) {
            try {
                char[] cArr = new char[i];
                AFg1iSDK.values = 0;
                while (true) {
                    int i3 = AFg1iSDK.values;
                    if (i3 < i) {
                        cArr[i3] = (char) ((values[i2 + i3] ^ (i3 * AFInAppEventType)) ^ c);
                        AFg1iSDK.values = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str;
    }

    public final AFf1rSDK AFKeystoreWrapper(AFf1vSDK aFf1vSDK, String str, String str2, String str3) {
        int i = valueOf;
        AFInAppEventParameterName = (i + 87) % 128;
        if (aFf1vSDK != null) {
            AFInAppEventParameterName = (i + 53) % 128;
            if (str2 != null) {
                int i2 = (i + 111) % 128;
                AFInAppEventParameterName = i2;
                if (str3 != null) {
                    valueOf = (i2 + 1) % 128;
                    AFf1rSDK AFInAppEventType2 = AFInAppEventType(aFf1vSDK, str, str2, str3);
                    valueOf = (AFInAppEventParameterName + 95) % 128;
                    return AFInAppEventType2;
                }
            }
        }
        AFInAppEventParameterName = (i + 23) % 128;
        return new AFf1rSDK(false, AFf1sSDK.INTERNAL_ERROR);
    }

    private static String AFKeystoreWrapper(String str, String str2, String str3, String str4, String str5) {
        String AFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.values(str2, str3, str4, str5, BuildConfig.FLAVOR), str);
        if (AFKeystoreWrapper.length() >= 12) {
            return AFKeystoreWrapper.substring(0, 12);
        }
        int i = (valueOf + 33) % 128;
        AFInAppEventParameterName = i;
        int i2 = i + 101;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return AFKeystoreWrapper;
        }
        throw null;
    }
}
