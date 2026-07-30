package R0;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final k f2386d;

    /* renamed from: e, reason: collision with root package name */
    public final O1.a f2387e;

    public f(k kVar, O1.a aVar) {
        this.f2386d = kVar;
        this.f2387e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2386d.f2395d != this) {
            return;
        }
        if (i.f2393n.h(this.f2386d, this, i.f(this.f2387e))) {
            i.c(this.f2386d);
        }
    }
}
