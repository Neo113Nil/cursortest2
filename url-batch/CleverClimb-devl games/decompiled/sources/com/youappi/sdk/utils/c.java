package com.youappi.sdk.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: com.youappi.sdk.utils.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9525a = new int[EnumC0415c.values().length];

        static {
            try {
                f9525a[EnumC0415c.External.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f9526a;

        /* renamed from: b, reason: collision with root package name */
        int f9527b;

        /* renamed from: c, reason: collision with root package name */
        int f9528c;

        /* renamed from: d, reason: collision with root package name */
        int f9529d;

        public a(boolean z, int i, int i2, int i3) {
            this.f9526a = z;
            this.f9527b = i;
            this.f9528c = i2;
            this.f9529d = i3;
        }

        public boolean a() {
            return this.f9526a;
        }

        public int b() {
            return this.f9527b;
        }

        public int c() {
            return this.f9528c;
        }

        public int d() {
            return this.f9529d;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        long f9530a;

        /* renamed from: b, reason: collision with root package name */
        long f9531b;

        b(long j, long j2) {
            this.f9530a = j;
            this.f9531b = j2;
        }
    }

    /* renamed from: com.youappi.sdk.utils.c$c, reason: collision with other inner class name */
    public enum EnumC0415c {
        Internal,
        External
    }

    private static float a(float f) {
        double d2 = f;
        Double.isNaN(d2);
        double round = Math.round(d2 * 100.0d);
        Double.isNaN(round);
        return (float) (round / 100.0d);
    }

    private static StatFs a(EnumC0415c enumC0415c) {
        try {
            return new StatFs((AnonymousClass1.f9525a[enumC0415c.ordinal()] != 1 ? android.os.Environment.getDataDirectory() : android.os.Environment.getExternalStorageDirectory()).getPath());
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public static a a(Context context) {
        int width;
        int height;
        int i = -1;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                i = connectivityManager.getActiveNetworkInfo().getType();
            }
        } catch (Exception unused) {
            Log.i("networkType", "NetworkState permission missing");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return null;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            width = i2;
            height = i3;
        } else if (Build.VERSION.SDK_INT >= 14) {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                height = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                width = intValue;
            } catch (Exception unused2) {
                width = defaultDisplay.getWidth();
                height = defaultDisplay.getHeight();
                Log.e("Display Info", "Couldn't use reflection to get the real display metrics.");
            }
        } else {
            width = defaultDisplay.getWidth();
            height = defaultDisplay.getHeight();
        }
        return new a(context.getResources().getConfiguration().orientation == 1, width, height, i);
    }

    private static b a(StatFs statFs) {
        return d() ? new b(statFs.getBlockCountLong(), statFs.getAvailableBlocksLong()) : new b(statFs.getBlockCount(), statFs.getAvailableBlocks());
    }

    public static Float a() {
        if (c()) {
            return null;
        }
        return b(EnumC0415c.External);
    }

    public static Float b() {
        return b(EnumC0415c.Internal);
    }

    private static Float b(EnumC0415c enumC0415c) {
        try {
            b a2 = a(a(enumC0415c));
            return Float.valueOf(a(a2.f9531b / a2.f9530a));
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean c() {
        return android.os.Environment.getExternalStorageState().equals("mounted");
    }

    private static boolean d() {
        return Build.VERSION.SDK_INT >= 18;
    }
}
