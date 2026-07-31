package com.apm.insight.l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.ironsource.C4913ua;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FileUtils.java */
/* loaded from: classes4.dex */
public final class f {
    private final int a;
    private String b;
    private JSONObject c;
    private byte[] d;

    public static void a(@NonNull File file, @NonNull String str, boolean z) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                com.apm.insight.a.a((Closeable) fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                com.apm.insight.a.a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(@NonNull File file, @NonNull JSONObject jSONObject) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable unused) {
            bufferedWriter = null;
        }
        try {
            h.a(jSONObject, bufferedWriter);
            com.apm.insight.a.a((Closeable) bufferedWriter);
        } catch (Throwable unused2) {
            com.apm.insight.a.a((Closeable) bufferedWriter);
        }
    }

    public static void a(@NonNull File file, @NonNull JSONArray jSONArray) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable unused) {
            bufferedWriter = null;
        }
        try {
            h.a(jSONArray, bufferedWriter);
            com.apm.insight.a.a((Closeable) bufferedWriter);
        } catch (Throwable unused2) {
            com.apm.insight.a.a((Closeable) bufferedWriter);
        }
    }

    public static boolean a(@NonNull File file) {
        boolean a;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        for (int i = 0; listFiles != null && i < listFiles.length; i++) {
            if (listFiles[i].isFile()) {
                if (listFiles[i].canWrite()) {
                    a = listFiles[i].delete();
                } else {
                    z = false;
                }
            } else {
                a = a(listFiles[i]);
            }
            z &= a;
        }
        return z & file.delete();
    }

    public static String a(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(new File(str), str2);
    }

    public static String a(File file, String str) throws IOException {
        return b(file, str);
    }

    private static String b(File file, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        if (sb.length() != 0 && str != null) {
                            sb.append(str);
                        }
                        sb.append(readLine);
                    } else {
                        com.apm.insight.a.a((Closeable) bufferedReader2);
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static JSONArray a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), -1L);
    }

    public static JSONArray a(@NonNull File file, long j) throws IOException {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    jSONArray.put(readLine);
                } else {
                    com.apm.insight.a.a((Closeable) bufferedReader2);
                    return jSONArray;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    private static com.apm.insight.entity.a f(File file) {
        com.apm.insight.entity.a a = a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z = false;
        for (int i = 0; i < 6; i++) {
            File a2 = j.a(file, ".".concat(String.valueOf(i)));
            if (a2.exists()) {
                try {
                    a.c(new JSONObject(a(a2.getAbsolutePath(), "\n")));
                    z = true;
                } catch (Throwable unused) {
                }
            }
        }
        a.a("crash_type", z ? "step" : "simple");
        JSONObject optJSONObject = a.c().optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER);
        com.apm.insight.e.g();
        JSONObject f = Header.a(a.c().optLong("crash_time", 0L)).f();
        if (optJSONObject == null) {
            a.a(f);
        } else {
            com.apm.insight.a.a(optJSONObject, f);
        }
        return a;
    }

    public static com.apm.insight.f.b a(File file, CrashType crashType) {
        String c;
        com.apm.insight.entity.a f = f(file);
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject = f.c().optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER);
        if (optJSONObject.optString("unique_key", null) == null) {
            try {
                optJSONObject.put("unique_key", "android_" + com.apm.insight.e.c().a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        com.apm.insight.f.b bVar = new com.apm.insight.f.b();
        if (crashType == CrashType.LAUNCH) {
            c = com.apm.insight.k.e.e();
        } else {
            c = com.apm.insight.k.e.c();
        }
        bVar.a(c);
        bVar.a(f.c());
        bVar.a(com.apm.insight.k.e.a());
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r18 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0116, code lost:
    
        if (r18 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        r0 = null;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r3 = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.apm.insight.entity.a a(File file, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        str = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
        if (file.exists()) {
            try {
                str2 = a(file.getAbsolutePath(), "\n");
            } catch (IOException unused) {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split("\n");
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                boolean z2 = false;
                boolean z3 = false;
                for (String str5 : split) {
                    if (!z2 && str5.startsWith("stack:")) {
                        z2 = true;
                    } else if (!z3 && str5.startsWith("err:")) {
                        z3 = true;
                    } else if (z3) {
                        sb2.append(str5);
                        sb2.append("\n");
                    } else if (z2) {
                        sb.append(str5);
                        sb.append("\n");
                    } else {
                        arrayList.add(str5);
                    }
                }
                String str6 = arrayList.size() > 0 ? (String) arrayList.get(0) : null;
                String str7 = arrayList.size() >= 2 ? (String) arrayList.get(1) : null;
                String str8 = arrayList.size() >= 3 ? (String) arrayList.get(2) : null;
                String str9 = arrayList.size() >= 4 ? (String) arrayList.get(3) : null;
                if (z2 && sb.length() > 0) {
                    str = sb.toString();
                } else if (str8 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str8);
                    sb3.append("\nCaused by: ");
                    sb3.append(z ? "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n" : "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n");
                    str = sb3.toString();
                } else if (str7 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str7);
                    sb4.append("\nCaused by: ");
                    sb4.append(z ? "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n" : "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n");
                    str = sb4.toString();
                } else if (z) {
                    str = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
                }
                if (z3 && sb2.length() > 0) {
                    str = str + "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth error when dumpping the stack:\n" + ((Object) sb2);
                }
                str3 = str6;
                str4 = str9;
            }
        }
        aVar.a("data", (Object) str);
        aVar.a("process_name", (Object) str3);
        aVar.a("crash_thread_name", (Object) str4);
        aVar.a("isOOM", Boolean.valueOf(z));
        return aVar;
    }

    @Nullable
    public static Map<String, String> c(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    properties.load(fileInputStream);
                    Set<String> stringPropertyNames = properties.stringPropertyNames();
                    HashMap hashMap = new HashMap();
                    for (String str : stringPropertyNames) {
                        hashMap.put(str, properties.getProperty(str));
                    }
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    return hashMap;
                } catch (IOException e) {
                    e = e;
                    com.apm.insight.a.b((Throwable) e);
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                com.apm.insight.a.a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.apm.insight.a.a((Closeable) fileInputStream2);
            throw th;
        }
    }

    @Nullable
    public static void a(File file, Map<String, String> map) {
        Properties properties;
        FileOutputStream fileOutputStream;
        if (map == null || map.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                properties = new Properties();
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                properties.setProperty(entry.getKey(), entry.getValue());
            }
            properties.store(fileOutputStream, SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO);
            com.apm.insight.a.a((Closeable) fileOutputStream);
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            com.apm.insight.a.b((Throwable) e);
            com.apm.insight.a.a((Closeable) fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            com.apm.insight.a.a((Closeable) fileOutputStream2);
            throw th;
        }
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return b(file, str, str2, jSONObject, z);
    }

    private static String b(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", z);
            a(file2, jSONObject2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    public static void a(File file, File file2) {
        FileOutputStream fileOutputStream;
        if (file2 == null) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                com.apm.insight.a.a((Closeable) fileInputStream2);
            } catch (Exception e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    e.printStackTrace();
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                com.apm.insight.a.a((Closeable) fileInputStream);
                com.apm.insight.a.a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        com.apm.insight.a.a((Closeable) fileOutputStream);
    }

    public static void b(String str, String str2) throws Exception {
        ZipOutputStream zipOutputStream;
        Throwable th;
        File file = new File(str);
        try {
            new File(str2).getParentFile().mkdirs();
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
            try {
                a(zipOutputStream, file, "");
                com.apm.insight.a.a((Closeable) zipOutputStream);
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.a.a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            zipOutputStream = null;
            th = th3;
        }
    }

    public static void a(OutputStream outputStream, File... fileArr) throws IOException {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            zipOutputStream = new ZipOutputStream(outputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            zipOutputStream.putNextEntry(new ZipEntry("/"));
            for (File file : fileArr) {
                a(zipOutputStream, file);
            }
            com.apm.insight.a.a((Closeable) zipOutputStream);
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            com.apm.insight.a.a((Closeable) zipOutputStream2);
            throw th;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file) throws IOException {
        if (file == null || !file.exists()) {
            return;
        }
        File[] listFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            a(zipOutputStream, file2, file2.getName());
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) throws IOException {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            String str2 = str.length() == 0 ? "" : str + "/";
            for (int i = 0; i < listFiles.length; i++) {
                a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (-1 != read) {
                        zipOutputStream.write(bArr, 0, read);
                    } else {
                        com.apm.insight.a.a((Closeable) fileInputStream2);
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                com.apm.insight.a.a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void d(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.c(file2.getAbsolutePath());
        } catch (Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        }
    }

    public static boolean e(File file) {
        int c;
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            c = NativeImpl.c(file.getAbsolutePath());
        } catch (Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        }
        if (c <= 0) {
            return c < 0;
        }
        NativeImpl.a(c);
        return false;
    }

    public static com.apm.insight.f.b b(String str) {
        try {
            String a = a(str, "\n");
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            com.apm.insight.f.b bVar = new com.apm.insight.f.b();
            bVar.a(jSONObject.optString("url"));
            bVar.a(jSONObject.optJSONObject("body"));
            bVar.b(jSONObject.optString("dump_file"));
            bVar.a(jSONObject.optBoolean("encrypt", false));
            return bVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.apm.insight.f.b c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(a(str, "\n"));
            com.apm.insight.f.b bVar = new com.apm.insight.f.b();
            bVar.d(jSONObject.optString(C4913ua.b));
            bVar.c(jSONObject.optString("did"));
            bVar.e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("alogFiles");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
                bVar.a(arrayList);
            }
            return bVar;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public f(int i) {
        this.a = i;
    }

    public f(byte[] bArr) {
        this.a = 204;
        this.d = bArr;
    }

    public f(int i, Throwable th) {
        this.a = i;
        this.b = th.getMessage();
    }

    public f(String str) {
        this.a = 206;
        this.b = str;
    }

    public f(JSONObject jSONObject) {
        this.a = 0;
        this.c = jSONObject;
    }

    public final boolean a() {
        return this.a != 207;
    }

    @Nullable
    public final byte[] b() {
        return this.d;
    }
}
