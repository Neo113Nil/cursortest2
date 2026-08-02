package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class oh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vh f7403a;

    public oh(vh vhVar) {
        this.f7403a = vhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vh vhVar = this.f7403a;
        try {
            sh shVar = vhVar.f7765f;
            if (shVar != null) {
                shVar.b();
                vhVar.f7765f = null;
            }
        } catch (Throwable th) {
            if (vhVar.a(4)) {
                d9.a(th);
            }
        }
    }
}
