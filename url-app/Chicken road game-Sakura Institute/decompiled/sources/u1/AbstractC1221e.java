package u1;

import A.AbstractC0017m;
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

/* renamed from: u1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1221e {

    /* renamed from: a, reason: collision with root package name */
    public static final H1.f f10909a = new H1.f(20, false);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f10910b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f10911c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f10912d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f10913e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f10914f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f10915g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f10916h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f10917i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f10918j = {48, 48, 50, 0};

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

    public static byte[] b(C1218b[] c1218bArr, byte[] bArr) {
        int i2 = 0;
        for (C1218b c1218b : c1218bArr) {
            i2 += ((((c1218b.f10906g * 2) + 7) & (-8)) / 8) + (c1218b.f10904e * 2) + d(c1218b.f10900a, c1218b.f10901b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1218b.f10905f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f10914f)) {
            for (C1218b c1218b2 : c1218bArr) {
                p(byteArrayOutputStream, c1218b2, d(c1218b2.f10900a, c1218b2.f10901b, bArr));
                r(byteArrayOutputStream, c1218b2);
                int[] iArr = c1218b2.f10907h;
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    u(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                q(byteArrayOutputStream, c1218b2);
            }
        } else {
            for (C1218b c1218b3 : c1218bArr) {
                p(byteArrayOutputStream, c1218b3, d(c1218b3.f10900a, c1218b3.f10901b, bArr));
            }
            for (C1218b c1218b4 : c1218bArr) {
                r(byteArrayOutputStream, c1218b4);
                int[] iArr2 = c1218b4.f10907h;
                int length2 = iArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2) {
                    int i9 = iArr2[i7];
                    u(byteArrayOutputStream, i9 - i8);
                    i7++;
                    i8 = i9;
                }
                q(byteArrayOutputStream, c1218b4);
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
        boolean z4 = true;
        for (File file2 : listFiles) {
            z4 = c(file2) && z4;
        }
        return z4;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f10916h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f10915g;
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
        return AbstractC0017m.n(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
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
        int i4 = 0;
        while (i4 < i2) {
            int read = inputStream.read(bArr, i4, i2 - i4);
            if (read < 0) {
                throw new IllegalStateException(AbstractC0017m.g(i2, "Not enough bytes to read: "));
            }
            i4 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
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
    public static byte[] h(FileInputStream fileInputStream, int i2, int i4) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[2048];
            int i5 = 0;
            int i6 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i5 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i6 += inflater.inflate(bArr, i6, i4 - i6);
                    i5 += read;
                } catch (DataFormatException e4) {
                    throw new IllegalStateException(e4.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i5);
        } finally {
            inflater.end();
        }
    }

    public static C1218b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1218b[] c1218bArr) {
        byte[] bArr3 = f10917i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f10918j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m4 = (int) m(fileInputStream, 2);
            byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
            try {
                C1218b[] k4 = k(byteArrayInputStream, bArr2, m4, c1218bArr);
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
        if (Arrays.equals(f10912d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m5 = (int) m(fileInputStream, 1);
        byte[] h5 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h5);
        try {
            C1218b[] j4 = j(byteArrayInputStream2, m5, c1218bArr);
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

    public static C1218b[] j(ByteArrayInputStream byteArrayInputStream, int i2, C1218b[] c1218bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1218b[0];
        }
        if (i2 != c1218bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            iArr[i4] = (int) m(byteArrayInputStream, 2);
            strArr[i4] = new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C1218b c1218b = c1218bArr[i5];
            if (!c1218b.f10901b.equals(strArr[i5])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            c1218b.f10904e = i6;
            c1218b.f10907h = g(byteArrayInputStream, i6);
        }
        return c1218bArr;
    }

    public static C1218b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C1218b[] c1218bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1218b[0];
        }
        if (i2 != c1218bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m4 = m(byteArrayInputStream, 4);
            int m5 = (int) m(byteArrayInputStream, 2);
            C1218b c1218b = null;
            if (c1218bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i5 = 0;
                while (true) {
                    if (i5 >= c1218bArr.length) {
                        break;
                    }
                    if (c1218bArr[i5].f10901b.equals(substring)) {
                        c1218b = c1218bArr[i5];
                        break;
                    }
                    i5++;
                }
            }
            if (c1218b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1218b.f10903d = m4;
            int[] g4 = g(byteArrayInputStream, m5);
            if (Arrays.equals(bArr, f10916h)) {
                c1218b.f10904e = m5;
                c1218b.f10907h = g4;
            }
        }
        return c1218bArr;
    }

    public static C1218b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f10913e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
        try {
            C1218b[] n2 = n(byteArrayInputStream, str, m4);
            byteArrayInputStream.close();
            return n2;
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
        byte[] f4 = f(inputStream, i2);
        long j4 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j4 += (f4[i4] & 255) << (i4 * 8);
        }
        return j4;
    }

    public static C1218b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C1218b[0];
        }
        C1218b[] c1218bArr = new C1218b[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            int m5 = (int) m(byteArrayInputStream, 2);
            c1218bArr[i4] = new C1218b(str, new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m5, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m5], new TreeMap());
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C1218b c1218b = c1218bArr[i5];
            int available = byteArrayInputStream.available() - c1218b.f10905f;
            int i6 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c1218b.f10908i;
                if (available2 <= available) {
                    break;
                }
                i6 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i6), 1);
                for (int m6 = (int) m(byteArrayInputStream, 2); m6 > 0; m6--) {
                    m(byteArrayInputStream, 2);
                    int m7 = (int) m(byteArrayInputStream, 1);
                    if (m7 != 6 && m7 != 7) {
                        while (m7 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m8 = (int) m(byteArrayInputStream, 1); m8 > 0; m8--) {
                                m(byteArrayInputStream, 2);
                            }
                            m7--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1218b.f10907h = g(byteArrayInputStream, c1218b.f10904e);
            int i7 = c1218b.f10906g;
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
        return c1218bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1218b[] c1218bArr) {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f10912d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f10913e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b4 = b(c1218bArr, bArr3);
                t(byteArrayOutputStream, c1218bArr.length, 1);
                t(byteArrayOutputStream, b4.length, 4);
                byte[] a4 = a(b4);
                t(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr4 = f10915g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, c1218bArr.length, 1);
                for (C1218b c1218b : c1218bArr) {
                    int size = c1218b.f10908i.size() * 4;
                    String d4 = d(c1218b.f10900a, c1218b.f10901b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d4.getBytes(charset).length);
                    u(byteArrayOutputStream, c1218b.f10907h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, c1218b.f10902c, 4);
                    byteArrayOutputStream.write(d4.getBytes(charset));
                    Iterator it = c1218b.f10908i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i4 : c1218b.f10907h) {
                        u(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr5 = f10914f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b5 = b(c1218bArr, bArr5);
                t(byteArrayOutputStream, c1218bArr.length, 1);
                t(byteArrayOutputStream, b5.length, 4);
                byte[] a5 = a(b5);
                t(byteArrayOutputStream, a5.length, 4);
                byteArrayOutputStream.write(a5);
                return true;
            }
            byte[] bArr6 = f10916h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, c1218bArr.length);
            for (C1218b c1218b2 : c1218bArr) {
                String d5 = d(c1218b2.f10900a, c1218b2.f10901b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d5.getBytes(charset2).length);
                TreeMap treeMap = c1218b2.f10908i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, c1218b2.f10907h.length);
                t(byteArrayOutputStream, c1218b2.f10902c, 4);
                byteArrayOutputStream.write(d5.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : c1218b2.f10907h) {
                    u(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, c1218bArr.length);
            int i6 = 2;
            int i7 = 2;
            for (C1218b c1218b3 : c1218bArr) {
                t(byteArrayOutputStream2, c1218b3.f10902c, 4);
                t(byteArrayOutputStream2, c1218b3.f10903d, 4);
                t(byteArrayOutputStream2, c1218b3.f10906g, 4);
                String d6 = d(c1218b3.f10900a, c1218b3.f10901b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d6.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(d6.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            l lVar = new l(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(lVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < c1218bArr.length) {
                try {
                    C1218b c1218b4 = c1218bArr[i8];
                    u(byteArrayOutputStream3, i8);
                    u(byteArrayOutputStream3, c1218b4.f10904e);
                    i9 = i9 + 4 + (c1218b4.f10904e * 2);
                    int[] iArr = c1218b4.f10907h;
                    int length3 = iArr.length;
                    int i10 = i2;
                    while (i2 < length3) {
                        int i11 = iArr[i2];
                        u(byteArrayOutputStream3, i11 - i10);
                        i2++;
                        i10 = i11;
                    }
                    i8++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            l lVar2 = new l(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < c1218bArr.length) {
                try {
                    C1218b c1218b5 = c1218bArr[i12];
                    Iterator it3 = c1218b5.f10908i.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, c1218b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, c1218b5);
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
            l lVar3 = new l(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar3);
            long j5 = 4;
            long size2 = j5 + j5 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i16 = 0;
            while (i16 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i16);
                int i17 = lVar4.f10928a;
                if (i17 == 1) {
                    j4 = 0;
                } else if (i17 == 2) {
                    j4 = 1;
                } else if (i17 == 3) {
                    j4 = 2;
                } else if (i17 == 4) {
                    j4 = 3;
                } else {
                    if (i17 != 5) {
                        throw null;
                    }
                    j4 = 4;
                }
                t(byteArrayOutputStream, j4, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = lVar4.f10929b;
                if (lVar4.f10930c) {
                    long length5 = bArr7.length;
                    byte[] a6 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a6);
                    t(byteArrayOutputStream, a6.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a6.length;
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C1218b c1218b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, c1218b.f10904e);
        t(byteArrayOutputStream, c1218b.f10905f, 4);
        t(byteArrayOutputStream, c1218b.f10902c, 4);
        t(byteArrayOutputStream, c1218b.f10906g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C1218b c1218b) {
        byte[] bArr = new byte[(((c1218b.f10906g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1218b.f10908i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i4 = intValue + c1218b.f10906g;
                int i5 = i4 / 8;
                bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, C1218b c1218b) {
        int i2 = 0;
        for (Map.Entry entry : c1218b.f10908i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bd, code lost:
    
        if (r5 == null) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c9  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, InterfaceC1220d interfaceC1220d, boolean z4) {
        boolean z5;
        ?? r6;
        IOException iOException;
        int i2;
        C1218b[] c1218bArr;
        C1218b[] c1218bArr2;
        C1217a c1217a;
        C1218b[] c1218bArr3;
        byte[] bArr;
        boolean z6;
        boolean z7;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream a4;
        boolean z8;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z4) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z8 = readLong == packageInfo.lastUpdateTime;
                            if (z8) {
                                interfaceC1220d.e(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z8) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC1227k.c(false, context);
                        return;
                    }
                }
                z8 = false;
                if (z8) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i4 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C1217a c1217a2 = new C1217a(assets, executor, interfaceC1220d, name, file2);
            byte[] bArr2 = c1217a2.f10894c;
            if (bArr2 == null) {
                c1217a2.b(3, Integer.valueOf(i4));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z5 = true;
                        c1217a2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    c1217a2.b(4, null);
                }
                c1217a2.f10897f = true;
                byte[] bArr3 = f10910b;
                try {
                    try {
                        r6 = c1217a2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e4) {
                        interfaceC1220d.e(6, e4);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        c1218bArr2 = c1217a2.f10898g;
                        if (c1218bArr2 != null) {
                        }
                        c1217a = c1217a2;
                        InterfaceC1220d interfaceC1220d2 = c1217a.f10893b;
                        c1218bArr3 = c1217a.f10898g;
                        ?? r62 = r6;
                        if (c1218bArr3 != null) {
                        }
                        bArr = c1217a.f10899h;
                        if (bArr != null) {
                        }
                        if (z7) {
                        }
                        AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                    } catch (IOException e5) {
                        interfaceC1220d.e(7, e5);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        c1218bArr2 = c1217a2.f10898g;
                        if (c1218bArr2 != null) {
                        }
                        c1217a = c1217a2;
                        InterfaceC1220d interfaceC1220d22 = c1217a.f10893b;
                        c1218bArr3 = c1217a.f10898g;
                        ?? r622 = r6;
                        if (c1218bArr3 != null) {
                        }
                        bArr = c1217a.f10899h;
                        if (bArr != null) {
                        }
                        if (z7) {
                        }
                        AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                    }
                    if (r6 != 0) {
                        try {
                        } catch (IOException e6) {
                            i2 = 7;
                            interfaceC1220d.e(7, e6);
                            try {
                                r6.close();
                            } catch (IOException e7) {
                                iOException = e7;
                                interfaceC1220d.e(i2, iOException);
                                c1218bArr = null;
                                r6 = r6;
                                c1217a2.f10898g = c1218bArr;
                                c1218bArr2 = c1217a2.f10898g;
                                if (c1218bArr2 != null) {
                                }
                                c1217a = c1217a2;
                                InterfaceC1220d interfaceC1220d222 = c1217a.f10893b;
                                c1218bArr3 = c1217a.f10898g;
                                ?? r6222 = r6;
                                if (c1218bArr3 != null) {
                                }
                                bArr = c1217a.f10899h;
                                if (bArr != null) {
                                }
                                if (z7) {
                                }
                                AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                            }
                            c1218bArr = null;
                            r6 = r6;
                            c1217a2.f10898g = c1218bArr;
                            c1218bArr2 = c1217a2.f10898g;
                            if (c1218bArr2 != null) {
                            }
                            c1217a = c1217a2;
                            InterfaceC1220d interfaceC1220d2222 = c1217a.f10893b;
                            c1218bArr3 = c1217a.f10898g;
                            ?? r62222 = r6;
                            if (c1218bArr3 != null) {
                            }
                            bArr = c1217a.f10899h;
                            if (bArr != null) {
                            }
                            if (z7) {
                            }
                            AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                        } catch (IllegalStateException e8) {
                            try {
                                interfaceC1220d.e(8, e8);
                                try {
                                    r6.close();
                                } catch (IOException e9) {
                                    iOException = e9;
                                    i2 = 7;
                                    interfaceC1220d.e(i2, iOException);
                                    c1218bArr = null;
                                    r6 = r6;
                                    c1217a2.f10898g = c1218bArr;
                                    c1218bArr2 = c1217a2.f10898g;
                                    if (c1218bArr2 != null) {
                                    }
                                    c1217a = c1217a2;
                                    InterfaceC1220d interfaceC1220d22222 = c1217a.f10893b;
                                    c1218bArr3 = c1217a.f10898g;
                                    ?? r622222 = r6;
                                    if (c1218bArr3 != null) {
                                    }
                                    bArr = c1217a.f10899h;
                                    if (bArr != null) {
                                    }
                                    if (z7) {
                                    }
                                    AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                                }
                                c1218bArr = null;
                                r6 = r6;
                                c1217a2.f10898g = c1218bArr;
                                c1218bArr2 = c1217a2.f10898g;
                                if (c1218bArr2 != null) {
                                }
                                c1217a = c1217a2;
                                InterfaceC1220d interfaceC1220d222222 = c1217a.f10893b;
                                c1218bArr3 = c1217a.f10898g;
                                ?? r6222222 = r6;
                                if (c1218bArr3 != null) {
                                }
                                bArr = c1217a.f10899h;
                                if (bArr != null) {
                                }
                                if (z7) {
                                }
                                AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    r6.close();
                                    throw th2;
                                } catch (IOException e10) {
                                    interfaceC1220d.e(7, e10);
                                    throw th2;
                                }
                            }
                        }
                        if (!Arrays.equals(bArr3, f(r6, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c1218bArr = l(r6, f(r6, 4), c1217a2.f10896e);
                        try {
                            r6.close();
                            r6 = r6;
                        } catch (IOException e11) {
                            IOException iOException2 = e11;
                            interfaceC1220d.e(7, iOException2);
                            r6 = iOException2;
                        }
                        c1217a2.f10898g = c1218bArr;
                    }
                    c1218bArr2 = c1217a2.f10898g;
                    if (c1218bArr2 != null) {
                        int i5 = Build.VERSION.SDK_INT;
                        r6 = 34;
                        r6 = 34;
                        r6 = 34;
                        if (i5 <= 34) {
                            switch (i5) {
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                    try {
                                        a4 = c1217a2.a(assets, "dexopt/baseline.profm");
                                    } catch (FileNotFoundException e12) {
                                        interfaceC1220d.e(9, e12);
                                    } catch (IOException e13) {
                                        interfaceC1220d.e(7, e13);
                                    } catch (IllegalStateException e14) {
                                        c1217a2.f10898g = null;
                                        interfaceC1220d.e(8, e14);
                                    }
                                    if (a4 == null) {
                                        if (a4 != null) {
                                            a4.close();
                                        }
                                        c1217a = null;
                                        break;
                                    } else {
                                        try {
                                            boolean equals = Arrays.equals(f10911c, f(a4, 4));
                                            if (!equals) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            c1217a2.f10898g = i(a4, f(a4, 4), bArr2, c1218bArr2);
                                            a4.close();
                                            c1217a = c1217a2;
                                            r6 = equals;
                                            break;
                                        } finally {
                                        }
                                    }
                                default:
                                    c1217a = c1217a2;
                                    InterfaceC1220d interfaceC1220d2222222 = c1217a.f10893b;
                                    c1218bArr3 = c1217a.f10898g;
                                    ?? r62222222 = r6;
                                    if (c1218bArr3 != null) {
                                        byte[] bArr4 = c1217a.f10894c;
                                        r62222222 = bArr4;
                                        if (bArr4 != null) {
                                            if (!c1217a.f10897f) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                try {
                                                    byteArrayOutputStream.write(bArr3);
                                                    byteArrayOutputStream.write(bArr4);
                                                } finally {
                                                }
                                            } catch (IOException e15) {
                                                interfaceC1220d2222222.e(7, e15);
                                            } catch (IllegalStateException e16) {
                                                interfaceC1220d2222222.e(8, e16);
                                            }
                                            if (o(byteArrayOutputStream, bArr4, c1218bArr3)) {
                                                c1217a.f10899h = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                c1217a.f10898g = null;
                                                r62222222 = bArr4;
                                            } else {
                                                interfaceC1220d2222222.e(5, null);
                                                c1217a.f10898g = null;
                                                byteArrayOutputStream.close();
                                                r62222222 = bArr4;
                                            }
                                        }
                                    }
                                    bArr = c1217a.f10899h;
                                    if (bArr != null) {
                                        z7 = false;
                                        z5 = true;
                                    } else {
                                        try {
                                            if (!c1217a.f10897f) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                try {
                                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                    try {
                                                        FileOutputStream fileOutputStream = new FileOutputStream(c1217a.f10895d);
                                                        try {
                                                            try {
                                                                byte[] bArr5 = new byte[512];
                                                                while (true) {
                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                    if (read > 0) {
                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                    } else {
                                                                        z5 = true;
                                                                        try {
                                                                            c1217a.b(1, null);
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            c1217a.f10899h = null;
                                                                            c1217a.f10898g = null;
                                                                            z7 = true;
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
                                                } catch (FileNotFoundException e17) {
                                                    e = e17;
                                                    r62222222 = 1;
                                                    c1217a.b(6, e);
                                                    z6 = r62222222;
                                                    z7 = false;
                                                    z5 = z6;
                                                    if (z7) {
                                                    }
                                                    AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                                                } catch (IOException e18) {
                                                    e = e18;
                                                    r62222222 = 1;
                                                    c1217a.b(7, e);
                                                    z6 = r62222222;
                                                    z7 = false;
                                                    z5 = z6;
                                                    if (z7) {
                                                    }
                                                    AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                                                }
                                            } catch (FileNotFoundException e19) {
                                                e = e19;
                                                c1217a.b(6, e);
                                                z6 = r62222222;
                                                z7 = false;
                                                z5 = z6;
                                                if (z7) {
                                                }
                                                AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                                            } catch (IOException e20) {
                                                e = e20;
                                                c1217a.b(7, e);
                                                z6 = r62222222;
                                                z7 = false;
                                                z5 = z6;
                                                if (z7) {
                                                }
                                                AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                                            }
                                        } finally {
                                            c1217a.f10899h = null;
                                            c1217a.f10898g = null;
                                        }
                                    }
                                    if (z7) {
                                        e(packageInfo, filesDir);
                                    }
                                    AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                            }
                        }
                    }
                    c1217a = c1217a2;
                    InterfaceC1220d interfaceC1220d22222222 = c1217a.f10893b;
                    c1218bArr3 = c1217a.f10898g;
                    ?? r622222222 = r6;
                    if (c1218bArr3 != null) {
                    }
                    bArr = c1217a.f10899h;
                    if (bArr != null) {
                    }
                    if (z7) {
                    }
                    AbstractC1227k.c((z7 || !z4) ? false : z5, context);
                } catch (Throwable th11) {
                    th = th11;
                }
            }
            z5 = true;
            z7 = false;
            AbstractC1227k.c((z7 || !z4) ? false : z5, context);
        } catch (PackageManager.NameNotFoundException e21) {
            interfaceC1220d.e(7, e21);
            AbstractC1227k.c(false, context);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j4, int i2) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((j4 >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        t(byteArrayOutputStream, i2, 2);
    }
}
