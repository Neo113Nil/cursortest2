package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.s31;
import com.yandex.mobile.ads.impl.yb0;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class te0 implements q40 {

    /* renamed from: a, reason: collision with root package name */
    private final yw1 f32364a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32365b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32366c;

    /* renamed from: g, reason: collision with root package name */
    private long f32370g;

    /* renamed from: i, reason: collision with root package name */
    private String f32372i;

    /* renamed from: j, reason: collision with root package name */
    private p52 f32373j;

    /* renamed from: k, reason: collision with root package name */
    private a f32374k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f32375l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f32377n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f32371h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final r31 f32367d = new r31(7);

    /* renamed from: e, reason: collision with root package name */
    private final r31 f32368e = new r31(8);

    /* renamed from: f, reason: collision with root package name */
    private final r31 f32369f = new r31(6);

    /* renamed from: m, reason: collision with root package name */
    private long f32376m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final sf1 f32378o = new sf1();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final p52 f32379a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f32380b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f32381c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<s31.c> f32382d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<s31.b> f32383e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        private final tf1 f32384f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f32385g;

        /* renamed from: h, reason: collision with root package name */
        private int f32386h;

        /* renamed from: i, reason: collision with root package name */
        private int f32387i;

        /* renamed from: j, reason: collision with root package name */
        private long f32388j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f32389k;

        /* renamed from: l, reason: collision with root package name */
        private long f32390l;

        /* renamed from: m, reason: collision with root package name */
        private C0203a f32391m;

        /* renamed from: n, reason: collision with root package name */
        private C0203a f32392n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f32393o;

        /* renamed from: p, reason: collision with root package name */
        private long f32394p;

        /* renamed from: q, reason: collision with root package name */
        private long f32395q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f32396r;

        /* renamed from: com.yandex.mobile.ads.impl.te0$a$a, reason: collision with other inner class name */
        private static final class C0203a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f32397a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f32398b;

            /* renamed from: c, reason: collision with root package name */
            private s31.c f32399c;

            /* renamed from: d, reason: collision with root package name */
            private int f32400d;

            /* renamed from: e, reason: collision with root package name */
            private int f32401e;

            /* renamed from: f, reason: collision with root package name */
            private int f32402f;

            /* renamed from: g, reason: collision with root package name */
            private int f32403g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f32404h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f32405i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f32406j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f32407k;

            /* renamed from: l, reason: collision with root package name */
            private int f32408l;

            /* renamed from: m, reason: collision with root package name */
            private int f32409m;

            /* renamed from: n, reason: collision with root package name */
            private int f32410n;

            /* renamed from: o, reason: collision with root package name */
            private int f32411o;

            /* renamed from: p, reason: collision with root package name */
            private int f32412p;

            private C0203a() {
            }
        }

        public a(p52 p52Var, boolean z4, boolean z5) {
            this.f32379a = p52Var;
            this.f32380b = z4;
            this.f32381c = z5;
            this.f32391m = new C0203a();
            this.f32392n = new C0203a();
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
            this.f32385g = bArr;
            this.f32384f = new tf1(bArr, 0, 0);
            a();
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0106  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(byte[] bArr, int i4, int i5) {
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            if (this.f32389k) {
                int i11 = i5 - i4;
                byte[] bArr2 = this.f32385g;
                int length = bArr2.length;
                int i12 = this.f32386h + i11;
                if (length < i12) {
                    this.f32385g = Arrays.copyOf(bArr2, i12 * 2);
                }
                System.arraycopy(bArr, i4, this.f32385g, this.f32386h, i11);
                int i13 = this.f32386h + i11;
                this.f32386h = i13;
                int i14 = 0;
                this.f32384f.a(this.f32385g, 0, i13);
                if (this.f32384f.a(8)) {
                    this.f32384f.f();
                    int b4 = this.f32384f.b(2);
                    this.f32384f.d(5);
                    if (this.f32384f.b()) {
                        this.f32384f.e();
                        if (this.f32384f.b()) {
                            int e4 = this.f32384f.e();
                            if (!this.f32381c) {
                                this.f32389k = false;
                                C0203a c0203a = this.f32392n;
                                c0203a.f32401e = e4;
                                c0203a.f32398b = true;
                                return;
                            }
                            if (this.f32384f.b()) {
                                int e5 = this.f32384f.e();
                                if (this.f32383e.indexOfKey(e5) < 0) {
                                    this.f32389k = false;
                                    return;
                                }
                                s31.b bVar = this.f32383e.get(e5);
                                s31.c cVar = this.f32382d.get(bVar.f31567a);
                                if (cVar.f31576h) {
                                    if (!this.f32384f.a(2)) {
                                        return;
                                    } else {
                                        this.f32384f.d(2);
                                    }
                                }
                                if (this.f32384f.a(cVar.f31578j)) {
                                    int b5 = this.f32384f.b(cVar.f31578j);
                                    if (cVar.f31577i) {
                                        z4 = false;
                                        z5 = false;
                                    } else {
                                        if (!this.f32384f.a(1)) {
                                            return;
                                        }
                                        z4 = this.f32384f.c();
                                        if (z4) {
                                            if (this.f32384f.a(1)) {
                                                z5 = this.f32384f.c();
                                                z6 = true;
                                                z7 = this.f32387i != 5;
                                                if (z7) {
                                                    i6 = 0;
                                                } else if (!this.f32384f.b()) {
                                                    return;
                                                } else {
                                                    i6 = this.f32384f.e();
                                                }
                                                i7 = cVar.f31579k;
                                                if (i7 != 0) {
                                                    if (!this.f32384f.a(cVar.f31580l)) {
                                                        return;
                                                    }
                                                    int b6 = this.f32384f.b(cVar.f31580l);
                                                    if (!bVar.f31568b || z4) {
                                                        i8 = 0;
                                                        i10 = b6;
                                                        i9 = 0;
                                                    } else {
                                                        if (!this.f32384f.b()) {
                                                            return;
                                                        }
                                                        i8 = this.f32384f.d();
                                                        i10 = b6;
                                                        i9 = 0;
                                                    }
                                                } else if (i7 != 1 || cVar.f31581m) {
                                                    i8 = 0;
                                                    i9 = 0;
                                                    i10 = 0;
                                                } else {
                                                    if (!this.f32384f.b()) {
                                                        return;
                                                    }
                                                    int d4 = this.f32384f.d();
                                                    if (!bVar.f31568b || z4) {
                                                        i8 = 0;
                                                        i10 = 0;
                                                        i14 = d4;
                                                        i9 = 0;
                                                    } else {
                                                        if (!this.f32384f.b()) {
                                                            return;
                                                        }
                                                        i10 = 0;
                                                        i14 = d4;
                                                        i9 = this.f32384f.d();
                                                        i8 = 0;
                                                    }
                                                }
                                                C0203a c0203a2 = this.f32392n;
                                                c0203a2.f32399c = cVar;
                                                c0203a2.f32400d = b4;
                                                c0203a2.f32401e = e4;
                                                c0203a2.f32402f = b5;
                                                c0203a2.f32403g = e5;
                                                c0203a2.f32404h = z4;
                                                c0203a2.f32405i = z6;
                                                c0203a2.f32406j = z5;
                                                c0203a2.f32407k = z7;
                                                c0203a2.f32408l = i6;
                                                c0203a2.f32409m = i10;
                                                c0203a2.f32410n = i8;
                                                c0203a2.f32411o = i14;
                                                c0203a2.f32412p = i9;
                                                c0203a2.f32397a = true;
                                                c0203a2.f32398b = true;
                                                this.f32389k = false;
                                            }
                                            return;
                                        }
                                        z5 = false;
                                    }
                                    z6 = z5;
                                    if (this.f32387i != 5) {
                                    }
                                    if (z7) {
                                    }
                                    i7 = cVar.f31579k;
                                    if (i7 != 0) {
                                    }
                                    C0203a c0203a22 = this.f32392n;
                                    c0203a22.f32399c = cVar;
                                    c0203a22.f32400d = b4;
                                    c0203a22.f32401e = e4;
                                    c0203a22.f32402f = b5;
                                    c0203a22.f32403g = e5;
                                    c0203a22.f32404h = z4;
                                    c0203a22.f32405i = z6;
                                    c0203a22.f32406j = z5;
                                    c0203a22.f32407k = z7;
                                    c0203a22.f32408l = i6;
                                    c0203a22.f32409m = i10;
                                    c0203a22.f32410n = i8;
                                    c0203a22.f32411o = i14;
                                    c0203a22.f32412p = i9;
                                    c0203a22.f32397a = true;
                                    c0203a22.f32398b = true;
                                    this.f32389k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public final void a() {
            this.f32389k = false;
            this.f32393o = false;
            C0203a c0203a = this.f32392n;
            c0203a.f32398b = false;
            c0203a.f32397a = false;
        }
    }

    public te0(yw1 yw1Var, boolean z4, boolean z5) {
        this.f32364a = yw1Var;
        this.f32365b = z4;
        this.f32366c = z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0277, code lost:
    
        if (r5.f32406j == r8.f32406j) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0285, code lost:
    
        if (r14 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02a1, code lost:
    
        if (r5.f32410n == r8.f32410n) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02bc, code lost:
    
        if (r5.f32412p == r8.f32412p) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02d2, code lost:
    
        if (r5.f32408l == r8.f32408l) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0353 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0362  */
    @Override // com.yandex.mobile.ads.impl.q40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sf1 sf1Var) {
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        a aVar;
        boolean z4;
        long j4;
        boolean z5;
        a aVar2;
        int i7;
        int i8 = 3;
        if (this.f32373j == null) {
            throw new IllegalStateException();
        }
        int i9 = u82.f32873a;
        int d4 = sf1Var.d();
        int e4 = sf1Var.e();
        byte[] c4 = sf1Var.c();
        this.f32370g += sf1Var.a();
        this.f32373j.a(sf1Var.a(), sf1Var);
        while (true) {
            int a4 = s31.a(c4, d4, e4, this.f32371h);
            if (a4 == e4) {
                if (!this.f32375l || this.f32374k.f32381c) {
                    this.f32367d.a(c4, d4, e4);
                    this.f32368e.a(c4, d4, e4);
                }
                this.f32369f.a(c4, d4, e4);
                this.f32374k.a(c4, d4, e4);
                return;
            }
            int i10 = a4 + 3;
            int i11 = c4[i10] & 31;
            int i12 = a4 - d4;
            if (i12 > 0) {
                if (!this.f32375l || this.f32374k.f32381c) {
                    this.f32367d.a(c4, d4, a4);
                    this.f32368e.a(c4, d4, a4);
                }
                this.f32369f.a(c4, d4, a4);
                this.f32374k.a(c4, d4, a4);
            }
            int i13 = e4 - a4;
            long j5 = this.f32370g - i13;
            int i14 = i12 < 0 ? -i12 : 0;
            long j6 = this.f32376m;
            if (!this.f32375l || this.f32374k.f32381c) {
                this.f32367d.a(i14);
                this.f32368e.a(i14);
                if (this.f32375l) {
                    i4 = i13;
                    i5 = e4;
                    bArr = c4;
                    if (this.f32367d.a()) {
                        r31 r31Var = this.f32367d;
                        i6 = 3;
                        s31.c b4 = s31.b(r31Var.f31024d, 3, r31Var.f31025e);
                        this.f32374k.f32382d.append(b4.f31572d, b4);
                        this.f32367d.b();
                    } else {
                        i6 = 3;
                        if (this.f32368e.a()) {
                            r31 r31Var2 = this.f32368e;
                            tf1 tf1Var = new tf1(r31Var2.f31024d, 4, r31Var2.f31025e);
                            int e5 = tf1Var.e();
                            int e6 = tf1Var.e();
                            tf1Var.f();
                            this.f32374k.f32383e.append(e5, new s31.b(e5, e6, tf1Var.c()));
                            this.f32368e.b();
                        }
                    }
                } else if (this.f32367d.a() && this.f32368e.a()) {
                    ArrayList arrayList = new ArrayList();
                    r31 r31Var3 = this.f32367d;
                    arrayList.add(Arrays.copyOf(r31Var3.f31024d, r31Var3.f31025e));
                    r31 r31Var4 = this.f32368e;
                    arrayList.add(Arrays.copyOf(r31Var4.f31024d, r31Var4.f31025e));
                    r31 r31Var5 = this.f32367d;
                    s31.c b5 = s31.b(r31Var5.f31024d, i8, r31Var5.f31025e);
                    r31 r31Var6 = this.f32368e;
                    i4 = i13;
                    tf1 tf1Var2 = new tf1(r31Var6.f31024d, 4, r31Var6.f31025e);
                    int e7 = tf1Var2.e();
                    int e8 = tf1Var2.e();
                    tf1Var2.f();
                    s31.b bVar = new s31.b(e7, e8, tf1Var2.c());
                    i5 = e4;
                    bArr = c4;
                    this.f32373j.a(new yb0.a().b(this.f32372i).e("video/avc").a(String.format("avc1.%02X%02X%02X", Integer.valueOf(b5.f31569a), Integer.valueOf(b5.f31570b), Integer.valueOf(b5.f31571c))).o(b5.f31573e).f(b5.f31574f).b(b5.f31575g).a(arrayList).a());
                    this.f32375l = true;
                    this.f32374k.f32382d.append(b5.f31572d, b5);
                    this.f32374k.f32383e.append(e7, bVar);
                    this.f32367d.b();
                    this.f32368e.b();
                    i6 = 3;
                }
                if (this.f32369f.a(i14)) {
                    r31 r31Var7 = this.f32369f;
                    this.f32378o.a(s31.a(r31Var7.f31025e, r31Var7.f31024d), this.f32369f.f31024d);
                    this.f32378o.e(4);
                    this.f32364a.a(j6, this.f32378o);
                }
                aVar = this.f32374k;
                z4 = this.f32375l;
                boolean z6 = this.f32377n;
                if (aVar.f32387i != 9) {
                    if (aVar.f32381c) {
                        a.C0203a c0203a = aVar.f32392n;
                        a.C0203a c0203a2 = aVar.f32391m;
                        if (c0203a.f32397a) {
                            if (c0203a2.f32397a) {
                                s31.c cVar = c0203a.f32399c;
                                if (cVar == null) {
                                    throw new IllegalStateException();
                                }
                                s31.c cVar2 = c0203a2.f32399c;
                                if (cVar2 == null) {
                                    throw new IllegalStateException();
                                }
                                if (c0203a.f32402f == c0203a2.f32402f) {
                                    if (c0203a.f32403g == c0203a2.f32403g) {
                                        if (c0203a.f32404h == c0203a2.f32404h) {
                                            if (c0203a.f32405i) {
                                                if (c0203a2.f32405i) {
                                                }
                                            }
                                            int i15 = c0203a.f32400d;
                                            int i16 = c0203a2.f32400d;
                                            if (i15 != i16) {
                                                if (i15 != 0) {
                                                }
                                            }
                                            int i17 = cVar.f31579k;
                                            if (i17 == 0) {
                                                if (cVar2.f31579k == 0) {
                                                    if (c0203a.f32409m == c0203a2.f32409m) {
                                                    }
                                                }
                                            }
                                            if (i17 == 1) {
                                                if (cVar2.f31579k == 1) {
                                                    if (c0203a.f32411o == c0203a2.f32411o) {
                                                    }
                                                }
                                            }
                                            boolean z7 = c0203a.f32407k;
                                            if (z7 == c0203a2.f32407k) {
                                                if (z7) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (aVar.f32380b) {
                        a.C0203a c0203a3 = aVar.f32392n;
                        z6 = c0203a3.f32398b && ((i7 = c0203a3.f32401e) == 7 || i7 == 2);
                    }
                    boolean z8 = aVar.f32396r;
                    int i18 = aVar.f32387i;
                    z5 = z8 | (i18 != 5 || (z6 && i18 == 1));
                    aVar.f32396r = z5;
                    if (z5) {
                        this.f32377n = false;
                    }
                    long j7 = this.f32376m;
                    if (this.f32375l || this.f32374k.f32381c) {
                        this.f32367d.b(i11);
                        this.f32368e.b(i11);
                    }
                    this.f32369f.b(i11);
                    aVar2 = this.f32374k;
                    aVar2.f32387i = i11;
                    aVar2.f32390l = j7;
                    aVar2.f32388j = j5;
                    if ((aVar2.f32380b && i11 == 1) || (aVar2.f32381c && (i11 == 5 || i11 == 1 || i11 == 2))) {
                        a.C0203a c0203a4 = aVar2.f32391m;
                        aVar2.f32391m = aVar2.f32392n;
                        aVar2.f32392n = c0203a4;
                        c0203a4.f32398b = false;
                        c0203a4.f32397a = false;
                        aVar2.f32386h = 0;
                        aVar2.f32389k = true;
                    }
                    i8 = i6;
                    d4 = i10;
                    e4 = i5;
                    c4 = bArr;
                }
                if (z4 && aVar.f32393o) {
                    long j8 = aVar.f32388j;
                    int i19 = i4 + ((int) (j5 - j8));
                    j4 = aVar.f32395q;
                    if (j4 != -9223372036854775807L) {
                        aVar.f32379a.a(j4, aVar.f32396r ? 1 : 0, (int) (j8 - aVar.f32394p), i19, null);
                    }
                }
                aVar.f32394p = aVar.f32388j;
                aVar.f32395q = aVar.f32390l;
                aVar.f32396r = false;
                aVar.f32393o = true;
                if (aVar.f32380b) {
                }
                boolean z82 = aVar.f32396r;
                int i182 = aVar.f32387i;
                z5 = z82 | (i182 != 5 || (z6 && i182 == 1));
                aVar.f32396r = z5;
                if (z5) {
                }
                long j72 = this.f32376m;
                if (this.f32375l) {
                }
                this.f32367d.b(i11);
                this.f32368e.b(i11);
                this.f32369f.b(i11);
                aVar2 = this.f32374k;
                aVar2.f32387i = i11;
                aVar2.f32390l = j72;
                aVar2.f32388j = j5;
                if (aVar2.f32380b) {
                    a.C0203a c0203a42 = aVar2.f32391m;
                    aVar2.f32391m = aVar2.f32392n;
                    aVar2.f32392n = c0203a42;
                    c0203a42.f32398b = false;
                    c0203a42.f32397a = false;
                    aVar2.f32386h = 0;
                    aVar2.f32389k = true;
                    i8 = i6;
                    d4 = i10;
                    e4 = i5;
                    c4 = bArr;
                }
                a.C0203a c0203a422 = aVar2.f32391m;
                aVar2.f32391m = aVar2.f32392n;
                aVar2.f32392n = c0203a422;
                c0203a422.f32398b = false;
                c0203a422.f32397a = false;
                aVar2.f32386h = 0;
                aVar2.f32389k = true;
                i8 = i6;
                d4 = i10;
                e4 = i5;
                c4 = bArr;
            }
            i4 = i13;
            i5 = e4;
            bArr = c4;
            i6 = i8;
            if (this.f32369f.a(i14)) {
            }
            aVar = this.f32374k;
            z4 = this.f32375l;
            boolean z62 = this.f32377n;
            if (aVar.f32387i != 9) {
            }
            if (z4) {
                long j82 = aVar.f32388j;
                int i192 = i4 + ((int) (j5 - j82));
                j4 = aVar.f32395q;
                if (j4 != -9223372036854775807L) {
                }
            }
            aVar.f32394p = aVar.f32388j;
            aVar.f32395q = aVar.f32390l;
            aVar.f32396r = false;
            aVar.f32393o = true;
            if (aVar.f32380b) {
            }
            boolean z822 = aVar.f32396r;
            int i1822 = aVar.f32387i;
            z5 = z822 | (i1822 != 5 || (z62 && i1822 == 1));
            aVar.f32396r = z5;
            if (z5) {
            }
            long j722 = this.f32376m;
            if (this.f32375l) {
            }
            this.f32367d.b(i11);
            this.f32368e.b(i11);
            this.f32369f.b(i11);
            aVar2 = this.f32374k;
            aVar2.f32387i = i11;
            aVar2.f32390l = j722;
            aVar2.f32388j = j5;
            if (aVar2.f32380b) {
            }
            a.C0203a c0203a4222 = aVar2.f32391m;
            aVar2.f32391m = aVar2.f32392n;
            aVar2.f32392n = c0203a4222;
            c0203a4222.f32398b = false;
            c0203a4222.f32397a = false;
            aVar2.f32386h = 0;
            aVar2.f32389k = true;
            i8 = i6;
            d4 = i10;
            e4 = i5;
            c4 = bArr;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        this.f32372i = dVar.b();
        p52 a4 = r70Var.a(dVar.c(), 2);
        this.f32373j = a4;
        this.f32374k = new a(a4, this.f32365b, this.f32366c);
        this.f32364a.a(r70Var, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f32376m = j4;
        }
        this.f32377n = ((i4 & 2) != 0) | this.f32377n;
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f32370g = 0L;
        this.f32377n = false;
        this.f32376m = -9223372036854775807L;
        s31.a(this.f32371h);
        this.f32367d.b();
        this.f32368e.b();
        this.f32369f.b();
        a aVar = this.f32374k;
        if (aVar != null) {
            aVar.a();
        }
    }
}
