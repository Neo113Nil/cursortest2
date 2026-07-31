package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class yj implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ek f14704f;

    yj(ek ekVar) {
        this.f14704f = ekVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        hk hkVar;
        z6 = this.f14704f.K;
        if (z6) {
            return;
        }
        hkVar = this.f14704f.f4638t;
        hkVar.b(this.f14704f);
    }
}
