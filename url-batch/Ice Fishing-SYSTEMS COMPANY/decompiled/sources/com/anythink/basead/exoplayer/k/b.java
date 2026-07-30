package com.anythink.basead.exoplayer.k;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8513a = "AtomicFile";

    /* renamed from: b, reason: collision with root package name */
    private final File f8514b;

    /* renamed from: c, reason: collision with root package name */
    private final File f8515c;

    public static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f8520a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8521b = false;

        public a(File file) {
            this.f8520a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f8521b) {
                return;
            }
            this.f8521b = true;
            flush();
            try {
                this.f8520a.getFD().sync();
            } catch (IOException e6) {
                Log.w(b.f8513a, "Failed to sync file descriptor:", e6);
            }
            this.f8520a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f8520a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            this.f8520a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f8520a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i4) {
            this.f8520a.write(bArr, i, i4);
        }
    }

    public b(File file) {
        this.f8514b = file;
        this.f8515c = new File(file.getPath() + ".bak");
    }

    private void d() {
        if (this.f8515c.exists()) {
            this.f8514b.delete();
            this.f8515c.renameTo(this.f8514b);
        }
    }

    public final void a() {
        this.f8514b.delete();
        this.f8515c.delete();
    }

    public final OutputStream b() {
        if (this.f8514b.exists()) {
            if (this.f8515c.exists()) {
                this.f8514b.delete();
            } else if (!this.f8514b.renameTo(this.f8515c)) {
                Log.w(f8513a, "Couldn't rename file " + this.f8514b + " to backup file " + this.f8515c);
            }
        }
        try {
            return new a(this.f8514b);
        } catch (FileNotFoundException e6) {
            if (!this.f8514b.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f8514b, e6);
            }
            try {
                return new a(this.f8514b);
            } catch (FileNotFoundException e9) {
                throw new IOException("Couldn't create " + this.f8514b, e9);
            }
        }
    }

    public final InputStream c() {
        if (this.f8515c.exists()) {
            this.f8514b.delete();
            this.f8515c.renameTo(this.f8514b);
        }
        return new FileInputStream(this.f8514b);
    }

    public final void a(OutputStream outputStream) {
        outputStream.close();
        this.f8515c.delete();
    }
}
