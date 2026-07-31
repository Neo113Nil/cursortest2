package u4;

import a0.q;
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
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
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
import u.i0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final p.b f7392a = new p.b(6);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7393b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f7394c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f7395d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f7396e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f7397f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f7398g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f7399h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f7400j = {48, 48, 50, 0};

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
        int i8 = 0;
        int i9 = 0;
        for (b bVar : bVarArr) {
            i9 += ((((bVar.f7390g * 2) + 7) & (-8)) / 8) + (bVar.f7388e * 2) + d(bVar.f7384a, bVar.f7385b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f7389f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, f7397f)) {
            int length = bVarArr.length;
            while (i8 < length) {
                b bVar2 = bVarArr[i8];
                q(byteArrayOutputStream, bVar2, d(bVar2.f7384a, bVar2.f7385b, bArr));
                p(byteArrayOutputStream, bVar2);
                i8++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                q(byteArrayOutputStream, bVar3, d(bVar3.f7384a, bVar3.f7385b, bArr));
            }
            int length2 = bVarArr.length;
            while (i8 < length2) {
                p(byteArrayOutputStream, bVarArr[i8]);
                i8++;
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
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
        byte[] bArr2 = f7399h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f7398g;
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
                sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
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

    public static byte[] f(InputStream inputStream, int i8) {
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int read = inputStream.read(bArr, i9, i8 - i9);
            if (read < 0) {
                throw new IllegalStateException(q.h("Not enough bytes to read: ", i8));
            }
            i9 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i8) {
        int[] iArr = new int[i8];
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += (int) m(byteArrayInputStream, 2);
            iArr[i10] = i9;
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
    public static byte[] h(FileInputStream fileInputStream, int i8, int i9) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int i11 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i8) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i8 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i11 += inflater.inflate(bArr, i11, i9 - i11);
                    i10 += read;
                } catch (DataFormatException e8) {
                    throw new IllegalStateException(e8.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i8 + " actual=" + i10);
        } finally {
            inflater.end();
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f7400j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m7 = (int) m(fileInputStream, 2);
            byte[] h8 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h8);
            try {
                b[] k3 = k(byteArrayInputStream, bArr2, m7, bVarArr);
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
        if (Arrays.equals(f7395d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m8 = (int) m(fileInputStream, 1);
        byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h9);
        try {
            b[] j7 = j(byteArrayInputStream2, m8, bVarArr);
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

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i8, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i8 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i8];
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int m7 = (int) m(byteArrayInputStream, 2);
            iArr[i9] = (int) m(byteArrayInputStream, 2);
            strArr[i9] = new String(f(byteArrayInputStream, m7), StandardCharsets.UTF_8);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            b bVar = bVarArr[i10];
            if (!bVar.f7385b.equals(strArr[i10])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            bVar.f7388e = i11;
            bVar.f7391h = g(byteArrayInputStream, i11);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i8, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i8 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m7 = m(byteArrayInputStream, 4);
            int m8 = (int) m(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i10 = 0;
                while (true) {
                    if (i10 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i10].f7385b.equals(substring)) {
                        bVar = bVarArr[i10];
                        break;
                    }
                    i10++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f7387d = m7;
            int[] g3 = g(byteArrayInputStream, m8);
            if (Arrays.equals(bArr, f7399h)) {
                bVar.f7388e = m8;
                bVar.f7391h = g3;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f7396e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m7 = (int) m(fileInputStream, 1);
        byte[] h8 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h8);
        try {
            b[] n6 = n(byteArrayInputStream, str, m7);
            byteArrayInputStream.close();
            return n6;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i8) {
        byte[] f6 = f(inputStream, i8);
        long j7 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            j7 += (f6[i9] & 255) << (i9 * 8);
        }
        return j7;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i8) {
        int i9 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            int m7 = (int) m(byteArrayInputStream, 2);
            int m8 = (int) m(byteArrayInputStream, 2);
            bVarArr[i10] = new b(str, new String(f(byteArrayInputStream, m7), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m8, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m8], new TreeMap());
        }
        int i11 = 0;
        while (i11 < i8) {
            b bVar = bVarArr[i11];
            int available = byteArrayInputStream.available();
            int i12 = bVar.f7389f;
            int i13 = bVar.f7390g;
            TreeMap treeMap = bVar.i;
            int i14 = available - i12;
            int i15 = i9;
            while (byteArrayInputStream.available() > i14) {
                i15 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i15), 1);
                int m9 = (int) m(byteArrayInputStream, 2);
                while (m9 > 0) {
                    m(byteArrayInputStream, 2);
                    int m10 = (int) m(byteArrayInputStream, 1);
                    if (m10 != 6 && m10 != 7) {
                        while (m10 > 0) {
                            m(byteArrayInputStream, 1);
                            int i16 = i9;
                            int i17 = i11;
                            for (int m11 = (int) m(byteArrayInputStream, 1); m11 > 0; m11--) {
                                m(byteArrayInputStream, 2);
                            }
                            m10--;
                            i9 = i16;
                            i11 = i17;
                        }
                    }
                    m9--;
                    i9 = i9;
                    i11 = i11;
                }
            }
            int i18 = i9;
            int i19 = i11;
            if (byteArrayInputStream.available() != i14) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f7391h = g(byteArrayInputStream, bVar.f7388e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i13 * 2) + 7) & (-8)) / 8));
            for (int i20 = i18; i20 < i13; i20++) {
                int i21 = valueOf.get(i20) ? 2 : i18;
                if (valueOf.get(i20 + i13)) {
                    i21 |= 4;
                }
                if (i21 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i20));
                    if (num == null) {
                        num = Integer.valueOf(i18);
                    }
                    treeMap.put(Integer.valueOf(i20), Integer.valueOf(i21 | num.intValue()));
                }
            }
            i11 = i19 + 1;
            i9 = i18;
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j7;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f7395d;
        int i8 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f7396e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b8 = b(bVarArr, bArr3);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, b8.length, 4);
                byte[] a8 = a(b8);
                u(byteArrayOutputStream, a8.length, 4);
                byteArrayOutputStream.write(a8);
                return true;
            }
            byte[] bArr4 = f7398g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.i.size() * 4;
                    String d8 = d(bVar.f7384a, bVar.f7385b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d8.getBytes(charset).length);
                    v(byteArrayOutputStream, bVar.f7391h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, bVar.f7386c, 4);
                    byteArrayOutputStream.write(d8.getBytes(charset));
                    Iterator it = bVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i9 : bVar.f7391h) {
                        v(byteArrayOutputStream, i9);
                    }
                }
                return true;
            }
            byte[] bArr5 = f7397f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b9 = b(bVarArr, bArr5);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, b9.length, 4);
                byte[] a9 = a(b9);
                u(byteArrayOutputStream, a9.length, 4);
                byteArrayOutputStream.write(a9);
                return true;
            }
            byte[] bArr6 = f7399h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.f7384a;
                TreeMap treeMap = bVar2.i;
                String d9 = d(str, bVar2.f7385b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d9.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, bVar2.f7391h.length);
                u(byteArrayOutputStream, bVar2.f7386c, 4);
                byteArrayOutputStream.write(d9.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i10 : bVar2.f7391h) {
                    v(byteArrayOutputStream, i10);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, bVarArr.length);
            int i11 = 2;
            int i12 = 2;
            for (b bVar3 : bVarArr) {
                u(byteArrayOutputStream2, bVar3.f7386c, 4);
                u(byteArrayOutputStream2, bVar3.f7387d, 4);
                u(byteArrayOutputStream2, bVar3.f7390g, 4);
                String d10 = d(bVar3.f7384a, bVar3.f7385b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d10.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i12 = i12 + 14 + length2;
                byteArrayOutputStream2.write(d10.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i12 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i13];
                    v(byteArrayOutputStream3, i13);
                    v(byteArrayOutputStream3, bVar4.f7388e);
                    i14 = i14 + 4 + (bVar4.f7388e * i11);
                    int[] iArr = bVar4.f7391h;
                    int length3 = iArr.length;
                    int i15 = i8;
                    int i16 = i11;
                    int i17 = i15;
                    while (i17 < length3) {
                        int i18 = iArr[i17];
                        v(byteArrayOutputStream3, i18 - i15);
                        i17++;
                        i15 = i18;
                    }
                    i13++;
                    i11 = i16;
                    i8 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i19 = 0;
            int i20 = 0;
            while (i19 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i19];
                    Iterator it3 = bVar5.i.entrySet().iterator();
                    int i21 = 0;
                    while (it3.hasNext()) {
                        i21 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i21, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i19);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i22 = i20 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i21);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i20 = i22 + length4;
                            i19++;
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
            if (i20 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i20 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar3);
            long j8 = 4;
            long size2 = j8 + j8 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i23);
                int i24 = jVar4.f7410a;
                byte[] bArr7 = jVar4.f7411b;
                if (i24 == 1) {
                    j7 = 0;
                } else if (i24 == 2) {
                    j7 = 1;
                } else if (i24 == 3) {
                    j7 = 2;
                } else if (i24 == 4) {
                    j7 = 3;
                } else {
                    if (i24 != 5) {
                        throw null;
                    }
                    j7 = 4;
                }
                u(byteArrayOutputStream, j7, 4);
                u(byteArrayOutputStream, size2, 4);
                if (jVar4.f7412c) {
                    long length5 = bArr7.length;
                    byte[] a10 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a10);
                    u(byteArrayOutputStream, a10.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a10.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i23++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i25));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        s(byteArrayOutputStream, bVar);
        int i8 = bVar.f7390g;
        int[] iArr = bVar.f7391h;
        int length = iArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = iArr[i9];
            v(byteArrayOutputStream, i11 - i10);
            i9++;
            i10 = i11;
        }
        byte[] bArr = new byte[(((i8 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i12 = intValue / 8;
                bArr[i12] = (byte) (bArr[i12] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i13 = intValue + i8;
                int i14 = i13 / 8;
                bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, bVar.f7388e);
        u(byteArrayOutputStream, bVar.f7389f, 4);
        u(byteArrayOutputStream, bVar.f7386c, 4);
        u(byteArrayOutputStream, bVar.f7390g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i8, b bVar) {
        int i9 = bVar.f7390g;
        byte[] bArr = new byte[(((Integer.bitCount(i8 & (-2)) * i9) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = 0;
            for (int i11 = 1; i11 <= 4; i11 <<= 1) {
                if (i11 != 1 && (i11 & i8) != 0) {
                    if ((i11 & intValue2) == i11) {
                        int i12 = (i10 * i9) + intValue;
                        int i13 = i12 / 8;
                        bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
                    }
                    i10++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i8 = 0;
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i8);
                v(byteArrayOutputStream, 0);
                i8 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, d dVar, boolean z3) {
        boolean z7;
        ?? r7;
        byte[] bArr;
        b[] bVarArr;
        b[] bVarArr2;
        b[] bVarArr3;
        byte[] bArr2;
        boolean z8;
        boolean z9;
        Throwable th;
        Throwable th2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? byteArrayOutputStream;
        i0 i0Var;
        String str;
        String str2;
        FileInputStream d8;
        boolean z14;
        boolean z15;
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
                            z15 = readLong == packageInfo.lastUpdateTime;
                            if (z15) {
                                dVar.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z15) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        i.c(context, false);
                        return;
                    }
                }
                z15 = false;
                if (z15) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            i0 i0Var2 = new i0(assets, executor, dVar, name, file2);
            byte[] bArr3 = (byte[]) i0Var2.f7018d;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        i0Var2.e(4, null);
                    }
                    i0Var2.f7015a = true;
                    try {
                        try {
                            r7 = i0Var2.d(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e8) {
                            dVar.c(6, e8);
                            r7 = 0;
                            bArr = f7393b;
                            if (r7 != 0) {
                            }
                            bVarArr2 = (b[]) i0Var2.f7021g;
                            if (bVarArr2 != null) {
                            }
                            d dVar2 = (d) i0Var2.f7017c;
                            bVarArr3 = (b[]) i0Var2.f7021g;
                            byte[] bArr4 = (byte[]) i0Var2.f7018d;
                            boolean z16 = r7;
                            z16 = r7;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = (byte[]) i0Var2.f7022h;
                            if (bArr2 != null) {
                            }
                            if (z9) {
                            }
                            z11 = z9;
                            z14 = z10;
                            i.c(context, (z11 || !z3) ? false : z14);
                        } catch (IOException e9) {
                            dVar.c(7, e9);
                            r7 = 0;
                            bArr = f7393b;
                            if (r7 != 0) {
                            }
                            bVarArr2 = (b[]) i0Var2.f7021g;
                            if (bVarArr2 != null) {
                            }
                            d dVar22 = (d) i0Var2.f7017c;
                            bVarArr3 = (b[]) i0Var2.f7021g;
                            byte[] bArr42 = (byte[]) i0Var2.f7018d;
                            boolean z162 = r7;
                            z162 = r7;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = (byte[]) i0Var2.f7022h;
                            if (bArr2 != null) {
                            }
                            if (z9) {
                            }
                            z11 = z9;
                            z14 = z10;
                            i.c(context, (z11 || !z3) ? false : z14);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IOException e10) {
                                    dVar.c(7, e10);
                                    try {
                                        r7.close();
                                    } catch (IOException e11) {
                                        dVar.c(7, e11);
                                    }
                                    bVarArr = null;
                                    i0Var2.f7021g = bVarArr;
                                    bVarArr2 = (b[]) i0Var2.f7021g;
                                    if (bVarArr2 != null) {
                                    }
                                    d dVar222 = (d) i0Var2.f7017c;
                                    bVarArr3 = (b[]) i0Var2.f7021g;
                                    byte[] bArr422 = (byte[]) i0Var2.f7018d;
                                    boolean z1622 = r7;
                                    z1622 = r7;
                                    if (bVarArr3 != null) {
                                    }
                                    bArr2 = (byte[]) i0Var2.f7022h;
                                    if (bArr2 != null) {
                                    }
                                    if (z9) {
                                    }
                                    z11 = z9;
                                    z14 = z10;
                                    i.c(context, (z11 || !z3) ? false : z14);
                                }
                            } catch (IllegalStateException e12) {
                                dVar.c(8, e12);
                                r7.close();
                                bVarArr = null;
                                i0Var2.f7021g = bVarArr;
                                bVarArr2 = (b[]) i0Var2.f7021g;
                                if (bVarArr2 != null) {
                                }
                                d dVar2222 = (d) i0Var2.f7017c;
                                bVarArr3 = (b[]) i0Var2.f7021g;
                                byte[] bArr4222 = (byte[]) i0Var2.f7018d;
                                boolean z16222 = r7;
                                z16222 = r7;
                                if (bVarArr3 != null) {
                                }
                                bArr2 = (byte[]) i0Var2.f7022h;
                                if (bArr2 != null) {
                                }
                                if (z9) {
                                }
                                z11 = z9;
                                z14 = z10;
                                i.c(context, (z11 || !z3) ? false : z14);
                            }
                            if (!Arrays.equals(bArr, f(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            bVarArr = l(r7, f(r7, 4), (String) i0Var2.f7020f);
                            try {
                                r7.close();
                            } catch (IOException e13) {
                                dVar.c(7, e13);
                            }
                            i0Var2.f7021g = bVarArr;
                        }
                        bVarArr2 = (b[]) i0Var2.f7021g;
                        if (bVarArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                d8 = i0Var2.d(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e14) {
                                dVar.c(9, e14);
                                str = r7;
                            } catch (IOException e15) {
                                dVar.c(7, e15);
                                str = r7;
                            } catch (IllegalStateException e16) {
                                i0Var2.f7021g = null;
                                dVar.c(8, e16);
                                str = r7;
                            }
                            if (d8 == null) {
                                try {
                                    if (!Arrays.equals(f7394c, f(d8, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] f6 = f(d8, 4);
                                    i0Var2.f7021g = i(d8, f6, bArr3, bVarArr2);
                                    d8.close();
                                    i0Var = i0Var2;
                                    r7 = f6;
                                    if (i0Var != null) {
                                        i0Var2 = i0Var;
                                    }
                                } finally {
                                }
                            } else {
                                if (d8 != null) {
                                    d8.close();
                                    str = str2;
                                }
                                i0Var = null;
                                r7 = str;
                                if (i0Var != null) {
                                }
                            }
                        }
                        d dVar22222 = (d) i0Var2.f7017c;
                        bVarArr3 = (b[]) i0Var2.f7021g;
                        byte[] bArr42222 = (byte[]) i0Var2.f7018d;
                        boolean z162222 = r7;
                        z162222 = r7;
                        if (bVarArr3 != null && bArr42222 != null) {
                            z12 = i0Var2.f7015a;
                            if (z12) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e17) {
                                dVar22222.c(7, e17);
                                z13 = z12;
                            } catch (IllegalStateException e18) {
                                dVar22222.c(8, e18);
                                z13 = z12;
                            }
                            if (o(byteArrayOutputStream, bArr42222, bVarArr3)) {
                                i0Var2.f7022h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z13 = byteArrayOutputStream;
                                i0Var2.f7021g = null;
                                z162222 = z13;
                            } else {
                                dVar22222.c(5, null);
                                i0Var2.f7021g = null;
                                byteArrayOutputStream.close();
                                z162222 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = (byte[]) i0Var2.f7022h;
                        if (bArr2 != null) {
                            z9 = false;
                            z10 = true;
                        } else {
                            try {
                                if (!i0Var2.f7015a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) i0Var2.f7019e);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z10 = true;
                                                                                i0Var2.e(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                i0Var2.f7022h = null;
                                                                                i0Var2.f7021g = null;
                                                                                z9 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
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
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e19) {
                                        e = e19;
                                        i0Var2.e(6, e);
                                        z8 = z162222;
                                        z9 = false;
                                        z10 = z8;
                                        if (z9) {
                                        }
                                        z11 = z9;
                                        z14 = z10;
                                        i.c(context, (z11 || !z3) ? false : z14);
                                    } catch (IOException e20) {
                                        e = e20;
                                        i0Var2.e(7, e);
                                        z8 = z162222;
                                        z9 = false;
                                        z10 = z8;
                                        if (z9) {
                                        }
                                        z11 = z9;
                                        z14 = z10;
                                        i.c(context, (z11 || !z3) ? false : z14);
                                    }
                                } catch (FileNotFoundException e21) {
                                    e = e21;
                                    z162222 = true;
                                    i0Var2.e(6, e);
                                    z8 = z162222;
                                    z9 = false;
                                    z10 = z8;
                                    if (z9) {
                                    }
                                    z11 = z9;
                                    z14 = z10;
                                    i.c(context, (z11 || !z3) ? false : z14);
                                } catch (IOException e22) {
                                    e = e22;
                                    z162222 = true;
                                    i0Var2.e(7, e);
                                    z8 = z162222;
                                    z9 = false;
                                    z10 = z8;
                                    if (z9) {
                                    }
                                    z11 = z9;
                                    z14 = z10;
                                    i.c(context, (z11 || !z3) ? false : z14);
                                }
                            } finally {
                                i0Var2.f7022h = null;
                                i0Var2.f7021g = null;
                            }
                        }
                        if (z9) {
                            e(packageInfo, filesDir);
                        }
                        z11 = z9;
                        z14 = z10;
                    } finally {
                    }
                    bArr = f7393b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            i0Var2.e(4, null);
                        }
                        i0Var2.f7015a = true;
                        r7 = i0Var2.d(assets, "dexopt/baseline.prof");
                        bArr = f7393b;
                        if (r7 != 0) {
                        }
                        bVarArr2 = (b[]) i0Var2.f7021g;
                        if (bVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            d8 = i0Var2.d(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (d8 == null) {
                            }
                        }
                        d dVar222222 = (d) i0Var2.f7017c;
                        bVarArr3 = (b[]) i0Var2.f7021g;
                        byte[] bArr422222 = (byte[]) i0Var2.f7018d;
                        boolean z1622222 = r7;
                        z1622222 = r7;
                        if (bVarArr3 != null) {
                            z12 = i0Var2.f7015a;
                            if (z12) {
                            }
                        }
                        bArr2 = (byte[]) i0Var2.f7022h;
                        if (bArr2 != null) {
                        }
                        if (z9) {
                        }
                        z11 = z9;
                        z14 = z10;
                    } catch (IOException unused2) {
                        z7 = true;
                        i0Var2.e(4, null);
                    }
                }
                i.c(context, (z11 || !z3) ? false : z14);
            }
            i0Var2.e(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z7 = true;
            z11 = false;
            z14 = z7;
            i.c(context, (z11 || !z3) ? false : z14);
        } catch (PackageManager.NameNotFoundException e23) {
            dVar.c(7, e23);
            i.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j7, int i8) {
        byte[] bArr = new byte[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = (byte) ((j7 >> (i9 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i8) {
        u(byteArrayOutputStream, i8, 2);
    }
}
