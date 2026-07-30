package com.crrepa.band.my.device.appmarket.map;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes2.dex */
public class k {
    private static void extractFile(ZipInputStream zipInputStream, String str) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read == -1) {
                        bufferedOutputStream.close();
                        return;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static void unzip(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    String str3 = str2 + File.separator + nextEntry.getName();
                    if (nextEntry.isDirectory()) {
                        new File(str3).mkdir();
                    } else {
                        extractFile(zipInputStream, str3);
                    }
                    zipInputStream.closeEntry();
                }
                zipInputStream.close();
            } finally {
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
