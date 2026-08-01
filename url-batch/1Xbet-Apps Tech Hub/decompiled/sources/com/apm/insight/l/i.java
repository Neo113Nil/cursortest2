package com.apm.insight.l;

import android.text.TextUtils;
import androidx.room.FtsOptions;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.google.android.gms.common.internal.ImagesContract;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r18 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0115, code lost:
    
        if (r18 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0118, code lost:
    
        r3 = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0119, code lost:
    
        r0 = null;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        if (r18 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d0, code lost:
    
        r3 = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        r2 = r2.append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        if (r18 != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.apm.insight.entity.a a(File file, boolean z) {
        String str;
        String str2;
        String str3;
        StringBuilder append;
        String str4;
        String str5;
        StringBuilder append2;
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        str = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
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
                for (String str6 : split) {
                    if (!z2 && str6.startsWith("stack:")) {
                        z2 = true;
                    } else if (z3 || !str6.startsWith("err:")) {
                        if (z3) {
                            append2 = sb2.append(str6);
                        } else if (z2) {
                            append2 = sb.append(str6);
                        } else {
                            arrayList.add(str6);
                        }
                        append2.append("\n");
                    } else {
                        z3 = true;
                    }
                }
                String str7 = arrayList.size() >= 1 ? (String) arrayList.get(0) : null;
                String str8 = arrayList.size() >= 2 ? (String) arrayList.get(1) : null;
                String str9 = arrayList.size() >= 3 ? (String) arrayList.get(2) : null;
                String str10 = arrayList.size() >= 4 ? (String) arrayList.get(3) : null;
                if (z2 && sb.length() > 0) {
                    str3 = sb.toString();
                } else if (str9 != null) {
                    append = new StringBuilder().append(str9).append("\nCaused by: ");
                } else if (str8 != null) {
                    append = new StringBuilder().append(str8).append("\nCaused by: ");
                } else {
                    str3 = z ? "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n" : "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
                }
                if (z3 && sb2.length() > 0) {
                    str3 = str3 + "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth error when dumpping the stack:\n" + ((Object) sb2);
                }
                str = str3;
                str4 = str7;
                str5 = str10;
            }
        }
        aVar.a("data", (Object) str);
        aVar.a("process_name", (Object) str4);
        aVar.a("crash_thread_name", (Object) str5);
        aVar.a("isOOM", Boolean.valueOf(z));
        return aVar;
    }

    public static com.apm.insight.entity.e a(File file, CrashType crashType) {
        com.apm.insight.entity.a d = d(file);
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject = d.h().optJSONObject("header");
        if (optJSONObject.optString("unique_key", null) == null) {
            try {
                optJSONObject.put("unique_key", "android_" + com.apm.insight.i.c().a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        com.apm.insight.entity.e eVar = new com.apm.insight.entity.e();
        eVar.a(crashType == CrashType.LAUNCH ? com.apm.insight.k.e.e() : com.apm.insight.k.e.c());
        eVar.a(d.h());
        eVar.a(com.apm.insight.k.e.a());
        return eVar;
    }

    public static String a(File file, String str) {
        return a(file, str, -1L);
    }

    public static String a(File file, String str, long j) {
        StringBuilder sb = new StringBuilder();
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
                    k.a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    k.a(bufferedReader2);
                    return sb.toString();
                }
                if (sb.length() != 0 && str != null) {
                    sb.append(str);
                }
                sb.append(readLine);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ImagesContract.URL, str2);
            jSONObject2.put("body", jSONObject);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("dump_file", str3);
            jSONObject2.put("encrypt", z);
            a(file2, jSONObject2, false);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return a(file, str, str2, jSONObject, null, z);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), str2);
    }

    public static JSONArray a(File file, long j) {
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
                    k.a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    k.a(bufferedReader2);
                    return jSONArray;
                }
                jSONArray.put(readLine);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(File file, File file2) {
        FileOutputStream fileOutputStream;
        if (file == null || file2 == null) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
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
                    k.a(fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        k.a(fileInputStream);
                        k.a(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        k.a(fileInputStream);
                        k.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    k.a(fileInputStream);
                    k.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        k.a(fileOutputStream);
    }

    public static void a(File file, String str, boolean z) {
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
                k.a(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                k.a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

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
            properties.store(fileOutputStream, "no");
            k.a(fileOutputStream);
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            q.b((Throwable) e);
            k.a(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            k.a(fileOutputStream2);
            throw th;
        }
    }

    public static void a(File file, JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                m.a(jSONArray, bufferedWriter2);
                k.a(bufferedWriter2);
            } catch (Throwable unused) {
                bufferedWriter = bufferedWriter2;
                k.a(bufferedWriter);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void a(File file, JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                m.a(jSONObject, bufferedWriter2);
                k.a(bufferedWriter2);
            } catch (Throwable unused) {
                bufferedWriter = bufferedWriter2;
                k.a(bufferedWriter);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void a(OutputStream outputStream, File... fileArr) {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (File file : fileArr) {
                    a(zipOutputStream2, file);
                }
                k.a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                k.a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(String str, File file) {
        ZipOutputStream zipOutputStream = null;
        try {
            new File(str).getParentFile().mkdirs();
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                a(zipOutputStream2, file, "");
                k.a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                k.a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file) {
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

    private static void a(ZipOutputStream zipOutputStream, File file, String str) {
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
                    if (-1 == read) {
                        k.a(fileInputStream2);
                        return;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                k.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(File file) {
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
            if (!listFiles[i].isFile()) {
                a = a(listFiles[i]);
            } else if (listFiles[i].canWrite()) {
                a = listFiles[i].delete();
            } else {
                z = false;
            }
            z &= a;
        }
        return z & file.delete();
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a(new File(str));
    }

    public static boolean a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static JSONArray b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), -1L);
    }

    public static JSONArray b(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (str != null && str2 != null) {
            for (String str3 : str.split(str2)) {
                jSONArray.put(str3);
            }
        }
        return jSONArray;
    }

    public static void b(File file, JSONObject jSONObject, boolean z) {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            m.a(jSONObject, bufferedWriter);
            k.a(bufferedWriter);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            try {
                try {
                    jSONObject.put("err_write", th.toString());
                    com.apm.insight.entity.a.a(jSONObject, "filters", "err_write", th.getLocalizedMessage());
                } finally {
                    k.a(bufferedWriter2);
                }
            } catch (JSONException unused) {
            }
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }

    public static boolean b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    public static String c(File file) {
        return a(file, "\n");
    }

    public static String c(String str) {
        return a(str, "\n");
    }

    public static void c(String str, String str2) {
        a(str2, new File(str));
    }

    public static com.apm.insight.entity.a d(File file) {
        com.apm.insight.entity.a a = a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z = false;
        for (int i = 0; i < com.apm.insight.g.d.a(); i++) {
            File a2 = o.a(file, "." + i);
            if (a2.exists()) {
                try {
                    a.c(new JSONObject(c(a2.getAbsolutePath())));
                    z = true;
                } catch (Throwable unused) {
                }
            }
        }
        a.a("crash_type", z ? "step" : FtsOptions.TOKENIZER_SIMPLE);
        JSONObject optJSONObject = a.h().optJSONObject("header");
        JSONObject f = Header.a(com.apm.insight.i.g(), a.h().optLong("crash_time", 0L)).f();
        if (optJSONObject == null) {
            a.a(f);
        } else {
            l.a(optJSONObject, f);
        }
        return a;
    }

    public static com.apm.insight.entity.e d(String str) {
        try {
            String c = c(str);
            if (c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c);
            com.apm.insight.entity.e eVar = new com.apm.insight.entity.e();
            eVar.a(jSONObject.optString(ImagesContract.URL));
            eVar.a(jSONObject.optJSONObject("body"));
            eVar.b(jSONObject.optString("dump_file"));
            eVar.a(jSONObject.optBoolean("encrypt", false));
            return eVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.apm.insight.entity.e e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(c(str));
            com.apm.insight.entity.e eVar = new com.apm.insight.entity.e();
            eVar.d(jSONObject.optString("aid"));
            eVar.c(jSONObject.optString("did"));
            eVar.e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("alogFiles");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
                eVar.a(arrayList);
            }
            return eVar;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:20:0x0041 */
    public static Map<String, String> e(File file) {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                Properties properties = new Properties();
                fileInputStream = new FileInputStream(file);
                try {
                    properties.load(fileInputStream);
                    Set<String> stringPropertyNames = properties.stringPropertyNames();
                    HashMap hashMap = new HashMap();
                    for (String str : stringPropertyNames) {
                        hashMap.put(str, properties.getProperty(str));
                    }
                    k.a(fileInputStream);
                    return hashMap;
                } catch (IOException e) {
                    e = e;
                    q.b((Throwable) e);
                    k.a(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                k.a(closeable2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            k.a(closeable2);
            throw th;
        }
    }

    public static void f(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.c(file2.getAbsolutePath());
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }

    public static boolean g(File file) {
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
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        if (c <= 0) {
            return c < 0;
        }
        NativeImpl.a(c);
        return false;
    }
}
