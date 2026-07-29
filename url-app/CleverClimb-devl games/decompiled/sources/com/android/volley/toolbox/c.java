package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.b;
import com.android.volley.t;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: DiskBasedCache.java */
/* loaded from: classes.dex */
public class c implements com.android.volley.b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f2333a;

    /* renamed from: b, reason: collision with root package name */
    private long f2334b;

    /* renamed from: c, reason: collision with root package name */
    private final File f2335c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2336d;

    public c(File file, int i) {
        this.f2333a = new LinkedHashMap(16, 0.75f, true);
        this.f2334b = 0L;
        this.f2335c = file;
        this.f2336d = i;
    }

    public c(File file) {
        this(file, 5242880);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.volley.b
    public synchronized b.a a(String str) {
        File c2;
        b bVar;
        a aVar = this.f2333a.get(str);
        b bVar2 = null;
        Object[] objArr = 0;
        if (aVar == null) {
            return null;
        }
        try {
            c2 = c(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            bVar = new b(new BufferedInputStream(new FileInputStream(c2)));
            try {
                a.a(bVar);
                b.a a2 = aVar.a(a(bVar, (int) (c2.length() - bVar.f2341a)));
                try {
                    bVar.close();
                    return a2;
                } catch (IOException unused) {
                    return null;
                }
            } catch (IOException e) {
                e = e;
                t.b("%s: %s", c2.getAbsolutePath(), e.toString());
                b(str);
                if (bVar != null) {
                    try {
                        bVar.close();
                    } catch (IOException unused2) {
                        return null;
                    }
                }
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                try {
                    bVar2.close();
                } catch (IOException unused3) {
                    return null;
                }
            }
            throw th;
        }
    }

    @Override // com.android.volley.b
    public synchronized void a() {
        BufferedInputStream bufferedInputStream;
        if (!this.f2335c.exists()) {
            if (!this.f2335c.mkdirs()) {
                t.c("Unable to create cache dir %s", this.f2335c.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.f2335c.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            BufferedInputStream bufferedInputStream2 = null;
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                a a2 = a.a(bufferedInputStream);
                a2.f2337a = file.length();
                a(a2.f2338b, a2);
                try {
                    bufferedInputStream.close();
                } catch (IOException unused2) {
                }
            } catch (IOException unused3) {
                bufferedInputStream2 = bufferedInputStream;
                if (file != null) {
                    file.delete();
                }
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        }
    }

    @Override // com.android.volley.b
    public synchronized void a(String str, b.a aVar) {
        a(aVar.f2259a.length);
        File c2 = c(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(c2));
            a aVar2 = new a(str, aVar);
            if (!aVar2.a(bufferedOutputStream)) {
                bufferedOutputStream.close();
                t.b("Failed to write header for %s", c2.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f2259a);
            bufferedOutputStream.close();
            a(str, aVar2);
        } catch (IOException unused) {
            if (c2.delete()) {
                return;
            }
            t.b("Could not clean up file %s", c2.getAbsolutePath());
        }
    }

    public synchronized void b(String str) {
        boolean delete = c(str).delete();
        e(str);
        if (!delete) {
            t.b("Could not delete cache entry for key=%s, filename=%s", str, d(str));
        }
    }

    private String d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public File c(String str) {
        return new File(this.f2335c, d(str));
    }

    private void a(int i) {
        long j;
        long j2 = i;
        if (this.f2334b + j2 < this.f2336d) {
            return;
        }
        if (t.f2310b) {
            t.a("Pruning old cache entries.", new Object[0]);
        }
        long j3 = this.f2334b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it = this.f2333a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (c(value.f2338b).delete()) {
                j = j2;
                this.f2334b -= value.f2337a;
            } else {
                j = j2;
                t.b("Could not delete cache entry for key=%s, filename=%s", value.f2338b, d(value.f2338b));
            }
            it.remove();
            i2++;
            if (this.f2334b + j < this.f2336d * 0.9f) {
                break;
            } else {
                j2 = j;
            }
        }
        if (t.f2310b) {
            t.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f2334b - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void a(String str, a aVar) {
        if (!this.f2333a.containsKey(str)) {
            this.f2334b += aVar.f2337a;
        } else {
            this.f2334b += aVar.f2337a - this.f2333a.get(str).f2337a;
        }
        this.f2333a.put(str, aVar);
    }

    private void e(String str) {
        a aVar = this.f2333a.get(str);
        if (aVar != null) {
            this.f2334b -= aVar.f2337a;
            this.f2333a.remove(str);
        }
    }

    private static byte[] a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected ");
        sb.append(i);
        sb.append(" bytes, read ");
        sb.append(i2);
        sb.append(" bytes");
        throw new IOException(sb.toString());
    }

    /* compiled from: DiskBasedCache.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f2337a;

        /* renamed from: b, reason: collision with root package name */
        public String f2338b;

        /* renamed from: c, reason: collision with root package name */
        public String f2339c;

        /* renamed from: d, reason: collision with root package name */
        public long f2340d;
        public long e;
        public long f;
        public long g;
        public Map<String, String> h;

        private a() {
        }

        public a(String str, b.a aVar) {
            this.f2338b = str;
            this.f2337a = aVar.f2259a.length;
            this.f2339c = aVar.f2260b;
            this.f2340d = aVar.f2261c;
            this.e = aVar.f2262d;
            this.f = aVar.e;
            this.g = aVar.f;
            this.h = aVar.g;
        }

        public static a a(InputStream inputStream) throws IOException {
            a aVar = new a();
            if (c.a(inputStream) != 538247942) {
                throw new IOException();
            }
            aVar.f2338b = c.c(inputStream);
            aVar.f2339c = c.c(inputStream);
            if (aVar.f2339c.equals("")) {
                aVar.f2339c = null;
            }
            aVar.f2340d = c.b(inputStream);
            aVar.e = c.b(inputStream);
            aVar.f = c.b(inputStream);
            aVar.g = c.b(inputStream);
            aVar.h = c.d(inputStream);
            return aVar;
        }

        public b.a a(byte[] bArr) {
            b.a aVar = new b.a();
            aVar.f2259a = bArr;
            aVar.f2260b = this.f2339c;
            aVar.f2261c = this.f2340d;
            aVar.f2262d = this.e;
            aVar.e = this.f;
            aVar.f = this.g;
            aVar.g = this.h;
            return aVar;
        }

        public boolean a(OutputStream outputStream) {
            try {
                c.a(outputStream, 538247942);
                c.a(outputStream, this.f2338b);
                c.a(outputStream, this.f2339c == null ? "" : this.f2339c);
                c.a(outputStream, this.f2340d);
                c.a(outputStream, this.e);
                c.a(outputStream, this.f);
                c.a(outputStream, this.g);
                c.a(this.h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                t.b("%s", e.toString());
                return false;
            }
        }
    }

    /* compiled from: DiskBasedCache.java */
    private static class b extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private int f2341a;

        private b(InputStream inputStream) {
            super(inputStream);
            this.f2341a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f2341a++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f2341a += read;
            }
            return read;
        }
    }

    private static int e(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static int a(InputStream inputStream) throws IOException {
        return (e(inputStream) << 24) | (e(inputStream) << 0) | 0 | (e(inputStream) << 8) | (e(inputStream) << 16);
    }

    static void a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static long b(InputStream inputStream) throws IOException {
        return ((e(inputStream) & 255) << 0) | 0 | ((e(inputStream) & 255) << 8) | ((e(inputStream) & 255) << 16) | ((e(inputStream) & 255) << 24) | ((e(inputStream) & 255) << 32) | ((e(inputStream) & 255) << 40) | ((e(inputStream) & 255) << 48) | ((255 & e(inputStream)) << 56);
    }

    static void a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String c(InputStream inputStream) throws IOException {
        return new String(a(inputStream, (int) b(inputStream)), "UTF-8");
    }

    static void a(Map<String, String> map, OutputStream outputStream) throws IOException {
        if (map != null) {
            a(outputStream, map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(outputStream, entry.getKey());
                a(outputStream, entry.getValue());
            }
            return;
        }
        a(outputStream, 0);
    }

    static Map<String, String> d(InputStream inputStream) throws IOException {
        int a2 = a(inputStream);
        Map<String, String> emptyMap = a2 == 0 ? Collections.emptyMap() : new HashMap<>(a2);
        for (int i = 0; i < a2; i++) {
            emptyMap.put(c(inputStream).intern(), c(inputStream).intern());
        }
        return emptyMap;
    }
}
