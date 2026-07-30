package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.tp2;
import defpackage.up2;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventUtility {
    public static final AppEventUtility INSTANCE = new AppEventUtility();
    private static final String PRICE_REGEX = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    private AppEventUtility() {
    }

    public static final String bytesToHex(byte[] bArr) {
        bArr.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        return stringBuffer2;
    }

    public static final String getAppVersion() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            String str = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            str.getClass();
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static final View getRootView(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(AppEventUtility.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventUtility.class);
            return null;
        }
    }

    public static final boolean isEmulator() {
        String str = Build.FINGERPRINT;
        str.getClass();
        if (tp2.o(str, "generic", false) || tp2.o(str, "unknown", false)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        if (up2.q(str2, "google_sdk") || up2.q(str2, "Emulator") || up2.q(str2, "Android SDK built for x86")) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        if (up2.q(str3, "Genymotion")) {
            return true;
        }
        String str4 = Build.BRAND;
        str4.getClass();
        if (tp2.o(str4, "generic", false)) {
            String str5 = Build.DEVICE;
            str5.getClass();
            if (tp2.o(str5, "generic", false)) {
                return true;
            }
        }
        return "google_sdk".equals(Build.PRODUCT);
    }

    private static final boolean isMainThread() {
        return Intrinsics.b(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final double normalizePrice(String str) {
        try {
            Matcher matcher = Pattern.compile(PRICE_REGEX, 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static final void assertIsMainThread() {
    }

    public static final void assertIsNotMainThread() {
    }
}
