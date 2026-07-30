package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3072d3 extends AbstractC3450k3 {

    /* renamed from: n, reason: collision with root package name */
    public U0 f29778n;

    /* renamed from: o, reason: collision with root package name */
    public E2 f29779o;

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final void a(boolean z8) {
        super.a(z8);
        if (z8) {
            this.f29778n = null;
            this.f29779o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final long b(Lr lr) {
        byte[] bArr = lr.f26233a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int q6 = AbstractC2655Lg.q(i, lr);
            lr.E(0);
            return q6;
        }
        lr.G(4);
        lr.o();
        int q62 = AbstractC2655Lg.q(i, lr);
        lr.E(0);
        return q62;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final boolean c(Lr lr, long j9, C2881Yl c2881Yl) {
        byte[] bArr = lr.f26233a;
        U0 u02 = this.f29778n;
        if (u02 == null) {
            U0 u03 = new U0(bArr, 17);
            this.f29778n = u03;
            C4065vP c4065vP = new C4065vP(u03.b(Arrays.copyOfRange(bArr, 9, lr.f26235c), null));
            c4065vP.d("audio/ogg");
            c2881Yl.f28862u = new TP(c4065vP);
            return true;
        }
        byte b9 = bArr[0];
        if ((b9 & Byte.MAX_VALUE) != 3) {
            if (b9 != -1) {
                return true;
            }
            E2 e22 = this.f29779o;
            if (e22 != null) {
                e22.f24632n = j9;
                c2881Yl.f28863v = e22;
            }
            ((TP) c2881Yl.f28862u).getClass();
            return false;
        }
        C2881Yl E8 = AbstractC3217fl.E(lr);
        U0 u04 = new U0(u02.f27900a, u02.f27901b, u02.f27902c, u02.f27903d, u02.f27904e, u02.f27906g, u02.f27907h, u02.f27908j, E8, u02.f27910l);
        this.f29778n = u04;
        E2 e23 = new E2();
        e23.f24634v = u04;
        e23.f24635w = E8;
        e23.f24632n = -1L;
        e23.f24633u = -1L;
        this.f29779o = e23;
        return true;
    }
}
