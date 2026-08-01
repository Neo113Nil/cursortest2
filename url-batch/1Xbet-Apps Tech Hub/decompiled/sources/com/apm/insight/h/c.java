package com.apm.insight.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.apm.insight.l.i;
import com.apm.insight.l.k;
import dalvik.system.BaseDexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class c {
    private static List<String> a = new ArrayList();

    public static String a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String a2 = a(applicationInfo.sourceDir, str, file);
        if (a2 == null) {
            return null;
        }
        for (String str2 : applicationInfo.splitSourceDirs) {
            a2 = a(str2, str, file);
            if (a2 == null) {
                return null;
            }
        }
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return a2;
            }
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            for (String str3 : (String[]) declaredField2.get(obj)) {
                File file2 = new File(str3, System.mapLibraryName(str));
                if (file2.exists()) {
                    i.a(file2, file);
                    k.a(file.getAbsolutePath(), 493);
                    return null;
                }
            }
            return "not_found";
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static String a(String str, String str2, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        ZipEntry entry;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str2));
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            zipFile = null;
        }
        if (entry == null) {
            int indexOf = Build.CPU_ABI.indexOf(45);
            StringBuilder sb = new StringBuilder("lib/");
            String str3 = Build.CPU_ABI;
            if (indexOf <= 0) {
                indexOf = Build.CPU_ABI.length();
            }
            String sb2 = sb.append(str3.substring(0, indexOf)).append("/").append(System.mapLibraryName(str2)).toString();
            ZipEntry entry2 = zipFile.getEntry(sb2);
            if (entry2 == null) {
                message = "Library entry not found:" + sb2;
                k.a((Closeable) null);
                k.a((Closeable) null);
                k.a(zipFile);
                return message;
            }
            entry = entry2;
        }
        file.createNewFile();
        InputStream inputStream2 = zipFile.getInputStream(entry);
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th3) {
            inputStream = inputStream2;
            th = th3;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read <= 0) {
                    k.a(file.getAbsolutePath(), 493);
                    k.a(fileOutputStream);
                    k.a(inputStream2);
                    k.a(zipFile);
                    return null;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th4) {
            fileOutputStream2 = fileOutputStream;
            inputStream = inputStream2;
            th = th4;
            try {
                message = th.getMessage();
                k.a(fileOutputStream2);
                k.a(inputStream);
                k.a(zipFile);
                return message;
            } catch (Throwable th5) {
                k.a(fileOutputStream2);
                k.a(inputStream);
                k.a(zipFile);
                throw th5;
            }
        }
    }
}
