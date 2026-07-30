package g0;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements u0 {

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.r0 f3725f;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f3727h;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3726g = new Object();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3728i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3729j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final e f3730k = new e(0);

    public g(androidx.lifecycle.r0 r0Var) {
        this.f3725f = r0Var;
    }

    @Override // h6.i
    public final Object D(Object obj, q6.e eVar) {
        return eVar.d(obj, this);
    }

    @Override // h6.i
    public final h6.i F(h6.h hVar) {
        return t6.a.G(this, hVar);
    }

    public final void a(long j8) {
        Object b9;
        synchronized (this.f3726g) {
            try {
                ArrayList arrayList = this.f3728i;
                this.f3728i = this.f3729j;
                this.f3729j = arrayList;
                this.f3730k.set(0);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    f fVar = (f) arrayList.get(i7);
                    c7.h hVar = fVar.f3722b;
                    try {
                        b9 = fVar.f3721a.f(Long.valueOf(j8));
                    } catch (Throwable th) {
                        b9 = d6.a.b(th);
                    }
                    hVar.resumeWith(b9);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.u0
    public final Object t(q6.c cVar, h6.d dVar) {
        c7.h hVar = new c7.h(1, a8.m.A(dVar));
        hVar.r();
        f fVar = new f(hVar, cVar);
        synchronized (this.f3726g) {
            Throwable th = this.f3727h;
            if (th != null) {
                hVar.resumeWith(d6.a.b(th));
            } else {
                boolean isEmpty = this.f3728i.isEmpty();
                this.f3728i.add(fVar);
                if (isEmpty) {
                    this.f3730k.set(1);
                }
                hVar.t(new a0.y(this, 7, fVar));
                if (isEmpty) {
                    try {
                        this.f3725f.a();
                    } catch (Throwable th2) {
                        synchronized (this.f3726g) {
                            try {
                                if (this.f3727h == null) {
                                    this.f3727h = th2;
                                    ArrayList arrayList = this.f3728i;
                                    int size = arrayList.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        ((f) arrayList.get(i7)).f3722b.resumeWith(d6.a.b(th2));
                                    }
                                    this.f3728i.clear();
                                    this.f3730k.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return hVar.q();
    }

    @Override // h6.i
    public final h6.g u(h6.h hVar) {
        return t6.a.B(this, hVar);
    }

    @Override // h6.i
    public final h6.i z(h6.i iVar) {
        return t6.a.I(this, iVar);
    }
}
