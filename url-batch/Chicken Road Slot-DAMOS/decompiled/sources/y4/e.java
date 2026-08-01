package y4;

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
import kotlin.collections.i0;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f10598a = new c0(24);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f10599b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f10600c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f10601d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f10602e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f10603f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f10604h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f10605i = {48, 48, 49, 0};
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

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i3 = 0;
        int i10 = 0;
        for (c cVar : cVarArr) {
            i10 += ((((cVar.g * 2) + 7) & (-8)) / 8) + (cVar.f10594e * 2) + d(cVar.f10590a, cVar.f10591b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f10595f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f10603f)) {
            int length = cVarArr.length;
            while (i3 < length) {
                c cVar2 = cVarArr[i3];
                q(byteArrayOutputStream, cVar2, d(cVar2.f10590a, cVar2.f10591b, bArr));
                p(byteArrayOutputStream, cVar2);
                i3++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f10590a, cVar3.f10591b, bArr));
            }
            int length2 = cVarArr.length;
            while (i3 < length2) {
                p(byteArrayOutputStream, cVarArr[i3]);
                i3++;
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
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
        boolean z10 = true;
        for (File file2 : listFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f10604h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
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
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                return v4.a.o(sb2, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
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

    public static byte[] f(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i10 = 0;
        while (i10 < i3) {
            int read = inputStream.read(bArr, i10, i3 - i10);
            if (read < 0) {
                i0.l(v4.a.j(i3, "Not enough bytes to read: "));
                return null;
            }
            i10 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += (int) m(byteArrayInputStream, 2);
            iArr[i11] = i10;
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
    public static byte[] h(FileInputStream fileInputStream, int i3, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int i12 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i3) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i12 += inflater.inflate(bArr, i12, i10 - i12);
                    i11 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i11);
        } finally {
            inflater.end();
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f10605i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                i0.l("Unsupported meta version");
                return null;
            }
            int m10 = (int) m(fileInputStream, 2);
            byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                i0.l("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
            try {
                c[] k10 = k(byteArrayInputStream, bArr2, m10, cVarArr);
                byteArrayInputStream.close();
                return k10;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f10601d, bArr2)) {
            i0.l("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            i0.l("Unsupported meta version");
            return null;
        }
        int m11 = (int) m(fileInputStream, 1);
        byte[] h11 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            i0.l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h11);
        try {
            c[] j3 = j(byteArrayInputStream2, m11, cVarArr);
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

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i3, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 != cVarArr.length) {
            i0.l("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            int m10 = (int) m(byteArrayInputStream, 2);
            iArr[i10] = (int) m(byteArrayInputStream, 2);
            strArr[i10] = new String(f(byteArrayInputStream, m10), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i3; i11++) {
            c cVar = cVarArr[i11];
            if (!cVar.f10591b.equals(strArr[i11])) {
                i0.l("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i12 = iArr[i11];
            cVar.f10594e = i12;
            cVar.f10596h = g(byteArrayInputStream, i12);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 != cVarArr.length) {
            i0.l("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m10 = m(byteArrayInputStream, 4);
            int m11 = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i11 = 0;
                while (true) {
                    if (i11 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i11].f10591b.equals(substring)) {
                        cVar = cVarArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (cVar == null) {
                i0.l("Missing profile key: ".concat(str));
                return null;
            }
            cVar.f10593d = m10;
            int[] g2 = g(byteArrayInputStream, m11);
            if (Arrays.equals(bArr, f10604h)) {
                cVar.f10594e = m11;
                cVar.f10596h = g2;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f10602e)) {
            i0.l("Unsupported version");
            return null;
        }
        int m10 = (int) m(fileInputStream, 1);
        byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            i0.l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
        try {
            c[] n10 = n(byteArrayInputStream, str, m10);
            byteArrayInputStream.close();
            return n10;
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
        for (int i10 = 0; i10 < i3; i10++) {
            j3 += (f3[i10] & 255) << (i10 * 8);
        }
        return j3;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        int i10 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            int m10 = (int) m(byteArrayInputStream, 2);
            int m11 = (int) m(byteArrayInputStream, 2);
            cVarArr[i11] = new c(str, new String(f(byteArrayInputStream, m10), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m11, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m11], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i3) {
            c cVar = cVarArr[i12];
            int available = byteArrayInputStream.available();
            int i13 = cVar.f10595f;
            int i14 = cVar.g;
            TreeMap treeMap = cVar.f10597i;
            int i15 = available - i13;
            int i16 = i10;
            while (byteArrayInputStream.available() > i15) {
                i16 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i16), 1);
                int m12 = (int) m(byteArrayInputStream, 2);
                while (m12 > 0) {
                    m(byteArrayInputStream, 2);
                    int m13 = (int) m(byteArrayInputStream, 1);
                    if (m13 != 6 && m13 != 7) {
                        while (m13 > 0) {
                            m(byteArrayInputStream, 1);
                            int i17 = i10;
                            int i18 = i12;
                            for (int m14 = (int) m(byteArrayInputStream, 1); m14 > 0; m14--) {
                                m(byteArrayInputStream, 2);
                            }
                            m13--;
                            i10 = i17;
                            i12 = i18;
                        }
                    }
                    m12--;
                    i10 = i10;
                    i12 = i12;
                }
            }
            int i19 = i10;
            int i20 = i12;
            if (byteArrayInputStream.available() != i15) {
                i0.l("Read too much data during profile line parse");
                return null;
            }
            cVar.f10596h = g(byteArrayInputStream, cVar.f10594e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i14 * 2) + 7) & (-8)) / 8));
            for (int i21 = i19; i21 < i14; i21++) {
                int i22 = valueOf.get(i21) ? 2 : i19;
                if (valueOf.get(i21 + i14)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (num == null) {
                        num = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | num.intValue()));
                }
            }
            i12 = i20 + 1;
            i10 = i19;
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f10601d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f10602e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b10 = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b10.length, 4);
                byte[] a9 = a(b10);
                u(byteArrayOutputStream, a9.length, 4);
                byteArrayOutputStream.write(a9);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f10597i.size() * 4;
                    String d10 = d(cVar.f10590a, cVar.f10591b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d10.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.f10596h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.f10592c, 4);
                    byteArrayOutputStream.write(d10.getBytes(charset));
                    Iterator it = cVar.f10597i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i10 : cVar.f10596h) {
                        v(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f10603f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b11 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b11.length, 4);
                byte[] a10 = a(b11);
                u(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr6 = f10604h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String str = cVar2.f10590a;
                TreeMap treeMap = cVar2.f10597i;
                String d11 = d(str, cVar2.f10591b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d11.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.f10596h.length);
                u(byteArrayOutputStream, cVar2.f10592c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : cVar2.f10596h) {
                    v(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.f10592c, 4);
                u(byteArrayOutputStream2, cVar3.f10593d, 4);
                u(byteArrayOutputStream2, cVar3.g, 4);
                String d12 = d(cVar3.f10590a, cVar3.f10591b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d12.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(d12.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i14];
                    v(byteArrayOutputStream3, i14);
                    v(byteArrayOutputStream3, cVar4.f10594e);
                    i15 = i15 + 4 + (cVar4.f10594e * i12);
                    int[] iArr = cVar4.f10596h;
                    int length3 = iArr.length;
                    int i16 = i3;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length3) {
                        int i19 = iArr[i18];
                        v(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            k kVar2 = new k(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i20];
                    Iterator it3 = cVar5.f10597i.entrySet().iterator();
                    int i22 = 0;
                    while (it3.hasNext()) {
                        i22 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i22, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i20);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i22);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i21 = i23 + length4;
                            i20++;
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
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            k kVar3 = new k(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i24);
                int i25 = kVar4.f10616a;
                byte[] bArr7 = kVar4.f10617b;
                if (i25 == 1) {
                    j3 = 0;
                } else if (i25 == 2) {
                    j3 = 1;
                } else if (i25 == 3) {
                    j3 = 2;
                } else if (i25 == 4) {
                    j3 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                u(byteArrayOutputStream, j3, 4);
                u(byteArrayOutputStream, size2, 4);
                if (kVar4.f10618c) {
                    long length5 = bArr7.length;
                    byte[] a11 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a11);
                    u(byteArrayOutputStream, a11.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a11.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        s(byteArrayOutputStream, cVar);
        int i3 = cVar.g;
        int[] iArr = cVar.f10596h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        byte[] bArr = new byte[(((i3 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f10597i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i13 = intValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i14 = intValue + i3;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f10594e);
        u(byteArrayOutputStream, cVar.f10595f, 4);
        u(byteArrayOutputStream, cVar.f10592c, 4);
        u(byteArrayOutputStream, cVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i3, c cVar) {
        int i10 = cVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i3 & (-2)) * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f10597i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i3) != 0) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (i11 * i10) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i3 = 0;
        for (Map.Entry entry : cVar.f10597i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i3);
                v(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, d dVar, boolean z10) {
        boolean z11;
        ?? r72;
        byte[] bArr;
        c[] cVarArr;
        c[] cVarArr2;
        c[] cVarArr3;
        byte[] bArr2;
        boolean z12;
        boolean z13;
        Throwable th;
        Throwable th2;
        boolean z14;
        boolean z15;
        ?? r73;
        boolean z16;
        b bVar;
        boolean z17;
        FileInputStream a9;
        boolean z18;
        boolean z19;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z19 = readLong == packageInfo.lastUpdateTime;
                            if (z19) {
                                dVar.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z19) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        j.c(context, false);
                        return;
                    }
                }
                z19 = false;
                if (z19) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, dVar, name, file2);
            byte[] bArr3 = bVar2.f10585c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        bVar2.b(4, null);
                    }
                    bVar2.f10588f = true;
                    try {
                        try {
                            r72 = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            dVar.c(6, e2);
                            r72 = 0;
                            bArr = f10599b;
                            if (r72 != 0) {
                            }
                            cVarArr2 = bVar2.g;
                            if (cVarArr2 != null) {
                            }
                            d dVar2 = bVar2.f10584b;
                            cVarArr3 = bVar2.g;
                            byte[] bArr4 = bVar2.f10585c;
                            boolean z20 = r72;
                            z20 = r72;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f10589h;
                            if (bArr2 != null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z18 = z14;
                            j.c(context, (z15 || !z10) ? false : z18);
                        } catch (IOException e9) {
                            dVar.c(7, e9);
                            r72 = 0;
                            bArr = f10599b;
                            if (r72 != 0) {
                            }
                            cVarArr2 = bVar2.g;
                            if (cVarArr2 != null) {
                            }
                            d dVar22 = bVar2.f10584b;
                            cVarArr3 = bVar2.g;
                            byte[] bArr42 = bVar2.f10585c;
                            boolean z202 = r72;
                            z202 = r72;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f10589h;
                            if (bArr2 != null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z18 = z14;
                            j.c(context, (z15 || !z10) ? false : z18);
                        }
                        if (r72 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e10) {
                                    dVar.c(8, e10);
                                    try {
                                        r72.close();
                                    } catch (IOException e11) {
                                        dVar.c(7, e11);
                                    }
                                    cVarArr = null;
                                    bVar2.g = cVarArr;
                                    cVarArr2 = bVar2.g;
                                    if (cVarArr2 != null) {
                                    }
                                    d dVar222 = bVar2.f10584b;
                                    cVarArr3 = bVar2.g;
                                    byte[] bArr422 = bVar2.f10585c;
                                    boolean z2022 = r72;
                                    z2022 = r72;
                                    if (cVarArr3 != null) {
                                    }
                                    bArr2 = bVar2.f10589h;
                                    if (bArr2 != null) {
                                    }
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z18 = z14;
                                    j.c(context, (z15 || !z10) ? false : z18);
                                }
                            } catch (IOException e12) {
                                dVar.c(7, e12);
                                r72.close();
                                cVarArr = null;
                                bVar2.g = cVarArr;
                                cVarArr2 = bVar2.g;
                                if (cVarArr2 != null) {
                                }
                                d dVar2222 = bVar2.f10584b;
                                cVarArr3 = bVar2.g;
                                byte[] bArr4222 = bVar2.f10585c;
                                boolean z20222 = r72;
                                z20222 = r72;
                                if (cVarArr3 != null) {
                                }
                                bArr2 = bVar2.f10589h;
                                if (bArr2 != null) {
                                }
                                if (z13) {
                                }
                                z15 = z13;
                                z18 = z14;
                                j.c(context, (z15 || !z10) ? false : z18);
                            }
                            if (!Arrays.equals(bArr, f(r72, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            cVarArr = l(r72, f(r72, 4), bVar2.f10587e);
                            try {
                                r72.close();
                            } catch (IOException e13) {
                                dVar.c(7, e13);
                            }
                            bVar2.g = cVarArr;
                        }
                        cVarArr2 = bVar2.g;
                        if (cVarArr2 != null && ((r72 = Build.VERSION.SDK_INT) >= 31 || r72 == 24 || r72 == 25)) {
                            try {
                                r72 = "dexopt/baseline.profm";
                                a9 = bVar2.a(assets, "dexopt/baseline.profm");
                                z17 = r72;
                            } catch (FileNotFoundException e14) {
                                dVar.c(9, e14);
                                z17 = r72;
                            } catch (IOException e15) {
                                dVar.c(7, e15);
                                z17 = r72;
                            } catch (IllegalStateException e16) {
                                bVar2.g = null;
                                dVar.c(8, e16);
                                z17 = r72;
                            }
                            if (a9 == null) {
                                try {
                                    if (!Arrays.equals(f10600c, f(a9, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] f3 = f(a9, 4);
                                    bVar2.g = i(a9, f3, bArr3, cVarArr2);
                                    a9.close();
                                    bVar = bVar2;
                                    r72 = f3;
                                    if (bVar != null) {
                                        bVar2 = bVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a9 != null) {
                                    a9.close();
                                    z17 = r72;
                                }
                                bVar = null;
                                r72 = z17;
                                if (bVar != null) {
                                }
                            }
                        }
                        d dVar22222 = bVar2.f10584b;
                        cVarArr3 = bVar2.g;
                        byte[] bArr42222 = bVar2.f10585c;
                        boolean z202222 = r72;
                        z202222 = r72;
                        if (cVarArr3 != null && bArr42222 != null) {
                            r73 = bVar2.f10588f;
                            if (r73 != 0) {
                                i0.l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                r73 = new ByteArrayOutputStream();
                                try {
                                    r73.write(bArr);
                                    r73.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e17) {
                                dVar22222.c(7, e17);
                                z16 = r73;
                            } catch (IllegalStateException e18) {
                                dVar22222.c(8, e18);
                                z16 = r73;
                            }
                            if (o(r73, bArr42222, cVarArr3)) {
                                bVar2.f10589h = r73.toByteArray();
                                r73.close();
                                z16 = r73;
                                bVar2.g = null;
                                z202222 = z16;
                            } else {
                                dVar22222.c(5, null);
                                bVar2.g = null;
                                r73.close();
                                z202222 = r73;
                            }
                        }
                        bArr2 = bVar2.f10589h;
                        if (bArr2 != null) {
                            z13 = false;
                            z14 = true;
                        } else {
                            try {
                                if (!bVar2.f10588f) {
                                    i0.l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(bVar2.f10586d);
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
                                                                                z14 = true;
                                                                                bVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                bVar2.f10589h = null;
                                                                                bVar2.g = null;
                                                                                z13 = true;
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
                                        bVar2.b(6, e);
                                        z12 = z202222;
                                        z13 = false;
                                        z14 = z12;
                                        if (z13) {
                                        }
                                        z15 = z13;
                                        z18 = z14;
                                        j.c(context, (z15 || !z10) ? false : z18);
                                    } catch (IOException e20) {
                                        e = e20;
                                        bVar2.b(7, e);
                                        z12 = z202222;
                                        z13 = false;
                                        z14 = z12;
                                        if (z13) {
                                        }
                                        z15 = z13;
                                        z18 = z14;
                                        j.c(context, (z15 || !z10) ? false : z18);
                                    }
                                } catch (FileNotFoundException e21) {
                                    e = e21;
                                    z202222 = true;
                                    bVar2.b(6, e);
                                    z12 = z202222;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z18 = z14;
                                    j.c(context, (z15 || !z10) ? false : z18);
                                } catch (IOException e22) {
                                    e = e22;
                                    z202222 = true;
                                    bVar2.b(7, e);
                                    z12 = z202222;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z18 = z14;
                                    j.c(context, (z15 || !z10) ? false : z18);
                                }
                            } finally {
                                bVar2.f10589h = null;
                                bVar2.g = null;
                            }
                        }
                        if (z13) {
                            e(packageInfo, filesDir);
                        }
                        z15 = z13;
                        z18 = z14;
                    } finally {
                    }
                    bArr = f10599b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            bVar2.b(4, null);
                        }
                        bVar2.f10588f = true;
                        r72 = bVar2.a(assets, "dexopt/baseline.prof");
                        bArr = f10599b;
                        if (r72 != 0) {
                        }
                        cVarArr2 = bVar2.g;
                        if (cVarArr2 != null) {
                            r72 = "dexopt/baseline.profm";
                            a9 = bVar2.a(assets, "dexopt/baseline.profm");
                            z17 = r72;
                            if (a9 == null) {
                            }
                        }
                        d dVar222222 = bVar2.f10584b;
                        cVarArr3 = bVar2.g;
                        byte[] bArr422222 = bVar2.f10585c;
                        boolean z2022222 = r72;
                        z2022222 = r72;
                        if (cVarArr3 != null) {
                            r73 = bVar2.f10588f;
                            if (r73 != 0) {
                            }
                        }
                        bArr2 = bVar2.f10589h;
                        if (bArr2 != null) {
                        }
                        if (z13) {
                        }
                        z15 = z13;
                        z18 = z14;
                    } catch (IOException unused2) {
                        z11 = true;
                        bVar2.b(4, null);
                    }
                }
                j.c(context, (z15 || !z10) ? false : z18);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z11 = true;
            z15 = false;
            z18 = z11;
            j.c(context, (z15 || !z10) ? false : z18);
        } catch (PackageManager.NameNotFoundException e23) {
            dVar.c(7, e23);
            j.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) {
        byte[] bArr = new byte[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            bArr[i10] = (byte) ((j3 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        u(byteArrayOutputStream, i3, 2);
    }
}
