package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SafelyLibraryLoader.java */
/* loaded from: classes3.dex */
public class K {
    private static List<String> a = new ArrayList();

    /* compiled from: SafelyLibraryLoader.java */
    public static class a {
        public int a;
        public String b;

        public a(int i, String... strArr) {
            this.a = i;
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            this.b = jSONArray.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized a a(Context context, String str) {
        File file;
        ZipFile zipFile;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        a aVar;
        synchronized (K.class) {
            if (a.contains(str)) {
                return null;
            }
            try {
                try {
                    System.loadLibrary(str);
                    a.add(str);
                } catch (UnsatisfiedLinkError e) {
                    String mapLibraryName = System.mapLibraryName(str);
                    if (context == null || context.getFilesDir() == null) {
                        file = null;
                    } else {
                        file = new File(context.getFilesDir(), "libso");
                        if (!file.exists()) {
                            new File(file.getAbsolutePath()).mkdirs();
                        }
                    }
                    File file2 = file != null ? new File(file, mapLibraryName) : null;
                    if (file2 == null) {
                        return new a(3, e.getMessage(), "output null");
                    }
                    if (file2.exists()) {
                        file2.delete();
                    }
                    try {
                        zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
                        try {
                            ZipEntry a2 = a(zipFile, Build.CPU_ABI, str);
                            if (a2 == null) {
                                a2 = a(zipFile, Build.CPU_ABI2, str);
                            }
                            if (a2 != null) {
                                file2.createNewFile();
                                inputStream = zipFile.getInputStream(a2);
                                try {
                                    fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        byte[] bArr = new byte[16384];
                                        while (true) {
                                            int read = inputStream.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                        I.a("android.os.FileUtils", file2.getAbsolutePath(), 493, -1, -1);
                                        aVar = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            aVar = new a(3, th.getMessage());
                                            if (aVar != null) {
                                                return aVar;
                                            }
                                            try {
                                                System.load(file2.getAbsolutePath());
                                                a.add(str);
                                                return null;
                                            } catch (Throwable th2) {
                                                return new a(3, e.getMessage(), th2.getMessage());
                                            }
                                        } finally {
                                            AbstractC1123c.a(fileOutputStream);
                                            AbstractC1123c.a(inputStream);
                                            AbstractC1123c.a(zipFile);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                    aVar = new a(3, th.getMessage());
                                    if (aVar != null) {
                                    }
                                }
                            } else {
                                aVar = new a(2, a(zipFile, str));
                                AbstractC1123c.a((Closeable) null);
                                AbstractC1123c.a((Closeable) null);
                                AbstractC1123c.a(zipFile);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zipFile = null;
                        inputStream = null;
                        fileOutputStream = null;
                    }
                    if (aVar != null) {
                    }
                }
                return null;
            } catch (Throwable th6) {
                return new a(3, th6.getMessage());
            }
        }
    }

    private static String a(ZipFile zipFile, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        List asList = Arrays.asList(Build.SUPPORTED_ABIS);
        ArrayList arrayList2 = new ArrayList();
        if (!TextUtils.isEmpty(Build.CPU_ABI)) {
            arrayList2.add(Build.CPU_ABI);
        }
        if (!TextUtils.isEmpty(Build.CPU_ABI2)) {
            arrayList2.add(Build.CPU_ABI2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportedABIS", asList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private static ZipEntry a(ZipFile zipFile, String str, String str2) {
        ZipEntry entry = zipFile.getEntry("lib/" + str + "/" + System.mapLibraryName(str2));
        if (entry != null) {
            return entry;
        }
        int indexOf = str.indexOf(45);
        StringBuilder sb = new StringBuilder("lib/");
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        return zipFile.getEntry(sb.append(str.substring(0, indexOf)).append("/").append(System.mapLibraryName(str2)).toString());
    }
}
