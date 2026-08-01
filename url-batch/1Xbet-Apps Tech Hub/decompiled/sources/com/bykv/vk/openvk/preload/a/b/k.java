package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.b.a.n;
import com.bykv.vk.openvk.preload.a.m;
import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.r;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* loaded from: classes.dex */
public final class k {
    public static com.bykv.vk.openvk.preload.a.k a(com.bykv.vk.openvk.preload.a.d.a aVar) throws o {
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
                return n.X.a(aVar);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return m.a;
                }
                throw new r(e);
            }
        } catch (com.bykv.vk.openvk.preload.a.d.d e3) {
            throw new r(e3);
        } catch (IOException e4) {
            throw new com.bykv.vk.openvk.preload.a.l(e4);
        } catch (NumberFormatException e5) {
            throw new r(e5);
        }
    }

    public static void a(com.bykv.vk.openvk.preload.a.k kVar, com.bykv.vk.openvk.preload.a.d.c cVar) throws IOException {
        n.X.a(cVar, kVar);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams.java */
    static final class a extends Writer {
        private final Appendable a;
        private final C0025a b = new C0025a();

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        a(Appendable appendable) {
            this.a = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws IOException {
            this.b.a = cArr;
            this.a.append(this.b, i, i2 + i);
        }

        @Override // java.io.Writer
        public final void write(int i) throws IOException {
            this.a.append((char) i);
        }

        /* compiled from: Streams.java */
        /* renamed from: com.bykv.vk.openvk.preload.a.b.k$a$a, reason: collision with other inner class name */
        static class C0025a implements CharSequence {
            char[] a;

            C0025a() {
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.a.length;
            }

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.a[i];
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i, int i2) {
                return new String(this.a, i, i2 - i);
            }
        }
    }
}
