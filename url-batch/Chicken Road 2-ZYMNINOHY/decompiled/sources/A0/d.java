package A0;

import T.C0096n;
import T.C0097o;
import T.F;
import T.G;
import T.r;
import W.AbstractC0108a;
import W.J;
import W.u;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import t0.C1427b;
import y0.n;
import y0.o;
import y0.p;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public final u f12a;

    /* renamed from: b, reason: collision with root package name */
    public final c f13b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14c;

    /* renamed from: d, reason: collision with root package name */
    public final a2.i f15d;

    /* renamed from: e, reason: collision with root package name */
    public int f16e;

    /* renamed from: f, reason: collision with root package name */
    public p f17f;

    /* renamed from: g, reason: collision with root package name */
    public e f18g;

    /* renamed from: h, reason: collision with root package name */
    public long f19h;

    /* renamed from: i, reason: collision with root package name */
    public g[] f20i;

    /* renamed from: j, reason: collision with root package name */
    public long f21j;

    /* renamed from: k, reason: collision with root package name */
    public g f22k;

    /* renamed from: l, reason: collision with root package name */
    public int f23l;

    /* renamed from: m, reason: collision with root package name */
    public long f24m;
    public long n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25p;

    public d(int i4, a2.i iVar) {
        this.f15d = iVar;
        this.f14c = (i4 & 1) == 0;
        this.f12a = new u(12);
        this.f13b = new c();
        this.f17f = new C1427b(7);
        this.f20i = new g[0];
        this.f24m = -1L;
        this.n = -1L;
        this.f23l = -1;
        this.f19h = -9223372036854775807L;
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        this.f21j = -1L;
        this.f22k = null;
        for (g gVar : this.f20i) {
            if (gVar.f45k == 0) {
                gVar.f43i = 0;
            } else {
                gVar.f43i = gVar.n[J.f(gVar.f47m, j4, true)];
            }
        }
        if (j4 != 0) {
            this.f16e = 6;
        } else if (this.f20i.length == 0) {
            this.f16e = 0;
        } else {
            this.f16e = 3;
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        u uVar = this.f12a;
        oVar.E(uVar.f3351a, 0, 12);
        uVar.M(0);
        if (uVar.o() != 1179011410) {
            return false;
        }
        uVar.N(4);
        return uVar.o() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(o oVar, r rVar) {
        boolean z;
        int i4;
        g gVar;
        long j4;
        int i5;
        int i6;
        g gVar2;
        int i7 = 0;
        if (this.f21j != -1) {
            long position = oVar.getPosition();
            long j5 = this.f21j;
            if (j5 < position || j5 > 262144 + position) {
                rVar.f2881a = j5;
                z = true;
                this.f21j = -1L;
                if (!z) {
                    return 1;
                }
                int i8 = this.f16e;
                int i9 = 4;
                g gVar3 = null;
                c cVar = this.f13b;
                int i10 = 2;
                u uVar = this.f12a;
                switch (i8) {
                    case 0:
                        if (!b(oVar)) {
                            throw G.a(null, "AVI Header List not found");
                        }
                        oVar.v(12);
                        this.f16e = 1;
                        return 0;
                    case 1:
                        oVar.readFully(uVar.f3351a, 0, 12);
                        uVar.M(0);
                        cVar.getClass();
                        cVar.f9a = uVar.o();
                        cVar.f10b = uVar.o();
                        cVar.f11c = 0;
                        if (cVar.f9a != 1414744396) {
                            throw G.a(null, "LIST expected, found: " + cVar.f9a);
                        }
                        int o = uVar.o();
                        cVar.f11c = o;
                        if (o == 1819436136) {
                            this.f23l = cVar.f10b;
                            this.f16e = 2;
                            return 0;
                        }
                        throw G.a(null, "hdrl expected, found: " + cVar.f11c);
                    case 2:
                        int i11 = this.f23l - 4;
                        u uVar2 = new u(i11);
                        oVar.readFully(uVar2.f3351a, 0, i11);
                        h b4 = h.b(1819436136, uVar2);
                        int i12 = b4.f49b;
                        if (i12 != 1819436136) {
                            throw G.a(null, "Unexpected header list type " + i12);
                        }
                        e eVar = (e) b4.a(e.class);
                        if (eVar == null) {
                            throw G.a(null, "AviHeader not found");
                        }
                        this.f18g = eVar;
                        this.f19h = eVar.f28c * eVar.f26a;
                        ArrayList arrayList = new ArrayList();
                        v2.G listIterator = b4.f48a.listIterator(0);
                        int i13 = 0;
                        while (listIterator.hasNext()) {
                            a aVar = (a) listIterator.next();
                            if (aVar.getType() == 1819440243) {
                                h hVar = (h) aVar;
                                int i14 = i13 + 1;
                                f fVar = (f) hVar.a(f.class);
                                i iVar = (i) hVar.a(i.class);
                                if (fVar == null) {
                                    AbstractC0108a.s("AviExtractor", "Missing Stream Header");
                                } else if (iVar == null) {
                                    AbstractC0108a.s("AviExtractor", "Missing Stream Format");
                                } else {
                                    i4 = i14;
                                    long j6 = fVar.f31c;
                                    String str = J.f3263a;
                                    long U4 = J.U(fVar.f32d, fVar.f30b * 1000000, j6, RoundingMode.DOWN);
                                    C0097o c0097o = iVar.f50a;
                                    C0096n a3 = c0097o.a();
                                    a3.f2819a = Integer.toString(i13);
                                    int i15 = fVar.f33e;
                                    if (i15 != 0) {
                                        a3.n = i15;
                                    }
                                    j jVar = (j) hVar.a(j.class);
                                    if (jVar != null) {
                                        a3.f2820b = jVar.f51a;
                                    }
                                    int h2 = F.h(c0097o.n);
                                    if (h2 == 1 || h2 == i10) {
                                        y0.F z4 = this.f17f.z(i13, h2);
                                        z4.d(new C0097o(a3));
                                        z4.c(U4);
                                        this.f19h = Math.max(this.f19h, U4);
                                        gVar = new g(i13, fVar, z4);
                                        if (gVar != null) {
                                            arrayList.add(gVar);
                                        }
                                        i13 = i4;
                                    }
                                    gVar = null;
                                    if (gVar != null) {
                                    }
                                    i13 = i4;
                                }
                                i4 = i14;
                                gVar = null;
                                if (gVar != null) {
                                }
                                i13 = i4;
                            }
                            i7 = 0;
                            i10 = 2;
                        }
                        int i16 = i7;
                        this.f20i = (g[]) arrayList.toArray(new g[i16]);
                        this.f17f.r();
                        this.f16e = 3;
                        return i16;
                    case 3:
                        if (this.f24m != -1) {
                            long position2 = oVar.getPosition();
                            long j7 = this.f24m;
                            if (position2 != j7) {
                                this.f21j = j7;
                                return 0;
                            }
                        }
                        oVar.E(uVar.f3351a, 0, 12);
                        oVar.u();
                        uVar.M(0);
                        cVar.getClass();
                        cVar.f9a = uVar.o();
                        cVar.f10b = uVar.o();
                        cVar.f11c = 0;
                        int o4 = uVar.o();
                        int i17 = cVar.f9a;
                        if (i17 == 1179011410) {
                            oVar.v(12);
                            return 0;
                        }
                        if (i17 != 1414744396 || o4 != 1769369453) {
                            this.f21j = oVar.getPosition() + cVar.f10b + 8;
                            return 0;
                        }
                        long position3 = oVar.getPosition();
                        this.f24m = position3;
                        this.n = position3 + cVar.f10b + 8;
                        if (!this.f25p) {
                            e eVar2 = this.f18g;
                            eVar2.getClass();
                            if ((eVar2.f27b & 16) == 16) {
                                this.f16e = 4;
                                this.f21j = this.n;
                                return 0;
                            }
                            this.f17f.x(new b(this.f19h));
                            this.f25p = true;
                        }
                        this.f21j = oVar.getPosition() + 12;
                        this.f16e = 6;
                        return 0;
                    case 4:
                        oVar.readFully(uVar.f3351a, 0, 8);
                        uVar.M(0);
                        int o5 = uVar.o();
                        int o6 = uVar.o();
                        if (o5 != 829973609) {
                            this.f21j = oVar.getPosition() + o6;
                            return 0;
                        }
                        this.f16e = 5;
                        this.o = o6;
                        return 0;
                    case 5:
                        u uVar3 = new u(this.o);
                        oVar.readFully(uVar3.f3351a, 0, this.o);
                        if (uVar3.a() < 16) {
                            j4 = 0;
                        } else {
                            int i18 = uVar3.f3352b;
                            uVar3.N(8);
                            long o7 = uVar3.o();
                            long j8 = this.f24m;
                            j4 = o7 > j8 ? 0L : j8 + 8;
                            uVar3.M(i18);
                        }
                        while (uVar3.a() >= 16) {
                            int o8 = uVar3.o();
                            int o9 = uVar3.o();
                            long o10 = uVar3.o() + j4;
                            uVar3.N(i9);
                            g[] gVarArr = this.f20i;
                            int length = gVarArr.length;
                            while (true) {
                                if (i6 < length) {
                                    gVar2 = gVarArr[i6];
                                    i6 = (gVar2.f37c == o8 || gVar2.f38d == o8) ? 0 : i6 + 1;
                                } else {
                                    gVar2 = null;
                                }
                            }
                            if (gVar2 != null) {
                                boolean z5 = (o9 & 16) == 16;
                                if (gVar2.f46l == -1) {
                                    gVar2.f46l = o10;
                                }
                                if (z5) {
                                    if (gVar2.f45k == gVar2.n.length) {
                                        long[] jArr = gVar2.f47m;
                                        gVar2.f47m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = gVar2.n;
                                        gVar2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = gVar2.f47m;
                                    int i19 = gVar2.f45k;
                                    jArr2[i19] = o10;
                                    gVar2.n[i19] = gVar2.f44j;
                                    gVar2.f45k = i19 + 1;
                                }
                                gVar2.f44j++;
                            }
                            i9 = 4;
                        }
                        for (g gVar4 : this.f20i) {
                            gVar4.f47m = Arrays.copyOf(gVar4.f47m, gVar4.f45k);
                            gVar4.n = Arrays.copyOf(gVar4.n, gVar4.f45k);
                            if ((gVar4.f37c & 1651965952) == 1651965952 && gVar4.f35a.f34f != 0 && (i5 = gVar4.f45k) > 0) {
                                gVar4.f40f = i5;
                            }
                        }
                        this.f25p = true;
                        if (this.f20i.length == 0) {
                            this.f17f.x(new b(this.f19h));
                        } else {
                            this.f17f.x(new b(this, this.f19h, 0));
                        }
                        this.f16e = 6;
                        this.f21j = this.f24m;
                        return 0;
                    case 6:
                        if (oVar.getPosition() >= this.n) {
                            return -1;
                        }
                        g gVar5 = this.f22k;
                        if (gVar5 != null) {
                            int i20 = gVar5.f42h;
                            int g4 = i20 - gVar5.f36b.g(oVar, i20, false);
                            gVar5.f42h = g4;
                            boolean z6 = g4 == 0;
                            if (z6) {
                                if (gVar5.f41g > 0) {
                                    y0.F f4 = gVar5.f36b;
                                    int i21 = gVar5.f43i;
                                    f4.e((gVar5.f39e * i21) / gVar5.f40f, Arrays.binarySearch(gVar5.n, i21) >= 0 ? 1 : 0, gVar5.f41g, 0, null);
                                }
                                gVar5.f43i++;
                            }
                            if (z6) {
                                this.f22k = null;
                            }
                            return 0;
                        }
                        if ((oVar.getPosition() & 1) == 1) {
                            oVar.v(1);
                        }
                        oVar.E(uVar.f3351a, 0, 12);
                        uVar.M(0);
                        int o11 = uVar.o();
                        if (o11 == 1414744396) {
                            uVar.M(8);
                            oVar.v(uVar.o() == 1769369453 ? 12 : 8);
                            oVar.u();
                            return 0;
                        }
                        int o12 = uVar.o();
                        if (o11 == 1263424842) {
                            this.f21j = oVar.getPosition() + o12 + 8;
                            return 0;
                        }
                        oVar.v(8);
                        oVar.u();
                        for (g gVar6 : this.f20i) {
                            if (gVar6.f37c == o11 || gVar6.f38d == o11) {
                                gVar3 = gVar6;
                                if (gVar3 != null) {
                                    this.f21j = oVar.getPosition() + o12;
                                    return 0;
                                }
                                gVar3.f41g = o12;
                                gVar3.f42h = o12;
                                this.f22k = gVar3;
                                return 0;
                            }
                        }
                        if (gVar3 != null) {
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                oVar.v((int) (j5 - position));
            }
        }
        z = false;
        this.f21j = -1L;
        if (!z) {
        }
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f16e = 0;
        if (this.f14c) {
            pVar = new U.b(pVar, this.f15d);
        }
        this.f17f = pVar;
        this.f21j = -1L;
    }

    @Override // y0.n
    public final void release() {
    }
}
