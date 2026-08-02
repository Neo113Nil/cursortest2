package g0;

import E.AbstractC0005f;
import T.C0096n;
import T.C0097o;
import T.InterfaceC0090h;
import W.AbstractC0108a;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
import y0.E;
import y0.F;

/* loaded from: classes.dex */
public final class q implements F {

    /* renamed from: f, reason: collision with root package name */
    public static final C0097o f8924f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0097o f8925g;

    /* renamed from: a, reason: collision with root package name */
    public final F f8926a;

    /* renamed from: b, reason: collision with root package name */
    public final C0097o f8927b;

    /* renamed from: c, reason: collision with root package name */
    public C0097o f8928c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f8929d;

    /* renamed from: e, reason: collision with root package name */
    public int f8930e;

    static {
        C0096n c0096n = new C0096n();
        c0096n.f2831m = T.F.n("application/id3");
        f8924f = new C0097o(c0096n);
        C0096n c0096n2 = new C0096n();
        c0096n2.f2831m = T.F.n("application/x-emsg");
        f8925g = new C0097o(c0096n2);
    }

    public q(F f4, int i4) {
        this.f8926a = f4;
        if (i4 == 1) {
            this.f8927b = f8924f;
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException(AbstractC0005f.j(i4, "Unknown metadataType: "));
            }
            this.f8927b = f8925g;
        }
        this.f8929d = new byte[0];
        this.f8930e = 0;
    }

    @Override // y0.F
    public final void b(W.u uVar, int i4, int i5) {
        int i6 = this.f8930e + i4;
        byte[] bArr = this.f8929d;
        if (bArr.length < i6) {
            this.f8929d = Arrays.copyOf(bArr, (i6 / 2) + i6);
        }
        uVar.k(this.f8929d, this.f8930e, i4);
        this.f8930e += i4;
    }

    @Override // y0.F
    public final void d(C0097o c0097o) {
        this.f8928c = c0097o;
        this.f8926a.d(this.f8927b);
    }

    @Override // y0.F
    public final void e(long j4, int i4, int i5, int i6, E e4) {
        this.f8928c.getClass();
        int i7 = this.f8930e - i6;
        W.u uVar = new W.u(Arrays.copyOfRange(this.f8929d, i7 - i5, i7));
        byte[] bArr = this.f8929d;
        System.arraycopy(bArr, i7, bArr, 0, i6);
        this.f8930e = i6;
        String str = this.f8928c.n;
        C0097o c0097o = this.f8927b;
        String str2 = c0097o.n;
        String str3 = c0097o.n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.f8928c.n)) {
                AbstractC0108a.s("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f8928c.n);
                return;
            }
            J0.a H4 = I0.b.H(uVar);
            C0097o a3 = H4.a();
            if (a3 == null || !Objects.equals(str3, a3.n)) {
                AbstractC0108a.s("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + H4.a());
                return;
            }
            byte[] b4 = H4.b();
            b4.getClass();
            uVar = new W.u(b4);
        }
        int a4 = uVar.a();
        F f4 = this.f8926a;
        f4.a(a4, uVar);
        f4.e(j4, i4, a4, 0, e4);
    }

    @Override // y0.F
    public final int f(InterfaceC0090h interfaceC0090h, int i4, boolean z) {
        int i5 = this.f8930e + i4;
        byte[] bArr = this.f8929d;
        if (bArr.length < i5) {
            this.f8929d = Arrays.copyOf(bArr, (i5 / 2) + i5);
        }
        int read = interfaceC0090h.read(this.f8929d, this.f8930e, i4);
        if (read != -1) {
            this.f8930e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }
}
