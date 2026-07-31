package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class lk implements ik, hk {

    /* renamed from: f, reason: collision with root package name */
    public final ik[] f7998f;

    /* renamed from: g, reason: collision with root package name */
    private final IdentityHashMap<uk, Integer> f7999g = new IdentityHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private hk f8000h;

    /* renamed from: i, reason: collision with root package name */
    private int f8001i;

    /* renamed from: j, reason: collision with root package name */
    private al f8002j;

    /* renamed from: k, reason: collision with root package name */
    private ik[] f8003k;

    /* renamed from: l, reason: collision with root package name */
    private xk f8004l;

    public lk(ik... ikVarArr) {
        this.f7998f = ikVarArr;
    }

    @Override // com.google.android.gms.internal.ads.hk
    public final void a(ik ikVar) {
        int i7 = this.f8001i - 1;
        this.f8001i = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (ik ikVar2 : this.f7998f) {
            i8 += ikVar2.m().f2855a;
        }
        zk[] zkVarArr = new zk[i8];
        int i9 = 0;
        for (ik ikVar3 : this.f7998f) {
            al m7 = ikVar3.m();
            int i10 = m7.f2855a;
            int i11 = 0;
            while (i11 < i10) {
                zkVarArr[i9] = m7.b(i11);
                i11++;
                i9++;
            }
        }
        this.f8002j = new al(zkVarArr);
        this.f8000h.a(this);
    }

    @Override // com.google.android.gms.internal.ads.vk
    public final /* bridge */ /* synthetic */ void b(ik ikVar) {
        if (this.f8002j == null) {
            return;
        }
        this.f8000h.b(this);
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final long e() {
        long j7 = Long.MAX_VALUE;
        for (ik ikVar : this.f8003k) {
            long e7 = ikVar.e();
            if (e7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, e7);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final long f() {
        long f7 = this.f7998f[0].f();
        int i7 = 1;
        while (true) {
            ik[] ikVarArr = this.f7998f;
            if (i7 >= ikVarArr.length) {
                if (f7 != -9223372036854775807L) {
                    for (ik ikVar : this.f8003k) {
                        if (ikVar != this.f7998f[0] && ikVar.s(f7) != f7) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return f7;
            }
            if (ikVarArr[i7].f() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final al m() {
        return this.f8002j;
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final void p() {
        for (ik ikVar : this.f7998f) {
            ikVar.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.ik, com.google.android.gms.internal.ads.xk
    public final boolean q(long j7) {
        return this.f8004l.q(j7);
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final void r(long j7) {
        for (ik ikVar : this.f8003k) {
            ikVar.r(j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final long s(long j7) {
        long s7 = this.f8003k[0].s(j7);
        int i7 = 1;
        while (true) {
            ik[] ikVarArr = this.f8003k;
            if (i7 >= ikVarArr.length) {
                return s7;
            }
            if (ikVarArr[i7].s(s7) != s7) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final long t(el[] elVarArr, boolean[] zArr, uk[] ukVarArr, boolean[] zArr2, long j7) {
        int length;
        uk[] ukVarArr2 = ukVarArr;
        int length2 = elVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i7 = 0;
        while (true) {
            length = elVarArr.length;
            if (i7 >= length) {
                break;
            }
            uk ukVar = ukVarArr2[i7];
            iArr[i7] = ukVar == null ? -1 : this.f7999g.get(ukVar).intValue();
            iArr2[i7] = -1;
            el elVar = elVarArr[i7];
            if (elVar != null) {
                zk d7 = elVar.d();
                int i8 = 0;
                while (true) {
                    ik[] ikVarArr = this.f7998f;
                    if (i8 >= ikVarArr.length) {
                        break;
                    }
                    if (ikVarArr[i8].m().a(d7) != -1) {
                        iArr2[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
            i7++;
        }
        this.f7999g.clear();
        uk[] ukVarArr3 = new uk[length];
        uk[] ukVarArr4 = new uk[length];
        el[] elVarArr2 = new el[length];
        ArrayList arrayList = new ArrayList(this.f7998f.length);
        long j8 = j7;
        int i9 = 0;
        while (i9 < this.f7998f.length) {
            for (int i10 = 0; i10 < elVarArr.length; i10++) {
                el elVar2 = null;
                ukVarArr4[i10] = iArr[i10] == i9 ? ukVarArr2[i10] : null;
                if (iArr2[i10] == i9) {
                    elVar2 = elVarArr[i10];
                }
                elVarArr2[i10] = elVar2;
            }
            int i11 = i9;
            el[] elVarArr3 = elVarArr2;
            ArrayList arrayList2 = arrayList;
            long t6 = this.f7998f[i9].t(elVarArr2, zArr, ukVarArr4, zArr2, j8);
            if (i11 == 0) {
                j8 = t6;
            } else if (t6 != j8) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z6 = false;
            for (int i12 = 0; i12 < elVarArr.length; i12++) {
                if (iArr2[i12] == i11) {
                    jm.e(ukVarArr4[i12] != null);
                    uk ukVar2 = ukVarArr4[i12];
                    ukVarArr3[i12] = ukVar2;
                    this.f7999g.put(ukVar2, Integer.valueOf(i11));
                    z6 = true;
                } else if (iArr[i12] == i11) {
                    jm.e(ukVarArr4[i12] == null);
                }
            }
            if (z6) {
                arrayList2.add(this.f7998f[i11]);
            }
            i9 = i11 + 1;
            arrayList = arrayList2;
            elVarArr2 = elVarArr3;
            ukVarArr2 = ukVarArr;
        }
        uk[] ukVarArr5 = ukVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ukVarArr3, 0, ukVarArr5, 0, length);
        ik[] ikVarArr2 = new ik[arrayList3.size()];
        this.f8003k = ikVarArr2;
        arrayList3.toArray(ikVarArr2);
        this.f8004l = new wj(this.f8003k);
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.ik
    public final void u(hk hkVar, long j7) {
        this.f8000h = hkVar;
        ik[] ikVarArr = this.f7998f;
        this.f8001i = ikVarArr.length;
        for (ik ikVar : ikVarArr) {
            ikVar.u(this, j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ik, com.google.android.gms.internal.ads.xk
    public final long zza() {
        return this.f8004l.zza();
    }
}
