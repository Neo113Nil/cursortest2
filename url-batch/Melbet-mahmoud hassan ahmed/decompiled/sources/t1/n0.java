package t1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import n2.b;
import t1.p0;
import w0.e0;

/* loaded from: classes.dex */
class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final n2.b f22132a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22133b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.a0 f22134c;

    /* renamed from: d, reason: collision with root package name */
    private a f22135d;

    /* renamed from: e, reason: collision with root package name */
    private a f22136e;

    /* renamed from: f, reason: collision with root package name */
    private a f22137f;

    /* renamed from: g, reason: collision with root package name */
    private long f22138g;

    private static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f22139a;

        /* renamed from: b, reason: collision with root package name */
        public long f22140b;

        /* renamed from: c, reason: collision with root package name */
        public n2.a f22141c;

        /* renamed from: d, reason: collision with root package name */
        public a f22142d;

        public a(long j7, int i7) {
            d(j7, i7);
        }

        @Override // n2.b.a
        public n2.a a() {
            return (n2.a) o2.a.e(this.f22141c);
        }

        public a b() {
            this.f22141c = null;
            a aVar = this.f22142d;
            this.f22142d = null;
            return aVar;
        }

        public void c(n2.a aVar, a aVar2) {
            this.f22141c = aVar;
            this.f22142d = aVar2;
        }

        public void d(long j7, int i7) {
            o2.a.f(this.f22141c == null);
            this.f22139a = j7;
            this.f22140b = j7 + i7;
        }

        public int e(long j7) {
            return ((int) (j7 - this.f22139a)) + this.f22141c.f19389b;
        }

        @Override // n2.b.a
        public b.a next() {
            a aVar = this.f22142d;
            if (aVar == null || aVar.f22141c == null) {
                return null;
            }
            return aVar;
        }
    }

    public n0(n2.b bVar) {
        this.f22132a = bVar;
        int e7 = bVar.e();
        this.f22133b = e7;
        this.f22134c = new o2.a0(32);
        a aVar = new a(0L, e7);
        this.f22135d = aVar;
        this.f22136e = aVar;
        this.f22137f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f22141c == null) {
            return;
        }
        this.f22132a.b(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j7) {
        while (j7 >= aVar.f22140b) {
            aVar = aVar.f22142d;
        }
        return aVar;
    }

    private void g(int i7) {
        long j7 = this.f22138g + i7;
        this.f22138g = j7;
        a aVar = this.f22137f;
        if (j7 == aVar.f22140b) {
            this.f22137f = aVar.f22142d;
        }
    }

    private int h(int i7) {
        a aVar = this.f22137f;
        if (aVar.f22141c == null) {
            aVar.c(this.f22132a.d(), new a(this.f22137f.f22140b, this.f22133b));
        }
        return Math.min(i7, (int) (this.f22137f.f22140b - this.f22138g));
    }

    private static a i(a aVar, long j7, ByteBuffer byteBuffer, int i7) {
        a d7 = d(aVar, j7);
        while (i7 > 0) {
            int min = Math.min(i7, (int) (d7.f22140b - j7));
            byteBuffer.put(d7.f22141c.f19388a, d7.e(j7), min);
            i7 -= min;
            j7 += min;
            if (j7 == d7.f22140b) {
                d7 = d7.f22142d;
            }
        }
        return d7;
    }

    private static a j(a aVar, long j7, byte[] bArr, int i7) {
        a d7 = d(aVar, j7);
        int i8 = i7;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (d7.f22140b - j7));
            System.arraycopy(d7.f22141c.f19388a, d7.e(j7), bArr, i7 - i8, min);
            i8 -= min;
            j7 += min;
            if (j7 == d7.f22140b) {
                d7 = d7.f22142d;
            }
        }
        return d7;
    }

    private static a k(a aVar, u0.g gVar, p0.b bVar, o2.a0 a0Var) {
        int i7;
        long j7 = bVar.f22177b;
        a0Var.K(1);
        a j8 = j(aVar, j7, a0Var.d(), 1);
        long j9 = j7 + 1;
        byte b7 = a0Var.d()[0];
        boolean z6 = (b7 & 128) != 0;
        int i8 = b7 & Byte.MAX_VALUE;
        u0.c cVar = gVar.f22410g;
        byte[] bArr = cVar.f22386a;
        if (bArr == null) {
            cVar.f22386a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j10 = j(j8, j9, cVar.f22386a, i8);
        long j11 = j9 + i8;
        if (z6) {
            a0Var.K(2);
            j10 = j(j10, j11, a0Var.d(), 2);
            j11 += 2;
            i7 = a0Var.I();
        } else {
            i7 = 1;
        }
        int[] iArr = cVar.f22389d;
        if (iArr == null || iArr.length < i7) {
            iArr = new int[i7];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f22390e;
        if (iArr3 == null || iArr3.length < i7) {
            iArr3 = new int[i7];
        }
        int[] iArr4 = iArr3;
        if (z6) {
            int i9 = i7 * 6;
            a0Var.K(i9);
            j10 = j(j10, j11, a0Var.d(), i9);
            j11 += i9;
            a0Var.O(0);
            for (int i10 = 0; i10 < i7; i10++) {
                iArr2[i10] = a0Var.I();
                iArr4[i10] = a0Var.G();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f22176a - ((int) (j11 - bVar.f22177b));
        }
        e0.a aVar2 = (e0.a) o2.m0.j(bVar.f22178c);
        cVar.c(i7, iArr2, iArr4, aVar2.f22895b, cVar.f22386a, aVar2.f22894a, aVar2.f22896c, aVar2.f22897d);
        long j12 = bVar.f22177b;
        int i11 = (int) (j11 - j12);
        bVar.f22177b = j12 + i11;
        bVar.f22176a -= i11;
        return j10;
    }

    private static a l(a aVar, u0.g gVar, p0.b bVar, o2.a0 a0Var) {
        long j7;
        ByteBuffer byteBuffer;
        if (gVar.t()) {
            aVar = k(aVar, gVar, bVar, a0Var);
        }
        if (gVar.k()) {
            a0Var.K(4);
            a j8 = j(aVar, bVar.f22177b, a0Var.d(), 4);
            int G = a0Var.G();
            bVar.f22177b += 4;
            bVar.f22176a -= 4;
            gVar.r(G);
            aVar = i(j8, bVar.f22177b, gVar.f22411h, G);
            bVar.f22177b += G;
            int i7 = bVar.f22176a - G;
            bVar.f22176a = i7;
            gVar.v(i7);
            j7 = bVar.f22177b;
            byteBuffer = gVar.f22414k;
        } else {
            gVar.r(bVar.f22176a);
            j7 = bVar.f22177b;
            byteBuffer = gVar.f22411h;
        }
        return i(aVar, j7, byteBuffer, bVar.f22176a);
    }

    public void b(long j7) {
        a aVar;
        if (j7 == -1) {
            return;
        }
        while (true) {
            aVar = this.f22135d;
            if (j7 < aVar.f22140b) {
                break;
            }
            this.f22132a.a(aVar.f22141c);
            this.f22135d = this.f22135d.b();
        }
        if (this.f22136e.f22139a < aVar.f22139a) {
            this.f22136e = aVar;
        }
    }

    public void c(long j7) {
        o2.a.a(j7 <= this.f22138g);
        this.f22138g = j7;
        if (j7 != 0) {
            a aVar = this.f22135d;
            if (j7 != aVar.f22139a) {
                while (this.f22138g > aVar.f22140b) {
                    aVar = aVar.f22142d;
                }
                a aVar2 = (a) o2.a.e(aVar.f22142d);
                a(aVar2);
                a aVar3 = new a(aVar.f22140b, this.f22133b);
                aVar.f22142d = aVar3;
                if (this.f22138g == aVar.f22140b) {
                    aVar = aVar3;
                }
                this.f22137f = aVar;
                if (this.f22136e == aVar2) {
                    this.f22136e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f22135d);
        a aVar4 = new a(this.f22138g, this.f22133b);
        this.f22135d = aVar4;
        this.f22136e = aVar4;
        this.f22137f = aVar4;
    }

    public long e() {
        return this.f22138g;
    }

    public void f(u0.g gVar, p0.b bVar) {
        l(this.f22136e, gVar, bVar, this.f22134c);
    }

    public void m(u0.g gVar, p0.b bVar) {
        this.f22136e = l(this.f22136e, gVar, bVar, this.f22134c);
    }

    public void n() {
        a(this.f22135d);
        this.f22135d.d(0L, this.f22133b);
        a aVar = this.f22135d;
        this.f22136e = aVar;
        this.f22137f = aVar;
        this.f22138g = 0L;
        this.f22132a.c();
    }

    public void o() {
        this.f22136e = this.f22135d;
    }

    public int p(n2.i iVar, int i7, boolean z6) {
        int h7 = h(i7);
        a aVar = this.f22137f;
        int read = iVar.read(aVar.f22141c.f19388a, aVar.e(this.f22138g), h7);
        if (read != -1) {
            g(read);
            return read;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(o2.a0 a0Var, int i7) {
        while (i7 > 0) {
            int h7 = h(i7);
            a aVar = this.f22137f;
            a0Var.j(aVar.f22141c.f19388a, aVar.e(this.f22138g), h7);
            i7 -= h7;
            g(h7);
        }
    }
}
