package t2;

import d2.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final j f15407a = new j();

    public final void a(Exception exc) {
        j jVar = this.f15407a;
        jVar.getClass();
        s.d(exc, "Exception must not be null");
        synchronized (jVar.f15418a) {
            try {
                if (jVar.f15420c) {
                    return;
                }
                jVar.f15420c = true;
                jVar.f15423f = exc;
                jVar.f15419b.c(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
