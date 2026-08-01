package com.bykv.vk.openvk.component.video.pvs.NB;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: VideoFilesUtils.java */
/* loaded from: classes.dex */
public class icD {
    public static long pvs(String str, String str2) {
        File vG = vG(str, str2);
        if (vG.exists()) {
            return vG.length();
        }
        File icD = icD(str, str2);
        if (icD.exists()) {
            return icD.length();
        }
        return 0L;
    }

    public static File icD(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    public static File vG(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void pvs(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek(i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable unused) {
        }
    }
}
