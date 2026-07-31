package D4;

import D3.A;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f549i = new ThreadLocal();

    /* renamed from: g, reason: collision with root package name */
    public final d f550g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f551h;

    public l(OutputStream outputStream) {
        ThreadLocal threadLocal = d.f519f;
        d dVar = (d) threadLocal.get();
        if (dVar == null) {
            dVar = new d(outputStream);
            threadLocal.set(dVar);
        } else {
            dVar.f523d = outputStream;
            dVar.f522c = 0;
        }
        this.f550g = dVar;
        ThreadLocal threadLocal2 = f549i;
        Map map = (Map) threadLocal2.get();
        if (map == null) {
            map = new HashMap();
            threadLocal2.set(map);
        }
        this.f551h = map;
    }

    @Override // D4.n
    public final void F(b bVar, boolean z5) {
        int i7 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i7);
        dVar.e(z5 ? (byte) 1 : (byte) 0);
    }

    @Override // D4.n
    public final void G(b bVar, byte[] bArr) {
        int i7 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i7);
        int length = bArr.length;
        dVar.h(length);
        dVar.f(length, bArr);
    }

    @Override // D4.n
    public final void H(b bVar, double d7) {
        int i7 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i7);
        dVar.g(Double.doubleToRawLongBits(d7));
    }

    @Override // D4.n
    public final void L(b bVar, a aVar) {
        int i7 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i7);
        int i8 = aVar.f508a;
        if (i8 >= 0) {
            dVar.h(i8);
        } else {
            dVar.i(i8);
        }
    }

    @Override // D4.n
    public final void M(b bVar, int i7) {
        int i8 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i8);
        dVar.d(4);
        byte[] bArr = dVar.f520a;
        int i9 = dVar.f522c;
        int i10 = i9 + 1;
        dVar.f522c = i10;
        bArr[i9] = (byte) (i7 & 255);
        int i11 = i9 + 2;
        dVar.f522c = i11;
        bArr[i10] = (byte) ((i7 >> 8) & 255);
        int i12 = i9 + 3;
        dVar.f522c = i12;
        bArr[i11] = (byte) ((i7 >> 16) & 255);
        dVar.f522c = i9 + 4;
        bArr[i12] = (byte) ((i7 >> 24) & 255);
    }

    @Override // D4.n
    public final void N(b bVar, long j4) {
        int i7 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i7);
        dVar.g(j4);
    }

    @Override // D4.n
    public final void O(b bVar, long j4) {
        int i7 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i7);
        dVar.i(j4);
    }

    @Override // D4.n
    public final void P(byte[] bArr, String str) {
        d dVar = this.f550g;
        dVar.getClass();
        dVar.f(bArr.length, bArr);
    }

    @Override // D4.n
    public final void Q(b bVar, String str) {
        G(bVar, (byte[]) this.f551h.computeIfAbsent(str, new A4.b(5)));
    }

    @Override // D4.n
    public final void R(b bVar, String str, i iVar) {
        Map map = this.f551h;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = iVar.f540j.a();
            a4.f.a(str, 16, bArr);
            map.put(str, bArr);
        }
        G(bVar, bArr);
    }

    @Override // D4.n
    public final void S(b bVar, int i7) {
        int i8 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i8);
        dVar.h(i7);
    }

    @Override // D4.n
    public final void U(b bVar, int i7) {
        S(bVar, i7);
    }

    @Override // D4.n
    public final void V(b bVar, String str, int i7, i iVar) {
        char charAt;
        int i8 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i8);
        dVar.h(i7);
        A a7 = s.f565a;
        if (iVar.f532b && v.f572d && str.length() == i7 && u.b(v.f570b, str) == 0) {
            byte[] bArr = (byte[]) u.d(v.f569a, str);
            dVar.f(bArr.length, bArr);
            return;
        }
        int length = str.length();
        int i9 = 0;
        while (i9 < length && (charAt = str.charAt(i9)) < 128) {
            dVar.e((byte) charAt);
            i9++;
        }
        if (i9 == length) {
            return;
        }
        while (i9 < length) {
            char charAt2 = str.charAt(i9);
            if (charAt2 < 128) {
                dVar.e((byte) charAt2);
            } else if (charAt2 < 2048) {
                dVar.e((byte) ((charAt2 >>> 6) | 960));
                dVar.e((byte) ((charAt2 & '?') | 128));
            } else if (Character.isSurrogate(charAt2)) {
                int codePointAt = Character.codePointAt(str, i9);
                if (codePointAt != charAt2) {
                    dVar.e((byte) ((codePointAt >>> 18) | 240));
                    dVar.e((byte) (((codePointAt >>> 12) & 63) | 128));
                    dVar.e((byte) (((codePointAt >>> 6) & 63) | 128));
                    dVar.e((byte) ((codePointAt & 63) | 128));
                    i9++;
                } else {
                    dVar.e((byte) 63);
                }
            } else {
                dVar.e((byte) ((charAt2 >>> '\f') | 480));
                dVar.e((byte) (((charAt2 >>> 6) & 63) | 128));
                dVar.e((byte) ((charAt2 & '?') | 128));
            }
            i9++;
        }
    }

    @Override // D4.n
    public final void W(b bVar, byte[] bArr) {
        G(bVar, bArr);
    }

    @Override // D4.n
    public final void X(b bVar, String str) {
        G(bVar, (byte[]) this.f551h.computeIfAbsent(str, new A4.b(4)));
    }

    @Override // D4.n
    public final void Y(b bVar, String str, i iVar) {
        Map map = this.f551h;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = iVar.f539i.a();
            a4.f.a(str, 32, bArr);
            map.put(str, bArr);
        }
        G(bVar, bArr);
    }

    @Override // D4.n
    public final void Z(b bVar, int i7) {
        int i8 = bVar.f511b;
        d dVar = this.f550g;
        dVar.h(i8);
        dVar.h(i7);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            d dVar = this.f550g;
            if (dVar.f522c > 0) {
                dVar.c();
            }
            this.f551h.clear();
        } catch (IOException e4) {
            throw new IOException(e4);
        }
    }

    @Override // D4.n
    public final void g(b bVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(bVar, (f) it.next());
        }
    }

    @Override // D4.n
    public final void h(b bVar, f[] fVarArr) {
        for (f fVar : fVarArr) {
            a(bVar, fVar);
        }
    }

    @Override // D4.n
    public final void m(b bVar, List list, p pVar, i iVar) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object obj = list.get(i7);
            S(bVar, iVar.e());
            pVar.b(this, obj, iVar);
        }
    }

    @Override // D4.n
    public final void I() {
    }

    @Override // D4.n
    public final void J() {
    }

    @Override // D4.n
    public final void K() {
    }

    @Override // D4.n
    public final void T(b bVar) {
    }
}
