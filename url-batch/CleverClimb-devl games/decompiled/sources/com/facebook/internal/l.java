package com.facebook.internal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: FileLruCache.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    static final String f6128a = "l";

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicLong f6129b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    private final String f6130c;

    /* renamed from: d, reason: collision with root package name */
    private final d f6131d;
    private final File e;
    private boolean f;
    private boolean g;
    private AtomicLong i = new AtomicLong(0);
    private final Object h = new Object();

    /* compiled from: FileLruCache.java */
    private interface f {
        void a();
    }

    public l(String str, d dVar) {
        this.f6130c = str;
        this.f6131d = dVar;
        this.e = new File(com.facebook.l.m(), str);
        if (this.e.mkdirs() || this.e.isDirectory()) {
            a.a(this.e);
        }
    }

    public InputStream a(String str) throws IOException {
        return a(str, (String) null);
    }

    public InputStream a(String str, String str2) throws IOException {
        File file = new File(this.e, ab.b(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject a2 = g.a(bufferedInputStream);
                if (a2 == null) {
                    return null;
                }
                String optString = a2.optString("key");
                if (optString != null && optString.equals(str)) {
                    String optString2 = a2.optString("tag", null);
                    if ((str2 == null && optString2 != null) || (str2 != null && !str2.equals(optString2))) {
                        return null;
                    }
                    long time = new Date().getTime();
                    t.a(com.facebook.u.CACHE, f6128a, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                    file.setLastModified(time);
                    return bufferedInputStream;
                }
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public OutputStream b(String str) throws IOException {
        return b(str, null);
    }

    public OutputStream b(final String str, String str2) throws IOException {
        final File b2 = a.b(this.e);
        b2.delete();
        if (!b2.createNewFile()) {
            throw new IOException("Could not create file at " + b2.getAbsolutePath());
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(b2);
            final long currentTimeMillis = System.currentTimeMillis();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new b(fileOutputStream, new f() { // from class: com.facebook.internal.l.1
                @Override // com.facebook.internal.l.f
                public void a() {
                    if (currentTimeMillis >= l.this.i.get()) {
                        l.this.a(str, b2);
                    } else {
                        b2.delete();
                    }
                }
            }), 8192);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!ab.a(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    g.a(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e2) {
                    t.a(com.facebook.u.CACHE, 5, f6128a, "Error creating JSON header for cache file: " + e2);
                    throw new IOException(e2.getMessage());
                }
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e3) {
            t.a(com.facebook.u.CACHE, 5, f6128a, "Error creating buffer output stream: " + e3);
            throw new IOException(e3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, File file) {
        if (!file.renameTo(new File(this.e, ab.b(str)))) {
            file.delete();
        }
        b();
    }

    public InputStream a(String str, InputStream inputStream) throws IOException {
        return new c(inputStream, b(str));
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.f6130c + " file:" + this.e.getName() + "}";
    }

    private void b() {
        synchronized (this.h) {
            if (!this.f) {
                this.f = true;
                com.facebook.l.d().execute(new Runnable() { // from class: com.facebook.internal.l.2
                    @Override // java.lang.Runnable
                    public void run() {
                        l.this.c();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        long j;
        synchronized (this.h) {
            this.f = false;
            this.g = true;
        }
        try {
            t.a(com.facebook.u.CACHE, f6128a, "trim started");
            PriorityQueue priorityQueue = new PriorityQueue();
            File[] listFiles = this.e.listFiles(a.a());
            long j2 = 0;
            if (listFiles != null) {
                long j3 = 0;
                j = 0;
                for (File file : listFiles) {
                    e eVar = new e(file);
                    priorityQueue.add(eVar);
                    t.a(com.facebook.u.CACHE, f6128a, "  trim considering time=" + Long.valueOf(eVar.b()) + " name=" + eVar.a().getName());
                    j3 += file.length();
                    j++;
                }
                j2 = j3;
            } else {
                j = 0;
            }
            while (true) {
                if (j2 > this.f6131d.a() || j > this.f6131d.b()) {
                    File a2 = ((e) priorityQueue.remove()).a();
                    t.a(com.facebook.u.CACHE, f6128a, "  trim removing " + a2.getName());
                    j2 -= a2.length();
                    j--;
                    a2.delete();
                } else {
                    synchronized (this.h) {
                        this.g = false;
                        this.h.notifyAll();
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            synchronized (this.h) {
                this.g = false;
                this.h.notifyAll();
                throw th;
            }
        }
    }

    /* compiled from: FileLruCache.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final FilenameFilter f6137a = new FilenameFilter() { // from class: com.facebook.internal.l.a.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return !str.startsWith("buffer");
            }
        };

        /* renamed from: b, reason: collision with root package name */
        private static final FilenameFilter f6138b = new FilenameFilter() { // from class: com.facebook.internal.l.a.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("buffer");
            }
        };

        static void a(File file) {
            File[] listFiles = file.listFiles(b());
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }

        static FilenameFilter a() {
            return f6137a;
        }

        static FilenameFilter b() {
            return f6138b;
        }

        static File b(File file) {
            return new File(file, "buffer" + Long.valueOf(l.f6129b.incrementAndGet()).toString());
        }
    }

    /* compiled from: FileLruCache.java */
    private static final class g {
        static void a(OutputStream outputStream, JSONObject jSONObject) throws IOException {
            byte[] bytes = jSONObject.toString().getBytes();
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write((bytes.length >> 0) & 255);
            outputStream.write(bytes);
        }

        static JSONObject a(InputStream inputStream) throws IOException {
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    t.a(com.facebook.u.CACHE, l.f6128a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < bArr.length) {
                int read2 = inputStream.read(bArr, i, bArr.length - i);
                if (read2 < 1) {
                    t.a(com.facebook.u.CACHE, l.f6128a, "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + bArr.length);
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr)).nextValue();
                if (!(nextValue instanceof JSONObject)) {
                    t.a(com.facebook.u.CACHE, l.f6128a, "readHeader: expected JSONObject, got " + nextValue.getClass().getCanonicalName());
                    return null;
                }
                return (JSONObject) nextValue;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    /* compiled from: FileLruCache.java */
    private static class b extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        final OutputStream f6139a;

        /* renamed from: b, reason: collision with root package name */
        final f f6140b;

        b(OutputStream outputStream, f fVar) {
            this.f6139a = outputStream;
            this.f6140b = fVar;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f6139a.close();
            } finally {
                this.f6140b.a();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f6139a.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f6139a.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f6139a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f6139a.write(i);
        }
    }

    /* compiled from: FileLruCache.java */
    private static final class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        final InputStream f6141a;

        /* renamed from: b, reason: collision with root package name */
        final OutputStream f6142b;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        c(InputStream inputStream, OutputStream outputStream) {
            this.f6141a = inputStream;
            this.f6142b = outputStream;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f6141a.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f6141a.close();
            } finally {
                this.f6142b.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            int read = this.f6141a.read(bArr);
            if (read > 0) {
                this.f6142b.write(bArr, 0, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int read = this.f6141a.read();
            if (read >= 0) {
                this.f6142b.write(read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f6141a.read(bArr, i, i2);
            if (read > 0) {
                this.f6142b.write(bArr, i, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            int read;
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j && (read = read(bArr, 0, (int) Math.min(j - j2, bArr.length))) >= 0) {
                j2 += read;
            }
            return j2;
        }
    }

    /* compiled from: FileLruCache.java */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        private int f6144b = 1024;

        /* renamed from: a, reason: collision with root package name */
        private int f6143a = 1048576;

        int a() {
            return this.f6143a;
        }

        int b() {
            return this.f6144b;
        }
    }

    /* compiled from: FileLruCache.java */
    private static final class e implements Comparable<e> {

        /* renamed from: a, reason: collision with root package name */
        private final File f6145a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6146b;

        e(File file) {
            this.f6145a = file;
            this.f6146b = file.lastModified();
        }

        File a() {
            return this.f6145a;
        }

        long b() {
            return this.f6146b;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            if (b() < eVar.b()) {
                return -1;
            }
            if (b() > eVar.b()) {
                return 1;
            }
            return a().compareTo(eVar.a());
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && compareTo((e) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.f6145a.hashCode()) * 37) + ((int) (this.f6146b % 2147483647L));
        }
    }
}
