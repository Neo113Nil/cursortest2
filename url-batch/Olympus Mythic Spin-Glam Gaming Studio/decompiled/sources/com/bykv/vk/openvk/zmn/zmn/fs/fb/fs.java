package com.bykv.vk.openvk.zmn.zmn.fs.fb;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public class fs {
    public static long zmn(String str, String str2) {
        File zn = zn(str, str2);
        if (zn.exists()) {
            return zn.length();
        }
        File fs = fs(str, str2);
        if (fs.exists()) {
            return fs.length();
        }
        return 0L;
    }

    public static File fs(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    public static File zn(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void zmn(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek(i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable unused) {
        }
    }
}
