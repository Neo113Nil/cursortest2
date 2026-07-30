package com.moyoung.dafit.module.common.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.fragment.app.Fragment;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes4.dex */
public class s0 {

    @SuppressLint({"StaticFieldLeak"})
    private static Context context = null;
    private static boolean isOpenTrack = false;

    public static FirebaseAnalytics getAnalytics() {
        return FirebaseAnalytics.getInstance(context);
    }

    public static void initTrack(Context context2, boolean z7) {
        context = context2;
        isOpenTrack = z7;
        getAnalytics().setAnalyticsCollectionEnabled(z7);
    }

    public static void logEvent(String str) {
        if (isOpenTrack) {
            getAnalytics().logEvent(str, null);
        }
    }

    public static void logFragmentView(Fragment fragment) {
        if (isOpenTrack) {
            String simpleName = fragment.getClass().getSimpleName();
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, simpleName);
            bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, simpleName);
            getAnalytics().logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);
        }
    }

    public static void logPage(Class<?> cls, String str) {
        if (isOpenTrack) {
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, cls.getSimpleName());
            bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, str);
            getAnalytics().logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);
        }
    }

    public static void logUserId() {
        if (isOpenTrack) {
            getAnalytics().setUserId(p.getDeviceId(d.get()));
        }
    }

    public static void logUserProperty(@NonNull @Size(max = 24, min = 1) String str, @Nullable @Size(max = 36) String str2) {
        if (isOpenTrack) {
            getAnalytics().setUserProperty(str, str2);
        }
    }

    public static void logEvent(String str, @Nullable String str2, @Nullable String str3) {
        if (isOpenTrack) {
            Bundle bundle = new Bundle();
            bundle.putString(str2, str3);
            logEvent(str, bundle);
        }
    }

    public static void logEvent(String str, @Nullable Bundle bundle) {
        if (isOpenTrack) {
            getAnalytics().logEvent(str, bundle);
        }
    }
}
