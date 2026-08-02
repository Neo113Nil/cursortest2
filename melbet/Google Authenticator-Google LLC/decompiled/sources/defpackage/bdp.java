package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdp implements bdv {
    public final boolean a;
    private final bdv b;
    private final bbh c;
    private int d;
    private boolean e;
    private final bdj f;

    public bdp(bdv bdvVar, boolean z, bbh bbhVar, bdj bdjVar) {
        a.v(bdvVar, "Argument must not be null");
        this.b = bdvVar;
        this.a = z;
        this.c = bbhVar;
        a.v(bdjVar, "Argument must not be null");
        this.f = bdjVar;
    }

    @Override // defpackage.bdv
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.bdv
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.bdv
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.d++;
    }

    @Override // defpackage.bdv
    public final synchronized void e() {
        if (this.d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.e) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.e = true;
        this.b.e();
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.d;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.d = i;
        }
        if (i == 0) {
            bdj bdjVar = this.f;
            bbh bbhVar = this.c;
            bdjVar.a.d(bbhVar);
            if (this.a) {
                bdjVar.b.d(bbhVar, this);
            } else {
                bdjVar.d.b(this, false);
            }
        }
    }

    public final synchronized String toString() {
        bdv bdvVar;
        bbh bbhVar;
        bdvVar = this.b;
        bbhVar = this.c;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.f.toString() + ", key=" + String.valueOf(bbhVar) + ", acquired=" + this.d + ", isRecycled=" + this.e + ", resource=" + bdvVar.toString() + "}";
    }
}
