package c4;

import k4.c;

/* loaded from: classes.dex */
final /* synthetic */ class o2 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final c.b f2055f;

    private o2(c.b bVar) {
        this.f2055f = bVar;
    }

    static Runnable a(c.b bVar) {
        return new o2(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2055f.a();
    }
}
