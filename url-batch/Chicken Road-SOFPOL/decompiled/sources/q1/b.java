package q1;

import java.util.List;
import o.a0;
import o.e0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final u1.p f5963a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5964b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5965c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5966d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5967e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f5968f = new e0();

    /* renamed from: g, reason: collision with root package name */
    public final e f5969g = new e();

    /* renamed from: h, reason: collision with root package name */
    public final a0 f5970h = new a0(10);

    public b(u1.p pVar) {
        this.f5963a = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public final void a(long j7, List list, boolean z3) {
        int i;
        d dVar;
        d dVar2;
        a0 a0Var = this.f5970h;
        a0Var.a();
        int size = list.size();
        e eVar = this.f5969g;
        e eVar2 = eVar;
        boolean z7 = true;
        for (int i8 = 0; i8 < size; i8++) {
            y0.l lVar = (y0.l) list.get(i8);
            if (lVar.f8718q) {
                lVar.f8717p = new a2.b(3, this, lVar);
                if (z7) {
                    o0.e eVar3 = eVar2.f5984a;
                    ?? r14 = eVar3.f5578d;
                    int i9 = eVar3.f5580f;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            dVar2 = 0;
                            break;
                        }
                        dVar2 = r14[i10];
                        if (q6.i.a(((d) dVar2).f5977c, lVar)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    dVar = dVar2;
                    if (dVar != null) {
                        dVar.i = true;
                        dVar.f5978d.a(j7);
                        Object d8 = a0Var.d(j7);
                        if (d8 == null) {
                            d8 = new e0();
                            a0Var.f(j7, d8);
                        }
                        ((e0) d8).a(dVar);
                        eVar2 = dVar;
                    } else {
                        z7 = false;
                    }
                }
                dVar = new d(lVar);
                dVar.f5978d.a(j7);
                Object d9 = a0Var.d(j7);
                if (d9 == null) {
                    d9 = new e0();
                    a0Var.f(j7, d9);
                }
                ((e0) d9).a(dVar);
                eVar2.f5984a.b(dVar);
                eVar2 = dVar;
            }
        }
        if (!z3) {
            return;
        }
        long[] jArr = a0Var.f5412b;
        Object[] objArr = a0Var.f5413c;
        long[] jArr2 = a0Var.f5411a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j8 = jArr2[i11];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j8) < 128) {
                        int i15 = (i11 << 3) + i14;
                        long j9 = jArr[i15];
                        e0 e0Var = (e0) objArr[i15];
                        o0.e eVar4 = eVar.f5984a;
                        i = i12;
                        Object[] objArr2 = eVar4.f5578d;
                        int i16 = eVar4.f5580f;
                        for (int i17 = 0; i17 < i16; i17++) {
                            ((d) objArr2[i17]).f(j9, e0Var);
                        }
                    } else {
                        i = i12;
                    }
                    j8 >>= i;
                    i14++;
                    i12 = i;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final boolean b(a0.a0 a0Var, boolean z3) {
        o.q qVar = (o.q) a0Var.f11e;
        u1.p pVar = this.f5963a;
        e eVar = this.f5969g;
        boolean a8 = eVar.a(qVar, pVar, a0Var, z3);
        o0.e eVar2 = eVar.f5984a;
        if (!a8) {
            return false;
        }
        boolean z7 = true;
        this.f5964b = true;
        Object[] objArr = eVar2.f5578d;
        int i = eVar2.f5580f;
        boolean z8 = false;
        for (int i8 = 0; i8 < i; i8++) {
            z8 = ((d) objArr[i8]).e(a0Var, z3) || z8;
        }
        Object[] objArr2 = eVar2.f5578d;
        int i9 = eVar2.f5580f;
        boolean z9 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            z9 = ((d) objArr2[i10]).d(a0Var) || z9;
        }
        eVar.b(a0Var);
        if (!z9 && !z8) {
            z7 = false;
        }
        this.f5964b = false;
        if (this.f5967e) {
            this.f5967e = false;
            e0 e0Var = this.f5968f;
            int i11 = e0Var.f5443b;
            for (int i12 = 0; i12 < i11; i12++) {
                d((y0.l) e0Var.e(i12));
            }
            e0Var.c();
        }
        if (this.f5965c) {
            this.f5965c = false;
            c();
        }
        if (this.f5966d) {
            this.f5966d = false;
            eVar.f5984a.g();
        }
        return z7;
    }

    public final void c() {
        if (this.f5964b) {
            this.f5965c = true;
            return;
        }
        e eVar = this.f5969g;
        o0.e eVar2 = eVar.f5984a;
        Object[] objArr = eVar2.f5578d;
        int i = eVar2.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            ((d) objArr[i8]).c();
        }
        if (this.f5966d) {
            this.f5966d = true;
        } else {
            eVar.f5984a.g();
        }
    }

    public final void d(y0.l lVar) {
        if (this.f5964b) {
            this.f5967e = true;
            this.f5968f.a(lVar);
            return;
        }
        e eVar = this.f5969g;
        e0 e0Var = eVar.f5985b;
        e0Var.c();
        e0Var.a(eVar);
        while (e0Var.h()) {
            e eVar2 = (e) e0Var.j(e0Var.f5443b - 1);
            int i = 0;
            while (true) {
                o0.e eVar3 = eVar2.f5984a;
                if (i < eVar3.f5580f) {
                    d dVar = (d) eVar3.f5578d[i];
                    if (q6.i.a(dVar.f5977c, lVar)) {
                        eVar2.f5984a.j(dVar);
                        dVar.c();
                    } else {
                        e0Var.a(dVar);
                        i++;
                    }
                }
            }
        }
    }
}
