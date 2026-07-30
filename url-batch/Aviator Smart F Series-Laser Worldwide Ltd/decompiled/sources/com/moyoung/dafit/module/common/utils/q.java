package com.moyoung.dafit.module.common.utils;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public class q {
    private q() {
    }

    @Nullable
    private static File checkFileMd5(String str, File file) {
        if (x.checkFileMd5(str, file)) {
            return file;
        }
        return null;
    }

    public static void copyFile(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            fileOutputStream.flush();
                            System.out.println("File copied successfully.");
                            fileOutputStream.close();
                            fileInputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            System.err.println("Error copying file: " + e8.getMessage());
        }
    }

    public static void deleteAllFiles(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                deleteAllFiles(file2);
                deleteFile(file2);
            } else {
                deleteFile(file2);
            }
        }
    }

    private static void deleteFile(File file) {
        try {
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static boolean exists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    public static long getFileSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.length();
        }
        return -1L;
    }

    public static File isExistFile(File file, String str) {
        if (file != null && !TextUtils.isEmpty(str)) {
            if (file.isFile()) {
                return checkFileMd5(str, file);
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            for (File file2 : listFiles) {
                if (!file2.isDirectory()) {
                    return checkFileMd5(str, file2);
                }
                isExistFile(file2, str);
            }
        }
        return null;
    }
}
