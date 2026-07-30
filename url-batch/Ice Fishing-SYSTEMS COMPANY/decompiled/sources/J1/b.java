package J1;

/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1353a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1354b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f1355c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f1356d;

    /* renamed from: e, reason: collision with root package name */
    public int f1357e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f1358f = 3;

    public b(Object obj, d dVar) {
        this.f1353a = obj;
        this.f1354b = dVar;
    }

    @Override // J1.d, J1.c
    public final boolean a() {
        boolean z8;
        synchronized (this.f1353a) {
            try {
                z8 = this.f1355c.a() || this.f1356d.a();
            } finally {
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean b(c cVar) {
        boolean z8;
        synchronized (this.f1353a) {
            ?? r12 = this.f1354b;
            z8 = (r12 == 0 || r12.b(this)) && cVar.equals(this.f1355c);
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean c(c cVar) {
        boolean z8;
        synchronized (this.f1353a) {
            ?? r02 = this.f1354b;
            z8 = r02 == 0 || r02.c(this);
        }
        return z8;
    }

    @Override // J1.c
    public final void clear() {
        synchronized (this.f1353a) {
            try {
                this.f1357e = 3;
                this.f1355c.clear();
                if (this.f1358f != 3) {
                    this.f1358f = 3;
                    this.f1356d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final d d() {
        d d2;
        synchronized (this.f1353a) {
            try {
                ?? r12 = this.f1354b;
                d2 = r12 != 0 ? r12.d() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final void e(c cVar) {
        synchronized (this.f1353a) {
            try {
                if (cVar.equals(this.f1355c)) {
                    this.f1357e = 4;
                } else if (cVar.equals(this.f1356d)) {
                    this.f1358f = 4;
                }
                ?? r42 = this.f1354b;
                if (r42 != 0) {
                    r42.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean f(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f1355c.f(bVar.f1355c) && this.f1356d.f(bVar.f1356d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final void g(c cVar) {
        synchronized (this.f1353a) {
            try {
                if (cVar.equals(this.f1356d)) {
                    this.f1358f = 5;
                    ?? r32 = this.f1354b;
                    if (r32 != 0) {
                        r32.g(this);
                    }
                    return;
                }
                this.f1357e = 5;
                if (this.f1358f != 1) {
                    this.f1358f = 1;
                    this.f1356d.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean h() {
        boolean z8;
        synchronized (this.f1353a) {
            try {
                z8 = this.f1357e == 3 && this.f1358f == 3;
            } finally {
            }
        }
        return z8;
    }

    @Override // J1.c
    public final void i() {
        synchronized (this.f1353a) {
            try {
                if (this.f1357e != 1) {
                    this.f1357e = 1;
                    this.f1355c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f1353a) {
            try {
                z8 = true;
                if (this.f1357e != 1 && this.f1358f != 1) {
                    z8 = false;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // J1.c
    public final boolean j() {
        boolean z8;
        synchronized (this.f1353a) {
            try {
                z8 = this.f1357e == 4 || this.f1358f == 4;
            } finally {
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J1.d, java.lang.Object] */
    @Override // J1.d
    public final boolean k(c cVar) {
        boolean z8;
        int i;
        synchronized (this.f1353a) {
            ?? r12 = this.f1354b;
            z8 = false;
            if (r12 == 0 || r12.k(this)) {
                if (this.f1357e != 5 ? cVar.equals(this.f1355c) : cVar.equals(this.f1356d) && ((i = this.f1358f) == 4 || i == 5)) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    @Override // J1.c
    public final void pause() {
        synchronized (this.f1353a) {
            try {
                if (this.f1357e == 1) {
                    this.f1357e = 2;
                    this.f1355c.pause();
                }
                if (this.f1358f == 1) {
                    this.f1358f = 2;
                    this.f1356d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
