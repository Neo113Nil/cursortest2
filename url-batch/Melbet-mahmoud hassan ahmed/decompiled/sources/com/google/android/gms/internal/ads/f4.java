package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f4 implements oc4 {

    /* renamed from: q, reason: collision with root package name */
    public static final vc4 f4972q = new vc4() { // from class: com.google.android.gms.internal.ads.c4
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = f4.f4972q;
            return new oc4[]{new f4(0)};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List<ky2> f4973a;

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f4974b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseIntArray f4975c;

    /* renamed from: d, reason: collision with root package name */
    private final j4 f4976d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<l4> f4977e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseBooleanArray f4978f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseBooleanArray f4979g;

    /* renamed from: h, reason: collision with root package name */
    private final b4 f4980h;

    /* renamed from: i, reason: collision with root package name */
    private a4 f4981i;

    /* renamed from: j, reason: collision with root package name */
    private rc4 f4982j;

    /* renamed from: k, reason: collision with root package name */
    private int f4983k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4984l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4985m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4986n;

    /* renamed from: o, reason: collision with root package name */
    private int f4987o;

    /* renamed from: p, reason: collision with root package name */
    private int f4988p;

    public f4(int i7) {
        this(1, 0, 112800);
    }

    public f4(int i7, int i8, int i9) {
        ky2 ky2Var = new ky2(0L);
        this.f4976d = new t2(0);
        this.f4973a = Collections.singletonList(ky2Var);
        this.f4974b = new dr2(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f4978f = sparseBooleanArray;
        this.f4979g = new SparseBooleanArray();
        SparseArray<l4> sparseArray = new SparseArray<>();
        this.f4977e = sparseArray;
        this.f4975c = new SparseIntArray();
        this.f4980h = new b4(112800);
        this.f4982j = rc4.f11105a;
        this.f4988p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4977e.put(sparseArray2.keyAt(i10), (l4) sparseArray2.valueAt(i10));
        }
        this.f4977e.put(0, new x3(new d4(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(pc4 pc4Var) {
        byte[] h7 = this.f4974b.h();
        jc4 jc4Var = (jc4) pc4Var;
        jc4Var.n(h7, 0, 940, false);
        int i7 = 0;
        while (i7 < 188) {
            for (int i8 = 0; i8 < 5; i8++) {
                if (h7[(i8 * 188) + i7] != 71) {
                    break;
                }
            }
            jc4Var.p(i7, false);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a1, code lost:
    
        if (r2 == false) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(pc4 pc4Var, md4 md4Var) {
        ?? r32;
        long j7;
        boolean z6;
        rc4 rc4Var;
        pd4 od4Var;
        long c7 = pc4Var.c();
        if (!this.f4984l) {
            r32 = 0;
        } else {
            if (c7 != -1 && !this.f4980h.d()) {
                return this.f4980h.a(pc4Var, md4Var, this.f4988p);
            }
            if (this.f4985m) {
                j7 = 0;
            } else {
                this.f4985m = true;
                if (this.f4980h.b() != -9223372036854775807L) {
                    j7 = 0;
                    a4 a4Var = new a4(this.f4980h.c(), this.f4980h.b(), c7, this.f4988p, 112800);
                    this.f4981i = a4Var;
                    rc4Var = this.f4982j;
                    od4Var = a4Var.b();
                } else {
                    j7 = 0;
                    rc4Var = this.f4982j;
                    od4Var = new od4(this.f4980h.b(), 0L);
                }
                rc4Var.p(od4Var);
            }
            if (this.f4986n) {
                z6 = false;
                this.f4986n = false;
                h(j7, j7);
                if (pc4Var.b() != j7) {
                    md4Var.f8503a = j7;
                    return 1;
                }
            } else {
                z6 = false;
            }
            a4 a4Var2 = this.f4981i;
            r32 = z6;
            if (a4Var2 != null) {
                r32 = z6;
                if (a4Var2.e()) {
                    return this.f4981i.a(pc4Var, md4Var);
                }
            }
        }
        byte[] h7 = this.f4974b.h();
        if (9400 - this.f4974b.k() < 188) {
            int i7 = this.f4974b.i();
            if (i7 > 0) {
                System.arraycopy(h7, this.f4974b.k(), h7, r32, i7);
            }
            this.f4974b.d(h7, i7);
        }
        while (this.f4974b.i() < 188) {
            int l7 = this.f4974b.l();
            int a7 = pc4Var.a(h7, l7, 9400 - l7);
            if (a7 == -1) {
                return -1;
            }
            this.f4974b.e(l7 + a7);
        }
        int k7 = this.f4974b.k();
        int l8 = this.f4974b.l();
        int a8 = m4.a(this.f4974b.h(), k7, l8);
        this.f4974b.f(a8);
        int i8 = a8 + 188;
        if (i8 > l8) {
            this.f4987o += a8 - k7;
        } else {
            this.f4987o = r32;
        }
        int l9 = this.f4974b.l();
        if (i8 > l9) {
            return r32;
        }
        int m7 = this.f4974b.m();
        if ((8388608 & m7) == 0) {
            int i9 = (4194304 & m7) != 0 ? 1 : 0;
            int i10 = (m7 >> 8) & 8191;
            int i11 = m7 & 32;
            l4 l4Var = (m7 & 16) != 0 ? this.f4977e.get(i10) : null;
            if (l4Var != null) {
                int i12 = m7 & 15;
                int i13 = this.f4975c.get(i10, i12 - 1);
                this.f4975c.put(i10, i12);
                if (i13 != i12) {
                    if (i12 != ((i13 + 1) & 15)) {
                        l4Var.c();
                    }
                    if (i11 != 0) {
                        int s7 = this.f4974b.s();
                        i9 |= (this.f4974b.s() & 64) != 0 ? 2 : 0;
                        this.f4974b.g(s7 - 1);
                    }
                    boolean z7 = this.f4984l;
                    if (z7 || !this.f4979g.get(i10, r32)) {
                        this.f4974b.e(i8);
                        l4Var.a(this.f4974b, i9);
                        this.f4974b.e(l9);
                    }
                    if (this.f4984l && c7 != -1) {
                        this.f4986n = true;
                    }
                }
            }
        }
        this.f4974b.f(i8);
        return r32;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f4982j = rc4Var;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        a4 a4Var;
        int size = this.f4973a.size();
        for (int i7 = 0; i7 < size; i7++) {
            ky2 ky2Var = this.f4973a.get(i7);
            if (ky2Var.e() != -9223372036854775807L) {
                long c7 = ky2Var.c();
                if (c7 != -9223372036854775807L) {
                    if (c7 != 0) {
                        if (c7 == j8) {
                        }
                    }
                }
            }
            ky2Var.f(j8);
        }
        if (j8 != 0 && (a4Var = this.f4981i) != null) {
            a4Var.d(j8);
        }
        this.f4974b.c(0);
        this.f4975c.clear();
        for (int i8 = 0; i8 < this.f4977e.size(); i8++) {
            this.f4977e.valueAt(i8).c();
        }
        this.f4987o = 0;
    }
}
