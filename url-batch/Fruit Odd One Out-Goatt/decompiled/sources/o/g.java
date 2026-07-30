package o;

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

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final c0.b f991a = new c0.b(10);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f992b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f993c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f994d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f995e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f996f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f997g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f998h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f999i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1000j = {48, 48, 50, 0};

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
        int i2 = 0;
        for (c cVar : cVarArr) {
            i2 += ((((cVar.f987g * 2) + 7) & (-8)) / 8) + (cVar.f985e * 2) + d(cVar.f981a, cVar.f982b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f986f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f996f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f981a, cVar2.f982b, bArr));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f988h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f981a, cVar3.f982b, bArr));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f988h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                q(byteArrayOutputStream, cVar4);
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
        boolean z2 = true;
        for (File file2 : listFiles) {
            z2 = c(file2) && z2;
        }
        return z2;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f998h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f997g;
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

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f999i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1000j)) {
                f0.l.b("Unsupported meta version");
                return null;
            }
            int m = (int) m(fileInputStream, 2);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                f0.l.b("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
            try {
                c[] k2 = k(byteArrayInputStream, bArr2, m, cVarArr);
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
        if (Arrays.equals(f994d, bArr2)) {
            f0.l.b("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            f0.l.b("Unsupported meta version");
            return null;
        }
        int m2 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            f0.l.b("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h3);
        try {
            c[] j2 = j(byteArrayInputStream2, m2, cVarArr);
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

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i2, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 != cVarArr.length) {
            f0.l.b("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m = (int) m(byteArrayInputStream, 2);
            iArr[i3] = (int) m(byteArrayInputStream, 2);
            strArr[i3] = new String(f(byteArrayInputStream, m), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            c cVar = cVarArr[i4];
            if (!cVar.f982b.equals(strArr[i4])) {
                f0.l.b("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            cVar.f985e = i5;
            cVar.f988h = g(byteArrayInputStream, i5);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 != cVarArr.length) {
            f0.l.b("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m = m(byteArrayInputStream, 4);
            int m2 = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i4].f982b.equals(substring)) {
                        cVar = cVarArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (cVar == null) {
                f0.l.b("Missing profile key: ".concat(str));
                return null;
            }
            cVar.f984d = m;
            int[] g2 = g(byteArrayInputStream, m2);
            if (Arrays.equals(bArr, f998h)) {
                cVar.f985e = m2;
                cVar.f988h = g2;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f995e)) {
            f0.l.b("Unsupported version");
            return null;
        }
        int m = (int) m(fileInputStream, 1);
        byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            f0.l.b("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
        try {
            c[] n2 = n(byteArrayInputStream, str, m);
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

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int m = (int) m(byteArrayInputStream, 2);
            int m2 = (int) m(byteArrayInputStream, 2);
            cVarArr[i4] = new c(str, new String(f(byteArrayInputStream, m), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            c cVar = cVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = cVar.f986f;
            int i7 = cVar.f987g;
            TreeMap treeMap = cVar.f989i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int m3 = (int) m(byteArrayInputStream, 2);
                while (m3 > 0) {
                    m(byteArrayInputStream, 2);
                    int m4 = (int) m(byteArrayInputStream, 1);
                    if (m4 != 6 && m4 != 7) {
                        while (m4 > 0) {
                            m(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int m5 = (int) m(byteArrayInputStream, 1); m5 > 0; m5--) {
                                m(byteArrayInputStream, 2);
                            }
                            m4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    m3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                f0.l.b("Read too much data during profile line parse");
                return null;
            }
            cVar.f988h = g(byteArrayInputStream, cVar.f985e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f994d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f995e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(cVarArr, bArr3);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, b2.length, 4);
                byte[] a2 = a(b2);
                t(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = f997g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f989i.size() * 4;
                    String d2 = d(cVar.f981a, cVar.f982b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d2.getBytes(charset).length);
                    u(byteArrayOutputStream, cVar.f988h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, cVar.f983c, 4);
                    byteArrayOutputStream.write(d2.getBytes(charset));
                    Iterator it = cVar.f989i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : cVar.f988h) {
                        u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f996f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b3 = b(cVarArr, bArr5);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr6 = f998h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String str = cVar2.f981a;
                TreeMap treeMap = cVar2.f989i;
                String d3 = d(str, cVar2.f982b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d3.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, cVar2.f988h.length);
                t(byteArrayOutputStream, cVar2.f983c, 4);
                byteArrayOutputStream.write(d3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : cVar2.f988h) {
                    u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, cVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (c cVar3 : cVarArr) {
                t(byteArrayOutputStream2, cVar3.f983c, 4);
                t(byteArrayOutputStream2, cVar3.f984d, 4);
                t(byteArrayOutputStream2, cVar3.f987g, 4);
                String d4 = d(cVar3.f981a, cVar3.f982b, bArr2);
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
            p pVar = new p(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(pVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i7];
                    u(byteArrayOutputStream3, i7);
                    u(byteArrayOutputStream3, cVar4.f985e);
                    i8 = i8 + 4 + (cVar4.f985e * i5);
                    int[] iArr = cVar4.f988h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    int i10 = i5;
                    int i11 = i9;
                    while (i11 < length3) {
                        int i12 = iArr[i11];
                        u(byteArrayOutputStream3, i12 - i9);
                        i11++;
                        i9 = i12;
                    }
                    i7++;
                    i5 = i10;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            p pVar2 = new p(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(pVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i13];
                    Iterator it3 = cVar5.f989i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i14 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i16 + length4;
                            i13++;
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
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            p pVar3 = new p(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(pVar3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                p pVar4 = (p) arrayList2.get(i17);
                int i18 = pVar4.f1011a;
                byte[] bArr7 = pVar4.f1012b;
                if (i18 == 1) {
                    j2 = 0;
                } else if (i18 == 2) {
                    j2 = 1;
                } else if (i18 == 3) {
                    j2 = 2;
                } else if (i18 == 4) {
                    j2 = 3;
                } else {
                    if (i18 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                t(byteArrayOutputStream, j2, 4);
                t(byteArrayOutputStream, size2, 4);
                if (pVar4.f1013c) {
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
                i17++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i19));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f985e);
        t(byteArrayOutputStream, cVar.f986f, 4);
        t(byteArrayOutputStream, cVar.f983c, 4);
        t(byteArrayOutputStream, cVar.f987g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        byte[] bArr = new byte[(((cVar.f987g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f989i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + cVar.f987g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i2 = 0;
        for (Map.Entry entry : cVar.f989i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, f fVar, boolean z2) {
        boolean z3;
        FileInputStream fileInputStream;
        byte[] bArr;
        ?? r6;
        c[] cVarArr;
        c[] cVarArr2;
        c[] cVarArr3;
        byte[] bArr2;
        boolean z4;
        boolean z5;
        ?? r62;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        b bVar;
        FileInputStream a2;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = readLong == packageInfo.lastUpdateTime;
                            if (z6) {
                                fVar.e(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z6) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        o.c(context, false);
                        return;
                    }
                }
                z6 = false;
                if (z6) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, fVar, name, file2);
            byte[] bArr3 = bVar2.f975c;
            if (bArr3 == null) {
                bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z3 = true;
                        bVar2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    bVar2.b(4, null);
                }
                bVar2.f978f = true;
                try {
                    try {
                        fileInputStream = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        fVar.e(6, e2);
                        fileInputStream = null;
                        bArr = f992b;
                        r6 = 8;
                        r62 = 8;
                        if (fileInputStream != null) {
                        }
                        cVarArr2 = bVar2.f979g;
                        if (cVarArr2 != null) {
                        }
                        f fVar2 = bVar2.f974b;
                        cVarArr3 = bVar2.f979g;
                        byte[] bArr4 = bVar2.f975c;
                        if (cVarArr3 != null) {
                        }
                        bArr2 = bVar2.f980h;
                        if (bArr2 == null) {
                        }
                        if (z5) {
                        }
                        o.c(context, (z5 || !z2) ? false : z3);
                    } catch (IOException e3) {
                        fVar.e(7, e3);
                        fileInputStream = null;
                        bArr = f992b;
                        r6 = 8;
                        r62 = 8;
                        if (fileInputStream != null) {
                        }
                        cVarArr2 = bVar2.f979g;
                        if (cVarArr2 != null) {
                        }
                        f fVar22 = bVar2.f974b;
                        cVarArr3 = bVar2.f979g;
                        byte[] bArr42 = bVar2.f975c;
                        if (cVarArr3 != null) {
                        }
                        bArr2 = bVar2.f980h;
                        if (bArr2 == null) {
                        }
                        if (z5) {
                        }
                        o.c(context, (z5 || !z2) ? false : z3);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e4) {
                            fVar.e(7, e4);
                            try {
                                fileInputStream.close();
                            } catch (IOException e5) {
                                fVar.e(7, e5);
                            }
                            cVarArr = null;
                            bVar2.f979g = cVarArr;
                            cVarArr2 = bVar2.f979g;
                            if (cVarArr2 != null) {
                                if (i2 != 24) {
                                    switch (i2) {
                                    }
                                }
                                try {
                                    a2 = bVar2.a(assets, "dexopt/baseline.profm");
                                    if (a2 == null) {
                                    }
                                } catch (FileNotFoundException e6) {
                                    fVar.e(9, e6);
                                } catch (IOException e7) {
                                    fVar.e(7, e7);
                                } catch (IllegalStateException e8) {
                                    bVar2.f979g = null;
                                    fVar.e(8, e8);
                                }
                            }
                            f fVar222 = bVar2.f974b;
                            cVarArr3 = bVar2.f979g;
                            byte[] bArr422 = bVar2.f975c;
                            if (cVarArr3 != null) {
                                if (bVar2.f978f) {
                                }
                            }
                            bArr2 = bVar2.f980h;
                            if (bArr2 == null) {
                            }
                            if (z5) {
                            }
                            o.c(context, (z5 || !z2) ? false : z3);
                        } catch (IllegalStateException e9) {
                            fVar.e(8, e9);
                            fileInputStream.close();
                            cVarArr = null;
                            bVar2.f979g = cVarArr;
                            cVarArr2 = bVar2.f979g;
                            if (cVarArr2 != null) {
                            }
                            f fVar2222 = bVar2.f974b;
                            cVarArr3 = bVar2.f979g;
                            byte[] bArr4222 = bVar2.f975c;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f980h;
                            if (bArr2 == null) {
                            }
                            if (z5) {
                            }
                            o.c(context, (z5 || !z2) ? false : z3);
                        }
                        if (!Arrays.equals(bArr, f(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        cVarArr = l(fileInputStream, f(fileInputStream, 4), bVar2.f977e);
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            fVar.e(7, e10);
                        }
                        bVar2.f979g = cVarArr;
                    }
                    cVarArr2 = bVar2.f979g;
                    if (cVarArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                        if (i2 != 24 && i2 != 25) {
                            switch (i2) {
                            }
                        }
                        a2 = bVar2.a(assets, "dexopt/baseline.profm");
                        if (a2 == null) {
                            try {
                                if (!Arrays.equals(f993c, f(a2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                bVar2.f979g = i(a2, f(a2, 4), bArr3, cVarArr2);
                                a2.close();
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar2 = bVar;
                                }
                            } finally {
                            }
                        } else {
                            if (a2 != null) {
                                a2.close();
                            }
                            bVar = null;
                            if (bVar != null) {
                            }
                        }
                    }
                    f fVar22222 = bVar2.f974b;
                    cVarArr3 = bVar2.f979g;
                    byte[] bArr42222 = bVar2.f975c;
                    if (cVarArr3 != null && bArr42222 != null) {
                        if (bVar2.f978f) {
                            f0.l.b("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            return;
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e11) {
                            fVar22222.e(7, e11);
                        } catch (IllegalStateException e12) {
                            fVar22222.e(8, e12);
                        }
                        if (o(byteArrayOutputStream, bArr42222, cVarArr3)) {
                            bVar2.f980h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bVar2.f979g = null;
                        } else {
                            fVar22222.e(5, null);
                            bVar2.f979g = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = bVar2.f980h;
                    if (bArr2 == null) {
                        z5 = false;
                        z3 = true;
                    } else {
                        try {
                            if (!bVar2.f978f) {
                                f0.l.b("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(bVar2.f976d);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z3 = true;
                                                        try {
                                                            bVar2.b(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            bVar2.f980h = null;
                                                            bVar2.f979g = null;
                                                            z5 = true;
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
                                } catch (FileNotFoundException e13) {
                                    e = e13;
                                    r62 = 1;
                                    bVar2.b(6, e);
                                    z4 = r62;
                                    z5 = false;
                                    z3 = z4;
                                    if (z5) {
                                    }
                                    o.c(context, (z5 || !z2) ? false : z3);
                                } catch (IOException e14) {
                                    e = e14;
                                    r6 = 1;
                                    bVar2.b(7, e);
                                    z4 = r6;
                                    z5 = false;
                                    z3 = z4;
                                    if (z5) {
                                    }
                                    o.c(context, (z5 || !z2) ? false : z3);
                                }
                            } catch (FileNotFoundException e15) {
                                e = e15;
                                bVar2.b(6, e);
                                z4 = r62;
                                z5 = false;
                                z3 = z4;
                                if (z5) {
                                }
                                o.c(context, (z5 || !z2) ? false : z3);
                            } catch (IOException e16) {
                                e = e16;
                                bVar2.b(7, e);
                                z4 = r6;
                                z5 = false;
                                z3 = z4;
                                if (z5) {
                                }
                                o.c(context, (z5 || !z2) ? false : z3);
                            }
                        } finally {
                            bVar2.f980h = null;
                            bVar2.f979g = null;
                        }
                    }
                    if (z5) {
                        e(packageInfo, filesDir);
                    }
                    o.c(context, (z5 || !z2) ? false : z3);
                } finally {
                }
                bArr = f992b;
                r6 = 8;
                r62 = 8;
            }
            z3 = true;
            z5 = false;
            o.c(context, (z5 || !z2) ? false : z3);
        } catch (PackageManager.NameNotFoundException e17) {
            fVar.e(7, e17);
            o.c(context, false);
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
