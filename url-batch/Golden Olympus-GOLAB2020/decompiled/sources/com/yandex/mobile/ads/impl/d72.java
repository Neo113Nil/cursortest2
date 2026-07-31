package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.tw1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class d72 implements p70 {

    /* renamed from: a, reason: collision with root package name */
    private final int f24469a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24470b;

    /* renamed from: c, reason: collision with root package name */
    private final List<e52> f24471c;

    /* renamed from: d, reason: collision with root package name */
    private final sf1 f24472d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseIntArray f24473e;

    /* renamed from: f, reason: collision with root package name */
    private final e72.c f24474f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray<e72> f24475g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f24476h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f24477i;

    /* renamed from: j, reason: collision with root package name */
    private final c72 f24478j;

    /* renamed from: k, reason: collision with root package name */
    private b72 f24479k;

    /* renamed from: l, reason: collision with root package name */
    private r70 f24480l;

    /* renamed from: m, reason: collision with root package name */
    private int f24481m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f24482n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f24483o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f24484p;

    /* renamed from: q, reason: collision with root package name */
    private e72 f24485q;

    /* renamed from: r, reason: collision with root package name */
    private int f24486r;

    /* renamed from: s, reason: collision with root package name */
    private int f24487s;

    private class a implements rw1 {

        /* renamed from: a, reason: collision with root package name */
        private final rf1 f24488a = new rf1(new byte[4]);

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.rw1
        public final void a(e52 e52Var, r70 r70Var, e72.d dVar) {
        }

        @Override // com.yandex.mobile.ads.impl.rw1
        public final void a(sf1 sf1Var) {
            if (sf1Var.t() == 0 && (sf1Var.t() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                sf1Var.f(6);
                int a4 = sf1Var.a() / 4;
                for (int i4 = 0; i4 < a4; i4++) {
                    rf1 rf1Var = this.f24488a;
                    sf1Var.a(rf1Var.f31172a, 0, 4);
                    rf1Var.c(0);
                    int b4 = this.f24488a.b(16);
                    this.f24488a.d(3);
                    if (b4 == 0) {
                        this.f24488a.d(13);
                    } else {
                        int b5 = this.f24488a.b(13);
                        if (d72.this.f24475g.get(b5) == null) {
                            d72 d72Var = d72.this;
                            d72Var.f24475g.put(b5, new sw1(d72Var.new b(b5)));
                            d72.this.f24481m++;
                        }
                    }
                }
                d72 d72Var2 = d72.this;
                if (d72Var2.f24469a != 2) {
                    d72Var2.f24475g.remove(0);
                }
            }
        }
    }

    private class b implements rw1 {

        /* renamed from: a, reason: collision with root package name */
        private final rf1 f24490a = new rf1(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<e72> f24491b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private final SparseIntArray f24492c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        private final int f24493d;

        public b(int i4) {
            this.f24493d = i4;
        }

        @Override // com.yandex.mobile.ads.impl.rw1
        public final void a(e52 e52Var, r70 r70Var, e72.d dVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x016f, code lost:
        
            if (r24.t() == r15) goto L55;
         */
        @Override // com.yandex.mobile.ads.impl.rw1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(sf1 sf1Var) {
            e52 e52Var;
            int i4;
            int i5;
            e72 a4;
            int i6;
            if (sf1Var.t() != 2) {
                return;
            }
            d72 d72Var = d72.this;
            int i7 = d72Var.f24469a;
            int i8 = 0;
            if (i7 == 1 || i7 == 2 || d72Var.f24481m == 1) {
                e52Var = (e52) d72Var.f24471c.get(0);
            } else {
                e52Var = new e52(((e52) d72Var.f24471c.get(0)).a());
                d72.this.f24471c.add(e52Var);
            }
            if ((sf1Var.t() & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                return;
            }
            sf1Var.f(1);
            int z4 = sf1Var.z();
            int i9 = 3;
            sf1Var.f(3);
            rf1 rf1Var = this.f24490a;
            sf1Var.a(rf1Var.f31172a, 0, 2);
            rf1Var.c(0);
            this.f24490a.d(3);
            int i10 = 13;
            d72.this.f24487s = this.f24490a.b(13);
            rf1 rf1Var2 = this.f24490a;
            sf1Var.a(rf1Var2.f31172a, 0, 2);
            rf1Var2.c(0);
            int i11 = 4;
            this.f24490a.d(4);
            int i12 = 12;
            sf1Var.f(this.f24490a.b(12));
            d72 d72Var2 = d72.this;
            int i13 = 21;
            if (d72Var2.f24469a == 2 && d72Var2.f24485q == null) {
                e72.b bVar = new e72.b(21, null, null, u82.f32878f);
                d72 d72Var3 = d72.this;
                d72Var3.f24485q = d72Var3.f24474f.a(21, bVar);
                d72 d72Var4 = d72.this;
                e72 e72Var = d72Var4.f24485q;
                if (e72Var != null) {
                    e72Var.a(e52Var, d72Var4.f24480l, new e72.d(z4, 21, 8192));
                }
            }
            this.f24491b.clear();
            this.f24492c.clear();
            int a5 = sf1Var.a();
            while (a5 > 0) {
                rf1 rf1Var3 = this.f24490a;
                int i14 = 5;
                sf1Var.a(rf1Var3.f31172a, i8, 5);
                rf1Var3.c(i8);
                int b4 = this.f24490a.b(8);
                this.f24490a.d(i9);
                int b5 = this.f24490a.b(i10);
                this.f24490a.d(i11);
                int b6 = this.f24490a.b(i12);
                int d4 = sf1Var.d();
                int i15 = d4 + b6;
                int i16 = -1;
                String str = null;
                ArrayList arrayList = null;
                while (true) {
                    if (sf1Var.d() >= i15) {
                        i4 = i11;
                        break;
                    }
                    int t4 = sf1Var.t();
                    int d5 = sf1Var.d() + sf1Var.t();
                    if (d5 > i15) {
                        i4 = 4;
                        break;
                    }
                    if (t4 == i14) {
                        long v4 = sf1Var.v();
                        if (v4 != 1094921523) {
                            if (v4 != 1161904947) {
                                if (v4 != 1094921524) {
                                    if (v4 == 1212503619) {
                                        i16 = 36;
                                    }
                                    i6 = 4;
                                    sf1Var.f(d5 - sf1Var.d());
                                    i11 = i6;
                                    i14 = 5;
                                    i9 = 3;
                                    i13 = 21;
                                }
                                i16 = 172;
                                i6 = 4;
                                sf1Var.f(d5 - sf1Var.d());
                                i11 = i6;
                                i14 = 5;
                                i9 = 3;
                                i13 = 21;
                            }
                            i16 = 135;
                            i6 = 4;
                            sf1Var.f(d5 - sf1Var.d());
                            i11 = i6;
                            i14 = 5;
                            i9 = 3;
                            i13 = 21;
                        }
                        i16 = 129;
                        i6 = 4;
                        sf1Var.f(d5 - sf1Var.d());
                        i11 = i6;
                        i14 = 5;
                        i9 = 3;
                        i13 = 21;
                    } else {
                        if (t4 != 106) {
                            if (t4 != 122) {
                                if (t4 != 127) {
                                    if (t4 == 123) {
                                        i16 = 138;
                                    } else if (t4 == 10) {
                                        str = sf1Var.a(i9, un.f33183c).trim();
                                    } else {
                                        if (t4 == 89) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (sf1Var.d() < d5) {
                                                String trim = sf1Var.a(i9, un.f33183c).trim();
                                                sf1Var.t();
                                                byte[] bArr = new byte[4];
                                                sf1Var.a(bArr, 0, 4);
                                                arrayList2.add(new e72.a(trim, bArr));
                                                i9 = 3;
                                            }
                                            i6 = 4;
                                            arrayList = arrayList2;
                                            i16 = 89;
                                        } else {
                                            i6 = 4;
                                            if (t4 == 111) {
                                                i16 = 257;
                                            }
                                        }
                                        sf1Var.f(d5 - sf1Var.d());
                                        i11 = i6;
                                        i14 = 5;
                                        i9 = 3;
                                        i13 = 21;
                                    }
                                }
                                i6 = 4;
                                sf1Var.f(d5 - sf1Var.d());
                                i11 = i6;
                                i14 = 5;
                                i9 = 3;
                                i13 = 21;
                            }
                            i16 = 135;
                            i6 = 4;
                            sf1Var.f(d5 - sf1Var.d());
                            i11 = i6;
                            i14 = 5;
                            i9 = 3;
                            i13 = 21;
                        }
                        i16 = 129;
                        i6 = 4;
                        sf1Var.f(d5 - sf1Var.d());
                        i11 = i6;
                        i14 = 5;
                        i9 = 3;
                        i13 = 21;
                    }
                }
                sf1Var.e(i15);
                e72.b bVar2 = new e72.b(i16, str, arrayList, Arrays.copyOfRange(sf1Var.c(), d4, i15));
                if (b4 == 6 || b4 == 5) {
                    b4 = i16;
                }
                a5 -= b6 + 5;
                d72 d72Var5 = d72.this;
                int i17 = d72Var5.f24469a == 2 ? b4 : b5;
                if (d72Var5.f24476h.get(i17)) {
                    i5 = 21;
                } else {
                    d72 d72Var6 = d72.this;
                    if (d72Var6.f24469a == 2) {
                        i5 = 21;
                        if (b4 == 21) {
                            a4 = d72Var6.f24485q;
                            if (d72.this.f24469a == 2 || b5 < this.f24492c.get(i17, 8192)) {
                                this.f24492c.put(i17, b5);
                                this.f24491b.put(i17, a4);
                            }
                        }
                    } else {
                        i5 = 21;
                    }
                    a4 = d72Var6.f24474f.a(b4, bVar2);
                    if (d72.this.f24469a == 2) {
                    }
                    this.f24492c.put(i17, b5);
                    this.f24491b.put(i17, a4);
                }
                i11 = i4;
                i13 = i5;
                i8 = 0;
                i9 = 3;
                i10 = 13;
                i12 = 12;
            }
            int size = this.f24492c.size();
            for (int i18 = 0; i18 < size; i18++) {
                int keyAt = this.f24492c.keyAt(i18);
                int valueAt = this.f24492c.valueAt(i18);
                d72.this.f24476h.put(keyAt, true);
                d72.this.f24477i.put(valueAt, true);
                e72 valueAt2 = this.f24491b.valueAt(i18);
                if (valueAt2 != null) {
                    d72 d72Var7 = d72.this;
                    if (valueAt2 != d72Var7.f24485q) {
                        valueAt2.a(e52Var, d72Var7.f24480l, new e72.d(z4, keyAt, 8192));
                    }
                    d72.this.f24475g.put(valueAt, valueAt2);
                }
            }
            d72 d72Var8 = d72.this;
            if (d72Var8.f24469a == 2) {
                if (d72Var8.f24482n) {
                    return;
                }
                d72Var8.f24480l.a();
                d72 d72Var9 = d72.this;
                d72Var9.f24481m = 0;
                d72Var9.f24482n = true;
                return;
            }
            d72Var8.f24475g.remove(this.f24493d);
            d72 d72Var10 = d72.this;
            int i19 = d72Var10.f24469a == 1 ? 0 : d72Var10.f24481m - 1;
            d72Var10.f24481m = i19;
            if (i19 == 0) {
                d72Var10.f24480l.a();
                d72.this.f24482n = true;
            }
        }
    }

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.X0
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = d72.a();
                return a4;
            }
        };
    }

    public d72(int i4) {
        this(new e52(0L), new i00());
    }

    private void b() {
        this.f24476h.clear();
        this.f24475g.clear();
        SparseArray<e72> a4 = this.f24474f.a();
        int size = a4.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f24475g.put(a4.keyAt(i4), a4.valueAt(i4));
        }
        this.f24475g.put(0, new sw1(new a()));
        this.f24485q = null;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f24480l = r70Var;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    public d72(e52 e52Var, i00 i00Var) {
        this.f24474f = (e72.c) C2253tf.a(i00Var);
        this.f24470b = 112800;
        this.f24469a = 1;
        this.f24471c = Collections.singletonList(e52Var);
        this.f24472d = new sf1(0, new byte[9400]);
        this.f24476h = new SparseBooleanArray();
        this.f24477i = new SparseBooleanArray();
        this.f24475g = new SparseArray<>();
        this.f24473e = new SparseIntArray();
        this.f24478j = new c72();
        this.f24480l = r70.f31061a;
        this.f24487s = -1;
        b();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final int a(q70 q70Var, hj1 hj1Var) {
        long j4;
        long j5;
        lz lzVar = (lz) q70Var;
        long b4 = lzVar.b();
        if (!this.f24482n) {
            j4 = -1;
        } else {
            if (b4 != -1 && this.f24469a != 2 && !this.f24478j.c()) {
                return this.f24478j.a(lzVar, hj1Var, this.f24487s);
            }
            if (this.f24483o) {
                j4 = -1;
                j5 = 0;
            } else {
                this.f24483o = true;
                if (this.f24478j.a() != -9223372036854775807L) {
                    j4 = -1;
                    j5 = 0;
                    b72 b72Var = new b72(this.f24478j.b(), this.f24478j.a(), b4, this.f24487s, this.f24470b);
                    this.f24479k = b72Var;
                    this.f24480l.a(b72Var.a());
                } else {
                    j4 = -1;
                    j5 = 0;
                    this.f24480l.a(new tw1.b(this.f24478j.a(), 0L));
                }
            }
            if (this.f24484p) {
                this.f24484p = false;
                a(j5, j5);
                if (lzVar.a() != j5) {
                    hj1Var.f26771a = j5;
                    return 1;
                }
            }
            b72 b72Var2 = this.f24479k;
            if (b72Var2 != null && b72Var2.b()) {
                return this.f24479k.a(lzVar, hj1Var);
            }
        }
        byte[] c4 = this.f24472d.c();
        if (9400 - this.f24472d.d() < 188) {
            int a4 = this.f24472d.a();
            if (a4 > 0) {
                System.arraycopy(c4, this.f24472d.d(), c4, 0, a4);
            }
            this.f24472d.a(a4, c4);
        }
        while (this.f24472d.a() < 188) {
            int e4 = this.f24472d.e();
            int read = lzVar.read(c4, e4, 9400 - e4);
            if (read == -1) {
                return -1;
            }
            this.f24472d.d(e4 + read);
        }
        int d4 = this.f24472d.d();
        int e5 = this.f24472d.e();
        byte[] c5 = this.f24472d.c();
        int i4 = d4;
        while (i4 < e5 && c5[i4] != 71) {
            i4++;
        }
        this.f24472d.e(i4);
        int i5 = i4 + 188;
        if (i5 > e5) {
            int i6 = (i4 - d4) + this.f24486r;
            this.f24486r = i6;
            if (this.f24469a == 2 && i6 > 376) {
                throw wf1.a("Cannot find sync byte. Most likely not a Transport Stream.", (Exception) null);
            }
        } else {
            this.f24486r = 0;
        }
        int e6 = this.f24472d.e();
        if (i5 > e6) {
            return 0;
        }
        int h4 = this.f24472d.h();
        if ((8388608 & h4) != 0) {
            this.f24472d.e(i5);
            return 0;
        }
        int i7 = (4194304 & h4) != 0 ? 1 : 0;
        int i8 = (2096896 & h4) >> 8;
        boolean z4 = (h4 & 32) != 0;
        e72 e72Var = (h4 & 16) != 0 ? this.f24475g.get(i8) : null;
        if (e72Var == null) {
            this.f24472d.e(i5);
            return 0;
        }
        if (this.f24469a != 2) {
            int i9 = h4 & 15;
            int i10 = this.f24473e.get(i8, i9 - 1);
            this.f24473e.put(i8, i9);
            if (i10 == i9) {
                this.f24472d.e(i5);
                return 0;
            }
            if (i9 != ((i10 + 1) & 15)) {
                e72Var.a();
            }
        }
        if (z4) {
            int t4 = this.f24472d.t();
            i7 |= (this.f24472d.t() & 64) != 0 ? 2 : 0;
            this.f24472d.f(t4 - 1);
        }
        boolean z5 = this.f24482n;
        if (this.f24469a == 2 || z5 || !this.f24477i.get(i8, false)) {
            this.f24472d.d(i5);
            e72Var.a(i7, this.f24472d);
            this.f24472d.d(e6);
        }
        if (this.f24469a != 2 && !z5 && this.f24482n && b4 != j4) {
            this.f24484p = true;
        }
        this.f24472d.e(i5);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        int i4;
        b72 b72Var;
        if (this.f24469a != 2) {
            int size = this.f24471c.size();
            for (0; i4 < size; i4 + 1) {
                e52 e52Var = this.f24471c.get(i4);
                boolean z4 = e52Var.c() == -9223372036854775807L;
                if (!z4) {
                    long a4 = e52Var.a();
                    if (a4 != -9223372036854775807L) {
                        if (a4 != 0) {
                            if (a4 == j5) {
                            }
                            e52Var.c(j5);
                        }
                    }
                } else {
                    i4 = z4 ? 0 : i4 + 1;
                    e52Var.c(j5);
                }
            }
            if (j5 != 0 && (b72Var = this.f24479k) != null) {
                b72Var.a(j5);
            }
            this.f24472d.c(0);
            this.f24473e.clear();
            for (int i5 = 0; i5 < this.f24475g.size(); i5++) {
                this.f24475g.valueAt(i5).a();
            }
            this.f24486r = 0;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(q70 q70Var) {
        byte[] c4 = this.f24472d.c();
        lz lzVar = (lz) q70Var;
        lzVar.b(c4, 0, 940, false);
        int i4 = 0;
        while (i4 < 188) {
            for (int i5 = 0; i5 < 5; i5++) {
                if (c4[(i5 * 188) + i4] != 71) {
                    break;
                }
            }
            lzVar.a(i4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p70[] a() {
        return new p70[]{new d72(0)};
    }
}
