package m;

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

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0071g {

    /* renamed from: a, reason: collision with root package name */
    public static final A.b f1006a = new A.b(9);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1007b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1008c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1009d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1010e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1011f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1012g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1013h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1014i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1015j = {48, 48, 50, 0};

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

    public static byte[] b(C0067c[] c0067cArr, byte[] bArr) {
        int i2 = 0;
        for (C0067c c0067c : c0067cArr) {
            i2 += ((((c0067c.f1002g * 2) + 7) & (-8)) / 8) + (c0067c.f1000e * 2) + d(c0067c.f996a, c0067c.f997b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0067c.f1001f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f1011f)) {
            for (C0067c c0067c2 : c0067cArr) {
                p(byteArrayOutputStream, c0067c2, d(c0067c2.f996a, c0067c2.f997b, bArr));
                r(byteArrayOutputStream, c0067c2);
                int[] iArr = c0067c2.f1003h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                q(byteArrayOutputStream, c0067c2);
            }
        } else {
            for (C0067c c0067c3 : c0067cArr) {
                p(byteArrayOutputStream, c0067c3, d(c0067c3.f996a, c0067c3.f997b, bArr));
            }
            for (C0067c c0067c4 : c0067cArr) {
                r(byteArrayOutputStream, c0067c4);
                int[] iArr2 = c0067c4.f1003h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                q(byteArrayOutputStream, c0067c4);
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
        boolean z = true;
        for (File file2 : listFiles) {
            z = c(file2) && z;
        }
        return z;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f1013h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1012g;
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

    public static byte[] f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + i2);
            }
            i3 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) m(byteArrayInputStream, 2);
            iArr[i4] = i3;
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
    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static C0067c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0067c[] c0067cArr) {
        byte[] bArr3 = f1014i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1015j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m2 = (int) m(fileInputStream, 2);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
            try {
                C0067c[] k2 = k(byteArrayInputStream, bArr2, m2, c0067cArr);
                byteArrayInputStream.close();
                return k2;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f1009d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m3 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h3);
        try {
            C0067c[] j2 = j(byteArrayInputStream2, m3, c0067cArr);
            byteArrayInputStream2.close();
            return j2;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C0067c[] j(ByteArrayInputStream byteArrayInputStream, int i2, C0067c[] c0067cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0067c[0];
        }
        if (i2 != c0067cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            iArr[i3] = (int) m(byteArrayInputStream, 2);
            strArr[i3] = new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0067c c0067c = c0067cArr[i4];
            if (!c0067c.f997b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c0067c.f1000e = i5;
            c0067c.f1003h = g(byteArrayInputStream, i5);
        }
        return c0067cArr;
    }

    public static C0067c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0067c[] c0067cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0067c[0];
        }
        if (i2 != c0067cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m2 = m(byteArrayInputStream, 4);
            int m3 = (int) m(byteArrayInputStream, 2);
            C0067c c0067c = null;
            if (c0067cArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= c0067cArr.length) {
                        break;
                    }
                    if (c0067cArr[i4].f997b.equals(substring)) {
                        c0067c = c0067cArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (c0067c == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0067c.f999d = m2;
            int[] g2 = g(byteArrayInputStream, m3);
            if (Arrays.equals(bArr, f1013h)) {
                c0067c.f1000e = m3;
                c0067c.f1003h = g2;
            }
        }
        return c0067cArr;
    }

    public static C0067c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f1010e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m2 = (int) m(fileInputStream, 1);
        byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
        try {
            C0067c[] n2 = n(byteArrayInputStream, str, m2);
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
        byte[] f2 = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (f2[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static C0067c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0067c[0];
        }
        C0067c[] c0067cArr = new C0067c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            int m3 = (int) m(byteArrayInputStream, 2);
            c0067cArr[i3] = new C0067c(str, new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m3, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m3], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0067c c0067c = c0067cArr[i4];
            int available = byteArrayInputStream.available() - c0067c.f1001f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c0067c.f1004i;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i5), 1);
                for (int m4 = (int) m(byteArrayInputStream, 2); m4 > 0; m4--) {
                    m(byteArrayInputStream, 2);
                    int m5 = (int) m(byteArrayInputStream, 1);
                    if (m5 != 6 && m5 != 7) {
                        while (m5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m6 = (int) m(byteArrayInputStream, 1); m6 > 0; m6--) {
                                m(byteArrayInputStream, 2);
                            }
                            m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0067c.f1003h = g(byteArrayInputStream, c0067c.f1000e);
            int i6 = c0067c.f1002g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = valueOf.get(i7) ? 2 : 0;
                if (valueOf.get(i7 + i6)) {
                    i8 |= 4;
                }
                if (i8 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                }
            }
        }
        return c0067cArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0067c[] c0067cArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1009d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1010e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(c0067cArr, bArr3);
                t(byteArrayOutputStream, c0067cArr.length, 1);
                t(byteArrayOutputStream, b2.length, 4);
                byte[] a2 = a(b2);
                t(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = f1012g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, c0067cArr.length, 1);
                for (C0067c c0067c : c0067cArr) {
                    int size = c0067c.f1004i.size() * 4;
                    String d2 = d(c0067c.f996a, c0067c.f997b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d2.getBytes(charset).length);
                    u(byteArrayOutputStream, c0067c.f1003h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, c0067c.f998c, 4);
                    byteArrayOutputStream.write(d2.getBytes(charset));
                    Iterator it = c0067c.f1004i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0067c.f1003h) {
                        u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1011f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b3 = b(c0067cArr, bArr5);
                t(byteArrayOutputStream, c0067cArr.length, 1);
                t(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr6 = f1013h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, c0067cArr.length);
            for (C0067c c0067c2 : c0067cArr) {
                String d3 = d(c0067c2.f996a, c0067c2.f997b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d3.getBytes(charset2).length);
                TreeMap treeMap = c0067c2.f1004i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, c0067c2.f1003h.length);
                t(byteArrayOutputStream, c0067c2.f998c, 4);
                byteArrayOutputStream.write(d3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0067c2.f1003h) {
                    u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, c0067cArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0067c c0067c3 : c0067cArr) {
                t(byteArrayOutputStream2, c0067c3.f998c, 4);
                t(byteArrayOutputStream2, c0067c3.f999d, 4);
                t(byteArrayOutputStream2, c0067c3.f1002g, 4);
                String d4 = d(c0067c3.f996a, c0067c3.f997b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d4.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(d4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C0080p c0080p = new C0080p(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0080p);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0067cArr.length) {
                try {
                    C0067c c0067c4 = c0067cArr[i7];
                    u(byteArrayOutputStream3, i7);
                    u(byteArrayOutputStream3, c0067c4.f1000e);
                    i8 = i8 + 4 + (c0067c4.f1000e * 2);
                    int[] iArr = c0067c4.f1003h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        u(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C0080p c0080p2 = new C0080p(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0080p2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c0067cArr.length) {
                try {
                    C0067c c0067c5 = c0067cArr[i11];
                    Iterator it3 = c0067c5.f1004i.entrySet().iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        i13 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, c0067c5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, c0067c5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i14 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i13);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i5 = 2;
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
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C0080p c0080p3 = new C0080p(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0080p3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                C0080p c0080p4 = (C0080p) arrayList2.get(i15);
                int i16 = c0080p4.f1026a;
                if (i16 == 1) {
                    j2 = 0;
                } else if (i16 == 2) {
                    j2 = 1;
                } else if (i16 == 3) {
                    j2 = 2;
                } else if (i16 == 4) {
                    j2 = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                t(byteArrayOutputStream, j2, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0080p4.f1027b;
                if (c0080p4.f1028c) {
                    long length5 = bArr7.length;
                    byte[] a4 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a4);
                    t(byteArrayOutputStream, a4.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a4.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C0067c c0067c, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, c0067c.f1000e);
        t(byteArrayOutputStream, c0067c.f1001f, 4);
        t(byteArrayOutputStream, c0067c.f998c, 4);
        t(byteArrayOutputStream, c0067c.f1002g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C0067c c0067c) {
        byte[] bArr = new byte[(((c0067c.f1002g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0067c.f1004i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + c0067c.f1002g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, C0067c c0067c) {
        int i2 = 0;
        for (Map.Entry entry : c0067c.f1004i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c2, code lost:
    
        if (r5 == null) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
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
    public static void s(Context context, Executor executor, InterfaceC0070f interfaceC0070f, boolean z) {
        boolean z2;
        ?? r6;
        IOException iOException;
        int i2;
        C0067c[] c0067cArr;
        C0067c[] c0067cArr2;
        C0066b c0066b;
        C0067c[] c0067cArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        FileOutputStream fileOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream a2;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = readLong == packageInfo.lastUpdateTime;
                            if (z5) {
                                interfaceC0070f.a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z5) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC0079o.c(context, false);
                        return;
                    }
                }
                z5 = false;
                if (z5) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0066b c0066b2 = new C0066b(assets, executor, interfaceC0070f, name, file2);
            byte[] bArr2 = c0066b2.f990c;
            if (bArr2 == null) {
                c0066b2.b(3, Integer.valueOf(i3));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z2 = true;
                        c0066b2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    c0066b2.b(4, null);
                }
                c0066b2.f993f = true;
                byte[] bArr3 = f1007b;
                try {
                    try {
                        r6 = c0066b2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        interfaceC0070f.a(6, e2);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        c0067cArr2 = c0066b2.f994g;
                        if (c0067cArr2 != null) {
                        }
                        c0066b = c0066b2;
                        InterfaceC0070f interfaceC0070f2 = c0066b.f989b;
                        c0067cArr3 = c0066b.f994g;
                        ?? r62 = r6;
                        if (c0067cArr3 != null) {
                        }
                        bArr = c0066b.f995h;
                        if (bArr == null) {
                        }
                        if (z4) {
                        }
                        AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                    } catch (IOException e3) {
                        interfaceC0070f.a(7, e3);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        c0067cArr2 = c0066b2.f994g;
                        if (c0067cArr2 != null) {
                        }
                        c0066b = c0066b2;
                        InterfaceC0070f interfaceC0070f22 = c0066b.f989b;
                        c0067cArr3 = c0066b.f994g;
                        ?? r622 = r6;
                        if (c0067cArr3 != null) {
                        }
                        bArr = c0066b.f995h;
                        if (bArr == null) {
                        }
                        if (z4) {
                        }
                        AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                    }
                    if (r6 != 0) {
                        try {
                        } catch (IOException e4) {
                            i2 = 7;
                            interfaceC0070f.a(7, e4);
                            try {
                                r6.close();
                            } catch (IOException e5) {
                                iOException = e5;
                                interfaceC0070f.a(i2, iOException);
                                c0067cArr = null;
                                r6 = r6;
                                c0066b2.f994g = c0067cArr;
                                c0067cArr2 = c0066b2.f994g;
                                if (c0067cArr2 != null) {
                                }
                                c0066b = c0066b2;
                                InterfaceC0070f interfaceC0070f222 = c0066b.f989b;
                                c0067cArr3 = c0066b.f994g;
                                ?? r6222 = r6;
                                if (c0067cArr3 != null) {
                                }
                                bArr = c0066b.f995h;
                                if (bArr == null) {
                                }
                                if (z4) {
                                }
                                AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                            }
                            c0067cArr = null;
                            r6 = r6;
                            c0066b2.f994g = c0067cArr;
                            c0067cArr2 = c0066b2.f994g;
                            if (c0067cArr2 != null) {
                            }
                            c0066b = c0066b2;
                            InterfaceC0070f interfaceC0070f2222 = c0066b.f989b;
                            c0067cArr3 = c0066b.f994g;
                            ?? r62222 = r6;
                            if (c0067cArr3 != null) {
                            }
                            bArr = c0066b.f995h;
                            if (bArr == null) {
                            }
                            if (z4) {
                            }
                            AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                        } catch (IllegalStateException e6) {
                            try {
                                interfaceC0070f.a(8, e6);
                                try {
                                    r6.close();
                                } catch (IOException e7) {
                                    iOException = e7;
                                    i2 = 7;
                                    interfaceC0070f.a(i2, iOException);
                                    c0067cArr = null;
                                    r6 = r6;
                                    c0066b2.f994g = c0067cArr;
                                    c0067cArr2 = c0066b2.f994g;
                                    if (c0067cArr2 != null) {
                                    }
                                    c0066b = c0066b2;
                                    InterfaceC0070f interfaceC0070f22222 = c0066b.f989b;
                                    c0067cArr3 = c0066b.f994g;
                                    ?? r622222 = r6;
                                    if (c0067cArr3 != null) {
                                    }
                                    bArr = c0066b.f995h;
                                    if (bArr == null) {
                                    }
                                    if (z4) {
                                    }
                                    AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                                }
                                c0067cArr = null;
                                r6 = r6;
                                c0066b2.f994g = c0067cArr;
                                c0067cArr2 = c0066b2.f994g;
                                if (c0067cArr2 != null) {
                                }
                                c0066b = c0066b2;
                                InterfaceC0070f interfaceC0070f222222 = c0066b.f989b;
                                c0067cArr3 = c0066b.f994g;
                                ?? r6222222 = r6;
                                if (c0067cArr3 != null) {
                                }
                                bArr = c0066b.f995h;
                                if (bArr == null) {
                                }
                                if (z4) {
                                }
                                AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    r6.close();
                                    throw th2;
                                } catch (IOException e8) {
                                    interfaceC0070f.a(7, e8);
                                    throw th2;
                                }
                            }
                        }
                        if (!Arrays.equals(bArr3, f(r6, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c0067cArr = l(r6, f(r6, 4), c0066b2.f992e);
                        try {
                            r6.close();
                            r6 = r6;
                        } catch (IOException e9) {
                            IOException iOException2 = e9;
                            interfaceC0070f.a(7, iOException2);
                            r6 = iOException2;
                        }
                        c0066b2.f994g = c0067cArr;
                    }
                    c0067cArr2 = c0066b2.f994g;
                    if (c0067cArr2 != null) {
                        int i4 = Build.VERSION.SDK_INT;
                        r6 = 34;
                        if (i4 <= 34) {
                            r6 = 25;
                            r6 = 25;
                            if (i4 != 25) {
                                switch (i4) {
                                }
                            }
                            try {
                                a2 = c0066b2.a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e10) {
                                interfaceC0070f.a(9, e10);
                            } catch (IOException e11) {
                                interfaceC0070f.a(7, e11);
                            } catch (IllegalStateException e12) {
                                c0066b2.f994g = null;
                                interfaceC0070f.a(8, e12);
                            }
                            if (a2 != null) {
                                try {
                                    boolean equals = Arrays.equals(f1008c, f(a2, 4));
                                    if (!equals) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c0066b2.f994g = i(a2, f(a2, 4), bArr2, c0067cArr2);
                                    a2.close();
                                    c0066b = c0066b2;
                                    r6 = equals;
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                }
                                c0066b = null;
                            }
                        }
                    }
                    c0066b = c0066b2;
                    InterfaceC0070f interfaceC0070f2222222 = c0066b.f989b;
                    c0067cArr3 = c0066b.f994g;
                    ?? r62222222 = r6;
                    if (c0067cArr3 != null) {
                        byte[] bArr4 = c0066b.f990c;
                        r62222222 = bArr4;
                        if (bArr4 != null) {
                            if (!c0066b.f993f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr3);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e13) {
                                interfaceC0070f2222222.a(7, e13);
                            } catch (IllegalStateException e14) {
                                interfaceC0070f2222222.a(8, e14);
                            }
                            if (o(byteArrayOutputStream, bArr4, c0067cArr3)) {
                                c0066b.f995h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                c0066b.f994g = null;
                                r62222222 = bArr4;
                            } else {
                                interfaceC0070f2222222.a(5, null);
                                c0066b.f994g = null;
                                byteArrayOutputStream.close();
                                r62222222 = bArr4;
                            }
                        }
                    }
                    bArr = c0066b.f995h;
                    if (bArr == null) {
                        z4 = false;
                        z2 = true;
                    } else {
                        try {
                            if (!c0066b.f993f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        fileOutputStream = new FileOutputStream(c0066b.f991d);
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    try {
                                        try {
                                            byte[] bArr5 = new byte[512];
                                            while (true) {
                                                int read = byteArrayInputStream.read(bArr5);
                                                if (read > 0) {
                                                    fileOutputStream.write(bArr5, 0, read);
                                                } else {
                                                    z2 = true;
                                                    try {
                                                        c0066b.b(1, null);
                                                        fileOutputStream.close();
                                                        byteArrayInputStream.close();
                                                        c0066b.f995h = null;
                                                        c0066b.f994g = null;
                                                        z4 = true;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        Throwable th5 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th5;
                                                        } catch (Throwable th6) {
                                                            th5.addSuppressed(th6);
                                                            throw th5;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        Throwable th9 = th;
                                        try {
                                            byteArrayInputStream.close();
                                            throw th9;
                                        } catch (Throwable th10) {
                                            th9.addSuppressed(th10);
                                            throw th9;
                                        }
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    c0066b.b(6, e);
                                    z3 = r62222222;
                                    z4 = false;
                                    z2 = z3;
                                    if (z4) {
                                    }
                                    AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                                } catch (IOException e16) {
                                    e = e16;
                                    c0066b.b(7, e);
                                    z3 = r62222222;
                                    z4 = false;
                                    z2 = z3;
                                    if (z4) {
                                    }
                                    AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                                }
                            } catch (FileNotFoundException e17) {
                                e = e17;
                                r62222222 = 1;
                                c0066b.b(6, e);
                                z3 = r62222222;
                                z4 = false;
                                z2 = z3;
                                if (z4) {
                                }
                                AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                            } catch (IOException e18) {
                                e = e18;
                                r62222222 = 1;
                                c0066b.b(7, e);
                                z3 = r62222222;
                                z4 = false;
                                z2 = z3;
                                if (z4) {
                                }
                                AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                            }
                        } finally {
                            c0066b.f995h = null;
                            c0066b.f994g = null;
                        }
                    }
                    if (z4) {
                        e(packageInfo, filesDir);
                    }
                    AbstractC0079o.c(context, (z4 || !z) ? false : z2);
                } catch (Throwable th11) {
                    th = th11;
                }
            }
            z2 = true;
            z4 = false;
            AbstractC0079o.c(context, (z4 || !z) ? false : z2);
        } catch (PackageManager.NameNotFoundException e19) {
            interfaceC0070f.a(7, e19);
            AbstractC0079o.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        t(byteArrayOutputStream, i2, 2);
    }
}
