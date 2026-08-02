package j1;

import E.AbstractC0005f;
import a0.C0144j;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
    public static final C0144j f13875a = new C0144j(11, false);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f13876b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f13877c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f13878d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f13879e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f13880f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f13881g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f13882h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f13883i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f13884j = {48, 48, 50, 0};

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

    public static byte[] b(C1173b[] c1173bArr, byte[] bArr) {
        int i4 = 0;
        for (C1173b c1173b : c1173bArr) {
            i4 += ((((c1173b.f13871g * 2) + 7) & (-8)) / 8) + (c1173b.f13869e * 2) + d(bArr, c1173b.f13865a, c1173b.f13866b).getBytes(StandardCharsets.UTF_8).length + 16 + c1173b.f13870f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i4);
        if (Arrays.equals(bArr, f13880f)) {
            for (C1173b c1173b2 : c1173bArr) {
                p(byteArrayOutputStream, c1173b2, d(bArr, c1173b2.f13865a, c1173b2.f13866b));
                r(byteArrayOutputStream, c1173b2);
                int[] iArr = c1173b2.f13872h;
                int length = iArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = iArr[i5];
                    u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                q(byteArrayOutputStream, c1173b2);
            }
        } else {
            for (C1173b c1173b3 : c1173bArr) {
                p(byteArrayOutputStream, c1173b3, d(bArr, c1173b3.f13865a, c1173b3.f13866b));
            }
            for (C1173b c1173b4 : c1173bArr) {
                r(byteArrayOutputStream, c1173b4);
                int[] iArr2 = c1173b4.f13872h;
                int length2 = iArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2) {
                    int i10 = iArr2[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, c1173b4);
            }
        }
        if (byteArrayOutputStream.size() == i4) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i4);
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

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f13882h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f13881g;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
            }
            if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                if ("!".equals(obj)) {
                    return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
                }
                if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                    return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return AbstractC0005f.q(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
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

    public static byte[] f(InputStream inputStream, int i4) {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = inputStream.read(bArr, i5, i4 - i5);
            if (read < 0) {
                throw new IllegalStateException(AbstractC0005f.j(i4, "Not enough bytes to read: "));
            }
            i5 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += (int) m(byteArrayInputStream, 2);
            iArr[i6] = i5;
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
    public static byte[] h(FileInputStream fileInputStream, int i4, int i5) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i5];
            byte[] bArr2 = new byte[2048];
            int i6 = 0;
            int i7 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i6 < i4) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i7 += inflater.inflate(bArr, i7, i5 - i7);
                    i6 += read;
                } catch (DataFormatException e4) {
                    throw new IllegalStateException(e4.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i6);
        } finally {
            inflater.end();
        }
    }

    public static C1173b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1173b[] c1173bArr) {
        byte[] bArr3 = f13883i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f13884j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m4 = (int) m(fileInputStream, 2);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
            try {
                C1173b[] k4 = k(byteArrayInputStream, bArr2, m4, c1173bArr);
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
        if (Arrays.equals(f13878d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m5 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
        try {
            C1173b[] j4 = j(byteArrayInputStream2, m5, c1173bArr);
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

    public static C1173b[] j(ByteArrayInputStream byteArrayInputStream, int i4, C1173b[] c1173bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1173b[0];
        }
        if (i4 != c1173bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            iArr[i5] = (int) m(byteArrayInputStream, 2);
            strArr[i5] = new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            C1173b c1173b = c1173bArr[i6];
            if (!c1173b.f13866b.equals(strArr[i6])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            c1173b.f13869e = i7;
            c1173b.f13872h = g(byteArrayInputStream, i7);
        }
        return c1173bArr;
    }

    public static C1173b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, C1173b[] c1173bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1173b[0];
        }
        if (i4 != c1173bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m4 = m(byteArrayInputStream, 4);
            int m5 = (int) m(byteArrayInputStream, 2);
            C1173b c1173b = null;
            if (c1173bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i6 = 0;
                while (true) {
                    if (i6 >= c1173bArr.length) {
                        break;
                    }
                    if (c1173bArr[i6].f13866b.equals(substring)) {
                        c1173b = c1173bArr[i6];
                        break;
                    }
                    i6++;
                }
            }
            if (c1173b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1173b.f13868d = m4;
            int[] g4 = g(byteArrayInputStream, m5);
            if (Arrays.equals(bArr, f13882h)) {
                c1173b.f13869e = m5;
                c1173b.f13872h = g4;
            }
        }
        return c1173bArr;
    }

    public static C1173b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f13879e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
        try {
            C1173b[] n = n(byteArrayInputStream, str, m4);
            byteArrayInputStream.close();
            return n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i4) {
        byte[] f4 = f(inputStream, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += (f4[i5] & 255) << (i5 * 8);
        }
        return j4;
    }

    public static C1173b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i4) {
        int i5 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C1173b[0];
        }
        C1173b[] c1173bArr = new C1173b[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            int m5 = (int) m(byteArrayInputStream, 2);
            c1173bArr[i6] = new C1173b(str, new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m5, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m5], new TreeMap());
        }
        int i7 = 0;
        while (i7 < i4) {
            C1173b c1173b = c1173bArr[i7];
            int available = byteArrayInputStream.available();
            int i8 = c1173b.f13870f;
            int i9 = c1173b.f13871g;
            TreeMap treeMap = c1173b.f13873i;
            int i10 = available - i8;
            int i11 = i5;
            while (byteArrayInputStream.available() > i10) {
                i11 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i11), 1);
                int m6 = (int) m(byteArrayInputStream, 2);
                while (m6 > 0) {
                    m(byteArrayInputStream, 2);
                    int m7 = (int) m(byteArrayInputStream, 1);
                    if (m7 != 6 && m7 != 7) {
                        while (m7 > 0) {
                            m(byteArrayInputStream, 1);
                            int i12 = i5;
                            int i13 = i7;
                            for (int m8 = (int) m(byteArrayInputStream, 1); m8 > 0; m8--) {
                                m(byteArrayInputStream, 2);
                            }
                            m7--;
                            i5 = i12;
                            i7 = i13;
                        }
                    }
                    m6--;
                    i5 = i5;
                    i7 = i7;
                }
            }
            int i14 = i5;
            int i15 = i7;
            if (byteArrayInputStream.available() != i10) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1173b.f13872h = g(byteArrayInputStream, c1173b.f13869e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i9 * 2) + 7) & (-8)) / 8));
            for (int i16 = i14; i16 < i9; i16++) {
                int i17 = valueOf.get(i16) ? 2 : i14;
                if (valueOf.get(i16 + i9)) {
                    i17 |= 4;
                }
                if (i17 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i16));
                    if (num == null) {
                        num = Integer.valueOf(i14);
                    }
                    treeMap.put(Integer.valueOf(i16), Integer.valueOf(i17 | num.intValue()));
                }
            }
            i7 = i15 + 1;
            i5 = i14;
        }
        return c1173bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1173b[] c1173bArr) {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f13878d;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f13879e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b4 = b(c1173bArr, bArr3);
                t(byteArrayOutputStream, c1173bArr.length, 1);
                t(byteArrayOutputStream, b4.length, 4);
                byte[] a3 = a(b4);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = f13881g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, c1173bArr.length, 1);
                for (C1173b c1173b : c1173bArr) {
                    int size = c1173b.f13873i.size() * 4;
                    String d4 = d(bArr4, c1173b.f13865a, c1173b.f13866b);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d4.getBytes(charset).length);
                    u(byteArrayOutputStream, c1173b.f13872h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, c1173b.f13867c, 4);
                    byteArrayOutputStream.write(d4.getBytes(charset));
                    Iterator it = c1173b.f13873i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i5 : c1173b.f13872h) {
                        u(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr5 = f13880f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b5 = b(c1173bArr, bArr5);
                t(byteArrayOutputStream, c1173bArr.length, 1);
                t(byteArrayOutputStream, b5.length, 4);
                byte[] a4 = a(b5);
                t(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr6 = f13882h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, c1173bArr.length);
            for (C1173b c1173b2 : c1173bArr) {
                String str = c1173b2.f13865a;
                TreeMap treeMap = c1173b2.f13873i;
                String d5 = d(bArr6, str, c1173b2.f13866b);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d5.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, c1173b2.f13872h.length);
                t(byteArrayOutputStream, c1173b2.f13867c, 4);
                byteArrayOutputStream.write(d5.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : c1173b2.f13872h) {
                    u(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, c1173bArr.length);
            int i7 = 2;
            int i8 = 2;
            for (C1173b c1173b3 : c1173bArr) {
                t(byteArrayOutputStream2, c1173b3.f13867c, 4);
                t(byteArrayOutputStream2, c1173b3.f13868d, 4);
                t(byteArrayOutputStream2, c1173b3.f13871g, 4);
                String d6 = d(bArr2, c1173b3.f13865a, c1173b3.f13866b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d6.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(d6.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            l lVar = new l(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(lVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < c1173bArr.length) {
                try {
                    C1173b c1173b4 = c1173bArr[i9];
                    u(byteArrayOutputStream3, i9);
                    u(byteArrayOutputStream3, c1173b4.f13869e);
                    i10 = i10 + 4 + (c1173b4.f13869e * i7);
                    int[] iArr = c1173b4.f13872h;
                    int length3 = iArr.length;
                    int i11 = i4;
                    int i12 = i7;
                    int i13 = i11;
                    while (i13 < length3) {
                        int i14 = iArr[i13];
                        u(byteArrayOutputStream3, i14 - i11);
                        i13++;
                        i11 = i14;
                    }
                    i9++;
                    i7 = i12;
                    i4 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
            }
            l lVar2 = new l(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < c1173bArr.length) {
                try {
                    C1173b c1173b5 = c1173bArr[i15];
                    Iterator it3 = c1173b5.f13873i.entrySet().iterator();
                    int i17 = 0;
                    while (it3.hasNext()) {
                        i17 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, c1173b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, c1173b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i15);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i18 = i16 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i17);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i16 = i18 + length4;
                            i15++;
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
            if (i16 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
            }
            l lVar3 = new l(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar3);
            long j5 = 4;
            long size2 = j5 + j5 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i19);
                int i20 = lVar4.f13893a;
                byte[] bArr7 = lVar4.f13894b;
                if (i20 == 1) {
                    j4 = 0;
                } else if (i20 == 2) {
                    j4 = 1;
                } else if (i20 == 3) {
                    j4 = 2;
                } else if (i20 == 4) {
                    j4 = 3;
                } else {
                    if (i20 != 5) {
                        throw null;
                    }
                    j4 = 4;
                }
                t(byteArrayOutputStream, j4, 4);
                t(byteArrayOutputStream, size2, 4);
                if (lVar4.f13895c) {
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
                i19++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C1173b c1173b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, c1173b.f13869e);
        t(byteArrayOutputStream, c1173b.f13870f, 4);
        t(byteArrayOutputStream, c1173b.f13867c, 4);
        t(byteArrayOutputStream, c1173b.f13871g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C1173b c1173b) {
        byte[] bArr = new byte[(((c1173b.f13871g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1173b.f13873i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i4 = intValue / 8;
                bArr[i4] = (byte) (bArr[i4] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i5 = intValue + c1173b.f13871g;
                int i6 = i5 / 8;
                bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, C1173b c1173b) {
        int i4 = 0;
        for (Map.Entry entry : c1173b.f13873i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i4);
                u(byteArrayOutputStream, 0);
                i4 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, d dVar, boolean z) {
        boolean z4;
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r7;
        C1173b[] c1173bArr;
        C1173b[] c1173bArr2;
        C1173b[] c1173bArr3;
        byte[] bArr2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        boolean z8;
        ByteArrayOutputStream byteArrayOutputStream;
        int i4;
        C1172a c1172a;
        FileInputStream a3;
        boolean z9;
        boolean z10;
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
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                dVar.l(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        k.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i5 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C1172a c1172a2 = new C1172a(assets, executor, dVar, name, file2);
            byte[] bArr3 = c1172a2.f13859c;
            if (bArr3 == null) {
                c1172a2.b(3, Integer.valueOf(i5));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z4 = true;
                        c1172a2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    c1172a2.b(4, null);
                }
                c1172a2.f13862f = true;
                try {
                    try {
                        fileInputStream = c1172a2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e4) {
                        dVar.l(6, e4);
                        fileInputStream = null;
                        bArr = f13876b;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        c1173bArr2 = c1172a2.f13863g;
                        if (c1173bArr2 != null) {
                        }
                        d dVar2 = c1172a2.f13858b;
                        c1173bArr3 = c1172a2.f13863g;
                        byte[] bArr4 = c1172a2.f13859c;
                        if (c1173bArr3 != null) {
                        }
                        bArr2 = c1172a2.f13864h;
                        if (bArr2 == null) {
                        }
                        if (z6) {
                        }
                        z8 = z6;
                        z9 = z7;
                        k.c(context, (z8 || !z) ? false : z9);
                    } catch (IOException e5) {
                        dVar.l(7, e5);
                        fileInputStream = null;
                        bArr = f13876b;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        c1173bArr2 = c1172a2.f13863g;
                        if (c1173bArr2 != null) {
                        }
                        d dVar22 = c1172a2.f13858b;
                        c1173bArr3 = c1172a2.f13863g;
                        byte[] bArr42 = c1172a2.f13859c;
                        if (c1173bArr3 != null) {
                        }
                        bArr2 = c1172a2.f13864h;
                        if (bArr2 == null) {
                        }
                        if (z6) {
                        }
                        z8 = z6;
                        z9 = z7;
                        k.c(context, (z8 || !z) ? false : z9);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e6) {
                            dVar.l(7, e6);
                            try {
                                fileInputStream.close();
                            } catch (IOException e7) {
                                dVar.l(7, e7);
                            }
                            c1173bArr = null;
                            c1172a2.f13863g = c1173bArr;
                            c1173bArr2 = c1172a2.f13863g;
                            if (c1173bArr2 != null) {
                                if (i4 != 25) {
                                }
                                try {
                                    a3 = c1172a2.a(assets, "dexopt/baseline.profm");
                                    if (a3 == null) {
                                    }
                                } catch (FileNotFoundException e8) {
                                    dVar.l(9, e8);
                                } catch (IOException e9) {
                                    dVar.l(7, e9);
                                } catch (IllegalStateException e10) {
                                    c1172a2.f13863g = null;
                                    dVar.l(8, e10);
                                }
                            }
                            d dVar222 = c1172a2.f13858b;
                            c1173bArr3 = c1172a2.f13863g;
                            byte[] bArr422 = c1172a2.f13859c;
                            if (c1173bArr3 != null) {
                                if (c1172a2.f13862f) {
                                }
                            }
                            bArr2 = c1172a2.f13864h;
                            if (bArr2 == null) {
                            }
                            if (z6) {
                            }
                            z8 = z6;
                            z9 = z7;
                            k.c(context, (z8 || !z) ? false : z9);
                        } catch (IllegalStateException e11) {
                            dVar.l(8, e11);
                            fileInputStream.close();
                            c1173bArr = null;
                            c1172a2.f13863g = c1173bArr;
                            c1173bArr2 = c1172a2.f13863g;
                            if (c1173bArr2 != null) {
                            }
                            d dVar2222 = c1172a2.f13858b;
                            c1173bArr3 = c1172a2.f13863g;
                            byte[] bArr4222 = c1172a2.f13859c;
                            if (c1173bArr3 != null) {
                            }
                            bArr2 = c1172a2.f13864h;
                            if (bArr2 == null) {
                            }
                            if (z6) {
                            }
                            z8 = z6;
                            z9 = z7;
                            k.c(context, (z8 || !z) ? false : z9);
                        }
                        if (!Arrays.equals(bArr, f(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c1173bArr = l(fileInputStream, f(fileInputStream, 4), c1172a2.f13861e);
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            dVar.l(7, e12);
                        }
                        c1172a2.f13863g = c1173bArr;
                    }
                    c1173bArr2 = c1172a2.f13863g;
                    if (c1173bArr2 != null && (i4 = Build.VERSION.SDK_INT) <= 34) {
                        if (i4 != 25) {
                            switch (i4) {
                            }
                        }
                        a3 = c1172a2.a(assets, "dexopt/baseline.profm");
                        if (a3 == null) {
                            try {
                                if (!Arrays.equals(f13877c, f(a3, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c1172a2.f13863g = i(a3, f(a3, 4), bArr3, c1173bArr2);
                                a3.close();
                                c1172a = c1172a2;
                                if (c1172a != null) {
                                    c1172a2 = c1172a;
                                }
                            } finally {
                            }
                        } else {
                            if (a3 != null) {
                                a3.close();
                            }
                            c1172a = null;
                            if (c1172a != null) {
                            }
                        }
                    }
                    d dVar22222 = c1172a2.f13858b;
                    c1173bArr3 = c1172a2.f13863g;
                    byte[] bArr42222 = c1172a2.f13859c;
                    if (c1173bArr3 != null && bArr42222 != null) {
                        if (c1172a2.f13862f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e13) {
                            dVar22222.l(7, e13);
                        } catch (IllegalStateException e14) {
                            dVar22222.l(8, e14);
                        }
                        if (o(byteArrayOutputStream, bArr42222, c1173bArr3)) {
                            c1172a2.f13864h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            c1172a2.f13863g = null;
                        } else {
                            dVar22222.l(5, null);
                            c1172a2.f13863g = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = c1172a2.f13864h;
                    if (bArr2 == null) {
                        z6 = false;
                        z7 = true;
                    } else {
                        try {
                            if (!c1172a2.f13862f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(c1172a2.f13860d);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z7 = true;
                                                        try {
                                                            c1172a2.b(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            c1172a2.f13864h = null;
                                                            c1172a2.f13863g = null;
                                                            z6 = true;
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
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    r72 = 1;
                                    c1172a2.b(6, e);
                                    z5 = r72;
                                    z6 = false;
                                    z7 = z5;
                                    if (z6) {
                                    }
                                    z8 = z6;
                                    z9 = z7;
                                    k.c(context, (z8 || !z) ? false : z9);
                                } catch (IOException e16) {
                                    e = e16;
                                    r7 = 1;
                                    c1172a2.b(7, e);
                                    z5 = r7;
                                    z6 = false;
                                    z7 = z5;
                                    if (z6) {
                                    }
                                    z8 = z6;
                                    z9 = z7;
                                    k.c(context, (z8 || !z) ? false : z9);
                                }
                            } catch (FileNotFoundException e17) {
                                e = e17;
                                c1172a2.b(6, e);
                                z5 = r72;
                                z6 = false;
                                z7 = z5;
                                if (z6) {
                                }
                                z8 = z6;
                                z9 = z7;
                                k.c(context, (z8 || !z) ? false : z9);
                            } catch (IOException e18) {
                                e = e18;
                                c1172a2.b(7, e);
                                z5 = r7;
                                z6 = false;
                                z7 = z5;
                                if (z6) {
                                }
                                z8 = z6;
                                z9 = z7;
                                k.c(context, (z8 || !z) ? false : z9);
                            }
                        } finally {
                            c1172a2.f13864h = null;
                            c1172a2.f13863g = null;
                        }
                    }
                    if (z6) {
                        e(packageInfo, filesDir);
                    }
                    z8 = z6;
                    z9 = z7;
                    k.c(context, (z8 || !z) ? false : z9);
                } finally {
                }
                bArr = f13876b;
                r7 = 8;
                r72 = 8;
            }
            z4 = true;
            z8 = false;
            z9 = z4;
            k.c(context, (z8 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e19) {
            dVar.l(7, e19);
            k.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j4, int i4) {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((j4 >> (i5 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        t(byteArrayOutputStream, i4, 2);
    }
}
