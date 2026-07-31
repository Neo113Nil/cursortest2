package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.huawei.hms.support.log.HMSLog;
import com.ironsource.b9;

/* loaded from: classes.dex */
public abstract class ResourceLoaderUtil {

    /* renamed from: a, reason: collision with root package name */
    private static Context f14491a;

    /* renamed from: b, reason: collision with root package name */
    private static String f14492b;

    public static int getAnimId(String str) {
        Context context = f14491a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "anim", f14492b);
    }

    public static int getColorId(String str) {
        Context context = f14491a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, b9.h.f15459S, f14492b);
    }

    public static int getDimenId(String str) {
        Context context = f14491a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "dimen", f14492b);
    }

    public static Drawable getDrawable(String str) {
        Context context = f14491a;
        if (context == null) {
            return null;
        }
        return context.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        Context context = f14491a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "drawable", f14492b);
    }

    public static int getIdId(String str) {
        Context context = f14491a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "id", f14492b);
    }

    public static int getLayoutId(String str) {
        Context context = f14491a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "layout", f14492b);
    }

    public static String getString(String str) {
        Context context = f14491a;
        return context == null ? "" : context.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        Context context = f14491a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "string", f14492b);
    }

    public static int getStyleId(String str) {
        Context context = f14491a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "style", f14492b);
    }

    public static Context getmContext() {
        return f14491a;
    }

    public static void setmContext(Context context) {
        f14491a = context;
        if (context != null) {
            f14492b = context.getPackageName();
        } else {
            f14492b = null;
            HMSLog.e("ResourceLoaderUtil", "context is null");
        }
    }

    public static String getString(String str, Object... objArr) {
        Context context = f14491a;
        if (context == null) {
            return "";
        }
        return context.getResources().getString(getStringId(str), objArr);
    }
}
