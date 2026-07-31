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
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class x6 implements k5 {

    /* renamed from: c, reason: collision with root package name */
    private final w6 f14050c;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, u6> f14048a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f14049b = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f14051d = 5242880;

    public x6(w6 w6Var, int i7) {
        this.f14050c = w6Var;
    }

    public x6(File file, int i7) {
        this.f14050c = new t6(this, file);
    }

    static int e(InputStream inputStream) {
        return (n(inputStream) << 24) | n(inputStream) | (n(inputStream) << 8) | (n(inputStream) << 16);
    }

    static long f(InputStream inputStream) {
        return (n(inputStream) & 255) | ((n(inputStream) & 255) << 8) | ((n(inputStream) & 255) << 16) | ((n(inputStream) & 255) << 24) | ((n(inputStream) & 255) << 32) | ((n(inputStream) & 255) << 40) | ((n(inputStream) & 255) << 48) | ((255 & n(inputStream)) << 56);
    }

    static String h(v6 v6Var) {
        return new String(m(v6Var, f(v6Var)), "UTF-8");
    }

    static void j(OutputStream outputStream, int i7) {
        outputStream.write(i7 & 255);
        outputStream.write((i7 >> 8) & 255);
        outputStream.write((i7 >> 16) & 255);
        outputStream.write((i7 >> 24) & 255);
    }

    static void k(OutputStream outputStream, long j7) {
        outputStream.write((byte) j7);
        outputStream.write((byte) (j7 >>> 8));
        outputStream.write((byte) (j7 >>> 16));
        outputStream.write((byte) (j7 >>> 24));
        outputStream.write((byte) (j7 >>> 32));
        outputStream.write((byte) (j7 >>> 40));
        outputStream.write((byte) (j7 >>> 48));
        outputStream.write((byte) (j7 >>> 56));
    }

    static void l(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        k(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] m(v6 v6Var, long j7) {
        long b7 = v6Var.b();
        if (j7 >= 0 && j7 <= b7) {
            int i7 = (int) j7;
            if (i7 == j7) {
                byte[] bArr = new byte[i7];
                new DataInputStream(v6Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j7);
        sb.append(", maxLength=");
        sb.append(b7);
        throw new IOException(sb.toString());
    }

    private static int n(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void o(String str, u6 u6Var) {
        if (this.f14048a.containsKey(str)) {
            this.f14049b += u6Var.f12649a - this.f14048a.get(str).f12649a;
        } else {
            this.f14049b += u6Var.f12649a;
        }
        this.f14048a.put(str, u6Var);
    }

    private final void p(String str) {
        u6 remove = this.f14048a.remove(str);
        if (remove != null) {
            this.f14049b -= remove.f12649a;
        }
    }

    private static final String q(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.ads.k5
    public final synchronized void a() {
        long length;
        v6 v6Var;
        File zza = this.f14050c.zza();
        if (!zza.exists()) {
            if (zza.mkdirs()) {
                return;
            }
            n6.b("Unable to create cache dir %s", zza.getAbsolutePath());
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                v6Var = new v6(new BufferedInputStream(new FileInputStream(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                u6 a7 = u6.a(v6Var);
                a7.f12649a = length;
                o(a7.f12650b, a7);
                v6Var.close();
            } catch (Throwable th) {
                v6Var.close();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k5
    public final synchronized j5 b(String str) {
        u6 u6Var = this.f14048a.get(str);
        if (u6Var == null) {
            return null;
        }
        File g7 = g(str);
        try {
            v6 v6Var = new v6(new BufferedInputStream(new FileInputStream(g7)), g7.length());
            try {
                u6 a7 = u6.a(v6Var);
                if (!TextUtils.equals(str, a7.f12650b)) {
                    n6.a("%s: key=%s, found=%s", g7.getAbsolutePath(), str, a7.f12650b);
                    p(str);
                    return null;
                }
                byte[] m7 = m(v6Var, v6Var.b());
                j5 j5Var = new j5();
                j5Var.f6970a = m7;
                j5Var.f6971b = u6Var.f12651c;
                j5Var.f6972c = u6Var.f12652d;
                j5Var.f6973d = u6Var.f12653e;
                j5Var.f6974e = u6Var.f12654f;
                j5Var.f6975f = u6Var.f12655g;
                List<s5> list = u6Var.f12656h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (s5 s5Var : list) {
                    treeMap.put(s5Var.a(), s5Var.b());
                }
                j5Var.f6976g = treeMap;
                j5Var.f6977h = Collections.unmodifiableList(u6Var.f12656h);
                return j5Var;
            } finally {
                v6Var.close();
            }
        } catch (IOException e7) {
            n6.a("%s: %s", g7.getAbsolutePath(), e7.toString());
            i(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.k5
    public final synchronized void c(String str, boolean z6) {
        j5 b7 = b(str);
        if (b7 != null) {
            b7.f6975f = 0L;
            b7.f6974e = 0L;
            d(str, b7);
        }
    }

    @Override // com.google.android.gms.internal.ads.k5
    public final synchronized void d(String str, j5 j5Var) {
        long j7;
        long j8 = this.f14049b;
        int length = j5Var.f6970a.length;
        int i7 = this.f14051d;
        if (j8 + length <= i7 || length <= i7 * 0.9f) {
            File g7 = g(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(g7));
                u6 u6Var = new u6(str, j5Var);
                try {
                    j(bufferedOutputStream, 538247942);
                    l(bufferedOutputStream, u6Var.f12650b);
                    String str2 = u6Var.f12651c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    l(bufferedOutputStream, str2);
                    k(bufferedOutputStream, u6Var.f12652d);
                    k(bufferedOutputStream, u6Var.f12653e);
                    k(bufferedOutputStream, u6Var.f12654f);
                    k(bufferedOutputStream, u6Var.f12655g);
                    List<s5> list = u6Var.f12656h;
                    if (list != null) {
                        j(bufferedOutputStream, list.size());
                        for (s5 s5Var : list) {
                            l(bufferedOutputStream, s5Var.a());
                            l(bufferedOutputStream, s5Var.b());
                        }
                    } else {
                        j(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(j5Var.f6970a);
                    bufferedOutputStream.close();
                    u6Var.f12649a = g7.length();
                    o(str, u6Var);
                    if (this.f14049b >= this.f14051d) {
                        if (n6.f8944b) {
                            n6.d("Pruning old cache entries.", new Object[0]);
                        }
                        long j9 = this.f14049b;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator<Map.Entry<String, u6>> it = this.f14048a.entrySet().iterator();
                        int i8 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                j7 = elapsedRealtime;
                                break;
                            }
                            u6 value = it.next().getValue();
                            if (g(value.f12650b).delete()) {
                                j7 = elapsedRealtime;
                                this.f14049b -= value.f12649a;
                            } else {
                                j7 = elapsedRealtime;
                                String str3 = value.f12650b;
                                n6.a("Could not delete cache entry for key=%s, filename=%s", str3, q(str3));
                            }
                            it.remove();
                            i8++;
                            if (this.f14049b < this.f14051d * 0.9f) {
                                break;
                            } else {
                                elapsedRealtime = j7;
                            }
                        }
                        if (n6.f8944b) {
                            n6.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i8), Long.valueOf(this.f14049b - j9), Long.valueOf(SystemClock.elapsedRealtime() - j7));
                        }
                    }
                } catch (IOException e7) {
                    n6.a("%s", e7.toString());
                    bufferedOutputStream.close();
                    n6.a("Failed to write header for %s", g7.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!g7.delete()) {
                    n6.a("Could not clean up file %s", g7.getAbsolutePath());
                }
                if (!this.f14050c.zza().exists()) {
                    n6.a("Re-initializing cache after external clearing.", new Object[0]);
                    this.f14048a.clear();
                    this.f14049b = 0L;
                    a();
                }
            }
        }
    }

    public final File g(String str) {
        return new File(this.f14050c.zza(), q(str));
    }

    public final synchronized void i(String str) {
        boolean delete = g(str).delete();
        p(str);
        if (delete) {
            return;
        }
        n6.a("Could not delete cache entry for key=%s, filename=%s", str, q(str));
    }
}
