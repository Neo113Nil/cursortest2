package com.google.firebase.messaging;

import p1.C0818a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements K1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f4518e;

    public /* synthetic */ p(FirebaseMessaging firebaseMessaging, int i2) {
        this.f4517d = i2;
        this.f4518e = firebaseMessaging;
    }

    @Override // K1.e
    public final void k(Object obj) {
        boolean z7;
        switch (this.f4517d) {
            case 0:
                G g7 = (G) obj;
                if (!this.f4518e.f4443f.b() || g7.f4456g.a() == null) {
                    return;
                }
                synchronized (g7) {
                    z7 = g7.f4455f;
                }
                if (z7) {
                    return;
                }
                g7.c(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f4518e;
                C0818a c0818a = (C0818a) obj;
                B.f fVar = FirebaseMessaging.f4435m;
                firebaseMessaging.getClass();
                if (c0818a != null) {
                    AbstractC1053a.z(c0818a.f7152d);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
