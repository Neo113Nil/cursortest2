package t0;

import T.C0097o;
import T.U;
import T.W;
import W.J;
import a0.AbstractC0135a;
import android.content.res.Resources;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;
import v2.AbstractC1478z;
import v2.I;
import v2.Y;
import v2.Z;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1433h extends p implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f15296e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15297f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15298g;

    /* renamed from: h, reason: collision with root package name */
    public final l f15299h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15300i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15301j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15302k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15303l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15304m;
    public final boolean n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15305p;

    /* renamed from: q, reason: collision with root package name */
    public final int f15306q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f15307r;

    /* renamed from: s, reason: collision with root package name */
    public final int f15308s;

    /* renamed from: t, reason: collision with root package name */
    public final int f15309t;

    /* renamed from: u, reason: collision with root package name */
    public final int f15310u;
    public final int v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f15311w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15312x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f15313y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0 A[LOOP:1: B:36:0x00ed->B:38:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1433h(int i4, U u4, int i5, l lVar, int i6, boolean z, C1432g c1432g, int i7) {
        super(i4, u4, i5);
        int i8;
        int i9;
        boolean z4;
        String[] split;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        l lVar2;
        boolean z6;
        W w4;
        boolean z7;
        this.f15299h = lVar;
        boolean z8 = lVar.z;
        I i14 = lVar.f2745p;
        I i15 = lVar.f2743l;
        int i16 = z8 ? 24 : 16;
        int i17 = 0;
        this.n = false;
        this.f15298g = r.f(this.f15348d.f2859d);
        this.f15300i = AbstractC0135a.n(i6, false);
        int i18 = 0;
        while (true) {
            i8 = Integer.MAX_VALUE;
            if (i18 >= i15.size()) {
                i9 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                i9 = r.d(this.f15348d, (String) i15.get(i18), false);
                if (i9 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.f15302k = i18;
        this.f15301j = i9;
        int i19 = this.f15348d.f2861f;
        this.f15303l = (i19 == 0 || i19 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f15304m = r.b(this.f15348d, lVar.f2744m);
        C0097o c0097o = this.f15348d;
        int i20 = c0097o.f2861f;
        this.o = i20 == 0 || (i20 & 1) != 0;
        this.f15307r = (c0097o.f2860e & 1) != 0;
        String str = c0097o.n;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        z7 = false;
                        break;
                    }
                    z7 = -1;
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        z7 = true;
                        break;
                    }
                    z7 = -1;
                    break;
                case 1504698186:
                    if (str.equals("audio/iamf")) {
                        z7 = 2;
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
                case true:
                case true:
                    z4 = true;
                    break;
            }
            this.f15313y = z4;
            int i21 = c0097o.f2846F;
            this.f15308s = i21;
            this.f15309t = c0097o.f2847G;
            int i22 = c0097o.f2865j;
            this.f15310u = i22;
            this.f15297f = (i22 != -1 || i22 <= lVar.o) && (i21 == -1 || i21 <= lVar.n) && c1432g.apply(c0097o);
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
            for (i10 = 0; i10 < split.length; i10++) {
                split[i10] = J.N(split[i10]);
            }
            i11 = 0;
            while (true) {
                if (i11 >= split.length) {
                    i12 = r.d(this.f15348d, split[i11], false);
                    if (i12 <= 0) {
                        i11++;
                    }
                } else {
                    i12 = 0;
                    i11 = Integer.MAX_VALUE;
                }
            }
            this.f15305p = i11;
            this.f15306q = i12;
            i13 = 0;
            while (true) {
                if (i13 < i14.size()) {
                    String str2 = this.f15348d.n;
                    if (str2 == null || !str2.equals(i14.get(i13))) {
                        i13++;
                    } else {
                        i8 = i13;
                    }
                }
            }
            this.v = i8;
            this.f15311w = (i6 & 384) != 128;
            this.f15312x = (i6 & 64) != 64;
            z5 = this.f15297f;
            lVar2 = this.f15299h;
            z6 = lVar2.f15328B;
            w4 = lVar2.f2746q;
            if (AbstractC0135a.n(i6, z6) && (z5 || lVar2.f15334y)) {
                w4.getClass();
                i17 = (AbstractC0135a.n(i6, false) || !z5 || this.f15348d.f2865j == -1 || (!lVar2.f15329C && z) || (i16 & i6) == 0) ? 1 : 2;
            }
            this.f15296e = i17;
        }
        z4 = false;
        this.f15313y = z4;
        int i212 = c0097o.f2846F;
        this.f15308s = i212;
        this.f15309t = c0097o.f2847G;
        int i222 = c0097o.f2865j;
        this.f15310u = i222;
        this.f15297f = (i222 != -1 || i222 <= lVar.o) && (i212 == -1 || i212 <= lVar.n) && c1432g.apply(c0097o);
        split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
        while (i10 < split.length) {
        }
        i11 = 0;
        while (true) {
            if (i11 >= split.length) {
            }
            i11++;
        }
        this.f15305p = i11;
        this.f15306q = i12;
        i13 = 0;
        while (true) {
            if (i13 < i14.size()) {
            }
            i13++;
        }
        this.v = i8;
        this.f15311w = (i6 & 384) != 128;
        this.f15312x = (i6 & 64) != 64;
        z5 = this.f15297f;
        lVar2 = this.f15299h;
        z6 = lVar2.f15328B;
        w4 = lVar2.f2746q;
        if (AbstractC0135a.n(i6, z6)) {
            w4.getClass();
            if (AbstractC0135a.n(i6, false)) {
            }
        }
        this.f15296e = i17;
    }

    @Override // t0.p
    public final int a() {
        return this.f15296e;
    }

    @Override // t0.p
    public final boolean b(p pVar) {
        int i4;
        String str;
        C1433h c1433h = (C1433h) pVar;
        C0097o c0097o = c1433h.f15348d;
        this.f15299h.getClass();
        C0097o c0097o2 = this.f15348d;
        int i5 = c0097o2.f2846F;
        if (i5 == -1 || i5 != c0097o.f2846F) {
            return false;
        }
        return (this.n || ((str = c0097o2.n) != null && TextUtils.equals(str, c0097o.n))) && (i4 = c0097o2.f2847G) != -1 && i4 == c0097o.f2847G && this.f15311w == c1433h.f15311w && this.f15312x == c1433h.f15312x;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1433h c1433h) {
        boolean z = this.f15300i;
        boolean z4 = this.f15297f;
        Z a3 = (z4 && z) ? r.f15365k : r.f15365k.a();
        boolean z5 = c1433h.f15300i;
        int i4 = c1433h.f15310u;
        AbstractC1478z c4 = AbstractC1478z.f15691a.c(z, z5);
        Integer valueOf = Integer.valueOf(this.f15302k);
        Integer valueOf2 = Integer.valueOf(c1433h.f15302k);
        Y y4 = Y.f15598c;
        AbstractC1478z b4 = c4.b(valueOf, valueOf2, y4).a(this.f15301j, c1433h.f15301j).a(this.f15303l, c1433h.f15303l).b(Integer.valueOf(this.f15304m), Integer.valueOf(c1433h.f15304m), y4).c(this.f15307r, c1433h.f15307r).c(this.o, c1433h.o).b(Integer.valueOf(this.f15305p), Integer.valueOf(c1433h.f15305p), y4).a(this.f15306q, c1433h.f15306q).c(z4, c1433h.f15297f).b(Integer.valueOf(this.v), Integer.valueOf(c1433h.v), y4);
        this.f15299h.getClass();
        AbstractC1478z b5 = b4.c(this.f15311w, c1433h.f15311w).c(this.f15312x, c1433h.f15312x).c(this.f15313y, c1433h.f15313y).b(Integer.valueOf(this.f15308s), Integer.valueOf(c1433h.f15308s), a3).b(Integer.valueOf(this.f15309t), Integer.valueOf(c1433h.f15309t), a3);
        if (Objects.equals(this.f15298g, c1433h.f15298g)) {
            b5 = b5.b(Integer.valueOf(this.f15310u), Integer.valueOf(i4), a3);
        }
        return b5.e();
    }
}
