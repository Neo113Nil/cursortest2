package z;

import A0.C0036g;
import A0.H;
import A0.I;
import A0.L;
import A0.o;
import A0.q;
import a.AbstractC0345a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m3.u;
import u3.l;
import w.M;
import z2.C1405I;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1349d {

    /* renamed from: a, reason: collision with root package name */
    public C0036g f11706a;

    /* renamed from: b, reason: collision with root package name */
    public L f11707b;

    /* renamed from: c, reason: collision with root package name */
    public F0.d f11708c;

    /* renamed from: d, reason: collision with root package name */
    public int f11709d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11710e;

    /* renamed from: f, reason: collision with root package name */
    public int f11711f;

    /* renamed from: g, reason: collision with root package name */
    public int f11712g;

    /* renamed from: h, reason: collision with root package name */
    public List f11713h;

    /* renamed from: i, reason: collision with root package name */
    public C1347b f11714i;

    /* renamed from: k, reason: collision with root package name */
    public M0.b f11716k;

    /* renamed from: l, reason: collision with root package name */
    public q f11717l;

    /* renamed from: m, reason: collision with root package name */
    public M0.k f11718m;

    /* renamed from: n, reason: collision with root package name */
    public I f11719n;

    /* renamed from: j, reason: collision with root package name */
    public long f11715j = AbstractC1346a.f11694a;

    /* renamed from: o, reason: collision with root package name */
    public int f11720o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f11721p = -1;

    public C1349d(C0036g c0036g, L l4, F0.d dVar, int i2, boolean z4, int i4, int i5, List list) {
        this.f11706a = c0036g;
        this.f11707b = l4;
        this.f11708c = dVar;
        this.f11709d = i2;
        this.f11710e = z4;
        this.f11711f = i4;
        this.f11712g = i5;
        this.f11713h = list;
    }

    public final int a(int i2, M0.k kVar) {
        int i4 = this.f11720o;
        int i5 = this.f11721p;
        if (i2 == i4 && i4 != -1) {
            return i5;
        }
        int k4 = M.k(b(u3.d.a(0, i2, 0, Integer.MAX_VALUE), kVar).f354e);
        this.f11720o = i2;
        this.f11721p = k4;
        return k4;
    }

    public final o b(long j4, M0.k kVar) {
        q d4 = d(kVar);
        long g4 = u.g(j4, this.f11710e, this.f11709d, d4.c());
        boolean z4 = this.f11710e;
        int i2 = this.f11709d;
        int i4 = this.f11711f;
        int i5 = 1;
        if (z4 || !l.b0(i2, 2)) {
            if (i4 < 1) {
                i4 = 1;
            }
            i5 = i4;
        }
        return new o(d4, g4, i5, l.b0(this.f11709d, 2));
    }

    public final void c(M0.b bVar) {
        long j4;
        M0.b bVar2 = this.f11716k;
        if (bVar != null) {
            int i2 = AbstractC1346a.f11695b;
            j4 = AbstractC1346a.a(bVar.e(), bVar.q());
        } else {
            j4 = AbstractC1346a.f11694a;
        }
        if (bVar2 == null) {
            this.f11716k = bVar;
            this.f11715j = j4;
        } else if (bVar == null || this.f11715j != j4) {
            this.f11716k = bVar;
            this.f11715j = j4;
            this.f11717l = null;
            this.f11719n = null;
            this.f11721p = -1;
            this.f11720o = -1;
        }
    }

    public final q d(M0.k kVar) {
        q qVar = this.f11717l;
        if (qVar == null || kVar != this.f11718m || qVar.b()) {
            this.f11718m = kVar;
            C0036g c0036g = this.f11706a;
            L E3 = AbstractC0345a.E(this.f11707b, kVar);
            M0.b bVar = this.f11716k;
            Intrinsics.c(bVar);
            F0.d dVar = this.f11708c;
            List list = this.f11713h;
            if (list == null) {
                list = C1405I.f11931d;
            }
            qVar = new q(c0036g, E3, list, bVar, dVar);
        }
        this.f11717l = qVar;
        return qVar;
    }

    public final I e(M0.k kVar, long j4, o oVar) {
        float min = Math.min(oVar.f350a.c(), oVar.f353d);
        C0036g c0036g = this.f11706a;
        L l4 = this.f11707b;
        List list = this.f11713h;
        if (list == null) {
            list = C1405I.f11931d;
        }
        int i2 = this.f11711f;
        boolean z4 = this.f11710e;
        int i4 = this.f11709d;
        M0.b bVar = this.f11716k;
        Intrinsics.c(bVar);
        return new I(new H(c0036g, l4, list, i2, z4, i4, bVar, kVar, this.f11708c, j4), oVar, u3.d.p(j4, u3.d.c(M.k(min), M.k(oVar.f354e))));
    }
}
