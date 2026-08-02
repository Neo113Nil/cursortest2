package Z;

import a.AbstractC0124a;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final h f3789a;

    /* renamed from: e, reason: collision with root package name */
    public final f[] f3793e;

    /* renamed from: f, reason: collision with root package name */
    public final g[] f3794f;

    /* renamed from: g, reason: collision with root package name */
    public int f3795g;

    /* renamed from: h, reason: collision with root package name */
    public int f3796h;

    /* renamed from: i, reason: collision with root package name */
    public f f3797i;

    /* renamed from: j, reason: collision with root package name */
    public d f3798j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3799k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3800l;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3790b = new Object();

    /* renamed from: m, reason: collision with root package name */
    public long f3801m = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f3791c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f3792d = new ArrayDeque();

    public i(f[] fVarArr, g[] gVarArr) {
        this.f3793e = fVarArr;
        this.f3795g = fVarArr.length;
        for (int i4 = 0; i4 < this.f3795g; i4++) {
            this.f3793e[i4] = f();
        }
        this.f3794f = gVarArr;
        this.f3796h = gVarArr.length;
        for (int i5 = 0; i5 < this.f3796h; i5++) {
            this.f3794f[i5] = g();
        }
        h hVar = new h(this);
        this.f3789a = hVar;
        hVar.start();
    }

    @Override // Z.c
    public final void a(long j4) {
        boolean z;
        synchronized (this.f3790b) {
            try {
                if (this.f3795g != this.f3793e.length && !this.f3799k) {
                    z = false;
                    AbstractC0124a.t(z);
                    this.f3801m = j4;
                }
                z = true;
                AbstractC0124a.t(z);
                this.f3801m = j4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z.c
    public final Object d() {
        f fVar;
        synchronized (this.f3790b) {
            try {
                d dVar = this.f3798j;
                if (dVar != null) {
                    throw dVar;
                }
                AbstractC0124a.t(this.f3797i == null);
                int i4 = this.f3795g;
                if (i4 == 0) {
                    fVar = null;
                } else {
                    f[] fVarArr = this.f3793e;
                    int i5 = i4 - 1;
                    this.f3795g = i5;
                    fVar = fVarArr[i5];
                }
                this.f3797i = fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public abstract f f();

    @Override // Z.c
    public final void flush() {
        synchronized (this.f3790b) {
            try {
                this.f3799k = true;
                f fVar = this.f3797i;
                if (fVar != null) {
                    fVar.h();
                    f[] fVarArr = this.f3793e;
                    int i4 = this.f3795g;
                    this.f3795g = i4 + 1;
                    fVarArr[i4] = fVar;
                    this.f3797i = null;
                }
                while (!this.f3791c.isEmpty()) {
                    f fVar2 = (f) this.f3791c.removeFirst();
                    fVar2.h();
                    f[] fVarArr2 = this.f3793e;
                    int i5 = this.f3795g;
                    this.f3795g = i5 + 1;
                    fVarArr2[i5] = fVar2;
                }
                while (!this.f3792d.isEmpty()) {
                    ((g) this.f3792d.removeFirst()).i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract g g();

    public abstract d h(Throwable th);

    public abstract d i(f fVar, g gVar, boolean z);

    public final boolean j() {
        boolean z;
        d h2;
        synchronized (this.f3790b) {
            while (!this.f3800l) {
                try {
                    if (!this.f3791c.isEmpty() && this.f3796h > 0) {
                        break;
                    }
                    this.f3790b.wait();
                } finally {
                }
            }
            if (this.f3800l) {
                return false;
            }
            f fVar = (f) this.f3791c.removeFirst();
            g[] gVarArr = this.f3794f;
            int i4 = this.f3796h - 1;
            this.f3796h = i4;
            g gVar = gVarArr[i4];
            boolean z4 = this.f3799k;
            this.f3799k = false;
            if (fVar.g(4)) {
                gVar.a(4);
            } else {
                gVar.f3786c = fVar.f3783g;
                if (fVar.g(134217728)) {
                    gVar.a(134217728);
                }
                long j4 = fVar.f3783g;
                synchronized (this.f3790b) {
                    long j5 = this.f3801m;
                    if (j5 != -9223372036854775807L && j4 < j5) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    gVar.f3787d = true;
                }
                try {
                    h2 = i(fVar, gVar, z4);
                } catch (OutOfMemoryError e4) {
                    h2 = h(e4);
                } catch (RuntimeException e5) {
                    h2 = h(e5);
                }
                if (h2 != null) {
                    synchronized (this.f3790b) {
                        this.f3798j = h2;
                    }
                    return false;
                }
            }
            synchronized (this.f3790b) {
                try {
                    if (this.f3799k) {
                        gVar.i();
                    } else if (gVar.f3787d) {
                        gVar.i();
                    } else {
                        this.f3792d.addLast(gVar);
                    }
                    fVar.h();
                    f[] fVarArr = this.f3793e;
                    int i5 = this.f3795g;
                    this.f3795g = i5 + 1;
                    fVarArr[i5] = fVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // Z.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final g c() {
        synchronized (this.f3790b) {
            try {
                d dVar = this.f3798j;
                if (dVar != null) {
                    throw dVar;
                }
                if (this.f3792d.isEmpty()) {
                    return null;
                }
                return (g) this.f3792d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z.c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void e(f fVar) {
        synchronized (this.f3790b) {
            try {
                d dVar = this.f3798j;
                if (dVar != null) {
                    throw dVar;
                }
                AbstractC0124a.h(fVar == this.f3797i);
                this.f3791c.addLast(fVar);
                if (!this.f3791c.isEmpty() && this.f3796h > 0) {
                    this.f3790b.notify();
                }
                this.f3797i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(g gVar) {
        synchronized (this.f3790b) {
            gVar.h();
            g[] gVarArr = this.f3794f;
            int i4 = this.f3796h;
            this.f3796h = i4 + 1;
            gVarArr[i4] = gVar;
            if (!this.f3791c.isEmpty() && this.f3796h > 0) {
                this.f3790b.notify();
            }
        }
    }

    @Override // Z.c
    public final void release() {
        synchronized (this.f3790b) {
            this.f3800l = true;
            this.f3790b.notify();
        }
        try {
            this.f3789a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
