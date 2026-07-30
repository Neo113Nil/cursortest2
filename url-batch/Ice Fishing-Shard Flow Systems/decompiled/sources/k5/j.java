package k5;

import h4.v;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: l, reason: collision with root package name */
    public static final ThreadLocal f6087l = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public final C0603c f6088e;

    /* renamed from: i, reason: collision with root package name */
    public final Map f6089i;

    public j(OutputStream outputStream) {
        ThreadLocal threadLocal = C0603c.f6061f;
        C0603c c0603c = (C0603c) threadLocal.get();
        if (c0603c == null) {
            c0603c = new C0603c(outputStream);
            threadLocal.set(c0603c);
        } else {
            c0603c.f6065d = outputStream;
            c0603c.f6064c = 0;
        }
        this.f6088e = c0603c;
        ThreadLocal threadLocal2 = f6087l;
        Map map = (Map) threadLocal2.get();
        if (map == null) {
            map = new HashMap();
            threadLocal2.set(map);
        }
        this.f6089i = map;
    }

    @Override // k5.l
    public final void F(C0602b c0602b, boolean z7) {
        int i2 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i2);
        c0603c.e(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // k5.l
    public final void G(C0602b c0602b, byte[] bArr) {
        int i2 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i2);
        int length = bArr.length;
        c0603c.h(length);
        c0603c.f(bArr, length);
    }

    @Override // k5.l
    public final void H(C0602b c0602b, double d7) {
        int i2 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i2);
        c0603c.g(Double.doubleToRawLongBits(d7));
    }

    @Override // k5.l
    public final void L(C0602b c0602b, C0601a c0601a) {
        int i2 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i2);
        int i5 = c0601a.f6054a;
        if (i5 >= 0) {
            c0603c.h(i5);
        } else {
            c0603c.i(i5);
        }
    }

    @Override // k5.l
    public final void M(C0602b c0602b, int i2) {
        int i5 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i5);
        c0603c.d(4);
        byte[] bArr = c0603c.f6062a;
        int i7 = c0603c.f6064c;
        int i8 = i7 + 1;
        c0603c.f6064c = i8;
        bArr[i7] = (byte) (i2 & 255);
        int i9 = i7 + 2;
        c0603c.f6064c = i9;
        bArr[i8] = (byte) ((i2 >> 8) & 255);
        int i10 = i7 + 3;
        c0603c.f6064c = i10;
        bArr[i9] = (byte) ((i2 >> 16) & 255);
        c0603c.f6064c = i7 + 4;
        bArr[i10] = (byte) ((i2 >> 24) & 255);
    }

    @Override // k5.l
    public final void N(C0602b c0602b, long j) {
        int i2 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i2);
        c0603c.g(j);
    }

    @Override // k5.l
    public final void O(C0602b c0602b, long j) {
        int i2 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i2);
        c0603c.i(j);
    }

    @Override // k5.l
    public final void P(byte[] bArr, String str) {
        C0603c c0603c = this.f6088e;
        c0603c.getClass();
        c0603c.f(bArr, bArr.length);
    }

    @Override // k5.l
    public final void Q(C0602b c0602b, String str) {
        G(c0602b, (byte[]) this.f6089i.computeIfAbsent(str, new C4.a(19)));
    }

    @Override // k5.l
    public final void R(C0602b c0602b, String str, g gVar) {
        Map map = this.f6089i;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = gVar.j.a();
            H4.f.a(str, 16, bArr);
            map.put(str, bArr);
        }
        G(c0602b, bArr);
    }

    @Override // k5.l
    public final void S(C0602b c0602b, int i2) {
        int i5 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i5);
        c0603c.h(i2);
    }

    @Override // k5.l
    public final void U(C0602b c0602b, int i2) {
        S(c0602b, i2);
    }

    @Override // k5.l
    public final void V(C0602b c0602b, String str, int i2, g gVar) {
        char charAt;
        int i5 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i5);
        c0603c.h(i2);
        v vVar = q.f6103a;
        if (gVar.f6071b && t.f6110d && str.length() == i2 && s.b(str, t.f6108b) == 0) {
            byte[] bArr = (byte[]) s.d(str, t.f6107a);
            c0603c.f(bArr, bArr.length);
            return;
        }
        int length = str.length();
        int i7 = 0;
        while (i7 < length && (charAt = str.charAt(i7)) < 128) {
            c0603c.e((byte) charAt);
            i7++;
        }
        if (i7 == length) {
            return;
        }
        while (i7 < length) {
            char charAt2 = str.charAt(i7);
            if (charAt2 < 128) {
                c0603c.e((byte) charAt2);
            } else if (charAt2 < 2048) {
                c0603c.e((byte) ((charAt2 >>> 6) | 960));
                c0603c.e((byte) ((charAt2 & '?') | 128));
            } else if (Character.isSurrogate(charAt2)) {
                int codePointAt = Character.codePointAt(str, i7);
                if (codePointAt != charAt2) {
                    c0603c.e((byte) ((codePointAt >>> 18) | 240));
                    c0603c.e((byte) (((codePointAt >>> 12) & 63) | 128));
                    c0603c.e((byte) (((codePointAt >>> 6) & 63) | 128));
                    c0603c.e((byte) ((codePointAt & 63) | 128));
                    i7++;
                } else {
                    c0603c.e((byte) 63);
                }
            } else {
                c0603c.e((byte) ((charAt2 >>> '\f') | 480));
                c0603c.e((byte) (((charAt2 >>> 6) & 63) | 128));
                c0603c.e((byte) ((charAt2 & '?') | 128));
            }
            i7++;
        }
    }

    @Override // k5.l
    public final void W(C0602b c0602b, byte[] bArr) {
        G(c0602b, bArr);
    }

    @Override // k5.l
    public final void X(C0602b c0602b, String str) {
        G(c0602b, (byte[]) this.f6089i.computeIfAbsent(str, new C4.a(18)));
    }

    @Override // k5.l
    public final void Y(C0602b c0602b, String str, g gVar) {
        Map map = this.f6089i;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = gVar.f6078i.a();
            H4.f.a(str, 32, bArr);
            map.put(str, bArr);
        }
        G(c0602b, bArr);
    }

    @Override // k5.l
    public final void Z(C0602b c0602b, int i2) {
        int i5 = c0602b.f6057b;
        C0603c c0603c = this.f6088e;
        c0603c.h(i5);
        c0603c.h(i2);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            C0603c c0603c = this.f6088e;
            if (c0603c.f6064c > 0) {
                c0603c.c();
            }
            this.f6089i.clear();
        } catch (IOException e7) {
            throw new IOException(e7);
        }
    }

    @Override // k5.l
    public final void h(C0602b c0602b, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(c0602b, (AbstractC0605e) it.next());
        }
    }

    @Override // k5.l
    public final void j(C0602b c0602b, AbstractC0605e[] abstractC0605eArr) {
        for (AbstractC0605e abstractC0605e : abstractC0605eArr) {
            a(c0602b, abstractC0605e);
        }
    }

    @Override // k5.l
    public final void s(C0602b c0602b, List list, n nVar, g gVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            S(c0602b, gVar.e());
            nVar.c(this, obj, gVar);
        }
    }

    @Override // k5.l
    public final void I() {
    }

    @Override // k5.l
    public final void J() {
    }

    @Override // k5.l
    public final void K() {
    }

    @Override // k5.l
    public final void T(C0602b c0602b) {
    }
}
