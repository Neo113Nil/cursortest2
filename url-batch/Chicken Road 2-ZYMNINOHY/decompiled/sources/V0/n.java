package V0;

import E.AbstractC0005f;
import T.C0096n;
import T.C0097o;
import T.InterfaceC0090h;
import W.AbstractC0108a;
import W.J;
import W.u;
import a.AbstractC0124a;
import java.io.EOFException;
import y0.E;
import y0.F;

/* loaded from: classes.dex */
public final class n implements F {

    /* renamed from: a, reason: collision with root package name */
    public final F f3213a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3214b;

    /* renamed from: g, reason: collision with root package name */
    public l f3219g;

    /* renamed from: h, reason: collision with root package name */
    public C0097o f3220h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3221i;

    /* renamed from: d, reason: collision with root package name */
    public int f3216d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3217e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f3218f = J.f3264b;

    /* renamed from: c, reason: collision with root package name */
    public final u f3215c = new u();

    public n(F f4, j jVar) {
        this.f3213a = f4;
        this.f3214b = jVar;
    }

    @Override // y0.F
    public final void b(u uVar, int i4, int i5) {
        if (this.f3219g == null) {
            this.f3213a.b(uVar, i4, i5);
            return;
        }
        h(i4);
        uVar.k(this.f3218f, this.f3217e, i4);
        this.f3217e += i4;
    }

    @Override // y0.F
    public final void d(C0097o c0097o) {
        c0097o.n.getClass();
        String str = c0097o.n;
        AbstractC0124a.h(T.F.h(str) == 3);
        boolean equals = c0097o.equals(this.f3220h);
        j jVar = this.f3214b;
        if (!equals) {
            this.f3220h = c0097o;
            this.f3219g = jVar.f(c0097o) ? jVar.a(c0097o) : null;
        }
        l lVar = this.f3219g;
        F f4 = this.f3213a;
        if (lVar == null) {
            f4.d(c0097o);
            return;
        }
        C0096n a3 = c0097o.a();
        a3.f2831m = T.F.n("application/x-media3-cues");
        a3.f2828j = str;
        a3.f2834r = Long.MAX_VALUE;
        a3.f2816K = jVar.c(c0097o);
        AbstractC0005f.w(a3, f4);
    }

    @Override // y0.F
    public final void e(long j4, int i4, int i5, int i6, E e4) {
        if (this.f3219g == null) {
            this.f3213a.e(j4, i4, i5, i6, e4);
            return;
        }
        AbstractC0124a.g("DRM on subtitles is not supported", e4 == null);
        int i7 = (this.f3217e - i6) - i5;
        try {
            this.f3219g.b(this.f3218f, i7, i5, k.f3207c, new m(this, j4, i4));
        } catch (RuntimeException e5) {
            if (!this.f3221i) {
                throw e5;
            }
            AbstractC0108a.t("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e5);
        }
        int i8 = i7 + i5;
        this.f3216d = i8;
        if (i8 == this.f3217e) {
            this.f3216d = 0;
            this.f3217e = 0;
        }
    }

    @Override // y0.F
    public final int f(InterfaceC0090h interfaceC0090h, int i4, boolean z) {
        if (this.f3219g == null) {
            return this.f3213a.f(interfaceC0090h, i4, z);
        }
        h(i4);
        int read = interfaceC0090h.read(this.f3218f, this.f3217e, i4);
        if (read != -1) {
            this.f3217e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void h(int i4) {
        int length = this.f3218f.length;
        int i5 = this.f3217e;
        if (length - i5 >= i4) {
            return;
        }
        int i6 = i5 - this.f3216d;
        int max = Math.max(i6 * 2, i4 + i6);
        byte[] bArr = this.f3218f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f3216d, bArr2, 0, i6);
        this.f3216d = 0;
        this.f3217e = i6;
        this.f3218f = bArr2;
    }
}
