package com.baidu.location.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import cn.hutool.core.util.l;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.c.m;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i {
    public static int A = 0;
    public static int B = 0;
    public static int C = 1000;
    public static int D = Integer.MAX_VALUE;
    public static float E = 6.0f;
    public static float F = 10.0f;
    public static int G = 60;
    public static int H = 70;
    public static int I = 6;
    public static String J = null;
    public static boolean K = false;
    public static int L = 16;
    public static int M = 15;
    public static float N = 0.75f;
    public static double O = -0.10000000149011612d;
    public static int P = 0;
    public static int Q = 0;
    public static int R = 1;
    public static int S = 1;
    public static int T = 0;
    public static float U = 0.8f;
    public static float V = 0.2f;
    public static int W = 0;
    public static int[] X = null;
    public static boolean Y = false;
    public static int Z = 8;

    /* renamed from: a, reason: collision with root package name */
    public static boolean f5255a = false;

    /* renamed from: a0, reason: collision with root package name */
    public static int f5256a0 = 4000;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5257b = false;

    /* renamed from: b0, reason: collision with root package name */
    public static int f5258b0 = 1;

    /* renamed from: c, reason: collision with root package name */
    public static int f5259c = 0;

    /* renamed from: c0, reason: collision with root package name */
    public static int f5260c0 = -1;

    /* renamed from: d, reason: collision with root package name */
    public static String f5261d = "no";

    /* renamed from: d0, reason: collision with root package name */
    public static int f5262d0 = 10;

    /* renamed from: e, reason: collision with root package name */
    public static int f5263e = 4;

    /* renamed from: e0, reason: collision with root package name */
    public static int f5264e0 = 3;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f5265f = false;

    /* renamed from: f0, reason: collision with root package name */
    public static int f5266f0 = 40;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f5267g = false;

    /* renamed from: g0, reason: collision with root package name */
    public static double[] f5268g0 = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f5269h = false;

    /* renamed from: h0, reason: collision with root package name */
    public static int f5270h0 = 1;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f5271i = false;

    /* renamed from: i0, reason: collision with root package name */
    public static int f5272i0 = 1;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f5273j = false;

    /* renamed from: j0, reason: collision with root package name */
    public static int f5274j0 = 1;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f5275k = false;

    /* renamed from: l, reason: collision with root package name */
    public static String f5277l = "";

    /* renamed from: m, reason: collision with root package name */
    public static int f5279m = 3;

    /* renamed from: n, reason: collision with root package name */
    public static int f5281n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static int f5283o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static float f5285p = 2.0f;

    /* renamed from: q, reason: collision with root package name */
    public static float f5287q = 10.0f;

    /* renamed from: r, reason: collision with root package name */
    public static float f5288r = 50.0f;

    /* renamed from: s, reason: collision with root package name */
    public static float f5289s = 200.0f;

    /* renamed from: t, reason: collision with root package name */
    public static int f5290t = 16;

    /* renamed from: u, reason: collision with root package name */
    public static int f5291u = 10000;

    /* renamed from: v, reason: collision with root package name */
    public static float f5292v = 0.5f;

    /* renamed from: w, reason: collision with root package name */
    public static float f5293w = 0.0f;

    /* renamed from: x, reason: collision with root package name */
    public static float f5294x = 0.1f;

    /* renamed from: y, reason: collision with root package name */
    public static int f5295y = 30;

    /* renamed from: z, reason: collision with root package name */
    public static int f5296z;

    /* renamed from: k0, reason: collision with root package name */
    private static String f5276k0 = Build.MANUFACTURER;

    /* renamed from: l0, reason: collision with root package name */
    public static boolean f5278l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    public static String f5280m0 = null;

    /* renamed from: n0, reason: collision with root package name */
    public static int f5282n0 = -1;

    /* renamed from: o0, reason: collision with root package name */
    public static String f5284o0 = null;

    /* renamed from: p0, reason: collision with root package name */
    public static String f5286p0 = null;

    class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                x509Certificate.checkValidity();
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static double a(double d8, double d9, double d10, double d11) {
        Location.distanceBetween(d8, d9, d10, d11, new float[1]);
        return r0[0];
    }

    public static int b(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static long c(String str) {
        try {
            return new SimpleDateFormat(cn.hutool.core.date.d.NORM_DATETIME_PATTERN).parse(str).getTime() / 1000;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String d() {
        return e.f5208g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e() {
        String path;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            if (Environment.getExternalStorageState().equals("mounted")) {
                path = Environment.getExternalStorageDirectory().getPath();
                if (path == null && Build.VERSION.SDK_INT > 28 && com.baidu.location.f.getServiceContext() != null) {
                    try {
                        path = com.baidu.location.f.getServiceContext().getExternalFilesDir(Environment.DIRECTORY_MOVIES).getAbsolutePath();
                    } catch (Exception unused) {
                        path = null;
                    }
                }
                if (path != null) {
                    try {
                        File file = new File(path + "/baidu/tempdata");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        return null;
                    }
                }
                return path;
            }
        }
        path = null;
        if (path == null) {
            path = com.baidu.location.f.getServiceContext().getExternalFilesDir(Environment.DIRECTORY_MOVIES).getAbsolutePath();
        }
        if (path != null) {
        }
        return path;
    }

    public static String f() {
        String e8 = e();
        if (e8 == null) {
            return null;
        }
        return e8 + "/baidu/tempdata";
    }

    public static int g(Context context) {
        int a8 = a(context, "android.permission.ACCESS_FINE_LOCATION") | a(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (b(context) != 0 && a8 == 1) {
            return 1;
        }
        if (b(context) == 0 || a8 == 1) {
            return (b(context) >= 1 || a8 != 1) ? 0 : -1;
        }
        return -2;
    }

    public static String h() {
        try {
            File file = new File(com.baidu.location.f.getServiceContext().getFilesDir() + File.separator + "/baidu/tempdata");
            if (!file.exists()) {
                file.mkdirs();
            }
            return com.baidu.location.f.getServiceContext().getFilesDir().getPath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(com.baidu.location.f.getServiceContext().getFilesDir());
            String str = File.separator;
            sb.append(str);
            sb.append("/baidu/tempdata");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            return com.baidu.location.f.getServiceContext().getFilesDir().getPath() + str + "/baidu/tempdata";
        } catch (Exception unused) {
            return null;
        }
    }

    public static String j() {
        return b("ro.mediatek.platform");
    }

    public static SSLSocketFactory k() {
        TrustManager[] trustManagerArr = {new a()};
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        return sSLContext.getSocketFactory();
    }

    public static int a(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Exception unused) {
            return 2;
        }
    }

    public static String b(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
        } catch (Exception unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            if (TextUtils.isEmpty(readLine)) {
                return null;
            }
            return readLine;
        } catch (Exception unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static String c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet6Address) && nextElement.getHostAddress() != null && !nextElement.getHostAddress().startsWith("fe80:")) {
                        return nextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String d(Context context) {
        int a8 = a(context, "android.permission.ACCESS_COARSE_LOCATION");
        int a9 = a(context, "android.permission.ACCESS_FINE_LOCATION");
        if (Build.VERSION.SDK_INT < 29) {
            return "&per=" + a8 + b5.b.VERTICAL + a9;
        }
        return "&per=" + a8 + b5.b.VERTICAL + a9 + b5.b.VERTICAL + a(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public static String e(Context context) {
        int i8 = -1;
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                    i8 = activeNetworkInfo.getType();
                }
            } catch (Throwable unused) {
            }
        }
        return "&netc=" + i8;
    }

    public static String f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String g() {
        try {
            File file = new File(com.baidu.location.f.getServiceContext().getFilesDir() + File.separator + "lldt");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean h(Context context) {
        if (context == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 31 && a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 && a(context, "android.permission.ACCESS_COARSE_LOCATION") == 1;
    }

    public static boolean i(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (Build.VERSION.SDK_INT >= 29) {
                activeNetwork = connectivityManager.getActiveNetwork();
                return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0 ? 1 : 0;
        } catch (Exception unused) {
            return 1;
        }
    }

    public static boolean b() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(Context context) {
        boolean z7;
        if (context != null) {
            try {
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            if (a(context, "android.permission.ACCESS_COARSE_LOCATION") != 1) {
                z7 = false;
                if (z7 && Build.VERSION.SDK_INT >= 23) {
                    try {
                        if (Settings.Secure.getInt(context.getContentResolver(), "location_mode", 1) == 0) {
                            return false;
                        }
                    } catch (Exception unused) {
                    }
                }
                return z7;
            }
            z7 = true;
            if (z7) {
                if (Settings.Secure.getInt(context.getContentResolver(), "location_mode", 1) == 0) {
                }
            }
            return z7;
        }
        return true;
    }

    public static String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("enc3")) {
                return new String(b(Base64.decode(jSONObject.optString("enc3").getBytes(), 0)), l.UTF_8);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static int a(Object obj, String str) {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, null);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return ((Integer) declaredMethod.invoke(obj, null)).intValue();
    }

    public static boolean b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static int a(String str, String str2, String str3) {
        int indexOf;
        int length;
        int indexOf2;
        String substring;
        if (str != null && !str.equals("") && (indexOf = str.indexOf(str2)) != -1 && (indexOf2 = str.indexOf(str3, (length = indexOf + str2.length()))) != -1 && (substring = str.substring(length, indexOf2)) != null && !substring.equals("")) {
            try {
                return Integer.parseInt(substring);
            } catch (NumberFormatException unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] b(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        IOException e8;
        byte[] bArr2;
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                try {
                    bArr2 = new byte[2048];
                } catch (IOException e9) {
                    e8 = e9;
                    e8.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
                gZIPInputStream2 = gZIPInputStream;
                if (gZIPInputStream2 != null) {
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e11) {
            gZIPInputStream = null;
            e8 = e11;
        } catch (Throwable th2) {
            th = th2;
            if (gZIPInputStream2 != null) {
            }
            throw th;
        }
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            try {
                break;
            } catch (IOException e12) {
                e12.printStackTrace();
            }
        }
        gZIPInputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static String a() {
        Calendar calendar = Calendar.getInstance();
        int i8 = calendar.get(5);
        return String.format(Locale.CHINA, "%d-%02d-%02d %02d:%02d:%02d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(i8), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)));
    }

    public static String a(com.baidu.location.c.b bVar, m mVar, Location location, String str, int i8) {
        return a(bVar, mVar, location, str, i8, false);
    }

    public static String a(com.baidu.location.c.b bVar, m mVar, Location location, String str, int i8, boolean z7) {
        String b8;
        StringBuffer stringBuffer = new StringBuffer(2048);
        if (bVar != null && (b8 = com.baidu.location.c.h.a().b(bVar)) != null) {
            stringBuffer.append(b8);
        }
        if (mVar != null) {
            String a8 = com.baidu.location.c.h.a().a(i8 == 0 ? f5290t : M, true, mVar, L);
            if (a8 != null) {
                stringBuffer.append(a8);
            }
        }
        if (location != null) {
            String b9 = (f5259c == 0 || i8 == 0) ? com.baidu.location.c.f.b(location) : com.baidu.location.c.f.c(location);
            if (b9 != null) {
                stringBuffer.append(b9);
            }
        }
        String a9 = c.a().a(i8 == 0);
        if (a9 != null) {
            stringBuffer.append(a9);
        }
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(com.baidu.location.c.f.a().m());
        String a10 = com.baidu.location.c.h.a().a(bVar);
        if (a10 != null && a10.length() + stringBuffer.length() < 2000) {
            stringBuffer.append(a10);
        }
        String stringBuffer2 = stringBuffer.toString();
        if (location != null && mVar != null) {
            try {
                float speed = location.getSpeed();
                int i9 = f5259c;
                int a11 = com.baidu.location.c.h.a().a(mVar);
                int a12 = mVar.a();
                boolean z8 = mVar.f5141d;
                if (speed < E && ((i9 == 1 || i9 == 0) && (a11 < G || z8))) {
                    f5279m = 1;
                } else if (speed < F && ((i9 == 1 || i9 == 0 || i9 == 3) && (a11 < H || a12 > I))) {
                    f5279m = 2;
                }
            } catch (Exception unused) {
                f5279m = 3;
            }
            return stringBuffer2;
        }
        f5279m = 3;
        return stringBuffer2;
    }

    public static String a(String str) {
        return Jni.en1(f5277l + ";" + str);
    }

    public static String a(byte[] bArr, String str, boolean z7) {
        StringBuilder sb = new StringBuilder();
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (z7) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String a(byte[] bArr, boolean z7) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest(), "", z7);
        } catch (NoSuchAlgorithmException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static boolean a(double d8, double d9) {
        return Math.abs(d8 - d9) <= 1.192092896E-7d;
    }

    public static boolean a(float f8, float f9) {
        return Math.abs(f8 - f9) <= 1.1920929E-7f;
    }

    public static boolean a(Location location) {
        String str;
        if (location == null || (str = f5276k0) == null || !"huawei".equalsIgnoreCase(str)) {
            return false;
        }
        try {
            Bundle extras = location.getExtras();
            if (extras != null) {
                return (extras.getInt("SourceType") & 128) == 128;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(BDLocation bDLocation) {
        int locType = bDLocation.getLocType();
        return (locType > 100 && locType < 200) || locType == 62;
    }

    public static boolean a(int[] iArr) {
        if (iArr != null && iArr.length >= 18) {
            for (int i8 : iArr) {
                if (i8 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }
}
