package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class nh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vh f7343a;

    public nh(vh vhVar) {
        this.f7343a = vhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vh vhVar = this.f7343a;
        try {
            if (vhVar.a() != null && vhVar.f7765f == null) {
                sh a3 = vhVar.a((Class) null);
                vhVar.f7765f = a3;
                if (a3 != null) {
                    a3.a();
                }
            }
        } catch (Throwable th) {
            if (vhVar.a(1)) {
                d9.a(th);
            }
        }
    }
}
