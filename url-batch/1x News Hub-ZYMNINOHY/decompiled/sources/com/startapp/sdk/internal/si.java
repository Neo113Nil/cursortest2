package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Base64OutputStream;
import android.util.Log;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

/* loaded from: classes.dex */
public abstract class si {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Intent f4439b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Boolean f4440c;

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f4438a = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ib f4441d = new ib(new com.startapp.sdk.components.e(4));

    /* renamed from: e, reason: collision with root package name */
    public static final pi f4442e = new pi();

    public static Intent a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getLaunchIntentForPackage(str);
            }
            return null;
        } catch (Throwable th) {
            d9.a(th);
            return null;
        }
    }

    public static Intent b(Context context, String str) {
        String str2;
        Intent intent;
        if (context == null) {
            return null;
        }
        try {
            str2 = context.getPackageName();
        } catch (Throwable unused) {
            str2 = null;
        }
        if (str == null) {
            str = str2;
        }
        if (str == null) {
            return null;
        }
        if (str.equals(str2) && (intent = f4439b) != null) {
            return new Intent(intent);
        }
        long j3 = Thread.currentThread() == Looper.getMainLooper().getThread() ? 100L : 5000L;
        Intent[] intentArr = {null};
        synchronized (intentArr) {
            try {
                new Thread(new ni(intentArr, context, str)).start();
                intentArr.wait(j3);
            } catch (Throwable unused2) {
            }
        }
        Intent intent2 = intentArr[0];
        if (intent2 == null) {
            return null;
        }
        if (!str.equals(str2)) {
            return intent2;
        }
        f4439b = intent2;
        return new Intent(intent2);
    }

    public static /* synthetic */ Random c() {
        return new Random(new SecureRandom().nextLong());
    }

    public static boolean d(Context context) {
        Boolean bool = f4440c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                bool = Boolean.valueOf((applicationInfo.flags & 2) != 0);
            }
        } catch (Throwable unused) {
        }
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        f4440c = bool;
        return bool.booleanValue();
    }

    public static boolean e(String str) {
        if (str == null) {
            return false;
        }
        try {
            String[] split = new URL(MetaData.E().f()).getHost().split("\\.");
            if (split.length > 1) {
                Locale locale = Locale.ENGLISH;
                return str.toLowerCase(locale).contains(split[1].toLowerCase(locale));
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public static long f(String str) {
        long j3;
        if (str == null || str.length() < 1) {
            return 0L;
        }
        int length = str.length() - 1;
        long j4 = 0;
        long j5 = 0;
        boolean z = true;
        char c3 = 0;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (charAt != 'm' || c3 != 's') {
                    if (z) {
                        if (charAt == 's') {
                            j3 = 1000;
                        } else if (charAt == 'm') {
                            j3 = 60000;
                        } else if (charAt == 'h') {
                            j3 = 3600000;
                        } else if (charAt == 'd') {
                            j3 = 86400000;
                        }
                        z = false;
                    }
                    return ~length;
                }
                j3 = 1;
                j5 = j3;
                length--;
                c3 = charAt;
            } else {
                if (j5 == 0) {
                    return ~length;
                }
                j4 += (charAt - '0') * j5;
                j5 *= 10;
                z = true;
                length--;
                c3 = charAt;
            }
        }
        return j4;
    }

    public static int[][] g(String str) {
        int parseInt;
        int i3;
        ArrayList arrayList = null;
        for (String str2 : str.split(StringUtils.COMMA)) {
            int indexOf = str2.indexOf("..");
            if (indexOf < 0) {
                i3 = Integer.parseInt(str2);
                parseInt = i3;
            } else {
                String substring = str2.substring(0, indexOf);
                int parseInt2 = substring.length() > 0 ? Integer.parseInt(substring) : Integer.MIN_VALUE;
                String substring2 = str2.substring(indexOf + 2);
                parseInt = substring2.length() > 0 ? Integer.parseInt(substring2) : Integer.MAX_VALUE;
                i3 = parseInt2;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            arrayList.add(new int[]{Math.min(i3, parseInt), Math.max(i3, parseInt)});
        }
        if (arrayList != null) {
            return (int[][]) arrayList.toArray(new int[0][]);
        }
        return null;
    }

    public static String h(String str) {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 11);
    }

    public static boolean c(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Throwable th) {
            if (!a(th, SecurityException.class) && !a(th, RemoteException.class)) {
                d9.a(th);
            }
        }
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo != null && runningAppProcessInfo.importance == 100 && packageName.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    public static String a(Activity activity) {
        ComponentName component;
        Intent b3 = b(activity, null);
        if (b3 == null || (component = b3.getComponent()) == null) {
            return null;
        }
        return component.getClassName();
    }

    public static boolean e(Context context) {
        try {
            Object systemService = context.getSystemService("uimode");
            if (systemService instanceof UiModeManager) {
                return ((UiModeManager) systemService).getCurrentModeType() == 4;
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        return false;
    }

    public static String a(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (str == null || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + indexOf, indexOf2);
    }

    public static String d(String str) {
        String str2 = null;
        try {
            str2 = str.replaceAll("[^\\w-.]", "_");
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(str2.getBytes(StandardCharsets.UTF_8)), 11);
        } catch (Throwable th) {
            d9.a(th);
            return (str2 == null || str2.length() > 255) ? Integer.toHexString(str.hashCode()) : str2;
        }
    }

    public static String c(String str) {
        return new String(a(Base64.decode(str, 8)));
    }

    public static void a(Activity activity, boolean z) {
        int i3 = activity.getResources().getConfiguration().orientation;
        if (z) {
            WeakHashMap weakHashMap = f4438a;
            if (!weakHashMap.containsKey(activity)) {
                weakHashMap.put(activity, Integer.valueOf(activity.getRequestedOrientation()));
            }
            if (i3 == activity.getResources().getConfiguration().orientation) {
                p0.a(activity, i3, false);
                return;
            } else {
                p0.a(activity, i3, true);
                return;
            }
        }
        WeakHashMap weakHashMap2 = f4438a;
        if (weakHashMap2.containsKey(activity)) {
            int intValue = ((Integer) weakHashMap2.get(activity)).intValue();
            int i4 = p0.f4293a;
            try {
                activity.setRequestedOrientation(intValue);
            } catch (Throwable unused) {
            }
            weakHashMap2.remove(activity);
        }
    }

    public static boolean c(Context context, String str) {
        if (!str.startsWith("sms:") && !str.startsWith("smsto:")) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    public static String b(String str) {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return Base64.encodeToString(AbstractC0288g.a(byteArrayOutputStream.toByteArray()), 10);
    }

    public static List a(LinkedList linkedList, Class cls) {
        linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
        if (cls.getSuperclass() != null) {
            a(linkedList, cls.getSuperclass());
        }
        return linkedList;
    }

    public static boolean a(Serializable serializable, Serializable serializable2) {
        Object obj;
        boolean z = false;
        try {
            Class<?> cls = serializable2.getClass();
            LinkedList<Field> linkedList = new LinkedList();
            linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
            if (cls.getSuperclass() != null) {
                a(linkedList, (Class) cls.getSuperclass());
            }
            for (Field field : linkedList) {
                int modifiers = field.getModifiers();
                if (!Modifier.isTransient(modifiers) && !Modifier.isStatic(modifiers)) {
                    field.setAccessible(true);
                    if (field.get(serializable) == null && (obj = field.get(serializable2)) != null) {
                        field.set(serializable, obj);
                        z = true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return z;
    }

    public static String b(Throwable th) {
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintWriter printWriter = new PrintWriter(a(byteArrayOutputStream));
                a(th, printWriter);
                printWriter.close();
                return byteArrayOutputStream.toString();
            } catch (Throwable unused) {
                return th.toString();
            }
        } catch (Throwable unused2) {
            return th.getMessage();
        }
    }

    public static String b(Context context) {
        PackageManager packageManager;
        InstallSourceInfo installSourceInfo;
        String str = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable unused) {
            packageManager = null;
        }
        if (packageManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            try {
                installSourceInfo = packageManager.getInstallSourceInfo(context.getPackageName());
                if (installSourceInfo != null) {
                    str = installSourceInfo.getInstallingPackageName();
                }
            } catch (Throwable unused2) {
            }
        }
        if (str != null) {
            return str;
        }
        try {
            return packageManager.getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused3) {
            return str;
        }
    }

    public static String a(String str) {
        if (str != null) {
            try {
                return URLEncoder.encode(str, CharEncoding.UTF_8);
            } catch (UnsupportedEncodingException e3) {
                throw new RuntimeException(e3);
            }
        }
        return "";
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static boolean a(double d3) {
        if (Double.compare(d3, 0.0d) <= 0) {
            return false;
        }
        return Double.compare(d3, 1.0d) >= 0 || ((Random) f4441d.a()).nextDouble() < d3;
    }

    public static boolean a(WebView webView, String str) {
        try {
            webView.loadDataWithBaseURL(MetaData.E().w(), str, "text/html", "utf-8", null);
            return true;
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    public static String a(Context context) {
        ActivityInfo activityInfo;
        String str = "";
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null && (str = activityInfo.packageName) != null) {
                return str.toLowerCase(Locale.ROOT);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static void a(WebView webView, boolean z, String str, Object... objArr) {
        if (webView != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("if (typeof ");
                sb.append(str);
                sb.append(" === \"function\") {");
                sb.append(str);
                sb.append("(");
                for (int i3 = 0; i3 < objArr.length; i3++) {
                    if (z && (objArr[i3] instanceof String)) {
                        sb.append("\"");
                        sb.append(((String) objArr[i3]).replaceAll("\"", "\\\\\""));
                        sb.append("\"");
                    } else {
                        sb.append(objArr[i3]);
                    }
                    if (i3 < objArr.length - 1) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                sb.append(");}");
                webView.loadUrl("javascript:" + ((Object) sb));
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream, new Inflater(true));
        inflaterOutputStream.write(bArr);
        inflaterOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static String a(int... iArr) {
        int length = iArr.length;
        char[] cArr = new char[length];
        char c3 = (char) length;
        for (int i3 = 0; i3 < length; i3++) {
            c3 = (char) (c3 + iArr[i3]);
            cArr[i3] = c3;
        }
        return new String(cArr);
    }

    public static DeflaterOutputStream a(ByteArrayOutputStream byteArrayOutputStream) {
        return new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 10), new Deflater(9, true));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static StackTraceElement a(int i3) {
        if (i3 < 0) {
            i3 = 0;
        }
        StackTraceElement[] a3 = ri.a();
        if (a3 == null) {
            return null;
        }
        String name = ri.class.getName();
        int length = a3.length;
        for (int i4 = 0; i4 < length; i4++) {
            StackTraceElement stackTraceElement = a3[i4];
            if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                int i5 = i4 + 3 + i3;
                if (i5 < length) {
                    return a3[i5];
                }
                return null;
            }
        }
        return null;
    }

    public static String a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "none";
        }
        return stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + "()";
    }

    public static void a(int i3, Context context, String str) {
        boolean z;
        Log.println(i3, "StartAppSDK", str);
        if (!d(context)) {
            int i4 = p0.f4293a;
            try {
                z = u6.a(context);
            } catch (Throwable unused) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        d9 d9Var = new d9(e9.f3724d);
        d9Var.f3680d = "Log for a publisher";
        d9Var.f3681e = str;
        d9Var.a();
    }

    public static String a(Ad ad) {
        if (ad instanceof ij) {
            ij ijVar = (ij) ad;
            if (ijVar.getType() == Ad.AdType.VIDEO) {
                return "VIDEO";
            }
            if (ijVar.getType() == Ad.AdType.REWARDED_VIDEO) {
                return "REWARDED_VIDEO";
            }
            return "INTERSTITIAL";
        }
        if (ad instanceof ud) {
            return "OFFER_WALL";
        }
        if (ad instanceof td) {
            return "OFFER_WALL_3D";
        }
        if (ad instanceof q1) {
            int i3 = ((q1) ad).f4336t;
            if (i3 == 0) {
                return AdPreferences.TYPE_BANNER;
            }
            if (i3 == 1) {
                return "MREC";
            }
            if (i3 == 2) {
                return "COVER";
            }
            return "BANNER_UNDEFINED";
        }
        if (ad instanceof a1) {
            return "BANNER_3D";
        }
        if (ad instanceof nd) {
            return "NATIVE";
        }
        return "UNDEFINED";
    }

    public static int[] a(Context context, String... strArr) {
        int[] iArr = new int[strArr.length];
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] strArr2 = packageInfo.requestedPermissions;
            if (strArr2 != null) {
                int length = strArr2.length;
                for (int i3 = 0; i3 < length; i3++) {
                    int length2 = strArr.length;
                    for (int i4 = 0; i4 < length2; i4++) {
                        if (strArr[i4].equals(packageInfo.requestedPermissions[i3])) {
                            if ((packageInfo.requestedPermissionsFlags[i3] & 2) == 2) {
                                iArr[i4] = 2;
                            } else {
                                iArr[i4] = 1;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    public static boolean a(int i3, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (iArr2 != null && iArr2.length > 1 && iArr2[0] <= i3 && i3 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(Object obj, Throwable th) {
        if (obj.getClass().getName().startsWith("com.startapp.")) {
            d9.a(th);
        }
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        String className;
        ai aiVar = new ai(th);
        while (aiVar.hasNext()) {
            Throwable next = aiVar.next();
            if (aiVar.f3574d) {
                printWriter.println('-');
            }
            printWriter.println(next.toString().trim());
            StackTraceElement[] stackTrace = next.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                StackTraceElement stackTraceElement = null;
                int i3 = 0;
                int i4 = 0;
                boolean z = false;
                while (i3 < length) {
                    StackTraceElement stackTraceElement2 = stackTrace[i3];
                    if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                        boolean z2 = i3 < 3;
                        boolean startsWith = className.startsWith("com.startapp.");
                        if (z2 || startsWith || z) {
                            if (i4 > 0) {
                                printWriter.print(' ');
                                printWriter.println(i4);
                                i4 = 0;
                            }
                            if (stackTraceElement != null) {
                                printWriter.print(' ');
                                printWriter.print(stackTraceElement.getClassName());
                                printWriter.print('.');
                                printWriter.print(stackTraceElement.getMethodName());
                                printWriter.println("()");
                                stackTraceElement = null;
                            }
                            printWriter.print(' ');
                            printWriter.print(stackTraceElement2.getClassName());
                            printWriter.print('.');
                            printWriter.print(stackTraceElement2.getMethodName());
                            printWriter.println("()");
                        } else {
                            if (stackTraceElement != null) {
                                i4++;
                            }
                            stackTraceElement = stackTraceElement2;
                        }
                        z = startsWith;
                    }
                    i3++;
                }
                if (stackTraceElement != null) {
                    i4++;
                }
                if (i4 > 0) {
                    printWriter.print(' ');
                    printWriter.println(i4);
                }
            }
        }
    }

    public static StackTraceElement a(Throwable th) {
        String className;
        Throwable th2 = th;
        while (true) {
            StackTraceElement stackTraceElement = null;
            if (th2 == null) {
                return null;
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i3];
                        if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null && className.startsWith("com.startapp.")) {
                            stackTraceElement = stackTraceElement2;
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
            }
            if (stackTraceElement != null) {
                return stackTraceElement;
            }
            th2 = th2.getCause();
        }
    }

    public static boolean a(Throwable th, Class cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static String a() {
        int abs = Math.abs(-2034744135);
        char[] charArray = "st{xI:>B?7=:CH".toCharArray();
        int length = charArray.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = abs % (i3 + length);
            char c3 = charArray[i3];
            if (' ' <= c3 && c3 <= '~') {
                charArray[i3] = (char) (((((i4 * (-1)) + (c3 - ' ')) + 95) % 95) + 32);
            }
        }
        return new String(charArray);
    }
}
