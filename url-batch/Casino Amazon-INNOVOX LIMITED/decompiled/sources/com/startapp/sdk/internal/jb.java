package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class jb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f288a;
    public final /* synthetic */ kb b;

    public jb(kb kbVar, Runnable runnable) {
        this.b = kbVar;
        this.f288a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.f288a);
        synchronized (this.b) {
            this.b.c = null;
        }
    }
}
