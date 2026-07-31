package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class tk implements lh {

    /* renamed from: e, reason: collision with root package name */
    private rk f12244e;

    /* renamed from: f, reason: collision with root package name */
    private rk f12245f;

    /* renamed from: g, reason: collision with root package name */
    private xe f12246g;

    /* renamed from: h, reason: collision with root package name */
    private xe f12247h;

    /* renamed from: i, reason: collision with root package name */
    private long f12248i;

    /* renamed from: k, reason: collision with root package name */
    private sk f12250k;

    /* renamed from: l, reason: collision with root package name */
    private final wl f12251l;

    /* renamed from: a, reason: collision with root package name */
    private final qk f12240a = new qk();

    /* renamed from: b, reason: collision with root package name */
    private final pk f12241b = new pk();

    /* renamed from: c, reason: collision with root package name */
    private final rm f12242c = new rm(32);

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f12243d = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private int f12249j = 65536;

    public tk(wl wlVar, byte[] bArr) {
        this.f12251l = wlVar;
        rk rkVar = new rk(0L, 65536);
        this.f12244e = rkVar;
        this.f12245f = rkVar;
    }

    private final int o(int i7) {
        if (this.f12249j == 65536) {
            this.f12249j = 0;
            rk rkVar = this.f12245f;
            if (rkVar.f11180c) {
                this.f12245f = rkVar.f11182e;
            }
            rk rkVar2 = this.f12245f;
            ql b7 = this.f12251l.b();
            rk rkVar3 = new rk(this.f12245f.f11179b, 65536);
            rkVar2.f11181d = b7;
            rkVar2.f11182e = rkVar3;
            rkVar2.f11180c = true;
        }
        return Math.min(i7, 65536 - this.f12249j);
    }

    private final void p() {
        this.f12240a.g();
        rk rkVar = this.f12244e;
        if (rkVar.f11180c) {
            rk rkVar2 = this.f12245f;
            boolean z6 = rkVar2.f11180c;
            int i7 = (z6 ? 1 : 0) + (((int) (rkVar2.f11178a - rkVar.f11178a)) / 65536);
            ql[] qlVarArr = new ql[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                qlVarArr[i8] = rkVar.f11181d;
                rkVar.f11181d = null;
                rkVar = rkVar.f11182e;
            }
            this.f12251l.d(qlVarArr);
        }
        rk rkVar3 = new rk(0L, 65536);
        this.f12244e = rkVar3;
        this.f12245f = rkVar3;
        this.f12248i = 0L;
        this.f12249j = 65536;
        this.f12251l.g();
    }

    private final void q(long j7) {
        while (true) {
            rk rkVar = this.f12244e;
            if (j7 < rkVar.f11179b) {
                return;
            }
            this.f12251l.c(rkVar.f11181d);
            rk rkVar2 = this.f12244e;
            rkVar2.f11181d = null;
            this.f12244e = rkVar2.f11182e;
        }
    }

    private final void r() {
        if (this.f12243d.compareAndSet(1, 0)) {
            return;
        }
        p();
    }

    private final void s(long j7, byte[] bArr, int i7) {
        q(j7);
        int i8 = 0;
        while (i8 < i7) {
            int i9 = (int) (j7 - this.f12244e.f11178a);
            int min = Math.min(i7 - i8, 65536 - i9);
            ql qlVar = this.f12244e.f11181d;
            System.arraycopy(qlVar.f10744a, i9, bArr, i8, min);
            j7 += min;
            i8 += min;
            if (j7 == this.f12244e.f11179b) {
                this.f12251l.c(qlVar);
                rk rkVar = this.f12244e;
                rkVar.f11181d = null;
                this.f12244e = rkVar.f11182e;
            }
        }
    }

    private final boolean t() {
        return this.f12243d.compareAndSet(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a(long j7, int i7, int i8, int i9, kh khVar) {
        if (!t()) {
            this.f12240a.i(j7);
            return;
        }
        try {
            this.f12240a.h(j7, i7, this.f12248i - i8, i8, khVar);
        } finally {
            r();
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void b(xe xeVar) {
        xe xeVar2 = xeVar == null ? null : xeVar;
        boolean k7 = this.f12240a.k(xeVar2);
        this.f12247h = xeVar;
        sk skVar = this.f12250k;
        if (skVar == null || !k7) {
            return;
        }
        skVar.g(xeVar2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void c(rm rmVar, int i7) {
        if (!t()) {
            rmVar.w(i7);
            return;
        }
        while (i7 > 0) {
            int o7 = o(i7);
            rmVar.q(this.f12245f.f11181d.f10744a, this.f12249j, o7);
            this.f12249j += o7;
            this.f12248i += o7;
            i7 -= o7;
        }
        r();
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final int d(bh bhVar, int i7, boolean z6) {
        if (!t()) {
            int b7 = bhVar.b(i7);
            if (b7 != -1) {
                return b7;
            }
            throw new EOFException();
        }
        try {
            int a7 = bhVar.a(this.f12245f.f11181d.f10744a, this.f12249j, o(i7));
            if (a7 == -1) {
                throw new EOFException();
            }
            this.f12249j += a7;
            this.f12248i += a7;
            return a7;
        } finally {
            r();
        }
    }

    public final int e() {
        return this.f12240a.a();
    }

    public final int f(ye yeVar, ug ugVar, boolean z6, boolean z7, long j7) {
        int i7;
        int b7 = this.f12240a.b(yeVar, ugVar, z6, z7, this.f12246g, this.f12241b);
        if (b7 == -5) {
            this.f12246g = yeVar.f14633a;
            return -5;
        }
        if (b7 != -4) {
            return -3;
        }
        if (!ugVar.f()) {
            if (ugVar.f12781d < j7) {
                ugVar.a(Integer.MIN_VALUE);
            }
            if (ugVar.i()) {
                pk pkVar = this.f12241b;
                long j8 = pkVar.f10247b;
                this.f12242c.s(1);
                s(j8, this.f12242c.f11225a, 1);
                long j9 = j8 + 1;
                byte b8 = this.f12242c.f11225a[0];
                int i8 = b8 & 128;
                int i9 = b8 & Byte.MAX_VALUE;
                rg rgVar = ugVar.f12779b;
                if (rgVar.f11145a == null) {
                    rgVar.f11145a = new byte[16];
                }
                s(j9, rgVar.f11145a, i9);
                long j10 = j9 + i9;
                if (i8 != 0) {
                    this.f12242c.s(2);
                    s(j10, this.f12242c.f11225a, 2);
                    j10 += 2;
                    i7 = this.f12242c.j();
                } else {
                    i7 = 1;
                }
                rg rgVar2 = ugVar.f12779b;
                int[] iArr = rgVar2.f11148d;
                if (iArr == null || iArr.length < i7) {
                    iArr = new int[i7];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = rgVar2.f11149e;
                if (iArr3 == null || iArr3.length < i7) {
                    iArr3 = new int[i7];
                }
                int[] iArr4 = iArr3;
                if (i8 != 0) {
                    int i10 = i7 * 6;
                    this.f12242c.s(i10);
                    s(j10, this.f12242c.f11225a, i10);
                    j10 += i10;
                    this.f12242c.v(0);
                    for (int i11 = 0; i11 < i7; i11++) {
                        iArr2[i11] = this.f12242c.j();
                        iArr4[i11] = this.f12242c.i();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = pkVar.f10246a - ((int) (j10 - pkVar.f10247b));
                }
                kh khVar = pkVar.f10249d;
                rg rgVar3 = ugVar.f12779b;
                rgVar3.b(i7, iArr2, iArr4, khVar.f7514b, rgVar3.f11145a, 1);
                long j11 = pkVar.f10247b;
                int i12 = (int) (j10 - j11);
                pkVar.f10247b = j11 + i12;
                pkVar.f10246a -= i12;
            }
            ugVar.h(this.f12241b.f10246a);
            pk pkVar2 = this.f12241b;
            long j12 = pkVar2.f10247b;
            ByteBuffer byteBuffer = ugVar.f12780c;
            int i13 = pkVar2.f10246a;
            q(j12);
            while (i13 > 0) {
                int i14 = (int) (j12 - this.f12244e.f11178a);
                int min = Math.min(i13, 65536 - i14);
                ql qlVar = this.f12244e.f11181d;
                byteBuffer.put(qlVar.f10744a, i14, min);
                j12 += min;
                i13 -= min;
                if (j12 == this.f12244e.f11179b) {
                    this.f12251l.c(qlVar);
                    rk rkVar = this.f12244e;
                    rkVar.f11181d = null;
                    this.f12244e = rkVar.f11182e;
                }
            }
            q(this.f12241b.f10248c);
        }
        return -4;
    }

    public final long g() {
        return this.f12240a.c();
    }

    public final xe h() {
        return this.f12240a.f();
    }

    public final void i() {
        if (this.f12243d.getAndSet(2) == 0) {
            p();
        }
    }

    public final void j(boolean z6) {
        int andSet = this.f12243d.getAndSet(true != z6 ? 2 : 0);
        p();
        this.f12240a.j();
        if (andSet == 2) {
            this.f12246g = null;
        }
    }

    public final void k(sk skVar) {
        this.f12250k = skVar;
    }

    public final void l() {
        long d7 = this.f12240a.d();
        if (d7 != -1) {
            q(d7);
        }
    }

    public final boolean m() {
        return this.f12240a.l();
    }

    public final boolean n(long j7, boolean z6) {
        long e7 = this.f12240a.e(j7, z6);
        if (e7 == -1) {
            return false;
        }
        q(e7);
        return true;
    }
}
