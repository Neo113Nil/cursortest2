package p0;

import k0.AbstractC0058t;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f1153c;

    public i(j jVar, Runnable runnable) {
        this.f1153c = jVar;
        this.f1152b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        int i2 = 0;
        do {
            try {
                this.f1152b.run();
            } catch (Throwable th) {
                AbstractC0058t.c(W.j.f449b, th);
            }
            jVar = this.f1153c;
            Runnable h2 = jVar.h();
            if (h2 == null) {
                return;
            }
            this.f1152b = h2;
            i2++;
        } while (i2 < 16);
        q0.k kVar = jVar.f1155d;
        kVar.getClass();
        kVar.d(jVar, this);
    }
}
