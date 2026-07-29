package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.proguard.ao;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.zip.Deflater;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: UMSLUtils.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static int f9120a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f9121b = {10, 1, 11, 5, 4, ao.m, 7, 9, 23, 3, 1, 6, 8, 12, ao.k, 91};

    /* renamed from: c, reason: collision with root package name */
    private static Object f9122c = new Object();

    public static boolean a(long j, long j2) {
        return j > j2;
    }

    public static boolean a(Context context, String str, String str2, byte[] bArr) {
        boolean z;
        String str3;
        Object[] objArr;
        if (context == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                synchronized (f9122c) {
                    try {
                        com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] begin write envelope, thread is " + Thread.currentThread());
                        File file = new File(context.getFilesDir() + "/" + a.e);
                        if (!file.isDirectory()) {
                            file.mkdir();
                        }
                        File file2 = new File(file.getPath() + "/" + str);
                        if (!file2.isDirectory()) {
                            file2.mkdir();
                        }
                        File file3 = new File(file2.getPath() + "/" + str2);
                        if (!file3.exists()) {
                            file3.createNewFile();
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        try {
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.close();
                            try {
                                com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] end write envelope, thread id " + Thread.currentThread());
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream2;
                            z = false;
                            while (true) {
                                break;
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                if (0 != 0) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                }
                com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] end write envelope, thread id " + Thread.currentThread());
                throw th5;
            }
        } catch (IOException e) {
            e = e;
            z = false;
        } catch (Throwable th6) {
            th = th6;
            z = false;
        }
        try {
            break;
            throw th;
        } catch (IOException e2) {
            e = e2;
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] write envelope, e is " + e.getMessage());
            com.umeng.commonsdk.proguard.b.a(context, e);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
            }
            str3 = "walle";
            objArr = new Object[]{"[stateless] end write envelope, thread id " + Thread.currentThread()};
            com.umeng.commonsdk.statistics.common.d.a(str3, objArr);
            return z;
        } catch (Throwable th7) {
            th = th7;
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] write envelope, e is " + th.getMessage());
            com.umeng.commonsdk.proguard.b.a(context, th);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
            }
            str3 = "walle";
            objArr = new Object[]{"[stateless] end write envelope, thread id " + Thread.currentThread()};
            com.umeng.commonsdk.statistics.common.d.a(str3, objArr);
            return z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(String str) throws IOException {
        Throwable th;
        FileChannel fileChannel;
        IOException e;
        byte[] bArr;
        synchronized (f9122c) {
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] begin read envelope, thread is " + Thread.currentThread());
            try {
                fileChannel = new RandomAccessFile(str, "r").getChannel();
                try {
                    try {
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannel.size()).load();
                        System.out.println(load.isLoaded());
                        bArr = new byte[(int) fileChannel.size()];
                        if (load.remaining() > 0) {
                            load.get(bArr, 0, load.remaining());
                        }
                        com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] end read envelope, thread id " + Thread.currentThread());
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] write envelope, e is " + e.getMessage());
                        throw e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                fileChannel = null;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = null;
                if (fileChannel != null) {
                }
                throw th;
            }
        }
        return bArr;
    }

    public static File a(Context context) {
        File[] listFiles;
        File[] listFiles2;
        File file = null;
        try {
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(context, th);
        }
        synchronized (f9122c) {
            try {
                com.umeng.commonsdk.statistics.common.d.a("walle", "get last envelope begin, thread is " + Thread.currentThread());
                if (context != null && context.getApplicationContext() != null) {
                    String str = context.getApplicationContext().getFilesDir() + "/" + a.e;
                    if (!TextUtils.isEmpty(str)) {
                        File file2 = new File(str);
                        if (file2.isDirectory() && (listFiles = file2.listFiles()) != null && listFiles.length > 0) {
                            File file3 = null;
                            for (File file4 : listFiles) {
                                try {
                                    if (file4 != null && file4.isDirectory() && (listFiles2 = file4.listFiles()) != null && listFiles2.length > 0) {
                                        Arrays.sort(listFiles2, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.f.1
                                            @Override // java.util.Comparator
                                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public int compare(File file5, File file6) {
                                                long lastModified = file5.lastModified() - file6.lastModified();
                                                if (lastModified > 0) {
                                                    return 1;
                                                }
                                                return lastModified == 0 ? 0 : -1;
                                            }
                                        });
                                        File file5 = listFiles2[0];
                                        if (file5 != null && (file3 == null || file3.lastModified() > file5.lastModified())) {
                                            file3 = file5;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    file = file3;
                                    throw th;
                                }
                            }
                            file = file3;
                        }
                    }
                }
                com.umeng.commonsdk.statistics.common.d.a("walle", "get last envelope end, thread is " + Thread.currentThread());
                return file;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static void a(Context context, String str, int i) {
        try {
            if (str == null) {
                com.umeng.commonsdk.statistics.common.d.a("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            File file = new File(str);
            if (!file.isDirectory()) {
                com.umeng.commonsdk.statistics.common.d.a("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            synchronized (f9122c) {
                File[] listFiles = file.listFiles();
                com.umeng.commonsdk.statistics.common.d.a("AmapLBS", "[lbs-build] delete file begin " + listFiles.length + ", thread is " + Thread.currentThread());
                if (listFiles != null && listFiles.length >= i) {
                    com.umeng.commonsdk.statistics.common.d.a("AmapLBS", "[lbs-build] file size >= max");
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listFiles) {
                        if (file2 != null) {
                            arrayList.add(file2);
                        }
                    }
                    if (arrayList.size() >= i) {
                        Collections.sort(arrayList, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.f.2
                            @Override // java.util.Comparator
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file3, File file4) {
                                if (file3 == null || file4 == null || file3.lastModified() >= file4.lastModified()) {
                                    return (file3 == null || file4 == null || file3.lastModified() != file4.lastModified()) ? 1 : 0;
                                }
                                return -1;
                            }
                        });
                        if (com.umeng.commonsdk.statistics.common.d.f9145a) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                com.umeng.commonsdk.statistics.common.d.a("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i2)).getPath());
                            }
                        }
                        for (int i3 = 0; i3 <= arrayList.size() - i; i3++) {
                            if (arrayList.get(i3) != null) {
                                com.umeng.commonsdk.statistics.common.d.a("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i3)).getPath());
                                try {
                                    ((File) arrayList.get(i3)).delete();
                                    arrayList.remove(i3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } else {
                    com.umeng.commonsdk.statistics.common.d.a("AmapLBS", "[lbs-build] file size < max");
                }
                com.umeng.commonsdk.statistics.common.d.a("AmapLBS", "[lbs-build] delete file end " + listFiles.length + ", thread is " + Thread.currentThread());
            }
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(context, th);
        }
    }

    public static byte[] a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        f9120a = 0;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int deflate = deflater.deflate(bArr2);
                    f9120a += deflate;
                    byteArrayOutputStream.write(bArr2, 0, deflate);
                } catch (Throwable th) {
                    th = th;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            deflater.end();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(f9121b));
        return cipher.doFinal(bArr);
    }

    public static byte[] b(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b2)));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }
}
