package t0;

import T.C0097o;
import T.U;
import a0.AbstractC0135a;
import java.util.Objects;
import v2.AbstractC1478z;
import v2.I;
import v2.Y;
import v2.Z;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15349e;

    /* renamed from: f, reason: collision with root package name */
    public final l f15350f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15351g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15352h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15353i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15354j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15355k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15356l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15357m;
    public final int n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15358p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15359q;

    /* renamed from: r, reason: collision with root package name */
    public final int f15360r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f15361s;

    /* renamed from: t, reason: collision with root package name */
    public final int f15362t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f15363u;
    public final boolean v;

    /* renamed from: w, reason: collision with root package name */
    public final int f15364w;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0108 A[EDGE_INSN: B:135:0x0108->B:77:0x0108 BREAK  A[LOOP:1: B:69:0x00ed->B:133:0x0105], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(int i4, U u4, int i5, l lVar, int i6, String str, int i7, boolean z) {
        super(i4, u4, i5);
        boolean z4;
        boolean z5;
        int i8;
        int i9;
        int i10;
        int i11;
        C0097o c0097o;
        String str2;
        int i12;
        boolean z6;
        boolean z7;
        int i13;
        C0097o c0097o2;
        int i14;
        int i15;
        float f4;
        int i16;
        C0097o c0097o3;
        int i17;
        int i18;
        int i19;
        this.f15350f = lVar;
        boolean z8 = lVar.f15333x;
        I i20 = lVar.f2740i;
        I i21 = lVar.f2742k;
        int i22 = z8 ? 24 : 16;
        int i23 = 0;
        this.f15361s = false;
        if (z && (((i17 = (c0097o3 = this.f15348d).f2874u) == -1 || i17 <= lVar.f2732a) && ((i18 = c0097o3.v) == -1 || i18 <= lVar.f2733b))) {
            float f5 = c0097o3.f2877y;
            if ((f5 == -1.0f || f5 <= lVar.f2734c) && ((i19 = c0097o3.f2865j) == -1 || i19 <= lVar.f2735d)) {
                z4 = true;
                this.f15349e = z4;
                if (z && (((i14 = (c0097o2 = this.f15348d).f2874u) == -1 || i14 >= 0) && ((i15 = c0097o2.v) == -1 || i15 >= 0))) {
                    f4 = c0097o2.f2877y;
                    if ((f4 != -1.0f || f4 >= 0) && ((i16 = c0097o2.f2865j) == -1 || i16 >= 0)) {
                        z5 = true;
                        this.f15351g = z5;
                        this.f15352h = AbstractC0135a.n(i6, false);
                        C0097o c0097o4 = this.f15348d;
                        float f6 = c0097o4.f2877y;
                        this.f15353i = f6 == -1.0f && f6 >= 10.0f;
                        this.f15354j = c0097o4.f2865j;
                        int i24 = c0097o4.f2874u;
                        this.f15355k = (i24 != -1 || (i13 = c0097o4.v) == -1) ? -1 : i24 * i13;
                        i8 = 0;
                        while (true) {
                            i9 = Integer.MAX_VALUE;
                            if (i8 < i21.size()) {
                                i10 = 0;
                                i8 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i10 = r.d(this.f15348d, (String) i21.get(i8), false);
                                if (i10 > 0) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        }
                        this.f15357m = i8;
                        this.n = i10;
                        int i25 = this.f15348d.f2861f;
                        Z z9 = r.f15365k;
                        this.o = (i25 == 0 && i25 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                        int i26 = this.f15348d.f2861f;
                        this.f15359q = (i26 == 0 && (i26 & 1) == 0) ? false : true;
                        this.f15360r = r.d(this.f15348d, str, r.f(str) != null);
                        i11 = 0;
                        while (true) {
                            if (i11 < i20.size()) {
                                String str3 = this.f15348d.n;
                                if (str3 != null && str3.equals(i20.get(i11))) {
                                    i9 = i11;
                                    break;
                                }
                                i11++;
                            } else {
                                break;
                            }
                        }
                        this.f15356l = i9;
                        this.f15358p = r.b(this.f15348d, lVar.f2741j);
                        this.f15363u = (i6 & 384) != 128;
                        this.v = (i6 & 64) != 64;
                        c0097o = this.f15348d;
                        str2 = c0097o.n;
                        if (str2 != null) {
                            i12 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        z7 = false;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        z7 = true;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        z7 = 2;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        z7 = 3;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        z7 = 4;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                default:
                                    z7 = -1;
                                    break;
                            }
                            switch (z7) {
                                case false:
                                    i12 = 5;
                                    break;
                                case true:
                                    i12 = 3;
                                    break;
                                case true:
                                    i12 = 1;
                                    break;
                                case true:
                                    i12 = 2;
                                    break;
                            }
                            this.f15364w = i12;
                            z6 = this.f15349e;
                            l lVar2 = this.f15350f;
                            if ((c0097o.f2861f & 16384) == 0 && AbstractC0135a.n(i6, lVar2.f15328B) && (z6 || lVar2.f15332w)) {
                                i23 = (AbstractC0135a.n(i6, false) || !this.f15351g || !z6 || c0097o.f2865j == -1 || (i22 & i6) == 0) ? 1 : 2;
                            }
                            this.f15362t = i23;
                        }
                        i12 = 0;
                        this.f15364w = i12;
                        z6 = this.f15349e;
                        l lVar22 = this.f15350f;
                        if ((c0097o.f2861f & 16384) == 0) {
                            if (AbstractC0135a.n(i6, false)) {
                            }
                        }
                        this.f15362t = i23;
                    }
                }
                z5 = false;
                this.f15351g = z5;
                this.f15352h = AbstractC0135a.n(i6, false);
                C0097o c0097o42 = this.f15348d;
                float f62 = c0097o42.f2877y;
                this.f15353i = f62 == -1.0f && f62 >= 10.0f;
                this.f15354j = c0097o42.f2865j;
                int i242 = c0097o42.f2874u;
                this.f15355k = (i242 != -1 || (i13 = c0097o42.v) == -1) ? -1 : i242 * i13;
                i8 = 0;
                while (true) {
                    i9 = Integer.MAX_VALUE;
                    if (i8 < i21.size()) {
                    }
                    i8++;
                }
                this.f15357m = i8;
                this.n = i10;
                int i252 = this.f15348d.f2861f;
                Z z92 = r.f15365k;
                this.o = (i252 == 0 && i252 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                int i262 = this.f15348d.f2861f;
                this.f15359q = (i262 == 0 && (i262 & 1) == 0) ? false : true;
                this.f15360r = r.d(this.f15348d, str, r.f(str) != null);
                i11 = 0;
                while (true) {
                    if (i11 < i20.size()) {
                    }
                    i11++;
                }
                this.f15356l = i9;
                this.f15358p = r.b(this.f15348d, lVar.f2741j);
                this.f15363u = (i6 & 384) != 128;
                this.v = (i6 & 64) != 64;
                c0097o = this.f15348d;
                str2 = c0097o.n;
                if (str2 != null) {
                }
                i12 = 0;
                this.f15364w = i12;
                z6 = this.f15349e;
                l lVar222 = this.f15350f;
                if ((c0097o.f2861f & 16384) == 0) {
                }
                this.f15362t = i23;
            }
        }
        z4 = false;
        this.f15349e = z4;
        if (z) {
            f4 = c0097o2.f2877y;
            if (f4 != -1.0f) {
            }
            z5 = true;
            this.f15351g = z5;
            this.f15352h = AbstractC0135a.n(i6, false);
            C0097o c0097o422 = this.f15348d;
            float f622 = c0097o422.f2877y;
            this.f15353i = f622 == -1.0f && f622 >= 10.0f;
            this.f15354j = c0097o422.f2865j;
            int i2422 = c0097o422.f2874u;
            this.f15355k = (i2422 != -1 || (i13 = c0097o422.v) == -1) ? -1 : i2422 * i13;
            i8 = 0;
            while (true) {
                i9 = Integer.MAX_VALUE;
                if (i8 < i21.size()) {
                }
                i8++;
            }
            this.f15357m = i8;
            this.n = i10;
            int i2522 = this.f15348d.f2861f;
            Z z922 = r.f15365k;
            this.o = (i2522 == 0 && i2522 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
            int i2622 = this.f15348d.f2861f;
            this.f15359q = (i2622 == 0 && (i2622 & 1) == 0) ? false : true;
            this.f15360r = r.d(this.f15348d, str, r.f(str) != null);
            i11 = 0;
            while (true) {
                if (i11 < i20.size()) {
                }
                i11++;
            }
            this.f15356l = i9;
            this.f15358p = r.b(this.f15348d, lVar.f2741j);
            this.f15363u = (i6 & 384) != 128;
            this.v = (i6 & 64) != 64;
            c0097o = this.f15348d;
            str2 = c0097o.n;
            if (str2 != null) {
            }
            i12 = 0;
            this.f15364w = i12;
            z6 = this.f15349e;
            l lVar2222 = this.f15350f;
            if ((c0097o.f2861f & 16384) == 0) {
            }
            this.f15362t = i23;
        }
        z5 = false;
        this.f15351g = z5;
        this.f15352h = AbstractC0135a.n(i6, false);
        C0097o c0097o4222 = this.f15348d;
        float f6222 = c0097o4222.f2877y;
        this.f15353i = f6222 == -1.0f && f6222 >= 10.0f;
        this.f15354j = c0097o4222.f2865j;
        int i24222 = c0097o4222.f2874u;
        this.f15355k = (i24222 != -1 || (i13 = c0097o4222.v) == -1) ? -1 : i24222 * i13;
        i8 = 0;
        while (true) {
            i9 = Integer.MAX_VALUE;
            if (i8 < i21.size()) {
            }
            i8++;
        }
        this.f15357m = i8;
        this.n = i10;
        int i25222 = this.f15348d.f2861f;
        Z z9222 = r.f15365k;
        this.o = (i25222 == 0 && i25222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
        int i26222 = this.f15348d.f2861f;
        this.f15359q = (i26222 == 0 && (i26222 & 1) == 0) ? false : true;
        this.f15360r = r.d(this.f15348d, str, r.f(str) != null);
        i11 = 0;
        while (true) {
            if (i11 < i20.size()) {
            }
            i11++;
        }
        this.f15356l = i9;
        this.f15358p = r.b(this.f15348d, lVar.f2741j);
        this.f15363u = (i6 & 384) != 128;
        this.v = (i6 & 64) != 64;
        c0097o = this.f15348d;
        str2 = c0097o.n;
        if (str2 != null) {
        }
        i12 = 0;
        this.f15364w = i12;
        z6 = this.f15349e;
        l lVar22222 = this.f15350f;
        if ((c0097o.f2861f & 16384) == 0) {
        }
        this.f15362t = i23;
    }

    public static int c(q qVar, q qVar2) {
        AbstractC1478z c4 = AbstractC1478z.f15691a.c(qVar.f15352h, qVar2.f15352h);
        Integer valueOf = Integer.valueOf(qVar.f15357m);
        Integer valueOf2 = Integer.valueOf(qVar2.f15357m);
        Y y4 = Y.f15598c;
        AbstractC1478z b4 = c4.b(valueOf, valueOf2, y4).a(qVar.n, qVar2.n).a(qVar.o, qVar2.o).b(Integer.valueOf(qVar.f15358p), Integer.valueOf(qVar2.f15358p), y4).c(qVar.f15359q, qVar2.f15359q).a(qVar.f15360r, qVar2.f15360r).c(qVar.f15353i, qVar2.f15353i).c(qVar.f15349e, qVar2.f15349e).c(qVar.f15351g, qVar2.f15351g).b(Integer.valueOf(qVar.f15356l), Integer.valueOf(qVar2.f15356l), y4);
        boolean z = qVar.f15363u;
        AbstractC1478z c5 = b4.c(z, qVar2.f15363u);
        boolean z4 = qVar.v;
        AbstractC1478z c6 = c5.c(z4, qVar2.v);
        if (z && z4) {
            c6 = c6.a(qVar.f15364w, qVar2.f15364w);
        }
        return c6.e();
    }

    @Override // t0.p
    public final int a() {
        return this.f15362t;
    }

    @Override // t0.p
    public final boolean b(p pVar) {
        q qVar = (q) pVar;
        if (!this.f15361s && !Objects.equals(this.f15348d.n, qVar.f15348d.n)) {
            return false;
        }
        this.f15350f.getClass();
        return this.f15363u == qVar.f15363u && this.v == qVar.v;
    }
}
