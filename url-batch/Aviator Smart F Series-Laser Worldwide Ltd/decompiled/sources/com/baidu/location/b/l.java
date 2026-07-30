package com.baidu.location.b;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static String f4768a = "Temp_in.dat";

    /* renamed from: b, reason: collision with root package name */
    private static File f4769b = new File(com.baidu.location.e.h.f5254a, f4768a);

    /* renamed from: c, reason: collision with root package name */
    private static StringBuffer f4770c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4771d = true;

    /* renamed from: e, reason: collision with root package name */
    private static int f4772e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f4773f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static long f4774g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static long f4775h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static long f4776i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static double f4777j = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;

    /* renamed from: k, reason: collision with root package name */
    private static double f4778k = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;

    /* renamed from: l, reason: collision with root package name */
    private static int f4779l = 0;

    /* renamed from: m, reason: collision with root package name */
    private static int f4780m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static int f4781n = 0;

    public static String a() {
        RandomAccessFile randomAccessFile;
        int readInt;
        int readInt2;
        int readInt3;
        File file = f4769b;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            randomAccessFile = new RandomAccessFile(f4769b, "rw");
            randomAccessFile.seek(0L);
            readInt = randomAccessFile.readInt();
            readInt2 = randomAccessFile.readInt();
            readInt3 = randomAccessFile.readInt();
        } catch (IOException unused) {
        }
        if (!a(readInt, readInt2, readInt3)) {
            randomAccessFile.close();
            c();
            return null;
        }
        if (readInt2 != 0 && readInt2 != readInt3) {
            long j8 = ((readInt2 - 1) * 1024) + 12;
            randomAccessFile.seek(j8);
            int readInt4 = randomAccessFile.readInt();
            byte[] bArr = new byte[readInt4];
            randomAccessFile.seek(j8 + 4);
            for (int i8 = 0; i8 < readInt4; i8++) {
                bArr[i8] = randomAccessFile.readByte();
            }
            String str = new String(bArr);
            int i9 = com.baidu.location.e.i.C;
            int i10 = 1;
            if (readInt >= i9 && readInt2 == i9) {
                randomAccessFile.seek(4L);
                randomAccessFile.writeInt(i10);
                randomAccessFile.close();
                return str;
            }
            i10 = 1 + readInt2;
            randomAccessFile.seek(4L);
            randomAccessFile.writeInt(i10);
            randomAccessFile.close();
            return str;
        }
        randomAccessFile.close();
        return null;
    }

    private static void b() {
        f4771d = true;
        f4770c = null;
        f4772e = 0;
        f4773f = 0;
        f4774g = 0L;
        f4775h = 0L;
        f4776i = 0L;
        f4777j = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        f4778k = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        f4779l = 0;
        f4780m = 0;
        f4781n = 0;
    }

    private static boolean c() {
        if (f4769b.exists()) {
            f4769b.delete();
        }
        if (!f4769b.getParentFile().exists()) {
            f4769b.getParentFile().mkdirs();
        }
        try {
            f4769b.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(f4769b, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(1);
            randomAccessFile.close();
            b();
            return f4769b.exists();
        } catch (IOException unused) {
            return false;
        }
    }

    private static boolean a(int i8, int i9, int i10) {
        int i11;
        int i12;
        return i8 >= 0 && i8 <= (i11 = com.baidu.location.e.i.C) && i9 >= 0 && i9 <= (i12 = i8 + 1) && i10 >= 1 && i10 <= i12 && i10 <= i11;
    }
}
