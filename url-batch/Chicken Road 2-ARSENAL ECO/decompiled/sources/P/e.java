package P;

import N.p;
import W4.o;
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
import y1.C0760d;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0760d f1849a = new C0760d();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1850b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1851c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1852d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1853e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1854f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1855g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1856h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1857i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1858j = {48, 48, 50, 0};

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

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int i7 = 0;
        for (b bVar : bVarArr) {
            i7 += ((((bVar.f1845g * 2) + 7) & (-8)) / 8) + (bVar.f1843e * 2) + d(bVar.f1839a, bVar.f1840b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f1844f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i7);
        if (Arrays.equals(bArr, f1854f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bVar2.f1839a, bVar2.f1840b, bArr));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.f1846h;
                int length = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    int i10 = iArr[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bVar3.f1839a, bVar3.f1840b, bArr));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.f1846h;
                int length2 = iArr2.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length2) {
                    int i13 = iArr2[i11];
                    u(byteArrayOutputStream, i13 - i12);
                    i11++;
                    i12 = i13;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i7) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i7);
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
        boolean z5 = true;
        for (File file2 : listFiles) {
            z5 = c(file2) && z5;
        }
        return z5;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f1856h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1855g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return p.b(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
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

    public static byte[] f(InputStream inputStream, int i7) {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = inputStream.read(bArr, i8, i7 - i8);
            if (read < 0) {
                throw new IllegalStateException(o.c("Not enough bytes to read: ", i7));
            }
            i8 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += (int) m(byteArrayInputStream, 2);
            iArr[i9] = i8;
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
    public static byte[] h(FileInputStream fileInputStream, int i7, int i8) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i8];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int i10 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i7) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i10 += inflater.inflate(bArr, i10, i8 - i10);
                    i9 += read;
                } catch (DataFormatException e4) {
                    throw new IllegalStateException(e4.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i9);
        } finally {
            inflater.end();
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f1857i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1858j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m4 = (int) m(fileInputStream, 2);
            byte[] h7 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
            try {
                b[] k4 = k(byteArrayInputStream, bArr2, m4, bVarArr);
                byteArrayInputStream.close();
                return k4;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f1852d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m7 = (int) m(fileInputStream, 1);
        byte[] h8 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h8);
        try {
            b[] j4 = j(byteArrayInputStream2, m7, bVarArr);
            byteArrayInputStream2.close();
            return j4;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i7, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i7 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            iArr[i8] = (int) m(byteArrayInputStream, 2);
            strArr[i8] = new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            b bVar = bVarArr[i9];
            if (!bVar.f1840b.equals(strArr[i9])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            bVar.f1843e = i10;
            bVar.f1846h = g(byteArrayInputStream, i10);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i7 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m4 = m(byteArrayInputStream, 4);
            int m7 = (int) m(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i9 = 0;
                while (true) {
                    if (i9 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i9].f1840b.equals(substring)) {
                        bVar = bVarArr[i9];
                        break;
                    }
                    i9++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f1842d = m4;
            int[] g7 = g(byteArrayInputStream, m7);
            if (Arrays.equals(bArr, f1856h)) {
                bVar.f1843e = m7;
                bVar.f1846h = g7;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f1853e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h7 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
        try {
            b[] n7 = n(byteArrayInputStream, str, m4);
            byteArrayInputStream.close();
            return n7;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i7) {
        byte[] f7 = f(inputStream, i7);
        long j4 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j4 += (f7[i8] & 255) << (i8 * 8);
        }
        return j4;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) {
        int i8 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            int m7 = (int) m(byteArrayInputStream, 2);
            bVarArr[i9] = new b(str, new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m7, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m7], new TreeMap());
        }
        int i10 = 0;
        while (i10 < i7) {
            b bVar = bVarArr[i10];
            int available = byteArrayInputStream.available();
            int i11 = bVar.f1844f;
            int i12 = bVar.f1845g;
            TreeMap treeMap = bVar.f1847i;
            int i13 = available - i11;
            int i14 = i8;
            while (byteArrayInputStream.available() > i13) {
                i14 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i14), 1);
                int m8 = (int) m(byteArrayInputStream, 2);
                while (m8 > 0) {
                    m(byteArrayInputStream, 2);
                    int m9 = (int) m(byteArrayInputStream, 1);
                    if (m9 != 6 && m9 != 7) {
                        while (m9 > 0) {
                            m(byteArrayInputStream, 1);
                            int i15 = i8;
                            int i16 = i10;
                            for (int m10 = (int) m(byteArrayInputStream, 1); m10 > 0; m10--) {
                                m(byteArrayInputStream, 2);
                            }
                            m9--;
                            i8 = i15;
                            i10 = i16;
                        }
                    }
                    m8--;
                    i8 = i8;
                    i10 = i10;
                }
            }
            int i17 = i8;
            int i18 = i10;
            if (byteArrayInputStream.available() != i13) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f1846h = g(byteArrayInputStream, bVar.f1843e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i12 * 2) + 7) & (-8)) / 8));
            for (int i19 = i17; i19 < i12; i19++) {
                int i20 = valueOf.get(i19) ? 2 : i17;
                if (valueOf.get(i19 + i12)) {
                    i20 |= 4;
                }
                if (i20 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i19));
                    if (num == null) {
                        num = Integer.valueOf(i17);
                    }
                    treeMap.put(Integer.valueOf(i19), Integer.valueOf(i20 | num.intValue()));
                }
            }
            i10 = i18 + 1;
            i8 = i17;
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1852d;
        int i7 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1853e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b7 = b(bVarArr, bArr3);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b7.length, 4);
                byte[] a7 = a(b7);
                t(byteArrayOutputStream, a7.length, 4);
                byteArrayOutputStream.write(a7);
                return true;
            }
            byte[] bArr4 = f1855g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f1847i.size() * 4;
                    String d7 = d(bVar.f1839a, bVar.f1840b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d7.getBytes(charset).length);
                    u(byteArrayOutputStream, bVar.f1846h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, bVar.f1841c, 4);
                    byteArrayOutputStream.write(d7.getBytes(charset));
                    Iterator it = bVar.f1847i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i8 : bVar.f1846h) {
                        u(byteArrayOutputStream, i8);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1854f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b8 = b(bVarArr, bArr5);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b8.length, 4);
                byte[] a8 = a(b8);
                t(byteArrayOutputStream, a8.length, 4);
                byteArrayOutputStream.write(a8);
                return true;
            }
            byte[] bArr6 = f1856h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.f1839a;
                TreeMap treeMap = bVar2.f1847i;
                String d8 = d(str, bVar2.f1840b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d8.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar2.f1846h.length);
                t(byteArrayOutputStream, bVar2.f1841c, 4);
                byteArrayOutputStream.write(d8.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i9 : bVar2.f1846h) {
                    u(byteArrayOutputStream, i9);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, bVarArr.length);
            int i10 = 2;
            int i11 = 2;
            for (b bVar3 : bVarArr) {
                t(byteArrayOutputStream2, bVar3.f1841c, 4);
                t(byteArrayOutputStream2, bVar3.f1842d, 4);
                t(byteArrayOutputStream2, bVar3.f1845g, 4);
                String d9 = d(bVar3.f1839a, bVar3.f1840b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d9.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(d9.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i11 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            }
            m mVar = new m(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i12];
                    u(byteArrayOutputStream3, i12);
                    u(byteArrayOutputStream3, bVar4.f1843e);
                    i13 = i13 + 4 + (bVar4.f1843e * i10);
                    int[] iArr = bVar4.f1846h;
                    int length3 = iArr.length;
                    int i14 = i7;
                    int i15 = i10;
                    int i16 = i14;
                    while (i16 < length3) {
                        int i17 = iArr[i16];
                        u(byteArrayOutputStream3, i17 - i14);
                        i16++;
                        i14 = i17;
                    }
                    i12++;
                    i10 = i15;
                    i7 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
            }
            m mVar2 = new m(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i18 = 0;
            int i19 = 0;
            while (i18 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i18];
                    Iterator it3 = bVar5.f1847i.entrySet().iterator();
                    int i20 = 0;
                    while (it3.hasNext()) {
                        i20 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i18);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i21 = i19 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i20);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i19 = i21 + length4;
                            i18++;
                            arrayList3 = arrayList4;
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
            if (i19 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray5.length);
            }
            m mVar3 = new m(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar3);
            long j7 = 4;
            long size2 = j7 + j7 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                m mVar4 = (m) arrayList2.get(i22);
                int i23 = mVar4.f1869a;
                byte[] bArr7 = mVar4.f1870b;
                if (i23 == 1) {
                    j4 = 0;
                } else if (i23 == 2) {
                    j4 = 1;
                } else if (i23 == 3) {
                    j4 = 2;
                } else if (i23 == 4) {
                    j4 = 3;
                } else {
                    if (i23 != 5) {
                        throw null;
                    }
                    j4 = 4;
                }
                t(byteArrayOutputStream, j4, 4);
                t(byteArrayOutputStream, size2, 4);
                if (mVar4.f1871c) {
                    long length5 = bArr7.length;
                    byte[] a9 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a9);
                    t(byteArrayOutputStream, a9.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a9.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i22++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.f1843e);
        t(byteArrayOutputStream, bVar.f1844f, 4);
        t(byteArrayOutputStream, bVar.f1841c, 4);
        t(byteArrayOutputStream, bVar.f1845g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.f1845g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f1847i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i7 = intValue / 8;
                bArr[i7] = (byte) (bArr[i7] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i8 = intValue + bVar.f1845g;
                int i9 = i8 / 8;
                bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i7 = 0;
        for (Map.Entry entry : bVar.f1847i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i7);
                u(byteArrayOutputStream, 0);
                i7 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, d dVar, boolean z5) {
        boolean z6;
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r7;
        b[] bVarArr;
        b[] bVarArr2;
        b[] bVarArr3;
        byte[] bArr2;
        boolean z7;
        boolean z8;
        ?? r72;
        boolean z9;
        boolean z10;
        ByteArrayOutputStream byteArrayOutputStream;
        int i7;
        E3.d dVar2;
        FileInputStream g7;
        boolean z11;
        boolean z12;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z5) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z12 = readLong == packageInfo.lastUpdateTime;
                            if (z12) {
                                dVar.m(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z12) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        l.c(context, false);
                        return;
                    }
                }
                z12 = false;
                if (z12) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i8 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            E3.d dVar3 = new E3.d(assets, executor, dVar, name, file2);
            byte[] bArr3 = (byte[]) dVar3.f627d;
            if (bArr3 == null) {
                dVar3.h(3, Integer.valueOf(i8));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z6 = true;
                        dVar3.h(4, null);
                    }
                } else if (!file2.canWrite()) {
                    dVar3.h(4, null);
                }
                dVar3.f624a = true;
                try {
                    try {
                        fileInputStream = dVar3.g(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e4) {
                        dVar.m(6, e4);
                        fileInputStream = null;
                        bArr = f1850b;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) dVar3.f630g;
                        if (bVarArr2 != null) {
                            if (i7 != 25) {
                            }
                            try {
                                g7 = dVar3.g(assets, "dexopt/baseline.profm");
                                if (g7 == null) {
                                }
                            } catch (FileNotFoundException e7) {
                                dVar.m(9, e7);
                            } catch (IOException e8) {
                                dVar.m(7, e8);
                            } catch (IllegalStateException e9) {
                                dVar3.f630g = null;
                                dVar.m(8, e9);
                            }
                        }
                        d dVar4 = (d) dVar3.f626c;
                        bVarArr3 = (b[]) dVar3.f630g;
                        byte[] bArr4 = (byte[]) dVar3.f627d;
                        if (bVarArr3 != null) {
                            if (dVar3.f624a) {
                            }
                        }
                        bArr2 = (byte[]) dVar3.f631h;
                        if (bArr2 == null) {
                        }
                        if (z8) {
                        }
                        z10 = z8;
                        z11 = z9;
                        l.c(context, (z10 || !z5) ? false : z11);
                    } catch (IOException e10) {
                        dVar.m(7, e10);
                        fileInputStream = null;
                        bArr = f1850b;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) dVar3.f630g;
                        if (bVarArr2 != null) {
                        }
                        d dVar42 = (d) dVar3.f626c;
                        bVarArr3 = (b[]) dVar3.f630g;
                        byte[] bArr42 = (byte[]) dVar3.f627d;
                        if (bVarArr3 != null) {
                        }
                        bArr2 = (byte[]) dVar3.f631h;
                        if (bArr2 == null) {
                        }
                        if (z8) {
                        }
                        z10 = z8;
                        z11 = z9;
                        l.c(context, (z10 || !z5) ? false : z11);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e11) {
                            dVar.m(7, e11);
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                                dVar.m(7, e12);
                            }
                            bVarArr = null;
                            dVar3.f630g = bVarArr;
                            bVarArr2 = (b[]) dVar3.f630g;
                            if (bVarArr2 != null) {
                            }
                            d dVar422 = (d) dVar3.f626c;
                            bVarArr3 = (b[]) dVar3.f630g;
                            byte[] bArr422 = (byte[]) dVar3.f627d;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = (byte[]) dVar3.f631h;
                            if (bArr2 == null) {
                            }
                            if (z8) {
                            }
                            z10 = z8;
                            z11 = z9;
                            l.c(context, (z10 || !z5) ? false : z11);
                        } catch (IllegalStateException e13) {
                            dVar.m(8, e13);
                            fileInputStream.close();
                            bVarArr = null;
                            dVar3.f630g = bVarArr;
                            bVarArr2 = (b[]) dVar3.f630g;
                            if (bVarArr2 != null) {
                            }
                            d dVar4222 = (d) dVar3.f626c;
                            bVarArr3 = (b[]) dVar3.f630g;
                            byte[] bArr4222 = (byte[]) dVar3.f627d;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = (byte[]) dVar3.f631h;
                            if (bArr2 == null) {
                            }
                            if (z8) {
                            }
                            z10 = z8;
                            z11 = z9;
                            l.c(context, (z10 || !z5) ? false : z11);
                        }
                        if (!Arrays.equals(bArr, f(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        bVarArr = l(fileInputStream, f(fileInputStream, 4), (String) dVar3.f629f);
                        try {
                            fileInputStream.close();
                        } catch (IOException e14) {
                            dVar.m(7, e14);
                        }
                        dVar3.f630g = bVarArr;
                    }
                    bVarArr2 = (b[]) dVar3.f630g;
                    if (bVarArr2 != null && (i7 = Build.VERSION.SDK_INT) <= 34) {
                        if (i7 != 25) {
                            switch (i7) {
                            }
                        }
                        g7 = dVar3.g(assets, "dexopt/baseline.profm");
                        if (g7 == null) {
                            try {
                                if (!Arrays.equals(f1851c, f(g7, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                dVar3.f630g = i(g7, f(g7, 4), bArr3, bVarArr2);
                                g7.close();
                                dVar2 = dVar3;
                                if (dVar2 != null) {
                                    dVar3 = dVar2;
                                }
                            } finally {
                            }
                        } else {
                            if (g7 != null) {
                                g7.close();
                            }
                            dVar2 = null;
                            if (dVar2 != null) {
                            }
                        }
                    }
                    d dVar42222 = (d) dVar3.f626c;
                    bVarArr3 = (b[]) dVar3.f630g;
                    byte[] bArr42222 = (byte[]) dVar3.f627d;
                    if (bVarArr3 != null && bArr42222 != null) {
                        if (dVar3.f624a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e15) {
                            dVar42222.m(7, e15);
                        } catch (IllegalStateException e16) {
                            dVar42222.m(8, e16);
                        }
                        if (o(byteArrayOutputStream, bArr42222, bVarArr3)) {
                            dVar3.f631h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            dVar3.f630g = null;
                        } else {
                            dVar42222.m(5, null);
                            dVar3.f630g = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = (byte[]) dVar3.f631h;
                    if (bArr2 == null) {
                        z8 = false;
                        z9 = true;
                    } else {
                        try {
                            if (!dVar3.f624a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) dVar3.f628e);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z9 = true;
                                                        try {
                                                            dVar3.h(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            dVar3.f631h = null;
                                                            dVar3.f630g = null;
                                                            z8 = true;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            Throwable th2 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th2;
                                                            } catch (Throwable th3) {
                                                                th2.addSuppressed(th3);
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                Throwable th5 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    th5.addSuppressed(th6);
                                                    throw th5;
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (FileNotFoundException e17) {
                                    e = e17;
                                    r72 = 1;
                                    dVar3.h(6, e);
                                    z7 = r72;
                                    z8 = false;
                                    z9 = z7;
                                    if (z8) {
                                    }
                                    z10 = z8;
                                    z11 = z9;
                                    l.c(context, (z10 || !z5) ? false : z11);
                                } catch (IOException e18) {
                                    e = e18;
                                    r7 = 1;
                                    dVar3.h(7, e);
                                    z7 = r7;
                                    z8 = false;
                                    z9 = z7;
                                    if (z8) {
                                    }
                                    z10 = z8;
                                    z11 = z9;
                                    l.c(context, (z10 || !z5) ? false : z11);
                                }
                            } catch (FileNotFoundException e19) {
                                e = e19;
                                dVar3.h(6, e);
                                z7 = r72;
                                z8 = false;
                                z9 = z7;
                                if (z8) {
                                }
                                z10 = z8;
                                z11 = z9;
                                l.c(context, (z10 || !z5) ? false : z11);
                            } catch (IOException e20) {
                                e = e20;
                                dVar3.h(7, e);
                                z7 = r7;
                                z8 = false;
                                z9 = z7;
                                if (z8) {
                                }
                                z10 = z8;
                                z11 = z9;
                                l.c(context, (z10 || !z5) ? false : z11);
                            }
                        } finally {
                            dVar3.f631h = null;
                            dVar3.f630g = null;
                        }
                    }
                    if (z8) {
                        e(packageInfo, filesDir);
                    }
                    z10 = z8;
                    z11 = z9;
                    l.c(context, (z10 || !z5) ? false : z11);
                } finally {
                }
                bArr = f1850b;
                r7 = 8;
                r72 = 8;
            }
            z6 = true;
            z10 = false;
            z11 = z6;
            l.c(context, (z10 || !z5) ? false : z11);
        } catch (PackageManager.NameNotFoundException e21) {
            dVar.m(7, e21);
            l.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j4, int i7) {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j4 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        t(byteArrayOutputStream, i7, 2);
    }
}
