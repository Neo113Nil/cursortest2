package com.baidu.platform.comapi.walknavi.g.i.h.e;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public final class a {
    public static void a(File file) {
        a(file, true);
    }

    public static boolean b(File file) {
        if (file != null && file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static void c(File file) {
        File parentFile;
        if (file == null || (parentFile = file.getParentFile()) == null || parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }

    public static FileOutputStream d(File file) {
        b(file);
        c(file);
        file.createNewFile();
        return new FileOutputStream(file);
    }

    public static void a(File file, boolean z7) {
        if (file == null || !file.isDirectory()) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, z7);
                } else {
                    file2.delete();
                }
            }
        }
        if (z7) {
            file.delete();
        }
    }
}
