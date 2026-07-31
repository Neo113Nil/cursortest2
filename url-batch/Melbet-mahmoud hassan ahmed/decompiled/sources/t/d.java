package t;

import androidx.room.h;
import java.util.concurrent.atomic.AtomicBoolean;
import w.f;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f21662a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final h f21663b;

    /* renamed from: c, reason: collision with root package name */
    private volatile f f21664c;

    public d(h hVar) {
        this.f21663b = hVar;
    }

    private f c() {
        return this.f21663b.d(d());
    }

    private f e(boolean z6) {
        if (!z6) {
            return c();
        }
        if (this.f21664c == null) {
            this.f21664c = c();
        }
        return this.f21664c;
    }

    public f a() {
        b();
        return e(this.f21662a.compareAndSet(false, true));
    }

    protected void b() {
        this.f21663b.a();
    }

    protected abstract String d();

    public void f(f fVar) {
        if (fVar == this.f21664c) {
            this.f21662a.set(false);
        }
    }
}
