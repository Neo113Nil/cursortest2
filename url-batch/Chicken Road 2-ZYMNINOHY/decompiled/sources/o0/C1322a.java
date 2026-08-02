package o0;

import E1.P;
import E1.X;
import S0.x;
import S0.y;
import T.C0097o;
import W.AbstractC0108a;
import W.J;
import Y.h;
import a.AbstractC0124a;
import a0.Q;
import a0.p0;
import a2.i;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import d0.k;
import g1.e;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p0.C1343a;
import q0.C1360b;
import r0.AbstractC1395f;
import r0.C1394e;
import r0.InterfaceC1399j;
import r0.m;
import r0.n;
import t0.C1427b;
import t0.t;
import u0.o;
import v2.a0;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1322a implements InterfaceC1399j {

    /* renamed from: a, reason: collision with root package name */
    public final o f14588a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14589b;

    /* renamed from: c, reason: collision with root package name */
    public final C1394e[] f14590c;

    /* renamed from: d, reason: collision with root package name */
    public final h f14591d;

    /* renamed from: e, reason: collision with root package name */
    public t f14592e;

    /* renamed from: f, reason: collision with root package name */
    public p0.c f14593f;

    /* renamed from: g, reason: collision with root package name */
    public int f14594g;

    /* renamed from: h, reason: collision with root package name */
    public C1360b f14595h;

    public C1322a(o oVar, p0.c cVar, int i4, t tVar, h hVar, i iVar, boolean z) {
        y[] yVarArr;
        this.f14588a = oVar;
        this.f14593f = cVar;
        this.f14589b = i4;
        this.f14592e = tVar;
        this.f14591d = hVar;
        p0.b bVar = cVar.f14693f[i4];
        this.f14590c = new C1394e[tVar.length()];
        for (int i5 = 0; i5 < this.f14590c.length; i5++) {
            int h2 = tVar.h(i5);
            C0097o c0097o = bVar.f14683j[h2];
            if (c0097o.f2871r != null) {
                C1343a c1343a = cVar.f14692e;
                c1343a.getClass();
                yVarArr = c1343a.f14673c;
            } else {
                yVarArr = null;
            }
            y[] yVarArr2 = yVarArr;
            int i6 = bVar.f14674a;
            int i7 = i6 == 2 ? 4 : 0;
            long j4 = bVar.f14676c;
            long j5 = cVar.f14694g;
            this.f14590c[i5] = new C1394e(new S0.o(iVar, !z ? 35 : 3, null, new x(h2, i6, j4, -9223372036854775807L, j5, j5, c0097o, 0, yVarArr2, i7, null, null), a0.f15605e, null), bVar.f14674a, c0097o);
        }
    }

    @Override // r0.InterfaceC1399j
    public final void a() {
        C1360b c1360b = this.f14595h;
        if (c1360b != null) {
            throw c1360b;
        }
        this.f14588a.a();
    }

    @Override // r0.InterfaceC1399j
    public final long b(long j4, p0 p0Var) {
        p0.b bVar = this.f14593f.f14693f[this.f14589b];
        int f4 = J.f(bVar.o, j4, true);
        long[] jArr = bVar.o;
        long j5 = jArr[f4];
        return p0Var.a(j4, j5, (j5 >= j4 || f4 >= bVar.f14684k - 1) ? j5 : jArr[f4 + 1]);
    }

    @Override // r0.InterfaceC1399j
    public final boolean c(long j4, AbstractC1395f abstractC1395f, List list) {
        if (this.f14595h != null) {
            return false;
        }
        return this.f14592e.n(j4, abstractC1395f, list);
    }

    @Override // r0.InterfaceC1399j
    public final void d(Q q4, long j4, List list, X x4) {
        List list2;
        int a3;
        long b4;
        if (this.f14595h != null) {
            return;
        }
        p0.b[] bVarArr = this.f14593f.f14693f;
        int i4 = this.f14589b;
        p0.b bVar = bVarArr[i4];
        int i5 = bVar.f14684k;
        long[] jArr = bVar.o;
        if (i5 == 0) {
            x4.f555a = !r4.f14691d;
            return;
        }
        if (list.isEmpty()) {
            a3 = J.f(jArr, j4, true);
            list2 = list;
        } else {
            list2 = list;
            a3 = (int) (((m) list2.get(list.size() - 1)).a() - this.f14594g);
            if (a3 < 0) {
                this.f14595h = new C1360b();
                return;
            }
        }
        if (a3 >= bVar.f14684k) {
            x4.f555a = !this.f14593f.f14691d;
            return;
        }
        long j5 = q4.f3985a;
        long j6 = j4 - j5;
        p0.c cVar = this.f14593f;
        if (cVar.f14691d) {
            p0.b bVar2 = cVar.f14693f[i4];
            int i6 = bVar2.f14684k - 1;
            b4 = (bVar2.b(i6) + bVar2.o[i6]) - j5;
        } else {
            b4 = -9223372036854775807L;
        }
        int length = this.f14592e.length();
        n[] nVarArr = new n[length];
        for (int i7 = 0; i7 < length; i7++) {
            this.f14592e.h(i7);
            nVarArr[i7] = new k(bVar, a3);
        }
        this.f14592e.j(j5, j6, b4, list2, nVarArr);
        long j7 = jArr[a3];
        long b5 = bVar.b(a3) + j7;
        long j8 = list.isEmpty() ? j4 : -9223372036854775807L;
        int i8 = this.f14594g + a3;
        int d4 = this.f14592e.d();
        C1394e c1394e = this.f14590c[d4];
        int h2 = this.f14592e.h(d4);
        List list3 = bVar.n;
        C0097o[] c0097oArr = bVar.f14683j;
        AbstractC0124a.t(c0097oArr != null);
        AbstractC0124a.t(list3 != null);
        AbstractC0124a.t(a3 < list3.size());
        String num = Integer.toString(c0097oArr[h2].f2865j);
        String l4 = ((Long) list3.get(a3)).toString();
        Uri q5 = AbstractC0108a.q(bVar.f14685l, bVar.f14686m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l4).replace("{start_time}", l4));
        SystemClock.elapsedRealtime();
        C0097o l5 = this.f14592e.l();
        int m4 = this.f14592e.m();
        Object q6 = this.f14592e.q();
        Map map = Collections.EMPTY_MAP;
        AbstractC0124a.o(q5, "The uri must be set.");
        x4.f556b = new r0.k(this.f14591d, new Y.k(q5, 1, null, map, 0L, -1L, null, 0), l5, m4, q6, j7, b5, j8, -9223372036854775807L, i8, 1, j7, c1394e);
    }

    @Override // r0.InterfaceC1399j
    public final int e(List list, long j4) {
        return (this.f14595h != null || this.f14592e.length() < 2) ? list.size() : this.f14592e.t(list, j4);
    }

    @Override // r0.InterfaceC1399j
    public final boolean f(AbstractC1395f abstractC1395f, boolean z, P p2, C1427b c1427b) {
        u0.h e4 = AbstractC0347t0.e(this.f14592e);
        c1427b.getClass();
        e f4 = C1427b.f(e4, p2);
        if (!z || f4 == null || f4.f9026a != 2) {
            return false;
        }
        t tVar = this.f14592e;
        return tVar.o(tVar.b(abstractC1395f.f15141d), f4.f9027b);
    }

    @Override // r0.InterfaceC1399j
    public final void release() {
        for (C1394e c1394e : this.f14590c) {
            c1394e.f15128a.release();
        }
    }

    @Override // r0.InterfaceC1399j
    public final void g(AbstractC1395f abstractC1395f) {
    }
}
