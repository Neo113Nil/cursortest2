package b.a.h;

import b.a.c;
import c.e;
import c.i;
import c.k;
import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PublicSuffixDatabase.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f2021a = {42};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f2022b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f2023c = {"*"};

    /* renamed from: d, reason: collision with root package name */
    private static final a f2024d = new a();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] g;
    private byte[] h;

    public static a a() {
        return f2024d;
    }

    public String a(String str) {
        int length;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] a2 = a(split);
        if (split.length == a2.length && a2[0].charAt(0) != '!') {
            return null;
        }
        if (a2[0].charAt(0) == '!') {
            length = split.length - a2.length;
        } else {
            length = split.length - (a2.length + 1);
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        while (length < split2.length) {
            sb.append(split2[length]);
            sb.append('.');
            length++;
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String[] a(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        if (!this.e.get() && this.e.compareAndSet(false, true)) {
            b();
        } else {
            try {
                this.f.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (this.g == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        byte[][] bArr = new byte[strArr.length][];
        for (int i = 0; i < strArr.length; i++) {
            bArr[i] = strArr[i].getBytes(c.e);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= bArr.length) {
                str = null;
                break;
            }
            str = a(this.g, bArr, i2);
            if (str != null) {
                break;
            }
            i2++;
        }
        if (bArr.length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i3 = 0; i3 < bArr2.length - 1; i3++) {
                bArr2[i3] = f2021a;
                str2 = a(this.g, bArr2, i3);
                if (str2 != null) {
                    break;
                }
            }
        }
        str2 = null;
        if (str2 != null) {
            for (int i4 = 0; i4 < bArr.length - 1; i4++) {
                str3 = a(this.h, bArr, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            return ("!" + str3).split("\\.");
        }
        if (str == null && str2 == null) {
            return f2023c;
        }
        if (str != null) {
            strArr2 = str.split("\\.");
        } else {
            strArr2 = f2022b;
        }
        if (str2 != null) {
            strArr3 = str2.split("\\.");
        } else {
            strArr3 = f2022b;
        }
        return strArr2.length > strArr3.length ? strArr2 : strArr3;
    }

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z) {
                    z = false;
                    i3 = 46;
                } else {
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length == i11) {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        z = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, c.e);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b() {
        byte[] bArr;
        InputStream resourceAsStream = a.class.getClassLoader().getResourceAsStream("publicsuffixes.gz");
        byte[] bArr2 = null;
        if (resourceAsStream != null) {
            e a2 = k.a(new i(k.a(resourceAsStream)));
            try {
                try {
                    byte[] bArr3 = new byte[a2.k()];
                    a2.a(bArr3);
                    bArr = new byte[a2.k()];
                    a2.a(bArr);
                    c.a(a2);
                    bArr2 = bArr3;
                } catch (IOException e) {
                    b.a.g.e.b().a(5, "Failed to read public suffix list", e);
                    c.a(a2);
                }
                synchronized (this) {
                    this.g = bArr2;
                    this.h = bArr;
                }
                this.f.countDown();
                return;
            } catch (Throwable th) {
                c.a(a2);
                throw th;
            }
        }
        bArr = null;
        synchronized (this) {
        }
    }
}
