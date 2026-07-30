package v3;

import a0.m;
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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j4.i f9136a = new j4.i(24);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f9137b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f9138c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f9139d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f9140e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9141f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f9142g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f9143h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f9144i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f9145j = {48, 48, 50, 0};

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
            i7 += ((((bVar.f9133g * 2) + 7) & (-8)) / 8) + (bVar.f9131e * 2) + d(bVar.f9127a, bVar.f9128b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f9132f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i7);
        if (Arrays.equals(bArr, f9141f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bVar2.f9127a, bVar2.f9128b, bArr));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.f9134h;
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
                p(byteArrayOutputStream, bVar3, d(bVar3.f9127a, bVar3.f9128b, bArr));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.f9134h;
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
        boolean z8 = true;
        for (File file2 : listFiles) {
            z8 = c(file2) && z8;
        }
        return z8;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f9143h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f9142g;
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
                return m.m(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
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
                throw new IllegalStateException(m.i("Not enough bytes to read: ", i7));
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
                } catch (DataFormatException e9) {
                    throw new IllegalStateException(e9.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i9);
        } finally {
            inflater.end();
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f9144i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f9145j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m8 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
            try {
                b[] k8 = k(byteArrayInputStream, bArr2, m8, bVarArr);
                byteArrayInputStream.close();
                return k8;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f9139d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m9 = (int) m(fileInputStream, 1);
        byte[] h8 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h8);
        try {
            b[] j8 = j(byteArrayInputStream2, m9, bVarArr);
            byteArrayInputStream2.close();
            return j8;
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
            int m8 = (int) m(byteArrayInputStream, 2);
            iArr[i8] = (int) m(byteArrayInputStream, 2);
            strArr[i8] = new String(f(byteArrayInputStream, m8), StandardCharsets.UTF_8);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            b bVar = bVarArr[i9];
            if (!bVar.f9128b.equals(strArr[i9])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            bVar.f9131e = i10;
            bVar.f9134h = g(byteArrayInputStream, i10);
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
            long m8 = m(byteArrayInputStream, 4);
            int m9 = (int) m(byteArrayInputStream, 2);
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
                    if (bVarArr[i9].f9128b.equals(substring)) {
                        bVar = bVarArr[i9];
                        break;
                    }
                    i9++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f9130d = m8;
            int[] g9 = g(byteArrayInputStream, m9);
            if (Arrays.equals(bArr, f9143h)) {
                bVar.f9131e = m9;
                bVar.f9134h = g9;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f9140e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m8 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
        try {
            b[] n8 = n(byteArrayInputStream, str, m8);
            byteArrayInputStream.close();
            return n8;
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
        byte[] f9 = f(inputStream, i7);
        long j8 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j8 += (f9[i8] & 255) << (i8 * 8);
        }
        return j8;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) {
        int i8 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            int m8 = (int) m(byteArrayInputStream, 2);
            int m9 = (int) m(byteArrayInputStream, 2);
            bVarArr[i9] = new b(str, new String(f(byteArrayInputStream, m8), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m9, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m9], new TreeMap());
        }
        int i10 = 0;
        while (i10 < i7) {
            b bVar = bVarArr[i10];
            int available = byteArrayInputStream.available();
            int i11 = bVar.f9132f;
            int i12 = bVar.f9133g;
            TreeMap treeMap = bVar.f9135i;
            int i13 = available - i11;
            int i14 = i8;
            while (byteArrayInputStream.available() > i13) {
                i14 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i14), 1);
                int m10 = (int) m(byteArrayInputStream, 2);
                while (m10 > 0) {
                    m(byteArrayInputStream, 2);
                    int m11 = (int) m(byteArrayInputStream, 1);
                    if (m11 != 6 && m11 != 7) {
                        while (m11 > 0) {
                            m(byteArrayInputStream, 1);
                            int i15 = i8;
                            int i16 = i10;
                            for (int m12 = (int) m(byteArrayInputStream, 1); m12 > 0; m12--) {
                                m(byteArrayInputStream, 2);
                            }
                            m11--;
                            i8 = i15;
                            i10 = i16;
                        }
                    }
                    m10--;
                    i8 = i8;
                    i10 = i10;
                }
            }
            int i17 = i8;
            int i18 = i10;
            if (byteArrayInputStream.available() != i13) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f9134h = g(byteArrayInputStream, bVar.f9131e);
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
        long j8;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f9139d;
        int i7 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f9140e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b9 = b(bVarArr, bArr3);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b9.length, 4);
                byte[] a3 = a(b9);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = f9142g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f9135i.size() * 4;
                    String d8 = d(bVar.f9127a, bVar.f9128b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d8.getBytes(charset).length);
                    u(byteArrayOutputStream, bVar.f9134h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, bVar.f9129c, 4);
                    byteArrayOutputStream.write(d8.getBytes(charset));
                    Iterator it = bVar.f9135i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i8 : bVar.f9134h) {
                        u(byteArrayOutputStream, i8);
                    }
                }
                return true;
            }
            byte[] bArr5 = f9141f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b10 = b(bVarArr, bArr5);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b10.length, 4);
                byte[] a9 = a(b10);
                t(byteArrayOutputStream, a9.length, 4);
                byteArrayOutputStream.write(a9);
                return true;
            }
            byte[] bArr6 = f9143h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.f9127a;
                TreeMap treeMap = bVar2.f9135i;
                String d9 = d(str, bVar2.f9128b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d9.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar2.f9134h.length);
                t(byteArrayOutputStream, bVar2.f9129c, 4);
                byteArrayOutputStream.write(d9.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i9 : bVar2.f9134h) {
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
                t(byteArrayOutputStream2, bVar3.f9129c, 4);
                t(byteArrayOutputStream2, bVar3.f9130d, 4);
                t(byteArrayOutputStream2, bVar3.f9133g, 4);
                String d10 = d(bVar3.f9127a, bVar3.f9128b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d10.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(d10.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i11 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i12];
                    u(byteArrayOutputStream3, i12);
                    u(byteArrayOutputStream3, bVar4.f9131e);
                    i13 = i13 + 4 + (bVar4.f9131e * i10);
                    int[] iArr = bVar4.f9134h;
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
            k kVar2 = new k(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i18 = 0;
            int i19 = 0;
            while (i18 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i18];
                    Iterator it3 = bVar5.f9135i.entrySet().iterator();
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
            k kVar3 = new k(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar3);
            long j9 = 4;
            long size2 = j9 + j9 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i22);
                int i23 = kVar4.f9155a;
                byte[] bArr7 = kVar4.f9156b;
                if (i23 == 1) {
                    j8 = 0;
                } else if (i23 == 2) {
                    j8 = 1;
                } else if (i23 == 3) {
                    j8 = 2;
                } else if (i23 == 4) {
                    j8 = 3;
                } else {
                    if (i23 != 5) {
                        throw null;
                    }
                    j8 = 4;
                }
                t(byteArrayOutputStream, j8, 4);
                t(byteArrayOutputStream, size2, 4);
                if (kVar4.f9157c) {
                    long length5 = bArr7.length;
                    byte[] a10 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a10);
                    t(byteArrayOutputStream, a10.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a10.length;
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
        u(byteArrayOutputStream, bVar.f9131e);
        t(byteArrayOutputStream, bVar.f9132f, 4);
        t(byteArrayOutputStream, bVar.f9129c, 4);
        t(byteArrayOutputStream, bVar.f9133g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.f9133g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f9135i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i7 = intValue / 8;
                bArr[i7] = (byte) (bArr[i7] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i8 = intValue + bVar.f9133g;
                int i9 = i8 / 8;
                bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i7 = 0;
        for (Map.Entry entry : bVar.f9135i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i7);
                u(byteArrayOutputStream, 0);
                i7 = intValue;
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
    public static void s(Context context, Executor executor, c cVar, boolean z8) {
        boolean z9;
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r72;
        b[] bVarArr;
        b[] bVarArr2;
        b[] bVarArr3;
        byte[] bArr2;
        boolean z10;
        boolean z11;
        ?? r73;
        boolean z12;
        boolean z13;
        ByteArrayOutputStream byteArrayOutputStream;
        int i7;
        a aVar;
        FileInputStream a3;
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
            if (!z8) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z15 = readLong == packageInfo.lastUpdateTime;
                            if (z15) {
                                cVar.f(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z15) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        j.c(context, false);
                        return;
                    }
                }
                z15 = false;
                if (z15) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i8 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            a aVar2 = new a(assets, executor, cVar, name, file2);
            byte[] bArr3 = aVar2.f9121c;
            if (bArr3 == null) {
                aVar2.b(3, Integer.valueOf(i8));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z9 = true;
                        aVar2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    aVar2.b(4, null);
                }
                aVar2.f9124f = true;
                try {
                    try {
                        fileInputStream = aVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e9) {
                        cVar.f(6, e9);
                        fileInputStream = null;
                        bArr = f9137b;
                        r72 = 8;
                        r73 = 8;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = aVar2.f9125g;
                        if (bVarArr2 != null) {
                        }
                        c cVar2 = aVar2.f9120b;
                        bVarArr3 = aVar2.f9125g;
                        byte[] bArr4 = aVar2.f9121c;
                        if (bVarArr3 != null) {
                        }
                        bArr2 = aVar2.f9126h;
                        if (bArr2 == null) {
                        }
                        if (z11) {
                        }
                        z13 = z11;
                        z14 = z12;
                        j.c(context, (z13 || !z8) ? false : z14);
                    } catch (IOException e10) {
                        cVar.f(7, e10);
                        fileInputStream = null;
                        bArr = f9137b;
                        r72 = 8;
                        r73 = 8;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = aVar2.f9125g;
                        if (bVarArr2 != null) {
                        }
                        c cVar22 = aVar2.f9120b;
                        bVarArr3 = aVar2.f9125g;
                        byte[] bArr42 = aVar2.f9121c;
                        if (bVarArr3 != null) {
                        }
                        bArr2 = aVar2.f9126h;
                        if (bArr2 == null) {
                        }
                        if (z11) {
                        }
                        z13 = z11;
                        z14 = z12;
                        j.c(context, (z13 || !z8) ? false : z14);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e11) {
                            cVar.f(7, e11);
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                                cVar.f(7, e12);
                            }
                            bVarArr = null;
                            aVar2.f9125g = bVarArr;
                            bVarArr2 = aVar2.f9125g;
                            if (bVarArr2 != null) {
                                if (i7 != 25) {
                                }
                                try {
                                    a3 = aVar2.a(assets, "dexopt/baseline.profm");
                                    if (a3 == null) {
                                    }
                                } catch (FileNotFoundException e13) {
                                    cVar.f(9, e13);
                                } catch (IOException e14) {
                                    cVar.f(7, e14);
                                } catch (IllegalStateException e15) {
                                    aVar2.f9125g = null;
                                    cVar.f(8, e15);
                                }
                            }
                            c cVar222 = aVar2.f9120b;
                            bVarArr3 = aVar2.f9125g;
                            byte[] bArr422 = aVar2.f9121c;
                            if (bVarArr3 != null) {
                                if (aVar2.f9124f) {
                                }
                            }
                            bArr2 = aVar2.f9126h;
                            if (bArr2 == null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z14 = z12;
                            j.c(context, (z13 || !z8) ? false : z14);
                        } catch (IllegalStateException e16) {
                            cVar.f(8, e16);
                            fileInputStream.close();
                            bVarArr = null;
                            aVar2.f9125g = bVarArr;
                            bVarArr2 = aVar2.f9125g;
                            if (bVarArr2 != null) {
                            }
                            c cVar2222 = aVar2.f9120b;
                            bVarArr3 = aVar2.f9125g;
                            byte[] bArr4222 = aVar2.f9121c;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = aVar2.f9126h;
                            if (bArr2 == null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z14 = z12;
                            j.c(context, (z13 || !z8) ? false : z14);
                        }
                        if (!Arrays.equals(bArr, f(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        bVarArr = l(fileInputStream, f(fileInputStream, 4), aVar2.f9123e);
                        try {
                            fileInputStream.close();
                        } catch (IOException e17) {
                            cVar.f(7, e17);
                        }
                        aVar2.f9125g = bVarArr;
                    }
                    bVarArr2 = aVar2.f9125g;
                    if (bVarArr2 != null && (i7 = Build.VERSION.SDK_INT) <= 34) {
                        if (i7 != 25) {
                            switch (i7) {
                            }
                        }
                        a3 = aVar2.a(assets, "dexopt/baseline.profm");
                        if (a3 == null) {
                            try {
                                if (!Arrays.equals(f9138c, f(a3, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                aVar2.f9125g = i(a3, f(a3, 4), bArr3, bVarArr2);
                                a3.close();
                                aVar = aVar2;
                                if (aVar != null) {
                                    aVar2 = aVar;
                                }
                            } finally {
                            }
                        } else {
                            if (a3 != null) {
                                a3.close();
                            }
                            aVar = null;
                            if (aVar != null) {
                            }
                        }
                    }
                    c cVar22222 = aVar2.f9120b;
                    bVarArr3 = aVar2.f9125g;
                    byte[] bArr42222 = aVar2.f9121c;
                    if (bVarArr3 != null && bArr42222 != null) {
                        if (aVar2.f9124f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e18) {
                            cVar22222.f(7, e18);
                        } catch (IllegalStateException e19) {
                            cVar22222.f(8, e19);
                        }
                        if (o(byteArrayOutputStream, bArr42222, bVarArr3)) {
                            aVar2.f9126h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            aVar2.f9125g = null;
                        } else {
                            cVar22222.f(5, null);
                            aVar2.f9125g = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = aVar2.f9126h;
                    if (bArr2 == null) {
                        z11 = false;
                        z12 = true;
                    } else {
                        try {
                            if (!aVar2.f9124f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(aVar2.f9122d);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z12 = true;
                                                        try {
                                                            aVar2.b(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            aVar2.f9126h = null;
                                                            aVar2.f9125g = null;
                                                            z11 = true;
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
                                } catch (FileNotFoundException e20) {
                                    e = e20;
                                    r73 = 1;
                                    aVar2.b(6, e);
                                    z10 = r73;
                                    z11 = false;
                                    z12 = z10;
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z14 = z12;
                                    j.c(context, (z13 || !z8) ? false : z14);
                                } catch (IOException e21) {
                                    e = e21;
                                    r72 = 1;
                                    aVar2.b(7, e);
                                    z10 = r72;
                                    z11 = false;
                                    z12 = z10;
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z14 = z12;
                                    j.c(context, (z13 || !z8) ? false : z14);
                                }
                            } catch (FileNotFoundException e22) {
                                e = e22;
                                aVar2.b(6, e);
                                z10 = r73;
                                z11 = false;
                                z12 = z10;
                                if (z11) {
                                }
                                z13 = z11;
                                z14 = z12;
                                j.c(context, (z13 || !z8) ? false : z14);
                            } catch (IOException e23) {
                                e = e23;
                                aVar2.b(7, e);
                                z10 = r72;
                                z11 = false;
                                z12 = z10;
                                if (z11) {
                                }
                                z13 = z11;
                                z14 = z12;
                                j.c(context, (z13 || !z8) ? false : z14);
                            }
                        } finally {
                            aVar2.f9126h = null;
                            aVar2.f9125g = null;
                        }
                    }
                    if (z11) {
                        e(packageInfo, filesDir);
                    }
                    z13 = z11;
                    z14 = z12;
                    j.c(context, (z13 || !z8) ? false : z14);
                } finally {
                }
                bArr = f9137b;
                r72 = 8;
                r73 = 8;
            }
            z9 = true;
            z13 = false;
            z14 = z9;
            j.c(context, (z13 || !z8) ? false : z14);
        } catch (PackageManager.NameNotFoundException e24) {
            cVar.f(7, e24);
            j.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j8, int i7) {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j8 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        t(byteArrayOutputStream, i7, 2);
    }
}
