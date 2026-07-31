package p0;

import k0.AbstractC0060t;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f1145c;

    public i(j jVar, Runnable runnable) {
        this.f1145c = jVar;
        this.f1144b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        int i2 = 0;
        do {
            try {
                this.f1144b.run();
            } catch (Throwable th) {
                AbstractC0060t.c(W.j.f394b, th);
            }
            jVar = this.f1145c;
            Runnable h2 = jVar.h();
            if (h2 == null) {
                return;
            }
            this.f1144b = h2;
            i2++;
        } while (i2 < 16);
        q0.k kVar = jVar.f1147d;
        kVar.getClass();
        kVar.d(jVar, this);
    }
}
