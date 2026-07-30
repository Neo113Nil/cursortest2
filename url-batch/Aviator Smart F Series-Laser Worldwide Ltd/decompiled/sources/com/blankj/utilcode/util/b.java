package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import com.baidu.ar.constants.HttpConstants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {
    private static List<Field> sMetricsFields;

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.preLoad();
        }
    }

    private b() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @NonNull
    public static Resources adaptHeight(@NonNull Resources resources, int i8) {
        return adaptHeight(resources, i8, false);
    }

    @NonNull
    public static Resources adaptWidth(@NonNull Resources resources, int i8) {
        applyDisplayMetrics(resources, (resources.getDisplayMetrics().widthPixels * 72.0f) / i8);
        return resources;
    }

    private static void applyDisplayMetrics(@NonNull Resources resources, float f8) {
        resources.getDisplayMetrics().xdpi = f8;
        z0.getApp().getResources().getDisplayMetrics().xdpi = f8;
        applyOtherDisplayMetrics(resources, f8);
    }

    private static void applyMetricsFields(Resources resources, float f8) {
        Iterator<Field> it = sMetricsFields.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f8;
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    private static void applyOtherDisplayMetrics(Resources resources, float f8) {
        if (sMetricsFields != null) {
            applyMetricsFields(resources, f8);
            return;
        }
        sMetricsFields = new ArrayList();
        Class<?> cls = resources.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        while (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics metricsFromField = getMetricsFromField(resources, field);
                    if (metricsFromField != null) {
                        sMetricsFields.add(field);
                        metricsFromField.xdpi = f8;
                    }
                }
            }
            cls = cls.getSuperclass();
            if (cls == null) {
                return;
            } else {
                declaredFields = cls.getDeclaredFields();
            }
        }
    }

    @NonNull
    public static Resources closeAdapt(@NonNull Resources resources) {
        applyDisplayMetrics(resources, Resources.getSystem().getDisplayMetrics().density * 72.0f);
        return resources;
    }

    private static DisplayMetrics getMetricsFromField(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    private static int getNavBarHeight(@NonNull Resources resources) {
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", HttpConstants.OS_TYPE_VALUE);
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    static Runnable getPreLoadRunnable() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preLoad() {
        applyDisplayMetrics(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }

    public static int pt2Px(float f8) {
        return (int) (((f8 * z0.getApp().getResources().getDisplayMetrics().xdpi) / 72.0f) + 0.5d);
    }

    public static int px2Pt(float f8) {
        return (int) (((f8 * 72.0f) / z0.getApp().getResources().getDisplayMetrics().xdpi) + 0.5d);
    }

    @NonNull
    public static Resources adaptHeight(@NonNull Resources resources, int i8, boolean z7) {
        applyDisplayMetrics(resources, ((resources.getDisplayMetrics().heightPixels + (z7 ? getNavBarHeight(resources) : 0)) * 72.0f) / i8);
        return resources;
    }
}
