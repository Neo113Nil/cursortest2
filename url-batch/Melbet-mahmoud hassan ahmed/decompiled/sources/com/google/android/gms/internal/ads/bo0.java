package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class bo0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f3473b = new s33(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final String f3474c = r2.j.class.getName();

    /* renamed from: d, reason: collision with root package name */
    private static final String f3475d = b3.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    private static final String f3476e = s2.b.class.getName();

    /* renamed from: f, reason: collision with root package name */
    private static final String f3477f = s2.c.class.getName();

    /* renamed from: g, reason: collision with root package name */
    private static final String f3478g = k3.b.class.getName();

    /* renamed from: h, reason: collision with root package name */
    private static final String f3479h = r2.f.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private float f3480a = -1.0f;

    public static int a(Context context, int i7) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i8 = configuration.orientation;
        if (i7 == 0) {
            i7 = i8;
        }
        return Math.round((i7 == i8 ? displayMetrics.heightPixels : displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static r2.h c(Context context, int i7, int i8, int i9) {
        float f7;
        float f8;
        int i10;
        int a7 = a(context, i9);
        if (a7 == -1) {
            return r2.h.f21150q;
        }
        int min = Math.min(90, Math.round(a7 * 0.15f));
        if (i7 <= 655) {
            if (i7 > 632) {
                i10 = 81;
            } else if (i7 > 526) {
                f7 = i7 / 468.0f;
                f8 = 60.0f;
            } else if (i7 > 432) {
                i10 = 68;
            } else {
                f7 = i7 / 320.0f;
                f8 = 50.0f;
            }
            return new r2.h(i7, Math.max(Math.min(i10, min), 50));
        }
        f7 = i7 / 728.0f;
        f8 = 90.0f;
        i10 = Math.round(f7 * f8);
        return new r2.h(i7, Math.max(Math.min(i10, min), 50));
    }

    public static String d() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String e(String str) {
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static Throwable f(Throwable th) {
        if (j30.f6959f.e().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z6 = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (j(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z6 = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z6) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(j30.f6957d.e());
    }

    public static final int k(DisplayMetrics displayMetrics, int i7) {
        return (int) TypedValue.applyDimension(1, i7, displayMetrics);
    }

    public static final String l(StackTraceElement[] stackTraceElementArr, String str) {
        int i7;
        int i8;
        String str2;
        while (true) {
            i8 = i7 + 1;
            if (i8 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i7];
            String className = stackTraceElement.getClassName();
            i7 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f3474c.equalsIgnoreCase(className) || f3475d.equalsIgnoreCase(className) || f3476e.equalsIgnoreCase(className) || f3477f.equalsIgnoreCase(className) || f3478g.equalsIgnoreCase(className) || f3479h.equalsIgnoreCase(className))) ? 0 : i8;
        }
        str2 = stackTraceElementArr[i8].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i9 = 2;
                while (true) {
                    int i10 = i9 - 1;
                    if (i9 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                    i9 = i10;
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean m() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator");
    }

    public static final boolean n(Context context, int i7) {
        return o3.f.f().h(context, i7) == 0;
    }

    public static final boolean o(Context context) {
        int h7 = o3.f.f().h(context, o3.j.f19861a);
        return h7 == 0 || h7 == 2;
    }

    public static final boolean p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int q(DisplayMetrics displayMetrics, int i7) {
        return Math.round(i7 / displayMetrics.density);
    }

    public static final void r(Context context, String str, String str2, Bundle bundle, boolean z6, ao0 ao0Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int a7 = o3.f.f().a(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(a7);
            sb.append(".214106000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        ao0Var.b(appendQueryParameter.toString());
    }

    public static final int s(Context context, int i7) {
        return k(context.getResources().getDisplayMetrics(), i7);
    }

    public static final String t(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m()) {
            string = "emulator";
        }
        return e(string);
    }

    private static final void u(ViewGroup viewGroup, pv pvVar, String str, int i7, int i8) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i7);
        textView.setBackgroundColor(i8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i7);
        int s7 = s(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(pvVar.f10381k - s7, pvVar.f10378h - s7, 17));
        viewGroup.addView(frameLayout, pvVar.f10381k, pvVar.f10378h);
    }

    public final int b(Context context, int i7) {
        if (this.f3480a < 0.0f) {
            synchronized (this) {
                if (this.f3480a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f3480a = displayMetrics.density;
                }
            }
        }
        return Math.round(i7 / this.f3480a);
    }

    public final void g(ViewGroup viewGroup, pv pvVar, String str, String str2) {
        if (str2 != null) {
            io0.g(str2);
        }
        u(viewGroup, pvVar, str, -65536, -16777216);
    }

    public final void h(ViewGroup viewGroup, pv pvVar, String str) {
        u(viewGroup, pvVar, "Ads by Google", -16777216, -1);
    }

    public final void i(Context context, String str, String str2, Bundle bundle, boolean z6) {
        r(context, str, "gmob-apps", bundle, true, new zn0(this));
    }
}
