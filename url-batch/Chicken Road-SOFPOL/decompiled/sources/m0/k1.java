package m0;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final y f4987a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4988b;

    /* renamed from: c, reason: collision with root package name */
    public final s f4989c;

    /* renamed from: d, reason: collision with root package name */
    public final p6.e f4990d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4991e;

    /* renamed from: f, reason: collision with root package name */
    public final w1.y1 f4992f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4993g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f4994h = new AtomicReference(l1.f5009f);
    public o.k0 i;

    /* renamed from: j, reason: collision with root package name */
    public final u0.i f4995j;

    /* renamed from: k, reason: collision with root package name */
    public final z1 f4996k;

    public k1(y yVar, v vVar, s sVar, o.m0 m0Var, p6.e eVar, boolean z3, w1.y1 y1Var, Object obj) {
        this.f4987a = yVar;
        this.f4988b = vVar;
        this.f4989c = sVar;
        this.f4990d = eVar;
        this.f4991e = z3;
        this.f4992f = y1Var;
        this.f4993g = obj;
        o.k0 k0Var = o.s0.f5536a;
        q6.i.c(k0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.i = k0Var;
        u0.i iVar = new u0.i();
        iVar.g(m0Var, sVar.y());
        this.f4995j = iVar;
        this.f4996k = new z1(y1Var.f7824f);
    }

    public final void a() {
        AtomicReference atomicReference = this.f4994h;
        try {
            switch (((l1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    l1 l1Var = l1.i;
                    l1 l1Var2 = l1.f5012j;
                    while (!atomicReference.compareAndSet(l1Var, l1Var2)) {
                        if (atomicReference.get() != l1Var) {
                            p1.b("Unexpected state change from: " + l1Var + " to: " + l1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new a5.c();
            }
        } catch (Exception e8) {
            atomicReference.set(l1.f5007d);
            throw e8;
        }
    }

    public final void b() {
        synchronized (this.f4993g) {
            try {
                this.f4996k.a(this.f4992f, this.f4995j);
                this.f4995j.c();
                this.f4995j.d();
            } finally {
                this.f4995j.b();
                this.f4987a.f5179t = null;
            }
        }
    }

    public final boolean c() {
        return ((l1) this.f4994h.get()).compareTo(l1.i) >= 0;
    }

    public final void d() {
        l1 l1Var;
        l1 l1Var2;
        boolean z3;
        while (true) {
            AtomicReference atomicReference = this.f4994h;
            l1Var = l1.f5010g;
            l1Var2 = l1.i;
            if (atomicReference.compareAndSet(l1Var, l1Var2)) {
                z3 = true;
                break;
            } else if (atomicReference.get() != l1Var) {
                z3 = false;
                break;
            }
        }
        if (z3) {
            return;
        }
        p1.b("Unexpected state change from: " + l1Var + " to: " + l1Var2 + '.');
    }

    public final void e() {
        l1 l1Var;
        boolean z3;
        AtomicReference atomicReference = this.f4994h;
        Object obj = atomicReference.get();
        l1 l1Var2 = l1.f5010g;
        if (obj == l1Var2) {
            return;
        }
        while (true) {
            l1Var = l1.i;
            if (atomicReference.compareAndSet(l1Var, l1Var2)) {
                z3 = true;
                break;
            } else if (atomicReference.get() != l1Var) {
                z3 = false;
                break;
            }
        }
        if (z3) {
            return;
        }
        p1.b("Unexpected state change from: " + l1Var + " to: " + l1Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean f(c5.n nVar) {
        l1 l1Var = l1.f5011h;
        AtomicReference atomicReference = this.f4994h;
        try {
            int ordinal = ((l1) atomicReference.get()).ordinal();
            l1 l1Var2 = l1.f5010g;
            y yVar = this.f4987a;
            v vVar = this.f4988b;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    s sVar = this.f4989c;
                    boolean z3 = this.f4991e;
                    if (z3) {
                        sVar.f5097z = 100;
                        sVar.f5096y = true;
                    }
                    try {
                        this.i = vVar.b(yVar, nVar, this.f4990d);
                        l1 l1Var3 = l1.f5009f;
                        while (true) {
                            if (!atomicReference.compareAndSet(l1Var3, l1Var2)) {
                                if (atomicReference.get() != l1Var3) {
                                    p1.b("Unexpected state change from: " + l1Var3 + " to: " + l1Var2 + '.');
                                }
                            }
                        }
                        if (this.i.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z3) {
                            sVar.s();
                        }
                    }
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    while (true) {
                        if (!atomicReference.compareAndSet(l1Var2, l1Var)) {
                            if (atomicReference.get() != l1Var2) {
                                p1.b("Unexpected state change from: " + l1Var2 + " to: " + l1Var + '.');
                            }
                        }
                    }
                    try {
                        this.i = vVar.m(yVar, nVar, this.i);
                        while (true) {
                            if (!atomicReference.compareAndSet(l1Var, l1Var2)) {
                                if (atomicReference.get() != l1Var) {
                                    p1.b("Unexpected state change from: " + l1Var + " to: " + l1Var2 + '.');
                                }
                            }
                        }
                        if (this.i.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        while (true) {
                            if (!atomicReference.compareAndSet(l1Var, l1Var2)) {
                                if (atomicReference.get() != l1Var) {
                                    p1.b("Unexpected state change from: " + l1Var + " to: " + l1Var2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    t.d("Recursive call to resume()");
                    throw new a5.c();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new a5.c();
            }
        } catch (Exception e8) {
            atomicReference.set(l1.f5007d);
            throw e8;
        }
    }
}
