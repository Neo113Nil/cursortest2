package com.google.gson.internal;

import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.r;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* loaded from: classes2.dex */
public final class j {
    public static com.google.gson.j a(com.google.gson.c.a aVar) throws n {
        boolean z;
        try {
            try {
                aVar.f();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return com.google.gson.internal.bind.i.X.b(aVar);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return l.f6665a;
                }
                throw new r(e);
            }
        } catch (com.google.gson.c.d e3) {
            throw new r(e3);
        } catch (IOException e4) {
            throw new com.google.gson.k(e4);
        } catch (NumberFormatException e5) {
            throw new r(e5);
        }
    }

    public static void a(com.google.gson.j jVar, com.google.gson.c.c cVar) throws IOException {
        com.google.gson.internal.bind.i.X.a(cVar, jVar);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams.java */
    private static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f6657a;

        /* renamed from: b, reason: collision with root package name */
        private final C0371a f6658b = new C0371a();

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        a(Appendable appendable) {
            this.f6657a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            this.f6658b.f6659a = cArr;
            this.f6657a.append(this.f6658b, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.f6657a.append((char) i);
        }

        /* compiled from: Streams.java */
        /* renamed from: com.google.gson.internal.j$a$a, reason: collision with other inner class name */
        static class C0371a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            char[] f6659a;

            C0371a() {
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f6659a.length;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f6659a[i];
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f6659a, i, i2 - i);
            }
        }
    }
}
