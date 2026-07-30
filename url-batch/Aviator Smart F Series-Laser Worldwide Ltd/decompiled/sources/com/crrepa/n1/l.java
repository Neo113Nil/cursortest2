package com.crrepa.n1;

import com.crrepa.l1.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public final class l {

    private static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f13456a;

        /* renamed from: b, reason: collision with root package name */
        private final C0231a f13457b = new C0231a();

        /* renamed from: com.crrepa.n1.l$a$a, reason: collision with other inner class name */
        static class C0231a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            char[] f13458a;

            C0231a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i8) {
                return this.f13458a[i8];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f13458a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i8, int i9) {
                return new String(this.f13458a, i8, i9 - i8);
            }
        }

        a(Appendable appendable) {
            this.f13456a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i8) {
            this.f13456a.append((char) i8);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            C0231a c0231a = this.f13457b;
            c0231a.f13458a = cArr;
            this.f13456a.append(c0231a, i8, i9 + i8);
        }
    }

    private l() {
        throw new UnsupportedOperationException();
    }

    public static com.crrepa.l1.h a(com.crrepa.t1.a aVar) {
        boolean z7;
        try {
            try {
                aVar.t();
                z7 = false;
                try {
                    return (com.crrepa.l1.h) com.crrepa.o1.m.U.a(aVar);
                } catch (EOFException e8) {
                    e = e8;
                    if (z7) {
                        return com.crrepa.l1.i.f13253a;
                    }
                    throw new u(e);
                }
            } catch (EOFException e9) {
                e = e9;
                z7 = true;
            }
        } catch (com.crrepa.t1.e e10) {
            throw new u(e10);
        } catch (IOException e11) {
            throw new com.crrepa.l1.l(e11);
        } catch (NumberFormatException e12) {
            throw new u(e12);
        }
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    public static void a(com.crrepa.l1.h hVar, com.crrepa.t1.b bVar) {
        com.crrepa.o1.m.U.a(bVar, hVar);
    }
}
