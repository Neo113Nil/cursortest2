package z;

import a7.u;
import java.util.List;
import java.util.Map;
import u.j0;
import u1.f0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f9040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9041b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9042c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9043d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f9044e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9045f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9046g;

    /* renamed from: h, reason: collision with root package name */
    public final u f9047h;
    public final r2.c i;

    /* renamed from: j, reason: collision with root package name */
    public final long f9048j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f9049k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9050l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9051m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9052n;

    /* renamed from: o, reason: collision with root package name */
    public final j0 f9053o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9054p;

    /* renamed from: q, reason: collision with root package name */
    public final int f9055q;

    public k(l lVar, int i, boolean z3, float f6, f0 f0Var, float f8, boolean z7, u uVar, r2.c cVar, long j7, List list, int i8, int i9, int i10, j0 j0Var, int i11, int i12) {
        this.f9040a = lVar;
        this.f9041b = i;
        this.f9042c = z3;
        this.f9043d = f6;
        this.f9044e = f0Var;
        this.f9045f = f8;
        this.f9046g = z7;
        this.f9047h = uVar;
        this.i = cVar;
        this.f9048j = j7;
        this.f9049k = list;
        this.f9050l = i8;
        this.f9051m = i9;
        this.f9052n = i10;
        this.f9053o = j0Var;
        this.f9054p = i11;
        this.f9055q = i12;
    }

    @Override // u1.f0
    public final Map a() {
        return this.f9044e.a();
    }

    @Override // u1.f0
    public final void b() {
        this.f9044e.b();
    }

    @Override // u1.f0
    public final int c() {
        return this.f9044e.c();
    }

    @Override // u1.f0
    public final p6.c d() {
        return this.f9044e.d();
    }

    @Override // u1.f0
    public final int e() {
        return this.f9044e.e();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final k f(int i, boolean z3) {
        l lVar;
        if (this.f9046g) {
            return null;
        }
        ?? r15 = this.f9049k;
        if (r15.isEmpty() || (lVar = this.f9040a) == null) {
            return null;
        }
        int i8 = lVar.f9065k;
        int i9 = this.f9041b - i;
        if (i9 < 0 || i9 >= i8) {
            return null;
        }
        l lVar2 = (l) d6.m.R(r15);
        l lVar3 = (l) d6.m.X(r15);
        if (lVar2.f9067m || lVar3.f9067m) {
            return null;
        }
        int i10 = this.f9051m;
        int i11 = this.f9050l;
        if (i < 0) {
            if (Math.min((lVar2.i + lVar2.f9065k) - i11, (lVar3.i + lVar3.f9065k) - i10) <= (-i)) {
                return null;
            }
        } else if (Math.min(i11 - lVar2.i, i10 - lVar3.i) <= i) {
            return null;
        }
        int size = r15.size();
        for (int i12 = 0; i12 < size; i12++) {
            l lVar4 = (l) r15.get(i12);
            lVar4.getClass();
            int[] iArr = lVar4.f9069o;
            if (!lVar4.f9067m) {
                lVar4.i += i;
                int length = iArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    if ((i13 & 1) == 0) {
                        iArr[i13] = iArr[i13] + i;
                    }
                }
                if (z3) {
                    int size2 = lVar4.f9057b.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        a0.q.q(lVar4.f9063h.f513a.g(lVar4.f9061f));
                    }
                }
            }
        }
        return new k(this.f9040a, i9, this.f9042c || i > 0, i, this.f9044e, this.f9045f, this.f9046g, this.f9047h, this.i, this.f9048j, r15, this.f9050l, this.f9051m, this.f9052n, this.f9053o, this.f9054p, this.f9055q);
    }

    public final long g() {
        f0 f0Var = this.f9044e;
        return (f0Var.e() << 32) | (f0Var.c() & 4294967295L);
    }
}
