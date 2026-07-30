package r1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final p1.n0 f7754a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7756c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7757d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7758e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7759f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7760g;

    /* renamed from: h, reason: collision with root package name */
    public a f7761h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7763j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7755b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f7762i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public e0(a aVar, int i7) {
        this.f7763j = i7;
        this.f7754a = (p1.n0) aVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [q6.e, r6.h] */
    /* JADX WARN: Type inference failed for: r9v4, types: [p1.n0, r1.a] */
    public static final void a(e0 e0Var, p1.l lVar, int i7, a1 a1Var) {
        HashMap hashMap = e0Var.f7762i;
        float f9 = i7;
        long a3 = u3.r.a(f9, f9);
        while (true) {
            switch (e0Var.f7763j) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    z0.n0 n0Var = a1.J;
                    a3 = a1Var.e1(a3);
                    break;
                default:
                    p0 K0 = a1Var.K0();
                    r6.k.c(K0);
                    long j8 = K0.f7871r;
                    a3 = y0.c.h(u3.r.a((int) (j8 >> 32), (int) (j8 & 4294967295L)), a3);
                    break;
            }
            a1Var = a1Var.f7702s;
            r6.k.c(a1Var);
            if (a1Var.equals(e0Var.f7754a.l())) {
                int round = Math.round(lVar instanceof p1.l ? y0.c.e(a3) : y0.c.d(a3));
                if (hashMap.containsKey(lVar)) {
                    int intValue = ((Number) e6.c0.i0(lVar, hashMap)).intValue();
                    p1.l lVar2 = p1.c.f7034a;
                    round = ((Number) lVar.f7057a.d(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                }
                hashMap.put(lVar, Integer.valueOf(round));
                return;
            }
            if (e0Var.b(a1Var).containsKey(lVar)) {
                float c4 = e0Var.c(a1Var, lVar);
                a3 = u3.r.a(c4, c4);
            }
        }
    }

    public final Map b(a1 a1Var) {
        switch (this.f7763j) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return a1Var.v0().o();
            default:
                p0 K0 = a1Var.K0();
                r6.k.c(K0);
                return K0.v0().o();
        }
    }

    public final int c(a1 a1Var, p1.l lVar) {
        switch (this.f7763j) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return a1Var.f0(lVar);
            default:
                p0 K0 = a1Var.K0();
                r6.k.c(K0);
                return K0.f0(lVar);
        }
    }

    public final boolean d() {
        return this.f7756c || this.f7758e || this.f7759f || this.f7760g;
    }

    public final boolean e() {
        h();
        return this.f7761h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p1.n0, r1.a] */
    public final void f() {
        this.f7755b = true;
        ?? r02 = this.f7754a;
        a A = r02.A();
        if (A == null) {
            return;
        }
        if (this.f7756c) {
            A.b0();
        } else if (this.f7758e || this.f7757d) {
            A.requestLayout();
        }
        if (this.f7759f) {
            r02.b0();
        }
        if (this.f7760g) {
            r02.requestLayout();
        }
        A.o().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p1.n0, r1.a] */
    public final void g() {
        HashMap hashMap = this.f7762i;
        hashMap.clear();
        c1.a aVar = new c1.a(26, this);
        ?? r22 = this.f7754a;
        r22.j(aVar);
        hashMap.putAll(b(r22.l()));
        this.f7755b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [p1.n0, r1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        e0 o2;
        e0 o6;
        boolean d8 = d();
        ?? r12 = this.f7754a;
        a aVar = r12;
        if (!d8) {
            a A = r12.A();
            if (A == null) {
                return;
            }
            a aVar2 = A.o().f7761h;
            if (aVar2 != null) {
                boolean d9 = aVar2.o().d();
                aVar = aVar2;
            }
            a aVar3 = this.f7761h;
            if (aVar3 == null || aVar3.o().d()) {
                return;
            }
            a A2 = aVar3.A();
            if (A2 != null && (o6 = A2.o()) != null) {
                o6.h();
            }
            a A3 = aVar3.A();
            aVar = (A3 == null || (o2 = A3.o()) == null) ? null : o2.f7761h;
        }
        this.f7761h = aVar;
    }
}
