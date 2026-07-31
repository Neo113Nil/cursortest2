package androidx.profileinstaller;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class m {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f12806a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f12807b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) {
        e.h(inputStream);
        int j4 = e.j(inputStream);
        if (j4 == 6 || j4 == 7) {
            return;
        }
        while (j4 > 0) {
            e.j(inputStream);
            for (int j5 = e.j(inputStream); j5 > 0; j5--) {
                e.h(inputStream);
            }
            j4--;
        }
    }

    static boolean B(OutputStream outputStream, byte[] bArr, d[] dVarArr) {
        if (Arrays.equals(bArr, o.f12818a)) {
            N(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, o.f12819b)) {
            M(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, o.f12821d)) {
            K(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, o.f12820c)) {
            L(outputStream, dVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, o.f12822e)) {
            return false;
        }
        J(outputStream, dVarArr);
        return true;
    }

    private static void C(OutputStream outputStream, d dVar) {
        int[] iArr = dVar.f12787h;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            e.p(outputStream, i6 - i5);
            i4++;
            i5 = i6;
        }
    }

    private static p D(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i4 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f12782c);
                e.q(byteArrayOutputStream, dVar.f12783d);
                e.q(byteArrayOutputStream, dVar.f12786g);
                String j4 = j(dVar.f12780a, dVar.f12781b, o.f12818a);
                int k4 = e.k(j4);
                e.p(byteArrayOutputStream, k4);
                i4 = i4 + 14 + k4;
                e.n(byteArrayOutputStream, j4);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i4 == byteArray.length) {
                p pVar = new p(f.DEX_FILES, i4, byteArray, false);
                byteArrayOutputStream.close();
                return pVar;
            }
            throw e.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f12806a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, d dVar) {
        I(outputStream, dVar);
        C(outputStream, dVar);
        H(outputStream, dVar);
    }

    private static void G(OutputStream outputStream, d dVar, String str) {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f12784e);
        e.q(outputStream, dVar.f12785f);
        e.q(outputStream, dVar.f12782c);
        e.q(outputStream, dVar.f12786g);
        e.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, d dVar) {
        byte[] bArr = new byte[k(dVar.f12786g)];
        for (Map.Entry entry : dVar.f12788i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, d dVar) {
        int i4 = 0;
        for (Map.Entry entry : dVar.f12788i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                e.p(outputStream, intValue - i4);
                e.p(outputStream, 0);
                i4 = intValue;
            }
        }
    }

    private static void J(OutputStream outputStream, d[] dVarArr) {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j4 = j(dVar.f12780a, dVar.f12781b, o.f12822e);
            e.p(outputStream, e.k(j4));
            e.p(outputStream, dVar.f12788i.size());
            e.p(outputStream, dVar.f12787h.length);
            e.q(outputStream, dVar.f12782c);
            e.n(outputStream, j4);
            Iterator it = dVar.f12788i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i4 : dVar.f12787h) {
                e.p(outputStream, i4);
            }
        }
    }

    private static void K(OutputStream outputStream, d[] dVarArr) {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            int size = dVar.f12788i.size() * 4;
            String j4 = j(dVar.f12780a, dVar.f12781b, o.f12821d);
            e.p(outputStream, e.k(j4));
            e.p(outputStream, dVar.f12787h.length);
            e.q(outputStream, size);
            e.q(outputStream, dVar.f12782c);
            e.n(outputStream, j4);
            Iterator it = dVar.f12788i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
                e.p(outputStream, 0);
            }
            for (int i4 : dVar.f12787h) {
                e.p(outputStream, i4);
            }
        }
    }

    private static void L(OutputStream outputStream, d[] dVarArr) {
        byte[] b4 = b(dVarArr, o.f12820c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b4);
    }

    private static void M(OutputStream outputStream, d[] dVarArr) {
        byte[] b4 = b(dVarArr, o.f12819b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b4);
    }

    private static void N(OutputStream outputStream, d[] dVarArr) {
        O(outputStream, dVarArr);
    }

    private static void O(OutputStream outputStream, d[] dVarArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = o.f12818a.length + f12806a.length + 4 + (arrayList.size() * 16);
        e.q(outputStream, arrayList.size());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            p pVar = (p) arrayList.get(i4);
            e.q(outputStream, pVar.f12825a.d());
            e.q(outputStream, length2);
            if (pVar.f12828d) {
                byte[] bArr = pVar.f12827c;
                long length3 = bArr.length;
                byte[] b4 = e.b(bArr);
                arrayList2.add(b4);
                e.q(outputStream, b4.length);
                e.q(outputStream, length3);
                length = b4.length;
            } else {
                arrayList2.add(pVar.f12827c);
                e.q(outputStream, pVar.f12827c.length);
                e.q(outputStream, 0L);
                length = pVar.f12827c.length;
            }
            length2 += length;
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            outputStream.write((byte[]) arrayList2.get(i5));
        }
    }

    private static int a(d dVar) {
        Iterator it = dVar.f12788i.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return i4;
    }

    private static byte[] b(d[] dVarArr, byte[] bArr) {
        int i4 = 0;
        int i5 = 0;
        for (d dVar : dVarArr) {
            i5 += e.k(j(dVar.f12780a, dVar.f12781b, bArr)) + 16 + (dVar.f12784e * 2) + dVar.f12785f + k(dVar.f12786g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
        if (Arrays.equals(bArr, o.f12820c)) {
            int length = dVarArr.length;
            while (i4 < length) {
                d dVar2 = dVarArr[i4];
                G(byteArrayOutputStream, dVar2, j(dVar2.f12780a, dVar2.f12781b, bArr));
                F(byteArrayOutputStream, dVar2);
                i4++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                G(byteArrayOutputStream, dVar3, j(dVar3.f12780a, dVar3.f12781b, bArr));
            }
            int length2 = dVarArr.length;
            while (i4 < length2) {
                F(byteArrayOutputStream, dVarArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i5) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i5);
    }

    private static p c(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            try {
                d dVar = dVarArr[i5];
                e.p(byteArrayOutputStream, i5);
                e.p(byteArrayOutputStream, dVar.f12784e);
                i4 = i4 + 4 + (dVar.f12784e * 2);
                C(byteArrayOutputStream, dVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i4 == byteArray.length) {
            p pVar = new p(f.CLASSES, i4, byteArray, true);
            byteArrayOutputStream.close();
            return pVar;
        }
        throw e.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
    }

    private static p d(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            try {
                d dVar = dVarArr[i5];
                int a4 = a(dVar);
                byte[] e4 = e(dVar);
                byte[] f4 = f(dVar);
                e.p(byteArrayOutputStream, i5);
                int length = e4.length + 2 + f4.length;
                e.q(byteArrayOutputStream, length);
                e.p(byteArrayOutputStream, a4);
                byteArrayOutputStream.write(e4);
                byteArrayOutputStream.write(f4);
                i4 = i4 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i4 == byteArray.length) {
            p pVar = new p(f.METHODS, i4, byteArray, true);
            byteArrayOutputStream.close();
            return pVar;
        }
        throw e.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : StringUtils.PROCESS_POSTFIX_DELIMITER.equals(str2) ? str.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    private static d i(d[] dVarArr, String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h4 = h(str);
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            if (dVarArr[i4].f12781b.equals(h4)) {
                return dVarArr[i4];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a4 = o.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a4);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return g(str2, a4);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + o.a(bArr) + str2;
    }

    private static int k(int i4) {
        return y(i4 * 2) / 8;
    }

    private static int l(int i4, int i5, int i6) {
        if (i4 == 1) {
            throw e.c("HOT methods are not stored in the bitmap");
        }
        if (i4 == 2) {
            return i5;
        }
        if (i4 == 4) {
            return i5 + i6;
        }
        throw e.c("Unexpected flag: " + i4);
    }

    private static int[] m(InputStream inputStream, int i4) {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += e.h(inputStream);
            iArr[i6] = i5;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i4, int i5) {
        int i6 = bitSet.get(l(2, i4, i5)) ? 2 : 0;
        return bitSet.get(l(4, i4, i5)) ? i6 | 4 : i6;
    }

    static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, o.f12819b.length);
        }
        throw e.c("Invalid magic");
    }

    private static void p(InputStream inputStream, d dVar) {
        int available = inputStream.available() - dVar.f12785f;
        int i4 = 0;
        while (inputStream.available() > available) {
            i4 += e.h(inputStream);
            dVar.f12788i.put(Integer.valueOf(i4), 1);
            for (int h4 = e.h(inputStream); h4 > 0; h4--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    static d[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) {
        if (Arrays.equals(bArr, o.f12823f)) {
            if (Arrays.equals(o.f12818a, bArr2)) {
                throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, dVarArr);
        }
        if (Arrays.equals(bArr, o.f12824g)) {
            return t(inputStream, bArr2, dVarArr);
        }
        throw e.c("Unsupported meta version");
    }

    static d[] r(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        if (!Arrays.equals(bArr, o.f12823f)) {
            throw e.c("Unsupported meta version");
        }
        int j4 = e.j(inputStream);
        byte[] e4 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
        try {
            d[] s4 = s(byteArrayInputStream, j4, dVarArr);
            byteArrayInputStream.close();
            return s4;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] s(InputStream inputStream, int i4, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i4 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int h4 = e.h(inputStream);
            iArr[i5] = e.h(inputStream);
            strArr[i5] = e.f(inputStream, h4);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            d dVar = dVarArr[i6];
            if (!dVar.f12781b.equals(strArr[i6])) {
                throw e.c("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            dVar.f12784e = i7;
            dVar.f12787h = m(inputStream, i7);
        }
        return dVarArr;
    }

    static d[] t(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        int h4 = e.h(inputStream);
        byte[] e4 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
        try {
            d[] u4 = u(byteArrayInputStream, bArr, h4, dVarArr);
            byteArrayInputStream.close();
            return u4;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] u(InputStream inputStream, byte[] bArr, int i4, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i4 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            e.h(inputStream);
            String f4 = e.f(inputStream, e.h(inputStream));
            long i6 = e.i(inputStream);
            int h4 = e.h(inputStream);
            d i7 = i(dVarArr, f4);
            if (i7 == null) {
                throw e.c("Missing profile key: " + f4);
            }
            i7.f12783d = i6;
            int[] m4 = m(inputStream, h4);
            if (Arrays.equals(bArr, o.f12822e)) {
                i7.f12784e = h4;
                i7.f12787h = m4;
            }
        }
        return dVarArr;
    }

    private static void v(InputStream inputStream, d dVar) {
        BitSet valueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f12786g * 2)));
        int i4 = 0;
        while (true) {
            int i5 = dVar.f12786g;
            if (i4 >= i5) {
                return;
            }
            int n4 = n(valueOf, i4, i5);
            if (n4 != 0) {
                Integer num = (Integer) dVar.f12788i.get(Integer.valueOf(i4));
                if (num == null) {
                    num = 0;
                }
                dVar.f12788i.put(Integer.valueOf(i4), Integer.valueOf(n4 | num.intValue()));
            }
            i4++;
        }
    }

    static d[] w(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, o.f12819b)) {
            throw e.c("Unsupported version");
        }
        int j4 = e.j(inputStream);
        byte[] e4 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
        try {
            d[] x4 = x(byteArrayInputStream, str, j4);
            byteArrayInputStream.close();
            return x4;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] x(InputStream inputStream, String str, int i4) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int h4 = e.h(inputStream);
            int h5 = e.h(inputStream);
            dVarArr[i5] = new d(str, e.f(inputStream, h4), e.i(inputStream), 0L, h5, (int) e.i(inputStream), (int) e.i(inputStream), new int[h5], new TreeMap());
        }
        for (int i6 = 0; i6 < i4; i6++) {
            d dVar = dVarArr[i6];
            p(inputStream, dVar);
            dVar.f12787h = m(inputStream, dVar.f12784e);
            v(inputStream, dVar);
        }
        return dVarArr;
    }

    private static int y(int i4) {
        return (i4 + 7) & (-8);
    }

    private static void z(byte[] bArr, int i4, int i5, d dVar) {
        int l4 = l(i4, i5, dVar.f12786g);
        int i6 = l4 / 8;
        bArr[i6] = (byte) ((1 << (l4 % 8)) | bArr[i6]);
    }
}
