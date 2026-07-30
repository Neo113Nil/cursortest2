package com.baidu.ar;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class af {
    public static void a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(ZipInputStream zipInputStream, File file) {
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return;
            }
            String name = nextEntry.getName();
            if (name == null || !name.contains("../")) {
                File file2 = new File(file, name);
                j4.f(file2);
                if (nextEntry.isDirectory()) {
                    file2.mkdirs();
                } else {
                    x7.a(zipInputStream, file2);
                }
                zipInputStream.closeEntry();
            }
        }
    }

    public static boolean a(File file, File file2) {
        IOException e8;
        Throwable th;
        ZipInputStream zipInputStream;
        ZipInputStream zipInputStream2 = null;
        try {
            zipInputStream = new ZipInputStream(new CheckedInputStream(new FileInputStream(file), new CRC32()));
        } catch (IOException e9) {
            e8 = e9;
        } catch (Throwable th2) {
            th = th2;
            x7.a((Closeable) zipInputStream2);
            throw th;
        }
        try {
            a(zipInputStream, file2);
            x7.a((Closeable) zipInputStream);
            return true;
        } catch (IOException e10) {
            e8 = e10;
            zipInputStream2 = zipInputStream;
            try {
                e8.printStackTrace();
                x7.a((Closeable) zipInputStream2);
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                x7.a((Closeable) zipInputStream2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            zipInputStream2 = zipInputStream;
            th = th;
            x7.a((Closeable) zipInputStream2);
            throw th;
        }
    }

    public static boolean a(String str) {
        boolean z7;
        try {
            try {
                a(new ZipFile(str));
                z7 = true;
            } catch (IOException e8) {
                e8.printStackTrace();
                a((ZipFile) null);
                z7 = false;
            }
            return z7;
        } catch (Throwable th) {
            a((ZipFile) null);
            throw th;
        }
    }
}
