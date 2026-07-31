package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
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
import com.facebook.react.uimanager.ViewProps;
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
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class zh {
    public static volatile Intent b;
    public static volatile Boolean c;

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f528a = new WeakHashMap();
    public static final pa d = new pa(new c7() { // from class: com.startapp.sdk.internal.zh$$ExternalSyntheticLambda0
        @Override // com.startapp.sdk.internal.c7
        public final Object call() {
            return zh.c();
        }
    });
    public static final wh e = new wh();

    public static Intent a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getLaunchIntentForPackage(str);
            }
            return null;
        } catch (Throwable th) {
            n8.a(th);
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
        if (str.equals(str2) && (intent = b) != null) {
            return new Intent(intent);
        }
        long j = Thread.currentThread() == Looper.getMainLooper().getThread() ? 100L : 5000L;
        Intent[] intentArr = {null};
        synchronized (intentArr) {
            try {
                new Thread(new uh(intentArr, context, str)).start();
                intentArr.wait(j);
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
        b = intent2;
        return new Intent(intent2);
    }

    public static /* synthetic */ Random c() {
        return new Random(new SecureRandom().nextLong());
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        try {
            String[] split = new URL(MetaData.A().e()).getHost().split("\\.");
            if (split.length > 1) {
                Locale locale = Locale.ENGLISH;
                return str.toLowerCase(locale).contains(split[1].toLowerCase(locale));
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public static long e(String str) {
        long j;
        if (str == null || str.length() < 1) {
            return 0L;
        }
        int length = str.length() - 1;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        char c2 = 0;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (charAt != 'm' || c2 != 's') {
                    if (z) {
                        if (charAt == 's') {
                            j = 1000;
                        } else if (charAt == 'm') {
                            j = 60000;
                        } else if (charAt == 'h') {
                            j = 3600000;
                        } else if (charAt == 'd') {
                            j = 86400000;
                        }
                        z = false;
                    }
                    return ~length;
                }
                j = 1;
                j3 = j;
                length--;
                c2 = charAt;
            } else {
                if (j3 == 0) {
                    return ~length;
                }
                j2 += (charAt - '0') * j3;
                j3 *= 10;
                z = true;
                length--;
                c2 = charAt;
            }
        }
        return j2;
    }

    public static int[][] f(String str) {
        int parseInt;
        int i;
        ArrayList arrayList = null;
        for (String str2 : str.split(StringUtils.COMMA)) {
            int indexOf = str2.indexOf("..");
            if (indexOf < 0) {
                i = Integer.parseInt(str2);
                parseInt = i;
            } else {
                String substring = str2.substring(0, indexOf);
                int parseInt2 = substring.length() > 0 ? Integer.parseInt(substring) : Integer.MIN_VALUE;
                String substring2 = str2.substring(indexOf + 2);
                parseInt = substring2.length() > 0 ? Integer.parseInt(substring2) : Integer.MAX_VALUE;
                i = parseInt2;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            arrayList.add(new int[]{Math.min(i, parseInt), Math.max(i, parseInt)});
        }
        if (arrayList != null) {
            return (int[][]) arrayList.toArray(new int[0][]);
        }
        return null;
    }

    public static String g(String str) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)), 11);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
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
                n8.a(th);
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

    public static boolean d(Context context) {
        Boolean bool = c;
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
        c = bool;
        return bool.booleanValue();
    }

    public static String a(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (str == null || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + indexOf, indexOf2);
    }

    public static void a(Activity activity, boolean z) {
        int i = activity.getResources().getConfiguration().orientation;
        if (z) {
            WeakHashMap weakHashMap = f528a;
            if (!weakHashMap.containsKey(activity)) {
                weakHashMap.put(activity, Integer.valueOf(activity.getRequestedOrientation()));
            }
            if (i == activity.getResources().getConfiguration().orientation) {
                m0.a(activity, i, false);
                return;
            } else {
                m0.a(activity, i, true);
                return;
            }
        }
        WeakHashMap weakHashMap2 = f528a;
        if (weakHashMap2.containsKey(activity)) {
            int intValue = ((Integer) weakHashMap2.get(activity)).intValue();
            int i2 = m0.f327a;
            try {
                activity.setRequestedOrientation(intValue);
            } catch (Throwable unused) {
            }
            f528a.remove(activity);
        }
    }

    public static boolean e(Context context) {
        try {
            Object systemService = context.getSystemService("uimode");
            if (systemService instanceof UiModeManager) {
                return ((UiModeManager) systemService).getCurrentModeType() == 4;
            }
        } catch (Throwable th) {
            n8.a(th);
        }
        return false;
    }

    public static String c(String str) {
        return new String(a(Base64.decode(str, 8)));
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
            n8.a(th);
            return false;
        }
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
            for (Field field : a(new LinkedList(), (Class) serializable2.getClass())) {
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

    public static String a(String str) {
        if (str != null) {
            try {
                return URLEncoder.encode(str, CharEncoding.UTF_8);
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }
        return "";
    }

    public static boolean a(double d2) {
        if (Double.compare(d2, 0.0d) <= 0) {
            return false;
        }
        return Double.compare(d2, 1.0d) >= 0 || ((Random) d.a()).nextDouble() < d2;
    }

    public static String b(String str) {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return Base64.encodeToString(g.a(byteArrayOutputStream.toByteArray()), 10);
    }

    public static boolean a(WebView webView, String str) {
        try {
            webView.loadDataWithBaseURL(MetaData.A().t(), str, "text/html", "utf-8", null);
            return true;
        } catch (Throwable th) {
            n8.a(th);
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

    public static void a(WebView webView, boolean z, String str, Object... objArr) {
        if (webView != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("if (typeof ").append(str).append(" === \"function\") {");
                sb.append(str);
                sb.append("(");
                for (int i = 0; i < objArr.length; i++) {
                    if (z && (objArr[i] instanceof String)) {
                        sb.append("\"").append(((String) objArr[i]).replaceAll("\"", "\\\\\"")).append("\"");
                    } else {
                        sb.append(objArr[i]);
                    }
                    if (i < objArr.length - 1) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                sb.append(");}");
                webView.loadUrl("javascript:" + ((Object) sb));
            } catch (Exception unused) {
            }
        }
    }

    public static String b(Context context) {
        PackageManager packageManager;
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
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(context.getPackageName());
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
        char c2 = (char) length;
        for (int i = 0; i < length; i++) {
            c2 = (char) (c2 + iArr[i]);
            cArr[i] = c2;
        }
        return new String(cArr);
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
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

    public static StackTraceElement a(int i) {
        if (i < 0) {
            i = 0;
        }
        StackTraceElement[] a2 = yh.a();
        if (a2 == null) {
            return null;
        }
        String name = yh.class.getName();
        int length = a2.length;
        for (int i2 = 0; i2 < length; i2++) {
            StackTraceElement stackTraceElement = a2[i2];
            if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                int i3 = i2 + 3 + i;
                if (i3 < length) {
                    return a2[i3];
                }
                return null;
            }
        }
        return null;
    }

    public static String a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return ViewProps.NONE;
        }
        return stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + "()";
    }

    public static void a(int i, Context context, String str) {
        boolean z;
        Log.println(i, "StartAppSDK", str);
        if (!d(context)) {
            int i2 = m0.f327a;
            try {
                z = t6.a(context);
            } catch (Throwable unused) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        n8 n8Var = new n8(o8.d);
        n8Var.d = "Log for a publisher";
        n8Var.e = str;
        n8Var.a();
    }

    public static String a(Ad ad) {
        if (ad instanceof ni) {
            ni niVar = (ni) ad;
            if (niVar.getType() == Ad.AdType.VIDEO) {
                return "VIDEO";
            }
            if (niVar.getType() == Ad.AdType.REWARDED_VIDEO) {
                return "REWARDED_VIDEO";
            }
            return "INTERSTITIAL";
        }
        if (ad instanceof gd) {
            return "OFFER_WALL";
        }
        if (ad instanceof fd) {
            return "OFFER_WALL_3D";
        }
        if (ad instanceof l1) {
            int i = ((l1) ad).t;
            if (i == 0) {
                return AdPreferences.TYPE_BANNER;
            }
            if (i == 1) {
                return "MREC";
            }
            if (i == 2) {
                return "COVER";
            }
            return "BANNER_UNDEFINED";
        }
        if (ad instanceof x0) {
            return "BANNER_3D";
        }
        if (ad instanceof vc) {
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
                for (int i = 0; i < length; i++) {
                    int length2 = strArr.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (strArr[i2].equals(packageInfo.requestedPermissions[i])) {
                            if ((packageInfo.requestedPermissionsFlags[i] & 2) == 2) {
                                iArr[i2] = 2;
                            } else {
                                iArr[i2] = 1;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    public static boolean a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (iArr2 != null && iArr2.length > 1 && iArr2[0] <= i && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List a(List list) {
        return list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    public static void a(Object obj, Throwable th) {
        if (obj.getClass().getName().startsWith("com.startapp.")) {
            n8.a(th);
        }
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        String className;
        jh jhVar = new jh(th);
        while (jhVar.hasNext()) {
            Throwable next = jhVar.next();
            if (jhVar.d) {
                printWriter.println('-');
            }
            printWriter.println(next.toString().trim());
            StackTraceElement[] stackTrace = next.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                StackTraceElement stackTraceElement = null;
                int i = 0;
                int i2 = 0;
                boolean z = false;
                while (i < length) {
                    StackTraceElement stackTraceElement2 = stackTrace[i];
                    if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                        boolean z2 = i < 3;
                        boolean startsWith = className.startsWith("com.startapp.");
                        if (z2 || startsWith || z) {
                            if (i2 > 0) {
                                printWriter.print(' ');
                                printWriter.println(i2);
                                i2 = 0;
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
                                i2++;
                            }
                            stackTraceElement = stackTraceElement2;
                        }
                        z = startsWith;
                    }
                    i++;
                }
                if (stackTraceElement != null) {
                    i2++;
                }
                if (i2 > 0) {
                    printWriter.print(' ');
                    printWriter.println(i2);
                }
            }
        }
    }

    public static StackTraceElement a(Throwable th) {
        String className;
        while (true) {
            StackTraceElement stackTraceElement = null;
            if (th == null) {
                return null;
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i];
                        if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null && className.startsWith("com.startapp.")) {
                            stackTraceElement = stackTraceElement2;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            if (stackTraceElement != null) {
                return stackTraceElement;
            }
            th = th.getCause();
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
        for (int i = 0; i < length; i++) {
            int i2 = abs % (i + length);
            char c2 = charArray[i];
            if (' ' <= c2 && c2 <= '~') {
                charArray[i] = (char) (((((i2 * (-1)) + (c2 - ' ')) + 95) % 95) + 32);
            }
        }
        return new String(charArray);
    }
}
