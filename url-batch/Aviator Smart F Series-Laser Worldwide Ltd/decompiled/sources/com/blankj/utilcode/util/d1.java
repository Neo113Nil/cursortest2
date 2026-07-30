package com.blankj.utilcode.util;

import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import java.util.Locale;

/* loaded from: classes2.dex */
public class d1 {
    public static void fixScrollViewTopping(View view) {
        view.setFocusable(false);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            childAt.setFocusable(false);
            if (childAt instanceof ViewGroup) {
                fixScrollViewTopping(childAt);
            }
        }
    }

    public static boolean isLayoutRtl() {
        Locale locale;
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = z0.getApp().getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = z0.getApp().getResources().getConfiguration().locale;
        }
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1;
    }

    public static View layoutId2View(@LayoutRes int i8) {
        return ((LayoutInflater) z0.getApp().getSystemService("layout_inflater")).inflate(i8, (ViewGroup) null);
    }

    public static void runOnUiThread(Runnable runnable) {
        c1.runOnUiThread(runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j8) {
        c1.runOnUiThreadDelayed(runnable, j8);
    }

    public static void setViewEnabled(View view, boolean z7) {
        setViewEnabled(view, z7, null);
    }

    public static void setViewEnabled(View view, boolean z7, View... viewArr) {
        if (view == null) {
            return;
        }
        if (viewArr != null) {
            for (View view2 : viewArr) {
                if (view == view2) {
                    return;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                setViewEnabled(viewGroup.getChildAt(i8), z7, viewArr);
            }
        }
        view.setEnabled(z7);
    }
}
