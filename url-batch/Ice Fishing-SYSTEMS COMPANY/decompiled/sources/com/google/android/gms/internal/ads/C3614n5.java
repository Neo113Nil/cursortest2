package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import m1.C4775b;
import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3614n5 {

    /* renamed from: a, reason: collision with root package name */
    public long f32830a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32831b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f32832c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f32833d;

    public C3614n5(String str, String str2, int i, long j9) {
        this.f32830a = j9;
        this.f32832c = str;
        this.f32833d = str2;
        this.f32831b = i;
    }

    public static int B(C3506l5 c3506l5) {
        int read = c3506l5.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String C(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public static String c(String str) {
        int length = str.length() / 2;
        StringBuilder b9 = AbstractC5088e.b(String.valueOf(str.substring(0, length).hashCode()));
        b9.append(String.valueOf(str.substring(length).hashCode()));
        return b9.toString();
    }

    public static int h(C3506l5 c3506l5) {
        int read = c3506l5.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static int i(C3506l5 c3506l5) {
        return (h(c3506l5) << 24) | h(c3506l5) | (h(c3506l5) << 8) | (h(c3506l5) << 16);
    }

    public static long j(C3506l5 c3506l5) {
        return (h(c3506l5) & 255) | ((h(c3506l5) & 255) << 8) | ((h(c3506l5) & 255) << 16) | ((h(c3506l5) & 255) << 24) | ((h(c3506l5) & 255) << 32) | ((h(c3506l5) & 255) << 40) | ((h(c3506l5) & 255) << 48) | ((255 & h(c3506l5)) << 56);
    }

    public static String k(C3506l5 c3506l5) {
        return new String(l(c3506l5, j(c3506l5)), "UTF-8");
    }

    public static byte[] l(C3506l5 c3506l5, long j9) {
        long j10 = c3506l5.f32539u - c3506l5.f32540v;
        if (j9 >= 0 && j9 <= j10) {
            int i = (int) j9;
            if (i == j9) {
                byte[] bArr = new byte[i];
                new DataInputStream(c3506l5).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j9 + ", maxLength=" + j10);
    }

    public static void m(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & com.anythink.basead.exoplayer.k.p.f8630b);
        bufferedOutputStream.write((i >> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        bufferedOutputStream.write((i >> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
        bufferedOutputStream.write((i >> 24) & com.anythink.basead.exoplayer.k.p.f8630b);
    }

    public static void n(BufferedOutputStream bufferedOutputStream, long j9) {
        bufferedOutputStream.write((byte) j9);
        bufferedOutputStream.write((byte) (j9 >>> 8));
        bufferedOutputStream.write((byte) (j9 >>> 16));
        bufferedOutputStream.write((byte) (j9 >>> 24));
        bufferedOutputStream.write((byte) (j9 >>> 32));
        bufferedOutputStream.write((byte) (j9 >>> 40));
        bufferedOutputStream.write((byte) (j9 >>> 48));
        bufferedOutputStream.write((byte) (j9 >>> 56));
    }

    public static void o(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        n(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public static byte[] t(C3506l5 c3506l5, long j9) {
        long j10 = c3506l5.f32539u - c3506l5.f32540v;
        if (j9 >= 0 && j9 <= j10) {
            int i = (int) j9;
            if (i == j9) {
                byte[] bArr = new byte[i];
                new DataInputStream(c3506l5).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 33 + String.valueOf(j10).length());
        com.anythink.basead.b.c.i.x(sb, "streamToBytes length=", j9, ", maxLength=");
        sb.append(j10);
        throw new IOException(sb.toString());
    }

    public static void u(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & com.anythink.basead.exoplayer.k.p.f8630b);
        bufferedOutputStream.write((i >> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        bufferedOutputStream.write((i >> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
        bufferedOutputStream.write((i >> 24) & com.anythink.basead.exoplayer.k.p.f8630b);
    }

    public static int v(C3506l5 c3506l5) {
        return (B(c3506l5) << 24) | B(c3506l5) | (B(c3506l5) << 8) | (B(c3506l5) << 16);
    }

    public static void w(BufferedOutputStream bufferedOutputStream, long j9) {
        bufferedOutputStream.write((byte) j9);
        bufferedOutputStream.write((byte) (j9 >>> 8));
        bufferedOutputStream.write((byte) (j9 >>> 16));
        bufferedOutputStream.write((byte) (j9 >>> 24));
        bufferedOutputStream.write((byte) (j9 >>> 32));
        bufferedOutputStream.write((byte) (j9 >>> 40));
        bufferedOutputStream.write((byte) (j9 >>> 48));
        bufferedOutputStream.write((byte) (j9 >>> 56));
    }

    public static long x(C3506l5 c3506l5) {
        return (B(c3506l5) & 255) | ((B(c3506l5) & 255) << 8) | ((B(c3506l5) & 255) << 16) | ((B(c3506l5) & 255) << 24) | ((B(c3506l5) & 255) << 32) | ((B(c3506l5) & 255) << 40) | ((B(c3506l5) & 255) << 48) | ((B(c3506l5) & 255) << 56);
    }

    public static void y(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        w(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String z(C3506l5 c3506l5) {
        return new String(t(c3506l5, x(c3506l5)), "UTF-8");
    }

    public void A(String str, C3452k5 c3452k5) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f32832c;
        if (linkedHashMap.containsKey(str)) {
            this.f32830a = (c3452k5.f32254a - ((C3452k5) linkedHashMap.get(str)).f32254a) + this.f32830a;
        } else {
            this.f32830a += c3452k5.f32254a;
        }
        linkedHashMap.put(str, c3452k5);
    }

    public synchronized T4 a(String str) {
        C4775b c4775b = (C4775b) ((LinkedHashMap) this.f32832c).get(str);
        if (c4775b == null) {
            return null;
        }
        File b9 = b(str);
        try {
            C3506l5 c3506l5 = new C3506l5(new BufferedInputStream(new FileInputStream(b9)), b9.length(), 3);
            try {
                C4775b a9 = C4775b.a(c3506l5);
                if (TextUtils.equals(str, a9.f39548b)) {
                    return c4775b.b(l(c3506l5, c3506l5.f32539u - c3506l5.f32540v));
                }
                l1.j.b("%s: key=%s, found=%s", b9.getAbsolutePath(), str, a9.f39548b);
                C4775b c4775b2 = (C4775b) ((LinkedHashMap) this.f32832c).remove(str);
                if (c4775b2 != null) {
                    this.f32830a -= c4775b2.f39547a;
                }
                return null;
            } finally {
                c3506l5.close();
            }
        } catch (IOException e6) {
            l1.j.b("%s: %s", b9.getAbsolutePath(), e6.toString());
            synchronized (this) {
                boolean delete = b(str).delete();
                C4775b c4775b3 = (C4775b) ((LinkedHashMap) this.f32832c).remove(str);
                if (c4775b3 != null) {
                    this.f32830a -= c4775b3.f39547a;
                }
                if (!delete) {
                    l1.j.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
                }
                return null;
            }
        }
    }

    public File b(String str) {
        return new File(((S0.e) this.f32833d).e(), c(str));
    }

    public synchronized void d() {
        File e6 = ((S0.e) this.f32833d).e();
        if (!e6.exists()) {
            if (!e6.mkdirs()) {
                l1.j.c("Unable to create cache dir %s", e6.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = e6.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                long length = file.length();
                C3506l5 c3506l5 = new C3506l5(new BufferedInputStream(new FileInputStream(file)), length, 3);
                try {
                    C4775b a9 = C4775b.a(c3506l5);
                    a9.f39547a = length;
                    g(a9.f39548b, a9);
                    c3506l5.close();
                } catch (Throwable th) {
                    c3506l5.close();
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    public void e() {
        long j9 = this.f32830a;
        int i = this.f32831b;
        if (j9 < i) {
            return;
        }
        int i4 = 0;
        if (l1.j.f39043a) {
            l1.j.d("Pruning old cache entries.", new Object[0]);
        }
        long j10 = this.f32830a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = ((LinkedHashMap) this.f32832c).entrySet().iterator();
        while (it.hasNext()) {
            C4775b c4775b = (C4775b) ((Map.Entry) it.next()).getValue();
            if (b(c4775b.f39548b).delete()) {
                this.f32830a -= c4775b.f39547a;
            } else {
                String str = c4775b.f39548b;
                l1.j.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
            }
            it.remove();
            i4++;
            if (this.f32830a < i * 0.9f) {
                break;
            }
        }
        if (l1.j.f39043a) {
            l1.j.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i4), Long.valueOf(this.f32830a - j10), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public synchronized void f(String str, T4 t42) {
        BufferedOutputStream bufferedOutputStream;
        C4775b c4775b;
        long j9 = this.f32830a;
        byte[] bArr = t42.f27709a;
        long length = j9 + bArr.length;
        int i = this.f32831b;
        if (length <= i || bArr.length <= i * 0.9f) {
            File b9 = b(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(b9));
                c4775b = new C4775b(str, t42);
            } catch (IOException unused) {
                if (!b9.delete()) {
                    l1.j.b("Could not clean up file %s", b9.getAbsolutePath());
                }
                if (!((S0.e) this.f32833d).e().exists()) {
                    l1.j.b("Re-initializing cache after external clearing.", new Object[0]);
                    ((LinkedHashMap) this.f32832c).clear();
                    this.f32830a = 0L;
                    d();
                }
            }
            if (!c4775b.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                l1.j.b("Failed to write header for %s", b9.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(t42.f27709a);
            bufferedOutputStream.close();
            c4775b.f39547a = b9.length();
            g(str, c4775b);
            e();
        }
    }

    public void g(String str, C4775b c4775b) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f32832c;
        if (linkedHashMap.containsKey(str)) {
            this.f32830a = (c4775b.f39547a - ((C4775b) linkedHashMap.get(str)).f39547a) + this.f32830a;
        } else {
            this.f32830a += c4775b.f39547a;
        }
        linkedHashMap.put(str, c4775b);
    }

    public synchronized T4 p(String str) {
        C3452k5 c3452k5 = (C3452k5) ((LinkedHashMap) this.f32832c).get(str);
        if (c3452k5 == null) {
            return null;
        }
        File s3 = s(str);
        try {
            C3506l5 c3506l5 = new C3506l5(new BufferedInputStream(new FileInputStream(s3)), s3.length(), 0);
            try {
                String str2 = C3452k5.a(c3506l5).f32255b;
                if (!TextUtils.equals(str, str2)) {
                    AbstractC3346i5.b("%s: key=%s, found=%s", s3.getAbsolutePath(), str, str2);
                    C3452k5 c3452k52 = (C3452k5) ((LinkedHashMap) this.f32832c).remove(str);
                    if (c3452k52 != null) {
                        this.f32830a -= c3452k52.f32254a;
                    }
                    return null;
                }
                byte[] t9 = t(c3506l5, c3506l5.f32539u - c3506l5.f32540v);
                T4 t42 = new T4(0);
                t42.f27709a = t9;
                t42.f27710b = c3452k5.f32256c;
                t42.f27711c = c3452k5.f32257d;
                t42.f27712d = c3452k5.f32258e;
                t42.f27713e = c3452k5.f32259f;
                t42.f27714f = c3452k5.f32260g;
                List<X4> list = c3452k5.f32261h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (X4 x42 : list) {
                    treeMap.put(x42.f28602a, x42.f28603b);
                }
                t42.f27715g = treeMap;
                t42.f27716h = Collections.unmodifiableList(list);
                return t42;
            } finally {
                c3506l5.close();
            }
        } catch (IOException e6) {
            AbstractC3346i5.b("%s: %s", s3.getAbsolutePath(), e6.toString());
            synchronized (this) {
                boolean delete = s(str).delete();
                C3452k5 c3452k53 = (C3452k5) ((LinkedHashMap) this.f32832c).remove(str);
                if (c3452k53 != null) {
                    this.f32830a -= c3452k53.f32254a;
                }
                if (!delete) {
                    AbstractC3346i5.b("Could not delete cache entry for key=%s, filename=%s", str, C(str));
                }
                return null;
            }
        }
    }

    public synchronized void q(String str, T4 t42) {
        float f6;
        try {
            long j9 = this.f32830a;
            int length = t42.f27709a.length;
            long j10 = j9 + length;
            int i = this.f32831b;
            float f9 = 0.9f;
            if (j10 <= i || length <= i * 0.9f) {
                File s3 = s(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(s3));
                    C3452k5 c3452k5 = new C3452k5(str, t42);
                    try {
                        u(bufferedOutputStream, 538247942);
                        y(bufferedOutputStream, str);
                        String str2 = c3452k5.f32256c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        y(bufferedOutputStream, str2);
                        w(bufferedOutputStream, c3452k5.f32257d);
                        w(bufferedOutputStream, c3452k5.f32258e);
                        w(bufferedOutputStream, c3452k5.f32259f);
                        w(bufferedOutputStream, c3452k5.f32260g);
                        List<X4> list = c3452k5.f32261h;
                        if (list != null) {
                            u(bufferedOutputStream, list.size());
                            for (X4 x42 : list) {
                                y(bufferedOutputStream, x42.f28602a);
                                y(bufferedOutputStream, x42.f28603b);
                            }
                        } else {
                            u(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(t42.f27709a);
                        bufferedOutputStream.close();
                        c3452k5.f32254a = s3.length();
                        A(str, c3452k5);
                        long j11 = this.f32830a;
                        int i4 = this.f32831b;
                        if (j11 >= i4) {
                            boolean z8 = AbstractC3346i5.f31315a;
                            if (z8) {
                                AbstractC3346i5.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j12 = this.f32830a;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.f32832c).entrySet().iterator();
                            int i9 = 0;
                            while (it.hasNext()) {
                                C3452k5 c3452k52 = (C3452k5) ((Map.Entry) it.next()).getValue();
                                String str3 = c3452k52.f32255b;
                                if (s(str3).delete()) {
                                    f6 = f9;
                                    this.f32830a -= c3452k52.f32254a;
                                } else {
                                    f6 = f9;
                                    AbstractC3346i5.b("Could not delete cache entry for key=%s, filename=%s", str3, C(str3));
                                }
                                it.remove();
                                i9++;
                                if (this.f32830a < i4 * f6) {
                                    break;
                                } else {
                                    f9 = f6;
                                }
                            }
                            if (z8) {
                                AbstractC3346i5.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i9), Long.valueOf(this.f32830a - j12), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e6) {
                        AbstractC3346i5.b("%s", e6.toString());
                        bufferedOutputStream.close();
                        AbstractC3346i5.b("Failed to write header for %s", s3.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!s3.delete()) {
                        AbstractC3346i5.b("Could not clean up file %s", s3.getAbsolutePath());
                    }
                    if (!((InterfaceC3560m5) this.f32833d).mo8a().exists()) {
                        AbstractC3346i5.b("Re-initializing cache after external clearing.", new Object[0]);
                        ((LinkedHashMap) this.f32832c).clear();
                        this.f32830a = 0L;
                        r();
                    }
                }
            }
        } finally {
        }
    }

    public synchronized void r() {
        long length;
        C3506l5 c3506l5;
        File mo8a = ((InterfaceC3560m5) this.f32833d).mo8a();
        if (mo8a.exists()) {
            File[] listFiles = mo8a.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        c3506l5 = new C3506l5(new BufferedInputStream(new FileInputStream(file)), length, 0);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        C3452k5 a9 = C3452k5.a(c3506l5);
                        a9.f32254a = length;
                        A(a9.f32255b, a9);
                        c3506l5.close();
                    } catch (Throwable th) {
                        c3506l5.close();
                        throw th;
                    }
                }
            }
        } else if (!mo8a.mkdirs()) {
            AbstractC3346i5.c("Unable to create cache dir %s", mo8a.getAbsolutePath());
        }
    }

    public File s(String str) {
        return new File(((InterfaceC3560m5) this.f32833d).mo8a(), C(str));
    }

    public C3614n5(C2881Yl c2881Yl) {
        this.f32832c = new LinkedHashMap(16, 0.75f, true);
        this.f32830a = 0L;
        this.f32833d = c2881Yl;
        this.f32831b = 5242880;
    }

    public C3614n5(File file) {
        this.f32832c = new LinkedHashMap(16, 0.75f, true);
        this.f32830a = 0L;
        this.f32833d = new C3562m7(this, file);
        this.f32831b = 20971520;
    }

    public C3614n5(S0.e eVar) {
        this.f32832c = new LinkedHashMap(16, 0.75f, true);
        this.f32830a = 0L;
        this.f32833d = eVar;
        this.f32831b = 5242880;
    }
}
