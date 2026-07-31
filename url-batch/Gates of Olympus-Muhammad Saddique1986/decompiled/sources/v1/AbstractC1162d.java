package v1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import m1.w;

/* renamed from: v1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1162d {

    /* renamed from: a, reason: collision with root package name */
    public static final w f9760a = new w(4);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f9761b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f9762c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f9763d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f9764e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9765f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f9766g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f9767h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f9768i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f9769j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(C1160b[] c1160bArr, byte[] bArr) {
        int i3 = 0;
        for (C1160b c1160b : c1160bArr) {
            i3 += ((((c1160b.f9757g * 2) + 7) & (-8)) / 8) + (c1160b.f9755e * 2) + d(c1160b.f9751a, c1160b.f9752b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1160b.f9756f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f9765f)) {
            for (C1160b c1160b2 : c1160bArr) {
                p(byteArrayOutputStream, c1160b2, d(c1160b2.f9751a, c1160b2.f9752b, bArr));
                r(byteArrayOutputStream, c1160b2);
                int[] iArr = c1160b2.f9758h;
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    u(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                q(byteArrayOutputStream, c1160b2);
            }
        } else {
            for (C1160b c1160b3 : c1160bArr) {
                p(byteArrayOutputStream, c1160b3, d(c1160b3.f9751a, c1160b3.f9752b, bArr));
            }
            for (C1160b c1160b4 : c1160bArr) {
                r(byteArrayOutputStream, c1160b4);
                int[] iArr2 = c1160b4.f9758h;
                int length2 = iArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2) {
                    int i9 = iArr2[i7];
                    u(byteArrayOutputStream, i9 - i8);
                    i7++;
                    i8 = i9;
                }
                q(byteArrayOutputStream, c1160b4);
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : listFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f9767h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f9766g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
        sb.append(str2);
        return sb.toString();
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int read = inputStream.read(bArr, i4, i3 - i4);
            if (read < 0) {
                throw new IllegalStateException(A.k.h("Not enough bytes to read: ", i3));
            }
            i4 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += (int) m(byteArrayInputStream, 2);
            iArr[i5] = i4;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i3, int i4) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[2048];
            int i5 = 0;
            int i6 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i5 < i3) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i6 += inflater.inflate(bArr, i6, i4 - i6);
                    i5 += read;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i5);
        } finally {
            inflater.end();
        }
    }

    public static C1160b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1160b[] c1160bArr) {
        byte[] bArr3 = f9768i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f9769j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m3 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
            try {
                C1160b[] k3 = k(byteArrayInputStream, bArr2, m3, c1160bArr);
                byteArrayInputStream.close();
                return k3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f9763d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
        try {
            C1160b[] j3 = j(byteArrayInputStream2, m4, c1160bArr);
            byteArrayInputStream2.close();
            return j3;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C1160b[] j(ByteArrayInputStream byteArrayInputStream, int i3, C1160b[] c1160bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1160b[0];
        }
        if (i3 != c1160bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int m3 = (int) m(byteArrayInputStream, 2);
            iArr[i4] = (int) m(byteArrayInputStream, 2);
            strArr[i4] = new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C1160b c1160b = c1160bArr[i5];
            if (!c1160b.f9752b.equals(strArr[i5])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            c1160b.f9755e = i6;
            c1160b.f9758h = g(byteArrayInputStream, i6);
        }
        return c1160bArr;
    }

    public static C1160b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, C1160b[] c1160bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1160b[0];
        }
        if (i3 != c1160bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m3 = m(byteArrayInputStream, 4);
            int m4 = (int) m(byteArrayInputStream, 2);
            C1160b c1160b = null;
            if (c1160bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i5 = 0;
                while (true) {
                    if (i5 >= c1160bArr.length) {
                        break;
                    }
                    if (c1160bArr[i5].f9752b.equals(substring)) {
                        c1160b = c1160bArr[i5];
                        break;
                    }
                    i5++;
                }
            }
            if (c1160b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1160b.f9754d = m3;
            int[] g3 = g(byteArrayInputStream, m4);
            if (Arrays.equals(bArr, f9767h)) {
                c1160b.f9755e = m4;
                c1160b.f9758h = g3;
            }
        }
        return c1160bArr;
    }

    public static C1160b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f9764e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m3 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
        try {
            C1160b[] n3 = n(byteArrayInputStream, str, m3);
            byteArrayInputStream.close();
            return n3;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i3) {
        byte[] f3 = f(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += (f3[i4] & 255) << (i4 * 8);
        }
        return j3;
    }

    public static C1160b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C1160b[0];
        }
        C1160b[] c1160bArr = new C1160b[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int m3 = (int) m(byteArrayInputStream, 2);
            int m4 = (int) m(byteArrayInputStream, 2);
            c1160bArr[i4] = new C1160b(str, new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m4, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m4], new TreeMap());
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C1160b c1160b = c1160bArr[i5];
            int available = byteArrayInputStream.available() - c1160b.f9756f;
            int i6 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c1160b.f9759i;
                if (available2 <= available) {
                    break;
                }
                i6 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i6), 1);
                for (int m5 = (int) m(byteArrayInputStream, 2); m5 > 0; m5--) {
                    m(byteArrayInputStream, 2);
                    int m6 = (int) m(byteArrayInputStream, 1);
                    if (m6 != 6 && m6 != 7) {
                        while (m6 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m7 = (int) m(byteArrayInputStream, 1); m7 > 0; m7--) {
                                m(byteArrayInputStream, 2);
                            }
                            m6--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1160b.f9758h = g(byteArrayInputStream, c1160b.f9755e);
            int i7 = c1160b.f9757g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = valueOf.get(i8) ? 2 : 0;
                if (valueOf.get(i8 + i7)) {
                    i9 |= 4;
                }
                if (i9 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i8));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i8), Integer.valueOf(i9 | num.intValue()));
                }
            }
        }
        return c1160bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1160b[] c1160bArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f9763d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f9764e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b3 = b(c1160bArr, bArr3);
                t(byteArrayOutputStream, c1160bArr.length, 1);
                t(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = f9766g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, c1160bArr.length, 1);
                for (C1160b c1160b : c1160bArr) {
                    int size = c1160b.f9759i.size() * 4;
                    String d3 = d(c1160b.f9751a, c1160b.f9752b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d3.getBytes(charset).length);
                    u(byteArrayOutputStream, c1160b.f9758h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, c1160b.f9753c, 4);
                    byteArrayOutputStream.write(d3.getBytes(charset));
                    Iterator it = c1160b.f9759i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i4 : c1160b.f9758h) {
                        u(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr5 = f9765f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b4 = b(c1160bArr, bArr5);
                t(byteArrayOutputStream, c1160bArr.length, 1);
                t(byteArrayOutputStream, b4.length, 4);
                byte[] a4 = a(b4);
                t(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr6 = f9767h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, c1160bArr.length);
            for (C1160b c1160b2 : c1160bArr) {
                String d4 = d(c1160b2.f9751a, c1160b2.f9752b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d4.getBytes(charset2).length);
                TreeMap treeMap = c1160b2.f9759i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, c1160b2.f9758h.length);
                t(byteArrayOutputStream, c1160b2.f9753c, 4);
                byteArrayOutputStream.write(d4.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : c1160b2.f9758h) {
                    u(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, c1160bArr.length);
            int i6 = 2;
            int i7 = 2;
            for (C1160b c1160b3 : c1160bArr) {
                t(byteArrayOutputStream2, c1160b3.f9753c, 4);
                t(byteArrayOutputStream2, c1160b3.f9754d, 4);
                t(byteArrayOutputStream2, c1160b3.f9757g, 4);
                String d5 = d(c1160b3.f9751a, c1160b3.f9752b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d5.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(d5.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            C1169k c1169k = new C1169k(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c1169k);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < c1160bArr.length) {
                try {
                    C1160b c1160b4 = c1160bArr[i8];
                    u(byteArrayOutputStream3, i8);
                    u(byteArrayOutputStream3, c1160b4.f9755e);
                    i9 = i9 + 4 + (c1160b4.f9755e * 2);
                    int[] iArr = c1160b4.f9758h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        u(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            C1169k c1169k2 = new C1169k(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c1169k2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < c1160bArr.length) {
                try {
                    C1160b c1160b5 = c1160bArr[i12];
                    Iterator it3 = c1160b5.f9759i.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, c1160b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, c1160b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i12);
                            int length4 = byteArray3.length + i6 + byteArray4.length;
                            int i15 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i14);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i15 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                            i6 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            C1169k c1169k3 = new C1169k(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c1169k3);
            long j4 = 4;
            long size2 = j4 + j4 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i16 = 0;
            while (i16 < arrayList2.size()) {
                C1169k c1169k4 = (C1169k) arrayList2.get(i16);
                int i17 = c1169k4.f9779a;
                if (i17 == 1) {
                    j3 = 0;
                } else if (i17 == 2) {
                    j3 = 1;
                } else if (i17 == 3) {
                    j3 = 2;
                } else if (i17 == 4) {
                    j3 = 3;
                } else {
                    if (i17 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                t(byteArrayOutputStream, j3, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c1169k4.f9780b;
                if (c1169k4.f9781c) {
                    long length5 = bArr7.length;
                    byte[] a5 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a5);
                    t(byteArrayOutputStream, a5.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C1160b c1160b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, c1160b.f9755e);
        t(byteArrayOutputStream, c1160b.f9756f, 4);
        t(byteArrayOutputStream, c1160b.f9753c, 4);
        t(byteArrayOutputStream, c1160b.f9757g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C1160b c1160b) {
        byte[] bArr = new byte[(((c1160b.f9757g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1160b.f9759i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i3 = intValue / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i4 = intValue + c1160b.f9757g;
                int i5 = i4 / 8;
                bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, C1160b c1160b) {
        int i3 = 0;
        for (Map.Entry entry : c1160b.f9759i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i3);
                u(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c6, code lost:
    
        if (r5 == null) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, InterfaceC1161c interfaceC1161c, boolean z3) {
        boolean z4;
        ?? r6;
        IOException iOException;
        int i3;
        C1160b[] c1160bArr;
        C1160b[] c1160bArr2;
        C1159a c1159a;
        C1160b[] c1160bArr3;
        byte[] bArr;
        boolean z5;
        boolean z6;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream a3;
        boolean z7;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z3) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z7 = readLong == packageInfo.lastUpdateTime;
                            if (z7) {
                                interfaceC1161c.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z7) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC1168j.c(context, false);
                        return;
                    }
                }
                z7 = false;
                if (z7) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i4 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C1159a c1159a2 = new C1159a(assets, executor, interfaceC1161c, name, file2);
            byte[] bArr2 = c1159a2.f9745c;
            if (bArr2 == null) {
                c1159a2.b(3, Integer.valueOf(i4));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z4 = true;
                        c1159a2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    c1159a2.b(4, null);
                }
                c1159a2.f9748f = true;
                byte[] bArr3 = f9761b;
                try {
                    try {
                        r6 = c1159a2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e3) {
                        interfaceC1161c.c(6, e3);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        c1160bArr2 = c1159a2.f9749g;
                        if (c1160bArr2 != null) {
                        }
                        c1159a = c1159a2;
                        InterfaceC1161c interfaceC1161c2 = c1159a.f9744b;
                        c1160bArr3 = c1159a.f9749g;
                        ?? r62 = r6;
                        if (c1160bArr3 != null) {
                        }
                        bArr = c1159a.f9750h;
                        if (bArr == null) {
                        }
                        if (z6) {
                        }
                        AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                    } catch (IOException e4) {
                        interfaceC1161c.c(7, e4);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        c1160bArr2 = c1159a2.f9749g;
                        if (c1160bArr2 != null) {
                        }
                        c1159a = c1159a2;
                        InterfaceC1161c interfaceC1161c22 = c1159a.f9744b;
                        c1160bArr3 = c1159a.f9749g;
                        ?? r622 = r6;
                        if (c1160bArr3 != null) {
                        }
                        bArr = c1159a.f9750h;
                        if (bArr == null) {
                        }
                        if (z6) {
                        }
                        AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                    }
                    if (r6 != 0) {
                        try {
                        } catch (IOException e5) {
                            i3 = 7;
                            interfaceC1161c.c(7, e5);
                            try {
                                r6.close();
                            } catch (IOException e6) {
                                iOException = e6;
                                interfaceC1161c.c(i3, iOException);
                                c1160bArr = null;
                                r6 = r6;
                                c1159a2.f9749g = c1160bArr;
                                c1160bArr2 = c1159a2.f9749g;
                                if (c1160bArr2 != null) {
                                }
                                c1159a = c1159a2;
                                InterfaceC1161c interfaceC1161c222 = c1159a.f9744b;
                                c1160bArr3 = c1159a.f9749g;
                                ?? r6222 = r6;
                                if (c1160bArr3 != null) {
                                }
                                bArr = c1159a.f9750h;
                                if (bArr == null) {
                                }
                                if (z6) {
                                }
                                AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                            }
                            c1160bArr = null;
                            r6 = r6;
                            c1159a2.f9749g = c1160bArr;
                            c1160bArr2 = c1159a2.f9749g;
                            if (c1160bArr2 != null) {
                            }
                            c1159a = c1159a2;
                            InterfaceC1161c interfaceC1161c2222 = c1159a.f9744b;
                            c1160bArr3 = c1159a.f9749g;
                            ?? r62222 = r6;
                            if (c1160bArr3 != null) {
                            }
                            bArr = c1159a.f9750h;
                            if (bArr == null) {
                            }
                            if (z6) {
                            }
                            AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                        } catch (IllegalStateException e7) {
                            try {
                                interfaceC1161c.c(8, e7);
                                try {
                                    r6.close();
                                } catch (IOException e8) {
                                    iOException = e8;
                                    i3 = 7;
                                    interfaceC1161c.c(i3, iOException);
                                    c1160bArr = null;
                                    r6 = r6;
                                    c1159a2.f9749g = c1160bArr;
                                    c1160bArr2 = c1159a2.f9749g;
                                    if (c1160bArr2 != null) {
                                    }
                                    c1159a = c1159a2;
                                    InterfaceC1161c interfaceC1161c22222 = c1159a.f9744b;
                                    c1160bArr3 = c1159a.f9749g;
                                    ?? r622222 = r6;
                                    if (c1160bArr3 != null) {
                                    }
                                    bArr = c1159a.f9750h;
                                    if (bArr == null) {
                                    }
                                    if (z6) {
                                    }
                                    AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                                }
                                c1160bArr = null;
                                r6 = r6;
                                c1159a2.f9749g = c1160bArr;
                                c1160bArr2 = c1159a2.f9749g;
                                if (c1160bArr2 != null) {
                                }
                                c1159a = c1159a2;
                                InterfaceC1161c interfaceC1161c222222 = c1159a.f9744b;
                                c1160bArr3 = c1159a.f9749g;
                                ?? r6222222 = r6;
                                if (c1160bArr3 != null) {
                                }
                                bArr = c1159a.f9750h;
                                if (bArr == null) {
                                }
                                if (z6) {
                                }
                                AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    r6.close();
                                    throw th2;
                                } catch (IOException e9) {
                                    interfaceC1161c.c(7, e9);
                                    throw th2;
                                }
                            }
                        }
                        if (!Arrays.equals(bArr3, f(r6, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c1160bArr = l(r6, f(r6, 4), c1159a2.f9747e);
                        try {
                            r6.close();
                            r6 = r6;
                        } catch (IOException e10) {
                            IOException iOException2 = e10;
                            interfaceC1161c.c(7, iOException2);
                            r6 = iOException2;
                        }
                        c1159a2.f9749g = c1160bArr;
                    }
                    c1160bArr2 = c1159a2.f9749g;
                    if (c1160bArr2 != null) {
                        int i5 = Build.VERSION.SDK_INT;
                        r6 = 34;
                        if (i5 <= 34) {
                            char c2 = 24;
                            if (i5 != 24) {
                                c2 = 25;
                                c2 = 25;
                                r6 = 25;
                                if (i5 != 25) {
                                    switch (i5) {
                                    }
                                }
                            }
                            try {
                                a3 = c1159a2.a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e11) {
                                interfaceC1161c.c(9, e11);
                            } catch (IOException e12) {
                                interfaceC1161c.c(7, e12);
                            } catch (IllegalStateException e13) {
                                c1159a2.f9749g = null;
                                interfaceC1161c.c(8, e13);
                            }
                            if (a3 != null) {
                                try {
                                    boolean equals = Arrays.equals(f9762c, f(a3, 4));
                                    if (!equals) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c1159a2.f9749g = i(a3, f(a3, 4), bArr2, c1160bArr2);
                                    a3.close();
                                    c1159a = c1159a2;
                                    r6 = equals;
                                } finally {
                                }
                            } else {
                                if (a3 != null) {
                                    a3.close();
                                }
                                c1159a = null;
                                r6 = c2;
                            }
                        }
                    }
                    c1159a = c1159a2;
                    InterfaceC1161c interfaceC1161c2222222 = c1159a.f9744b;
                    c1160bArr3 = c1159a.f9749g;
                    ?? r62222222 = r6;
                    if (c1160bArr3 != null) {
                        byte[] bArr4 = c1159a.f9745c;
                        r62222222 = bArr4;
                        if (bArr4 != null) {
                            if (!c1159a.f9748f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr3);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e14) {
                                interfaceC1161c2222222.c(7, e14);
                            } catch (IllegalStateException e15) {
                                interfaceC1161c2222222.c(8, e15);
                            }
                            if (o(byteArrayOutputStream, bArr4, c1160bArr3)) {
                                c1159a.f9750h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                c1159a.f9749g = null;
                                r62222222 = bArr4;
                            } else {
                                interfaceC1161c2222222.c(5, null);
                                c1159a.f9749g = null;
                                byteArrayOutputStream.close();
                                r62222222 = bArr4;
                            }
                        }
                    }
                    bArr = c1159a.f9750h;
                    if (bArr == null) {
                        z6 = false;
                        z4 = true;
                    } else {
                        try {
                            if (!c1159a.f9748f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(c1159a.f9746d);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z4 = true;
                                                        try {
                                                            c1159a.b(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            c1159a.f9750h = null;
                                                            c1159a.f9749g = null;
                                                            z6 = true;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            Throwable th4 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th4;
                                                            } catch (Throwable th5) {
                                                                th4.addSuppressed(th5);
                                                                throw th4;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                Throwable th7 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th7;
                                                } catch (Throwable th8) {
                                                    th7.addSuppressed(th8);
                                                    throw th7;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                    }
                                } catch (FileNotFoundException e16) {
                                    e = e16;
                                    c1159a.b(6, e);
                                    z5 = r62222222;
                                    z6 = false;
                                    z4 = z5;
                                    if (z6) {
                                    }
                                    AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                                } catch (IOException e17) {
                                    e = e17;
                                    c1159a.b(7, e);
                                    z5 = r62222222;
                                    z6 = false;
                                    z4 = z5;
                                    if (z6) {
                                    }
                                    AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                                }
                            } catch (FileNotFoundException e18) {
                                e = e18;
                                r62222222 = 1;
                                c1159a.b(6, e);
                                z5 = r62222222;
                                z6 = false;
                                z4 = z5;
                                if (z6) {
                                }
                                AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                            } catch (IOException e19) {
                                e = e19;
                                r62222222 = 1;
                                c1159a.b(7, e);
                                z5 = r62222222;
                                z6 = false;
                                z4 = z5;
                                if (z6) {
                                }
                                AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                            }
                        } finally {
                            c1159a.f9750h = null;
                            c1159a.f9749g = null;
                        }
                    }
                    if (z6) {
                        e(packageInfo, filesDir);
                    }
                    AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
                } catch (Throwable th11) {
                    th = th11;
                }
            }
            z4 = true;
            z6 = false;
            AbstractC1168j.c(context, (z6 || !z3) ? false : z4);
        } catch (PackageManager.NameNotFoundException e20) {
            interfaceC1161c.c(7, e20);
            AbstractC1168j.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((j3 >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        t(byteArrayOutputStream, i3, 2);
    }
}
