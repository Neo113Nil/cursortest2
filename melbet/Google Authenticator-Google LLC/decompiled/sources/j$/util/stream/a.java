package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class a implements d {
    public final a a;
    public final d0 b;
    public final int c;
    public final a0 d;
    public int e;
    public int f;
    public Spliterator g;
    public boolean h;
    public boolean i;

    public a(d0 d0Var, int i) {
        if (d0Var.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        d0Var.h = true;
        d0Var.d = (a0) this;
        this.b = d0Var;
        this.c = j0.h & i;
        this.f = j0.f(i, d0Var.f);
        this.a = d0Var.a;
        this.e = d0Var.e + 1;
    }

    public final void a(f0 f0Var, Spliterator spliterator) {
        f0Var.getClass();
        if (!j0.SHORT_CIRCUIT.h(this.f)) {
            f0Var.c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(f0Var);
            f0Var.end();
        } else {
            while (this.e > 0) {
                this = this.b;
            }
            f0Var.c(spliterator.getExactSizeIfKnown());
            while (!f0Var.d() && spliterator.tryAdvance(f0Var)) {
            }
            f0Var.end();
        }
    }

    public final Object b(m0 m0Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.i) {
            return m0Var.e((d0) this, f(m0Var.f()));
        }
        return m0Var.a((d0) this, f(m0Var.f()));
    }

    public final long c(Spliterator spliterator) {
        if (j0.SIZED.h(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        this.a.getClass();
    }

    public boolean d() {
        return false;
    }

    public f0 e(f0 f0Var) {
        throw new UnsupportedOperationException();
    }

    public final Spliterator f(int i) {
        a aVar = this.a;
        Spliterator spliterator = aVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        if (i != 0) {
            this.f = j0.f(i, this.f);
        }
        return spliterator;
    }

    public final f0 g(f0 f0Var) {
        f0Var.getClass();
        while (true) {
            int i = this.e;
            d0 d0Var = this.b;
            if (i <= 0) {
                return f0Var;
            }
            int i2 = d0Var.f;
            f0Var = this.e(f0Var);
            this = d0Var;
        }
    }

    @Override // j$.util.stream.d
    public final a sequential() {
        this.a.i = false;
        return this;
    }

    @Override // j$.util.stream.d
    public final Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        a aVar = this.a;
        if (this != aVar) {
            return new l0(this, new j$.time.format.s(3, this), aVar.i);
        }
        Spliterator spliterator = aVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        return spliterator;
    }

    public a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = j0.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & j0.l;
        this.e = 0;
        this.i = z;
    }
}
