package com.yandex.mobile.ads.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.AbstractC2346xg;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.u30;
import com.yandex.mobile.ads.impl.yb0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class ec0 implements p70 {

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f25187F;

    /* renamed from: G, reason: collision with root package name */
    private static final yb0 f25188G;

    /* renamed from: A, reason: collision with root package name */
    private boolean f25189A;

    /* renamed from: B, reason: collision with root package name */
    private r70 f25190B;

    /* renamed from: C, reason: collision with root package name */
    private p52[] f25191C;

    /* renamed from: D, reason: collision with root package name */
    private p52[] f25192D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f25193E;

    /* renamed from: a, reason: collision with root package name */
    private final List<yb0> f25194a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<b> f25195b;

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f25196c;

    /* renamed from: d, reason: collision with root package name */
    private final sf1 f25197d;

    /* renamed from: e, reason: collision with root package name */
    private final sf1 f25198e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f25199f;

    /* renamed from: g, reason: collision with root package name */
    private final sf1 f25200g;

    /* renamed from: h, reason: collision with root package name */
    private final q50 f25201h;

    /* renamed from: i, reason: collision with root package name */
    private final sf1 f25202i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<AbstractC2346xg.a> f25203j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayDeque<a> f25204k;

    /* renamed from: l, reason: collision with root package name */
    private final p52 f25205l;

    /* renamed from: m, reason: collision with root package name */
    private int f25206m;

    /* renamed from: n, reason: collision with root package name */
    private int f25207n;

    /* renamed from: o, reason: collision with root package name */
    private long f25208o;

    /* renamed from: p, reason: collision with root package name */
    private int f25209p;

    /* renamed from: q, reason: collision with root package name */
    private sf1 f25210q;

    /* renamed from: r, reason: collision with root package name */
    private long f25211r;

    /* renamed from: s, reason: collision with root package name */
    private int f25212s;

    /* renamed from: t, reason: collision with root package name */
    private long f25213t;

    /* renamed from: u, reason: collision with root package name */
    private long f25214u;

    /* renamed from: v, reason: collision with root package name */
    private long f25215v;

    /* renamed from: w, reason: collision with root package name */
    private b f25216w;

    /* renamed from: x, reason: collision with root package name */
    private int f25217x;

    /* renamed from: y, reason: collision with root package name */
    private int f25218y;

    /* renamed from: z, reason: collision with root package name */
    private int f25219z;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f25220a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f25221b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25222c;

        public a(int i4, long j4, boolean z4) {
            this.f25220a = j4;
            this.f25221b = z4;
            this.f25222c = i4;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final p52 f25223a;

        /* renamed from: d, reason: collision with root package name */
        public q52 f25226d;

        /* renamed from: e, reason: collision with root package name */
        public c00 f25227e;

        /* renamed from: f, reason: collision with root package name */
        public int f25228f;

        /* renamed from: g, reason: collision with root package name */
        public int f25229g;

        /* renamed from: h, reason: collision with root package name */
        public int f25230h;

        /* renamed from: i, reason: collision with root package name */
        public int f25231i;

        /* renamed from: l, reason: collision with root package name */
        private boolean f25234l;

        /* renamed from: b, reason: collision with root package name */
        public final m52 f25224b = new m52();

        /* renamed from: c, reason: collision with root package name */
        public final sf1 f25225c = new sf1();

        /* renamed from: j, reason: collision with root package name */
        private final sf1 f25232j = new sf1(1);

        /* renamed from: k, reason: collision with root package name */
        private final sf1 f25233k = new sf1();

        public b(p52 p52Var, q52 q52Var, c00 c00Var) {
            this.f25223a = p52Var;
            this.f25226d = q52Var;
            this.f25227e = c00Var;
            a(q52Var, c00Var);
        }

        public final l52 a() {
            if (!this.f25234l) {
                return null;
            }
            m52 m52Var = this.f25224b;
            c00 c00Var = m52Var.f28894a;
            int i4 = u82.f32873a;
            int i5 = c00Var.f23989a;
            l52 l52Var = m52Var.f28906m;
            if (l52Var == null) {
                l52Var = this.f25226d.f30677a.a(i5);
            }
            if (l52Var == null || !l52Var.f28426a) {
                return null;
            }
            return l52Var;
        }

        public final void b() {
            m52 m52Var = this.f25224b;
            m52Var.f28897d = 0;
            m52Var.f28909p = 0L;
            m52Var.f28910q = false;
            m52Var.f28904k = false;
            m52Var.f28908o = false;
            m52Var.f28906m = null;
            this.f25228f = 0;
            this.f25230h = 0;
            this.f25229g = 0;
            this.f25231i = 0;
            this.f25234l = false;
        }

        public final int a(int i4, int i5) {
            sf1 sf1Var;
            l52 a4 = a();
            if (a4 == null) {
                return 0;
            }
            int i6 = a4.f28429d;
            if (i6 != 0) {
                sf1Var = this.f25224b.f28907n;
            } else {
                byte[] bArr = a4.f28430e;
                int i7 = u82.f32873a;
                this.f25233k.a(bArr.length, bArr);
                sf1 sf1Var2 = this.f25233k;
                i6 = bArr.length;
                sf1Var = sf1Var2;
            }
            m52 m52Var = this.f25224b;
            boolean z4 = m52Var.f28904k && m52Var.f28905l[this.f25228f];
            boolean z5 = z4 || i5 != 0;
            this.f25232j.c()[0] = (byte) ((z5 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0) | i6);
            this.f25232j.e(0);
            this.f25223a.b(1, this.f25232j);
            this.f25223a.b(i6, sf1Var);
            if (!z5) {
                return i6 + 1;
            }
            if (!z4) {
                this.f25225c.c(8);
                byte[] c4 = this.f25225c.c();
                c4[0] = 0;
                c4[1] = 1;
                c4[2] = (byte) 0;
                c4[3] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
                c4[4] = (byte) ((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                c4[5] = (byte) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                c4[6] = (byte) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                c4[7] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f25223a.b(8, this.f25225c);
                return i6 + 9;
            }
            sf1 sf1Var3 = this.f25224b.f28907n;
            int z6 = sf1Var3.z();
            sf1Var3.f(-2);
            int i8 = (z6 * 6) + 2;
            if (i5 != 0) {
                this.f25225c.c(i8);
                byte[] c5 = this.f25225c.c();
                sf1Var3.a(c5, 0, i8);
                int i9 = (((c5[2] & 255) << 8) | (c5[3] & 255)) + i5;
                c5[2] = (byte) ((i9 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                c5[3] = (byte) (i9 & KotlinVersion.MAX_COMPONENT_VALUE);
                sf1Var3 = this.f25225c;
            }
            this.f25223a.b(i8, sf1Var3);
            return i6 + 1 + i8;
        }

        public final void a(q52 q52Var, c00 c00Var) {
            this.f25226d = q52Var;
            this.f25227e = c00Var;
            this.f25223a.a(q52Var.f30677a.f28066f);
            b();
        }
    }

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.P1
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = ec0.a();
                return a4;
            }
        };
        f25187F = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        f25188G = new yb0.a().e("application/x-emsg").a();
    }

    public ec0(int i4) {
        this(Collections.EMPTY_LIST);
    }

    protected final k52 a(k52 k52Var) {
        return k52Var;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    public ec0(List list) {
        this(list, 0);
    }

    private static u30 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2346xg.b bVar = (AbstractC2346xg.b) arrayList.get(i4);
            if (bVar.f34552a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] c4 = bVar.f34556b.c();
                UUID c5 = tm1.c(c4);
                if (c5 == null) {
                    ms0.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new u30.b(c5, null, "video/mp4", c4));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new u30(arrayList2);
    }

    public ec0(List list, int i4) {
        this.f25194a = Collections.unmodifiableList(list);
        this.f25205l = null;
        this.f25201h = new q50();
        this.f25202i = new sf1(16);
        this.f25196c = new sf1(s31.f31556a);
        this.f25197d = new sf1(5);
        this.f25198e = new sf1();
        byte[] bArr = new byte[16];
        this.f25199f = bArr;
        this.f25200g = new sf1(bArr);
        this.f25203j = new ArrayDeque<>();
        this.f25204k = new ArrayDeque<>();
        this.f25195b = new SparseArray<>();
        this.f25214u = -9223372036854775807L;
        this.f25213t = -9223372036854775807L;
        this.f25215v = -9223372036854775807L;
        this.f25190B = r70.f31061a;
        this.f25191C = new p52[0];
        this.f25192D = new p52[0];
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        int i4;
        this.f25190B = r70Var;
        int i5 = 0;
        this.f25206m = 0;
        this.f25209p = 0;
        p52[] p52VarArr = new p52[2];
        this.f25191C = p52VarArr;
        p52 p52Var = this.f25205l;
        if (p52Var != null) {
            p52VarArr[0] = p52Var;
            i4 = 1;
        } else {
            i4 = 0;
        }
        p52[] p52VarArr2 = (p52[]) u82.a(i4, p52VarArr);
        this.f25191C = p52VarArr2;
        for (p52 p52Var2 : p52VarArr2) {
            p52Var2.a(f25188G);
        }
        this.f25192D = new p52[this.f25194a.size()];
        int i6 = 100;
        while (i5 < this.f25192D.length) {
            int i7 = i6 + 1;
            p52 a4 = this.f25190B.a(i6, 3);
            a4.a(this.f25194a.get(i5));
            this.f25192D[i5] = a4;
            i5++;
            i6 = i7;
        }
    }

    private void a(AbstractC2346xg.a aVar) {
        c00 c00Var;
        c00 c00Var2;
        u30 a4 = a(aVar.f34554c);
        AbstractC2346xg.a b4 = aVar.b(1836475768);
        b4.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = b4.f34554c.size();
        long j4 = -9223372036854775807L;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2346xg.b bVar = (AbstractC2346xg.b) b4.f34554c.get(i4);
            int i5 = bVar.f34552a;
            if (i5 == 1953654136) {
                sf1 sf1Var = bVar.f34556b;
                sf1Var.e(12);
                Pair create = Pair.create(Integer.valueOf(sf1Var.h()), new c00(sf1Var.h() - 1, sf1Var.h(), sf1Var.h(), sf1Var.h()));
                sparseArray.put(((Integer) create.first).intValue(), (c00) create.second);
            } else if (i5 == 1835362404) {
                sf1 sf1Var2 = bVar.f34556b;
                sf1Var2.e(8);
                j4 = ((sf1Var2.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? sf1Var2.v() : sf1Var2.y();
            }
        }
        ArrayList a5 = C2369yg.a(aVar, new xd0(), j4, a4, false, false, new ud0() { // from class: com.yandex.mobile.ads.impl.O1
            @Override // com.yandex.mobile.ads.impl.ud0
            public final Object apply(Object obj) {
                return ec0.this.a((k52) obj);
            }
        });
        int size2 = a5.size();
        if (this.f25195b.size() == 0) {
            for (int i6 = 0; i6 < size2; i6++) {
                q52 q52Var = (q52) a5.get(i6);
                k52 k52Var = q52Var.f30677a;
                p52 a6 = this.f25190B.a(i6, k52Var.f28062b);
                int i7 = k52Var.f28061a;
                if (sparseArray.size() == 1) {
                    c00Var2 = (c00) sparseArray.valueAt(0);
                } else {
                    c00Var2 = (c00) sparseArray.get(i7);
                    c00Var2.getClass();
                }
                this.f25195b.put(k52Var.f28061a, new b(a6, q52Var, c00Var2));
                this.f25214u = Math.max(this.f25214u, k52Var.f28065e);
            }
            this.f25190B.a();
            return;
        }
        if (this.f25195b.size() != size2) {
            throw new IllegalStateException();
        }
        for (int i8 = 0; i8 < size2; i8++) {
            q52 q52Var2 = (q52) a5.get(i8);
            k52 k52Var2 = q52Var2.f30677a;
            b bVar2 = this.f25195b.get(k52Var2.f28061a);
            int i9 = k52Var2.f28061a;
            if (sparseArray.size() == 1) {
                c00Var = (c00) sparseArray.valueAt(0);
            } else {
                c00Var = (c00) sparseArray.get(i9);
                c00Var.getClass();
            }
            bVar2.a(q52Var2, c00Var);
        }
    }

    private static void a(sf1 sf1Var, int i4, m52 m52Var) {
        sf1Var.e(i4 + 8);
        int h4 = sf1Var.h();
        if ((h4 & 1) == 0) {
            boolean z4 = (h4 & 2) != 0;
            int x4 = sf1Var.x();
            if (x4 == 0) {
                Arrays.fill(m52Var.f28905l, 0, m52Var.f28898e, false);
                return;
            }
            if (x4 == m52Var.f28898e) {
                Arrays.fill(m52Var.f28905l, 0, x4, z4);
                m52Var.f28907n.c(sf1Var.a());
                m52Var.f28904k = true;
                m52Var.f28908o = true;
                sf1Var.a(m52Var.f28907n.c(), 0, m52Var.f28907n.e());
                m52Var.f28907n.e(0);
                m52Var.f28908o = false;
                return;
            }
            throw wf1.a("Senc sample count " + x4 + " is different from fragment sample count" + m52Var.f28898e, (Exception) null);
        }
        throw wf1.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v9 */
    private void a(long j4) {
        int i4;
        boolean z4;
        int i5;
        SparseArray<b> sparseArray;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z5;
        byte[] bArr;
        int i15;
        boolean z6;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        long[] jArr;
        int i22;
        int i23;
        c00 c00Var;
        int i24;
        int i25 = 8;
        boolean z7 = true;
        while (!this.f25203j.isEmpty() && this.f25203j.peek().f34553b == j4) {
            AbstractC2346xg.a pop = this.f25203j.pop();
            int i26 = pop.f34552a;
            if (i26 == 1836019574) {
                a(pop);
            } else {
                if (i26 == 1836019558) {
                    SparseArray<b> sparseArray2 = this.f25195b;
                    byte[] bArr2 = this.f25199f;
                    int size = pop.f34555d.size();
                    int i27 = 0;
                    while (i27 < size) {
                        AbstractC2346xg.a aVar = (AbstractC2346xg.a) pop.f34555d.get(i27);
                        if (aVar.f34552a == 1953653094) {
                            AbstractC2346xg.b c4 = aVar.c(1952868452);
                            c4.getClass();
                            sf1 sf1Var = c4.f34556b;
                            sf1Var.e(i25);
                            int h4 = sf1Var.h();
                            b bVar = sparseArray2.get(sf1Var.h());
                            if (bVar == null) {
                                sparseArray = sparseArray2;
                                bVar = null;
                                i8 = 2;
                                i11 = 4;
                            } else {
                                sparseArray = sparseArray2;
                                if ((h4 & 1) != 0) {
                                    long y4 = sf1Var.y();
                                    i8 = 2;
                                    m52 m52Var = bVar.f25224b;
                                    m52Var.f28895b = y4;
                                    m52Var.f28896c = y4;
                                } else {
                                    i8 = 2;
                                }
                                c00 c00Var2 = bVar.f25227e;
                                if ((h4 & 2) != 0) {
                                    i9 = sf1Var.h() - (z7 ? 1 : 0);
                                } else {
                                    i9 = c00Var2.f23989a;
                                }
                                if ((h4 & 8) != 0) {
                                    i10 = sf1Var.h();
                                } else {
                                    i10 = c00Var2.f23990b;
                                }
                                if ((h4 & 16) != 0) {
                                    i12 = sf1Var.h();
                                    i11 = 4;
                                } else {
                                    i11 = 4;
                                    i12 = c00Var2.f23991c;
                                }
                                if ((h4 & 32) != 0) {
                                    i13 = sf1Var.h();
                                } else {
                                    i13 = c00Var2.f23992d;
                                }
                                bVar.f25224b.f28894a = new c00(i9, i10, i12, i13);
                            }
                            if (bVar == null) {
                                i5 = i25;
                                boolean z8 = z7 ? 1 : 0;
                                i6 = size;
                                i7 = i27;
                            } else {
                                m52 m52Var2 = bVar.f25224b;
                                long j5 = m52Var2.f28909p;
                                boolean z9 = m52Var2.f28910q;
                                bVar.b();
                                bVar.f25234l = z7;
                                AbstractC2346xg.b c5 = aVar.c(1952867444);
                                if (c5 != null) {
                                    sf1 sf1Var2 = c5.f34556b;
                                    sf1Var2.e(i25);
                                    m52Var2.f28909p = ((sf1Var2.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == z7 ? sf1Var2.y() : sf1Var2.v();
                                    m52Var2.f28910q = z7;
                                } else {
                                    m52Var2.f28909p = j5;
                                    m52Var2.f28910q = z9;
                                }
                                ArrayList arrayList2 = aVar.f34554c;
                                int size2 = arrayList2.size();
                                int i28 = 0;
                                int i29 = 0;
                                int i30 = 0;
                                while (true) {
                                    i14 = 1953658222;
                                    z5 = z7;
                                    if (i28 >= size2) {
                                        break;
                                    }
                                    AbstractC2346xg.b bVar2 = (AbstractC2346xg.b) arrayList2.get(i28);
                                    if (bVar2.f34552a == 1953658222) {
                                        sf1 sf1Var3 = bVar2.f34556b;
                                        sf1Var3.e(12);
                                        int x4 = sf1Var3.x();
                                        if (x4 > 0) {
                                            i29 += x4;
                                            i30++;
                                        }
                                    }
                                    i28++;
                                    z7 = z5;
                                }
                                bVar.f25230h = 0;
                                bVar.f25229g = 0;
                                bVar.f25228f = 0;
                                m52 m52Var3 = bVar.f25224b;
                                m52Var3.f28897d = i30;
                                m52Var3.f28898e = i29;
                                if (m52Var3.f28900g.length < i30) {
                                    m52Var3.f28899f = new long[i30];
                                    m52Var3.f28900g = new int[i30];
                                }
                                if (m52Var3.f28901h.length < i29) {
                                    int i31 = (i29 * 125) / 100;
                                    m52Var3.f28901h = new int[i31];
                                    m52Var3.f28902i = new long[i31];
                                    m52Var3.f28903j = new boolean[i31];
                                    m52Var3.f28905l = new boolean[i31];
                                }
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                int i35 = z5;
                                while (i32 < size2) {
                                    long j6 = 0;
                                    AbstractC2346xg.b bVar3 = (AbstractC2346xg.b) arrayList2.get(i32);
                                    if (bVar3.f34552a == i14) {
                                        int i36 = i33 + 1;
                                        sf1 sf1Var4 = bVar3.f34556b;
                                        sf1Var4.e(8);
                                        int h5 = sf1Var4.h();
                                        arrayList = arrayList2;
                                        k52 k52Var = bVar.f25226d.f30677a;
                                        i16 = i32;
                                        m52 m52Var4 = bVar.f25224b;
                                        int i37 = i33;
                                        c00 c00Var3 = m52Var4.f28894a;
                                        int i38 = u82.f32873a;
                                        i17 = size2;
                                        m52Var4.f28900g[i37] = sf1Var4.x();
                                        long[] jArr2 = m52Var4.f28899f;
                                        int i39 = i34;
                                        long j7 = m52Var4.f28895b;
                                        jArr2[i37] = j7;
                                        if ((h5 & 1) != 0) {
                                            jArr2[i37] = j7 + sf1Var4.h();
                                        }
                                        int i40 = (h5 & 4) != 0 ? i35 : 0;
                                        int i41 = c00Var3.f23992d;
                                        if (i40 != 0) {
                                            i41 = sf1Var4.h();
                                        }
                                        int i42 = i40;
                                        int i43 = (h5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? i35 : 0;
                                        int i44 = (h5 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? i35 : 0;
                                        int i45 = (h5 & 1024) != 0 ? i35 : 0;
                                        int i46 = (h5 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 ? i35 : 0;
                                        int i47 = i45;
                                        long[] jArr3 = k52Var.f28068h;
                                        int i48 = i41;
                                        if (jArr3 != null && jArr3.length == i35 && jArr3[0] == 0) {
                                            j6 = k52Var.f28069i[0];
                                        }
                                        int[] iArr = m52Var4.f28901h;
                                        long[] jArr4 = m52Var4.f28902i;
                                        boolean[] zArr = m52Var4.f28903j;
                                        int i49 = i39 + m52Var4.f28900g[i37];
                                        i18 = size;
                                        i19 = i27;
                                        long j8 = k52Var.f28063c;
                                        long j9 = m52Var4.f28909p;
                                        int i50 = i39;
                                        while (i50 < i49) {
                                            if (i43 != 0) {
                                                i20 = i50;
                                                i21 = sf1Var4.h();
                                            } else {
                                                i20 = i50;
                                                i21 = c00Var3.f23990b;
                                            }
                                            int i51 = i49;
                                            if (i21 < 0) {
                                                throw wf1.a("Unexpected negative value: " + i21, (Exception) null);
                                            }
                                            if (i44 != 0) {
                                                jArr = jArr4;
                                                i22 = sf1Var4.h();
                                            } else {
                                                jArr = jArr4;
                                                i22 = c00Var3.f23991c;
                                            }
                                            if (i22 < 0) {
                                                throw wf1.a("Unexpected negative value: " + i22, (Exception) null);
                                            }
                                            if (i47 != 0) {
                                                i23 = sf1Var4.h();
                                            } else {
                                                i23 = (i20 != 0 || i42 == 0) ? c00Var3.f23992d : i48;
                                            }
                                            if (i46 != 0) {
                                                c00Var = c00Var3;
                                                i24 = sf1Var4.h();
                                            } else {
                                                c00Var = c00Var3;
                                                i24 = 0;
                                            }
                                            sf1 sf1Var5 = sf1Var4;
                                            int i52 = i36;
                                            long a4 = u82.a((i24 + j9) - j6, 1000000L, j8);
                                            jArr[i20] = a4;
                                            if (!m52Var4.f28910q) {
                                                jArr[i20] = a4 + bVar.f25226d.f30684h;
                                            }
                                            iArr[i20] = i22;
                                            zArr[i20] = ((i23 >> 16) & 1) == 0;
                                            j9 += i21;
                                            i50 = i20 + 1;
                                            i49 = i51;
                                            jArr4 = jArr;
                                            c00Var3 = c00Var;
                                            i36 = i52;
                                            sf1Var4 = sf1Var5;
                                        }
                                        m52Var4.f28909p = j9;
                                        i34 = i49;
                                        i33 = i36;
                                    } else {
                                        arrayList = arrayList2;
                                        i16 = i32;
                                        i17 = size2;
                                        i18 = size;
                                        i19 = i27;
                                    }
                                    i32 = i16 + 1;
                                    arrayList2 = arrayList;
                                    size2 = i17;
                                    size = i18;
                                    i27 = i19;
                                    i14 = 1953658222;
                                    i35 = 1;
                                }
                                i6 = size;
                                i7 = i27;
                                k52 k52Var2 = bVar.f25226d.f30677a;
                                c00 c00Var4 = m52Var2.f28894a;
                                c00Var4.getClass();
                                l52 a5 = k52Var2.a(c00Var4.f23989a);
                                AbstractC2346xg.b c6 = aVar.c(1935763834);
                                if (c6 != null) {
                                    a5.getClass();
                                    sf1 sf1Var6 = c6.f34556b;
                                    int i53 = a5.f28429d;
                                    sf1Var6.e(8);
                                    if ((sf1Var6.h() & 1) == 1) {
                                        sf1Var6.f(8);
                                    }
                                    int t4 = sf1Var6.t();
                                    int x5 = sf1Var6.x();
                                    if (x5 > m52Var2.f28898e) {
                                        throw wf1.a("Saiz sample count " + x5 + " is greater than fragment sample count" + m52Var2.f28898e, (Exception) null);
                                    }
                                    if (t4 == 0) {
                                        boolean[] zArr2 = m52Var2.f28905l;
                                        i15 = 0;
                                        for (int i54 = 0; i54 < x5; i54++) {
                                            int t5 = sf1Var6.t();
                                            i15 += t5;
                                            zArr2[i54] = t5 > i53;
                                        }
                                        z6 = false;
                                    } else {
                                        boolean z10 = t4 > i53;
                                        i15 = t4 * x5;
                                        z6 = false;
                                        Arrays.fill(m52Var2.f28905l, 0, x5, z10);
                                    }
                                    Arrays.fill(m52Var2.f28905l, x5, m52Var2.f28898e, z6);
                                    if (i15 > 0) {
                                        m52Var2.f28907n.c(i15);
                                        m52Var2.f28904k = true;
                                        m52Var2.f28908o = true;
                                    }
                                }
                                AbstractC2346xg.b c7 = aVar.c(1935763823);
                                if (c7 != null) {
                                    sf1 sf1Var7 = c7.f34556b;
                                    sf1Var7.e(8);
                                    int h6 = sf1Var7.h();
                                    if ((h6 & 1) == 1) {
                                        sf1Var7.f(8);
                                    }
                                    int x6 = sf1Var7.x();
                                    if (x6 != 1) {
                                        throw wf1.a("Unexpected saio entry count: " + x6, (Exception) null);
                                    }
                                    m52Var2.f28896c += ((h6 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? sf1Var7.v() : sf1Var7.y();
                                }
                                AbstractC2346xg.b c8 = aVar.c(1936027235);
                                if (c8 != null) {
                                    a(c8.f34556b, 0, m52Var2);
                                }
                                String str = a5 != null ? a5.f28427b : null;
                                sf1 sf1Var8 = null;
                                sf1 sf1Var9 = null;
                                for (int i55 = 0; i55 < aVar.f34554c.size(); i55++) {
                                    AbstractC2346xg.b bVar4 = (AbstractC2346xg.b) aVar.f34554c.get(i55);
                                    sf1 sf1Var10 = bVar4.f34556b;
                                    int i56 = bVar4.f34552a;
                                    if (i56 == 1935828848) {
                                        sf1Var10.e(12);
                                        if (sf1Var10.h() == 1936025959) {
                                            sf1Var8 = sf1Var10;
                                        }
                                    } else if (i56 == 1936158820) {
                                        sf1Var10.e(12);
                                        if (sf1Var10.h() == 1936025959) {
                                            sf1Var9 = sf1Var10;
                                        }
                                    }
                                }
                                if (sf1Var8 != null && sf1Var9 != null) {
                                    sf1Var8.e(8);
                                    int h7 = (sf1Var8.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    int i57 = i11;
                                    sf1Var8.f(i57);
                                    if (h7 == 1) {
                                        sf1Var8.f(i57);
                                    }
                                    if (sf1Var8.h() == 1) {
                                        sf1Var9.e(8);
                                        int h8 = (sf1Var9.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                        sf1Var9.f(i57);
                                        if (h8 == 1) {
                                            if (sf1Var9.v() == 0) {
                                                throw wf1.a("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (h8 >= i8) {
                                            sf1Var9.f(i57);
                                        }
                                        if (sf1Var9.v() == 1) {
                                            sf1Var9.f(1);
                                            int t6 = sf1Var9.t();
                                            int i58 = (t6 & 240) >> 4;
                                            int i59 = t6 & 15;
                                            boolean z11 = sf1Var9.t() == 1;
                                            if (z11) {
                                                int t7 = sf1Var9.t();
                                                byte[] bArr3 = new byte[16];
                                                sf1Var9.a(bArr3, 0, 16);
                                                if (t7 == 0) {
                                                    int t8 = sf1Var9.t();
                                                    byte[] bArr4 = new byte[t8];
                                                    sf1Var9.a(bArr4, 0, t8);
                                                    bArr = bArr4;
                                                } else {
                                                    bArr = null;
                                                }
                                                m52Var2.f28904k = true;
                                                m52Var2.f28906m = new l52(z11, str, t7, bArr3, i58, i59, bArr);
                                            }
                                        } else {
                                            throw wf1.a("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw wf1.a("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size3 = aVar.f34554c.size();
                                for (int i60 = 0; i60 < size3; i60++) {
                                    AbstractC2346xg.b bVar5 = (AbstractC2346xg.b) aVar.f34554c.get(i60);
                                    if (bVar5.f34552a == 1970628964) {
                                        sf1 sf1Var11 = bVar5.f34556b;
                                        sf1Var11.e(8);
                                        sf1Var11.a(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, f25187F)) {
                                            a(sf1Var11, 16, m52Var2);
                                        }
                                    }
                                }
                                i5 = 8;
                            }
                        } else {
                            i5 = i25;
                            boolean z12 = z7 ? 1 : 0;
                            sparseArray = sparseArray2;
                            i6 = size;
                            i7 = i27;
                        }
                        i27 = i7 + 1;
                        i25 = i5;
                        sparseArray2 = sparseArray;
                        size = i6;
                        z7 = true;
                    }
                    i4 = i25;
                    u30 a6 = a(pop.f34554c);
                    if (a6 != null) {
                        int size4 = this.f25195b.size();
                        for (int i61 = 0; i61 < size4; i61++) {
                            b valueAt = this.f25195b.valueAt(i61);
                            k52 k52Var3 = valueAt.f25226d.f30677a;
                            c00 c00Var5 = valueAt.f25224b.f28894a;
                            int i62 = u82.f32873a;
                            l52 a7 = k52Var3.a(c00Var5.f23989a);
                            valueAt.f25223a.a(valueAt.f25226d.f30677a.f28066f.a().a(a6.a(a7 != null ? a7.f28427b : null)).a());
                        }
                    }
                    if (this.f25213t != -9223372036854775807L) {
                        int size5 = this.f25195b.size();
                        for (int i63 = 0; i63 < size5; i63++) {
                            b valueAt2 = this.f25195b.valueAt(i63);
                            long j10 = this.f25213t;
                            int i64 = valueAt2.f25228f;
                            while (true) {
                                m52 m52Var5 = valueAt2.f25224b;
                                if (i64 < m52Var5.f28898e && m52Var5.f28902i[i64] < j10) {
                                    if (m52Var5.f28903j[i64]) {
                                        valueAt2.f25231i = i64;
                                    }
                                    i64++;
                                }
                            }
                        }
                        z4 = true;
                        this.f25213t = -9223372036854775807L;
                    } else {
                        z4 = true;
                    }
                } else {
                    i4 = i25;
                    z4 = z7 ? 1 : 0;
                    if (!this.f25203j.isEmpty()) {
                        this.f25203j.peek().f34555d.add(pop);
                    }
                }
                i25 = i4;
                z7 = z4;
            }
        }
        this.f25206m = 0;
        this.f25209p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0052, code lost:
    
        if (r6.f25230h != r6.f25224b.f28897d) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00c9, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00cc, code lost:
    
        if (r28.f25206m != 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00d2, code lost:
    
        if (r3.f25234l != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00d4, code lost:
    
        r4 = r3.f25226d.f30680d[r3.f25228f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00e5, code lost:
    
        r28.f25217x = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x00eb, code lost:
    
        if (r3.f25228f >= r3.f25231i) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x00ed, code lost:
    
        ((com.yandex.mobile.ads.impl.lz) r1).a(r4);
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x00f6, code lost:
    
        if (r1 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x00f9, code lost:
    
        r4 = r3.f25224b.f28907n;
        r1 = r1.f28429d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x00ff, code lost:
    
        if (r1 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0101, code lost:
    
        r4.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0104, code lost:
    
        r1 = r3.f25224b;
        r6 = r3.f25228f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x010a, code lost:
    
        if (r1.f28904k == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0110, code lost:
    
        if (r1.f28905l[r6] == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0112, code lost:
    
        r4.f(r4.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x011a, code lost:
    
        r3.f25228f += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0123, code lost:
    
        if (r3.f25234l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0126, code lost:
    
        r1 = r3.f25229g + r2;
        r3.f25229g = r1;
        r4 = r3.f25224b.f28900g;
        r5 = r3.f25230h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0133, code lost:
    
        if (r1 != r4[r5]) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0135, code lost:
    
        r3.f25230h = r5 + r2;
        r3.f25229g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x013c, code lost:
    
        r28.f25206m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x013a, code lost:
    
        r28.f25216w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0147, code lost:
    
        if (r3.f25226d.f30677a.f28067g != r2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0149, code lost:
    
        r28.f25217x = r4 - 8;
        ((com.yandex.mobile.ads.impl.lz) r1).a(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0163, code lost:
    
        if ("audio/ac4".equals(r3.f25226d.f30677a.f28066f.f34991m) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0165, code lost:
    
        r28.f25218y = r3.a(r28.f25217x, 7);
        com.yandex.mobile.ads.impl.C2214s.a(r28.f25217x, r28.f25200g);
        r3.f25223a.a(7, r28.f25200g);
        r28.f25218y += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x018a, code lost:
    
        r28.f25217x += r28.f25218y;
        r28.f25206m = 4;
        r28.f25219z = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0182, code lost:
    
        r28.f25218y = r3.a(r28.f25217x, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00dd, code lost:
    
        r4 = r3.f25224b.f28901h[r3.f25228f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0196, code lost:
    
        r4 = r3.f25226d;
        r6 = r4.f30677a;
        r7 = r3.f25223a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01a0, code lost:
    
        if (r3.f25234l != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01a2, code lost:
    
        r10 = r4.f30682f[r3.f25228f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01b3, code lost:
    
        if (r6.f28070j == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01b5, code lost:
    
        r4 = r28.f25197d.c();
        r4[0] = 0;
        r4[r2] = 0;
        r4[r30] = 0;
        r13 = r6.f28070j;
        r14 = r13 + 1;
        r13 = 4 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01cd, code lost:
    
        if (r28.f25218y >= r28.f25217x) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x01cf, code lost:
    
        r12 = r28.f25219z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01d3, code lost:
    
        if (r12 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x01d5, code lost:
    
        ((com.yandex.mobile.ads.impl.lz) r1).a(r4, r13, r14, r9);
        r28.f25197d.e(r9);
        r12 = r28.f25197d.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x01e6, code lost:
    
        if (r12 < r2) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x01e8, code lost:
    
        r28.f25219z = r12 - r2;
        r28.f25196c.e(r9);
        r7.a(4, r28.f25196c);
        r7.a(r2, r28.f25197d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x01fe, code lost:
    
        if (r28.f25192D.length <= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0200, code lost:
    
        r12 = r6.f28066f.f34991m;
        r18 = r4[4];
        r9 = com.yandex.mobile.ads.impl.s31.f31556a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x020e, code lost:
    
        if ("video/avc".equals(r12) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0212, code lost:
    
        if ((r18 & 31) == r5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0221, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0224, code lost:
    
        r28.f25189A = r9;
        r28.f25218y += 5;
        r28.f25217x += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0231, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0218, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x021f, code lost:
    
        if (((r18 & 126) >> r2) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0223, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x023a, code lost:
    
        throw com.yandex.mobile.ads.impl.wf1.a("Invalid NAL length", (java.lang.Exception) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x023d, code lost:
    
        if (r28.f25189A == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x023f, code lost:
    
        r28.f25198e.c(r12);
        r25 = r2;
        ((com.yandex.mobile.ads.impl.lz) r1).a(r28.f25198e.c(), 0, r28.f25219z, false);
        r7.a(r28.f25219z, r28.f25198e);
        r2 = r28.f25219z;
        r5 = com.yandex.mobile.ads.impl.s31.a(r28.f25198e.e(), r28.f25198e.c());
        r28.f25198e.e("video/hevc".equals(r6.f28066f.f34991m) ? 1 : 0);
        r28.f25198e.d(r5);
        com.yandex.mobile.ads.impl.mn.a(r10, r28.f25198e, r28.f25192D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0290, code lost:
    
        r28.f25218y += r2;
        r28.f25219z -= r2;
        r2 = r25;
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0288, code lost:
    
        r25 = r2;
        r2 = r7.b(r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x029e, code lost:
    
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x02b9, code lost:
    
        if (r3.f25234l != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x02bb, code lost:
    
        r1 = r3.f25226d.f30683g[r3.f25228f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x02d6, code lost:
    
        if (r3.a() == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x02d8, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x02db, code lost:
    
        r21 = r1;
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x02e1, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x02e3, code lost:
    
        r24 = r1.f28428c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x02ea, code lost:
    
        r19 = r10;
        r7.a(r19, r21, r28.f25217x, 0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x02fd, code lost:
    
        if (r28.f25204k.isEmpty() != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x02ff, code lost:
    
        r1 = r28.f25204k.removeFirst();
        r28.f25212s -= r1.f25222c;
        r4 = r1.f25220a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0312, code lost:
    
        if (r1.f25221b == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0314, code lost:
    
        r4 = r4 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0316, code lost:
    
        r10 = r4;
        r2 = r28.f25191C;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x031b, code lost:
    
        if (r5 >= r4) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x031d, code lost:
    
        r2[r5].a(r10, 1, r1.f25222c, r28.f25212s, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x032b, code lost:
    
        r3.f25228f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0335, code lost:
    
        if (r3.f25234l != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0337, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0350, code lost:
    
        r28.f25216w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0356, code lost:
    
        r28.f25206m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0358, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0339, code lost:
    
        r1 = r3.f25229g + 1;
        r3.f25229g = r1;
        r2 = r3.f25224b.f28900g;
        r4 = r3.f25230h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0347, code lost:
    
        if (r1 != r2[r4]) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0349, code lost:
    
        r3.f25230h = r4 + 1;
        r2 = 0;
        r3.f25229g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0354, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x02e8, code lost:
    
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x02cc, code lost:
    
        if (r3.f25224b.f28903j[r3.f25228f] == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x02ce, code lost:
    
        r1 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x02d1, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x02a1, code lost:
    
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x02a3, code lost:
    
        r2 = r28.f25218y;
        r4 = r28.f25217x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x02a7, code lost:
    
        if (r2 >= r4) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x02a9, code lost:
    
        r28.f25218y += r7.b(r1, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x01a9, code lost:
    
        r10 = r3.f25224b.f28902i[r3.f25228f];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v25 */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q70 q70Var, hj1 hj1Var) {
        long j4;
        long j5;
        long v4;
        String str;
        String str2;
        long j6;
        long y4;
        long y5;
        char c4;
        int i4;
        long j7;
        long j8;
        int i5;
        loop0: while (true) {
            q70 q70Var2 = q70Var;
            int i6 = 1;
            while (true) {
                int i7 = this.f25206m;
                char c5 = 2;
                ?? r9 = 0;
                if (i7 == 0) {
                    if (this.f25209p == 0) {
                        if (!((lz) q70Var).a(this.f25202i.c(), 0, 8, true)) {
                            return -1;
                        }
                        this.f25209p = 8;
                        this.f25202i.e(0);
                        this.f25208o = this.f25202i.v();
                        this.f25207n = this.f25202i.h();
                    }
                    long j9 = this.f25208o;
                    if (j9 == 1) {
                        ((lz) q70Var).a(this.f25202i.c(), 8, 8, false);
                        this.f25209p += 8;
                        this.f25208o = this.f25202i.y();
                    } else if (j9 == 0) {
                        lz lzVar = (lz) q70Var;
                        long b4 = lzVar.b();
                        if (b4 == -1 && !this.f25203j.isEmpty()) {
                            b4 = this.f25203j.peek().f34553b;
                        }
                        if (b4 != -1) {
                            this.f25208o = (b4 - lzVar.a()) + this.f25209p;
                        }
                    }
                    if (this.f25208o >= this.f25209p) {
                        lz lzVar2 = (lz) q70Var;
                        long a4 = lzVar2.a() - this.f25209p;
                        int i8 = this.f25207n;
                        if ((i8 == 1836019558 || i8 == 1835295092) && !this.f25193E) {
                            this.f25190B.a(new tw1.b(this.f25214u, a4));
                            this.f25193E = true;
                        }
                        if (this.f25207n == 1836019558) {
                            int size = this.f25195b.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                m52 m52Var = this.f25195b.valueAt(i9).f25224b;
                                m52Var.getClass();
                                m52Var.f28896c = a4;
                                m52Var.f28895b = a4;
                            }
                        }
                        int i10 = this.f25207n;
                        if (i10 == 1835295092) {
                            this.f25216w = null;
                            this.f25211r = a4 + this.f25208o;
                            this.f25206m = 2;
                            break;
                        }
                        if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227) {
                            i5 = 1;
                            long a5 = (lzVar2.a() + this.f25208o) - 8;
                            this.f25203j.push(new AbstractC2346xg.a(this.f25207n, a5));
                            if (this.f25208o == this.f25209p) {
                                a(a5);
                            } else {
                                this.f25206m = 0;
                                this.f25209p = 0;
                            }
                        } else if (i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783) {
                            if (this.f25209p == 8) {
                                long j10 = this.f25208o;
                                if (j10 <= 2147483647L) {
                                    sf1 sf1Var = new sf1((int) j10);
                                    System.arraycopy(this.f25202i.c(), 0, sf1Var.c(), 0, 8);
                                    this.f25210q = sf1Var;
                                    i5 = 1;
                                    this.f25206m = 1;
                                } else {
                                    throw wf1.a("Leaf atom with length > 2147483647 (unsupported).");
                                }
                            } else {
                                throw wf1.a("Leaf atom defines extended atom size (unsupported).");
                            }
                        } else if (this.f25208o <= 2147483647L) {
                            this.f25210q = null;
                            i5 = 1;
                            this.f25206m = 1;
                        } else {
                            throw wf1.a("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        q70Var2 = q70Var;
                        i6 = i5;
                    } else {
                        throw wf1.a("Atom size less than header length (unsupported).");
                    }
                } else if (i7 != i6) {
                    long j11 = Long.MAX_VALUE;
                    if (i7 != 2) {
                        b bVar = this.f25216w;
                        if (bVar != null) {
                            c4 = 2;
                            i4 = 8;
                            break loop0;
                        }
                        SparseArray<b> sparseArray = this.f25195b;
                        int size2 = sparseArray.size();
                        long j12 = Long.MAX_VALUE;
                        b bVar2 = null;
                        int i11 = 0;
                        while (i11 < size2) {
                            char c6 = c5;
                            b valueAt = sparseArray.valueAt(i11);
                            boolean z4 = valueAt.f25234l;
                            if (!z4 && valueAt.f25228f == valueAt.f25226d.f30678b) {
                                i11 += i6;
                                c5 = c6;
                            }
                            if (!z4) {
                                j8 = valueAt.f25226d.f30679c[valueAt.f25228f];
                            } else {
                                j8 = valueAt.f25224b.f28899f[valueAt.f25230h];
                            }
                            if (j8 < j12) {
                                bVar2 = valueAt;
                                j12 = j8;
                            }
                            i11 += i6;
                            c5 = c6;
                        }
                        c4 = c5;
                        i4 = 8;
                        if (bVar2 != null) {
                            if (!bVar2.f25234l) {
                                j7 = bVar2.f25226d.f30679c[bVar2.f25228f];
                            } else {
                                j7 = bVar2.f25224b.f28899f[bVar2.f25230h];
                            }
                            lz lzVar3 = (lz) q70Var2;
                            int a6 = (int) (j7 - lzVar3.a());
                            if (a6 < 0) {
                                ms0.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                a6 = 0;
                            }
                            lzVar3.a(a6);
                            this.f25216w = bVar2;
                            bVar = bVar2;
                        } else {
                            lz lzVar4 = (lz) q70Var2;
                            int a7 = (int) (this.f25211r - lzVar4.a());
                            if (a7 >= 0) {
                                lzVar4.a(a7);
                                this.f25206m = 0;
                                this.f25209p = 0;
                            } else {
                                throw wf1.a("Offset to end of mdat was negative.", (Exception) null);
                            }
                        }
                    } else {
                        int i12 = i6;
                        int size3 = this.f25195b.size();
                        b bVar3 = null;
                        for (int i13 = 0; i13 < size3; i13++) {
                            m52 m52Var2 = this.f25195b.valueAt(i13).f25224b;
                            if (m52Var2.f28908o) {
                                long j13 = m52Var2.f28896c;
                                if (j13 < j11) {
                                    bVar3 = this.f25195b.valueAt(i13);
                                    j11 = j13;
                                }
                            }
                        }
                        if (bVar3 == null) {
                            this.f25206m = 3;
                        } else {
                            lz lzVar5 = (lz) q70Var2;
                            int a8 = (int) (j11 - lzVar5.a());
                            if (a8 >= 0) {
                                lzVar5.a(a8);
                                m52 m52Var3 = bVar3.f25224b;
                                lzVar5.a(m52Var3.f28907n.c(), 0, m52Var3.f28907n.e(), false);
                                m52Var3.f28907n.e(0);
                                m52Var3.f28908o = false;
                            } else {
                                throw wf1.a("Offset to encryption data was negative.", (Exception) null);
                            }
                        }
                        i6 = i12;
                    }
                } else {
                    boolean z5 = i6;
                    int i14 = ((int) this.f25208o) - this.f25209p;
                    sf1 sf1Var2 = this.f25210q;
                    if (sf1Var2 != null) {
                        lz lzVar6 = (lz) q70Var2;
                        lzVar6.a(sf1Var2.c(), 8, i14, false);
                        int i15 = this.f25207n;
                        AbstractC2346xg.b bVar4 = new AbstractC2346xg.b(i15, sf1Var2);
                        long a9 = lzVar6.a();
                        if (!this.f25203j.isEmpty()) {
                            this.f25203j.peek().f34554c.add(bVar4);
                        } else if (i15 == 1936286840) {
                            sf1Var2.e(8);
                            int h4 = (sf1Var2.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            sf1Var2.f(4);
                            long v5 = sf1Var2.v();
                            if (h4 == 0) {
                                y4 = sf1Var2.v();
                                y5 = sf1Var2.v();
                            } else {
                                y4 = sf1Var2.y();
                                y5 = sf1Var2.y();
                            }
                            long j14 = y5 + a9;
                            long j15 = y4;
                            long a10 = u82.a(j15, 1000000L, v5);
                            sf1Var2.f(2);
                            int z6 = sf1Var2.z();
                            int[] iArr = new int[z6];
                            long[] jArr = new long[z6];
                            long[] jArr2 = new long[z6];
                            long[] jArr3 = new long[z6];
                            long j16 = a10;
                            int i16 = 0;
                            while (i16 < z6) {
                                int h5 = sf1Var2.h();
                                if ((h5 & Integer.MIN_VALUE) == 0) {
                                    long v6 = sf1Var2.v();
                                    iArr[i16] = h5 & Integer.MAX_VALUE;
                                    jArr[i16] = j14;
                                    jArr3[i16] = j16;
                                    j15 += v6;
                                    j16 = u82.a(j15, 1000000L, v5);
                                    jArr2[i16] = j16 - jArr3[i16];
                                    sf1Var2.f(4);
                                    j14 += iArr[i16];
                                    i16++;
                                    z6 = z6;
                                } else {
                                    throw wf1.a("Unhandled indirect reference", (Exception) null);
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(a10), new vn(iArr, jArr, jArr2, jArr3));
                            this.f25215v = ((Long) create.first).longValue();
                            this.f25190B.a((tw1) create.second);
                            this.f25193E = z5;
                        } else if (i15 == 1701671783 && this.f25191C.length != 0) {
                            sf1Var2.e(8);
                            int h6 = (sf1Var2.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            if (h6 == 0) {
                                String q4 = sf1Var2.q();
                                q4.getClass();
                                String q5 = sf1Var2.q();
                                q5.getClass();
                                long v7 = sf1Var2.v();
                                long a11 = u82.a(sf1Var2.v(), 1000000L, v7);
                                long j17 = this.f25215v;
                                long j18 = j17 != -9223372036854775807L ? j17 + a11 : -9223372036854775807L;
                                long a12 = u82.a(sf1Var2.v(), 1000L, v7);
                                long j19 = j18;
                                j4 = a11;
                                j5 = j19;
                                v4 = sf1Var2.v();
                                str = q4;
                                str2 = q5;
                                j6 = a12;
                            } else if (h6 != 1) {
                                fr0.a("Skipping unsupported emsg version: ", h6, "FragmentedMp4Extractor");
                            } else {
                                long v8 = sf1Var2.v();
                                j5 = u82.a(sf1Var2.y(), 1000000L, v8);
                                long a13 = u82.a(sf1Var2.v(), 1000L, v8);
                                long v9 = sf1Var2.v();
                                String q6 = sf1Var2.q();
                                q6.getClass();
                                String q7 = sf1Var2.q();
                                q7.getClass();
                                v4 = v9;
                                str = q6;
                                str2 = q7;
                                j6 = a13;
                                j4 = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[sf1Var2.a()];
                            sf1Var2.a(bArr, 0, sf1Var2.a());
                            sf1 sf1Var3 = new sf1(this.f25201h.a(new o50(str, str2, j6, v4, bArr)));
                            int a14 = sf1Var3.a();
                            for (p52 p52Var : this.f25191C) {
                                sf1Var3.e(0);
                                p52Var.a(a14, sf1Var3);
                            }
                            if (j5 == -9223372036854775807L) {
                                this.f25204k.addLast(new a(a14, j4, true));
                                this.f25212s += a14;
                            } else if (!this.f25204k.isEmpty()) {
                                this.f25204k.addLast(new a(a14, j5, false));
                                this.f25212s += a14;
                            } else {
                                for (p52 p52Var2 : this.f25191C) {
                                    p52Var2.a(j5, 1, a14, 0, null);
                                }
                            }
                        }
                    } else {
                        ((lz) q70Var).a(i14);
                    }
                    a(((lz) q70Var).a());
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        int size = this.f25195b.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f25195b.valueAt(i4).b();
        }
        this.f25204k.clear();
        this.f25212s = 0;
        this.f25213t = j5;
        this.f25203j.clear();
        this.f25206m = 0;
        this.f25209p = 0;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        return i02.a((lz) q70Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p70[] a() {
        return new p70[]{new ec0(0)};
    }
}
