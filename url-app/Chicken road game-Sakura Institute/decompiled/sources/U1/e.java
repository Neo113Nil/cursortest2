package U1;

import H1.o;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final k f4107a = new k();

    public final void a(Exception exc) {
        k kVar = this.f4107a;
        kVar.getClass();
        o.e(exc, "Exception must not be null");
        synchronized (kVar.f4123a) {
            try {
                if (kVar.f4125c) {
                    return;
                }
                kVar.f4125c = true;
                kVar.f4128f = exc;
                kVar.f4124b.i(kVar);
            } finally {
            }
        }
    }
}
