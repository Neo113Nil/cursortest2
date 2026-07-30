package e0;

import C4.p;
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

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final q1.h f4684a = new q1.h(14);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4685b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f4686c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f4687d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4688e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f4689f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f4690g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f4691h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f4692i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

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

    public static byte[] b(C0371b[] c0371bArr, byte[] bArr) {
        int i2 = 0;
        for (C0371b c0371b : c0371bArr) {
            i2 += ((((c0371b.f4680g * 2) + 7) & (-8)) / 8) + (c0371b.f4678e * 2) + d(bArr, c0371b.f4674a, c0371b.f4675b).getBytes(StandardCharsets.UTF_8).length + 16 + c0371b.f4679f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f4689f)) {
            for (C0371b c0371b2 : c0371bArr) {
                p(byteArrayOutputStream, c0371b2, d(bArr, c0371b2.f4674a, c0371b2.f4675b));
                r(byteArrayOutputStream, c0371b2);
                int[] iArr = c0371b2.f4681h;
                int length = iArr.length;
                int i5 = 0;
                int i7 = 0;
                while (i5 < length) {
                    int i8 = iArr[i5];
                    u(byteArrayOutputStream, i8 - i7);
                    i5++;
                    i7 = i8;
                }
                q(byteArrayOutputStream, c0371b2);
            }
        } else {
            for (C0371b c0371b3 : c0371bArr) {
                p(byteArrayOutputStream, c0371b3, d(bArr, c0371b3.f4674a, c0371b3.f4675b));
            }
            for (C0371b c0371b4 : c0371bArr) {
                r(byteArrayOutputStream, c0371b4);
                int[] iArr2 = c0371b4.f4681h;
                int length2 = iArr2.length;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length2) {
                    int i11 = iArr2[i9];
                    u(byteArrayOutputStream, i11 - i10);
                    i9++;
                    i10 = i11;
                }
                q(byteArrayOutputStream, c0371b4);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
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
        boolean z7 = true;
        for (File file2 : listFiles) {
            z7 = c(file2) && z7;
        }
        return z7;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f4691h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f4690g;
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
                return r4.f.f(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
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

    public static byte[] f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i5 = 0;
        while (i5 < i2) {
            int read = inputStream.read(bArr, i5, i2 - i5);
            if (read < 0) {
                throw new IllegalStateException(p.g(i2, "Not enough bytes to read: "));
            }
            i5 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i5 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            i5 += (int) m(byteArrayInputStream, 2);
            iArr[i7] = i5;
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
    public static byte[] h(FileInputStream fileInputStream, int i2, int i5) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i5];
            byte[] bArr2 = new byte[2048];
            int i7 = 0;
            int i8 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i7 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i8 += inflater.inflate(bArr, i8, i5 - i8);
                    i7 += read;
                } catch (DataFormatException e7) {
                    throw new IllegalStateException(e7.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i7);
        } finally {
            inflater.end();
        }
    }

    public static C0371b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0371b[] c0371bArr) {
        byte[] bArr3 = f4692i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m2 = (int) m(fileInputStream, 2);
            byte[] h7 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
            try {
                C0371b[] k7 = k(byteArrayInputStream, bArr2, m2, c0371bArr);
                byteArrayInputStream.close();
                return k7;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f4687d, bArr2)) {
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
            C0371b[] j7 = j(byteArrayInputStream2, m7, c0371bArr);
            byteArrayInputStream2.close();
            return j7;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C0371b[] j(ByteArrayInputStream byteArrayInputStream, int i2, C0371b[] c0371bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0371b[0];
        }
        if (i2 != c0371bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            iArr[i5] = (int) m(byteArrayInputStream, 2);
            strArr[i5] = new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8);
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C0371b c0371b = c0371bArr[i7];
            if (!c0371b.f4675b.equals(strArr[i7])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i8 = iArr[i7];
            c0371b.f4678e = i8;
            c0371b.f4681h = g(byteArrayInputStream, i8);
        }
        return c0371bArr;
    }

    public static C0371b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0371b[] c0371bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0371b[0];
        }
        if (i2 != c0371bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i2; i5++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m2 = m(byteArrayInputStream, 4);
            int m7 = (int) m(byteArrayInputStream, 2);
            C0371b c0371b = null;
            if (c0371bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i7 = 0;
                while (true) {
                    if (i7 >= c0371bArr.length) {
                        break;
                    }
                    if (c0371bArr[i7].f4675b.equals(substring)) {
                        c0371b = c0371bArr[i7];
                        break;
                    }
                    i7++;
                }
            }
            if (c0371b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0371b.f4677d = m2;
            int[] g7 = g(byteArrayInputStream, m7);
            if (Arrays.equals(bArr, f4691h)) {
                c0371b.f4678e = m7;
                c0371b.f4681h = g7;
            }
        }
        return c0371bArr;
    }

    public static C0371b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f4688e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m2 = (int) m(fileInputStream, 1);
        byte[] h7 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
        try {
            C0371b[] n7 = n(byteArrayInputStream, str, m2);
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

    public static long m(InputStream inputStream, int i2) {
        byte[] f7 = f(inputStream, i2);
        long j7 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j7 += (f7[i5] & 255) << (i5 * 8);
        }
        return j7;
    }

    public static C0371b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i5 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0371b[0];
        }
        C0371b[] c0371bArr = new C0371b[i2];
        for (int i7 = 0; i7 < i2; i7++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            int m7 = (int) m(byteArrayInputStream, 2);
            c0371bArr[i7] = new C0371b(str, new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m7, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m7], new TreeMap());
        }
        int i8 = 0;
        while (i8 < i2) {
            C0371b c0371b = c0371bArr[i8];
            int available = byteArrayInputStream.available();
            int i9 = c0371b.f4679f;
            int i10 = c0371b.f4680g;
            TreeMap treeMap = c0371b.f4682i;
            int i11 = available - i9;
            int i12 = i5;
            while (byteArrayInputStream.available() > i11) {
                i12 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i12), 1);
                int m8 = (int) m(byteArrayInputStream, 2);
                while (m8 > 0) {
                    m(byteArrayInputStream, 2);
                    int m9 = (int) m(byteArrayInputStream, 1);
                    if (m9 != 6 && m9 != 7) {
                        while (m9 > 0) {
                            m(byteArrayInputStream, 1);
                            int i13 = i5;
                            int i14 = i8;
                            for (int m10 = (int) m(byteArrayInputStream, 1); m10 > 0; m10--) {
                                m(byteArrayInputStream, 2);
                            }
                            m9--;
                            i5 = i13;
                            i8 = i14;
                        }
                    }
                    m8--;
                    i5 = i5;
                    i8 = i8;
                }
            }
            int i15 = i5;
            int i16 = i8;
            if (byteArrayInputStream.available() != i11) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0371b.f4681h = g(byteArrayInputStream, c0371b.f4678e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i10 * 2) + 7) & (-8)) / 8));
            for (int i17 = i15; i17 < i10; i17++) {
                int i18 = valueOf.get(i17) ? 2 : i15;
                if (valueOf.get(i17 + i10)) {
                    i18 |= 4;
                }
                if (i18 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i17));
                    if (num == null) {
                        num = Integer.valueOf(i15);
                    }
                    treeMap.put(Integer.valueOf(i17), Integer.valueOf(i18 | num.intValue()));
                }
            }
            i8 = i16 + 1;
            i5 = i15;
        }
        return c0371bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0371b[] c0371bArr) {
        long j7;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f4687d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f4688e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b7 = b(c0371bArr, bArr3);
                t(byteArrayOutputStream, c0371bArr.length, 1);
                t(byteArrayOutputStream, b7.length, 4);
                byte[] a7 = a(b7);
                t(byteArrayOutputStream, a7.length, 4);
                byteArrayOutputStream.write(a7);
                return true;
            }
            byte[] bArr4 = f4690g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, c0371bArr.length, 1);
                for (C0371b c0371b : c0371bArr) {
                    int size = c0371b.f4682i.size() * 4;
                    String d7 = d(bArr4, c0371b.f4674a, c0371b.f4675b);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d7.getBytes(charset).length);
                    u(byteArrayOutputStream, c0371b.f4681h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, c0371b.f4676c, 4);
                    byteArrayOutputStream.write(d7.getBytes(charset));
                    Iterator it = c0371b.f4682i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i5 : c0371b.f4681h) {
                        u(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr5 = f4689f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b8 = b(c0371bArr, bArr5);
                t(byteArrayOutputStream, c0371bArr.length, 1);
                t(byteArrayOutputStream, b8.length, 4);
                byte[] a8 = a(b8);
                t(byteArrayOutputStream, a8.length, 4);
                byteArrayOutputStream.write(a8);
                return true;
            }
            byte[] bArr6 = f4691h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, c0371bArr.length);
            for (C0371b c0371b2 : c0371bArr) {
                String str = c0371b2.f4674a;
                TreeMap treeMap = c0371b2.f4682i;
                String d8 = d(bArr6, str, c0371b2.f4675b);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d8.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, c0371b2.f4681h.length);
                t(byteArrayOutputStream, c0371b2.f4676c, 4);
                byteArrayOutputStream.write(d8.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i7 : c0371b2.f4681h) {
                    u(byteArrayOutputStream, i7);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, c0371bArr.length);
            int i8 = 2;
            int i9 = 2;
            for (C0371b c0371b3 : c0371bArr) {
                t(byteArrayOutputStream2, c0371b3.f4676c, 4);
                t(byteArrayOutputStream2, c0371b3.f4677d, 4);
                t(byteArrayOutputStream2, c0371b3.f4680g, 4);
                String d9 = d(bArr2, c0371b3.f4674a, c0371b3.f4675b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d9.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i9 = i9 + 14 + length2;
                byteArrayOutputStream2.write(d9.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i9 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            }
            m mVar = new m(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < c0371bArr.length) {
                try {
                    C0371b c0371b4 = c0371bArr[i10];
                    u(byteArrayOutputStream3, i10);
                    u(byteArrayOutputStream3, c0371b4.f4678e);
                    i11 = i11 + 4 + (c0371b4.f4678e * i8);
                    int[] iArr = c0371b4.f4681h;
                    int length3 = iArr.length;
                    int i12 = i2;
                    int i13 = i8;
                    int i14 = i12;
                    while (i14 < length3) {
                        int i15 = iArr[i14];
                        u(byteArrayOutputStream3, i15 - i12);
                        i14++;
                        i12 = i15;
                    }
                    i10++;
                    i8 = i13;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
            }
            m mVar2 = new m(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i16 = 0;
            int i17 = 0;
            while (i16 < c0371bArr.length) {
                try {
                    C0371b c0371b5 = c0371bArr[i16];
                    Iterator it3 = c0371b5.f4682i.entrySet().iterator();
                    int i18 = 0;
                    while (it3.hasNext()) {
                        i18 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, c0371b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, c0371b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i16);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i19 = i17 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i18);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i17 = i19 + length4;
                            i16++;
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
            if (i17 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
            }
            m mVar3 = new m(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar3);
            long j8 = 4;
            long size2 = j8 + j8 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                m mVar4 = (m) arrayList2.get(i20);
                int i21 = mVar4.f4703a;
                byte[] bArr7 = mVar4.f4704b;
                if (i21 == 1) {
                    j7 = 0;
                } else if (i21 == 2) {
                    j7 = 1;
                } else if (i21 == 3) {
                    j7 = 2;
                } else if (i21 == 4) {
                    j7 = 3;
                } else {
                    if (i21 != 5) {
                        throw null;
                    }
                    j7 = 4;
                }
                t(byteArrayOutputStream, j7, 4);
                t(byteArrayOutputStream, size2, 4);
                if (mVar4.f4705c) {
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
                i20++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C0371b c0371b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, c0371b.f4678e);
        t(byteArrayOutputStream, c0371b.f4679f, 4);
        t(byteArrayOutputStream, c0371b.f4676c, 4);
        t(byteArrayOutputStream, c0371b.f4680g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C0371b c0371b) {
        byte[] bArr = new byte[(((c0371b.f4680g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0371b.f4682i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i5 = intValue + c0371b.f4680g;
                int i7 = i5 / 8;
                bArr[i7] = (byte) ((1 << (i5 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, C0371b c0371b) {
        int i2 = 0;
        for (Map.Entry entry : c0371b.f4682i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, d dVar, boolean z7) {
        boolean z8;
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r7;
        C0371b[] c0371bArr;
        C0371b[] c0371bArr2;
        C0371b[] c0371bArr3;
        byte[] bArr2;
        boolean z9;
        boolean z10;
        ?? r72;
        boolean z11;
        boolean z12;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        C0370a c0370a;
        FileInputStream g7;
        boolean z13;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z7) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z14 = readLong == packageInfo.lastUpdateTime;
                            if (z14) {
                                dVar.m(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z14) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        l.c(context, false);
                        return;
                    }
                }
                z14 = false;
                if (z14) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i5 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0370a c0370a2 = new C0370a(assets, executor, dVar, name, file2);
            byte[] bArr3 = (byte[]) c0370a2.f4669d;
            if (bArr3 == null) {
                c0370a2.h(3, Integer.valueOf(i5));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z8 = true;
                        c0370a2.h(4, null);
                    }
                } else if (!file2.canWrite()) {
                    c0370a2.h(4, null);
                }
                c0370a2.f4666a = true;
                try {
                    try {
                        fileInputStream = c0370a2.g(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e7) {
                        dVar.m(6, e7);
                        fileInputStream = null;
                        bArr = f4685b;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        c0371bArr2 = (C0371b[]) c0370a2.f4673h;
                        if (c0371bArr2 != null) {
                            if (i2 != 24) {
                                switch (i2) {
                                }
                            }
                            try {
                                g7 = c0370a2.g(assets, "dexopt/baseline.profm");
                                if (g7 == null) {
                                }
                            } catch (FileNotFoundException e8) {
                                dVar.m(9, e8);
                            } catch (IOException e9) {
                                dVar.m(7, e9);
                            } catch (IllegalStateException e10) {
                                c0370a2.f4673h = null;
                                dVar.m(8, e10);
                            }
                        }
                        d dVar2 = (d) c0370a2.f4668c;
                        c0371bArr3 = (C0371b[]) c0370a2.f4673h;
                        byte[] bArr4 = (byte[]) c0370a2.f4669d;
                        if (c0371bArr3 != null) {
                            if (c0370a2.f4666a) {
                            }
                        }
                        bArr2 = (byte[]) c0370a2.f4670e;
                        if (bArr2 == null) {
                        }
                        if (z10) {
                        }
                        z12 = z10;
                        z13 = z11;
                        l.c(context, (z12 || !z7) ? false : z13);
                    } catch (IOException e11) {
                        dVar.m(7, e11);
                        fileInputStream = null;
                        bArr = f4685b;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        c0371bArr2 = (C0371b[]) c0370a2.f4673h;
                        if (c0371bArr2 != null) {
                        }
                        d dVar22 = (d) c0370a2.f4668c;
                        c0371bArr3 = (C0371b[]) c0370a2.f4673h;
                        byte[] bArr42 = (byte[]) c0370a2.f4669d;
                        if (c0371bArr3 != null) {
                        }
                        bArr2 = (byte[]) c0370a2.f4670e;
                        if (bArr2 == null) {
                        }
                        if (z10) {
                        }
                        z12 = z10;
                        z13 = z11;
                        l.c(context, (z12 || !z7) ? false : z13);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e12) {
                            dVar.m(7, e12);
                            try {
                                fileInputStream.close();
                            } catch (IOException e13) {
                                dVar.m(7, e13);
                            }
                            c0371bArr = null;
                            c0370a2.f4673h = c0371bArr;
                            c0371bArr2 = (C0371b[]) c0370a2.f4673h;
                            if (c0371bArr2 != null) {
                            }
                            d dVar222 = (d) c0370a2.f4668c;
                            c0371bArr3 = (C0371b[]) c0370a2.f4673h;
                            byte[] bArr422 = (byte[]) c0370a2.f4669d;
                            if (c0371bArr3 != null) {
                            }
                            bArr2 = (byte[]) c0370a2.f4670e;
                            if (bArr2 == null) {
                            }
                            if (z10) {
                            }
                            z12 = z10;
                            z13 = z11;
                            l.c(context, (z12 || !z7) ? false : z13);
                        } catch (IllegalStateException e14) {
                            dVar.m(8, e14);
                            fileInputStream.close();
                            c0371bArr = null;
                            c0370a2.f4673h = c0371bArr;
                            c0371bArr2 = (C0371b[]) c0370a2.f4673h;
                            if (c0371bArr2 != null) {
                            }
                            d dVar2222 = (d) c0370a2.f4668c;
                            c0371bArr3 = (C0371b[]) c0370a2.f4673h;
                            byte[] bArr4222 = (byte[]) c0370a2.f4669d;
                            if (c0371bArr3 != null) {
                            }
                            bArr2 = (byte[]) c0370a2.f4670e;
                            if (bArr2 == null) {
                            }
                            if (z10) {
                            }
                            z12 = z10;
                            z13 = z11;
                            l.c(context, (z12 || !z7) ? false : z13);
                        }
                        if (!Arrays.equals(bArr, f(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c0371bArr = l(fileInputStream, f(fileInputStream, 4), (String) c0370a2.f4672g);
                        try {
                            fileInputStream.close();
                        } catch (IOException e15) {
                            dVar.m(7, e15);
                        }
                        c0370a2.f4673h = c0371bArr;
                    }
                    c0371bArr2 = (C0371b[]) c0370a2.f4673h;
                    if (c0371bArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                        if (i2 != 24 && i2 != 25) {
                            switch (i2) {
                            }
                        }
                        g7 = c0370a2.g(assets, "dexopt/baseline.profm");
                        if (g7 == null) {
                            try {
                                if (!Arrays.equals(f4686c, f(g7, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c0370a2.f4673h = i(g7, f(g7, 4), bArr3, c0371bArr2);
                                g7.close();
                                c0370a = c0370a2;
                                if (c0370a != null) {
                                    c0370a2 = c0370a;
                                }
                            } finally {
                            }
                        } else {
                            if (g7 != null) {
                                g7.close();
                            }
                            c0370a = null;
                            if (c0370a != null) {
                            }
                        }
                    }
                    d dVar22222 = (d) c0370a2.f4668c;
                    c0371bArr3 = (C0371b[]) c0370a2.f4673h;
                    byte[] bArr42222 = (byte[]) c0370a2.f4669d;
                    if (c0371bArr3 != null && bArr42222 != null) {
                        if (c0370a2.f4666a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e16) {
                            dVar22222.m(7, e16);
                        } catch (IllegalStateException e17) {
                            dVar22222.m(8, e17);
                        }
                        if (o(byteArrayOutputStream, bArr42222, c0371bArr3)) {
                            c0370a2.f4670e = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            c0370a2.f4673h = null;
                        } else {
                            dVar22222.m(5, null);
                            c0370a2.f4673h = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = (byte[]) c0370a2.f4670e;
                    if (bArr2 == null) {
                        z10 = false;
                        z11 = true;
                    } else {
                        try {
                            if (!c0370a2.f4666a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) c0370a2.f4671f);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z11 = true;
                                                        try {
                                                            c0370a2.h(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            c0370a2.f4670e = null;
                                                            c0370a2.f4673h = null;
                                                            z10 = true;
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
                                } catch (FileNotFoundException e18) {
                                    e = e18;
                                    r72 = 1;
                                    c0370a2.h(6, e);
                                    z9 = r72;
                                    z10 = false;
                                    z11 = z9;
                                    if (z10) {
                                    }
                                    z12 = z10;
                                    z13 = z11;
                                    l.c(context, (z12 || !z7) ? false : z13);
                                } catch (IOException e19) {
                                    e = e19;
                                    r7 = 1;
                                    c0370a2.h(7, e);
                                    z9 = r7;
                                    z10 = false;
                                    z11 = z9;
                                    if (z10) {
                                    }
                                    z12 = z10;
                                    z13 = z11;
                                    l.c(context, (z12 || !z7) ? false : z13);
                                }
                            } catch (FileNotFoundException e20) {
                                e = e20;
                                c0370a2.h(6, e);
                                z9 = r72;
                                z10 = false;
                                z11 = z9;
                                if (z10) {
                                }
                                z12 = z10;
                                z13 = z11;
                                l.c(context, (z12 || !z7) ? false : z13);
                            } catch (IOException e21) {
                                e = e21;
                                c0370a2.h(7, e);
                                z9 = r7;
                                z10 = false;
                                z11 = z9;
                                if (z10) {
                                }
                                z12 = z10;
                                z13 = z11;
                                l.c(context, (z12 || !z7) ? false : z13);
                            }
                        } finally {
                            c0370a2.f4670e = null;
                            c0370a2.f4673h = null;
                        }
                    }
                    if (z10) {
                        e(packageInfo, filesDir);
                    }
                    z12 = z10;
                    z13 = z11;
                    l.c(context, (z12 || !z7) ? false : z13);
                } finally {
                }
                bArr = f4685b;
                r7 = 8;
                r72 = 8;
            }
            z8 = true;
            z12 = false;
            z13 = z8;
            l.c(context, (z12 || !z7) ? false : z13);
        } catch (PackageManager.NameNotFoundException e22) {
            dVar.m(7, e22);
            l.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j7, int i2) {
        byte[] bArr = new byte[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr[i5] = (byte) ((j7 >> (i5 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        t(byteArrayOutputStream, i2, 2);
    }
}
