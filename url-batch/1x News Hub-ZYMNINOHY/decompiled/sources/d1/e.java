package d1;

import N0.r;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final k f4931a = new k();

    public final void a(Exception exc) {
        k kVar = this.f4931a;
        kVar.getClass();
        r.d(exc, "Exception must not be null");
        synchronized (kVar.f4942a) {
            try {
                if (kVar.f4944c) {
                    return;
                }
                kVar.f4944c = true;
                kVar.f = exc;
                kVar.f4943b.e(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
