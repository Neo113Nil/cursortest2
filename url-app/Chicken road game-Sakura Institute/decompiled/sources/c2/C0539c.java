package c2;

import e2.n;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539c implements V1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f5843a;

    public C0539c(n nVar) {
        this.f5843a = nVar;
    }

    @Override // V1.c
    public final void a(boolean z4) {
        n nVar = this.f5843a;
        if (z4) {
            nVar.c("app_in_background");
        } else {
            nVar.h("app_in_background");
        }
    }
}
