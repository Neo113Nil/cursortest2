package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: UnZipUtils.java */
/* loaded from: classes.dex */
public final class k {
    private static byte[] a = {80, 75, 3, 4};
    private static byte[] b = {80, 75, 5, 6};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: all -> 0x010c, TryCatch #2 {all -> 0x010c, blocks: (B:6:0x0011, B:8:0x0017, B:10:0x0024, B:12:0x002c, B:17:0x003a, B:19:0x0053, B:21:0x0059, B:23:0x0068, B:27:0x006c, B:28:0x008a, B:30:0x008b, B:32:0x009a, B:37:0x00ae, B:42:0x00b6, B:43:0x00b9, B:47:0x00ba, B:48:0x00c9, B:50:0x00ca, B:51:0x00d9, B:56:0x00df, B:58:0x00e8, B:59:0x00f7, B:60:0x00f8, B:61:0x0107), top: B:5:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(InputStream inputStream, String str, String str2) throws Exception {
        boolean z;
        ZipInputStream zipInputStream = null;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            ZipInputStream zipInputStream2 = new ZipInputStream(inputStream);
            boolean z2 = false;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry == null) {
                        if (!z2) {
                            inputStream.reset();
                            if (!a(inputStream)) {
                                throw new RuntimeException("not zip file  channel:".concat(String.valueOf(str2)));
                            }
                            throw new RuntimeException("unzip file: channel:".concat(String.valueOf(str2)));
                        }
                        CloseableUtils.close(zipInputStream2);
                        return;
                    }
                    String name = nextEntry.getName();
                    if (!name.startsWith("__MACOSX/") && !name.equals(".DS_Store") && !name.contains("../")) {
                        z = false;
                        if (!z) {
                            if (!name.startsWith(str2 + File.separator)) {
                                throw new RuntimeException("the zip package outermost folder is not named by channel channel:".concat(String.valueOf(str2)));
                            }
                            if (nextEntry.isDirectory()) {
                                File file = new File(canonicalPath, name);
                                if (!file.getCanonicalPath().startsWith(canonicalPath)) {
                                    throw new RuntimeException("directory traversal, dir:" + name + ", channel:" + str2);
                                }
                                file.mkdirs();
                            } else {
                                String canonicalPath2 = new File(canonicalPath, name).getCanonicalPath();
                                if (!canonicalPath2.startsWith(canonicalPath)) {
                                    throw new RuntimeException("directory traversal, file name:".concat(String.valueOf(name)));
                                }
                                File file2 = new File(canonicalPath2);
                                file2.getParentFile().mkdirs();
                                try {
                                    ?? fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        c.a(zipInputStream2, fileOutputStream);
                                        CloseableUtils.close((Closeable) fileOutputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        zipInputStream = fileOutputStream;
                                        CloseableUtils.close(zipInputStream);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                        z2 = true;
                    }
                    z = true;
                    if (!z) {
                    }
                    z2 = true;
                } catch (Throwable th3) {
                    th = th3;
                    zipInputStream = zipInputStream2;
                    CloseableUtils.close(zipInputStream);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (java.util.Arrays.equals(com.bykv.vk.openvk.preload.geckox.utils.k.b, r1) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(InputStream inputStream) throws Exception {
        try {
            byte[] bArr = new byte[4];
            boolean z = false;
            if (inputStream.read(bArr, 0, 4) != 4) {
                return false;
            }
            if (!Arrays.equals(a, bArr)) {
            }
            z = true;
            return z;
        } finally {
            CloseableUtils.close(inputStream);
        }
    }
}
