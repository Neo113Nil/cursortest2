package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class h64 implements r54, q54 {

    /* renamed from: f, reason: collision with root package name */
    private final r54[] f6086f;

    /* renamed from: i, reason: collision with root package name */
    private q54 f6089i;

    /* renamed from: j, reason: collision with root package name */
    private hm0 f6090j;

    /* renamed from: m, reason: collision with root package name */
    private final f54 f6093m;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<r54> f6088h = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private k74 f6092l = new e54(new k74[0]);

    /* renamed from: g, reason: collision with root package name */
    private final IdentityHashMap<i74, Integer> f6087g = new IdentityHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private r54[] f6091k = new r54[0];

    public h64(f54 f54Var, long[] jArr, r54[] r54VarArr, byte... bArr) {
        this.f6093m = f54Var;
        this.f6086f = r54VarArr;
        for (int i7 = 0; i7 < r54VarArr.length; i7++) {
            long j7 = jArr[i7];
            if (j7 != 0) {
                this.f6086f[i7] = new f64(r54VarArr[i7], j7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long a() {
        return this.f6092l.a();
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean b(long j7) {
        if (this.f6088h.isEmpty()) {
            return this.f6092l.b(j7);
        }
        int size = this.f6088h.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6088h.get(i7).b(j7);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long c() {
        return this.f6092l.c();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final hm0 d() {
        hm0 hm0Var = this.f6090j;
        Objects.requireNonNull(hm0Var);
        return hm0Var;
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long e(long j7) {
        long e7 = this.f6091k[0].e(j7);
        int i7 = 1;
        while (true) {
            r54[] r54VarArr = this.f6091k;
            if (i7 >= r54VarArr.length) {
                return e7;
            }
            if (r54VarArr[i7].e(e7) != e7) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final void f(long j7) {
        this.f6092l.f(j7);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long g() {
        long j7 = -9223372036854775807L;
        for (r54 r54Var : this.f6091k) {
            long g7 = r54Var.g();
            if (g7 != -9223372036854775807L) {
                if (j7 == -9223372036854775807L) {
                    for (r54 r54Var2 : this.f6091k) {
                        if (r54Var2 == r54Var) {
                            break;
                        }
                        if (r54Var2.e(g7) != g7) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j7 = g7;
                } else if (g7 != j7) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j7 != -9223372036854775807L && r54Var.e(j7) != j7) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.q54
    public final void h(r54 r54Var) {
        this.f6088h.remove(r54Var);
        if (this.f6088h.isEmpty()) {
            int i7 = 0;
            for (r54 r54Var2 : this.f6086f) {
                i7 += r54Var2.d().f6335a;
            }
            gk0[] gk0VarArr = new gk0[i7];
            int i8 = 0;
            for (r54 r54Var3 : this.f6086f) {
                hm0 d7 = r54Var3.d();
                int i9 = d7.f6335a;
                int i10 = 0;
                while (i10 < i9) {
                    gk0VarArr[i8] = d7.b(i10);
                    i10++;
                    i8++;
                }
            }
            this.f6090j = new hm0(gk0VarArr);
            q54 q54Var = this.f6089i;
            Objects.requireNonNull(q54Var);
            q54Var.h(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void i() {
        for (r54 r54Var : this.f6086f) {
            r54Var.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long j(w74[] w74VarArr, boolean[] zArr, i74[] i74VarArr, boolean[] zArr2, long j7) {
        int length;
        int length2 = w74VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i7 = 0;
        while (true) {
            length = w74VarArr.length;
            if (i7 >= length) {
                break;
            }
            i74 i74Var = i74VarArr[i7];
            Integer num = i74Var == null ? null : this.f6087g.get(i74Var);
            iArr[i7] = num == null ? -1 : num.intValue();
            iArr2[i7] = -1;
            w74 w74Var = w74VarArr[i7];
            if (w74Var != null) {
                gk0 d7 = w74Var.d();
                int i8 = 0;
                while (true) {
                    r54[] r54VarArr = this.f6086f;
                    if (i8 >= r54VarArr.length) {
                        break;
                    }
                    if (r54VarArr[i8].d().a(d7) != -1) {
                        iArr2[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
            i7++;
        }
        this.f6087g.clear();
        i74[] i74VarArr2 = new i74[length];
        i74[] i74VarArr3 = new i74[length];
        w74[] w74VarArr2 = new w74[length];
        ArrayList arrayList = new ArrayList(this.f6086f.length);
        long j8 = j7;
        int i9 = 0;
        while (i9 < this.f6086f.length) {
            for (int i10 = 0; i10 < w74VarArr.length; i10++) {
                i74VarArr3[i10] = iArr[i10] == i9 ? i74VarArr[i10] : null;
                w74VarArr2[i10] = iArr2[i10] == i9 ? w74VarArr[i10] : null;
            }
            int i11 = i9;
            ArrayList arrayList2 = arrayList;
            i74[] i74VarArr4 = i74VarArr3;
            w74[] w74VarArr3 = w74VarArr2;
            long j9 = this.f6086f[i9].j(w74VarArr2, zArr, i74VarArr3, zArr2, j8);
            if (i11 == 0) {
                j8 = j9;
            } else if (j9 != j8) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z6 = false;
            for (int i12 = 0; i12 < w74VarArr.length; i12++) {
                if (iArr2[i12] == i11) {
                    i74 i74Var2 = i74VarArr4[i12];
                    Objects.requireNonNull(i74Var2);
                    i74VarArr2[i12] = i74Var2;
                    this.f6087g.put(i74Var2, Integer.valueOf(i11));
                    z6 = true;
                } else if (iArr[i12] == i11) {
                    wu1.f(i74VarArr4[i12] == null);
                }
            }
            if (z6) {
                arrayList2.add(this.f6086f[i11]);
            }
            i9 = i11 + 1;
            arrayList = arrayList2;
            i74VarArr3 = i74VarArr4;
            w74VarArr2 = w74VarArr3;
        }
        System.arraycopy(i74VarArr2, 0, i74VarArr, 0, length);
        r54[] r54VarArr2 = (r54[]) arrayList.toArray(new r54[0]);
        this.f6091k = r54VarArr2;
        this.f6092l = new e54(r54VarArr2);
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.j74
    public final /* bridge */ /* synthetic */ void k(r54 r54Var) {
        q54 q54Var = this.f6089i;
        Objects.requireNonNull(q54Var);
        q54Var.k(this);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long l(long j7, ay3 ay3Var) {
        r54[] r54VarArr = this.f6091k;
        return (r54VarArr.length > 0 ? r54VarArr[0] : this.f6086f[0]).l(j7, ay3Var);
    }

    public final r54 m(int i7) {
        r54 r54Var;
        r54 r54Var2 = this.f6086f[i7];
        if (!(r54Var2 instanceof f64)) {
            return r54Var2;
        }
        r54Var = ((f64) r54Var2).f5011f;
        return r54Var;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean n() {
        return this.f6092l.n();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void o(q54 q54Var, long j7) {
        this.f6089i = q54Var;
        Collections.addAll(this.f6088h, this.f6086f);
        for (r54 r54Var : this.f6086f) {
            r54Var.o(this, j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void s(long j7, boolean z6) {
        for (r54 r54Var : this.f6091k) {
            r54Var.s(j7, false);
        }
    }
}
