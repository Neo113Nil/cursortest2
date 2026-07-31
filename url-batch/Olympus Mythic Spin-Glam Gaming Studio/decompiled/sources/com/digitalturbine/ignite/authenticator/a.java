package com.digitalturbine.ignite.authenticator;

/* loaded from: classes6.dex */
public final class a implements Runnable {
    public final /* synthetic */ IgniteManager a;

    public a(IgniteManager igniteManager) {
        this.a = igniteManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.b();
    }
}
