package com.aiming.mdt.a;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.aiming.mdt.a.ʼˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0143 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f468 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f469 = 1;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static long f470 = 7406159034811525842L;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static char[] f471 = {'/', 43699, 21952, 21, 43899, 22069, 136, 43999, 22244, 259, 44059, 22322, 490, 44184, 22296, 555, 44308, 22464, 757, 44531, 22616, 860, 44600, 22715, 896, 44723, 22893, 1042, 44746, 23036, 1278, 44887, 23073, 1392, 44930, 23250, 1471, 45154, 23324, 1481, 45284, 23444, 1558, 45349, 23596, 1754, 45451, 23738, 1872, 45655, 23910, 'p', 43680, 21963, 18, 43837, 22137, 152, 44001, 22265, 262, 'p', 43680, 21963, 18, 43837, 22137, 152, 44001, 22265, 262, 44054, 22332, 506, 'p', 43680, 21963, 18, 43837, 22137, 152, 44001, 22265, 262, 44049, 22325, 412, 7091, 45411, 19976, 7121, 45310, 19898, 7003, 45090, 19770, 6853, 47050, 11065, '%', 36722, 'A', 43702, 21991, 25, 43812, 22133, 130, 43975, 22213, 278, 44125, 22378, 504, 44237, 22297, 570, 44385, 22422, 647, 44537, 22532, 853, 44642, 22695, 992, 44771, 22839, 1101, 44697, 22957, 1273, 44832, 23073, 1407, 44929, 23190, 1515, 45110, 23363, 1421, 45237, 23426, 1553, 45364, 23658, 1669, 45518, 'A', 43702, 21991, 25, 43812, 22133, 130, 43975, 22213, 278, 44125, 22378, 504, 44237, 22297, 570, 44385, 22422, 647, 44537, 22532, 853, 44642, 22695, 992, 44771, 22839, 1101, 44697, 22957, 1273, 44832, 23073, 1407, 44929, 23190, 1517, 45096, 23390, 1425, 45218};

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m540(char c2, int i, int i2) {
        int i3 = f468 + 87;
        f469 = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        int i6 = f468 + 21;
        while (true) {
            f469 = i6 % 128;
            int i7 = i6 % 2;
            if ((i5 < i2 ? (char) 6 : '*') == '*') {
                return new String(cArr);
            }
            cArr[i5] = (char) ((f471[i + i5] ^ (i5 * f470)) ^ c2);
            i5++;
            i6 = f468 + 53;
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static String m541(Context context) {
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        String substring;
        int indexOf;
        String str = "";
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getFilesDir().getAbsolutePath());
                    sb.append(m540((char) 0, 0, 51).intern());
                    File file = new File(sb.toString());
                    if (file.exists()) {
                        StringBuilder sb2 = new StringBuilder();
                        fileInputStream = new FileInputStream(file);
                        try {
                            inputStreamReader = new InputStreamReader(fileInputStream);
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        sb2.append(readLine);
                                    } catch (Throwable unused) {
                                        bufferedReader2 = bufferedReader;
                                        m540((char) 0, 148, 41).intern();
                                        C0044.m109();
                                        if (bufferedReader2 != null) {
                                            bufferedReader2.close();
                                        }
                                        if (inputStreamReader != null) {
                                            inputStreamReader.close();
                                            int i = f468 + 55;
                                            f469 = i % 128;
                                            if (i % 2 == 0) {
                                            }
                                        }
                                        if (fileInputStream != null) {
                                            int i2 = f468 + 11;
                                            f469 = i2 % 128;
                                            if (i2 % 2 == 0) {
                                            }
                                            fileInputStream.close();
                                            int i3 = f468 + 21;
                                            f469 = i3 % 128;
                                            int i4 = i3 % 2;
                                        }
                                        return str;
                                    }
                                }
                                bufferedReader.close();
                                fileInputStream.close();
                                String obj = sb2.toString();
                                if (!(!obj.contains(m540((char) 0, 51, 10).intern()))) {
                                    int i5 = f468 + 55;
                                    f469 = i5 % 128;
                                    int i6 = i5 % 2;
                                    int indexOf2 = obj.indexOf(m540((char) 0, 61, 13).intern());
                                    int indexOf3 = obj.indexOf(m540((char) 0, 74, 13).intern());
                                    int indexOf4 = obj.indexOf(m540((char) 7107, 87, 11).intern());
                                    if (indexOf2 != -1) {
                                        substring = obj.substring(indexOf2 + 13, obj.length());
                                        indexOf = substring.indexOf(m540((char) 11035, 98, 1).intern());
                                    } else if (indexOf3 != -1) {
                                        substring = obj.substring(indexOf3 + 13, obj.length());
                                        indexOf = substring.indexOf(m540((char) 0, 99, 1).intern());
                                    } else if (indexOf4 != -1) {
                                        substring = obj.substring(indexOf4 + 11, obj.length());
                                        indexOf = substring.indexOf(m540((char) 36692, 100, 1).intern());
                                    }
                                    str = substring.substring(0, indexOf);
                                }
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader = null;
                            bufferedReader = null;
                        }
                    } else {
                        inputStreamReader = null;
                        fileInputStream = null;
                        bufferedReader = null;
                    }
                    if (bufferedReader != null) {
                        int i7 = f469 + 101;
                        f468 = i7 % 128;
                        int i8 = i7 % 2;
                        bufferedReader.close();
                    }
                    if (inputStreamReader != null) {
                        int i9 = f469 + 49;
                        f468 = i9 % 128;
                        int i10 = i9 % 2;
                        inputStreamReader.close();
                    }
                    if (!(fileInputStream == null)) {
                        fileInputStream.close();
                    }
                } catch (Throwable unused3) {
                    m540((char) 0, 101, 47).intern();
                    C0044.m109();
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = null;
                fileInputStream = null;
                bufferedReader = null;
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }
}
