package q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public l f7402a;

    /* renamed from: b, reason: collision with root package name */
    public int f7403b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7404c;

    /* renamed from: d, reason: collision with root package name */
    public int f7405d;

    public g(int i7, l lVar) {
        int i8;
        int numberOfTrailingZeros;
        this.f7402a = lVar;
        this.f7403b = i7;
        if (i7 != 0) {
            l e9 = e();
            b1.b bVar = n.f7426a;
            int i9 = e9.f7421h;
            int[] iArr = e9.f7422i;
            if (iArr != null) {
                i7 = iArr[0];
            } else {
                long j8 = e9.f7420g;
                if (j8 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
                } else {
                    long j9 = e9.f7419f;
                    if (j9 != 0) {
                        i9 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j9);
                    }
                }
                i7 = numberOfTrailingZeros + i9;
            }
            synchronized (n.f7427b) {
                i8 = n.f7430e.a(i7);
            }
        } else {
            i8 = -1;
        }
        this.f7405d = i8;
    }

    public static void p(g gVar) {
        n.f7426a.y(gVar);
    }

    public final void a() {
        synchronized (n.f7427b) {
            b();
            o();
        }
    }

    public void b() {
        n.f7428c = n.f7428c.g(d());
    }

    public abstract void c();

    public int d() {
        return this.f7403b;
    }

    public l e() {
        return this.f7402a;
    }

    public abstract q6.c f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract q6.c i();

    public final g j() {
        b1.b bVar = n.f7426a;
        g gVar = (g) bVar.j();
        bVar.y(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(u uVar);

    public void o() {
        int i7 = this.f7405d;
        if (i7 >= 0) {
            n.u(i7);
            this.f7405d = -1;
        }
    }

    public void q(int i7) {
        this.f7403b = i7;
    }

    public void r(l lVar) {
        this.f7402a = lVar;
    }

    public void s(int i7) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g t(q6.c cVar);
}
