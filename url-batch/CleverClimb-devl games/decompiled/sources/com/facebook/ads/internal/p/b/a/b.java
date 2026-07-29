package com.facebook.ads.internal.p.b.a;

import com.facebook.ads.internal.p.b.l;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class b implements com.facebook.ads.internal.p.b.a {

    /* renamed from: a, reason: collision with root package name */
    public File f5310a;

    /* renamed from: b, reason: collision with root package name */
    private final a f5311b;

    /* renamed from: c, reason: collision with root package name */
    private RandomAccessFile f5312c;

    public b(File file, a aVar) {
        File file2;
        try {
            if (aVar == null) {
                throw new NullPointerException();
            }
            this.f5311b = aVar;
            d.a(file.getParentFile());
            boolean exists = file.exists();
            if (exists) {
                file2 = file;
            } else {
                file2 = new File(file.getParentFile(), file.getName() + ".download");
            }
            this.f5310a = file2;
            this.f5312c = new RandomAccessFile(this.f5310a, exists ? "r" : "rw");
        } catch (IOException e) {
            throw new l("Error using file " + file + " as disc cache", e);
        }
    }

    private boolean a(File file) {
        return file.getName().endsWith(".download");
    }

    @Override // com.facebook.ads.internal.p.b.a
    public synchronized int a() {
        try {
        } catch (IOException e) {
            throw new l("Error reading length of file " + this.f5310a, e);
        }
        return (int) this.f5312c.length();
    }

    @Override // com.facebook.ads.internal.p.b.a
    public synchronized int a(byte[] bArr, long j, int i) {
        try {
            this.f5312c.seek(j);
        } catch (IOException e) {
            throw new l(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(a()), Integer.valueOf(bArr.length)), e);
        }
        return this.f5312c.read(bArr, 0, i);
    }

    @Override // com.facebook.ads.internal.p.b.a
    public synchronized void a(byte[] bArr, int i) {
        try {
            if (d()) {
                throw new l("Error append cache: cache file " + this.f5310a + " is completed!");
            }
            this.f5312c.seek(a());
            this.f5312c.write(bArr, 0, i);
        } catch (IOException e) {
            throw new l(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.f5312c, Integer.valueOf(bArr.length)), e);
        }
    }

    @Override // com.facebook.ads.internal.p.b.a
    public synchronized void b() {
        try {
            this.f5312c.close();
            this.f5311b.a(this.f5310a);
        } catch (IOException e) {
            throw new l("Error closing file " + this.f5310a, e);
        }
    }

    @Override // com.facebook.ads.internal.p.b.a
    public synchronized void c() {
        if (d()) {
            return;
        }
        b();
        File file = new File(this.f5310a.getParentFile(), this.f5310a.getName().substring(0, this.f5310a.getName().length() - ".download".length()));
        if (!this.f5310a.renameTo(file)) {
            throw new l("Error renaming file " + this.f5310a + " to " + file + " for completion!");
        }
        this.f5310a = file;
        try {
            this.f5312c = new RandomAccessFile(this.f5310a, "r");
        } catch (IOException e) {
            throw new l("Error opening " + this.f5310a + " as disc cache", e);
        }
    }

    @Override // com.facebook.ads.internal.p.b.a
    public synchronized boolean d() {
        return !a(this.f5310a);
    }
}
