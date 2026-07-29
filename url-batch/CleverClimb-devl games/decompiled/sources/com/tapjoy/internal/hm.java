package com.tapjoy.internal;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class hm implements Flushable {

    /* renamed from: a, reason: collision with root package name */
    final Object f8296a = this;

    /* renamed from: b, reason: collision with root package name */
    ax f8297b;

    /* renamed from: c, reason: collision with root package name */
    private final File f8298c;

    public hm(File file) {
        this.f8298c = file;
        try {
            this.f8297b = au.a(new g(file, new bd() { // from class: com.tapjoy.internal.hm.1
                @Override // com.tapjoy.internal.bf
                public final /* bridge */ /* synthetic */ void a(OutputStream outputStream, Object obj) {
                    ew.f8044c.a(outputStream, (ew) obj);
                }

                @Override // com.tapjoy.internal.be
                public final /* synthetic */ Object b(InputStream inputStream) {
                    return (ew) ew.f8044c.a(inputStream);
                }
            }));
        } catch (Exception unused) {
            a();
        }
    }

    final void a() {
        this.f8298c.delete();
        if (this.f8297b instanceof Closeable) {
            try {
                ((Closeable) this.f8297b).close();
            } catch (Exception unused) {
            }
        }
        this.f8297b = new av(new LinkedList());
    }

    @Override // java.io.Flushable
    public final void flush() {
        synchronized (this.f8296a) {
            if (this.f8297b instanceof Flushable) {
                try {
                    ((Flushable) this.f8297b).flush();
                } catch (Exception unused) {
                    a();
                }
            }
        }
    }

    public final int b() {
        int size;
        synchronized (this.f8296a) {
            try {
                try {
                    size = this.f8297b.size();
                } catch (Exception unused) {
                    a();
                    return 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return size;
    }

    public final boolean c() {
        boolean isEmpty;
        synchronized (this.f8296a) {
            try {
                try {
                    isEmpty = this.f8297b.isEmpty();
                } catch (Exception unused) {
                    a();
                    return true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return isEmpty;
    }

    public final void a(int i) {
        synchronized (this.f8296a) {
            try {
                this.f8297b.b(i);
            } catch (Exception unused) {
                a();
            }
        }
    }

    @Nullable
    public final ew b(int i) {
        ew ewVar;
        synchronized (this.f8296a) {
            try {
                try {
                    ewVar = (ew) this.f8297b.a(i);
                } catch (Exception unused) {
                    a();
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ewVar;
    }
}
