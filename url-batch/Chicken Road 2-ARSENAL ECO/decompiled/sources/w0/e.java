package w0;

import l1.InterfaceFutureC0490a;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final j f6164f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceFutureC0490a f6165g;

    public e(j jVar, InterfaceFutureC0490a interfaceFutureC0490a) {
        this.f6164f = jVar;
        this.f6165g = interfaceFutureC0490a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6164f.f6173f != this) {
            return;
        }
        if (h.f6171k.e(this.f6164f, this, h.f(this.f6165g))) {
            h.c(this.f6164f);
        }
    }
}
