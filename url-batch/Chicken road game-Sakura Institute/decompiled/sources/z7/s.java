package z7;

import f8.e0;
import f8.i0;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements e0 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10220f;

    /* renamed from: g, reason: collision with root package name */
    public final f8.f f10221g = new f8.f();

    /* renamed from: h, reason: collision with root package name */
    public boolean f10222h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f10223i;

    public s(v vVar, boolean z8) {
        this.f10223i = vVar;
        this.f10220f = z8;
    }

    @Override // f8.e0
    public final i0 a() {
        return this.f10223i.f10242l;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z8) {
        long min;
        boolean z9;
        v vVar = this.f10223i;
        synchronized (vVar) {
            vVar.f10242l.h();
            while (vVar.f10235e >= vVar.f10236f && !this.f10220f && !this.f10222h) {
                try {
                    synchronized (vVar) {
                        int i7 = vVar.f10243m;
                        if (i7 != 0) {
                            break;
                        }
                        try {
                            vVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    vVar.f10242l.k();
                    throw th;
                }
            }
            vVar.f10242l.k();
            vVar.b();
            min = Math.min(vVar.f10236f - vVar.f10235e, this.f10221g.f3598g);
            vVar.f10235e += min;
            z9 = z8 && min == this.f10221g.f3598g;
        }
        this.f10223i.f10242l.h();
        try {
            v vVar2 = this.f10223i;
            vVar2.f10232b.u(vVar2.f10231a, z9, this.f10221g, min);
        } finally {
            this.f10223i.f10242l.k();
        }
    }

    @Override // f8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z8;
        v vVar = this.f10223i;
        byte[] bArr = t7.b.f8932a;
        synchronized (vVar) {
            if (this.f10222h) {
                return;
            }
            synchronized (vVar) {
                z8 = vVar.f10243m == 0;
            }
            v vVar2 = this.f10223i;
            if (!vVar2.f10240j.f10220f) {
                if (this.f10221g.f3598g > 0) {
                    while (this.f10221g.f3598g > 0) {
                        b(true);
                    }
                } else if (z8) {
                    vVar2.f10232b.u(vVar2.f10231a, true, null, 0L);
                }
            }
            synchronized (this.f10223i) {
                this.f10222h = true;
            }
            this.f10223i.f10232b.flush();
            this.f10223i.a();
        }
    }

    @Override // f8.e0
    public final void f(long j8, f8.f fVar) {
        byte[] bArr = t7.b.f8932a;
        f8.f fVar2 = this.f10221g;
        fVar2.f(j8, fVar);
        while (fVar2.f3598g >= 16384) {
            b(false);
        }
    }

    @Override // f8.e0, java.io.Flushable
    public final void flush() {
        v vVar = this.f10223i;
        byte[] bArr = t7.b.f8932a;
        synchronized (vVar) {
            vVar.b();
        }
        while (this.f10221g.f3598g > 0) {
            b(false);
            this.f10223i.f10232b.flush();
        }
    }
}
