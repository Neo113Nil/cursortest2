package q1;

import a0.p0;
import a7.h1;
import a7.x;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import w1.p1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s extends y0.l implements o, r2.c, p1 {
    public long A;

    /* renamed from: r, reason: collision with root package name */
    public Object f6028r;

    /* renamed from: s, reason: collision with root package name */
    public Object f6029s;

    /* renamed from: t, reason: collision with root package name */
    public PointerInputEventHandler f6030t;

    /* renamed from: u, reason: collision with root package name */
    public h1 f6031u;

    /* renamed from: v, reason: collision with root package name */
    public f f6032v = q.f6022a;

    /* renamed from: w, reason: collision with root package name */
    public final o0.e f6033w;

    /* renamed from: x, reason: collision with root package name */
    public final o0.e f6034x;

    /* renamed from: y, reason: collision with root package name */
    public final o0.e f6035y;

    /* renamed from: z, reason: collision with root package name */
    public f f6036z;

    public s(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f6028r = obj;
        this.f6029s = obj2;
        this.f6030t = pointerInputEventHandler;
        o0.e eVar = new o0.e(new r[16]);
        this.f6033w = eVar;
        this.f6034x = eVar;
        this.f6035y = new o0.e(new r[16]);
        this.A = 0L;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // w1.p1
    public final void C(f fVar, g gVar, long j7) {
        this.A = j7;
        if (gVar == g.f5988d) {
            this.f6032v = fVar;
        }
        g6.c cVar = null;
        if (this.f6031u == null) {
            this.f6031u = x.n(f0(), null, new p0(this, cVar, 3), 1);
        }
        r0(fVar, gVar);
        ?? r42 = fVar.f5986a;
        int size = r42.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            } else if (!h0.a.l((k) r42.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.f6036z = fVar;
    }

    @Override // w1.p1
    public final void Q() {
        s0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // w1.p1
    public final void S() {
        f fVar = this.f6036z;
        if (fVar == null) {
            return;
        }
        ?? r12 = fVar.f5986a;
        int size = r12.size();
        for (int i = 0; i < size; i++) {
            if (((k) r12.get(i)).f5997d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    k kVar = (k) r12.get(i8);
                    long j7 = kVar.f5994a;
                    long j8 = kVar.f5996c;
                    long j9 = kVar.f5995b;
                    float f6 = kVar.f5998e;
                    boolean z3 = kVar.f5997d;
                    arrayList.add(new k(j7, j9, j8, false, f6, j9, j8, z3, z3, kVar.i, 0L));
                }
                f fVar2 = new f(arrayList, null);
                this.f6032v = fVar2;
                r0(fVar2, g.f5988d);
                r0(fVar2, g.f5989e);
                r0(fVar2, g.f5990f);
                this.f6036z = null;
                return;
            }
        }
    }

    @Override // w1.k
    public final void a() {
        s0();
    }

    @Override // r2.c
    public final float b() {
        return w1.f.u(this).f7659y.b();
    }

    @Override // r2.c
    public final float i() {
        return w1.f.u(this).f7659y.i();
    }

    @Override // y0.l
    public final void k0() {
        s0();
    }

    public final void r0(f fVar, g gVar) {
        a7.h hVar;
        a7.h hVar2;
        synchronized (this.f6034x) {
            o0.e eVar = this.f6035y;
            eVar.d(eVar.f5580f, this.f6033w);
        }
        try {
            int ordinal = gVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    o0.e eVar2 = this.f6035y;
                    int i = eVar2.f5580f - 1;
                    Object[] objArr = eVar2.f5578d;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            r rVar = (r) objArr[i];
                            if (gVar == rVar.f6026g && (hVar2 = rVar.f6025f) != null) {
                                rVar.f6025f = null;
                                hVar2.k(fVar);
                            }
                            i--;
                        }
                    }
                    this.f6035y.g();
                }
                if (ordinal != 2) {
                    throw new a5.c();
                }
            }
            o0.e eVar3 = this.f6035y;
            Object[] objArr2 = eVar3.f5578d;
            int i8 = eVar3.f5580f;
            for (int i9 = 0; i9 < i8; i9++) {
                r rVar2 = (r) objArr2[i9];
                if (gVar == rVar2.f6026g && (hVar = rVar2.f6025f) != null) {
                    rVar2.f6025f = null;
                    hVar.k(fVar);
                }
            }
            this.f6035y.g();
        } catch (Throwable th) {
            this.f6035y.g();
            throw th;
        }
    }

    public final void s0() {
        h1 h1Var = this.f6031u;
        if (h1Var != null) {
            h1Var.C(new n("Pointer input was reset", 0));
            this.f6031u = null;
        }
    }
}
