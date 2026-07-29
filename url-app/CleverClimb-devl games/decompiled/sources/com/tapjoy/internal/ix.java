package com.tapjoy.internal;

/* loaded from: classes2.dex */
final class ix implements it {

    /* renamed from: a, reason: collision with root package name */
    public final is f8426a = new is();

    /* renamed from: b, reason: collision with root package name */
    public final jc f8427b;

    /* renamed from: c, reason: collision with root package name */
    boolean f8428c;

    ix(jc jcVar) {
        if (jcVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.f8427b = jcVar;
    }

    @Override // com.tapjoy.internal.jc
    public final void a(is isVar, long j) {
        if (this.f8428c) {
            throw new IllegalStateException("closed");
        }
        this.f8426a.a(isVar, j);
        b();
    }

    @Override // com.tapjoy.internal.it
    public final it b(iv ivVar) {
        if (this.f8428c) {
            throw new IllegalStateException("closed");
        }
        this.f8426a.b(ivVar);
        return b();
    }

    @Override // com.tapjoy.internal.it
    public final it b(String str) {
        if (this.f8428c) {
            throw new IllegalStateException("closed");
        }
        this.f8426a.b(str);
        return b();
    }

    @Override // com.tapjoy.internal.it
    public final it e(int i) {
        if (this.f8428c) {
            throw new IllegalStateException("closed");
        }
        this.f8426a.e(i);
        return b();
    }

    @Override // com.tapjoy.internal.it
    public final it d(int i) {
        if (this.f8428c) {
            throw new IllegalStateException("closed");
        }
        this.f8426a.d(i);
        return b();
    }

    @Override // com.tapjoy.internal.it
    public final it f(long j) {
        if (this.f8428c) {
            throw new IllegalStateException("closed");
        }
        this.f8426a.f(j);
        return b();
    }

    private it b() {
        if (this.f8428c) {
            throw new IllegalStateException("closed");
        }
        is isVar = this.f8426a;
        long j = isVar.f8416b;
        if (j == 0) {
            j = 0;
        } else {
            iz izVar = isVar.f8415a.g;
            if (izVar.f8434c < 8192 && izVar.e) {
                j -= izVar.f8434c - izVar.f8433b;
            }
        }
        if (j > 0) {
            this.f8427b.a(this.f8426a, j);
        }
        return this;
    }

    @Override // com.tapjoy.internal.it
    public final it a() {
        if (this.f8428c) {
            throw new IllegalStateException("closed");
        }
        long j = this.f8426a.f8416b;
        if (j > 0) {
            this.f8427b.a(this.f8426a, j);
        }
        return this;
    }

    @Override // com.tapjoy.internal.jc, java.io.Flushable
    public final void flush() {
        if (this.f8428c) {
            throw new IllegalStateException("closed");
        }
        if (this.f8426a.f8416b > 0) {
            this.f8427b.a(this.f8426a, this.f8426a.f8416b);
        }
        this.f8427b.flush();
    }

    @Override // com.tapjoy.internal.jc, java.io.Closeable, java.lang.AutoCloseable, com.tapjoy.internal.jd
    public final void close() {
        if (this.f8428c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f8426a.f8416b > 0) {
                this.f8427b.a(this.f8426a, this.f8426a.f8416b);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f8427b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f8428c = true;
        if (th != null) {
            jf.a(th);
        }
    }

    public final String toString() {
        return "buffer(" + this.f8427b + ")";
    }
}
