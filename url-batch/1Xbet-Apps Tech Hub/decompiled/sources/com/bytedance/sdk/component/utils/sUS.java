package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* compiled from: FileUtils.java */
/* loaded from: classes.dex */
public class sUS {
    public static File pvs(Context context, boolean z, String str, String str2) {
        String icD = icD(context);
        if (z) {
            str = pvs(context) + "-" + str;
        }
        if (icD != null && !icD.endsWith(File.separator)) {
            icD = icD + File.separator;
        }
        String str3 = icD + str;
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str3, str2);
    }

    public static File pvs(Context context, boolean z, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z) {
            str = pvs(context) + "-" + str;
        }
        if (absolutePath != null && !absolutePath.endsWith(File.separator)) {
            absolutePath = absolutePath + File.separator;
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String icD(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static List<File> pvs(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return linkedList;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new pvs(null));
        return asList;
    }

    public static void icD(File file) throws IOException {
        if (file.exists()) {
            Ju.pvs("splashLoadAd", "update file modify time");
            long currentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(currentTimeMillis)) {
                return;
            }
            NB(file);
            if (file.lastModified() < currentTimeMillis) {
                new StringBuilder("Last modified date ").append(new Date(file.lastModified()));
                file.getAbsolutePath();
            }
        }
    }

    public static void vG(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            try {
                file.delete();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    vG(file2);
                } else {
                    try {
                        file2.delete();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        try {
            file.delete();
        } catch (Throwable unused3) {
        }
    }

    private static void NB(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long j;
        long length = file.length();
        if (length == 0) {
            sUS(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            j = length - 1;
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            randomAccessFile.seek(j);
            byte readByte = randomAccessFile.readByte();
            randomAccessFile.seek(j);
            randomAccessFile.write(readByte);
            randomAccessFile.close();
        } catch (Throwable unused2) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }
    }

    private static void sUS(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    /* compiled from: FileUtils.java */
    private static final class pvs implements Comparator<File> {
        private int pvs(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        private pvs() {
        }

        /* synthetic */ pvs(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return pvs(file.lastModified(), file2.lastModified());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r2 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] Jd(File file) {
        FileInputStream fileInputStream;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                Long valueOf = Long.valueOf(file.length());
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[valueOf.intValue()];
                    if (fileInputStream.read(bArr) == valueOf.longValue()) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return bArr;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                fileInputStream = null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    /* compiled from: FileUtils.java */
    /* renamed from: com.bytedance.sdk.component.utils.sUS$1, reason: invalid class name */
    static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static String pvs(Context context) {
        String pvs2 = zM.pvs(context);
        return (TextUtils.isEmpty(pvs2) || !pvs2.contains(":")) ? pvs2 : pvs2.replace(":", "-");
    }
}
