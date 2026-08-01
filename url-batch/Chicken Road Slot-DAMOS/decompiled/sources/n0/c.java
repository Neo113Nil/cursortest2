package n0;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends x0.b {

    /* renamed from: a, reason: collision with root package name */
    public ge.h f6644a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f6645b;

    @Override // x0.b
    public final void a() {
        this.f6645b = null;
        this.f6644a = null;
    }

    @Override // x0.b
    public final void b(Throwable th) {
        ge.h hVar = this.f6644a;
        if (hVar != null) {
            hd.l lVar = hd.n.f4511e;
            hVar.resumeWith(cf.c.n(th));
        }
    }
}
