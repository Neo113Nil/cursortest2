package com.aiming.mdt.a;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.aiming.mdt.a.ʼʽʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0118 {

    /* renamed from: ʻʽʿ, reason: contains not printable characters */
    private static int f341 = 1;

    /* renamed from: ʻʾʿ, reason: contains not printable characters */
    private static int f343 = 0;

    /* renamed from: ʼʿ, reason: contains not printable characters */
    private static long f349 = 9022361534448906056L;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private static char[] f344 = {5325, 48031, 19063, 6429, 43508, 30904, 3937, 56878, 28289, 'v', 44856, 24318, 'i', 44859, 24276, 3517, 48450, 27677, 7127, 51882, 31285, 10726, 'c', 44839, 24317, 3509, 48449, 27654, 7124, 51900, 31269, 10730, 55461, 34943, 'p', 44858, 24305, 3515, 48453, 27674, 7156, 51869, 31266, 10749, 55479, 46675, 6429, 59616, 48025, 2932, 55840, 'b', 44839, 24296, 3464, 48449, 27676, 7128, 'm', 44831, 24312, 3505, 48451, 27648, 7139, 51885, 'm', 44831, 24312, 3505, 48451, 27648, 7154, 51853, 31283, 10737, 55442, 34935, 14104, 'i', 44859, 24281, 3510, 48467, 27676, 7121, 51860, 31276, 't', 44841, 24291, 3507, 48483, 27648, 7125, 51867, 31275, 4471, 48687, 20460, 7337, 44114, 32024, 2790, 56197, 27440, 14590, 51630, 55185, 30930, 35079, 55881, 27321, 48058, 52263, 7544, 44480, 65045, 3920, 38779, 14341, 51675, 39557, 10874, 64297, 36076, 23977, 60715, 48840, 20381, 8019, 40995, 29088, 701, 53858, 25562, 13455, 50250, '\\', 44844, 24251, 'c', 44839, 24318, 3510, 48453, 27659, 7108, 51857, 31286, 10721, 55460, 34913, 28597, 49370, 12554, 25159, 53942, 1023, 29795, 42344, 5596, 17943, 46927, 59278, 22768, 35119, 64106, 10917, 39700, 52251, 15498, 28125, 56880, 3899, 32679, 53482, 327, 29082, 32035, 53866, 9129, 28863};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static byte[][] f345 = {new byte[]{47, 115, 121, 115, 116, 101, 109, 47, 98, 105, 110, 47}, new byte[]{47, 115, 121, 115, 116, 101, 109, 47, 120, 98, 105, 110, 47}, new byte[]{47, 115, 121, 115, 116, 101, 109, 47, 115, 98, 105, 110, 47}, new byte[]{47, 115, 98, 105, 110, 47}, new byte[]{47, 118, 101, 110, 100, 111, 114, 47, 98, 105, 110, 47}};

    /* renamed from: ʻ, reason: contains not printable characters */
    private static byte[] f333 = {115, 117};

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static byte[] f339 = {98, 117, 115, 121, 98, 111, 120};

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static byte[] f334 = {119, 104, 105, 99, 104, 32, 115, 117};

    /* renamed from: ʽ, reason: contains not printable characters */
    private static byte[] f350 = {119, 104, 105, 99, 104, 32, 98, 117, 115, 121, 98, 111, 120};

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static byte[] f346 = {120, 112, 111, 115, 101, 100};

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static byte[] f335 = {104, 111, 111, 107};

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static byte[] f342 = {100, 101, 46, 114, 111, 98, 118, 46, 97, 110, 100, 114, 111, 105, 100, 46, 120, 112, 111, 115, 101, 100, 46, 88, 112, 111, 115, 101, 100, 66, 114, 105, 100, 103, 101};

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static byte[] f348 = {100, 105, 115, 97, 98, 108, 101, 72, 111, 111, 107, 115};

    /* renamed from: ʾ, reason: contains not printable characters */
    private static byte[] f353 = {100, 101, 46, 114, 111, 98, 118, 46, 97, 110, 100, 114, 111, 105, 100, 46, 120, 112, 111, 115, 101, 100, 46, 105, 110, 115, 116, 97, 108, 108, 101, 114};

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private static byte[] f336 = {103, 101, 116, 112, 114, 111, 112, 32, 114, 111, 46, 100, 101, 98, 117, 103, 103, 97, 98, 108, 101};

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private static byte[] f340 = {47, 112, 114, 111, 99, 47, 48, 47, 115, 116, 97, 116, 117, 115};

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private static byte[] f351 = {116, 114, 97, 99, 101, 114, 112, 105, 100};

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private static byte[] f347 = {106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 83, 121, 115, 116, 101, 109};

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    private static byte[] f337 = {103, 101, 116, 80, 114, 111, 112, 101, 114, 116, 121};

    /* renamed from: ʻʼʿ, reason: contains not printable characters */
    private static byte[] f338 = {104, 116, 116, 112, 46, 112, 114, 111, 120, 121, 72, 111, 115, 116};

    /* renamed from: ʿ, reason: contains not printable characters */
    private static byte[] f354 = {104, 116, 116, 112, 46, 112, 114, 111, 120, 121, 80, 111, 114, 116};

    /* renamed from: ʽʿ, reason: contains not printable characters */
    private static byte[] f352 = {110, 117, 108, 108};

    static {
        int i = f343 + 25;
        f341 = i % 128;
        if (!(i % 2 == 0)) {
            return;
        }
        Object obj = null;
        super.hashCode();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean m438() {
        byte[][] bArr = f345;
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            StringBuilder sb = new StringBuilder();
            sb.append(new String(bArr2));
            sb.append(new String(f333));
            if ((m440(sb.toString()) ? 'L' : ' ') != ' ') {
                int i2 = f343 + 109;
                f341 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            i++;
            int i4 = f343 + 53;
            f341 = i4 % 128;
            int i5 = i4 % 2;
        }
        return false;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean m439(Context context) {
        int i = f343 + 17;
        f341 = i % 128;
        int i2 = i % 2;
        if (context != null) {
            int i3 = f341 + 103;
            f343 = i3 % 128;
            try {
                if (i3 % 2 == 0 ? Build.VERSION.SDK_INT >= 23 : Build.VERSION.SDK_INT >= 28) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(m442((char) 0, 12, 141).intern());
                    if (connectivityManager != null) {
                        Network[] allNetworks = connectivityManager.getAllNetworks();
                        int length = allNetworks.length;
                        int i4 = 0;
                        while (true) {
                            if ((i4 < length ? '9' : '^') == '^') {
                                break;
                            }
                            int i5 = f341 + 65;
                            f343 = i5 % 128;
                            int i6 = i5 % 2;
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i4]);
                            if ((networkCapabilities.hasTransport(4) ? '@' : '9') == '@') {
                                int i7 = f341 + 81;
                                f343 = i7 % 128;
                                if (i7 % 2 != 0) {
                                    if ((!networkCapabilities.hasCapability(57) ? 'C' : '^') != '^') {
                                        break;
                                    }
                                } else if (!networkCapabilities.hasCapability(15)) {
                                    break;
                                }
                            }
                            i4++;
                        }
                        C0124.f378[1] = 1;
                        return true;
                    }
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        int i8 = f341 + 57;
                        f343 = i8 % 128;
                        int i9 = i8 % 2;
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    if (arrayList.contains(m442((char) 32087, 4, 179).intern())) {
                        C0124.f378[1] = 1;
                        return true;
                    }
                }
            } catch (Throwable unused) {
                m442((char) 28659, 26, 153).intern();
                C0044.m107();
            }
        }
        return false;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean m440(String str) {
        boolean z = false;
        try {
            if ((new File(str).exists() ? (char) 18 : 'C') != 'C') {
                int i = f343 + 7;
                f341 = i % 128;
                int i2 = i % 2;
                z = true;
            }
        } catch (Exception unused) {
            m442((char) 38696, 19, 119).intern();
            C0044.m107();
        }
        int i3 = f341 + 27;
        f343 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return z;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static boolean m441() {
        Object obj = null;
        boolean z = true;
        try {
            Field declaredField = ClassLoader.getSystemClassLoader().loadClass(new String(f342)).getDeclaredField(new String(f348));
            declaredField.setAccessible(true);
            declaredField.get(null);
            try {
                C0124.f378[2] = 1;
                int i = f343 + 69;
                f341 = i % 128;
                if (i % 2 == 0) {
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            z = false;
        }
        int i2 = f343 + 79;
        f341 = i2 % 128;
        if ((i2 % 2 == 0 ? 'H' : (char) 16) == 16) {
            return z;
        }
        super.hashCode();
        return z;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String m442(char c2, int i, int i2) {
        char[] cArr = new char[i];
        int i3 = f341 + 43;
        f343 = i3 % 128;
        int i4 = 0;
        if (i3 % 2 != 0) {
        }
        while (i4 < i) {
            int i5 = f343 + 17;
            f341 = i5 % 128;
            if ((i5 % 2 == 0 ? '2' : 'Z') != 'Z') {
                cArr[i4] = (char) ((f344[i2 % i4] ^ (i4 / f349)) | c2);
                i4 += 109;
            } else {
                cArr[i4] = (char) ((f344[i2 + i4] ^ (i4 * f349)) ^ c2);
                i4++;
            }
        }
        return new String(cArr);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static boolean m443() {
        int i = f343 + 113;
        f341 = i % 128;
        int i2 = i % 2;
        byte[][] bArr = f345;
        int length = bArr.length;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            byte[] bArr2 = bArr[i3];
            StringBuilder sb = new StringBuilder();
            sb.append(new String(bArr2));
            sb.append(new String(f339));
            if (m440(sb.toString())) {
                int i4 = f343 + 77;
                f341 = i4 % 128;
                if (i4 % 2 == 0) {
                }
                int i5 = f341 + 53;
                f343 = i5 % 128;
                if (i5 % 2 == 0) {
                }
                z = true;
            } else {
                i3++;
            }
        }
        int i6 = f341 + 55;
        f343 = i6 % 128;
        if ((i6 % 2 != 0 ? 'Z' : 'O') != 'Z') {
        }
        return z;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static boolean m444(Context context) {
        boolean z;
        try {
            if (!((context.getApplicationInfo().flags & 2) != 0)) {
                int i = f341 + 21;
                f343 = i % 128;
                int i2 = i % 2;
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i3 = f343 + 11;
                f341 = i3 % 128;
                if (i3 % 2 != 0) {
                }
                try {
                    C0124.f375 = 1;
                } catch (Exception unused) {
                    m442((char) 38696, 19, 119).intern();
                    C0044.m107();
                    return z;
                }
            }
        } catch (Exception unused2) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        com.aiming.mdt.a.C0124.f378[2] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r5 = com.aiming.mdt.a.C0118.f341 + 63;
        com.aiming.mdt.a.C0118.f343 = r5 % 128;
        r5 = r5 % 2;
     */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m445(Context context, String str) {
        int i;
        boolean z = true;
        try {
            Iterator<PackageInfo> it = context.getPackageManager().getInstalledPackages(0).iterator();
            int i2 = f343 + 13;
            f341 = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                if ((it.hasNext() ? (char) 2 : 'A') != 2) {
                    z = false;
                    break;
                }
                if ((it.next().packageName.equals(str) ? '`' : ':') == '`') {
                    try {
                        break;
                    } catch (Exception unused) {
                        m442((char) 38696, 19, 119).intern();
                        C0044.m107();
                        i = f343 + 125;
                        f341 = i % 128;
                        if (i % 2 != 0) {
                        }
                        return z;
                    }
                }
            }
        } catch (Exception unused2) {
            z = false;
        }
        i = f343 + 125;
        f341 = i % 128;
        if (i % 2 != 0) {
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* renamed from: ʻʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m446() {
        int i;
        boolean z = false;
        try {
            if (Integer.parseInt(m447(new String(f336))) == 1) {
                int i2 = f343 + 109;
                f341 = i2 % 128;
                int i3 = i2 % 2;
                try {
                    C0124.f375 = 1;
                    z = true;
                } catch (Exception unused) {
                    z = true;
                    m442((char) 38696, 19, 119).intern();
                    C0044.m107();
                    i = f343 + 35;
                    f341 = i % 128;
                    if ((i % 2 != 0 ? ')' : '\t') == ')') {
                    }
                    return z;
                }
            }
        } catch (Exception unused2) {
        }
        i = f343 + 35;
        f341 = i % 128;
        if ((i % 2 != 0 ? ')' : '\t') == ')') {
        }
        return z;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m447(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            Process exec = Runtime.getRuntime().exec(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            int i = f341 + 35;
            f343 = i % 128;
            if (i % 2 != 0) {
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if ((readLine != null ? '=' : '\f') == '\f') {
                    break;
                }
                int i2 = f341 + 53;
                f343 = i2 % 128;
                int i3 = i2 % 2;
                sb.append(readLine);
            }
            bufferedReader.close();
            exec.destroy();
            int i4 = f341 + 65;
            f343 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
            m442((char) 38696, 19, 119).intern();
            C0044.m107();
        }
        return sb.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m448() {
        String obj;
        int i = f343 + 75;
        f341 = i % 128;
        int i2 = i % 2;
        try {
            Integer.valueOf(Arrays.toString(new byte[]{83, 66}));
            return false;
        } catch (Exception e) {
            Throwable th = e;
            while (true) {
                if ((th != null ? '\'' : 'V') == 'V') {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    e.printStackTrace(printWriter);
                    printWriter.flush();
                    obj = stringWriter.toString();
                    break;
                }
                int i3 = f341 + 121;
                f343 = i3 % 128;
                if ((i3 % 2 != 0 ? '4' : '\"') != '\"') {
                    if ((th instanceof UnknownHostException ? '`' : '7') == '`') {
                        break;
                    }
                    th = th.getCause();
                } else {
                    if (th instanceof UnknownHostException) {
                        break;
                    }
                    th = th.getCause();
                }
            }
            obj = "";
            String lowerCase = obj.toLowerCase();
            if (!lowerCase.contains(new String(f335))) {
                if (!(lowerCase.contains(new String(f346)))) {
                    return false;
                }
            }
            C0124.f378[2] = 1;
            int i4 = f341 + 7;
            f343 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007e, code lost:
    
        com.aiming.mdt.a.C0124.f378[0] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        m442(38696, 19, 119).intern();
        com.aiming.mdt.a.C0044.m107();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if ((!r3.equals(new java.lang.String(com.aiming.mdt.a.C0118.f352)) ? '&' : '>') != '&') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005f, code lost:
    
        if ((r3.equals(new java.lang.String(com.aiming.mdt.a.C0118.f352))) != false) goto L10;
     */
    /* renamed from: ʼʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m449() {
        boolean z = true;
        try {
            Method method = ClassLoader.getSystemClassLoader().loadClass(new String(f347)).getMethod(new String(f337), String.class);
            String valueOf = String.valueOf(method.invoke(null, new String(f338)));
            String valueOf2 = String.valueOf(method.invoke(null, new String(f354)));
            if (!TextUtils.isEmpty(valueOf)) {
            }
            if (!TextUtils.isEmpty(valueOf2)) {
            }
            z = false;
            int i = f341 + 43;
            f343 = i % 128;
            int i2 = i % 2;
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7 A[Catch: Exception -> 0x00fb, TRY_LEAVE, TryCatch #3 {Exception -> 0x00fb, blocks: (B:53:0x00da, B:40:0x00ee, B:44:0x00f7), top: B:52:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0111 A[Catch: Exception -> 0x011a, TryCatch #6 {Exception -> 0x011a, blocks: (B:84:0x010c, B:77:0x0111, B:79:0x0116), top: B:83:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116 A[Catch: Exception -> 0x011a, TRY_LEAVE, TryCatch #6 {Exception -> 0x011a, blocks: (B:84:0x010c, B:77:0x0111, B:79:0x0116), top: B:83:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.BufferedReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Reader] */
    /* renamed from: ʼʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m450() {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        boolean z;
        ?? r8;
        Throwable th;
        String readLine;
        Reader reader = null;
        boolean z2 = false;
        try {
            fileInputStream = new FileInputStream(new File(new String(f340).replaceAll("0", String.valueOf(Process.myPid()))));
        } catch (Exception unused) {
            z = false;
            fileInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            inputStreamReader = null;
        }
        try {
            inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                try {
                    r8 = new BufferedReader(inputStreamReader);
                } catch (Exception unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                r8 = reader;
                th = th;
                if (r8 != 0) {
                    try {
                        r8.close();
                    } catch (Exception unused3) {
                        m442((char) 38696, 19, 119).intern();
                        C0044.m107();
                        throw th;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                throw th;
            }
            try {
                try {
                    String str = "";
                    String str2 = new String(f351);
                    while (true) {
                        readLine = r8.readLine();
                        if (readLine == null) {
                            break;
                        }
                        int i = f343 + 91;
                        f341 = i % 128;
                        if (i % 2 != 0) {
                            if (!(!readLine.toLowerCase().contains(str2))) {
                                break;
                            }
                        } else if (readLine.toLowerCase().contains(str2)) {
                            break;
                        }
                    }
                    int i2 = f341 + 67;
                    f343 = i2 % 128;
                    int i3 = i2 % 2;
                    str = readLine;
                    if (!TextUtils.isEmpty(str)) {
                        Matcher matcher = Pattern.compile(m442((char) 0, 3, 138).intern()).matcher(str);
                        if (matcher.find()) {
                            if (Integer.parseInt(matcher.group(0)) != 0) {
                                try {
                                    C0124.f375 = 1;
                                    z2 = true;
                                } catch (Exception unused4) {
                                    reader = r8;
                                    z = true;
                                    m442((char) 38696, 19, 119).intern();
                                    C0044.m107();
                                    if (reader != null) {
                                    }
                                    if (!(fileInputStream != null)) {
                                    }
                                    if (inputStreamReader != null) {
                                    }
                                    if (!z2) {
                                    }
                                    return z;
                                }
                            }
                        }
                    }
                    try {
                        r8.close();
                        fileInputStream.close();
                        inputStreamReader.close();
                        return z2;
                    } catch (Exception unused5) {
                        m442((char) 38696, 19, 119).intern();
                        C0044.m107();
                        return z2;
                    }
                } catch (Exception unused6) {
                    reader = r8;
                    z = false;
                    m442((char) 38696, 19, 119).intern();
                    C0044.m107();
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (Exception unused7) {
                            m442((char) 38696, 19, 119).intern();
                            C0044.m107();
                            return z;
                        }
                    }
                    if (!(fileInputStream != null)) {
                        int i4 = f341 + 87;
                        f343 = i4 % 128;
                        int i5 = i4 % 2;
                        fileInputStream.close();
                    }
                    if (inputStreamReader != null) {
                        z2 = true;
                    }
                    if (!z2) {
                        inputStreamReader.close();
                    }
                    return z;
                }
            } catch (Throwable th4) {
                th = th4;
                if (r8 != 0) {
                }
                if (fileInputStream != null) {
                }
                if (inputStreamReader != null) {
                }
                throw th;
            }
        } catch (Exception unused8) {
            z = false;
            inputStreamReader = null;
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = null;
            r8 = inputStreamReader;
            th = th;
            if (r8 != 0) {
            }
            if (fileInputStream != null) {
            }
            if (inputStreamReader != null) {
            }
            throw th;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m451() {
        boolean z;
        Application m738 = C0195.m731().m738();
        if (m738 == null) {
            return false;
        }
        try {
            if (m449()) {
                m442((char) 5284, 9, 0).intern();
                C0044.m108();
                z = true;
            } else {
                z = false;
            }
            if (m439(m738)) {
                m442((char) 0, 3, 9).intern();
                C0044.m108();
                z = true;
            }
            if (m444(m738)) {
                int i = f343 + 29;
                f341 = i % 128;
                if (i % 2 == 0) {
                    m442((char) 0, 10, 113).intern();
                } else {
                    m442((char) 0, 10, 12).intern();
                }
                C0044.m108();
                z = true;
            }
            if (m446()) {
                m442((char) 0, 12, 22).intern();
                C0044.m108();
                z = true;
            }
            if (m450()) {
                int i2 = f343 + 85;
                f341 = i2 % 128;
                int i3 = i2 % 2;
                m442((char) 0, 11, 34).intern();
                C0044.m108();
                z = true;
            }
            if (m438()) {
                m442((char) 46624, 6, 45).intern();
                C0044.m108();
                z = true;
            }
            if (m443()) {
                m442((char) 0, 7, 51).intern();
                C0044.m108();
                z = true;
            }
            if (!TextUtils.isEmpty(m447(new String(f334)))) {
                int i4 = f341 + 63;
                f343 = i4 % 128;
                int i5 = i4 % 2;
                m442((char) 0, 8, 58).intern();
                C0044.m108();
                z = true;
            }
            if (!TextUtils.isEmpty(m447(new String(f350)))) {
                m442((char) 0, 13, 66).intern();
                C0044.m108();
                z = true;
            }
            if (m445(m738, new String(f353))) {
                m442((char) 0, 9, 79).intern();
                C0044.m108();
                z = true;
            }
            if (!(!m448())) {
                m442((char) 0, 9, 88).intern();
                C0044.m108();
                z = true;
            }
            if (m441()) {
                int i6 = f343 + 101;
                f341 = i6 % 128;
                int i7 = i6 % 2;
                m442((char) 4373, 11, 97).intern();
                C0044.m108();
                z = true;
            }
            C0057.m177().m180(new RunnableC0065(), new Random().nextInt(50) + 10, TimeUnit.SECONDS);
            return z;
        } catch (Exception e) {
            C0076.m232().m236(e);
            m442((char) 55282, 11, 108).intern();
            C0044.m107();
            return true;
        }
    }
}
