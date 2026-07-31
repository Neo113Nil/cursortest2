package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final T.b f12204a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f12205b;

    /* renamed from: c, reason: collision with root package name */
    private final a f12206c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f12207d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f12208a;

        /* renamed from: b, reason: collision with root package name */
        private p f12209b;

        private a() {
            this(1);
        }

        a a(int i4) {
            SparseArray sparseArray = this.f12208a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i4);
        }

        final p b() {
            return this.f12209b;
        }

        void c(p pVar, int i4, int i5) {
            a a4 = a(pVar.b(i4));
            if (a4 == null) {
                a4 = new a();
                this.f12208a.put(pVar.b(i4), a4);
            }
            if (i5 > i4) {
                a4.c(pVar, i4 + 1, i5);
            } else {
                a4.f12209b = pVar;
            }
        }

        a(int i4) {
            this.f12208a = new SparseArray(i4);
        }
    }

    private n(Typeface typeface, T.b bVar) {
        this.f12207d = typeface;
        this.f12204a = bVar;
        this.f12205b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(T.b bVar) {
        int k4 = bVar.k();
        for (int i4 = 0; i4 < k4; i4++) {
            p pVar = new p(this, i4);
            Character.toChars(pVar.f(), this.f12205b, i4 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            androidx.core.os.n.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            androidx.core.os.n.b();
        }
    }

    public char[] c() {
        return this.f12205b;
    }

    public T.b d() {
        return this.f12204a;
    }

    int e() {
        return this.f12204a.l();
    }

    a f() {
        return this.f12206c;
    }

    Typeface g() {
        return this.f12207d;
    }

    void h(p pVar) {
        A.h.g(pVar, "emoji metadata cannot be null");
        A.h.a(pVar.c() > 0, "invalid metadata codepoint length");
        this.f12206c.c(pVar, 0, pVar.c() - 1);
    }
}
