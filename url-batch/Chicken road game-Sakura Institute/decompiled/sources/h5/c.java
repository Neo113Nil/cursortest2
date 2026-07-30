package h5;

import j5.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements a5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f4653a;

    public c(n nVar) {
        this.f4653a = nVar;
    }

    @Override // a5.c
    public final void a(boolean z8) {
        n nVar = this.f4653a;
        if (z8) {
            nVar.c("app_in_background");
        } else {
            nVar.h("app_in_background");
        }
    }
}
