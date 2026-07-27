package y3;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f12415d = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public final C1569c f12416b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f12417c;

    public k(OutputStream outputStream) {
        ThreadLocal threadLocal = C1569c.f12387f;
        C1569c c1569c = (C1569c) threadLocal.get();
        if (c1569c == null) {
            c1569c = new C1569c(outputStream);
            threadLocal.set(c1569c);
        } else {
            c1569c.f12391d = outputStream;
            c1569c.f12390c = 0;
        }
        this.f12416b = c1569c;
        ThreadLocal threadLocal2 = f12415d;
        Map map = (Map) threadLocal2.get();
        if (map == null) {
            map = new HashMap();
            threadLocal2.set(map);
        }
        this.f12417c = map;
    }

    @Override // y3.m
    public final void C(C1568b c1568b, boolean z) {
        int i2 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i2);
        c1569c.e(z ? (byte) 1 : (byte) 0);
    }

    @Override // y3.m
    public final void D(C1568b c1568b, byte[] bArr) {
        int i2 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i2);
        int length = bArr.length;
        c1569c.h(length);
        c1569c.f(length, bArr);
    }

    @Override // y3.m
    public final void E(C1568b c1568b, double d6) {
        int i2 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i2);
        c1569c.g(Double.doubleToRawLongBits(d6));
    }

    @Override // y3.m
    public final void I(C1568b c1568b, C1567a c1567a) {
        int i2 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i2);
        int i3 = c1567a.f12380a;
        if (i3 >= 0) {
            c1569c.h(i3);
        } else {
            c1569c.i(i3);
        }
    }

    @Override // y3.m
    public final void J(C1568b c1568b, int i2) {
        int i3 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i3);
        c1569c.d(4);
        int i6 = c1569c.f12390c;
        int i7 = i6 + 1;
        c1569c.f12390c = i7;
        byte b6 = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = c1569c.f12388a;
        bArr[i6] = b6;
        int i8 = i6 + 2;
        c1569c.f12390c = i8;
        bArr[i7] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i9 = i6 + 3;
        c1569c.f12390c = i9;
        bArr[i8] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        c1569c.f12390c = i6 + 4;
        bArr[i9] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @Override // y3.m
    public final void K(C1568b c1568b, long j2) {
        int i2 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i2);
        c1569c.g(j2);
    }

    @Override // y3.m
    public final void L(C1568b c1568b, long j2) {
        int i2 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i2);
        c1569c.i(j2);
    }

    @Override // y3.m
    public final void M(String str, byte[] bArr) {
        C1569c c1569c = this.f12416b;
        c1569c.getClass();
        c1569c.f(bArr.length, bArr);
    }

    @Override // y3.m
    public final void N(C1568b c1568b, String str) {
        D(c1568b, (byte[]) this.f12417c.computeIfAbsent(str, new j(1)));
    }

    @Override // y3.m
    public final void O(C1568b c1568b, String str, g gVar) {
        Map map = this.f12417c;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = gVar.f12405j.b();
            V2.f.a(str, 16, bArr);
            map.put(str, bArr);
        }
        D(c1568b, bArr);
    }

    @Override // y3.m
    public final void P(C1568b c1568b, int i2) {
        int i3 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i3);
        c1569c.h(i2);
    }

    @Override // y3.m
    public final void R(C1568b c1568b, int i2) {
        P(c1568b, i2);
    }

    @Override // y3.m
    public final void S(C1568b c1568b, String str, int i2, g gVar) {
        char charAt;
        int i3 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i3);
        c1569c.h(i2);
        K4.i iVar = r.f12431a;
        if (gVar.f12397b && u.f12438d && str.length() == i2 && t.b(u.f12436b, str) == 0) {
            byte[] bArr = (byte[]) t.d(u.f12435a, str);
            c1569c.f(bArr.length, bArr);
            return;
        }
        int length = str.length();
        int i6 = 0;
        while (i6 < length && (charAt = str.charAt(i6)) < 128) {
            c1569c.e((byte) charAt);
            i6++;
        }
        if (i6 == length) {
            return;
        }
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128) {
                c1569c.e((byte) charAt2);
            } else if (charAt2 < 2048) {
                c1569c.e((byte) ((charAt2 >>> 6) | 960));
                c1569c.e((byte) ((charAt2 & '?') | 128));
            } else if (Character.isSurrogate(charAt2)) {
                int codePointAt = Character.codePointAt(str, i6);
                if (codePointAt != charAt2) {
                    c1569c.e((byte) ((codePointAt >>> 18) | 240));
                    c1569c.e((byte) (((codePointAt >>> 12) & 63) | 128));
                    c1569c.e((byte) (((codePointAt >>> 6) & 63) | 128));
                    c1569c.e((byte) ((codePointAt & 63) | 128));
                    i6++;
                } else {
                    c1569c.e((byte) 63);
                }
            } else {
                c1569c.e((byte) ((charAt2 >>> '\f') | 480));
                c1569c.e((byte) (((charAt2 >>> 6) & 63) | 128));
                c1569c.e((byte) ((charAt2 & '?') | 128));
            }
            i6++;
        }
    }

    @Override // y3.m
    public final void T(C1568b c1568b, byte[] bArr) {
        D(c1568b, bArr);
    }

    @Override // y3.m
    public final void U(C1568b c1568b, String str) {
        D(c1568b, (byte[]) this.f12417c.computeIfAbsent(str, new j(0)));
    }

    @Override // y3.m
    public final void V(C1568b c1568b, String str, g gVar) {
        Map map = this.f12417c;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = gVar.f12404i.b();
            V2.f.a(str, 32, bArr);
            map.put(str, bArr);
        }
        D(c1568b, bArr);
    }

    @Override // y3.m
    public final void W(C1568b c1568b, int i2) {
        int i3 = c1568b.f12383b;
        C1569c c1569c = this.f12416b;
        c1569c.h(i3);
        c1569c.h(i2);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            C1569c c1569c = this.f12416b;
            if (c1569c.f12390c > 0) {
                c1569c.c();
            }
            this.f12417c.clear();
        } catch (IOException e3) {
            throw new IOException(e3);
        }
    }

    @Override // y3.m
    public final void g(C1568b c1568b, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(c1568b, (AbstractC1571e) it.next());
        }
    }

    @Override // y3.m
    public final void o(C1568b c1568b, AbstractC1571e[] abstractC1571eArr) {
        for (AbstractC1571e abstractC1571e : abstractC1571eArr) {
            a(c1568b, abstractC1571e);
        }
    }

    @Override // y3.m
    public final void p(C1568b c1568b, List list, o oVar, g gVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            P(c1568b, gVar.e());
            oVar.c(this, obj, gVar);
        }
    }

    @Override // y3.m
    public final void F() {
    }

    @Override // y3.m
    public final void G() {
    }

    @Override // y3.m
    public final void H() {
    }

    @Override // y3.m
    public final void Q(C1568b c1568b) {
    }
}
