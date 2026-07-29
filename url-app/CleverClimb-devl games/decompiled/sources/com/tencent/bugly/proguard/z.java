package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.common.Constants;
import com.tapjoy.TJAdUnitConstants;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, String> f8813a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f8814b;

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.getBuffer().toString();
        } catch (Throwable th2) {
            if (x.a(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    public static String a() {
        return a(System.currentTimeMillis());
    }

    public static String a(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(j));
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    public static String a(Date date) {
        if (date == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(date);
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    private static byte[] a(byte[] bArr, int i, String str) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        x.c("rqdp{  enD:} %d %d", Integer.valueOf(bArr.length), Integer.valueOf(i));
        try {
            ag a2 = a.a(i);
            if (a2 == null) {
                return null;
            }
            a2.a(str);
            return a2.b(bArr);
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static byte[] b(byte[] bArr, int i, String str) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        try {
            ag a2 = a.a(i);
            if (a2 == null) {
                return null;
            }
            a2.a(str);
            return a2.a(bArr);
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            x.d("encrytype %d %s", Integer.valueOf(i), str);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(3:73|74|(16:78|80|81|4|5|6|7|(1:(2:9|(1:11)(1:12)))(0)|13|(2:14|(1:16)(1:17))|18|(2:28|29)|20|21|22|23))|6|7|(0)(0)|13|(3:14|(0)(0)|16)|18|(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        r6.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[Catch: Throwable -> 0x0090, all -> 0x00bc, LOOP:1: B:14:0x005f->B:16:0x0065, LOOP_END, TryCatch #5 {Throwable -> 0x0090, blocks: (B:7:0x0044, B:9:0x0055, B:11:0x005b, B:14:0x005f, B:16:0x0065, B:18:0x0069), top: B:6:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[EDGE_INSN: B:17:0x0069->B:18:0x0069 BREAK  A[LOOP:1: B:14:0x005f->B:16:0x0065], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #9 {all -> 0x00bc, blocks: (B:7:0x0044, B:9:0x0055, B:11:0x005b, B:14:0x005f, B:16:0x0065, B:18:0x0069, B:35:0x0097, B:37:0x009d), top: B:6:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055 A[Catch: Throwable -> 0x0090, all -> 0x00bc, LOOP:0: B:9:0x0055->B:11:0x005b, LOOP_START, TryCatch #5 {Throwable -> 0x0090, blocks: (B:7:0x0044, B:9:0x0055, B:11:0x005b, B:14:0x005f, B:16:0x0065, B:18:0x0069), top: B:6:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(File file, String str, String str2) {
        FileInputStream fileInputStream;
        ZipOutputStream zipOutputStream;
        String name;
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr;
        int read;
        x.c("rqdp{  ZF start}", new Object[0]);
        try {
            try {
                if (file != null) {
                    try {
                        if (file.exists() && file.canRead()) {
                            fileInputStream = new FileInputStream(file);
                            try {
                                name = file.getName();
                                byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
                                zipOutputStream.setMethod(8);
                                zipOutputStream.putNextEntry(new ZipEntry(name));
                                bArr = new byte[1024];
                                if (fileInputStream != null) {
                                    while (true) {
                                        int read2 = fileInputStream.read(bArr);
                                        if (read2 <= 0) {
                                            break;
                                        }
                                        zipOutputStream.write(bArr, 0, read2);
                                    }
                                }
                                while (true) {
                                    read = byteArrayInputStream.read(bArr);
                                    if (read > 0) {
                                        break;
                                    }
                                    zipOutputStream.write(bArr, 0, read);
                                }
                                zipOutputStream.closeEntry();
                                zipOutputStream.flush();
                                zipOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                zipOutputStream.close();
                                x.c("rqdp{  ZF end}", new Object[0]);
                                return byteArray;
                            } catch (Throwable th) {
                                th = th;
                                zipOutputStream = null;
                                if (!x.a(th)) {
                                }
                                if (fileInputStream != null) {
                                }
                                if (zipOutputStream != null) {
                                }
                                x.c("rqdp{  ZF end}", new Object[0]);
                                return null;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = null;
                        zipOutputStream = null;
                        if (!x.a(th)) {
                        }
                        if (fileInputStream != null) {
                        }
                        if (zipOutputStream != null) {
                        }
                        x.c("rqdp{  ZF end}", new Object[0]);
                        return null;
                    }
                }
                zipOutputStream.setMethod(8);
                zipOutputStream.putNextEntry(new ZipEntry(name));
                bArr = new byte[1024];
                if (fileInputStream != null) {
                }
                while (true) {
                    read = byteArrayInputStream.read(bArr);
                    if (read > 0) {
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.flush();
                zipOutputStream.finish();
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                if (fileInputStream != null) {
                }
                zipOutputStream.close();
                x.c("rqdp{  ZF end}", new Object[0]);
                return byteArray2;
            } catch (Throwable th3) {
                th = th3;
                if (!x.a(th)) {
                    th.printStackTrace();
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                x.c("rqdp{  ZF end}", new Object[0]);
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            if (zipOutputStream != null) {
                try {
                    zipOutputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            x.c("rqdp{  ZF end}", new Object[0]);
            throw th;
        }
        name = str2;
        fileInputStream = null;
        byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        zipOutputStream = new ZipOutputStream(byteArrayOutputStream2);
    }

    public static byte[] a(byte[] bArr, int i) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(bArr.length);
        objArr[1] = i == 2 ? "Gzip" : "zip";
        x.c("[Util] Zip %d bytes data with type %s", objArr);
        try {
            ab a2 = aa.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.a(bArr);
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public static byte[] b(byte[] bArr, int i) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(bArr.length);
        objArr[1] = i == 2 ? "Gzip" : "zip";
        x.c("[Util] Unzip %d bytes data with type %s", objArr);
        try {
            ab a2 = aa.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.b(bArr);
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public static byte[] a(byte[] bArr, int i, int i2, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return a(a(bArr, 2), 1, str);
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public static byte[] b(byte[] bArr, int i, int i2, String str) {
        try {
            return b(b(bArr, 1, str), 2);
        } catch (Exception e) {
            if (x.a(e)) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    public static long b() {
        try {
            return (((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 86400000) * 86400000) - TimeZone.getDefault().getRawOffset();
        } catch (Throwable th) {
            if (x.a(th)) {
                return -1L;
            }
            th.printStackTrace();
            return -1L;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toUpperCase();
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "NULL";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return a(messageDigest.digest());
        } catch (Throwable th) {
            if (x.a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(File file, File file2, int i) {
        FileInputStream fileInputStream;
        ZipOutputStream zipOutputStream;
        x.c("rqdp{  ZF start}", new Object[0]);
        if (file == null || file2 == null || file.equals(file2)) {
            x.d("rqdp{  err ZF 1R!}", new Object[0]);
            return false;
        }
        if (!file.exists() || !file.canRead()) {
            x.d("rqdp{  !sFile.exists() || !sFile.canRead(),pls check ,return!}", new Object[0]);
            return false;
        }
        try {
            if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
        }
        if (!file2.exists() || !file2.canRead()) {
            return false;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                try {
                    zipOutputStream.setMethod(8);
                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                    byte[] bArr = new byte[5000];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, read);
                    }
                    zipOutputStream.flush();
                    zipOutputStream.closeEntry();
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        zipOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    x.c("rqdp{  ZF end}", new Object[0]);
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    try {
                        if (!x.a(th)) {
                            th.printStackTrace();
                        }
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        x.c("rqdp{  ZF end}", new Object[0]);
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        x.c("rqdp{  ZF end}", new Object[0]);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                zipOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            zipOutputStream = null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0095: MOVE (r4 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:69:0x0095 */
    public static ArrayList<String> a(Context context, String[] strArr) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3;
        ArrayList<String> arrayList = new ArrayList<>();
        if (com.tencent.bugly.crashreport.common.info.a.a(context).H()) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add(new String("unknown(low memory)"));
            return arrayList2;
        }
        BufferedReader bufferedReader4 = null;
        try {
            try {
                Process exec = Runtime.getRuntime().exec(strArr);
                bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (bufferedReader4 != null) {
                            try {
                                bufferedReader4.close();
                                throw th;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getErrorStream()));
                while (true) {
                    try {
                        String readLine2 = bufferedReader2.readLine();
                        if (readLine2 != null) {
                            arrayList.add(readLine2);
                        } else {
                            try {
                                break;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!x.a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        return null;
                    }
                }
                bufferedReader.close();
                try {
                    bufferedReader2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader4 = bufferedReader3;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            bufferedReader2 = null;
        }
    }

    public static String a(Context context, String str) {
        if (str == null || str.trim().equals("")) {
            return "";
        }
        if (f8813a == null) {
            f8813a = new HashMap();
            ArrayList<String> a2 = a(context, new String[]{"/system/bin/sh", "-c", "getprop"});
            if (a2 != null && a2.size() > 0) {
                x.b(z.class, "Successfully get 'getprop' list.", new Object[0]);
                Pattern compile = Pattern.compile("\\[(.+)\\]: \\[(.*)\\]");
                Iterator<String> it = a2.iterator();
                while (it.hasNext()) {
                    Matcher matcher = compile.matcher(it.next());
                    if (matcher.find()) {
                        f8813a.put(matcher.group(1), matcher.group(2));
                    }
                }
                x.b(z.class, "System properties number: %dffffdsfsdfff.", Integer.valueOf(f8813a.size()));
            }
        }
        return f8813a.containsKey(str) ? f8813a.get(str) : "fail";
    }

    public static void b(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() <= 0;
    }

    public static void b(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.isFile() && file.exists() && file.canWrite()) {
            file.delete();
        }
    }

    public static byte[] c(long j) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            return sb.toString().getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long c(byte[] bArr) {
        if (bArr == null) {
            return -1L;
        }
        try {
            return Long.parseLong(new String(bArr, AudienceNetworkActivity.WEBVIEW_ENCODING));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static Context a(Context context) {
        Context applicationContext;
        return (context == null || (applicationContext = context.getApplicationContext()) == null) ? context : applicationContext;
    }

    public static String b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static void a(Class<?> cls, String str, Object obj, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(null, obj);
        } catch (Exception unused) {
        }
    }

    public static Object a(String str, String str2, Object obj, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Parcel parcel, Map<String, PlugInBean> map) {
        if (map == null || map.size() <= 0) {
            parcel.writeBundle(null);
            return;
        }
        int size = map.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (Map.Entry<String, PlugInBean> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        Bundle bundle = new Bundle();
        bundle.putInt("pluginNum", arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            bundle.putString("pluginKey" + i, (String) arrayList.get(i));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bundle.putString("pluginVal" + i2 + "plugInId", ((PlugInBean) arrayList2.get(i2)).f8595a);
            bundle.putString("pluginVal" + i2 + "plugInUUID", ((PlugInBean) arrayList2.get(i2)).f8597c);
            bundle.putString("pluginVal" + i2 + "plugInVersion", ((PlugInBean) arrayList2.get(i2)).f8596b);
        }
        parcel.writeBundle(bundle);
    }

    public static Map<String, PlugInBean> a(Parcel parcel) {
        Bundle readBundle = parcel.readBundle();
        HashMap hashMap = null;
        if (readBundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int intValue = ((Integer) readBundle.get("pluginNum")).intValue();
        for (int i = 0; i < intValue; i++) {
            arrayList.add(readBundle.getString("pluginKey" + i));
        }
        for (int i2 = 0; i2 < intValue; i2++) {
            arrayList2.add(new PlugInBean(readBundle.getString("pluginVal" + i2 + "plugInId"), readBundle.getString("pluginVal" + i2 + "plugInVersion"), readBundle.getString("pluginVal" + i2 + "plugInUUID")));
        }
        if (arrayList.size() == arrayList2.size()) {
            hashMap = new HashMap(arrayList.size());
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                hashMap.put(arrayList.get(i3), PlugInBean.class.cast(arrayList2.get(i3)));
            }
        } else {
            x.e("map plugin parcel error!", new Object[0]);
        }
        return hashMap;
    }

    public static void b(Parcel parcel, Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            parcel.writeBundle(null);
            return;
        }
        int size = map.size();
        ArrayList<String> arrayList = new ArrayList<>(size);
        ArrayList<String> arrayList2 = new ArrayList<>(size);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("keys", arrayList);
        bundle.putStringArrayList(TJAdUnitConstants.String.USAGE_TRACKER_VALUES, arrayList2);
        parcel.writeBundle(bundle);
    }

    public static Map<String, String> b(Parcel parcel) {
        Bundle readBundle = parcel.readBundle();
        HashMap hashMap = null;
        if (readBundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = readBundle.getStringArrayList("keys");
        ArrayList<String> stringArrayList2 = readBundle.getStringArrayList(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
        if (stringArrayList != null && stringArrayList2 != null && stringArrayList.size() == stringArrayList2.size()) {
            hashMap = new HashMap(stringArrayList.size());
            for (int i = 0; i < stringArrayList.size(); i++) {
                hashMap.put(stringArrayList.get(i), stringArrayList2.get(i));
            }
        } else {
            x.e("map parcel error!", new Object[0]);
        }
        return hashMap;
    }

    public static byte[] a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static <T> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        try {
            try {
                T createFromParcel = creator.createFromParcel(obtain);
                if (obtain != null) {
                    obtain.recycle();
                }
                return createFromParcel;
            } catch (Throwable th) {
                th.printStackTrace();
                if (obtain == null) {
                    return null;
                }
                obtain.recycle();
                return null;
            }
        } catch (Throwable th2) {
            if (obtain != null) {
                obtain.recycle();
            }
            throw th2;
        }
    }

    public static String a(Context context, int i, String str) {
        String[] strArr;
        Process exec;
        Process process = null;
        if (!AppInfo.a(context, "android.permission.READ_LOGS")) {
            x.d("no read_log permission!", new Object[0]);
            return null;
        }
        if (str == null) {
            strArr = new String[]{"logcat", "-d", "-v", "threadtime"};
        } else {
            strArr = new String[]{"logcat", "-d", "-v", "threadtime", "-s", str};
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                exec = Runtime.getRuntime().exec(strArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
                if (i > 0 && sb.length() > i) {
                    sb.delete(0, sb.length() - i);
                }
            }
            String sb2 = sb.toString();
            if (exec != null) {
                try {
                    exec.getOutputStream().close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    exec.getInputStream().close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                try {
                    exec.getErrorStream().close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            return sb2;
        } catch (Throwable th3) {
            th = th3;
            process = exec;
            if (process != null) {
                try {
                    process.getOutputStream().close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                try {
                    process.getInputStream().close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                try {
                    process.getErrorStream().close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static Map<String, String> a(int i, boolean z) {
        HashMap hashMap = new HashMap(12);
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null) {
            return null;
        }
        Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            int i2 = 0;
            sb.setLength(0);
            if (entry.getValue() != null && entry.getValue().length != 0) {
                StackTraceElement[] value = entry.getValue();
                int length = value.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = value[i2];
                    if (i > 0 && sb.length() >= i) {
                        sb.append("\n[Stack over limit size :" + i + " , has been cutted !]");
                        break;
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                    i2++;
                }
                hashMap.put(entry.getKey().getName() + "(" + entry.getKey().getId() + ")", sb.toString());
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: all -> 0x0059, Exception -> 0x005b, TRY_ENTER, TryCatch #2 {Exception -> 0x005b, blocks: (B:9:0x001c, B:17:0x0035, B:18:0x0038, B:24:0x0055, B:25:0x005d), top: B:4:0x0006, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized byte[] a(int i) {
        DataInputStream dataInputStream;
        synchronized (z.class) {
            DataInputStream dataInputStream2 = null;
            try {
                try {
                    try {
                        try {
                            byte[] bArr = new byte[16];
                            dataInputStream = new DataInputStream(new FileInputStream(new File("/dev/urandom")));
                            try {
                                dataInputStream.readFully(bArr);
                                dataInputStream.close();
                                return bArr;
                            } catch (Exception e) {
                                e = e;
                                x.e("Failed to read from /dev/urandom : %s", e);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                                keyGenerator.init(128, new SecureRandom());
                                return keyGenerator.generateKey().getEncoded();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (0 != 0) {
                                dataInputStream2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    dataInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                    }
                    throw th;
                }
            } catch (Exception e3) {
                if (!x.b(e3)) {
                    e3.printStackTrace();
                }
                return null;
            }
        }
    }

    @TargetApi(19)
    public static byte[] a(int i, byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            if (Build.VERSION.SDK_INT >= 21 && !f8814b) {
                try {
                    cipher.init(i, secretKeySpec, new GCMParameterSpec(cipher.getBlockSize() << 3, bArr2));
                    return cipher.doFinal(bArr);
                } catch (InvalidAlgorithmParameterException e) {
                    f8814b = true;
                    throw e;
                }
            }
            cipher.init(i, secretKeySpec, new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            if (x.b(e2)) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] b(int i, byte[] bArr, byte[] bArr2) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, generatePublic);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            if (x.b(e)) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    public static boolean a(Context context, String str, long j) {
        x.c("[Util] try to lock file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (file.exists()) {
                if (System.currentTimeMillis() - file.lastModified() < j) {
                    return false;
                }
                x.c("[Util] lock file(%s) is expired, unlock it", str);
                b(context, str);
            }
            if (file.createNewFile()) {
                x.c("[Util] successfully locked file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                return true;
            }
            x.c("[Util] Failed to locked file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return false;
        } catch (Throwable th) {
            x.a(th);
            return false;
        }
    }

    public static boolean b(Context context, String str) {
        x.c("[Util] try to unlock file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (!file.exists()) {
                return true;
            }
            if (!file.delete()) {
                return false;
            }
            x.c("[Util] successfully unlocked file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return true;
        } catch (Throwable th) {
            x.a(th);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0057: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:45:0x0057 */
    public static String a(File file) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3 = null;
        if (file != null && file.exists()) {
            try {
                if (file.canRead()) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), AudienceNetworkActivity.WEBVIEW_ENCODING));
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                                sb.append("\n");
                            } catch (Throwable th) {
                                th = th;
                                x.a(th);
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (Exception e) {
                                        x.a(e);
                                    }
                                }
                                return null;
                            }
                        }
                        String sb2 = sb.toString();
                        try {
                            bufferedReader2.close();
                        } catch (Exception e2) {
                            x.a(e2);
                        }
                        return sb2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader3 = bufferedReader;
            }
        }
        return null;
    }

    private static BufferedReader b(File file) {
        if (file == null || !file.exists() || !file.canRead()) {
            return null;
        }
        try {
            return new BufferedReader(new InputStreamReader(new FileInputStream(file), AudienceNetworkActivity.WEBVIEW_ENCODING));
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    public static BufferedReader a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            File file = new File(str, str2);
            if (file.exists() && file.canRead()) {
                return b(file);
            }
            return null;
        } catch (NullPointerException e) {
            x.a(e);
            return null;
        }
    }

    public static Thread a(Runnable runnable, String str) {
        try {
            Thread thread = new Thread(runnable);
            thread.setName(str);
            thread.start();
            return thread;
        } catch (Throwable th) {
            x.e("[Util] Failed to start a thread to execute task with message: %s", th.getMessage());
            return null;
        }
    }

    public static boolean a(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        w a2 = w.a();
        if (a2 != null) {
            return a2.a(runnable);
        }
        String[] split = runnable.getClass().getName().split("\\.");
        return a(runnable, split[split.length - 1]) != null;
    }

    public static boolean c(String str) {
        if (str == null || str.trim().length() <= 0) {
            return false;
        }
        if (str.length() > 255) {
            x.a("URL(%s)'s length is larger than 255.", str);
            return false;
        }
        if (!str.toLowerCase().startsWith(Constants.HTTP)) {
            x.a("URL(%s) is not start with \"http\".", str);
            return false;
        }
        if (str.toLowerCase().contains("qq.com")) {
            return true;
        }
        x.a("URL(%s) does not contain \"qq.com\".", str);
        return false;
    }

    public static SharedPreferences a(String str, Context context) {
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }

    public static String b(String str, String str2) {
        return (com.tencent.bugly.crashreport.common.info.a.b() == null || com.tencent.bugly.crashreport.common.info.a.b().E == null) ? "" : com.tencent.bugly.crashreport.common.info.a.b().E.getString(str, str2);
    }
}
