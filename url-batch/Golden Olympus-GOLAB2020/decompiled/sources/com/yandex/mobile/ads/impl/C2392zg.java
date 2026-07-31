package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.yandex.mobile.ads.impl.zg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2392zg {

    /* renamed from: a, reason: collision with root package name */
    private final File f35585a;

    /* renamed from: b, reason: collision with root package name */
    private final File f35586b;

    /* renamed from: com.yandex.mobile.ads.impl.zg$a */
    private static final class a extends OutputStream implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f35587a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f35588b = false;

        public a(File file) {
            this.f35587a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f35588b) {
                return;
            }
            this.f35588b = true;
            this.f35587a.flush();
            try {
                this.f35587a.getFD().sync();
            } catch (IOException e4) {
                ms0.b("AtomicFile", "Failed to sync file descriptor:", e4);
            }
            this.f35587a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f35587a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i4) {
            this.f35587a.write(i4);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f35587a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i4, int i5) {
            this.f35587a.write(bArr, i4, i5);
        }
    }

    public C2392zg(File file) {
        this.f35585a = file;
        this.f35586b = new File(file.getPath() + ".bak");
    }

    public final void a() {
        this.f35585a.delete();
        this.f35586b.delete();
    }

    public final boolean b() {
        return this.f35585a.exists() || this.f35586b.exists();
    }

    public final FileInputStream c() {
        if (this.f35586b.exists()) {
            this.f35585a.delete();
            this.f35586b.renameTo(this.f35585a);
        }
        return new FileInputStream(this.f35585a);
    }

    public final OutputStream d() {
        if (this.f35585a.exists()) {
            if (this.f35586b.exists()) {
                this.f35585a.delete();
            } else if (!this.f35585a.renameTo(this.f35586b)) {
                ms0.d("AtomicFile", "Couldn't rename file " + this.f35585a + " to backup file " + this.f35586b);
            }
        }
        try {
            return new a(this.f35585a);
        } catch (FileNotFoundException e4) {
            File parentFile = this.f35585a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f35585a, e4);
            }
            try {
                return new a(this.f35585a);
            } catch (FileNotFoundException e5) {
                throw new IOException("Couldn't create " + this.f35585a, e5);
            }
        }
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.close();
        this.f35586b.delete();
    }
}
