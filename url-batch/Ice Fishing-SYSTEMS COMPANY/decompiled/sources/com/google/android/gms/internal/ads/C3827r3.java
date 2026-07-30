package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3827r3 implements InterfaceC3448k1 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3448k1 f33939a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3720p3 f33940b;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3774q3 f33945g;

    /* renamed from: h, reason: collision with root package name */
    public TP f33946h;
    public boolean i;

    /* renamed from: d, reason: collision with root package name */
    public int f33942d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f33943e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f33944f = AbstractC3548lu.f32614b;

    /* renamed from: c, reason: collision with root package name */
    public final Lr f33941c = new Lr();

    public C3827r3(InterfaceC3448k1 interfaceC3448k1, InterfaceC3720p3 interfaceC3720p3) {
        this.f33939a = interfaceC3448k1;
        this.f33940b = interfaceC3720p3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void b(long j9, int i, int i4, int i9, C3394j1 c3394j1) {
        if (this.f33945g == null) {
            this.f33939a.b(j9, i, i4, i9, c3394j1);
            return;
        }
        PA.u("DRM on subtitles is not supported", c3394j1 == null);
        int i10 = (this.f33943e - i9) - i4;
        try {
            this.f33945g.e(this.f33944f, i10, i4, new X1.b(this, j9, i));
        } catch (RuntimeException e6) {
            if (!this.i) {
                throw e6;
            }
            AbstractC3217fl.O("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e6);
        }
        int i11 = i10 + i4;
        this.f33942d = i11;
        if (i11 == this.f33943e) {
            this.f33942d = 0;
            this.f33943e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final int c(JN jn, int i, boolean z8) {
        if (this.f33945g == null) {
            return this.f33939a.c(jn, i, z8);
        }
        g(i);
        int z9 = jn.z(this.f33944f, this.f33943e, i);
        if (z9 != -1) {
            this.f33943e += z9;
            return z9;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void e(TP tp) {
        String str = tp.f27776o;
        str.getClass();
        PA.n(K4.f(str) == 3);
        boolean equals = tp.equals(this.f33946h);
        InterfaceC3720p3 interfaceC3720p3 = this.f33940b;
        if (!equals) {
            this.f33946h = tp;
            this.f33945g = interfaceC3720p3.j(tp) ? interfaceC3720p3.l(tp) : null;
        }
        InterfaceC3774q3 interfaceC3774q3 = this.f33945g;
        InterfaceC3448k1 interfaceC3448k1 = this.f33939a;
        if (interfaceC3774q3 == null) {
            interfaceC3448k1.e(tp);
            return;
        }
        C4065vP c4065vP = new C4065vP(tp);
        c4065vP.e("application/x-media3-cues");
        c4065vP.f34781j = str;
        c4065vP.f34790s = Long.MAX_VALUE;
        c4065vP.f34771M = interfaceC3720p3.k(tp);
        interfaceC3448k1.e(new TP(c4065vP));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void f(Lr lr, int i, int i4) {
        if (this.f33945g == null) {
            this.f33939a.f(lr, i, i4);
            return;
        }
        g(i);
        lr.H(this.f33944f, this.f33943e, i);
        this.f33943e += i;
    }

    public final void g(int i) {
        int length = this.f33944f.length;
        int i4 = this.f33943e;
        if (length - i4 >= i) {
            return;
        }
        int i9 = i4 - this.f33942d;
        int max = Math.max(i9 + i9, i + i9);
        byte[] bArr = this.f33944f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f33942d, bArr2, 0, i9);
        this.f33942d = 0;
        this.f33943e = i9;
        this.f33944f = bArr2;
    }
}
