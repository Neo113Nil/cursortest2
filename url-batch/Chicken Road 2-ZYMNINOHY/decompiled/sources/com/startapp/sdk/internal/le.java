package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class le implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe f7237b;

    public le(oe oeVar, int i4) {
        this.f7237b = oeVar;
        this.f7236a = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj xjVar = this.f7237b.f7396b;
        if (xjVar != null) {
            xjVar.a(this.f7236a);
        }
    }
}
