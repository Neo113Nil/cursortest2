package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m0 implements m2.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m2.b f6691f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6692g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6693h;

    /* renamed from: i, reason: collision with root package name */
    public final k7.c f6694i = new k7.c();

    public m0(m2.b bVar) {
        this.f6691f = bVar;
    }

    @Override // m2.b
    public final float G(long j8) {
        return this.f6691f.G(j8);
    }

    @Override // m2.b
    public final int K(float f9) {
        return this.f6691f.K(f9);
    }

    @Override // m2.b
    public final long U(long j8) {
        return this.f6691f.U(j8);
    }

    @Override // m2.b
    public final float X(long j8) {
        return this.f6691f.X(j8);
    }

    @Override // m2.b
    public final float a() {
        return this.f6691f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j6.c cVar) {
        k0 k0Var;
        int i7;
        m0 m0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i8 = k0Var.f6667i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                k0Var.f6667i = i8 - Integer.MIN_VALUE;
                Object obj = k0Var.f6665g;
                i7 = k0Var.f6667i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    k0Var.f6664f = this;
                    k0Var.f6667i = 1;
                    Object c4 = this.f6694i.c(k0Var);
                    i6.a aVar = i6.a.f4956f;
                    if (c4 == aVar) {
                        return aVar;
                    }
                    m0Var = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m0Var = k0Var.f6664f;
                    d6.a.e(obj);
                }
                m0Var.f6692g = false;
                m0Var.f6693h = false;
                return d6.z.f2639a;
            }
        }
        k0Var = new k0(this, cVar);
        Object obj2 = k0Var.f6665g;
        i7 = k0Var.f6667i;
        if (i7 != 0) {
        }
        m0Var.f6692g = false;
        m0Var.f6693h = false;
        return d6.z.f2639a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(j6.c cVar) {
        l0 l0Var;
        int i7;
        m0 m0Var;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i8 = l0Var.f6679i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                l0Var.f6679i = i8 - Integer.MIN_VALUE;
                Object obj = l0Var.f6677g;
                i7 = l0Var.f6679i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    if (this.f6692g || this.f6693h) {
                        m0Var = this;
                        return Boolean.valueOf(m0Var.f6692g);
                    }
                    l0Var.f6676f = this;
                    l0Var.f6679i = 1;
                    Object c4 = this.f6694i.c(l0Var);
                    i6.a aVar = i6.a.f4956f;
                    if (c4 == aVar) {
                        return aVar;
                    }
                    m0Var = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m0Var = l0Var.f6676f;
                    d6.a.e(obj);
                }
                m0Var.f6694i.e(null);
                return Boolean.valueOf(m0Var.f6692g);
            }
        }
        l0Var = new l0(this, cVar);
        Object obj2 = l0Var.f6677g;
        i7 = l0Var.f6679i;
        if (i7 != 0) {
        }
        m0Var.f6694i.e(null);
        return Boolean.valueOf(m0Var.f6692g);
    }

    @Override // m2.b
    public final long g0(float f9) {
        return this.f6691f.g0(f9);
    }

    @Override // m2.b
    public final float k0(int i7) {
        return this.f6691f.k0(i7);
    }

    @Override // m2.b
    public final float l0(float f9) {
        return this.f6691f.l0(f9);
    }

    @Override // m2.b
    public final float m() {
        return this.f6691f.m();
    }

    @Override // m2.b
    public final long w(float f9) {
        return this.f6691f.w(f9);
    }

    @Override // m2.b
    public final long x(long j8) {
        return this.f6691f.x(j8);
    }

    @Override // m2.b
    public final float y(float f9) {
        return this.f6691f.y(f9);
    }
}
