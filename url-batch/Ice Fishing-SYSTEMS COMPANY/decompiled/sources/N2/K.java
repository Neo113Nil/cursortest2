package N2;

import O2.AbstractC0369f;
import O2.C0370g;
import O2.C0374k;
import O2.C0375l;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class K implements h3.c {

    /* renamed from: n, reason: collision with root package name */
    public final C0318d f2006n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2007u;

    /* renamed from: v, reason: collision with root package name */
    public final C0315a f2008v;

    /* renamed from: w, reason: collision with root package name */
    public final long f2009w;

    /* renamed from: x, reason: collision with root package name */
    public final long f2010x;

    public K(C0318d c0318d, int i, C0315a c0315a, long j9, long j10) {
        this.f2006n = c0318d;
        this.f2007u = i;
        this.f2008v = c0315a;
        this.f2009w = j9;
        this.f2010x = j10;
    }

    public static C0370g a(C c4, AbstractC0369f abstractC0369f, int i) {
        O2.E e6 = abstractC0369f.f2400T;
        C0370g c0370g = e6 == null ? null : e6.f2357w;
        if (c0370g != null && c0370g.f2410u) {
            int[] iArr = c0370g.f2412w;
            int i4 = 0;
            if (iArr == null) {
                int[] iArr2 = c0370g.f2414y;
                if (iArr2 != null) {
                    while (i4 < iArr2.length) {
                        if (iArr2[i4] == i) {
                            return null;
                        }
                        i4++;
                    }
                }
            } else {
                while (i4 < iArr.length) {
                    if (iArr[i4] != i) {
                        i4++;
                    }
                }
            }
            if (c4.f1986E < c0370g.f2413x) {
                return c0370g;
            }
        }
        return null;
    }

    @Override // h3.c
    public final void o(h3.n nVar) {
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        long j9;
        long j10;
        int i12;
        if (this.f2006n.a()) {
            O2.m mVar = (O2.m) C0375l.a().f2443n;
            if (mVar == null || mVar.f2445u) {
                C c4 = (C) this.f2006n.f2049C.get(this.f2008v);
                if (c4 != null) {
                    Object obj = c4.f1989u;
                    if (obj instanceof AbstractC0369f) {
                        AbstractC0369f abstractC0369f = (AbstractC0369f) obj;
                        int i13 = 0;
                        boolean z8 = this.f2009w > 0;
                        int i14 = abstractC0369f.f2395O;
                        if (mVar != null) {
                            z8 &= mVar.f2446v;
                            int i15 = mVar.f2447w;
                            int i16 = mVar.f2448x;
                            i = mVar.f2444n;
                            if (abstractC0369f.f2400T != null && !abstractC0369f.d()) {
                                C0370g a9 = a(c4, abstractC0369f, this.f2007u);
                                if (a9 == null) {
                                    return;
                                }
                                boolean z9 = a9.f2411v && this.f2009w > 0;
                                i16 = a9.f2413x;
                                z8 = z9;
                            }
                            i9 = i15;
                            i4 = i16;
                        } else {
                            i = 0;
                            i4 = 100;
                            i9 = 5000;
                        }
                        C0318d c0318d = this.f2006n;
                        if (nVar.i()) {
                            i10 = 0;
                        } else {
                            if (nVar.f38223d) {
                                i10 = 100;
                            } else {
                                Exception f6 = nVar.f();
                                if (f6 instanceof M2.f) {
                                    Status status = ((M2.f) f6).f1884n;
                                    int i17 = status.f23768n;
                                    L2.b bVar = status.f23771w;
                                    i13 = bVar == null ? -1 : bVar.f1712u;
                                    i10 = i17;
                                } else {
                                    i10 = 101;
                                }
                            }
                            i13 = -1;
                        }
                        if (z8) {
                            long j11 = this.f2009w;
                            long currentTimeMillis = System.currentTimeMillis();
                            i11 = i4;
                            i12 = (int) (SystemClock.elapsedRealtime() - this.f2010x);
                            j10 = currentTimeMillis;
                            j9 = j11;
                        } else {
                            i11 = i4;
                            j9 = 0;
                            j10 = 0;
                            i12 = -1;
                        }
                        Z2.e eVar = c0318d.f2052F;
                        eVar.sendMessage(eVar.obtainMessage(18, new L(new C0374k(this.f2007u, i10, i13, j9, j10, null, null, i14, i12), i, i9, i11)));
                    }
                }
            }
        }
    }
}
