package com.google.firebase.messaging;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements w7.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f3158e;

    public /* synthetic */ n(FirebaseMessaging firebaseMessaging, int i3) {
        this.f3157d = i3;
        this.f3158e = firebaseMessaging;
    }

    @Override // w7.d
    public final void b(Object obj) {
        boolean z10;
        switch (this.f3157d) {
            case 0:
                b0 b0Var = (b0) obj;
                if (!this.f3158e.f3083f.b() || b0Var.g.a() == null) {
                    return;
                }
                synchronized (b0Var) {
                    z10 = b0Var.f3114f;
                }
                if (z10) {
                    return;
                }
                b0Var.c(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f3158e;
                y6.a aVar = (y6.a) obj;
                if (aVar != null) {
                    e0.g(aVar.f10624d);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
