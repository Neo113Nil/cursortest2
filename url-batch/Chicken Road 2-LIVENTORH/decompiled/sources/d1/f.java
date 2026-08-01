package d1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.w0;
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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l2.f f1100a = new l2.f(10);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1101b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1102c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1103e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1104f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1105g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1106h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1107j = {48, 48, 50, 0};

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
        int i4 = 0;
        int i5 = 0;
        for (c cVar : cVarArr) {
            i5 += ((((cVar.f1098g * 2) + 7) & (-8)) / 8) + (cVar.f1096e * 2) + d(cVar.f1093a, cVar.f1094b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f1097f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
        if (Arrays.equals(bArr, f1104f)) {
            int length = cVarArr.length;
            while (i4 < length) {
                c cVar2 = cVarArr[i4];
                q(byteArrayOutputStream, cVar2, d(cVar2.f1093a, cVar2.f1094b, bArr));
                p(byteArrayOutputStream, cVar2);
                i4++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f1093a, cVar3.f1094b, bArr));
            }
            int length2 = cVarArr.length;
            while (i4 < length2) {
                p(byteArrayOutputStream, cVarArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i5) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i5);
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
        byte[] bArr2 = f1106h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1105g;
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

    public static byte[] f(InputStream inputStream, int i4) {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = inputStream.read(bArr, i5, i4 - i5);
            if (read < 0) {
                throw new IllegalStateException(w0.d("Not enough bytes to read: ", i4));
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

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1107j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m4 = (int) m(fileInputStream, 2);
            byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
            try {
                c[] k4 = k(byteArrayInputStream, bArr2, m4, cVarArr);
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
        if (Arrays.equals(d, bArr2)) {
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
            c[] j4 = j(byteArrayInputStream2, m5, cVarArr);
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

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i4, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i4 != cVarArr.length) {
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
            c cVar = cVarArr[i6];
            if (!cVar.f1094b.equals(strArr[i6])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            cVar.f1096e = i7;
            cVar.f1099h = g(byteArrayInputStream, i7);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i4 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m4 = m(byteArrayInputStream, 4);
            int m5 = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i6 = 0;
                while (true) {
                    if (i6 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i6].f1094b.equals(substring)) {
                        cVar = cVarArr[i6];
                        break;
                    }
                    i6++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.d = m4;
            int[] g4 = g(byteArrayInputStream, m5);
            if (Arrays.equals(bArr, f1106h)) {
                cVar.f1096e = m5;
                cVar.f1099h = g4;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f1103e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
        try {
            c[] n4 = n(byteArrayInputStream, str, m4);
            byteArrayInputStream.close();
            return n4;
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
        byte[] f2 = f(inputStream, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += (f2[i5] & 255) << (i5 * 8);
        }
        return j4;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i4) {
        int i5 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            int m5 = (int) m(byteArrayInputStream, 2);
            cVarArr[i6] = new c(str, new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m5, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m5], new TreeMap());
        }
        int i7 = 0;
        while (i7 < i4) {
            c cVar = cVarArr[i7];
            int available = byteArrayInputStream.available();
            int i8 = cVar.f1097f;
            int i9 = cVar.f1098g;
            TreeMap treeMap = cVar.i;
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
            cVar.f1099h = g(byteArrayInputStream, cVar.f1096e);
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
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1103e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b4 = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b4.length, 4);
                byte[] a2 = a(b4);
                u(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = f1105g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.i.size() * 4;
                    String d3 = d(cVar.f1093a, cVar.f1094b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d3.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.f1099h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.f1095c, 4);
                    byteArrayOutputStream.write(d3.getBytes(charset));
                    Iterator it = cVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i5 : cVar.f1099h) {
                        v(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1104f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b5 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b5.length, 4);
                byte[] a4 = a(b5);
                u(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr6 = f1106h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String str = cVar2.f1093a;
                TreeMap treeMap = cVar2.i;
                String d4 = d(str, cVar2.f1094b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d4.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.f1099h.length);
                u(byteArrayOutputStream, cVar2.f1095c, 4);
                byteArrayOutputStream.write(d4.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : cVar2.f1099h) {
                    v(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i7 = 2;
            int i8 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.f1095c, 4);
                u(byteArrayOutputStream2, cVar3.d, 4);
                u(byteArrayOutputStream2, cVar3.f1098g, 4);
                String d5 = d(cVar3.f1093a, cVar3.f1094b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d5.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(d5.getBytes(charset3));
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
            while (i9 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i9];
                    v(byteArrayOutputStream3, i9);
                    v(byteArrayOutputStream3, cVar4.f1096e);
                    i10 = i10 + 4 + (cVar4.f1096e * i7);
                    int[] iArr = cVar4.f1099h;
                    int length3 = iArr.length;
                    int i11 = i4;
                    int i12 = i7;
                    int i13 = i11;
                    while (i13 < length3) {
                        int i14 = iArr[i13];
                        v(byteArrayOutputStream3, i14 - i11);
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
            while (i15 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i15];
                    Iterator it3 = cVar5.i.entrySet().iterator();
                    int i17 = 0;
                    while (it3.hasNext()) {
                        i17 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i17, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i15);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i18 = i16 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i17);
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
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i19);
                int i20 = lVar4.f1118a;
                byte[] bArr7 = lVar4.f1119b;
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
                u(byteArrayOutputStream, j4, 4);
                u(byteArrayOutputStream, size2, 4);
                if (lVar4.f1120c) {
                    long length5 = bArr7.length;
                    byte[] a5 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a5);
                    u(byteArrayOutputStream, a5.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        s(byteArrayOutputStream, cVar);
        int i4 = cVar.f1098g;
        int[] iArr = cVar.f1099h;
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = iArr[i5];
            v(byteArrayOutputStream, i7 - i6);
            i5++;
            i6 = i7;
        }
        byte[] bArr = new byte[(((i4 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i8 = intValue / 8;
                bArr[i8] = (byte) (bArr[i8] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i9 = intValue + i4;
                int i10 = i9 / 8;
                bArr[i10] = (byte) ((1 << (i9 % 8)) | bArr[i10]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f1096e);
        u(byteArrayOutputStream, cVar.f1097f, 4);
        u(byteArrayOutputStream, cVar.f1095c, 4);
        u(byteArrayOutputStream, cVar.f1098g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i4, c cVar) {
        int i5 = cVar.f1098g;
        byte[] bArr = new byte[(((Integer.bitCount(i4 & (-2)) * i5) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i6 = 0;
            for (int i7 = 1; i7 <= 4; i7 <<= 1) {
                if (i7 != 1 && (i7 & i4) != 0) {
                    if ((i7 & intValue2) == i7) {
                        int i8 = (i6 * i5) + intValue;
                        int i9 = i8 / 8;
                        bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
                    }
                    i6++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i4 = 0;
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i4);
                v(byteArrayOutputStream, 0);
                i4 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d7 A[ADDED_TO_REGION] */
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
    public static void t(Context context, Executor executor, e eVar, boolean z3) {
        boolean z4;
        ?? r7;
        byte[] bArr;
        c[] cVarArr;
        c[] cVarArr2;
        c[] cVarArr3;
        byte[] bArr2;
        boolean z5;
        boolean z6;
        Throwable th;
        Throwable th2;
        boolean z7;
        boolean z8;
        ?? r72;
        boolean z9;
        b bVar;
        boolean z10;
        FileInputStream a2;
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
            if (!z3) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z12 = readLong == packageInfo.lastUpdateTime;
                            if (z12) {
                                eVar.m(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z12) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        k.c(context, false);
                        return;
                    }
                }
                z12 = false;
                if (z12) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, eVar, name, file2);
            byte[] bArr3 = bVar2.f1088c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        bVar2.b(4, null);
                    }
                    bVar2.f1090f = true;
                    try {
                        try {
                            r7 = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e4) {
                            eVar.m(6, e4);
                            r7 = 0;
                            bArr = f1101b;
                            if (r7 != 0) {
                            }
                            cVarArr2 = bVar2.f1091g;
                            if (cVarArr2 != null) {
                            }
                            e eVar2 = bVar2.f1087b;
                            cVarArr3 = bVar2.f1091g;
                            byte[] bArr4 = bVar2.f1088c;
                            boolean z13 = r7;
                            z13 = r7;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f1092h;
                            if (bArr2 != null) {
                            }
                            if (z6) {
                            }
                            z8 = z6;
                            z11 = z7;
                            k.c(context, (z8 || !z3) ? false : z11);
                        } catch (IOException e5) {
                            eVar.m(7, e5);
                            r7 = 0;
                            bArr = f1101b;
                            if (r7 != 0) {
                            }
                            cVarArr2 = bVar2.f1091g;
                            if (cVarArr2 != null) {
                            }
                            e eVar22 = bVar2.f1087b;
                            cVarArr3 = bVar2.f1091g;
                            byte[] bArr42 = bVar2.f1088c;
                            boolean z132 = r7;
                            z132 = r7;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f1092h;
                            if (bArr2 != null) {
                            }
                            if (z6) {
                            }
                            z8 = z6;
                            z11 = z7;
                            k.c(context, (z8 || !z3) ? false : z11);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e6) {
                                    eVar.m(8, e6);
                                    try {
                                        r7.close();
                                    } catch (IOException e7) {
                                        eVar.m(7, e7);
                                    }
                                    cVarArr = null;
                                    bVar2.f1091g = cVarArr;
                                    cVarArr2 = bVar2.f1091g;
                                    if (cVarArr2 != null) {
                                    }
                                    e eVar222 = bVar2.f1087b;
                                    cVarArr3 = bVar2.f1091g;
                                    byte[] bArr422 = bVar2.f1088c;
                                    boolean z1322 = r7;
                                    z1322 = r7;
                                    if (cVarArr3 != null) {
                                    }
                                    bArr2 = bVar2.f1092h;
                                    if (bArr2 != null) {
                                    }
                                    if (z6) {
                                    }
                                    z8 = z6;
                                    z11 = z7;
                                    k.c(context, (z8 || !z3) ? false : z11);
                                }
                            } catch (IOException e8) {
                                eVar.m(7, e8);
                                r7.close();
                                cVarArr = null;
                                bVar2.f1091g = cVarArr;
                                cVarArr2 = bVar2.f1091g;
                                if (cVarArr2 != null) {
                                }
                                e eVar2222 = bVar2.f1087b;
                                cVarArr3 = bVar2.f1091g;
                                byte[] bArr4222 = bVar2.f1088c;
                                boolean z13222 = r7;
                                z13222 = r7;
                                if (cVarArr3 != null) {
                                }
                                bArr2 = bVar2.f1092h;
                                if (bArr2 != null) {
                                }
                                if (z6) {
                                }
                                z8 = z6;
                                z11 = z7;
                                k.c(context, (z8 || !z3) ? false : z11);
                            }
                            if (!Arrays.equals(bArr, f(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            cVarArr = l(r7, f(r7, 4), bVar2.f1089e);
                            try {
                                r7.close();
                            } catch (IOException e9) {
                                eVar.m(7, e9);
                            }
                            bVar2.f1091g = cVarArr;
                        }
                        cVarArr2 = bVar2.f1091g;
                        if (cVarArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                r7 = "dexopt/baseline.profm";
                                a2 = bVar2.a(assets, "dexopt/baseline.profm");
                                z10 = r7;
                            } catch (FileNotFoundException e10) {
                                eVar.m(9, e10);
                                z10 = r7;
                            } catch (IOException e11) {
                                eVar.m(7, e11);
                                z10 = r7;
                            } catch (IllegalStateException e12) {
                                bVar2.f1091g = null;
                                eVar.m(8, e12);
                                z10 = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(f1102c, f(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] f2 = f(a2, 4);
                                    bVar2.f1091g = i(a2, f2, bArr3, cVarArr2);
                                    a2.close();
                                    bVar = bVar2;
                                    r7 = f2;
                                    if (bVar != null) {
                                        bVar2 = bVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    z10 = r7;
                                }
                                bVar = null;
                                r7 = z10;
                                if (bVar != null) {
                                }
                            }
                        }
                        e eVar22222 = bVar2.f1087b;
                        cVarArr3 = bVar2.f1091g;
                        byte[] bArr42222 = bVar2.f1088c;
                        boolean z132222 = r7;
                        z132222 = r7;
                        if (cVarArr3 != null && bArr42222 != null) {
                            r72 = bVar2.f1090f;
                            if (r72 != 0) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e13) {
                                eVar22222.m(7, e13);
                                z9 = r72;
                            } catch (IllegalStateException e14) {
                                eVar22222.m(8, e14);
                                z9 = r72;
                            }
                            if (o(r72, bArr42222, cVarArr3)) {
                                bVar2.f1092h = r72.toByteArray();
                                r72.close();
                                z9 = r72;
                                bVar2.f1091g = null;
                                z132222 = z9;
                            } else {
                                eVar22222.m(5, null);
                                bVar2.f1091g = null;
                                r72.close();
                                z132222 = r72;
                            }
                        }
                        bArr2 = bVar2.f1092h;
                        if (bArr2 != null) {
                            z6 = false;
                            z7 = true;
                        } else {
                            try {
                                if (!bVar2.f1090f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(bVar2.d);
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
                                                                                z7 = true;
                                                                                bVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                bVar2.f1092h = null;
                                                                                bVar2.f1091g = null;
                                                                                z6 = true;
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
                                    } catch (FileNotFoundException e15) {
                                        e = e15;
                                        bVar2.b(6, e);
                                        z5 = z132222;
                                        z6 = false;
                                        z7 = z5;
                                        if (z6) {
                                        }
                                        z8 = z6;
                                        z11 = z7;
                                        k.c(context, (z8 || !z3) ? false : z11);
                                    } catch (IOException e16) {
                                        e = e16;
                                        bVar2.b(7, e);
                                        z5 = z132222;
                                        z6 = false;
                                        z7 = z5;
                                        if (z6) {
                                        }
                                        z8 = z6;
                                        z11 = z7;
                                        k.c(context, (z8 || !z3) ? false : z11);
                                    }
                                } catch (FileNotFoundException e17) {
                                    e = e17;
                                    z132222 = true;
                                    bVar2.b(6, e);
                                    z5 = z132222;
                                    z6 = false;
                                    z7 = z5;
                                    if (z6) {
                                    }
                                    z8 = z6;
                                    z11 = z7;
                                    k.c(context, (z8 || !z3) ? false : z11);
                                } catch (IOException e18) {
                                    e = e18;
                                    z132222 = true;
                                    bVar2.b(7, e);
                                    z5 = z132222;
                                    z6 = false;
                                    z7 = z5;
                                    if (z6) {
                                    }
                                    z8 = z6;
                                    z11 = z7;
                                    k.c(context, (z8 || !z3) ? false : z11);
                                }
                            } finally {
                                bVar2.f1092h = null;
                                bVar2.f1091g = null;
                            }
                        }
                        if (z6) {
                            e(packageInfo, filesDir);
                        }
                        z8 = z6;
                        z11 = z7;
                    } finally {
                    }
                    bArr = f1101b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            bVar2.b(4, null);
                        }
                        bVar2.f1090f = true;
                        r7 = bVar2.a(assets, "dexopt/baseline.prof");
                        bArr = f1101b;
                        if (r7 != 0) {
                        }
                        cVarArr2 = bVar2.f1091g;
                        if (cVarArr2 != null) {
                            r7 = "dexopt/baseline.profm";
                            a2 = bVar2.a(assets, "dexopt/baseline.profm");
                            z10 = r7;
                            if (a2 == null) {
                            }
                        }
                        e eVar222222 = bVar2.f1087b;
                        cVarArr3 = bVar2.f1091g;
                        byte[] bArr422222 = bVar2.f1088c;
                        boolean z1322222 = r7;
                        z1322222 = r7;
                        if (cVarArr3 != null) {
                            r72 = bVar2.f1090f;
                            if (r72 != 0) {
                            }
                        }
                        bArr2 = bVar2.f1092h;
                        if (bArr2 != null) {
                        }
                        if (z6) {
                        }
                        z8 = z6;
                        z11 = z7;
                    } catch (IOException unused2) {
                        z4 = true;
                        bVar2.b(4, null);
                    }
                }
                k.c(context, (z8 || !z3) ? false : z11);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z4 = true;
            z8 = false;
            z11 = z4;
            k.c(context, (z8 || !z3) ? false : z11);
        } catch (PackageManager.NameNotFoundException e19) {
            eVar.m(7, e19);
            k.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j4, int i4) {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((j4 >> (i5 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        u(byteArrayOutputStream, i4, 2);
    }
}
