package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.yb0;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.wh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2324wh implements p70 {

    /* renamed from: c, reason: collision with root package name */
    private int f34048c;

    /* renamed from: e, reason: collision with root package name */
    private C2347xh f34050e;

    /* renamed from: h, reason: collision with root package name */
    private long f34053h;

    /* renamed from: i, reason: collision with root package name */
    private wn f34054i;

    /* renamed from: m, reason: collision with root package name */
    private int f34058m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f34059n;

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f34046a = new sf1(12);

    /* renamed from: b, reason: collision with root package name */
    private final b f34047b = new b();

    /* renamed from: d, reason: collision with root package name */
    private r70 f34049d = new f40();

    /* renamed from: g, reason: collision with root package name */
    private wn[] f34052g = new wn[0];

    /* renamed from: k, reason: collision with root package name */
    private long f34056k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f34057l = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f34055j = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f34051f = -9223372036854775807L;

    /* renamed from: com.yandex.mobile.ads.impl.wh$a */
    private class a implements tw1 {

        /* renamed from: a, reason: collision with root package name */
        private final long f34060a;

        public a(long j4) {
            this.f34060a = j4;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            return this.f34060a;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final tw1.a b(long j4) {
            tw1.a b4 = C2324wh.this.f34052g[0].b(j4);
            int i4 = 1;
            while (true) {
                wn[] wnVarArr = C2324wh.this.f34052g;
                if (i4 >= wnVarArr.length) {
                    return b4;
                }
                tw1.a b5 = wnVarArr[i4].b(j4);
                if (b5.f32717a.f33816b < b4.f32717a.f33816b) {
                    b4 = b5;
                }
                i4++;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wh$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f34062a;

        /* renamed from: b, reason: collision with root package name */
        public int f34063b;

        /* renamed from: c, reason: collision with root package name */
        public int f34064c;

        private b() {
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f34048c = 0;
        this.f34049d = r70Var;
        this.f34053h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q70 q70Var, hj1 hj1Var) {
        boolean z4;
        wn wnVar;
        wn wnVar2;
        if (this.f34053h != -1) {
            lz lzVar = (lz) q70Var;
            long a4 = lzVar.a();
            long j4 = this.f34053h;
            if (j4 >= a4 && j4 <= 262144 + a4) {
                lzVar.a((int) (j4 - a4));
            } else {
                hj1Var.f26771a = j4;
                z4 = true;
                this.f34053h = -1L;
                if (!z4) {
                    return 1;
                }
                wn wnVar3 = null;
                switch (this.f34048c) {
                    case 0:
                        if (a(q70Var)) {
                            ((lz) q70Var).a(12);
                            this.f34048c = 1;
                            return 0;
                        }
                        throw wf1.a("AVI Header List not found", (Exception) null);
                    case 1:
                        ((lz) q70Var).a(this.f34046a.c(), 0, 12, false);
                        this.f34046a.e(0);
                        b bVar = this.f34047b;
                        sf1 sf1Var = this.f34046a;
                        bVar.getClass();
                        bVar.f34062a = sf1Var.k();
                        bVar.f34063b = sf1Var.k();
                        bVar.f34064c = 0;
                        if (bVar.f34062a == 1414744396) {
                            bVar.f34064c = sf1Var.k();
                            b bVar2 = this.f34047b;
                            if (bVar2.f34064c == 1819436136) {
                                this.f34055j = bVar2.f34063b;
                                this.f34048c = 2;
                                return 0;
                            }
                            throw wf1.a("hdrl expected, found: " + this.f34047b.f34064c, (Exception) null);
                        }
                        throw wf1.a("LIST expected, found: " + bVar.f34062a, (Exception) null);
                    case 2:
                        int i4 = this.f34055j - 4;
                        sf1 sf1Var2 = new sf1(i4);
                        ((lz) q70Var).a(sf1Var2.c(), 0, i4, false);
                        gr0 a5 = gr0.a(1819436136, sf1Var2);
                        if (a5.getType() == 1819436136) {
                            C2347xh c2347xh = (C2347xh) a5.a(C2347xh.class);
                            if (c2347xh != null) {
                                this.f34050e = c2347xh;
                                this.f34051f = c2347xh.f34562c * c2347xh.f34560a;
                                ArrayList arrayList = new ArrayList();
                                y72<InterfaceC2301vh> listIterator = a5.f26277a.listIterator(0);
                                int i5 = 0;
                                while (listIterator.hasNext()) {
                                    InterfaceC2301vh next = listIterator.next();
                                    if (next.getType() == 1819440243) {
                                        gr0 gr0Var = (gr0) next;
                                        int i6 = i5 + 1;
                                        C2370yh c2370yh = (C2370yh) gr0Var.a(C2370yh.class);
                                        k22 k22Var = (k22) gr0Var.a(k22.class);
                                        if (c2370yh == null) {
                                            ms0.d("AviExtractor", "Missing Stream Header");
                                        } else if (k22Var == null) {
                                            ms0.d("AviExtractor", "Missing Stream Format");
                                        } else {
                                            long a6 = u82.a(c2370yh.f35135d, c2370yh.f35133b * 1000000, c2370yh.f35134c);
                                            yb0 yb0Var = k22Var.f27991a;
                                            yb0.a a7 = yb0Var.a();
                                            a7.g(i5);
                                            int i7 = c2370yh.f35136e;
                                            if (i7 != 0) {
                                                a7.h(i7);
                                            }
                                            m22 m22Var = (m22) gr0Var.a(m22.class);
                                            if (m22Var != null) {
                                                a7.c(m22Var.f28836a);
                                            }
                                            int c4 = i01.c(yb0Var.f34991m);
                                            if (c4 == 1 || c4 == 2) {
                                                p52 a8 = this.f34049d.a(i5, c4);
                                                a8.a(a7.a());
                                                wnVar = new wn(i5, c4, a6, c2370yh.f35135d, a8);
                                                this.f34051f = a6;
                                                if (wnVar != null) {
                                                    arrayList.add(wnVar);
                                                }
                                                i5 = i6;
                                            }
                                        }
                                        wnVar = null;
                                        if (wnVar != null) {
                                        }
                                        i5 = i6;
                                    }
                                }
                                this.f34052g = (wn[]) arrayList.toArray(new wn[0]);
                                this.f34049d.a();
                                this.f34048c = 3;
                                return 0;
                            }
                            throw wf1.a("AviHeader not found", (Exception) null);
                        }
                        throw wf1.a("Unexpected header list type " + a5.getType(), (Exception) null);
                    case 3:
                        if (this.f34056k != -1) {
                            long a9 = ((lz) q70Var).a();
                            long j5 = this.f34056k;
                            if (a9 != j5) {
                                this.f34053h = j5;
                                return 0;
                            }
                        }
                        lz lzVar2 = (lz) q70Var;
                        lzVar2.b(this.f34046a.c(), 0, 12, false);
                        lzVar2.c();
                        this.f34046a.e(0);
                        b bVar3 = this.f34047b;
                        sf1 sf1Var3 = this.f34046a;
                        bVar3.getClass();
                        bVar3.f34062a = sf1Var3.k();
                        bVar3.f34063b = sf1Var3.k();
                        bVar3.f34064c = 0;
                        int k4 = this.f34046a.k();
                        int i8 = this.f34047b.f34062a;
                        if (i8 == 1179011410) {
                            lzVar2.a(12);
                            return 0;
                        }
                        if (i8 == 1414744396 && k4 == 1769369453) {
                            long a10 = lzVar2.a();
                            this.f34056k = a10;
                            this.f34057l = a10 + this.f34047b.f34063b + 8;
                            if (!this.f34059n) {
                                C2347xh c2347xh2 = this.f34050e;
                                c2347xh2.getClass();
                                if ((c2347xh2.f34561b & 16) == 16) {
                                    this.f34048c = 4;
                                    this.f34053h = this.f34057l;
                                    return 0;
                                }
                                this.f34049d.a(new tw1.b(this.f34051f, 0L));
                                this.f34059n = true;
                            }
                            this.f34053h = lzVar2.a() + 12;
                            this.f34048c = 6;
                            return 0;
                        }
                        this.f34053h = lzVar2.a() + this.f34047b.f34063b + 8;
                        return 0;
                    case 4:
                        lz lzVar3 = (lz) q70Var;
                        lzVar3.a(this.f34046a.c(), 0, 8, false);
                        this.f34046a.e(0);
                        int k5 = this.f34046a.k();
                        int k6 = this.f34046a.k();
                        if (k5 == 829973609) {
                            this.f34048c = 5;
                            this.f34058m = k6;
                        } else {
                            this.f34053h = lzVar3.a() + k6;
                        }
                        return 0;
                    case 5:
                        sf1 sf1Var4 = new sf1(this.f34058m);
                        ((lz) q70Var).a(sf1Var4.c(), 0, this.f34058m, false);
                        if (sf1Var4.a() >= 16) {
                            int d4 = sf1Var4.d();
                            sf1Var4.f(8);
                            long k7 = sf1Var4.k();
                            long j6 = this.f34056k;
                            r11 = k7 <= j6 ? j6 + 8 : 0L;
                            sf1Var4.e(d4);
                        }
                        while (sf1Var4.a() >= 16) {
                            int k8 = sf1Var4.k();
                            int k9 = sf1Var4.k();
                            long k10 = sf1Var4.k() + r11;
                            sf1Var4.k();
                            wn[] wnVarArr = this.f34052g;
                            int length = wnVarArr.length;
                            int i9 = 0;
                            while (true) {
                                if (i9 < length) {
                                    wnVar2 = wnVarArr[i9];
                                    if (!wnVar2.a(k8)) {
                                        i9++;
                                    }
                                } else {
                                    wnVar2 = null;
                                }
                            }
                            if (wnVar2 != null) {
                                if ((k9 & 16) == 16) {
                                    wnVar2.a(k10);
                                }
                                wnVar2.b();
                            }
                        }
                        for (wn wnVar4 : this.f34052g) {
                            wnVar4.a();
                        }
                        this.f34059n = true;
                        this.f34049d.a(new a(this.f34051f));
                        this.f34048c = 6;
                        this.f34053h = this.f34056k;
                        return 0;
                    case 6:
                        lz lzVar4 = (lz) q70Var;
                        if (lzVar4.a() >= this.f34057l) {
                            return -1;
                        }
                        wn wnVar5 = this.f34054i;
                        if (wnVar5 != null) {
                            if (wnVar5.a(lzVar4)) {
                                this.f34054i = null;
                            }
                        } else {
                            if ((lzVar4.a() & 1) == 1) {
                                lzVar4.a(1);
                            }
                            lzVar4.b(this.f34046a.c(), 0, 12, false);
                            this.f34046a.e(0);
                            int k11 = this.f34046a.k();
                            if (k11 == 1414744396) {
                                this.f34046a.e(8);
                                lzVar4.a(this.f34046a.k() == 1769369453 ? 12 : 8);
                                lzVar4.c();
                                return 0;
                            }
                            int k12 = this.f34046a.k();
                            if (k11 == 1263424842) {
                                this.f34053h = lzVar4.a() + k12 + 8;
                                return 0;
                            }
                            lzVar4.a(8);
                            lzVar4.c();
                            wn[] wnVarArr2 = this.f34052g;
                            int length2 = wnVarArr2.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 < length2) {
                                    wn wnVar6 = wnVarArr2[i10];
                                    if (wnVar6.a(k11)) {
                                        wnVar3 = wnVar6;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                            if (wnVar3 == null) {
                                this.f34053h = lzVar4.a() + k12;
                                return 0;
                            }
                            wnVar3.b(k12);
                            this.f34054i = wnVar3;
                        }
                        return 0;
                    default:
                        throw new AssertionError();
                }
            }
        }
        z4 = false;
        this.f34053h = -1L;
        if (!z4) {
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        this.f34053h = -1L;
        this.f34054i = null;
        for (wn wnVar : this.f34052g) {
            wnVar.c(j4);
        }
        if (j4 == 0) {
            if (this.f34052g.length == 0) {
                this.f34048c = 0;
                return;
            } else {
                this.f34048c = 3;
                return;
            }
        }
        this.f34048c = 6;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        ((lz) q70Var).b(this.f34046a.c(), 0, 12, false);
        this.f34046a.e(0);
        if (this.f34046a.k() != 1179011410) {
            return false;
        }
        this.f34046a.f(4);
        return this.f34046a.k() == 541677121;
    }
}
